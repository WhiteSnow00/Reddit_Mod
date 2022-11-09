// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.local;

import kotlin.Metadata;
import c50.p;
import z10.w;
import i60.k;
import com.reddit.domain.model.mod.CrowdControlFilterLevel;
import com.reddit.ads.link.models.AppStoreData;
import com.reddit.domain.model.DiscussionType;
import com.reddit.domain.model.listing.RecommendationContext;
import com.reddit.domain.model.PostGallery;
import com.reddit.domain.model.liveaudio.LegacyAudioRoom;
import com.reddit.domain.model.liveaudio.AudioRoom;
import com.reddit.domain.model.RpanVideo;
import com.reddit.domain.model.predictions.PostPredictionsTournamentData;
import com.reddit.domain.model.PostPoll;
import java.util.Map;
import com.reddit.domain.model.RichTextResponse;
import com.reddit.domain.model.OutboundLink;
import com.reddit.ads.domain.PromoLayoutType;
import com.reddit.domain.model.SubredditDetail;
import com.reddit.mod.notes.domain.model.NoteLabel;
import com.reddit.domain.modtools.ModQueueTriggers;
import com.reddit.domain.model.mod.BannedBy;
import com.reddit.domain.model.LinkMedia;
import com.reddit.domain.model.Preview;
import com.reddit.domain.awardsleaderboard.AwardLeaderboardStatus;
import com.google.firebase.perf.metrics.Trace;
import io.reactivex.internal.operators.maybe.MaybeFlatMapCompletable;
import kotlinx.coroutines.rx2.d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.util.Collection;
import sf2.o;
import nf2.r;
import io.reactivex.internal.operators.maybe.MaybeFlatten;
import c50.q;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.Iterator;
import java.util.List;
import com.reddit.data.room.model.DiscoveryUnitType;
import com.squareup.moshi.JsonAdapter;
import com.reddit.domain.model.TopicsRecommendationFeedElement;
import i60.m;
import com.reddit.domain.model.Link;
import com.reddit.domain.model.ILink;
import ah2.c;
import java.util.ArrayList;
import i60.l;
import pg2.j;
import com.reddit.listing.common.ListingType;
import com.reddit.listing.model.sort.SortTimeFrame;
import com.reddit.listing.model.sort.SortType;
import com.reddit.domain.model.listing.Listing;
import pg2.f;
import jw0.a;
import db0.i;
import cb0.n;
import db0.e;
import h60.c0;
import h60.x;
import javax.inject.Provider;
import com.squareup.moshi.y;
import c50.i0;

public final class DatabaseLinkDataSource implements i0
{
    public final y a;
    public final Provider<x> b;
    public final Provider<c0> c;
    public final db0.c0 d;
    public final e e;
    public final n f;
    public final i g;
    public a h;
    public aw.a i;
    public final f j;
    public final f k;
    
