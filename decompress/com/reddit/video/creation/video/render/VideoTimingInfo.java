// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.creation.video.render;

import sg2.e;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\nH\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018" }, d2 = { "Lcom/reddit/video/creation/video/render/VideoTimingInfo;", "", "timescale", "", "frameRate", "", "(JD)V", "getFrameRate", "()D", "frameTick", "", "getFrameTick", "()I", "getTimescale", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "creation_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class VideoTimingInfo
{
    public static final int $stable = 0;
    private final double frameRate;
    private final long timescale;
    
    public VideoTimingInfo(final long timescale, final double frameRate) {
        this.timescale = timescale;
        this.frameRate = frameRate;
    }
    
    public final long component1() {
        return this.timescale;
    }
    
    public final double component2() {
        return this.frameRate;
    }
    
    public final VideoTimingInfo copy(final long n, final double n2) {
        return new VideoTimingInfo(n, n2);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof VideoTimingInfo)) {
            return false;
        }
        final VideoTimingInfo videoTimingInfo = (VideoTimingInfo)o;
        return this.timescale == videoTimingInfo.timescale && e.a((Object)this.frameRate, (Object)videoTimingInfo.frameRate);
    }
    
    public final double getFrameRate() {
        return this.frameRate;
    }
    
    public final int getFrameTick() {
        return (int)Math.rint(this.timescale / this.frameRate);
    }
    
    public final long getTimescale() {
        return this.timescale;
    }
    
    @Override
    public int hashCode() {
        return Double.hashCode(this.frameRate) + Long.hashCode(this.timescale) * 31;
    }
    
    @Override
    public String toString() {
        final StringBuilder r = a.r("VideoTimingInfo(timescale=");
        r.append(this.timescale);
        r.append(", frameRate=");
        return d.k(r, this.frameRate, ')');
    }
}
