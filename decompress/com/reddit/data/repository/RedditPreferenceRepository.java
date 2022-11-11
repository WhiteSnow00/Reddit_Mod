// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.repository;

import z50.i1;
import java.util.Iterator;
import pf2.h;
import z50.b1;
import z50.d1;
import z50.j1;
import ff2.g0;
import io.reactivex.internal.operators.single.SingleFlatMapCompletable;
import i10.n;
import rg2.l;
import com.reddit.domain.model.ThumbnailsPreference;
import android.content.SharedPreferences$Editor;
import com.reddit.common.resource.LocaleUtils;
import z50.g1;
import com.reddit.domain.model.CarouselCollectionState;
import xd0.s$a;
import com.squareup.moshi.y;
import com.reddit.domain.model.GeopopularRegionSelectFilter;
import z50.q0;
import kf2.q;
import ff2.t;
import z50.c1;
import z50.h1;
import com.reddit.listing.model.sort.CommentSortType;
import ff2.c0;
import v40.o;
import com.reddit.domain.repository.NsfwSetting$Type;
import kotlin.jvm.internal.DefaultConstructorMarker;
import com.reddit.domain.model.AccountPreferencesPatch;
import com.reddit.domain.model.AccountPreferences;
import z50.f1;
import n20.d;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import pf2.f;
import z50.e1;
import com.reddit.listing.common.ListingViewMode$a;
import com.reddit.domain.model.AccountPreferences$AcceptPrivateMessagesPolicy;
import j$.time.Instant;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import rg2.p;
import kotlin.coroutines.CoroutineContext;
import ej2.g;
import hg2.j;
import lg2.c;
import javax.inject.Inject;
import sg2.e;
import com.reddit.domain.repository.NsfwSetting;
import kotlin.Pair;
import io.reactivex.subjects.PublishSubject;
import com.reddit.listing.common.ListingViewMode;
import com.reddit.data.remote.RemoteAccountPreferenceDataSource;
import n20.a;
import com.reddit.session.Session;
import android.content.SharedPreferences;
import uw1.b;
import ua0.k;
import xd0.s;

public final class RedditPreferenceRepository implements s
{
    public final k a;
    public final b b;
    public final SharedPreferences c;
    public final Session d;
    public final a e;
    public final us0.a f;
    public final RemoteAccountPreferenceDataSource g;
    public final a20.a h;
    public final fg2.a<ListingViewMode> i;
    public final PublishSubject<Pair<String, Object>> j;
    public final PublishSubject<NsfwSetting> k;
    
    @Inject
    public RedditPreferenceRepository(final k a, final b b, final SharedPreferences c, final Session d, final a e, final us0.a f, final RemoteAccountPreferenceDataSource g, final a20.a h) {
        sg2.e.f((Object)a, "settings");
        sg2.e.f((Object)b, "nsfwIncognitoSettings");
        sg2.e.f((Object)c, "localPreferences");
        sg2.e.f((Object)d, "activeSession");
        sg2.e.f((Object)e, "backgroundThread");
        sg2.e.f((Object)f, "appSettings");
        sg2.e.f((Object)g, "remoteAccountPreferenceDataSource");
        sg2.e.f((Object)h, "dispatcherProvider");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = (fg2.a<ListingViewMode>)new fg2.a();
        final PublishSubject<Object> create = (PublishSubject<Object>)PublishSubject.create();
        sg2.e.e((Object)create, "create<Pair<String, Any>>()");
        this.j = (PublishSubject<Pair<String, Object>>)create;
        final PublishSubject<Object> create2 = (PublishSubject<Object>)PublishSubject.create();
        sg2.e.e((Object)create2, "create<NsfwSetting>()");
        this.k = (PublishSubject<NsfwSetting>)create2;
    }
    
    public final Object A(final boolean b, final c<? super j> c) {
        final Object l = ej2.g.l((CoroutineContext)this.h.c(), (p)new RedditPreferenceRepository$setAllowPrivateMessages$2(b, this, (c)null), (c)c);
        if (l == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return l;
        }
        return hg2.j.a;
    }
    
    public final Object B(final c<? super Instant> c) {
        return ej2.g.l((CoroutineContext)this.h.c(), (p)new RedditPreferenceRepository$getSurveyLastSeenTime$2(this, (c)null), (c)c);
    }
    
