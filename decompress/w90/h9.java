// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import a40.g;
import ca0.o0;
import xj1.a;
import com.reddit.screen.BaseScreen;
import javax.inject.Provider;
import d00.c;
import iv0.b;
import af2.e;

public final class h9
{
    public e a;
    public e b;
    public e c;
    public b d;
    public cx.b e;
    public c f;
    public Provider<xj1.b> g;
    
    public h9(final a1 a1, final xj1.c c, final BaseScreen baseScreen, final a a2) {
        this.a = af2.e.a((Object)c);
        this.b = af2.e.a((Object)a2);
        final e a3 = af2.e.a((Object)baseScreen);
        this.c = a3;
        final b b = iv0.b.b((Provider)a3);
        this.d = b;
        this.e = cx.b.c((Provider)b, (Provider)this.c, (Provider)a1.w, (Provider)a1.T, (Provider)a1.d3);
        this.f = new c((Provider)this.d, (Provider)a1.V, 20);
        this.g = (Provider<xj1.b>)af2.c.b((Provider)new g((Provider)this.a, (Provider)this.b, (Provider)this.e, (Provider)this.f, (Provider)a1.m, (Provider)a1.D2, (Provider)o0.d((Provider)a1.h), (Provider)a1.e0, 3));
    }
}
