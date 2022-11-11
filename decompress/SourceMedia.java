// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.creation.video.trim.data.videoEditor;

import java.util.ArrayList;
import sg2.e;
import android.net.Uri;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a" }, d2 = { "Lcom/reddit/video/creation/video/trim/data/videoEditor/SourceMedia;", "", "uri", "Landroid/net/Uri;", "(Landroid/net/Uri;)V", "duration", "", "getDuration", "()F", "setDuration", "(F)V", "size", "", "getSize", "()J", "setSize", "(J)V", "tracks", "", "Lcom/reddit/video/creation/video/trim/data/videoEditor/MediaTrackFormat;", "getTracks", "()Ljava/util/List;", "setTracks", "(Ljava/util/List;)V", "getUri", "()Landroid/net/Uri;", "creation_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class SourceMedia
{
    public static final int $stable = 8;
    private float duration;
    private long size;
    private List<MediaTrackFormat> tracks;
    private final Uri uri;
    
    public SourceMedia(final Uri uri) {
        e.f((Object)uri, "uri");
        this.uri = uri;
        this.tracks = new ArrayList<MediaTrackFormat>();
    }
    
    public final float getDuration() {
        return this.duration;
    }
    
    public final long getSize() {
        return this.size;
    }
    
    public final List<MediaTrackFormat> getTracks() {
        return this.tracks;
    }
    
    public final Uri getUri() {
        return this.uri;
    }
    
    public final void setDuration(final float duration) {
        this.duration = duration;
    }
    
    public final void setSize(final long size) {
        this.size = size;
    }
    
    public final void setTracks(final List<MediaTrackFormat> tracks) {
        e.f((Object)tracks, "<set-?>");
        this.tracks = tracks;
    }
}
