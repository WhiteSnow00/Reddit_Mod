// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.snoovatar.entity.storefront.layout;

import ak0.m;
import ah2.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.util.List;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002" }, d2 = { "Lcom/reddit/data/snoovatar/entity/storefront/layout/ListingsFilters;", "", "data_release" }, k = 1, mv = { 1, 7, 1 })
public final class ListingsFilters
{
    public final List<String> a;
    public final List<String> b;
    public final ListingsThemeFilter c;
    public final ListingsStatusFilter d;
    public final Integer e;
    public final Integer f;
    public final Integer g;
    public final Integer h;
    public final Integer i;
    public final Integer j;
    public final List<String> k;
    
    public ListingsFilters() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }
    
    public ListingsFilters(final List<String> a, final List<String> b, final ListingsThemeFilter c, final ListingsStatusFilter d, final Integer e, final Integer f, final Integer g, final Integer h, final Integer i, final Integer j, final List<String> k) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListingsFilters)) {
            return false;
        }
        final ListingsFilters listingsFilters = (ListingsFilters)o;
        return ah2.f.a((Object)this.a, (Object)listingsFilters.a) && ah2.f.a((Object)this.b, (Object)listingsFilters.b) && this.c == listingsFilters.c && this.d == listingsFilters.d && ah2.f.a((Object)this.e, (Object)listingsFilters.e) && ah2.f.a((Object)this.f, (Object)listingsFilters.f) && ah2.f.a((Object)this.g, (Object)listingsFilters.g) && ah2.f.a((Object)this.h, (Object)listingsFilters.h) && ah2.f.a((Object)this.i, (Object)listingsFilters.i) && ah2.f.a((Object)this.j, (Object)listingsFilters.j) && ah2.f.a((Object)this.k, (Object)listingsFilters.k);
    }
    
    @Override
    public final int hashCode() {
        final List<String> a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final List<String> b = this.b;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final ListingsThemeFilter c = this.c;
        int hashCode4;
        if (c == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = c.hashCode();
        }
        final ListingsStatusFilter d = this.d;
        int hashCode5;
        if (d == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = d.hashCode();
        }
        final Integer e = this.e;
        int hashCode6;
        if (e == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = e.hashCode();
        }
        final Integer f = this.f;
        int hashCode7;
        if (f == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = f.hashCode();
        }
        final Integer g = this.g;
        int hashCode8;
        if (g == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = g.hashCode();
        }
        final Integer h = this.h;
        int hashCode9;
        if (h == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = h.hashCode();
        }
        final Integer i = this.i;
        int hashCode10;
        if (i == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = i.hashCode();
        }
        final Integer j = this.j;
        int hashCode11;
        if (j == null) {
            hashCode11 = 0;
        }
        else {
            hashCode11 = j.hashCode();
        }
        final List<String> k = this.k;
        if (k != null) {
            hashCode = k.hashCode();
        }
        return (((((((((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode7) * 31 + hashCode8) * 31 + hashCode9) * 31 + hashCode10) * 31 + hashCode11) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("ListingsFilters(ids=");
        k.append(this.a);
        k.append(", artistIds=");
        k.append(this.b);
        k.append(", theme=");
        k.append(this.c);
        k.append(", status=");
        k.append(this.d);
        k.append(", priceLowerBound=");
        k.append(this.e);
        k.append(", priceUpperBound=");
        k.append(this.f);
        k.append(", totalInventoryLowerBound=");
        k.append(this.g);
        k.append(", totalInventoryUpperBound=");
        k.append(this.h);
        k.append(", percentInventoryRemainingLowerBound=");
        k.append(this.i);
        k.append(", percentInventoryRemainingUpperBound=");
        k.append(this.j);
        k.append(", tags=");
        return m.n(k, (List)this.k, ')');
    }
}
