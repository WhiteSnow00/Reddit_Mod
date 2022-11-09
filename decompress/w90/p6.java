// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import com.reddit.screen.BaseScreen;
import l01.b;
import l01.c;
import fo0.a;
import javax.inject.Provider;
import v40.d;
import af2.e;

public final class p6
{
    public final a1 a;
    public e b;
    public e c;
    public d d;
    public e e;
    public Provider<a> f;
    public Provider<c> g;
    
    public p6(final a1 a, final l01.d d, final b b, final BaseScreen baseScreen) {
        this.a = a;
        this.b = af2.e.a((Object)d);
        this.c = af2.e.a((Object)b);
        this.d = new d((Provider)a.o0, (Provider)a.G1, (Provider)a.Q2, (Provider)a.R2, 3);
        final e a2 = af2.e.a((Object)baseScreen);
        this.e = a2;
        this.f = (Provider<a>)af2.c.b((Provider)vx.d.c((Provider)iv0.b.b((Provider)a2), (Provider)a.N2, (Provider)a.w));
        this.g = (Provider<c>)af2.c.b((Provider)new r40.a((Provider)this.b, (Provider)this.c, (Provider)this.d, (Provider)this.f, (Provider)a.m, (Provider)a.c0, (Provider)ww0.c.a((Provider)this.e), 4));
    }
}
