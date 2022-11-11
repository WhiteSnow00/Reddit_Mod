// 
// Decompiled by Procyon v0.6.0
// 

package hi2;

import sg2.e;
import hh2.t;

public abstract class g<T>
{
    public final T a;
    
    public g(final T a) {
        this.a = a;
    }
    
    public abstract ti2.t a(final t p0);
    
    public T b() {
        return this.a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this != o) {
            final Object b = this.b();
            final boolean b2 = o instanceof g;
            Object b3 = null;
            g g;
            if (b2) {
                g = (g)o;
            }
            else {
                g = null;
            }
            if (g != null) {
                b3 = g.b();
            }
            if (!e.a(b, b3)) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        final Object b = this.b();
        int hashCode;
        if (b != null) {
            hashCode = b.hashCode();
        }
        else {
            hashCode = 0;
        }
        return hashCode;
    }
    
    @Override
    public String toString() {
        return String.valueOf(this.b());
    }
}
