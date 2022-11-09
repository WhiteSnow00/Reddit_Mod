// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.local;

import com.reddit.data.room.model.SubredditTriggeredInviteDataModel;
import nf2.g0;
import io.reactivex.internal.operators.single.SingleFlatMap;
import com.reddit.domain.model.UpdateSubredditTitleSafetyDto;
import c50.a1;
import java.util.Iterator;
import com.reddit.domain.model.SubredditListItem;
import qg2.m;
import com.reddit.domain.model.SubredditTriggeredInvite;
import c50.h1;
import i60.v;
import i60.x;
import c50.i1;
import q6.k;
import c50.a0;
import c50.f1;
import c50.b1;
import c50.c1;
import kotlinx.coroutines.flow.CancellableFlowImpl;
import pj2.e;
import java.util.ArrayList;
import java.io.InputStream;
import zg2.l;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.io.Closeable;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Set;
import c50.g1;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import tg2.c;
import c50.e1;
import q6.j;
import java.util.concurrent.Callable;
import nf2.c0;
import java.util.Collection;
import c50.z0;
import nf2.t;
import io.reactivex.plugins.RxJavaPlugins;
import sf2.o;
import c50.d1;
import nf2.n;
import com.squareup.moshi.JsonAdapter;
import i60.u;
import i60.p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import com.reddit.domain.model.SubredditCountrySiteSettings;
import java.util.List;
import com.reddit.notification.common.NotificationLevel;
import com.reddit.domain.model.Subreddit;
import j60.d;
import javax.inject.Inject;
import kotlin.a;
import pg2.f;
import com.reddit.structuredstyles.model.StructuredStyle;
import j0.g;
import db0.r;
import h60.v1;
import h60.n1;
import h60.x1;
import h60.k0;
import h60.t1;
import h60.u0;
import h60.f2;
import android.content.Context;
import com.squareup.moshi.y;
import gc0.b;

public final class RedditLocalSubredditDataSource implements gc0.b
{
    public final y a;
    public final Context b;
    public final f2 c;
    public final u0 d;
    public final t1 e;
    public final k0 f;
    public final x1 g;
    public final n1 h;
    public final v1 i;
    public final r j;
    public final g<String, StructuredStyle> k;
    public final f l;
    public final f m;
    public final f n;
    public final f o;
    public final f p;
    
    @Inject
    public RedditLocalSubredditDataSource(final y a, final Context b, final f2 c, final u0 d, final t1 e, final k0 f, final x1 g, final n1 h, final v1 i, final r j) {
        ah2.f.f((Object)a, "moshi");
        ah2.f.f((Object)b, "context");
        ah2.f.f((Object)c, "userSubredditDao");
        ah2.f.f((Object)d, "subredditDao");
        ah2.f.f((Object)e, "subredditMutationsDao");
        ah2.f.f((Object)f, "recentSubredditDao");
        ah2.f.f((Object)g, "triggeredInviteDao");
        ah2.f.f((Object)h, "subredditExtraDao");
        ah2.f.f((Object)i, "subredditPinnedPostsDao");
        ah2.f.f((Object)j, "mainActivityFeatures");
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
        this.k = (g<String, StructuredStyle>)new g(100);
        this.l = kotlin.a.b((zg2.a)new RedditLocalSubredditDataSource$richTextAdapter.RedditLocalSubredditDataSource$richTextAdapter$2(this));
        this.m = kotlin.a.b((zg2.a)new RedditLocalSubredditDataSource$subredditListingDir.RedditLocalSubredditDataSource$subredditListingDir$2(this));
        this.n = kotlin.a.b((zg2.a)new RedditLocalSubredditDataSource$jsonAdapter.RedditLocalSubredditDataSource$jsonAdapter$2(this));
        this.o = kotlin.a.b((zg2.a)new RedditLocalSubredditDataSource$mediaInCommentTypeJsonAdapter.RedditLocalSubredditDataSource$mediaInCommentTypeJsonAdapter$2(this));
        this.p = kotlin.a.b((zg2.a)new RedditLocalSubredditDataSource$subredditListingPersister.RedditLocalSubredditDataSource$subredditListingPersister$2(this));
    }
    
    public static Subreddit T(final d d) {
        final p a = d.a;
        return new Subreddit(a.a, a.b, a.c, a.d, a.e, a.f, a.m, (String)null, a.g, (String)null, a.h, Long.valueOf(a.k), a.l, a.q, a.o, a.j, Boolean.valueOf(a.n), (Boolean)null, (String)null, (Boolean)null, (Boolean)null, a.u, a.v, (String)null, (String)null, (String)null, false, a.B, a.C, a.G, (Boolean)null, a.x, a.y, a.D, a.E, a.F, (Boolean)null, (Boolean)null, a.z, (Boolean)null, (Boolean)null, (NotificationLevel)null, (String)null, a.A, (String)null, (String)null, (Boolean)null, (Boolean)null, (Boolean)null, (String)null, (String)null, (String)null, (String)null, (List)null, (Boolean)null, (Boolean)null, a.t, (String)null, (Boolean)null, (Boolean)null, (List)null, (String)null, (String)null, (SubredditCountrySiteSettings)null, (Boolean)null, (List)null, (Boolean)null, ah2.f.a((Object)a.H, (Object)Boolean.TRUE), 1201537664, -16779344, 7, (DefaultConstructorMarker)null);
    }
    
