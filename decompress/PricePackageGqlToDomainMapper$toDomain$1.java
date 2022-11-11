// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.snoovatar.mapper.storefront;

import com.reddit.fragment.AvatarStorefrontListing$g;
import kotlin.Metadata;
import zg2.a;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = { "\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00060\u0001j\u0002`\u0002H\n¢\u0006\u0002\b\u0003" }, d2 = { "<anonymous>", "Ljava/lang/Exception;", "Lkotlin/Exception;", "invoke" }, k = 3, mv = { 1, 7, 1 }, xi = 48)
final class PricePackageGqlToDomainMapper$toDomain$1 extends Lambda implements a<Exception>
{
    public final /* synthetic */ AvatarStorefrontListing$g $gqlPricePackage;
    public final /* synthetic */ String $listingId;
    
    public PricePackageGqlToDomainMapper$toDomain$1(final AvatarStorefrontListing$g $gqlPricePackage, final String $listingId) {
        this.$gqlPricePackage = $gqlPricePackage;
        this.$listingId = $listingId;
        super(0);
    }
    
    public final Exception invoke() {
        final StringBuilder k = a.k("currency is not USD (");
        k.append(this.$gqlPricePackage.e);
        k.append(") for listing id=");
        k.append(this.$listingId);
        return new InconsistentStorefrontData(k.toString());
    }
}
