// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.customemojis;

import com.reddit.session.Session;
import h40.x;
import java.util.List;
import nf2.c0;
import eg.n0;
import nf2.y;
import io.reactivex.internal.operators.maybe.MaybeFlatten;
import nf2.n;
import sf2.q;
import v10.u;
import f20.b$a;
import io.reactivex.plugins.RxJavaPlugins;
import sf2.o;
import nf2.g0;
import io.reactivex.internal.operators.mixed.SingleFlatMapObservable;
import a40.b;
import zg2.p;
import kotlin.coroutines.CoroutineContext;
import a4.u1;
import jb0.g;
import nf2.t;
import of0.w0;
import javax.inject.Inject;
import ah2.f;
import com.reddit.session.r;
import com.reddit.domain.repository.ModToolsRepository;
import jb0.a;
import kd0.j;
import r20.c;
import nc0.e;

public final class d extends bj2.d
{
    public final e a;
    public final c b;
    public final nc0.d c;
    public final j d;
    public final a e;
    public final ModToolsRepository f;
    public final r g;
    public final mc0.a h;
    public final kb0.a i;
    public final e20.a j;
    
    @Inject
    public d(final e a, final c b, final nc0.d c, final j d, final a e, final ModToolsRepository f, final r g, final mc0.a h, final kb0.a i, final e20.a j) {
        ah2.f.f((Object)a, "metaProductsRepository");
        ah2.f.f((Object)b, "postExecutionThread");
        ah2.f.f((Object)c, "communityRepository");
        ah2.f.f((Object)d, "powerupsRepository");
        ah2.f.f((Object)e, "customEmojiRepository");
        ah2.f.f((Object)f, "modToolsRepository");
        ah2.f.f((Object)g, "sessionView");
        ah2.f.f((Object)h, "metaEmoteMapper");
        ah2.f.f((Object)i, "customEmojisFeatures");
        ah2.f.f((Object)j, "dispatcherProvider");
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
    }
    
    public final t g0(final w0 w0) {
        final g g = (g)w0;
        t t;
        if (this.i.G3()) {
            final c0 v0 = u1.V0((CoroutineContext)this.j.c(), (p)new GetAvailableEmotesUseCase$isEmojisEnabledForSubreddit$1(this, g.c, (tg2.c)null));
            final b b = new b(7, (Object)this, (Object)g);
            v0.getClass();
            t = RxJavaPlugins.onAssembly((t)new SingleFlatMapObservable((g0)v0, (o)b));
            ah2.f.e((Object)t, "isEmojisEnabledForSubred\u2026y<EmotesResult>()\n      }");
        }
        else {
            final f20.b d = g.d;
            b$a b$a;
            if (d instanceof b$a) {
                b$a = (b$a)d;
            }
            else {
                b$a = null;
            }
            t t2;
            if (b$a != null && b$a.f) {
                t2 = nf2.t.just((Object)PowerupEmotesAvailability.ENABLED_BY_PARENT_COMMENTS);
                ah2.f.e((Object)t2, "{\n      Observable.just(\u2026BY_PARENT_COMMENTS)\n    }");
            }
            else {
                t2 = this.d.k(g.c).onErrorReturnItem((Object)new v20.a((Object)null)).map((o)new com.reddit.domain.customemojis.b());
                ah2.f.e((Object)t2, "{\n      powerupsReposito\u2026        }\n        }\n    }");
            }
            t = t2.flatMap((o)new com.reddit.domain.customemojis.a(this, g));
            ah2.f.e((Object)t, "powerupEmotesAvailabilit\u2026}\n        }\n      }\n    }");
        }
        final c0 metaEnabledSubredditIds = this.c.getMetaEnabledSubredditIds();
        final u u = new u((Object)g, 2);
        metaEnabledSubredditIds.getClass();
        final n onAssembly = RxJavaPlugins.onAssembly((n)new zf2.f((g0)metaEnabledSubredditIds, (q)u));
        final com.reddit.accountutil.a a = new com.reddit.accountutil.a(1, (Object)this, (Object)g);
        onAssembly.getClass();
        final t x = RxJavaPlugins.onAssembly((n)new MaybeFlatten((nf2.r)onAssembly, (o)a)).x();
        ah2.f.e((Object)x, "communityRepository.getM\u2026  }\n      .toObservable()");
        final t map = x.switchIfEmpty((y)t).map((o)new qw.e(3, (Object)this, (Object)g));
        ah2.f.e((Object)map, "metaEmotesResult\n      .\u2026 result\n        }\n      }");
        return n0.j0(map, (r20.d)this.b);
    }
    
    public final t<List<f20.c>> h0(final g g) {
        final String username = ((Session)this.g.c()).getUsername();
        Object w;
        if (username != null) {
            w = this.f.searchAllModerators(g.c, username).w((o)new m10.p(11));
        }
        else {
            w = null;
        }
        Object v = w;
        if (w == null) {
            v = c0.v((Object)Boolean.FALSE);
            ah2.f.e(v, "just(false)");
        }
        final t onAssembly = RxJavaPlugins.onAssembly((t)new SingleFlatMapObservable((g0)v, (o)new x(6, (Object)this, (Object)g)));
        ah2.f.e((Object)onAssembly, "isModerator(params).flat\u2026otEmpty()\n        }\n    }");
        return (t<List<f20.c>>)onAssembly;
    }
}
