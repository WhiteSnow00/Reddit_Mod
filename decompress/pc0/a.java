// 
// Decompiled by Procyon v0.6.0
// 

package pc0;

import com.reddit.domain.onboarding.phoneselection.PhoneNumbersUseCaseImpl;
import android.content.Context;
import ff0.i;
import ff0.m0;
import xd0.j;
import ff0.h1;
import xd0.h0;
import ng0.p;
import com.reddit.events.comment.CommentAnalytics;
import wg0.b;
import com.reddit.events.crowdsourcetagging.RedditCommunityCrowdsourceGeoTaggingAnalytics;
import com.reddit.events.emailverification.EmailVerificationAnalytics;
import com.reddit.events.home.HomeScreenAnalytics;
import com.reddit.events.newcommunityprogressv2.NewCommunityProgressV2Analytics;
import com.reddit.events.onboardingchaining.OnboardingChainingAnalytics;
import com.reddit.events.postchaining.PostChainingV4Analytics;
import com.reddit.events.powerups.PowerupsAnalytics;
import com.reddit.events.recentchats.RecentChatAnalytics;
import com.reddit.events.settings.ModNotificationsSettingsAnalytics;
import com.reddit.events.sociallinks.SocialLinksAnalytics;
import com.reddit.events.trophy.TrophyAnalytics;
import zi0.k;
import lj0.f;
import com.reddit.features.delegates.NavDrawerFeaturesDelegate;
import rk0.u0;
import iu0.c;
import javax.inject.Provider;
import ne2.d;

public final class a implements d
{
    public final int a;
    public final Provider b;
    
    public a(final Provider b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    public static a a(final Provider provider) {
        return new a(provider, 15);
    }
    
    public static a b(final Provider provider) {
        return new a(provider, 17);
    }
    
    public static a c(final Provider provider) {
        return new a(provider, 4);
    }
    
    public static a d(final Provider provider) {
        return new a(provider, 6);
    }
    
    public final Object get() {
        switch (this.a) {
            default: {
                return com.reddit.frontpage.di.module.a.a((c)this.b.get());
            }
            case 28: {
                return new u0((qk0.d)this.b.get());
            }
            case 27: {
                return new NavDrawerFeaturesDelegate((qk0.d)this.b.get());
            }
            case 26: {
                return new f((int)this.b.get());
            }
            case 25: {
                return new ij0.c((ij0.a)this.b.get());
            }
            case 24: {
                return new k((n40.f)this.b.get());
            }
            case 23: {
                return new TrophyAnalytics((n40.f)this.b.get());
            }
            case 22: {
                return new SocialLinksAnalytics((n40.f)this.b.get());
            }
            case 21: {
                return new ModNotificationsSettingsAnalytics((n40.f)this.b.get());
            }
            case 20: {
                return new RecentChatAnalytics((n40.f)this.b.get());
            }
            case 19: {
                return new PowerupsAnalytics((n40.f)this.b.get());
            }
            case 18: {
                return new PostChainingV4Analytics((n40.f)this.b.get());
            }
            case 17: {
                return new OnboardingChainingAnalytics((n40.f)this.b.get());
            }
            case 16: {
                return new NewCommunityProgressV2Analytics((n40.f)this.b.get());
            }
            case 15: {
                return new zh0.a((n40.f)this.b.get());
            }
            case 14: {
                return new wh0.k((n40.f)this.b.get());
            }
            case 13: {
                return new HomeScreenAnalytics((n40.f)this.b.get());
            }
            case 12: {
                return new EmailVerificationAnalytics((n40.f)this.b.get());
            }
            case 11: {
                return new RedditCommunityCrowdsourceGeoTaggingAnalytics((n40.f)this.b.get());
            }
            case 10: {
                return new b((n40.f)this.b.get());
            }
            case 9: {
                return new ug0.a((n40.f)this.b.get());
            }
            case 8: {
                return new tg0.b((n40.f)this.b.get());
            }
            case 7: {
                return new rg0.b((n40.f)this.b.get());
            }
            case 6: {
                return new CommentAnalytics((n40.f)this.b.get());
            }
            case 5: {
                return new p((n40.f)this.b.get());
            }
            case 4: {
                return new h1((h0)this.b.get());
            }
            case 3: {
                return new m0((j)this.b.get());
            }
            case 2: {
                return new i((h0)this.b.get());
            }
            case 1: {
                return new pe0.d((pe0.a)this.b.get());
            }
            case 0: {
                return new PhoneNumbersUseCaseImpl((Context)this.b.get());
            }
        }
    }
}
