// 
// Decompiled by Procyon v0.6.0
// 

package z82;

import java.math.BigInteger;
import com.reddit.vault.model.AllowedContractMethod;
import java.util.List;
import java.util.Map;
import a92.e;
import a92.c;
import a92.d;

public final class a
{
    public final String a;
    public final a92.a b;
    public final d c;
    public final c d;
    public final e e;
    public final Map<x82.a, List<AllowedContractMethod>> f;
    public final Integer g;
    public final BigInteger h;
    
    public a(final String a, final a92.a b, final d c, final c d, final e e, final Map<x82.a, ? extends List<AllowedContractMethod>> f, final Integer g, final BigInteger h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = (Map<x82.a, List<AllowedContractMethod>>)f;
        this.g = g;
        this.h = h;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof a)) {
            return false;
        }
        final a a = (a)o;
        return sg2.e.a((Object)this.a, (Object)a.a) && sg2.e.a((Object)this.b, (Object)a.b) && sg2.e.a((Object)this.c, (Object)a.c) && sg2.e.a((Object)this.d, (Object)a.d) && sg2.e.a((Object)this.e, (Object)a.e) && sg2.e.a((Object)this.f, (Object)a.f) && sg2.e.a((Object)this.g, (Object)a.g) && sg2.e.a((Object)this.h, (Object)a.h);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final a92.a b = this.b;
        int hashCode2 = 0;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final d c = this.c;
        int hashCode4;
        if (c == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = c.hashCode();
        }
        final c d = this.d;
        int hashCode5;
        if (d == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = d.hashCode();
        }
        final e e = this.e;
        int hashCode6;
        if (e == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = e.hashCode();
        }
        final Map<x82.a, List<AllowedContractMethod>> f = this.f;
        int hashCode7;
        if (f == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = f.hashCode();
        }
        final Integer g = this.g;
        int hashCode8;
        if (g == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = g.hashCode();
        }
        final BigInteger h = this.h;
        if (h != null) {
            hashCode2 = h.hashCode();
        }
        return ((((((hashCode * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode7) * 31 + hashCode8) * 31 + hashCode2;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("TransactionContracts(providerKey=");
        r.append(this.a);
        r.append(", distributionTransactions=");
        r.append(this.b);
        r.append(", subscriptionTransactions=");
        r.append(this.c);
        r.append(", transferTransactions=");
        r.append(this.d);
        r.append(", timedForwarderTransactions=");
        r.append(this.e);
        r.append(", allowedMetaMethods=");
        r.append(this.f);
        r.append(", avgTransactionSec=");
        r.append(this.g);
        r.append(", metaGasLimit=");
        r.append(this.h);
        r.append(')');
        return r.toString();
    }
}
