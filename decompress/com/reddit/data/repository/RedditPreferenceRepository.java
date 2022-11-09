// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.repository;

import com.reddit.common.resource.LocaleUtils;
import com.squareup.moshi.y;
import com.reddit.domain.model.GeopopularRegionSelectFilter;
import g60.p1;
import g60.s1;
import com.reddit.listing.model.sort.CommentSortType;
import xf2.h;
import c50.g1;
import xf2.e;
import g60.o1;
import g60.d1;
import sf2.q;
import g60.q1;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ak0.m;
import eg.n0;
import nf2.t;
import g60.r1;
import java.util.Iterator;
import com.reddit.domain.model.ThumbnailsPreference;
import kotlin.coroutines.CoroutineContext;
import mj2.g;
import j$.time.Instant;
import tg2.c;
import a4.u1;
import cg2.j;
import c50.p;
import nf2.c0;
import java.util.concurrent.Callable;
import g60.t1;
import com.reddit.listing.common.ListingViewMode$a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import com.reddit.domain.model.AccountPreferencesPatch;
import com.reddit.domain.model.AccountPreferences$AcceptPrivateMessagesPolicy;
import com.reddit.domain.model.AccountPreferences;
import android.content.SharedPreferences$Editor;
import r20.d;
import io.reactivex.plugins.RxJavaPlugins;
import sf2.o;
import nf2.g0;
import io.reactivex.internal.operators.single.SingleFlatMapCompletable;
import n50.n;
import com.reddit.domain.model.CarouselCollectionState;
import zg2.l;
import ge0.a0$a;
import javax.inject.Inject;
import ah2.f;
import com.reddit.domain.repository.NsfwSetting;
import kotlin.Pair;
import io.reactivex.subjects.PublishSubject;
import com.reddit.listing.common.ListingViewMode;
import com.reddit.data.remote.RemoteAccountPreferenceDataSource;
import r20.a;
import com.reddit.session.Session;
import android.content.SharedPreferences;
import ex1.b;
import cb0.k;
import ge0.a0;

public final class RedditPreferenceRepository implements a0
{
    public final k a;
    public final b b;
    public final SharedPreferences c;
    public final Session d;
    public final a e;
    public final bt0.a f;
    public final RemoteAccountPreferenceDataSource g;
    public final e20.a h;
    public final ng2.a<ListingViewMode> i;
    public final PublishSubject<Pair<String, Object>> j;
    public final PublishSubject<NsfwSetting> k;
    
    @Inject
    public RedditPreferenceRepository(final k a, final b b, final SharedPreferences c, final Session d, final a e, final bt0.a f, final RemoteAccountPreferenceDataSource g, final e20.a h) {
        ah2.f.f((Object)a, "settings");
        ah2.f.f((Object)b, "nsfwIncognitoSettings");
        ah2.f.f((Object)c, "localPreferences");
        ah2.f.f((Object)d, "activeSession");
        ah2.f.f((Object)e, "backgroundThread");
        ah2.f.f((Object)f, "appSettings");
        ah2.f.f((Object)g, "remoteAccountPreferenceDataSource");
        ah2.f.f((Object)h, "dispatcherProvider");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = (ng2.a<ListingViewMode>)new ng2.a();
        final PublishSubject create = PublishSubject.create();
        ah2.f.e((Object)create, "create<Pair<String, Any>>()");
        this.j = (PublishSubject<Pair<String, Object>>)create;
        final PublishSubject create2 = PublishSubject.create();
        ah2.f.e((Object)create2, "create<NsfwSetting>()");
        this.k = (PublishSubject<NsfwSetting>)create2;
    }
    
    public final nf2.a A3(final a0$a a0$a, final l<? super CarouselCollectionState, CarouselCollectionState> l) {
        final nf2.a onAssembly = RxJavaPlugins.onAssembly((nf2.a)new SingleFlatMapCompletable((g0)this.O3(a0$a), (o)new n((Object)this, 1, (Object)a0$a, (Object)l)));
        ah2.f.e((Object)onAssembly, "getCarouselCollectionSta\u2026te(key, action(it))\n    }");
        return o72.f.t(onAssembly, (d)this.e);
    }
    
    public final void A4() {
        final int int1 = this.c.getInt("opened_my_reddit_count", 0);
        final SharedPreferences$Editor edit = this.c.edit();
        ah2.f.e((Object)edit, "editor");
        edit.putInt("opened_my_reddit_count", int1 + 1);
        edit.apply();
    }
    
