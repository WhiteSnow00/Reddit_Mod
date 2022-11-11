// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.discovery;

import kotlin.jvm.internal.DefaultConstructorMarker;
import ah2.f;
import com.reddit.domain.model.paging.PageInfo;
import com.reddit.domain.model.Link;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = { "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J%\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016" }, d2 = { "Lcom/reddit/domain/model/discovery/RecommendedPostsListing;", "", "links", "", "Lcom/reddit/domain/model/Link;", "pageInfo", "Lcom/reddit/domain/model/paging/PageInfo;", "(Ljava/util/List;Lcom/reddit/domain/model/paging/PageInfo;)V", "getLinks", "()Ljava/util/List;", "getPageInfo", "()Lcom/reddit/domain/model/paging/PageInfo;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class RecommendedPostsListing
{
    private final List<Link> links;
    private final PageInfo pageInfo;
    
    public RecommendedPostsListing(final List<Link> links, final PageInfo pageInfo) {
        f.f((Object)links, "links");
        this.links = links;
        this.pageInfo = pageInfo;
    }
    
    public final List<Link> component1() {
        return this.links;
    }
    
    public final PageInfo component2() {
        return this.pageInfo;
    }
    
    public final RecommendedPostsListing copy(final List<Link> list, final PageInfo pageInfo) {
        f.f((Object)list, "links");
        return new RecommendedPostsListing(list, pageInfo);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RecommendedPostsListing)) {
            return false;
        }
        final RecommendedPostsListing recommendedPostsListing = (RecommendedPostsListing)o;
        return f.a((Object)this.links, (Object)recommendedPostsListing.links) && f.a((Object)this.pageInfo, (Object)recommendedPostsListing.pageInfo);
    }
    
    public final List<Link> getLinks() {
        return this.links;
    }
    
    public final PageInfo getPageInfo() {
        return this.pageInfo;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.links.hashCode();
        final PageInfo pageInfo = this.pageInfo;
        int hashCode2;
        if (pageInfo == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = pageInfo.hashCode();
        }
        return hashCode * 31 + hashCode2;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("RecommendedPostsListing(links=");
        k.append(this.links);
        k.append(", pageInfo=");
        k.append(this.pageInfo);
        k.append(')');
        return k.toString();
    }
}
