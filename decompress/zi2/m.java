// 
// Decompiled by Procyon v0.6.0
// 

package zi2;

import kotlin.Result;
import kotlin.coroutines.CoroutineContext$b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.JobSupport;
import ej2.g;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CompletionHandlerException;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import ej2.t;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import gg2.c;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import hg2.b;

public class m<T> extends i0<T> implements l<T>, b
{
    public static final AtomicIntegerFieldUpdater l;
    public static final AtomicReferenceFieldUpdater m;
    private volatile int _decision;
    private volatile Object _state;
    public final c<T> i;
    public final CoroutineContext j;
    public m0 k;
    
    static {
        l = AtomicIntegerFieldUpdater.newUpdater(m.class, "_decision");
        m = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_state");
    }
    
    public m(final int n, final c i) {
        super(n);
        this.i = i;
        this.j = i.getContext();
        this._decision = 0;
        this._state = zi2.b.f;
    }
    
    public static Object A(final k1 k1, final Object o, final int n, final mg2.l l, final Object o2) {
        Object o3;
        if (o instanceof w) {
            o3 = o;
        }
        else {
            int n2 = 1;
            if (n != 1) {
                if (n == 2) {
                    n2 = n2;
                }
                else {
                    n2 = 0;
                }
            }
            if (n2 == 0 && o2 == null) {
                o3 = o;
            }
            else {
                if (l == null && (!(k1 instanceof j) || k1 instanceof d)) {
                    o3 = o;
                    if (o2 == null) {
                        return o3;
                    }
                }
                j j;
                if (k1 instanceof j) {
                    j = (j)k1;
                }
                else {
                    j = null;
                }
                o3 = new v(o, j, l, o2, null, 16);
            }
        }
        return o3;
    }
    
    public static void u(final mg2.l l, final Object o) {
        final StringBuilder sb = new StringBuilder();
        sb.append("It's prohibited to register multiple handlers, tried to register ");
        sb.append(l);
        sb.append(", already has ");
        sb.append(o);
        throw new IllegalStateException(sb.toString().toString());
    }
    
    public final t B(final Object o, final Object o2, final mg2.l<? super Throwable, cg2.j> l) {
        boolean b;
    Label_0069:
        do {
            final Object state = this._state;
            if (!(state instanceof k1)) {
                final boolean b2 = state instanceof v;
                t j;
                final t t = j = null;
                if (b2) {
                    j = t;
                    if (o2 != null) {
                        j = t;
                        if (((v)state).d == o2) {
                            j = p2.b.j;
                        }
                    }
                }
                return j;
            }
            final Object a = A((k1)state, o, super.h, l, o2);
            final AtomicReferenceFieldUpdater m = zi2.m.m;
            while (!m.compareAndSet(this, state, a)) {
                if (m.get(this) != state) {
                    b = false;
                    continue Label_0069;
                }
            }
            b = true;
        } while (!b);
        if (!this.t()) {
            this.n();
        }
        return p2.b.j;
    }
    
    public final t D(final Object o, final LockFreeLinkedListNode.a a, final mg2.l l) {
        return this.B(o, a, (mg2.l<? super Throwable, cg2.j>)l);
    }
    
    public final t G(final Object o, final Object o2) {
        return this.B(o, o2, null);
    }
    
    public final t L(final Throwable t) {
        return this.B(new w(t, false), null, null);
    }
    
