// 
// Decompiled by Procyon v0.6.0
// 

package qm2;

import al0.b;
import vl.a;

public final class d
{
    public int[] a;
    
    public d(final byte[] array) {
        if (array.length <= 4) {
            throw new IllegalArgumentException("invalid encoding");
        }
        final boolean b = false;
        final int h = vl.a.h(0, array);
        final int n = h - 1;
        final int a = c.a;
        int n2;
        if (n == 0) {
            n2 = 1;
        }
        else {
            int n3;
            if ((n3 = n) < 0) {
                n3 = -n;
            }
            int n4 = 0;
            int n5 = n3;
            while (true) {
                n2 = n4;
                if (n5 <= 0) {
                    break;
                }
                ++n4;
                n5 >>>= 8;
            }
        }
        if (array.length == h * n2 + 4) {
            this.a = new int[h];
            for (int i = 0; i < h; ++i) {
                final int[] a2 = this.a;
                int j = n2 - 1;
                int n6 = 0;
                while (j >= 0) {
                    n6 |= (array[i * n2 + 4 + j] & 0xFF) << j * 8;
                    --j;
                }
                a2[i] = n6;
            }
            final int[] a3 = this.a;
            final int length = a3.length;
            final boolean[] array2 = new boolean[length];
            int k = 0;
            while (true) {
                while (k < length) {
                    final int n7 = a3[k];
                    int n8 = b ? 1 : 0;
                    if (n7 >= 0) {
                        n8 = (b ? 1 : 0);
                        if (n7 < length) {
                            if (!array2[n7]) {
                                array2[n7] = true;
                                ++k;
                                continue;
                            }
                            n8 = (b ? 1 : 0);
                        }
                    }
                    if (n8 != 0) {
                        return;
                    }
                    throw new IllegalArgumentException("invalid encoding");
                }
                int n8 = 1;
                continue;
            }
        }
        throw new IllegalArgumentException("invalid encoding");
    }
    
    public final byte[] a() {
        final int length = this.a.length;
        final int n = length - 1;
        final int a = c.a;
        final int n2 = 0;
        int n3;
        if (n == 0) {
            n3 = 1;
        }
        else {
            int i;
            if ((i = n) < 0) {
                i = -n;
            }
            int n4 = 0;
            while (i > 0) {
                ++n4;
                i >>>= 8;
            }
            n3 = n4;
        }
        final byte[] array = new byte[length * n3 + 4];
        vl.a.f(length, 0, array);
        for (int j = n2; j < length; ++j) {
            final int n5 = this.a[j];
            for (int k = n3 - 1; k >= 0; --k) {
                array[j * n3 + 4 + k] = (byte)(n5 >>> k * 8);
            }
        }
        return array;
    }
    
    @Override
    public final boolean equals(final Object o) {
        final boolean b = o instanceof d;
        boolean b2 = false;
        if (!b) {
            return false;
        }
        final d d = (d)o;
        final int[] a = this.a;
        final int[] a2 = d.a;
        if (a.length == a2.length) {
            int i = a.length - 1;
            b2 = true;
            while (i >= 0) {
                b2 &= (a[i] == a2[i]);
                --i;
            }
        }
        return b2;
    }
    
    @Override
    public final int hashCode() {
        return rm2.a.f(this.a);
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("[");
        r.append(this.a[0]);
        String s = r.toString();
        for (int i = 1; i < this.a.length; ++i) {
            final StringBuilder q = d.q(s, ", ");
            q.append(this.a[i]);
            s = q.toString();
        }
        return b.h(s, "]");
    }
}
