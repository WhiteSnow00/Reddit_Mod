// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.repository;

import java.util.Iterator;
import kf2.h;
import b60.r;
import b60.a0;
import p6.i;
import b60.g1;
import android.content.SharedPreferences$Editor;
import com.reddit.listing.common.ListingViewMode$a;
import com.reddit.common.resource.LocaleUtils;
import b60.c1;
import com.reddit.domain.model.ThumbnailsPreference;
import ff2.q;
import af2.t;
import com.squareup.moshi.y;
import com.reddit.domain.model.GeopopularRegionSelectFilter;
import j$.time.Instant;
import b60.f1;
import com.reddit.listing.model.sort.CommentSortType;
import af2.c0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import mg2.p;
import kotlin.coroutines.CoroutineContext;
import zi2.g;
import cg2.j;
import gg2.c;
import b60.e1;
import ff2.o;
import af2.g0;
import io.reactivex.internal.operators.single.SingleFlatMapCompletable;
import i50.m;
import com.reddit.domain.model.CarouselCollectionState;
import mg2.l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import com.reddit.domain.model.AccountPreferencesPatch;
import com.reddit.domain.model.AccountPreferences$AcceptPrivateMessagesPolicy;
import com.reddit.domain.model.AccountPreferences;
import b60.b1;
import q20.d;
import mg.d0;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import kf2.f;
import b60.d1;
import javax.inject.Inject;
import ng2.e;
import com.reddit.domain.repository.NsfwSetting;
import kotlin.Pair;
import io.reactivex.subjects.PublishSubject;
import com.reddit.listing.common.ListingViewMode;
import com.reddit.data.remote.RemoteAccountPreferenceDataSource;
import q20.a;
import com.reddit.session.Session;
import android.content.SharedPreferences;
import qw1.b;
import va0.k;
import xd0.s;

public final class RedditPreferenceRepository implements s
{
    public final k a;
    public final b b;
    public final SharedPreferences c;
    public final Session d;
    public final q20.a e;
    public final ws0.a f;
    public final RemoteAccountPreferenceDataSource g;
    public final d20.a h;
    public final ag2.a<ListingViewMode> i;
    public final PublishSubject<Pair<String, Object>> j;
    public final PublishSubject<NsfwSetting> k;
    
    @Inject
    public RedditPreferenceRepository(final k a, final b b, final SharedPreferences c, final Session d, final q20.a e, final ws0.a f, final RemoteAccountPreferenceDataSource g, final d20.a h) {
        ng2.e.f((Object)a, "settings");
        ng2.e.f((Object)b, "nsfwIncognitoSettings");
        ng2.e.f((Object)c, "localPreferences");
        ng2.e.f((Object)d, "activeSession");
        ng2.e.f((Object)e, "backgroundThread");
        ng2.e.f((Object)f, "appSettings");
        ng2.e.f((Object)g, "remoteAccountPreferenceDataSource");
        ng2.e.f((Object)h, "dispatcherProvider");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = new ag2.a<ListingViewMode>();
        final PublishSubject create = PublishSubject.create();
        ng2.e.e((Object)create, "create<Pair<String, Any>>()");
        this.j = (PublishSubject<Pair<String, Object>>)create;
        final PublishSubject create2 = PublishSubject.create();
        ng2.e.e((Object)create2, "create<NsfwSetting>()");
        this.k = (PublishSubject<NsfwSetting>)create2;
    }
    
    @Override
    public final af2.a A(final int n, final String s) {
        ng2.e.f((Object)s, "key");
        this.j.onNext((Object)new Pair((Object)s, (Object)n));
        final af2.a onAssembly = RxJavaPlugins.onAssembly((af2.a)new f(new d1(this, s, n)));
        ng2.e.e((Object)onAssembly, "fromCallable { localPref\u2026Int(key, value).apply() }");
        return d0.S0(onAssembly, (d)this.e);
    }
    
