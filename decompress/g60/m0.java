// 
// Decompiled by Procyon v0.6.0
// 

package g60;

import io.reactivex.plugins.RxJavaPlugins;
import nf2.e;
import io.reactivex.internal.operators.completable.CompletableDoFinally;
import pg2.j;
import nf2.c0;
import r20.d;
import a4.u1;
import com.reddit.data.repository.s;
import sf2.g;
import javax.inject.Inject;
import db0.l;
import com.reddit.session.q;
import com.reddit.domain.model.InboxCount;
import n22.f;
import com.reddit.notification.common.NotificationManagerFacade;
import n22.p;
import ge0.a0;
import com.reddit.session.Session;
import r20.c;
import r20.a;
import com.reddit.data.remote.RemoteInboxDataSource;
import ge0.o;

public final class m0 implements o
{
    public final RemoteInboxDataSource a;
    public final a b;
    public final c c;
    public final Session d;
    public final a0 e;
    public final p f;
    public final NotificationManagerFacade g;
    public final f h;
    public final ng2.a<InboxCount> i;
    public InboxCount j;
    public final String k;
    public final String l;
    public final boolean m;
    
    @Inject
    public m0(final RemoteInboxDataSource a, final a b, final c c, final Session d, final a0 e, final p f, final NotificationManagerFacade g, final f h, final q q, final l l) {
        ah2.f.f((Object)a, "remoteInboxDataSource");
        ah2.f.f((Object)b, "backgroundThread");
        ah2.f.f((Object)c, "postExecutionThread");
        ah2.f.f((Object)d, "activeSession");
        ah2.f.f((Object)e, "preferenceRepository");
        ah2.f.f((Object)f, "trackingDelegate");
        ah2.f.f((Object)g, "notificationManagerFacade");
        ah2.f.f((Object)h, "networkTracker");
        ah2.f.f((Object)q, "sessionManager");
        ah2.f.f((Object)l, "internalFeatures");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = (ng2.a<InboxCount>)new ng2.a();
        this.k = l.c();
        this.l = String.valueOf(l.n());
        this.m = q.z();
    }
    
    public final void a() {
        final com.reddit.tracking.a b = this.f.b();
        c0 c0;
        if (!this.d.isLoggedIn()) {
            c0 = this.a.anonBadgeCount().l((g)new j0(0, this, b));
        }
        else {
            c0 = this.a.badgeCount().l((g)new com.reddit.data.repository.o(1, this, b));
        }
        ah2.f.e((Object)c0, "when {\n      !activeSess\u2026)\n        }\n      }\n    }");
        final c0 k = c0.m((g)new s(1, this, b)).k((sf2.a)new k0(this, b));
        ah2.f.e((Object)k, "badgeCountSingle\n      .\u2026pwatch.stopIfRunning() })");
        u1.H0(u1.j1(k, (d)this.b), (d)this.c).F((g)new com.reddit.data.repository.q(this, 2), (g)new l0());
    }
    
    public final nf2.a b(final String s) {
        ah2.f.f((Object)s, "messageId");
        return o72.f.s(o72.f.t(this.a.markMessageAsRead(s), (d)this.b), this.c);
    }
    
    public final void c() {
        final InboxCount j = this.j;
        if (j == null) {
            return;
        }
        if (j.getModMailCount() > 0) {
            j.setModMailCount(j.getModMailCount() - 1);
        }
        this.i.onNext((Object)j);
    }
    
    public final void clear() {
        final InboxCount j = this.j;
        if (j == null) {
            return;
        }
        this.i.onNext((Object)j);
        this.j = null;
    }
    
    public final void d() {
        final InboxCount j = this.j;
        if (j == null) {
            return;
        }
        if (j.getTrendingNotificationCount() > 0) {
            j.setTrendingNotificationCount(j.getTrendingNotificationCount() - 1);
        }
        this.i.onNext((Object)j);
    }
    
    public final void e() {
        final InboxCount j = this.j;
        if (j == null) {
            return;
        }
        if (j.getNotificationCount() > 0) {
            j.setNotificationCount(j.getNotificationCount() - 1);
        }
        this.i.onNext((Object)j);
    }
    
    public final void f() {
        final InboxCount j = this.j;
        if (j == null) {
            return;
        }
        if (j.getMessageCount() > 0) {
            j.setMessageCount(j.getMessageCount() - 1);
        }
        this.i.onNext((Object)j);
    }
    
    public final void g(final zg2.a<j> a) {
        final com.reddit.tracking.a b = this.f.b();
        final nf2.a n = this.a.markInboxAsRead().m((g)new g0(0, this, b)).n((g)new h0(0, this, b));
        final i0 i0 = new i0(a, this, b);
        n.getClass();
        final nf2.a onAssembly = RxJavaPlugins.onAssembly((nf2.a)new CompletableDoFinally((e)n, (sf2.a)i0));
        ah2.f.e((Object)onAssembly, "remoteInboxDataSource.ma\u2026h.stopIfRunning()\n      }");
        o72.f.s(o72.f.t(onAssembly, (d)this.b), this.c).c((nf2.c)new ig2.c() {
            public final void onComplete() {
                bv2.a.a.m("Marking notifications as read succeeded", new Object[0]);
            }
            
            public final void onError(final Throwable t) {
                ah2.f.f((Object)t, "e");
                bv2.a.a.f(t, "Marking notifications as read failed", new Object[0]);
            }
        });
        final InboxCount j = this.j;
        if (j == null) {
            return;
        }
        j.setNotificationCount(0);
        j.setTrendingNotificationCount(0);
        j.setMessageCount(0);
        j.setModMailCount(0);
        this.i.onNext((Object)j);
    }
}
