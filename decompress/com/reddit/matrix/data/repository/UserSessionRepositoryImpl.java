// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.matrix.data.repository;

import kotlinx.coroutines.JobSupport;
import org.matrix.android.sdk.api.session.room.RoomSortOrder;
import mo2.d$a;
import org.matrix.android.sdk.api.session.room.model.Membership;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import java.util.concurrent.CancellationException;
import com.reddit.session.RedditSession;
import mg2.p;
import kotlinx.coroutines.CoroutineStart;
import zi2.c0;
import zi2.g;
import com.reddit.session.Session;
import com.reddit.session.m;
import javax.inject.Inject;
import mg2.l;
import af2.t;
import zx0.c;
import ey0.d;
import fo2.a$a$a;
import mg.d0;
import kotlin.coroutines.CoroutineContext;
import zi2.h;
import com.reddit.session.manager.lifecycle.SessionChangeEventBus;
import kotlinx.coroutines.flow.StateFlowImpl;
import ej2.f;
import fy0.b;
import com.reddit.session.o;
import xd0.s;
import d20.a;
import android.content.Context;
import fy0.e;

public final class UserSessionRepositoryImpl implements e
{
    public final Context a;
    public final a b;
    public final s c;
    public final o d;
    public final b e;
    public final f f;
    public f g;
    public final df2.a h;
    public final StateFlowImpl i;
    public final StateFlowImpl j;
    public final StateFlowImpl k;
    public final StateFlowImpl l;
    public final StateFlowImpl m;
    public final UserSessionRepositoryImpl$a n;
    
    @Inject
    public UserSessionRepositoryImpl(final Context a, final a b, final s c, final o d, final b e, final SessionChangeEventBus sessionChangeEventBus) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = d0.c(((JobSupport)zi2.h.b()).plus((CoroutineContext)b.c()));
        this.g = d0.c(((JobSupport)zi2.h.b()).plus((CoroutineContext)b.d()));
        this.i = xd.a.h((Object)null);
        this.j = xd.a.h((Object)null);
        this.k = xd.a.h((Object)a$a$a.a);
        this.l = xd.a.h((Object)null);
        this.m = xd.a.h((Object)null);
        this.n = new UserSessionRepositoryImpl$a(this);
        final t<d> subscribeOn = sessionChangeEventBus.get().map((ff2.o<? super Object, ? extends d>)new l10.f((Object)this, 23)).startWith(zx0.c.a(d)).distinctUntilChanged().subscribeOn(cf2.a.a());
        ng2.e.e((Object)subscribeOn, "sessionChangeEventBus.ge\u2026n(SchedulerProvider.ui())");
        this.h = px0.c.U2((t)subscribeOn, (l)new UserSessionRepositoryImpl$2(this));
    }
    
    public static final void a(final UserSessionRepositoryImpl userSessionRepositoryImpl, final d d) {
        final m m = (m)userSessionRepositoryImpl.d.d().invoke();
        final RedditSession c = userSessionRepositoryImpl.d.c();
        if (m != null) {
            if (ng2.e.a((Object)m.getKindWithId(), (Object)d.f)) {
                g.g((c0)userSessionRepositoryImpl.f, null, null, (p)new UserSessionRepositoryImpl$onRequestBearerToken$1(userSessionRepositoryImpl, (Session)c, d, null), 3);
            }
        }
    }
    
    public final StateFlowImpl b() {
        return this.j;
    }
    
    public final StateFlowImpl c() {
        return this.i;
    }
    
    public final StateFlowImpl d() {
        return this.m;
    }
    
    public final void e(final String s) {
        ng2.e.f((Object)s, "roomId");
        zi2.g.g((c0)this.f, null, null, (p)new UserSessionRepositoryImpl$leaveRoom.UserSessionRepositoryImpl$leaveRoom$1(this, s, (gg2.c)null), 3);
    }
    
    public final StateFlowImpl f() {
        return this.l;
    }
    
    public final StateFlowImpl g() {
        return this.k;
    }
    
    public final void h(final String s) {
        ng2.e.f((Object)s, "roomId");
        zi2.g.g((c0)this.f, null, null, (p)new UserSessionRepositoryImpl$acceptRoom.UserSessionRepositoryImpl$acceptRoom$1(this, s, (gg2.c)null), 3);
    }
    
    public final void i(final d value, final vn2.a value2) {
        ng2.e.f((Object)value, "user");
        ng2.e.f((Object)value2, "session");
        if (ng2.e.a((Object)value2, this.i.getValue())) {
            return;
        }
        ah0.b.x(this.g.f, (CancellationException)null);
        try (final vn2.a a = (vn2.a)this.i.getValue()) {}
        this.j.setValue((Object)value);
        this.i.setValue((Object)value2);
        this.e.b(value, value2);
        value2.open();
        value2.n();
        value2.g(this.n);
        final Object value3 = this.i.getValue();
        ng2.e.c(value3);
        kotlinx.coroutines.flow.a.b((cj2.e)new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1((p)new UserSessionRepositoryImpl$setupSessionObservers$1(this, null), ((fo2.a)value3).m()), (c0)this.g);
        final Membership join = Membership.JOIN;
        int i = 0;
        final Membership invite = Membership.INVITE;
        while (i < 2) {
            final Membership membership = (new Membership[] { join, invite })[i];
            final Object value4 = this.i.getValue();
            ng2.e.c(value4);
            final vn2.a a2 = (vn2.a)value4;
            final UserSessionRepositoryImpl$setupSessionObservers$2 userSessionRepositoryImpl$setupSessionObservers$2 = new UserSessionRepositoryImpl$setupSessionObservers$2(membership);
            final d$a d$a = new d$a();
            ((l)userSessionRepositoryImpl$setupSessionObservers$2).invoke((Object)d$a);
            kotlinx.coroutines.flow.a.b((cj2.e)new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1((p)new UserSessionRepositoryImpl$setupSessionObservers$3(membership, this, null), ((mo2.c)a2).o(new mo2.d(d$a.a, d$a.b, d$a.c, d$a.d, d$a.e, d$a.f), RoomSortOrder.ACTIVITY)), (c0)this.g);
            ++i;
        }
    }
}
