// 
// Decompiled by Procyon v0.6.0
// 

package g60;

import com.reddit.data.repository.RedditMyAccountRepository;
import ge0.e;
import c50.v0;
import com.reddit.data.remote.RemoteGqlMyAccountDataSource;
import com.reddit.data.remote.RemoteAccountPreferenceDataSource;
import cb0.k;
import com.reddit.data.remote.RemoteAccountDataSource;
import c50.d0;
import com.reddit.session.q;
import com.reddit.domain.targeting.ResurrectedUserTargetingUseCase;
import mj2.b0;
import bt0.h;
import db0.t;
import bt0.j;
import com.reddit.modtools.newcommunityprogress.RedditNewCommunityProgressActionsDelegate;
import db0.v;
import ix1.m;
import com.reddit.events.newcommunityprogress.RedditNewCommunityProgressAnalytics;
import in0.l;
import r20.c;
import com.reddit.domain.usecase.SubredditTaggingQuestionsUseCase;
import com.reddit.ui.counterpart.SubredditCounterpartInvitationDelegate;
import db0.i;
import of0.t1;
import ge0.g;
import d22.f;
import com.reddit.session.Session;
import ge0.a0;
import ge0.o0;
import q20.b;
import zg2.a;
import w90.kl$v2;
import w90.kl$t;
import w90.kl$s2;
import w90.kl$t1;
import w90.kl$s;
import w90.kl$s7;
import w90.kl$sa;
import w90.kl;
import javax.inject.Provider;
import af2.d;

public final class j1 implements d
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
    public final Provider m;
    public final Provider n;
    
    public static j1 a(final Provider provider, final Provider provider2, final Provider provider3, final Provider provider4, final Provider provider5, final Provider provider6, final Provider provider7, final Provider provider8, final Provider provider9, final Provider provider10, final Provider provider11, final Provider provider12, final Provider provider13) {
        return new j1(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, 1);
    }
    
    public static j1 b(final Provider provider, final kl.la la, final kl$sa kl$sa, final kl.ja ja, final kl$s7 kl$s7, final kl.p1 p13, final kl$s kl$s8, final Provider provider2, final kl$t1 kl$t1, final kl.a9 a9, final kl$s2 kl$s9, final kl$t kl$t2, final kl$v2 kl$v2) {
        return new j1(provider, (Provider)la, (Provider)kl$sa, (Provider)ja, (Provider)kl$s7, (Provider)p13, (Provider)kl$s8, provider2, (Provider)kl$t1, (Provider)a9, (Provider)kl$s9, (Provider)kl$t2, (Provider)kl$v2, 3);
    }
    
    public final Object get() {
        switch (this.a) {
            default: {
                return new SubredditCounterpartInvitationDelegate((a)this.b.get(), (b)this.c.get(), (o0)this.d.get(), (a0)this.e.get(), (Session)this.f.get(), (db0.d)this.g.get(), (f)this.h.get(), (fh0.a)this.i.get(), (g)this.j.get(), (t1)this.k.get(), (pj0.a)this.l.get(), (e20.a)this.m.get(), (i)this.n.get());
            }
            case 2: {
                return new RedditNewCommunityProgressActionsDelegate((a)this.b.get(), (SubredditTaggingQuestionsUseCase)this.c.get(), (rc0.d)this.d.get(), (r20.a)this.e.get(), (c)this.f.get(), (b)this.g.get(), (ou0.c)this.h.get(), (l)this.i.get(), (RedditNewCommunityProgressAnalytics)this.j.get(), (m)this.k.get(), (v)this.l.get(), (e80.b)this.m.get(), (x01.a)this.n.get());
            }
            case 1: {
                return new ResurrectedUserTargetingUseCase((d22.m)this.b.get(), (bh0.b)this.c.get(), (bt0.a)this.d.get(), (j)this.e.get(), (ub0.a)this.f.get(), (t)this.g.get(), (kf0.a)this.h.get(), (Session)this.i.get(), (le0.a)this.j.get(), (h)this.k.get(), (bt0.b)this.l.get(), (e20.a)this.m.get(), (b0)this.n.get());
            }
            case 0: {
                return new RedditMyAccountRepository((bt0.a)this.b.get(), (q)this.c.get(), (r20.a)this.d.get(), (d0)this.e.get(), (RemoteAccountDataSource)this.f.get(), (k)this.g.get(), (RemoteAccountPreferenceDataSource)this.h.get(), (RemoteGqlMyAccountDataSource)this.i.get(), (v0)this.j.get(), (e)this.k.get(), (e20.a)this.l.get(), (db0.l)this.m.get(), (db0.c)this.n.get());
            }
        }
    }
}
