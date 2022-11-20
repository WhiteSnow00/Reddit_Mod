// 
// Decompiled by Procyon v0.6.0
// 

package bj2;

import kotlinx.coroutines.internal.UndeliveredElementException;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlin.NoWhenBranchMatchedException;
import java.util.Arrays;
import kotlinx.coroutines.channels.AbstractChannel$g;
import jj2.d;
import ej2.t;
import ng2.e;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import a01.a;
import cg2.j;
import mg2.l;
import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.AbstractChannel;

public final class c<E> extends AbstractChannel<E>
{
    public final int i;
    public final BufferOverflow j;
    public final ReentrantLock k;
    public Object[] l;
    public int m;
    private volatile int size;
    
    public c(final int i, final BufferOverflow j, final l<? super E, j> l) {
        super((l)l);
        this.i = i;
        this.j = j;
        boolean b = true;
        if (i < 1) {
            b = false;
        }
        if (b) {
            this.k = new ReentrantLock();
            final Object[] k = new Object[Math.min(i, 8)];
            dg2.j.X1(k, a.o);
            this.l = k;
            this.size = 0;
            return;
        }
        throw new IllegalArgumentException(aq2.a.l("ArrayChannel capacity must be at least 1, but ", i, " was specified").toString());
    }
    
    public final Object A() {
        final ReentrantLock k = this.k;
        k.lock();
        try {
            final int size = this.size;
            if (size == 0) {
                Object o;
                if ((o = ((bj2.a)this).h()) == null) {
                    o = a.r;
                }
                return o;
            }
            final Object[] l = this.l;
            final int m = this.m;
            final Object o2 = l[m];
            s s = null;
            l[m] = null;
            this.size = size - 1;
            final t r = a.r;
            final int i = this.i;
            final boolean b = false;
            t t = r;
            int n = b ? 1 : 0;
            if (size == i) {
                s = null;
                while (true) {
                    final s p = ((bj2.a)this).p();
                    if (p == null) {
                        t = r;
                        n = (b ? 1 : 0);
                        break;
                    }
                    if (p.F(null) != null) {
                        final Object c = p.C();
                        n = 1;
                        s = p;
                        t = (t)c;
                        break;
                    }
                    p.H();
                    s = p;
                }
            }
            if (t != a.r && !(t instanceof i)) {
                this.size = size;
                final Object[] j = this.l;
                j[(this.m + size) % j.length] = t;
            }
            this.m = (this.m + 1) % this.l.length;
            final j a = cg2.j.a;
            k.unlock();
            if (n != 0) {
                e.c((Object)s);
                s.B();
            }
            return o2;
        }
        finally {
            k.unlock();
        }
    }
    
    public final Object B(final d<?> d) {
        final ReentrantLock k = this.k;
        k.lock();
        try {
            final int size = this.size;
            if (size == 0) {
                Object o;
                if ((o = ((bj2.a)this).h()) == null) {
                    o = a.r;
                }
                return o;
            }
            final Object[] l = this.l;
            final int m = this.m;
            final Object o2 = l[m];
            Object i = null;
            l[m] = null;
            this.size = size - 1;
            final t r = a.r;
            Object o3 = null;
            boolean b = false;
            Label_0256: {
                Label_0250: {
                    if (size == this.i) {
                        do {
                            final AbstractChannel$g abstractChannel$g = new AbstractChannel$g(((bj2.a)this).g);
                            o3 = d.k(abstractChannel$g);
                            if (o3 == null) {
                                i = ((LockFreeLinkedListNode.d)abstractChannel$g).m();
                                o3 = ((s)i).C();
                                b = true;
                                break Label_0256;
                            }
                            if (o3 != a.r) {
                                continue;
                            }
                            break Label_0250;
                        } while (o3 == a.z);
                        if (o3 == jj2.e.b) {
                            this.size = size;
                            this.l[this.m] = o2;
                            return o3;
                        }
                        if (o3 instanceof i) {
                            b = true;
                            i = o3;
                            break Label_0256;
                        }
                        final StringBuilder sb = new StringBuilder();
                        sb.append("performAtomicTrySelect(describeTryOffer) returned ");
                        sb.append(o3);
                        throw new IllegalStateException(sb.toString().toString());
                    }
                }
                b = false;
                o3 = r;
            }
            if (o3 != a.r && !(o3 instanceof i)) {
                this.size = size;
                final Object[] j = this.l;
                j[(this.m + size) % j.length] = o3;
            }
            else if (!d.l()) {
                this.size = size;
                this.l[this.m] = o2;
                return jj2.e.b;
            }
            this.m = (this.m + 1) % this.l.length;
            final j a = cg2.j.a;
            k.unlock();
            if (b) {
                e.c(i);
                ((s)i).B();
            }
            return o2;
        }
        finally {
            k.unlock();
        }
    }
    
