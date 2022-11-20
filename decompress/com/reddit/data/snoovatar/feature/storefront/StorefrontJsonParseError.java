// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.snoovatar.feature.storefront;

import ng2.e;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006" }, d2 = { "Lcom/reddit/data/snoovatar/feature/storefront/StorefrontJsonParseError;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "cause", "", "(Ljava/lang/Throwable;)V", "impl_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class StorefrontJsonParseError extends RuntimeException
{
    public StorefrontJsonParseError(final Throwable t) {
        e.f((Object)t, "cause");
        super(t);
    }
}
