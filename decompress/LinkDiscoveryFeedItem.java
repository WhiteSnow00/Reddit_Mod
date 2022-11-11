// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.discover.model;

import androidx.appcompat.widget.s0;
import ah2.f;
import com.reddit.domain.model.DiscoverTopic;
import com.reddit.domain.model.Link;
import kotlin.Metadata;
import com.squareup.moshi.o;
import nb0.c;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003" }, d2 = { "Lcom/reddit/domain/discover/model/LinkDiscoveryFeedItem;", "Lnb0/c;", "Type", "public_release" }, k = 1, mv = { 1, 7, 1 })
public final class LinkDiscoveryFeedItem extends c
{
    public final String a;
    public final Integer b;
    public final Integer c;
    public final Link d;
    public final LinkDiscoveryFeedItem.LinkDiscoveryFeedItem$Type e;
    public final DiscoverTopic f;
    public final boolean g;
    
    public LinkDiscoveryFeedItem(final String a, final Integer b, final Integer c, final Link d, final LinkDiscoveryFeedItem.LinkDiscoveryFeedItem$Type e, final DiscoverTopic f, final boolean g) {
        ah2.f.f((Object)a, "id");
        super(0);
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    public static LinkDiscoveryFeedItem b(final LinkDiscoveryFeedItem linkDiscoveryFeedItem) {
        final String a = linkDiscoveryFeedItem.a;
        final Integer b = linkDiscoveryFeedItem.b;
        final Integer c = linkDiscoveryFeedItem.c;
        final Link d = linkDiscoveryFeedItem.d;
        final LinkDiscoveryFeedItem.LinkDiscoveryFeedItem$Type e = linkDiscoveryFeedItem.e;
        final DiscoverTopic f = linkDiscoveryFeedItem.f;
        linkDiscoveryFeedItem.getClass();
        ah2.f.f((Object)a, "id");
        ah2.f.f((Object)d, "link");
        ah2.f.f((Object)e, "type");
        ah2.f.f((Object)f, "topic");
        return new LinkDiscoveryFeedItem(a, b, c, d, e, f, true);
    }
    
    public final String a() {
        return this.a;
    }
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LinkDiscoveryFeedItem)) {
            return false;
        }
        final LinkDiscoveryFeedItem linkDiscoveryFeedItem = (LinkDiscoveryFeedItem)o;
        return ah2.f.a((Object)this.a, (Object)linkDiscoveryFeedItem.a) && ah2.f.a((Object)this.b, (Object)linkDiscoveryFeedItem.b) && ah2.f.a((Object)this.c, (Object)linkDiscoveryFeedItem.c) && ah2.f.a((Object)this.d, (Object)linkDiscoveryFeedItem.d) && this.e == linkDiscoveryFeedItem.e && ah2.f.a((Object)this.f, (Object)linkDiscoveryFeedItem.f) && this.g == linkDiscoveryFeedItem.g;
    }
    
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final Integer b = this.b;
        int hashCode2 = 0;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final Integer c = this.c;
        if (c != null) {
            hashCode2 = c.hashCode();
        }
        final int hashCode4 = this.d.hashCode();
        final int hashCode5 = this.e.hashCode();
        final int hashCode6 = this.f.hashCode();
        int g;
        if ((g = (this.g ? 1 : 0)) != 0) {
            g = 1;
        }
        return (hashCode6 + (hashCode5 + (hashCode4 + ((hashCode * 31 + hashCode3) * 31 + hashCode2) * 31) * 31) * 31) * 31 + g;
    }
    
    public final String toString() {
        final StringBuilder k = a.k("LinkDiscoveryFeedItem(id=");
        k.append(this.a);
        k.append(", width=");
        k.append(this.b);
        k.append(", height=");
        k.append(this.c);
        k.append(", link=");
        k.append(this.d);
        k.append(", type=");
        k.append(this.e);
        k.append(", topic=");
        k.append(this.f);
        k.append(", isObfuscated=");
        return s0.o(k, this.g, ')');
    }
}
