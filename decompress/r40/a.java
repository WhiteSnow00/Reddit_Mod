// 
// Decompiled by Procyon v0.6.0
// 

package r40;

import com.reddit.data.incentivizedinvites.RedditIncentivizedInviteDelegate;
import wa0.y;
import com.reddit.domain.model.listing.ReportLinkAnalytics;
import xd0.z;
import com.reddit.domain.usecase.AmbassadorSubredditUseCase;
import vq0.k;
import wa0.c0;
import com.reddit.emailverification.screens.EmailVerificationPopupPresenter;
import com.reddit.events.emailverification.EmailVerificationAnalytics;
import com.reddit.auth.screen.navigation.SsoAuthNavigator;
import com.reddit.emailcollection.common.EmailCollectionMode;
import xd0.n;
import com.reddit.frontpage.presentation.detail.crosspost.video.CrossPostVideoDetailPresenter;
import va0.h;
import km0.e;
import com.reddit.modtools.welcomemessage.edit.screen.EditWelcomeMessagePresenter;
import com.reddit.domain.usecase.UpdateSubredditSettingsUseCase;
import com.reddit.modtools.welcomemessage.WelcomeMessageAnalytics;
import com.reddit.postdetail.domain.PostChainingActionsDelegate;
import ff0.t1;
import ff0.n1;
import com.reddit.events.postchaining.PostChainingV4Analytics;
import com.reddit.screens.about.SubredditAboutPresenter;
import mn1.j;
import com.reddit.session.Session;
import com.reddit.ui.invitationtrigger.RedditSubredditInvitationTriggerDelegate;
import xd0.h0;
import com.reddit.session.o;
import ks2.l;
import ur2.c;
import org.matrix.android.sdk.internal.session.sync.handler.room.ThreadsAwarenessHandler;
import vs2.g;
import ur2.f;
import is2.b;
import hf1.b$a;
import javax.inject.Provider;
import ne2.d;

public final class a implements d
{
    public final int a;
    public final Provider b;
    public final Provider c;
    public final Provider d;
    public final Provider e;
    public final Provider f;
    public final Provider g;
    public final Provider h;
    public final Provider i;
    public final Provider j;
    
    public a(final Provider b, final Provider c, final Provider d, final Provider e, final Provider f, final Provider g, final Provider h, final Provider i, final Provider j, final int a) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
    }
    
    public static a a(final Provider provider, final Provider provider2, final Provider provider3, final Provider provider4, final Provider provider5, final Provider provider6, final Provider provider7, final Provider provider8) {
        return new a(provider, (Provider)b$a.a, provider2, provider3, provider4, provider5, provider6, provider7, provider8, 0);
    }
    
    public static a b(final Provider provider, final Provider provider2, final Provider provider3, final Provider provider4, final Provider provider5, final Provider provider6, final nx.a a, final Provider provider7, final Provider provider8) {
        return new a(provider, provider2, provider3, provider4, provider5, provider6, (Provider)a, provider7, provider8, 8);
    }
    
    public final Object get() {
        switch (this.a) {
            default: {
                return new vs2.d((vs2.a)this.b.get(), (b)this.c.get(), (xs2.b)this.d.get(), (f)this.e.get(), (g)this.f.get(), (ThreadsAwarenessHandler)this.g.get(), (c)this.h.get(), (String)this.i.get(), (l)this.j.get());
            }
            case 8: {
                return new RedditSubredditInvitationTriggerDelegate((mg2.a)this.b.get(), (o)this.c.get(), (h0)this.d.get(), (wa0.c)this.e.get(), (hj0.b)this.f.get(), (p20.b)this.g.get(), (ui0.a)this.h.get(), (q20.a)this.i.get(), (q20.c)this.j.get());
            }
            case 7: {
                return new SubredditAboutPresenter((on1.o)this.b.get(), (h0)this.c.get(), (Session)this.d.get(), (n20.a)this.e.get(), (q20.a)this.f.get(), (q20.c)this.g.get(), (p20.b)this.h.get(), (j)this.i.get(), (n12.d)this.j.get());
            }
            case 6: {
                return new PostChainingActionsDelegate((Session)this.b.get(), (lu0.a)this.c.get(), (n20.a)this.d.get(), (q20.a)this.e.get(), (PostChainingV4Analytics)this.f.get(), (q20.c)this.g.get(), (n1)this.h.get(), (t1)this.i.get(), (d20.a)this.j.get());
            }
            case 5: {
                return new EditWelcomeMessagePresenter((p31.c)this.b.get(), (p31.a)this.c.get(), (n31.a)this.d.get(), (WelcomeMessageAnalytics)this.e.get(), (h0)this.f.get(), (UpdateSubredditSettingsUseCase)this.g.get(), (hc0.d)this.h.get(), (p20.b)this.i.get(), (d20.a)this.j.get());
            }
            case 4: {
                return new CrossPostVideoDetailPresenter((km0.c)this.b.get(), (km0.b)this.c.get(), (e)this.d.get(), (h)this.e.get(), (xd0.j)this.f.get(), (uy0.b)this.g.get(), (bv.c)this.h.get(), (cv.a)this.i.get(), (sw.b)this.j.get());
            }
            case 3: {
                return new EmailVerificationPopupPresenter((n)this.b.get(), (cg0.a)this.c.get(), (p20.b)this.d.get(), (bg0.b)this.e.get(), (String)this.f.get(), (EmailCollectionMode)this.g.get(), (SsoAuthNavigator)this.h.get(), (yf0.a)this.i.get(), (EmailVerificationAnalytics)this.j.get());
            }
            case 2: {
                return new AmbassadorSubredditUseCase((ws0.a)this.b.get(), (b01.d)this.c.get(), (h0)this.d.get(), (c0)this.e.get(), (Session)this.f.get(), (d20.a)this.g.get(), (p20.b)this.h.get(), (k)this.i.get(), (mg2.a)this.j.get());
            }
            case 1: {
                return com.reddit.di.component.a.a((ok0.c)this.b.get(), (z)this.c.get(), (q20.c)this.d.get(), (com.reddit.session.n)this.e.get(), (ha0.d)this.f.get(), (p20.b)this.g.get(), (ReportLinkAnalytics)this.h.get(), (ja1.a)this.i.get(), (wa0.d)this.j.get());
            }
            case 0: {
                return new RedditIncentivizedInviteDelegate((hc0.d)this.b.get(), (jc0.b)this.c.get(), (rb0.c)this.d.get(), (nb0.a)this.e.get(), (ws0.f)this.f.get(), (mg2.a)this.g.get(), (rb0.d)this.h.get(), (rb0.b)this.i.get(), (y)this.j.get());
            }
        }
    }
}
