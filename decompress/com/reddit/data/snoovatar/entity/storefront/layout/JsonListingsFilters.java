// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.snoovatar.entity.storefront.layout;

import sg2.e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.util.List;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002" }, d2 = { "Lcom/reddit/data/snoovatar/entity/storefront/layout/JsonListingsFilters;", "", "data_release" }, k = 1, mv = { 1, 7, 1 })
public final class JsonListingsFilters
{
    public final List<String> a;
    public final List<String> b;
    public final JsonListingsThemeFilter c;
    public final JsonListingsStatusFilter d;
    public final Integer e;
    public final Integer f;
    public final Integer g;
    public final Integer h;
    public final Integer i;
    public final Integer j;
    public final List<String> k;
    
    public JsonListingsFilters() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }
    
    public JsonListingsFilters(final List<String> a, final List<String> b, final JsonListingsThemeFilter c, final JsonListingsStatusFilter d, final Integer e, final Integer f, final Integer g, final Integer h, final Integer i, final Integer j, final List<String> k) {
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
        if (!(o instanceof JsonListingsFilters)) {
            return false;
        }
        final JsonListingsFilters jsonListingsFilters = (JsonListingsFilters)o;
        return sg2.e.a((Object)this.a, (Object)jsonListingsFilters.a) && sg2.e.a((Object)this.b, (Object)jsonListingsFilters.b) && this.c == jsonListingsFilters.c && this.d == jsonListingsFilters.d && sg2.e.a((Object)this.e, (Object)jsonListingsFilters.e) && sg2.e.a((Object)this.f, (Object)jsonListingsFilters.f) && sg2.e.a((Object)this.g, (Object)jsonListingsFilters.g) && sg2.e.a((Object)this.h, (Object)jsonListingsFilters.h) && sg2.e.a((Object)this.i, (Object)jsonListingsFilters.i) && sg2.e.a((Object)this.j, (Object)jsonListingsFilters.j) && sg2.e.a((Object)this.k, (Object)jsonListingsFilters.k);
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
        final JsonListingsThemeFilter c = this.c;
        int hashCode4;
        if (c == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = c.hashCode();
        }
        final JsonListingsStatusFilter d = this.d;
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
        final StringBuilder r = a.r("JsonListingsFilters(ids=");
        r.append(this.a);
        r.append(", artistIds=");
        r.append(this.b);
        r.append(", theme=");
        r.append(this.c);
        r.append(", status=");
        r.append(this.d);
        r.append(", priceLowerBound=");
        r.append(this.e);
        r.append(", priceUpperBound=");
        r.append(this.f);
        r.append(", totalInventoryLowerBound=");
        r.append(this.g);
        r.append(", totalInventoryUpperBound=");
        r.append(this.h);
        r.append(", percentInventoryRemainingLowerBound=");
        r.append(this.i);
        r.append(", percentInventoryRemainingUpperBound=");
        r.append(this.j);
        r.append(", tags=");
        return d.o(r, (List)this.k, ')');
    }
}
