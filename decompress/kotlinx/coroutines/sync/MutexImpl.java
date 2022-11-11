// 
// Decompiled by Procyon v0.6.0
// 

package kotlinx.coroutines.sync;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import ej2.l0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ej2.m1;
import jj2.i;
import al0.g7;
import rg2.l;
import ej2.g;
import hg2.j;
import jj2.o;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import a81.e;
import jj2.n;
import oj2.b;
import ml0.a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import oj2.c;

public final class MutexImpl implements c
{
    public static final /* synthetic */ AtomicReferenceFieldUpdater a;
    public volatile /* synthetic */ Object _state;
    
    static {
        a = AtomicReferenceFieldUpdater.newUpdater(MutexImpl.class, Object.class, "_state");
    }
    
    public MutexImpl(final boolean b) {
        b state;
        if (b) {
            state = ml0.a.p;
        }
        else {
            state = ml0.a.q;
        }
        this._state = state;
    }
    
    public final void a(Object owner) {
    Label_0000:
        while (true) {
            final Object state = this._state;
            final boolean b = state instanceof b;
            final int n = 1;
            final int n2 = 1;
            if (b) {
                if (owner == null) {
                    if (((b)state).a == ml0.a.o) {
                        throw new IllegalStateException("Mutex is not locked".toString());
                    }
                }
                else {
                    final b b2 = (b)state;
                    if (b2.a != owner) {
                        final StringBuilder r = a.r("Mutex is locked by ");
                        r.append(b2.a);
                        r.append(" but expected ");
                        r.append(owner);
                        throw new IllegalStateException(r.toString().toString());
                    }
                }
                final AtomicReferenceFieldUpdater a = MutexImpl.a;
                while (true) {
                    while (!a.compareAndSet(this, state, ml0.a.q)) {
                        if (a.get(this) != state) {
                            final int n3 = 0;
                            if (n3 != 0) {
                                return;
                            }
                            continue Label_0000;
                        }
                    }
                    final int n3 = n2;
                    continue;
                }
            }
            if (state instanceof n) {
                ((n)state).c((Object)this);
            }
            else {
                if (!(state instanceof MutexImpl.MutexImpl$b)) {
                    throw new IllegalStateException(e.n("Illegal state ", state));
                }
                if (owner != null) {
                    final MutexImpl.MutexImpl$b mutexImpl$b = (MutexImpl.MutexImpl$b)state;
                    if (mutexImpl$b.owner != owner) {
                        final StringBuilder r2 = a.r("Mutex is locked by ");
                        r2.append(mutexImpl$b.owner);
                        r2.append(" but expected ");
                        r2.append(owner);
                        throw new IllegalStateException(r2.toString().toString());
                    }
                }
                final MutexImpl.MutexImpl$b mutexImpl$b2 = (MutexImpl.MutexImpl$b)state;
                LockFreeLinkedListNode lockFreeLinkedListNode;
                while (true) {
                    lockFreeLinkedListNode = (LockFreeLinkedListNode)((LockFreeLinkedListNode)mutexImpl$b2).r();
                    if (lockFreeLinkedListNode == mutexImpl$b2) {
                        lockFreeLinkedListNode = null;
                        break;
                    }
                    if (lockFreeLinkedListNode.w()) {
                        break;
                    }
                    ((o)lockFreeLinkedListNode.r()).a.u();
                }
                if (lockFreeLinkedListNode == null) {
                    final MutexImpl.MutexImpl$c mutexImpl$c = new MutexImpl.MutexImpl$c(mutexImpl$b2);
                    final AtomicReferenceFieldUpdater a2 = MutexImpl.a;
                    while (true) {
                        while (!a2.compareAndSet(this, state, mutexImpl$c)) {
                            if (a2.get(this) != state) {
                                final int n4 = 0;
                                if (n4 != 0 && ((jj2.c)mutexImpl$c).c(this) == null) {
                                    return;
                                }
                                continue Label_0000;
                            }
                        }
                        final int n4 = n;
                        continue;
                    }
                }
                final a a3 = (a)lockFreeLinkedListNode;
                if (a3.C()) {
                    if ((owner = a3.i) == null) {
                        owner = ml0.a.n;
                    }
                    mutexImpl$b2.owner = owner;
                    a3.B();
                    return;
                }
                continue;
            }
        }
    }
    
