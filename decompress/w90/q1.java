// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import lx.d;
import zg2.a;
import xo1.c;
import com.reddit.screens.chat.analytics.ChatAnalytics;
import javax.inject.Provider;
import n20.b;
import af2.e;

public final class q1
{
    public e a;
    public e b;
    public b c;
    public Provider<ChatAnalytics> d;
    public Provider<xo1.b> e;
    
    public q1(final a1 a1, final c c, final a a2, final xo1.a a3) {
        this.a = af2.e.a((Object)c);
        this.b = af2.e.a((Object)a3);
        this.c = n20.b.b((Provider)af2.e.a((Object)a2), (Provider)a1.w, (Provider)a1.J0, (Provider)a1.K0);
        final Provider b = af2.c.b((Provider)lx.d.a((Provider)a1.I0, n41.c.b((Provider)a1.I0, (Provider)a1.r), (Provider)a1.b0, (Provider)a1.c, (Provider)a1.h));
        this.d = (Provider<ChatAnalytics>)b;
        this.e = (Provider<xo1.b>)af2.c.b((Provider)new sx.b((Provider)this.a, (Provider)this.b, (Provider)a1.U0, (Provider)this.c, b, 8));
    }
}
