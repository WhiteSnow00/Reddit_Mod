// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.tagging;

import ah2.f;
import com.reddit.domain.model.Subreddit;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014" }, d2 = { "Lcom/reddit/domain/model/tagging/SubredditWithNCPCardsCount;", "", "subreddit", "Lcom/reddit/domain/model/Subreddit;", "ncpCardsCount", "", "(Lcom/reddit/domain/model/Subreddit;I)V", "getNcpCardsCount", "()I", "getSubreddit", "()Lcom/reddit/domain/model/Subreddit;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class SubredditWithNCPCardsCount
{
    private final int ncpCardsCount;
    private final Subreddit subreddit;
    
    public SubredditWithNCPCardsCount(final Subreddit subreddit, final int ncpCardsCount) {
        f.f((Object)subreddit, "subreddit");
        this.subreddit = subreddit;
        this.ncpCardsCount = ncpCardsCount;
    }
    
    public final Subreddit component1() {
        return this.subreddit;
    }
    
    public final int component2() {
        return this.ncpCardsCount;
    }
    
    public final SubredditWithNCPCardsCount copy(final Subreddit subreddit, final int n) {
        f.f((Object)subreddit, "subreddit");
        return new SubredditWithNCPCardsCount(subreddit, n);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SubredditWithNCPCardsCount)) {
            return false;
        }
        final SubredditWithNCPCardsCount subredditWithNCPCardsCount = (SubredditWithNCPCardsCount)o;
        return f.a((Object)this.subreddit, (Object)subredditWithNCPCardsCount.subreddit) && this.ncpCardsCount == subredditWithNCPCardsCount.ncpCardsCount;
    }
    
    public final int getNcpCardsCount() {
        return this.ncpCardsCount;
    }
    
    public final Subreddit getSubreddit() {
        return this.subreddit;
    }
    
    @Override
    public int hashCode() {
        return Integer.hashCode(this.ncpCardsCount) + this.subreddit.hashCode() * 31;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("SubredditWithNCPCardsCount(subreddit=");
        k.append(this.subreddit);
        k.append(", ncpCardsCount=");
        return d.k(k, this.ncpCardsCount, ')');
    }
}
