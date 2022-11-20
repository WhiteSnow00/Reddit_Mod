// 
// Decompiled by Procyon v0.6.0
// 

package r82;

import java.util.Arrays;
import kotlin.collections.EmptyList;
import fn2.b;
import dg2.j;
import org.kethereum.rlp.RLPEncoderKt;
import java.util.Collection;
import kotlin.collections.CollectionsKt___CollectionsKt;
import cg.d;
import java.util.List;
import ng2.e;
import java.math.BigInteger;

public final class c
{
    public final a a;
    public final a b;
    public final BigInteger c;
    public final BigInteger d;
    public final BigInteger e;
    public final BigInteger f;
    public final byte[] g;
    public final BigInteger h;
    public final BigInteger i;
    public BigInteger j;
    
    public c(final a a) {
        this(a, null, null, null, null, null, new byte[0], null, null, null);
    }
    
    public c(final a a, final a b, final BigInteger c, final BigInteger d, final BigInteger e, final BigInteger f, final byte[] g, final BigInteger h, final BigInteger i, final BigInteger j) {
        ng2.e.f((Object)a, "to");
        ng2.e.f((Object)g, "input");
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
    }
    
    public static c a(final c c, a b, BigInteger c2, BigInteger d, BigInteger e, BigInteger f, byte[] g, BigInteger h, BigInteger i, BigInteger j, final int n) {
        a a;
        if ((n & 0x1) != 0x0) {
            a = c.a;
        }
        else {
            a = null;
        }
        if ((n & 0x2) != 0x0) {
            b = c.b;
        }
        if ((n & 0x4) != 0x0) {
            c2 = c.c;
        }
        if ((n & 0x8) != 0x0) {
            d = c.d;
        }
        if ((n & 0x10) != 0x0) {
            e = c.e;
        }
        if ((n & 0x20) != 0x0) {
            f = c.f;
        }
        if ((n & 0x40) != 0x0) {
            g = c.g;
        }
        if ((n & 0x80) != 0x0) {
            h = c.h;
        }
        if ((n & 0x100) != 0x0) {
            i = c.i;
        }
        if ((n & 0x200) != 0x0) {
            j = c.j;
        }
        c.getClass();
        e.f((Object)a, "to");
        e.f((Object)g, "input");
        return new c(a, b, c2, d, e, f, g, h, i, j);
    }
    
    public static List b(List o5, final f0 f0, final boolean b) {
        if (f0 != null) {
            BigInteger bigInteger;
            if (b) {
                bigInteger = f0.c.subtract(new BigInteger("27"));
                e.e((Object)bigInteger, "this.subtract(other)");
            }
            else {
                bigInteger = f0.c;
            }
            o5 = CollectionsKt___CollectionsKt.o5((Iterable)d.m3((Object[])new fn2.a[] { kotlinx.coroutines.channels.a.o(bigInteger), kotlinx.coroutines.channels.a.o(f0.a), kotlinx.coroutines.channels.a.o(f0.b) }), (Collection)o5);
        }
        return o5;
    }
    
    public final byte[] c(final f0 f0) {
        final BigInteger d = this.d;
        final int n = 0;
        byte[] array2;
        if (d == null && this.f != null && this.e != null) {
            final byte[] array = { 0 };
            for (int i = n; i < 1; ++i) {
                array[i] = 2;
            }
            array2 = dg2.j.Y1(array, RLPEncoderKt.a((fn2.c)this.d(f0)));
        }
        else {
            array2 = RLPEncoderKt.a((fn2.c)this.d(f0));
        }
        return array2;
    }
    
