// 
// Decompiled by Procyon v0.6.0
// 

package kk2;

public final class e
{
    public static final d[] d;
    public d[] a;
    public int b;
    public boolean c;
    
    static {
        d = new d[0];
    }
    
    public e() {
        this(10);
    }
    
    public e(final int n) {
        if (n >= 0) {
            d[] d;
            if (n == 0) {
                d = e.d;
            }
            else {
                d = new d[n];
            }
            this.a = d;
            this.b = 0;
            this.c = false;
            return;
        }
        throw new IllegalArgumentException("'initialCapacity' must not be negative");
    }
    
    public final void a(final d d) {
        if (d != null) {
            final d[] a = this.a;
            final int length = a.length;
            int b = this.b;
            boolean b2 = true;
            if (++b <= length) {
                b2 = false;
            }
            if (this.c | b2) {
                final d[] a2 = new d[Math.max(a.length, (b >> 1) + b)];
                System.arraycopy(this.a, 0, a2, 0, this.b);
                this.a = a2;
                this.c = false;
            }
            this.a[this.b] = d;
            this.b = b;
            return;
        }
        throw new NullPointerException("'element' cannot be null");
    }
    
    public final d b(final int n) {
        if (n < this.b) {
            return this.a[n];
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(n);
        sb.append(" >= ");
        sb.append(this.b);
        throw new ArrayIndexOutOfBoundsException(sb.toString());
    }
    
    public final d[] c() {
        final int b = this.b;
        if (b == 0) {
            return e.d;
        }
        final d[] a = this.a;
        if (a.length == b) {
            this.c = true;
            return a;
        }
        final d[] array = new d[b];
        System.arraycopy(a, 0, array, 0, b);
        return array;
    }
}
