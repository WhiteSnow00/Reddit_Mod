// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.customemojis;

import com.reddit.session.Session;
import java.util.List;
import ff2.c0;
import i10.l;
import ff2.r;
import io.reactivex.internal.operators.maybe.MaybeFlatten;
import ff2.n;
import kf2.q;
import rf2.f;
import b20.b$a;
import io.reactivex.plugins.RxJavaPlugins;
import ff2.y;
import kf2.o;
import ff2.g0;
import io.reactivex.internal.operators.mixed.SingleFlatMapObservable;
import v40.h;
import kotlin.coroutines.CoroutineContext;
import bb0.g;
import ff2.t;
import ff0.t0;
import javax.inject.Inject;
import com.reddit.session.p;
import com.reddit.domain.repository.ModToolsRepository;
import bb0.a;
import bd0.k;
import n20.c;
import ec0.e;
import android.support.v4.media.b;

public final class d extends b
{
    public final e f;
    public final c g;
    public final ec0.d h;
    public final k i;
    public final a j;
    public final ModToolsRepository k;
    public final p l;
    public final dc0.a m;
    public final cb0.a n;
    public final a20.a o;
    
    @Inject
    public d(final e f, final c g, final ec0.d h, final k i, final a j, final ModToolsRepository k, final p l, final dc0.a m, final cb0.a n, final a20.a o) {
        sg2.e.f((Object)f, "metaProductsRepository");
        sg2.e.f((Object)g, "postExecutionThread");
        sg2.e.f((Object)h, "communityRepository");
        sg2.e.f((Object)i, "powerupsRepository");
        sg2.e.f((Object)j, "customEmojiRepository");
        sg2.e.f((Object)k, "modToolsRepository");
        sg2.e.f((Object)l, "sessionView");
        sg2.e.f((Object)m, "metaEmoteMapper");
        sg2.e.f((Object)n, "customEmojisFeatures");
        sg2.e.f((Object)o, "dispatcherProvider");
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
    }
    
    public final t c1(final t0 t0) {
        final g g = (g)t0;
        t t2;
        if (this.n.D3()) {
            final c0 a0 = yd.b.a0((CoroutineContext)this.o.c(), (rg2.p)new GetAvailableEmotesUseCase$isEmojisEnabledForSubreddit$1(this, g.c, null));
            final h h = new h(1, (Object)this, (Object)g);
            a0.getClass();
            t2 = RxJavaPlugins.onAssembly((ff2.t<Object>)new SingleFlatMapObservable((ff2.g0<Object>)a0, (kf2.o<? super Object, ? extends ff2.y<?>>)h));
            sg2.e.e((Object)t2, "isEmojisEnabledForSubred\u2026y<EmotesResult>()\n      }");
        }
        else {
            final b20.b d = g.d;
            b$a b$a;
            if (d instanceof b$a) {
                b$a = (b$a)d;
            }
            else {
                b$a = null;
            }
            t t3;
            if (b$a != null && b$a.f) {
                t3 = t.just((Object)PowerupEmotesAvailability.ENABLED_BY_PARENT_COMMENTS);
                sg2.e.e((Object)t3, "{\n      Observable.just(\u2026BY_PARENT_COMMENTS)\n    }");
            }
            else {
                t3 = this.i.j(g.c).onErrorReturnItem((Object)new r20.a((Object)null)).map((o)new com.reddit.domain.customemojis.b());
                sg2.e.e((Object)t3, "{\n      powerupsReposito\u2026        }\n        }\n    }");
            }
            t2 = t3.flatMap((o)new com.reddit.domain.customemojis.a(this, g));
            sg2.e.e((Object)t2, "powerupEmotesAvailabilit\u2026}\n        }\n      }\n    }");
        }
        final c0 metaEnabledSubredditIds = this.h.getMetaEnabledSubredditIds();
        final bb0.h h2 = new bb0.h((Object)g, 0);
        metaEnabledSubredditIds.getClass();
        final ff2.n<Object> onAssembly = RxJavaPlugins.onAssembly((ff2.n<Object>)new f((g0)metaEnabledSubredditIds, (q)h2));
        final com.reddit.accountutil.a a2 = new com.reddit.accountutil.a(9, (Object)this, (Object)g);
        onAssembly.getClass();
        final t w = RxJavaPlugins.onAssembly((ff2.n<Object>)new MaybeFlatten((r)onAssembly, (o)a2)).w();
        sg2.e.e((Object)w, "communityRepository.getM\u2026  }\n      .toObservable()");
        final t map = w.switchIfEmpty((y)t2).map((o)new l(10, (Object)this, (Object)g));
        sg2.e.e((Object)map, "metaEmotesResult\n      .\u2026 result\n        }\n      }");
        return mf1.a.H(map, (n20.d)this.g);
    }
    
    public final t<List<b20.c>> d1(final g g) {
        final String username = ((Session)this.l.c()).getUsername();
        Object w;
        if (username != null) {
            w = this.k.searchAllModerators(g.c, username).w((o)new nw.c(9));
        }
        else {
            w = null;
        }
        Object v = w;
        if (w == null) {
            v = c0.v(Boolean.FALSE);
            sg2.e.e(v, "just(false)");
        }
        final ff2.t<List<b20.c>> onAssembly = RxJavaPlugins.onAssembly((ff2.t<List<b20.c>>)new SingleFlatMapObservable((ff2.g0<Object>)v, (kf2.o<? super Object, ? extends ff2.y<?>>)new g50.g(1, (Object)this, (Object)g)));
        sg2.e.e((Object)onAssembly, "isModerator(params).flat\u2026otEmpty()\n        }\n    }");
        return onAssembly;
    }
}
