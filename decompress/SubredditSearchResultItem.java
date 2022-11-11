// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.search;

import ah2.f;
import com.reddit.domain.model.Subreddit;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015" }, d2 = { "Lcom/reddit/domain/model/search/SubredditSearchResultItem;", "Lcom/reddit/domain/model/search/SearchResultItem;", "relativeIndex", "", "subreddit", "Lcom/reddit/domain/model/Subreddit;", "(ILcom/reddit/domain/model/Subreddit;)V", "getRelativeIndex", "()I", "getSubreddit", "()Lcom/reddit/domain/model/Subreddit;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class SubredditSearchResultItem extends SearchResultItem
{
    private final int relativeIndex;
    private final Subreddit subreddit;
    
    public SubredditSearchResultItem(final int relativeIndex, final Subreddit subreddit) {
        f.f((Object)subreddit, "subreddit");
        this.relativeIndex = relativeIndex;
        this.subreddit = subreddit;
    }
    
    public final int component1() {
        return this.getRelativeIndex();
    }
    
    public final Subreddit component2() {
        return this.subreddit;
    }
    
    public final SubredditSearchResultItem copy(final int n, final Subreddit subreddit) {
        f.f((Object)subreddit, "subreddit");
        return new SubredditSearchResultItem(n, subreddit);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SubredditSearchResultItem)) {
            return false;
        }
        final SubredditSearchResultItem subredditSearchResultItem = (SubredditSearchResultItem)o;
        return this.getRelativeIndex() == subredditSearchResultItem.getRelativeIndex() && f.a((Object)this.subreddit, (Object)subredditSearchResultItem.subreddit);
    }
    
    @Override
    public int getRelativeIndex() {
        return this.relativeIndex;
    }
    
    public final Subreddit getSubreddit() {
        return this.subreddit;
    }
    
    @Override
    public int hashCode() {
        return this.subreddit.hashCode() + Integer.hashCode(this.getRelativeIndex()) * 31;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("SubredditSearchResultItem(relativeIndex=");
        k.append(this.getRelativeIndex());
        k.append(", subreddit=");
        k.append(this.subreddit);
        k.append(')');
        return k.toString();
    }
}
