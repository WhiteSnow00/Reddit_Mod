// 
// Decompiled by Procyon v0.6.0
// 

package hg0;

import com.reddit.common.experiments.model.design.SortViewControlVariant;
import ej2.r1;
import com.reddit.events.account.UpcAnalytics;
import com.reddit.events.auth.AuthAnalytics;
import com.reddit.events.comment.CommentAnalytics;
import com.reddit.events.community.CommunityPostTypesSettingsAnalytics;
import jh0.m;
import com.reddit.events.survey.SurveyAnalytics;
import com.reddit.data.remote.RemoteFlairDataSource;
import nu2.x;
import com.reddit.listing.common.ListingType;
import com.reddit.listing.model.sort.SortTimeFrame;
import com.reddit.listing.model.sort.SortType;
import com.reddit.frontpage.di.module.a$a;
import va0.h;
import com.reddit.frontpage.presentation.listing.common.AdDistanceAndDuplicateLinkFilterMetadataHelper;
import com.reddit.io.MediaFileInteractor;
import bt0.k;
import android.content.SharedPreferences;
import com.reddit.marketplace.impl.data.mapper.InventoryItemGqlToDomainMapper;
import com.reddit.meta.badge.RemoteBadgeIndicatorsDataSource;
import ej2.g;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContext$DefaultImpls;
import lg.e0;
import u21.b;
import m41.p;
import sg2.e;
import com.reddit.network.interceptor.StagingCookieInterceptor;
import com.reddit.events.postbodytext.PostBodyTextAnalytics;
import com.reddit.presence.RedditLocalUserOnlineStatusUseCase;
import g81.y;
import b91.c;
import xd0.s;
import yb1.a;
import android.content.Context;
import javax.inject.Provider;
import se2.d;

public final class f implements d
{
    public final /* synthetic */ int a;
    public final Provider b;
    
    public static f a(final Provider provider) {
        return new f(provider, 17);
    }
    
    public static f b(final Provider provider) {
        return new f(provider, 2);
    }
    
    public static f c(final Provider provider) {
        return new f(provider, 28);
    }
    
    public static f d(final Provider provider) {
        return new f(provider, 3);
    }
    
    public static f e(final Provider provider) {
        return new f(provider, 6);
    }
    
    public final Object get() {
        switch (this.a) {
            default: {
                return new a((Context)this.b.get());
            }
            case 28: {
                return new c((s)this.b.get());
            }
            case 27: {
                return new RedditLocalUserOnlineStatusUseCase((y)this.b.get());
            }
            case 26: {
                return new y51.d((PostBodyTextAnalytics)this.b.get());
            }
            case 25: {
                return new StagingCookieInterceptor((Context)this.b.get());
            }
            case 24: {
                final cw0.a a = (cw0.a)this.b.get();
                e.f((Object)a, "logger");
                return new p(a);
            }
            case 23: {
                return new b((rg2.a)this.b.get());
            }
            case 22: {
                final a20.a a2 = (a20.a)this.b.get();
                e.f((Object)a2, "dispatcherProvider");
                final mj2.a c = a2.c();
                final r1 g = e0.g();
                c.getClass();
                return ej2.g.a(CoroutineContext$DefaultImpls.a((CoroutineContext)c, (CoroutineContext)g));
            }
            case 21: {
                return new RemoteBadgeIndicatorsDataSource((mr0.g)this.b.get());
            }
            case 20: {
                return new InventoryItemGqlToDomainMapper((cw0.a)this.b.get());
            }
            case 19: {
                return new k((SharedPreferences)this.b.get());
            }
            case 18: {
                return new MediaFileInteractor((rg2.a)this.b.get());
            }
            case 17: {
                return new AdDistanceAndDuplicateLinkFilterMetadataHelper((l40.e)this.b.get());
            }
            case 16: {
                final h h = (h)this.b.get();
                e.f((Object)h, "feedsFeatures");
                final SortViewControlVariant s1 = h.s1();
                int n;
                if (s1 == null) {
                    n = -1;
                }
                else {
                    n = a$a.a[((Enum)s1).ordinal()];
                }
                SortType sortType;
                if (n == 1) {
                    sortType = SortType.BEST;
                }
                else {
                    sortType = SortType.BEST;
                }
                return new gu0.d(new ie.e0(sortType, (SortTimeFrame)null), ListingType.HOME);
            }
            case 15: {
                return al0.a.g((x)this.b.get(), "client", (Class)RemoteFlairDataSource.class, "client.create(RemoteFlairDataSource::class.java)");
            }
            case 14: {
                return new ok0.k((nk0.d)this.b.get());
            }
            case 13: {
                final rg2.a a3 = (rg2.a)this.b.get();
                e.f((Object)a3, "supplier");
                final ua0.c c2 = a3.invoke();
                ui.b.o((Object)c2);
                return c2;
            }
            case 12: {
                return new vj0.c((ty0.b)this.b.get());
            }
            case 11: {
                return new ij0.f((int)this.b.get());
            }
            case 10: {
                return new SurveyAnalytics((l40.e)this.b.get());
            }
            case 9: {
                return new PostBodyTextAnalytics((l40.e)this.b.get());
            }
            case 8: {
                return new bi0.a((l40.e)this.b.get());
            }
            case 7: {
                return new th0.e((l40.e)this.b.get());
            }
            case 6: {
                return new lh0.f((l40.e)this.b.get());
            }
            case 5: {
                return new m((l40.e)this.b.get());
            }
            case 4: {
                return new CommunityPostTypesSettingsAnalytics((l40.e)this.b.get());
            }
            case 3: {
                return new CommentAnalytics((l40.e)this.b.get());
            }
            case 2: {
                return new AuthAnalytics((l40.e)this.b.get());
            }
            case 1: {
                return new UpcAnalytics((l40.e)this.b.get());
            }
            case 0: {
                return new hg0.e((l40.e)this.b.get());
            }
        }
    }
}
