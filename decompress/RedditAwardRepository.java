// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.awards;

import hg2.j;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.collections.EmptyList;
import v10.v;
import rg2.p;
import kotlin.coroutines.CoroutineContext;
import g22.h1;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.internal.operators.single.SingleFlatMap;
import com.reddit.mutations.i3;
import kf2.o;
import java.util.Map;
import okhttp3.OkHttpClient;
import h7.k;
import mr0.e$a;
import com.reddit.mutations.f3;
import g22.g1;
import h7.h;
import com.reddit.domain.awards.model.AwardResponse;
import ff2.c0;
import kotlinx.coroutines.rx2.d;
import com.nytimes.android.external.store3.base.impl.Store;
import yd.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import com.reddit.domain.model.gold.UsableAwardsParams;
import com.reddit.domain.awards.model.Award;
import kotlin.Pair;
import lg2.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import java.util.List;
import ja0.g;
import javax.inject.Inject;
import sg2.e;
import hg2.f;
import v40.d0;
import v40.g0;
import ja0.a;

public final class RedditAwardRepository implements a
{
    public final y40.a a;
    public final RemoteAwardDataSource b;
    public final RemoteGqlAwardDataSource c;
    public final g0 d;
    public final d0 e;
    public final te0.a f;
    public final n20.a g;
    public final a20.a h;
    public final f i;
    
    @Inject
    public RedditAwardRepository(final y40.a a, final RemoteAwardDataSource b, final RemoteGqlAwardDataSource c, final g0 d, final d0 e, final te0.a f, final n20.a g, final a20.a h) {
        sg2.e.f((Object)a, "local");
        sg2.e.f((Object)b, "remote");
        sg2.e.f((Object)c, "gqlRemote");
        sg2.e.f((Object)d, "localLinkDataSource");
        sg2.e.f((Object)e, "localCommentDataSource");
        sg2.e.f((Object)f, "coinsRepository");
        sg2.e.f((Object)g, "backgroundThread");
        sg2.e.f((Object)h, "dispatcherProvider");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = kotlin.a.b((rg2.a)new RedditAwardRepository$sortedUsableAwardsWithTagsStore$2(this));
    }
    
    public final g a(final String s) {
        sg2.e.f((Object)s, "kindWithId");
        return this.a.a(s);
    }
    
    public final void b(final String s, final boolean b, final List list) {
        sg2.e.f((Object)s, "kindWithId");
        sg2.e.f((Object)list, "treatmentTags");
        this.a.b(s, b, list);
    }
    
    public final Object c(final String s, final ContinuationImpl continuationImpl) {
        return this.c.f(s, (c)continuationImpl);
    }
    
    public final Pair<String, List<Award>> d(final String s) {
        sg2.e.f((Object)s, "kindWithId");
        return (Pair<String, List<Award>>)this.a.d(s);
    }
    