    public final Object b(Object o, final lg2.c<? super j> c) {
        if (this.c(o)) {
            return j.a;
        }
        final ej2.l f = g.f(ml0.a.V((lg2.c)c));
        MutexImpl.MutexImpl$LockCont mutexImpl$LockCont = new MutexImpl.MutexImpl$LockCont(this, o, f);
    Label_0304:
        while (true) {
            final Object state = this._state;
            final boolean b = state instanceof b;
            boolean b2 = false;
            if (b) {
                final b b3 = (b)state;
                if (b3.a == ml0.a.o) {
                    b p2;
                    if (o == null) {
                        p2 = ml0.a.p;
                    }
                    else {
                        p2 = new b(o);
                    }
                    final AtomicReferenceFieldUpdater a = MutexImpl.a;
                    while (true) {
                        while (!a.compareAndSet(this, state, p2)) {
                            if (a.get(this) != state) {
                                if (b2) {
                                    f.y((l)new MutexImpl$lockSuspend$2$1$1(this, o), (Object)j.a);
                                    break Label_0304;
                                }
                                continue Label_0304;
                            }
                        }
                        b2 = true;
                        continue;
                    }
                }
                final AtomicReferenceFieldUpdater a2 = MutexImpl.a;
                while (!a2.compareAndSet(this, state, new MutexImpl.MutexImpl$b(b3.a))) {
                    if (a2.get(this) != state) {
                        break;
                    }
                }
            }
            else if (state instanceof MutexImpl.MutexImpl$b) {
                final MutexImpl.MutexImpl$b mutexImpl$b = (MutexImpl.MutexImpl$b)state;
                if (mutexImpl$b.owner == o) {
                    throw new IllegalStateException(g7.h("Already locked by ", o).toString());
                }
                while (!((LockFreeLinkedListNode)mutexImpl$b).t().n((LockFreeLinkedListNode)mutexImpl$LockCont, (i)mutexImpl$b)) {}
                if (this._state == state || !MutexImpl.a.j.compareAndSet(mutexImpl$LockCont, 0, 1)) {
                    f.F((l)new m1((LockFreeLinkedListNode)mutexImpl$LockCont));
                    break;
                }
                mutexImpl$LockCont = new MutexImpl.MutexImpl$LockCont(this, o, f);
            }
            else {
                if (!(state instanceof n)) {
                    throw new IllegalStateException(e.n("Illegal state ", state));
                }
                ((n)state).c((Object)this);
            }
        }
        o = f.p();
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (o != coroutine_SUSPENDED) {
            o = j.a;
        }
        if (o == coroutine_SUSPENDED) {
            return o;
        }
        return j.a;
    }
    
    public final boolean c(final Object o) {
    Label_0000:
        while (true) {
            final Object state = this._state;
            final boolean b = state instanceof b;
            boolean b2 = true;
            final int n = 0;
            if (b) {
                if (((b)state).a != ml0.a.o) {
                    return false;
                }
                b p;
                if (o == null) {
                    p = ml0.a.p;
                }
                else {
                    p = new b(o);
                }
                final AtomicReferenceFieldUpdater a = MutexImpl.a;
                while (true) {
                    while (!a.compareAndSet(this, state, p)) {
                        if (a.get(this) != state) {
                            final int n2 = n;
                            if (n2 != 0) {
                                return true;
                            }
                            continue Label_0000;
                        }
                    }
                    final int n2 = 1;
                    continue;
                }
            }
            else if (state instanceof MutexImpl.MutexImpl$b) {
                if (((MutexImpl.MutexImpl$b)state).owner == o) {
                    b2 = false;
                }
                if (b2) {
                    return false;
                }
                throw new IllegalStateException(g7.h("Already locked by ", o).toString());
            }
            else {
                if (!(state instanceof n)) {
                    throw new IllegalStateException(e.n("Illegal state ", state));
                }
                ((n)state).c((Object)this);
            }
        }
    }
    
    @Override
    public final String toString() {
        while (true) {
            final Object state = this._state;
            if (state instanceof b) {
                return wu.a.b(a.r("Mutex["), ((b)state).a, ']');
            }
            if (state instanceof n) {
                ((n)state).c((Object)this);
            }
            else {
                if (state instanceof MutexImpl.MutexImpl$b) {
                    return wu.a.b(a.r("Mutex["), ((MutexImpl.MutexImpl$b)state).owner, ']');
                }
                throw new IllegalStateException(e.n("Illegal state ", state));
            }
        }
    }
    
    public abstract class a extends LockFreeLinkedListNode implements l0
    {
        public static final /* synthetic */ AtomicIntegerFieldUpdater j;
        public final Object i;
        private volatile /* synthetic */ int isTaken;
        
        static {
            j = AtomicIntegerFieldUpdater.newUpdater(a.class, "isTaken");
        }
        
        public a(final Object i) {
            this.i = i;
            this.isTaken = 0;
        }
        
        public abstract void B();
        
        public abstract boolean C();
        
        public final void dispose() {
            this.w();
        }
    }
}
