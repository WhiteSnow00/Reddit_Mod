// 
// Decompiled by Procyon v0.6.0
// 

package d6;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collection;
import android.text.TextUtils;
import androidx.work.WorkerParameters$a;
import androidx.work.WorkInfo$State;
import k6.q;
import androidx.work.a;
import b6.j;
import java.util.HashSet;
import g6.d;
import c6.k;
import android.content.Context;
import c6.b;
import c6.e;

public final class c implements e, g6.c, b
{
    public static final String n;
    public final Context f;
    public final k g;
    public final d h;
    public final HashSet i;
    public d6.b j;
    public boolean k;
    public final Object l;
    public Boolean m;
    
    static {
        n = j.e("GreedyScheduler");
    }
    
    public c(final Context f, final a a, final m6.b b, final k g) {
        this.i = new HashSet();
        this.f = f;
        this.g = g;
        this.h = new d(f, (m6.a)b, (g6.c)this);
        this.j = new d6.b(this, a.e);
        this.l = new Object();
    }
    
    @Override
    public final void a(final q... array) {
        if (this.m == null) {
            this.m = l6.j.a(this.f, this.g.b);
        }
        if (!this.m) {
            b6.j.c().d(c.n, "Ignoring schedule request in a secondary process", new Throwable[0]);
            return;
        }
        if (!this.k) {
            this.g.f.a((b)this);
            this.k = true;
        }
        final HashSet<q> set = new HashSet<q>();
        final HashSet<String> set2 = new HashSet<String>();
        for (final q q : array) {
            final long a = q.a();
            final long currentTimeMillis = System.currentTimeMillis();
            if (q.b == WorkInfo$State.ENQUEUED) {
                if (currentTimeMillis < a) {
                    final d6.b j = this.j;
                    if (j != null) {
                        final Runnable runnable = j.c.remove(q.a);
                        if (runnable != null) {
                            j.b.a.removeCallbacks(runnable);
                        }
                        final d6.a a2 = new d6.a(j, q);
                        j.c.put(q.a, a2);
                        j.b.a.postDelayed((Runnable)a2, q.a() - System.currentTimeMillis());
                    }
                }
                else if (q.b()) {
                    final b6.b k = q.j;
                    if (k.c) {
                        b6.j.c().a(c.n, String.format("Ignoring WorkSpec %s, Requires device idle.", q), new Throwable[0]);
                    }
                    else if (k.h.a.size() > 0) {
                        b6.j.c().a(c.n, String.format("Ignoring WorkSpec %s, Requires ContentUri triggers.", q), new Throwable[0]);
                    }
                    else {
                        set.add(q);
                        set2.add(q.a);
                    }
                }
                else {
                    b6.j.c().a(c.n, String.format("Starting work for %s", q.a), new Throwable[0]);
                    this.g.o(q.a, (WorkerParameters$a)null);
                }
            }
        }
        synchronized (this.l) {
            if (!set.isEmpty()) {
                b6.j.c().a(c.n, String.format("Starting tracking for [%s]", TextUtils.join((CharSequence)",", (Iterable)set2)), new Throwable[0]);
                this.i.addAll(set);
                this.h.b((Collection)this.i);
            }
        }
    }
    
    @Override
    public final boolean b() {
        return false;
    }
    
    public final void c(final String s, final boolean b) {
        synchronized (this.l) {
            for (final q q : this.i) {
                if (q.a.equals(s)) {
                    b6.j.c().a(c.n, String.format("Stopping tracking for %s", s), new Throwable[0]);
                    this.i.remove(q);
                    this.h.b((Collection)this.i);
                    break;
                }
            }
        }
    }
    
    @Override
    public final void cancel(final String s) {
        if (this.m == null) {
            this.m = l6.j.a(this.f, this.g.b);
        }
        if (!this.m) {
            b6.j.c().d(c.n, "Ignoring schedule request in non-main process", new Throwable[0]);
            return;
        }
        if (!this.k) {
            this.g.f.a((b)this);
            this.k = true;
        }
        b6.j.c().a(c.n, String.format("Cancelling work ID %s", s), new Throwable[0]);
        final d6.b j = this.j;
        if (j != null) {
            final Runnable runnable = j.c.remove(s);
            if (runnable != null) {
                j.b.a.removeCallbacks(runnable);
            }
        }
        this.g.p(s);
    }
    
    public final void d(final ArrayList list) {
        for (final String s : list) {
            b6.j.c().a(c.n, String.format("Constraints not met: Cancelling work ID %s", s), new Throwable[0]);
            this.g.p(s);
        }
    }
    
    public final void e(final List<String> list) {
        for (final String s : (ArrayList)list) {
            b6.j.c().a(c.n, String.format("Constraints met: Scheduling work ID %s", s), new Throwable[0]);
            this.g.o(s, (WorkerParameters$a)null);
        }
    }
}
