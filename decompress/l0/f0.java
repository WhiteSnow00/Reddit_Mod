// 
// Decompiled by Procyon v0.6.0
// 

package l0;

import sg2.e;

public final class f0<T> implements p<T>
{
    public final int a;
    public final int b;
    public final q c;
    
    public f0() {
        this(0, null, 7);
    }
    
    public f0(final int a, final int b, final q c) {
        e.f((Object)c, "easing");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final i0 a(final g0 g0) {
        e.f((Object)g0, "converter");
        return (i0)new u0(this.a, this.b, this.c);
    }
    
    public final m0 a(final g0 g0) {
        e.f((Object)g0, "converter");
        return (m0)new u0(this.a, this.b, this.c);
    }
    
    @Override
    public final boolean equals(final Object o) {
        final boolean b = o instanceof f0;
        boolean b3;
        final boolean b2 = b3 = false;
        if (b) {
            final f0 f0 = (f0)o;
            b3 = b2;
            if (f0.a == this.a) {
                b3 = b2;
                if (f0.b == this.b) {
                    b3 = b2;
                    if (e.a((Object)f0.c, (Object)this.c)) {
                        b3 = true;
                    }
                }
            }
        }
        return b3;
    }
    
    @Override
    public final int hashCode() {
        return (this.c.hashCode() + this.a * 31) * 31 + this.b;
    }
}
