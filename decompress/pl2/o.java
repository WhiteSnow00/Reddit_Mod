// 
// Decompiled by Procyon v0.6.0
// 

package pl2;

import java.math.BigInteger;

public final class o
{
    public final BigInteger a;
    public final int b;
    
    public o(final int b, final BigInteger a) {
        if (b >= 0) {
            this.a = a;
            this.b = b;
            return;
        }
        throw new IllegalArgumentException("scale may not be negative");
    }
    
    public final o a(final o o) {
        if (this.b == o.b) {
            return new o(this.b, this.a.add(o.a));
        }
        throw new IllegalArgumentException("Only SimpleBigDecimal of same scale allowed in arithmetic operations");
    }
    
    public final int b(final BigInteger bigInteger) {
        return this.a.compareTo(bigInteger.shiftLeft(this.b));
    }
    
    public final BigInteger c() {
        final BigInteger b = pl2.b.b;
        o o = new o(1, b);
        final int b2 = this.b;
        if (b2 >= 0) {
            if (b2 != 1) {
                o = new o(b2, b.shiftLeft(b2 - 1));
            }
            final o a = this.a(o);
            return a.a.shiftRight(a.b);
        }
        throw new IllegalArgumentException("scale may not be negative");
    }
    
    public final o d(final o o) {
        return this.a(new o(o.b, o.a.negate()));
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (!(o instanceof o)) {
            return false;
        }
        final o o2 = (o)o;
        if (!this.a.equals(o2.a) || this.b != o2.b) {
            b = false;
        }
        return b;
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode() ^ this.b;
    }
    
    @Override
    public final String toString() {
        final int b = this.b;
        if (b == 0) {
            return this.a.toString();
        }
        final BigInteger shiftRight = this.a.shiftRight(b);
        BigInteger bigInteger2;
        final BigInteger bigInteger = bigInteger2 = this.a.subtract(shiftRight.shiftLeft(this.b));
        if (this.a.signum() == -1) {
            bigInteger2 = pl2.b.b.shiftLeft(this.b).subtract(bigInteger);
        }
        BigInteger add = shiftRight;
        if (shiftRight.signum() == -1) {
            add = shiftRight;
            if (!bigInteger2.equals(pl2.b.a)) {
                add = shiftRight.add(pl2.b.b);
            }
        }
        final String string = add.toString();
        final char[] array = new char[this.b];
        final String string2 = bigInteger2.toString(2);
        final int length = string2.length();
        final int n = this.b - length;
        final int n2 = 0;
        int n3 = 0;
        int i;
        while (true) {
            i = n2;
            if (n3 >= n) {
                break;
            }
            array[n3] = '0';
            ++n3;
        }
        while (i < length) {
            array[n + i] = string2.charAt(i);
            ++i;
        }
        final String s = new String(array);
        final StringBuffer sb = new StringBuffer(string);
        sb.append(".");
        sb.append(s);
        return sb.toString();
    }
}
