// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.inspector.network;

import java.io.PrintWriter;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.EOFException;
import java.io.FileOutputStream;
import android.util.Base64OutputStream;
import java.io.OutputStream;
import java.io.File;
import com.facebook.stetho.common.LogRedirector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.ExecutionException;
import com.facebook.stetho.common.ExceptionUtil;
import java.io.IOException;
import java.util.concurrent.Future;
import com.facebook.stetho.common.Util;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Callable;
import java.io.InputStream;
import ak0.m;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import android.content.Context;

public class ResponseBodyFileManager
{
    private static final String FILENAME_PREFIX = "network-response-body-";
    private static final int PRETTY_PRINT_TIMEOUT_SEC = 10;
    private static final String TAG = "ResponseBodyFileManager";
    private final Context mContext;
    private final Map<String, AsyncPrettyPrinter> mRequestIdMap;
    
    public ResponseBodyFileManager(final Context mContext) {
        this.mRequestIdMap = Collections.synchronizedMap(new HashMap<String, AsyncPrettyPrinter>());
        this.mContext = mContext;
    }
    
    private static String getFilename(final String s) {
        return m.l("network-response-body-", s);
    }
    
    private String prettyPrintContentWithTimeOut(AsyncPrettyPrinter submit, final InputStream inputStream) throws IOException {
        final AsyncPrettyPrintingCallable asyncPrettyPrintingCallable = new AsyncPrettyPrintingCallable(inputStream, submit);
        final ExecutorService executorService = AsyncPrettyPrinterExecutorHolder.getExecutorService();
        if (executorService == null) {
            return null;
        }
        submit = (AsyncPrettyPrinter)executorService.submit((Callable<Object>)asyncPrettyPrintingCallable);
        try {
            return Util.getUninterruptibly((Future<String>)submit, 10L, TimeUnit.SECONDS);
        }
        catch (final ExecutionException ex) {
            final Throwable cause = ex.getCause();
            ExceptionUtil.propagateIfInstanceOf(cause, IOException.class);
            throw ExceptionUtil.propagate(cause);
        }
        catch (final TimeoutException ex2) {
            ((Future)submit).cancel(true);
            final StringBuilder sb = new StringBuilder();
            sb.append("Time out after 10 seconds of attempting to pretty print\n");
            sb.append(Util.readAsUTF8(inputStream));
            return sb.toString();
        }
    }
    
    public void associateAsyncPrettyPrinterWithId(final String s, final AsyncPrettyPrinter asyncPrettyPrinter) {
        if (this.mRequestIdMap.put(s, asyncPrettyPrinter) == null) {
            return;
        }
        throw new IllegalArgumentException(m.l("cannot associate different pretty printers with the same request id: ", s));
    }
    
    public void cleanupFiles() {
        for (final File file : this.mContext.getFilesDir().listFiles()) {
            if (file.getName().startsWith("network-response-body-") && !file.delete()) {
                final StringBuilder k = a.k("Failed to delete ");
                k.append(file.getAbsolutePath());
                LogRedirector.w("ResponseBodyFileManager", k.toString());
            }
        }
        LogRedirector.i("ResponseBodyFileManager", "Cleaned up temporary network files.");
    }
    
    public OutputStream openResponseBodyFile(final String s, final boolean b) throws IOException {
        final FileOutputStream openFileOutput = this.mContext.openFileOutput(getFilename(s), 0);
        openFileOutput.write(b ? 1 : 0);
        if ((b ? 1 : 0) != 0) {
            return (OutputStream)new Base64OutputStream((OutputStream)openFileOutput, 0);
        }
        return openFileOutput;
    }
    
    public ResponseBodyData readFile(final String s) throws IOException {
        final FileInputStream openFileInput = this.mContext.openFileInput(getFilename(s));
        try {
            final int read = openFileInput.read();
            if (read != -1) {
                final ResponseBodyData responseBodyData = new ResponseBodyData();
                responseBodyData.base64Encoded = (read != 0);
                final AsyncPrettyPrinter asyncPrettyPrinter = this.mRequestIdMap.get(s);
                if (asyncPrettyPrinter != null) {
                    responseBodyData.data = this.prettyPrintContentWithTimeOut(asyncPrettyPrinter, openFileInput);
                }
                else {
                    responseBodyData.data = Util.readAsUTF8(openFileInput);
                }
                return responseBodyData;
            }
            throw new EOFException("Failed to read base64Encode byte");
        }
        finally {
            openFileInput.close();
        }
    }
    
    public class AsyncPrettyPrintingCallable implements Callable<String>
    {
        private final AsyncPrettyPrinter mAsyncPrettyPrinter;
        private final InputStream mInputStream;
        
        public AsyncPrettyPrintingCallable(final InputStream mInputStream, final AsyncPrettyPrinter mAsyncPrettyPrinter) {
            this.mInputStream = mInputStream;
            this.mAsyncPrettyPrinter = mAsyncPrettyPrinter;
        }
        
        private String prettyPrintContent(final InputStream inputStream, final AsyncPrettyPrinter asyncPrettyPrinter) throws IOException {
            final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            final PrintWriter printWriter = new PrintWriter(byteArrayOutputStream);
            asyncPrettyPrinter.printTo(printWriter, inputStream);
            printWriter.flush();
            return byteArrayOutputStream.toString("UTF-8");
        }
        
        @Override
        public String call() throws IOException {
            return this.prettyPrintContent(this.mInputStream, this.mAsyncPrettyPrinter);
        }
    }
}