    public final boolean B3() {
        return this.a.a().getShowPresence();
    }
    
    public final nf2.a B4(final boolean b) {
        this.a.b(AccountPreferences.copy$default(this.a.a(), false, false, (String)null, false, (String)null, (String)null, false, false, (Integer)null, false, false, b, false, false, false, false, false, false, (Long)null, (AccountPreferences$AcceptPrivateMessagesPolicy)null, false, false, false, (String)null, false, 33552383, (Object)null));
        return this.e(new AccountPreferencesPatch((Boolean)null, (Boolean)null, (String)null, (String)null, (String)null, (Boolean)null, (Boolean)null, (Boolean)null, Boolean.valueOf(b), (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Long)null, (AccountPreferences$AcceptPrivateMessagesPolicy)null, (Boolean)null, (Boolean)null, (Boolean)null, (String)null, (Boolean)null, 4194047, (DefaultConstructorMarker)null));
    }
    
    public final ListingViewMode C3() {
        final String string = this.c.getString("listingViewMode.globalDefault", ListingViewMode.CARD.toString());
        final ListingViewMode$a companion = ListingViewMode.Companion;
        ah2.f.c((Object)string);
        companion.getClass();
        return ListingViewMode$a.b(string);
    }
    
    public final int C4() {
        return this.c.getInt("key_number_of_times_live_pill_was_shown", 0);
    }
    
    public final boolean D3(final String s) {
        final SharedPreferences c = this.c;
        final StringBuilder sb = new StringBuilder();
        sb.append("not_a_new_feature.");
        sb.append(s);
        return c.contains(sb.toString()) ^ true;
    }
    
    public final nf2.a D4(final ListingViewMode listingViewMode) {
        ah2.f.f((Object)listingViewMode, "viewMode");
        final nf2.a q = nf2.a.q((Callable)new t1(this, listingViewMode));
        ah2.f.e((Object)q, "fromCallable {\n      loc\u2026le.onNext(viewMode)\n    }");
        return o72.f.t(q, (d)this.e);
    }
    
    public final c0<Boolean> E3(final String s, final boolean b) {
        final c0 onAssembly = RxJavaPlugins.onAssembly((c0)new j((Callable)new p(s, b, 1, this)));
        ah2.f.e((Object)onAssembly, "fromCallable { localPref\u2026etBoolean(key, default) }");
        return (c0<Boolean>)u1.j1(onAssembly, (d)this.e);
    }
    
    public final Object E4(final c<? super Instant> c) {
        return mj2.g.l((CoroutineContext)this.h.c(), (zg2.p)new RedditPreferenceRepository$getSurveyLastSeenTime$2(this, (c)null), (c)c);
    }
    
    public final void F3(final String s) {
        ah2.f.f((Object)s, "featureName");
        final SharedPreferences$Editor edit = this.c.edit();
        final StringBuilder sb = new StringBuilder();
        sb.append("not_a_new_feature.");
        sb.append(s);
        edit.putBoolean(sb.toString(), true).apply();
    }
    
    public final boolean G3() {
        boolean b;
        if (this.d.isIncognito()) {
            b = this.b.b();
        }
        else {
            b = this.a.a().getOver18();
        }
        return b;
    }
    
    public final void H3() {
        final SharedPreferences$Editor edit = this.c.edit();
        ah2.f.e((Object)edit, "editor");
        edit.putInt("key_number_of_times_live_pill_was_shown", this.C4() + 1);
        edit.apply();
    }
    
    public final void I3() {
        final int int1 = this.c.getInt("opened_creator_stats_count", 0);
        final SharedPreferences$Editor edit = this.c.edit();
        ah2.f.e((Object)edit, "editor");
        edit.putInt("opened_creator_stats_count", int1 + 1);
        edit.apply();
    }
    
    public final nf2.a J3(final ThumbnailsPreference thumbnailsPreference) {
        ah2.f.f((Object)thumbnailsPreference, "pref");
        this.a.b(AccountPreferences.copy$default(this.a.a(), false, false, (String)null, false, (String)null, thumbnailsPreference.toString(), false, false, (Integer)null, false, false, false, false, false, false, false, false, false, (Long)null, (AccountPreferences$AcceptPrivateMessagesPolicy)null, false, false, false, (String)null, false, 33554399, (Object)null));
        return this.e(new AccountPreferencesPatch((Boolean)null, (Boolean)null, (String)null, (String)null, thumbnailsPreference.toString(), (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Long)null, (AccountPreferences$AcceptPrivateMessagesPolicy)null, (Boolean)null, (Boolean)null, (Boolean)null, (String)null, (Boolean)null, 4194287, (DefaultConstructorMarker)null));
    }
    
