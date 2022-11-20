// 
// Decompiled by Procyon v0.6.0
// 

package bj2;

import kotlinx.coroutines.internal.UndeliveredElementException;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import java.util.ArrayList;
import ej2.t;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import a01.a;
import cg2.j;
import kotlinx.coroutines.channels.AbstractChannel;

public class l<E> extends AbstractChannel<E>
{
    public l(final mg2.l<? super E, j> l) {
        super((mg2.l)l);
    }
    
    public final boolean k() {
        return false;
    }
    
    public final boolean l() {
        return false;
    }
    
    public final Object m(final E e) {
        q q = null;
    Label_0080:
        do {
            final Object m = super.m(e);
            final t p = a.p;
            if (m == p) {
                return p;
            }
            if (m == a.q) {
                final ej2.i g = ((bj2.a)this).g;
                while (true) {
                    LockFreeLinkedListNode u;
                    do {
                        u = ((LockFreeLinkedListNode)g).u();
                        if (u instanceof q) {
                            q = (q)u;
                            if (q == null) {
                                return a.p;
                            }
                            continue Label_0080;
                        }
                    } while (!u.p((LockFreeLinkedListNode)new a$a((Object)e), g));
                    q = null;
                    continue;
                }
            }
            if (m instanceof i) {
                return m;
            }
            throw new IllegalStateException(b.C("Invalid offerInternal result ", m));
        } while (!(q instanceof i));
        return q;
    }
    
    public final boolean s() {
        return true;
    }
    
    public final boolean t() {
        return true;
    }
    
    public final void x(final Object o, final i<?> i) {
        UndeliveredElementException b;
        final UndeliveredElementException ex = b = null;
        if (o != null) {
            if (!(o instanceof ArrayList)) {
                final s s = (s)o;
                if (s instanceof a$a) {
                    final mg2.l<E, j> f = (mg2.l<E, j>)((bj2.a)this).f;
                    b = ex;
                    if (f != null) {
                        b = OnUndeliveredElementKt.b((mg2.l<? super Object, j>)f, ((a$a)s).i, null);
                    }
                }
                else {
                    s.E(i);
                    b = ex;
                }
            }
            else {
                final ArrayList list = (ArrayList)o;
                int n = list.size() - 1;
                UndeliveredElementException b2 = null;
                while (-1 < n) {
                    final s s2 = list.get(n);
                    if (s2 instanceof a$a) {
                        final mg2.l<E, j> f2 = (mg2.l<E, j>)((bj2.a)this).f;
                        if (f2 != null) {
                            b2 = OnUndeliveredElementKt.b((mg2.l<? super Object, j>)f2, ((a$a)s2).i, b2);
                        }
                        else {
                            b2 = null;
                        }
                    }
                    else {
                        s2.E(i);
                    }
                    --n;
                }
                b = b2;
            }
        }
        if (b == null) {
            return;
        }
        throw b;
    }
}
