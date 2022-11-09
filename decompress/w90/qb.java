// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import v40.d;
import com.reddit.screen.BaseScreen;
import q20.c;
import is1.a;
import gs1.y;
import javax.inject.Provider;
import g60.g1;
import iv0.b;
import af2.e;

public final class qb
{
    public e a;
    public e b;
    public b c;
    public sa1.b d;
    public g1 e;
    public vx.b f;
    public Provider<y> g;
    public Provider<a> h;
    public Provider<c> i;
    
    public qb(final a1 a1, final is1.b b, final BaseScreen baseScreen, final zg2.a a2) {
        this.a = af2.e.a((Object)b);
        final e a3 = af2.e.a((Object)baseScreen);
        this.b = a3;
        this.c = iv0.b.b((Provider)a3);
        this.d = sa1.b.a((Provider)this.b);
        final e a4 = af2.e.a((Object)a2);
        final g1 e = new g1((Provider)this.c, (Provider)this.d, (Provider)a1.w, (Provider)a1.E, (Provider)a1.c1, (Provider)a1.d1, (Provider)a4, 5);
        this.e = e;
        final vx.b f = new vx.b((Provider)a4, (Provider)a1.h, 20);
        this.f = f;
        final Provider b2 = af2.c.b((Provider)new d((Provider)a1.y, (Provider)new ww0.c((Object)a1.p, 17), (Provider)e, (Provider)f, 8));
        this.g = (Provider<y>)b2;
        this.h = (Provider<a>)af2.c.b((Provider)new l40.a((Provider)this.a, (Provider)this.e, (Provider)a1.r, (Provider)a1.y, (Provider)this.f, b2, 11));
        this.i = (Provider<c>)af2.c.b((Provider)ei1.a.a((Provider)this.c));
    }
}