    public final nf2.a K3(final String s) {
        ah2.f.f((Object)s, "subredditId");
        return this.c("closed_trending_settings_ids", s);
    }
    
    public final void L3() {
        final SharedPreferences$Editor edit = this.c.edit();
        for (final String s : this.c.getAll().keySet()) {
            ah2.f.e((Object)s, "key");
            if (kj2.j.e2(s, "listingViewMode.", false)) {
                edit.remove(s);
            }
        }
        edit.apply();
    }
    
    public final Object M3(final String s, final String s2, final c<? super Integer> c) {
        return mj2.g.l((CoroutineContext)this.h.c(), (zg2.p)new RedditPreferenceRepository$incrementCounterpartCommunityVisitCount$2(s2, s, this, (c)null), (c)c);
    }
    
    public final c0<Boolean> N3(final String s) {
        ah2.f.f((Object)s, "subredditId");
        return this.a("closed_join_community_ids", s);
    }
    
    public final c0<CarouselCollectionState> O3(final a0$a a0$a) {
        final c0 onAssembly = RxJavaPlugins.onAssembly((c0)new j((Callable)new r1(this, a0$a)));
        ah2.f.e((Object)onAssembly, "fromCallable {\n      val\u2026tionState()\n      }\n    }");
        return (c0<CarouselCollectionState>)u1.j1(onAssembly, (d)this.e);
    }
    
    public final boolean P3() {
        return this.a.a().getAcceptPms() == AccountPreferences$AcceptPrivateMessagesPolicy.EVERYONE;
    }
    
    public final PublishSubject Q3() {
        return this.k;
    }
    
    public final nf2.a R3(final String s, final ListingViewMode listingViewMode) {
        ah2.f.f((Object)s, "listingName");
        ah2.f.f((Object)listingViewMode, "mode");
        final nf2.a q = nf2.a.q((Callable)new ov.a((Object)this, 2, (Object)s, (Object)listingViewMode));
        ah2.f.e((Object)q, "fromCallable {\n      loc\u2026(),\n      ).apply()\n    }");
        return o72.f.t(q, (d)this.e);
    }
    
    public final t<ListingViewMode> S3() {
        return (t<ListingViewMode>)n0.G0((t)this.i, this.e);
    }
    
    public final Object T3(final String s, final String s2, final c<? super Integer> c) {
        return mj2.g.l((CoroutineContext)this.h.c(), (zg2.p)new RedditPreferenceRepository$incrementSubredditVisitCount$2(s2, s, this, (c)null), (c)c);
    }
    
    public final Object U3(final c<? super AccountPreferences> c) {
        return this.g.getPreferencesSuspend(c);
    }
    
    public final ListingViewMode V3(final String s, final ListingViewMode listingViewMode) {
        ah2.f.f((Object)s, "listingName");
        ah2.f.f((Object)listingViewMode, "default");
        final String string = this.c.getString(m.l("listingViewMode.", s), listingViewMode.toString());
        final ListingViewMode$a companion = ListingViewMode.Companion;
        ah2.f.c((Object)string);
        companion.getClass();
        return ListingViewMode$a.b(string);
    }
    
    public final Object W3(final Instant instant, final c<? super pg2.j> c) {
        final Object l = mj2.g.l((CoroutineContext)this.h.c(), (zg2.p)new RedditPreferenceRepository$setSurveyLastSeenTime$2(this, instant, (c)null), (c)c);
        if (l == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return l;
        }
        return pg2.j.a;
    }
    
    public final nf2.a X3(final int n, final String s) {
        ah2.f.f((Object)s, "key");
        this.j.onNext((Object)new Pair((Object)s, (Object)n));
        final nf2.a onAssembly = RxJavaPlugins.onAssembly((nf2.a)new xf2.f((Callable)new q1(this, s, n)));
        ah2.f.e((Object)onAssembly, "fromCallable { localPref\u2026Int(key, value).apply() }");
        return o72.f.t(onAssembly, (d)this.e);
    }
    
