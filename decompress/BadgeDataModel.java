// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.meta.model;

import a2.b;
import ag0.a;
import ah2.f;
import java.util.Map;
import java.util.List;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002" }, d2 = { "Lcom/reddit/data/meta/model/BadgeDataModel;", "", "data_release" }, k = 1, mv = { 1, 7, 1 })
public final class BadgeDataModel
{
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final List<Map<String, String>> e;
    public final String f;
    public final Map<String, ProductCollectionStubDataModel> g;
    public final Long h;
    public final String i;
    public final Long j;
    public final Long k;
    public final String l;
    public final String m;
    public final BadgeExtraDataModel n;
    
    public BadgeDataModel(final String a, final String b, final String c, final boolean d, final List<? extends Map<String, String>> e, final String f, final Map<String, ProductCollectionStubDataModel> g, final Long h, final String i, final Long j, final Long k, final String l, final String m, final BadgeExtraDataModel n) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = (List<Map<String, String>>)e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BadgeDataModel)) {
            return false;
        }
        final BadgeDataModel badgeDataModel = (BadgeDataModel)o;
        return ah2.f.a((Object)this.a, (Object)badgeDataModel.a) && ah2.f.a((Object)this.b, (Object)badgeDataModel.b) && ah2.f.a((Object)this.c, (Object)badgeDataModel.c) && this.d == badgeDataModel.d && ah2.f.a((Object)this.e, (Object)badgeDataModel.e) && ah2.f.a((Object)this.f, (Object)badgeDataModel.f) && ah2.f.a((Object)this.g, (Object)badgeDataModel.g) && ah2.f.a((Object)this.h, (Object)badgeDataModel.h) && ah2.f.a((Object)this.i, (Object)badgeDataModel.i) && ah2.f.a((Object)this.j, (Object)badgeDataModel.j) && ah2.f.a((Object)this.k, (Object)badgeDataModel.k) && ah2.f.a((Object)this.l, (Object)badgeDataModel.l) && ah2.f.a((Object)this.m, (Object)badgeDataModel.m) && ah2.f.a((Object)this.n, (Object)badgeDataModel.n);
    }
    
    @Override
    public final int hashCode() {
        final int f = ag0.a.f(this.c, ag0.a.f(this.b, this.a.hashCode() * 31, 31), 31);
        int d;
        if ((d = (this.d ? 1 : 0)) != 0) {
            d = 1;
        }
        final int a = a2.b.a((List)this.e, (f + d) * 31, 31);
        final String f2 = this.f;
        final int n = 0;
        int hashCode;
        if (f2 == null) {
            hashCode = 0;
        }
        else {
            hashCode = f2.hashCode();
        }
        final Map<String, ProductCollectionStubDataModel> g = this.g;
        int hashCode2;
        if (g == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = g.hashCode();
        }
        final Long h = this.h;
        int hashCode3;
        if (h == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = h.hashCode();
        }
        final String i = this.i;
        int hashCode4;
        if (i == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = i.hashCode();
        }
        final Long j = this.j;
        int hashCode5;
        if (j == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = j.hashCode();
        }
        final Long k = this.k;
        int hashCode6;
        if (k == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = k.hashCode();
        }
        final String l = this.l;
        int hashCode7;
        if (l == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = l.hashCode();
        }
        final int f3 = ag0.a.f(this.m, (((((((a + hashCode) * 31 + hashCode2) * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode7) * 31, 31);
        final BadgeExtraDataModel n2 = this.n;
        int hashCode8;
        if (n2 == null) {
            hashCode8 = n;
        }
        else {
            hashCode8 = n2.hashCode();
        }
        return f3 + hashCode8;
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("BadgeDataModel(id=");
        k.append(this.a);
        k.append(", title=");
        k.append(this.b);
        k.append(", subredditId=");
        k.append(this.c);
        k.append(", selected=");
        k.append(this.d);
        k.append(", media=");
        k.append(this.e);
        k.append(", userId=");
        k.append(this.f);
        k.append(", collections=");
        k.append(this.g);
        k.append(", receivedAt=");
        k.append(this.h);
        k.append(", description=");
        k.append(this.i);
        k.append(", endsAt=");
        k.append(this.j);
        k.append(", position=");
        k.append(this.k);
        k.append(", placement=");
        k.append(this.l);
        k.append(", type=");
        k.append(this.m);
        k.append(", extra=");
        k.append(this.n);
        k.append(')');
        return k.toString();
    }
}
