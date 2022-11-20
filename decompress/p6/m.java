// 
// Decompiled by Procyon v0.6.0
// 

package p6;

import com.reddit.domain.meta.model.Nomenclature;
import com.reddit.domain.meta.model.MetaCommunityCurrency;
import com.reddit.session.RedditSession;
import java.util.concurrent.atomic.AtomicBoolean;
import android.content.Context;
import java.util.List;
import com.reddit.ads.link.models.AdEvent$EventType;
import lv.c;
import o70.b;
import cg2.j;
import com.reddit.domain.model.CarouselCollectionState;
import xd0.s;
import com.reddit.data.repository.RedditPreferenceRepository;
import com.reddit.session.Session;
import com.google.firebase.perf.metrics.Trace;
import android.accounts.Account;
import com.reddit.session.n;
import ng2.e;
import j41.f;
import java.io.File;
import com.reddit.video.creation.widgets.edit.presenter.SaveVideoWorker;
import com.reddit.domain.meta.model.MetaCommunityInfo;
import g50.a;
import java.util.concurrent.Callable;

public final class m implements Callable
{
    public final int f;
    public final Object g;
    public final Object h;
    public final Object i;
    
    public m(final a g, final MetaCommunityInfo i, final String h) {
        this.f = 2;
        this.g = g;
        this.i = i;
        this.h = h;
    }
    
    public m(final Object g, final int f, final Object h, final Object i) {
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    @Override
    public final Object call() {
        switch (this.f) {
            default: {
                return SaveVideoWorker.b((SaveVideoWorker)this.g, (String)this.h, (File)this.i);
            }
            case 5: {
                final f f = (f)this.g;
                final String s = (String)this.h;
                final String s2 = (String)this.i;
                e.f((Object)s, "$filepath");
                e.f((Object)s2, "$mimetype");
                return f.b.d(s, s2);
            }
            case 4: {
                final n n = (n)this.g;
                final Account account = (Account)this.h;
                final Trace trace = (Trace)this.i;
                final AtomicBoolean a = mq0.f.a;
                final RedditSession f2 = n.F(account.name);
                String token;
                if (f2 == null) {
                    token = "";
                }
                else {
                    if (((Session)f2).isTokenInvalid()) {
                        trace.incrementMetric("new_token", 1L);
                        n.z((Session)f2);
                    }
                    token = ((Session)f2).getToken();
                }
                return token;
            }
            case 3: {
                final RedditPreferenceRepository redditPreferenceRepository = (RedditPreferenceRepository)this.g;
                final s.a a2 = (s.a)this.h;
                final CarouselCollectionState carouselCollectionState = (CarouselCollectionState)this.i;
                e.f((Object)redditPreferenceRepository, "this$0");
                e.f((Object)a2, "$key");
                e.f((Object)carouselCollectionState, "$state");
                redditPreferenceRepository.c.edit().putString(a2.toString(), y10.e.a.a((Class)CarouselCollectionState.class).toJson((Object)carouselCollectionState)).apply();
                return j.a;
            }
            case 2: {
                final a a3 = (a)this.g;
                final MetaCommunityInfo metaCommunityInfo = (MetaCommunityInfo)this.i;
                final String s3 = (String)this.h;
                e.f((Object)a3, "this$0");
                e.f((Object)metaCommunityInfo, "$value");
                e.f((Object)s3, "$key");
                final Object value = a3.a.get();
                e.e(value, "communityDaoProvider.get()");
                final n70.a a4 = (n70.a)value;
                final boolean a5 = metaCommunityInfo.a;
                final boolean b = metaCommunityInfo.b;
                final Long c = metaCommunityInfo.c;
                final Long d = metaCommunityInfo.d;
                final MetaCommunityCurrency e = metaCommunityInfo.e;
                String stringValue;
                if (e != null) {
                    stringValue = e.getStringValue();
                }
                else {
                    stringValue = null;
                }
                final boolean f3 = metaCommunityInfo.f;
                final String h = metaCommunityInfo.h;
                final Nomenclature g = metaCommunityInfo.g;
                final b b2 = new b(g.a, g.b, g.c, g.d, g.e);
                final String i = metaCommunityInfo.i;
                final String j = metaCommunityInfo.j;
                final int k = metaCommunityInfo.k;
                final String stringValue2 = metaCommunityInfo.l.getStringValue();
                final boolean m = metaCommunityInfo.m;
                final Long d2 = metaCommunityInfo.d;
                a4.N1(new o70.a(s3, a5, b, c, d, stringValue, f3, h, i, j, k, stringValue2, m, d2 != null && d2 > System.currentTimeMillis(), metaCommunityInfo.n, b2));
                return Boolean.TRUE;
            }
            case 1: {
                final c c2 = (c)this.g;
                final AdEvent$EventType adEvent$EventType = (AdEvent$EventType)this.h;
                final List list = (List)this.i;
                e.f((Object)c2, "this$0");
                e.f((Object)adEvent$EventType, "$eventType");
                e.f((Object)list, "$listOfAdUniqueIds");
                return c2.a().a1(((Enum)adEvent$EventType).name(), list);
            }
            case 0: {
                return r.c((Context)this.g, (String)this.h, (String)this.i);
            }
        }
    }
}
