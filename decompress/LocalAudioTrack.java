// 
// Decompiled by Procyon v0.6.0
// 

package com.twilio.video;

import android.content.Context;

public class LocalAudioTrack extends AudioTrack
{
    private static final Logger logger;
    private final MediaFactory mediaFactory;
    private long nativeLocalAudioTrackHandle;
    private final String nativeTrackHash;
    
    static {
        logger = Logger.getLogger((Class)LocalAudioTrack.class);
    }
    
    public LocalAudioTrack(final long nativeLocalAudioTrackHandle, final String nativeTrackHash, final String s, final boolean b, final Context context) {
        super(nativeLocalAudioTrackHandle, b, s);
        this.nativeTrackHash = nativeTrackHash;
        this.nativeLocalAudioTrackHandle = nativeLocalAudioTrackHandle;
        this.mediaFactory = MediaFactory.instance((Object)this, context);
    }
    
    public static LocalAudioTrack create(final Context context, final boolean b) {
        return create(context, b, null, null);
    }
    
    public static LocalAudioTrack create(final Context context, final boolean b, final AudioOptions audioOptions) {
        return create(context, b, audioOptions, null);
    }
    
    public static LocalAudioTrack create(final Context context, final boolean b, final AudioOptions audioOptions, final String s) {
        Preconditions.checkNotNull((Object)context);
        Preconditions.checkState(Util.permissionGranted(context, "android.permission.RECORD_AUDIO"), (Object)"RECORD_AUDIO permission must be granted to create audio track");
        final Object o = new Object();
        final MediaFactory instance = MediaFactory.instance(o, context);
        final LocalAudioTrack audioTrack = instance.createAudioTrack(context, b, audioOptions, s);
        if (audioTrack == null) {
            LocalAudioTrack.logger.e("Failed to create local audio track");
        }
        instance.release(o);
        return audioTrack;
    }
    
    public static LocalAudioTrack create(final Context context, final boolean b, final String s) {
        return create(context, b, null, s);
    }
    
    private native void nativeEnable(final long p0, final boolean p1);
    
    private native boolean nativeIsEnabled(final long p0);
    
    private native void nativeRelease(final long p0);
    
    public void addSink(final AudioSink audioSink) {
        synchronized (this) {
            Preconditions.checkState(!this.isReleased(), (Object)"Cannot add AudioSink to audio track that has been released");
            super.addSink(audioSink);
        }
    }
    
    public void enable(final boolean b) {
        synchronized (this) {
            if (!this.isReleased()) {
                this.nativeEnable(this.nativeLocalAudioTrackHandle, b);
            }
            else {
                LocalAudioTrack.logger.e("Cannot enable a local audio track that has been removed");
            }
        }
    }
    
    public String getName() {
        return super.getName();
    }
    
    public long getNativeHandle() {
        synchronized (this) {
            return this.nativeLocalAudioTrackHandle;
        }
    }
    
    public String getNativeTrackHash() {
        return this.nativeTrackHash;
    }
    
    public boolean isEnabled() {
        synchronized (this) {
            if (!this.isReleased()) {
                return this.nativeIsEnabled(this.nativeLocalAudioTrackHandle);
            }
            LocalAudioTrack.logger.w("Local audio track is not enabled because it has been released");
            return false;
        }
    }
    
    public boolean isReleased() {
        return this.nativeLocalAudioTrackHandle == 0L;
    }
    
    public void release() {
        synchronized (this) {
            if (!this.isReleased()) {
                this.nativeRelease(this.nativeLocalAudioTrackHandle);
                this.nativeLocalAudioTrackHandle = 0L;
                this.mediaFactory.release((Object)this);
            }
        }
    }
    
    public void removeSink(final AudioSink audioSink) {
        synchronized (this) {
            Preconditions.checkState(!this.isReleased(), (Object)"Cannot remove AudioSink from audio track that has been released");
            super.removeSink(audioSink);
        }
    }
}
