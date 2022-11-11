// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.search;

import a2.b;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ah2.f;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = { "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001cB'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J/\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d" }, d2 = { "Lcom/reddit/domain/model/search/SearchResult;", "", "query", "", "items", "", "Lcom/reddit/domain/model/search/SearchResultItem;", "after", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getAfter", "()Ljava/lang/String;", "getItems", "()Ljava/util/List;", "getQuery", "type", "Lcom/reddit/domain/model/search/SearchResult$SearchResultType;", "getType", "()Lcom/reddit/domain/model/search/SearchResult$SearchResultType;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "SearchResultType", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class SearchResult
{
    private final String after;
    private final List<SearchResultItem> items;
    private final String query;
    
    public SearchResult(final String query, final List<? extends SearchResultItem> items, final String after) {
        f.f((Object)query, "query");
        f.f((Object)items, "items");
        this.query = query;
        this.items = (List<SearchResultItem>)items;
        this.after = after;
    }
    
    public final String component1() {
        return this.query;
    }
    
    public final List<SearchResultItem> component2() {
        return this.items;
    }
    
    public final String component3() {
        return this.after;
    }
    
    public final SearchResult copy(final String s, final List<? extends SearchResultItem> list, final String s2) {
        f.f((Object)s, "query");
        f.f((Object)list, "items");
        return new SearchResult(s, list, s2);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SearchResult)) {
            return false;
        }
        final SearchResult searchResult = (SearchResult)o;
        return f.a((Object)this.query, (Object)searchResult.query) && f.a((Object)this.items, (Object)searchResult.items) && f.a((Object)this.after, (Object)searchResult.after);
    }
    
    public final String getAfter() {
        return this.after;
    }
    
    public final List<SearchResultItem> getItems() {
        return this.items;
    }
    
    public final String getQuery() {
        return this.query;
    }
    
    public final SearchResultType getType() {
        final SearchResultItem searchResultItem = (SearchResultItem)CollectionsKt___CollectionsKt.s1((List)this.items);
        SearchResultType searchResultType;
        if (searchResultItem instanceof SubredditSearchResultItem || searchResultItem instanceof AccountSearchResultItem) {
            searchResultType = SearchResultType.COMMUNITY;
        }
        else if (searchResultItem instanceof LinkSearchResultItem) {
            searchResultType = SearchResultType.LINKS;
        }
        else {
            searchResultType = SearchResultType.UNKNOWN;
        }
        return searchResultType;
    }
    
    @Override
    public int hashCode() {
        final int a = b.a((List)this.items, this.query.hashCode() * 31, 31);
        final String after = this.after;
        int hashCode;
        if (after == null) {
            hashCode = 0;
        }
        else {
            hashCode = after.hashCode();
        }
        return a + hashCode;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("SearchResult(query=");
        k.append(this.query);
        k.append(", items=");
        k.append(this.items);
        k.append(", after=");
        return b.k(k, this.after, ')');
    }
    
    @Metadata(d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006" }, d2 = { "Lcom/reddit/domain/model/search/SearchResult$SearchResultType;", "", "(Ljava/lang/String;I)V", "COMMUNITY", "LINKS", "UNKNOWN", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public enum SearchResultType
    {
        COMMUNITY, 
        LINKS, 
        UNKNOWN;
    }
}
