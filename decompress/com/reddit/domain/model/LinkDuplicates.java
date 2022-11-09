// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import ah2.f;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0006R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b" }, d2 = { "Lcom/reddit/domain/model/LinkDuplicates;", "", "link", "Lcom/reddit/domain/model/Link;", "duplicates", "", "(Lcom/reddit/domain/model/Link;Ljava/util/List;)V", "getDuplicates", "()Ljava/util/List;", "getLink", "()Lcom/reddit/domain/model/Link;", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class LinkDuplicates
{
    private final List<Link> duplicates;
    private final Link link;
    
    public LinkDuplicates(final Link link, final List<Link> duplicates) {
        f.f((Object)link, "link");
        f.f((Object)duplicates, "duplicates");
        this.link = link;
        this.duplicates = duplicates;
    }
    
    public final List<Link> getDuplicates() {
        return this.duplicates;
    }
    
    public final Link getLink() {
        return this.link;
    }
}