    public DatabaseLinkDataSource(final y a, final Provider<x> b, final Provider<c0> c, final db0.c0 d, final e e, final n f, final i g, final a h, final aw.a i) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = kotlin.a.b((zg2.a)new DatabaseLinkDataSource$adapter.DatabaseLinkDataSource$adapter$2(this));
        this.k = kotlin.a.b((zg2.a)new DatabaseLinkDataSource$topicsElementAdapter.DatabaseLinkDataSource$topicsElementAdapter$2(this));
    }
    
    public static j b0(final DatabaseLinkDataSource databaseLinkDataSource, final Listing listing, final SortType sortType, SortTimeFrame sortTimeFrame, String s, final ListingType listingType, String after, int n) {
        SortType sortType2;
        if ((n & 0x2) != 0x0) {
            sortType2 = null;
        }
        else {
            sortType2 = sortType;
        }
        if ((n & 0x4) != 0x0) {
            sortTimeFrame = null;
        }
        String s2;
        if ((n & 0x80) != 0x0) {
            s2 = null;
        }
        else {
            s2 = after;
        }
        final x g = databaseLinkDataSource.g();
        if (s == null) {
            s = "";
        }
        after = listing.getAfter();
        if (after == null) {
            after = "";
        }
        String adDistance = listing.getAdDistance();
        if (adDistance == null) {
            adDistance = "";
        }
        if (s2 == null) {
            s2 = "";
        }
        final l l = new l(sortType2, sortTimeFrame, s, after, adDistance, "", "", s2, "", null, listingType, null, 13313);
        final List children = listing.getChildren();
        final ArrayList<i60.j> o = new ArrayList<i60.j>();
        final Iterator iterator = children.iterator();
        final int n2 = 0;
        n = 0;
        while (iterator.hasNext()) {
            final Object next = iterator.next();
            if (n < 0) {
                c.x0();
                throw null;
            }
            final ILink link = (ILink)next;
            i60.j d0;
            if (link instanceof Link) {
                d0 = databaseLinkDataSource.d0(n, (Link)link);
            }
            else {
                d0 = null;
            }
            if (d0 != null) {
                o.add(d0);
            }
            ++n;
        }
        l.o = o;
        final List children2 = listing.getChildren();
        final ArrayList<m> p8 = new ArrayList<m>();
        final Iterator iterator2 = children2.iterator();
        n = n2;
        while (iterator2.hasNext()) {
            final Object next2 = iterator2.next();
            if (n < 0) {
                c.x0();
                throw null;
            }
            final ILink link2 = (ILink)next2;
            m m;
            if (link2 instanceof TopicsRecommendationFeedElement) {
                final TopicsRecommendationFeedElement topicsRecommendationFeedElement = (TopicsRecommendationFeedElement)link2;
                final String id = topicsRecommendationFeedElement.getId();
                final Object value = databaseLinkDataSource.k.getValue();
                ah2.f.e(value, "<get-topicsElementAdapter>(...)");
                final String json = ((JsonAdapter)value).toJson((Object)topicsRecommendationFeedElement);
                ah2.f.e((Object)json, "topicsElementAdapter.toJson(this)");
                m = new m(n, DiscoveryUnitType.TYPE_TOPICS.getId(), -1L, id, json);
            }
            else {
                m = null;
            }
            if (m != null) {
                p8.add(m);
            }
            ++n;
        }
        l.p = p8;
        g.U(l, databaseLinkDataSource.d.e());
        return j.a;
    }
    
    public static nf2.c0 c0(final DatabaseLinkDataSource databaseLinkDataSource, final Listing listing, SortType sortType, SortTimeFrame sortTimeFrame, final String s, final ListingType listingType, String s2, String s3, String s4, String s5, String s6, final int n) {
        if ((n & 0x2) != 0x0) {
            sortType = null;
        }
        if ((n & 0x4) != 0x0) {
            sortTimeFrame = null;
        }
        if ((n & 0x20) != 0x0) {
            s2 = null;
        }
        if ((n & 0x40) != 0x0) {
            s3 = null;
        }
        if ((n & 0x100) != 0x0) {
            s4 = null;
        }
        if ((n & 0x200) != 0x0) {
            s5 = null;
        }
        if ((n & 0x400) != 0x0) {
            s6 = null;
        }
        databaseLinkDataSource.getClass();
        final nf2.c0 onAssembly = RxJavaPlugins.onAssembly((nf2.c0)new cg2.j((Callable)new b(databaseLinkDataSource, listing, sortType, sortTimeFrame, s, listingType, s2, s3, null, s4, s5, s6)));
        ah2.f.e((Object)onAssembly, "fromCallable {\n      lin\u2026\n      )\n      true\n    }");
        return onAssembly;
    }
    
    public static nf2.n e(final DatabaseLinkDataSource databaseLinkDataSource, SortType sortType, SortTimeFrame sortTimeFrame, final ListingType listingType, String s, String s2, String s3, String s4, String s5, String s6, String s7, String s8, final int n) {
        if ((n & 0x1) != 0x0) {
            sortType = null;
        }
        if ((n & 0x2) != 0x0) {
            sortTimeFrame = null;
        }
        if ((n & 0x8) != 0x0) {
            s = null;
        }
        if ((n & 0x10) != 0x0) {
            s2 = null;
        }
        if ((n & 0x20) != 0x0) {
            s3 = null;
        }
        if ((n & 0x40) != 0x0) {
            s4 = null;
        }
        if ((n & 0x80) != 0x0) {
            s5 = null;
        }
        if ((n & 0x100) != 0x0) {
            s6 = null;
        }
        if ((n & 0x200) != 0x0) {
            s7 = null;
        }
        if ((n & 0x400) != 0x0) {
            s8 = null;
        }
        databaseLinkDataSource.getClass();
        final nf2.n n2 = (nf2.n)((zg2.l)new DatabaseLinkDataSource$getAllLinks$fetch$1(databaseLinkDataSource, sortType, sortTimeFrame, listingType, s3, s4, s5, s6, s7, s8)).invoke((Object)s);
        final q q = new q(databaseLinkDataSource, sortType, sortTimeFrame, listingType, s2, s3, s4, s5, s7);
        n2.getClass();
        final nf2.n onAssembly = RxJavaPlugins.onAssembly((nf2.n)new MaybeFlatten((r)n2, (o)q));
        ah2.f.e((Object)onAssembly, "fetch(after).flatMap { l\u2026t(listing))\n      }\n    }");
        return onAssembly;
    }
    
    public static Listing f(final DatabaseLinkDataSource databaseLinkDataSource, SortType sortType, SortTimeFrame sortTimeFrame, final String s, final ListingType listingType, String s2, int n) {
        final Listing listing = null;
        if ((n & 0x1) != 0x0) {
            sortType = null;
        }
        if ((n & 0x2) != 0x0) {
            sortTimeFrame = null;
        }
        if ((n & 0x40) != 0x0) {
            s2 = null;
        }
        final j60.c r = databaseLinkDataSource.g().R(sortType, sortTimeFrame, s, listingType, (String)null, (String)null, s2, (String)null);
        Listing listing2;
        if (r == null) {
            listing2 = listing;
        }
        else {
            final l a = r.a;
            final ArrayList list = new ArrayList();
            final List b = r.b;
            final ArrayList list2 = new ArrayList<Link>(qg2.m.P0((Iterable)b, 10));
            final Iterator iterator = b.iterator();
            while (iterator.hasNext()) {
                list2.add(databaseLinkDataSource.b((j60.b)iterator.next()));
            }
            list.addAll(list2);
            for (final m m : r.c) {
                ILink link;
                if (m.d == DiscoveryUnitType.TYPE_TOPICS.getId()) {
                    final Object value = databaseLinkDataSource.k.getValue();
                    ah2.f.e(value, "<get-topicsElementAdapter>(...)");
                    link = (ILink)((JsonAdapter)value).fromJson(m.c);
                }
                else {
                    link = null;
                }
                if (link != null) {
                    n = m.b;
                    if (n > list.size()) {
                        continue;
                    }
                    list.add(n, link);
                }
            }
            String d = a.d;
            n = d.length();
            final int n2 = 0;
            if (n == 0) {
                n = 1;
            }
            else {
                n = 0;
            }
            if (n != 0) {
                d = null;
            }
            String e = a.e;
            if (e.length() == 0) {
                n = 1;
            }
            else {
                n = 0;
            }
            if (n != 0) {
                e = null;
            }
            String f = a.f;
            n = n2;
            if (f.length() == 0) {
                n = 1;
            }
            if (n != 0) {
                f = null;
            }
            listing2 = new Listing(list, e, d, f, null, false, null, 112, null);
        }
        return listing2;
    }
    
    public static /* synthetic */ nf2.n j(final DatabaseLinkDataSource databaseLinkDataSource, SortType sortType, SortTimeFrame sortTimeFrame, final String s, final ListingType listingType, String s2, String s3, String s4, String s5, String s6, final int n) {
        if ((n & 0x1) != 0x0) {
            sortType = null;
        }
        if ((n & 0x2) != 0x0) {
            sortTimeFrame = null;
        }
        if ((n & 0x10) != 0x0) {
            s2 = null;
        }
        if ((n & 0x20) != 0x0) {
            s3 = null;
        }
        if ((n & 0x80) != 0x0) {
            s4 = null;
        }
        if ((n & 0x100) != 0x0) {
            s5 = null;
        }
        if ((n & 0x200) != 0x0) {
            s6 = null;
        }
        return databaseLinkDataSource.i(sortType, sortTimeFrame, s, listingType, s2, s3, null, s4, s5, s6);
    }
    
    @Override
    public final nf2.c0<Boolean> A(final Listing<Link> listing) {
        ah2.f.f((Object)listing, "links");
        return (nf2.c0<Boolean>)c0(this, listing, null, null, null, ListingType.AWARDED, null, null, null, null, null, 2022);
    }
    
    @Override
    public final nf2.c0<Boolean> B(final Listing<Link> listing, final String s, final String s2) {
        ah2.f.f((Object)listing, "links");
        ah2.f.f((Object)s, "username");
        return (nf2.c0<Boolean>)c0(this, listing, null, null, s2, ListingType.SAVED_POSTS, null, null, null, null, null, 2022);
    }
    
    @Override
    public final nf2.n<Listing<Link>> C(final String s) {
        ah2.f.f((Object)s, "subredditName");
        return (nf2.n<Listing<Link>>)j(this, null, null, null, ListingType.PREDICTIONS_TOURNAMENT, s, null, null, null, null, 995);
    }
    
    @Override
    public final j D(final Listing listing, final SortType sortType, final SortTimeFrame sortTimeFrame, final String s, final String s2, final tg2.c c) {
        final j b0 = b0(this, listing, sortType, sortTimeFrame, s, ListingType.POPULAR, s2, 352);
        if (b0 == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return b0;
        }
        return pg2.j.a;
    }
    
    @Override
    public final Object E(final Listing<Link> listing, final tg2.c<? super Boolean> c) {
        DatabaseLinkDataSource$saveRecommendedLink.DatabaseLinkDataSource$saveRecommendedLink$1 databaseLinkDataSource$saveRecommendedLink$2 = null;
        Label_0052: {
            if (c instanceof DatabaseLinkDataSource$saveRecommendedLink.DatabaseLinkDataSource$saveRecommendedLink$1) {
                final DatabaseLinkDataSource$saveRecommendedLink.DatabaseLinkDataSource$saveRecommendedLink$1 databaseLinkDataSource$saveRecommendedLink$1 = (DatabaseLinkDataSource$saveRecommendedLink.DatabaseLinkDataSource$saveRecommendedLink$1)c;
                final int label = databaseLinkDataSource$saveRecommendedLink$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    databaseLinkDataSource$saveRecommendedLink$1.label = label + Integer.MIN_VALUE;
                    databaseLinkDataSource$saveRecommendedLink$2 = databaseLinkDataSource$saveRecommendedLink$1;
                    break Label_0052;
                }
            }
            databaseLinkDataSource$saveRecommendedLink$2 = new DatabaseLinkDataSource$saveRecommendedLink.DatabaseLinkDataSource$saveRecommendedLink$1(this, (tg2.c)c);
        }
        final Object result = databaseLinkDataSource$saveRecommendedLink$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = databaseLinkDataSource$saveRecommendedLink$2.label;
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
            final nf2.c0 c2 = c0(this, Listing.copy$default((Listing<Object>)listing, null, "", null, null, null, false, null, 125, null), null, null, null, ListingType.RECOMMENDED_VIDEOS, null, null, null, null, null, 2022);
            databaseLinkDataSource$saveRecommendedLink$2.label = 1;
            if ((b = kotlinx.coroutines.rx2.d.b(c2, (tg2.c)databaseLinkDataSource$saveRecommendedLink$2)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        ah2.f.e(b, "saveLinks(links = links.\u2026OS, after = null).await()");
        return b;
    }
    
    @Override
    public final nf2.n F(final SortTimeFrame sortTimeFrame, final SortType sortType, final String s) {
        return e(this, sortType, sortTimeFrame, ListingType.MULTIREDDIT, null, null, null, s, null, null, null, null, 1976);
    }
    
    @Override
    public final nf2.c0<Boolean> G(final Listing<Link> listing, final SortType sortType, final SortTimeFrame sortTimeFrame, final String s, final String s2) {
        ah2.f.f((Object)listing, "links");
        ah2.f.f((Object)s2, "categoryId");
        return (nf2.c0<Boolean>)c0(this, listing, sortType, sortTimeFrame, s, ListingType.CATEGORY, null, null, s2, null, null, 1760);
    }
    
    @Override
    public final nf2.a H(final Link link) {
        ah2.f.f((Object)link, "link");
        final x g = this.g();
        final String id = link.getId();
        final String json = this.d().toJson((Object)link);
        ah2.f.e((Object)json, "adapter.toJson(link)");
        return g.N0(id, json);
    }
    
    @Override
    public final nf2.n<Listing<Link>> I(final String s) {
        final nf2.n onAssembly = RxJavaPlugins.onAssembly((nf2.n)new io.reactivex.internal.operators.maybe.a((r)e(this, null, null, ListingType.SAVED_POSTS, null, s, null, null, null, null, null, null, 2027), (o)new ov.d(4)));
        ah2.f.e((Object)onAssembly, "getAllLinks(\n      listi\u2026ed && !it.hidden })\n    }");
        return (nf2.n<Listing<Link>>)onAssembly;
    }
    
    @Override
    public final j J(final Listing listing, final String s, final tg2.c c) {
        final j b0 = b0(this, listing, null, null, s, ListingType.NEWS, null, 486);
        if (b0 == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return b0;
        }
        return pg2.j.a;
    }
    
    @Override
    public final nf2.n<Listing<Link>> K(final String s, final String s2) {
        ah2.f.f((Object)s, "username");
        final nf2.n n = nf2.n.n((Callable)new c50.o(this, s2, 1));
        ah2.f.e((Object)n, "fromCallable {\n      lin\u2026t.hidden })\n      }\n    }");
        return (nf2.n<Listing<Link>>)n;
    }
    
    @Override
    public final nf2.c0<Boolean> L(final Listing<Link> listing, final SortType sortType, final SortTimeFrame sortTimeFrame, final String s, final String s2) {
        ah2.f.f((Object)listing, "links");
        ah2.f.f((Object)s2, "multiredditPath");
        return (nf2.c0<Boolean>)c0(this, listing, sortType, sortTimeFrame, s, ListingType.MULTIREDDIT, null, s2, null, null, null, 1952);
    }
    
    @Override
    public final Listing M(final SortType sortType, final SortTimeFrame sortTimeFrame, final String s, final String s2, final tg2.c c) {
        return f(this, sortType, sortTimeFrame, s, ListingType.POPULAR, s2, 176);
    }
    
    @Override
    public final nf2.c0 N(final ArrayList list) {
        final nf2.c0 w = this.g().n(list).w((o)new he0.b((Object)this, 8));
        ah2.f.e((Object)w, "linkDao.findLinksById(li\u2026{ it.fromQueryModel() } }");
        return w;
    }
    
    @Override
    public final nf2.n<Listing<Link>> O(final String s, final String s2) {
        ah2.f.f((Object)s, "topicSlug");
        return (nf2.n<Listing<Link>>)e(this, null, null, ListingType.DISCOVER_LINKS, s2, null, null, null, null, null, s, null, 1523);
    }
    
    @Override
    public final nf2.c0 P(final Listing listing, final SortType sortType, final SortTimeFrame sortTimeFrame, final String s, final String s2) {
        ah2.f.f((Object)listing, "links");
        ah2.f.f((Object)s, "username");
        ah2.f.f((Object)sortType, "sort");
        return c0(this, listing, sortType, sortTimeFrame, s2, ListingType.USER_SUBMITTED, null, null, null, null, null, 2016);
    }
    
    @Override
    public final nf2.a Q(final Link link) {
        ah2.f.f((Object)link, "link");
        final nf2.a onAssembly = RxJavaPlugins.onAssembly((nf2.a)new MaybeFlatMapCompletable((r)this.a(link.getId()), (o)new h40.x(4, (Object)this, (Object)link)));
        ah2.f.e((Object)onAssembly, "getLinkById(linkId = lin\u2026PreservedMetadata))\n    }");
        return onAssembly;
    }
    
    @Override
    public final DatabaseLinkDataSource$getLinkFlowById$$inlined$map$1 R(final String s) {
        ah2.f.f((Object)s, "linkId");
        return new DatabaseLinkDataSource$getLinkFlowById$$inlined$map$1((pj2.e)this.g().g(s), this);
    }
    
    @Override
    public final nf2.c0<List<String>> S() {
        return (nf2.c0<List<String>>)this.g().j1();
    }
    
    @Override
    public final nf2.n<Listing<Link>> T(final SortType sortType, final SortTimeFrame sortTimeFrame) {
        return (nf2.n<Listing<Link>>)e(this, sortType, sortTimeFrame, ListingType.HOME, null, null, null, null, null, null, null, null, 2040);
    }
    
    @Override
    public final j U(final Listing listing, final SortType sortType, final SortTimeFrame sortTimeFrame, final String s, final tg2.c c) {
        final Trace b = ri.b.b("LocalLinkDataSource.saveFrontpageElements");
        final j b2 = b0(this, listing, sortType, sortTimeFrame, s, ListingType.HOME, null, 480);
        if (b2 == CoroutineSingletons.COROUTINE_SUSPENDED) {
            b.stop();
            return b2;
        }
        final j a = pg2.j.a;
        b.stop();
        return a;
    }
    
    @Override
    public final nf2.a V(final String s) {
        final nf2.a onAssembly = RxJavaPlugins.onAssembly((nf2.a)new xf2.f((Callable)new ov.b(1, (Object)this, (Object)s)));
        ah2.f.e((Object)onAssembly, "fromCallable {\n      lin\u2026d, isHidden = true)\n    }");
        return onAssembly;
    }
    
    @Override
    public final nf2.c0<Boolean> W(final Listing<Link> listing, final SortType sortType, final SortTimeFrame sortTimeFrame, final String s, final String s2, final String s3) {
        ah2.f.f((Object)listing, "links");
        ah2.f.f((Object)s2, "subredditName");
        return (nf2.c0<Boolean>)c0(this, listing, sortType, sortTimeFrame, s, ListingType.SUBREDDIT, s2, null, null, null, s3, 960);
    }
    
    @Override
    public final nf2.n X(final SortTimeFrame sortTimeFrame, final SortType sortType, final String s) {
        return e(this, sortType, sortTimeFrame, ListingType.POPULAR, null, null, null, null, s, null, null, null, 1912);
    }
    
    @Override
    public final nf2.c0<Boolean> Y(final String s, final Listing<Link> listing) {
        ah2.f.f((Object)s, "subredditName");
        ah2.f.f((Object)listing, "links");
        return (nf2.c0<Boolean>)c0(this, listing, null, null, null, ListingType.PREDICTIONS_TOURNAMENT, s, null, null, null, null, 1990);
    }
    
    @Override
    public final nf2.n<Listing<Link>> Z() {
        return (nf2.n<Listing<Link>>)j(this, null, null, null, ListingType.AWARDED, null, null, null, null, null, 1011);
    }
    
    @Override
    public final nf2.n<Link> a(final String s) {
        ah2.f.f((Object)s, "linkId");
        final nf2.n p = this.g().r1(s).p((o)new qw.c((Object)this, 7));
        ah2.f.e((Object)p, "linkDao.findLinkById(lin\u2026p { it.fromQueryModel() }");
        return (nf2.n<Link>)p;
    }
    
    @Override
    public final Listing a0(final SortType sortType, final SortTimeFrame sortTimeFrame, final String s, final tg2.c c) {
        return f(this, sortType, sortTimeFrame, s, ListingType.HOME, null, 240);
    }
    
    public final Link b(final j60.b b) {
        final Object fromJson = this.d().fromJson(b.a.c);
        ah2.f.c(fromJson);
        final Link link = (Link)fromJson;
        final k b2 = b.b;
        final Boolean c = b.c;
        if (b2 != null) {
            Link link2;
            if (b2.b || !ah2.f.a((Object)link.getHidden(), (Object)b2.d) || !ah2.f.a((Object)link.getSaved(), (Object)b2.f) || !ah2.f.a((Object)link.getSubscribed(), (Object)b2.e) || (b2.g != null && !ah2.f.a((Object)link.getFollowed(), (Object)b2.g))) {
                final boolean b3 = b2.b;
                final Boolean d = b2.d;
                boolean b4;
                if (d != null) {
                    b4 = d;
                }
                else {
                    b4 = link.getHidden();
                }
                final Boolean e = b2.e;
                boolean b5;
                if (e != null) {
                    b5 = e;
                }
                else {
                    b5 = link.getSubscribed();
                }
                final Boolean f = b2.f;
                boolean b6;
                if (f != null) {
                    b6 = f;
                }
                else {
                    b6 = link.getSaved();
                }
                final Boolean g = b2.g;
                boolean b7;
                if (g != null) {
                    b7 = g;
                }
                else {
                    b7 = link.getFollowed();
                }
                link2 = Link.copy$default(link, null, null, 0L, null, null, null, null, 0, null, 0, 0.0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, false, null, false, false, null, null, null, null, null, null, null, null, false, null, null, null, false, false, false, b4, b5, b6, false, false, false, false, false, false, null, null, false, false, false, null, null, false, false, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, b3, c != null && c, null, null, null, null, null, null, null, b7, null, null, false, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, false, -1, -917505, -1610612737, 134217663, null);
            }
            else if (c == null || (link2 = Link.copy$default(link, null, null, 0L, null, null, null, null, 0, null, 0, 0.0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, false, null, false, false, null, null, null, null, null, null, null, null, false, null, null, null, false, false, false, false, false, false, false, false, false, false, false, false, null, null, false, false, false, null, null, false, false, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, false, c, null, null, null, null, null, null, null, false, null, null, false, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, false, -1, -1, -1073741825, 134217727, null)) == null) {
                link2 = link;
            }
            if (link2 != null) {
                return link2;
            }
        }
        Link link2 = link;
        if (c != null) {
            link2 = Link.copy$default(link, null, null, 0L, null, null, null, null, 0, null, 0, 0.0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, false, null, false, false, null, null, null, null, null, null, null, null, false, null, null, null, false, false, false, false, false, false, false, false, false, false, false, false, null, null, false, false, false, null, null, false, false, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, false, c, null, null, null, null, null, null, null, false, null, null, false, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, false, -1, -1, -1073741825, 134217727, null);
        }
        return link2;
    }
    
    public final Listing<Link> c(final j60.c c) {
        final l a = c.a;
        final List b = c.b;
        final ArrayList list = new ArrayList<Link>(qg2.m.P0((Iterable)b, 10));
        final Iterator iterator = b.iterator();
        while (iterator.hasNext()) {
            list.add(this.b((j60.b)iterator.next()));
        }
        String d = a.d;
        final int length = d.length();
        final int n = 1;
        final boolean b2 = length == 0;
        String s = null;
        if (b2) {
            d = null;
        }
        String e = a.e;
        if (e.length() == 0) {
            e = null;
        }
        final String f = a.f;
        int n2;
        if (f.length() == 0) {
            n2 = n;
        }
        else {
            n2 = 0;
        }
        if (n2 == 0) {
            s = f;
        }
        return new Listing<Link>(list, e, d, s, null, false, null, 112, null);
    }
    
    public final JsonAdapter<Link> d() {
        final Object value = this.j.getValue();
        ah2.f.e(value, "<get-adapter>(...)");
        return (JsonAdapter<Link>)value;
    }
    
    public final i60.j d0(final int n, final Link link) {
        final String a = this.i.a(link.getId(), link.getUniqueId(), link.getPromoted());
        final String json = this.d().toJson((Object)link);
        ah2.f.e((Object)json, "adapter.toJson(this)");
        return new i60.j(n, -1L, a, json, w.g(link.getSubredditId()));
    }
    
    @Override
    public final nf2.a delete(final String s) {
        return this.g().S0(s);
    }
    
    @Override
    public final nf2.a follow(final String s, final boolean b) {
        ah2.f.f((Object)s, "linkId");
        final nf2.a onAssembly = RxJavaPlugins.onAssembly((nf2.a)new xf2.f((Callable)new p(s, b, 0, this)));
        ah2.f.e((Object)onAssembly, "fromCallable {\n      lin\u2026sFollowed = follow)\n    }");
        return onAssembly;
    }
    
    public final x g() {
        final Object value = this.b.get();
        ah2.f.e(value, "linkDaoProvider.get()");
        return (x)value;
    }
    
    public final c0 h() {
        final Object value = this.c.get();
        ah2.f.e(value, "linkMutationsDaoProvider.get()");
        return (c0)value;
    }
    
    public final nf2.n<Listing<Link>> i(final SortType sortType, final SortTimeFrame sortTimeFrame, final String s, final ListingType listingType, final String s2, final String s3, final String s4, final String s5, final String s6, final String s7) {
        final nf2.n n = nf2.n.n((Callable)new c50.r(this, sortType, sortTimeFrame, s, listingType, s2, s3, s4, s5, s6, s7));
        ah2.f.e((Object)n, "fromCallable {\n      lin\u2026)?.fromQueryModel()\n    }");
        return (nf2.n<Listing<Link>>)n;
    }
    
    @Override
    public final nf2.a k() {
        return this.h().k();
    }
    
    @Override
    public final nf2.a l(final String s) {
        ah2.f.f((Object)s, "linkId");
        final nf2.a q = nf2.a.q((Callable)new c50.o(this, s, 0));
        ah2.f.e((Object)q, "fromCallable {\n      lin\u2026Subscribed = false)\n    }");
        return q;
    }
    
    @Override
    public final nf2.a m(final String s) {
        ah2.f.f((Object)s, "linkId");
        final nf2.a q = nf2.a.q((Callable)new q6.k(6, this, s));
        ah2.f.e((Object)q, "fromCallable {\n      lin\u2026kId, isRead = true)\n    }");
        return q;
    }
    
    @Override
    public final nf2.a n(final String s) {
        ah2.f.f((Object)s, "linkId");
        final nf2.a q = nf2.a.q((Callable)new u40.a(2, (Object)this, (Object)s));
        ah2.f.e((Object)q, "fromCallable {\n      lin\u2026sSubscribed = true)\n    }");
        return q;
    }
    
    @Override
    public final nf2.a o() {
        return this.h().o();
    }
    
    @Override
    public final j p() {
        this.g().p();
        return pg2.j.a;
    }
    
    @Override
    public final List<k> q(final List<String> list) {
        ah2.f.f((Object)list, "linkIds");
        return this.h().Y(list);
    }
    
    @Override
    public final nf2.n<Listing<Link>> r(final SortType sortType, final SortTimeFrame sortTimeFrame, final String s, final String s2) {
        ah2.f.f((Object)s2, "multiredditPath");
        return (nf2.n<Listing<Link>>)j(this, sortType, sortTimeFrame, s, ListingType.MULTIREDDIT, null, s2, null, null, null, 976);
    }
    
    @Override
    public final nf2.n<Listing<Link>> s(final SortType sortType, final SortTimeFrame sortTimeFrame, final String s, final String s2) {
        ah2.f.f((Object)s2, "categoryId");
        return (nf2.n<Listing<Link>>)j(this, sortType, sortTimeFrame, s, ListingType.CATEGORY, null, null, s2, null, null, 880);
    }
    
    @Override
    public final nf2.a save(final String s) {
        ah2.f.f((Object)s, "linkId");
        final nf2.a q = nf2.a.q((Callable)new c50.n(this, s, 0));
        ah2.f.e((Object)q, "fromCallable {\n      lin\u2026Id, isSaved = true)\n    }");
        return q;
    }
    
    @Override
    public final nf2.a t(final String s) {
        final nf2.a onAssembly = RxJavaPlugins.onAssembly((nf2.a)new xf2.f((Callable)new q6.l(2, this, s)));
        ah2.f.e((Object)onAssembly, "fromCallable {\n      lin\u2026, isHidden = false)\n    }");
        return onAssembly;
    }
    
    @Override
    public final nf2.n<Listing<Link>> u(final String s, final String s2) {
        ah2.f.f((Object)s, "topicSlug");
        return (nf2.n<Listing<Link>>)j(this, null, null, s2, ListingType.DISCOVER_LINKS, null, null, null, s, null, 755);
    }
    
    @Override
    public final nf2.a unsave(final String s) {
        ah2.f.f((Object)s, "linkId");
        final nf2.a q = nf2.a.q((Callable)new c50.n(this, s, 1));
        ah2.f.e((Object)q, "fromCallable {\n      lin\u2026d, isSaved = false)\n    }");
        return q;
    }
    
    @Override
    public final nf2.n v(final SortTimeFrame sortTimeFrame, final SortType sortType, final String s) {
        ah2.f.f((Object)s, "categoryId");
        return e(this, sortType, sortTimeFrame, ListingType.CATEGORY, null, null, null, null, null, s, null, null, 1784);
    }
    
    @Override
    public final nf2.n<Listing<Link>> w(final SortType sortType, final SortTimeFrame sortTimeFrame, final String s, final String s2) {
        ah2.f.f((Object)s, "subredditName");
        return (nf2.n<Listing<Link>>)e(this, sortType, sortTimeFrame, ListingType.SUBREDDIT, null, null, s, null, null, null, null, s2, 984);
    }
    
    @Override
    public final nf2.c0<Boolean> x(final Listing<Link> listing, final String s, final String s2) {
        ah2.f.f((Object)listing, "links");
        return (nf2.c0<Boolean>)c0(this, listing, null, null, s2, ListingType.DISCOVER_LINKS, null, null, null, s, null, 1510);
    }
    
    @Override
    public final nf2.n y(final SortType sortType, final SortTimeFrame sortTimeFrame, final String s, final String s2) {
        ah2.f.f((Object)s, "username");
        ah2.f.f((Object)sortType, "sort");
        return j(this, sortType, sortTimeFrame, s2, ListingType.USER_SUBMITTED, null, null, null, null, null, 1008);
    }
    
    @Override
    public final nf2.n<Listing<Link>> z(final SortType sortType, final SortTimeFrame sortTimeFrame, final String s, final String s2, final String s3) {
        ah2.f.f((Object)s2, "subredditName");
        return (nf2.n<Listing<Link>>)j(this, sortType, sortTimeFrame, s, ListingType.SUBREDDIT, s2, null, null, null, s3, 480);
    }
    
    @Metadata(d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b" }, d2 = { "Lcom/reddit/data/local/DatabaseLinkDataSource$DuplicateLinkInFeedException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "temp_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class DuplicateLinkInFeedException extends RuntimeException
    {
        private final String message;
        
        public DuplicateLinkInFeedException(final String message) {
            ah2.f.f((Object)message, "message");
            super(message);
            this.message = message;
        }
        
        @Override
        public String getMessage() {
            return this.message;
        }
    }
}
