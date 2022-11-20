// 
// Decompiled by Procyon v0.6.0
// 

package q90;

import android.content.SharedPreferences;
import android.content.Context;
import android.app.Application;
import v90.p0;
import jg0.a$a;
import x40.x;
import us0.g$a;
import v90.l;
import a00.f$a;
import a00.h$a;
import v90.k;
import mq0.o;
import com.reddit.domain.image.model.IconUtilDelegate;
import com.reddit.data.survey.datasource.RedditSharedPrefsSurveyTimestampDataSource;
import com.reddit.debug.storage.RedditFileDebugOptionsRepository;
import com.reddit.domain.predictions.feed.PredictionsTabSelectedEventBus;
import com.reddit.eventbus.FreeAwardTooltipEventBus;
import com.reddit.common.chat.ChatPostBubbleEventBus;
import com.reddit.notification.domain.bus.NotificationEventBus;
import x12.p;
import com.reddit.domain.navdrawer.NavDrawerStateChangeEventBus;
import o50.n;
import x40.l0;
import wa0.j;
import us0.f;
import zz.d;
import n12.m;
import a00.i;
import a00.e;
import a00.g;
import com.reddit.deeplink.DeeplinkProcessedEventBus;
import com.reddit.session.manager.lifecycle.SessionChangeEventBus;
import ks0.b;
import com.reddit.common.chat.ChatPushNotificationEventBus;
import com.reddit.media.common.VideoPlayerStateChangedEventBus;
import javax.inject.Provider;
import is0.a;

public final class h implements q90.c
{
    public final is0.a A;
    public final ve0.a B;
    public final h C;
    public Provider<VideoPlayerStateChangedEventBus> D;
    public Provider<vy0.c> E;
    public Provider<ChatPushNotificationEventBus> F;
    public b G;
    public Provider<ks0.b> H;
    public Provider<SessionChangeEventBus> I;
    public Provider<DeeplinkProcessedEventBus> J;
    public c K;
    public Provider<sz.a> L;
    public Provider<g> M;
    public Provider<e> N;
    public Provider<i> O;
    public Provider<m> P;
    public Provider<zz.d> Q;
    public Provider<f> R;
    public Provider<fy0.b> S;
    public ne2.e T;
    public ne2.e U;
    public ne2.e V;
    public Provider<va0.h> W;
    public ne2.e X;
    public ne2.e Y;
    public ne2.e Z;
    public final q90.b a;
    public lx.b a0;
    public final j b;
    public ne2.e b0;
    public final n12.b c;
    public a c0;
    public final hg0.a d;
    public Provider<av.a> d0;
    public final b20.a e;
    public Provider<l0> e0;
    public final n f;
    public d f0;
    public final j51.a g;
    public ne2.e g0;
    public final ra0.a h;
    public Provider<NavDrawerStateChangeEventBus> h0;
    public final p i;
    public Provider<av.b> i0;
    public final x12.e j;
    public Provider<com.reddit.ads.impl.analytics.e> j0;
    public final x12.a k;
    public Provider<yu.b> k0;
    public final o12.c l;
    public Provider<NotificationEventBus> l0;
    public final cl0.e m;
    public Provider<ChatPostBubbleEventBus> m0;
    public final ha0.d n;
    public Provider<FreeAwardTooltipEventBus> n0;
    public final h81.a o;
    public Provider<PredictionsTabSelectedEventBus> o0;
    public final qb0.a p;
    public ne2.e p0;
    public final hx.i q;
    public ne2.e q0;
    public final cj0.b r;
    public Provider<v9.f> r0;
    public final su0.a s;
    public ne2.e s0;
    public final x12.f t;
    public Provider<RedditFileDebugOptionsRepository> t0;
    public final gg0.b u;
    public ne2.e u0;
    public final k22.i v;
    public Provider<RedditSharedPrefsSurveyTimestampDataSource> v0;
    public final IconUtilDelegate w;
    public Provider<o> w0;
    public final n12.f x;
    public ne2.e x0;
    public final n12.d y;
    public final w70.d z;
    
