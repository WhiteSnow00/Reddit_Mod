// 
// Decompiled by Procyon v0.6.0
// 

package w30;

import okhttp3.Call$Factory;
import com.reddit.data.RedditReportFormDataRepository;
import com.reddit.data.customemojis.RemoteGqlCustomEmojiDataSource;
import d60.d0;
import com.reddit.data.meta.remote.RemoteMetaBadgesDataSource;
import db0.l;
import com.reddit.domain.usecase.MockFeedElementUseCase;
import com.reddit.data.postsubmit.remote.RemoteGqlPostRequirementsDataSource;
import com.reddit.data.model.graphql.GqlFragmentsMapper;
import com.reddit.data.premium.datasource.remote.RemoteGqlPremiumDataSource;
import db0.g0;
import com.reddit.screen.heartbeat.HeartbeatManager;
import com.reddit.screen.BaseScreen;
import kz0.k;
import com.reddit.db.RedditRoomDatabase;
import com.reddit.domain.usecase.ChangeAccountUsernameUseCase;
import of0.w;
import android.content.Context;
import of0.x0;
import com.reddit.domain.usecase.SubredditTaggingQuestionsUseCase;
import ge0.o0;
import com.reddit.dynamicconfig.impl.cache.RoomDBFileSystemCache;
import com.reddit.dynamicconfig.impl.DynamicConfigMapper;
import com.reddit.dynamicconfig.impl.cache.db.DynamicConfigDB;
import ge0.u;
import com.reddit.session.Session;
import com.reddit.frontpage.presentation.detail.crosspost.small.CrossPostSmallDetailPresenter;
import com.reddit.frontpage.presentation.listing.common.RedditModeratorCommentActions;
import com.reddit.frontpage.presentation.detail.self.SelfDetailPresenter;
import ge0.r;
import ie0.h;
import com.reddit.events.predictions.PredictionsAnalytics;
import com.reddit.screen.predictions.resolve.PredictionResolveSheetPresenter;
import fn1.q;
import com.reddit.domain.snoovatar.repository.SnoovatarRepository;
import ix1.m;
import com.reddit.data.adapter.NotificationSettingsConverter;
import ca0.b0;
import wu2.j$a;
import okhttp3.OkHttpClient;
import xe2.a;
import ca0.h0;
import wu2.x$b;
import ah2.f;
import bt0.g;
import com.squareup.moshi.y;
import af2.c;
import wu2.x;
import javax.inject.Provider;
import af2.d;

public final class b implements d
{
    public final /* synthetic */ int a;
    public final Provider b;
    public final Provider c;
    public final Provider d;
    
    public final x a() {
        switch (this.a) {
            default: {
                final a a = af2.c.a(this.b);
                final y y = (y)this.c.get();
                final g g = (g)this.d.get();
                f.f((Object)a, "client");
                f.f((Object)y, "moshi");
                f.f((Object)g, "hostSettings");
                final x$b x$b = new x$b();
                x$b.b = (Call$Factory)new h0((a<OkHttpClient>)a);
                x$b.c(g.Z());
                x$b.a(new xu2.g());
                x$b.b((j$a)zu2.a.a(y));
                return x$b.d();
            }
            case 10: {
                final a a2 = af2.c.a(this.b);
                final y y2 = (y)this.c.get();
                final g g2 = (g)this.d.get();
                f.f((Object)a2, "client");
                f.f((Object)y2, "moshi");
                f.f((Object)g2, "hostSettings");
                final x$b x$b2 = new x$b();
                x$b2.b = (Call$Factory)new b0((a<OkHttpClient>)a2);
                x$b2.c(g2.R());
                x$b2.a(new xu2.g());
                x$b2.b((j$a)new NotificationSettingsConverter(y2));
                x$b2.b((j$a)zu2.a.a(y2));
                return x$b2.d();
            }
        }
    }
    
