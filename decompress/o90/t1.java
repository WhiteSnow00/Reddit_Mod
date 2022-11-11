// 
// Decompiled by Procyon v0.6.0
// 

package o90;

import oa1.b;
import px.a;
import nx0.g;
import m20.c;
import com.reddit.screens.chat.analytics.ChatAnalytics;
import javax.inject.Provider;
import com.reddit.screen.BaseScreen;
import cp1.e;
import cp1.d;

public final class t1
{
    public final d a;
    public final e b;
    public final BaseScreen c;
    public final z0 d;
    public Provider<ChatAnalytics> e;
    public Provider<c> f;
    
    public t1(final z0 d, final e b, final d a, final BaseScreen c) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
        this.e = (Provider<ChatAnalytics>)se2.c.b((Provider)px.a.a((Provider)d.K0, g.a((Provider)d.K0, (Provider)d.r), (Provider)d.b0, (Provider)d.c, (Provider)d.h));
        this.f = (Provider<c>)se2.c.b((Provider)oa1.b.a((Provider)cz0.c.b((Provider)se2.e.a((Object)c))));
    }
}
