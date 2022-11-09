// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import a40.g;
import com.reddit.screen.BaseScreen;
import qc1.d;
import qc1.c;
import javax.inject.Provider;
import mw.b;
import af2.e;

public final class oe
{
    public e a;
    public e b;
    public b c;
    public e d;
    public iv0.b e;
    public sa1.b f;
    public e g;
    public Provider<qc1.e> h;
    public Provider<c> i;
    
    public oe(final a1 a1, final d d, final qc1.b b, final BaseScreen baseScreen, final String s) {
        this.a = af2.e.a((Object)d);
        this.b = af2.e.a((Object)b);
        this.c = new b((Provider)a1.y1, 29);
        final e a2 = af2.e.a((Object)baseScreen);
        this.d = a2;
        this.e = iv0.b.b((Provider)a2);
        this.f = sa1.b.a((Provider)this.d);
        final e a3 = af2.e.a((Object)s);
        this.g = a3;
        final Provider b2 = af2.c.b((Provider)new n20.b((Provider)this.e, (Provider)this.f, (Provider)a1.w, (Provider)a3, 14));
        this.h = (Provider<qc1.e>)b2;
        this.i = (Provider<c>)af2.c.b((Provider)new g((Provider)this.a, (Provider)a1.w, (Provider)this.b, (Provider)this.c, b2, (Provider)a1.x1, (Provider)new vx.b((Provider)a1.h, (Provider)this.g, 19), (Provider)a1.r, 1));
    }
}
