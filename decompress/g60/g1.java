// 
// Decompiled by Procyon v0.6.0
// 

package g60;

import com.reddit.data.repository.v;
import com.squareup.moshi.y;
import c50.j0;
import com.reddit.data.remote.RemoteModToolsDataSource;
import com.reddit.domain.premium.usecase.FetchSubscriptionPackagesUseCase;
import db0.l;
import com.reddit.presence.RedditRealtimeCommentCountGateway;
import ah2.f;
import m81.f0;
import com.reddit.session.Session;
import com.reddit.screen.listing.predictions.PredictionPollDetailPresenterDelegate;
import com.reddit.events.predictions.PredictionsAnalytics;
import com.reddit.session.r;
import com.reddit.ui.predictions.mapper.PredictionsUiMapper;
import com.reddit.screen.powerups.subreddit_tab.PowerupsSubredditTabPresenter;
import com.reddit.powerups.navigation.PowerupsNavigator;
import com.reddit.events.powerups.PowerupsAnalytics;
import g21.e;
import com.reddit.session.q;
import n42.g;
import kt2.a;
import ot2.h;
import lr2.p;
import sr2.b;
import vq2.m;
import org.matrix.android.sdk.internal.session.terms.TermsAPI;
import ot2.j;
import af2.c;
import javax.inject.Provider;
import af2.d;

public final class g1 implements d
{
    public final /* synthetic */ int a;
    public final Provider b;
    public final Provider c;
    public final Provider d;
    public final Provider e;
    public final Provider f;
    public final Provider g;
    public final Provider h;
    
    public final Object get() {
        switch (this.a) {
            default: {
                return new a(af2.c.a(this.b), (j)this.c.get(), (TermsAPI)this.d.get(), (m)this.e.get(), (b)this.f.get(), (p)this.g.get(), (h)this.h.get());
            }
            case 6: {
                return new vu1.a((k42.a)this.b.get(), (ra0.b)this.c.get(), (g)this.d.get(), (q20.b)this.e.get(), (jl0.d)this.f.get(), (q)this.g.get(), (d22.m)this.h.get());
            }
            case 5: {
                return new zs1.c((zg2.a)this.b.get(), (zg2.a)this.c.get(), (rc0.d)this.d.get(), (com.reddit.session.a)this.e.get(), (e80.b)this.f.get(), (e)this.g.get(), (zg2.a)this.h.get());
            }
            case 4: {
                return new PowerupsSubredditTabPresenter((rj1.c)this.b.get(), (rj1.a)this.c.get(), (w52.b)this.d.get(), (kd0.j)this.e.get(), (PowerupsAnalytics)this.f.get(), (PowerupsNavigator)this.g.get(), (co1.j)this.h.get());
            }
            case 3: {
                return new PredictionPollDetailPresenterDelegate((wd0.a)this.b.get(), (PredictionsUiMapper)this.c.get(), (r)this.d.get(), (od0.d)this.e.get(), (PredictionsAnalytics)this.f.get(), (rr0.a)this.g.get(), (i81.a)this.h.get());
            }
            case 2: {
                final jw0.a a = (jw0.a)this.b.get();
                final m81.g g = (m81.g)this.c.get();
                final Session session = (Session)this.d.get();
                final m81.a a2 = (m81.a)this.e.get();
                final f0 f0 = (f0)this.f.get();
                final r41.a a3 = (r41.a)this.g.get();
                final e20.a a4 = (e20.a)this.h.get();
                ah2.f.f((Object)a, "redditLogger");
                ah2.f.f((Object)g, "presenceFeatures");
                ah2.f.f((Object)session, "activeSession");
                ah2.f.f((Object)a2, "commentFlowFactory");
                ah2.f.f((Object)f0, "topLevelCommentFlowFactory");
                ah2.f.f((Object)a3, "networkConnection");
                ah2.f.f((Object)a4, "dispatcherProvider");
                return new RedditRealtimeCommentCountGateway(a4, a, a3, a2, g, f0, session);
            }
            case 1: {
                return new FetchSubscriptionPackagesUseCase((de0.a)this.b.get(), (q)this.c.get(), (l)this.d.get(), (uz.c)this.e.get(), (jw0.a)this.f.get(), (e20.a)this.g.get(), (ae0.a)this.h.get());
            }
            case 0: {
                return new v((r20.a)this.b.get(), (RemoteModToolsDataSource)this.c.get(), (j0)this.d.get(), (q)this.e.get(), (y)this.f.get(), (x01.a)this.g.get(), (u01.a)this.h.get());
            }
        }
    }
}
