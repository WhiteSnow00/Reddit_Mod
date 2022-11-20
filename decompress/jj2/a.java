// 
// Decompiled by Procyon v0.6.0
// 

package jj2;

import kotlinx.coroutines.channels.AbstractChannel$g;
import ej2.n;
import kotlin.coroutines.CoroutineContext;
import zi2.g;
import ng2.k;
import mg2.l;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import ej2.t;
import zi2.w;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import zi2.c1;
import kotlin.coroutines.CoroutineContext$b;
import zi2.z0$b;
import zi2.z0;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import zi2.m0;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import hg2.b;
import gg2.c;
import ej2.i;

public final class a<R> extends i implements d<R>, c<R>, hg2.b
{
    public static final AtomicReferenceFieldUpdater j;
    public static final AtomicReferenceFieldUpdater k;
    private volatile Object _parentHandle;
    private volatile Object _result;
    public volatile Object _state;
    public final c<R> i;
    
    static {
        j = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "_state");
        k = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "_result");
    }
    
    public a(final SuspendLambda i) {
        this.i = (c<R>)i;
        this._state = e.a;
        this._result = e.c;
        this._parentHandle = null;
    }
    
    public final void B() {
        final m0 m0 = (m0)this._parentHandle;
        if (m0 != null) {
            m0.dispose();
        }
        for (LockFreeLinkedListNode t = (LockFreeLinkedListNode)((LockFreeLinkedListNode)this).s(); !ng2.e.a((Object)t, (Object)this); t = t.t()) {
            if (t instanceof b) {
                ((b)t).i.dispose();
            }
        }
    }
    
    public final Object C() {
        final boolean selected = this.isSelected();
        boolean b = true;
        if (!selected) {
            final z0 z0 = (z0)this.getContext().get((CoroutineContext$b)z0$b.f);
            if (z0 != null) {
                final m0 a = zi2.z0.a.a(z0, true, (c1)new a$c(this), 2);
                this._parentHandle = a;
                if (this.isSelected()) {
                    a.dispose();
                }
            }
        }
        final Object result = this._result;
        final t c = e.c;
        Object result2 = null;
        Label_0138: {
            if ((result2 = result) == c) {
                final AtomicReferenceFieldUpdater k = a.k;
                while (true) {
                    while (!k.compareAndSet(this, c, CoroutineSingletons.COROUTINE_SUSPENDED)) {
                        if (k.get(this) != c) {
                            b = false;
                            if (b) {
                                return CoroutineSingletons.COROUTINE_SUSPENDED;
                            }
                            result2 = this._result;
                            break Label_0138;
                        }
                    }
                    continue;
                }
            }
        }
        if (result2 == e.d) {
            throw new IllegalStateException("Already resumed");
        }
        if (!(result2 instanceof w)) {
            return result2;
        }
        throw ((w)result2).a;
    }
    
    public final void E(final Throwable t) {
        if (this.l()) {
            this.resumeWith(Result.constructor-impl((Object)cg.d.B1(t)));
        }
        else if (!(t instanceof CancellationException)) {
            final Object c = this.C();
            if (!(c instanceof w) || ((w)c).a != t) {
                p2.b.K(this.getContext(), t);
            }
        }
    }
    
    public final void F(final l l, final long n) {
        if (n <= 0L) {
            if (this.l()) {
                try {
                    ng2.k.e(1, (Object)l);
                    final Object invoke = l.invoke((Object)this);
                    if (invoke != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        this.resumeWith(Result.constructor-impl(invoke));
                    }
                }
                finally {
                    final Throwable t;
                    this.resumeWith(Result.constructor-impl((Object)cg.d.B1(t)));
                }
            }
            return;
        }
        this.h(g.e(this.getContext()).d(n, new jj2.b(this, l), this.getContext()));
    }
    
    public final hg2.b getCallerFrame() {
        final c<R> i = this.i;
        hg2.b b;
        if (i instanceof hg2.b) {
            b = (hg2.b)i;
        }
        else {
            b = null;
        }
        return b;
    }
    
    public final CoroutineContext getContext() {
        return this.i.getContext();
    }
    
    public final void h(final m0 m0) {
        final b b = new b(m0);
        if (!this.isSelected()) {
            while (!((LockFreeLinkedListNode)this).u().p(b, this)) {}
            if (!this.isSelected()) {
                return;
            }
        }
        m0.dispose();
    }
    
    public final boolean isSelected() {
        while (true) {
            final Object state = this._state;
            if (state == e.a) {
                return false;
            }
            if (!(state instanceof n)) {
                return true;
            }
            ((n)state).c((Object)this);
        }
    }
    
    public final Object j() {
    Label_0000:
        while (true) {
            final Object state = this._state;
            final t a = e.a;
            if (state == a) {
                boolean b = false;
                final AtomicReferenceFieldUpdater j = jj2.a.j;
                while (true) {
                    while (!j.compareAndSet(this, a, null)) {
                        if (j.get(this) != a) {
                            if (!b) {
                                continue Label_0000;
                            }
                            this.B();
                            return p2.b.j;
                        }
                    }
                    b = true;
                    continue;
                }
            }
            if (!(state instanceof n)) {
                return null;
            }
            ((n)state).c((Object)this);
        }
    }
    
    public final Object k(final AbstractChannel$g abstractChannel$g) {
        return new a(this, abstractChannel$g).c((Object)null);
    }
    
    public final boolean l() {
        final Object j = this.j();
        boolean b;
        if (j == p2.b.j) {
            b = true;
        }
        else {
            if (j != null) {
                throw new IllegalStateException(b.C("Unexpected trySelectIdempotent result ", j));
            }
            b = false;
        }
        return b;
    }
    
    public final c<R> n() {
        return this;
    }
    
    public final void o(final Throwable t) {
    Label_0150:
        while (true) {
            final Object result = this._result;
            final t c = e.c;
            boolean b = true;
            final int n = 1;
            if (result == c) {
                final w w = new w(t, false);
                final AtomicReferenceFieldUpdater k = a.k;
                while (true) {
                    while (!k.compareAndSet(this, c, w)) {
                        if (k.get(this) != c) {
                            final int n2 = 0;
                            if (n2 != 0) {
                                break Label_0150;
                            }
                            continue Label_0150;
                        }
                    }
                    final int n2 = n;
                    continue;
                }
            }
            final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (result == coroutine_SUSPENDED) {
                final AtomicReferenceFieldUpdater i = a.k;
                while (true) {
                    while (!i.compareAndSet(this, coroutine_SUSPENDED, e.d)) {
                        if (i.get(this) != coroutine_SUSPENDED) {
                            b = false;
                            if (b) {
                                cg.d.e3((c)this.i).resumeWith(Result.constructor-impl((Object)cg.d.B1(t)));
                                break Label_0150;
                            }
                            continue Label_0150;
                        }
                    }
                    continue;
                }
            }
            throw new IllegalStateException("Already resumed");
        }
    }
    
    public final void resumeWith(final Object o) {
    Label_0198:
        while (true) {
            final Object result = this._result;
            final t c = e.c;
            boolean b = true;
            final int n = 1;
            if (result == c) {
                final Throwable exceptionOrNull-impl = Result.exceptionOrNull-impl(o);
                Object o2;
                if (exceptionOrNull-impl == null) {
                    o2 = o;
                }
                else {
                    o2 = new w(exceptionOrNull-impl, false);
                }
                final AtomicReferenceFieldUpdater k = a.k;
                while (true) {
                    while (!k.compareAndSet(this, c, o2)) {
                        if (k.get(this) != c) {
                            final int n2 = 0;
                            if (n2 != 0) {
                                break Label_0198;
                            }
                            continue Label_0198;
                        }
                    }
                    final int n2 = n;
                    continue;
                }
            }
            final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (result == coroutine_SUSPENDED) {
                final AtomicReferenceFieldUpdater i = a.k;
                while (true) {
                    while (!i.compareAndSet(this, coroutine_SUSPENDED, e.d)) {
                        if (i.get(this) != coroutine_SUSPENDED) {
                            b = false;
                            if (!b) {
                                continue Label_0198;
                            }
                            if (Result.isFailure-impl(o)) {
                                final c<R> j = this.i;
                                final Throwable exceptionOrNull-impl2 = Result.exceptionOrNull-impl(o);
                                ng2.e.c((Object)exceptionOrNull-impl2);
                                j.resumeWith(Result.constructor-impl((Object)cg.d.B1(exceptionOrNull-impl2)));
                                break Label_0198;
                            }
                            this.i.resumeWith(o);
                            break Label_0198;
                        }
                    }
                    continue;
                }
            }
            throw new IllegalStateException("Already resumed");
        }
    }
    
    public final String toString() {
        final StringBuilder t = a.t("SelectInstance(state=");
        t.append(this._state);
        t.append(", result=");
        return t5.w.h(t, this._result, ')');
    }
    
    public static final class a extends ej2.c<Object>
    {
        public final jj2.a<?> b;
        public final ej2.b c;
        public final long d;
        
        public a(final jj2.a b, final AbstractChannel$g c) {
            this.b = b;
            this.c = (ej2.b)c;
            final f e = jj2.e.e;
            e.getClass();
            this.d = f.a.incrementAndGet(e);
            ((ej2.b)c).a = this;
        }
        
        public final void d(final Object o, final Object o2) {
            boolean b = true;
            final boolean b2 = o2 == null;
            Object a;
            if (b2) {
                a = null;
            }
            else {
                a = e.a;
            }
            final jj2.a<?> b3 = this.b;
            final AtomicReferenceFieldUpdater j = jj2.a.j;
            while (true) {
                while (!j.compareAndSet(b3, this, a)) {
                    if (j.get(b3) != this) {
                        b = false;
                        if (b && b2) {
                            this.b.B();
                        }
                        this.c.a((ej2.c)this, o2);
                        return;
                    }
                }
                continue;
            }
        }
        
        public final long g() {
            return this.d;
        }
        
        public final Object i(final Object o) {
            if (o == null) {
                final jj2.a<?> b = this.b;
                Object b2 = null;
            Label_0118:
                while (true) {
                    final Object state = b._state;
                    b2 = null;
                    if (state == this) {
                        break;
                    }
                    if (state instanceof n) {
                        ((n)state).c((Object)this.b);
                    }
                    else {
                        final t a = e.a;
                        if (state == a) {
                            final jj2.a<?> b3 = this.b;
                            final AtomicReferenceFieldUpdater j = jj2.a.j;
                            while (true) {
                                while (!j.compareAndSet(b3, a, this)) {
                                    if (j.get(b3) != a) {
                                        final boolean b4 = false;
                                        if (b4) {
                                            break Label_0118;
                                        }
                                        continue Label_0118;
                                    }
                                }
                                final boolean b4 = true;
                                continue;
                            }
                        }
                        b2 = e.b;
                        break;
                    }
                }
                if (b2 != null) {
                    return b2;
                }
            }
            try {
                return this.c.b((ej2.c)this);
            }
            finally {
                if (o == null) {
                    final jj2.a<?> b5 = this.b;
                    final AtomicReferenceFieldUpdater i = jj2.a.j;
                    while (!i.compareAndSet(b5, this, e.a) && i.get(b5) == this) {}
                }
            }
        }
        
        public final String toString() {
            return b5.k.k(a.t("AtomicSelectOp(sequence="), this.d, ')');
        }
    }
    
    public static final class b extends LockFreeLinkedListNode
    {
        public final m0 i;
        
        public b(final m0 i) {
            this.i = i;
        }
    }
}
