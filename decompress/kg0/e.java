// 
// Decompiled by Procyon v0.6.0
// 

package kg0;

import com.reddit.events.builders.BaseEventBuilder;
import oi0.t0;
import com.reddit.events.settings.PermissionAnalyticsEvent;
import vh0.i;
import com.reddit.events.builders.PostDetailSwipeEventBuilder;
import com.reddit.events.builders.PostDetailSwipeEventBuilder$SwipeDirection;
import com.reddit.domain.model.Link;
import com.reddit.data.events.models.components.DiscoveryUnit;
import com.reddit.events.builders.VideoEventBuilder$Orientation;
import javax.inject.Inject;
import ff0.r1;
import va0.f0;
import va0.y;
import pi0.d;
import com.reddit.events.video.RedditVideoAnalytics;
import vh0.l;
import si0.f;
import com.reddit.events.discoveryunit.RedditDiscoveryUnitAnalytics;
import com.reddit.events.builders.RedditFlairAnalytics;
import oi0.r0;
import pi0.c;
import xi0.b;
import vh0.h;
import si0.g;
import mg0.m;
import oi0.s0;

public final class e implements a, s0, ih0.a, fh0.a, m, g, h, rh0.a, ei0.a, b, c
{
    public final /* synthetic */ r0 a;
    public final /* synthetic */ RedditFlairAnalytics b;
    public final /* synthetic */ RedditDiscoveryUnitAnalytics c;
    public final /* synthetic */ f d;
    public final /* synthetic */ l e;
    public final /* synthetic */ rh0.f f;
    public final /* synthetic */ ei0.c g;
    public final /* synthetic */ RedditVideoAnalytics h;
    public final /* synthetic */ d i;
    
    @Inject
    public e(final l40.e e, final y y, final f0 f0, final r1 r1) {
        sg2.e.f((Object)e, "eventSender");
        sg2.e.f((Object)y, "searchFeatures");
        sg2.e.f((Object)f0, "videoFeatures");
        sg2.e.f((Object)r1, "videoSettingsUseCase");
        this.a = new r0(e, y);
        this.b = new RedditFlairAnalytics(e);
        this.c = new RedditDiscoveryUnitAnalytics(e);
        this.d = new f(e);
        this.e = new l(e);
        this.f = new rh0.f(e);
        this.g = new ei0.c(e);
        this.h = new RedditVideoAnalytics(e, f0, r1);
        this.i = new d(e);
    }
    
    public final void A(final String s, final String s2, final VideoEventBuilder$Orientation videoEventBuilder$Orientation, final kf0.a a, final boolean b) {
        sg2.e.f((Object)s2, "mediaId");
        sg2.e.f((Object)a, "eventProperties");
        this.h.A(s, s2, videoEventBuilder$Orientation, a, b);
    }
    
    public final void B(final DiscoveryUnit discoveryUnit, final String s, final int n, final String s2, final String s3, final boolean b) {
        sg2.e.f((Object)s2, "trendingItemTitle");
        sg2.e.f((Object)s3, "trendingItemQuery");
        this.c.B(discoveryUnit, s, n, s2, s3, b);
    }
    
    public final void C(final si0.h h) {
        sg2.e.f((Object)h, "event");
        this.d.C(h);
    }
    
    public final void D(final DiscoveryUnit discoveryUnit, final String s, final int n, final String s2, final String s3) {
        sg2.e.f((Object)s2, "profileName");
        sg2.e.f((Object)s3, "profileId");
        this.c.D(discoveryUnit, s, n, s2, s3);
    }
    
    public final void E(final DiscoveryUnit discoveryUnit, final String s, final int n, final String s2, final String s3) {
        sg2.e.f((Object)s2, "profileName");
        sg2.e.f((Object)s3, "profileId");
        this.c.E(discoveryUnit, s, n, s2, s3);
    }
    