    public final b d(final f0 f0) {
        List list;
        if (this.d == null && this.f != null && this.e != null) {
            final BigInteger j = this.j;
            ng2.e.c((Object)j);
            final fn2.a o = kotlinx.coroutines.channels.a.o(j);
            final BigInteger h = this.h;
            ng2.e.c((Object)h);
            final fn2.a o2 = kotlinx.coroutines.channels.a.o(h);
            final BigInteger f2 = this.f;
            ng2.e.c((Object)f2);
            final fn2.a o3 = kotlinx.coroutines.channels.a.o(f2);
            final BigInteger e = this.e;
            ng2.e.c((Object)e);
            final fn2.a o4 = kotlinx.coroutines.channels.a.o(e);
            final BigInteger c = this.c;
            ng2.e.c((Object)c);
            final fn2.a o5 = kotlinx.coroutines.channels.a.o(c);
            final String c2 = this.a.c();
            ng2.e.g((Object)c2, "string");
            final fn2.a a = new fn2.a(hn2.a.a(c2));
            final BigInteger i = this.i;
            ng2.e.c((Object)i);
            final fn2.a o6 = kotlinx.coroutines.channels.a.o(i);
            final byte[] g = this.g;
            ng2.e.g((Object)g, "$this$toRLP");
            list = b(cg.d.m3((Object[])new fn2.c[] { (fn2.c)o, (fn2.c)o2, (fn2.c)o3, (fn2.c)o4, (fn2.c)o5, (fn2.c)a, (fn2.c)o6, (fn2.c)new fn2.a(g), (fn2.c)new b((List)EmptyList.INSTANCE) }), f0, true);
        }
        else {
            final BigInteger h2 = this.h;
            ng2.e.c((Object)h2);
            final fn2.a o7 = kotlinx.coroutines.channels.a.o(h2);
            final BigInteger d = this.d;
            ng2.e.c((Object)d);
            final fn2.a o8 = kotlinx.coroutines.channels.a.o(d);
            final BigInteger c3 = this.c;
            ng2.e.c((Object)c3);
            final fn2.a o9 = kotlinx.coroutines.channels.a.o(c3);
            final String c4 = this.a.c();
            ng2.e.g((Object)c4, "string");
            final fn2.a a2 = new fn2.a(hn2.a.a(c4));
            final BigInteger k = this.i;
            ng2.e.c((Object)k);
            final fn2.a o10 = kotlinx.coroutines.channels.a.o(k);
            final byte[] g2 = this.g;
            ng2.e.g((Object)g2, "$this$toRLP");
            list = b(cg.d.m3((Object[])new fn2.a[] { o7, o8, o9, a2, o10, new fn2.a(g2) }), f0, false);
        }
        return new b(list);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof c)) {
            return false;
        }
        final c c = (c)o;
        return ng2.e.a((Object)this.a, (Object)c.a) && ng2.e.a((Object)this.b, (Object)c.b) && ng2.e.a((Object)this.c, (Object)c.c) && ng2.e.a((Object)this.d, (Object)c.d) && ng2.e.a((Object)this.e, (Object)c.e) && ng2.e.a((Object)this.f, (Object)c.f) && ng2.e.a((Object)this.g, (Object)c.g) && ng2.e.a((Object)this.h, (Object)c.h) && ng2.e.a((Object)this.i, (Object)c.i) && ng2.e.a((Object)this.j, (Object)c.j);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final a b = this.b;
        int hashCode2 = 0;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final BigInteger c = this.c;
        int hashCode4;
        if (c == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = c.hashCode();
        }
        final BigInteger d = this.d;
        int hashCode5;
        if (d == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = d.hashCode();
        }
        final BigInteger e = this.e;
        int hashCode6;
        if (e == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = e.hashCode();
        }
        final BigInteger f = this.f;
        int hashCode7;
        if (f == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = f.hashCode();
        }
        final int hashCode8 = Arrays.hashCode(this.g);
        final BigInteger h = this.h;
        int hashCode9;
        if (h == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = h.hashCode();
        }
        final BigInteger i = this.i;
        int hashCode10;
        if (i == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = i.hashCode();
        }
        final BigInteger j = this.j;
        if (j != null) {
            hashCode2 = j.hashCode();
        }
        return (((hashCode8 + (((((hashCode * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode7) * 31) * 31 + hashCode9) * 31 + hashCode10) * 31 + hashCode2;
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("ChainTransaction(to=");
        t.append(this.a);
        t.append(", from=");
        t.append(this.b);
        t.append(", gasLimit=");
        t.append(this.c);
        t.append(", gasPrice=");
        t.append(this.d);
        t.append(", maxFeePerGas=");
        t.append(this.e);
        t.append(", maxPriorityFeePerGas=");
        t.append(this.f);
        t.append(", input=");
        t.append(Arrays.toString(this.g));
        t.append(", nonce=");
        t.append(this.h);
        t.append(", value=");
        t.append(this.i);
        t.append(", chain=");
        t.append(this.j);
        t.append(')');
        return t.toString();
    }
}
