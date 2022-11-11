// 
// Decompiled by Procyon v0.6.0
// 

package com.twilio.video;

import android.os.Handler;

public class RemoteDataTrack extends DataTrack
{
    private static final Logger logger;
    private final RemoteDataTrack.RemoteDataTrack$Listener dataTrackListenerProxy;
    private Handler handler;
    private RemoteDataTrack.RemoteDataTrack$Listener listener;
    private long nativeRemoteDataTrackContext;
    private final String sid;
    
    static {
        logger = Logger.getLogger((Class)RemoteDataTrack.class);
    }
    
    public RemoteDataTrack(final boolean b, final boolean b2, final boolean b3, final int n, final int n2, final String sid, final String s, final long nativeRemoteDataTrackContext) {
        super(b, b2, b3, n, n2, s);
        this.dataTrackListenerProxy = (RemoteDataTrack.RemoteDataTrack$Listener)new RemoteDataTrack$1(this);
        this.sid = sid;
        this.nativeRemoteDataTrackContext = nativeRemoteDataTrackContext;
    }
    
    private native void nativeRelease(final long p0);
    
    public String getSid() {
        return this.sid;
    }
    
    public boolean isReleased() {
        return this.nativeRemoteDataTrackContext == 0L;
    }
    
    public void release() {
        synchronized (this) {
            if (!this.isReleased()) {
                this.nativeRelease(this.nativeRemoteDataTrackContext);
                this.nativeRemoteDataTrackContext = 0L;
            }
        }
    }
    
    public void setListener(final RemoteDataTrack.RemoteDataTrack$Listener listener) {
        monitorenter(this);
        Handler callbackHandler = null;
        Label_0019: {
            Label_0017: {
                if (listener != null) {
                    Label_0032: {
                        try {
                            callbackHandler = Util.createCallbackHandler();
                            break Label_0019;
                        }
                        finally {
                            break Label_0032;
                        }
                        break Label_0017;
                    }
                    monitorexit(this);
                }
            }
            callbackHandler = null;
        }
        this.handler = callbackHandler;
        this.listener = listener;
        monitorexit(this);
    }
}
