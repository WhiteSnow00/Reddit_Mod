// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import java.util.Map;
import af2.h;
import com.reddit.domain.model.mod.ModPermissions;
import com.reddit.domain.model.Subreddit;
import q20.c;
import ch0.d;
import ch0.e;
import th0.m;
import javax.inject.Provider;
import ub1.b;
import android.content.Context;
import zg2.a;
import com.reddit.domain.modtools.communitysettings.CommunitySettingsChangedTarget;

public final class rn implements du
{
    public final CommunitySettingsChangedTarget a;
    public final a<? extends Context> b;
    public final b c;
    public final kl d;
    public Provider<m> e;
    public Provider<e> f;
    public af2.e g;
    public Provider<d> h;
    public af2.e i;
    public Provider<j31.a> j;
    public Provider<c> k;
    
    public rn(final kl d, final w11.b b, final w11.a a, final a b2, final b c, final CommunitySettingsChangedTarget a2, final Subreddit subreddit, final ModPermissions modPermissions) {
        this.d = d;
        this.a = a2;
        this.b = (a<? extends Context>)b2;
        this.c = c;
        this.e = (Provider<m>)af2.h.a((Provider)new qb0.b((Provider)d.F, 12));
        this.f = (Provider<e>)af2.c.b((Provider)new vg0.a((Provider)d.F, 2));
        this.g = af2.e.a((Object)subreddit);
        this.h = (Provider<d>)af2.c.b((Provider)new vx.d((Provider)d.F, (Provider)this.g, (Provider)af2.e.a((Object)modPermissions), 13));
        final af2.e a3 = af2.e.a((Object)b2);
        this.i = a3;
        this.j = (Provider<j31.a>)af2.c.b((Provider)new j31.d((Object)a3, 0));
        this.k = (Provider<c>)af2.c.b((Provider)ei1.a.a((Provider)this.i));
    }
    
    public final Map<Class<?>, yt<?, ?>> getSubFeatureInjectors() {
        return this.d.k();
    }
}