    public static u V(final RedditLocalSubredditDataSource redditLocalSubredditDataSource, final Subreddit subreddit, boolean b, boolean b2, final int n) {
        boolean booleanValue = false;
        if ((n & 0x1) != 0x0) {
            b = false;
        }
        if ((n & 0x2) != 0x0) {
            b2 = false;
        }
        redditLocalSubredditDataSource.getClass();
        final String id = subreddit.getId();
        final String kindWithId = subreddit.getKindWithId();
        final String displayName = subreddit.getDisplayName();
        final String displayNamePrefixed = subreddit.getDisplayNamePrefixed();
        final String iconImg = subreddit.getIconImg();
        String keyColor = subreddit.getKeyColor();
        if (keyColor == null) {
            keyColor = "";
        }
        final String bannerImg = subreddit.getBannerImg();
        final String title = subreddit.getTitle();
        String description = subreddit.getDescription();
        if (description == null) {
            description = "";
        }
        final String descriptionRtJson = subreddit.getDescriptionRtJson();
        final String publicDescription = subreddit.getPublicDescription();
        final Long subscribers = subreddit.getSubscribers();
        long longValue;
        if (subscribers != null) {
            longValue = subscribers;
        }
        else {
            longValue = 0L;
        }
        final Long accountsActive = subreddit.getAccountsActive();
        final long createdUtc = subreddit.getCreatedUtc();
        final String subredditType = subreddit.getSubredditType();
        final String url = subreddit.getUrl();
        final Boolean over18 = subreddit.getOver18();
        if (over18 != null) {
            booleanValue = over18;
        }
        final Boolean wikiEnabled = subreddit.getWikiEnabled();
        final String whitelistStatus = subreddit.getWhitelistStatus();
        final Boolean newModMailEnabled = subreddit.getNewModMailEnabled();
        final Boolean restrictPosting = subreddit.getRestrictPosting();
        final Boolean userIsBanned = subreddit.getUserIsBanned();
        final Boolean userIsSubscriber = subreddit.getUserIsSubscriber();
        final Boolean userIsContributor = subreddit.getUserIsContributor();
        final Boolean userIsModerator = subreddit.getUserIsModerator();
        final Boolean userHasFavorited = subreddit.getUserHasFavorited();
        final NotificationLevel notificationLevel = subreddit.getNotificationLevel();
        final String submitType = subreddit.getSubmitType();
        final Boolean allowImages = subreddit.getAllowImages();
        final Boolean allowVideos = subreddit.getAllowVideos();
        final Boolean allowGifs = subreddit.getAllowGifs();
        final Boolean allowChatPostCreation = subreddit.getAllowChatPostCreation();
        final Boolean chatPostFeatureEnabled = subreddit.isChatPostFeatureEnabled();
        final Boolean spoilersEnabled = subreddit.getSpoilersEnabled();
        final String primaryColorKey = subreddit.getPrimaryColorKey();
        final String communityIconUrl = subreddit.getCommunityIconUrl();
        final String bannerBackgroundImageUrl = subreddit.getBannerBackgroundImageUrl();
        final String mobileBannerImageUrl = subreddit.getMobileBannerImageUrl();
        final String userFlairTemplateId = subreddit.getUserFlairTemplateId();
        final Boolean userSubredditFlairEnabled = subreddit.getUserSubredditFlairEnabled();
        final Boolean canAssignUserFlair = subreddit.getCanAssignUserFlair();
        final Boolean userFlairEnabled = subreddit.getUserFlairEnabled();
        final String userFlairBackgroundColor = subreddit.getUserFlairBackgroundColor();
        final String userFlairTextColor = subreddit.getUserFlairTextColor();
        final String userFlairText = subreddit.getUserFlairText();
        final List user_flair_richtext = subreddit.getUser_flair_richtext();
        String json;
        if (user_flair_richtext != null) {
            final Object value = redditLocalSubredditDataSource.l.getValue();
            ah2.f.e(value, "<get-richTextAdapter>(...)");
            json = ((JsonAdapter)value).toJson((Object)user_flair_richtext);
        }
        else {
            json = null;
        }
        final Boolean postFlairEnabled = subreddit.getPostFlairEnabled();
        final Boolean canAssignLinkFlair = subreddit.getCanAssignLinkFlair();
        final String contentCategory = subreddit.getContentCategory();
        final Boolean quarantined = subreddit.getQuarantined();
        final String quarantineMessage = subreddit.getQuarantineMessage();
        final String quarantineMessageRtJson = subreddit.getQuarantineMessageRtJson();
        final Boolean allowPolls = subreddit.getAllowPolls();
        final Boolean allowPredictions = subreddit.getAllowPredictions();
        final String predictionLeaderboardEntryType = subreddit.getPredictionLeaderboardEntryType();
        final Boolean allowPredictionsTournament = subreddit.getAllowPredictionsTournament();
        final Boolean shouldShowMediaInCommentsSetting = subreddit.getShouldShowMediaInCommentsSetting();
        final Object value2 = redditLocalSubredditDataSource.o.getValue();
        ah2.f.e(value2, "<get-mediaInCommentTypeJsonAdapter>(...)");
        return new u(id, kindWithId, displayName, displayNamePrefixed, iconImg, keyColor, bannerImg, null, title, description, descriptionRtJson, publicDescription, null, null, longValue, accountsActive, createdUtc, subredditType, url, booleanValue, wikiEnabled, whitelistStatus, newModMailEnabled, restrictPosting, submitType, allowImages, allowVideos, allowGifs, allowChatPostCreation, chatPostFeatureEnabled, spoilersEnabled, userIsBanned, userIsSubscriber, userIsContributor, userIsModerator, userHasFavorited, notificationLevel, System.currentTimeMillis(), primaryColorKey, communityIconUrl, bannerBackgroundImageUrl, mobileBannerImageUrl, b, userFlairTemplateId, userSubredditFlairEnabled, canAssignUserFlair, userFlairEnabled, userFlairBackgroundColor, userFlairTextColor, userFlairText, json, postFlairEnabled, canAssignLinkFlair, null, null, contentCategory, quarantined, quarantineMessage, null, quarantineMessageRtJson, allowPolls, allowPredictions, predictionLeaderboardEntryType, allowPredictionsTournament, shouldShowMediaInCommentsSetting, ((JsonAdapter)value2).toJson((Object)subreddit.getAllowedMediaInComments()), b2, subreddit.isMyReddit());
    }
    
