// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.repository;

import com.reddit.domain.exceptions.ApiException;
import com.reddit.data.adapter.DataWithErrorsResponse;
import java.util.Collection;
import kotlin.collections.CollectionsKt___CollectionsKt;
import okhttp3.ResponseBody;
import pf2.h;
import b60.s;
import com.reddit.domain.model.GenderOption;
import com.reddit.domain.model.Gender;
import io.reactivex.internal.operators.single.SingleFlatMap;
import b60.x0;
import com.reddit.domain.model.DefaultAvatar;
import l10.q;
import java.util.Map;
import okhttp3.OkHttpClient;
import mr0.e$a;
import com.reddit.queries.z8;
import h7.h$a;
import com.reddit.domain.model.MyPendingCommunityInvitations;
import java.util.concurrent.TimeUnit;
import com.reddit.domain.model.AccountPreferencesPatch;
import java.util.Iterator;
import java.util.List;
import com.reddit.domain.model.FollowerModel;
import java.util.ArrayList;
import java.util.Set;
import af2.c0;
import com.reddit.domain.model.FollowersPage;
import mg2.p;
import kotlin.coroutines.CoroutineContext;
import zi2.g;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import com.reddit.domain.model.FileUploadLease;
import gg2.c;
import com.reddit.domain.model.ProfileImageType;
import java.io.File;
import mg.d0;
import io.reactivex.plugins.RxJavaPlugins;
import ff2.o;
import af2.g0;
import io.reactivex.internal.operators.single.SingleFlatMapCompletable;
import b60.y0;
import com.reddit.domain.model.UserSubreddit;
import com.reddit.domain.model.MyAccount;
import javax.inject.Inject;
import ng2.e;
import wa0.b;
import wa0.j;
import xd0.d;
import x40.r0;
import com.reddit.data.remote.RemoteGqlMyAccountDataSource;
import com.reddit.data.remote.RemoteAccountPreferenceDataSource;
import va0.k;
import com.reddit.data.remote.RemoteAccountDataSource;
import x40.z;
import com.reddit.session.n;
import ws0.a;
import xd0.m;

public final class RedditMyAccountRepository implements m
{
    public final a a;
    public final n b;
    public final q20.a c;
    public final z d;
    public final RemoteAccountDataSource e;
    public final k f;
    public final RemoteAccountPreferenceDataSource g;
    public final RemoteGqlMyAccountDataSource h;
    public final r0 i;
    public final d j;
    public final d20.a k;
    public final j l;
    public final b m;
    public long n;
    
    @Inject
    public RedditMyAccountRepository(final a a, final n b, final q20.a c, final z d, final RemoteAccountDataSource e, final k f, final RemoteAccountPreferenceDataSource g, final RemoteGqlMyAccountDataSource h, final r0 i, final d j, final d20.a k, final j l, final b m) {
        ng2.e.f((Object)a, "appSettings");
        ng2.e.f((Object)b, "sessionManager");
        ng2.e.f((Object)c, "backgroundThread");
        ng2.e.f((Object)d, "localAccountDataSource");
        ng2.e.f((Object)e, "remoteAccountDataSource");
        ng2.e.f((Object)f, "localAccountPreferenceDataSource");
        ng2.e.f((Object)g, "remoteAccountPreferenceDataSource");
        ng2.e.f((Object)h, "remoteGqlMyAccountDataSource");
        ng2.e.f((Object)i, "memoryFollowersDataSource");
        ng2.e.f((Object)j, "blockedAccountRepository");
        ng2.e.f((Object)k, "dispatcherProvider");
        ng2.e.f((Object)l, "internalFeatures");
        ng2.e.f((Object)m, "channelsFeatures");
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
    }
    
    public static String u(final MyAccount myAccount) {
        final UserSubreddit subreddit = myAccount.getSubreddit();
        String s = null;
        String displayName;
        if (subreddit != null) {
            displayName = subreddit.getDisplayName();
        }
        else {
            displayName = null;
        }
        if (px1.a.f0((CharSequence)displayName)) {
            s = displayName;
        }
        String string;
        if ((string = s) == null) {
            final StringBuilder t = a.t("u_");
            t.append(myAccount.getUsername());
            string = t.toString();
        }
        return string;
    }
    
