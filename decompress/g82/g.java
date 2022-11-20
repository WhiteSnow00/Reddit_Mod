// 
// Decompiled by Procyon v0.6.0
// 

package g82;

import ng2.e;
import java.math.BigDecimal;
import r82.a;
import java.math.BigInteger;

public final class g
{
    public final String a;
    public final String b;
    public final BigInteger c;
    public final BigInteger d;
    public final BigInteger e;
    public final String f;
    public final String g;
    public final Long h;
    public final BigInteger i;
    public final int j;
    public final String k;
    public final a l;
    public final a m;
    public final long n;
    public final String o;
    public final String p;
    public final String q;
    public final Integer r;
    public final String s;
    public final BigDecimal t;
    public final BigDecimal u;
    public final BigDecimal v;
    public final BigDecimal w;
    public final BigDecimal x;
    
    public g(final String a, final String b, final BigInteger c, final BigInteger d, final BigInteger e, final String f, final String g, final Long h, final BigInteger i, final int j, final String k, final a l, final a m, final long n, final String o, final String p24, final String q, final Integer r, final String s, final BigDecimal t, final BigDecimal u, final BigDecimal v, final BigDecimal w, final BigDecimal x) {
        ng2.e.f((Object)a, "txHash");
        ng2.e.f((Object)b, "userId");
        ng2.e.f((Object)c, "amount");
        ng2.e.f((Object)i, "blockNumber");
        ng2.e.f((Object)k, "txType");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
        this.o = o;
        this.p = p24;
        this.q = q;
        this.r = r;
        this.s = s;
        this.t = t;
        this.u = u;
        this.v = v;
        this.w = w;
        this.x = x;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof g)) {
            return false;
        }
        final g g = (g)o;
        return ng2.e.a((Object)this.a, (Object)g.a) && ng2.e.a((Object)this.b, (Object)g.b) && ng2.e.a((Object)this.c, (Object)g.c) && ng2.e.a((Object)this.d, (Object)g.d) && ng2.e.a((Object)this.e, (Object)g.e) && ng2.e.a((Object)this.f, (Object)g.f) && ng2.e.a((Object)this.g, (Object)g.g) && ng2.e.a((Object)this.h, (Object)g.h) && ng2.e.a((Object)this.i, (Object)g.i) && this.j == g.j && ng2.e.a((Object)this.k, (Object)g.k) && ng2.e.a((Object)this.l, (Object)g.l) && ng2.e.a((Object)this.m, (Object)g.m) && this.n == g.n && ng2.e.a((Object)this.o, (Object)g.o) && ng2.e.a((Object)this.p, (Object)g.p) && ng2.e.a((Object)this.q, (Object)g.q) && ng2.e.a((Object)this.r, (Object)g.r) && ng2.e.a((Object)this.s, (Object)g.s) && ng2.e.a((Object)this.t, (Object)g.t) && ng2.e.a((Object)this.u, (Object)g.u) && ng2.e.a((Object)this.v, (Object)g.v) && ng2.e.a((Object)this.w, (Object)g.w) && ng2.e.a((Object)this.x, (Object)g.x);
    }
    
    @Override
    public final int hashCode() {
        final int h = a.h(this.c, aq2.a.e(this.b, this.a.hashCode() * 31, 31), 31);
        final BigInteger d = this.d;
        int hashCode = 0;
        int hashCode2;
        if (d == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = d.hashCode();
        }
        final BigInteger e = this.e;
        int hashCode3;
        if (e == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = e.hashCode();
        }
        final String f = this.f;
        int hashCode4;
        if (f == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = f.hashCode();
        }
        final String g = this.g;
        int hashCode5;
        if (g == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = g.hashCode();
        }
        final Long h2 = this.h;
        int hashCode6;
        if (h2 == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = h2.hashCode();
        }
        final int e2 = aq2.a.e(this.k, aq2.a.c(this.j, a.h(this.i, (((((h + hashCode2) * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31, 31), 31), 31);
        final a l = this.l;
        int hashCode7;
        if (l == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = l.hashCode();
        }
        final a m = this.m;
        int hashCode8;
        if (m == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = m.hashCode();
        }
        final int b = b.b(this.n, ((e2 + hashCode7) * 31 + hashCode8) * 31, 31);
        final String o = this.o;
        int hashCode9;
        if (o == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = o.hashCode();
        }
        final String p = this.p;
        int hashCode10;
        if (p == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = p.hashCode();
        }
        final String q = this.q;
        int hashCode11;
        if (q == null) {
            hashCode11 = 0;
        }
        else {
            hashCode11 = q.hashCode();
        }
        final Integer r = this.r;
        int hashCode12;
        if (r == null) {
            hashCode12 = 0;
        }
        else {
            hashCode12 = r.hashCode();
        }
        final String s = this.s;
        int hashCode13;
        if (s == null) {
            hashCode13 = 0;
        }
        else {
            hashCode13 = s.hashCode();
        }
        final BigDecimal t = this.t;
        int hashCode14;
        if (t == null) {
            hashCode14 = 0;
        }
        else {
            hashCode14 = t.hashCode();
        }
        final BigDecimal u = this.u;
        int hashCode15;
        if (u == null) {
            hashCode15 = 0;
        }
        else {
            hashCode15 = u.hashCode();
        }
        final BigDecimal v = this.v;
        int hashCode16;
        if (v == null) {
            hashCode16 = 0;
        }
        else {
            hashCode16 = v.hashCode();
        }
        final BigDecimal w = this.w;
        int hashCode17;
        if (w == null) {
            hashCode17 = 0;
        }
        else {
            hashCode17 = w.hashCode();
        }
        final BigDecimal x = this.x;
        if (x != null) {
            hashCode = x.hashCode();
        }
        return (((((((((b + hashCode9) * 31 + hashCode10) * 31 + hashCode11) * 31 + hashCode12) * 31 + hashCode13) * 31 + hashCode14) * 31 + hashCode15) * 31 + hashCode16) * 31 + hashCode17) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("TransactionDataModel(txHash=");
        t.append(this.a);
        t.append(", userId=");
        t.append(this.b);
        t.append(", amount=");
        t.append(this.c);
        t.append(", ethAmount=");
        t.append(this.d);
        t.append(", feeAmount=");
        t.append(this.e);
        t.append(", description=");
        t.append(this.f);
        t.append(", subredditId=");
        t.append(this.g);
        t.append(", timestamp=");
        t.append(this.h);
        t.append(", blockNumber=");
        t.append(this.i);
        t.append(", confirmations=");
        t.append(this.j);
        t.append(", txType=");
        t.append(this.k);
        t.append(", from=");
        t.append(this.l);
        t.append(", to=");
        t.append(this.m);
        t.append(", pendingAt=");
        t.append(this.n);
        t.append(", pendingSubtype=");
        t.append(this.o);
        t.append(", recipient=");
        t.append(this.p);
        t.append(", recipientId=");
        t.append(this.q);
        t.append(", avgTransactionSec=");
        t.append(this.r);
        t.append(", successMessage=");
        t.append(this.s);
        t.append(", usdTotalAmount=");
        t.append(this.t);
        t.append(", usdPurchaseAmount=");
        t.append(this.u);
        t.append(", usdFeeAmount=");
        t.append(this.v);
        t.append(", usdNetworkFeeAmount=");
        t.append(this.w);
        t.append(", exchangeRate=");
        t.append(this.x);
        t.append(')');
        return t.toString();
    }
}