    public final Object get() {
        switch (this.a) {
            default: {
                final zg2.a a = (zg2.a)this.b.get();
                final rc0.d d = (rc0.d)this.c.get();
                final m m = (m)this.d.get();
                f.f((Object)a, "getContext");
                f.f((Object)d, "screenNavigator");
                f.f((Object)m, "shareLinkHelper");
                return new zr1.b(a, d, m);
            }
            case 28: {
                return new q((SnoovatarRepository)this.b.get(), (fn1.a)this.c.get(), (af0.f)this.d.get());
            }
            case 27: {
                return new PredictionResolveSheetPresenter((ck1.c)this.b.get(), (ck1.a)this.c.get(), (xd0.c)this.d.get());
            }
            case 26: {
                return new sj1.a((wd0.a)this.b.get(), (PredictionsAnalytics)this.c.get(), (h)this.d.get());
            }
            case 25: {
                return new ge1.c((rc0.d)this.c.get(), (com.reddit.session.a)this.d.get(), (zg2.a)this.b.get());
            }
            case 24: {
                return new ww0.a(af2.c.a(this.b), (g)this.c.get(), (r20.a)this.d.get());
            }
            case 23: {
                final xm0.d d2 = (xm0.d)this.b.get();
                final xm0.b b = (xm0.b)this.c.get();
                final r r = (r)this.d.get();
                f.f((Object)d2, "navigator");
                f.f((Object)b, "params");
                f.f((Object)r, "linkRepository");
                return new SelfDetailPresenter(r, b, d2);
            }
            case 22: {
                final r r2 = (r)this.b.get();
                final t10.a a2 = (t10.a)this.c.get();
                final r20.c c = (r20.c)this.d.get();
                f.f((Object)r2, "repository");
                f.f((Object)a2, "commentRepository");
                f.f((Object)c, "postExecutionThread");
                return new RedditModeratorCommentActions(r2, a2, c);
            }
            case 21: {
                final nm0.a a3 = (nm0.a)this.b.get();
                final pm0.a a4 = (pm0.a)this.c.get();
                final r r3 = (r)this.d.get();
                f.f((Object)a3, "navigator");
                f.f((Object)a4, "params");
                f.f((Object)r3, "linkRepository");
                return new CrossPostSmallDetailPresenter(a3, a4, r3);
            }
            case 20: {
                return new nj0.c((mj0.d)this.b.get(), (r20.a)this.c.get(), (com.reddit.session.q)this.d.get());
            }
            case 19: {
                return new ig0.a((Session)this.b.get(), (bt0.a)this.c.get(), (u)this.d.get());
            }
            case 18: {
                return new RoomDBFileSystemCache((DynamicConfigDB)this.b.get(), (e20.a)this.c.get(), (DynamicConfigMapper)this.d.get());
            }
            case 17: {
                return new SubredditTaggingQuestionsUseCase((o0)this.b.get(), (q20.b)this.c.get(), (e20.a)this.d.get());
            }
            case 16: {
                return new x0((r)this.b.get(), (r20.a)this.c.get(), (gv.a)this.d.get());
            }
            case 15: {
                return new w((r)this.b.get(), (Context)this.c.get(), (i22.c)this.d.get());
            }
            case 14: {
                return new com.reddit.domain.usecase.a((o0)this.b.get(), (q20.b)this.c.get(), (r20.a)this.d.get());
            }
            case 13: {
                return new ChangeAccountUsernameUseCase((u)this.b.get(), (com.reddit.session.q)this.c.get(), (e20.a)this.d.get());
            }
            case 12: {
                final Context context = (Context)this.b.get();
                final com.reddit.session.r r4 = (com.reddit.session.r)this.c.get();
                final jw0.a a5 = (jw0.a)this.d.get();
                f.f((Object)context, "context");
                f.f((Object)r4, "sessionView");
                f.f((Object)a5, "logger");
                final Object o = RedditRoomDatabase.o;
                final RedditRoomDatabase c2 = RedditRoomDatabase.a.c(context, (Session)r4.c(), a5);
                k.P((Object)c2);
                return c2;
            }
            case 11: {
                return this.a();
            }
            case 10: {
                return this.a();
            }
            case 9: {
                final BaseScreen baseScreen = (BaseScreen)this.b.get();
                final vh0.b b2 = (vh0.b)this.c.get();
                final t20.a a6 = (t20.a)this.d.get();
                f.f((Object)baseScreen, "screen");
                f.f((Object)b2, "heartbeatAnalytics");
                f.f((Object)a6, "threadHelper");
                return new HeartbeatManager(baseScreen, b2, a6, true);
            }
            case 8: {
                final uf0.a a7 = (uf0.a)this.b.get();
                final pf0.a a8 = (pf0.a)this.c.get();
                final g0 g0 = (g0)this.d.get();
                f.f((Object)a7, "voteRepository");
                f.f((Object)a8, "getVoteScoreUseCase");
                f.f((Object)g0, "videoFeatures");
                return new jc0.a(a7, a8, g0);
            }
            case 7: {
                return new RemoteGqlPremiumDataSource((ur0.g)this.b.get(), (y)this.c.get(), (be0.a)this.d.get());
            }
            case 6: {
                return new RemoteGqlPostRequirementsDataSource((ur0.g)this.b.get(), (y)this.c.get(), (GqlFragmentsMapper)this.d.get());
            }
            case 5: {
                return new o50.a((MockFeedElementUseCase)this.b.get(), (OkHttpClient)this.c.get(), (l)this.d.get());
            }
            case 4: {
                return new com.reddit.data.meta.repository.a((r20.a)this.b.get(), (RemoteMetaBadgesDataSource)this.c.get(), (nc0.d)this.d.get());
            }
            case 3: {
                return new w40.b(af2.c.a(this.b), (g)this.c.get(), (r20.a)this.d.get());
            }
            case 2: {
                return new RemoteGqlCustomEmojiDataSource((ur0.g)this.b.get(), (d0)this.c.get(), (e20.a)this.d.get());
            }
            case 1: {
                return new e40.m((r)this.b.get(), (r20.a)this.c.get(), (e80.d)this.d.get());
            }
            case 0: {
                return new RedditReportFormDataRepository((ur0.g)this.b.get(), (e20.a)this.c.get(), (jw0.a)this.d.get());
            }
        }
    }
}