    public final void F(final DiscoveryUnit discoveryUnit, final String s, final int n, final String s2, final String s3, final String s4, final String s5) {
        sg2.e.f((Object)s, "pageType");
        this.c.F(discoveryUnit, s, n, s2, s3, s4, s5);
    }
    
    public final void G(final long n) {
        this.h.G(n);
    }
    
    public final void H(final int n, final int n2) {
        this.h.H(n, n2);
    }
    
    public final void I(final boolean b) {
        this.h.I(b);
    }
    
    public final void J(final DiscoveryUnit discoveryUnit, final String s, final int n, final String s2, final String s3) {
        sg2.e.f((Object)s2, "subredditName");
        sg2.e.f((Object)s3, "subreddtId");
        this.c.J(discoveryUnit, s, n, s2, s3);
    }
    
    public final void K(final DiscoveryUnit discoveryUnit, final String s, final int n, final Link link, final String s2, final String s3, final String s4, final String s5, final String s6) {
        this.c.K(discoveryUnit, s, n, link, s2, s3, s4, s5, s6);
    }
    
    public final void L(final DiscoveryUnit discoveryUnit, final String s, final int n, final String s2, final String s3, final String s4, final String s5) {
        sg2.e.f((Object)s3, "subreddtId");
        this.c.L(discoveryUnit, s, n, s2, s3, s4, s5);
    }
    
    public final void M(final String s) {
        this.h.M(s);
    }
    
    public final void N(final DiscoveryUnit discoveryUnit, final String s, final int n, final String s2, final String s3, final String s4, final String s5) {
        sg2.e.f((Object)s, "pageType");
        this.c.N(discoveryUnit, s, n, s2, s3, s4, s5);
    }
    
    public final void O(final DiscoveryUnit discoveryUnit, final String s, final int n, final String s2, final String s3, final String s4, final String s5) {
        this.c.O(discoveryUnit, s, n, s2, s3, s4, s5);
    }
    
    public final void P(final DiscoveryUnit discoveryUnit, final String s, final int n, final String s2, final String s3, final String s4, final String s5) {
        this.c.P(discoveryUnit, s, n, s2, s3, s4, s5);
    }
    
    public final void a(final ei0.b b) {
        sg2.e.f((Object)b, "event");
        this.g.a(b);
    }
    
    public final void b(final DiscoveryUnit discoveryUnit, final String s, final int n, final String s2, final String s3, final String s4, final String s5) {
        this.c.b(discoveryUnit, s, n, s2, s3, s4, s5);
    }
    
    public final void c(final long n) {
        this.h.c(n);
    }
    
    public final void d() {
        this.f.d();
    }
    
    public final void e(final String s, final String s2, final String s3, final String s4, final String s5, final String s6, final Long n, final String s7, final String s8, final String s9) {
        this.f.e(s, s2, s3, s4, s5, s6, n, s7, s8, s9);
    }
    
    public final void f(final DiscoveryUnit discoveryUnit, final String s, final int n, final String s2, final String s3, final String s4, final String s5) {
        this.c.f(discoveryUnit, s, n, s2, s3, s4, s5);
    }
    
    public final void g(final DiscoveryUnit discoveryUnit, final String s, final int n, final Link link, final String s2, final String s3, final String s4, final String s5, final String s6) {
        sg2.e.f((Object)s, "pageType");
        this.c.g(discoveryUnit, s, n, link, s2, s3, s4, s5, s6);
    }
    
    public final void h(final int n, final long n2, final String s, final String s2, final String s3) {
        sg2.e.f((Object)s2, "postTitle");
        sg2.e.f((Object)s3, "postUrl");
        this.h.h(n, n2, s, s2, s3);
    }
    
    public final void i(final l40.e e, final PostDetailSwipeEventBuilder$SwipeDirection postDetailSwipeEventBuilder$SwipeDirection) {
        sg2.e.f((Object)e, "eventSender");
        sg2.e.f((Object)postDetailSwipeEventBuilder$SwipeDirection, "swipeDirection");
        final PostDetailSwipeEventBuilder postDetailSwipeEventBuilder = new PostDetailSwipeEventBuilder(e);
        ((BaseEventBuilder)postDetailSwipeEventBuilder).u(postDetailSwipeEventBuilder$SwipeDirection.getValue());
        ((BaseEventBuilder)postDetailSwipeEventBuilder).D();
    }
    
