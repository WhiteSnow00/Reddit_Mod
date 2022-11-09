// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.meta.model;

import ah2.f;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002" }, d2 = { "Lcom/reddit/data/meta/model/MetaBillingProductQuantityDataModel;", "", "data_release" }, k = 1, mv = { 1, 7, 1 })
public final class MetaBillingProductQuantityDataModel
{
    public final String a;
    public final String b;
    
    public MetaBillingProductQuantityDataModel(final String a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MetaBillingProductQuantityDataModel)) {
            return false;
        }
        final MetaBillingProductQuantityDataModel metaBillingProductQuantityDataModel = (MetaBillingProductQuantityDataModel)o;
        return f.a((Object)this.a, (Object)metaBillingProductQuantityDataModel.a) && f.a((Object)this.b, (Object)metaBillingProductQuantityDataModel.b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("MetaBillingProductQuantityDataModel(productId=");
        k.append(this.a);
        k.append(", quantity=");
        return b.k(k, this.b, ')');
    }
}
