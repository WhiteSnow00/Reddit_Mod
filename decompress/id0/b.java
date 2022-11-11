// 
// Decompiled by Procyon v0.6.0
// 

package id0;

import re0.v;
import com.reddit.domain.snoovatar.repository.SnoovatarRepository;
import ff0.b0;
import com.reddit.events.badge.BadgeAnalytics;
import kg0.h;
import androidx.room.RoomDatabase;
import java.util.ArrayList;
import androidx.room.g;
import com.reddit.events.data.db.AnalyticsDatabase;
import com.reddit.events.newcommunityprogress.RedditNewCommunityProgressAnalytics;
import com.reddit.events.onboardingchaining.OnboardingChainingAnalytics;
import com.reddit.events.postsets.PostSetAnalytics;
import com.reddit.events.predictions.PredictionsAnalytics;
import com.reddit.events.settings.ModNotificationsSettingsAnalytics;
import com.reddit.events.trophy.TrophyAnalytics;
import ok0.y;
import ok0.v0;
import si0.f;
import com.reddit.frontpage.presentation.detail.CommentIndentMapper;
import uq0.j;
import yr0.c;
import android.content.Context;
import ss0.a;
import l40.e;
import javax.inject.Provider;
import se2.d;

public final class b implements d
{
    public final /* synthetic */ int a;
    public final Provider b;
    
    public static b a() {
        return new b((Provider)d$a.a, 0);
    }
    
    public static b b(final Provider provider) {
        return new b(provider, 11);
    }
    
    public static b c(final Provider provider) {
        return new b(provider, 13);
    }
    
    public static b d(final Provider provider) {
        return new b(provider, 14);
    }
    
    public static b e(final Provider provider) {
        return new b(provider, 15);
    }
    
    public final Object get() {
        switch (this.a) {
            default: {
                return new a((e)this.b.get());
            }
            case 28: {
                return new is0.e((Context)this.b.get());
            }
            case 27: {
                return new c((e)this.b.get());
            }
            case 26: {
                final Context context = (Context)this.b.get();
                sg2.e.f((Object)context, "context");
                return new j(context);
            }
            case 25: {
                return new com.reddit.frontpage.presentation.meta.badges.b((rg2.a)this.b.get());
            }
            case 24: {
                return new CommentIndentMapper((m20.c)this.b.get());
            }
            case 23: {
                final e e = (e)this.b.get();
                sg2.e.f((Object)e, "eventSender");
                return new f(e);
            }
            case 22: {
                return com.reddit.frontpage.di.module.b.a((gu0.c)this.b.get());
            }
            case 21: {
                return new v0((nk0.d)this.b.get());
            }
            case 20: {
                return new y((nk0.d)this.b.get());
            }
            case 19: {
                return new TrophyAnalytics((e)this.b.get());
            }
            case 18: {
                return new ti0.b((e)this.b.get());
            }
            case 17: {
                return new ModNotificationsSettingsAnalytics((e)this.b.get());
            }
            case 16: {
                return new com.reddit.events.screen.a((e)this.b.get());
            }
            case 15: {
                return new PredictionsAnalytics((e)this.b.get());
            }
            case 14: {
                return new PostSetAnalytics((e)this.b.get());
            }
            case 13: {
                return new OnboardingChainingAnalytics((e)this.b.get());
            }
            case 12: {
                return new RedditNewCommunityProgressAnalytics((e)this.b.get());
            }
            case 11: {
                return new xh0.a((e)this.b.get());
            }
            case 10: {
                return new gh0.a((e)this.b.get());
            }
            case 9: {
                final Context context2 = (Context)this.b.get();
                sg2.e.f((Object)context2, "context");
                final Object m = AnalyticsDatabase.m;
                final AnalyticsDatabase n;
                if ((n = AnalyticsDatabase.n) == null) {
                    synchronized (AnalyticsDatabase.m) {
                        if (AnalyticsDatabase.n == null) {
                            final Context applicationContext = context2.getApplicationContext();
                            final RoomDatabase.a<AnalyticsDatabase> a = g.a(context2, AnalyticsDatabase.class, "analytics_v2");
                            final zg0.a a2 = new zg0.a(applicationContext);
                            if (a.d == null) {
                                a.d = new ArrayList<RoomDatabase.b>();
                            }
                            a.d.add((RoomDatabase.b)a2);
                            AnalyticsDatabase.n = a.b();
                        }
                    }
                }
                return n;
            }
            case 8: {
                return new tg0.a((e)this.b.get());
            }
            case 7: {
                return new rg0.g((h)this.b.get());
            }
            case 6: {
                return new ng0.a((e)this.b.get());
            }
            case 5: {
                return new BadgeAnalytics((e)this.b.get());
            }
            case 4: {
                return new lg0.c((e)this.b.get());
            }
            case 3: {
                return new b0((i41.a)this.b.get());
            }
            case 2: {
                return new ff0.a((xd0.b)this.b.get());
            }
            case 1: {
                return new v((SnoovatarRepository)this.b.get());
            }
            case 0: {
                return new id0.a((id0.c)this.b.get());
            }
        }
    }
}
