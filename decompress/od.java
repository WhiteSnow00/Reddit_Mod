// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import of0.k0;
import com.reddit.screen.BaseScreen;
import ku1.d;
import ku1.c;
import javax.inject.Provider;
import hx.a;
import iv0.b;
import af2.e;

public final class od
{
    public e a;
    public e b;
    public b c;
    public a d;
    public Provider<c> e;
    
    public od(final a1 a1, final d d, final ku1.b b, final BaseScreen baseScreen) {
        this.a = af2.e.a((Object)d);
        this.b = af2.e.a((Object)b);
        final b b2 = iv0.b.b((Provider)af2.e.a((Object)baseScreen));
        this.c = b2;
        this.d = hx.a.b((Provider)b2, a1.w, a1.c1, a1.a2);
        this.e = (Provider<c>)af2.c.b((Provider)new bb0.b((Provider)this.a, (Provider)this.b, (Provider)this.d, (Provider)r40.a.a((Provider)this.c, ms1.a.a((Provider)a1.b0, (Provider)a1.y), (Provider)a1.m, (Provider)a1.z0, (Provider)a1.A0), (Provider)a1.U0, (Provider)new k0((Provider)a1.h, 4), 8));
    }
}
