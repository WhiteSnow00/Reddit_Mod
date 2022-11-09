// 
// Decompiled by Procyon v0.6.0
// 

package com.android.billingclient.api;

import a2.b;
import ah2.f;
import androidx.annotation.RecentlyNonNull;

public final class n
{
    public final k a;
    public final String b;
    
    public n(@RecentlyNonNull final k a, final String b) {
        f.f((Object)a, "billingResult");
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(@RecentlyNonNull final Object o) {
        if (this != o) {
            if (o instanceof n) {
                final n n = (n)o;
                if (f.a((Object)this.a, (Object)n.a) && f.a((Object)this.b, (Object)n.b)) {
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
        final String b = this.b;
        if (b != null) {
            hashCode = b.hashCode();
        }
        return hashCode2 * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("ConsumeResult(billingResult=");
        k.append(this.a);
        k.append(", purchaseToken=");
        return a2.b.j(k, this.b, ")");
    }
}
