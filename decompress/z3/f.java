// 
// Decompiled by Procyon v0.6.0
// 

package z3;

public class f<T> implements e<T>
{
    public final Object[] a;
    public int b;
    
    public f(final int n) {
        if (n > 0) {
            this.a = new Object[n];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }
    
    @Override
    public T a() {
        final int b = this.b;
        if (b > 0) {
            final int n = b - 1;
            final Object[] a = this.a;
            final Object o = a[n];
            a[n] = null;
            this.b = b - 1;
            return (T)o;
        }
        return null;
    }
    
    @Override
    public boolean b(final T t) {
        int n = 0;
        int b;
        boolean b2;
        while (true) {
            b = this.b;
            if (n >= b) {
                b2 = false;
                break;
            }
            if (this.a[n] == t) {
                b2 = true;
                break;
            }
            ++n;
        }
        if (b2) {
            throw new IllegalStateException("Already in the pool!");
        }
        final Object[] a = this.a;
        if (b < a.length) {
            a[b] = t;
            this.b = b + 1;
            return true;
        }
        return false;
    }
}
