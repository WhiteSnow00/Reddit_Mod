// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import iz.f;
import iv0.b;
import io0.c;
import com.reddit.screen.BaseScreen;
import io0.d;
import fo0.a;
import javax.inject.Provider;
import af2.e;

public final class l7
{
    public final a1 a;
    public e b;
    public e c;
    public e d;
    public Provider<a> e;
    public Provider<d> f;
    
    public l7(final a1 a, final io0.e e, final BaseScreen baseScreen, final c c) {
        this.a = a;
        this.b = af2.e.a((Object)e);
        this.c = af2.e.a((Object)c);
        final e a2 = af2.e.a((Object)baseScreen);
        this.d = a2;
        this.e = (Provider<a>)af2.c.b((Provider)vx.d.c((Provider)iv0.b.b((Provider)a2), (Provider)a.N2, (Provider)a.w));
        this.f = (Provider<d>)af2.c.b((Provider)new f((Provider)this.b, (Provider)this.c, (Provider)a.G1, (Provider)a.R2, (Provider)a.F1, (Provider)a.o0, (Provider)this.e, (Provider)a.m, (Provider)ww0.c.a((Provider)this.d), 3));
    }
}