    public final void Z(final mg2.l<? super Throwable, cg2.j> l) {
        Object o;
        if (l instanceof j) {
            o = l;
        }
        else {
            o = new w0((mg2.l)l);
        }
    Label_0026:
        while (true) {
            final Object state = this._state;
            final boolean b = state instanceof zi2.b;
            final int n = 1;
            boolean b2 = true;
            final int n2 = 1;
            if (b) {
                final AtomicReferenceFieldUpdater m = zi2.m.m;
                while (true) {
                    while (!m.compareAndSet(this, state, o)) {
                        if (m.get(this) != state) {
                            final int n3 = 0;
                            if (n3 != 0) {
                                return;
                            }
                            continue Label_0026;
                        }
                    }
                    final int n3 = n2;
                    continue;
                }
            }
            final boolean b3 = state instanceof j;
            Throwable a = null;
            if (b3) {
                u(l, state);
                throw null;
            }
            final boolean b4 = state instanceof w;
            if (b4) {
                w w = (w)state;
                w.getClass();
                if (zi2.w.b.compareAndSet(w, 0, 1)) {
                    if (state instanceof n) {
                        if (!b4) {
                            w = null;
                        }
                        if (w != null) {
                            a = w.a;
                        }
                        this.j(l, a);
                    }
                    return;
                }
                u(l, state);
                throw null;
            }
            else if (state instanceof v) {
                final v v = (v)state;
                if (v.b != null) {
                    u(l, state);
                    throw null;
                }
                if (o instanceof d) {
                    return;
                }
                final Throwable e = v.e;
                if (e != null) {
                    this.j(l, e);
                    return;
                }
                final v a2 = zi2.v.a(v, (j)o, null, 29);
                final AtomicReferenceFieldUpdater i = zi2.m.m;
                while (true) {
                    while (!i.compareAndSet(this, state, a2)) {
                        if (i.get(this) != state) {
                            final int n4 = 0;
                            if (n4 != 0) {
                                return;
                            }
                            continue Label_0026;
                        }
                    }
                    final int n4 = n;
                    continue;
                }
            }
            else {
                if (o instanceof d) {
                    return;
                }
                final v v2 = new v(state, (j)o, null, null, null, 28);
                final AtomicReferenceFieldUpdater j = zi2.m.m;
                while (true) {
                    while (!j.compareAndSet(this, state, v2)) {
                        if (j.get(this) != state) {
                            b2 = false;
                            if (b2) {
                                return;
                            }
                            continue Label_0026;
                        }
                    }
                    continue;
                }
            }
        }
    }
    
    public final void a(final CancellationException ex, Object state) {
    Label_0000:
        while (true) {
            state = this._state;
            if (state instanceof k1) {
                throw new IllegalStateException("Not completed".toString());
            }
            if (state instanceof w) {
                return;
            }
            final boolean b = state instanceof v;
            boolean b2 = true;
            final int n = 1;
            if (!b) {
                final AtomicReferenceFieldUpdater m = zi2.m.m;
                while (true) {
                    while (!m.compareAndSet(this, state, new v(state, null, null, null, ex, 14))) {
                        if (m.get(this) != state) {
                            b2 = false;
                            if (b2) {
                                return;
                            }
                            continue Label_0000;
                        }
                    }
                    continue;
                }
            }
            final v v = (v)state;
            if (v.e != null ^ true) {
                final v a = zi2.v.a(v, null, ex, 15);
                final AtomicReferenceFieldUpdater i = zi2.m.m;
                while (true) {
                    while (!i.compareAndSet(this, state, a)) {
                        if (i.get(this) != state) {
                            final int n2 = 0;
                            if (n2 != 0) {
                                final j b3 = v.b;
                                if (b3 != null) {
                                    this.k(b3, ex);
                                }
                                final mg2.l<Throwable, cg2.j> c = v.c;
                                if (c != null) {
                                    this.l(c, ex);
                                }
                                return;
                            }
                            continue Label_0000;
                        }
                    }
                    final int n2 = n;
                    continue;
                }
            }
            throw new IllegalStateException("Must be called at most once".toString());
        }
    }
    
    public final boolean b() {
        return this._state instanceof k1 ^ true;
    }
    
    public final c<T> c() {
        return this.i;
    }
    
    public final Throwable d(final Object o) {
        Throwable d = super.d(o);
        if (d == null) {
            d = null;
        }
        return d;
    }
    
    public final <T> T e(final Object o) {
        Object a = o;
        if (o instanceof v) {
            a = ((v)o).a;
        }
        return (T)a;
    }
    
    public final void f(final mg2.l l, final Object o) {
        this.z(l, super.h, o);
    }
    
    public final void g() {
        this.o(super.h);
    }
    
    public final b getCallerFrame() {
        final c<T> i = this.i;
        b b;
        if (i instanceof b) {
            b = (b)i;
        }
        else {
            b = null;
        }
        return b;
    }
    
    public final CoroutineContext getContext() {
        return this.j;
    }
    
    public final Object i() {
        return this._state;
    }
    
    public final boolean isActive() {
        return this._state instanceof k1;
    }
    
    public final boolean isCancelled() {
        return this._state instanceof n;
    }
    
    public final void j(final mg2.l<? super Throwable, cg2.j> l, final Throwable t) {
        try {
            l.invoke((Object)t);
        }
        finally {
            final CoroutineContext j = this.j;
            final StringBuilder sb = new StringBuilder();
            sb.append("Exception in invokeOnCancellation handler for ");
            sb.append(this);
            p2.b.K(j, (Throwable)new CompletionHandlerException(sb.toString(), t));
        }
    }
    
