// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.local;

import sf2.o;
import com.reddit.domain.model.MyAccount;
import io.reactivex.plugins.RxJavaPlugins;
import nf2.r;
import io.reactivex.internal.operators.maybe.MaybeToFlowable;
import nf2.g;
import c50.e;
import sf2.c;
import nf2.n;
import q6.j;
import java.util.Iterator;
import i60.b;
import com.reddit.domain.model.sociallink.SocialLinkType;
import com.reddit.domain.model.sociallink.SocialLink;
import java.util.ArrayList;
import qg2.m;
import i60.c0;
import java.util.Map;
import com.squareup.moshi.JsonAdapter;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import com.reddit.domain.model.postrequirements.PostRequirements;
import com.reddit.domain.model.mod.ModPermissions;
import com.reddit.domain.model.CommunityHubCommunityOwner;
import z10.w;
import com.reddit.domain.model.CommunityHub;
import com.reddit.domain.model.Account;
import i60.b0;
import com.reddit.common.subreddit.SubredditPostType;
import java.util.List;
import com.reddit.domain.model.UserSubreddit;
import javax.inject.Inject;
import pg2.f;
import h60.d;
import h60.a;
import javax.inject.Provider;
import com.squareup.moshi.y;
import c50.d0;

public final class DatabaseAccountDataSource implements d0
{
    public final y a;
    public final Provider<a> b;
    public final Provider<d> c;
    public final f d;
    
    @Inject
    public DatabaseAccountDataSource(final y a, final Provider<a> b, final Provider<d> c) {
        ah2.f.f((Object)a, "moshi");
        ah2.f.f((Object)b, "accountDaoProvider");
        ah2.f.f((Object)c, "mutationsDaoProvider");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = kotlin.a.b((zg2.a)new DatabaseAccountDataSource$adapter.DatabaseAccountDataSource$adapter$2(this));
    }
    
    public static UserSubreddit l(final i60.d0 d0) {
        return new UserSubreddit(d0.p, d0.b, d0.c, d0.d, d0.e, d0.f, d0.g, d0.h, d0.i, d0.j, d0.k, d0.l, d0.m, d0.n, d0.o, d0.q, d0.r, d0.s, d0.t, d0.u, d0.v, d0.w, d0.x, d0.y, d0.z);
    }
    
    public static i60.d0 m(final UserSubreddit userSubreddit, final String s) {
        final String bannerImg = userSubreddit.getBannerImg();
        final Boolean userIsBanned = userSubreddit.getUserIsBanned();
        final String description = userSubreddit.getDescription();
        final String publicDescription = userSubreddit.getPublicDescription();
        final Boolean userIsMuted = userSubreddit.getUserIsMuted();
        final Boolean userIsContributor = userSubreddit.getUserIsContributor();
        final Boolean userIsModerator = userSubreddit.getUserIsModerator();
        final Boolean userIsSubscriber = userSubreddit.getUserIsSubscriber();
        final String displayName = userSubreddit.getDisplayName();
        final String headerImg = userSubreddit.getHeaderImg();
        final String title = userSubreddit.getTitle();
        final boolean over18 = userSubreddit.getOver18();
        final String iconImg = userSubreddit.getIconImg();
        final String displayNamePrefixed = userSubreddit.getDisplayNamePrefixed();
        final Integer subscribers = userSubreddit.getSubscribers();
        int intValue;
        if (subscribers != null) {
            intValue = subscribers;
        }
        else {
            intValue = 0;
        }
        return new i60.d0(s, bannerImg, userIsBanned, description, userIsMuted, displayName, headerImg, title, userIsModerator, over18, iconImg, displayNamePrefixed, intValue, userSubreddit.isDefaultIcon(), userSubreddit.getKeyColor(), userSubreddit.getKindWithId(), userSubreddit.isDefaultBanner(), userSubreddit.getUrl(), userIsContributor, publicDescription, userSubreddit.getSubredditType(), userIsSubscriber, userSubreddit.getShowInDefaultSubreddits(), userSubreddit.getIconSize(), userSubreddit.getBannerSize(), userSubreddit.getAllowedPostTypes());
    }
    
    public static CommunityHub n(final b0 b0, final Account account) {
        return new CommunityHub(w.g(b0.a), b0.b, 0, 0, (String)null, b0.a, (String)null, (String)null, false, false, (String)null, false, false, false, false, false, false, false, false, false, (String)null, (ModPermissions)null, new CommunityHubCommunityOwner(account.getId(), account.getUsername(), yl.a.c0(account.getUsername())), false, (PostRequirements)null, false, (List)null, 130023388, (DefaultConstructorMarker)null);
    }
    
    @Override
    public final nf2.a a(final String s) {
        ah2.f.f((Object)s, "accountId");
        final nf2.a q = nf2.a.q((Callable)new u40.a(1, (Object)this, (Object)s));
        ah2.f.e((Object)q, "fromCallable { mutations\u2026isited(accountId, true) }");
        return q;
    }
    
    public final a b() {
        final Object value = this.b.get();
        ah2.f.e(value, "accountDaoProvider.get()");
        return (a)value;
    }
    
    public final JsonAdapter<Map<String, Object>> c() {
        final Object value = this.d.getValue();
        ah2.f.e(value, "<get-adapter>(...)");
        return (JsonAdapter<Map<String, Object>>)value;
    }
    
    @Override
    public final nf2.a d(final String s, final boolean b, final boolean b2, final long n) {
        ah2.f.f((Object)s, "username");
        return this.b().d(s, b, b2, n);
    }
    
