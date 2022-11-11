// 
// Decompiled by Procyon v0.6.0
// 

package d6;

import androidx.work.impl.utils.futures.AbstractFuture;
import java.util.concurrent.Future;
import android.content.Intent;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.concurrent.Executor;
import androidx.work.WorkerParameters$a;
import m6.r;
import java.util.Iterator;
import androidx.work.ListenableWorker;
import androidx.work.ListenableWorker$a;
import n6.b;
import c6.i;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.HashMap;
import androidx.work.impl.WorkDatabase;
import android.content.Context;
import android.os.PowerManager$WakeLock;

public final class c implements d6.a, a
{
    public static final String q;
    public PowerManager$WakeLock f;
    public Context g;
    public androidx.work.a h;
    public n6.a i;
    public WorkDatabase j;
    public HashMap k;
    public HashMap l;
    public List<d> m;
    public HashSet n;
    public final ArrayList o;
    public final Object p;
    
    static {
        q = i.e("Processor");
    }
    
    public c(final Context g, final androidx.work.a h, final b i, final WorkDatabase j, final List m) {
        this.g = g;
        this.h = h;
        this.i = (n6.a)i;
        this.j = j;
        this.l = new HashMap();
        this.k = new HashMap();
        this.m = m;
        this.n = new HashSet();
        this.o = new ArrayList();
        this.f = null;
        this.p = new Object();
    }
    
    public static boolean b(final String s, final m m) {
        if (m != null) {
            m.x = true;
            m.i();
            final wg.c<ListenableWorker$a> w = m.w;
            boolean done;
            if (w != null) {
                done = ((Future)w).isDone();
                ((Future)m.w).cancel(true);
            }
            else {
                done = false;
            }
            final ListenableWorker k = m.k;
            if (k != null && !done) {
                k.stop();
            }
            else {
                i.c().a(m.y, String.format("WorkSpec %s is already done. Not interrupting.", m.j), new Throwable[0]);
            }
            i.c().a(c.q, String.format("WorkerWrapper interrupted for %s", s), new Throwable[0]);
            return true;
        }
        i.c().a(c.q, String.format("WorkerWrapper could not be found for %s", s), new Throwable[0]);
        return false;
    }
    
    public final void a(final d6.a a) {
        synchronized (this.p) {
            this.o.add(a);
        }
    }
    
    public final void c(final String s, final boolean b) {
        synchronized (this.p) {
            this.l.remove(s);
            c6.i.c().a(c.q, String.format("%s %s executed; reschedule = %s", c.class.getSimpleName(), s, b), new Throwable[0]);
            final Iterator iterator = this.o.iterator();
            while (iterator.hasNext()) {
                ((d6.a)iterator.next()).c(s, b);
            }
        }
    }
    
    public final boolean d(final String s) {
        synchronized (this.p) {
            return this.l.containsKey(s) || this.k.containsKey(s);
        }
    }
    
    public final void e(final String s, final c6.d d) {
        synchronized (this.p) {
            c6.i.c().d(c.q, String.format("Moving WorkSpec (%s) to the foreground", s), new Throwable[0]);
            final m m = this.l.remove(s);
            if (m != null) {
                if (this.f == null) {
                    (this.f = r.a(this.g, "ProcessorForegroundLck")).acquire();
                }
                this.k.put(s, m);
                n3.a.startForegroundService(this.g, androidx.work.impl.foreground.a.b(this.g, s, d));
            }
        }
    }
    
    public final boolean f(final String s, final WorkerParameters$a h) {
        synchronized (this.p) {
            if (this.d(s)) {
                c6.i.c().a(c.q, String.format("Work %s is already enqueued for processing", s), new Throwable[0]);
                return false;
            }
            final m.a a = new m.a(this.g, this.h, this.i, this, this.j, s);
            a.g = this.m;
            if (h != null) {
                a.h = h;
            }
            final m m = new m(a);
            final androidx.work.impl.utils.futures.a<Boolean> v = m.v;
            ((AbstractFuture)v).a((Runnable)new c.c$a((d6.a)this, s, (androidx.work.impl.utils.futures.a)v), (Executor)((b)this.i).c);
            this.l.put(s, m);
            monitorexit(this.p);
            ((b)this.i).a.execute(m);
            c6.i.c().a(c.q, String.format("%s: processing %s", c.class.getSimpleName(), s), new Throwable[0]);
            return true;
        }
    }
    
    public final void g() {
        synchronized (this.p) {
            if (!(this.k.isEmpty() ^ true)) {
                final Context g = this.g;
                final String p = androidx.work.impl.foreground.a.p;
                final Intent intent = new Intent(g, (Class)SystemForegroundService.class);
                intent.setAction("ACTION_STOP_FOREGROUND");
                try {
                    this.g.startService(intent);
                }
                finally {
                    final Throwable t;
                    c6.i.c().b(c.q, "Unable to stop foreground service", t);
                }
                final PowerManager$WakeLock f = this.f;
                if (f != null) {
                    f.release();
                    this.f = null;
                }
            }
        }
    }
    
    public final boolean h(final String s) {
        synchronized (this.p) {
            c6.i.c().a(c.q, String.format("Processor stopping foreground work %s", s), new Throwable[0]);
            return b(s, this.k.remove(s));
        }
    }
    
    public final boolean i(final String s) {
        synchronized (this.p) {
            c6.i.c().a(c.q, String.format("Processor stopping background work %s", s), new Throwable[0]);
            return b(s, this.l.remove(s));
        }
    }
}
