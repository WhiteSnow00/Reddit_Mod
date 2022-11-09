// 
// Decompiled by Procyon v0.6.0
// 

package com.android.billingclient.api;

import ak0.n;
import ah2.f;
import androidx.annotation.RecentlyNonNull;
import java.util.List;

public final class p
{
    public final k a;
    public final List<Purchase> b;
    
    public p(@RecentlyNonNull final k a, @RecentlyNonNull final List<? extends Purchase> b) {
        f.f((Object)a, "billingResult");
        f.f((Object)b, "purchasesList");
        this.a = a;
        this.b = (List<Purchase>)b;
    }
    
    @Override
    public final boolean equals(@RecentlyNonNull final Object o) {
        if (this != o) {
            if (o instanceof p) {
                final p p = (p)o;
                if (f.a((Object)this.a, (Object)p.a) && f.a((Object)this.b, (Object)p.b)) {
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
        final List<Purchase> b = this.b;
        if (b != null) {
            hashCode = b.hashCode();
        }
        return hashCode2 * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("PurchasesResult(billingResult=");
        k.append(this.a);
        k.append(", purchasesList=");
        return n.r(k, (List)this.b, ")");
    }
}
