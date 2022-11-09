// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.powerups;

import com.reddit.session.Session;
import kotlin.Result;
import h40.y;
import kd0.i;
import kd0.h;
import kd0.d;
import java.util.concurrent.ConcurrentMap;
import java.util.Iterator;
import com.reddit.domain.powerups.FlairCategory;
import java.util.ArrayList;
import qg2.m;
import java.util.Collection;
import qg2.d0;
import jj2.k;
import java.util.Map;
import eg.n0;
import sf2.q;
import com.nytimes.android.external.store3.base.impl.Store;
import nf2.t;
import com.reddit.type.SubredditBenefit$a;
import com.reddit.type.SubredditBenefit;
import com.reddit.domain.powerups.PowerupsBenefit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import a4.u1;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kd0.o;
import kotlinx.coroutines.CoroutineDispatcher;
import pj2.u;
import pj2.g;
import kotlin.collections.EmptyList;
import pj2.s;
import tg2.c;
import pj2.e;
import java.util.List;
import kd0.n;
import javax.inject.Inject;
import zg2.p;
import java.util.Set;
import pg2.f;
import java.util.LinkedHashMap;
import kotlinx.coroutines.flow.StateFlowImpl;
import io.reactivex.subjects.PublishSubject;
import com.reddit.session.r;
import r20.a;
import w50.l;
import kd0.j;

public final class RedditPowerupsRepository implements j
{
    public final RemoteGqlPowerupsDataSource a;
    public final b b;
    public final l c;
    public final a d;
    public final s10.a e;
    public final ld0.a f;
    public final r g;
    public final e20.a h;
    public final dl0.a i;
    public final bl0.a j;
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
    public RedditPowerupsRepository(final RemoteGqlPowerupsDataSource a, final b b, final l c, final a d, final s10.a e, final ld0.a f, final r g, final e20.a h, final dl0.a i, final bl0.a j) {
        ah2.f.f((Object)a, "remoteGql");
        ah2.f.f((Object)b, "achievementFlairRemoteGql");
        ah2.f.f((Object)c, "userAchievementFlairCache");
        ah2.f.f((Object)d, "backgroundThread");
        ah2.f.f((Object)e, "commentFeatures");
        ah2.f.f((Object)f, "powerupsFeatures");
        ah2.f.f((Object)g, "sessionView");
        ah2.f.f((Object)h, "dispatcherProvider");
        ah2.f.f((Object)i, "achievementFlairsRepository");
        ah2.f.f((Object)j, "flairFeatures");
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
        final PublishSubject create = PublishSubject.create();
        ah2.f.e((Object)create, "create<UserName>()");
        this.k = (PublishSubject<String>)create;
        this.l = o72.f.f((Object)null);
        this.m = o72.f.f((Object)null);
        this.n = new LinkedHashMap();
        this.o = kotlin.a.b((zg2.a)new RedditPowerupsRepository$powerupsStatusStore.RedditPowerupsRepository$powerupsStatusStore$2(this));
        this.p = kotlin.a.b((zg2.a)new RedditPowerupsRepository$topSupportersStore.RedditPowerupsRepository$topSupportersStore$2(this));
        this.q = new com.reddit.data.powerups.batchstore.a<String, Set<String>>((p)new RedditPowerupsRepository$usersSupportedSubredditsStore$1((Object)a), h);
        new com.reddit.data.powerups.batchstore.a((p)new RedditPowerupsRepository$subredditUserBenefitsBatchStore$1((Object)a), h);
        this.r = kotlin.a.b((zg2.a)new RedditPowerupsRepository$powerupAllocationsStore.RedditPowerupsRepository$powerupAllocationsStore$2(this));
        this.s = kotlin.a.b((zg2.a)new RedditPowerupsRepository$subredditAchievementFlairStore.RedditPowerupsRepository$subredditAchievementFlairStore$2(this));
        this.t = kotlin.a.b((zg2.a)new RedditPowerupsRepository$selfPowerupAllocationsStore.RedditPowerupsRepository$selfPowerupAllocationsStore$2(this));
    }
    
    public static final n t(final RedditPowerupsRepository redditPowerupsRepository, final n n) {
        final String username = ((Session)redditPowerupsRepository.g.c()).getUsername();
        n n2;
        if (username == null) {
            n2 = n;
        }
        else {
            final Integer n3 = redditPowerupsRepository.n.get(username);
            int intValue;
            if (n3 != null) {
                intValue = n3;
            }
            else {
                intValue = 0;
            }
            n2 = n;
            if (intValue > 0) {
                final int b = n.b;
                if (b >= intValue) {
                    intValue = b;
                }
                final List a = n.a;
                ah2.f.f((Object)a, "allocations");
                n2 = new n(a, intValue);
            }
        }
        return n2;
    }
    
    public final e<n> a() {
        final String username = ((Session)this.g.c()).getUsername();
        Object o;
        if (username != null && username.length() != 0) {
            o = new s((p)new RedditPowerupsRepository$getSelfPowerupAllocations$1(this, username, (c)null));
        }
        else {
            o = new g((Object)new n((List)EmptyList.INSTANCE, 0));
        }
        return (e<n>)u.I((e)o, (CoroutineDispatcher)this.h.c());
    }
    
    public final nf2.n b() {
        ah2.f.f((Object)null, "subredditName");
        throw null;
    }
    
