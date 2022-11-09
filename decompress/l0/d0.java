// 
// Decompiled by Procyon v0.6.0
// 

package l0;

import ah2.f;

public final class d0<T> implements s<T>
{
    public final float a;
    public final float b;
    public final T c;
    
    public d0() {
        this(null, 7);
    }
    
    public d0(final Object c, final float a, final float b) {
        this.a = a;
        this.b = b;
        this.c = (T)c;
    }
    
    @Override
    public final i0 a(final g0 g0) {
        f.f((Object)g0, "converter");
        final float a = this.a;
        final float b = this.b;
        final T c = this.c;
        i i;
        if (c == null) {
            i = null;
        }
        else {
            i = (i)g0.a().invoke((Object)c);
        }
        return new s0(a, b, i);
    }
    
    @Override
    public final boolean equals(final Object o) {
        final boolean b = o instanceof d0;
        boolean b2 = true;
        if (b) {
            final d0 d0 = (d0)o;
            if (d0.a == this.a && d0.b == this.b && f.a((Object)d0.c, (Object)this.c)) {
                return b2;
            }
        }
        b2 = false;
        return b2;
    }
    
    @Override
    public final int hashCode() {
        final T c = this.c;
        int hashCode;
        if (c != null) {
            hashCode = c.hashCode();
        }
        else {
            hashCode = 0;
        }
        return Float.hashCode(this.b) + a.a(this.a, hashCode * 31, 31);
    }
}
