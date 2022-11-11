// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import ag0.a;
import ah2.f;
import ak0.m;
import com.squareup.moshi.n;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015" }, d2 = { "Lcom/reddit/domain/model/DeleteCommentPayload;", "", "subredditKindWithId", "", "linkKindWithId", "commentKindWithId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCommentKindWithId", "()Ljava/lang/String;", "getLinkKindWithId", "getSubredditKindWithId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class DeleteCommentPayload
{
    private final String commentKindWithId;
    private final String linkKindWithId;
    private final String subredditKindWithId;
    
    public DeleteCommentPayload(@n(name = "subreddit_id") final String subredditKindWithId, @n(name = "link_id") final String linkKindWithId, @n(name = "name") final String commentKindWithId) {
        m.y(subredditKindWithId, "subredditKindWithId", linkKindWithId, "linkKindWithId", commentKindWithId, "commentKindWithId");
        this.subredditKindWithId = subredditKindWithId;
        this.linkKindWithId = linkKindWithId;
        this.commentKindWithId = commentKindWithId;
    }
    
    public final String component1() {
        return this.subredditKindWithId;
    }
    
    public final String component2() {
        return this.linkKindWithId;
    }
    
    public final String component3() {
        return this.commentKindWithId;
    }
    
    public final DeleteCommentPayload copy(@n(name = "subreddit_id") final String s, @n(name = "link_id") final String s2, @n(name = "name") final String s3) {
        f.f((Object)s, "subredditKindWithId");
        f.f((Object)s2, "linkKindWithId");
        f.f((Object)s3, "commentKindWithId");
        return new DeleteCommentPayload(s, s2, s3);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DeleteCommentPayload)) {
            return false;
        }
        final DeleteCommentPayload deleteCommentPayload = (DeleteCommentPayload)o;
        return f.a((Object)this.subredditKindWithId, (Object)deleteCommentPayload.subredditKindWithId) && f.a((Object)this.linkKindWithId, (Object)deleteCommentPayload.linkKindWithId) && f.a((Object)this.commentKindWithId, (Object)deleteCommentPayload.commentKindWithId);
    }
    
    public final String getCommentKindWithId() {
        return this.commentKindWithId;
    }
    
    public final String getLinkKindWithId() {
        return this.linkKindWithId;
    }
    
    public final String getSubredditKindWithId() {
        return this.subredditKindWithId;
    }
    
    @Override
    public int hashCode() {
        return this.commentKindWithId.hashCode() + a.f(this.linkKindWithId, this.subredditKindWithId.hashCode() * 31, 31);
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("DeleteCommentPayload(subredditKindWithId=");
        k.append(this.subredditKindWithId);
        k.append(", linkKindWithId=");
        k.append(this.linkKindWithId);
        k.append(", commentKindWithId=");
        return b.k(k, this.commentKindWithId, ')');
    }
}
