// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.repository;

import java.util.Set;
import com.reddit.domain.model.FileUploadLease;
import java.io.File;
import com.reddit.domain.exceptions.ApiException;
import com.reddit.data.adapter.DataWithErrorsResponse;
import java.util.Collection;
import kotlin.collections.CollectionsKt___CollectionsKt;
import g60.t0;
import okhttp3.ResponseBody;
import java.util.Iterator;
import com.reddit.domain.model.FollowersPage;
import java.util.List;
import com.reddit.domain.model.FollowerModel;
import java.util.ArrayList;
import io.reactivex.internal.operators.single.SingleFlatMapCompletable;
import m10.m;
import g60.i1;
import g60.u0;
import com.reddit.domain.model.AccountPreferences;
import cg2.h;
import com.reddit.domain.model.AccountPreferencesPatch;
import com.reddit.domain.model.GenderOption;
import com.reddit.domain.model.Gender;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import zg2.p;
import kotlin.coroutines.CoroutineContext;
import mj2.g;
import pg2.j;
import com.reddit.domain.model.ProfileImageType;
import io.reactivex.plugins.RxJavaPlugins;
import nf2.g0;
import io.reactivex.internal.operators.single.SingleFlatMap;
import com.reddit.domain.model.DefaultAvatar;
import sf2.o;
import java.util.Map;
import okhttp3.OkHttpClient;
import ur0.e$a;
import com.reddit.queries.w8;
import h7.h$a;
import com.reddit.domain.model.MyPendingCommunityInvitations;
import r20.d;
import a4.u1;
import java.util.concurrent.TimeUnit;
import nf2.c0;
import com.reddit.domain.model.UserSubreddit;
import eg.n0;
import com.reddit.domain.model.MyAccount;
import javax.inject.Inject;
import ah2.f;
import db0.c;
import db0.l;
import ge0.e;
import c50.v0;
import com.reddit.data.remote.RemoteGqlMyAccountDataSource;
import com.reddit.data.remote.RemoteAccountPreferenceDataSource;
import cb0.k;
import com.reddit.data.remote.RemoteAccountDataSource;
import c50.d0;
import com.reddit.session.q;
import bt0.a;
import ge0.u;

public final class RedditMyAccountRepository implements u
{
    public final a a;
    public final q b;
    public final r20.a c;
    public final d0 d;
    public final RemoteAccountDataSource e;
    public final k f;
    public final RemoteAccountPreferenceDataSource g;
    public final RemoteGqlMyAccountDataSource h;
    public final v0 i;
    public final e j;
    public final e20.a k;
    public final l l;
    public final c m;
    public long n;
    
    @Inject
    public RedditMyAccountRepository(final a a, final q b, final r20.a c, final d0 d, final RemoteAccountDataSource e, final k f, final RemoteAccountPreferenceDataSource g, final RemoteGqlMyAccountDataSource h, final v0 i, final e j, final e20.a k, final l l, final c m) {
        ah2.f.f((Object)a, "appSettings");
        ah2.f.f((Object)b, "sessionManager");
        ah2.f.f((Object)c, "backgroundThread");
        ah2.f.f((Object)d, "localAccountDataSource");
        ah2.f.f((Object)e, "remoteAccountDataSource");
        ah2.f.f((Object)f, "localAccountPreferenceDataSource");
        ah2.f.f((Object)g, "remoteAccountPreferenceDataSource");
        ah2.f.f((Object)h, "remoteGqlMyAccountDataSource");
        ah2.f.f((Object)i, "memoryFollowersDataSource");
        ah2.f.f((Object)j, "blockedAccountRepository");
        ah2.f.f((Object)k, "dispatcherProvider");
        ah2.f.f((Object)l, "internalFeatures");
        ah2.f.f((Object)m, "channelsFeatures");
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
        if (n0.c0((CharSequence)displayName)) {
            s = displayName;
        }
        String string;
        if ((string = s) == null) {
            final StringBuilder k = a.k("u_");
            k.append(myAccount.getUsername());
            string = k.toString();
        }
        return string;
    }
    
