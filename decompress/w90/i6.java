// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import com.reddit.screen.BaseScreen;
import ts0.c;
import ts0.b;
import ws0.a;
import javax.inject.Provider;
import af2.e;

public final class i6
{
    public e a;
    public e b;
    public e c;
    public Provider<a> d;
    public Provider<b> e;
    
    public i6(final a1 a1, final c c, final ts0.a a2, final BaseScreen baseScreen) {
        this.a = af2.e.a((Object)c);
        this.b = af2.e.a((Object)a2);
        final e a3 = af2.e.a((Object)baseScreen);
        this.c = a3;
        final Provider b = af2.c.b((Provider)p40.a.a((Provider)iv0.b.b((Provider)a3), (Provider)a1.w, (Provider)a1.E, (Provider)this.c));
        this.d = (Provider<a>)b;
        this.e = (Provider<b>)af2.c.b((Provider)new sx.b((Provider)this.a, (Provider)this.b, (Provider)a1.c, b, (Provider)a1.F, 6));
    }
}