    public final nf2.a Y3(final boolean b) {
        nf2.a a;
        if (this.d.isIncognito()) {
            a = nf2.a.q((Callable)new gt.a(this, b));
        }
        else {
            this.a.b(AccountPreferences.copy$default(this.a.a(), b, b, (String)null, false, (String)null, (String)null, false, false, (Integer)null, false, false, false, false, false, false, false, false, false, (Long)null, (AccountPreferences$AcceptPrivateMessagesPolicy)null, false, false, false, (String)null, false, 33554428, (Object)null));
            a = this.e(new AccountPreferencesPatch(Boolean.valueOf(b), Boolean.valueOf(b), (String)null, (String)null, (String)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Long)null, (AccountPreferences$AcceptPrivateMessagesPolicy)null, (Boolean)null, (Boolean)null, (Boolean)null, (String)null, (Boolean)null, 4194300, (DefaultConstructorMarker)null));
        }
        ah2.f.e((Object)a, "if (activeSession.isInco\u2026\n        ),\n      )\n    }");
        this.k.onNext((Object)new NsfwSetting(NsfwSetting.Type.OVER_18, b));
        return a;
    }
    
    public final nf2.a Z3(final boolean b) {
        this.a.b(AccountPreferences.copy$default(this.a.a(), false, false, (String)null, false, (String)null, (String)null, false, false, (Integer)null, false, false, false, b, false, false, false, false, false, (Long)null, (AccountPreferences$AcceptPrivateMessagesPolicy)null, false, false, false, (String)null, false, 33550335, (Object)null));
        return this.e(new AccountPreferencesPatch((Boolean)null, (Boolean)null, (String)null, (String)null, (String)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, Boolean.valueOf(b), (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Long)null, (AccountPreferences$AcceptPrivateMessagesPolicy)null, (Boolean)null, (Boolean)null, (Boolean)null, (String)null, (Boolean)null, 4193791, (DefaultConstructorMarker)null));
    }
    
    public final c0<Boolean> a(final String s, final String s2) {
        final c0 onAssembly = RxJavaPlugins.onAssembly((c0)new j((Callable)new q6.m(s, s2, 1, this)));
        ah2.f.e((Object)onAssembly, "fromCallable {\n      loc\u2026ins(value) ?: false\n    }");
        return (c0<Boolean>)u1.j1(onAssembly, (d)this.e);
    }
    
    public final nf2.a a4(final String s) {
        ah2.f.f((Object)s, "subredditId");
        return this.c("closed_join_community_ids", s);
    }
    
    public final t b() {
        final t map = ((t)this.j).filter((q)new com.reddit.data.repository.c("streaming_feature_stream_entry_view_mode_compact", 3)).map((o)new d1(5));
        ah2.f.e((Object)map, "preferencesSubject\n     \u2026\n      .map { it.second }");
        final t ofType = map.ofType((Class)Boolean.class);
        ah2.f.b((Object)ofType, "ofType(R::class.java)");
        final t startWith = ofType.startWith((Object)this.c.getBoolean("streaming_feature_stream_entry_view_mode_compact", false));
        ah2.f.e((Object)startWith, "preferencesSubject\n     \u2026getBoolean(key, default))");
        return startWith;
    }
    
    public final nf2.a b4(final String s) {
        ah2.f.f((Object)s, "country");
        nf2.a a;
        if (!ah2.f.a((Object)this.a.getUsername(), (Object)"*") && !ah2.f.a((Object)this.a.getUsername(), (Object)"#incognito")) {
            final nf2.a q = nf2.a.q((Callable)new q6.j(this, s, 7));
            ah2.f.e((Object)q, "fromCallable {\n        l\u2026         .apply()\n      }");
            a = o72.f.t(q, (d)this.e);
        }
        else {
            a = nf2.a.h();
            ah2.f.e((Object)a, "{\n      Completable.complete()\n    }");
        }
        return a;
    }
    
    public final nf2.a c(final String s, final String s2) {
        final nf2.a onAssembly = RxJavaPlugins.onAssembly((nf2.a)new e((sf2.a)new o1(this, s, s2)));
        ah2.f.e((Object)onAssembly, "fromAction {\n      local\u2026   .apply()\n      }\n    }");
        return o72.f.t(onAssembly, (d)this.e);
    }
    
    public final boolean c4() {
        return this.a.a().getEmailUnsubscribeAll();
    }
    
    public final void d(final boolean b) {
        if (this.d.isIncognito()) {
            this.b.a(b);
        }
        else {
            androidx.viewpager.widget.c.p(this.c, "blurNsfw", b);
        }
        this.k.onNext((Object)new NsfwSetting(NsfwSetting.Type.BLUR, b));
    }
    
    public final nf2.a d4(final String s, final boolean b) {
        this.j.onNext((Object)new Pair((Object)s, (Object)b));
        final nf2.a onAssembly = RxJavaPlugins.onAssembly((nf2.a)new xf2.f((Callable)new g1(this, 1, s, b)));
        ah2.f.e((Object)onAssembly, "fromCallable { localPref\u2026ean(key, value).apply() }");
        return o72.f.t(onAssembly, (d)this.e);
    }
    
    public final nf2.a e(final AccountPreferencesPatch accountPreferencesPatch) {
        nf2.a a;
        if (!ah2.f.a((Object)this.a.getUsername(), (Object)"*") && !ah2.f.a((Object)this.a.getUsername(), (Object)"#incognito")) {
            final c0 w = this.g.patchPreferences(accountPreferencesPatch).w((o)new g60.o(this, 3));
            w.getClass();
            a = RxJavaPlugins.onAssembly((nf2.a)new h((g0)w));
        }
        else {
            a = nf2.a.h();
        }
        ah2.f.e((Object)a, "if (settings.username ==\u2026   .ignoreElement()\n    }");
        return o72.f.t(a, (d)this.e);
    }
    
    public final String e4() {
        return this.a.a().getCountryCode();
    }
    
    public final boolean f4() {
        return this.c.getBoolean("streaming_feature_stream_entry_view_mode_compact", false);
    }
    
    public final boolean g4() {
        final SharedPreferences c = this.c;
        boolean b = false;
        if (c.getInt("opened_creator_stats_count", 0) >= 2) {
            b = true;
        }
        return b;
    }
    
    public final boolean h4() {
        return this.a.a().getEmailDigestsEnabled();
    }
    
    public final c0<Boolean> i4(final String s) {
        ah2.f.f((Object)s, "subredditId");
        return this.a("closed_trending_settings_ids", s);
    }
    
    public final boolean j4() {
        return this.a.a().getEnableFollowers();
    }
    
    public final c0<Boolean> k4(final String s) {
        ah2.f.f((Object)s, "subredditId");
        return this.a("closed_join_counterpart_community_ids", s);
    }
    
    public final Object l4(final boolean b, final c<? super pg2.j> c) {
        final Object l = mj2.g.l((CoroutineContext)this.h.c(), (zg2.p)new RedditPreferenceRepository$setEnableFollowers$2(this, b, (c)null), (c)c);
        if (l == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return l;
        }
        return pg2.j.a;
    }
    
    public final c0<CommentSortType> m4() {
        final c0 u = c0.u((Callable)new s1(this));
        ah2.f.e((Object)u, "fromCallable {\n      val\u2026SortType.CONFIDENCE\n    }");
        return (c0<CommentSortType>)u1.j1(u, (d)this.e);
    }
    
    public final int n4(final int n, final String s) {
        ah2.f.f((Object)s, "key");
        return this.c.getInt(s, n);
    }
    
    public final Object o4(final boolean b, final c<? super pg2.j> c) {
        final Object l = mj2.g.l((CoroutineContext)this.h.c(), (zg2.p)new RedditPreferenceRepository$setAllowPrivateMessages$2(b, this, (c)null), (c)c);
        if (l == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return l;
        }
        return pg2.j.a;
    }
    
    public final AccountPreferences$AcceptPrivateMessagesPolicy p4() {
        return this.a.a().getAcceptPms();
    }
    
    public final Object q4(final String s, final String s2, final c<? super Long> c) {
        return mj2.g.l((CoroutineContext)this.h.c(), (zg2.p)new RedditPreferenceRepository$saveLastSubredditVisitTime$2(s2, s, this, (c)null), (c)c);
    }
    
    public final nf2.a r4() {
        final nf2.a onAssembly = RxJavaPlugins.onAssembly((nf2.a)new xf2.f((Callable)new p1(this)));
        ah2.f.e((Object)onAssembly, "fromCallable {\n      loc\u2026SEEN, seen).apply()\n    }");
        return o72.f.t(onAssembly, (d)this.e);
    }
    
    public final Object s4(final boolean b, final c<? super pg2.j> c) {
        final Object l = mj2.g.l((CoroutineContext)this.h.c(), (zg2.p)new RedditPreferenceRepository$setShowPresence$2(this, b, (c)null), (c)c);
        if (l == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return l;
        }
        return pg2.j.a;
    }
    
    public final Object t4(final String s, final c<? super pg2.j> c) {
        final Object l = mj2.g.l((CoroutineContext)this.h.c(), (zg2.p)new RedditPreferenceRepository$setCountryCode$2(this, s, (c)null), (c)c);
        if (l == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return l;
        }
        return pg2.j.a;
    }
    
    public final nf2.a u4(final String s) {
        ah2.f.f((Object)s, "subredditId");
        return this.c("closed_join_counterpart_community_ids", s);
    }
    
    public final boolean v3() {
        boolean b;
        if (this.d.isIncognito()) {
            b = this.b.d();
        }
        else {
            b = this.c.getBoolean("blurNsfw", this.f.j());
        }
        return b;
    }
    
    public final boolean v4() {
        final SharedPreferences c = this.c;
        boolean b = false;
        if (c.getInt("opened_my_reddit_count", 0) > 3) {
            b = true;
        }
        return b;
    }
    
    public final GeopopularRegionSelectFilter w3() {
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
            final y a = z10.e.a;
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
                fromJson = z10.e.a.a((Class)GeopopularRegionSelectFilter.class).fromJson(s);
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
    
    public final nf2.a w4() {
        final nf2.a k = this.g.getPreferences().w((o)new g60.p(this, 3)).K();
        ah2.f.e((Object)k, "remoteAccountPreferenceD\u2026 }\n      .toCompletable()");
        return o72.f.t(k, (d)this.e);
    }
    
    public final nf2.a x3(final CommentSortType commentSortType) {
        ah2.f.f((Object)commentSortType, "sort");
        this.a.b(AccountPreferences.copy$default(this.a.a(), false, false, (String)null, false, commentSortType.toString(), (String)null, false, false, (Integer)null, false, false, false, false, false, false, false, false, false, (Long)null, (AccountPreferences$AcceptPrivateMessagesPolicy)null, false, false, false, (String)null, false, 33554415, (Object)null));
        return this.e(new AccountPreferencesPatch((Boolean)null, (Boolean)null, (String)null, commentSortType.toString(), (String)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Long)null, (AccountPreferences$AcceptPrivateMessagesPolicy)null, (Boolean)null, (Boolean)null, (Boolean)null, (String)null, (Boolean)null, 4194295, (DefaultConstructorMarker)null));
    }
    
    public final int x4() {
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
    
    public final ThumbnailsPreference y3() {
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
    
    public final nf2.a y4(final GeopopularRegionSelectFilter geopopularRegionSelectFilter) {
        ah2.f.f((Object)geopopularRegionSelectFilter, "filter");
        nf2.a a;
        if (!ah2.f.a((Object)this.a.getUsername(), (Object)"*") && !ah2.f.a((Object)this.a.getUsername(), (Object)"#incognito")) {
            final nf2.a q = nf2.a.q((Callable)new q6.j(6, this, geopopularRegionSelectFilter));
            ah2.f.e((Object)q, "fromCallable {\n        s\u2026         .apply()\n      }");
            a = o72.f.t(q, (d)this.e);
        }
        else {
            a = nf2.a.h();
            ah2.f.e((Object)a, "{\n      Completable.complete()\n    }");
        }
        return a;
    }
    
    public final Object z3(final AccountPreferences$AcceptPrivateMessagesPolicy accountPreferences$AcceptPrivateMessagesPolicy, final c<? super pg2.j> c) {
        final Object l = mj2.g.l((CoroutineContext)this.h.c(), (zg2.p)new RedditPreferenceRepository$setAllowPrivateMessagesOption$2(this, accountPreferences$AcceptPrivateMessagesPolicy, (c)null), (c)c);
        if (l == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return l;
        }
        return pg2.j.a;
    }
    
    public final String z4() {
        final String e4 = this.e4();
        final int hashCode = e4.hashCode();
        if (hashCode != 2816) {
            if (hashCode != 2818) {
                if (hashCode != 2880) {
                    return LocaleUtils.INSTANCE.getCountryByCountryCode(e4);
                }
                if (!e4.equals("ZZ")) {
                    return LocaleUtils.INSTANCE.getCountryByCountryCode(e4);
                }
            }
            else if (!e4.equals("XZ")) {
                return LocaleUtils.INSTANCE.getCountryByCountryCode(e4);
            }
            return "No Country Indentified";
        }
        if (e4.equals("XX")) {
            return "Other Country (Unknown)";
        }
        return LocaleUtils.INSTANCE.getCountryByCountryCode(e4);
    }
}
