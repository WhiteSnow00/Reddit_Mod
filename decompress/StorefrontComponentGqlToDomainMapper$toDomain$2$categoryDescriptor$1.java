// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.snoovatar.mapper.storefront;

import s60.b$a;
import kotlin.Metadata;
import zg2.a;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = { "\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00060\u0001j\u0002`\u0002H\n¢\u0006\u0002\b\u0003" }, d2 = { "<anonymous>", "Ljava/lang/Exception;", "Lkotlin/Exception;", "invoke" }, k = 3, mv = { 1, 7, 1 }, xi = 48)
final class StorefrontComponentGqlToDomainMapper$toDomain$2$categoryDescriptor$1 extends Lambda implements a<Exception>
{
    public final /* synthetic */ b$a $gqlCategory;
    
    public StorefrontComponentGqlToDomainMapper$toDomain$2$categoryDescriptor$1(final b$a $gqlCategory) {
        this.$gqlCategory = $gqlCategory;
        super(0);
    }
    
    public final Exception invoke() {
        final StringBuilder k = a.k("No category data for category id=");
        k.append(this.$gqlCategory.a);
        return new InconsistentStorefrontData(k.toString());
    }
}
