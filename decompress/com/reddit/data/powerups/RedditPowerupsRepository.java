// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.powerups;

import com.reddit.session.Session;
import kotlin.Result;
import ff2.y;
import com.reddit.type.SubredditBenefit$a;
import com.reddit.type.SubredditBenefit;
import com.reddit.domain.powerups.PowerupsBenefit;
import bd0.i;
import java.util.concurrent.ConcurrentMap;
import java.util.Iterator;
import java.io.Serializable;
import com.reddit.domain.powerups.FlairCategory;
import bd0.r;
import java.util.ArrayList;
import java.util.Collection;
import ig2.e0;
import com.nytimes.android.external.store3.base.impl.Store;
import ff2.t;
import bd0.q;
import kotlin.coroutines.CoroutineContext;
import bd0.m;
import java.util.Map;
import kotlin.collections.CollectionsKt___CollectionsKt;
import a4.a0;
import bd0.s;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import hg2.j;
import ff2.n;
import kotlinx.coroutines.CoroutineDispatcher;
import hj2.g;
import kotlin.collections.EmptyList;
import hj2.v;
import lg2.c;
import bd0.h;
import java.util.List;
import bd0.o;
import javax.inject.Inject;
import bg.d;
import sg2.e;
import java.util.Set;
import hg2.f;
import java.util.LinkedHashMap;
import kotlinx.coroutines.flow.StateFlowImpl;
import io.reactivex.subjects.PublishSubject;
import com.reddit.session.p;
import n20.a;
import p50.l;
import bd0.k;

public final class RedditPowerupsRepository implements k
{
    public final RemoteGqlPowerupsDataSource a;
    public final b b;
    public final l c;
    public final a d;
    public final o10.a e;
    public final cd0.a f;
    public final p g;
    public final a20.a h;
    public final tk0.a i;
    public final rk0.a j;
    public final PublishSubject<String> k;
    public final StateFlowImpl l;
    public final StateFlowImpl m;
    public final LinkedHashMap n;
    public final f o;
    public final f p;
    public final com.reddit.data.powerups.batchstore.a<String, Set<String>> q;
    public final f r;
    public final f s;
    public final f t;
    
    @Inject
    public RedditPowerupsRepository(final RemoteGqlPowerupsDataSource a, final b b, final l c, final a d, final o10.a e, final cd0.a f, final p g, final a20.a h, final tk0.a i, final rk0.a j) {
        sg2.e.f((Object)a, "remoteGql");
        sg2.e.f((Object)b, "achievementFlairRemoteGql");
        sg2.e.f((Object)c, "userAchievementFlairCache");
        sg2.e.f((Object)d, "backgroundThread");
        sg2.e.f((Object)e, "commentFeatures");
        sg2.e.f((Object)f, "powerupsFeatures");
        sg2.e.f((Object)g, "sessionView");
        sg2.e.f((Object)h, "dispatcherProvider");
        sg2.e.f((Object)i, "achievementFlairsRepository");
        sg2.e.f((Object)j, "flairFeatures");
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
        final PublishSubject<Object> create = (PublishSubject<Object>)PublishSubject.create();
        sg2.e.e((Object)create, "create<UserName>()");
        this.k = (PublishSubject<String>)create;
        this.l = bg.d.n((Object)null);
        this.m = bg.d.n((Object)null);
        this.n = new LinkedHashMap();
        this.o = kotlin.a.b((rg2.a)new RedditPowerupsRepository$powerupsStatusStore$2(this));
        this.p = kotlin.a.b((rg2.a)new RedditPowerupsRepository$topSupportersStore$2(this));
        this.q = (com.reddit.data.powerups.batchstore.a<String, Set<String>>)new com.reddit.data.powerups.batchstore.a((rg2.p)new RedditPowerupsRepository$usersSupportedSubredditsStore$1((Object)a), h);
        new com.reddit.data.powerups.batchstore.a((rg2.p)new RedditPowerupsRepository$subredditUserBenefitsBatchStore$1((Object)a), h);
        this.r = kotlin.a.b((rg2.a)new RedditPowerupsRepository$powerupAllocationsStore$2(this));
        this.s = kotlin.a.b((rg2.a)new RedditPowerupsRepository$subredditAchievementFlairStore$2(this));
        this.t = kotlin.a.b((rg2.a)new RedditPowerupsRepository$selfPowerupAllocationsStore$2(this));
    }
    
    public static final o t(final RedditPowerupsRepository redditPowerupsRepository, final o o) {
        final String username = ((Session)redditPowerupsRepository.g.c()).getUsername();
        o o2;
        if (username == null) {
            o2 = o;
        }
        else {
            final Integer n = redditPowerupsRepository.n.get(username);
            int intValue;
            if (n != null) {
                intValue = n;
            }
            else {
                intValue = 0;
            }
            o2 = o;
            if (intValue > 0) {
                final int b = o.b;
                if (b >= intValue) {
                    intValue = b;
                }
                final List<h> a = o.a;
                e.f((Object)a, "allocations");
                o2 = new o(a, intValue);
            }
        }
        return o2;
    }
    