    public final c0<MyAccount> A1(final boolean b) {
        c0 c0;
        if (System.currentTimeMillis() - this.n <= TimeUnit.MINUTES.toMillis(1L) && !b) {
            final MyAccount b2 = this.b.B();
            String username;
            if (b2 != null) {
                username = ((com.reddit.session.p)b2).getUsername();
            }
            else {
                username = null;
            }
            if (username == null || username.length() == 0) {
                c0 = this.E1();
            }
            else {
                c0 = this.d.k(username).w((c0)this.E1());
                ah2.f.e((Object)c0, "{\n        localAccountDa\u2026MyAccountFresh())\n      }");
            }
        }
        else {
            c0 = this.E1();
        }
        return (c0<MyAccount>)u1.j1(c0, (d)this.c);
    }
    
    public final c0<MyPendingCommunityInvitations> B1(final String s) {
        ah2.f.f((Object)s, "subredditId");
        final RemoteGqlMyAccountDataSource h = this.h;
        h.getClass();
        final c0 w = e$a.a((ur0.e)h.a, (h7.k)new w8(h$a.c((Object)s)), (OkHttpClient)null, (Map)null, 14).w((o)new ov.c(11));
        ah2.f.e((Object)w, "graphQlClient.execute(\n \u2026apToDomainModel(it)\n    }");
        return (c0<MyPendingCommunityInvitations>)u1.j1(w, (d)this.c);
    }
    
    public final c0<DefaultAvatar> C1() {
        final c0 onAssembly = RxJavaPlugins.onAssembly((c0)new SingleFlatMap((g0)this.A1(false), (o)new b(this, 2)));
        ah2.f.e((Object)onAssembly, "getMyAccount()\n      .fl\u2026edditDisplayName)\n      }");
        return (c0<DefaultAvatar>)u1.j1(onAssembly, (d)this.c);
    }
    
    public final Object D1(final ProfileImageType profileImageType, final String s, final tg2.c<? super j> c) {
        final Object l = mj2.g.l((CoroutineContext)this.k.c(), (p)new RedditMyAccountRepository$updateImageSuspend$2(this, profileImageType, s, (tg2.c)null), (tg2.c)c);
        if (l == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return l;
        }
        return pg2.j.a;
    }
    
    public final c0<MyAccount> E1() {
        final c0 p = this.e.getMyAccount().p((o)new g60.q(this, 2));
        ah2.f.e((Object)p, "remoteAccountDataSource.\u2026Account\n        }\n      }");
        return (c0<MyAccount>)u1.j1(p, (d)this.c);
    }
    
    public final Object F1(final tg2.c<? super Gender> c) {
        return this.h.b(c);
    }
    
    public final Object G1(final tg2.c<? super j> c) {
        final Object l = mj2.g.l((CoroutineContext)this.k.c(), (p)new RedditMyAccountRepository$removeBannerSuspend$2(this, (tg2.c)null), (tg2.c)c);
        if (l == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return l;
        }
        return pg2.j.a;
    }
    
    public final Object H1(final GenderOption genderOption, final String s, final tg2.c<? super Boolean> c) {
        return this.h.c(genderOption, s, c);
    }
    
    public final nf2.a I1(final AccountPreferencesPatch accountPreferencesPatch) {
        final c0<AccountPreferences> patchPreferences = this.g.patchPreferences(accountPreferencesPatch);
        final com.reddit.data.repository.u u = new com.reddit.data.repository.u(this, 1);
        patchPreferences.getClass();
        final nf2.a k = RxJavaPlugins.onAssembly((c0)new h((g0)patchPreferences, (sf2.g)u)).K();
        ah2.f.e((Object)k, "remoteAccountPreferenceD\u2026 }\n      .toCompletable()");
        return o72.f.t(k, (d)this.c);
    }
    
    public final Object J1(final AccountPreferencesPatch accountPreferencesPatch, final tg2.c<? super j> c) {
        final Object l = mj2.g.l((CoroutineContext)this.k.c(), (p)new RedditMyAccountRepository$updateAccountPreferences$2(this, accountPreferencesPatch, (tg2.c)null), (tg2.c)c);
        if (l == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return l;
        }
        return pg2.j.a;
    }
    
