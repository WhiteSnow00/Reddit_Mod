// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.repository;

import com.reddit.session.n;
import okhttp3.ResponseBody;
import com.reddit.domain.exceptions.ApiException;
import com.reddit.data.adapter.DataWithErrorsResponse;
import z50.r;
import com.reddit.domain.model.Gender;
import java.util.Iterator;
import com.reddit.domain.model.FollowerModel;
import java.util.ArrayList;
import java.util.Set;
import com.reddit.domain.model.AccountPreferencesPatch;
import hg2.j;
import z50.q;
import io.reactivex.internal.operators.single.SingleFlatMap;
import z50.h0;
import com.reddit.domain.model.FileUploadLease;
import com.reddit.domain.model.ProfileImageType;
import java.io.File;
import java.util.Map;
import okhttp3.OkHttpClient;
import mr0.e$a;
import com.reddit.queries.z8;
import h7.h;
import com.reddit.domain.model.MyPendingCommunityInvitations;
import rg2.p;
import kotlin.coroutines.CoroutineContext;
import ej2.g;
import com.reddit.domain.model.DefaultAvatar;
import java.util.concurrent.TimeUnit;
import ff2.c0;
import com.reddit.domain.model.GenderOption;
import io.reactivex.plugins.RxJavaPlugins;
import ff2.g0;
import io.reactivex.internal.operators.single.SingleFlatMapCompletable;
import z50.w0;
import java.util.List;
import java.util.Collection;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.reddit.domain.model.FollowersPage;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import lg2.c;
import com.reddit.domain.model.UserSubreddit;
import com.reddit.domain.model.MyAccount;
import javax.inject.Inject;
import sg2.e;
import va0.b;
import xd0.d;
import v40.t0;
import com.reddit.data.remote.RemoteGqlMyAccountDataSource;
import com.reddit.data.remote.RemoteAccountPreferenceDataSource;
import ua0.k;
import com.reddit.data.remote.RemoteAccountDataSource;
import v40.b0;
import com.reddit.session.o;
import us0.a;
import xd0.m;

public final class RedditMyAccountRepository implements m
{
    public final a a;
    public final o b;
    public final n20.a c;
    public final b0 d;
    public final RemoteAccountDataSource e;
    public final k f;
    public final RemoteAccountPreferenceDataSource g;
    public final RemoteGqlMyAccountDataSource h;
    public final t0 i;
    public final d j;
    public final a20.a k;
    public final va0.k l;
    public final b m;
    public long n;
    
