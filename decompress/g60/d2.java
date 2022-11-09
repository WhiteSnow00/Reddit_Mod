// 
// Decompiled by Procyon v0.6.0
// 

package g60;

import okhttp3.OkHttpClient$Builder;
import com.reddit.data.repository.RedditStreamRepository;
import db0.d0;
import n22.p;
import c50.n0;
import com.reddit.data.mapper.StreamingPostTransformer;
import com.squareup.moshi.y;
import c50.m0;
import com.reddit.data.remote.RemoteStreamDataSource;
import com.reddit.data.remote.RemoteGqlStreamDataSource;
import com.reddit.comment.ui.action.CommentModerationDelegate;
import com.reddit.comment.ui.presentation.CommentsTree;
import ge0.e;
import com.reddit.events.blocked.BlockedAccountsAnalytics;
import com.reddit.events.comment.CommentAnalytics;
import com.reddit.session.q;
import v10.i;
import kz0.k;
import ah2.c;
import okhttp3.ConnectionSpec;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import com.reddit.screen.listing.subreddit_leaderboard.SubredditLeaderboardPresenter;
import com.reddit.utilityscreens.select_option.navigator.SelectOptionNavigator;
import of0.p1;
import ge0.o0;
import r20.a;
import com.reddit.domain.usecase.f;
import com.reddit.screen.listing.subreddit_leaderboard.mapper.SubredditLeaderboardStateMapper;
import mg1.b;
import javax.inject.Provider;
import af2.d;

public final class d2 implements d
{
    public final /* synthetic */ int a;
    public final Provider b;
    public final Provider c;
    public final Provider d;
    public final Provider e;
    public final Provider f;
    public final Provider g;
    public final Provider h;
    public final Provider i;
    public final Provider j;
    public final Provider k;
    public final Provider l;
    
    public final Object get() {
        switch (this.a) {
            default: {
                return new SubredditLeaderboardPresenter((b)this.b.get(), (SubredditLeaderboardStateMapper)this.c.get(), (f)this.d.get(), (a)this.e.get(), (o0)this.f.get(), (p1)this.g.get(), (qg1.a)this.h.get(), (SelectOptionNavigator)this.i.get(), (q20.b)this.j.get(), (fj0.a)this.k.get(), (e20.a)this.l.get());
            }
            case 2: {
                final m41.b b = (m41.b)this.b.get();
                final OkHttpClient okHttpClient = (OkHttpClient)this.c.get();
                final Interceptor interceptor = (Interceptor)this.d.get();
                final Interceptor interceptor2 = (Interceptor)this.e.get();
                final Interceptor interceptor3 = (Interceptor)this.f.get();
                final Interceptor interceptor4 = (Interceptor)this.g.get();
                final Interceptor interceptor5 = (Interceptor)this.h.get();
                final Interceptor interceptor6 = (Interceptor)this.i.get();
                final Interceptor interceptor7 = (Interceptor)this.j.get();
                final Interceptor interceptor8 = (Interceptor)this.k.get();
                final Interceptor interceptor9 = (Interceptor)this.l.get();
                ah2.f.f((Object)b, "networkFeatures");
                ah2.f.f((Object)okHttpClient, "okHttpClient");
                ah2.f.f((Object)interceptor, "sessionInterceptor");
                ah2.f.f((Object)interceptor2, "userAgentInterceptor");
                ah2.f.f((Object)interceptor3, "requestRetryInterceptor");
                ah2.f.f((Object)interceptor5, "imageAcceptHeaderInterceptor");
                ah2.f.f((Object)interceptor6, "imageMetricsInterceptor");
                ah2.f.f((Object)interceptor7, "analyticsInterceptor");
                ah2.f.f((Object)interceptor8, "gzipCompressionInterceptor");
                ah2.f.f((Object)interceptor9, "mediaHeadersInterceptor");
                final OkHttpClient$Builder builder = okHttpClient.newBuilder();
                builder.retryOnConnectionFailure(false);
                builder.addInterceptor(interceptor3);
                builder.addInterceptor(interceptor);
                builder.addInterceptor(interceptor7);
                builder.connectionSpecs(ah2.c.X((Object)ConnectionSpec.COMPATIBLE_TLS));
                builder.addInterceptor(interceptor2);
                builder.addInterceptor(interceptor5);
                if (b.N9()) {
                    builder.addInterceptor(interceptor6);
                }
                builder.addInterceptor(interceptor8);
                builder.addInterceptor(interceptor9);
                if (interceptor4 != null) {
                    bv2.a.a.i("NetworkModule: Adding MockGeolocation interceptor. Geolocation mocked.", new Object[0]);
                    builder.addInterceptor(interceptor4);
                }
                final OkHttpClient build = builder.build();
                kz0.k.P((Object)build);
                return build;
            }
            case 1: {
                final i i = (i)this.b.get();
                final oa0.d d = (oa0.d)this.c.get();
                final q q = (q)this.d.get();
                final v10.c c = (v10.c)this.e.get();
                final r20.c c2 = (r20.c)this.f.get();
                final t10.a a = (t10.a)this.g.get();
                final CommentAnalytics commentAnalytics = (CommentAnalytics)this.h.get();
                final q20.c c3 = (q20.c)this.i.get();
                final BlockedAccountsAnalytics blockedAccountsAnalytics = (BlockedAccountsAnalytics)this.j.get();
                final e e = (e)this.k.get();
                final CommentsTree commentsTree = (CommentsTree)this.l.get();
                ah2.f.f((Object)i, "view");
                ah2.f.f((Object)d, "accountUtilDelegate");
                ah2.f.f((Object)q, "sessionManager");
                ah2.f.f((Object)c, "commentDetailActions");
                ah2.f.f((Object)c2, "postExecutionThread");
                ah2.f.f((Object)a, "commentRepository");
                ah2.f.f((Object)commentAnalytics, "commentAnalytics");
                ah2.f.f((Object)c3, "resourceProvider");
                ah2.f.f((Object)blockedAccountsAnalytics, "blockedAccountsAnalytics");
                ah2.f.f((Object)e, "blockedAccountRepository");
                ah2.f.f((Object)commentsTree, "commentsTree");
                return new CommentModerationDelegate(i, d, q, c, c2, a, commentAnalytics, c3, blockedAccountsAnalytics, e, commentsTree);
            }
            case 0: {
                return new RedditStreamRepository((cb0.k)this.b.get(), (RemoteGqlStreamDataSource)this.c.get(), (RemoteStreamDataSource)this.d.get(), (m0)this.e.get(), (c50.o0)this.f.get(), (y)this.g.get(), (a)this.h.get(), (StreamingPostTransformer)this.i.get(), (n0)this.j.get(), (p)this.k.get(), (d0)this.l.get());
            }
        }
    }
}
