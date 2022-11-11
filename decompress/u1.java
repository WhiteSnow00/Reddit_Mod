// 
// Decompiled by Procyon v0.6.0
// 

package g60;

import com.reddit.data.repository.RedditPreferenceRepository;
import com.reddit.data.remote.RemoteAccountPreferenceDataSource;
import com.reddit.session.Session;
import android.content.SharedPreferences;
import cb0.k;
import com.reddit.emailcollection.screens.EmailCollectionConfirmationPresenter;
import com.reddit.emailcollection.common.EmailCollectionMode;
import com.reddit.events.emailcollection.EmailCollectionAnalytics;
import ge0.v;
import ah2.f;
import in0.j;
import com.reddit.frontpage.presentation.detail.HeaderLoadingDelegate;
import of0.p1;
import com.reddit.frontpage.presentation.listing.linkpager.LinkPagerPresenter;
import ge0.a0;
import com.reddit.screens.topic.pager.TopicPagerPresenter;
import com.reddit.screen.BaseScreen;
import com.reddit.events.topic.TopicAnalytics;
import yy1.c;
import db0.r;
import d22.m;
import com.reddit.events.gold.GoldAnalytics;
import yy1.b;
import org.matrix.android.sdk.internal.session.homeserver.DefaultGetHomeServerCapabilitiesTask;
import org.matrix.android.sdk.api.auth.data.HomeServerConnectionConfig;
import pr2.e;
import vt2.a;
import org.matrix.android.sdk.internal.database.RoomSessionDatabase;
import org.matrix.android.sdk.internal.session.media.MediaAPI;
import org.matrix.android.sdk.internal.session.homeserver.CapabilitiesAPI;
import javax.inject.Provider;
import af2.d;

public final class u1 implements d
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
    
    public static u1 a(final Provider provider, final Provider provider2, final Provider provider3, final Provider provider4, final Provider provider5, final Provider provider6, final Provider provider7, final Provider provider8) {
        return new u1(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, 6);
    }
    
    public final Object get() {
        switch (this.a) {
            default: {
                return new DefaultGetHomeServerCapabilitiesTask((CapabilitiesAPI)this.b.get(), (MediaAPI)this.c.get(), (RoomSessionDatabase)this.d.get(), (vq2.d)this.e.get(), (a)this.f.get(), (e)this.g.get(), (HomeServerConnectionConfig)this.h.get(), (String)this.i.get());
            }
            case 6: {
                return new c((b)this.b.get(), (qr0.b)this.c.get(), (ls1.a)this.d.get(), (GoldAnalytics)this.e.get(), (rr0.a)this.f.get(), (String)this.g.get(), (m)this.h.get(), (r)this.i.get());
            }
            case 5: {
                return new TopicPagerPresenter((cv1.c)this.b.get(), (cv1.a)this.c.get(), (q20.b)this.d.get(), (qx1.a)this.e.get(), (lf0.a)this.f.get(), (TopicAnalytics)this.g.get(), (rc0.d)this.h.get(), (BaseScreen)this.i.get());
            }
            case 4: {
                return new LinkPagerPresenter((ln0.c)this.b.get(), (com.reddit.domain.usecase.b)this.c.get(), (ln0.a)this.d.get(), (r20.c)this.e.get(), (ge0.r)this.f.get(), (wg0.m)this.g.get(), (a0)this.h.get(), (s40.e)this.i.get());
            }
            case 3: {
                return new HeaderLoadingDelegate((vu.a)this.b.get(), (e20.a)this.c.get(), (ge0.b)this.d.get(), (r20.c)this.e.get(), (zb0.a)this.f.get(), (gi0.a)this.g.get(), (p1)this.h.get(), (fx.a)this.i.get());
            }
            case 2: {
                final cw.b b = (cw.b)this.b.get();
                final zg2.a a = (zg2.a)this.c.get();
                final gv.a a2 = (gv.a)this.d.get();
                final az0.b b2 = (az0.b)this.e.get();
                final j j = (j)this.f.get();
                final cw.a a3 = (cw.a)this.g.get();
                final aw.a a4 = (aw.a)this.h.get();
                final rc0.d d = (rc0.d)this.i.get();
                ah2.f.f((Object)b, "adsNavigator");
                ah2.f.f((Object)a, "getActivity");
                ah2.f.f((Object)a2, "adsFeatures");
                ah2.f.f((Object)b2, "fullBleedPlayerFeatures");
                ah2.f.f((Object)j, "listingNavigator");
                ah2.f.f((Object)a3, "adPixelDataMapper");
                ah2.f.f((Object)a4, "adUniqueIdProvider");
                ah2.f.f((Object)d, "screenNavigator");
                return new sm0.e(a2, a4, a3, b, d, j, b2, a);
            }
            case 1: {
                return new EmailCollectionConfirmationPresenter((zg2.a)this.b.get(), (dg0.e)this.c.get(), (v)this.d.get(), (q20.b)this.e.get(), (EmailCollectionAnalytics)this.f.get(), (rc0.d)this.g.get(), (EmailCollectionMode)this.h.get(), (dg0.c)this.i.get());
            }
            case 0: {
                return new RedditPreferenceRepository((k)this.b.get(), (ex1.b)this.c.get(), (SharedPreferences)this.d.get(), (Session)this.e.get(), (r20.a)this.f.get(), (bt0.a)this.g.get(), (RemoteAccountPreferenceDataSource)this.h.get(), (e20.a)this.i.get());
            }
        }
    }
}
