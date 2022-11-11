// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.creation.video.render.encoder;

import sg2.e;
import android.media.MediaFormat;
import android.media.MediaCodec;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015" }, d2 = { "Lcom/reddit/video/creation/video/render/encoder/EncoderContainer;", "", "encoder", "Landroid/media/MediaCodec;", "mediaFormat", "Landroid/media/MediaFormat;", "(Landroid/media/MediaCodec;Landroid/media/MediaFormat;)V", "getEncoder", "()Landroid/media/MediaCodec;", "getMediaFormat", "()Landroid/media/MediaFormat;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "creation_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class EncoderContainer
{
    public static final int $stable = 8;
    private final MediaCodec encoder;
    private final MediaFormat mediaFormat;
    
    public EncoderContainer(final MediaCodec encoder, final MediaFormat mediaFormat) {
        e.f((Object)encoder, "encoder");
        e.f((Object)mediaFormat, "mediaFormat");
        this.encoder = encoder;
        this.mediaFormat = mediaFormat;
    }
    
    public final MediaCodec component1() {
        return this.encoder;
    }
    
    public final MediaFormat component2() {
        return this.mediaFormat;
    }
    
    public final EncoderContainer copy(final MediaCodec mediaCodec, final MediaFormat mediaFormat) {
        e.f((Object)mediaCodec, "encoder");
        e.f((Object)mediaFormat, "mediaFormat");
        return new EncoderContainer(mediaCodec, mediaFormat);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof EncoderContainer)) {
            return false;
        }
        final EncoderContainer encoderContainer = (EncoderContainer)o;
        return e.a((Object)this.encoder, (Object)encoderContainer.encoder) && e.a((Object)this.mediaFormat, (Object)encoderContainer.mediaFormat);
    }
    
    public final MediaCodec getEncoder() {
        return this.encoder;
    }
    
    public final MediaFormat getMediaFormat() {
        return this.mediaFormat;
    }
    
    @Override
    public int hashCode() {
        return this.mediaFormat.hashCode() + this.encoder.hashCode() * 31;
    }
    
    @Override
    public String toString() {
        final StringBuilder r = a.r("EncoderContainer(encoder=");
        r.append(this.encoder);
        r.append(", mediaFormat=");
        r.append(this.mediaFormat);
        r.append(')');
        return r.toString();
    }
}
