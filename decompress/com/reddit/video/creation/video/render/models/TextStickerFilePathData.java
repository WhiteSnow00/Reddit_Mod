// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.creation.video.render.models;

import rj2.b;
import yg.a;
import sj2.a1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pj2.e;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&%B\u001f\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u001f\u0010 B5\b\u0017\u0012\u0006\u0010!\u001a\u00020\u0013\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b\u001f\u0010$J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001J\t\u0010\n\u001a\u00020\tH\u00c6\u0003J\t\u0010\f\u001a\u00020\u000bH\u00c6\u0003J\t\u0010\r\u001a\u00020\u000bH\u00c6\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000bH\u00c6\u0001J\t\u0010\u0012\u001a\u00020\tH\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0013H\u00d6\u0001J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u000f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001b\u001a\u0004\b\u001e\u0010\u001d¨\u0006'" }, d2 = { "Lcom/reddit/video/creation/video/render/models/TextStickerFilePathData;", "", "self", "Lrj2/b;", "output", "Lqj2/e;", "serialDesc", "Lhg2/j;", "write$Self", "", "component1", "", "component2", "component3", "path", "startTime", "endTime", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getPath", "()Ljava/lang/String;", "J", "getStartTime", "()J", "getEndTime", "<init>", "(Ljava/lang/String;JJ)V", "seen1", "Lsj2/a1;", "serializationConstructorMarker", "(ILjava/lang/String;JJLsj2/a1;)V", "Companion", "$serializer", "creation_release" }, k = 1, mv = { 1, 7, 1 })
@e
public final class TextStickerFilePathData
{
    public static final int $stable = 0;
    public static final Companion Companion;
    private final long endTime = endTime;
    private final String path = path;
    private final long startTime = startTime;
    
    static {
        Companion = new Companion(null);
    }
    
    public TextStickerFilePathData(final String path, final long startTime, final long endTime) {
        sg2.e.f((Object)path, "path");
        this.path = path;
        this.startTime = startTime;
        this.endTime = endTime;
    }
    
    public static final void write$Self(final TextStickerFilePathData textStickerFilePathData, final b b, final qj2.e e) {
        sg2.e.f((Object)textStickerFilePathData, "self");
        sg2.e.f((Object)b, "output");
        sg2.e.f((Object)e, "serialDesc");
        b.B(e, 0, textStickerFilePathData.path);
        b.e(e, 1, textStickerFilePathData.startTime);
        b.e(e, 2, textStickerFilePathData.endTime);
    }
    
    public final String component1() {
        return this.path;
    }
    
    public final long component2() {
        return this.startTime;
    }
    
    public final long component3() {
        return this.endTime;
    }
    
    public final TextStickerFilePathData copy(final String s, final long n, final long n2) {
        sg2.e.f((Object)s, "path");
        return new TextStickerFilePathData(s, n, n2);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TextStickerFilePathData)) {
            return false;
        }
        final TextStickerFilePathData textStickerFilePathData = (TextStickerFilePathData)o;
        return sg2.e.a((Object)this.path, (Object)textStickerFilePathData.path) && this.startTime == textStickerFilePathData.startTime && this.endTime == textStickerFilePathData.endTime;
    }
    
    public final long getEndTime() {
        return this.endTime;
    }
    
    public final String getPath() {
        return this.path;
    }
    
    public final long getStartTime() {
        return this.startTime;
    }
    
    @Override
    public int hashCode() {
        return Long.hashCode(this.endTime) + b.b(this.startTime, this.path.hashCode() * 31, 31);
    }
    
    @Override
    public String toString() {
        final StringBuilder r = a.r("TextStickerFilePathData(path=");
        r.append(this.path);
        r.append(", startTime=");
        r.append(this.startTime);
        r.append(", endTime=");
        return b.i(r, this.endTime, ')');
    }
    
    @Metadata(bv = {}, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0001¨\u0006\u0007" }, d2 = { "Lcom/reddit/video/creation/video/render/models/TextStickerFilePathData$Companion;", "", "Lpj2/b;", "Lcom/reddit/video/creation/video/render/models/TextStickerFilePathData;", "serializer", "<init>", "()V", "creation_release" }, k = 1, mv = { 1, 7, 1 })
    public static final class Companion
    {
        private Companion() {
        }
        
        public final pj2.b<TextStickerFilePathData> serializer() {
            return (pj2.b<TextStickerFilePathData>)TextStickerFilePathData$$serializer.INSTANCE;
        }
    }
}
