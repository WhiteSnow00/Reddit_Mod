// 
// Decompiled by Procyon v0.6.0
// 

package bj2;

import ng2.e;
import zi2.d0;
import ej2.s;
import java.util.ArrayList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import zi2.m1;
import gg2.c;
import ng2.k;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import kotlin.Result;
import cg.d;
import kotlinx.coroutines.internal.UndeliveredElementException;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import zi2.m;
import ej2.i;
import cg2.j;
import mg2.l;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public abstract class a<E> implements t<E>
{
    public static final AtomicReferenceFieldUpdater h;
    public final l<E, j> f;
    public final i g;
    private volatile Object onCloseHandler;
    
    static {
        h = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "onCloseHandler");
    }
    
    public a(final l<? super E, j> f) {
        this.f = (l<E, j>)f;
        this.g = new i();
        this.onCloseHandler = null;
    }
    
    public static final void b(final a a, final m m, final Object o, final bj2.i i) {
        a.j(i);
        Throwable j;
        if ((j = i.i) == null) {
            j = new ClosedSendChannelException("Channel was closed");
        }
        final l<E, j> f = a.f;
        if (f != null) {
            final UndeliveredElementException b = OnUndeliveredElementKt.b((mg2.l<? super Object, j>)f, o, null);
            if (b != null) {
                a.t((Throwable)b, j);
                m.resumeWith(Result.constructor-impl((Object)d.B1((Throwable)b)));
                return;
            }
        }
        m.resumeWith(Result.constructor-impl((Object)d.B1(j)));
    }
    
    public final boolean Q(final Throwable t) {
        bj2.i i = new bj2.i(t);
        final i g = this.g;
        while (true) {
            LockFreeLinkedListNode u;
            do {
                u = ((LockFreeLinkedListNode)g).u();
                final boolean b = u instanceof bj2.i;
                boolean b2 = false;
                if (!(b ^ true)) {
                    final boolean b3 = false;
                    if (!b3) {
                        i = (bj2.i)((LockFreeLinkedListNode)this.g).u();
                    }
                    this.j((bj2.i<?>)i);
                    if (b3) {
                        final Object onCloseHandler = this.onCloseHandler;
                        if (onCloseHandler != null) {
                            final ej2.t t2 = a01.a.t;
                            if (onCloseHandler != t2) {
                                final AtomicReferenceFieldUpdater h = a.h;
                                while (true) {
                                    while (!h.compareAndSet(this, onCloseHandler, t2)) {
                                        if (h.get(this) != onCloseHandler) {
                                            if (b2) {
                                                k.e(1, onCloseHandler);
                                                ((l)onCloseHandler).invoke((Object)t);
                                                return b3;
                                            }
                                            return b3;
                                        }
                                    }
                                    b2 = true;
                                    continue;
                                }
                            }
                        }
                    }
                    return b3;
                }
            } while (!u.p((LockFreeLinkedListNode)i, g));
            final boolean b3 = true;
            continue;
        }
    }
    
    public final Object c(final E e, final c<? super j> c) {
        if (this.m(e) == a01.a.p) {
            return j.a;
        }
        final m b = if0.a.B(d.e3((c)c));
        Object m = null;
    Label_0228:
        while (true) {
            do {
                if (!(((LockFreeLinkedListNode)this.g).t() instanceof q) && this.l()) {
                    u u;
                    if (this.f == null) {
                        u = new u((Object)e, b);
                    }
                    else {
                        u = new v<Object>(e, b, this.f);
                    }
                    final Object f = this.f(u);
                    if (f == null) {
                        b.Z((l)new m1((LockFreeLinkedListNode)u));
                        break Label_0228;
                    }
                    if (f instanceof bj2.i) {
                        b(this, b, e, (bj2.i)f);
                        break Label_0228;
                    }
                    if (f != a01.a.s) {
                        if (!(f instanceof o)) {
                            throw new IllegalStateException(b.C("enqueueSend returned ", f));
                        }
                    }
                }
                m = this.m(e);
                if (m != a01.a.p) {
                    continue;
                }
                b.resumeWith(Result.constructor-impl((Object)j.a));
                Object o = b.q();
                final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (o != coroutine_SUSPENDED) {
                    o = j.a;
                }
                if (o == coroutine_SUSPENDED) {
                    return o;
                }
                return j.a;
            } while (m == a01.a.q);
            if (m instanceof bj2.i) {
                b(this, b, e, (bj2.i)m);
                continue Label_0228;
            }
            break;
        }
        throw new IllegalStateException(b.C("offerInternal returned ", m));
    }
    
    public final void d(final l<? super Throwable, j> l) {
        final AtomicReferenceFieldUpdater h = a.h;
        while (true) {
            do {
                final boolean compareAndSet = h.compareAndSet(this, null, l);
                final int n = 0;
                if (compareAndSet) {
                    final boolean b = true;
                    if (b) {
                        final bj2.i<?> h2 = this.h();
                        if (h2 != null) {
                            final AtomicReferenceFieldUpdater h3 = a.h;
                            while (true) {
                                while (!h3.compareAndSet(this, l, a01.a.t)) {
                                    if (h3.get(this) != l) {
                                        final int n2 = n;
                                        if (n2 != 0) {
                                            l.invoke((Object)h2.i);
                                        }
                                        return;
                                    }
                                }
                                final int n2 = 1;
                                continue;
                            }
                        }
                        return;
                    }
                    final Object onCloseHandler = this.onCloseHandler;
                    if (onCloseHandler == a01.a.t) {
                        throw new IllegalStateException("Another handler was already registered and successfully invoked");
                    }
                    throw new IllegalStateException(b.k("Another handler was already registered: ", onCloseHandler));
                }
            } while (h.get(this) == null);
            final boolean b = false;
            continue;
        }
    }
    
    public Object f(final u u) {
        if (this.k()) {
            final i g = this.g;
            LockFreeLinkedListNode u2;
            do {
                u2 = ((LockFreeLinkedListNode)g).u();
                if (u2 instanceof q) {
                    return u2;
                }
            } while (!u2.p((LockFreeLinkedListNode)u, g));
        }
        else {
            final i g2 = this.g;
            final bj2.b b = new bj2.b(u, this);
            boolean b2;
            while (true) {
                final LockFreeLinkedListNode u3 = ((LockFreeLinkedListNode)g2).u();
                if (u3 instanceof q) {
                    return u3;
                }
                final int a = u3.A((LockFreeLinkedListNode)u, (LockFreeLinkedListNode)g2, (LockFreeLinkedListNode.b)b);
                b2 = true;
                if (a == 1) {
                    break;
                }
                if (a != 2) {
                    continue;
                }
                b2 = false;
                break;
            }
            if (!b2) {
                return a01.a.s;
            }
        }
        return null;
    }
    
    public String g() {
        return "";
    }
    
    public final bj2.i<?> h() {
        final LockFreeLinkedListNode u = ((LockFreeLinkedListNode)this.g).u();
        final boolean b = u instanceof bj2.i;
        bj2.i<?> i = null;
        bj2.i j;
        if (b) {
            j = (bj2.i)u;
        }
        else {
            j = null;
        }
        if (j != null) {
            this.j((bj2.i<?>)j);
            i = (bj2.i<?>)j;
        }
        return i;
    }
    
    public final Object i(final E e) {
        final Object m = this.m(e);
        Object a;
        if (m == a01.a.p) {
            a = j.a;
        }
        else if (m == a01.a.q) {
            final bj2.i<?> h = this.h();
            if (h == null) {
                return bj2.h.b;
            }
            this.j(h);
            Throwable i;
            if ((i = h.i) == null) {
                i = new ClosedSendChannelException("Channel was closed");
            }
            a = new h.a(i);
        }
        else {
            if (!(m instanceof bj2.i)) {
                throw new IllegalStateException(b.C("trySend returned ", m));
            }
            final bj2.i j = (bj2.i)m;
            this.j((bj2.i<?>)j);
            Throwable k;
            if ((k = j.i) == null) {
                k = new ClosedSendChannelException("Channel was closed");
            }
            a = new h.a(k);
        }
        return a;
    }
    
    public final void j(final bj2.i<?> i) {
        Object c1 = null;
        while (true) {
            final LockFreeLinkedListNode u = ((LockFreeLinkedListNode)i).u();
            o o;
            if (u instanceof o) {
                o = (o)u;
            }
            else {
                o = null;
            }
            if (o == null) {
                break;
            }
            if (!o.x()) {
                ((ej2.o)o.s()).a.v();
            }
            else {
                c1 = ah0.b.c1(c1, (LockFreeLinkedListNode)o);
            }
        }
        if (c1 != null) {
            if (!(c1 instanceof ArrayList)) {
                ((o)c1).C(i);
            }
            else {
                final ArrayList list = (ArrayList)c1;
                for (int n = list.size() - 1; -1 < n; --n) {
                    ((o)list.get(n)).C(i);
                }
            }
        }
        this.n();
    }
    
    public abstract boolean k();
    
    public abstract boolean l();
    
    public Object m(final E e) {
        q<E> o;
        do {
            o = this.o();
            if (o == null) {
                return a01.a.q;
            }
        } while (o.c((Object)e) == null);
        o.i((Object)e);
        return o.d();
    }
    
    public void n() {
    }
    
    public q<E> o() {
        final i g = this.g;
        LockFreeLinkedListNode lockFreeLinkedListNode;
        while (true) {
            lockFreeLinkedListNode = (LockFreeLinkedListNode)((LockFreeLinkedListNode)g).s();
            if (lockFreeLinkedListNode == g || !(lockFreeLinkedListNode instanceof q)) {
                lockFreeLinkedListNode = null;
                break;
            }
            if (((q)lockFreeLinkedListNode) instanceof bj2.i && !lockFreeLinkedListNode.w()) {
                break;
            }
            final LockFreeLinkedListNode y = lockFreeLinkedListNode.y();
            if (y == null) {
                break;
            }
            y.v();
        }
        return (q<E>)lockFreeLinkedListNode;
    }
    
    public final boolean offer(final E e) {
        try {
            final Object i = this.i(e);
            final boolean b = i instanceof h$b;
            boolean b2 = true;
            if (!(b ^ true)) {
                final Throwable a = bj2.h.a(i);
                if (a != null) {
                    final int a2 = s.a;
                    throw a;
                }
                b2 = false;
            }
            return b2;
        }
        finally {
            final l<E, j> f = this.f;
            if (f != null) {
                final UndeliveredElementException b3 = OnUndeliveredElementKt.b(f, e, null);
                if (b3 != null) {
                    final Throwable t;
                    xd.a.t((Throwable)b3, t);
                    throw b3;
                }
            }
        }
    }
    
    public final bj2.s p() {
        final i g = this.g;
        LockFreeLinkedListNode lockFreeLinkedListNode;
        while (true) {
            lockFreeLinkedListNode = (LockFreeLinkedListNode)((LockFreeLinkedListNode)g).s();
            if (lockFreeLinkedListNode == g || !(lockFreeLinkedListNode instanceof bj2.s)) {
                lockFreeLinkedListNode = null;
                break;
            }
            if (((bj2.s)lockFreeLinkedListNode) instanceof bj2.i && !lockFreeLinkedListNode.w()) {
                break;
            }
            final LockFreeLinkedListNode y = lockFreeLinkedListNode.y();
            if (y == null) {
                break;
            }
            y.v();
        }
        return (bj2.s)lockFreeLinkedListNode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getSimpleName());
        sb.append('@');
        sb.append(d0.y((Object)this));
        sb.append('{');
        final LockFreeLinkedListNode t = ((LockFreeLinkedListNode)this.g).t();
        String s;
        if (t == this.g) {
            s = "EmptyQueue";
        }
        else {
            if (t instanceof bj2.i) {
                s = t.toString();
            }
            else if (t instanceof o) {
                s = "ReceiveQueued";
            }
            else if (t instanceof bj2.s) {
                s = "SendQueued";
            }
            else {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("UNEXPECTED:");
                sb2.append(t);
                s = sb2.toString();
            }
            final LockFreeLinkedListNode u = ((LockFreeLinkedListNode)this.g).u();
            if (u != t) {
                final StringBuilder q = android.support.v4.media.a.q(s, ",queueSize=");
                final i g = this.g;
                LockFreeLinkedListNode t2 = (LockFreeLinkedListNode)((LockFreeLinkedListNode)g).s();
                int n = 0;
                while (!e.a((Object)t2, (Object)g)) {
                    int n2 = n;
                    if (t2 instanceof LockFreeLinkedListNode) {
                        n2 = n + 1;
                    }
                    t2 = t2.t();
                    n = n2;
                }
                q.append(n);
                final String s2 = s = q.toString();
                if (u instanceof bj2.i) {
                    final StringBuilder sb3 = new StringBuilder();
                    sb3.append(s2);
                    sb3.append(",closedForSend=");
                    sb3.append(u);
                    s = sb3.toString();
                }
            }
        }
        sb.append(s);
        sb.append('}');
        sb.append(this.g());
        return sb.toString();
    }
    
    public final boolean z() {
        return this.h() != null;
    }
}
