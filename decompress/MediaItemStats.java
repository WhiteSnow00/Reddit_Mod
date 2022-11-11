// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.base.model.media;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class MediaItemStats
{
    @c(LIZ = "comment_count")
    public int commentCount;
    @c(LIZ = "digg_count")
    public int diggCount;
    @c(LIZ = "id")
    public long id;
    @c(LIZ = "play_count")
    public int playCount;
    @c(LIZ = "share_count")
    public int shareCount;
    
    static {
        Covode.recordClassIndex(4946);
    }
    
    public int getCommentCount() {
        return this.commentCount;
    }
    
    public int getDiggCount() {
        return this.diggCount;
    }
    
    public long getId() {
        return this.id;
    }
    
    public int getPlayCount() {
        return this.playCount;
    }
    
    public int getShareCount() {
        return this.shareCount;
    }
    
    public void setCommentCount(final int commentCount) {
        this.commentCount = commentCount;
    }
    
    public void setDiggCount(final int diggCount) {
        this.diggCount = diggCount;
    }
    
    public void setId(final long id) {
        this.id = id;
    }
    
    public void setPlayCount(final int playCount) {
        this.playCount = playCount;
    }
    
    public void setShareCount(final int shareCount) {
        this.shareCount = shareCount;
    }
}
