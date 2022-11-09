// 
// Decompiled by Procyon v0.6.0
// 

package androidx.work.impl.background.systemalarm;

import l6.q;
import java.util.Collection;
import java.util.Collections;
import l6.t;
import m6.r;
import androidx.work.WorkerParameters$a;
import java.util.List;
import java.util.ArrayList;
import android.content.Intent;
import c6.h;
import android.os.PowerManager$WakeLock;
import android.content.Context;
import m6.x$b;
import d6.a;

public final class c implements h6.c, a, x$b
{
    public static final String o;
    public final Context f;
    public final int g;
    public final String h;
    public final d i;
    public final h6.d j;
    public final Object k;
    public int l;
    public PowerManager$WakeLock m;
    public boolean n;
    
    static {
        o = h.e("DelayMetCommandHandler");
    }
    
    public c(final Context f, final int g, final String h, final d i) {
        this.f = f;
        this.g = g;
        this.i = i;
        this.h = h;
        this.j = new h6.d(f, i.g, (h6.c)this);
        this.n = false;
        this.l = 0;
        this.k = new Object();
    }
    
    public final void a(final String s) {
        c6.h.c().a(c.o, String.format("Exceeded time limits on execution for %s", s), new Throwable[0]);
        this.g();
    }
    
    public final void b() {
        synchronized (this.k) {
            this.j.c();
            this.i.h.b(this.h);
            final PowerManager$WakeLock m = this.m;
            if (m != null && m.isHeld()) {
                c6.h.c().a(c.o, String.format("Releasing wakelock %s for WorkSpec %s", this.m, this.h), new Throwable[0]);
                this.m.release();
            }
        }
    }
    
    public final void c(final String s, final boolean b) {
        c6.h.c().a(c.o, String.format("onExecuted %s, %s", s, b), new Throwable[0]);
        this.b();
        if (b) {
            final Intent b2 = androidx.work.impl.background.systemalarm.a.b(this.f, this.h);
            final d i = this.i;
            i.e((Runnable)new d$b(this.g, b2, i));
        }
        if (this.n) {
            final Intent intent = new Intent(this.f, (Class)SystemAlarmService.class);
            intent.setAction("ACTION_CONSTRAINTS_CHANGED");
            final d j = this.i;
            j.e((Runnable)new d$b(this.g, intent, j));
        }
    }
    
    public final void d(final ArrayList list) {
        this.g();
    }
    
    public final void e(final List<String> list) {
        if (!list.contains(this.h)) {
            return;
        }
        synchronized (this.k) {
            if (this.l == 0) {
                this.l = 1;
                c6.h.c().a(c.o, String.format("onAllConstraintsMet for %s", this.h), new Throwable[0]);
                if (this.i.i.f(this.h, null)) {
                    this.i.h.a(this.h, (x$b)this);
                }
                else {
                    this.b();
                }
            }
            else {
                c6.h.c().a(c.o, String.format("Already started work for %s", this.h), new Throwable[0]);
            }
        }
    }
    
    public final void f() {
        this.m = r.a(this.f, String.format("%s (%s)", this.h, this.g));
        final h c = c6.h.c();
        final String o = androidx.work.impl.background.systemalarm.c.o;
        c.a(o, String.format("Acquiring wakelock %s for WorkSpec %s", this.m, this.h), new Throwable[0]);
        this.m.acquire();
        final q k = ((t)this.i.j.c.x()).k(this.h);
        if (k == null) {
            this.g();
            return;
        }
        if (!(this.n = k.b())) {
            c6.h.c().a(o, String.format("No constraints for %s", this.h), new Throwable[0]);
            this.e(Collections.singletonList(this.h));
        }
        else {
            this.j.b(Collections.singletonList(k));
        }
    }
    
    public final void g() {
        synchronized (this.k) {
            if (this.l < 2) {
                this.l = 2;
                final h c = c6.h.c();
                final String o = androidx.work.impl.background.systemalarm.c.o;
                c.a(o, String.format("Stopping work for WorkSpec %s", this.h), new Throwable[0]);
                final Context f = this.f;
                final String h = this.h;
                final Intent intent = new Intent(f, (Class)SystemAlarmService.class);
                intent.setAction("ACTION_STOP_WORK");
                intent.putExtra("KEY_WORKSPEC_ID", h);
                final d i = this.i;
                i.e((Runnable)new d$b(this.g, intent, i));
                if (this.i.i.d(this.h)) {
                    c6.h.c().a(o, String.format("WorkSpec %s needs to be rescheduled", this.h), new Throwable[0]);
                    final Intent b = androidx.work.impl.background.systemalarm.a.b(this.f, this.h);
                    final d j = this.i;
                    j.e((Runnable)new d$b(this.g, b, j));
                }
                else {
                    c6.h.c().a(o, String.format("Processor does not have WorkSpec %s. No need to reschedule ", this.h), new Throwable[0]);
                }
            }
            else {
                c6.h.c().a(c.o, String.format("Already stopped work for %s", this.h), new Throwable[0]);
            }
        }
    }
}
