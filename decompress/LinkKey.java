// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.local;

import al0.f0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import sg2.e;
import com.reddit.listing.model.sort.SortTimeFrame;
import com.reddit.listing.model.sort.SortType;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002" }, d2 = { "Lcom/reddit/data/local/LinkKey;", "", "temp_release" }, k = 1, mv = { 1, 7, 1 })
public final class LinkKey
{
    public final LinkKeyType a;
    public final SortType b;
    public final SortTimeFrame c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    
    public LinkKey(final LinkKeyType a, final SortType b, final SortTimeFrame c, final String d, final String e, final String f, final String g, final String h) {
        sg2.e.f((Object)a, "type");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LinkKey)) {
            return false;
        }
        final LinkKey linkKey = (LinkKey)o;
        return this.a == linkKey.a && this.b == linkKey.b && this.c == linkKey.c && sg2.e.a((Object)this.d, (Object)linkKey.d) && sg2.e.a((Object)this.e, (Object)linkKey.e) && sg2.e.a((Object)this.f, (Object)linkKey.f) && sg2.e.a((Object)this.g, (Object)linkKey.g) && sg2.e.a((Object)this.h, (Object)linkKey.h);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final SortType b = this.b;
        int hashCode2 = 0;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final SortTimeFrame c = this.c;
        int hashCode4;
        if (c == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = c.hashCode();
        }
        final String d = this.d;
        int hashCode5;
        if (d == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = d.hashCode();
        }
        final String e = this.e;
        int hashCode6;
        if (e == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = e.hashCode();
        }
        final String f = this.f;
        int hashCode7;
        if (f == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = f.hashCode();
        }
        final String g = this.g;
        int hashCode8;
        if (g == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = g.hashCode();
        }
        final String h = this.h;
        if (h != null) {
            hashCode2 = h.hashCode();
        }
        return ((((((hashCode * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode7) * 31 + hashCode8) * 31 + hashCode2;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("LinkKey(type=");
        r.append(this.a);
        r.append(", sort=");
        r.append(this.b);
        r.append(", sortTimeFrame=");
        r.append(this.c);
        r.append(", after=");
        r.append(this.d);
        r.append(", subredditName=");
        r.append(this.e);
        r.append(", multiredditPath=");
        r.append(this.f);
        r.append(", geoFilter=");
        r.append(this.g);
        r.append(", categoryId=");
        return f0.n(r, this.h, ')');
    }
}
