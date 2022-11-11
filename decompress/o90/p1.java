// 
// Decompiled by Procyon v0.6.0
// 

package o90;

import nx0.g;
import rg2.a;
import mo1.c;
import com.reddit.screens.chat.analytics.ChatAnalytics;
import javax.inject.Provider;
import cx.b;
import se2.e;

public final class p1
{
    public e a;
    public e b;
    public b c;
    public Provider<ChatAnalytics> d;
    public Provider<mo1.b> e;
    
    public p1(final z0 z0, final c c, final a a, final mo1.a a2) {
        this.a = se2.e.a((Object)c);
        this.b = se2.e.a((Object)a2);
        this.c = cx.b.b((Provider)se2.e.a((Object)a), (Provider)z0.j0, (Provider)z0.w, (Provider)z0.L0, (Provider)z0.M0, (Provider)z0.N0);
        final Provider b = se2.c.b((Provider)px.a.a((Provider)z0.K0, g.a((Provider)z0.K0, (Provider)z0.r), (Provider)z0.b0, (Provider)z0.c, (Provider)z0.h));
        this.d = (Provider<ChatAnalytics>)b;
        this.e = (Provider<mo1.b>)se2.c.b((Provider)new hx.c((Provider)this.a, (Provider)this.b, (Provider)z0.X0, (Provider)this.c, b, 12));
    }
}
