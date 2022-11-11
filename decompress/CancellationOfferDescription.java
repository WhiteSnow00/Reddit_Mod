// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.premium.datasource.remote;

import ah2.f;
import com.squareup.moshi.n;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0004H\u00c6\u0001¨\u0006\t" }, d2 = { "Lcom/reddit/data/premium/datasource/remote/CancellationOfferDescription;", "", "", "bonusCoins", "", "description", "copy", "<init>", "(ILjava/lang/String;)V", "data_release" }, k = 1, mv = { 1, 7, 1 })
public final class CancellationOfferDescription
{
    public final int a;
    public final String b;
    
    public CancellationOfferDescription(@n(name = "bonus_coins") final int a, @n(name = "description") final String b) {
        f.f((Object)b, "description");
        this.a = a;
        this.b = b;
    }
    
    public final CancellationOfferDescription copy(@n(name = "bonus_coins") final int n, @n(name = "description") final String s) {
        f.f((Object)s, "description");
        return new CancellationOfferDescription(n, s);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CancellationOfferDescription)) {
            return false;
        }
        final CancellationOfferDescription cancellationOfferDescription = (CancellationOfferDescription)o;
        return this.a == cancellationOfferDescription.a && f.a((Object)this.b, (Object)cancellationOfferDescription.b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + Integer.hashCode(this.a) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("CancellationOfferDescription(bonusCoins=");
        k.append(this.a);
        k.append(", description=");
        return b.k(k, this.b, ')');
    }
}
