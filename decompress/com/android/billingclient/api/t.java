// 
// Decompiled by Procyon v0.6.0
// 

package com.android.billingclient.api;

import ak0.n;
import ah2.f;
import java.util.ArrayList;
import androidx.annotation.RecentlyNonNull;
import java.util.List;

public final class t
{
    public final k a;
    public final List<SkuDetails> b;
    
    public t(@RecentlyNonNull final k a, final ArrayList b) {
        f.f((Object)a, "billingResult");
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(@RecentlyNonNull final Object o) {
        if (this != o) {
            if (o instanceof t) {
                final t t = (t)o;
                if (f.a((Object)this.a, (Object)t.a) && f.a((Object)this.b, (Object)t.b)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        final k a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a != null) {
            hashCode2 = a.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final List<SkuDetails> b = this.b;
        if (b != null) {
            hashCode = b.hashCode();
        }
        return hashCode2 * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("SkuDetailsResult(billingResult=");
        k.append(this.a);
        k.append(", skuDetailsList=");
        return n.r(k, (List)this.b, ")");
    }
}
