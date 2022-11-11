// 
// Decompiled by Procyon v0.6.0
// 

package q30;

import android.os.Handler;
import okhttp3.Call$Factory;
import com.reddit.data.RedditReportFormDataRepository;
import com.reddit.data.customemojis.RemoteGqlCustomEmojiDataSource;
import okhttp3.OkHttpClient;
import com.reddit.data.remote.RemoteGqlHistoryDataSourceImpl;
import com.reddit.data.remote.RemoteGqlStreamDataSource;
import com.reddit.data.model.graphql.GqlPostToLinkDomainModelMapper;
import com.reddit.data.repository.RedditPopularPreloadListingRepository;
import va0.b0;
import com.reddit.data.remote.RemoteGqlLinkDataSource;
import com.reddit.data.snoovatar.mapper.storefront.RedditLegacyStorefrontGqlToDomainMapper;
import com.reddit.data.snoovatar.mapper.storefront.StorefrontListingGqlToDomainMapper;
import com.reddit.data.usecase.RedditUploadProfileImageUseCase;
import w50.d0;
import xd0.m;
import android.net.ConnectivityManager$NetworkCallback;
import android.net.ConnectivityManager;
import ad.c0;
import android.content.BroadcastReceiver;
import java.util.concurrent.Executors;
import com.google.android.exoplayer2.upstream.e$a;
import com.reddit.video.player.internal.player.VideoCache;
import nu2.j$a;
import u90.i0;
import nu2.x$b;
import com.squareup.moshi.y;
import com.reddit.domain.chat.performance.RedditChatInboxPerformanceTracker;
import android.content.Context;
import f22.p;
import com.reddit.domain.usecase.GetLocalPredictionTournamentPostUseCase;
import com.reddit.domain.usecase.ModNotificationSettingsUseCase;
import com.reddit.domain.repository.NotificationSettingsRepository;
import ff0.w0;
import com.reddit.domain.usecase.submit.GalleryPostSubmitStrategy;
import xd0.r;
import com.reddit.events.video.RedditVideoAnalytics;
import ff0.r1;
import va0.f0;
import com.reddit.frontpage.presentation.detail.crosspost.image.CrossPostImageDetailPresenter;
import sg2.e;
import com.reddit.frontpage.domain.usecase.MapLinksUseCase;
import us0.g;
import qp1.h;
import v12.f;
import ga0.c;
import su1.i;
import va0.w;
import com.reddit.search.screens.composables.RedditSafeSearchObserver;
import qn1.j;
import xd0.s;
import z50.o1;
import com.reddit.session.Session;
import f40.a;
import javax.inject.Provider;
import se2.d;

public final class b implements d
{
    public final /* synthetic */ int a;
    public final Provider b;
    public final Provider c;
    public final Provider d;
    
    public static b a(final Provider provider, final Provider provider2, final Provider provider3) {
        return new b(provider, provider2, provider3, 17);
    }
    
    public static b b(final Provider provider, final Provider provider2, final a a) {
        return new b(provider, provider2, (Provider)a, 21);
    }
    
