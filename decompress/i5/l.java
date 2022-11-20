// 
// Decompiled by Procyon v0.6.0
// 

package i5;

import java.util.concurrent.Executor;
import m.a;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import z1.f;
import java.util.concurrent.Callable;
import androidx.room.RoomDatabase;
import androidx.lifecycle.LiveData;

public final class l<T> extends LiveData<T>
{
    public final RoomDatabase l;
    public final boolean m;
    public final Callable<T> n;
    public final f o;
    public final l$c p;
    public final AtomicBoolean q;
    public final AtomicBoolean r;
    public final AtomicBoolean s;
    public final l$a t;
    public final l$b u;
    
    public l(final RoomDatabase l, final f o, final boolean m, final Callable<T> n, final String[] array) {
        this.q = new AtomicBoolean(true);
        this.r = new AtomicBoolean(false);
        this.s = new AtomicBoolean(false);
        this.t = new l$a(this);
        this.u = new l$b(this);
        this.l = l;
        this.m = m;
        this.n = n;
        this.o = o;
        this.p = new g$c(this, array) {
            public final l b;
            
            public final void a(final Set<String> set) {
                final a s2 = a.S2();
                final l$b u = this.b.u;
                if (s2.T2()) {
                    u.run();
                }
                else {
                    s2.U2((Runnable)u);
                }
            }
        };
    }
    
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
    
    public final void h() {
        ((Set)this.o.g).remove(this);
    }
}