    public final n<List<Subreddit>> A() {
        final n q = this.d.Q(false);
        final d1 d1 = new d1(this, 1);
        q.getClass();
        final n onAssembly = RxJavaPlugins.onAssembly((n)new io.reactivex.internal.operators.maybe.a((nf2.r)q, (o)d1));
        ah2.f.e((Object)onAssembly, "subredditDao.findSubredd\u2026t.fromDataModel() }\n    }");
        return (n<List<Subreddit>>)onAssembly;
    }
    
    public final t<List<Subreddit>> B() {
        final t map = this.d.C0(false).map((o)new z0(this, 1));
        ah2.f.e((Object)map, "subredditDao.observeSubr\u2026t.fromDataModel() }\n    }");
        return (t<List<Subreddit>>)map;
    }
    
    public final c0<Boolean> C(final Collection<Subreddit> collection) {
        ah2.f.f((Object)collection, "subreddits");
        final c0 u = c0.u((Callable)new q6.g(2, this, collection));
        ah2.f.e((Object)u, "fromCallable {\n      sub\u2026\n      )\n      true\n    }");
        return (c0<Boolean>)u;
    }
    
    public final c0<Boolean> D(final Subreddit subreddit) {
        ah2.f.f((Object)subreddit, "subreddit");
        final c0 u = c0.u((Callable)new j(5, this, subreddit));
        ah2.f.e((Object)u, "fromCallable {\n      sub\u2026Model())\n      true\n    }");
        return (c0<Boolean>)u;
    }
    
    public final c0<Boolean> E(final String s, final NotificationLevel notificationLevel) {
        ah2.f.f((Object)s, "subredditName");
        ah2.f.f((Object)notificationLevel, "notificationLevel");
        final c0 c = this.d.Y0(s, notificationLevel).C((Object)Boolean.TRUE);
        ah2.f.e((Object)c, "subredditDao.setNotifica\u2026  ).toSingleDefault(true)");
        return (c0<Boolean>)c;
    }
    
    public final c0<List<Subreddit>> F(final int n) {
        final c0 w = this.f.b0(n).w((o)new e1(this, 1));
        ah2.f.e((Object)w, "recentSubredditDao.findF\u2026t.fromDataModel() }\n    }");
        return (c0<List<Subreddit>>)w;
    }
    
