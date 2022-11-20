// 
// Decompiled by Procyon v0.6.0
// 

package kotlinx.coroutines.sync;

import zi2.m0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import t5.w;
import zi2.m;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import zi2.m1;
import ej2.i;
import mg2.l;
import cg.d;
import cg2.j;
import ej2.o;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import ej2.n;
import kj2.b;
import i10.a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kj2.c;

public final class MutexImpl implements kj2.c
{
    public static final AtomicReferenceFieldUpdater a;
    public volatile Object _state;
    
    static {
        a = AtomicReferenceFieldUpdater.newUpdater(MutexImpl.class, Object.class, "_state");
    }
    
    public MutexImpl(final boolean b) {
        kj2.b state;
        if (b) {
            state = i10.a.i;
        }
        else {
            state = i10.a.j;
        }
        this._state = state;
    }
    
    @Override
    public final void a(Object owner) {
    Label_0000:
        while (true) {
            final Object state = this._state;
            final boolean b = state instanceof kj2.b;
            final int n = 1;
            final int n2 = 1;
            if (b) {
                if (owner == null) {
                    if (((kj2.b)state).a == i10.a.h) {
                        throw new IllegalStateException("Mutex is not locked".toString());
                    }
                }
                else {
                    final kj2.b b2 = (kj2.b)state;
                    if (b2.a != owner) {
                        final StringBuilder t = a.t("Mutex is locked by ");
                        t.append(b2.a);
                        t.append(" but expected ");
                        t.append(owner);
                        throw new IllegalStateException(t.toString().toString());
                    }
                }
                final AtomicReferenceFieldUpdater a = MutexImpl.a;
                while (true) {
                    while (!a.compareAndSet(this, state, i10.a.j)) {
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
                if (!(state instanceof b)) {
                    throw new IllegalStateException(b.C("Illegal state ", state));
                }
                if (owner != null) {
                    final b b3 = (b)state;
                    if (b3.owner != owner) {
                        final StringBuilder t2 = a.t("Mutex is locked by ");
                        t2.append(b3.owner);
                        t2.append(" but expected ");
                        t2.append(owner);
                        throw new IllegalStateException(t2.toString().toString());
                    }
                }
                final b b4 = (b)state;
                LockFreeLinkedListNode lockFreeLinkedListNode;
                while (true) {
                    lockFreeLinkedListNode = (LockFreeLinkedListNode)((LockFreeLinkedListNode)b4).s();
                    if (lockFreeLinkedListNode == b4) {
                        lockFreeLinkedListNode = null;
                        break;
                    }
                    if (lockFreeLinkedListNode.x()) {
                        break;
                    }
                    ((o)lockFreeLinkedListNode.s()).a.v();
                }
                if (lockFreeLinkedListNode == null) {
                    final c c = new c(b4);
                    final AtomicReferenceFieldUpdater a2 = MutexImpl.a;
                    while (true) {
                        while (!a2.compareAndSet(this, state, c)) {
                            if (a2.get(this) != state) {
                                final int n4 = 0;
                                if (n4 != 0 && c.c((Object)this) == null) {
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
                        owner = i10.a.g;
                    }
                    b4.owner = owner;
                    a3.B();
                    return;
                }
                continue;
            }
        }
    }
    
    public final Object b(Object o, final gg2.c<? super j> c) {
        if (this.c(o)) {
            return j.a;
        }
        final m b = if0.a.B(d.e3((gg2.c)c));
        LockCont lockCont = new LockCont(o, b);
    Label_0303:
        while (true) {
            final Object state = this._state;
            final boolean b2 = state instanceof kj2.b;
            boolean b3 = false;
            if (b2) {
                final kj2.b b4 = (kj2.b)state;
                if (b4.a == i10.a.h) {
                    kj2.b i;
                    if (o == null) {
                        i = i10.a.i;
                    }
                    else {
                        i = new kj2.b(o);
                    }
                    final AtomicReferenceFieldUpdater a = MutexImpl.a;
                    while (true) {
                        while (!a.compareAndSet(this, state, i)) {
                            if (a.get(this) != state) {
                                if (b3) {
                                    b.f((l)new MutexImpl$lockSuspend$2$1$1(this, o), j.a);
                                    break Label_0303;
                                }
                                continue Label_0303;
                            }
                        }
                        b3 = true;
                        continue;
                    }
                }
                final AtomicReferenceFieldUpdater a2 = MutexImpl.a;
                while (!a2.compareAndSet(this, state, new b(b4.a))) {
                    if (a2.get(this) != state) {
                        break;
                    }
                }
            }
            else if (state instanceof b) {
                final b b5 = (b)state;
                if (b5.owner == o) {
                    throw new IllegalStateException(b.k("Already locked by ", o).toString());
                }
                while (!((LockFreeLinkedListNode)b5).u().p(lockCont, b5)) {}
                if (this._state == state || !MutexImpl.a.j.compareAndSet(lockCont, 0, 1)) {
                    b.Z((l)new m1((LockFreeLinkedListNode)lockCont));
                    break;
                }
                lockCont = new LockCont(o, b);
            }
            else {
                if (!(state instanceof n)) {
                    throw new IllegalStateException(b.C("Illegal state ", state));
                }
                ((n)state).c((Object)this);
            }
        }
        o = b.q();
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
            final boolean b = state instanceof kj2.b;
            final int n = 1;
            boolean b2 = false;
            if (b) {
                if (((kj2.b)state).a != i10.a.h) {
                    return false;
                }
                kj2.b i;
                if (o == null) {
                    i = i10.a.i;
                }
                else {
                    i = new kj2.b(o);
                }
                final AtomicReferenceFieldUpdater a = MutexImpl.a;
                while (true) {
                    while (!a.compareAndSet(this, state, i)) {
                        if (a.get(this) != state) {
                            if (b2) {
                                return true;
                            }
                            continue Label_0000;
                        }
                    }
                    b2 = true;
                    continue;
                }
            }
            else if (state instanceof b) {
                int n2;
                if (((b)state).owner != o) {
                    n2 = n;
                }
                else {
                    n2 = 0;
                }
                if (n2 != 0) {
                    return false;
                }
                throw new IllegalStateException(b.k("Already locked by ", o).toString());
            }
            else {
                if (!(state instanceof n)) {
                    throw new IllegalStateException(b.C("Illegal state ", state));
                }
                ((n)state).c((Object)this);
            }
        }
    }
    
    @Override
    public final String toString() {
        while (true) {
            final Object state = this._state;
            if (state instanceof kj2.b) {
                return w.h(a.t("Mutex["), ((kj2.b)state).a, ']');
            }
            if (state instanceof n) {
                ((n)state).c((Object)this);
            }
            else {
                if (state instanceof b) {
                    return w.h(a.t("Mutex["), ((b)state).owner, ']');
                }
                throw new IllegalStateException(b.C("Illegal state ", state));
            }
        }
    }
    
    public final class LockCont extends a
    {
        public final zi2.l<j> k;
        public final MutexImpl l;
        
        public LockCont(final MutexImpl l, final Object o, final m k) {
            this.l = l;
            super(o);
            this.k = (zi2.l<j>)k;
        }
        
        @Override
        public final void B() {
            this.k.g();
        }
        
        @Override
        public final boolean C() {
            final AtomicIntegerFieldUpdater j = MutexImpl.a.j;
            boolean b = false;
            if (!j.compareAndSet(this, 0, 1)) {
                return false;
            }
            if (this.k.D((Object)cg2.j.a, (LockFreeLinkedListNode.a)null, (l)new MutexImpl$LockCont$tryResumeLockWaiter$1(this.l, this)) != null) {
                b = true;
            }
            return b;
        }
        
        @Override
        public final String toString() {
            final StringBuilder t = a.t("LockCont[");
            t.append(super.i);
            t.append(", ");
            t.append(this.k);
            t.append("] for ");
            t.append(this.l);
            return t.toString();
        }
    }
    
    public abstract class a extends LockFreeLinkedListNode implements m0
    {
        public static final AtomicIntegerFieldUpdater j;
        public final Object i;
        private volatile int isTaken;
        
        static {
            j = AtomicIntegerFieldUpdater.newUpdater(a.class, "isTaken");
        }
        
        public a(final Object i) {
            this.i = i;
            this.isTaken = 0;
        }
        
        public abstract void B();
        
        public abstract boolean C();
        
        @Override
        public final void dispose() {
            this.x();
        }
    }
    
    public static final class b extends i
    {
        public volatile Object owner;
        
        public b(final Object owner) {
            this.owner = owner;
        }
        
        public final String toString() {
            return w.h(a.t("LockedQueue["), this.owner, ']');
        }
    }
    
    public static final class c extends ej2.c<MutexImpl>
    {
        public final b b;
        
        public c(final b b) {
            this.b = b;
        }
        
        public final void d(final Object o, final Object o2) {
            final MutexImpl mutexImpl = (MutexImpl)o;
            Object o3;
            if (o2 == null) {
                o3 = i10.a.j;
            }
            else {
                o3 = this.b;
            }
            final AtomicReferenceFieldUpdater a = MutexImpl.a;
            while (!a.compareAndSet(mutexImpl, this, o3)) {
                if (a.get(mutexImpl) != this) {
                    return;
                }
            }
        }
        
        public final Object i(final Object o) {
            final MutexImpl mutexImpl = (MutexImpl)o;
            final b b = this.b;
            Object f;
            if (((LockFreeLinkedListNode)b).s() == b) {
                f = null;
            }
            else {
                f = i10.a.f;
            }
            return f;
        }
    }
}
