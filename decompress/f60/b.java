// 
// Decompiled by Procyon v0.6.0
// 

package f60;

import r31.j;
import com.reddit.domain.model.streaming.StreamCorrelation;
import com.reddit.modtools.communityinvite.screen.CommunityInviteContextualReminderPresenter;
import ff0.l1;
import com.reddit.domain.repository.ModToolsRepository;
import com.reddit.screen.communityavatarredesign.CommunityAvatarRedesignPresenter;
import com.reddit.screen.incentivizedinvites.details.InviteShareUtils;
import va0.z;
import com.reddit.session.p;
import com.reddit.screens.profile.sociallinks.dialogs.OpenSocialLinkConfirmationPresenter;
import com.reddit.events.sociallinks.SocialLinksAnalytics;
import com.reddit.session.Session;
import com.reddit.domain.model.sociallink.SocialLink;
import com.reddit.screen.BaseScreen;
import ft2.g;
import cr2.o;
import mq2.m;
import org.matrix.android.sdk.internal.session.terms.TermsAPI;
import ft2.i;
import com.reddit.events.discoveryunit.RedditDiscoveryUnitAnalytics;
import sg2.e;
import com.reddit.events.usermodal.UserModalAnalytics;
import n20.c;
import kg0.a;
import xd0.s;
import xd0.g0;
import com.reddit.carousel.RedditCarouselActions;
import javax.inject.Provider;
import se2.d;

public final class b implements d
{
    public final /* synthetic */ int a;
    public final Provider b;
    public final Provider c;
    public final Provider d;
    public final Provider e;
    public final Provider f;
    public final Provider g;
    public final Provider h;
    
    public static b a(final Provider provider, final Provider provider2, final Provider provider3, final Provider provider4, final Provider provider5, final Provider provider6, final pi.d d) {
        return new b(provider, provider2, provider3, provider4, provider5, provider6, (Provider)d, 1);
    }
    
    public final RedditCarouselActions b() {
        switch (this.a) {
            default: {
                final g0 g0 = (g0)this.b.get();
                final s s = (s)this.c.get();
                final a a = (a)this.d.get();
                final x90.a a2 = (x90.a)this.e.get();
                final c c = (c)this.f.get();
                final UserModalAnalytics userModalAnalytics = (UserModalAnalytics)this.g.get();
                final d00.b b = (d00.b)this.h.get();
                sg2.e.f((Object)g0, "subredditRepository");
                sg2.e.f((Object)s, "preferenceRepository");
                sg2.e.f((Object)a, "analytics");
                sg2.e.f((Object)a2, "discoverySettings");
                sg2.e.f((Object)c, "postExecutionThread");
                sg2.e.f((Object)userModalAnalytics, "userModalAnalytics");
                sg2.e.f((Object)b, "navigator");
                return new RedditCarouselActions(g0, s, (fh0.a)a, a2, c, userModalAnalytics, b);
            }
            case 2: {
                final g0 g2 = (g0)this.b.get();
                final s s2 = (s)this.c.get();
                final RedditDiscoveryUnitAnalytics redditDiscoveryUnitAnalytics = (RedditDiscoveryUnitAnalytics)this.d.get();
                final x90.a a3 = (x90.a)this.e.get();
                final c c2 = (c)this.f.get();
                final UserModalAnalytics userModalAnalytics2 = (UserModalAnalytics)this.g.get();
                final d00.b b2 = (d00.b)this.h.get();
                sg2.e.f((Object)g2, "subredditRepository");
                sg2.e.f((Object)s2, "preferenceRepository");
                sg2.e.f((Object)redditDiscoveryUnitAnalytics, "analytics");
                sg2.e.f((Object)a3, "discoverySettings");
                sg2.e.f((Object)c2, "postExecutionThread");
                sg2.e.f((Object)userModalAnalytics2, "userModalAnalytics");
                sg2.e.f((Object)b2, "navigator");
                return new RedditCarouselActions(g2, s2, (fh0.a)redditDiscoveryUnitAnalytics, a3, c2, userModalAnalytics2, b2);
            }
        }
    }
    
    public final Object get() {
        switch (this.a) {
            default: {
                return new bt2.a(se2.c.a(this.b), (i)this.c.get(), (TermsAPI)this.d.get(), (m)this.e.get(), (jr2.b)this.f.get(), (o)this.g.get(), (g)this.h.get());
            }
            case 8: {
                return new mv1.e((rg2.a)this.b.get(), (ic0.d)this.c.get(), (wv.a)this.d.get(), (BaseScreen)this.e.get(), (sw.b)this.f.get(), (d50.b)this.g.get(), (ej0.b)this.h.get());
            }
            case 7: {
                return new OpenSocialLinkConfirmationPresenter((String)this.b.get(), (SocialLink)this.c.get(), (Session)this.d.get(), (ol0.b)this.e.get(), (bu1.b)this.f.get(), (eu1.b)this.g.get(), (SocialLinksAnalytics)this.h.get());
            }
            case 6: {
                return new InviteShareUtils((m20.b)this.b.get(), (rg2.a)this.c.get(), (p)this.d.get(), (mb0.a)this.e.get(), (vz.a)this.f.get(), (z)this.g.get(), (qb0.b)this.h.get());
            }
            case 5: {
                return new CommunityAvatarRedesignPresenter((com.reddit.session.o)this.b.get(), (ic0.d)this.c.get(), (m20.b)this.d.get(), (a20.a)this.e.get(), (kd1.d)this.f.get(), (com.reddit.session.a)this.g.get(), (rg2.a)this.h.get());
            }
            case 4: {
                return new CommunityInviteContextualReminderPresenter((z11.c)this.b.get(), (z11.a)this.c.get(), (m20.c)this.d.get(), (ModToolsRepository)this.e.get(), (l1)this.f.get(), (vg0.b)this.g.get(), (a20.a)this.h.get());
            }
            case 3: {
                return this.b();
            }
            case 2: {
                return this.b();
            }
            case 1: {
                final StreamCorrelation streamCorrelation = (StreamCorrelation)this.b.get();
                final rg2.a a = (rg2.a)this.c.get();
                final BaseScreen baseScreen = (BaseScreen)this.d.get();
                final m20.b b = (m20.b)this.e.get();
                final ic0.d d = (ic0.d)this.f.get();
                final com.reddit.session.a a2 = (com.reddit.session.a)this.g.get();
                final ax1.m m = (ax1.m)this.h.get();
                sg2.e.f((Object)streamCorrelation, "correlation");
                sg2.e.f((Object)a, "getActivity");
                sg2.e.f((Object)baseScreen, "originScreen");
                sg2.e.f((Object)b, "resourceProvider");
                sg2.e.f((Object)d, "screenNavigator");
                sg2.e.f((Object)a2, "authorizedActionResolver");
                sg2.e.f((Object)m, "shareLinkHelper");
                return new j(b, streamCorrelation, d, baseScreen, a2, m, a);
            }
            case 0: {
                return new f60.a((ce0.b)this.b.get(), (us0.a)this.c.get(), (us0.j)this.d.get(), (v12.m)this.e.get(), se2.c.a(this.f), se2.c.a(this.g), (yz.d)this.h.get());
            }
        }
    }
}