    public final void k(final j j, final Throwable t) {
        try {
            ((k)j).a(t);
        }
        finally {
            final CoroutineContext i = this.j;
            final StringBuilder sb = new StringBuilder();
            sb.append("Exception in invokeOnCancellation handler for ");
            sb.append(this);
            final Throwable t2;
            p2.b.K(i, (Throwable)new CompletionHandlerException(sb.toString(), t2));
        }
    }
    
    public final void l(final mg2.l<? super Throwable, cg2.j> l, final Throwable t) {
        try {
            l.invoke((Object)t);
        }
        finally {
            final CoroutineContext j = this.j;
            final StringBuilder sb = new StringBuilder();
            sb.append("Exception in resume onCancellation handler for ");
            sb.append(this);
            final Throwable t2;
            p2.b.K(j, (Throwable)new CompletionHandlerException(sb.toString(), t2));
        }
    }
    
    public final void l0(final CoroutineDispatcher coroutineDispatcher, final T t) {
        final c<T> i = this.i;
        g g;
        if (i instanceof g) {
            g = (g)i;
        }
        else {
            g = null;
        }
        CoroutineDispatcher j;
        if (g != null) {
            j = g.i;
        }
        else {
            j = null;
        }
        int h;
        if (j == coroutineDispatcher) {
            h = 4;
        }
        else {
            h = super.h;
        }
        this.z(null, h, t);
    }
    
    public final boolean m(final Throwable t) {
        boolean b;
        Object state = null;
        boolean b3 = false;
    Label_0072:
        do {
            state = this._state;
            final boolean b2 = state instanceof k1;
            b = false;
            if (!b2) {
                return false;
            }
            b3 = (state instanceof j);
            final n n = new n((c)this, t, b3);
            final AtomicReferenceFieldUpdater m = zi2.m.m;
            while (!m.compareAndSet(this, state, n)) {
                if (m.get(this) != state) {
                    continue Label_0072;
                }
            }
            b = true;
        } while (!b);
        j j;
        if (b3) {
            j = (j)state;
        }
        else {
            j = null;
        }
        if (j != null) {
            this.k(j, t);
        }
        if (!this.t()) {
            this.n();
        }
        this.o(super.h);
        return true;
    }
    
    public final void n() {
        final m0 k = this.k;
        if (k == null) {
            return;
        }
        k.dispose();
        this.k = j1.f;
    }
    
    public final void o(int n) {
        while (true) {
            do {
                final int decision = this._decision;
                final int n2 = 0;
                if (decision != 0) {
                    if (decision != 1) {
                        throw new IllegalStateException("Already resumed".toString());
                    }
                    final boolean b = false;
                    if (b) {
                        return;
                    }
                    final c<T> i = this.i;
                    final boolean b2 = n == 4;
                    if (!b2 && i instanceof g) {
                        if (n != 1 && n != 2) {
                            n = 0;
                        }
                        else {
                            n = 1;
                        }
                        final int h = super.h;
                        int n3 = 0;
                        Label_0129: {
                            if (h != 1) {
                                n3 = n2;
                                if (h != 2) {
                                    break Label_0129;
                                }
                            }
                            n3 = 1;
                        }
                        if (n == n3) {
                            final CoroutineDispatcher j = ((g)i).i;
                            final CoroutineContext context = i.getContext();
                            if (j.U(context)) {
                                j.O(context, (Runnable)this);
                                return;
                            }
                            final p0 a = u1.a();
                            if (a.Y()) {
                                a.W((i0)this);
                                return;
                            }
                            a.X(true);
                            final Throwable t2;
                            try {
                                zi2.h.e(this, this.i, true);
                                while (a.a0()) {}
                                return;
                            }
                            finally {
                                final m m = this;
                                final Throwable t = t2;
                                final Throwable t3 = null;
                                m.h(t, t3);
                            }
                            try {
                                final m m = this;
                                final Throwable t = t2;
                                final Throwable t3 = null;
                                m.h(t, t3);
                                return;
                            }
                            finally {
                                a.V(true);
                            }
                        }
                    }
                    h.e(this, i, b2);
                    return;
                }
            } while (!zi2.m.l.compareAndSet(this, 0, 2));
            final boolean b = true;
            continue;
        }
    }
    
    public Throwable p(final JobSupport jobSupport) {
        return jobSupport.E();
    }
    
