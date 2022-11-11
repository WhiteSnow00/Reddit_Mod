// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.creation.video.trim.data.videoEditor;

import sg2.e;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0017\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0018" }, d2 = { "Lcom/reddit/video/creation/video/trim/data/videoEditor/TargetTrack;", "", "sourceTrackIndex", "", "shouldInclude", "", "shouldTranscode", "format", "Lcom/reddit/video/creation/video/trim/data/videoEditor/MediaTrackFormat;", "(IZZLcom/reddit/video/creation/video/trim/data/videoEditor/MediaTrackFormat;)V", "getFormat", "()Lcom/reddit/video/creation/video/trim/data/videoEditor/MediaTrackFormat;", "setFormat", "(Lcom/reddit/video/creation/video/trim/data/videoEditor/MediaTrackFormat;)V", "getShouldInclude", "()Z", "setShouldInclude", "(Z)V", "getShouldTranscode", "setShouldTranscode", "getSourceTrackIndex", "()I", "setSourceTrackIndex", "(I)V", "creation_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public class TargetTrack
{
    public static final int $stable = 8;
    private MediaTrackFormat format;
    private boolean shouldInclude;
    private boolean shouldTranscode;
    private int sourceTrackIndex;
    
    public TargetTrack(final int sourceTrackIndex, final boolean shouldInclude, final boolean shouldTranscode, final MediaTrackFormat format) {
        e.f((Object)format, "format");
        this.sourceTrackIndex = sourceTrackIndex;
        this.shouldInclude = shouldInclude;
        this.shouldTranscode = shouldTranscode;
        this.format = format;
    }
    
    public final MediaTrackFormat getFormat() {
        return this.format;
    }
    
    public final boolean getShouldInclude() {
        return this.shouldInclude;
    }
    
    public final boolean getShouldTranscode() {
        return this.shouldTranscode;
    }
    
    public final int getSourceTrackIndex() {
        return this.sourceTrackIndex;
    }
    
    public final void setFormat(final MediaTrackFormat format) {
        e.f((Object)format, "<set-?>");
        this.format = format;
    }
    
    public final void setShouldInclude(final boolean shouldInclude) {
        this.shouldInclude = shouldInclude;
    }
    
    public final void setShouldTranscode(final boolean shouldTranscode) {
        this.shouldTranscode = shouldTranscode;
    }
    
    public final void setSourceTrackIndex(final int sourceTrackIndex) {
        this.sourceTrackIndex = sourceTrackIndex;
    }
}
