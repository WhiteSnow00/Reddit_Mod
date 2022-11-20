// 
// Decompiled by Procyon v0.6.0
// 

package tf2;

public final class d<T>
{
    public int a;
    public int b;
    public int c;
    public T[] d;
    
    public d() {
        this(16, 0);
    }
    
    public d(int n, final int n2) {
        n = 1 << 32 - Integer.numberOfLeadingZeros(n - 1);
        this.a = n - 1;
        this.c = (int)(0.75f * n);
        this.d = (T[])new Object[n];
    }
    
    public final void a(final Object o) {
        final T[] d = this.d;
        final int a = this.a;
        final int n = o.hashCode() * -1640531527;
        final int n2 = (n ^ n >>> 16) & a;
        final T t = d[n2];
        int n3 = n2;
        Label_0086: {
            if (t != null) {
                n3 = n2;
                if (t.equals(o)) {
                    return;
                }
                T t2;
                do {
                    n3 = (n3 + 1 & a);
                    t2 = d[n3];
                    if (t2 == null) {
                        break Label_0086;
                    }
                } while (!t2.equals(o));
                return;
            }
        }
        d[n3] = (T)o;
        int i = this.b + 1;
        if ((this.b = i) >= this.c) {
            final T[] d2 = this.d;
            int length = d2.length;
            final int n4 = length << 1;
            final int a2 = n4 - 1;
            final Object[] d3 = new Object[n4];
            while (i != 0) {
                T t3;
                do {
                    --length;
                    t3 = d2[length];
                } while (t3 == null);
                final int n5 = t3.hashCode() * -1640531527;
                int n7;
                int n6 = n7 = ((n5 ^ n5 >>> 16) & a2);
                if (d3[n6] != null) {
                    do {
                        n7 = (n6 = (n6 + 1 & a2));
                    } while (d3[n7] != null);
                }
                d3[n7] = d2[length];
                --i;
            }
            this.a = a2;
            this.c = (int)(n4 * 0.75f);
            this.d = (T[])d3;
        }
    }
    
    public final void b(int n, final int n2, final Object[] array) {
        --this.b;
    Block_1:
        while (true) {
            int n3 = n + 1;
            Object o;
            while (true) {
                n3 &= n2;
                o = array[n3];
                if (o == null) {
                    break Block_1;
                }
                final int n4 = o.hashCode() * -1640531527;
                final int n5 = (n4 ^ n4 >>> 16) & n2;
                if (n <= n3) {
                    if (n >= n5) {
                        break;
                    }
                    if (n5 > n3) {
                        break;
                    }
                }
                else if (n >= n5 && n5 > n3) {
                    break;
                }
                ++n3;
            }
            array[n] = o;
            n = n3;
        }
        array[n] = null;
    }
}
