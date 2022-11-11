// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import sg2.e;
import com.reddit.listing.model.Listable$Type;
import kotlin.Metadata;
import com.reddit.listing.model.Listable;

@Metadata(d1 = { "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010 \u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\"\u001a\u00020\fH\u00c2\u0003J[\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\fH\u00c6\u0001J\u000e\u0010$\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\u0007J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)H\u00d6\u0003J\b\u0010*\u001a\u00020\fH\u0016J\t\u0010+\u001a\u00020\u0007H\u00d6\u0001J\t\u0010,\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u000fR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u000f¨\u0006-" }, d2 = { "Lcom/reddit/domain/model/VideoUploadPresentationModel;", "Lcom/reddit/listing/model/Listable;", "id", "", "title", "requestId", "status", "", "thumbnail", "subreddit", "uploadError", "uniqueId", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "getId", "()Ljava/lang/String;", "listableType", "Lcom/reddit/listing/model/Listable$Type;", "getListableType", "()Lcom/reddit/listing/model/Listable$Type;", "getRequestId", "getStatus", "()I", "getSubreddit", "getThumbnail", "getTitle", "getUploadError", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "copyStatus", "newStatus", "equals", "", "other", "", "getUniqueID", "hashCode", "toString", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class VideoUploadPresentationModel implements Listable
{
    private final String id;
    private final Listable$Type listableType;
    private final String requestId;
    private final int status;
    private final String subreddit;
    private final String thumbnail;
    private final String title;
    private final long uniqueId;
    private final String uploadError;
    
    public VideoUploadPresentationModel(final String id, final String title, final String requestId, final int status, final String thumbnail, final String subreddit, final String uploadError, final long uniqueId) {
        d.y(id, "id", title, "title", requestId, "requestId", thumbnail, "thumbnail", subreddit, "subreddit");
        this.id = id;
        this.title = title;
        this.requestId = requestId;
        this.status = status;
        this.thumbnail = thumbnail;
        this.subreddit = subreddit;
        this.uploadError = uploadError;
        this.uniqueId = uniqueId;
        this.listableType = Listable$Type.SUBMITTED_VIDEO;
    }
    
    private final long component8() {
        return this.uniqueId;
    }
    
    public static /* synthetic */ VideoUploadPresentationModel copy$default(final VideoUploadPresentationModel videoUploadPresentationModel, String id, String title, String requestId, int status, String thumbnail, String subreddit, String uploadError, long uniqueId, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            id = videoUploadPresentationModel.id;
        }
        if ((n & 0x2) != 0x0) {
            title = videoUploadPresentationModel.title;
        }
        if ((n & 0x4) != 0x0) {
            requestId = videoUploadPresentationModel.requestId;
        }
        if ((n & 0x8) != 0x0) {
            status = videoUploadPresentationModel.status;
        }
        if ((n & 0x10) != 0x0) {
            thumbnail = videoUploadPresentationModel.thumbnail;
        }
        if ((n & 0x20) != 0x0) {
            subreddit = videoUploadPresentationModel.subreddit;
        }
        if ((n & 0x40) != 0x0) {
            uploadError = videoUploadPresentationModel.uploadError;
        }
        if ((n & 0x80) != 0x0) {
            uniqueId = videoUploadPresentationModel.uniqueId;
        }
        return videoUploadPresentationModel.copy(id, title, requestId, status, thumbnail, subreddit, uploadError, uniqueId);
    }
    
    public final String component1() {
        return this.id;
    }
    
    public final String component2() {
        return this.title;
    }
    
    public final String component3() {
        return this.requestId;
    }
    
    public final int component4() {
        return this.status;
    }
    
    public final String component5() {
        return this.thumbnail;
    }
    
    public final String component6() {
        return this.subreddit;
    }
    
    public final String component7() {
        return this.uploadError;
    }
    
    public final VideoUploadPresentationModel copy(final String s, final String s2, final String s3, final int n, final String s4, final String s5, final String s6, final long n2) {
        e.f((Object)s, "id");
        e.f((Object)s2, "title");
        e.f((Object)s3, "requestId");
        e.f((Object)s4, "thumbnail");
        e.f((Object)s5, "subreddit");
        return new VideoUploadPresentationModel(s, s2, s3, n, s4, s5, s6, n2);
    }
    
    public final VideoUploadPresentationModel copyStatus(final int n) {
        return copy$default(this, null, null, null, n, null, null, null, 0L, 247, null);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof VideoUploadPresentationModel)) {
            return false;
        }
        final VideoUploadPresentationModel videoUploadPresentationModel = (VideoUploadPresentationModel)o;
        return e.a((Object)this.id, (Object)videoUploadPresentationModel.id) && e.a((Object)this.title, (Object)videoUploadPresentationModel.title) && e.a((Object)this.requestId, (Object)videoUploadPresentationModel.requestId) && this.status == videoUploadPresentationModel.status && e.a((Object)this.thumbnail, (Object)videoUploadPresentationModel.thumbnail) && e.a((Object)this.subreddit, (Object)videoUploadPresentationModel.subreddit) && e.a((Object)this.uploadError, (Object)videoUploadPresentationModel.uploadError) && this.uniqueId == videoUploadPresentationModel.uniqueId;
    }
    
    public final String getId() {
        return this.id;
    }
    
    public Listable$Type getListableType() {
        return this.listableType;
    }
    
    public final String getRequestId() {
        return this.requestId;
    }
    
    public final int getStatus() {
        return this.status;
    }
    
    public final String getSubreddit() {
        return this.subreddit;
    }
    
    public final String getThumbnail() {
        return this.thumbnail;
    }
    
    public final String getTitle() {
        return this.title;
    }
    
    public long getUniqueID() {
        return this.uniqueId;
    }
    
    public final String getUploadError() {
        return this.uploadError;
    }
    
    @Override
    public int hashCode() {
        final int c = b.c(this.subreddit, b.c(this.thumbnail, a.c(this.status, b.c(this.requestId, b.c(this.title, this.id.hashCode() * 31, 31), 31), 31), 31), 31);
        final String uploadError = this.uploadError;
        int hashCode;
        if (uploadError == null) {
            hashCode = 0;
        }
        else {
            hashCode = uploadError.hashCode();
        }
        return Long.hashCode(this.uniqueId) + (c + hashCode) * 31;
    }
    
    @Override
    public String toString() {
        final StringBuilder r = a.r("VideoUploadPresentationModel(id=");
        r.append(this.id);
        r.append(", title=");
        r.append(this.title);
        r.append(", requestId=");
        r.append(this.requestId);
        r.append(", status=");
        r.append(this.status);
        r.append(", thumbnail=");
        r.append(this.thumbnail);
        r.append(", subreddit=");
        r.append(this.subreddit);
        r.append(", uploadError=");
        r.append(this.uploadError);
        r.append(", uniqueId=");
        return b.i(r, this.uniqueId, ')');
    }
}
