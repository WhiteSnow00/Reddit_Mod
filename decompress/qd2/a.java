// 
// Decompiled by Procyon v0.6.0
// 

package qd2;

public final class a
{
    public double[] a;
    public int b;
    public int c;
    
    public a() {
        this.a = new double[16];
        this.b = -1;
        this.c = -1;
    }
    
    public static double b(final a a) {
        final int c = a.c;
        final int b = a.b;
        int n = 1;
        int n2 = c - b + 1;
        if (n2 < 1) {
            a.getClass();
            throw new IllegalArgumentException("inclusionCount cannot be less than 1.");
        }
        if (n2 <= c - b + 1) {
            double n3 = 0.0;
            double n5;
            double n4 = n5 = 0.0;
            if (1 <= n2) {
                while (true) {
                    n4 = (n5 = n4 + n);
                    if (n == n2) {
                        break;
                    }
                    ++n;
                }
            }
            int c2 = a.c;
            final int n6 = c2 - (n2 - 1);
            double n7 = n3;
            if (c2 >= n6) {
                while (true) {
                    n3 += n2 / n5 * a.a[c2];
                    --n2;
                    n7 = n3;
                    if (c2 == n6) {
                        break;
                    }
                    --c2;
                }
            }
            return n7;
        }
        throw new IllegalArgumentException("inclusionCount cannot be greater than the inserted value count.");
    }
    
    public final void a(final double n) {
        final int c = this.c;
        final int b = this.b;
        if (c - b + 1 == 5) {
            this.b = b + 1;
        }
        final double[] a = this.a;
        if (c == a.length - 1) {
            final double[] a2 = new double[a.length * 2];
            final int b2 = this.b;
            final int n2 = c - b2 + 1;
            System.arraycopy(a, b2, a2, 0, n2);
            this.a = a2;
            this.b = 0;
            this.c = n2 - 1;
        }
        final int n3 = this.c + 1;
        if ((this.c = n3) == 0) {
            this.b = n3;
        }
        this.a[n3] = n;
    }
}