    public final void j(final DiscoveryUnit discoveryUnit, final int n) {
        this.c.j(discoveryUnit, n);
    }
    
    public final void k(final DiscoveryUnit discoveryUnit, final String s, final int n, final String s2, final String s3) {
        this.c.k(discoveryUnit, s, n, s2, s3);
    }
    
    public final void l(final DiscoveryUnit discoveryUnit, final String s, final int n, final String s2, final String s3) {
        this.c.l(discoveryUnit, s, n, s2, s3);
    }
    
    public final void m(final i i) {
        this.e.m(i);
    }
    
    public final void n(final String s, final String s2, final String s3, final String s4, final String s5, final String s6, final Long n, final String s7, final String s8, final String s9) {
        this.f.n(s, s2, s3, s4, s5, s6, n, s7, s8, s9);
    }
    
    public final void o(final DiscoveryUnit discoveryUnit, final String s, final int n, final String s2, final String s3, final String s4, final String s5) {
        sg2.e.f((Object)s, "pageType");
        this.c.o(discoveryUnit, s, n, s2, s3, s4, s5);
    }
    
    public final void p(final PermissionAnalyticsEvent permissionAnalyticsEvent) {
        this.i.p(permissionAnalyticsEvent);
    }
    
    public final void q(final DiscoveryUnit discoveryUnit, final String s, final int n, final String s2, final String s3, final String s4, final String s5) {
        sg2.e.f((Object)s, "pageType");
        this.c.q(discoveryUnit, s, n, s2, s3, s4, s5);
    }
    
    public final void r(final DiscoveryUnit discoveryUnit, final String s, final int n, final Link link, final String s2, final String s3, final String s4) {
        sg2.e.f((Object)s2, "subredditName");
        sg2.e.f((Object)s3, "subreddtId");
        this.c.r(discoveryUnit, s, n, link, s2, s3, s4);
    }
    
    public final void s(final t0 t0) {
        this.a.s(t0);
    }
    
    public final void setDuration(final long duration) {
        this.h.setDuration(duration);
    }
    
    public final void t(final DiscoveryUnit discoveryUnit, final String s, final int n, final Link link, final String s2, final String s3, final String s4, final String s5, final String s6) {
        this.c.t(discoveryUnit, s, n, link, s2, s3, s4, s5, s6);
    }
    
    public final void u(final mg0.d d) {
        this.b.u(d);
    }
    
    public final void v(final DiscoveryUnit discoveryUnit, final String s, final int n, final String s2, final String s3) {
        sg2.e.f((Object)s2, "profileName");
        sg2.e.f((Object)s3, "profileId");
        this.c.v(discoveryUnit, s, n, s2, s3);
    }
    
    public final void w(final xi0.c c, final Long n) {
        this.h.w(c, n);
    }
    
    public final void x(final DiscoveryUnit discoveryUnit, final String s, final int n, final String s2, final String s3, final boolean b) {
        sg2.e.f((Object)s2, "trendingItemTitle");
        sg2.e.f((Object)s3, "trendingItemQuery");
        this.c.x(discoveryUnit, s, n, s2, s3, b);
    }
    
    public final void y(final DiscoveryUnit discoveryUnit, final String s, final int n, final String s2, final String s3) {
        this.c.y(discoveryUnit, s, n, s2, s3);
    }
    
    public final void z(final DiscoveryUnit discoveryUnit, final String s, final int n, final String s2, final String s3) {
        sg2.e.f((Object)s2, "profileName");
        sg2.e.f((Object)s3, "profileId");
        this.c.z(discoveryUnit, s, n, s2, s3);
    }
}