    public final Object q() {
        final boolean t = this.t();
        while (true) {
            do {
                final int decision = this._decision;
                final boolean b = true;
                if (decision != 0) {
                    if (decision != 2) {
                        throw new IllegalStateException("Already suspended".toString());
                    }
                    final boolean b2 = false;
                    g g = null;
                    final g g2 = null;
                    if (b2) {
                        if (this.k == null) {
                            this.s();
                        }
                        if (t) {
                            final c<T> i = this.i;
                            g g3 = g2;
                            if (i instanceof g) {
                                g3 = (g)i;
                            }
                            if (g3 != null) {
                                final Throwable o = g3.o((l)this);
                                if (o != null) {
                                    this.n();
                                    this.m(o);
                                }
                            }
                        }
                        return CoroutineSingletons.COROUTINE_SUSPENDED;
                    }
                    if (t) {
                        final c<T> j = this.i;
                        if (j instanceof g) {
                            g = (g)j;
                        }
                        if (g != null) {
                            final Throwable o2 = g.o((l)this);
                            if (o2 != null) {
                                this.n();
                                this.m(o2);
                            }
                        }
                    }
                    final Object state = this._state;
                    if (!(state instanceof w)) {
                        final int h = super.h;
                        int n = b ? 1 : 0;
                        if (h != 1) {
                            if (h == 2) {
                                n = (b ? 1 : 0);
                            }
                            else {
                                n = 0;
                            }
                        }
                        if (n != 0) {
                            final z0 z0 = (z0)this.j.get((CoroutineContext$b)z0$b.f);
                            if (z0 != null) {
                                if (!z0.isActive()) {
                                    final CancellationException e = z0.E();
                                    this.a(e, state);
                                    throw e;
                                }
                            }
                        }
                        return this.e(state);
                    }
                    throw ((w)state).a;
                }
            } while (!zi2.m.l.compareAndSet(this, 0, 1));
            final boolean b2 = true;
            continue;
        }
    }
    
    public final void r() {
        final m0 s = this.s();
        if (s == null) {
            return;
        }
        if (this.b()) {
            s.dispose();
            this.k = j1.f;
        }
    }
    
    public final void resumeWith(Object o) {
        final Throwable exceptionOrNull-impl = Result.exceptionOrNull-impl(o);
        if (exceptionOrNull-impl != null) {
            o = new w(exceptionOrNull-impl, false);
        }
        this.z(null, super.h, o);
    }
    
    public final m0 s() {
        final z0 z0 = (z0)this.j.get((CoroutineContext$b)z0$b.f);
        if (z0 == null) {
            return null;
        }
        return this.k = zi2.z0.a.a(z0, true, (c1)new o(this), 2);
    }
    
    public final boolean t() {
        final int h = super.h;
        boolean b = true;
        if (h != 2 || !((g)this.i).k()) {
            b = false;
        }
        return b;
    }
    
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.x());
        sb.append('(');
        sb.append(d0.z((c)this.i));
        sb.append("){");
        final Object state = this._state;
        String s;
        if (state instanceof k1) {
            s = "Active";
        }
        else if (state instanceof n) {
            s = "Cancelled";
        }
        else {
            s = "Completed";
        }
        sb.append(s);
        sb.append("}@");
        sb.append(d0.y((Object)this));
        return sb.toString();
    }
    
    public String x() {
        return "CancellableContinuation";
    }
    
    public final boolean y() {
        final Object state = this._state;
        if (state instanceof v && ((v)state).d != null) {
            this.n();
            return false;
        }
        this._decision = 0;
        this._state = zi2.b.f;
        return true;
    }
    
    public final void z(final mg2.l l, final int n, final Object o) {
        boolean b;
    Label_0070:
        do {
            final Object state = this._state;
            final boolean b2 = state instanceof k1;
            b = false;
            if (!b2) {
                if (state instanceof n) {
                    final n n2 = (n)state;
                    n2.getClass();
                    if (n.c.compareAndSet(n2, 0, 1)) {
                        if (l != null) {
                            this.l((mg2.l<? super Throwable, cg2.j>)l, ((w)n2).a);
                        }
                        return;
                    }
                }
                throw new IllegalStateException(b.C("Already resumed, but proposed with update ", o));
            }
            final Object a = A((k1)state, o, n, l, null);
            final AtomicReferenceFieldUpdater m = zi2.m.m;
            while (!m.compareAndSet(this, state, a)) {
                if (m.get(this) != state) {
                    continue Label_0070;
                }
            }
            b = true;
        } while (!b);
        if (!this.t()) {
            this.n();
        }
        this.o(n);
    }
}
