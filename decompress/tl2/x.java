// 
// Decompiled by Procyon v0.6.0
// 

package tl2;

import ie.e0;
import java.math.BigInteger;
import android.support.v4.media.b;

public final class x extends b
{
    public final g v0(g g, BigInteger bigInteger) {
        if (g instanceof g$b) {
            final g$b g$b = (g$b)g;
            g = (g)((g)g$b).a;
            final int k = ((d)g).k();
            final byte byteValue = ((d)g).b.t().byteValue();
            final BigInteger a = p.a;
            int n;
            if (byteValue == 0) {
                n = -1;
            }
            else {
                n = 1;
            }
            final byte b = (byte)n;
            synchronized (g) {
                if (((d$a)g).i == null) {
                    ((d$a)g).i = p.c((d$a)g);
                }
                final BigInteger[] i = ((d$a)g).i;
                monitorexit(g);
                if (b == 1) {
                    g = (g)i[0].add(i[1]);
                }
                else {
                    g = (g)i[0].subtract(i[1]);
                }
                final BigInteger bigInteger2 = p.b(b, k, true)[1];
                final o a2 = p.a(bigInteger, i[0], bigInteger2, byteValue, k);
                final o a3 = p.a(bigInteger, i[1], bigInteger2, byteValue, k);
                if (a3.b != a2.b) {
                    throw new IllegalArgumentException("lambda0 and lambda1 do not have same scale");
                }
                if (b != 1 && b != -1) {
                    throw new IllegalArgumentException("mu must be 1 or -1");
                }
                final BigInteger c = a2.c();
                final BigInteger c2 = a3.c();
                final o o = new o(a2.b, a2.a.subtract(c.shiftLeft(a2.b)));
                final o o2 = new o(a3.b, a3.a.subtract(c2.shiftLeft(a3.b)));
                final o a4 = o.a(o);
                o o3;
                if (b == 1) {
                    o3 = a4.a(o2);
                }
                else {
                    o3 = a4.d(o2);
                }
                final o a5 = o2.a(o2).a(o2);
                final o a6 = a5.a(o2);
                o o4;
                o o5;
                if (b == 1) {
                    o4 = o.d(a5);
                    o5 = o.a(a6);
                }
                else {
                    o4 = o.a(a5);
                    o5 = o.d(a6);
                }
                final BigInteger b2 = tl2.b.b;
                int n2 = 0;
                int n3 = 0;
                Label_0462: {
                    if (o3.b(b2) >= 0) {
                        if (o4.b(p.a) >= 0) {
                            n2 = 0;
                            n3 = 1;
                            break Label_0462;
                        }
                    }
                    else if (o5.b(tl2.b.c) < 0) {
                        n3 = (n2 = 0);
                        break Label_0462;
                    }
                    n3 = 0;
                    n2 = b;
                }
                Label_0512: {
                    if (o3.b(p.a) < 0) {
                        if (o4.b(b2) < 0) {
                            n3 = -1;
                            break Label_0512;
                        }
                    }
                    else if (o5.b(p.b) >= 0) {
                        break Label_0512;
                    }
                    n2 = (byte)(-b);
                }
                final e0 e0 = new e0((Object)c.add(BigInteger.valueOf(n3)), (Object)c2.add(BigInteger.valueOf(n2)));
                final e0 e2 = new e0((Object)bigInteger.subtract(((BigInteger)g).multiply((BigInteger)e0.f)).subtract(BigInteger.valueOf(2L).multiply(i[1]).multiply((BigInteger)e0.g)), (Object)i[1].multiply((BigInteger)e0.f).subtract(i[0].multiply((BigInteger)e0.g)));
                e0[] array;
                if (byteValue == 0) {
                    array = p.c;
                }
                else {
                    array = p.e;
                }
                long n4;
                if (b == 1) {
                    n4 = 6L;
                }
                else {
                    n4 = 10L;
                }
                final BigInteger value = BigInteger.valueOf(n4);
                final BigInteger value2 = BigInteger.valueOf(16L);
                if (b != 1 && b != -1) {
                    throw new IllegalArgumentException("mu must be 1 or -1");
                }
                g = (g)e2.f;
                final BigInteger multiply = ((BigInteger)g).multiply((BigInteger)g);
                g = (g)((BigInteger)e2.f).multiply((BigInteger)e2.g);
                bigInteger = (BigInteger)e2.g;
                bigInteger = bigInteger.multiply(bigInteger).shiftLeft(1);
                if (b == 1) {
                    g = (g)multiply.add((BigInteger)g);
                }
                else {
                    if (b != -1) {
                        throw new IllegalArgumentException("mu must be 1 or -1");
                    }
                    g = (g)multiply.subtract((BigInteger)g);
                }
                final int bitLength = ((BigInteger)g).add(bigInteger).bitLength();
                int n5;
                if (bitLength > 30) {
                    n5 = bitLength + 4 + 4;
                }
                else {
                    n5 = 38;
                }
                final byte[] array2 = new byte[n5];
                final BigInteger shiftRight = value2.shiftRight(1);
                bigInteger = (BigInteger)e2.f;
                g = (g)e2.g;
                int n6 = 0;
                while (true) {
                    final BigInteger a7 = tl2.b.a;
                    if (bigInteger.equals(a7) && ((BigInteger)g).equals(a7)) {
                        break;
                    }
                    if (bigInteger.testBit(0)) {
                        BigInteger bigInteger4;
                        final BigInteger bigInteger3 = bigInteger4 = bigInteger.add(((BigInteger)g).multiply(value)).mod(value2);
                        if (bigInteger3.compareTo(shiftRight) >= 0) {
                            bigInteger4 = bigInteger3.subtract(value2);
                        }
                        byte b3 = (byte)bigInteger4.intValue();
                        array2[n6] = b3;
                        boolean b4;
                        if (b3 < 0) {
                            b3 = (byte)(-b3);
                            b4 = false;
                        }
                        else {
                            b4 = true;
                        }
                        if (b4) {
                            bigInteger = bigInteger.subtract((BigInteger)array[b3].f);
                            g = (g)((BigInteger)g).subtract((BigInteger)array[b3].g);
                        }
                        else {
                            bigInteger = bigInteger.add((BigInteger)array[b3].f);
                            g = (g)((BigInteger)g).add((BigInteger)array[b3].g);
                        }
                    }
                    else {
                        array2[n6] = 0;
                    }
                    final BigInteger shiftRight2 = bigInteger.shiftRight(1);
                    if (b == 1) {
                        g = (g)((BigInteger)g).add(shiftRight2);
                    }
                    else {
                        g = (g)((BigInteger)g).subtract(shiftRight2);
                    }
                    final Object negate = bigInteger.shiftRight(1).negate();
                    ++n6;
                    bigInteger = (BigInteger)g;
                    g = (g)negate;
                }
                g = (g)((g)g$b).a;
                final g$b[] a8 = ((y)((d)g).o((g)g$b, "bc_wtnaf", (m)new w(g$b, ((d)g).b.t().byteValue()))).a;
                final g$b[] array3 = new g$b[a8.length];
                for (int j = 0; j < a8.length; ++j) {
                    array3[j] = (g$b)((g)a8[j]).l();
                }
                g = ((g)g$b).a.l();
                int l = n5 - 1;
                int n7 = 0;
                while (l >= 0) {
                    final int n8 = n7 + 1;
                    final byte b5 = array2[l];
                    n7 = n8;
                    if (b5 != 0) {
                        final g$b x = ((g$b)g).x(n8);
                        if (b5 > 0) {
                            g = (g)a8[b5 >>> 1];
                        }
                        else {
                            g = (g)array3[-b5 >>> 1];
                        }
                        final g$b g$b2 = (g$b)((g)x).a(g);
                        n7 = 0;
                    }
                    --l;
                    g = g;
                }
                if (n7 > 0) {
                    ((g$b)g).x(n7);
                }
                return g;
            }
        }
        throw new IllegalArgumentException("Only ECPoint.AbstractF2m can be used in WTauNafMultiplier");
    }
}
