// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.inspector.network;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.net.URLConnection;
import java.net.HttpURLConnection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import java.net.MalformedURLException;
import java.net.URL;
import com.facebook.stetho.common.Util;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

public abstract class DownloadingAsyncPrettyPrinterFactory implements AsyncPrettyPrinterFactory
{
    private static void doErrorPrint(final PrintWriter printWriter, final InputStream inputStream, final String s) throws IOException {
        final StringBuilder q = d.q(s, "\n");
        q.append(Util.readAsUTF8(inputStream));
        printWriter.print(q.toString());
    }
    
    private static AsyncPrettyPrinter getErrorAsyncPrettyPrinter(final String s, final String s2) {
        return new AsyncPrettyPrinter() {
            @Override
            public PrettyPrinterDisplayType getPrettifiedType() {
                return PrettyPrinterDisplayType.TEXT;
            }
            
            @Override
            public void printTo(final PrintWriter printWriter, final InputStream inputStream) throws IOException {
                final StringBuilder k = a.k("[Failed to parse header: ");
                k.append(s);
                k.append(" : ");
                k.append(s2);
                k.append(" ]");
                doErrorPrint(printWriter, inputStream, k.toString());
            }
        };
    }
    
    private static URL parseURL(final String s) {
        try {
            return new URL(s);
        }
        catch (final MalformedURLException ex) {
            return null;
        }
    }
    
    public abstract void doPrint(final PrintWriter p0, final InputStream p1, final String p2) throws IOException;
    