    public final Object e(final UsableAwardsParams usableAwardsParams, final String s, final boolean b, final c c) {
        RedditAwardRepository$getSortedUsableAwardsWithTags$1 redditAwardRepository$getSortedUsableAwardsWithTags$2 = null;
        Label_0059: {
            if (c instanceof RedditAwardRepository$getSortedUsableAwardsWithTags$1) {
                final RedditAwardRepository$getSortedUsableAwardsWithTags$1 redditAwardRepository$getSortedUsableAwardsWithTags$1 = (RedditAwardRepository$getSortedUsableAwardsWithTags$1)c;
                final int label = redditAwardRepository$getSortedUsableAwardsWithTags$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditAwardRepository$getSortedUsableAwardsWithTags$1.label = label + Integer.MIN_VALUE;
                    redditAwardRepository$getSortedUsableAwardsWithTags$2 = redditAwardRepository$getSortedUsableAwardsWithTags$1;
                    break Label_0059;
                }
            }
            redditAwardRepository$getSortedUsableAwardsWithTags$2 = new RedditAwardRepository$getSortedUsableAwardsWithTags$1(this, c);
        }
        final Object result = redditAwardRepository$getSortedUsableAwardsWithTags$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = redditAwardRepository$getSortedUsableAwardsWithTags$2.label;
        Object b2;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.k0(result);
            b2 = result;
        }
        else {
            b.k0(result);
            final RedditAwardRepository.RedditAwardRepository$a redditAwardRepository$a = new RedditAwardRepository.RedditAwardRepository$a(usableAwardsParams, s);
            c0 c2;
            if (b) {
                c2 = this.i.getValue().j((Object)redditAwardRepository$a);
            }
            else {
                c2 = this.i.getValue().get((Object)redditAwardRepository$a);
            }
            sg2.e.e((Object)c2, "if (requestFresh) {\n    \u2026hTagsStore.get(key)\n    }");
            redditAwardRepository$getSortedUsableAwardsWithTags$2.label = 1;
            if ((b2 = kotlinx.coroutines.rx2.d.b(c2, (c)redditAwardRepository$getSortedUsableAwardsWithTags$2)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        sg2.e.e(b2, "resultSingle.await()");
        return b2;
    }
    
    public final c0<AwardResponse> f(final String s, final String s2, final ka0.a a, final boolean b, final boolean b2) {
        sg2.e.f((Object)s, "correlationId");
        sg2.e.f((Object)s2, "kindWithId");
        sg2.e.f((Object)a, "awardParams");
        c0 c2;
        if (b2) {
            final String g = a.g;
            final boolean m = a.m;
            final String l = a.l;
            final RemoteGqlAwardDataSource c = this.c;
            c.getClass();
            sg2.e.f((Object)g, "awardId");
            final c0 w = e$a.a((mr0.e)c.a, (k)new f3(new g1(s2, g, h7.h.a.c(m), h7.h.a.c(l), h7.h.a.c(b), h7.h.a.c(s))), (OkHttpClient)null, (Map)null, 14).w((o)new com.reddit.comment.ui.presentation.b((Object)c, 1));
            sg2.e.e((Object)w, "graphQlClient.execute(\n \u2026ed = false,\n      )\n    }");
            c2 = nn0.a.V((c0)w, (n20.d)this.g);
        }
        else {
            final String g2 = a.g;
            final boolean i = a.m;
            final String j = a.l;
            final RemoteGqlAwardDataSource c3 = this.c;
            c3.getClass();
            sg2.e.f((Object)g2, "awardId");
            final c0 w2 = e$a.a((mr0.e)c3.a, (k)new i3(new g1(s2, g2, h7.h.a.c(i), h7.h.a.c(j), h7.h.a.c(b), h7.h.a.c(s))), (OkHttpClient)null, (Map)null, 14).w((o)new com.reddit.billing.a((Object)c3, 3));
            sg2.e.e((Object)w2, "graphQlClient.execute(\n \u2026ed = false,\n      )\n    }");
            c2 = nn0.a.V((c0)w2, (n20.d)this.g);
        }
        final c0<Object> onAssembly = RxJavaPlugins.onAssembly((c0<Object>)new SingleFlatMap((ff2.g0)c2, (o)new u30.a((Object)this, 0, (Object)s2, (Object)a)));
        sg2.e.e((Object)onAssembly, "if (isComment) {\n      g\u2026d, awardParams, it)\n    }");
        return nn0.a.V((c0)onAssembly, (n20.d)this.g);
    }
    
    public final void g() {
        this.i.getValue().clear();
    }
    
    public final Object h(final String s, final String s2, final String s3, final String s4, final ContinuationImpl continuationImpl, final boolean b) {
        final RemoteGqlAwardDataSource c = this.c;
        c.getClass();
        return ej2.g.l((CoroutineContext)c.e.c(), (p)new RemoteGqlAwardDataSource$giveAward$2(c, new h1(s2, s, s4, b, h7.h.a.c(s3)), null), (c)continuationImpl);
    }
    
    public final Object i(final String s, final c<? super List<Award>> c) {
        final String a = v.a(s);
        if (sg2.e.a((Object)a, (Object)"t3")) {
            final RemoteGqlAwardDataSource c2 = this.c;
            return ej2.g.l((CoroutineContext)c2.e.c(), (p)new RemoteGqlAwardDataSource$getAwardsForPost$2(c2, s, null), (c)c);
        }
        if (sg2.e.a((Object)a, (Object)"t1")) {
            final RemoteGqlAwardDataSource c3 = this.c;
            return ej2.g.l((CoroutineContext)c3.e.c(), (p)new RemoteGqlAwardDataSource$getAwardsForComment$2(c3, s, null), (c)c);
        }
        return EmptyList.INSTANCE;
    }
    
    public final Serializable j(final ArrayList list, final c c) {
        return this.c.b(list, c);
    }
    
    public final Object k(final String l$1, String l$2, final c<? super Boolean> c) {
        Object o = null;
        Label_0054: {
            if (c instanceof RedditAwardRepository$hideAward$1) {
                final RedditAwardRepository$hideAward$1 redditAwardRepository$hideAward$1 = (RedditAwardRepository$hideAward$1)c;
                final int label = redditAwardRepository$hideAward$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditAwardRepository$hideAward$1.label = label + Integer.MIN_VALUE;
                    o = redditAwardRepository$hideAward$1;
                    break Label_0054;
                }
            }
            o = new RedditAwardRepository$hideAward$1(this, (c)c);
        }
        Object o2 = ((RedditAwardRepository$hideAward$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RedditAwardRepository$hideAward$1)o).label;
        String s;
        RedditAwardRepository redditAwardRepository;
        if (label2 != 0) {
            if (label2 != 1) {
                if (label2 == 2) {
                    final boolean b = ((RedditAwardRepository$hideAward$1)o).Z$0;
                    yd.b.k0(o2);
                    return b;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            else {
                s = (String)((RedditAwardRepository$hideAward$1)o).L$2;
                l$2 = (String)((RedditAwardRepository$hideAward$1)o).L$1;
                redditAwardRepository = (RedditAwardRepository)((RedditAwardRepository$hideAward$1)o).L$0;
                yd.b.k0(o2);
            }
        }
        else {
            yd.b.k0(o2);
            final RemoteGqlAwardDataSource c2 = this.c;
            ((RedditAwardRepository$hideAward$1)o).L$0 = this;
            ((RedditAwardRepository$hideAward$1)o).L$1 = l$1;
            ((RedditAwardRepository$hideAward$1)o).L$2 = l$2;
            ((RedditAwardRepository$hideAward$1)o).label = 1;
            o2 = c2.e(l$1, l$2, (c)o);
            if (o2 == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            s = l$2;
            l$2 = l$1;
            redditAwardRepository = this;
        }
        boolean b;
        final boolean z$0 = b = (boolean)o2;
        if (z$0) {
            ((RedditAwardRepository$hideAward$1)o).L$0 = null;
            ((RedditAwardRepository$hideAward$1)o).L$1 = null;
            ((RedditAwardRepository$hideAward$1)o).L$2 = null;
            ((RedditAwardRepository$hideAward$1)o).Z$0 = z$0;
            ((RedditAwardRepository$hideAward$1)o).label = 2;
            Object o3 = ej2.g.l((CoroutineContext)redditAwardRepository.h.c(), (p)new RedditAwardRepository$onHideComplete$2(l$2, redditAwardRepository, s, null), (c)o);
            if (o3 != coroutine_SUSPENDED) {
                o3 = j.a;
            }
            if (o3 == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            b = z$0;
        }
        return b;
    }
    
    public final Object l(final String s, final c<? super Boolean> c) {
        return this.c.a(s, (c)c);
    }
    
    public final Object reportAward(final String s, final c<? super j> c) {
        final Object reportAward = this.b.reportAward(s, (c)c);
        if (reportAward == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return reportAward;
        }
        return j.a;
    }
}
