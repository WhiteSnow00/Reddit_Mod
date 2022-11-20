// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.snoovatar.entity.storefront.layout;

import kotlin.jvm.internal.DefaultConstructorMarker;
import ng2.e;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002" }, d2 = { "Lcom/reddit/data/snoovatar/entity/storefront/layout/JsonListingsQueryDescriptor;", "", "impl_release" }, k = 1, mv = { 1, 7, 1 })
public final class JsonListingsQueryDescriptor
{
    public final JsonListingsFilters a;
    public final JsonListingsSort b;
    
    public JsonListingsQueryDescriptor(final JsonListingsFilters a, final JsonListingsSort b) {
        e.f((Object)a, "filters");
        this.a = a;
        this.b = b;
    }
    
    public JsonListingsQueryDescriptor(final JsonListingsFilters jsonListingsFilters, JsonListingsSort jsonListingsSort, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 0x2) != 0x0) {
            jsonListingsSort = null;
        }
        this(jsonListingsFilters, jsonListingsSort);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof JsonListingsQueryDescriptor)) {
            return false;
        }
        final JsonListingsQueryDescriptor jsonListingsQueryDescriptor = (JsonListingsQueryDescriptor)o;
        return e.a((Object)this.a, (Object)jsonListingsQueryDescriptor.a) && this.b == jsonListingsQueryDescriptor.b;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final JsonListingsSort b = this.b;
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
        final StringBuilder t = a.t("JsonListingsQueryDescriptor(filters=");
        t.append(this.a);
        t.append(", sort=");
        t.append(this.b);
        t.append(')');
        return t.toString();
    }
}
