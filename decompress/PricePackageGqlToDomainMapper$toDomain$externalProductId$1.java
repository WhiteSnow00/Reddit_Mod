// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.snoovatar.mapper.storefront;

import com.reddit.fragment.AvatarStorefrontListing$g;
import kotlin.Metadata;
import zg2.a;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = { "\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00060\u0001j\u0002`\u0002H\n¢\u0006\u0002\b\u0003" }, d2 = { "<anonymous>", "Ljava/lang/Exception;", "Lkotlin/Exception;", "invoke" }, k = 3, mv = { 1, 7, 1 }, xi = 48)
final class PricePackageGqlToDomainMapper$toDomain$externalProductId$1 extends Lambda implements a<Exception>
{
    public final /* synthetic */ AvatarStorefrontListing$g $gqlPricePackage;
    
    public PricePackageGqlToDomainMapper$toDomain$externalProductId$1(final AvatarStorefrontListing$g $gqlPricePackage) {
        this.$gqlPricePackage = $gqlPricePackage;
        super(0);
    }
    
    public final Exception invoke() {
        final StringBuilder k = a.k("externalProductId == null for price package id=");
        k.append(this.$gqlPricePackage.b);
        return new InconsistentStorefrontData(k.toString());
    }
}