    public final Object C(final AccountPreferences$AcceptPrivateMessagesPolicy accountPreferences$AcceptPrivateMessagesPolicy, final c<? super j> c) {
        final Object l = ej2.g.l((CoroutineContext)this.h.c(), (p)new RedditPreferenceRepository$setAllowPrivateMessagesOption$2(this, accountPreferences$AcceptPrivateMessagesPolicy, (c)null), (c)c);
        if (l == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return l;
        }
        return hg2.j.a;
    }
    
    public final ListingViewMode D(String string, final ListingViewMode listingViewMode) {
        sg2.e.f((Object)string, "listingName");
        sg2.e.f((Object)listingViewMode, "default");
        string = this.c.getString(al0.b.h("listingViewMode.", string), listingViewMode.toString());
        final ListingViewMode$a companion = ListingViewMode.Companion;
        sg2.e.c((Object)string);
        companion.getClass();
        return ListingViewMode$a.b(string);
    }
    
    public final ff2.a E(final int n, final String s) {
        sg2.e.f((Object)s, "key");
        this.j.onNext((Pair<String, Object>)new Pair((Object)s, (Object)n));
        final ff2.a onAssembly = RxJavaPlugins.onAssembly((ff2.a)new f((Callable)new e1(this, s, n)));
        sg2.e.e((Object)onAssembly, "fromCallable { localPref\u2026Int(key, value).apply() }");
        return yd.b.i0(onAssembly, (d)this.e);
    }
    