    @Inject
    public RedditMyAccountRepository(final a a, final o b, final n20.a c, final b0 d, final RemoteAccountDataSource e, final k f, final RemoteAccountPreferenceDataSource g, final RemoteGqlMyAccountDataSource h, final t0 i, final d j, final a20.a k, final va0.k l, final b m) {
        sg2.e.f((Object)a, "appSettings");
        sg2.e.f((Object)b, "sessionManager");
        sg2.e.f((Object)c, "backgroundThread");
        sg2.e.f((Object)d, "localAccountDataSource");
        sg2.e.f((Object)e, "remoteAccountDataSource");
        sg2.e.f((Object)f, "localAccountPreferenceDataSource");
        sg2.e.f((Object)g, "remoteAccountPreferenceDataSource");
        sg2.e.f((Object)h, "remoteGqlMyAccountDataSource");
        sg2.e.f((Object)i, "memoryFollowersDataSource");
        sg2.e.f((Object)j, "blockedAccountRepository");
        sg2.e.f((Object)k, "dispatcherProvider");
        sg2.e.f((Object)l, "internalFeatures");
        sg2.e.f((Object)m, "channelsFeatures");
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
    
    public static String b(final MyAccount myAccount) {
        final UserSubreddit subreddit = myAccount.getSubreddit();
        String s = null;
        String displayName;
        if (subreddit != null) {
            displayName = subreddit.getDisplayName();
        }
        else {
            displayName = null;
        }
        if (ml0.a.X((CharSequence)displayName)) {
            s = displayName;
        }
        String string;
        if ((string = s) == null) {
            final StringBuilder r = a.r("u_");
            r.append(myAccount.getUsername());
            string = r.toString();
        }
        return string;
    }
    
    public final Object a(final String s, String i, final int n, c c) {
        Label_0059: {
            if (c instanceof RedditMyAccountRepository$getFollowedByRedditorsInternal$1) {
                final RedditMyAccountRepository$getFollowedByRedditorsInternal$1 redditMyAccountRepository$getFollowedByRedditorsInternal$1 = (RedditMyAccountRepository$getFollowedByRedditorsInternal$1)c;
                final int label = redditMyAccountRepository$getFollowedByRedditorsInternal$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditMyAccountRepository$getFollowedByRedditorsInternal$1.label = label + Integer.MIN_VALUE;
                    c = (c)redditMyAccountRepository$getFollowedByRedditorsInternal$1;
                    break Label_0059;
                }
            }
            c = (c)new RedditMyAccountRepository$getFollowedByRedditorsInternal$1(this, c);
        }
        final Object result = ((RedditMyAccountRepository$getFollowedByRedditorsInternal$1)c).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RedditMyAccountRepository$getFollowedByRedditorsInternal$1)c).label;
        RedditMyAccountRepository redditMyAccountRepository;
        Object a;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = (String)((RedditMyAccountRepository$getFollowedByRedditorsInternal$1)c).L$1;
            redditMyAccountRepository = (RedditMyAccountRepository)((RedditMyAccountRepository$getFollowedByRedditorsInternal$1)c).L$0;
            yd.b.k0(result);
            a = result;
        }
        else {
            yd.b.k0(result);
            if (i == null && s == null) {
                final t0 j = this.i;
                synchronized (j) {
                    final FollowersPage a2 = j.a;
                    monitorexit(j);
                    if (a2 != null) {
                        return a2;
                    }
                }
            }
            final RemoteGqlMyAccountDataSource h = this.h;
            ((RedditMyAccountRepository$getFollowedByRedditorsInternal$1)c).L$0 = this;
            ((RedditMyAccountRepository$getFollowedByRedditorsInternal$1)c).L$1 = i;
            ((RedditMyAccountRepository$getFollowedByRedditorsInternal$1)c).label = 1;
            a = h.a(s, i, n, c);
            if (a == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            redditMyAccountRepository = this;
        }
        c = (c)a;
        if (i == null) {
            i = (String)redditMyAccountRepository.i;
            synchronized (i) {
                sg2.e.f((Object)c, "followersPage");
                final FollowersPage a3 = ((t0)i).a;
                Object copy;
                if (a3 != null) {
                    copy = a3.copy((List)CollectionsKt___CollectionsKt.W3((Iterable)((FollowersPage)c).getFollowers(), (Collection)a3.getFollowers()), ((FollowersPage)c).getNextCursor());
                }
                else {
                    copy = c;
                }
                ((t0)i).a = (FollowersPage)copy;
            }
        }
        return c;
    }
    
    public final ff2.a d(final String s, final boolean b, final boolean b2, final long n) {
        sg2.e.f((Object)s, "username");
        return yd.b.i0(this.d.d(s, b, b2, n), (n20.d)this.c);
    }
    
    public final ff2.a e1() {
        final ff2.a onAssembly = RxJavaPlugins.onAssembly((ff2.a)new SingleFlatMapCompletable((g0)this.g1(false), (kf2.o)new w0(this, 1)));
        sg2.e.e((Object)onAssembly, "getMyAccount()\n      .fl\u2026edditDisplayName)\n      }");
        return yd.b.i0(onAssembly, (n20.d)this.c);
    }
    
    public final ff2.a f(final int n, final String s) {
        sg2.e.f((Object)s, "username");
        return yd.b.i0(this.d.f(n, s), (n20.d)this.c);
    }
    
    public final Object f1(final GenderOption genderOption, final String s, final c<? super Boolean> c) {
        return this.h.c(genderOption, s, (c)c);
    }
    
    public final c0<MyAccount> g1(final boolean b) {
        c0<MyAccount> c2;
        if (System.currentTimeMillis() - this.n <= TimeUnit.MINUTES.toMillis(1L) && !b) {
            final MyAccount c = this.b.C();
            String username;
            if (c != null) {
                username = ((n)c).getUsername();
            }
            else {
                username = null;
            }
            if (username == null || username.length() == 0) {
                c2 = this.l1();
            }
            else {
                c2 = this.d.h(username).v((c0)this.l1());
                sg2.e.e((Object)c2, "{\n        localAccountDa\u2026MyAccountFresh())\n      }");
            }
        }
        else {
            c2 = this.l1();
        }
        return nn0.a.V((c0)c2, (n20.d)this.c);
    }
    
    public final Object h1(final c<? super DefaultAvatar> c) {
        return ej2.g.l((CoroutineContext)this.k.c(), (p)new RedditMyAccountRepository$removeAvatarSuspend$2(this, (c)null), (c)c);
    }
    
    public final c0<MyPendingCommunityInvitations> i1(final String s) {
        sg2.e.f((Object)s, "subredditId");
        final RemoteGqlMyAccountDataSource h = this.h;
        h.getClass();
        final c0 w = e$a.a((mr0.e)h.a, (h7.k)new z8(h7.h.a.c(s)), (OkHttpClient)null, (Map)null, 14).w((kf2.o)new kv.a(12));
        sg2.e.e((Object)w, "graphQlClient.execute(\n \u2026apToDomainModel(it)\n    }");
        return nn0.a.V((c0)w, (n20.d)this.c);
    }
    
    public final Object j1(final File file, final ProfileImageType profileImageType, final c<? super FileUploadLease> c) {
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
            final mj2.a c2 = this.k.c();
            final RedditMyAccountRepository$getImageFileUploadLease$2 redditMyAccountRepository$getImageFileUploadLease$3 = new RedditMyAccountRepository$getImageFileUploadLease$2(this, file, profileImageType, (c)null);
            redditMyAccountRepository$getImageFileUploadLease$2.label = 1;
            if ((l = ej2.g.l((CoroutineContext)c2, (p)redditMyAccountRepository$getImageFileUploadLease$3, (c)redditMyAccountRepository$getImageFileUploadLease$2)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        sg2.e.e(l, "override suspend fun get\u2026       .await()\n    }\n  }");
        return l;
    }
    
    public final c0<DefaultAvatar> k1() {
        final c0<Object> onAssembly = RxJavaPlugins.onAssembly((c0<Object>)new SingleFlatMap((g0)this.g1(false), (kf2.o)new h0((Object)this, 1)));
        sg2.e.e((Object)onAssembly, "getMyAccount()\n      .fl\u2026edditDisplayName)\n      }");
        return nn0.a.V((c0)onAssembly, (n20.d)this.c);
    }
    
    public final c0<MyAccount> l1() {
        final c0 p = this.e.getMyAccount().p((kf2.o)new q((Object)this, 2));
        sg2.e.e((Object)p, "remoteAccountDataSource.\u2026Account\n        }\n      }");
        return nn0.a.V((c0)p, (n20.d)this.c);
    }
    
    public final Object m1(final ProfileImageType profileImageType, final String s, final c<? super j> c) {
        final Object l = ej2.g.l((CoroutineContext)this.k.c(), (p)new RedditMyAccountRepository$updateImageSuspend$2(this, profileImageType, s, (c)null), (c)c);
        if (l == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return l;
        }
        return hg2.j.a;
    }
    
    public final Object n1(final AccountPreferencesPatch accountPreferencesPatch, final c<? super j> c) {
        final Object l = ej2.g.l((CoroutineContext)this.k.c(), (p)new RedditMyAccountRepository$updateAccountPreferences$2(this, accountPreferencesPatch, (c)null), (c)c);
        if (l == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return l;
        }
        return hg2.j.a;
    }
    
    public final Object o1(final String s, final String s2, final int n, final c c) {
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
                        yd.b.k0(o2);
                        break Label_0227;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                else {
                    redditMyAccountRepository = (RedditMyAccountRepository)((RedditMyAccountRepository$getFollowedByRedditors$1)o).L$0;
                    yd.b.k0(o2);
                }
            }
            else {
                yd.b.k0(o2);
                ((RedditMyAccountRepository$getFollowedByRedditors$1)o).L$0 = this;
                ((RedditMyAccountRepository$getFollowedByRedditors$1)o).label = 1;
                o2 = this.a(s, s2, n, (c)o);
                if (o2 == coroutine_SUSPENDED) {
                    return coroutine_SUSPENDED;
                }
                redditMyAccountRepository = this;
            }
            final FollowersPage l$0 = (FollowersPage)o2;
            final c0 f = redditMyAccountRepository.j.f();
            ((RedditMyAccountRepository$getFollowedByRedditors$1)o).L$0 = l$0;
            ((RedditMyAccountRepository$getFollowedByRedditors$1)o).label = 2;
            o2 = kotlinx.coroutines.rx2.d.b(f, (c)o);
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
    
    public final ff2.a p1(final AccountPreferencesPatch accountPreferencesPatch) {
        final c0 patchPreferences = this.g.patchPreferences(accountPreferencesPatch);
        final s s = new s(this, 2);
        patchPreferences.getClass();
        final ff2.a k = RxJavaPlugins.onAssembly(new uf2.h<Object>((ff2.g0<Object>)patchPreferences, (kf2.g<? super Object>)s)).K();
        sg2.e.e((Object)k, "remoteAccountPreferenceD\u2026 }\n      .toCompletable()");
        return yd.b.i0(k, (n20.d)this.c);
    }
    
    public final Object q1(final c<? super Gender> c) {
        return this.h.b((c)c);
    }
    
    public final c0<Boolean> r1() {
        c0<Boolean> c0;
        if (this.m.F3()) {
            final c0 w = this.e.getMyAccount().w((kf2.o)new r(5));
            sg2.e.e((Object)w, "remoteAccountDataSource.\u2026missionRequired\n        }");
            c0 = nn0.a.V((c0)w, (n20.d)this.c);
        }
        else {
            final a a = this.a;
            this.l.o();
            final Boolean h1 = a.H1(false);
            if (h1 != null) {
                c0 = ff2.c0.v(h1);
                sg2.e.e((Object)c0, "{\n        Single.just(re\u2026eEmailPermission)\n      }");
            }
            else {
                final c0 w2 = this.e.getMyAccount().w((kf2.o)new w0(this, 0));
                sg2.e.e((Object)w2, "remoteAccountDataSource.\u2026ssionRequired\n          }");
                c0 = nn0.a.V((c0)w2, (n20.d)this.c);
            }
        }
        return c0;
    }
    
    public final ff2.a s1(final ProfileImageType profileImageType, final String s) {
        sg2.e.f((Object)s, "newUrl");
        final ff2.a onAssembly = RxJavaPlugins.onAssembly((ff2.a)new SingleFlatMapCompletable((g0)this.g1(false), (kf2.o)new u30.c((Object)this, 1, (Object)profileImageType, (Object)s)));
        sg2.e.e((Object)onAssembly, "getMyAccount()\n      .fl\u2026ewUrl),\n        )\n      }");
        return yd.b.i0(onAssembly, (n20.d)this.c);
    }
    
    public final Object t1(final c<? super j> c) {
        final Object l = ej2.g.l((CoroutineContext)this.k.c(), (p)new RedditMyAccountRepository$removeBannerSuspend$2(this, (c)null), (c)c);
        if (l == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return l;
        }
        return hg2.j.a;
    }
    
    public final void u1(final String s, final boolean b) {
        final String i = o20.a.i(s);
        final t0 j = this.i;
        synchronized (j) {
            sg2.e.f((Object)i, "username");
            final FollowersPage a = j.a;
            if (a == null) {
                monitorexit(j);
            }
            else {
                final List followers = a.getFollowers();
                final ArrayList list = new ArrayList<FollowerModel>(ig2.m.c3((Iterable)followers, 10));
                for (FollowerModel copy$default : followers) {
                    final FollowerModel followerModel = copy$default;
                    if (sg2.e.a((Object)followerModel.getUsername(), (Object)i)) {
                        copy$default = FollowerModel.copy$default(followerModel, (String)null, (String)null, (String)null, (List)null, (String)null, false, b, (Integer)null, false, 447, (Object)null);
                    }
                    list.add(copy$default);
                }
                j.a = FollowersPage.copy$default(a, (List)list, (String)null, 2, (Object)null);
            }
        }
    }
    
    public final Object updateName(final String s, final c<? super j> c) {
        Object o = null;
        Label_0050: {
            if (c instanceof RedditMyAccountRepository$updateName$1) {
                final RedditMyAccountRepository$updateName$1 redditMyAccountRepository$updateName$1 = (RedditMyAccountRepository$updateName$1)c;
                final int label = redditMyAccountRepository$updateName$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditMyAccountRepository$updateName$1.label = label + Integer.MIN_VALUE;
                    o = redditMyAccountRepository$updateName$1;
                    break Label_0050;
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
            yd.b.k0(result);
            updateName = result;
        }
        else {
            yd.b.k0(result);
            final RemoteAccountDataSource e = this.e;
            ((RedditMyAccountRepository$updateName$1)o).label = 1;
            if ((updateName = e.updateName(s, (c)o)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        final DataWithErrorsResponse dataWithErrorsResponse = (DataWithErrorsResponse)updateName;
        if (!(dataWithErrorsResponse.getJson().getErrors().isEmpty() ^ true)) {
            return hg2.j.a;
        }
        final List list = dataWithErrorsResponse.getJson().getErrors().get(0);
        throw new ApiException((String)list.get(0), (String)list.get(1));
    }
    
    public final ff2.a updateUserSubredditSettings(final Map<String, String> map) {
        sg2.e.f((Object)map, "params");
        return yd.b.i0(this.e.updateUserSubredditSettings((Map)map), (n20.d)this.c);
    }
    
    public final Object updateUserSubredditSettingsSuspend(final Map<String, String> map, final c<? super j> c) {
        final Object l = ej2.g.l((CoroutineContext)this.k.c(), (p)new RedditMyAccountRepository$updateUserSubredditSettingsSuspend$2(this, (Map)map, (c)null), (c)c);
        if (l == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return l;
        }
        return hg2.j.a;
    }
    
    public final c0<ResponseBody> v1() {
        final c0<Object> onAssembly = RxJavaPlugins.onAssembly((c0<Object>)new SingleFlatMap((g0)this.g1(false), (kf2.o)new hf0.g((Object)this, 2)));
        sg2.e.e((Object)onAssembly, "getMyAccount()\n      .fl\u2026edditDisplayName)\n      }");
        return nn0.a.V((c0)onAssembly, (n20.d)this.c);
    }
}
