// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import td1.r$a;
import com.reddit.screen.BaseScreen;
import td1.c;
import td1.q;
import com.reddit.screen.composewidgets.KeyboardExtensionsPresenter;
import fo0.a;
import javax.inject.Provider;
import lx.d;
import qb0.b;
import af2.e;

public final class n6
{
    public final a1 a;
    public e b;
    public u60.e c;
    public e d;
    public b e;
    public d f;
    public Provider<a> g;
    public Provider<KeyboardExtensionsPresenter> h;
    public Provider<q> i;
    public Provider<td1.b> j;
    
    public n6(final a1 a, final c c, final td1.a a2, final BaseScreen baseScreen) {
        this.a = a;
        this.b = af2.e.a((Object)a2);
        this.c = u60.e.b((Provider)a.F1, (Provider)a.o0, (Provider)a.G1, (Provider)a.k, (Provider)a.C1, (Provider)a.j0, (Provider)a.i, (Provider)a.H1, (Provider)a.D1, (Provider)a.r);
        this.d = af2.e.a((Object)c);
        this.e = qb0.b.a((Provider)a.h);
        this.f = new d((Provider)a.F1, (Provider)a.o0, (Provider)a.G1, (Provider)a.k, (Provider)a.P2, 1);
        final Provider b = af2.c.b((Provider)vx.d.c((Provider)iv0.b.b((Provider)af2.e.a((Object)baseScreen)), (Provider)a.N2, (Provider)a.w));
        this.g = (Provider<a>)b;
        this.h = (Provider<KeyboardExtensionsPresenter>)af2.c.b((Provider)new c60.c((Provider)this.c, (Provider)this.b, (Provider)this.d, (Provider)a.m, (Provider)a.N2, (Provider)this.e, (Provider)a.O2, (Provider)a.P2, (Provider)this.f, (Provider)a.y, (Provider)a.o0, (Provider)a.k, (Provider)a.C1, b, (Provider)a.D1, 2));
        final Provider b2 = af2.c.b((Provider)r$a.a);
        this.i = (Provider<q>)b2;
        this.j = (Provider<td1.b>)af2.c.b((Provider)new e40.d((Provider)this.b, (Provider)this.h, b2, 14));
    }
}
