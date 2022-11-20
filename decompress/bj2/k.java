// 
// Decompiled by Procyon v0.6.0
// 

package bj2;

import kotlinx.coroutines.internal.UndeliveredElementException;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import jj2.e;
import jj2.d;
import ej2.t;
import a01.a;
import cg2.j;
import mg2.l;
import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.channels.AbstractChannel;

public class k<E> extends AbstractChannel<E>
{
    public final ReentrantLock i;
    public Object j;
    
    public k(final l<? super E, j> l) {
        super((l)l);
        this.i = new ReentrantLock();
        this.j = a.o;
    }
    
    public final Object A() {
        final ReentrantLock i = this.i;
        i.lock();
        try {
            final Object j = this.j;
            final t o = a.o;
            if (j == o) {
                Object o2;
                if ((o2 = ((bj2.a)this).h()) == null) {
                    o2 = a.r;
                }
                return o2;
            }
            this.j = o;
            final j a = cg2.j.a;
            return j;
        }
        finally {
            i.unlock();
        }
    }
    
    public final Object B(final d<?> d) {
        final ReentrantLock i = this.i;
        i.lock();
        try {
            final Object j = this.j;
            final t o = a.o;
            if (j == o) {
                Object o2;
                if ((o2 = ((bj2.a)this).h()) == null) {
                    o2 = a.r;
                }
                return o2;
            }
            if (!d.l()) {
                return e.b;
            }
            final Object k = this.j;
            this.j = o;
            final j a = cg2.j.a;
            return k;
        }
        finally {
            i.unlock();
        }
    }
    
    public final String g() {
        final ReentrantLock i = this.i;
        i.lock();
        try {
            final StringBuilder sb = new StringBuilder();
            sb.append("(value=");
            sb.append(this.j);
            sb.append(')');
            return sb.toString();
        }
        finally {
            i.unlock();
        }
    }
    
    public final boolean k() {
        return false;
    }
    
    public final boolean l() {
        return false;
    }
    
    public Object m(final E j) {
        final ReentrantLock i = this.i;
        i.lock();
        try {
            final i<?> h = ((bj2.a)this).h();
            if (h != null) {
                return h;
            }
            Label_0099: {
                if (this.j == a.o) {
                    q o;
                    do {
                        o = this.o();
                        if (o == null) {
                            break Label_0099;
                        }
                        if (o instanceof i) {
                            return o;
                        }
                    } while (o.c((Object)j) == null);
                    final j a = j.a;
                    i.unlock();
                    o.i((Object)j);
                    return o.d();
                }
            }
            final Object k = this.j;
            final t o2 = a.o;
            UndeliveredElementException b = null;
            if (k != o2) {
                final mg2.l<E, j> f = (mg2.l<E, j>)((bj2.a)this).f;
                if (f != null) {
                    b = OnUndeliveredElementKt.b((mg2.l<? super t, j>)f, (t)k, null);
                }
            }
            this.j = j;
            if (b == null) {
                return a.p;
            }
            throw b;
        }
        finally {
            i.unlock();
        }
    }
    
    public final boolean r(final o<? super E> o) {
        final ReentrantLock i = this.i;
        i.lock();
        try {
            return super.r((o)o);
        }
        finally {
            i.unlock();
        }
    }
    
    public final boolean s() {
        return false;
    }
    
    public final boolean t() {
        final ReentrantLock i = this.i;
        i.lock();
        try {
            return this.j == a.o;
        }
        finally {
            i.unlock();
        }
    }
    
    public void w(final boolean b) {
        final ReentrantLock i = this.i;
        i.lock();
        try {
            final t o = a.o;
            final Object j = this.j;
            UndeliveredElementException b2 = null;
            if (j != o) {
                final mg2.l<E, j> f = (mg2.l<E, j>)((bj2.a)this).f;
                if (f != null) {
                    b2 = OnUndeliveredElementKt.b((mg2.l<? super t, j>)f, (t)j, null);
                }
            }
            this.j = o;
            final j a = cg2.j.a;
            i.unlock();
            super.w(b);
            if (b2 == null) {
                return;
            }
            throw b2;
        }
        finally {
            i.unlock();
        }
    }
}
