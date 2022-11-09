// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.search;

import ah2.f;
import com.reddit.domain.model.Link;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015" }, d2 = { "Lcom/reddit/domain/model/search/LinkSearchResultItem;", "Lcom/reddit/domain/model/search/SearchResultItem;", "relativeIndex", "", "link", "Lcom/reddit/domain/model/Link;", "(ILcom/reddit/domain/model/Link;)V", "getLink", "()Lcom/reddit/domain/model/Link;", "getRelativeIndex", "()I", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class LinkSearchResultItem extends SearchResultItem
{
    private final Link link;
    private final int relativeIndex;
    
    public LinkSearchResultItem(final int relativeIndex, final Link link) {
        f.f((Object)link, "link");
        this.relativeIndex = relativeIndex;
        this.link = link;
    }
    
    public final int component1() {
        return this.getRelativeIndex();
    }
    
    public final Link component2() {
        return this.link;
    }
    
    public final LinkSearchResultItem copy(final int n, final Link link) {
        f.f((Object)link, "link");
        return new LinkSearchResultItem(n, link);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LinkSearchResultItem)) {
            return false;
        }
        final LinkSearchResultItem linkSearchResultItem = (LinkSearchResultItem)o;
        return this.getRelativeIndex() == linkSearchResultItem.getRelativeIndex() && f.a((Object)this.link, (Object)linkSearchResultItem.link);
    }
    
    public final Link getLink() {
        return this.link;
    }
    
    @Override
    public int getRelativeIndex() {
        return this.relativeIndex;
    }
    
    @Override
    public int hashCode() {
        return this.link.hashCode() + Integer.hashCode(this.getRelativeIndex()) * 31;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("LinkSearchResultItem(relativeIndex=");
        k.append(this.getRelativeIndex());
        k.append(", link=");
        k.append(this.link);
        k.append(')');
        return k.toString();
    }
}
