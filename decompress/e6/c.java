// 
// Decompiled by Procyon v0.6.0
// 

package e6;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collection;
import android.text.TextUtils;
import androidx.work.WorkerParameters$a;
import android.os.Handler;
import androidx.work.WorkInfo$State;
import l6.q;
import c6.i;
import java.util.HashSet;
import d6.j;
import android.content.Context;
import d6.a;
import d6.d;

public final class c implements d, h6.c, a
{
    public static final String n;
    public final Context f;
    public final j g;
    public final h6.d h;
    public final HashSet i;
    public b j;
    public boolean k;
    public final Object l;
    public Boolean m;
    
    static {
        n = i.e("GreedyScheduler");
    }
    
    public c(final Context f, final androidx.work.a a, final n6.b b, final j g) {
        this.i = new HashSet();
        this.f = f;
        this.g = g;
        this.h = new h6.d(f, (n6.a)b, (h6.c)this);
        this.j = new b(this, a.e);
        this.l = new Object();
    }
    
    public final void a(final q... array) {
        if (this.m == null) {
            this.m = m6.j.a(this.f, this.g.b);
        }
        if (!this.m) {
            c6.i.c().d(c.n, "Ignoring schedule request in a secondary process", new Throwable[0]);
            return;
        }
        if (!this.k) {
            this.g.f.a((a)this);
            this.k = true;
        }
        final HashSet<q> set = new HashSet<q>();
        final HashSet<String> set2 = new HashSet<String>();
        for (final q q : array) {
            final long a = q.a();
            final long currentTimeMillis = System.currentTimeMillis();
            if (q.b == WorkInfo$State.ENQUEUED) {
                if (currentTimeMillis < a) {
                    final b j = this.j;
                    if (j != null) {
                        final Runnable runnable = j.c.remove(q.a);
                        if (runnable != null) {
                            ((Handler)j.b.g).removeCallbacks(runnable);
                        }
                        final e6.a a2 = new e6.a(j, q);
                        j.c.put(q.a, a2);
                        ((Handler)j.b.g).postDelayed((Runnable)a2, q.a() - System.currentTimeMillis());
                    }
                }
                else if (q.b()) {
                    final c6.b k = q.j;
                    if (k.c) {
                        c6.i.c().a(c.n, String.format("Ignoring WorkSpec %s, Requires device idle.", q), new Throwable[0]);
                    }
                    else if (k.h.a.size() > 0) {
                        c6.i.c().a(c.n, String.format("Ignoring WorkSpec %s, Requires ContentUri triggers.", q), new Throwable[0]);
                    }
                    else {
                        set.add(q);
                        set2.add(q.a);
                    }
                }
                else {
                    c6.i.c().a(c.n, String.format("Starting work for %s", q.a), new Throwable[0]);
                    this.g.o(q.a, null);
                }
            }
        }
        synchronized (this.l) {
            if (!set.isEmpty()) {
                c6.i.c().a(c.n, String.format("Starting tracking for [%s]", TextUtils.join((CharSequence)",", (Iterable)set2)), new Throwable[0]);
                this.i.addAll(set);
                this.h.b((Collection)this.i);
            }
        }
    }
    
    public final boolean b() {
        return false;
    }
    
    public final void c(final String s, final boolean b) {
        synchronized (this.l) {
            for (final q q : this.i) {
                if (q.a.equals(s)) {
                    c6.i.c().a(c.n, String.format("Stopping tracking for %s", s), new Throwable[0]);
                    this.i.remove(q);
                    this.h.b((Collection)this.i);
                    break;
                }
            }
        }
    }
    
    public final void cancel(final String s) {
        if (this.m == null) {
            this.m = m6.j.a(this.f, this.g.b);
        }
        if (!this.m) {
            c6.i.c().d(c.n, "Ignoring schedule request in non-main process", new Throwable[0]);
            return;
        }
        if (!this.k) {
            this.g.f.a((a)this);
            this.k = true;
        }
        c6.i.c().a(c.n, String.format("Cancelling work ID %s", s), new Throwable[0]);
        final b j = this.j;
        if (j != null) {
            final Runnable runnable = j.c.remove(s);
            if (runnable != null) {
                ((Handler)j.b.g).removeCallbacks(runnable);
            }
        }
        this.g.p(s);
    }
    
    public final void d(final ArrayList list) {
        for (final String s : list) {
            c6.i.c().a(c.n, String.format("Constraints not met: Cancelling work ID %s", s), new Throwable[0]);
            this.g.p(s);
        }
    }
    
    public final void e(final List<String> list) {
        for (final String s : (ArrayList)list) {
            c6.i.c().a(c.n, String.format("Constraints met: Scheduling work ID %s", s), new Throwable[0]);
            this.g.o(s, null);
        }
    }
}
