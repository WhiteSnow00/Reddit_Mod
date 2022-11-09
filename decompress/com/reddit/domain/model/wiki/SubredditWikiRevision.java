// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.wiki;

import ah2.f;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014" }, d2 = { "Lcom/reddit/domain/model/wiki/SubredditWikiRevision;", "", "authorInfo", "Lcom/reddit/domain/model/wiki/SubredditWikiRevisionAuthorInfoWrapper;", "revisedAt", "", "(Lcom/reddit/domain/model/wiki/SubredditWikiRevisionAuthorInfoWrapper;Ljava/lang/String;)V", "getAuthorInfo", "()Lcom/reddit/domain/model/wiki/SubredditWikiRevisionAuthorInfoWrapper;", "getRevisedAt", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class SubredditWikiRevision
{
    private final SubredditWikiRevisionAuthorInfoWrapper authorInfo;
    private final String revisedAt;
    
    public SubredditWikiRevision(final SubredditWikiRevisionAuthorInfoWrapper authorInfo, final String revisedAt) {
        f.f((Object)authorInfo, "authorInfo");
        this.authorInfo = authorInfo;
        this.revisedAt = revisedAt;
    }
    
    public final SubredditWikiRevisionAuthorInfoWrapper component1() {
        return this.authorInfo;
    }
    
    public final String component2() {
        return this.revisedAt;
    }
    
    public final SubredditWikiRevision copy(final SubredditWikiRevisionAuthorInfoWrapper subredditWikiRevisionAuthorInfoWrapper, final String s) {
        f.f((Object)subredditWikiRevisionAuthorInfoWrapper, "authorInfo");
        return new SubredditWikiRevision(subredditWikiRevisionAuthorInfoWrapper, s);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SubredditWikiRevision)) {
            return false;
        }
        final SubredditWikiRevision subredditWikiRevision = (SubredditWikiRevision)o;
        return f.a((Object)this.authorInfo, (Object)subredditWikiRevision.authorInfo) && f.a((Object)this.revisedAt, (Object)subredditWikiRevision.revisedAt);
    }
    
    public final SubredditWikiRevisionAuthorInfoWrapper getAuthorInfo() {
        return this.authorInfo;
    }
    
    public final String getRevisedAt() {
        return this.revisedAt;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.authorInfo.hashCode();
        final String revisedAt = this.revisedAt;
        int hashCode2;
        if (revisedAt == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = revisedAt.hashCode();
        }
        return hashCode * 31 + hashCode2;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("SubredditWikiRevision(authorInfo=");
        k.append(this.authorInfo);
        k.append(", revisedAt=");
        return b.k(k, this.revisedAt, ')');
    }
}
