// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import iv0.b;
import com.reddit.screen.BaseScreen;
import c31.g;
import c31.f;
import com.reddit.events.community.CommunityPostTypesSettingsAnalytics;
import d31.a;
import javax.inject.Provider;
import e40.k;
import d00.c;
import af2.e;

public final class o8
{
    public e a;
    public e b;
    public c c;
    public k d;
    public Provider<a> e;
    public Provider<CommunityPostTypesSettingsAnalytics> f;
    public Provider<f> g;
    
    public o8(final a1 a1, final g g, final c31.e e, final BaseScreen baseScreen) {
        this.a = af2.e.a((Object)g);
        this.b = af2.e.a((Object)e);
        this.c = d00.c.b((Provider)a1.y, (Provider)a1.m);
        this.d = k.a((Provider)a1.y, (Provider)a1.m, (Provider)a1.r);
        this.e = (Provider<a>)af2.c.b((Provider)new b((Provider)iv0.b.b((Provider)af2.e.a((Object)baseScreen)), 2));
        final Provider b = af2.c.b((Provider)new qb0.b((Provider)a1.h, 11));
        this.f = (Provider<CommunityPostTypesSettingsAnalytics>)b;
        this.g = (Provider<f>)af2.c.b((Provider)new iz.g((Provider)this.a, (Provider)this.b, (Provider)a1.y, (Provider)this.c, (Provider)this.d, (Provider)a1.w, (Provider)this.e, b, (Provider)a1.m, (Provider)a1.r, 3));
    }
}
