// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import androidx.appcompat.widget.s0;
import ah2.f;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\bH\u00c6\u0003J/\u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0006H\u00d6\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019" }, d2 = { "Lcom/reddit/domain/model/PaginatedListing;", "", "items", "", "Lcom/reddit/domain/model/SubredditListItem;", "endCursor", "", "hasNextPage", "", "(Ljava/util/List;Ljava/lang/String;Z)V", "getEndCursor", "()Ljava/lang/String;", "getHasNextPage", "()Z", "getItems", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class PaginatedListing
{
    private final String endCursor;
    private final boolean hasNextPage;
    private final List<SubredditListItem> items;
    
    public PaginatedListing(final List<SubredditListItem> items, final String endCursor, final boolean hasNextPage) {
        f.f((Object)items, "items");
        this.items = items;
        this.endCursor = endCursor;
        this.hasNextPage = hasNextPage;
    }
    
    public final List<SubredditListItem> component1() {
        return this.items;
    }
    
    public final String component2() {
        return this.endCursor;
    }
    
    public final boolean component3() {
        return this.hasNextPage;
    }
    
    public final PaginatedListing copy(final List<SubredditListItem> list, final String s, final boolean b) {
        f.f((Object)list, "items");
        return new PaginatedListing(list, s, b);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PaginatedListing)) {
            return false;
        }
        final PaginatedListing paginatedListing = (PaginatedListing)o;
        return f.a((Object)this.items, (Object)paginatedListing.items) && f.a((Object)this.endCursor, (Object)paginatedListing.endCursor) && this.hasNextPage == paginatedListing.hasNextPage;
    }
    
    public final String getEndCursor() {
        return this.endCursor;
    }
    
    public final boolean getHasNextPage() {
        return this.hasNextPage;
    }
    
    public final List<SubredditListItem> getItems() {
        return this.items;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.items.hashCode();
        final String endCursor = this.endCursor;
        int hashCode2;
        if (endCursor == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = endCursor.hashCode();
        }
        int hasNextPage;
        if ((hasNextPage = (this.hasNextPage ? 1 : 0)) != 0) {
            hasNextPage = 1;
        }
        return (hashCode * 31 + hashCode2) * 31 + hasNextPage;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("PaginatedListing(items=");
        k.append(this.items);
        k.append(", endCursor=");
        k.append(this.endCursor);
        k.append(", hasNextPage=");
        return s0.o(k, this.hasNextPage, ')');
    }
}
