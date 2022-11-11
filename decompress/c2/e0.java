// 
// Decompiled by Procyon v0.6.0
// 

package c2;

import u2.a;
import hg2.j;
import o1.u;
import rg2.l;
import u2.i;
import androidx.compose.ui.layout.PlaceableKt;
import lw0.b;

public abstract class e0 implements v
{
    public int f;
    public int g;
    public long h;
    public long i;
    
    public e0() {
        this.h = b.l(0, 0);
        this.i = PlaceableKt.b;
    }
    
    public final long K() {
        final int f = this.f;
        final long h = this.h;
        return a92.b.j((f - (int)(h >> 32)) / 2, (this.g - u2.i.b(h)) / 2);
    }
    
    public int S() {
        return u2.i.b(this.h);
    }
    
    public int X() {
        return (int)(this.h >> 32);
    }
    
    public abstract void j0(final long p0, final float p1, final l<? super u, j> p2);
    
    public final void k0() {
        this.f = lg.e0.v((int)(this.h >> 32), u2.a.j(this.i), u2.a.h(this.i));
        this.g = lg.e0.v(u2.i.b(this.h), u2.a.i(this.i), u2.a.g(this.i));
    }
    
    public final void n0(final long h) {
        if (!u2.i.a(this.h, h)) {
            this.h = h;
            this.k0();
        }
    }
    
    public final void x0(final long i) {
        if (!u2.a.b(this.i, i)) {
            this.i = i;
            this.k0();
        }
    }
}
