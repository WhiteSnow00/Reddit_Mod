// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.snoovatar.entity.storefront.layout;

import p1.h;
import ng2.e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.util.List;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002" }, d2 = { "Lcom/reddit/data/snoovatar/entity/storefront/layout/JsonListingsFilters;", "", "impl_release" }, k = 1, mv = { 1, 7, 1 })
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
    
    public JsonListingsFilters(List list, List list2, JsonListingsThemeFilter jsonListingsThemeFilter, JsonListingsStatusFilter jsonListingsStatusFilter, Integer n, Integer n2, Integer n3, Integer n4, Integer n5, Integer n6, List list3, final int n7, final DefaultConstructorMarker defaultConstructorMarker) {
        final List list4 = null;
        if ((n7 & 0x1) != 0x0) {
            list = null;
        }
        if ((n7 & 0x2) != 0x0) {
            list2 = null;
        }
        if ((n7 & 0x4) != 0x0) {
            jsonListingsThemeFilter = null;
        }
        if ((n7 & 0x8) != 0x0) {
            jsonListingsStatusFilter = null;
        }
        if ((n7 & 0x10) != 0x0) {
            n = null;
        }
        if ((n7 & 0x20) != 0x0) {
            n2 = null;
        }
        if ((n7 & 0x40) != 0x0) {
            n3 = null;
        }
        if ((n7 & 0x80) != 0x0) {
            n4 = null;
        }
        if ((n7 & 0x100) != 0x0) {
            n5 = null;
        }
        if ((n7 & 0x200) != 0x0) {
            n6 = null;
        }
        if ((n7 & 0x400) != 0x0) {
            list3 = list4;
        }
        this(list, list2, jsonListingsThemeFilter, jsonListingsStatusFilter, n, n2, n3, n4, n5, n6, list3);
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
        return ng2.e.a((Object)this.a, (Object)jsonListingsFilters.a) && ng2.e.a((Object)this.b, (Object)jsonListingsFilters.b) && this.c == jsonListingsFilters.c && this.d == jsonListingsFilters.d && ng2.e.a((Object)this.e, (Object)jsonListingsFilters.e) && ng2.e.a((Object)this.f, (Object)jsonListingsFilters.f) && ng2.e.a((Object)this.g, (Object)jsonListingsFilters.g) && ng2.e.a((Object)this.h, (Object)jsonListingsFilters.h) && ng2.e.a((Object)this.i, (Object)jsonListingsFilters.i) && ng2.e.a((Object)this.j, (Object)jsonListingsFilters.j) && ng2.e.a((Object)this.k, (Object)jsonListingsFilters.k);
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
        final StringBuilder t = a.t("JsonListingsFilters(ids=");
        t.append(this.a);
        t.append(", artistIds=");
        t.append(this.b);
        t.append(", theme=");
        t.append(this.c);
        t.append(", status=");
        t.append(this.d);
        t.append(", priceLowerBound=");
        t.append(this.e);
        t.append(", priceUpperBound=");
        t.append(this.f);
        t.append(", totalInventoryLowerBound=");
        t.append(this.g);
        t.append(", totalInventoryUpperBound=");
        t.append(this.h);
        t.append(", percentInventoryRemainingLowerBound=");
        t.append(this.i);
        t.append(", percentInventoryRemainingUpperBound=");
        t.append(this.j);
        t.append(", tags=");
        return p1.h.d(t, (List)this.k, ')');
    }
}
