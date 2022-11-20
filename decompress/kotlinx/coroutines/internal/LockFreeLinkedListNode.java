// 
// Decompiled by Procyon v0.6.0
// 

package kotlinx.coroutines.internal;

import ej2.t;
import dg.l0;
import ng2.e;
import a01.a;
import ej2.c;
import ej2.b;
import zi2.d0;
import ej2.o;
import ej2.n;
import ej2.i;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class LockFreeLinkedListNode
{
    public static final AtomicReferenceFieldUpdater f;
    public static final AtomicReferenceFieldUpdater g;
    public static final AtomicReferenceFieldUpdater h;
    public volatile Object _next;
    public volatile Object _prev;
    private volatile Object _removedRef;
    
    static {
        f = AtomicReferenceFieldUpdater.newUpdater(LockFreeLinkedListNode.class, Object.class, "_next");
        g = AtomicReferenceFieldUpdater.newUpdater(LockFreeLinkedListNode.class, Object.class, "_prev");
        h = AtomicReferenceFieldUpdater.newUpdater(LockFreeLinkedListNode.class, Object.class, "_removedRef");
    }
    
    public LockFreeLinkedListNode() {
        this._next = this;
        this._prev = this;
        this._removedRef = null;
    }
    
    public final int A(final LockFreeLinkedListNode lockFreeLinkedListNode, final LockFreeLinkedListNode c, final b b) {
        LockFreeLinkedListNode.g.lazySet(lockFreeLinkedListNode, this);
        final AtomicReferenceFieldUpdater f = LockFreeLinkedListNode.f;
        f.lazySet(lockFreeLinkedListNode, c);
        b.c = c;
        while (true) {
            do {
                final boolean compareAndSet = f.compareAndSet(this, c, b);
                final int n = 1;
                if (compareAndSet) {
                    final boolean b2 = true;
                    if (!b2) {
                        return 0;
                    }
                    int n2;
                    if (b.c((Object)this) == null) {
                        n2 = n;
                    }
                    else {
                        n2 = 2;
                    }
                    return n2;
                }
            } while (f.get(this) == c);
            final boolean b2 = false;
            continue;
        }
    }
    
    public final boolean p(final LockFreeLinkedListNode lockFreeLinkedListNode, final i i) {
        LockFreeLinkedListNode.g.lazySet(lockFreeLinkedListNode, this);
        final AtomicReferenceFieldUpdater f = LockFreeLinkedListNode.f;
        f.lazySet(lockFreeLinkedListNode, i);
        while (true) {
            while (!f.compareAndSet(this, i, lockFreeLinkedListNode)) {
                if (f.get(this) != i) {
                    final boolean b = false;
                    if (!b) {
                        return false;
                    }
                    lockFreeLinkedListNode.r((LockFreeLinkedListNode)i);
                    return true;
                }
            }
            final boolean b = true;
            continue;
        }
    }
    
    public final LockFreeLinkedListNode q() {
    Label_0000:
        while (true) {
            while (true) {
                LockFreeLinkedListNode lockFreeLinkedListNode2;
                final LockFreeLinkedListNode lockFreeLinkedListNode = lockFreeLinkedListNode2 = (LockFreeLinkedListNode)this._prev;
            Label_0012:
                while (true) {
                    while (true) {
                        LockFreeLinkedListNode lockFreeLinkedListNode3 = null;
                        while (true) {
                            final Object next = lockFreeLinkedListNode2._next;
                            boolean b = false;
                            final int n = 0;
                            if (next == this) {
                                if (lockFreeLinkedListNode == lockFreeLinkedListNode2) {
                                    return lockFreeLinkedListNode2;
                                }
                                final AtomicReferenceFieldUpdater g = LockFreeLinkedListNode.g;
                                while (true) {
                                    while (!g.compareAndSet(this, lockFreeLinkedListNode, lockFreeLinkedListNode2)) {
                                        if (g.get(this) != lockFreeLinkedListNode) {
                                            final int n2 = n;
                                            if (n2 == 0) {
                                                continue Label_0000;
                                            }
                                            return lockFreeLinkedListNode2;
                                        }
                                    }
                                    final int n2 = 1;
                                    continue;
                                }
                            }
                            else {
                                if (this.w()) {
                                    return null;
                                }
                                if (next == null) {
                                    return lockFreeLinkedListNode2;
                                }
                                if (next instanceof n) {
                                    ((n)next).c((Object)lockFreeLinkedListNode2);
                                    continue Label_0000;
                                }
                                if (next instanceof o) {
                                    if (lockFreeLinkedListNode3 != null) {
                                        final AtomicReferenceFieldUpdater f = LockFreeLinkedListNode.f;
                                        while (true) {
                                            while (!f.compareAndSet(lockFreeLinkedListNode3, lockFreeLinkedListNode2, ((o)next).a)) {
                                                if (f.get(lockFreeLinkedListNode3) != lockFreeLinkedListNode2) {
                                                    if (!b) {
                                                        continue Label_0000;
                                                    }
                                                    lockFreeLinkedListNode2 = lockFreeLinkedListNode3;
                                                    continue Label_0012;
                                                }
                                            }
                                            b = true;
                                            continue;
                                        }
                                    }
                                    lockFreeLinkedListNode2 = (LockFreeLinkedListNode)lockFreeLinkedListNode2._prev;
                                }
                                else {
                                    final LockFreeLinkedListNode lockFreeLinkedListNode4 = (LockFreeLinkedListNode)next;
                                    lockFreeLinkedListNode3 = lockFreeLinkedListNode2;
                                    lockFreeLinkedListNode2 = lockFreeLinkedListNode4;
                                }
                            }
                        }
                    }
                    break;
                }
            }
            break;
        }
    }
    
    public final void r(final LockFreeLinkedListNode lockFreeLinkedListNode) {
        boolean b;
    Label_0050:
        do {
            final LockFreeLinkedListNode lockFreeLinkedListNode2 = (LockFreeLinkedListNode)lockFreeLinkedListNode._prev;
            if (this.s() != lockFreeLinkedListNode) {
                return;
            }
            final AtomicReferenceFieldUpdater g = LockFreeLinkedListNode.g;
            while (!g.compareAndSet(lockFreeLinkedListNode, lockFreeLinkedListNode2, this)) {
                if (g.get(lockFreeLinkedListNode) != lockFreeLinkedListNode2) {
                    b = false;
                    continue Label_0050;
                }
            }
            b = true;
        } while (!b);
        if (this.w()) {
            lockFreeLinkedListNode.q();
        }
    }
    
    public final Object s() {
        Object next;
        while (true) {
            next = this._next;
            if (!(next instanceof n)) {
                break;
            }
            ((n)next).c((Object)this);
        }
        return next;
    }
    
    public final LockFreeLinkedListNode t() {
        final Object s = this.s();
        o o;
        if (s instanceof o) {
            o = (o)s;
        }
        else {
            o = null;
        }
        LockFreeLinkedListNode a;
        if (o == null || (a = o.a) == null) {
            a = (LockFreeLinkedListNode)s;
        }
        return a;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(new LockFreeLinkedListNode$toString$1((Object)this));
        sb.append('@');
        sb.append(d0.y((Object)this));
        return sb.toString();
    }
    
    public final LockFreeLinkedListNode u() {
        LockFreeLinkedListNode q;
        if ((q = this.q()) == null) {
            for (q = (LockFreeLinkedListNode)this._prev; q.w(); q = (LockFreeLinkedListNode)q._prev) {}
        }
        return q;
    }
    
    public final void v() {
        LockFreeLinkedListNode a = this;
        while (true) {
            final Object s = a.s();
            if (!(s instanceof o)) {
                break;
            }
            a = ((o)s).a;
        }
        a.q();
    }
    
    public boolean w() {
        return this.s() instanceof o;
    }
    
    public boolean x() {
        return this.y() == null;
    }
    
    public final LockFreeLinkedListNode y() {
        boolean b;
        LockFreeLinkedListNode lockFreeLinkedListNode = null;
    Label_0081:
        do {
            final Object s = this.s();
            if (s instanceof o) {
                return ((o)s).a;
            }
            if (s == this) {
                return (LockFreeLinkedListNode)s;
            }
            lockFreeLinkedListNode = (LockFreeLinkedListNode)s;
            final o z = lockFreeLinkedListNode.z();
            final AtomicReferenceFieldUpdater f = LockFreeLinkedListNode.f;
            while (!f.compareAndSet(this, s, z)) {
                if (f.get(this) != s) {
                    b = false;
                    continue Label_0081;
                }
            }
            b = true;
        } while (!b);
        lockFreeLinkedListNode.q();
        return null;
    }
    
    public final o z() {
        o o;
        if ((o = (o)this._removedRef) == null) {
            o = new o(this);
            LockFreeLinkedListNode.h.lazySet(this, o);
        }
        return o;
    }
    
    public abstract static class a extends ej2.b
    {
        public final void a(final ej2.c<?> c, final Object o) {
            boolean b = true;
            final boolean b2 = o == null;
            final LockFreeLinkedListNode f = this.f();
            if (f == null) {
                return;
            }
            final LockFreeLinkedListNode g = this.g();
            if (g == null) {
                return;
            }
            Object l;
            if (b2) {
                l = this.l(g);
            }
            else {
                l = g;
            }
            final AtomicReferenceFieldUpdater f2 = LockFreeLinkedListNode.f;
            while (true) {
                while (!f2.compareAndSet(f, c, l)) {
                    if (f2.get(f) != c) {
                        b = false;
                        if (b && b2) {
                            this.d(g);
                        }
                        return;
                    }
                }
                continue;
            }
        }
        
        public final Object b(final ej2.c<?> n) {
        Label_0000:
            while (true) {
                final LockFreeLinkedListNode k = this.k(n);
                if (k == null) {
                    return a01.a.z;
                }
                final Object next = k._next;
                if (next == n) {
                    return null;
                }
                if (((ej2.c)n).h()) {
                    return null;
                }
                if (next instanceof n) {
                    final n n2 = (n)next;
                    if (n.b(n2)) {
                        return a01.a.z;
                    }
                    n2.c((Object)k);
                }
                else {
                    final Object c = this.c(k);
                    if (c != null) {
                        return c;
                    }
                    if (!this.j(next)) {
                        final c c2 = new c(k, (LockFreeLinkedListNode)next, this);
                        final AtomicReferenceFieldUpdater f = LockFreeLinkedListNode.f;
                        while (true) {
                            while (!f.compareAndSet(k, next, c2)) {
                                if (f.get(k) != next) {
                                    final boolean b = false;
                                    if (!b) {
                                        continue Label_0000;
                                    }
                                    try {
                                        if (c2.c(k) != a01.a.A) {
                                            return null;
                                        }
                                        continue Label_0000;
                                    }
                                    finally {
                                        final AtomicReferenceFieldUpdater f2 = LockFreeLinkedListNode.f;
                                        while (!f2.compareAndSet(k, c2, next) && f2.get(k) == c2) {}
                                    }
                                }
                            }
                            final boolean b = true;
                            continue;
                        }
                    }
                    continue;
                }
            }
        }
        
        public abstract Object c(final LockFreeLinkedListNode p0);
        
        public abstract void d(final LockFreeLinkedListNode p0);
        
        public abstract void e(final c p0);
        
        public abstract LockFreeLinkedListNode f();
        
        public abstract LockFreeLinkedListNode g();
        
        public Object h(final c c) {
            this.e(c);
            return null;
        }
        
        public void i(final LockFreeLinkedListNode lockFreeLinkedListNode) {
        }
        
        public abstract boolean j(final Object p0);
        
        public abstract LockFreeLinkedListNode k(final n p0);
        
        public abstract o l(final LockFreeLinkedListNode p0);
    }
    
    public abstract static class b extends ej2.c<LockFreeLinkedListNode>
    {
        public final LockFreeLinkedListNode b;
        public LockFreeLinkedListNode c;
        
        public b(final LockFreeLinkedListNode b) {
            this.b = b;
        }
        
        public final void d(final Object o, final Object o2) {
            final LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode)o;
            boolean b = true;
            final boolean b2 = o2 == null;
            LockFreeLinkedListNode lockFreeLinkedListNode2;
            if (b2) {
                lockFreeLinkedListNode2 = this.b;
            }
            else {
                lockFreeLinkedListNode2 = this.c;
            }
            if (lockFreeLinkedListNode2 != null) {
                final AtomicReferenceFieldUpdater f = LockFreeLinkedListNode.f;
                while (true) {
                    while (!f.compareAndSet(lockFreeLinkedListNode, this, lockFreeLinkedListNode2)) {
                        if (f.get(lockFreeLinkedListNode) != this) {
                            b = false;
                            if (b && b2) {
                                final LockFreeLinkedListNode b3 = this.b;
                                final LockFreeLinkedListNode c = this.c;
                                e.c((Object)c);
                                b3.r(c);
                            }
                            return;
                        }
                    }
                    continue;
                }
            }
        }
    }
    
    public static final class c extends n
    {
        public final LockFreeLinkedListNode a;
        public final LockFreeLinkedListNode b;
        public final a c;
        
        public c(final LockFreeLinkedListNode a, final LockFreeLinkedListNode b, final a c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
        
        public final ej2.c<?> a() {
            final ej2.c a = this.c.a;
            if (a != null) {
                return (ej2.c<?>)a;
            }
            e.n("atomicOp");
            throw null;
        }
        
        public final Object c(Object o) {
            if (o == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            }
            final LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode)o;
            o = this.c.h(this);
            if (o == a01.a.A) {
                final LockFreeLinkedListNode b = this.b;
                final AtomicReferenceFieldUpdater f = LockFreeLinkedListNode.f;
                final o z = b.z();
                final AtomicReferenceFieldUpdater f2 = LockFreeLinkedListNode.f;
                while (true) {
                    while (!f2.compareAndSet(lockFreeLinkedListNode, this, z)) {
                        if (f2.get(lockFreeLinkedListNode) != this) {
                            final boolean b2 = false;
                            if (b2) {
                                this.c.i(lockFreeLinkedListNode);
                                b.q();
                            }
                            return a01.a.A;
                        }
                    }
                    final boolean b2 = true;
                    continue;
                }
            }
            if (o != null) {
                o = this.a().e(o);
            }
            else {
                o = this.a().f();
            }
            Object o2;
            if (o == a01.a.y) {
                o2 = this.a();
            }
            else if (o == null) {
                o2 = this.c.l(this.b);
            }
            else {
                o2 = this.b;
            }
            final AtomicReferenceFieldUpdater f3 = LockFreeLinkedListNode.f;
            while (!f3.compareAndSet(lockFreeLinkedListNode, this, o2)) {
                if (f3.get(lockFreeLinkedListNode) != this) {
                    return null;
                }
            }
            return null;
        }
        
        public final void d() {
            this.c.e(this);
        }
        
        public final String toString() {
            final StringBuilder t = a.t("PrepareOp(op=");
            t.append(this.a());
            t.append(')');
            return t.toString();
        }
    }
    
    public static class d<T> extends a
    {
        public static final AtomicReferenceFieldUpdater c;
        public static final AtomicReferenceFieldUpdater d;
        private volatile Object _affectedNode;
        private volatile Object _originalNext;
        public final LockFreeLinkedListNode b;
        
        static {
            c = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "_affectedNode");
            d = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "_originalNext");
        }
        
        public d(final i b) {
            this.b = (LockFreeLinkedListNode)b;
            this._affectedNode = null;
            this._originalNext = null;
        }
        
        @Override
        public Object c(final LockFreeLinkedListNode lockFreeLinkedListNode) {
            t e;
            if (lockFreeLinkedListNode == this.b) {
                e = l0.E;
            }
            else {
                e = null;
            }
            return e;
        }
        
        @Override
        public final void d(final LockFreeLinkedListNode lockFreeLinkedListNode) {
            final AtomicReferenceFieldUpdater f = LockFreeLinkedListNode.f;
            lockFreeLinkedListNode.q();
        }
        
        @Override
        public final void e(final c c) {
            final AtomicReferenceFieldUpdater c2 = LockFreeLinkedListNode.d.c;
            while (true) {
                while (!c2.compareAndSet(this, null, c.a)) {
                    if (c2.get(this) != null) {
                        final AtomicReferenceFieldUpdater d = LockFreeLinkedListNode.d.d;
                        while (!d.compareAndSet(this, null, c.b)) {
                            if (d.get(this) != null) {
                                return;
                            }
                        }
                        return;
                    }
                }
                continue;
            }
        }
        
        @Override
        public final LockFreeLinkedListNode f() {
            return (LockFreeLinkedListNode)this._affectedNode;
        }
        
        @Override
        public final LockFreeLinkedListNode g() {
            return (LockFreeLinkedListNode)this._originalNext;
        }
        
        @Override
        public final boolean j(final Object o) {
            if (!(o instanceof o)) {
                return false;
            }
            ((o)o).a.v();
            return true;
        }
        
        @Override
        public final LockFreeLinkedListNode k(final n n) {
            final LockFreeLinkedListNode b = this.b;
            while (true) {
                final Object next = b._next;
                if (!(next instanceof n)) {
                    return (LockFreeLinkedListNode)next;
                }
                final n n2 = (n)next;
                if (n.b(n2)) {
                    return null;
                }
                n2.c((Object)this.b);
            }
        }
        
        @Override
        public final o l(final LockFreeLinkedListNode lockFreeLinkedListNode) {
            final AtomicReferenceFieldUpdater f = LockFreeLinkedListNode.f;
            return lockFreeLinkedListNode.z();
        }
        
        public final LockFreeLinkedListNode m() {
            final LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode)this._affectedNode;
            e.c((Object)lockFreeLinkedListNode);
            return lockFreeLinkedListNode;
        }
    }
}
