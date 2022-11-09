// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.inspector.network;

import java.io.IOException;
import com.facebook.stetho.inspector.console.CLog;
import com.facebook.stetho.inspector.protocol.module.Console;
import java.io.InputStream;
import java.io.OutputStream;
import com.facebook.stetho.inspector.helper.ChromePeerManager;
import java.io.FilterInputStream;

public final class ResponseHandlingInputStream extends FilterInputStream
{
    private static final int BUFFER_SIZE = 1024;
    public static final String TAG = "ResponseHandlingInputStream";
    private boolean mClosed;
    private final CountingOutputStream mDecompressedCounter;
    private boolean mEofSeen;
    private long mLastDecompressedCount;
    private final ChromePeerManager mNetworkPeerManager;
    private final OutputStream mOutputStream;
    private final String mRequestId;
    private final ResponseHandler mResponseHandler;
    private byte[] mSkipBuffer;
    
    public ResponseHandlingInputStream(final InputStream inputStream, final String mRequestId, final OutputStream mOutputStream, final CountingOutputStream mDecompressedCounter, final ChromePeerManager mNetworkPeerManager, final ResponseHandler mResponseHandler) {
        super(inputStream);
        this.mLastDecompressedCount = 0L;
        this.mRequestId = mRequestId;
        this.mOutputStream = mOutputStream;
        this.mDecompressedCounter = mDecompressedCounter;
        this.mNetworkPeerManager = mNetworkPeerManager;
        this.mResponseHandler = mResponseHandler;
        this.mClosed = false;
    }
    
    private int checkEOF(final int n) {
        monitorenter(this);
        if (n == -1) {
            try {
                this.closeOutputStreamQuietly();
                this.mResponseHandler.onEOF();
                this.mEofSeen = true;
            }
            finally {
                monitorexit(this);
            }
        }
        monitorexit(this);
        return n;
    }
    
    private void closeOutputStreamQuietly() {
        synchronized (this) {
            if (!this.mClosed) {
                while (true) {
                    try {
                        try {
                            this.mOutputStream.close();
                            this.reportDecodedSizeIfApplicable();
                            this.mClosed = true;
                        }
                        finally {}
                    }
                    catch (final IOException ex) {
                        final ChromePeerManager mNetworkPeerManager = this.mNetworkPeerManager;
                        final Console.MessageLevel error = Console.MessageLevel.ERROR;
                        final Console.MessageSource network = Console.MessageSource.NETWORK;
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Could not close the output stream");
                        sb.append(ex);
                        CLog.writeToConsole(mNetworkPeerManager, error, network, sb.toString());
                        continue;
                    }
                    break;
                }
                this.mClosed = true;
            }
        }
    }
    
    private byte[] getSkipBufferLocked() {
        if (this.mSkipBuffer == null) {
            this.mSkipBuffer = new byte[1024];
        }
        return this.mSkipBuffer;
    }
    
    private IOException handleIOException(final IOException ex) {
        this.mResponseHandler.onError(ex);
        return ex;
    }
    
    private void handleIOExceptionWritingToStream(final IOException ex) {
        final ChromePeerManager mNetworkPeerManager = this.mNetworkPeerManager;
        final Console.MessageLevel error = Console.MessageLevel.ERROR;
        final Console.MessageSource network = Console.MessageSource.NETWORK;
        final StringBuilder sb = new StringBuilder();
        sb.append("Could not write response body to the stream ");
        sb.append(ex);
        CLog.writeToConsole(mNetworkPeerManager, error, network, sb.toString());
        this.closeOutputStreamQuietly();
    }
    
    private void reportDecodedSizeIfApplicable() {
        final CountingOutputStream mDecompressedCounter = this.mDecompressedCounter;
        if (mDecompressedCounter != null) {
            final long count = mDecompressedCounter.getCount();
            this.mResponseHandler.onReadDecoded((int)(count - this.mLastDecompressedCount));
            this.mLastDecompressedCount = count;
        }
    }
    
    private void writeToOutputStream(final int n) {
        synchronized (this) {
            if (this.mClosed) {
                return;
            }
            try {
                this.mOutputStream.write(n);
                this.reportDecodedSizeIfApplicable();
            }
            catch (final IOException ex) {
                this.handleIOExceptionWritingToStream(ex);
            }
        }
    }
    
    private void writeToOutputStream(final byte[] array, final int n, final int n2) {
        synchronized (this) {
            if (this.mClosed) {
                return;
            }
            try {
                this.mOutputStream.write(array, n, n2);
                this.reportDecodedSizeIfApplicable();
            }
            catch (final IOException ex) {
                this.handleIOExceptionWritingToStream(ex);
            }
        }
    }
    
    @Override
    public void close() throws IOException {
        try {
            long n2;
            if (!this.mEofSeen) {
                final byte[] array = new byte[1024];
                long n = 0L;
                while (true) {
                    final int read = this.read(array);
                    n2 = n;
                    if (read == -1) {
                        break;
                    }
                    n += read;
                }
            }
            else {
                n2 = 0L;
            }
            if (n2 > 0L) {
                final ChromePeerManager mNetworkPeerManager = this.mNetworkPeerManager;
                final Console.MessageLevel error = Console.MessageLevel.ERROR;
                final Console.MessageSource network = Console.MessageSource.NETWORK;
                final StringBuilder sb = new StringBuilder();
                sb.append("There were ");
                sb.append(String.valueOf(n2));
                sb.append(" bytes that were not consumed while processing request ");
                sb.append(this.mRequestId);
                CLog.writeToConsole(mNetworkPeerManager, error, network, sb.toString());
            }
        }
        finally {
            super.close();
            this.closeOutputStreamQuietly();
        }
    }
    
    @Override
    public void mark(final int n) {
    }
    
    @Override
    public boolean markSupported() {
        return false;
    }
    
    @Override
    public int read() throws IOException {
        try {
            final int checkEOF = this.checkEOF(super.in.read());
            if (checkEOF != -1) {
                this.mResponseHandler.onRead(1);
                this.writeToOutputStream(checkEOF);
            }
            return checkEOF;
        }
        catch (final IOException ex) {
            throw this.handleIOException(ex);
        }
    }
    
    @Override
    public int read(final byte[] array) throws IOException {
        return this.read(array, 0, array.length);
    }
    
    @Override
    public int read(final byte[] array, final int n, int checkEOF) throws IOException {
        try {
            checkEOF = this.checkEOF(super.in.read(array, n, checkEOF));
            if (checkEOF != -1) {
                this.mResponseHandler.onRead(checkEOF);
                this.writeToOutputStream(array, n, checkEOF);
            }
            return checkEOF;
        }
        catch (final IOException ex) {
            throw this.handleIOException(ex);
        }
    }
    
    @Override
    public void reset() throws IOException {
        throw new UnsupportedOperationException("Mark not supported");
    }
    
    @Override
    public long skip(final long n) throws IOException {
        synchronized (this) {
            final byte[] skipBufferLocked = this.getSkipBufferLocked();
            long n2;
            int read;
            for (n2 = 0L; n2 < n; n2 += read) {
                read = this.read(skipBufferLocked, 0, (int)Math.min(skipBufferLocked.length, n - n2));
                if (read == -1) {
                    break;
                }
            }
            return n2;
        }
    }
}
