// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.snoovatar.mapper.storefront;

import kotlin.Metadata;
import zg2.a;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = { "\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00060\u0001j\u0002`\u0002H\n¢\u0006\u0002\b\u0003" }, d2 = { "<anonymous>", "Ljava/lang/Exception;", "Lkotlin/Exception;", "invoke" }, k = 3, mv = { 1, 7, 1 }, xi = 48)
final class PriceFilterV2GqlToDomainMapper$toDomain$2$1 extends Lambda implements a<Exception>
{
    public static final PriceFilterV2GqlToDomainMapper$toDomain$2$1 INSTANCE;
    
    static {
        INSTANCE = new PriceFilterV2GqlToDomainMapper$toDomain$2$1();
    }
    
    public PriceFilterV2GqlToDomainMapper$toDomain$2$1() {
        super(0);
    }
    
    public final Exception invoke() {
        return new InconsistentStorefrontData("No price tiers");
    }
}