    public final Object G(final List<String> list, final tg2.c<? super List<Subreddit>> c) {
        RedditLocalSubredditDataSource$getSubreddits.RedditLocalSubredditDataSource$getSubreddits$1 redditLocalSubredditDataSource$getSubreddits$2 = null;
        Label_0052: {
            if (c instanceof RedditLocalSubredditDataSource$getSubreddits.RedditLocalSubredditDataSource$getSubreddits$1) {
                final RedditLocalSubredditDataSource$getSubreddits.RedditLocalSubredditDataSource$getSubreddits$1 redditLocalSubredditDataSource$getSubreddits$1 = (RedditLocalSubredditDataSource$getSubreddits.RedditLocalSubredditDataSource$getSubreddits$1)c;
                final int label = redditLocalSubredditDataSource$getSubreddits$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditLocalSubredditDataSource$getSubreddits$1.label = label + Integer.MIN_VALUE;
                    redditLocalSubredditDataSource$getSubreddits$2 = redditLocalSubredditDataSource$getSubreddits$1;
                    break Label_0052;
                }
            }
            redditLocalSubredditDataSource$getSubreddits$2 = new RedditLocalSubredditDataSource$getSubreddits.RedditLocalSubredditDataSource$getSubreddits$1(this, (tg2.c)c);
        }
        final Object result = redditLocalSubredditDataSource$getSubreddits$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = redditLocalSubredditDataSource$getSubreddits$2.label;
        Object b;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aj2.c.Q0(result);
            b = result;
        }
        else {
            aj2.c.Q0(result);
            final n<List<j60.f>> t1 = this.d.T1(list, false);
            final z0 z0 = new z0(this, 0);
            t1.getClass();
            final c0 z2 = RxJavaPlugins.onAssembly((n)new io.reactivex.internal.operators.maybe.a((nf2.r)t1, (o)z0)).z((Object)EmptyList.INSTANCE);
            ah2.f.e((Object)z2, "subredditDao.findByDispl\u2026   .toSingle(emptyList())");
            redditLocalSubredditDataSource$getSubreddits$2.label = 1;
            if ((b = kotlinx.coroutines.rx2.d.b(z2, (tg2.c)redditLocalSubredditDataSource$getSubreddits$2)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        ah2.f.e(b, "subredditDao.findByDispl\u2026ptyList())\n      .await()");
        return b;
    }
    
    public final c0<Boolean> H(final Collection<Subreddit> collection, final boolean b) {
        ah2.f.f((Object)collection, "subreddits");
        final c0 onAssembly = RxJavaPlugins.onAssembly((c0)new cg2.j((Callable)new g1(this, 0, collection, b)));
        ah2.f.e((Object)onAssembly, "fromCallable {\n      sub\u2026\n      )\n      true\n    }");
        return (c0<Boolean>)onAssembly;
    }
    
    public final c0 I(final Collection collection) {
        ah2.f.f((Object)collection, "subreddits");
        final c0 onAssembly = RxJavaPlugins.onAssembly((c0)new cg2.j((Callable)new j(4, this, collection)));
        ah2.f.e((Object)onAssembly, "fromCallable {\n      sub\u2026\n      )\n      true\n    }");
        return onAssembly;
    }
    
    public final Set J() {
        final InputStream openRawResource = this.b.getResources().openRawResource(2131886147);
        ah2.f.e((Object)openRawResource, "context.resources.openRa\u2026R.raw.support_subreddits)");
        final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(openRawResource, kj2.a.b));
        try {
            final ArrayList a = kotlin.io.a.a(bufferedReader);
            n02.r.o((Closeable)bufferedReader, (Throwable)null);
            return CollectionsKt___CollectionsKt.l2((Iterable)kotlin.text.b.E2((CharSequence)CollectionsKt___CollectionsKt.y1((Iterable)a, (CharSequence)null, (String)null, (String)null, (l)null, 63), new String[] { "," }));
        }
        finally {
            try {}
            finally {
                final Throwable t;
                n02.r.o((Closeable)bufferedReader, t);
            }
        }
    }
    
    public final e K() {
        Object b;
        if (this.j.q9()) {
            Object y0 = this.d.y0();
            if (!(y0 instanceof pj2.a)) {
                y0 = new CancellableFlowImpl((e)y0);
            }
            b = new RedditLocalSubredditDataSource$observeFollowingSubredditListItems$$inlined$map$1(pj2.u.B((e)y0));
        }
        else {
            final t map = this.d.D0(true).map((o)new c1(this, 0));
            ah2.f.e((Object)map, "subredditDao.observeSubr\u2026edditListItem() }\n      }");
            b = kotlinx.coroutines.rx2.e.b(map);
        }
        return (e)b;
    }
    
    public final n<List<Subreddit>> L(final String s) {
        ah2.f.f((Object)s, "path");
        final b b = new b(s);
        final f b2 = kotlin.a.b((zg2.a)new RedditLocalSubredditDataSource$getSubredditListing.RedditLocalSubredditDataSource$getSubredditListing$1(this));
        final Object value = this.n.getValue();
        ah2.f.e(value, "<get-jsonAdapter>(...)");
        final JsonAdapter jsonAdapter = (JsonAdapter)value;
        final n c = ((tt.d)b2.getValue()).c((Object)b);
        final qw.b b3 = new qw.b((Object)jsonAdapter, 9);
        c.getClass();
        final n onAssembly = RxJavaPlugins.onAssembly((n)new io.reactivex.internal.operators.maybe.a((nf2.r)c, (o)b3));
        onAssembly.getClass();
        final n onAssembly2 = RxJavaPlugins.onAssembly((n)new zf2.o((nf2.r)onAssembly));
        ah2.f.e((Object)onAssembly2, "persister.value.read(key\u2026)!!\n  }.onErrorComplete()");
        return (n<List<Subreddit>>)onAssembly2;
    }
    
    public final n<List<Subreddit>> M() {
        final n z = this.d.z(false);
        final b1 b1 = new b1(this, 1);
        z.getClass();
        final n onAssembly = RxJavaPlugins.onAssembly((n)new io.reactivex.internal.operators.maybe.a((nf2.r)z, (o)b1));
        ah2.f.e((Object)onAssembly, "subredditDao.findSubredd\u2026t.fromDataModel() }\n    }");
        return (n<List<Subreddit>>)onAssembly;
    }
    
    public final c0<Boolean> N(final Collection<Subreddit> collection, final boolean b) {
        ah2.f.f((Object)collection, "subreddits");
        final c0 onAssembly = RxJavaPlugins.onAssembly((c0)new cg2.j((Callable)new f1(this, collection, b)));
        ah2.f.e((Object)onAssembly, "fromCallable {\n      sub\u2026\n      )\n      true\n    }");
        return (c0<Boolean>)onAssembly;
    }
    
    public final c0<Boolean> O(final String s) {
        ah2.f.f((Object)s, "subredditName");
        final c0 w = this.d.k0(s, true).w((o)new a0(1));
        ah2.f.e((Object)w, "subredditDao.setSubscrib\u2026edditName).map { it > 0 }");
        return (c0<Boolean>)w;
    }
    
    public final c0<Boolean> P(final Subreddit subreddit) {
        ah2.f.f((Object)subreddit, "subreddit");
        final c0 u = c0.u((Callable)new k(7, this, subreddit));
        ah2.f.e((Object)u, "fromCallable {\n      rec\u2026Model())\n      true\n    }");
        return (c0<Boolean>)u;
    }
    
    public final nf2.a Q(final String s, final ArrayList list) {
        ah2.f.f((Object)s, "subredditId");
        final nf2.a onAssembly = RxJavaPlugins.onAssembly((nf2.a)new xf2.e((sf2.a)new i1(this, 0, s, list)));
        ah2.f.e((Object)onAssembly, "fromAction {\n      subre\u2026itId, pinnedPosts))\n    }");
        return onAssembly;
    }
    
    public final n<List<String>> R(final String s) {
        ah2.f.f((Object)s, "subredditId");
        final n p = this.i.b(s).p((o)new c50.y(1));
        ah2.f.e((Object)p, "subredditPinnedPostsDao.\u2026d).map { it.pinnedPosts }");
        return (n<List<String>>)p;
    }
    
    public final t<List<Subreddit>> S() {
        final t map = this.d.u(false).map((o)new c1(this, 4));
        ah2.f.e((Object)map, "subredditDao.observeSubr\u2026t.fromDataModel() }\n    }");
        return (t<List<Subreddit>>)map;
    }
    
    public final Subreddit U(final j60.f f) {
        final u a = f.a;
        final x b = f.b;
        final v c = f.c;
        final String a2 = a.a;
        final String b2 = a.b;
        final String c2 = a.c;
        final String d = a.d;
        final String e = a.e;
        final String f2 = a.f;
        final String g = a.g;
        final String i = a.i;
        final String j = a.j;
        final String k = a.k;
        final String l = a.l;
        final long o = a.o;
        final Long p = a.p;
        final long q = a.q;
        final String r = a.r;
        final String s = a.s;
        final boolean t = a.t;
        final Boolean u = a.u;
        final String v = a.v;
        final Boolean w = a.w;
        final Boolean x = a.x;
        final Boolean f3 = a.F;
        final Boolean g2 = a.G;
        final Boolean h = a.H;
        final Boolean m = a.I;
        final Boolean j2 = a.J;
        final NotificationLevel k2 = a.K;
        final String y = a.y;
        final Boolean z = a.z;
        final Boolean a3 = a.A;
        final Boolean b3 = a.B;
        final Boolean c3 = a.C;
        final Boolean d2 = a.D;
        final Boolean e2 = a.E;
        final String m2 = a.M;
        final String n = a.N;
        final String o2 = a.O;
        final String p2 = a.P;
        final String r2 = a.R;
        final Boolean s2 = a.S;
        final Boolean t2 = a.T;
        final Boolean u2 = a.U;
        final String v2 = a.V;
        final String w2 = a.W;
        final String x2 = a.X;
        final Boolean z2 = a.Z;
        final Boolean a4 = a.a0;
        final String d3 = a.d0;
        final Boolean e3 = a.e0;
        final String f4 = a.f0;
        final String h2 = a.h0;
        final boolean b4 = b != null && ah2.f.a((Object)b.b, (Object)Boolean.TRUE);
        final Boolean i2 = a.i0;
        final Boolean j3 = a.j0;
        final String k3 = a.k0;
        final Boolean l2 = a.l0;
        final List list = null;
        Boolean b5;
        if (c != null) {
            b5 = c.b;
        }
        else {
            b5 = null;
        }
        final Boolean m3 = a.m0;
        final Boolean p3 = a.p0;
        final Subreddit subreddit = new Subreddit(a2, b2, c2, d, e, f2, g, i, j, k, l, Long.valueOf(o), p, q, r, s, Boolean.valueOf(t), u, v, w, x, e3, f4, h2, (String)null, (String)null, b4, y, z, a3, b3, c3, d2, e2, i2, j3, f3, h, m, g2, j2, k2, m2, n, o2, p2, u2, t2, s2, r2, v2, w2, x2, (List)null, z2, a4, d3, k3, l2, (Boolean)null, (List)null, (String)null, (String)null, (SubredditCountrySiteSettings)null, m3, (List)null, b5, p3 != null && p3, 50331648, -132120576, 2, (DefaultConstructorMarker)null);
        subreddit.setStructuredStyle((StructuredStyle)this.k.get((Object)subreddit.getId()));
        final String y2 = a.Y;
        List user_flair_richtext;
        if (y2 != null) {
            final Object value = this.l.getValue();
            ah2.f.e(value, "<get-richTextAdapter>(...)");
            user_flair_richtext = (List)((JsonAdapter)value).fromJson(y2);
        }
        else {
            user_flair_richtext = null;
        }
        subreddit.setUser_flair_richtext(user_flair_richtext);
        final String n2 = a.n0;
        List allowedMediaInComments = list;
        if (n2 != null) {
            final Object value2 = this.o.getValue();
            ah2.f.e(value2, "<get-mediaInCommentTypeJsonAdapter>(...)");
            allowedMediaInComments = (List)((JsonAdapter)value2).fromJson(n2);
        }
        subreddit.setAllowedMediaInComments(allowedMediaInComments);
        final pg2.j a5 = pg2.j.a;
        return subreddit;
    }
    
    public final nf2.a a(final String s) {
        ah2.f.f((Object)s, "subredditId");
        final nf2.a q = nf2.a.q((Callable)new k(8, this, s));
        ah2.f.e((Object)q, "fromCallable {\n      sub\u2026(subredditId, true)\n    }");
        return q;
    }
    
    public final nf2.a b(final String s) {
        ah2.f.f((Object)s, "subredditName");
        final nf2.a l = this.g.b(s).l((o)new z0(this, 3));
        ah2.f.e((Object)l, "triggeredInviteDao.get(s\u2026.ACCEPTED))\n      }\n    }");
        return l;
    }
    
    public final nf2.a c(final String s) {
        ah2.f.f((Object)s, "subredditName");
        final nf2.a l = this.g.b(s).l((o)new z0(this, 2));
        ah2.f.e((Object)l, "triggeredInviteDao.get(s\u2026.REJECTED))\n      }\n    }");
        return l;
    }
    
    public final nf2.a d(final String s) {
        ah2.f.f((Object)s, "kindWithId");
        return this.f.O0(s);
    }
    
    public final c0<List<Subreddit>> e() {
        final c0 w = this.f.Z().w((o)new c1(this, 2));
        ah2.f.e((Object)w, "recentSubredditDao.findA\u2026t.fromDataModel() }\n    }");
        return (c0<List<Subreddit>>)w;
    }
    
    public final nf2.a f(final String s) {
        ah2.f.f((Object)s, "subredditName");
        final nf2.a p = nf2.a.p((sf2.a)new h1(0, this, s));
        ah2.f.e((Object)p, "fromAction {\n      trigg\u2026edditName),\n      )\n    }");
        return p;
    }
    
    public final nf2.a g() {
        return this.f.c();
    }
    
    public final n<List<SubredditTriggeredInvite>> h() {
        final n p = this.g.getAll().p((o)new c50.f(2));
        ah2.f.e((Object)p, "triggeredInviteDao.getAl\u2026,\n        )\n      }\n    }");
        return (n<List<SubredditTriggeredInvite>>)p;
    }
    
    public final nf2.a i(final String s) {
        ah2.f.f((Object)s, "displayName");
        return this.c.t(s, true);
    }
    
    public final pg2.j j(final List list, final boolean b) {
        final u0 d = this.d;
        final ArrayList list2 = new ArrayList(qg2.m.P0((Iterable)list, 10));
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            list2.add(V(this, RedditLocalSubredditDataSource.a.a((SubredditListItem)iterator.next()), false, true, 1));
        }
        d.G(list2, b, this.j.t6() ^ true);
        return pg2.j.a;
    }
    
    public final nf2.a k(final String s) {
        ah2.f.f((Object)s, "subredditName");
        final nf2.a k = this.d.k0(s, false).K();
        ah2.f.e((Object)k, "subredditDao.setSubscrib\u2026dditName).toCompletable()");
        return k;
    }
    
    public final t<List<Subreddit>> l() {
        final t map = this.d.D0(false).map((o)new d1(this, 0));
        ah2.f.e((Object)map, "subredditDao.observeSubr\u2026t.fromDataModel() }\n    }");
        return (t<List<Subreddit>>)map;
    }
    
    public final c0 m(final ArrayList list) {
        final c0 w = this.d.z0(list).w((o)new a0(2));
        ah2.f.e((Object)w, "subredditDao.subscribeTo\u2026edditList).map { it > 0 }");
        return w;
    }
    
    public final e n() {
        Object b;
        if (this.j.q9()) {
            Object m0 = this.d.m0();
            if (!(m0 instanceof pj2.a)) {
                m0 = new CancellableFlowImpl((e)m0);
            }
            b = new RedditLocalSubredditDataSource$observeModeratingSubredditListItems$$inlined$map$1(pj2.u.B((e)m0));
        }
        else {
            final t map = this.d.C0(true).map((o)new b1(this, 0));
            ah2.f.e((Object)map, "subredditDao.observeSubr\u2026edditListItem() }\n      }");
            b = kotlinx.coroutines.rx2.e.b(map);
        }
        return (e)b;
    }
    
    public final n<List<Subreddit>> o() {
        final n o1 = this.d.O1(false);
        final a1 a1 = new a1(this, 2);
        o1.getClass();
        final n onAssembly = RxJavaPlugins.onAssembly((n)new io.reactivex.internal.operators.maybe.a((nf2.r)o1, (o)a1));
        ah2.f.e((Object)onAssembly, "subredditDao.findSubredd\u2026t.fromDataModel() }\n    }");
        return (n<List<Subreddit>>)onAssembly;
    }
    
    public final pg2.j p(final List list, final boolean b) {
        final u0 d = this.d;
        final ArrayList list2 = new ArrayList(qg2.m.P0((Iterable)list, 10));
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            list2.add(V(this, RedditLocalSubredditDataSource.a.a((SubredditListItem)iterator.next()), false, true, 1));
        }
        d.I0(list2, true, b);
        return pg2.j.a;
    }
    
    public final e q() {
        Object b;
        if (this.j.q9()) {
            Object q0 = this.d.Q0();
            if (!(q0 instanceof pj2.a)) {
                q0 = new CancellableFlowImpl((e)q0);
            }
            b = new RedditLocalSubredditDataSource$observeSubscribedSubredditListItems$$inlined$map$1(pj2.u.B((e)q0));
        }
        else {
            final t map = this.d.q0(true).map((o)new a1(this, 1));
            ah2.f.e((Object)map, "subredditDao.observeSubr\u2026edditListItem() }\n      }");
            b = kotlinx.coroutines.rx2.e.b(map);
        }
        return (e)b;
    }
    
    public final n<List<Subreddit>> r() {
        final n f1 = this.d.F1(false);
        final e1 e1 = new e1(this, 2);
        f1.getClass();
        final n onAssembly = RxJavaPlugins.onAssembly((n)new io.reactivex.internal.operators.maybe.a((nf2.r)f1, (o)e1));
        ah2.f.e((Object)onAssembly, "subredditDao.findSubredd\u2026t.fromDataModel() }\n    }");
        return (n<List<Subreddit>>)onAssembly;
    }
    
    public final c0<Boolean> s(final String s, final boolean b) {
        ah2.f.f((Object)s, "subredditId");
        final c0 c = this.d.J0(s, b).C((Object)Boolean.TRUE);
        ah2.f.e((Object)c, "subredditDao.setFavorite\u2026Id).toSingleDefault(true)");
        return (c0<Boolean>)c;
    }
    
    public final nf2.a t(final String s) {
        ah2.f.f((Object)s, "displayName");
        return this.c.t(s, false);
    }
    
    public final pg2.j u(final ArrayList list) {
        final n1 h = this.h;
        final ArrayList list2 = new ArrayList(qg2.m.P0((Iterable)list, 10));
        for (final UpdateSubredditTitleSafetyDto updateSubredditTitleSafetyDto : list) {
            list2.add(new v(updateSubredditTitleSafetyDto.getSubredditId(), updateSubredditTitleSafetyDto.isTitleSafe()));
        }
        h.c0(list2);
        return pg2.j.a;
    }
    
    public final n<Subreddit> v(final String s) {
        ah2.f.f((Object)s, "subredditName");
        final n p = this.d.L1(s, false).p((o)new e1(this, 0));
        ah2.f.e((Object)p, "subredditDao.findByDispl\u2026ap { it.fromDataModel() }");
        return (n<Subreddit>)p;
    }
    
    public final n<List<Subreddit>> w() {
        final n g0 = this.d.g0(false);
        final c1 c1 = new c1(this, 3);
        g0.getClass();
        final n onAssembly = RxJavaPlugins.onAssembly((n)new io.reactivex.internal.operators.maybe.a((nf2.r)g0, (o)c1));
        ah2.f.e((Object)onAssembly, "subredditDao.findSubredd\u2026t.fromDataModel() }\n    }");
        return (n<List<Subreddit>>)onAssembly;
    }
    
    public final t<List<Subreddit>> x() {
        final t map = this.d.q0(false).map((o)new a1(this, 0));
        ah2.f.e((Object)map, "subredditDao.observeSubr\u2026t.fromDataModel() }\n    }");
        return (t<List<Subreddit>>)map;
    }
    
    public final n<List<Subreddit>> y() {
        final n c1 = this.d.C1(false);
        final c1 c2 = new c1(this, 1);
        c1.getClass();
        final n onAssembly = RxJavaPlugins.onAssembly((n)new io.reactivex.internal.operators.maybe.a((nf2.r)c1, (o)c2));
        ah2.f.e((Object)onAssembly, "subredditDao.findSubredd\u2026t.fromDataModel() }\n    }");
        return (n<List<Subreddit>>)onAssembly;
    }
    
    public final c0 z(final String s, final List list) {
        ah2.f.f((Object)list, "subreddits");
        ah2.f.f((Object)s, "path");
        final b b = new b(s);
        final f b2 = kotlin.a.b((zg2.a)new RedditLocalSubredditDataSource$saveSubredditListing$1(this));
        final Object value = this.n.getValue();
        ah2.f.e(value, "<get-jsonAdapter>(...)");
        final c0 onAssembly = RxJavaPlugins.onAssembly((c0)new cg2.j((Callable)new u40.a(4, (Object)value, (Object)list)));
        final qw.e e = new qw.e(2, (Object)b2, (Object)b);
        onAssembly.getClass();
        final c0 b3 = RxJavaPlugins.onAssembly((c0)new SingleFlatMap((g0)onAssembly, (o)e)).B((o)new m10.p(9));
        ah2.f.e((Object)b3, "fromCallable {\n    val j\u2026ubreddits\")\n    false\n  }");
        return b3;
    }
    
    public static final class a
    {
        public static Subreddit a(final SubredditListItem subredditListItem) {
            ah2.f.f((Object)subredditListItem, "<this>");
            return new Subreddit(subredditListItem.getId(), subredditListItem.getKindWithId(), subredditListItem.getDisplayName(), subredditListItem.getDisplayNamePrefixed(), subredditListItem.getIconImg(), subredditListItem.getKeyColor(), (String)null, (String)null, (String)null, (String)null, (String)null, (Long)null, (Long)null, 0L, subredditListItem.getSubredditType(), (String)null, Boolean.valueOf(subredditListItem.getOver18()), (Boolean)null, (String)null, (Boolean)null, (Boolean)null, (Boolean)null, (String)null, (String)null, (String)null, (String)null, false, (String)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, Boolean.valueOf(subredditListItem.getUserIsModerator()), Boolean.valueOf(subredditListItem.getUserIsSubscriber()), Boolean.valueOf(subredditListItem.getUserHasFavorited()), (NotificationLevel)null, subredditListItem.getPrimaryColorKey(), subredditListItem.getCommunityIconUrl(), (String)null, (String)null, (Boolean)null, (Boolean)null, (Boolean)null, (String)null, (String)null, (String)null, (String)null, (List)null, (Boolean)null, (Boolean)null, (String)null, (String)null, (Boolean)null, (Boolean)null, (List)null, (String)null, (String)null, (SubredditCountrySiteSettings)null, (Boolean)null, (List)null, (Boolean)null, subredditListItem.isMyReddit(), -81984, -3521, 7, (DefaultConstructorMarker)null);
        }
        
        public static SubredditListItem b(final Subreddit subreddit) {
            final String id = subreddit.getId();
            final String kindWithId = subreddit.getKindWithId();
            final String displayName = subreddit.getDisplayName();
            final String displayNamePrefixed = subreddit.getDisplayNamePrefixed();
            final String primaryColorKey = subreddit.getPrimaryColorKey();
            final String keyColor = subreddit.getKeyColor();
            final String communityIconUrl = subreddit.getCommunityIconUrl();
            final String iconImg = subreddit.getIconImg();
            final String subredditType = subreddit.getSubredditType();
            final Boolean userHasFavorited = subreddit.getUserHasFavorited();
            final Boolean true = Boolean.TRUE;
            return new SubredditListItem(id, kindWithId, displayName, displayNamePrefixed, primaryColorKey, keyColor, communityIconUrl, iconImg, subredditType, ah2.f.a((Object)userHasFavorited, (Object)true), ah2.f.a((Object)subreddit.getOver18(), (Object)true), ah2.f.a((Object)subreddit.getUserIsSubscriber(), (Object)true), ah2.f.a((Object)subreddit.getUserIsModerator(), (Object)true), subreddit.isMyReddit());
        }
        
        public static SubredditListItem c(final j60.e e) {
            ah2.f.f((Object)e, "<this>");
            final String a = e.a;
            final String b = e.b;
            final String c = e.c;
            final String d = e.d;
            final String e2 = e.e;
            final String f = e.f;
            final String g = e.g;
            final String h = e.h;
            final String i = e.i;
            final Boolean j = e.j;
            final Boolean true = Boolean.TRUE;
            final boolean a2 = ah2.f.a((Object)j, (Object)true);
            final boolean k = e.k;
            boolean b2 = true;
            if (!k) {
                b2 = false;
            }
            return new SubredditListItem(a, b, c, d, e2, f, g, h, i, a2, b2, ah2.f.a((Object)e.l, (Object)true), ah2.f.a((Object)e.m, (Object)true), ah2.f.a((Object)e.n, (Object)true));
        }
    }
    
    public static final class b implements e70.b
    {
        public final String a;
        
        public b(final String a) {
            ah2.f.f((Object)a, "path");
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof b && ah2.f.a((Object)this.a, (Object)((b)o).a));
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode();
        }
        
        @Override
        public final String toString() {
            return b.k(a.k("SubredditListingKey(path="), this.a, ')');
        }
    }
}