    @Override
    public final hj2.e<o> a() {
        final String username = ((Session)this.g.c()).getUsername();
        Object o;
        if (username != null && username.length() != 0) {
            o = new v((rg2.p)new RedditPowerupsRepository$getSelfPowerupAllocations$1(this, username, (c)null));
        }
        else {
            o = new g((Object)new o((List<h>)EmptyList.INSTANCE, 0));
        }
        return kotlinx.coroutines.flow.a.B((hj2.e)o, (CoroutineDispatcher)this.h.c());
    }
    
    @Override
    public final n b() {
        sg2.e.f((Object)null, "subredditName");
        throw null;
    }
    
    @Override
    public final Object c(String l$1, String s, final List<String> list, final boolean b, final c<? super j> c) {
        Object o = null;
        Label_0059: {
            if (c instanceof RedditPowerupsRepository$updateAchievementFlairPreference$1) {
                final RedditPowerupsRepository$updateAchievementFlairPreference$1 redditPowerupsRepository$updateAchievementFlairPreference$1 = (RedditPowerupsRepository$updateAchievementFlairPreference$1)c;
                final int label = redditPowerupsRepository$updateAchievementFlairPreference$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditPowerupsRepository$updateAchievementFlairPreference$1.label = label + Integer.MIN_VALUE;
                    o = redditPowerupsRepository$updateAchievementFlairPreference$1;
                    break Label_0059;
                }
            }
            o = new RedditPowerupsRepository$updateAchievementFlairPreference$1(this, (c)c);
        }
        final Object result = ((RedditPowerupsRepository$updateAchievementFlairPreference$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RedditPowerupsRepository$updateAchievementFlairPreference$1)o).label;
        RedditPowerupsRepository redditPowerupsRepository;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            l$1 = (String)((RedditPowerupsRepository$updateAchievementFlairPreference$1)o).L$2;
            s = (String)((RedditPowerupsRepository$updateAchievementFlairPreference$1)o).L$1;
            redditPowerupsRepository = (RedditPowerupsRepository)((RedditPowerupsRepository$updateAchievementFlairPreference$1)o).L$0;
            yd.b.k0(result);
        }
        else {
            yd.b.k0(result);
            final com.reddit.session.n invoke = this.g.d().invoke();
            sg2.e.c((Object)invoke);
            final String kindWithId = invoke.getKindWithId();
            final b b2 = this.b;
            ((RedditPowerupsRepository$updateAchievementFlairPreference$1)o).L$0 = this;
            ((RedditPowerupsRepository$updateAchievementFlairPreference$1)o).L$1 = l$1;
            ((RedditPowerupsRepository$updateAchievementFlairPreference$1)o).L$2 = kindWithId;
            ((RedditPowerupsRepository$updateAchievementFlairPreference$1)o).label = 1;
            if (b2.c(s, (List)list, (c)o, b) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            final String s2 = l$1;
            l$1 = kindWithId;
            redditPowerupsRepository = this;
            s = s2;
        }
        redditPowerupsRepository.c.a(s, lw0.b.r1((Object)l$1));
        return hg2.j.a;
    }
    
    @Override
    public final Object d(final String s, final String s2, final c<? super s> c) {
        Object o = null;
        Label_0054: {
            if (c instanceof RedditPowerupsRepository$getUserAchievementFlairs$1) {
                final RedditPowerupsRepository$getUserAchievementFlairs$1 redditPowerupsRepository$getUserAchievementFlairs$1 = (RedditPowerupsRepository$getUserAchievementFlairs$1)c;
                final int label = redditPowerupsRepository$getUserAchievementFlairs$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditPowerupsRepository$getUserAchievementFlairs$1.label = label + Integer.MIN_VALUE;
                    o = redditPowerupsRepository$getUserAchievementFlairs$1;
                    break Label_0054;
                }
            }
            o = new RedditPowerupsRepository$getUserAchievementFlairs$1(this, (c)c);
        }
        final Object result = ((RedditPowerupsRepository$getUserAchievementFlairs$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RedditPowerupsRepository$getUserAchievementFlairs$1)o).label;
        Object l;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yd.b.k0(result);
            l = result;
        }
        else {
            yd.b.k0(result);
            final Set a0 = a4.a0.A0(s2);
            ((RedditPowerupsRepository$getUserAchievementFlairs$1)o).label = 1;
            if ((l = this.l(s, a0, (c<? super List<s>>)o)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        return CollectionsKt___CollectionsKt.C3((List)l);
    }
    
    @Override
    public final Object e(final String s, Set<String> l$1, final c<? super Map<String, ? extends Set<String>>> c) {
        Object o = null;
        Label_0054: {
            if (c instanceof RedditPowerupsRepository$getUsersSupportedSubredditIds$1) {
                final RedditPowerupsRepository$getUsersSupportedSubredditIds$1 redditPowerupsRepository$getUsersSupportedSubredditIds$1 = (RedditPowerupsRepository$getUsersSupportedSubredditIds$1)c;
                final int label = redditPowerupsRepository$getUsersSupportedSubredditIds$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditPowerupsRepository$getUsersSupportedSubredditIds$1.label = label + Integer.MIN_VALUE;
                    o = redditPowerupsRepository$getUsersSupportedSubredditIds$1;
                    break Label_0054;
                }
            }
            o = new RedditPowerupsRepository$getUsersSupportedSubredditIds$1(this, (c)c);
        }
        Object o2 = ((RedditPowerupsRepository$getUsersSupportedSubredditIds$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RedditPowerupsRepository$getUsersSupportedSubredditIds$1)o).label;
        boolean b = true;
        RedditPowerupsRepository redditPowerupsRepository;
        if (label2 != 0) {
            if (label2 != 1) {
                if (label2 == 2) {
                    yd.b.k0(o2);
                    return o2;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            else {
                l$1 = (Set)((RedditPowerupsRepository$getUsersSupportedSubredditIds$1)o).L$1;
                redditPowerupsRepository = (RedditPowerupsRepository)((RedditPowerupsRepository$getUsersSupportedSubredditIds$1)o).L$0;
                yd.b.k0(o2);
            }
        }
        else {
            yd.b.k0(o2);
            ((RedditPowerupsRepository$getUsersSupportedSubredditIds$1)o).L$0 = this;
            ((RedditPowerupsRepository$getUsersSupportedSubredditIds$1)o).L$1 = l$1;
            ((RedditPowerupsRepository$getUsersSupportedSubredditIds$1)o).label = 1;
            o2 = this.o(s, (c<? super m>)o);
            if (o2 == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            redditPowerupsRepository = this;
        }
        if (o2 == null) {
            b = false;
        }
        if (!b) {
            return kotlin.collections.c.V0();
        }
        final com.reddit.data.powerups.batchstore.a<String, Set<String>> q = redditPowerupsRepository.q;
        ((RedditPowerupsRepository$getUsersSupportedSubredditIds$1)o).L$0 = null;
        ((RedditPowerupsRepository$getUsersSupportedSubredditIds$1)o).L$1 = null;
        ((RedditPowerupsRepository$getUsersSupportedSubredditIds$1)o).label = 2;
        if ((o2 = q.a(l$1, (c)o)) == coroutine_SUSPENDED) {
            return coroutine_SUSPENDED;
        }
        return o2;
    }
    
    @Override
    public final Object f(final String s, final c<? super List<bd0.p>> c) {
        RedditPowerupsRepository$getSubredditAchievementFlairs$1 redditPowerupsRepository$getSubredditAchievementFlairs$2 = null;
        Label_0050: {
            if (c instanceof RedditPowerupsRepository$getSubredditAchievementFlairs$1) {
                final RedditPowerupsRepository$getSubredditAchievementFlairs$1 redditPowerupsRepository$getSubredditAchievementFlairs$1 = (RedditPowerupsRepository$getSubredditAchievementFlairs$1)c;
                final int label = redditPowerupsRepository$getSubredditAchievementFlairs$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditPowerupsRepository$getSubredditAchievementFlairs$1.label = label + Integer.MIN_VALUE;
                    redditPowerupsRepository$getSubredditAchievementFlairs$2 = redditPowerupsRepository$getSubredditAchievementFlairs$1;
                    break Label_0050;
                }
            }
            redditPowerupsRepository$getSubredditAchievementFlairs$2 = new RedditPowerupsRepository$getSubredditAchievementFlairs$1(this, (c)c);
        }
        final Object result = redditPowerupsRepository$getSubredditAchievementFlairs$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = redditPowerupsRepository$getSubredditAchievementFlairs$2.label;
        Object l;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yd.b.k0(result);
            l = result;
        }
        else {
            yd.b.k0(result);
            final mj2.a c2 = this.h.c();
            final RedditPowerupsRepository$getSubredditAchievementFlairs$2 redditPowerupsRepository$getSubredditAchievementFlairs$3 = new RedditPowerupsRepository$getSubredditAchievementFlairs$2(this, s, (c)null);
            redditPowerupsRepository$getSubredditAchievementFlairs$2.label = 1;
            if ((l = ej2.g.l((CoroutineContext)c2, (rg2.p)redditPowerupsRepository$getSubredditAchievementFlairs$3, (c)redditPowerupsRepository$getSubredditAchievementFlairs$2)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        sg2.e.e(l, "override suspend fun get\u2026itName).await()\n    }\n  }");
        return l;
    }
    
    @Override
    public final void g(final boolean b) {
        final String username = ((Session)this.g.c()).getUsername();
        if (username == null) {
            return;
        }
        if (b) {
            this.n.put(username, 1);
        }
        this.v().a((Object)username);
        this.l.setValue(new Object());
    }
    
    @Override
    public final Object h(final String s, final c<? super List<q>> c) {
        RedditPowerupsRepository$getTopSupporters$1 redditPowerupsRepository$getTopSupporters$2 = null;
        Label_0050: {
            if (c instanceof RedditPowerupsRepository$getTopSupporters$1) {
                final RedditPowerupsRepository$getTopSupporters$1 redditPowerupsRepository$getTopSupporters$1 = (RedditPowerupsRepository$getTopSupporters$1)c;
                final int label = redditPowerupsRepository$getTopSupporters$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditPowerupsRepository$getTopSupporters$1.label = label + Integer.MIN_VALUE;
                    redditPowerupsRepository$getTopSupporters$2 = redditPowerupsRepository$getTopSupporters$1;
                    break Label_0050;
                }
            }
            redditPowerupsRepository$getTopSupporters$2 = new RedditPowerupsRepository$getTopSupporters$1(this, (c)c);
        }
        final Object result = redditPowerupsRepository$getTopSupporters$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = redditPowerupsRepository$getTopSupporters$2.label;
        Object l;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yd.b.k0(result);
            l = result;
        }
        else {
            yd.b.k0(result);
            final mj2.a c2 = this.h.c();
            final RedditPowerupsRepository$getTopSupporters$2 redditPowerupsRepository$getTopSupporters$3 = new RedditPowerupsRepository$getTopSupporters$2(this, s, (c)null);
            redditPowerupsRepository$getTopSupporters$2.label = 1;
            if ((l = ej2.g.l((CoroutineContext)c2, (rg2.p)redditPowerupsRepository$getTopSupporters$3, (c)redditPowerupsRepository$getTopSupporters$2)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        sg2.e.e(l, "override suspend fun get\u2026itName).await()\n    }\n  }");
        return l;
    }
    
    @Override
    public final t<List<h>> i(final String s) {
        final Store value = this.r.getValue();
        sg2.e.e((Object)value, "<get-powerupAllocationsStore>(...)");
        final Store store = value;
        final t filter = ((t)this.k).filter((kf2.q)new p50.e(s, 0));
        sg2.e.e((Object)filter, "supportedSubredditsUpdat\u2026filter { it == username }");
        return (t<List<h>>)mf1.a.S((t)this.w((com.nytimes.android.external.store3.base.impl.Store<Object, String>)store, s, (t<?>)filter), this.d);
    }
    
    @Override
    public final t<r20.a<m>> j(final String s) {
        sg2.e.f((Object)s, "subredditName");
        return (t<r20.a<m>>)mf1.a.S((t)this.w(this.u(), s, (t<?>)this.k), this.d);
    }
    
    @Override
    public final t<List<q>> k(final String s) {
        sg2.e.f((Object)s, "subredditName");
        final Store value = this.p.getValue();
        sg2.e.e((Object)value, "<get-topSupportersStore>(...)");
        return (t<List<q>>)mf1.a.S((t)this.w((com.nytimes.android.external.store3.base.impl.Store<Object, String>)value, s, (t<?>)this.k), this.d);
    }
    
    @Override
    public final Object l(String s, Set<String> set, final c<? super List<s>> c) {
        RedditPowerupsRepository$getUsersAchievementFlairs$1 redditPowerupsRepository$getUsersAchievementFlairs$1 = null;
        Label_0052: {
            if (c instanceof RedditPowerupsRepository$getUsersAchievementFlairs$1) {
                redditPowerupsRepository$getUsersAchievementFlairs$1 = (RedditPowerupsRepository$getUsersAchievementFlairs$1)c;
                final int label = redditPowerupsRepository$getUsersAchievementFlairs$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditPowerupsRepository$getUsersAchievementFlairs$1.label = label + Integer.MIN_VALUE;
                    break Label_0052;
                }
            }
            redditPowerupsRepository$getUsersAchievementFlairs$1 = new RedditPowerupsRepository$getUsersAchievementFlairs$1(this, (c)c);
        }
        Object result = redditPowerupsRepository$getUsersAchievementFlairs$1.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = redditPowerupsRepository$getUsersAchievementFlairs$1.label;
        Map map = null;
        RedditPowerupsRepository redditPowerupsRepository = null;
        Label_0517: {
            String s2 = null;
            RedditPowerupsRepository l$0 = null;
            boolean booleanValue = false;
            Label_0358: {
                Object o = null;
                Label_0344: {
                    Set<String> set2;
                    RedditPowerupsRepository redditPowerupsRepository2;
                    Object y;
                    if (label2 != 0) {
                        if (label2 != 1) {
                            if (label2 == 2) {
                                set = (Set)redditPowerupsRepository$getUsersAchievementFlairs$1.L$2;
                                s2 = (String)redditPowerupsRepository$getUsersAchievementFlairs$1.L$1;
                                l$0 = (RedditPowerupsRepository)redditPowerupsRepository$getUsersAchievementFlairs$1.L$0;
                                yd.b.k0(result);
                                o = result;
                                break Label_0344;
                            }
                            if (label2 == 3) {
                                map = (Map)redditPowerupsRepository$getUsersAchievementFlairs$1.L$1;
                                redditPowerupsRepository = (RedditPowerupsRepository)redditPowerupsRepository$getUsersAchievementFlairs$1.L$0;
                                yd.b.k0(result);
                                break Label_0517;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        else {
                            set2 = (Set)redditPowerupsRepository$getUsersAchievementFlairs$1.L$2;
                            s = (String)redditPowerupsRepository$getUsersAchievementFlairs$1.L$1;
                            redditPowerupsRepository2 = (RedditPowerupsRepository)redditPowerupsRepository$getUsersAchievementFlairs$1.L$0;
                            yd.b.k0(result);
                            y = result;
                        }
                    }
                    else {
                        yd.b.k0(result);
                        if (this.j.x5()) {
                            redditPowerupsRepository$getUsersAchievementFlairs$1.L$0 = this;
                            redditPowerupsRepository$getUsersAchievementFlairs$1.L$1 = s;
                            redditPowerupsRepository$getUsersAchievementFlairs$1.L$2 = set;
                            redditPowerupsRepository$getUsersAchievementFlairs$1.label = 1;
                            y = this.y(s, (c<? super Boolean>)redditPowerupsRepository$getUsersAchievementFlairs$1);
                            if (y == coroutine_SUSPENDED) {
                                return coroutine_SUSPENDED;
                            }
                            set2 = set;
                            redditPowerupsRepository2 = this;
                        }
                        else {
                            redditPowerupsRepository$getUsersAchievementFlairs$1.L$0 = this;
                            redditPowerupsRepository$getUsersAchievementFlairs$1.L$1 = s;
                            redditPowerupsRepository$getUsersAchievementFlairs$1.L$2 = set;
                            redditPowerupsRepository$getUsersAchievementFlairs$1.label = 2;
                            o = this.o(s, (c<? super m>)redditPowerupsRepository$getUsersAchievementFlairs$1);
                            if (o == coroutine_SUSPENDED) {
                                return coroutine_SUSPENDED;
                            }
                            s2 = s;
                            l$0 = this;
                            break Label_0344;
                        }
                    }
                    booleanValue = (boolean)y;
                    final Set<String> set3 = set2;
                    s2 = s;
                    l$0 = redditPowerupsRepository2;
                    set = set3;
                    break Label_0358;
                }
                booleanValue = (o != null);
            }
            if (!booleanValue) {
                return EmptyList.INSTANCE;
            }
            final l c2 = l$0.c;
            c2.getClass();
            sg2.e.f((Object)s2, "subredditName");
            sg2.e.f((Object)set, "usersKindWithIds");
            final Map f1 = kotlin.collections.c.f1((bj2.k)kotlin.sequences.b.t1((bj2.k)CollectionsKt___CollectionsKt.q3((Iterable)set), (rg2.l)new UserAchievementFlairCache$getCachedFlairs$1(s2, c2)));
            final Set w0 = e0.W0((Set)set, (Collection)f1.keySet());
            if (w0.isEmpty()) {
                return CollectionsKt___CollectionsKt.q4((Iterable)f1.values());
            }
            final b b = l$0.b;
            final List r1 = lw0.b.r1((Object)s2);
            final List q4 = CollectionsKt___CollectionsKt.q4((Iterable)w0);
            redditPowerupsRepository$getUsersAchievementFlairs$1.L$0 = l$0;
            redditPowerupsRepository$getUsersAchievementFlairs$1.L$1 = f1;
            redditPowerupsRepository$getUsersAchievementFlairs$1.L$2 = null;
            redditPowerupsRepository$getUsersAchievementFlairs$1.label = 3;
            final Serializable b2 = b.b(r1, q4, (c)redditPowerupsRepository$getUsersAchievementFlairs$1);
            if (b2 == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            final Map map2 = f1;
            result = b2;
            redditPowerupsRepository = l$0;
            map = map2;
        }
        final List list = (List)result;
        final ArrayList list2 = new ArrayList<s>(ig2.m.c3((Iterable)list, 10));
        for (s a : list) {
            sg2.e.f((Object)a, "flairs");
            final List<r> d = a.d;
            if (!d.isEmpty()) {
                boolean b3 = false;
                Label_0649: {
                    if (!d.isEmpty()) {
                        final Iterator iterator2 = d.iterator();
                        while (iterator2.hasNext()) {
                            if (((r)iterator2.next()).l) {
                                b3 = true;
                                break Label_0649;
                            }
                        }
                    }
                    b3 = false;
                }
                if (!b3) {
                    final ArrayList z1 = lw0.b.z1((Object[])new r[] { bd0.r.X0((r)d.get(0), true) });
                    ig2.o.h3(z1, kotlin.sequences.b.h1((bj2.k)CollectionsKt___CollectionsKt.q3((Iterable)d), 1));
                    a = s.a(a, z1);
                }
            }
            list2.add(a);
        }
        final ArrayList list3 = new ArrayList<s>(ig2.m.c3((Iterable)list2, 10));
        for (s a2 : list2) {
            redditPowerupsRepository.getClass();
            sg2.e.f((Object)a2, "flairs");
            if (redditPowerupsRepository.j.x5()) {
                final List<r> d2 = a2.d;
                if (!d2.isEmpty()) {
                    final ArrayList<r> list4 = new ArrayList<r>();
                    for (final Object next : d2) {
                        if (((r)next).k == FlairCategory.ACHIEVEMENT) {
                            list4.add((r)next);
                        }
                    }
                    a2 = s.a(a2, list4);
                }
            }
            list3.add(a2);
        }
        final l c3 = redditPowerupsRepository.c;
        c3.getClass();
        for (final s s3 : list3) {
            final p50.a a3 = new p50.a(s3.b, s3.c);
            final ConcurrentMap a4 = c3.a;
            sg2.e.e((Object)a4, "cache");
            a4.put(a3, s3);
        }
        return CollectionsKt___CollectionsKt.W3((Iterable)list3, (Collection)map.values());
    }
    
    @Override
    public final Object m(int i$0, final String s, String s2, final String s3, final c c, final boolean b) {
        RedditPowerupsRepository$cancelPowerups$1 redditPowerupsRepository$cancelPowerups$2 = null;
        Label_0059: {
            if (c instanceof RedditPowerupsRepository$cancelPowerups$1) {
                final RedditPowerupsRepository$cancelPowerups$1 redditPowerupsRepository$cancelPowerups$1 = (RedditPowerupsRepository$cancelPowerups$1)c;
                final int label = redditPowerupsRepository$cancelPowerups$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditPowerupsRepository$cancelPowerups$1.label = label + Integer.MIN_VALUE;
                    redditPowerupsRepository$cancelPowerups$2 = redditPowerupsRepository$cancelPowerups$1;
                    break Label_0059;
                }
            }
            redditPowerupsRepository$cancelPowerups$2 = new RedditPowerupsRepository$cancelPowerups$1(this, c);
        }
        final Object result = redditPowerupsRepository$cancelPowerups$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = redditPowerupsRepository$cancelPowerups$2.label;
        RedditPowerupsRepository redditPowerupsRepository;
        if (label2 != 0) {
            if (label2 != 1 && label2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i$0 = redditPowerupsRepository$cancelPowerups$2.I$0;
            s2 = (String)redditPowerupsRepository$cancelPowerups$2.L$1;
            redditPowerupsRepository = (RedditPowerupsRepository)redditPowerupsRepository$cancelPowerups$2.L$0;
            yd.b.k0(result);
        }
        else {
            yd.b.k0(result);
            if (!b && s != null) {
                final RemoteGqlPowerupsDataSource a = this.a;
                redditPowerupsRepository$cancelPowerups$2.L$0 = this;
                redditPowerupsRepository$cancelPowerups$2.L$1 = s2;
                redditPowerupsRepository$cancelPowerups$2.I$0 = i$0;
                redditPowerupsRepository$cancelPowerups$2.label = 1;
                if (a.a(s, (c)redditPowerupsRepository$cancelPowerups$2) == coroutine_SUSPENDED) {
                    return coroutine_SUSPENDED;
                }
            }
            else {
                final RemoteGqlPowerupsDataSource a2 = this.a;
                redditPowerupsRepository$cancelPowerups$2.L$0 = this;
                redditPowerupsRepository$cancelPowerups$2.L$1 = s2;
                redditPowerupsRepository$cancelPowerups$2.I$0 = i$0;
                redditPowerupsRepository$cancelPowerups$2.label = 2;
                if (a2.d(s3, i$0, false, (c)redditPowerupsRepository$cancelPowerups$2) == coroutine_SUSPENDED) {
                    return coroutine_SUSPENDED;
                }
            }
            redditPowerupsRepository = this;
        }
        redditPowerupsRepository.x(i$0, s2);
        return hg2.j.a;
    }
    
    @Override
    public final t<o> n() {
        return (t<o>)mf1.a.S(kotlinx.coroutines.rx2.e.c((hj2.e)this.a()), this.d);
    }
    
    @Override
    public final Object o(final String s, final c<? super m> c) {
        Object o = null;
        Label_0050: {
            if (c instanceof RedditPowerupsRepository$getSubredditPowerupInfoByName$1) {
                final RedditPowerupsRepository$getSubredditPowerupInfoByName$1 redditPowerupsRepository$getSubredditPowerupInfoByName$1 = (RedditPowerupsRepository$getSubredditPowerupInfoByName$1)c;
                final int label = redditPowerupsRepository$getSubredditPowerupInfoByName$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditPowerupsRepository$getSubredditPowerupInfoByName$1.label = label + Integer.MIN_VALUE;
                    o = redditPowerupsRepository$getSubredditPowerupInfoByName$1;
                    break Label_0050;
                }
            }
            o = new RedditPowerupsRepository$getSubredditPowerupInfoByName$1(this, (c)c);
        }
        final Object result = ((RedditPowerupsRepository$getSubredditPowerupInfoByName$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RedditPowerupsRepository$getSubredditPowerupInfoByName$1)o).label;
        Object l;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yd.b.k0(result);
            l = result;
        }
        else {
            yd.b.k0(result);
            final mj2.a c2 = this.h.c();
            final RedditPowerupsRepository$getSubredditPowerupInfoByName$2 redditPowerupsRepository$getSubredditPowerupInfoByName$2 = new RedditPowerupsRepository$getSubredditPowerupInfoByName$2(this, s, (c)null);
            ((RedditPowerupsRepository$getSubredditPowerupInfoByName$1)o).label = 1;
            if ((l = ej2.g.l((CoroutineContext)c2, (rg2.p)redditPowerupsRepository$getSubredditPowerupInfoByName$2, (c)o)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        return ((r20.a)l).a;
    }
    
    @Override
    public final StateFlowImpl p() {
        return this.m;
    }
    
    @Override
    public final ArrayList q() {
        final bd0.e f = bd0.e.f;
        Object f2 = bd0.i.f;
        if (!this.f.na()) {
            f2 = null;
        }
        ArrayList list2;
        final ArrayList list = list2 = kotlin.collections.b.V0(new bd0.j[] { (bd0.j)f, (bd0.j)f2, (bd0.j)new bd0.c(PowerupsBenefit.COMMENTS_WITH_EMOJI), (bd0.j)new bd0.c(PowerupsBenefit.ACHIEVEMENT_FLAIRS), (bd0.j)bd0.f.f, (bd0.j)new bd0.c(PowerupsBenefit.HD_VIDEO) });
        if (list.size() % 2 != 0) {
            list2 = CollectionsKt___CollectionsKt.X3((Collection)list, (Object)bd0.g.f);
        }
        return list2;
    }
    
    @Override
    public final Object r(String s, final String s2, int i$0, final boolean b, final c<? super j> c) {
        RedditPowerupsRepository$allocatePowerups$1 redditPowerupsRepository$allocatePowerups$2 = null;
        Label_0059: {
            if (c instanceof RedditPowerupsRepository$allocatePowerups$1) {
                final RedditPowerupsRepository$allocatePowerups$1 redditPowerupsRepository$allocatePowerups$1 = (RedditPowerupsRepository$allocatePowerups$1)c;
                final int label = redditPowerupsRepository$allocatePowerups$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditPowerupsRepository$allocatePowerups$1.label = label + Integer.MIN_VALUE;
                    redditPowerupsRepository$allocatePowerups$2 = redditPowerupsRepository$allocatePowerups$1;
                    break Label_0059;
                }
            }
            redditPowerupsRepository$allocatePowerups$2 = new RedditPowerupsRepository$allocatePowerups$1(this, (c)c);
        }
        final Object result = redditPowerupsRepository$allocatePowerups$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = redditPowerupsRepository$allocatePowerups$2.label;
        RedditPowerupsRepository redditPowerupsRepository;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i$0 = redditPowerupsRepository$allocatePowerups$2.I$0;
            s = (String)redditPowerupsRepository$allocatePowerups$2.L$1;
            redditPowerupsRepository = (RedditPowerupsRepository)redditPowerupsRepository$allocatePowerups$2.L$0;
            yd.b.k0(result);
        }
        else {
            yd.b.k0(result);
            final RemoteGqlPowerupsDataSource a = this.a;
            redditPowerupsRepository$allocatePowerups$2.L$0 = this;
            redditPowerupsRepository$allocatePowerups$2.L$1 = s;
            redditPowerupsRepository$allocatePowerups$2.I$0 = i$0;
            redditPowerupsRepository$allocatePowerups$2.label = 1;
            if (a.d(s2, i$0, b, (c)redditPowerupsRepository$allocatePowerups$2) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            redditPowerupsRepository = this;
        }
        final j a2 = hg2.j.a;
        redditPowerupsRepository.x(i$0, s);
        redditPowerupsRepository.m.setValue((Object)s);
        return hg2.j.a;
    }
    
    @Override
    public final Object s(final String s, String l$1, final PowerupsBenefit powerupsBenefit, final boolean b, final c<? super List<bd0.d>> c) {
        Object o = null;
        Label_0059: {
            if (c instanceof RedditPowerupsRepository$updateBenefitSetting$1) {
                final RedditPowerupsRepository$updateBenefitSetting$1 redditPowerupsRepository$updateBenefitSetting$1 = (RedditPowerupsRepository$updateBenefitSetting$1)c;
                final int label = redditPowerupsRepository$updateBenefitSetting$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditPowerupsRepository$updateBenefitSetting$1.label = label + Integer.MIN_VALUE;
                    o = redditPowerupsRepository$updateBenefitSetting$1;
                    break Label_0059;
                }
            }
            o = new RedditPowerupsRepository$updateBenefitSetting$1(this, (c)c);
        }
        final Object result = ((RedditPowerupsRepository$updateBenefitSetting$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RedditPowerupsRepository$updateBenefitSetting$1)o).label;
        RedditPowerupsRepository redditPowerupsRepository;
        Object f;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            l$1 = (String)((RedditPowerupsRepository$updateBenefitSetting$1)o).L$1;
            redditPowerupsRepository = (RedditPowerupsRepository)((RedditPowerupsRepository$updateBenefitSetting$1)o).L$0;
            yd.b.k0(result);
            f = result;
        }
        else {
            yd.b.k0(result);
            final RemoteGqlPowerupsDataSource a = this.a;
            sg2.e.f((Object)powerupsBenefit, "<this>");
            final SubredditBenefit$a companion = SubredditBenefit.Companion;
            final String rawValue = powerupsBenefit.getRawValue();
            companion.getClass();
            final SubredditBenefit a2 = SubredditBenefit$a.a(rawValue);
            ((RedditPowerupsRepository$updateBenefitSetting$1)o).L$0 = this;
            ((RedditPowerupsRepository$updateBenefitSetting$1)o).L$1 = l$1;
            ((RedditPowerupsRepository$updateBenefitSetting$1)o).label = 1;
            f = a.f(s, a2, b, (c)o);
            if (f == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            redditPowerupsRepository = this;
        }
        final List list = (List)f;
        redditPowerupsRepository.getClass();
        sg2.e.f((Object)l$1, "subredditName");
        redditPowerupsRepository.u().a((Object)l$1);
        final com.reddit.session.n n = redditPowerupsRepository.g.d().invoke();
        if (n != null) {
            final String kindWithId = n.getKindWithId();
            if (kindWithId != null) {
                redditPowerupsRepository.c.a(l$1, lw0.b.r1((Object)kindWithId));
            }
        }
        return list;
    }
    
    public final Store<r20.a<m>, String> u() {
        final Store value = this.o.getValue();
        sg2.e.e((Object)value, "<get-powerupsStatusStore>(...)");
        return (Store<r20.a<m>, String>)value;
    }
    
    public final Store<o, String> v() {
        final Store value = this.t.getValue();
        sg2.e.e((Object)value, "<get-selfPowerupAllocationsStore>(...)");
        return (Store<o, String>)value;
    }
    
    public final <V, K> t<V> w(final Store<V, K> store, final K k, final t<?> t) {
        final t startWith = mf1.a.H((t)t, (n20.d)this.d).switchMap((kf2.o)new i10.l(9, (Object)store, (Object)k)).startWith((y)store.get((Object)k).N());
        sg2.e.e((Object)startWith, "updates\n      .observeOn\u2026(get(key).toObservable())");
        return (t<V>)startWith;
    }
    
    public final void x(int n, final String s) {
        final String username = ((Session)this.g.c()).getUsername();
        sg2.e.c((Object)username);
        final com.reddit.session.n invoke = this.g.d().invoke();
        sg2.e.c((Object)invoke);
        final String kindWithId = invoke.getKindWithId();
        final LinkedHashMap n2 = this.n;
        final Integer n3 = n2.get(username);
        final int n4 = 0;
        int intValue;
        if (n3 != null) {
            intValue = n3;
        }
        else {
            intValue = 0;
        }
        n = intValue - n;
        if (n < 0) {
            n = n4;
        }
        n2.put(username, n);
        this.v().a((Object)username);
        final Store value = this.r.getValue();
        sg2.e.e((Object)value, "<get-powerupAllocationsStore>(...)");
        value.a((Object)username);
        final Store value2 = this.p.getValue();
        sg2.e.e((Object)value2, "<get-topSupportersStore>(...)");
        value2.a((Object)s);
        this.u().a((Object)s);
        this.k.onNext(username);
        this.l.setValue(new Object());
        this.c.a(s, lw0.b.r1((Object)kindWithId));
        this.q.b.remove(kindWithId);
    }
    
    public final Object y(final String s, final c<? super Boolean> c) {
        Object o = null;
        Label_0050: {
            if (c instanceof RedditPowerupsRepository$isAchievementFlairEnabledForSubreddit$1) {
                final RedditPowerupsRepository$isAchievementFlairEnabledForSubreddit$1 redditPowerupsRepository$isAchievementFlairEnabledForSubreddit$1 = (RedditPowerupsRepository$isAchievementFlairEnabledForSubreddit$1)c;
                final int label = redditPowerupsRepository$isAchievementFlairEnabledForSubreddit$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditPowerupsRepository$isAchievementFlairEnabledForSubreddit$1.label = label + Integer.MIN_VALUE;
                    o = redditPowerupsRepository$isAchievementFlairEnabledForSubreddit$1;
                    break Label_0050;
                }
            }
            o = new RedditPowerupsRepository$isAchievementFlairEnabledForSubreddit$1(this, (c)c);
        }
        final Object result = ((RedditPowerupsRepository$isAchievementFlairEnabledForSubreddit$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RedditPowerupsRepository$isAchievementFlairEnabledForSubreddit$1)o).label;
        Object o2;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yd.b.k0(result);
            o2 = ((Result)result).unbox-impl();
        }
        else {
            yd.b.k0(result);
            final tk0.a i = this.i;
            ((RedditPowerupsRepository$isAchievementFlairEnabledForSubreddit$1)o).label = 1;
            if ((o2 = i.a(s, (c)o)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        final Boolean false = Boolean.FALSE;
        Object o3 = o2;
        if (Result.isFailure-impl(o2)) {
            o3 = false;
        }
        return o3;
    }
}
