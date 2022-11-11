// 
// Decompiled by Procyon v0.6.0
// 

package com.twilio.video;

public class RemoteAudioTrack extends AudioTrack
{
    private static final Logger logger;
    private long nativeRemoteAudioTrackHandle;
    private boolean playbackEnabled;
    private final String sid;
    
    static {
        logger = Logger.getLogger((Class)RemoteAudioTrack.class);
    }
    
    public RemoteAudioTrack(final long nativeRemoteAudioTrackHandle, final String sid, final String s, final boolean b) {
        super(nativeRemoteAudioTrackHandle, b, s);
        this.nativeRemoteAudioTrackHandle = nativeRemoteAudioTrackHandle;
        this.sid = sid;
        this.playbackEnabled = true;
    }
    
    private native void nativeEnablePlayback(final long p0, final boolean p1);
    
    private native void nativeRelease(final long p0);
    
    public void enablePlayback(final boolean playbackEnabled) {
        synchronized (this) {
            this.playbackEnabled = playbackEnabled;
            if (!this.isReleased()) {
                this.nativeEnablePlayback(this.nativeRemoteAudioTrackHandle, playbackEnabled);
            }
            else {
                RemoteAudioTrack.logger.w("Cannot enable playback of remote audio track that is no longer subscribed to");
            }
        }
    }
    
    public String getSid() {
        return this.sid;
    }
    
    public boolean isPlaybackEnabled() {
        synchronized (this) {
            return this.playbackEnabled;
        }
    }
    
    public boolean isReleased() {
        return this.nativeRemoteAudioTrackHandle == 0L;
    }
    
    public void release() {
        synchronized (this) {
            if (!this.isReleased()) {
                this.nativeRelease(this.nativeRemoteAudioTrackHandle);
                this.nativeRemoteAudioTrackHandle = 0L;
            }
        }
    }
}
