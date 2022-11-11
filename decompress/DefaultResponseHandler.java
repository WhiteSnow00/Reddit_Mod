// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.inspector.network;

import java.io.IOException;

public class DefaultResponseHandler implements ResponseHandler
{
    private int mBytesRead;
    private int mDecodedBytesRead;
    private final NetworkEventReporter mEventReporter;
    private final String mRequestId;
    
    public DefaultResponseHandler(final NetworkEventReporter mEventReporter, final String mRequestId) {
        this.mBytesRead = 0;
        this.mDecodedBytesRead = -1;
        this.mEventReporter = mEventReporter;
        this.mRequestId = mRequestId;
    }
    
    private void reportDataReceived() {
        final NetworkEventReporter mEventReporter = this.mEventReporter;
        final String mRequestId = this.mRequestId;
        final int mBytesRead = this.mBytesRead;
        int mDecodedBytesRead = this.mDecodedBytesRead;
        if (mDecodedBytesRead < 0) {
            mDecodedBytesRead = mBytesRead;
        }
        mEventReporter.dataReceived(mRequestId, mBytesRead, mDecodedBytesRead);
    }
    
    @Override
    public void onEOF() {
        this.reportDataReceived();
        this.mEventReporter.responseReadFinished(this.mRequestId);
    }
    
    @Override
    public void onError(final IOException ex) {
        this.reportDataReceived();
        this.mEventReporter.responseReadFailed(this.mRequestId, ex.toString());
    }
    
    @Override
    public void onRead(final int n) {
        this.mBytesRead += n;
    }
    
    @Override
    public void onReadDecoded(final int n) {
        if (this.mDecodedBytesRead == -1) {
            this.mDecodedBytesRead = 0;
        }
        this.mDecodedBytesRead += n;
    }
}