    @Override
    public final af2.a B(final boolean b) {
        af2.a a;
        if (this.d.isIncognito()) {
            a = af2.a.p(new b1(this, b, 1));
        }
        else {
            this.a.b(AccountPreferences.copy$default(this.a.a(), b, b, (String)null, false, (String)null, (String)null, false, false, (Integer)null, false, false, false, false, false, false, false, false, false, (Long)null, (AccountPreferences$AcceptPrivateMessagesPolicy)null, false, false, false, (String)null, false, 33554428, (Object)null));
            a = this.n0(new AccountPreferencesPatch(Boolean.valueOf(b), Boolean.valueOf(b), (String)null, (String)null, (String)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Long)null, (AccountPreferences$AcceptPrivateMessagesPolicy)null, (Boolean)null, (Boolean)null, (Boolean)null, (String)null, (Boolean)null, 4194300, (DefaultConstructorMarker)null));
        }
        ng2.e.e((Object)a, "if (activeSession.isInco\u2026\n        ),\n      )\n    }");
        this.k.onNext((Object)new NsfwSetting(NsfwSetting.Type.OVER_18, b));
        return a;
    }
    
    @Override
    public final af2.a C(final boolean b) {
        this.a.b(AccountPreferences.copy$default(this.a.a(), false, false, (String)null, false, (String)null, (String)null, false, false, (Integer)null, false, false, false, b, false, false, false, false, false, (Long)null, (AccountPreferences$AcceptPrivateMessagesPolicy)null, false, false, false, (String)null, false, 33550335, (Object)null));
        return this.n0(new AccountPreferencesPatch((Boolean)null, (Boolean)null, (String)null, (String)null, (String)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, Boolean.valueOf(b), (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Long)null, (AccountPreferences$AcceptPrivateMessagesPolicy)null, (Boolean)null, (Boolean)null, (Boolean)null, (String)null, (Boolean)null, 4193791, (DefaultConstructorMarker)null));
    }
    
    @Override
    public final af2.a D(final a a, final l<? super CarouselCollectionState, CarouselCollectionState> l) {
        final af2.a onAssembly = RxJavaPlugins.onAssembly((af2.a)new SingleFlatMapCompletable<Object>((af2.g0<?>)this.c0(a), (ff2.o<?, ? extends af2.e>)new m((Object)this, 1, (Object)a, (Object)l)));
        ng2.e.e((Object)onAssembly, "getCarouselCollectionSta\u2026te(key, action(it))\n    }");
        return d0.S0(onAssembly, (d)this.e);
    }
    
    @Override
    public final af2.a E(final String s) {
        ng2.e.f((Object)s, "subredditId");
        return this.m0("closed_join_community_ids", s);
    }
    
    @Override
    public final af2.a F(final String s) {
        ng2.e.f((Object)s, "country");
        af2.a a;
        if (!ng2.e.a((Object)this.a.getUsername(), (Object)"*") && !ng2.e.a((Object)this.a.getUsername(), (Object)"#incognito")) {
            final af2.a p = af2.a.p(new e1(this, s, 1));
            ng2.e.e((Object)p, "fromCallable {\n        l\u2026         .apply()\n      }");
            a = d0.S0(p, (d)this.e);
        }
        else {
            a = af2.a.h();
            ng2.e.e((Object)a, "{\n      Completable.complete()\n    }");
        }
        return a;
    }
    
    @Override
    public final boolean G() {
        return this.a.a().getEmailUnsubscribeAll();
    }
    
    @Override
    public final af2.a H(final String s, final boolean b) {
        this.j.onNext((Object)new Pair((Object)s, (Object)b));
        final af2.a onAssembly = RxJavaPlugins.onAssembly((af2.a)new f((Callable<?>)new x40.e(s, b, 1, (Object)this)));
        ng2.e.e((Object)onAssembly, "fromCallable { localPref\u2026ean(key, value).apply() }");
        return d0.S0(onAssembly, (d)this.e);
    }
    
    @Override
    public final String I() {
        return this.a.a().getCountryCode();
    }
    
    @Override
    public final boolean J() {
        return this.c.getBoolean("streaming_feature_stream_entry_view_mode_compact", false);
    }
    
    @Override
    public final boolean K() {
        final SharedPreferences c = this.c;
        boolean b = false;
        if (c.getInt("opened_creator_stats_count", 0) >= 2) {
            b = true;
        }
        return b;
    }
    
    @Override
    public final boolean L() {
        return this.a.a().getEmailDigestsEnabled();
    }
    
    @Override
    public final Object M(final c<? super AccountPreferences> c) {
        return this.g.getPreferencesSuspend((c)c);
    }
    
    @Override
    public final Object N(final boolean b, final c<? super j> c) {
        final Object j = zi2.g.j((CoroutineContext)this.h.c(), (p)new RedditPreferenceRepository$setEnableFollowers$2(this, b, (c)null), c);
        if (j == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return j;
        }
        return cg2.j.a;
    }
    
    @Override
    public final c0<Boolean> O(final String s) {
        ng2.e.f((Object)s, "subredditId");
        return this.l0("closed_trending_settings_ids", s);
    }
    
    @Override
    public final boolean P() {
        return this.a.a().getEnableFollowers();
    }
    
    @Override
    public final c0<Boolean> Q(final String s) {
        ng2.e.f((Object)s, "subredditId");
        return this.l0("closed_join_counterpart_community_ids", s);
    }
    
    @Override
    public final c0<CommentSortType> R() {
        final c0<Object> u = c0.u((Callable<?>)new f1(this));
        ng2.e.e((Object)u, "fromCallable {\n      val\u2026SortType.CONFIDENCE\n    }");
        return px1.a.K0((c0)u, (d)this.e);
    }
    
    @Override
    public final int S(final int n, final String s) {
        ng2.e.f((Object)s, "key");
        return this.c.getInt(s, n);
    }
    
    @Override
    public final AccountPreferences$AcceptPrivateMessagesPolicy T() {
        return this.a.a().getAcceptPms();
    }
    
    @Override
    public final Object U(final boolean b, final c<? super j> c) {
        final Object j = zi2.g.j((CoroutineContext)this.h.c(), (p)new RedditPreferenceRepository$setAllowPrivateMessages$2(b, this, (c)null), c);
        if (j == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return j;
        }
        return cg2.j.a;
    }
    
    @Override
    public final af2.a V() {
        final af2.a onAssembly = RxJavaPlugins.onAssembly((af2.a)new f(new b1(this, true, 0)));
        ng2.e.e((Object)onAssembly, "fromCallable {\n      loc\u2026SEEN, seen).apply()\n    }");
        return d0.S0(onAssembly, (d)this.e);
    }
    
    @Override
    public final Object W(final String s, final String s2, final c<? super Long> c) {
        return zi2.g.j((CoroutineContext)this.h.c(), (p)new RedditPreferenceRepository$saveLastSubredditVisitTime$2(s2, s, this, (c)null), c);
    }
    
    @Override
    public final Object X(final c<? super Instant> c) {
        return zi2.g.j((CoroutineContext)this.h.c(), (p)new RedditPreferenceRepository$getSurveyLastSeenTime$2(this, (c)null), c);
    }
    
    @Override
    public final Object Y(final String s, final c<? super j> c) {
        final Object j = zi2.g.j((CoroutineContext)this.h.c(), (p)new RedditPreferenceRepository$setCountryCode$2(this, s, (c)null), c);
        if (j == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return j;
        }
        return cg2.j.a;
    }
    
    @Override
    public final af2.a Z(final String s) {
        ng2.e.f((Object)s, "subredditId");
        return this.m0("closed_join_counterpart_community_ids", s);
    }
    
    @Override
    public final GeopopularRegionSelectFilter a() {
        final SharedPreferences c = this.c;
        String s = "";
        final String string = c.getString("RedditRegionRepository:GeopopularRegionFilter", "");
        if (string != null) {
            s = string;
        }
        final int length = s.length();
        final int n = 1;
        GeopopularRegionSelectFilter geopopularRegionSelectFilter;
        if (length == 0) {
            geopopularRegionSelectFilter = GeopopularRegionSelectFilter.Companion.getDEFAULT();
        }
        else {
            final y a = y10.e.a;
            int n2;
            if (s.length() == 0) {
                n2 = n;
            }
            else {
                n2 = 0;
            }
            Object fromJson;
            if (n2 != 0) {
                fromJson = null;
            }
            else {
                fromJson = y10.e.a.a((Class)GeopopularRegionSelectFilter.class).fromJson(s);
            }
            if ((geopopularRegionSelectFilter = (GeopopularRegionSelectFilter)fromJson) == null) {
                geopopularRegionSelectFilter = GeopopularRegionSelectFilter.Companion.getDEFAULT();
            }
        }
        if (geopopularRegionSelectFilter.getFilter() != null) {
            final GeopopularRegionSelectFilter default1 = geopopularRegionSelectFilter;
            if (geopopularRegionSelectFilter.getDisplayName() != null) {
                return default1;
            }
        }
        return GeopopularRegionSelectFilter.Companion.getDEFAULT();
    }
    
    @Override
    public final boolean a0() {
        final SharedPreferences c = this.c;
        boolean b = false;
        if (c.getInt("opened_my_reddit_count", 0) > 15) {
            b = true;
        }
        return b;
    }
    
    @Override
    public final t b() {
        final t<Object> map = ((t<Pair<String, Object>>)this.j).filter((ff2.q<? super Pair<String, Object>>)new com.reddit.data.repository.b("streaming_feature_stream_entry_view_mode_compact", 5)).map((ff2.o<? super Pair<String, Object>, ?>)new b60.g0(5));
        ng2.e.e((Object)map, "preferencesSubject\n     \u2026\n      .map { it.second }");
        final t<Boolean> ofType = map.ofType(Boolean.class);
        ng2.e.b((Object)ofType, "ofType(R::class.java)");
        final t<Boolean> startWith = ofType.startWith(this.c.getBoolean("streaming_feature_stream_entry_view_mode_compact", false));
        ng2.e.e((Object)startWith, "preferencesSubject\n     \u2026getBoolean(key, default))");
        return startWith;
    }
    
    @Override
    public final af2.a b0() {
        final af2.a k = this.g.getPreferences().w((o)new b60.q((Object)this, 4)).K();
        ng2.e.e((Object)k, "remoteAccountPreferenceD\u2026 }\n      .toCompletable()");
        return d0.S0(k, (d)this.e);
    }
    
    @Override
    public final af2.a c(final CommentSortType commentSortType) {
        ng2.e.f((Object)commentSortType, "sort");
        this.a.b(AccountPreferences.copy$default(this.a.a(), false, false, (String)null, false, commentSortType.toString(), (String)null, false, false, (Integer)null, false, false, false, false, false, false, false, false, false, (Long)null, (AccountPreferences$AcceptPrivateMessagesPolicy)null, false, false, false, (String)null, false, 33554415, (Object)null));
        return this.n0(new AccountPreferencesPatch((Boolean)null, (Boolean)null, (String)null, commentSortType.toString(), (String)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Long)null, (AccountPreferences$AcceptPrivateMessagesPolicy)null, (Boolean)null, (Boolean)null, (Boolean)null, (String)null, (Boolean)null, 4194295, (DefaultConstructorMarker)null));
    }
    
    @Override
    public final c0<CarouselCollectionState> c0(final a a) {
        final c0 onAssembly = RxJavaPlugins.onAssembly((c0)new pf2.j(new e1(this, a, 0)));
        ng2.e.e((Object)onAssembly, "fromCallable {\n      val\u2026tionState()\n      }\n    }");
        return px1.a.K0(onAssembly, (d)this.e);
    }
    
    @Override
    public final void d(final boolean b) {
        if (this.d.isIncognito()) {
            this.b.a(b);
        }
        else {
            b5.k.u(this.c, "blurNsfw", b);
        }
        this.k.onNext((Object)new NsfwSetting(NsfwSetting.Type.BLUR, b));
    }
    
    @Override
    public final int d0() {
        final Integer minCommentScore = this.a.a().getMinCommentScore();
        int intValue;
        if (minCommentScore != null) {
            intValue = minCommentScore;
        }
        else {
            intValue = Integer.MIN_VALUE;
        }
        return intValue;
    }
    
    @Override
    public final ThumbnailsPreference e() {
        final String thumbnailPref = this.a.a().getThumbnailPref();
        ThumbnailsPreference thumbnailsPreference;
        if (thumbnailPref.length() == 0) {
            thumbnailsPreference = ThumbnailsPreference.COMMUNITY;
        }
        else {
            thumbnailsPreference = ThumbnailsPreference.Companion.toEnum(thumbnailPref);
        }
        return thumbnailsPreference;
    }
    
    @Override
    public final af2.a e0(final GeopopularRegionSelectFilter geopopularRegionSelectFilter) {
        ng2.e.f((Object)geopopularRegionSelectFilter, "filter");
        af2.a a;
        if (!ng2.e.a((Object)this.a.getUsername(), (Object)"*") && !ng2.e.a((Object)this.a.getUsername(), (Object)"#incognito")) {
            final af2.a p = af2.a.p(new c1(this, geopopularRegionSelectFilter));
            ng2.e.e((Object)p, "fromCallable {\n        s\u2026         .apply()\n      }");
            a = d0.S0(p, (d)this.e);
        }
        else {
            a = af2.a.h();
            ng2.e.e((Object)a, "{\n      Completable.complete()\n    }");
        }
        return a;
    }
    
    @Override
    public final Object f(final AccountPreferences$AcceptPrivateMessagesPolicy accountPreferences$AcceptPrivateMessagesPolicy, final c<? super j> c) {
        final Object j = zi2.g.j((CoroutineContext)this.h.c(), (p)new RedditPreferenceRepository$setAllowPrivateMessagesOption$2(this, accountPreferences$AcceptPrivateMessagesPolicy, (c)null), c);
        if (j == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return j;
        }
        return cg2.j.a;
    }
    
    @Override
    public final String f0() {
        final String i = this.I();
        final int hashCode = i.hashCode();
        if (hashCode != 2816) {
            if (hashCode != 2818) {
                if (hashCode != 2880) {
                    return LocaleUtils.INSTANCE.getCountryByCountryCode(i);
                }
                if (!i.equals("ZZ")) {
                    return LocaleUtils.INSTANCE.getCountryByCountryCode(i);
                }
            }
            else if (!i.equals("XZ")) {
                return LocaleUtils.INSTANCE.getCountryByCountryCode(i);
            }
            return "No Country Indentified";
        }
        if (i.equals("XX")) {
            return "Other Country (Unknown)";
        }
        return LocaleUtils.INSTANCE.getCountryByCountryCode(i);
    }
    
    @Override
    public final boolean g() {
        return this.a.a().getShowPresence();
    }
    
    @Override
    public final Object g0(final boolean b, final c<? super j> c) {
        final Object j = zi2.g.j((CoroutineContext)this.h.c(), (p)new RedditPreferenceRepository$setShowPresence$2(this, b, (c)null), c);
        if (j == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return j;
        }
        return cg2.j.a;
    }
    
    @Override
    public final ListingViewMode h() {
        final String string = this.c.getString("listingViewMode.globalDefault", ListingViewMode.CARD.toString());
        final ListingViewMode$a companion = ListingViewMode.Companion;
        ng2.e.c((Object)string);
        companion.getClass();
        return ListingViewMode$a.b(string);
    }
    
    @Override
    public final void h0() {
        final int int1 = this.c.getInt("opened_my_reddit_count", 0);
        final SharedPreferences$Editor edit = this.c.edit();
        ng2.e.e((Object)edit, "editor");
        edit.putInt("opened_my_reddit_count", int1 + 1);
        edit.apply();
    }
    
    @Override
    public final boolean i(final String s) {
        final SharedPreferences c = this.c;
        final StringBuilder sb = new StringBuilder();
        sb.append("not_a_new_feature.");
        sb.append(s);
        return c.contains(sb.toString()) ^ true;
    }
    
    @Override
    public final af2.a i0(final boolean b) {
        this.a.b(AccountPreferences.copy$default(this.a.a(), false, false, (String)null, false, (String)null, (String)null, false, false, (Integer)null, false, false, b, false, false, false, false, false, false, (Long)null, (AccountPreferences$AcceptPrivateMessagesPolicy)null, false, false, false, (String)null, false, 33552383, (Object)null));
        return this.n0(new AccountPreferencesPatch((Boolean)null, (Boolean)null, (String)null, (String)null, (String)null, (Boolean)null, (Boolean)null, (Boolean)null, Boolean.valueOf(b), (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Long)null, (AccountPreferences$AcceptPrivateMessagesPolicy)null, (Boolean)null, (Boolean)null, (Boolean)null, (String)null, (Boolean)null, 4194047, (DefaultConstructorMarker)null));
    }
    
    @Override
    public final c0<Boolean> j(final String s, final boolean b) {
        final c0 onAssembly = RxJavaPlugins.onAssembly((c0)new pf2.j((Callable)new x40.l(s, b, 1, (Object)this)));
        ng2.e.e((Object)onAssembly, "fromCallable { localPref\u2026etBoolean(key, default) }");
        return px1.a.K0(onAssembly, (d)this.e);
    }
    
    @Override
    public final int j0() {
        return this.c.getInt("key_number_of_times_live_pill_was_shown", 0);
    }
    
    @Override
    public final void k(final String s) {
        ng2.e.f((Object)s, "featureName");
        final SharedPreferences$Editor edit = this.c.edit();
        final StringBuilder sb = new StringBuilder();
        sb.append("not_a_new_feature.");
        sb.append(s);
        edit.putBoolean(sb.toString(), true).apply();
    }
    
    @Override
    public final af2.a k0(final ListingViewMode listingViewMode) {
        ng2.e.f((Object)listingViewMode, "viewMode");
        final af2.a p = af2.a.p(new g1(this, listingViewMode));
        ng2.e.e((Object)p, "fromCallable {\n      loc\u2026le.onNext(viewMode)\n    }");
        return d0.S0(p, (d)this.e);
    }
    
    @Override
    public final boolean l() {
        boolean b;
        if (this.d.isIncognito()) {
            b = this.b.b();
        }
        else {
            b = this.a.a().getOver18();
        }
        return b;
    }
    
    public final c0<Boolean> l0(final String s, final String s2) {
        final c0 onAssembly = RxJavaPlugins.onAssembly((c0)new pf2.j(new i(s, s2, 1, this)));
        ng2.e.e((Object)onAssembly, "fromCallable {\n      loc\u2026ins(value) ?: false\n    }");
        return px1.a.K0(onAssembly, (d)this.e);
    }
    
    @Override
    public final void m() {
        final SharedPreferences$Editor edit = this.c.edit();
        ng2.e.e((Object)edit, "editor");
        edit.putInt("key_number_of_times_live_pill_was_shown", this.j0() + 1);
        edit.apply();
    }
    
    public final af2.a m0(final String s, final String s2) {
        final af2.a onAssembly = RxJavaPlugins.onAssembly((af2.a)new kf2.e((ff2.a)new a0((Object)this, 1, (Object)s, (Object)s2)));
        ng2.e.e((Object)onAssembly, "fromAction {\n      local\u2026   .apply()\n      }\n    }");
        return d0.S0(onAssembly, (d)this.e);
    }
    
    @Override
    public final void n() {
        final int int1 = this.c.getInt("opened_creator_stats_count", 0);
        final SharedPreferences$Editor edit = this.c.edit();
        ng2.e.e((Object)edit, "editor");
        edit.putInt("opened_creator_stats_count", int1 + 1);
        edit.apply();
    }
    
    public final af2.a n0(final AccountPreferencesPatch accountPreferencesPatch) {
        af2.a a;
        if (!ng2.e.a((Object)this.a.getUsername(), (Object)"*") && !ng2.e.a((Object)this.a.getUsername(), (Object)"#incognito")) {
            final c0 w = this.g.patchPreferences(accountPreferencesPatch).w((o)new r((Object)this, 4));
            w.getClass();
            a = RxJavaPlugins.onAssembly((af2.a)new h<Object>((af2.g0<?>)w));
        }
        else {
            a = af2.a.h();
        }
        ng2.e.e((Object)a, "if (settings.username ==\u2026   .ignoreElement()\n    }");
        return d0.S0(a, (d)this.e);
    }
    
    @Override
    public final af2.a o(final ThumbnailsPreference thumbnailsPreference) {
        ng2.e.f((Object)thumbnailsPreference, "pref");
        this.a.b(AccountPreferences.copy$default(this.a.a(), false, false, (String)null, false, (String)null, thumbnailsPreference.toString(), false, false, (Integer)null, false, false, false, false, false, false, false, false, false, (Long)null, (AccountPreferences$AcceptPrivateMessagesPolicy)null, false, false, false, (String)null, false, 33554399, (Object)null));
        return this.n0(new AccountPreferencesPatch((Boolean)null, (Boolean)null, (String)null, (String)null, thumbnailsPreference.toString(), (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Long)null, (AccountPreferences$AcceptPrivateMessagesPolicy)null, (Boolean)null, (Boolean)null, (Boolean)null, (String)null, (Boolean)null, 4194287, (DefaultConstructorMarker)null));
    }
    
    @Override
    public final af2.a p(final String s) {
        ng2.e.f((Object)s, "subredditId");
        return this.m0("closed_trending_settings_ids", s);
    }
    
    @Override
    public final void q() {
        final SharedPreferences$Editor edit = this.c.edit();
        for (final String s : this.c.getAll().keySet()) {
            ng2.e.e((Object)s, "key");
            if (xi2.j.I0(s, "listingViewMode.", false)) {
                edit.remove(s);
            }
        }
        edit.apply();
    }
    
    @Override
    public final c0<Boolean> r(final String s) {
        ng2.e.f((Object)s, "subredditId");
        return this.l0("closed_join_community_ids", s);
    }
    
    @Override
    public final boolean s() {
        return this.a.a().getAcceptPms() == AccountPreferences$AcceptPrivateMessagesPolicy.EVERYONE;
    }
    
    @Override
    public final Object t(final Instant instant, final c<? super j> c) {
        final Object j = zi2.g.j((CoroutineContext)this.h.c(), (p)new RedditPreferenceRepository$setSurveyLastSeenTime$2(this, instant, (c)null), c);
        if (j == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return j;
        }
        return cg2.j.a;
    }
    
    @Override
    public final PublishSubject u() {
        return this.k;
    }
    
    @Override
    public final af2.a v(final String s, final ListingViewMode listingViewMode) {
        ng2.e.f((Object)s, "listingName");
        ng2.e.f((Object)listingViewMode, "mode");
        final af2.a p2 = af2.a.p((Callable<?>)new o50.j((Object)this, 1, (Object)s, (Object)listingViewMode));
        ng2.e.e((Object)p2, "fromCallable {\n      loc\u2026(),\n      ).apply()\n    }");
        return d0.S0(p2, (d)this.e);
    }
    
    @Override
    public final t<ListingViewMode> w() {
        return px0.c.T2((t)this.i, this.e);
    }
    
    @Override
    public final boolean w3() {
        boolean b;
        if (this.d.isIncognito()) {
            b = this.b.d();
        }
        else {
            b = this.c.getBoolean("blurNsfw", this.f.j());
        }
        return b;
    }
    
    @Override
    public final Object x(final String s, final String s2, final c<? super Integer> c) {
        return zi2.g.j((CoroutineContext)this.h.c(), (p)new RedditPreferenceRepository$incrementCounterpartCommunityVisitCount$2(s2, s, this, (c)null), c);
    }
    
    @Override
    public final Object y(final String s, final String s2, final c<? super Integer> c) {
        return zi2.g.j((CoroutineContext)this.h.c(), (p)new RedditPreferenceRepository$incrementSubredditVisitCount$2(s2, s, this, (c)null), c);
    }
    
    @Override
    public final ListingViewMode z(final String s, final ListingViewMode listingViewMode) {
        ng2.e.f((Object)s, "listingName");
        ng2.e.f((Object)listingViewMode, "default");
        final String string = this.c.getString(b.l("listingViewMode.", s), listingViewMode.toString());
        final ListingViewMode$a companion = ListingViewMode.Companion;
        ng2.e.c((Object)string);
        companion.getClass();
        return ListingViewMode$a.b(string);
    }
}
