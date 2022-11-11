// 
// Decompiled by Procyon v0.6.0
// 

package com.twilio.video;

import java.nio.ByteBuffer;
import android.content.Context;

public class LocalDataTrack extends DataTrack
{
    private static final Logger logger;
    private final MediaFactory mediaFactory;
    private long nativeLocalDataTrackHandle;
    private final String nativeTrackHash;
    
    static {
        logger = Logger.getLogger((Class)LocalDataTrack.class);
    }
    
    public LocalDataTrack(final long nativeLocalDataTrackHandle, final boolean b, final boolean b2, final boolean b3, final int n, final int n2, final String nativeTrackHash, final String s, final Context context) {
        super(b, b2, b3, n, n2, s);
        this.nativeLocalDataTrackHandle = nativeLocalDataTrackHandle;
        this.nativeTrackHash = nativeTrackHash;
        this.mediaFactory = MediaFactory.instance((Object)this, context);
    }
    
    public static LocalDataTrack create(final Context context) {
        return create(context, DataTrackOptions.DEFAULT_DATA_TRACK_OPTIONS);
    }
    
    public static LocalDataTrack create(final Context context, final DataTrackOptions dataTrackOptions) {
        Preconditions.checkNotNull((Object)context, (Object)"Context must not be null");
        DataTrackOptions default_DATA_TRACK_OPTIONS = dataTrackOptions;
        if (dataTrackOptions == null) {
            default_DATA_TRACK_OPTIONS = DataTrackOptions.DEFAULT_DATA_TRACK_OPTIONS;
        }
        final Object o = new Object();
        final MediaFactory instance = MediaFactory.instance(o, context);
        final LocalDataTrack dataTrack = instance.createDataTrack(context, default_DATA_TRACK_OPTIONS.ordered, default_DATA_TRACK_OPTIONS.maxPacketLifeTime, default_DATA_TRACK_OPTIONS.maxRetransmits, default_DATA_TRACK_OPTIONS.name);
        instance.release(o);
        return dataTrack;
    }
    
    private byte[] getMessageByteArray(final ByteBuffer byteBuffer) {
        final byte[] array = new byte[byteBuffer.capacity()];
        byteBuffer.get(array);
        return array;
    }
    
    private native void nativeBufferSend(final long p0, final byte[] p1);
    
    private native void nativeRelease(final long p0);
    
    private native void nativeStringSend(final long p0, final String p1);
    
    public String getName() {
        return super.getName();
    }
    
    public long getNativeHandle() {
        synchronized (this) {
            return this.nativeLocalDataTrackHandle;
        }
    }
    
    public String getNativeTrackHash() {
        return this.nativeTrackHash;
    }
    
    public boolean isEnabled() {
        synchronized (this) {
            if (!this.isReleased()) {
                return super.isEnabled();
            }
            LocalDataTrack.logger.e("Local data track is not enabled because it has been released");
            return false;
        }
    }
    
    public boolean isReleased() {
        return this.nativeLocalDataTrackHandle == 0L;
    }
    
    public void release() {
        synchronized (this) {
            if (!this.isReleased()) {
                this.nativeRelease(this.nativeLocalDataTrackHandle);
                this.nativeLocalDataTrackHandle = 0L;
                this.mediaFactory.release((Object)this);
            }
        }
    }
    
    public void send(final String s) {
        synchronized (this) {
            Preconditions.checkState(!this.isReleased(), (Object)"Cannot send message after data track is released");
            Preconditions.checkNotNull((Object)s, (Object)"Message buffer must not be null");
            this.nativeStringSend(this.nativeLocalDataTrackHandle, s);
        }
    }
    
    public void send(final ByteBuffer byteBuffer) {
        synchronized (this) {
            Preconditions.checkState(!this.isReleased(), (Object)"Cannot send message after data track is released");
            Preconditions.checkNotNull((Object)byteBuffer, (Object)"Message buffer must not be null");
            final long nativeLocalDataTrackHandle = this.nativeLocalDataTrackHandle;
            byte[] array;
            if (byteBuffer.hasArray()) {
                array = byteBuffer.array();
            }
            else {
                array = this.getMessageByteArray(byteBuffer);
            }
            this.nativeBufferSend(nativeLocalDataTrackHandle, array);
        }
    }
}
