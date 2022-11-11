// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.creation.video.render.models;

import sg2.e;
import java.io.File;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0005H\u00c6\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018" }, d2 = { "Lcom/reddit/video/creation/video/render/models/TextStickerFileData;", "", "file", "Ljava/io/File;", "startTime", "", "endTime", "(Ljava/io/File;JJ)V", "getEndTime", "()J", "getFile", "()Ljava/io/File;", "getStartTime", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "creation_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class TextStickerFileData
{
    public static final int $stable = 8;
    private final long endTime;
    private final File file;
    private final long startTime;
    
    public TextStickerFileData(final File file, final long startTime, final long endTime) {
        e.f((Object)file, "file");
        this.file = file;
        this.startTime = startTime;
        this.endTime = endTime;
    }
    
    public final File component1() {
        return this.file;
    }
    
    public final long component2() {
        return this.startTime;
    }
    
    public final long component3() {
        return this.endTime;
    }
    
    public final TextStickerFileData copy(final File file, final long n, final long n2) {
        e.f((Object)file, "file");
        return new TextStickerFileData(file, n, n2);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TextStickerFileData)) {
            return false;
        }
        final TextStickerFileData textStickerFileData = (TextStickerFileData)o;
        return e.a((Object)this.file, (Object)textStickerFileData.file) && this.startTime == textStickerFileData.startTime && this.endTime == textStickerFileData.endTime;
    }
    
    public final long getEndTime() {
        return this.endTime;
    }
    
    public final File getFile() {
        return this.file;
    }
    
    public final long getStartTime() {
        return this.startTime;
    }
    
    @Override
    public int hashCode() {
        return Long.hashCode(this.endTime) + b.b(this.startTime, this.file.hashCode() * 31, 31);
    }
    
    @Override
    public String toString() {
        final StringBuilder r = a.r("TextStickerFileData(file=");
        r.append(this.file);
        r.append(", startTime=");
        r.append(this.startTime);
        r.append(", endTime=");
        return b.i(r, this.endTime, ')');
    }
}
