// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.external.vaultbanner;

import com.reddit.session.n;
import x82.d;
import com.reddit.domain.model.MyAccount;
import vh0.i;
import com.reddit.listing.model.Listable;
import hj2.f;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.Collection;
import x82.h;
import kotlin.Pair;
import x82.h0;
import java.util.List;
import rg2.q;
import kotlinx.coroutines.rx2.e;
import xd0.g0$a;
import hj2.g;
import com.reddit.vault.m;
import yd.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import com.reddit.domain.model.Subreddit;
import kotlin.Metadata;
import hg2.j;
import lg2.c;
import ej2.b0;
import rg2.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@" }, d2 = { "Lej2/b0;", "Lhg2/j;", "<anonymous>" }, k = 3, mv = { 1, 7, 1 })
@mg2.c(c = "com.reddit.vault.external.vaultbanner.RedditVaultBannerDataPresenterDelegate$requestVaultBanner$1", f = "RedditVaultBannerDataPresenterDelegate.kt", l = { 70, 91 }, m = "invokeSuspend")
final class RedditVaultBannerDataPresenterDelegate$requestVaultBanner$1 extends SuspendLambda implements p<b0, c<? super j>, Object>
{
    public final /* synthetic */ Subreddit $subreddit;
    public int label;
    public final /* synthetic */ a this$0;
    
    public RedditVaultBannerDataPresenterDelegate$requestVaultBanner$1(final a this$0, final Subreddit $subreddit, final c<? super RedditVaultBannerDataPresenterDelegate$requestVaultBanner$1> c) {
        this.this$0 = this$0;
        this.$subreddit = $subreddit;
        super(2, (c<Object>)c);
    }
    
    public final c<j> create(final Object o, final c<?> c) {
        return (c<j>)new RedditVaultBannerDataPresenterDelegate$requestVaultBanner$1(this.this$0, this.$subreddit, (c<? super RedditVaultBannerDataPresenterDelegate$requestVaultBanner$1>)c);
    }
    
    @Override
    public final Object invoke(final b0 b0, final c<? super j> c) {
        return ((RedditVaultBannerDataPresenterDelegate$requestVaultBanner$1)this.create(b0, c)).invokeSuspend(j.a);
    }
    
