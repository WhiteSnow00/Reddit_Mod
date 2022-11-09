// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.meta.model;

import ag0.a;
import ah2.f;
import java.util.Map;
import java.util.List;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002" }, d2 = { "Lcom/reddit/data/meta/model/MetaProductDataModel;", "", "data_release" }, k = 1, mv = { 1, 7, 1 })
public final class MetaProductDataModel
{
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final Long f;
    public final Long g;
    public final String h;
    public final List<Map<String, String>> i;
    public final String j;
    public final MetaProductExtrasDataModel k;
    public final Integer l;
    public final Map<String, ProductCollectionStubDataModel> m;
    
    public MetaProductDataModel(final String a, final String b, final String c, final String d, final String e, final Long f, final Long g, final String h, final List<? extends Map<String, String>> i, final String j, final MetaProductExtrasDataModel k, final Integer l, final Map<String, ProductCollectionStubDataModel> m) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = (List<Map<String, String>>)i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MetaProductDataModel)) {
            return false;
        }
        final MetaProductDataModel metaProductDataModel = (MetaProductDataModel)o;
        return ah2.f.a((Object)this.a, (Object)metaProductDataModel.a) && ah2.f.a((Object)this.b, (Object)metaProductDataModel.b) && ah2.f.a((Object)this.c, (Object)metaProductDataModel.c) && ah2.f.a((Object)this.d, (Object)metaProductDataModel.d) && ah2.f.a((Object)this.e, (Object)metaProductDataModel.e) && ah2.f.a((Object)this.f, (Object)metaProductDataModel.f) && ah2.f.a((Object)this.g, (Object)metaProductDataModel.g) && ah2.f.a((Object)this.h, (Object)metaProductDataModel.h) && ah2.f.a((Object)this.i, (Object)metaProductDataModel.i) && ah2.f.a((Object)this.j, (Object)metaProductDataModel.j) && ah2.f.a((Object)this.k, (Object)metaProductDataModel.k) && ah2.f.a((Object)this.l, (Object)metaProductDataModel.l) && ah2.f.a((Object)this.m, (Object)metaProductDataModel.m);
    }
    
    @Override
    public final int hashCode() {
        final int f = ag0.a.f(this.d, ag0.a.f(this.c, ag0.a.f(this.b, this.a.hashCode() * 31, 31), 31), 31);
        final String e = this.e;
        int hashCode = 0;
        int hashCode2;
        if (e == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = e.hashCode();
        }
        final Long f2 = this.f;
        int hashCode3;
        if (f2 == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = f2.hashCode();
        }
        final Long g = this.g;
        int hashCode4;
        if (g == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = g.hashCode();
        }
        final String h = this.h;
        int hashCode5;
        if (h == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = h.hashCode();
        }
        final List<Map<String, String>> i = this.i;
        int hashCode6;
        if (i == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = i.hashCode();
        }
        final String j = this.j;
        int hashCode7;
        if (j == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = j.hashCode();
        }
        final MetaProductExtrasDataModel k = this.k;
        int hashCode8;
        if (k == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = k.hashCode();
        }
        final Integer l = this.l;
        int hashCode9;
        if (l == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = l.hashCode();
        }
        final Map<String, ProductCollectionStubDataModel> m = this.m;
        if (m != null) {
            hashCode = m.hashCode();
        }
        return ((((((((f + hashCode2) * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode7) * 31 + hashCode8) * 31 + hashCode9) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("MetaProductDataModel(id=");
        k.append(this.a);
        k.append(", title=");
        k.append(this.b);
        k.append(", subredditId=");
        k.append(this.c);
        k.append(", type=");
        k.append(this.d);
        k.append(", currency=");
        k.append(this.e);
        k.append(", publishAt=");
        k.append(this.f);
        k.append(", endsAt=");
        k.append(this.g);
        k.append(", description=");
        k.append(this.h);
        k.append(", media=");
        k.append(this.i);
        k.append(", placement=");
        k.append(this.j);
        k.append(", extra=");
        k.append(this.k);
        k.append(", position=");
        k.append(this.l);
        k.append(", collections=");
        return a40.f.p(k, (Map)this.m, ')');
    }
}
