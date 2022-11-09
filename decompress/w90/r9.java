// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import ca0.o0;
import com.reddit.screen.BaseScreen;
import ek1.c;
import javax.inject.Provider;
import ei1.a;
import iv0.b;
import af2.e;

public final class r9
{
    public e a;
    public e b;
    public b c;
    public a d;
    public v10.e e;
    public e f;
    public Provider<ek1.b> g;
    
    public r9(final a1 a1, final c c, final BaseScreen baseScreen, final ek1.a a2, final String s) {
        this.a = af2.e.a((Object)c);
        this.b = af2.e.a((Object)a2);
        this.c = iv0.b.b((Provider)af2.e.a((Object)baseScreen));
        this.d = ei1.a.c((Provider)a1.m);
        this.e = v10.e.a((Provider)a1.c0, (Provider)a1.m, (Provider)this.c, (Provider)a1.n, (Provider)a1.i, (Provider)a1.B2, (Provider)a1.V, (Provider)this.d, (Provider)mw.b.b(), (Provider)a1.i0, (Provider)a1.C2);
        this.f = af2.e.b((Object)s);
        this.g = (Provider<ek1.b>)af2.c.b((Provider)new bb0.b((Provider)this.a, (Provider)this.b, (Provider)this.e, (Provider)a1.B2, (Provider)this.f, (Provider)o0.d((Provider)a1.h), 5));
    }
}