    public final void E(final int n, final E e) {
        final int i = this.i;
        if (n < i) {
            final Object[] l = this.l;
            if (n >= l.length) {
                final int min = Math.min(l.length * 2, i);
                final Object[] j = new Object[min];
                for (int k = 0; k < n; ++k) {
                    final Object[] m = this.l;
                    j[k] = m[(this.m + k) % m.length];
                }
                Arrays.fill(j, n, min, a.o);
                this.l = j;
                this.m = 0;
            }
            final Object[] l2 = this.l;
            l2[(this.m + n) % l2.length] = e;
        }
        else {
            final Object[] l3 = this.l;
            final int m2 = this.m;
            l3[m2 % l3.length] = null;
            l3[(n + m2) % l3.length] = e;
            this.m = (m2 + 1) % l3.length;
        }
    }
    
    public final Object f(final u u) {
        final ReentrantLock k = this.k;
        k.lock();
        try {
            return super.f(u);
        }
        finally {
            k.unlock();
        }
    }
    
    public final String g() {
        final StringBuilder t = a.t("(buffer:capacity=");
        t.append(this.i);
        t.append(",size=");
        return d.j(t, this.size, ')');
    }
    
    public final boolean k() {
        return false;
    }
    
    public final boolean l() {
        return this.size == this.i && this.j == BufferOverflow.SUSPEND;
    }
    
    public final Object m(final E e) {
        final ReentrantLock k = this.k;
        k.lock();
        try {
            final int size = this.size;
            final i<?> h = ((bj2.a)this).h();
            if (h != null) {
                return h;
            }
            final int i = this.i;
            Object o = null;
            if (size < i) {
                this.size = size + 1;
            }
            else {
                final int n = c.c$a.a[this.j.ordinal()];
                if (n != 1) {
                    if (n != 2) {
                        if (n != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                    else {
                        o = a.p;
                    }
                }
                else {
                    o = a.q;
                }
            }
            if (o != null) {
                return o;
            }
            Label_0209: {
                if (size == 0) {
                    q o2;
                    do {
                        o2 = this.o();
                        if (o2 == null) {
                            break Label_0209;
                        }
                        if (o2 instanceof i) {
                            this.size = size;
                            return o2;
                        }
                    } while (o2.c((Object)e) == null);
                    this.size = size;
                    final j a = cg2.j.a;
                    k.unlock();
                    o2.i((Object)e);
                    return o2.d();
                }
            }
            this.E(size, e);
            return a.p;
        }
        finally {
            k.unlock();
        }
    }
    
    public final boolean r(final o<? super E> o) {
        final ReentrantLock k = this.k;
        k.lock();
        try {
            return super.r((o)o);
        }
        finally {
            k.unlock();
        }
    }
    
    public final boolean s() {
        return false;
    }
    
    public final boolean t() {
        return this.size == 0;
    }
    
    public final boolean v() {
        final ReentrantLock k = this.k;
        k.lock();
        try {
            return super.v();
        }
        finally {
            k.unlock();
        }
    }
    
    public final void w(final boolean b) {
        final mg2.l<E, j> f = (mg2.l<E, j>)((bj2.a)this).f;
        final ReentrantLock k = this.k;
        k.lock();
        try {
            final int size = this.size;
            UndeliveredElementException ex = null;
            UndeliveredElementException b2;
            for (int i = 0; i < size; ++i, ex = b2) {
                final Object o = this.l[this.m];
                b2 = ex;
                if (f != null) {
                    b2 = ex;
                    if (o != a.o) {
                        b2 = OnUndeliveredElementKt.b((mg2.l<? super t, j>)f, (t)o, ex);
                    }
                }
                final Object[] l = this.l;
                final int m = this.m;
                l[m] = a.o;
                this.m = (m + 1) % l.length;
            }
            this.size = 0;
            final j a = cg2.j.a;
            k.unlock();
            super.w(b);
            if (ex == null) {
                return;
            }
            throw ex;
        }
        finally {
            k.unlock();
        }
    }
}