    public final Account e(final j60.a a, final List<c0> list) {
        final i60.a a2 = a.a;
        final i60.d0 b = a.b;
        final b c = a.c;
        final String a3 = a2.a;
        final String b2 = a2.b;
        final long c2 = a2.c;
        final boolean d = a2.d;
        final boolean e = a2.e;
        final boolean f = a2.f;
        final Integer g = a2.g;
        final boolean h = a2.h;
        final int i = a2.i;
        final int j = a2.j;
        final int k = a2.k;
        final int l = a2.l;
        final int m = a2.m;
        final boolean n = a2.n;
        final boolean o = a2.o;
        final Long p2 = a2.p;
        final Long q = a2.q;
        final boolean r = a2.r;
        final Boolean s = a2.s;
        final String t = a2.t;
        final int u = a2.u;
        final boolean v = a2.v;
        final boolean w = a2.w;
        final boolean x = a2.x;
        final int y = a2.y;
        final String z = a2.z;
        final Boolean a4 = a2.A;
        final boolean b3 = a2.B;
        final boolean c3 = a2.C;
        final Map map = (Map)this.c().fromJson(a2.E);
        final boolean b4 = c != null && ah2.f.a((Object)c.b, (Object)Boolean.TRUE);
        UserSubreddit l2;
        if (b != null) {
            l2 = l(b);
        }
        else {
            l2 = null;
        }
        final boolean f2 = a2.F;
        final boolean g2 = a2.G;
        final List<String> h2 = a2.H;
        final boolean i2 = a2.I;
        final Boolean j2 = a2.J;
        final Boolean k2 = a2.K;
        final String l3 = a2.L;
        final boolean m2 = a2.M;
        final ArrayList<SocialLink> list2 = new ArrayList<SocialLink>(qg2.m.P0((Iterable)list, 10));
        for (final c0 c4 : list) {
            final String a5 = c4.a;
            final String c5 = c4.c;
            final int d2 = c4.d;
            final String e2 = c4.e;
            final String f3 = c4.f;
            SocialLinkType socialLinkType;
            if ((socialLinkType = SocialLinkType.Companion.fromString(c4.g)) == null) {
                socialLinkType = SocialLinkType.CUSTOM;
            }
            list2.add(new SocialLink(a5, c5, d2, e2, f3, socialLinkType));
        }
        return new Account(a3, b2, c2, d, e, h, m, i, j, k, l, n, o, p2, q, r, s, l2, z, j2, k2, m2, b4, t, map, f, g, c3, u, v, w, y, a4, x, b3, f2, g2, h2, i2, l3, list2, null, 0, 512, null);
    }
    
    @Override
    public final nf2.a f(final int n, final String s) {
        ah2.f.f((Object)s, "username");
        return this.b().f(n, s);
    }
    
    @Override
    public final nf2.c0<Boolean> g(final Account account) {
        ah2.f.f((Object)account, "account");
        final nf2.c0 c = nf2.c0.u((Callable)new j(1, this, account)).C((Object)Boolean.FALSE);
        ah2.f.e((Object)c, "fromCallable {\n      acc\u2026.onErrorReturnItem(false)");
        return (nf2.c0<Boolean>)c;
    }
    
    @Override
    public final n<Account> h(final String s) {
        ah2.f.f((Object)s, "username");
        if (s.length() > 0) {
            final n c = this.b().M1(s).C((n)this.b().B1(s), (c)new c50.d(this)).C((n)this.b().E1(s), (c)new e(this));
            ah2.f.e((Object)c, "accountDao.findByUsernam\u2026\n        },\n      )\n    }");
            return (n<Account>)c;
        }
        throw new IllegalArgumentException("Username shouldn't be empty".toString());
    }
    
    @Override
    public final g<Account> i(final String s) {
        ah2.f.f((Object)s, "username");
        if (s.length() > 0) {
            final g<j60.a> p = this.b().p1(s);
            final n<List<b0>> e1 = this.b().E1(s);
            e1.getClass();
            g g;
            if (e1 instanceof vf2.b) {
                g = ((vf2.b)e1).d();
            }
            else {
                g = RxJavaPlugins.onAssembly((g)new MaybeToFlowable((r)e1));
            }
            final g zipWith = p.zipWith((zt2.b)g, (c)new c50.c(this));
            ah2.f.e((Object)zipWith, "accountDao.observeByUser\u2026eddit(account) })\n      }");
            return (g<Account>)zipWith;
        }
        throw new IllegalArgumentException("Username shouldn't be empty".toString());
    }
    
    @Override
    public final nf2.c0<Boolean> j(final MyAccount myAccount) {
        ah2.f.f((Object)myAccount, "account");
        final nf2.c0 c = nf2.c0.u((Callable)new q6.g(1, this, myAccount)).C((Object)Boolean.FALSE);
        ah2.f.e((Object)c, "fromCallable {\n      acc\u2026.onErrorReturnItem(false)");
        return (nf2.c0<Boolean>)c;
    }
    
    @Override
    public final n<MyAccount> k(final String s) {
        ah2.f.f((Object)s, "username");
        if (s.length() > 0) {
            final n<j60.a> m1 = this.b().M1(s);
            final wu.f f = new wu.f((Object)this, 12);
            m1.getClass();
            final n onAssembly = RxJavaPlugins.onAssembly((n)new io.reactivex.internal.operators.maybe.a((r)m1, (o)f));
            ah2.f.e((Object)onAssembly, "accountDao.findByUsernam\u2026ccountDomainModel()\n    }");
            return (n<MyAccount>)onAssembly;
        }
        throw new IllegalArgumentException("Username shouldn't be empty".toString());
    }
}
