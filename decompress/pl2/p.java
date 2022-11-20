// 
// Decompiled by Procyon v0.6.0
// 

package pl2;

import java.math.BigInteger;

public final class p
{
    public static final BigInteger a;
    public static final BigInteger b;
    public static final qd.p[] c;
    public static final byte[][] d;
    public static final qd.p[] e;
    public static final byte[][] f;
    
    static {
        final BigInteger b2 = pl2.b.b;
        final BigInteger bigInteger = a = b2.negate();
        b = pl2.b.c.negate();
        final BigInteger negate = pl2.b.d.negate();
        final BigInteger a2 = pl2.b.a;
        c = new qd.p[] { null, new qd.p(10, (Object)b2, (Object)a2), null, new qd.p(10, (Object)negate, (Object)bigInteger), null, new qd.p(10, (Object)bigInteger, (Object)bigInteger), null, new qd.p(10, (Object)b2, (Object)bigInteger), null };
        d = new byte[][] { null, { 1 }, null, { -1, 0, 1 }, null, { 1, 0, 1 }, null, { -1, 0, 0, 1 } };
        e = new qd.p[] { null, new qd.p(10, (Object)b2, (Object)a2), null, new qd.p(10, (Object)negate, (Object)b2), null, new qd.p(10, (Object)bigInteger, (Object)b2), null, new qd.p(10, (Object)b2, (Object)b2), null };
        f = new byte[][] { null, { 1 }, null, { -1, 0, 1 }, null, { 1, 0, 1 }, null, { -1, 0, 0, -1 } };
    }
    
    public static o a(BigInteger bigInteger, BigInteger bigInteger2, BigInteger add, final byte b, final int n) {
        final int n2 = (n + 5) / 2 + 10;
        bigInteger = bigInteger2.multiply(bigInteger.shiftRight(n - n2 - 2 + b));
        add = bigInteger.add(add.multiply(bigInteger.shiftRight(n)));
        final int n3 = n2 - 10;
        bigInteger2 = (bigInteger = add.shiftRight(n3));
        if (add.testBit(n3 - 1)) {
            bigInteger = bigInteger2.add(b.b);
        }
        return new o(10, bigInteger);
    }
    
    public static BigInteger[] b(final byte b, final int n, final boolean b2) {
        if (b != 1 && b != -1) {
            throw new IllegalArgumentException("mu must be 1 or -1");
        }
        BigInteger bigInteger;
        BigInteger bigInteger2;
        if (b2) {
            bigInteger = b.c;
            bigInteger2 = BigInteger.valueOf(b);
        }
        else {
            bigInteger = b.a;
            bigInteger2 = b.b;
        }
        BigInteger subtract;
        BigInteger bigInteger3;
        for (int i = 1; i < n; ++i, bigInteger3 = bigInteger2, bigInteger2 = subtract, bigInteger = bigInteger3) {
            BigInteger negate;
            if (b == 1) {
                negate = bigInteger2;
            }
            else {
                negate = bigInteger2.negate();
            }
            subtract = negate.subtract(bigInteger.shiftLeft(1));
        }
        return new BigInteger[] { bigInteger, bigInteger2 };
    }
    
    public static BigInteger[] c(final d$a d$a) {
        if (d$a.q()) {
            final int k = ((d)d$a).k();
            final int intValue = ((d)d$a).b.t().intValue();
            int n;
            if (intValue == 0) {
                n = -1;
            }
            else {
                n = 1;
            }
            final byte b = (byte)n;
            final BigInteger e = ((d)d$a).e;
            if (e != null) {
                int n2;
                if (e.equals(pl2.b.c)) {
                    n2 = 1;
                }
                else {
                    if (!e.equals(pl2.b.e)) {
                        throw new IllegalArgumentException("h (Cofactor) must be 2 or 4");
                    }
                    n2 = 2;
                }
                final BigInteger[] b2 = b(b, k + 3 - intValue, false);
                if (b == 1) {
                    b2[0] = b2[0].negate();
                    b2[1] = b2[1].negate();
                }
                final BigInteger b3 = pl2.b.b;
                return new BigInteger[] { b3.add(b2[1]).shiftRight(n2), b3.add(b2[0]).shiftRight(n2).negate() };
            }
            throw new IllegalArgumentException("h (Cofactor) must be 2 or 4");
        }
        throw new IllegalArgumentException("si is defined for Koblitz curves only");
    }
}
