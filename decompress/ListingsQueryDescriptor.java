// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.snoovatar.entity.storefront.layout;

import kotlin.jvm.internal.DefaultConstructorMarker;
import ah2.f;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002" }, d2 = { "Lcom/reddit/data/snoovatar/entity/storefront/layout/ListingsQueryDescriptor;", "", "data_release" }, k = 1, mv = { 1, 7, 1 })
public final class ListingsQueryDescriptor
{
    public final ListingsFilters a;
    public final ListingsSort b;
    
    public ListingsQueryDescriptor(final ListingsFilters a, final ListingsSort b) {
        f.f((Object)a, "filters");
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListingsQueryDescriptor)) {
            return false;
        }
        final ListingsQueryDescriptor listingsQueryDescriptor = (ListingsQueryDescriptor)o;
        return f.a((Object)this.a, (Object)listingsQueryDescriptor.a) && this.b == listingsQueryDescriptor.b;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final ListingsSort b = this.b;
        int hashCode2;
        if (b == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = b.hashCode();
        }
        return hashCode * 31 + hashCode2;
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("ListingsQueryDescriptor(filters=");
        k.append(this.a);
        k.append(", sort=");
        k.append(this.b);
        k.append(')');
        return k.toString();
    }
}
