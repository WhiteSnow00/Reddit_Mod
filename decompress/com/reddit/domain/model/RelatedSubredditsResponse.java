// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import sg2.e;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\f\u001a\u00020\rH\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010" }, d2 = { "Lcom/reddit/domain/model/RelatedSubredditsResponse;", "", "subreddit", "Lcom/reddit/domain/model/RelatedSubreddit;", "(Lcom/reddit/domain/model/RelatedSubreddit;)V", "getSubreddit", "()Lcom/reddit/domain/model/RelatedSubreddit;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class RelatedSubredditsResponse
{
    private final RelatedSubreddit subreddit;
    
    public RelatedSubredditsResponse(final RelatedSubreddit subreddit) {
        this.subreddit = subreddit;
    }
    
    public final RelatedSubreddit component1() {
        return this.subreddit;
    }
    
    public final RelatedSubredditsResponse copy(final RelatedSubreddit relatedSubreddit) {
        return new RelatedSubredditsResponse(relatedSubreddit);
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof RelatedSubredditsResponse && e.a((Object)this.subreddit, (Object)((RelatedSubredditsResponse)o).subreddit));
    }
    
    public final RelatedSubreddit getSubreddit() {
        return this.subreddit;
    }
    
    @Override
    public int hashCode() {
        final RelatedSubreddit subreddit = this.subreddit;
        int hashCode;
        if (subreddit == null) {
            hashCode = 0;
        }
        else {
            hashCode = subreddit.hashCode();
        }
        return hashCode;
    }
    
    @Override
    public String toString() {
        final StringBuilder r = a.r("RelatedSubredditsResponse(subreddit=");
        r.append(this.subreddit);
        r.append(')');
        return r.toString();
    }
}
