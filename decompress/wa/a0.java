// 
// Decompiled by Procyon v0.6.0
// 

package wa;

import bc.j;
import bd.c0;
import ah0.b;
import com.google.android.exoplayer2.source.i$b;

public final class a0
{
    public final i$b a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    
    public a0(final i$b a, final long b, final long c, final long d, final long e, final boolean f, final boolean g, final boolean h, final boolean i) {
        final boolean b2 = false;
        ah0.b.C(!i || g);
        ah0.b.C(!h || g);
        boolean b3 = false;
        Label_0096: {
            if (f) {
                b3 = b2;
                if (g) {
                    break Label_0096;
                }
                b3 = b2;
                if (h) {
                    break Label_0096;
                }
                b3 = b2;
                if (i) {
                    break Label_0096;
                }
            }
            b3 = true;
        }
        ah0.b.C(b3);
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    public final a0 a(final long n) {
        a0 a0;
        if (n == this.c) {
            a0 = this;
        }
        else {
            a0 = new a0(this.a, this.b, n, this.d, this.e, this.f, this.g, this.h, this.i);
        }
        return a0;
    }
    
    public final a0 b(final long n) {
        a0 a0;
        if (n == this.b) {
            a0 = this;
        }
        else {
            a0 = new a0(this.a, n, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
        }
        return a0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && a0.class == o.getClass()) {
            final a0 a0 = (a0)o;
            if (this.b != a0.b || this.c != a0.c || this.d != a0.d || this.e != a0.e || this.f != a0.f || this.g != a0.g || this.h != a0.h || this.i != a0.i || !c0.a((Object)this.a, (Object)a0.a)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return ((((((((((j)this.a).hashCode() + 527) * 31 + (int)this.b) * 31 + (int)this.c) * 31 + (int)this.d) * 31 + (int)this.e) * 31 + (this.f ? 1 : 0)) * 31 + (this.g ? 1 : 0)) * 31 + (this.h ? 1 : 0)) * 31 + (this.i ? 1 : 0);
    }
}
