// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.snoovatar.entity.storefront.layout;

import com.squareup.moshi.n;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006" }, d2 = { "Lcom/reddit/data/snoovatar/entity/storefront/layout/JsonListingsStatusFilter;", "", "(Ljava/lang/String;I)V", "Available", "SoldOut", "Expired", "impl_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public enum JsonListingsStatusFilter
{
    private static final JsonListingsStatusFilter[] $VALUES;
    
    @n(name = "AVAILABLE")
    Available, 
    @n(name = "EXPIRED")
    Expired, 
    @n(name = "SOLD_OUT")
    SoldOut;
    
    private static final JsonListingsStatusFilter[] $values() {
        return new JsonListingsStatusFilter[] { JsonListingsStatusFilter.Available, JsonListingsStatusFilter.SoldOut, JsonListingsStatusFilter.Expired };
    }
    
    static {
        $VALUES = $values();
    }
}
