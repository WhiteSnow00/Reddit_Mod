// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.search;

import kotlin.jvm.internal.DefaultConstructorMarker;
import ah2.f;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J%\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0006H\u00d6\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015" }, d2 = { "Lcom/reddit/domain/model/search/RemoteSearchResultSet;", "", "items", "", "Lcom/reddit/domain/model/search/SearchResultItem;", "after", "", "(Ljava/util/List;Ljava/lang/String;)V", "getAfter", "()Ljava/lang/String;", "getItems", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class RemoteSearchResultSet
{
    private final String after;
    private final List<SearchResultItem> items;
    
    public RemoteSearchResultSet(final List<? extends SearchResultItem> items, final String after) {
        f.f((Object)items, "items");
        this.items = (List<SearchResultItem>)items;
        this.after = after;
    }
    
    public final List<SearchResultItem> component1() {
        return this.items;
    }
    
    public final String component2() {
        return this.after;
    }
    
    public final RemoteSearchResultSet copy(final List<? extends SearchResultItem> list, final String s) {
        f.f((Object)list, "items");
        return new RemoteSearchResultSet(list, s);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RemoteSearchResultSet)) {
            return false;
        }
        final RemoteSearchResultSet set = (RemoteSearchResultSet)o;
        return f.a((Object)this.items, (Object)set.items) && f.a((Object)this.after, (Object)set.after);
    }
    
    public final String getAfter() {
        return this.after;
    }
    
    public final List<SearchResultItem> getItems() {
        return this.items;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.items.hashCode();
        final String after = this.after;
        int hashCode2;
        if (after == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = after.hashCode();
        }
        return hashCode * 31 + hashCode2;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("RemoteSearchResultSet(items=");
        k.append(this.items);
        k.append(", after=");
        return b.k(k, this.after, ')');
    }
}
