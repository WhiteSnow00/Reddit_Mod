// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.meta.model;

import androidx.appcompat.widget.s0;
import ag0.a;
import ah2.f;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002" }, d2 = { "Lcom/reddit/data/meta/model/ProductCollectionDataModel;", "", "data_release" }, k = 1, mv = { 1, 7, 1 })
public final class ProductCollectionDataModel
{
    public final String a;
    public final String b;
    public final String c;
    public final Integer d;
    
    public ProductCollectionDataModel(final Integer d, final String a, final String b, final String c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ProductCollectionDataModel)) {
            return false;
        }
        final ProductCollectionDataModel productCollectionDataModel = (ProductCollectionDataModel)o;
        return f.a((Object)this.a, (Object)productCollectionDataModel.a) && f.a((Object)this.b, (Object)productCollectionDataModel.b) && f.a((Object)this.c, (Object)productCollectionDataModel.c) && f.a((Object)this.d, (Object)productCollectionDataModel.d);
    }
    
    @Override
    public final int hashCode() {
        final int f = ag0.a.f(this.b, this.a.hashCode() * 31, 31);
        final String c = this.c;
        int hashCode = 0;
        int hashCode2;
        if (c == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = c.hashCode();
        }
        final Integer d = this.d;
        if (d != null) {
            hashCode = d.hashCode();
        }
        return (f + hashCode2) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("ProductCollectionDataModel(id=");
        k.append(this.a);
        k.append(", title=");
        k.append(this.b);
        k.append(", description=");
        k.append(this.c);
        k.append(", position=");
        return s0.m(k, this.d, ')');
    }
}
