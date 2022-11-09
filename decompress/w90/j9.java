// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import w30.d;
import ca0.o0;
import com.reddit.screen.BaseScreen;
import ei1.a;
import q20.c;
import javax.inject.Provider;
import iv0.b;
import af2.e;

public final class j9
{
    public e a;
    public e b;
    public b c;
    public Provider<c> d;
    public a e;
    public v10.e f;
    public Provider<wj1.b> g;
    
    public j9(final a1 a1, final wj1.c c, final wj1.a a2, final BaseScreen baseScreen) {
        this.a = af2.e.a((Object)c);
        this.b = af2.e.a((Object)a2);
        final b b = iv0.b.b((Provider)af2.e.a((Object)baseScreen));
        this.c = b;
        this.d = (Provider<c>)af2.c.b((Provider)ei1.a.a((Provider)b));
        this.e = ei1.a.c((Provider)a1.m);
        this.f = v10.e.a((Provider)a1.c0, (Provider)a1.m, (Provider)this.c, (Provider)a1.n, (Provider)a1.i, (Provider)a1.B2, (Provider)a1.V, (Provider)this.e, (Provider)mw.b.b(), (Provider)a1.i0, (Provider)a1.C2);
        this.g = (Provider<wj1.b>)af2.c.b((Provider)new d((Provider)this.a, (Provider)this.b, this.d, (Provider)this.f, (Provider)a1.D2, (Provider)o0.d((Provider)a1.h), 3));
    }
}
