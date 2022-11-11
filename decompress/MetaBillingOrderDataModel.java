// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.meta.model;

import ag0.a;
import a2.b;
import ah2.f;
import java.util.List;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002" }, d2 = { "Lcom/reddit/data/meta/model/MetaBillingOrderDataModel;", "", "data_release" }, k = 1, mv = { 1, 7, 1 })
public final class MetaBillingOrderDataModel
{
    public final String a;
    public final List<MetaBillingProductQuantityDataModel> b;
    public final String c;
    public final String d;
    public final MetaBillingProviderArgsDataModel e;
    
    public MetaBillingOrderDataModel(final String a, final List<MetaBillingProductQuantityDataModel> b, final String c, final String d, final MetaBillingProviderArgsDataModel e) {
        f.f((Object)a, "subredditId");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MetaBillingOrderDataModel)) {
            return false;
        }
        final MetaBillingOrderDataModel metaBillingOrderDataModel = (MetaBillingOrderDataModel)o;
        return f.a((Object)this.a, (Object)metaBillingOrderDataModel.a) && f.a((Object)this.b, (Object)metaBillingOrderDataModel.b) && f.a((Object)this.c, (Object)metaBillingOrderDataModel.c) && f.a((Object)this.d, (Object)metaBillingOrderDataModel.d) && f.a((Object)this.e, (Object)metaBillingOrderDataModel.e);
    }
    
    @Override
    public final int hashCode() {
        return this.e.hashCode() + ag0.a.f(this.d, ag0.a.f(this.c, a2.b.a((List)this.b, this.a.hashCode() * 31, 31), 31), 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("MetaBillingOrderDataModel(subredditId=");
        k.append(this.a);
        k.append(", products=");
        k.append(this.b);
        k.append(", orderTarget=");
        k.append(this.c);
        k.append(", providerName=");
        k.append(this.d);
        k.append(", providerArgs=");
        k.append(this.e);
        k.append(')');
        return k.toString();
    }
}
