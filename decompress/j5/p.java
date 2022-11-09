// 
// Decompiled by Procyon v0.6.0
// 

package j5;

import java.util.concurrent.Executor;
import m.a;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.Callable;
import androidx.room.RoomDatabase;
import androidx.lifecycle.LiveData;

public final class p<T> extends LiveData<T>
{
    public final RoomDatabase l;
    public final boolean m;
    public final Callable<T> n;
    public final f o;
    public final p$c p;
    public final AtomicBoolean q;
    public final AtomicBoolean r;
    public final AtomicBoolean s;
    public final p$a t;
    public final p$b u;
    
    public p(final RoomDatabase l, final f o, final boolean m, final Callable<T> n, final String[] array) {
        this.q = new AtomicBoolean(true);
        this.r = new AtomicBoolean(false);
        this.s = new AtomicBoolean(false);
        this.t = new p$a(this);
        this.u = new p$b(this);
        this.l = l;
        this.m = m;
        this.n = n;
        this.o = o;
        this.p = new g$c(array) {
            public final void a(final Set<String> set) {
                final a r2 = m.a.r2();
                final p$b u = j5.p.this.u;
                if (r2.s2()) {
                    u.run();
                }
                else {
                    r2.t2((Runnable)u);
                }
            }
        };
    }
    
    @Override
    public final void g() {
        ((Set)this.o.g).add(this);
        Object o;
        if (this.m) {
            o = this.l.c;
        }
        else {
            o = this.l.b;
        }
        ((Executor)o).execute((Runnable)this.t);
    }
    
    @Override
    public final void h() {
        ((Set)this.o.g).remove(this);
    }
}
