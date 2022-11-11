// 
// Decompiled by Procyon v0.6.0
// 

package h7;

import al0.g7;
import sg2.e;

public final class h<V>
{
    public final V a;
    public final boolean b;
    
    public h(final V a, final boolean b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof h)) {
            return false;
        }
        final V a = this.a;
        final h h = (h)o;
        return e.a((Object)a, (Object)h.a) && this.b == h.b;
    }
    
    @Override
    public final int hashCode() {
        final V a = this.a;
        int hashCode;
        if (a == null) {
            hashCode = 0;
        }
        else {
            hashCode = a.hashCode();
        }
        return Boolean.hashCode(this.b) + hashCode * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("Input(value = ");
        r.append(this.a);
        r.append(", defined = ");
        return g7.m(r, this.b, ')');
    }
    
    public static final class a
    {
        public static h a() {
            return new h(null, false);
        }
        
        public static h b(final Object o) {
            return new h((V)o, true);
        }
        
        public static h c(final Object o) {
            h b;
            if (o == null) {
                b = null;
            }
            else {
                b = b(o);
            }
            h a = b;
            if (b == null) {
                a = a();
            }
            return a;
        }
    }
}
