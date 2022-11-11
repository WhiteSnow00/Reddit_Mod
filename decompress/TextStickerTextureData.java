// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.creation.video.render.models;

import kotlin.Metadata;

@Metadata(d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003JE\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001d\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001e\u001a\u00020\u001fH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006 " }, d2 = { "Lcom/reddit/video/creation/video/render/models/TextStickerTextureData;", "", "activeTextureIndex", "", "textureId", "startTime", "", "endTime", "textureTagIndex", "textureTagId", "(IIJJII)V", "getActiveTextureIndex", "()I", "getEndTime", "()J", "getStartTime", "getTextureId", "getTextureTagId", "getTextureTagIndex", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "", "creation_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class TextStickerTextureData
{
    public static final int $stable = 0;
    private final int activeTextureIndex;
    private final long endTime;
    private final long startTime;
    private final int textureId;
    private final int textureTagId;
    private final int textureTagIndex;
    
    public TextStickerTextureData(final int activeTextureIndex, final int textureId, final long startTime, final long endTime, final int textureTagIndex, final int textureTagId) {
        this.activeTextureIndex = activeTextureIndex;
        this.textureId = textureId;
        this.startTime = startTime;
        this.endTime = endTime;
        this.textureTagIndex = textureTagIndex;
        this.textureTagId = textureTagId;
    }
    
    public final int component1() {
        return this.activeTextureIndex;
    }
    
    public final int component2() {
        return this.textureId;
    }
    
    public final long component3() {
        return this.startTime;
    }
    
    public final long component4() {
        return this.endTime;
    }
    
    public final int component5() {
        return this.textureTagIndex;
    }
    
    public final int component6() {
        return this.textureTagId;
    }
    
    public final TextStickerTextureData copy(final int n, final int n2, final long n3, final long n4, final int n5, final int n6) {
        return new TextStickerTextureData(n, n2, n3, n4, n5, n6);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TextStickerTextureData)) {
            return false;
        }
        final TextStickerTextureData textStickerTextureData = (TextStickerTextureData)o;
        return this.activeTextureIndex == textStickerTextureData.activeTextureIndex && this.textureId == textStickerTextureData.textureId && this.startTime == textStickerTextureData.startTime && this.endTime == textStickerTextureData.endTime && this.textureTagIndex == textStickerTextureData.textureTagIndex && this.textureTagId == textStickerTextureData.textureTagId;
    }
    
    public final int getActiveTextureIndex() {
        return this.activeTextureIndex;
    }
    
    public final long getEndTime() {
        return this.endTime;
    }
    
    public final long getStartTime() {
        return this.startTime;
    }
    
    public final int getTextureId() {
        return this.textureId;
    }
    
    public final int getTextureTagId() {
        return this.textureTagId;
    }
    
    public final int getTextureTagIndex() {
        return this.textureTagIndex;
    }
    
    @Override
    public int hashCode() {
        return Integer.hashCode(this.textureTagId) + a.c(this.textureTagIndex, b.b(this.endTime, b.b(this.startTime, a.c(this.textureId, Integer.hashCode(this.activeTextureIndex) * 31, 31), 31), 31), 31);
    }
    
    @Override
    public String toString() {
        final StringBuilder r = a.r("TextStickerTextureData(activeTextureIndex=");
        r.append(this.activeTextureIndex);
        r.append(", textureId=");
        r.append(this.textureId);
        r.append(", startTime=");
        r.append(this.startTime);
        r.append(", endTime=");
        r.append(this.endTime);
        r.append(", textureTagIndex=");
        r.append(this.textureTagIndex);
        r.append(", textureTagId=");
        return d.l(r, this.textureTagId, ')');
    }
}
