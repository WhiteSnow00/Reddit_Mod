// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.snoovatar.mapper.storefront;

import s60.b$d;
import s60.b$a;
import kotlin.Metadata;
import zg2.a;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = { "\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00060\u0001j\u0002`\u0002H\n¢\u0006\u0002\b\u0003" }, d2 = { "<anonymous>", "Ljava/lang/Exception;", "Lkotlin/Exception;", "invoke" }, k = 3, mv = { 1, 7, 1 }, xi = 48)
final class StorefrontComponentGqlToDomainMapper$toDomain$2$listings$1 extends Lambda implements a<Exception>
{
    public final /* synthetic */ b$a $gqlCategory;
    public final /* synthetic */ b$d $this_toDomain;
    
    public StorefrontComponentGqlToDomainMapper$toDomain$2$listings$1(final b$a $gqlCategory, final b$d $this_toDomain) {
        this.$gqlCategory = $gqlCategory;
        this.$this_toDomain = $this_toDomain;
        super(0);
    }
    
    public final Exception invoke() {
        final StringBuilder k = a.k("No listings data for category id=");
        k.append(this.$gqlCategory.a);
        k.append(" in `categoriesRow` with id=");
        k.append(this.$this_toDomain.a.a);
        return new InconsistentStorefrontData(k.toString());
    }
}
