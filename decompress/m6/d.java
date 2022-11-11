// 
// Decompiled by Procyon v0.6.0
// 

package m6;

import java.util.Iterator;
import l6.r;
import androidx.work.impl.WorkDatabase;
import d6.m;
import c6.i;
import java.util.Collection;
import l6.c;
import androidx.work.WorkInfo$State;
import l6.t;
import java.util.LinkedList;
import d6.j;
import d6.b;

public abstract class d implements Runnable
{
    public final b f;
    
    public d() {
        this.f = new b();
    }
    
    public static void a(final j j, final String s) {
        final WorkDatabase c = j.c;
        final r x = c.x();
        final l6.b s2 = c.s();
        final LinkedList list = new LinkedList();
        list.add(s);
        boolean b;
        while (true) {
            final boolean empty = list.isEmpty();
            b = false;
            if (empty) {
                break;
            }
            final String s3 = list.remove();
            final t t = (t)x;
            final WorkInfo$State h = t.h(s3);
            if (h != WorkInfo$State.SUCCEEDED && h != WorkInfo$State.FAILED) {
                t.s(WorkInfo$State.CANCELLED, new String[] { s3 });
            }
            list.addAll(((c)s2).a(s3));
        }
        final d6.c f = j.f;
        synchronized (f.p) {
            i.c().a(d6.c.q, String.format("Processor cancelling %s", s), new Throwable[0]);
            f.n.add(s);
            final m m = f.k.remove(s);
            if (m != null) {
                b = true;
            }
            m i;
            if ((i = m) == null) {
                i = f.l.remove(s);
            }
            d6.c.b(s, i);
            if (b) {
                f.g();
            }
            monitorexit(f.p);
            final Iterator<d6.d> iterator = j.e.iterator();
            while (iterator.hasNext()) {
                iterator.next().cancel(s);
            }
        }
    }
    
    public abstract void b();
    
    @Override
    public final void run() {
        try {
            this.b();
            this.f.a((c6.j.a)c6.j.a);
        }
        finally {
            final Throwable t;
            this.f.a((c6.j.a)new c6.j.a.a(t));
        }
    }
}
