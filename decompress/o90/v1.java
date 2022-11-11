// 
// Decompiled by Procyon v0.6.0
// 

package o90;

import gp1.c$a;
import se2.c;
import nx0.g;
import kq1.a;
import com.reddit.screens.chat.analytics.ChatAnalytics;
import javax.inject.Provider;
import cx.b;
import se2.e;

public final class v1
{
    public e a;
    public e b;
    public b c;
    public Provider<ChatAnalytics> d;
    public Provider<a> e;
    
    public v1(final z0 z0, final kq1.b b, final rg2.a a, final rg2.a a2) {
        this.a = se2.e.a((Object)b);
        this.b = se2.e.a((Object)a2);
        this.c = cx.b.b((Provider)se2.e.a((Object)a), (Provider)z0.j0, (Provider)z0.w, (Provider)z0.L0, (Provider)z0.M0, (Provider)z0.N0);
        final Provider b2 = se2.c.b((Provider)px.a.a((Provider)z0.K0, g.a((Provider)z0.K0, (Provider)z0.r), (Provider)z0.b0, (Provider)z0.c, (Provider)z0.h));
        this.d = (Provider<ChatAnalytics>)b2;
        this.e = (Provider<a>)se2.c.b((Provider)new q30.e((Provider)this.a, (Provider)this.b, (Provider)this.c, (Provider)z0.Y0, (Provider)c$a.a, b2, 11));
    }
}