    @Override
    public AsyncPrettyPrinter getInstance(final String s, final String s2) {
        final MatchResult matchAndParseHeader = this.matchAndParseHeader(s, s2);
        if (matchAndParseHeader == null) {
            return null;
        }
        final URL url = parseURL(matchAndParseHeader.getSchemaUri());
        if (url == null) {
            return getErrorAsyncPrettyPrinter(s, s2);
        }
        final ExecutorService executorService = AsyncPrettyPrinterExecutorHolder.getExecutorService();
        if (executorService == null) {
            return null;
        }
        return new AsyncPrettyPrinter() {
            public final /* synthetic */ Future val$response = executorService.submit((Callable<Object>)new Request(url));
            
            @Override
            public PrettyPrinterDisplayType getPrettifiedType() {
                return matchAndParseHeader.getDisplayType();
            }
            
            @Override
            public void printTo(final PrintWriter p0, final InputStream p1) throws IOException {
                // 
                // This method could not be decompiled.
                // 
                // Original Bytecode:
                // 
                //     1: getfield        com/facebook/stetho/inspector/network/DownloadingAsyncPrettyPrinterFactory$1.val$response:Ljava/util/concurrent/Future;
                //     4: invokeinterface java/util/concurrent/Future.get:()Ljava/lang/Object;
                //     9: checkcast       Ljava/lang/String;
                //    12: astore_3       
                //    13: aload_0        
                //    14: getfield        com/facebook/stetho/inspector/network/DownloadingAsyncPrettyPrinterFactory$1.this$0:Lcom/facebook/stetho/inspector/network/DownloadingAsyncPrettyPrinterFactory;
                //    17: aload_1        
                //    18: aload_2        
                //    19: aload_3        
                //    20: invokevirtual   com/facebook/stetho/inspector/network/DownloadingAsyncPrettyPrinterFactory.doPrint:(Ljava/io/PrintWriter;Ljava/io/InputStream;Ljava/lang/String;)V
                //    23: goto            119
                //    26: astore          4
                //    28: goto            94
                //    31: astore_3       
                //    32: ldc             Ljava/io/IOException;.class
                //    34: aload_3        
                //    35: invokevirtual   java/lang/Throwable.getCause:()Ljava/lang/Throwable;
                //    38: invokevirtual   java/lang/Class.isInstance:(Ljava/lang/Object;)Z
                //    41: ifeq            83
                //    44: new             Ljava/lang/StringBuilder;
                //    47: astore          4
                //    49: aload           4
                //    51: invokespecial   java/lang/StringBuilder.<init>:()V
                //    54: aload           4
                //    56: ldc             "Cannot successfully download schema: "
                //    58: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
                //    61: pop            
                //    62: aload           4
                //    64: aload_3        
                //    65: invokevirtual   java/lang/Throwable.getMessage:()Ljava/lang/String;
                //    68: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
                //    71: pop            
                //    72: aload_1        
                //    73: aload_2        
                //    74: aload           4
                //    76: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
                //    79: invokestatic    com/facebook/stetho/inspector/network/DownloadingAsyncPrettyPrinterFactory.access$000:(Ljava/io/PrintWriter;Ljava/io/InputStream;Ljava/lang/String;)V
                //    82: return         
                //    83: aload_3        
                //    84: athrow         
                //    85: astore_1       
                //    86: aload_1        
                //    87: invokevirtual   java/lang/Throwable.getCause:()Ljava/lang/Throwable;
                //    90: invokestatic    com/facebook/stetho/common/ExceptionUtil.propagate:(Ljava/lang/Throwable;)Ljava/lang/RuntimeException;
                //    93: athrow         
                //    94: ldc             "Encountered spurious interrupt while downloading schema for pretty printing: "
                //    96: invokestatic    a.k:(Ljava/lang/String;)Ljava/lang/StringBuilder;
                //    99: astore_3       
                //   100: aload_3        
                //   101: aload           4
                //   103: invokevirtual   java/lang/Throwable.getMessage:()Ljava/lang/String;
                //   106: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
                //   109: pop            
                //   110: aload_1        
                //   111: aload_2        
                //   112: aload_3        
                //   113: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
                //   116: invokestatic    com/facebook/stetho/inspector/network/DownloadingAsyncPrettyPrinterFactory.access$000:(Ljava/io/PrintWriter;Ljava/io/InputStream;Ljava/lang/String;)V
                //   119: return         
                //    Exceptions:
                //  throws java.io.IOException
                //    Exceptions:
                //  Try           Handler
                //  Start  End    Start  End    Type                                     
                //  -----  -----  -----  -----  -----------------------------------------
                //  0      13     31     85     Ljava/util/concurrent/ExecutionException;
                //  0      13     26     31     Ljava/lang/InterruptedException;
                //  13     23     26     31     Ljava/lang/InterruptedException;
                //  13     23     85     94     Ljava/util/concurrent/ExecutionException;
                //  32     82     26     31     Ljava/lang/InterruptedException;
                //  32     82     85     94     Ljava/util/concurrent/ExecutionException;
                //  83     85     26     31     Ljava/lang/InterruptedException;
                //  83     85     85     94     Ljava/util/concurrent/ExecutionException;
                // 
                // The error that occurred was:
                // 
                // java.lang.IllegalStateException: Expression is linked from several locations: Label_0083:
                //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
                //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2604)
                //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
                //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:206)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
                //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
                //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
                //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
                //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
                //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
                //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformCall(AstMethodBodyBuilder.java:1151)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:993)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:534)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:548)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:534)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:377)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:318)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:213)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
                //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
                //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
                //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
                //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
                //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
                //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
                //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
                //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
                //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
                //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
                //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
                //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:129)
                // 
                throw new IllegalStateException("An error occurred while decompiling this method.");
            }
        };
    }
    
    public abstract MatchResult matchAndParseHeader(final String p0, final String p1);
    
    public class MatchResult
    {
        private final PrettyPrinterDisplayType mDisplayType;
        private final String mSchemaUri;
        
        public MatchResult(final String mSchemaUri, final PrettyPrinterDisplayType mDisplayType) {
            this.mSchemaUri = mSchemaUri;
            this.mDisplayType = mDisplayType;
        }
        
        public PrettyPrinterDisplayType getDisplayType() {
            return this.mDisplayType;
        }
        
        public String getSchemaUri() {
            return this.mSchemaUri;
        }
    }
    
    public static class Request implements Callable<String>
    {
        private URL url;
        
        public Request(final URL url) {
            this.url = url;
        }
        
        @Override
        public String call() throws IOException {
            final HttpURLConnection httpURLConnection = (HttpURLConnection)FirebasePerfUrlConnection.instrument((Object)this.url.openConnection());
            final int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                final InputStream inputStream = httpURLConnection.getInputStream();
                try {
                    return Util.readAsUTF8(inputStream);
                }
                finally {
                    inputStream.close();
                }
            }
            final StringBuilder p = d.p("Got status code: ", responseCode, " while downloading schema with url: ");
            p.append(this.url.toString());
            throw new IOException(p.toString());
        }
    }
}
