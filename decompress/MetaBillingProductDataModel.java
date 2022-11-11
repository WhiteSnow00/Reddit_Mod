// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.meta.model;

import ag0.a;
import ah2.f;
import java.math.BigInteger;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002" }, d2 = { "Lcom/reddit/data/meta/model/MetaBillingProductDataModel;", "", "data_release" }, k = 1, mv = { 1, 7, 1 })
public final class MetaBillingProductDataModel
{
    public final String a;
    public final String b;
    public final String c;
    public final MetaBillingProductExtra d;
    public final BigInteger e;
    public final String f;
    
    public MetaBillingProductDataModel(final String a, final String b, final String c, final MetaBillingProductExtra d, final BigInteger e, final String f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MetaBillingProductDataModel)) {
            return false;
        }
        final MetaBillingProductDataModel metaBillingProductDataModel = (MetaBillingProductDataModel)o;
        return ah2.f.a((Object)this.a, (Object)metaBillingProductDataModel.a) && ah2.f.a((Object)this.b, (Object)metaBillingProductDataModel.b) && ah2.f.a((Object)this.c, (Object)metaBillingProductDataModel.c) && ah2.f.a((Object)this.d, (Object)metaBillingProductDataModel.d) && ah2.f.a((Object)this.e, (Object)metaBillingProductDataModel.e) && ah2.f.a((Object)this.f, (Object)metaBillingProductDataModel.f);
    }
    
    @Override
    public final int hashCode() {
        final int f = ag0.a.f(this.c, ag0.a.f(this.b, this.a.hashCode() * 31, 31), 31);
        final MetaBillingProductExtra d = this.d;
        int hashCode = 0;
        int hashCode2;
        if (d == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = d.hashCode();
        }
        final BigInteger e = this.e;
        int hashCode3;
        if (e == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = e.hashCode();
        }
        final String f2 = this.f;
        if (f2 != null) {
            hashCode = f2.hashCode();
        }
        return ((f + hashCode2) * 31 + hashCode3) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("MetaBillingProductDataModel(type=");
        k.append(this.a);
        k.append(", subredditId=");
        k.append(this.b);
        k.append(", id=");
        k.append(this.c);
        k.append(", extra=");
        k.append(this.d);
        k.append(", price=");
        k.append(this.e);
        k.append(", currency=");
        return b.k(k, this.f, ')');
    }
}
