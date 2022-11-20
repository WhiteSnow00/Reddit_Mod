// 
// Decompiled by Procyon v0.6.0
// 

package qa0;

import va0.n;
import java.util.Set;
import com.reddit.domain.discover.usecase.UpdateDiscoverFeedItemUseCase;
import android.content.Context;
import pd0.o;
import pd0.i;
import com.reddit.domain.snoovatar.repository.SnoovatarRepository;
import com.reddit.domain.usecase.LinkFlow;
import xd0.j;
import ff0.e0;
import ff0.k0;
import ff0.r1;
import xd0.h0;
import com.reddit.data.remote.RemoteEmailVerificationDataDource;
import ku2.x;
import com.reddit.events.announcement.AnnouncementAnalytics;
import com.reddit.events.apprate.AppRateAnalytics;
import sg0.g;
import kg0.h;
import tg0.e;
import com.reddit.events.emailcollection.EmailCollectionAnalytics;
import com.reddit.events.launchericons.LauncherIconsAnalytics;
import com.reddit.events.mod.notes.ModNotesAnalytics;
import com.reddit.events.newcommunityprogress.RedditNewCommunityProgressAnalytics;
import com.reddit.events.postchaining.PostChainingV3Analytics;
import com.reddit.events.ratingsurvey.RedditRatingSurveyAnalytics;
import com.reddit.events.screen.a;
import com.reddit.events.settings.EmailSettingsAnalytics;
import ui0.b;
import n40.f;
import pd0.l$a;
import javax.inject.Provider;
import ne2.d;

public final class c implements d
{
    public final int a;
    public final Provider b;
    
    public c(final Provider b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    public static c a(final Provider provider) {
        return new c(provider, 19);
    }
    
    public static c b(final Provider provider) {
        return new c(provider, 25);
    }
    
    public static c c() {
        return new c((Provider)l$a.a, 4);
    }
    
    public final Object get() {
        switch (this.a) {
            default: {
                return new b((f)this.b.get());
            }
            case 28: {
                return new EmailSettingsAnalytics((f)this.b.get());
            }
            case 27: {
                return new a((f)this.b.get());
            }
            case 26: {
                return new RedditRatingSurveyAnalytics((f)this.b.get());
            }
            case 25: {
                return new li0.b((li0.a)this.b.get());
            }
            case 24: {
                return new PostChainingV3Analytics((f)this.b.get());
            }
            case 23: {
                return new RedditNewCommunityProgressAnalytics((f)this.b.get());
            }
            case 22: {
                return new ModNotesAnalytics((f)this.b.get());
            }
            case 21: {
                return new vh0.a((f)this.b.get());
            }
            case 20: {
                return new LauncherIconsAnalytics((f)this.b.get());
            }
            case 19: {
                return new mh0.f((f)this.b.get());
            }
            case 18: {
                return new EmailCollectionAnalytics((f)this.b.get());
            }
            case 17: {
                return new eh0.a((f)this.b.get());
            }
            case 16: {
                return new wg0.a((f)this.b.get());
            }
            case 15: {
                return new e((f)this.b.get());
            }
            case 14: {
                return new g((h)this.b.get());
            }
            case 13: {
                return new AppRateAnalytics((f)this.b.get());
            }
            case 12: {
                return new AnnouncementAnalytics((f)this.b.get());
            }
            case 11: {
                return d.e((x)this.b.get(), "client", (Class)RemoteEmailVerificationDataDource.class, "client.create(RemoteEmai\u2026onDataDource::class.java)");
            }
            case 10: {
                return new r1((h0)this.b.get());
            }
            case 9: {
                return new k0((s10.a)this.b.get());
            }
            case 8: {
                return new e0((m41.a)this.b.get());
            }
            case 7: {
                return new LinkFlow((j)this.b.get());
            }
            case 6: {
                return new ff0.a((xd0.b)this.b.get());
            }
            case 5: {
                return new he0.a((SnoovatarRepository)this.b.get());
            }
            case 4: {
                return new o((i)this.b.get());
            }
            case 3: {
                return new qb0.d((Context)this.b.get());
            }
            case 2: {
                return new UpdateDiscoverFeedItemUseCase((hb0.a)this.b.get());
            }
            case 1: {
                return new n((Set)this.b.get());
            }
            case 0: {
                return new qa0.b((pa0.b)this.b.get());
            }
        }
    }
}
