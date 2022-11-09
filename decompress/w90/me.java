// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import ly.c;
import dz.d;
import dz.f;
import javax.inject.Provider;
import vg0.a;
import vx.b;
import af2.e;

public final class me
{
    public final a1 a;
    public e b;
    public b c;
    public e d;
    public a e;
    public uy.b f;
    public e g;
    public Provider<dz.e> h;
    
    public me(final a1 a, final f f, final d d, final zg2.a a2, final zg2.a a3, final zg2.a a4, final c c) {
        this.a = a;
        this.b = af2.e.a((Object)f);
        this.c = vx.b.a((Provider)af2.e.a((Object)a2), (Provider)a.C);
        this.d = af2.e.a((Object)d);
        this.e = new a((Provider)a.h, 0);
        this.f = uy.b.b((Provider)af2.e.a((Object)a3), (Provider)a.S, (Provider)this.c);
        this.g = af2.e.a((Object)a4);
        this.h = (Provider<dz.e>)af2.c.b((Provider)new ri.d((Provider)this.b, (Provider)this.c, (Provider)this.d, (Provider)a.z, (Provider)a.m, (Provider)this.e, (Provider)uy.b.a((Provider)this.f, (Provider)this.g, af2.e.a((Object)c)), 1));
    }
}
