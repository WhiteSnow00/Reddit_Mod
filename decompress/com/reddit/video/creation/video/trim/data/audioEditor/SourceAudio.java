// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.creation.video.trim.data.audioEditor;

import sg2.e;
import android.net.Uri;
import kotlin.Metadata;

@Metadata(d1 = { "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\tH\u00c6\u0003J1\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u00c6\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010#\u001a\u00020$H\u00d6\u0001J\t\u0010%\u001a\u00020&H\u00d6\u0001R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006'" }, d2 = { "Lcom/reddit/video/creation/video/trim/data/audioEditor/SourceAudio;", "", "uri", "Landroid/net/Uri;", "size", "", "duration", "", "track", "Lcom/reddit/video/creation/video/trim/data/audioEditor/AudioTrackFormat;", "(Landroid/net/Uri;JFLcom/reddit/video/creation/video/trim/data/audioEditor/AudioTrackFormat;)V", "getDuration", "()F", "setDuration", "(F)V", "getSize", "()J", "setSize", "(J)V", "getTrack", "()Lcom/reddit/video/creation/video/trim/data/audioEditor/AudioTrackFormat;", "setTrack", "(Lcom/reddit/video/creation/video/trim/data/audioEditor/AudioTrackFormat;)V", "getUri", "()Landroid/net/Uri;", "setUri", "(Landroid/net/Uri;)V", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "creation_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class SourceAudio
{
    public static final int $stable = 8;
    private float duration;
    private long size;
    private AudioTrackFormat track;
    private Uri uri;
    
    public SourceAudio(final Uri uri, final long size, final float duration, final AudioTrackFormat track) {
        e.f((Object)uri, "uri");
        e.f((Object)track, "track");
        this.uri = uri;
        this.size = size;
        this.duration = duration;
        this.track = track;
    }
    
    public final Uri component1() {
        return this.uri;
    }
    
    public final long component2() {
        return this.size;
    }
    
    public final float component3() {
        return this.duration;
    }
    
    public final AudioTrackFormat component4() {
        return this.track;
    }
    
    public final SourceAudio copy(final Uri uri, final long n, final float n2, final AudioTrackFormat audioTrackFormat) {
        e.f((Object)uri, "uri");
        e.f((Object)audioTrackFormat, "track");
        return new SourceAudio(uri, n, n2, audioTrackFormat);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SourceAudio)) {
            return false;
        }
        final SourceAudio sourceAudio = (SourceAudio)o;
        return e.a((Object)this.uri, (Object)sourceAudio.uri) && this.size == sourceAudio.size && e.a((Object)this.duration, (Object)sourceAudio.duration) && e.a((Object)this.track, (Object)sourceAudio.track);
    }
    
    public final float getDuration() {
        return this.duration;
    }
    
    public final long getSize() {
        return this.size;
    }
    
    public final AudioTrackFormat getTrack() {
        return this.track;
    }
    
    public final Uri getUri() {
        return this.uri;
    }
    
    @Override
    public int hashCode() {
        return this.track.hashCode() + d.d(this.duration, b.b(this.size, this.uri.hashCode() * 31, 31), 31);
    }
    
    public final void setDuration(final float duration) {
        this.duration = duration;
    }
    
    public final void setSize(final long size) {
        this.size = size;
    }
    
    public final void setTrack(final AudioTrackFormat track) {
        e.f((Object)track, "<set-?>");
        this.track = track;
    }
    
    public final void setUri(final Uri uri) {
        e.f((Object)uri, "<set-?>");
        this.uri = uri;
    }
    
    @Override
    public String toString() {
        final StringBuilder r = a.r("SourceAudio(uri=");
        r.append(this.uri);
        r.append(", size=");
        r.append(this.size);
        r.append(", duration=");
        r.append(this.duration);
        r.append(", track=");
        r.append(this.track);
        r.append(')');
        return r.toString();
    }
}
