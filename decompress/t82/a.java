// 
// Decompiled by Procyon v0.6.0
// 

package t82;

import ng2.e;
import java.math.BigInteger;
import com.reddit.vault.model.AllowedContractMethod;
import java.util.List;
import java.util.Map;
import u82.d;
import u82.b;
import u82.c;

public final class a
{
    public final String a;
    public final u82.a b;
    public final c c;
    public final b d;
    public final d e;
    public final Map<r82.a, List<AllowedContractMethod>> f;
    public final Integer g;
    public final BigInteger h;
    
    public a(final String a, final u82.a b, final c c, final b d, final d e, final Map<r82.a, ? extends List<AllowedContractMethod>> f, final Integer g, final BigInteger h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = (Map<r82.a, List<AllowedContractMethod>>)f;
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
        return ng2.e.a((Object)this.a, (Object)a.a) && ng2.e.a((Object)this.b, (Object)a.b) && ng2.e.a((Object)this.c, (Object)a.c) && ng2.e.a((Object)this.d, (Object)a.d) && ng2.e.a((Object)this.e, (Object)a.e) && ng2.e.a((Object)this.f, (Object)a.f) && ng2.e.a((Object)this.g, (Object)a.g) && ng2.e.a((Object)this.h, (Object)a.h);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final u82.a b = this.b;
        int hashCode2 = 0;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final c c = this.c;
        int hashCode4;
        if (c == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = c.hashCode();
        }
        final b d = this.d;
        int hashCode5;
        if (d == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = d.hashCode();
        }
        final d e = this.e;
        int hashCode6;
        if (e == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = e.hashCode();
        }
        final Map<r82.a, List<AllowedContractMethod>> f = this.f;
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
        final StringBuilder t = a.t("TransactionContracts(providerKey=");
        t.append(this.a);
        t.append(", distributionTransactions=");
        t.append(this.b);
        t.append(", subscriptionTransactions=");
        t.append(this.c);
        t.append(", transferTransactions=");
        t.append(this.d);
        t.append(", timedForwarderTransactions=");
        t.append(this.e);
        t.append(", allowedMetaMethods=");
        t.append(this.f);
        t.append(", avgTransactionSec=");
        t.append(this.g);
        t.append(", metaGasLimit=");
        t.append(this.h);
        t.append(')');
        return t.toString();
    }
}
