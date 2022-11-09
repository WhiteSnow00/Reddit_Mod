// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import java.util.Map;
import e40.k;
import af2.c;
import vx.d;
import af2.e;
import jn1.a$a;
import com.reddit.screen.BaseScreen;
import o72.h;
import sn1.j;
import o20.a;
import javax.inject.Provider;
import iv0.b;

public final class xj implements du
{
    public final kl a;
    public b b;
    public Provider<a> c;
    public Provider<j> d;
    public Provider<h> e;
    
    public xj(final kl a, final BaseScreen baseScreen, final jn1.b b, final a$a a$a) {
        this.a = a;
        final b b2 = iv0.b.b((Provider)af2.e.a((Object)baseScreen));
        this.b = b2;
        final Provider b3 = af2.c.b((Provider)vx.d.b((Provider)b2, (Provider)a.N, (Provider)a.P));
        this.c = (Provider<a>)b3;
        this.d = (Provider<j>)af2.c.b((Provider)new k((Provider)this.b, (Provider)a.u0, b3, 28));
        this.e = (Provider<h>)af2.c.b((Provider)hx.a.c((Provider)this.b, (Provider)a.o, (Provider)a.S2, (Provider)a.e));
    }
    
    public final Map<Class<?>, yt<?, ?>> getSubFeatureInjectors() {
        return this.a.k();
    }
}
