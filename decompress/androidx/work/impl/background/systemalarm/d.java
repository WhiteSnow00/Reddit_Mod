// 
// Decompiled by Procyon v0.6.0
// 

package androidx.work.impl.background.systemalarm;

import android.os.PowerManager$WakeLock;
import n6.b;
import m6.r;
import java.util.Iterator;
import android.text.TextUtils;
import android.os.Looper;
import c6.h;
import android.content.Intent;
import java.util.ArrayList;
import android.os.Handler;
import d6.j;
import d6.c;
import m6.x;
import android.content.Context;
import d6.a;

public final class d implements a
{
    public static final String p;
    public final Context f;
    public final n6.a g;
    public final x h;
    public final c i;
    public final j j;
    public final androidx.work.impl.background.systemalarm.a k;
    public final Handler l;
    public final ArrayList m;
    public Intent n;
    public d.d$c o;
    
    static {
        p = h.e("SystemAlarmDispatcher");
    }
    
    public d(final Context context) {
        final Context applicationContext = context.getApplicationContext();
        this.f = applicationContext;
        this.k = new androidx.work.impl.background.systemalarm.a(applicationContext);
        this.h = new x();
        final j k = d6.j.k(context);
        this.j = k;
        final c f = k.f;
        this.i = f;
        this.g = k.d;
        f.a((a)this);
        this.m = new ArrayList();
        this.n = null;
        this.l = new Handler(Looper.getMainLooper());
    }
    
    public final void a(final int n, final Intent intent) {
        final h c = c6.h.c();
        final String p = d.p;
        boolean b = false;
        c.a(p, String.format("Adding command %s (%s)", intent, n), new Throwable[0]);
        this.b();
        final String action = intent.getAction();
        if (TextUtils.isEmpty((CharSequence)action)) {
            c6.h.c().f(p, "Unknown command. Ignoring", new Throwable[0]);
            return;
        }
        Label_0156: {
            if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
                this.b();
                synchronized (this.m) {
                    final Iterator iterator = this.m.iterator();
                    while (true) {
                        while (iterator.hasNext()) {
                            if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent)iterator.next()).getAction())) {
                                monitorexit(this.m);
                                b = true;
                                if (b) {
                                    return;
                                }
                                break Label_0156;
                            }
                        }
                        monitorexit(this.m);
                        continue;
                    }
                }
            }
        }
        intent.putExtra("KEY_START_ID", n);
        synchronized (this.m) {
            final boolean empty = this.m.isEmpty();
            this.m.add(intent);
            if (!(empty ^ true)) {
                this.f();
            }
        }
    }
    
    public final void b() {
        if (this.l.getLooper().getThread() == Thread.currentThread()) {
            return;
        }
        throw new IllegalStateException("Needs to be invoked on the main thread.");
    }
    
    public final void c(final String s, final boolean b) {
        final Context f = this.f;
        final String i = androidx.work.impl.background.systemalarm.a.i;
        final Intent intent = new Intent(f, (Class)SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", s);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", b);
        this.e((Runnable)new d.d$b(0, intent, this));
    }
    
    public final void d() {
        c6.h.c().a(d.p, "Destroying SystemAlarmDispatcher", new Throwable[0]);
        final c i = this.i;
        Object o = i.p;
        synchronized (o) {
            i.o.remove(this);
            monitorexit(o);
            o = this.h;
            if (!((x)o).a.isShutdown()) {
                ((x)o).a.shutdownNow();
            }
            this.o = null;
        }
    }
    
    public final void e(final Runnable runnable) {
        this.l.post(runnable);
    }
    
    public final void f() {
        this.b();
        final PowerManager$WakeLock a = r.a(this.f, "ProcessCommand");
        try {
            a.acquire();
            ((b)this.j.d).a((Runnable)new d$a(this));
        }
        finally {
            a.release();
        }
    }
}