    public final Object get() {
        switch (this.a) {
            default: {
                return new b42.b((rg2.a)this.b.get(), (e42.b)this.c.get(), (v12.d)this.d.get());
            }
            case 28: {
                return new cx1.b((Session)this.b.get(), (com.reddit.session.a)this.c.get(), (rg2.a)this.d.get());
            }
            case 27: {
                return new RedditSafeSearchObserver((o1)this.b.get(), (s)this.c.get(), (j)this.d.get());
            }
            case 26: {
                return new i((rg2.a)this.b.get(), (w)this.c.get(), (ic0.d)this.d.get());
            }
            case 25: {
                return new h((c)this.b.get(), (m20.b)this.c.get(), (f)this.d.get());
            }
            case 24: {
                return new xc1.b((ic0.d)this.c.get(), (com.reddit.session.a)this.d.get(), (rg2.a)this.b.get());
            }
            case 23: {
                return new pw0.a(se2.c.a(this.b), (g)this.c.get(), (n20.a)this.d.get());
            }
            case 22: {
                return new com.reddit.frontpage.presentation.detail.b((el0.b)this.b.get(), (bm0.o1)this.c.get(), (a20.a)this.d.get());
            }
            case 21: {
                return new com.reddit.frontpage.domain.usecase.a((xd0.j)this.b.get(), (MapLinksUseCase)this.c.get(), (js1.d)this.d.get());
            }
            case 20: {
                final dm0.b b = (dm0.b)this.b.get();
                final em0.a a = (em0.a)this.c.get();
                final xd0.j j = (xd0.j)this.d.get();
                e.f((Object)b, "navigator");
                e.f((Object)a, "params");
                e.f((Object)j, "linkRepository");
                return new CrossPostImageDetailPresenter(a, b, j);
            }
            case 19: {
                return new RedditVideoAnalytics((l40.e)this.b.get(), (f0)this.c.get(), (r1)this.d.get());
            }
            case 18: {
                return new GalleryPostSubmitStrategy((r)this.b.get(), (m20.b)this.c.get(), (a20.a)this.d.get());
            }
            case 17: {
                return new r1((m20.b)this.b.get(), (us0.s)this.c.get(), (i41.a)this.d.get());
            }
            case 16: {
                return new w0((xd0.j)this.b.get(), (n20.a)this.c.get(), (cv.a)this.d.get());
            }
            case 15: {
                return new ModNotificationSettingsUseCase((NotificationSettingsRepository)this.b.get(), (m20.b)this.c.get(), (a20.a)this.d.get());
            }
            case 14: {
                return new GetLocalPredictionTournamentPostUseCase((xd0.j)this.b.get(), (n20.a)this.c.get(), (a20.a)this.d.get());
            }
            case 13: {
                return new RedditChatInboxPerformanceTracker((p)this.b.get(), (Context)this.c.get(), (a22.c)this.d.get());
            }
            case 12: {
                final pe2.a a2 = se2.c.a(this.b);
                final g g = (g)this.c.get();
                final y y = (y)this.d.get();
                e.f((Object)a2, "client");
                e.f((Object)g, "hostSettings");
                e.f((Object)y, "moshi");
                final x$b x$b = new x$b();
                x$b.b = (Call$Factory)new i0(a2);
                x$b.c(g.m());
                x$b.b((j$a)qu2.a.a(y));
                x$b.a(new ou2.g());
                return x$b.d();
            }
            case 11: {
                final Context context = (Context)this.b.get();
                final f0 f0 = (f0)this.c.get();
                final cw0.a a3 = (cw0.a)this.d.get();
                e.f((Object)context, "context");
                e.f((Object)f0, "videoFeatures");
                e.f((Object)a3, "redditLogger");
                final ya.c c = new ya.c(context);
                final com.google.android.exoplayer2.upstream.cache.c cache = VideoCache.Companion.getInstance().getCache(context, a3);
                if (cache != null) {
                    final yb.d d = new yb.d(context, c, cache, new e$a(), Executors.newSingleThreadExecutor());
                    if (d.g != 1) {
                        d.g = 1;
                        ++d.e;
                        ((Handler)d.b).obtainMessage(4, 1, 0).sendToTarget();
                    }
                    final zb.a a4 = new zb.a(0);
                    if (!a4.equals((Object)d.l.c)) {
                        final zb.b l = d.l;
                        final Context a5 = l.a;
                        final zb.b.b$a e = l.e;
                        e.getClass();
                        a5.unregisterReceiver((BroadcastReceiver)e);
                        l.e = null;
                        if (c0.a >= 24 && l.g != null) {
                            final ConnectivityManager connectivityManager = (ConnectivityManager)l.a.getSystemService("connectivity");
                            connectivityManager.getClass();
                            final zb.b.b$c g2 = l.g;
                            g2.getClass();
                            connectivityManager.unregisterNetworkCallback((ConnectivityManager$NetworkCallback)g2);
                            l.g = null;
                        }
                        final zb.b i = new zb.b(d.a, d.c, a4);
                        d.b(d.l = i, i.b());
                    }
                    return d;
                }
                throw new IllegalStateException("Video cache unavailable for use with prefetching.");
            }
            case 10: {
                return new RedditUploadProfileImageUseCase((m)this.b.get(), (d0)this.c.get(), (a20.a)this.d.get());
            }
            case 9: {
                return new RedditLegacyStorefrontGqlToDomainMapper((p60.i)this.c.get(), (StorefrontListingGqlToDomainMapper)this.b.get(), (cw0.a)this.d.get());
            }
            case 8: {
                return new j60.b(se2.c.a(this.b), (g)this.c.get(), (n20.a)this.d.get());
            }
            case 7: {
                return new RedditPopularPreloadListingRepository((RemoteGqlLinkDataSource)this.b.get(), (b0)this.c.get(), (s)this.d.get());
            }
            case 6: {
                return new RemoteGqlStreamDataSource((mr0.g)this.b.get(), (y)this.c.get(), (GqlPostToLinkDomainModelMapper)this.d.get());
            }
            case 5: {
                return new RemoteGqlHistoryDataSourceImpl((mr0.g)this.b.get(), (y)this.c.get(), (GqlPostToLinkDomainModelMapper)this.d.get());
            }
            case 4: {
                return new m50.c((Context)this.b.get(), (x71.b)this.c.get(), (x71.a)this.d.get());
            }
            case 3: {
                return new p40.b((pe2.a<OkHttpClient>)se2.c.a(this.b), (g)this.c.get(), (n20.a)this.d.get());
            }
            case 2: {
                return new RemoteGqlCustomEmojiDataSource((mr0.g)this.b.get(), (d0)this.c.get(), (a20.a)this.d.get());
            }
            case 1: {
                return new y30.j((xd0.j)this.b.get(), (n20.a)this.c.get(), (w70.d)this.d.get());
            }
            case 0: {
                return new RedditReportFormDataRepository((mr0.g)this.b.get(), (a20.a)this.c.get(), (cw0.a)this.d.get());
            }
        }
    }
}