    public final ff2.a F(final boolean b) {
        ff2.a a;
        if (this.d.isIncognito()) {
            a = ff2.a.p((Callable<?>)new f1(this, b));
        }
        else {
            this.a.b(AccountPreferences.copy$default(this.a.a(), b, b, (String)null, false, (String)null, (String)null, false, false, (Integer)null, false, false, false, false, false, false, false, false, false, (Long)null, (AccountPreferences$AcceptPrivateMessagesPolicy)null, false, false, false, (String)null, false, 33554428, (Object)null));
            a = this.n0(new AccountPreferencesPatch(Boolean.valueOf(b), Boolean.valueOf(b), (String)null, (String)null, (String)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Long)null, (AccountPreferences$AcceptPrivateMessagesPolicy)null, (Boolean)null, (Boolean)null, (Boolean)null, (String)null, (Boolean)null, 4194300, (DefaultConstructorMarker)null));
        }
        sg2.e.e((Object)a, "if (activeSession.isInco\u2026\n        ),\n      )\n    }");
        this.k.onNext(new NsfwSetting(NsfwSetting$Type.OVER_18, b));
        return a;
    }
    
    public final ff2.a G(final boolean b) {
        this.a.b(AccountPreferences.copy$default(this.a.a(), false, false, (String)null, false, (String)null, (String)null, false, false, (Integer)null, false, false, false, b, false, false, false, false, false, (Long)null, (AccountPreferences$AcceptPrivateMessagesPolicy)null, false, false, false, (String)null, false, 33550335, (Object)null));
        return this.n0(new AccountPreferencesPatch((Boolean)null, (Boolean)null, (String)null, (String)null, (String)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, Boolean.valueOf(b), (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Long)null, (AccountPreferences$AcceptPrivateMessagesPolicy)null, (Boolean)null, (Boolean)null, (Boolean)null, (String)null, (Boolean)null, 4193791, (DefaultConstructorMarker)null));
    }
    
    public final ff2.a H(final String s) {
        sg2.e.f((Object)s, "subredditId");
        return this.m0("closed_join_community_ids", s);
    }
    
    public final ff2.a I(final String s) {
        sg2.e.f((Object)s, "country");
        ff2.a a;
        if (!sg2.e.a((Object)this.a.getUsername(), (Object)"*") && !sg2.e.a((Object)this.a.getUsername(), (Object)"#incognito")) {
            final ff2.a p = ff2.a.p((Callable<?>)new q6.g(7, (Object)this, (Object)s));
            sg2.e.e((Object)p, "fromCallable {\n        l\u2026         .apply()\n      }");
            a = yd.b.i0(p, (d)this.e);
        }
        else {
            a = ff2.a.h();
            sg2.e.e((Object)a, "{\n      Completable.complete()\n    }");
        }
        return a;
    }
    
    public final boolean J() {
        return this.a.a().getEmailUnsubscribeAll();
    }
    
    public final ff2.a K(final String s, final boolean b) {
        this.j.onNext((Pair<String, Object>)new Pair((Object)s, (Object)b));
        final ff2.a onAssembly = RxJavaPlugins.onAssembly((ff2.a)new f((Callable)new o(s, b, 1, (Object)this)));
        sg2.e.e((Object)onAssembly, "fromCallable { localPref\u2026ean(key, value).apply() }");
        return yd.b.i0(onAssembly, (d)this.e);
    }
    
    public final Object L(final String s, final c<? super j> c) {
        final Object l = ej2.g.l((CoroutineContext)this.h.c(), (p)new RedditPreferenceRepository$setCountryCode$2(this, s, (c)null), (c)c);
        if (l == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return l;
        }
        return hg2.j.a;
    }
    
    public final String M() {
        return this.a.a().getCountryCode();
    }
    
    public final boolean N() {
        return this.c.getBoolean("streaming_feature_stream_entry_view_mode_compact", false);
    }
    
    public final boolean O() {
        final SharedPreferences c = this.c;
        boolean b = false;
        if (c.getInt("opened_creator_stats_count", 0) >= 2) {
            b = true;
        }
        return b;
    }
    
    public final boolean P() {
        return this.a.a().getEmailDigestsEnabled();
    }
    
    public final Object Q(final boolean b, final c<? super j> c) {
        final Object l = ej2.g.l((CoroutineContext)this.h.c(), (p)new RedditPreferenceRepository$setEnableFollowers$2(this, b, (c)null), (c)c);
        if (l == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return l;
        }
        return hg2.j.a;
    }
    
    public final Object R(final String s, final String s2, final c<? super Integer> c) {
        return ej2.g.l((CoroutineContext)this.h.c(), (p)new RedditPreferenceRepository$incrementCounterpartCommunityVisitCount$2(s2, s, this, (c)null), (c)c);
    }
    
    public final c0<Boolean> S(final String s) {
        sg2.e.f((Object)s, "subredditId");
        return this.l0("closed_trending_settings_ids", s);
    }
    
    public final boolean T() {
        return this.a.a().getEnableFollowers();
    }
    
    public final c0<Boolean> U(final String s) {
        sg2.e.f((Object)s, "subredditId");
        return this.l0("closed_join_counterpart_community_ids", s);
    }
    
    public final c0<CommentSortType> V() {
        final c0<Object> u = c0.u((Callable<?>)new h1(this));
        sg2.e.e((Object)u, "fromCallable {\n      val\u2026SortType.CONFIDENCE\n    }");
        return nn0.a.V((c0)u, (d)this.e);
    }
    
    public final int W(final int n, final String s) {
        sg2.e.f((Object)s, "key");
        return this.c.getInt(s, n);
    }
    
    public final AccountPreferences$AcceptPrivateMessagesPolicy X() {
        return this.a.a().getAcceptPms();
    }
    
    public final ff2.a Y() {
        final ff2.a onAssembly = RxJavaPlugins.onAssembly((ff2.a)new f((Callable)new c1(this)));
        sg2.e.e((Object)onAssembly, "fromCallable {\n      loc\u2026SEEN, seen).apply()\n    }");
        return yd.b.i0(onAssembly, (d)this.e);
    }
    
    public final ff2.a Z(final String s) {
        sg2.e.f((Object)s, "subredditId");
        return this.m0("closed_join_counterpart_community_ids", s);
    }
    
    public final Object a(final Instant instant, final c<? super j> c) {
        final Object l = ej2.g.l((CoroutineContext)this.h.c(), (p)new RedditPreferenceRepository$setSurveyLastSeenTime$2(this, instant, (c)null), (c)c);
        if (l == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return l;
        }
        return hg2.j.a;
    }
    
    public final boolean a0() {
        final SharedPreferences c = this.c;
        boolean b = false;
        if (c.getInt("opened_my_reddit_count", 0) > 3) {
            b = true;
        }
        return b;
    }
    
    public final t b() {
        final t map = ((t)this.j).filter((q)new z50.o((Object)"streaming_feature_stream_entry_view_mode_compact", 3)).map((kf2.o)new q0(5));
        sg2.e.e((Object)map, "preferencesSubject\n     \u2026\n      .map { it.second }");
        final t ofType = map.ofType((Class)Boolean.class);
        sg2.e.b((Object)ofType, "ofType(R::class.java)");
        final t startWith = ofType.startWith((Object)this.c.getBoolean("streaming_feature_stream_entry_view_mode_compact", false));
        sg2.e.e((Object)startWith, "preferencesSubject\n     \u2026getBoolean(key, default))");
        return startWith;
    }
    
    public final Object b0(final c<? super AccountPreferences> c) {
        return this.g.getPreferencesSuspend((c)c);
    }
    
    public final GeopopularRegionSelectFilter c() {
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
            final y a = v10.e.a;
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
                fromJson = v10.e.a.a((Class)GeopopularRegionSelectFilter.class).fromJson(s);
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
    
    public final ff2.a c0() {
        final ff2.a k = this.g.getPreferences().w((kf2.o)new z50.p((Object)this, 3)).K();
        sg2.e.e((Object)k, "remoteAccountPreferenceD\u2026 }\n      .toCompletable()");
        return yd.b.i0(k, (d)this.e);
    }
    
    public final void d(final boolean b) {
        if (this.d.isIncognito()) {
            this.b.a(b);
        }
        else {
            a.w(this.c, "blurNsfw", b);
        }
        this.k.onNext(new NsfwSetting(NsfwSetting$Type.BLUR, b));
    }
    
    public final c0<CarouselCollectionState> d0(final s$a s$a) {
        final c0<Object> onAssembly = RxJavaPlugins.onAssembly(new uf2.j<Object>((Callable<?>)new g1(this, s$a)));
        sg2.e.e((Object)onAssembly, "fromCallable {\n      val\u2026tionState()\n      }\n    }");
        return nn0.a.V((c0)onAssembly, (d)this.e);
    }
    
    public final Object e(final boolean b, final c<? super j> c) {
        final Object l = ej2.g.l((CoroutineContext)this.h.c(), (p)new RedditPreferenceRepository$setShowPresence$2(this, b, (c)null), (c)c);
        if (l == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return l;
        }
        return hg2.j.a;
    }
    
    public final int e0() {
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
    
    public final Object f(final String s, final String s2, final c<? super Integer> c) {
        return ej2.g.l((CoroutineContext)this.h.c(), (p)new RedditPreferenceRepository$incrementSubredditVisitCount$2(s2, s, this, (c)null), (c)c);
    }
    
    public final ff2.a f0(final GeopopularRegionSelectFilter geopopularRegionSelectFilter) {
        sg2.e.f((Object)geopopularRegionSelectFilter, "filter");
        ff2.a a;
        if (!sg2.e.a((Object)this.a.getUsername(), (Object)"*") && !sg2.e.a((Object)this.a.getUsername(), (Object)"#incognito")) {
            final ff2.a p = ff2.a.p((Callable<?>)new q6.g(6, (Object)this, (Object)geopopularRegionSelectFilter));
            sg2.e.e((Object)p, "fromCallable {\n        s\u2026         .apply()\n      }");
            a = yd.b.i0(p, (d)this.e);
        }
        else {
            a = ff2.a.h();
            sg2.e.e((Object)a, "{\n      Completable.complete()\n    }");
        }
        return a;
    }
    
    public final ff2.a g(final CommentSortType commentSortType) {
        sg2.e.f((Object)commentSortType, "sort");
        this.a.b(AccountPreferences.copy$default(this.a.a(), false, false, (String)null, false, commentSortType.toString(), (String)null, false, false, (Integer)null, false, false, false, false, false, false, false, false, false, (Long)null, (AccountPreferences$AcceptPrivateMessagesPolicy)null, false, false, false, (String)null, false, 33554415, (Object)null));
        return this.n0(new AccountPreferencesPatch((Boolean)null, (Boolean)null, (String)null, commentSortType.toString(), (String)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Long)null, (AccountPreferences$AcceptPrivateMessagesPolicy)null, (Boolean)null, (Boolean)null, (Boolean)null, (String)null, (Boolean)null, 4194295, (DefaultConstructorMarker)null));
    }
    
    public final String g0() {
        final String m = this.M();
        final int hashCode = m.hashCode();
        if (hashCode != 2816) {
            if (hashCode != 2818) {
                if (hashCode != 2880) {
                    return LocaleUtils.INSTANCE.getCountryByCountryCode(m);
                }
                if (!m.equals("ZZ")) {
                    return LocaleUtils.INSTANCE.getCountryByCountryCode(m);
                }
            }
            else if (!m.equals("XZ")) {
                return LocaleUtils.INSTANCE.getCountryByCountryCode(m);
            }
            return "No Country Indentified";
        }
        if (m.equals("XX")) {
            return "Other Country (Unknown)";
        }
        return LocaleUtils.INSTANCE.getCountryByCountryCode(m);
    }
    
    public final Object h(final String s, final String s2, final c<? super Long> c) {
        return ej2.g.l((CoroutineContext)this.h.c(), (p)new RedditPreferenceRepository$saveLastSubredditVisitTime$2(s2, s, this, (c)null), (c)c);
    }
    
    public final void h0() {
        final int int1 = this.c.getInt("opened_my_reddit_count", 0);
        final SharedPreferences$Editor edit = this.c.edit();
        sg2.e.e((Object)edit, "editor");
        edit.putInt("opened_my_reddit_count", int1 + 1);
        edit.apply();
    }
    
    public final ThumbnailsPreference i() {
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
    
    public final ff2.a i0(final boolean b) {
        this.a.b(AccountPreferences.copy$default(this.a.a(), false, false, (String)null, false, (String)null, (String)null, false, false, (Integer)null, false, false, b, false, false, false, false, false, false, (Long)null, (AccountPreferences$AcceptPrivateMessagesPolicy)null, false, false, false, (String)null, false, 33552383, (Object)null));
        return this.n0(new AccountPreferencesPatch((Boolean)null, (Boolean)null, (String)null, (String)null, (String)null, (Boolean)null, (Boolean)null, (Boolean)null, Boolean.valueOf(b), (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Long)null, (AccountPreferences$AcceptPrivateMessagesPolicy)null, (Boolean)null, (Boolean)null, (Boolean)null, (String)null, (Boolean)null, 4194047, (DefaultConstructorMarker)null));
    }
    
    public final ff2.a j(final s$a s$a, final l<? super CarouselCollectionState, CarouselCollectionState> l) {
        final ff2.a onAssembly = RxJavaPlugins.onAssembly((ff2.a)new SingleFlatMapCompletable((g0)this.d0(s$a), (kf2.o)new n((Object)this, 1, (Object)s$a, (Object)l)));
        sg2.e.e((Object)onAssembly, "getCarouselCollectionSta\u2026te(key, action(it))\n    }");
        return yd.b.i0(onAssembly, (d)this.e);
    }
    
    public final int j0() {
        return this.c.getInt("key_number_of_times_live_pill_was_shown", 0);
    }
    
    public final boolean k() {
        return this.a.a().getShowPresence();
    }
    
    public final ff2.a k0(final ListingViewMode listingViewMode) {
        sg2.e.f((Object)listingViewMode, "viewMode");
        final ff2.a p = ff2.a.p((Callable<?>)new j1(this, listingViewMode));
        sg2.e.e((Object)p, "fromCallable {\n      loc\u2026le.onNext(viewMode)\n    }");
        return yd.b.i0(p, (d)this.e);
    }
    
    public final ListingViewMode l() {
        final String string = this.c.getString("listingViewMode.globalDefault", ListingViewMode.CARD.toString());
        final ListingViewMode$a companion = ListingViewMode.Companion;
        sg2.e.c((Object)string);
        companion.getClass();
        return ListingViewMode$a.b(string);
    }
    
    public final c0<Boolean> l0(final String s, final String s2) {
        final c0<Object> onAssembly = RxJavaPlugins.onAssembly(new uf2.j<Object>((Callable<?>)new d1((Object)this, (Comparable)s, (Object)s2, 0)));
        sg2.e.e((Object)onAssembly, "fromCallable {\n      loc\u2026ins(value) ?: false\n    }");
        return nn0.a.V((c0)onAssembly, (d)this.e);
    }
    
    public final boolean m(final String s) {
        final SharedPreferences c = this.c;
        final StringBuilder sb = new StringBuilder();
        sb.append("not_a_new_feature.");
        sb.append(s);
        return c.contains(sb.toString()) ^ true;
    }
    
    public final ff2.a m0(final String s, final String s2) {
        final ff2.a onAssembly = RxJavaPlugins.onAssembly((ff2.a)new pf2.e((kf2.a)new b1((Object)this, 0, (Object)s, (Object)s2)));
        sg2.e.e((Object)onAssembly, "fromAction {\n      local\u2026   .apply()\n      }\n    }");
        return yd.b.i0(onAssembly, (d)this.e);
    }
    
    public final c0<Boolean> n(final String s, final boolean b) {
        final c0<Object> onAssembly = RxJavaPlugins.onAssembly(new uf2.j<Object>((Callable<?>)new v40.e(s, b, 1, (Object)this)));
        sg2.e.e((Object)onAssembly, "fromCallable { localPref\u2026etBoolean(key, default) }");
        return nn0.a.V((c0)onAssembly, (d)this.e);
    }
    
    public final ff2.a n0(final AccountPreferencesPatch accountPreferencesPatch) {
        ff2.a a;
        if (!sg2.e.a((Object)this.a.getUsername(), (Object)"*") && !sg2.e.a((Object)this.a.getUsername(), (Object)"#incognito")) {
            final c0 w = this.g.patchPreferences(accountPreferencesPatch).w((kf2.o)new z50.o((Object)this, 3));
            w.getClass();
            a = RxJavaPlugins.onAssembly((ff2.a)new h((g0)w));
        }
        else {
            a = ff2.a.h();
        }
        sg2.e.e((Object)a, "if (settings.username ==\u2026   .ignoreElement()\n    }");
        return yd.b.i0(a, (d)this.e);
    }
    
    public final void o(final String s) {
        sg2.e.f((Object)s, "featureName");
        final SharedPreferences$Editor edit = this.c.edit();
        final StringBuilder sb = new StringBuilder();
        sb.append("not_a_new_feature.");
        sb.append(s);
        edit.putBoolean(sb.toString(), true).apply();
    }
    
    public final boolean p() {
        boolean b;
        if (this.d.isIncognito()) {
            b = this.b.b();
        }
        else {
            b = this.a.a().getOver18();
        }
        return b;
    }
    
    public final void q() {
        final SharedPreferences$Editor edit = this.c.edit();
        sg2.e.e((Object)edit, "editor");
        edit.putInt("key_number_of_times_live_pill_was_shown", this.j0() + 1);
        edit.apply();
    }
    
    public final void r() {
        final int int1 = this.c.getInt("opened_creator_stats_count", 0);
        final SharedPreferences$Editor edit = this.c.edit();
        sg2.e.e((Object)edit, "editor");
        edit.putInt("opened_creator_stats_count", int1 + 1);
        edit.apply();
    }
    
    public final ff2.a s(final ThumbnailsPreference thumbnailsPreference) {
        sg2.e.f((Object)thumbnailsPreference, "pref");
        this.a.b(AccountPreferences.copy$default(this.a.a(), false, false, (String)null, false, (String)null, thumbnailsPreference.toString(), false, false, (Integer)null, false, false, false, false, false, false, false, false, false, (Long)null, (AccountPreferences$AcceptPrivateMessagesPolicy)null, false, false, false, (String)null, false, 33554399, (Object)null));
        return this.n0(new AccountPreferencesPatch((Boolean)null, (Boolean)null, (String)null, (String)null, thumbnailsPreference.toString(), (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Long)null, (AccountPreferences$AcceptPrivateMessagesPolicy)null, (Boolean)null, (Boolean)null, (Boolean)null, (String)null, (Boolean)null, 4194287, (DefaultConstructorMarker)null));
    }
    
    public final ff2.a t(final String s) {
        sg2.e.f((Object)s, "subredditId");
        return this.m0("closed_trending_settings_ids", s);
    }
    
    public final boolean t3() {
        boolean b;
        if (this.d.isIncognito()) {
            b = this.b.d();
        }
        else {
            b = this.c.getBoolean("blurNsfw", this.f.j());
        }
        return b;
    }
    
    public final void u() {
        final SharedPreferences$Editor edit = this.c.edit();
        for (final String s : this.c.getAll().keySet()) {
            sg2.e.e((Object)s, "key");
            if (cj2.j.O0(s, "listingViewMode.", false)) {
                edit.remove(s);
            }
        }
        edit.apply();
    }
    
    public final c0<Boolean> v(final String s) {
        sg2.e.f((Object)s, "subredditId");
        return this.l0("closed_join_community_ids", s);
    }
    
    public final boolean w() {
        return this.a.a().getAcceptPms() == AccountPreferences$AcceptPrivateMessagesPolicy.EVERYONE;
    }
    
    public final PublishSubject x() {
        return this.k;
    }
    
    public final ff2.a y(final String s, final ListingViewMode listingViewMode) {
        sg2.e.f((Object)s, "listingName");
        sg2.e.f((Object)listingViewMode, "mode");
        final ff2.a p2 = ff2.a.p((Callable<?>)new i1((Object)this, s, (Object)listingViewMode, 0));
        sg2.e.e((Object)p2, "fromCallable {\n      loc\u2026(),\n      ).apply()\n    }");
        return yd.b.i0(p2, (d)this.e);
    }
    
    public final t<ListingViewMode> z() {
        return (t<ListingViewMode>)mf1.a.S((t)this.i, this.e);
    }
}