    @Override
    public final af2.a F1() {
        final af2.a onAssembly = RxJavaPlugins.onAssembly((af2.a)new SingleFlatMapCompletable<Object>((af2.g0<?>)this.g(false), (ff2.o<?, ? extends af2.e>)new y0(this, 1)));
        ng2.e.e((Object)onAssembly, "getMyAccount()\n      .fl\u2026edditDisplayName)\n      }");
        return d0.S0(onAssembly, (q20.d)this.c);
    }
    
    @Override
    public final Object a(final File file, final ProfileImageType profileImageType, final c<? super FileUploadLease> c) {
        RedditMyAccountRepository$getImageFileUploadLease$1 redditMyAccountRepository$getImageFileUploadLease$2 = null;
        Label_0054: {
            if (c instanceof RedditMyAccountRepository$getImageFileUploadLease$1) {
                final RedditMyAccountRepository$getImageFileUploadLease$1 redditMyAccountRepository$getImageFileUploadLease$1 = (RedditMyAccountRepository$getImageFileUploadLease$1)c;
                final int label = redditMyAccountRepository$getImageFileUploadLease$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditMyAccountRepository$getImageFileUploadLease$1.label = label + Integer.MIN_VALUE;
                    redditMyAccountRepository$getImageFileUploadLease$2 = redditMyAccountRepository$getImageFileUploadLease$1;
                    break Label_0054;
                }
            }
            redditMyAccountRepository$getImageFileUploadLease$2 = new RedditMyAccountRepository$getImageFileUploadLease$1(this, (c)c);
        }
        final Object result = redditMyAccountRepository$getImageFileUploadLease$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = redditMyAccountRepository$getImageFileUploadLease$2.label;
        Object j;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cg.d.b4(result);
            j = result;
        }
        else {
            cg.d.b4(result);
            final ij2.a c2 = this.k.c();
            final RedditMyAccountRepository$getImageFileUploadLease$2 redditMyAccountRepository$getImageFileUploadLease$3 = new RedditMyAccountRepository$getImageFileUploadLease$2(this, file, profileImageType, (c)null);
            redditMyAccountRepository$getImageFileUploadLease$2.label = 1;
            if ((j = zi2.g.j((CoroutineContext)c2, (p)redditMyAccountRepository$getImageFileUploadLease$3, (c)redditMyAccountRepository$getImageFileUploadLease$2)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        ng2.e.e(j, "override suspend fun get\u2026       .await()\n    }\n  }");
        return j;
    }
    
    @Override
    public final Object b(final String s, final String s2, final int n, final c c) {
        Object o = null;
        Label_0059: {
            if (c instanceof RedditMyAccountRepository$getFollowedByRedditors$1) {
                final RedditMyAccountRepository$getFollowedByRedditors$1 redditMyAccountRepository$getFollowedByRedditors$1 = (RedditMyAccountRepository$getFollowedByRedditors$1)c;
                final int label = redditMyAccountRepository$getFollowedByRedditors$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditMyAccountRepository$getFollowedByRedditors$1.label = label + Integer.MIN_VALUE;
                    o = redditMyAccountRepository$getFollowedByRedditors$1;
                    break Label_0059;
                }
            }
            o = new RedditMyAccountRepository$getFollowedByRedditors$1(this, c);
        }
        Object o2 = ((RedditMyAccountRepository$getFollowedByRedditors$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RedditMyAccountRepository$getFollowedByRedditors$1)o).label;
        FollowersPage followersPage = null;
        Label_0227: {
            RedditMyAccountRepository redditMyAccountRepository;
            if (label2 != 0) {
                if (label2 != 1) {
                    if (label2 == 2) {
                        followersPage = (FollowersPage)((RedditMyAccountRepository$getFollowedByRedditors$1)o).L$0;
                        cg.d.b4(o2);
                        break Label_0227;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                else {
                    redditMyAccountRepository = (RedditMyAccountRepository)((RedditMyAccountRepository$getFollowedByRedditors$1)o).L$0;
                    cg.d.b4(o2);
                }
            }
            else {
                cg.d.b4(o2);
                ((RedditMyAccountRepository$getFollowedByRedditors$1)o).L$0 = this;
                ((RedditMyAccountRepository$getFollowedByRedditors$1)o).label = 1;
                o2 = this.t(s, s2, n, (c)o);
                if (o2 == coroutine_SUSPENDED) {
                    return coroutine_SUSPENDED;
                }
                redditMyAccountRepository = this;
            }
            final FollowersPage l$0 = (FollowersPage)o2;
            final c0<Set<String>> d = redditMyAccountRepository.j.d();
            ((RedditMyAccountRepository$getFollowedByRedditors$1)o).L$0 = l$0;
            ((RedditMyAccountRepository$getFollowedByRedditors$1)o).label = 2;
            o2 = kotlinx.coroutines.rx2.d.b(d, (c)o);
            if (o2 == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            followersPage = l$0;
        }
        final Set set = (Set)o2;
        final List followers = followersPage.getFollowers();
        final ArrayList<FollowerModel> list = new ArrayList<FollowerModel>();
        for (final Object next : followers) {
            if (set.contains(((FollowerModel)next).getUserId()) ^ true) {
                list.add((FollowerModel)next);
            }
        }
        return FollowersPage.copy$default(followersPage, (List)list, (String)null, 2, (Object)null);
    }
    
    @Override
    public final Object c(final AccountPreferencesPatch accountPreferencesPatch, final c<? super cg2.j> c) {
        final Object j = zi2.g.j((CoroutineContext)this.k.c(), (p)new RedditMyAccountRepository$updateAccountPreferences$2(this, accountPreferencesPatch, (c)null), c);
        if (j == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return j;
        }
        return cg2.j.a;
    }
    
    @Override
    public final af2.a d(final String s, final boolean b, final boolean b2, final long n) {
        ng2.e.f((Object)s, "username");
        return d0.S0(this.d.d(s, b, b2, n), (q20.d)this.c);
    }
    
    @Override
    public final Object e(final ProfileImageType profileImageType, final String s, final c<? super cg2.j> c) {
        final Object j = zi2.g.j((CoroutineContext)this.k.c(), (p)new RedditMyAccountRepository$updateImageSuspend$2(this, profileImageType, s, (c)null), c);
        if (j == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return j;
        }
        return cg2.j.a;
    }
    
    @Override
    public final af2.a f(final int n, final String s) {
        ng2.e.f((Object)s, "username");
        return d0.S0(this.d.f(n, s), (q20.d)this.c);
    }
    
    @Override
    public final c0<MyAccount> g(final boolean b) {
        c0<MyAccount> c2;
        if (System.currentTimeMillis() - this.n <= TimeUnit.MINUTES.toMillis(1L) && !b) {
            final MyAccount c = this.b.C();
            String username;
            if (c != null) {
                username = ((com.reddit.session.m)c).getUsername();
            }
            else {
                username = null;
            }
            if (username == null || username.length() == 0) {
                c2 = this.j();
            }
            else {
                c2 = this.d.h(username).w(this.j());
                ng2.e.e((Object)c2, "{\n        localAccountDa\u2026MyAccountFresh())\n      }");
            }
        }
        else {
            c2 = this.j();
        }
        return px1.a.K0((c0)c2, (q20.d)this.c);
    }
    
    @Override
    public final c0<MyPendingCommunityInvitations> h(final String s) {
        ng2.e.f((Object)s, "subredditId");
        final RemoteGqlMyAccountDataSource h = this.h;
        h.getClass();
        final c0 w = e$a.a((mr0.e)h.a, (h7.k)new z8(h$a.c((Object)s)), (OkHttpClient)null, (Map)null, 14).w((o)new q(6));
        ng2.e.e((Object)w, "graphQlClient.execute(\n \u2026apToDomainModel(it)\n    }");
        return px1.a.K0((c0)w, (q20.d)this.c);
    }
    
    @Override
    public final c0<DefaultAvatar> i() {
        final c0 onAssembly = RxJavaPlugins.onAssembly((c0)new SingleFlatMap((g0)this.g(false), (o)new x0(this, 1)));
        ng2.e.e((Object)onAssembly, "getMyAccount()\n      .fl\u2026edditDisplayName)\n      }");
        return px1.a.K0(onAssembly, (q20.d)this.c);
    }
    
    @Override
    public final c0<MyAccount> j() {
        final c0 p = this.e.getMyAccount().p((o)new y0(this, 0));
        ng2.e.e((Object)p, "remoteAccountDataSource.\u2026Account\n        }\n      }");
        return px1.a.K0((c0)p, (q20.d)this.c);
    }
    
    @Override
    public final Object k(final c<? super cg2.j> c) {
        final Object j = zi2.g.j((CoroutineContext)this.k.c(), (p)new RedditMyAccountRepository$removeBannerSuspend$2(this, (c)null), c);
        if (j == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return j;
        }
        return cg2.j.a;
    }
    
    @Override
    public final Object l(final c<? super Gender> c) {
        return this.h.b((c)c);
    }
    
    @Override
    public final Object m(final GenderOption genderOption, final String s, final c<? super Boolean> c) {
        return this.h.c(genderOption, s, (c)c);
    }
    
    @Override
    public final af2.a n(final AccountPreferencesPatch accountPreferencesPatch) {
        final c0 patchPreferences = this.g.patchPreferences(accountPreferencesPatch);
        final s s = new s((Object)this, 1);
        patchPreferences.getClass();
        final af2.a k = RxJavaPlugins.onAssembly((c0)new h((g0)patchPreferences, (ff2.g)s)).K();
        ng2.e.e((Object)k, "remoteAccountPreferenceD\u2026 }\n      .toCompletable()");
        return d0.S0(k, (q20.d)this.c);
    }
    
    @Override
    public final c0<Boolean> o() {
        c0<Boolean> c0;
        if (this.m.N3()) {
            final c0 w = this.e.getMyAccount().w((o)new su.d(15));
            ng2.e.e((Object)w, "remoteAccountDataSource.\u2026missionRequired\n        }");
            c0 = px1.a.K0((c0)w, (q20.d)this.c);
        }
        else {
            final a a = this.a;
            this.l.p();
            final Boolean f1 = a.F1(false);
            if (f1 != null) {
                c0 = af2.c0.v(f1);
                ng2.e.e((Object)c0, "{\n        Single.just(re\u2026eEmailPermission)\n      }");
            }
            else {
                final c0 w2 = this.e.getMyAccount().w((o)new x0(this, 0));
                ng2.e.e((Object)w2, "remoteAccountDataSource.\u2026ssionRequired\n          }");
                c0 = px1.a.K0((c0)w2, (q20.d)this.c);
            }
        }
        return c0;
    }
    
    @Override
    public final af2.a p(final ProfileImageType profileImageType, final String s) {
        ng2.e.f((Object)s, "newUrl");
        final af2.a onAssembly = RxJavaPlugins.onAssembly((af2.a)new SingleFlatMapCompletable<Object>((af2.g0<?>)this.g(false), (ff2.o<?, ? extends af2.e>)new c40.m((Object)this, 1, (Object)profileImageType, (Object)s)));
        ng2.e.e((Object)onAssembly, "getMyAccount()\n      .fl\u2026ewUrl),\n        )\n      }");
        return d0.S0(onAssembly, (q20.d)this.c);
    }
    
    @Override
    public final Object q(final c<? super DefaultAvatar> c) {
        return zi2.g.j((CoroutineContext)this.k.c(), (p)new RedditMyAccountRepository$removeAvatarSuspend$2(this, (c)null), c);
    }
    
    @Override
    public final void r(final String s, final boolean b) {
        final String i = r20.a.i(s);
        final r0 j = this.i;
        synchronized (j) {
            ng2.e.f((Object)i, "username");
            final FollowersPage a = j.a;
            if (a == null) {
                monitorexit(j);
            }
            else {
                final List followers = a.getFollowers();
                final ArrayList list = new ArrayList<FollowerModel>(dg2.m.u4((Iterable)followers, 10));
                for (FollowerModel copy$default : followers) {
                    final FollowerModel followerModel = copy$default;
                    if (ng2.e.a((Object)followerModel.getUsername(), (Object)i)) {
                        copy$default = FollowerModel.copy$default(followerModel, (String)null, (String)null, (String)null, (List)null, (String)null, false, b, (Integer)null, false, 447, (Object)null);
                    }
                    list.add(copy$default);
                }
                j.a = FollowersPage.copy$default(a, (List)list, (String)null, 2, (Object)null);
            }
        }
    }
    
    @Override
    public final c0<ResponseBody> s() {
        final c0 onAssembly = RxJavaPlugins.onAssembly((c0)new SingleFlatMap((g0)this.g(false), (o)new com.reddit.data.repository.a(this, 4)));
        ng2.e.e((Object)onAssembly, "getMyAccount()\n      .fl\u2026edditDisplayName)\n      }");
        return px1.a.K0(onAssembly, (q20.d)this.c);
    }
    
    public final Object t(final String s, String i, final int n, c o) {
        Label_0059: {
            if (o instanceof RedditMyAccountRepository$getFollowedByRedditorsInternal$1) {
                final RedditMyAccountRepository$getFollowedByRedditorsInternal$1 redditMyAccountRepository$getFollowedByRedditorsInternal$1 = (RedditMyAccountRepository$getFollowedByRedditorsInternal$1)o;
                final int label = redditMyAccountRepository$getFollowedByRedditorsInternal$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditMyAccountRepository$getFollowedByRedditorsInternal$1.label = label + Integer.MIN_VALUE;
                    o = redditMyAccountRepository$getFollowedByRedditorsInternal$1;
                    break Label_0059;
                }
            }
            o = new RedditMyAccountRepository$getFollowedByRedditorsInternal$1(this, (c)o);
        }
        final Object result = ((RedditMyAccountRepository$getFollowedByRedditorsInternal$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RedditMyAccountRepository$getFollowedByRedditorsInternal$1)o).label;
        RedditMyAccountRepository redditMyAccountRepository;
        Object a;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = (String)((RedditMyAccountRepository$getFollowedByRedditorsInternal$1)o).L$1;
            redditMyAccountRepository = (RedditMyAccountRepository)((RedditMyAccountRepository$getFollowedByRedditorsInternal$1)o).L$0;
            cg.d.b4(result);
            a = result;
        }
        else {
            cg.d.b4(result);
            if (i == null && s == null) {
                final r0 j = this.i;
                synchronized (j) {
                    final FollowersPage a2 = j.a;
                    monitorexit(j);
                    if (a2 != null) {
                        return a2;
                    }
                }
            }
            final RemoteGqlMyAccountDataSource h = this.h;
            ((RedditMyAccountRepository$getFollowedByRedditorsInternal$1)o).L$0 = this;
            ((RedditMyAccountRepository$getFollowedByRedditorsInternal$1)o).L$1 = i;
            ((RedditMyAccountRepository$getFollowedByRedditorsInternal$1)o).label = 1;
            a = h.a(s, i, n, (c)o);
            if (a == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            redditMyAccountRepository = this;
        }
        o = a;
        if (i == null) {
            i = (String)redditMyAccountRepository.i;
            synchronized (i) {
                ng2.e.f(o, "followersPage");
                final FollowersPage a3 = ((r0)i).a;
                FollowersPage copy;
                if (a3 != null) {
                    copy = a3.copy((List)CollectionsKt___CollectionsKt.o5((Iterable)((FollowersPage)o).getFollowers(), (Collection)a3.getFollowers()), ((FollowersPage)o).getNextCursor());
                }
                else {
                    copy = (FollowersPage)o;
                }
                ((r0)i).a = copy;
            }
        }
        return o;
    }
    
    @Override
    public final Object updateName(final String s, final c<? super cg2.j> c) {
        Object o = null;
        Label_0051: {
            if (c instanceof RedditMyAccountRepository$updateName$1) {
                final RedditMyAccountRepository$updateName$1 redditMyAccountRepository$updateName$1 = (RedditMyAccountRepository$updateName$1)c;
                final int label = redditMyAccountRepository$updateName$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditMyAccountRepository$updateName$1.label = label + Integer.MIN_VALUE;
                    o = redditMyAccountRepository$updateName$1;
                    break Label_0051;
                }
            }
            o = new RedditMyAccountRepository$updateName$1(this, (c)c);
        }
        final Object result = ((RedditMyAccountRepository$updateName$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RedditMyAccountRepository$updateName$1)o).label;
        Object updateName;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cg.d.b4(result);
            updateName = result;
        }
        else {
            cg.d.b4(result);
            final RemoteAccountDataSource e = this.e;
            ((RedditMyAccountRepository$updateName$1)o).label = 1;
            if ((updateName = e.updateName(s, (c)o)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        final DataWithErrorsResponse dataWithErrorsResponse = (DataWithErrorsResponse)updateName;
        if (!(dataWithErrorsResponse.getJson().getErrors().isEmpty() ^ true)) {
            return cg2.j.a;
        }
        final List list = dataWithErrorsResponse.getJson().getErrors().get(0);
        throw new ApiException((String)list.get(0), (String)list.get(1));
    }
    
    @Override
    public final af2.a updateUserSubredditSettings(final Map<String, String> map) {
        ng2.e.f((Object)map, "params");
        return d0.S0(this.e.updateUserSubredditSettings((Map)map), (q20.d)this.c);
    }
    
    @Override
    public final Object updateUserSubredditSettingsSuspend(final Map<String, String> map, final c<? super cg2.j> c) {
        final Object j = zi2.g.j((CoroutineContext)this.k.c(), (p)new RedditMyAccountRepository$updateUserSubredditSettingsSuspend$2(this, (Map)map, (c)null), c);
        if (j == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return j;
        }
        return cg2.j.a;
    }
}