    public h(final q90.b a, final j b, final n12.b c, final hg0.a d, final p i, final x12.e j, final x12.a k, final o12.c l, final ha0.d n, final b20.a e, final cl0.e m, final j51.a g, final ra0.a h, final w70.d z, final h81.a o, final qb0.a p28, final hx.i q, final cj0.b r, final su0.a s, final x12.f t, final gg0.b u, final k22.i v, final IconUtilDelegate w, final n12.f x, final n f, final is0.a a2, final ve0.a b2, final n12.d y) {
        this.C = this;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
        this.o = o;
        this.p = p28;
        this.q = q;
        this.r = r;
        this.s = s;
        this.t = t;
        this.u = u;
        this.v = v;
        this.w = w;
        this.x = x;
        this.y = y;
        this.z = z;
        this.A = a2;
        this.B = b2;
        this.D = (Provider<VideoPlayerStateChangedEventBus>)ne2.c.b((Provider)v90.i.a.a);
        this.E = (Provider<vy0.c>)ne2.c.b((Provider)v90.e.a.a);
        this.F = (Provider<ChatPushNotificationEventBus>)ne2.c.b((Provider)v90.d.a.a);
        final b g2 = new b(a);
        this.G = g2;
        this.H = (Provider<ks0.b>)ne2.c.b((Provider)new zr0.d((Provider)g2, 1));
        this.I = (Provider<SessionChangeEventBus>)ne2.c.b((Provider)v90.k.a.a);
        this.J = (Provider<DeeplinkProcessedEventBus>)ne2.c.b((Provider)v90.f.a.a);
        final c k2 = new c(a);
        this.K = k2;
        final b g3 = this.G;
        final v90.p a3 = v90.p.a.a;
        this.L = (Provider<sz.a>)ne2.c.b((Provider)new sz.h((Provider)g3, (Provider)k2, (Provider)a3, 0));
        this.M = (Provider<g>)ne2.c.b((Provider)h$a.a);
        final Provider b3 = ne2.c.b((Provider)f$a.a);
        this.N = (Provider<e>)b3;
        this.O = (Provider<i>)ne2.c.b((Provider)new uw.f((Provider)this.G, b3, 3));
        final Provider a4 = ne2.h.a((Provider)v90.l.a.a);
        this.P = (Provider<m>)a4;
        this.Q = (Provider<zz.d>)ne2.c.b((Provider)new sx.c((Provider)this.M, (Provider)this.O, a4, 2));
        this.R = (Provider<f>)ne2.c.b((Provider)g$a.a);
        final b g4 = this.G;
        ng2.e.f((Object)g4, "context");
        this.S = (Provider<fy0.b>)ne2.c.b((Provider)new by0.c((Provider)g4));
        this.T = ne2.e.a((Object)b);
        this.U = ne2.e.a((Object)d);
        this.V = ne2.e.a((Object)c);
        this.W = (Provider<va0.h>)ne2.c.b((Provider)new v90.l0((Provider)this.G, 4));
        this.X = ne2.e.a((Object)i);
        this.Y = ne2.e.a((Object)t);
        this.Z = ne2.e.a((Object)m);
        this.a0 = new lx.b((Provider)v90.a.a.a, 20);
        this.b0 = ne2.e.a((Object)n);
        this.c0 = new a(a);
        this.d0 = (Provider<av.a>)ne2.c.b((Provider)nv.b.a);
        this.e0 = (Provider<l0>)ne2.c.b((Provider)x40.x.a.a);
        this.f0 = new d(a);
        this.g0 = ne2.e.a((Object)z);
        this.h0 = (Provider<NavDrawerStateChangeEventBus>)ne2.c.b((Provider)v90.g.a.a);
        final ne2.e t2 = this.T;
        ng2.e.f((Object)t2, "internalFeatures");
        this.i0 = (Provider<av.b>)ne2.c.b((Provider)new nv.d((Provider)t2));
        this.j0 = (Provider<com.reddit.ads.impl.analytics.e>)ne2.c.b((Provider)com.reddit.ads.impl.analytics.f.a);
        final b g5 = this.G;
        ng2.e.f((Object)g5, "context");
        this.k0 = (Provider<yu.b>)ne2.c.b((Provider)new iv.b((Provider)g5));
        this.l0 = (Provider<NotificationEventBus>)ne2.c.b((Provider)v90.h.a.a);
        this.m0 = (Provider<ChatPostBubbleEventBus>)ne2.c.b((Provider)v90.c.a.a);
        this.n0 = (Provider<FreeAwardTooltipEventBus>)ne2.c.b((Provider)a$a.a);
        this.o0 = (Provider<PredictionsTabSelectedEventBus>)ne2.c.b((Provider)v90.j.a.a);
        this.p0 = ne2.e.a((Object)k);
        this.q0 = ne2.e.a((Object)x);
        this.r0 = (Provider<v9.f>)ne2.c.b((Provider)new v40.a((Provider)this.G, (Provider)this.T, 13));
        this.s0 = ne2.e.a((Object)r);
        final b g6 = this.G;
        final lx.b b4 = new lx.b((Provider)g6, 7);
        ng2.e.f((Object)g6, "context");
        this.t0 = (Provider<RedditFileDebugOptionsRepository>)ne2.c.b((Provider)new v70.a((Provider)g6, b4));
        this.u0 = ne2.e.a((Object)f);
        this.v0 = (Provider<RedditSharedPrefsSurveyTimestampDataSource>)ne2.c.b((Provider)new ix.b((Provider)this.f0, (Provider)a3, 16));
        this.w0 = (Provider<o>)ne2.c.b((Provider)v90.p0.a.a);
        this.x0 = ne2.e.a((Object)y);
    }
    
    public final j D() {
        return this.b;
    }
    
    public final dw0.a a() {
        return dw0.b.a();
    }
    
    @Override
    public final q90.j b() {
        return new q90.j(this.C);
    }
    
    public final SessionChangeEventBus h() {
        return (SessionChangeEventBus)this.I.get();
    }
    
    public static final class a implements Provider<Application>
    {
        public final q90.b a;
        
        public a(final q90.b a) {
            this.a = a;
        }
        
        public final Object get() {
            final Application c = this.a.c();
            zd.b.r(c);
            return c;
        }
    }
    
    public static final class b implements Provider<Context>
    {
        public final q90.b a;
        
        public b(final q90.b a) {
            this.a = a;
        }
        
        public final Object get() {
            final Context context = this.a.getContext();
            zd.b.r(context);
            return context;
        }
    }
    
    public static final class c implements Provider<p20.b>
    {
        public final q90.b a;
        
        public c(final q90.b a) {
            this.a = a;
        }
        
        public final Object get() {
            final p20.b b = this.a.b();
            zd.b.r(b);
            return b;
        }
    }
    
    public static final class d implements Provider<SharedPreferences>
    {
        public final q90.b a;
        
        public d(final q90.b a) {
            this.a = a;
        }
        
        public final Object get() {
            final SharedPreferences a = this.a.a();
            zd.b.r(a);
            return a;
        }
    }
}