    public final Object c(final String s, final c<? super List<o>> c) {
        RedditPowerupsRepository$getSubredditAchievementFlairs.RedditPowerupsRepository$getSubredditAchievementFlairs$1 redditPowerupsRepository$getSubredditAchievementFlairs$2 = null;
        Label_0052: {
            if (c instanceof RedditPowerupsRepository$getSubredditAchievementFlairs.RedditPowerupsRepository$getSubredditAchievementFlairs$1) {
                final RedditPowerupsRepository$getSubredditAchievementFlairs.RedditPowerupsRepository$getSubredditAchievementFlairs$1 redditPowerupsRepository$getSubredditAchievementFlairs$1 = (RedditPowerupsRepository$getSubredditAchievementFlairs.RedditPowerupsRepository$getSubredditAchievementFlairs$1)c;
                final int label = redditPowerupsRepository$getSubredditAchievementFlairs$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditPowerupsRepository$getSubredditAchievementFlairs$1.label = label + Integer.MIN_VALUE;
                    redditPowerupsRepository$getSubredditAchievementFlairs$2 = redditPowerupsRepository$getSubredditAchievementFlairs$1;
                    break Label_0052;
                }
            }
            redditPowerupsRepository$getSubredditAchievementFlairs$2 = new RedditPowerupsRepository$getSubredditAchievementFlairs.RedditPowerupsRepository$getSubredditAchievementFlairs$1(this, (c)c);
        }
        final Object result = redditPowerupsRepository$getSubredditAchievementFlairs$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = redditPowerupsRepository$getSubredditAchievementFlairs$2.label;
        Object l;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aj2.c.Q0(result);
            l = result;
        }
        else {
            aj2.c.Q0(result);
            final uj2.a c2 = this.h.c();
            final RedditPowerupsRepository$getSubredditAchievementFlairs$2 redditPowerupsRepository$getSubredditAchievementFlairs$3 = new RedditPowerupsRepository$getSubredditAchievementFlairs$2(this, s, (c)null);
            redditPowerupsRepository$getSubredditAchievementFlairs$2.label = 1;
            if ((l = mj2.g.l((CoroutineContext)c2, (p)redditPowerupsRepository$getSubredditAchievementFlairs$3, (c)redditPowerupsRepository$getSubredditAchievementFlairs$2)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        ah2.f.e(l, "override suspend fun get\u2026itName).await()\n    }\n  }");
        return l;
    }
    
    public final Object d(final String s, final c<? super List<kd0.p>> c) {
        RedditPowerupsRepository$getTopSupporters.RedditPowerupsRepository$getTopSupporters$1 redditPowerupsRepository$getTopSupporters$2 = null;
        Label_0052: {
            if (c instanceof RedditPowerupsRepository$getTopSupporters.RedditPowerupsRepository$getTopSupporters$1) {
                final RedditPowerupsRepository$getTopSupporters.RedditPowerupsRepository$getTopSupporters$1 redditPowerupsRepository$getTopSupporters$1 = (RedditPowerupsRepository$getTopSupporters.RedditPowerupsRepository$getTopSupporters$1)c;
                final int label = redditPowerupsRepository$getTopSupporters$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditPowerupsRepository$getTopSupporters$1.label = label + Integer.MIN_VALUE;
                    redditPowerupsRepository$getTopSupporters$2 = redditPowerupsRepository$getTopSupporters$1;
                    break Label_0052;
                }
            }
            redditPowerupsRepository$getTopSupporters$2 = new RedditPowerupsRepository$getTopSupporters.RedditPowerupsRepository$getTopSupporters$1(this, (c)c);
        }
        final Object result = redditPowerupsRepository$getTopSupporters$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = redditPowerupsRepository$getTopSupporters$2.label;
        Object l;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aj2.c.Q0(result);
            l = result;
        }
        else {
            aj2.c.Q0(result);
            final uj2.a c2 = this.h.c();
            final RedditPowerupsRepository$getTopSupporters$2 redditPowerupsRepository$getTopSupporters$3 = new RedditPowerupsRepository$getTopSupporters$2(this, s, (c)null);
            redditPowerupsRepository$getTopSupporters$2.label = 1;
            if ((l = mj2.g.l((CoroutineContext)c2, (p)redditPowerupsRepository$getTopSupporters$3, (c)redditPowerupsRepository$getTopSupporters$2)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        ah2.f.e(l, "override suspend fun get\u2026itName).await()\n    }\n  }");
        return l;
    }
    
    public final Object e(final String l$1, String s, final List<String> list, final boolean b, final c<? super pg2.j> c) {
        Object o = null;
        Label_0061: {
            if (c instanceof RedditPowerupsRepository$updateAchievementFlairPreference.RedditPowerupsRepository$updateAchievementFlairPreference$1) {
                final RedditPowerupsRepository$updateAchievementFlairPreference.RedditPowerupsRepository$updateAchievementFlairPreference$1 redditPowerupsRepository$updateAchievementFlairPreference$1 = (RedditPowerupsRepository$updateAchievementFlairPreference.RedditPowerupsRepository$updateAchievementFlairPreference$1)c;
                final int label = redditPowerupsRepository$updateAchievementFlairPreference$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditPowerupsRepository$updateAchievementFlairPreference$1.label = label + Integer.MIN_VALUE;
                    o = redditPowerupsRepository$updateAchievementFlairPreference$1;
                    break Label_0061;
                }
            }
            o = new RedditPowerupsRepository$updateAchievementFlairPreference.RedditPowerupsRepository$updateAchievementFlairPreference$1(this, (c)c);
        }
        final Object result = ((RedditPowerupsRepository$updateAchievementFlairPreference.RedditPowerupsRepository$updateAchievementFlairPreference$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RedditPowerupsRepository$updateAchievementFlairPreference.RedditPowerupsRepository$updateAchievementFlairPreference$1)o).label;
        String s2;
        RedditPowerupsRepository redditPowerupsRepository;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s = (String)((RedditPowerupsRepository$updateAchievementFlairPreference.RedditPowerupsRepository$updateAchievementFlairPreference$1)o).L$2;
            s2 = (String)((RedditPowerupsRepository$updateAchievementFlairPreference.RedditPowerupsRepository$updateAchievementFlairPreference$1)o).L$1;
            redditPowerupsRepository = (RedditPowerupsRepository)((RedditPowerupsRepository$updateAchievementFlairPreference.RedditPowerupsRepository$updateAchievementFlairPreference$1)o).L$0;
            aj2.c.Q0(result);
        }
        else {
            aj2.c.Q0(result);
            final Object invoke = this.g.d().invoke();
            ah2.f.c(invoke);
            final String kindWithId = ((com.reddit.session.p)invoke).getKindWithId();
            final b b2 = this.b;
            ((RedditPowerupsRepository$updateAchievementFlairPreference.RedditPowerupsRepository$updateAchievementFlairPreference$1)o).L$0 = this;
            ((RedditPowerupsRepository$updateAchievementFlairPreference.RedditPowerupsRepository$updateAchievementFlairPreference$1)o).L$1 = l$1;
            ((RedditPowerupsRepository$updateAchievementFlairPreference.RedditPowerupsRepository$updateAchievementFlairPreference$1)o).L$2 = kindWithId;
            ((RedditPowerupsRepository$updateAchievementFlairPreference.RedditPowerupsRepository$updateAchievementFlairPreference$1)o).label = 1;
            if (b2.c(s, list, (c)o, b) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            s2 = l$1;
            final String s3 = kindWithId;
            redditPowerupsRepository = this;
            s = s3;
        }
        redditPowerupsRepository.c.a(s2, ah2.c.X((Object)s));
        return pg2.j.a;
    }
    
    public final Object f(final String s, final String s2, final c<? super kd0.r> c) {
        Object o = null;
        Label_0056: {
            if (c instanceof RedditPowerupsRepository$getUserAchievementFlairs.RedditPowerupsRepository$getUserAchievementFlairs$1) {
                final RedditPowerupsRepository$getUserAchievementFlairs.RedditPowerupsRepository$getUserAchievementFlairs$1 redditPowerupsRepository$getUserAchievementFlairs$1 = (RedditPowerupsRepository$getUserAchievementFlairs.RedditPowerupsRepository$getUserAchievementFlairs$1)c;
                final int label = redditPowerupsRepository$getUserAchievementFlairs$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditPowerupsRepository$getUserAchievementFlairs$1.label = label + Integer.MIN_VALUE;
                    o = redditPowerupsRepository$getUserAchievementFlairs$1;
                    break Label_0056;
                }
            }
            o = new RedditPowerupsRepository$getUserAchievementFlairs.RedditPowerupsRepository$getUserAchievementFlairs$1(this, (c)c);
        }
        final Object result = ((RedditPowerupsRepository$getUserAchievementFlairs.RedditPowerupsRepository$getUserAchievementFlairs$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RedditPowerupsRepository$getUserAchievementFlairs.RedditPowerupsRepository$getUserAchievementFlairs$1)o).label;
        Object q;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aj2.c.Q0(result);
            q = result;
        }
        else {
            aj2.c.Q0(result);
            final Set z0 = u1.Z0((Object)s2);
            ((RedditPowerupsRepository$getUserAchievementFlairs.RedditPowerupsRepository$getUserAchievementFlairs$1)o).label = 1;
            if ((q = this.q(s, z0, (c<? super List<kd0.r>>)o)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        return CollectionsKt___CollectionsKt.s1((List)q);
    }
    
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
    
    public final Object h(int i$0, final String s, String s2, final String s3, final c c, final boolean b) {
        RedditPowerupsRepository$cancelPowerups$1 redditPowerupsRepository$cancelPowerups$2 = null;
        Label_0061: {
            if (c instanceof RedditPowerupsRepository$cancelPowerups$1) {
                final RedditPowerupsRepository$cancelPowerups$1 redditPowerupsRepository$cancelPowerups$1 = (RedditPowerupsRepository$cancelPowerups$1)c;
                final int label = redditPowerupsRepository$cancelPowerups$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditPowerupsRepository$cancelPowerups$1.label = label + Integer.MIN_VALUE;
                    redditPowerupsRepository$cancelPowerups$2 = redditPowerupsRepository$cancelPowerups$1;
                    break Label_0061;
                }
            }
            redditPowerupsRepository$cancelPowerups$2 = new RedditPowerupsRepository$cancelPowerups$1(this, (c<? super RedditPowerupsRepository$cancelPowerups$1>)c);
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
            aj2.c.Q0(result);
        }
        else {
            aj2.c.Q0(result);
            if (!b && s != null) {
                final RemoteGqlPowerupsDataSource a = this.a;
                redditPowerupsRepository$cancelPowerups$2.L$0 = this;
                redditPowerupsRepository$cancelPowerups$2.L$1 = s2;
                redditPowerupsRepository$cancelPowerups$2.I$0 = i$0;
                redditPowerupsRepository$cancelPowerups$2.label = 1;
                if (a.a(s, (c<? super pg2.j>)redditPowerupsRepository$cancelPowerups$2) == coroutine_SUSPENDED) {
                    return coroutine_SUSPENDED;
                }
            }
            else {
                final RemoteGqlPowerupsDataSource a2 = this.a;
                redditPowerupsRepository$cancelPowerups$2.L$0 = this;
                redditPowerupsRepository$cancelPowerups$2.L$1 = s2;
                redditPowerupsRepository$cancelPowerups$2.I$0 = i$0;
                redditPowerupsRepository$cancelPowerups$2.label = 2;
                if (a2.d(s3, i$0, false, (c<? super pg2.j>)redditPowerupsRepository$cancelPowerups$2) == coroutine_SUSPENDED) {
                    return coroutine_SUSPENDED;
                }
            }
            redditPowerupsRepository = this;
        }
        redditPowerupsRepository.x(i$0, s2);
        return pg2.j.a;
    }
    
    public final Object i(final String s, String l$1, final PowerupsBenefit powerupsBenefit, final boolean b, final c<? super List<kd0.c>> c) {
        Object o = null;
        Label_0061: {
            if (c instanceof RedditPowerupsRepository$updateBenefitSetting.RedditPowerupsRepository$updateBenefitSetting$1) {
                final RedditPowerupsRepository$updateBenefitSetting.RedditPowerupsRepository$updateBenefitSetting$1 redditPowerupsRepository$updateBenefitSetting$1 = (RedditPowerupsRepository$updateBenefitSetting.RedditPowerupsRepository$updateBenefitSetting$1)c;
                final int label = redditPowerupsRepository$updateBenefitSetting$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditPowerupsRepository$updateBenefitSetting$1.label = label + Integer.MIN_VALUE;
                    o = redditPowerupsRepository$updateBenefitSetting$1;
                    break Label_0061;
                }
            }
            o = new RedditPowerupsRepository$updateBenefitSetting.RedditPowerupsRepository$updateBenefitSetting$1(this, (c)c);
        }
        final Object result = ((RedditPowerupsRepository$updateBenefitSetting.RedditPowerupsRepository$updateBenefitSetting$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RedditPowerupsRepository$updateBenefitSetting.RedditPowerupsRepository$updateBenefitSetting$1)o).label;
        RedditPowerupsRepository redditPowerupsRepository;
        Object f;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            l$1 = (String)((RedditPowerupsRepository$updateBenefitSetting.RedditPowerupsRepository$updateBenefitSetting$1)o).L$1;
            redditPowerupsRepository = (RedditPowerupsRepository)((RedditPowerupsRepository$updateBenefitSetting.RedditPowerupsRepository$updateBenefitSetting$1)o).L$0;
            aj2.c.Q0(result);
            f = result;
        }
        else {
            aj2.c.Q0(result);
            final RemoteGqlPowerupsDataSource a = this.a;
            ah2.f.f((Object)powerupsBenefit, "<this>");
            final SubredditBenefit$a companion = SubredditBenefit.Companion;
            final String rawValue = powerupsBenefit.getRawValue();
            companion.getClass();
            final SubredditBenefit a2 = SubredditBenefit$a.a(rawValue);
            ((RedditPowerupsRepository$updateBenefitSetting.RedditPowerupsRepository$updateBenefitSetting$1)o).L$0 = this;
            ((RedditPowerupsRepository$updateBenefitSetting.RedditPowerupsRepository$updateBenefitSetting$1)o).L$1 = l$1;
            ((RedditPowerupsRepository$updateBenefitSetting.RedditPowerupsRepository$updateBenefitSetting$1)o).label = 1;
            f = a.f(s, a2, b, (c)o);
            if (f == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            redditPowerupsRepository = this;
        }
        final List list = (List)f;
        redditPowerupsRepository.getClass();
        ah2.f.f((Object)l$1, "subredditName");
        redditPowerupsRepository.u().a((Object)l$1);
        final com.reddit.session.p p5 = (com.reddit.session.p)redditPowerupsRepository.g.d().invoke();
        if (p5 != null) {
            final String kindWithId = p5.getKindWithId();
            if (kindWithId != null) {
                redditPowerupsRepository.c.a(l$1, ah2.c.X((Object)kindWithId));
            }
        }
        return list;
    }
    
    public final t<List<kd0.g>> j(final String s) {
        final Object value = this.r.getValue();
        ah2.f.e(value, "<get-powerupAllocationsStore>(...)");
        final Store store = (Store)value;
        final t filter = ((t)this.k).filter((q)new e40.r(s, 1));
        ah2.f.e((Object)filter, "supportedSubredditsUpdat\u2026filter { it == username }");
        return (t<List<kd0.g>>)n0.G0((t)this.w((com.nytimes.android.external.store3.base.impl.Store<Object, String>)store, s, (t<?>)filter), this.d);
    }
    
    public final t<v20.a<kd0.l>> k(final String s) {
        ah2.f.f((Object)s, "subredditName");
        return (t<v20.a<kd0.l>>)n0.G0((t)this.w(this.u(), s, (t<?>)this.k), this.d);
    }
    
    public final t<List<kd0.p>> l(final String s) {
        ah2.f.f((Object)s, "subredditName");
        final Object value = this.p.getValue();
        ah2.f.e(value, "<get-topSupportersStore>(...)");
        return (t<List<kd0.p>>)n0.G0((t)this.w((com.nytimes.android.external.store3.base.impl.Store<Object, String>)value, s, (t<?>)this.k), this.d);
    }
    
    public final Object m(String s, final String s2, int i$0, final boolean b, final c<? super pg2.j> c) {
        RedditPowerupsRepository$allocatePowerups.RedditPowerupsRepository$allocatePowerups$1 redditPowerupsRepository$allocatePowerups$2 = null;
        Label_0061: {
            if (c instanceof RedditPowerupsRepository$allocatePowerups.RedditPowerupsRepository$allocatePowerups$1) {
                final RedditPowerupsRepository$allocatePowerups.RedditPowerupsRepository$allocatePowerups$1 redditPowerupsRepository$allocatePowerups$1 = (RedditPowerupsRepository$allocatePowerups.RedditPowerupsRepository$allocatePowerups$1)c;
                final int label = redditPowerupsRepository$allocatePowerups$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditPowerupsRepository$allocatePowerups$1.label = label + Integer.MIN_VALUE;
                    redditPowerupsRepository$allocatePowerups$2 = redditPowerupsRepository$allocatePowerups$1;
                    break Label_0061;
                }
            }
            redditPowerupsRepository$allocatePowerups$2 = new RedditPowerupsRepository$allocatePowerups.RedditPowerupsRepository$allocatePowerups$1(this, (c)c);
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
            aj2.c.Q0(result);
        }
        else {
            aj2.c.Q0(result);
            final RemoteGqlPowerupsDataSource a = this.a;
            redditPowerupsRepository$allocatePowerups$2.L$0 = this;
            redditPowerupsRepository$allocatePowerups$2.L$1 = s;
            redditPowerupsRepository$allocatePowerups$2.I$0 = i$0;
            redditPowerupsRepository$allocatePowerups$2.label = 1;
            if (a.d(s2, i$0, b, (c<? super pg2.j>)redditPowerupsRepository$allocatePowerups$2) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            redditPowerupsRepository = this;
        }
        final pg2.j a2 = pg2.j.a;
        redditPowerupsRepository.x(i$0, s);
        redditPowerupsRepository.m.setValue((Object)s);
        return pg2.j.a;
    }
    
    public final t<n> n() {
        return (t<n>)n0.G0(kotlinx.coroutines.rx2.e.c((e)this.a()), this.d);
    }
    
    public final Object o(final String s, Set<String> l$1, final c<? super Map<String, ? extends Set<String>>> c) {
        Object o = null;
        Label_0056: {
            if (c instanceof RedditPowerupsRepository$getUsersSupportedSubredditIds.RedditPowerupsRepository$getUsersSupportedSubredditIds$1) {
                final RedditPowerupsRepository$getUsersSupportedSubredditIds.RedditPowerupsRepository$getUsersSupportedSubredditIds$1 redditPowerupsRepository$getUsersSupportedSubredditIds$1 = (RedditPowerupsRepository$getUsersSupportedSubredditIds.RedditPowerupsRepository$getUsersSupportedSubredditIds$1)c;
                final int label = redditPowerupsRepository$getUsersSupportedSubredditIds$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditPowerupsRepository$getUsersSupportedSubredditIds$1.label = label + Integer.MIN_VALUE;
                    o = redditPowerupsRepository$getUsersSupportedSubredditIds$1;
                    break Label_0056;
                }
            }
            o = new RedditPowerupsRepository$getUsersSupportedSubredditIds.RedditPowerupsRepository$getUsersSupportedSubredditIds$1(this, (c)c);
        }
        Object o2 = ((RedditPowerupsRepository$getUsersSupportedSubredditIds.RedditPowerupsRepository$getUsersSupportedSubredditIds$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RedditPowerupsRepository$getUsersSupportedSubredditIds.RedditPowerupsRepository$getUsersSupportedSubredditIds$1)o).label;
        boolean b = true;
        RedditPowerupsRepository redditPowerupsRepository;
        if (label2 != 0) {
            if (label2 != 1) {
                if (label2 == 2) {
                    aj2.c.Q0(o2);
                    return o2;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            else {
                l$1 = (Set)((RedditPowerupsRepository$getUsersSupportedSubredditIds.RedditPowerupsRepository$getUsersSupportedSubredditIds$1)o).L$1;
                redditPowerupsRepository = (RedditPowerupsRepository)((RedditPowerupsRepository$getUsersSupportedSubredditIds.RedditPowerupsRepository$getUsersSupportedSubredditIds$1)o).L$0;
                aj2.c.Q0(o2);
            }
        }
        else {
            aj2.c.Q0(o2);
            ((RedditPowerupsRepository$getUsersSupportedSubredditIds.RedditPowerupsRepository$getUsersSupportedSubredditIds$1)o).L$0 = this;
            ((RedditPowerupsRepository$getUsersSupportedSubredditIds.RedditPowerupsRepository$getUsersSupportedSubredditIds$1)o).L$1 = l$1;
            ((RedditPowerupsRepository$getUsersSupportedSubredditIds.RedditPowerupsRepository$getUsersSupportedSubredditIds$1)o).label = 1;
            o2 = this.p(s, (c<? super kd0.l>)o);
            if (o2 == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            redditPowerupsRepository = this;
        }
        if (o2 == null) {
            b = false;
        }
        if (!b) {
            return kotlin.collections.c.N1();
        }
        final com.reddit.data.powerups.batchstore.a<String, Set<String>> q = redditPowerupsRepository.q;
        ((RedditPowerupsRepository$getUsersSupportedSubredditIds.RedditPowerupsRepository$getUsersSupportedSubredditIds$1)o).L$0 = null;
        ((RedditPowerupsRepository$getUsersSupportedSubredditIds.RedditPowerupsRepository$getUsersSupportedSubredditIds$1)o).L$1 = null;
        ((RedditPowerupsRepository$getUsersSupportedSubredditIds.RedditPowerupsRepository$getUsersSupportedSubredditIds$1)o).label = 2;
        if ((o2 = q.a(l$1, (c)o)) == coroutine_SUSPENDED) {
            return coroutine_SUSPENDED;
        }
        return o2;
    }
    
    public final Object p(final String s, final c<? super kd0.l> c) {
        Object o = null;
        Label_0052: {
            if (c instanceof RedditPowerupsRepository$getSubredditPowerupInfoByName.RedditPowerupsRepository$getSubredditPowerupInfoByName$1) {
                final RedditPowerupsRepository$getSubredditPowerupInfoByName.RedditPowerupsRepository$getSubredditPowerupInfoByName$1 redditPowerupsRepository$getSubredditPowerupInfoByName$1 = (RedditPowerupsRepository$getSubredditPowerupInfoByName.RedditPowerupsRepository$getSubredditPowerupInfoByName$1)c;
                final int label = redditPowerupsRepository$getSubredditPowerupInfoByName$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditPowerupsRepository$getSubredditPowerupInfoByName$1.label = label + Integer.MIN_VALUE;
                    o = redditPowerupsRepository$getSubredditPowerupInfoByName$1;
                    break Label_0052;
                }
            }
            o = new RedditPowerupsRepository$getSubredditPowerupInfoByName.RedditPowerupsRepository$getSubredditPowerupInfoByName$1(this, (c)c);
        }
        final Object result = ((RedditPowerupsRepository$getSubredditPowerupInfoByName.RedditPowerupsRepository$getSubredditPowerupInfoByName$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RedditPowerupsRepository$getSubredditPowerupInfoByName.RedditPowerupsRepository$getSubredditPowerupInfoByName$1)o).label;
        Object l;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aj2.c.Q0(result);
            l = result;
        }
        else {
            aj2.c.Q0(result);
            final uj2.a c2 = this.h.c();
            final RedditPowerupsRepository$getSubredditPowerupInfoByName$2 redditPowerupsRepository$getSubredditPowerupInfoByName$2 = new RedditPowerupsRepository$getSubredditPowerupInfoByName$2(this, s, (c)null);
            ((RedditPowerupsRepository$getSubredditPowerupInfoByName.RedditPowerupsRepository$getSubredditPowerupInfoByName$1)o).label = 1;
            if ((l = mj2.g.l((CoroutineContext)c2, (p)redditPowerupsRepository$getSubredditPowerupInfoByName$2, (c)o)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        return ((v20.a)l).a;
    }
    
    public final Object q(String s, Set<String> set, final c<? super List<kd0.r>> c) {
        RedditPowerupsRepository$getUsersAchievementFlairs.RedditPowerupsRepository$getUsersAchievementFlairs$1 redditPowerupsRepository$getUsersAchievementFlairs$1 = null;
        Label_0054: {
            if (c instanceof RedditPowerupsRepository$getUsersAchievementFlairs.RedditPowerupsRepository$getUsersAchievementFlairs$1) {
                redditPowerupsRepository$getUsersAchievementFlairs$1 = (RedditPowerupsRepository$getUsersAchievementFlairs.RedditPowerupsRepository$getUsersAchievementFlairs$1)c;
                final int label = redditPowerupsRepository$getUsersAchievementFlairs$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditPowerupsRepository$getUsersAchievementFlairs$1.label = label + Integer.MIN_VALUE;
                    break Label_0054;
                }
            }
            redditPowerupsRepository$getUsersAchievementFlairs$1 = new RedditPowerupsRepository$getUsersAchievementFlairs.RedditPowerupsRepository$getUsersAchievementFlairs$1(this, (c)c);
        }
        Object o = redditPowerupsRepository$getUsersAchievementFlairs$1.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = redditPowerupsRepository$getUsersAchievementFlairs$1.label;
        Map map = null;
        RedditPowerupsRepository redditPowerupsRepository = null;
        Object b = null;
        Label_0511: {
            String s2 = null;
            RedditPowerupsRepository l$0 = null;
            boolean booleanValue = false;
            Label_0355: {
                Label_0342: {
                    Set<String> set2;
                    RedditPowerupsRepository redditPowerupsRepository2;
                    if (label2 != 0) {
                        if (label2 != 1) {
                            if (label2 == 2) {
                                set = (Set)redditPowerupsRepository$getUsersAchievementFlairs$1.L$2;
                                s2 = (String)redditPowerupsRepository$getUsersAchievementFlairs$1.L$1;
                                l$0 = (RedditPowerupsRepository)redditPowerupsRepository$getUsersAchievementFlairs$1.L$0;
                                aj2.c.Q0(o);
                                break Label_0342;
                            }
                            if (label2 == 3) {
                                map = (Map)redditPowerupsRepository$getUsersAchievementFlairs$1.L$1;
                                redditPowerupsRepository = (RedditPowerupsRepository)redditPowerupsRepository$getUsersAchievementFlairs$1.L$0;
                                aj2.c.Q0(o);
                                b = o;
                                break Label_0511;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        else {
                            set2 = (Set)redditPowerupsRepository$getUsersAchievementFlairs$1.L$2;
                            s = (String)redditPowerupsRepository$getUsersAchievementFlairs$1.L$1;
                            redditPowerupsRepository2 = (RedditPowerupsRepository)redditPowerupsRepository$getUsersAchievementFlairs$1.L$0;
                            aj2.c.Q0(o);
                        }
                    }
                    else {
                        aj2.c.Q0(o);
                        if (this.j.B5()) {
                            redditPowerupsRepository$getUsersAchievementFlairs$1.L$0 = this;
                            redditPowerupsRepository$getUsersAchievementFlairs$1.L$1 = s;
                            redditPowerupsRepository$getUsersAchievementFlairs$1.L$2 = set;
                            redditPowerupsRepository$getUsersAchievementFlairs$1.label = 1;
                            o = this.y(s, (c<? super Boolean>)redditPowerupsRepository$getUsersAchievementFlairs$1);
                            if (o == coroutine_SUSPENDED) {
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
                            o = this.p(s, (c<? super kd0.l>)redditPowerupsRepository$getUsersAchievementFlairs$1);
                            if (o == coroutine_SUSPENDED) {
                                return coroutine_SUSPENDED;
                            }
                            s2 = s;
                            l$0 = this;
                            break Label_0342;
                        }
                    }
                    booleanValue = (boolean)o;
                    final Set<String> set3 = set2;
                    s2 = s;
                    l$0 = redditPowerupsRepository2;
                    set = set3;
                    break Label_0355;
                }
                booleanValue = (o != null);
            }
            if (!booleanValue) {
                return EmptyList.INSTANCE;
            }
            final l c2 = l$0.c;
            c2.getClass();
            ah2.f.f((Object)s2, "subredditName");
            ah2.f.f((Object)set, "usersKindWithIds");
            final Map z1 = kotlin.collections.c.Z1((k)kotlin.sequences.b.e1((k)CollectionsKt___CollectionsKt.e1((Iterable)set), (zg2.l)new UserAchievementFlairCache$getCachedFlairs$1(s2, c2)));
            final Set o2 = d0.O1((Set)set, (Collection)z1.keySet());
            if (o2.isEmpty()) {
                return CollectionsKt___CollectionsKt.h2((Iterable)z1.values());
            }
            final b b2 = l$0.b;
            final List x = ah2.c.X((Object)s2);
            final List h2 = CollectionsKt___CollectionsKt.h2((Iterable)o2);
            redditPowerupsRepository$getUsersAchievementFlairs$1.L$0 = l$0;
            redditPowerupsRepository$getUsersAchievementFlairs$1.L$1 = z1;
            redditPowerupsRepository$getUsersAchievementFlairs$1.L$2 = null;
            redditPowerupsRepository$getUsersAchievementFlairs$1.label = 3;
            b = b2.b(x, h2, (c)redditPowerupsRepository$getUsersAchievementFlairs$1);
            if (b == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            redditPowerupsRepository = l$0;
            map = z1;
        }
        final List list = (List)b;
        final ArrayList list2 = new ArrayList<kd0.r>(qg2.m.P0((Iterable)list, 10));
        for (kd0.r a : list) {
            ah2.f.f((Object)a, "flairs");
            final List d = a.d;
            if (!d.isEmpty()) {
                boolean b3 = false;
                Label_0644: {
                    if (!d.isEmpty()) {
                        final Iterator iterator2 = d.iterator();
                        while (iterator2.hasNext()) {
                            if (((kd0.q)iterator2.next()).l) {
                                b3 = true;
                                break Label_0644;
                            }
                        }
                    }
                    b3 = false;
                }
                if (!b3) {
                    final ArrayList a2 = ah2.c.a0((Object[])new kd0.q[] { kd0.q.H1((kd0.q)d.get(0), true) });
                    qg2.o.U0(a2, kotlin.sequences.b.S0((k)CollectionsKt___CollectionsKt.e1((Iterable)d), 1));
                    a = kd0.r.a(a, a2);
                }
            }
            list2.add(a);
        }
        final ArrayList list3 = new ArrayList<kd0.r>(qg2.m.P0((Iterable)list2, 10));
        for (kd0.r a3 : list2) {
            redditPowerupsRepository.getClass();
            ah2.f.f((Object)a3, "flairs");
            if (redditPowerupsRepository.j.B5()) {
                final List d2 = a3.d;
                if (!d2.isEmpty()) {
                    final ArrayList<kd0.q> list4 = new ArrayList<kd0.q>();
                    for (final Object next : d2) {
                        if (((kd0.q)next).k == FlairCategory.ACHIEVEMENT) {
                            list4.add((kd0.q)next);
                        }
                    }
                    a3 = kd0.r.a(a3, (ArrayList)list4);
                }
            }
            list3.add(a3);
        }
        final l c3 = redditPowerupsRepository.c;
        c3.getClass();
        for (final kd0.r r : list3) {
            final w50.a a4 = new w50.a(r.b, r.c);
            final ConcurrentMap a5 = c3.a;
            ah2.f.e((Object)a5, "cache");
            a5.put(a4, r);
        }
        return CollectionsKt___CollectionsKt.N1((Iterable)list3, (Collection)map.values());
    }
    
    public final StateFlowImpl r() {
        return this.m;
    }
    
    public final ArrayList s() {
        final d f = kd0.d.f;
        Object f2 = kd0.h.f;
        final boolean va = this.f.va();
        i i = null;
        if (!va) {
            f2 = null;
        }
        final kd0.b b = new kd0.b(PowerupsBenefit.COMMENTS_WITH_GIFS);
        if (true ^ this.e.C3()) {
            i = (i)b;
        }
        ArrayList list2;
        final ArrayList list = list2 = kotlin.collections.b.z1((Object[])new i[] { (i)f, (i)f2, i, (i)new kd0.b(PowerupsBenefit.COMMENTS_WITH_EMOJI), (i)new kd0.b(PowerupsBenefit.ACHIEVEMENT_FLAIRS), (i)kd0.e.f, (i)new kd0.b(PowerupsBenefit.HD_VIDEO) });
        if (list.size() % 2 != 0) {
            list2 = CollectionsKt___CollectionsKt.O1((Collection)list, (Object)kd0.f.f);
        }
        return list2;
    }
    
    public final Store<v20.a<kd0.l>, String> u() {
        final Object value = this.o.getValue();
        ah2.f.e(value, "<get-powerupsStatusStore>(...)");
        return (Store<v20.a<kd0.l>, String>)value;
    }
    
    public final Store<n, String> v() {
        final Object value = this.t.getValue();
        ah2.f.e(value, "<get-selfPowerupAllocationsStore>(...)");
        return (Store<n, String>)value;
    }
    
    public final <V, K> t<V> w(final Store<V, K> store, final K k, final t<?> t) {
        final t startWith = n0.j0((t)t, (r20.d)this.d).switchMap((sf2.o)new y(2, (Object)store, (Object)k)).startWith((nf2.y)store.get((Object)k).N());
        ah2.f.e((Object)startWith, "updates\n      .observeOn\u2026(get(key).toObservable())");
        return (t<V>)startWith;
    }
    
    public final void x(int n, final String s) {
        final String username = ((Session)this.g.c()).getUsername();
        ah2.f.c((Object)username);
        final Object invoke = this.g.d().invoke();
        ah2.f.c(invoke);
        final String kindWithId = ((com.reddit.session.p)invoke).getKindWithId();
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
        final Object value = this.r.getValue();
        ah2.f.e(value, "<get-powerupAllocationsStore>(...)");
        ((Store)value).a((Object)username);
        final Object value2 = this.p.getValue();
        ah2.f.e(value2, "<get-topSupportersStore>(...)");
        ((Store)value2).a((Object)s);
        this.u().a((Object)s);
        this.k.onNext((Object)username);
        this.l.setValue(new Object());
        this.c.a(s, ah2.c.X((Object)kindWithId));
        this.q.b.remove(kindWithId);
    }
    
    public final Object y(final String s, final c<? super Boolean> c) {
        Object o = null;
        Label_0052: {
            if (c instanceof RedditPowerupsRepository$isAchievementFlairEnabledForSubreddit.RedditPowerupsRepository$isAchievementFlairEnabledForSubreddit$1) {
                final RedditPowerupsRepository$isAchievementFlairEnabledForSubreddit.RedditPowerupsRepository$isAchievementFlairEnabledForSubreddit$1 redditPowerupsRepository$isAchievementFlairEnabledForSubreddit$1 = (RedditPowerupsRepository$isAchievementFlairEnabledForSubreddit.RedditPowerupsRepository$isAchievementFlairEnabledForSubreddit$1)c;
                final int label = redditPowerupsRepository$isAchievementFlairEnabledForSubreddit$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditPowerupsRepository$isAchievementFlairEnabledForSubreddit$1.label = label + Integer.MIN_VALUE;
                    o = redditPowerupsRepository$isAchievementFlairEnabledForSubreddit$1;
                    break Label_0052;
                }
            }
            o = new RedditPowerupsRepository$isAchievementFlairEnabledForSubreddit.RedditPowerupsRepository$isAchievementFlairEnabledForSubreddit$1(this, (c)c);
        }
        final Object result = ((RedditPowerupsRepository$isAchievementFlairEnabledForSubreddit.RedditPowerupsRepository$isAchievementFlairEnabledForSubreddit$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RedditPowerupsRepository$isAchievementFlairEnabledForSubreddit.RedditPowerupsRepository$isAchievementFlairEnabledForSubreddit$1)o).label;
        Object o2;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aj2.c.Q0(result);
            o2 = ((Result)result).unbox-impl();
        }
        else {
            aj2.c.Q0(result);
            final dl0.a i = this.i;
            ((RedditPowerupsRepository$isAchievementFlairEnabledForSubreddit.RedditPowerupsRepository$isAchievementFlairEnabledForSubreddit$1)o).label = 1;
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