    public final c0<Boolean> K1() {
        c0 c0;
        if (this.m.I3()) {
            final c0 w = this.e.getMyAccount().w((o)new u0(4));
            ah2.f.e((Object)w, "remoteAccountDataSource.\u2026missionRequired\n        }");
            c0 = u1.j1(w, (d)this.c);
        }
        else {
            final a a = this.a;
            this.l.o();
            final Boolean g1 = a.G1(false);
            if (g1 != null) {
                c0 = nf2.c0.v((Object)g1);
                ah2.f.e((Object)c0, "{\n        Single.just(re\u2026eEmailPermission)\n      }");
            }
            else {
                final c0 w2 = this.e.getMyAccount().w((o)new i1(this, 0));
                ah2.f.e((Object)w2, "remoteAccountDataSource.\u2026ssionRequired\n          }");
                c0 = u1.j1(w2, (d)this.c);
            }
        }
        return (c0<Boolean>)c0;
    }
    
    public final nf2.a L1(final ProfileImageType profileImageType, final String s) {
        ah2.f.f((Object)s, "newUrl");
        final nf2.a onAssembly = RxJavaPlugins.onAssembly((nf2.a)new SingleFlatMapCompletable((g0)this.A1(false), (o)new m((Object)this, s, 3, (Object)profileImageType)));
        ah2.f.e((Object)onAssembly, "getMyAccount()\n      .fl\u2026ewUrl),\n        )\n      }");
        return o72.f.t(onAssembly, (d)this.c);
    }
    
    public final Object M1(final tg2.c<? super DefaultAvatar> c) {
        return mj2.g.l((CoroutineContext)this.k.c(), (p)new RedditMyAccountRepository$removeAvatarSuspend$2(this, (tg2.c)null), (tg2.c)c);
    }
    
    public final void N1(final String s, final boolean b) {
        final String i = s20.a.i(s);
        final v0 j = this.i;
        synchronized (j) {
            ah2.f.f((Object)i, "username");
            final FollowersPage a = j.a;
            if (a == null) {
                monitorexit(j);
            }
            else {
                final List<FollowerModel> followers = a.getFollowers();
                final ArrayList list = new ArrayList<FollowerModel>(qg2.m.P0((Iterable)followers, 10));
                for (FollowerModel copy$default : followers) {
                    final FollowerModel followerModel = copy$default;
                    if (ah2.f.a((Object)followerModel.getUsername(), (Object)i)) {
                        copy$default = FollowerModel.copy$default(followerModel, null, null, null, null, null, false, b, null, false, 447, null);
                    }
                    list.add(copy$default);
                }
                j.a = FollowersPage.copy$default(a, list, null, 2, null);
            }
        }
    }
    
    public final c0<ResponseBody> O1() {
        final c0 onAssembly = RxJavaPlugins.onAssembly((c0)new SingleFlatMap((g0)this.A1(false), (o)new t0(this, 2)));
        ah2.f.e((Object)onAssembly, "getMyAccount()\n      .fl\u2026edditDisplayName)\n      }");
        return (c0<ResponseBody>)u1.j1(onAssembly, (d)this.c);
    }
    
