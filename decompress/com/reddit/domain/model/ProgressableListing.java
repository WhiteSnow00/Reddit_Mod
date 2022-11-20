// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import ng2.e;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = { "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0006H\u00c6\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016" }, d2 = { "Lcom/reddit/domain/model/ProgressableListing;", "", "items", "", "Lcom/reddit/domain/model/SubredditListItem;", "progress", "Lcom/reddit/domain/model/SubredditListingProgressIndicator;", "(Ljava/util/List;Lcom/reddit/domain/model/SubredditListingProgressIndicator;)V", "getItems", "()Ljava/util/List;", "getProgress", "()Lcom/reddit/domain/model/SubredditListingProgressIndicator;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class ProgressableListing
{
    private final List<SubredditListItem> items;
    private final SubredditListingProgressIndicator progress;
    
    public ProgressableListing(final List<SubredditListItem> items, final SubredditListingProgressIndicator progress) {
        e.f((Object)items, "items");
        e.f((Object)progress, "progress");
        this.items = items;
        this.progress = progress;
    }
    
    public static ProgressableListing copy$default(final ProgressableListing progressableListing, List items, SubredditListingProgressIndicator progress, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            items = progressableListing.items;
        }
        if ((n & 0x2) != 0x0) {
            progress = progressableListing.progress;
        }
        return progressableListing.copy(items, progress);
    }
    
    public final List<SubredditListItem> component1() {
        return this.items;
    }
    
    public final SubredditListingProgressIndicator component2() {
        return this.progress;
    }
    
    public final ProgressableListing copy(final List<SubredditListItem> list, final SubredditListingProgressIndicator subredditListingProgressIndicator) {
        e.f((Object)list, "items");
        e.f((Object)subredditListingProgressIndicator, "progress");
        return new ProgressableListing(list, subredditListingProgressIndicator);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ProgressableListing)) {
            return false;
        }
        final ProgressableListing progressableListing = (ProgressableListing)o;
        return e.a((Object)this.items, (Object)progressableListing.items) && this.progress == progressableListing.progress;
    }
    
    public final List<SubredditListItem> getItems() {
        return this.items;
    }
    
    public final SubredditListingProgressIndicator getProgress() {
        return this.progress;
    }
    
    @Override
    public int hashCode() {
        return this.progress.hashCode() + this.items.hashCode() * 31;
    }
    
    @Override
    public String toString() {
        final StringBuilder t = a.t("ProgressableListing(items=");
        t.append(this.items);
        t.append(", progress=");
        t.append(this.progress);
        t.append(')');
        return t.toString();
    }
}
