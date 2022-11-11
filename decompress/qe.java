// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import c00.j;
import af2.h;
import jl0.i;
import com.reddit.screen.BaseScreen;
import yu1.c;
import k42.a;
import yq1.d;
import n42.g;
import javax.inject.Provider;
import iv0.b;
import af2.e;

public final class qe
{
    public final a1 a;
    public e b;
    public b c;
    public Provider<g> d;
    public d e;
    public e f;
    public Provider<jl0.d> g;
    public Provider<m42.b> h;
    public Provider<a> i;
    public Provider<yu1.b> j;
    
    public qe(final a1 a, final c c, final BaseScreen baseScreen, final yu1.a a2) {
        this.a = a;
        this.b = af2.e.a((Object)c);
        final b b = iv0.b.b((Provider)af2.e.a((Object)baseScreen));
        this.c = b;
        final Provider b2 = af2.c.b((Provider)ei1.a.b((Provider)b));
        this.d = (Provider<g>)b2;
        this.e = yq1.d.a(b2, (Provider)a.d0);
        this.f = af2.e.a((Object)a2);
        this.g = (Provider<jl0.d>)af2.h.a((Provider)jl0.i.a((Provider)a.m));
        final Provider b3 = af2.c.b((Provider)new b((Provider)this.c, 18));
        this.h = (Provider<m42.b>)b3;
        final Provider b4 = af2.c.b((Provider)new vx.d((Provider)this.c, b3, (Provider)a.e0, 25));
        this.i = (Provider<a>)b4;
        this.j = (Provider<yu1.b>)af2.c.b((Provider)new j((Provider)this.b, (Provider)a.X, (Provider)this.e, (Provider)a.m, (Provider)a.W, (Provider)a.d0, (Provider)this.f, (Provider)this.g, (Provider)a.p4, b4, 6));
    }
}
