// 
// Decompiled by Procyon v0.6.0
// 

package m6;

import androidx.room.RoomDatabase;
import l6.r;
import d6.c;
import androidx.work.impl.WorkDatabase;
import androidx.work.WorkInfo$State;
import l6.t;
import c6.i;
import d6.j;

public final class p implements Runnable
{
    public static final String i;
    public final j f;
    public final String g;
    public final boolean h;
    
    static {
        i = c6.i.e("StopWorkRunnable");
    }
    
    public p(final j f, final String g, final boolean h) {
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    @Override
    public final void run() {
        final j f = this.f;
        final WorkDatabase c = f.c;
        final c f2 = f.f;
        final r x = c.x();
        ((RoomDatabase)c).c();
        try {
            final String g = this.g;
            Object o = f2.p;
            synchronized (o) {
                final boolean containsKey = f2.k.containsKey(g);
                monitorexit(o);
                boolean b;
                if (this.h) {
                    b = this.f.f.h(this.g);
                }
                else {
                    if (!containsKey) {
                        o = this.g;
                        final t t = (t)x;
                        if (t.h((String)o) == WorkInfo$State.RUNNING) {
                            t.s(WorkInfo$State.ENQUEUED, new String[] { this.g });
                        }
                    }
                    b = this.f.f.i(this.g);
                }
                c6.i.c().a(p.i, String.format("StopWorkRunnable for %s; Processor.stopWork = %s", this.g, b), new Throwable[0]);
                ((RoomDatabase)c).q();
            }
        }
        finally {
            ((RoomDatabase)c).m();
        }
    }
}
