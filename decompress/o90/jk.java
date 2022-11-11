// 
// Decompiled by Procyon v0.6.0
// 

package o90;

import q90.e0;
import java.util.Map;
import com.reddit.data.events.models.AnalyticsPlatform;
import com.reddit.session.o;
import l40.e;
import com.reddit.events.notification.RedditNotificationAnalytics;
import ai0.f;
import mh1.d;
import com.reddit.notification.common.NotificationManagerFacade;
import ui.b;
import v10.n;
import se2.c;
import tg1.a$a;
import kotlin.random.Random;
import javax.inject.Provider;
import android.content.Context;
import rg2.a;

public final class jk implements yt
{
    public final a<? extends Context> a;
    public final dl b;
    public Provider<Random> c;
    
    public jk(final dl b, final a a) {
        this.b = b;
        this.a = a;
        this.c = (Provider<Random>)se2.c.b((Provider)a$a.a);
    }
    
    public final ng1.a a() {
        final a<? extends Context> a = this.a;
        final Random random = (Random)this.c.get();
        final n n = new n();
        final cw0.a a2 = ((e0)this.b.a).a();
        ui.b.n((Object)a2);
        final va0.b l6 = ((e0)this.b.a).L6();
        ui.b.n((Object)l6);
        return new ng1.a((a)a, random, n, a2, l6);
    }
    
    public final NotificationManagerFacade b() {
        final Context l = ((e0)this.b.a).l();
        ui.b.n((Object)l);
        final a20.a b2 = ((e0)this.b.a).B2();
        ui.b.n((Object)b2);
        return new NotificationManagerFacade(l, b2);
    }
    
    public final d c() {
        final w70.d v8 = ((e0)this.b.a).v8();
        ui.b.n((Object)v8);
        final f51.a m2 = ((e0)this.b.a).M2();
        ui.b.n((Object)m2);
        final qa0.a t7 = ((e0)this.b.a).T7();
        ui.b.n((Object)t7);
        return new d(v8, m2, t7);
    }
    
    public final f d() {
        final e s4 = ((e0)this.b.a).S4();
        ui.b.n((Object)s4);
        final o e = ((e0)this.b.a).E();
        ui.b.n((Object)e);
        final AnalyticsPlatform m8 = ((e0)this.b.a).m8();
        ui.b.n((Object)m8);
        final va0.b l6 = ((e0)this.b.a).L6();
        ui.b.n((Object)l6);
        final r00.a j7 = ((e0)this.b.a).j7();
        ui.b.n((Object)j7);
        return new f(new RedditNotificationAnalytics(s4, e, m8, l6, j7));
    }
    
    public final Map<Class<?>, tt<?, ?>> getSubFeatureInjectors() {
        return this.b.k();
    }
}
