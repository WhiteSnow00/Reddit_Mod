// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import cz.d;
import cz.c;
import javax.inject.Provider;
import vg0.a;
import vx.b;
import af2.e;

public final class ke
{
    public final a1 a;
    public e b;
    public e c;
    public b d;
    public a e;
    public uy.b f;
    public e g;
    public Provider<cz.b> h;
    
    public ke(final a1 a, final c c, final zg2.a a2, final zg2.a a3, final zg2.a a4, final ly.c c2, final cz.a a5) {
        this.a = a;
        this.b = af2.e.a((Object)c);
        this.c = af2.e.a((Object)a5);
        this.d = vx.b.a((Provider)af2.e.a((Object)a2), (Provider)a.C);
        this.e = new a((Provider)a.h, 0);
        this.f = uy.b.b((Provider)af2.e.a((Object)a3), (Provider)a.S, (Provider)this.d);
        this.g = af2.e.a((Object)a4);
        this.h = (Provider<cz.b>)af2.c.b((Provider)new d((Provider)this.b, (Provider)this.c, (Provider)a.z, (Provider)this.d, (Provider)a.m, (Provider)a.X1, (Provider)this.e, (Provider)uy.b.a((Provider)this.f, (Provider)this.g, af2.e.a((Object)c2)), 0));
    }
}
