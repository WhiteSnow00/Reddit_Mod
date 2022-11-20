// 
// Decompiled by Procyon v0.6.0
// 

package n40;

import zi2.c0;
import com.reddit.session.o;
import com.reddit.session.n;
import com.reddit.data.events.models.AnalyticsScreen;
import com.reddit.data.events.models.AnalyticsPlatform;
import com.reddit.modtools.powerups.PowerupsModToolsPresenter;
import bd0.j;
import xd0.h0;
import com.reddit.screen.onboarding.coordinator.RedditOnboardingFlowNavigator;
import com.reddit.session.Session;
import wa0.r;
import com.reddit.screens.follower_list.FollowerListPresenter;
import com.reddit.events.followerlist.FollowerListAnalytics;
import ff0.n1;
import xd0.m;
import yr1.b;
import mg2.a;
import o90.x0$z6;
import o90.x0$d5;
import o90.x0$v1;
import o90.x0$w1;
import o90.x0$o9;
import ne2.e;
import javax.inject.Provider;
import ne2.d;

public final class c implements d
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
    
    public c(final Provider b, final Provider c, final Provider d, final Provider e, final Provider f, final Provider g, final Provider h, final Provider i, final Provider j, final int a) {
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
    
    public static c a(final Provider provider, final Provider provider2, final e e, final Provider provider3, final x0$o9 x0$o9, final x0$w1 x0$w1, final x0$v1 x0$v1, final x0$d5 x0$d5, final x0$z6 x0$z6) {
        return new c(provider, provider2, (Provider)e, provider3, (Provider)x0$o9, (Provider)x0$w1, (Provider)x0$v1, (Provider)x0$d5, (Provider)x0$z6, 2);
    }
    
    public final Object get() {
        switch (this.a) {
            default: {
                return new FollowerListPresenter((a)this.b.get(), (b)this.c.get(), (p20.b)this.d.get(), (m)this.e.get(), (zr1.a)this.f.get(), (ob0.a)this.g.get(), (n1)this.h.get(), (FollowerListAnalytics)this.i.get(), (d20.a)this.j.get());
            }
            case 2: {
                return new RedditOnboardingFlowNavigator((a)this.b.get(), (a)this.c.get(), (a)this.d.get(), (oc0.b)this.e.get(), (hc0.d)this.f.get(), (ws0.e)this.g.get(), (w70.e)this.h.get(), (r)this.i.get(), (Session)this.j.get());
            }
            case 1: {
                return new PowerupsModToolsPresenter((a31.c)this.b.get(), (a31.a)this.c.get(), (h0)this.d.get(), (j)this.e.get(), (s01.a)this.f.get(), (p20.b)this.g.get(), (hc0.d)this.h.get(), (ji0.a)this.i.get(), (d20.a)this.j.get());
            }
            case 0: {
                return new n40.a((n40.e)this.b.get(), (AnalyticsPlatform)this.c.get(), (AnalyticsScreen)this.d.get(), (n)this.e.get(), (o)this.f.get(), (sg0.e)this.g.get(), (cw0.a)this.h.get(), (c0)this.i.get(), (d20.a)this.j.get());
            }
        }
    }
}