    public final Object a(final String s, String i, final int n, tg2.c c) {
        Label_0061: {
            if (c instanceof RedditMyAccountRepository$getFollowedByRedditorsInternal$1) {
                final RedditMyAccountRepository$getFollowedByRedditorsInternal$1 redditMyAccountRepository$getFollowedByRedditorsInternal$1 = (RedditMyAccountRepository$getFollowedByRedditorsInternal$1)c;
                final int label = redditMyAccountRepository$getFollowedByRedditorsInternal$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditMyAccountRepository$getFollowedByRedditorsInternal$1.label = label + Integer.MIN_VALUE;
                    c = (tg2.c)redditMyAccountRepository$getFollowedByRedditorsInternal$1;
                    break Label_0061;
                }
            }
            c = (tg2.c)new RedditMyAccountRepository$getFollowedByRedditorsInternal$1(this, (tg2.c<? super RedditMyAccountRepository$getFollowedByRedditorsInternal$1>)c);
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
            aj2.c.Q0(result);
            a = result;
        }
        else {
            aj2.c.Q0(result);
            if (i == null && s == null) {
                final v0 j = this.i;
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
        c = (tg2.c)a;
        if (i == null) {
            i = (String)redditMyAccountRepository.i;
            synchronized (i) {
                ah2.f.f((Object)c, "followersPage");
                final FollowersPage a3 = ((v0)i).a;
                Object copy;
                if (a3 != null) {
                    copy = a3.copy(CollectionsKt___CollectionsKt.N1((Iterable)((FollowersPage)c).getFollowers(), (Collection)a3.getFollowers()), ((FollowersPage)c).getNextCursor());
                }
                else {
                    copy = c;
                }
                ((v0)i).a = (FollowersPage)copy;
            }
        }
        return c;
    }
    
    public final nf2.a d(final String s, final boolean b, final boolean b2, final long n) {
        ah2.f.f((Object)s, "username");
        return o72.f.t(this.d.d(s, b, b2, n), (d)this.c);
    }
    
    public final nf2.a f(final int n, final String s) {
        ah2.f.f((Object)s, "username");
        return o72.f.t(this.d.f(n, s), (d)this.c);
    }
    
    public final Object updateName(final String s, final tg2.c<? super j> c) {
        Object o = null;
        Label_0052: {
            if (c instanceof RedditMyAccountRepository$updateName.RedditMyAccountRepository$updateName$1) {
                final RedditMyAccountRepository$updateName.RedditMyAccountRepository$updateName$1 redditMyAccountRepository$updateName$1 = (RedditMyAccountRepository$updateName.RedditMyAccountRepository$updateName$1)c;
                final int label = redditMyAccountRepository$updateName$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditMyAccountRepository$updateName$1.label = label + Integer.MIN_VALUE;
                    o = redditMyAccountRepository$updateName$1;
                    break Label_0052;
                }
            }
            o = new RedditMyAccountRepository$updateName.RedditMyAccountRepository$updateName$1(this, (tg2.c)c);
        }
        final Object result = ((RedditMyAccountRepository$updateName.RedditMyAccountRepository$updateName$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RedditMyAccountRepository$updateName.RedditMyAccountRepository$updateName$1)o).label;
        Object updateName;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aj2.c.Q0(result);
            updateName = result;
        }
        else {
            aj2.c.Q0(result);
            final RemoteAccountDataSource e = this.e;
            ((RedditMyAccountRepository$updateName.RedditMyAccountRepository$updateName$1)o).label = 1;
            if ((updateName = e.updateName(s, (tg2.c<? super DataWithErrorsResponse>)o)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        final DataWithErrorsResponse dataWithErrorsResponse = (DataWithErrorsResponse)updateName;
        if (!(dataWithErrorsResponse.getJson().getErrors().isEmpty() ^ true)) {
            return pg2.j.a;
        }
        final List list = dataWithErrorsResponse.getJson().getErrors().get(0);
        throw new ApiException((String)list.get(0), (String)list.get(1));
    }
    
    public final nf2.a updateUserSubredditSettings(final Map<String, String> map) {
        ah2.f.f((Object)map, "params");
        return o72.f.t(this.e.updateUserSubredditSettings(map), (d)this.c);
    }
    
    public final Object updateUserSubredditSettingsSuspend(final Map<String, String> map, final tg2.c<? super j> c) {
        final Object l = mj2.g.l((CoroutineContext)this.k.c(), (p)new RedditMyAccountRepository$updateUserSubredditSettingsSuspend$2(this, (Map)map, (tg2.c)null), (tg2.c)c);
        if (l == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return l;
        }
        return pg2.j.a;
    }
    
    public final nf2.a x1() {
        final nf2.a onAssembly = RxJavaPlugins.onAssembly((nf2.a)new SingleFlatMapCompletable((g0)this.A1(false), (o)new i1(this, 1)));
        ah2.f.e((Object)onAssembly, "getMyAccount()\n      .fl\u2026edditDisplayName)\n      }");
        return o72.f.t(onAssembly, (d)this.c);
    }
    
    public final Object y1(final File file, final ProfileImageType profileImageType, final tg2.c<? super FileUploadLease> c) {
        RedditMyAccountRepository$getImageFileUploadLease.RedditMyAccountRepository$getImageFileUploadLease$1 redditMyAccountRepository$getImageFileUploadLease$2 = null;
        Label_0056: {
            if (c instanceof RedditMyAccountRepository$getImageFileUploadLease.RedditMyAccountRepository$getImageFileUploadLease$1) {
                final RedditMyAccountRepository$getImageFileUploadLease.RedditMyAccountRepository$getImageFileUploadLease$1 redditMyAccountRepository$getImageFileUploadLease$1 = (RedditMyAccountRepository$getImageFileUploadLease.RedditMyAccountRepository$getImageFileUploadLease$1)c;
                final int label = redditMyAccountRepository$getImageFileUploadLease$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditMyAccountRepository$getImageFileUploadLease$1.label = label + Integer.MIN_VALUE;
                    redditMyAccountRepository$getImageFileUploadLease$2 = redditMyAccountRepository$getImageFileUploadLease$1;
                    break Label_0056;
                }
            }
            redditMyAccountRepository$getImageFileUploadLease$2 = new RedditMyAccountRepository$getImageFileUploadLease.RedditMyAccountRepository$getImageFileUploadLease$1(this, (tg2.c)c);
        }
        final Object result = redditMyAccountRepository$getImageFileUploadLease$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = redditMyAccountRepository$getImageFileUploadLease$2.label;
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
            final uj2.a c2 = this.k.c();
            final RedditMyAccountRepository$getImageFileUploadLease$2 redditMyAccountRepository$getImageFileUploadLease$3 = new RedditMyAccountRepository$getImageFileUploadLease$2(this, file, profileImageType, (tg2.c)null);
            redditMyAccountRepository$getImageFileUploadLease$2.label = 1;
            if ((l = mj2.g.l((CoroutineContext)c2, (p)redditMyAccountRepository$getImageFileUploadLease$3, (tg2.c)redditMyAccountRepository$getImageFileUploadLease$2)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        ah2.f.e(l, "override suspend fun get\u2026       .await()\n    }\n  }");
        return l;
    }
    
    public final Object z1(final String s, final String s2, final int n, final tg2.c c) {
        Object o = null;
        Label_0061: {
            if (c instanceof RedditMyAccountRepository$getFollowedByRedditors$1) {
                final RedditMyAccountRepository$getFollowedByRedditors$1 redditMyAccountRepository$getFollowedByRedditors$1 = (RedditMyAccountRepository$getFollowedByRedditors$1)c;
                final int label = redditMyAccountRepository$getFollowedByRedditors$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditMyAccountRepository$getFollowedByRedditors$1.label = label + Integer.MIN_VALUE;
                    o = redditMyAccountRepository$getFollowedByRedditors$1;
                    break Label_0061;
                }
            }
            o = new RedditMyAccountRepository$getFollowedByRedditors$1(this, (tg2.c<? super RedditMyAccountRepository$getFollowedByRedditors$1>)c);
        }
        Object o2 = ((RedditMyAccountRepository$getFollowedByRedditors$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RedditMyAccountRepository$getFollowedByRedditors$1)o).label;
        FollowersPage followersPage = null;
        Label_0230: {
            RedditMyAccountRepository redditMyAccountRepository;
            if (label2 != 0) {
                if (label2 != 1) {
                    if (label2 == 2) {
                        followersPage = (FollowersPage)((RedditMyAccountRepository$getFollowedByRedditors$1)o).L$0;
                        aj2.c.Q0(o2);
                        break Label_0230;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                else {
                    redditMyAccountRepository = (RedditMyAccountRepository)((RedditMyAccountRepository$getFollowedByRedditors$1)o).L$0;
                    aj2.c.Q0(o2);
                }
            }
            else {
                aj2.c.Q0(o2);
                ((RedditMyAccountRepository$getFollowedByRedditors$1)o).L$0 = this;
                ((RedditMyAccountRepository$getFollowedByRedditors$1)o).label = 1;
                o2 = this.a(s, s2, n, (tg2.c)o);
                if (o2 == coroutine_SUSPENDED) {
                    return coroutine_SUSPENDED;
                }
                redditMyAccountRepository = this;
            }
            final FollowersPage l$0 = (FollowersPage)o2;
            final c0 e = redditMyAccountRepository.j.e();
            ((RedditMyAccountRepository$getFollowedByRedditors$1)o).L$0 = l$0;
            ((RedditMyAccountRepository$getFollowedByRedditors$1)o).label = 2;
            o2 = kotlinx.coroutines.rx2.d.b(e, (tg2.c)o);
            if (o2 == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            followersPage = l$0;
        }
        final Set set = (Set)o2;
        final List<FollowerModel> followers = followersPage.getFollowers();
        final ArrayList<FollowerModel> list = new ArrayList<FollowerModel>();
        for (final FollowerModel next : followers) {
            if (set.contains(next.getUserId()) ^ true) {
                list.add(next);
            }
        }
        return FollowersPage.copy$default(followersPage, list, null, 2, null);
    }
}
