// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import y90.e0;
import java.util.Map;
import com.reddit.data.events.models.AnalyticsPlatform;
import com.reddit.session.q;
import s40.e;
import com.reddit.events.notification.RedditNotificationAnalytics;
import ki0.f;
import uh1.d;
import com.reddit.notification.common.NotificationManagerFacade;
import kz0.k;
import z10.o;
import af2.c;
import bh1.a$a;
import kotlin.random.Random;
import javax.inject.Provider;
import android.content.Context;
import zg2.a;

public final class dq implements du
{
    public final a<? extends Context> a;
    public final kl b;
    public Provider<Random> c;
    
    public dq(final kl b, final a a) {
        this.b = b;
        this.a = (a<? extends Context>)a;
        this.c = (Provider<Random>)af2.c.b((Provider)a$a.a);
    }
    
    public final vg1.a a() {
        final a<? extends Context> a = this.a;
        final Random random = (Random)this.c.get();
        final o o = new o();
        final jw0.a a2 = ((e0)this.b.a).a();
        k.N((Object)a2);
        final db0.c m6 = ((e0)this.b.a).M6();
        k.N((Object)m6);
        return new vg1.a((a)a, random, o, a2, m6);
    }
    
    public final NotificationManagerFacade b() {
        final Context l = ((e0)this.b.a).l();
        k.N((Object)l);
        final e20.a e2 = ((e0)this.b.a).E2();
        k.N((Object)e2);
        return new NotificationManagerFacade(l, e2);
    }
    
    public final d c() {
        final e80.d x8 = ((e0)this.b.a).x8();
        k.N((Object)x8);
        final o51.a p2 = ((e0)this.b.a).P2();
        k.N((Object)p2);
        final ya0.a u7 = ((e0)this.b.a).U7();
        k.N((Object)u7);
        return new d(x8, p2, u7);
    }
    
    public final f d() {
        final e u4 = ((e0)this.b.a).U4();
        k.N((Object)u4);
        final q e = ((e0)this.b.a).E();
        k.N((Object)e);
        final AnalyticsPlatform o8 = ((e0)this.b.a).o8();
        k.N((Object)o8);
        final db0.c m6 = ((e0)this.b.a).M6();
        k.N((Object)m6);
        final v00.a k7 = ((e0)this.b.a).k7();
        k.N((Object)k7);
        return new f(new RedditNotificationAnalytics(u4, e, o8, m6, k7));
    }
    
    public final Map<Class<?>, yt<?, ?>> getSubFeatureInjectors() {
        return this.b.k();
    }
}
