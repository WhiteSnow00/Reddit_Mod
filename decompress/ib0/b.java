// 
// Decompiled by Procyon v0.6.0
// 

package ib0;

import com.reddit.domain.discover.usecase.UpdateDiscoverFeedItemUseCase;
import com.reddit.domain.languageselection.ContentLanguagesDataSource;
import mr0.g;
import com.reddit.domain.media.usecase.VideoLogsUseCase;
import ff0.h;
import ff0.i0;
import ff0.z0;
import v12.m;
import com.reddit.events.announcement.AnnouncementAnalytics;
import com.reddit.events.auth.PhoneAnalytics;
import mg0.p;
import com.reddit.events.crowdsourcetagging.RedditCommunityCrowdsourceGeoTaggingAnalytics;
import com.reddit.events.home.HomeScreenAnalytics;
import com.reddit.events.marketplace.MarketplaceAnalytics;
import vh0.l;
import com.reddit.events.onboarding.LanguageSelectionAnalytics;
import com.reddit.events.postchaining.PostChainingV3Analytics;
import com.reddit.events.powerups.PowerupsAnalytics;
import com.reddit.events.settings.ContentLanguagesAnalytics;
import com.reddit.events.sociallinks.SocialLinksAnalytics;
import si0.f;
import com.reddit.events.topic.TopicAnalytics;
import l40.e;
import fj0.c;
import fj0.a;
import com.reddit.feature.fullbleedplayer.FBPLocalSubredditSubscriptionManager;
import xd0.g0;
import ok0.n;
import javax.inject.Provider;
import se2.d;

public final class b implements d
{
    public final /* synthetic */ int a;
    public final Provider b;
    
    public static b a(final Provider provider) {
        return new b(provider, 21);
    }
    
    public static b b(final Provider provider) {
        return new b(provider, 25);
    }
    
    public final Object get() {
        switch (this.a) {
            default: {
                return new n((nk0.d)this.b.get());
            }
            case 28: {
                return new FBPLocalSubredditSubscriptionManager((g0)this.b.get());
            }
            case 27: {
                return new c((a)this.b.get());
            }
            case 26: {
                return new TopicAnalytics((e)this.b.get());
            }
            case 25: {
                return new f((e)this.b.get());
            }
            case 24: {
                return new SocialLinksAnalytics((e)this.b.get());
            }
            case 23: {
                return new ContentLanguagesAnalytics((e)this.b.get());
            }
            case 22: {
                return new mi0.a((e)this.b.get());
            }
            case 21: {
                return new ki0.c((e)this.b.get());
            }
            case 20: {
                return new PowerupsAnalytics((e)this.b.get());
            }
            case 19: {
                return new PostChainingV3Analytics((e)this.b.get());
            }
            case 18: {
                return new LanguageSelectionAnalytics((e)this.b.get());
            }
            case 17: {
                return new zh0.a((e)this.b.get());
            }
            case 16: {
                return new l((e)this.b.get());
            }
            case 15: {
                return new MarketplaceAnalytics((e)this.b.get());
            }
            case 14: {
                return new HomeScreenAnalytics((e)this.b.get());
            }
            case 13: {
                return new RedditCommunityCrowdsourceGeoTaggingAnalytics((e)this.b.get());
            }
            case 12: {
                return new vg0.a((e)this.b.get());
            }
            case 11: {
                return new p((e)this.b.get());
            }
            case 10: {
                return new PhoneAnalytics((e)this.b.get());
            }
            case 9: {
                return new AnnouncementAnalytics((e)this.b.get());
            }
            case 8: {
                return new hf0.l((m)this.b.get());
            }
            case 7: {
                return new z0((m20.b)this.b.get());
            }
            case 6: {
                return new i0((p10.a)this.b.get());
            }
            case 5: {
                return new h((g0)this.b.get());
            }
            case 4: {
                return new ff0.d((xd0.b)this.b.get());
            }
            case 3: {
                return new pe0.d((pe0.a)this.b.get());
            }
            case 2: {
                return new VideoLogsUseCase((cw0.a)this.b.get());
            }
            case 1: {
                return new ContentLanguagesDataSource((g)this.b.get());
            }
            case 0: {
                return new UpdateDiscoverFeedItemUseCase((gb0.a)this.b.get());
            }
        }
    }
}