    public final Object invokeSuspend(Object d) {
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label = this.label;
        if (label != 0) {
            if (label != 1) {
                if (label == 2) {
                    b.k0(d);
                    return j.a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            else {
                b.k0(d);
            }
        }
        else {
            b.k0(d);
            final r82.c d2 = this.this$0.d;
            this.label = 1;
            if ((d = d2.d((c<? super m>)this)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        final m m = (m)d;
        final hj2.e e = this.this$0.d.e();
        final Subreddit $subreddit = this.$subreddit;
        Object b;
        if ($subreddit != null) {
            b = new g((Object)lw0.b.r1((Object)$subreddit));
        }
        else {
            b = kotlinx.coroutines.rx2.e.b(g0$a.d(3, this.this$0.a, false));
        }
        d = new kotlinx.coroutines.flow.e(e, (hj2.e)b, new q<List<? extends h0>, List<? extends Subreddit>, c<? super Pair<? extends h0, ? extends m>>, Object>() {
            public final /* synthetic */ m $textProvider;
            public /* synthetic */ Object L$0;
            public /* synthetic */ Object L$1;
            public int label;
            public final /* synthetic */ a this$0;
            
            @Override
            public final Object invoke(final List<h0> l$0, final List<Subreddit> l$2, final c<? super Pair<h0, ? extends m>> c) {
                final q<List<? extends h0>, List<? extends Subreddit>, c<? super Pair<? extends h0, ? extends m>>, Object> q = new q<List<? extends h0>, List<? extends Subreddit>, c<? super Pair<? extends h0, ? extends m>>, Object>() {
                    public final /* synthetic */ m $textProvider = this.$textProvider;
                    public /* synthetic */ Object L$0;
                    public /* synthetic */ Object L$1;
                    public int label;
                    public final /* synthetic */ a this$0 = this.this$0;
                };
                q.L$0 = l$0;
                q.L$1 = l$2;
                return q.invokeSuspend(j.a);
            }
            
            public final Object invokeSuspend(Object o) {
                final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label == 0) {
                    yd.b.k0(o);
                    final List list = (List)this.L$0;
                    final List list2 = (List)this.L$1;
                    final a this$0 = this.this$0;
                    final Iterator iterator = list.iterator();
                Label_0192:
                    while (true) {
                        int i;
                        do {
                            final boolean hasNext = iterator.hasNext();
                            final Object o2 = null;
                            final String s = null;
                            if (!hasNext) {
                                o = null;
                                final h0 h0 = (h0)o;
                                if (h0 != null) {
                                    final Iterator iterator2 = list2.iterator();
                                    while (true) {
                                        while (iterator2.hasNext()) {
                                            o = iterator2.next();
                                            if (sg2.e.a((Object)((Subreddit)o).getKindWithId(), (Object)h0.f.f)) {
                                                final Subreddit subreddit = (Subreddit)o;
                                                final h f = h0.f;
                                                String communityIconUrl = s;
                                                if (subreddit != null) {
                                                    communityIconUrl = subreddit.getCommunityIconUrl();
                                                }
                                                final String f2 = f.f;
                                                final String g = f.g;
                                                final String h2 = f.h;
                                                final String j = f.j;
                                                final String k = f.k;
                                                final String l = f.l;
                                                final String m = f.m;
                                                final String n = f.n;
                                                final String o3 = f.o;
                                                final x82.a p = f.p;
                                                final x82.a q = f.q;
                                                final x82.a r = f.r;
                                                final BigInteger s2 = f.s;
                                                final String t = f.t;
                                                final String u = f.u;
                                                final String v = f.v;
                                                f.getClass();
                                                sg2.e.f((Object)f2, "id");
                                                sg2.e.f((Object)g, "subredditName");
                                                sg2.e.f((Object)h2, "subredditTitle");
                                                sg2.e.f((Object)l, "pointsName");
                                                o = new h(f2, g, h2, communityIconUrl, j, k, l, m, n, o3, p, q, r, s2, t, u, v);
                                                final List g2 = h0.g;
                                                sg2.e.f((Object)g2, "rounds");
                                                o = new h0((h)o, g2);
                                                return new Pair(o, (Object)this.$textProvider);
                                            }
                                        }
                                        o = null;
                                        continue;
                                    }
                                }
                                o = o2;
                                return new Pair(o, (Object)this.$textProvider);
                            }
                            o = iterator.next();
                            final h0 h3 = (h0)o;
                            final boolean b = list2 instanceof Collection;
                            final int n2 = 1;
                            if (!b || !list2.isEmpty()) {
                                for (final Subreddit subreddit2 : list2) {
                                    if (sg2.e.a((Object)subreddit2.getKindWithId(), (Object)h3.f.f) && this$0.c.p1(subreddit2.getDisplayName())) {
                                        i = n2;
                                        continue Label_0192;
                                    }
                                }
                            }
                            i = 0;
                        } while (i == 0);
                        continue;
                    }
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        });
        final f<Pair<? extends h0, ? extends m>> f = new f<Pair<? extends h0, ? extends m>>() {
            public final /* synthetic */ a f = RedditVaultBannerDataPresenterDelegate$requestVaultBanner$1.this.this$0;
            
            @Override
            public final Object emit(final Object o, final c c) {
                final Pair pair = (Pair)o;
                final h0 h0 = (h0)pair.component1();
                final m m = (m)pair.component2();
                final a f = this.f;
                final List lc = f.h.Lc();
                final int n = 0;
                int n2 = 0;
                if (h0 == null) {
                    final Iterator iterator = lc.iterator();
                    while (true) {
                        while (iterator.hasNext()) {
                            if (((Listable)iterator.next()) instanceof d92.e) {
                                if (n2 >= 0) {
                                    lc.remove(n2);
                                    f.g.e1(lc);
                                    f.g.sq(1, 1);
                                    return j.a;
                                }
                                return j.a;
                            }
                            else {
                                ++n2;
                            }
                        }
                        n2 = -1;
                        continue;
                    }
                }
                final MyAccount c2 = f.b.C();
                if (c2 != null) {
                    final String iconUrl = c2.getIconUrl();
                    final x82.d b = m.b(h0);
                    if (lc.isEmpty() ^ true) {
                        int n3 = 0;
                        Label_0231: {
                            if (!lc.isEmpty()) {
                                final Iterator iterator2 = lc.iterator();
                                while (iterator2.hasNext()) {
                                    if (((Listable)iterator2.next()) instanceof d92.e) {
                                        n3 = n;
                                        break Label_0231;
                                    }
                                }
                            }
                            n3 = 1;
                        }
                        if (n3 != 0) {
                            lc.add(1, new d92.e(b.a, b.b, ((n)c2).getKindWithId(), ((n)c2).getUsername(), iconUrl, h0, lq0.h.a.a()));
                            f.g.e1(lc);
                            f.g.C9(1, 1);
                            final vh0.h f2 = f.f;
                            final h f3 = h0.f;
                            f2.m((i)new vh0.b(f3.f, f3.w));
                        }
                    }
                }
                return j.a;
            }
        };
        this.label = 2;
        if (((kotlinx.coroutines.flow.e)d).a((f<Object>)f, (c<? super j>)this) == coroutine_SUSPENDED) {
            return coroutine_SUSPENDED;
        }
        return j.a;
    }
}
