// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import ng2.e;
import com.reddit.domain.model.streaming.AutoMuteStatus;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015" }, d2 = { "Lcom/reddit/domain/model/StreamCommentWithStatus;", "", "autoMuteStatus", "Lcom/reddit/domain/model/streaming/AutoMuteStatus;", "comment", "Lcom/reddit/domain/model/LiveComment;", "(Lcom/reddit/domain/model/streaming/AutoMuteStatus;Lcom/reddit/domain/model/LiveComment;)V", "getAutoMuteStatus", "()Lcom/reddit/domain/model/streaming/AutoMuteStatus;", "getComment", "()Lcom/reddit/domain/model/LiveComment;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "temp_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class StreamCommentWithStatus
{
    private final AutoMuteStatus autoMuteStatus;
    private final LiveComment comment;
    
    public StreamCommentWithStatus(final AutoMuteStatus autoMuteStatus, final LiveComment comment) {
        e.f((Object)autoMuteStatus, "autoMuteStatus");
        e.f((Object)comment, "comment");
        this.autoMuteStatus = autoMuteStatus;
        this.comment = comment;
    }
    
    public static StreamCommentWithStatus copy$default(final StreamCommentWithStatus streamCommentWithStatus, AutoMuteStatus autoMuteStatus, LiveComment comment, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            autoMuteStatus = streamCommentWithStatus.autoMuteStatus;
        }
        if ((n & 0x2) != 0x0) {
            comment = streamCommentWithStatus.comment;
        }
        return streamCommentWithStatus.copy(autoMuteStatus, comment);
    }
    
    public final AutoMuteStatus component1() {
        return this.autoMuteStatus;
    }
    
    public final LiveComment component2() {
        return this.comment;
    }
    
    public final StreamCommentWithStatus copy(final AutoMuteStatus autoMuteStatus, final LiveComment liveComment) {
        e.f((Object)autoMuteStatus, "autoMuteStatus");
        e.f((Object)liveComment, "comment");
        return new StreamCommentWithStatus(autoMuteStatus, liveComment);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof StreamCommentWithStatus)) {
            return false;
        }
        final StreamCommentWithStatus streamCommentWithStatus = (StreamCommentWithStatus)o;
        return e.a((Object)this.autoMuteStatus, (Object)streamCommentWithStatus.autoMuteStatus) && e.a((Object)this.comment, (Object)streamCommentWithStatus.comment);
    }
    
    public final AutoMuteStatus getAutoMuteStatus() {
        return this.autoMuteStatus;
    }
    
    public final LiveComment getComment() {
        return this.comment;
    }
    
    @Override
    public int hashCode() {
        return this.comment.hashCode() + this.autoMuteStatus.hashCode() * 31;
    }
    
    @Override
    public String toString() {
        final StringBuilder t = a.t("StreamCommentWithStatus(autoMuteStatus=");
        t.append(this.autoMuteStatus);
        t.append(", comment=");
        t.append(this.comment);
        t.append(')');
        return t.toString();
    }
}
