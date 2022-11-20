// 
// Decompiled by Procyon v0.6.0
// 

package kotlinx.coroutines.sync;

import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import ej2.t;
import java.util.concurrent.atomic.AtomicReferenceArray;
import zi2.m;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import zd.b;
import ej2.r;
import kj2.e;
import if0.a;
import gg2.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kj2.f;
import cg2.j;
import mg2.l;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kj2.d;

public final class SemaphoreImpl implements d
{
    public static final AtomicReferenceFieldUpdater c;
    public static final AtomicLongFieldUpdater d;
    public static final AtomicReferenceFieldUpdater e;
    public static final AtomicLongFieldUpdater f;
    public static final AtomicIntegerFieldUpdater g;
    public volatile int _availablePermits;
    public final int a;
    public final l<Throwable, j> b;
    private volatile long deqIdx;
    private volatile long enqIdx;
    private volatile Object head;
    private volatile Object tail;
    
    static {
        c = AtomicReferenceFieldUpdater.newUpdater(SemaphoreImpl.class, Object.class, "head");
        d = AtomicLongFieldUpdater.newUpdater(SemaphoreImpl.class, "deqIdx");
        e = AtomicReferenceFieldUpdater.newUpdater(SemaphoreImpl.class, Object.class, "tail");
        f = AtomicLongFieldUpdater.newUpdater(SemaphoreImpl.class, "enqIdx");
        g = AtomicIntegerFieldUpdater.newUpdater(SemaphoreImpl.class, "_availablePermits");
    }
    
    public SemaphoreImpl(final int a, final int n) {
        this.a = a;
        this.deqIdx = 0L;
        this.enqIdx = 0L;
        final int n2 = 1;
        if (a <= 0) {
            throw new IllegalArgumentException(d.h("Semaphore should have at least 1 permit, but had ", a).toString());
        }
        int n3;
        if (n >= 0 && n <= a) {
            n3 = n2;
        }
        else {
            n3 = 0;
        }
        if (n3 != 0) {
            final f f = new f(0L, (f)null, 2);
            this.head = f;
            this.tail = f;
            this._availablePermits = a - n;
            this.b = (l<Throwable, j>)new SemaphoreImpl$onCancellationRelease$1(this);
            return;
        }
        throw new IllegalArgumentException(d.h("The number of acquired permits should be in 0..", a).toString());
    }
    
    @Override
    public final Object a(final ContinuationImpl continuationImpl) {
        if (SemaphoreImpl.g.getAndDecrement(this) > 0) {
            return j.a;
        }
        final m b = if0.a.B(cg.d.e3((c)continuationImpl));
    Label_0279_Outer:
        while (true) {
            final f f = (f)this.tail;
            final long andIncrement = SemaphoreImpl.f.getAndIncrement(this);
            final long n = andIncrement / kj2.e.f;
            Object m = null;
            boolean b3;
        Label_0207:
            do {
                Object o = f;
            Label_0053:
                while (true) {
                    if (((r)o).c >= n) {
                        m = o;
                        if (!((r)o).b()) {
                            break;
                        }
                    }
                    final Object a = ej2.e.a((r)o);
                    m = zd.b.m;
                    if (a == m) {
                        break;
                    }
                    final r r = (r)a;
                    if (r == null) {
                        final f f2 = new f(((r)o).c + 1L, (f)o, 0);
                        final AtomicReferenceFieldUpdater a2 = ej2.e.a;
                        while (true) {
                            while (!a2.compareAndSet(o, null, f2)) {
                                if (a2.get(o) != null) {
                                    final boolean b2 = false;
                                    if (b2) {
                                        if (((r)o).b()) {
                                            ((ej2.e)o).d();
                                        }
                                        o = f2;
                                        continue Label_0053;
                                    }
                                    continue Label_0053;
                                }
                            }
                            final boolean b2 = true;
                            continue Label_0279_Outer;
                        }
                    }
                    o = r;
                }
                if (m == zd.b.m) {
                    break;
                }
                final r t0 = ah0.b.t0(m);
                Label_0116:
            Label_0205:
                while (true) {
                    final r r2 = (r)this.tail;
                    if (r2.c >= t0.c) {
                        break;
                    }
                    if (!t0.g()) {
                        b3 = false;
                        continue Label_0207;
                    }
                    final AtomicReferenceFieldUpdater e = SemaphoreImpl.e;
                    while (true) {
                        while (!e.compareAndSet(this, r2, t0)) {
                            if (e.get(this) != r2) {
                                final boolean b4 = false;
                                if (b4) {
                                    if (r2.e()) {
                                        ((ej2.e)r2).d();
                                        break Label_0205;
                                    }
                                    break Label_0205;
                                }
                                else {
                                    if (t0.e()) {
                                        ((ej2.e)t0).d();
                                        continue Label_0116;
                                    }
                                    continue Label_0116;
                                }
                            }
                        }
                        final boolean b4 = true;
                        continue Label_0279_Outer;
                    }
                }
                b3 = true;
            } while (!b3);
            final f f3 = (f)ah0.b.t0(m);
            final int n2 = (int)(andIncrement % kj2.e.f);
            final AtomicReferenceArray e2 = f3.e;
            while (true) {
                while (!e2.compareAndSet(n2, null, b)) {
                    if (e2.get(n2) != null) {
                        final boolean b5 = false;
                        boolean b8 = false;
                        Label_0372: {
                            Label_0365: {
                                if (!b5) {
                                    final t b6 = kj2.e.b;
                                    final t c = kj2.e.c;
                                    final AtomicReferenceArray e3 = f3.e;
                                    while (true) {
                                        while (!e3.compareAndSet(n2, b6, c)) {
                                            if (e3.get(n2) != b6) {
                                                final boolean b7 = false;
                                                if (b7) {
                                                    b.f(this.b, j.a);
                                                    break Label_0365;
                                                }
                                                b8 = false;
                                                break Label_0372;
                                            }
                                        }
                                        final boolean b7 = true;
                                        continue;
                                    }
                                }
                                b.Z((l)new kj2.a(f3, n2));
                            }
                            b8 = true;
                        }
                        if (b8) {
                            break Label_0279_Outer;
                        }
                        if (SemaphoreImpl.g.getAndDecrement(this) > 0) {
                            b.f(this.b, j.a);
                            break Label_0279_Outer;
                        }
                        continue Label_0279_Outer;
                    }
                }
                final boolean b5 = true;
                continue;
            }
        }
        Object o2 = b.q();
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (o2 != coroutine_SUSPENDED) {
            o2 = j.a;
        }
        if (o2 == coroutine_SUSPENDED) {
            return o2;
        }
        return j.a;
    }
    
    @Override
    public final void release() {
        while (true) {
            final int availablePermits = this._availablePermits;
            final int a = this.a;
            final boolean b = false;
            final int n = 0;
            if (availablePermits >= a) {
                final StringBuilder t = a.t("The number of released permits cannot be greater than ");
                t.append(this.a);
                throw new IllegalStateException(t.toString().toString());
            }
            if (!SemaphoreImpl.g.compareAndSet(this, availablePermits, availablePermits + 1)) {
                continue;
            }
            if (availablePermits >= 0) {
                return;
            }
            final f f = (f)this.head;
            final long andIncrement = SemaphoreImpl.d.getAndIncrement(this);
            final long n2 = andIncrement / kj2.e.f;
            Object m = null;
            boolean b3;
        Label_0247:
            do {
                Object o = f;
            Label_0085:
                while (true) {
                    if (((r)o).c >= n2) {
                        m = o;
                        if (!((r)o).b()) {
                            break;
                        }
                    }
                    final Object a2 = ej2.e.a((r)o);
                    m = zd.b.m;
                    if (a2 == m) {
                        break;
                    }
                    final r r = (r)a2;
                    if (r == null) {
                        final f f2 = new f(((r)o).c + 1L, (f)o, 0);
                        final AtomicReferenceFieldUpdater a3 = ej2.e.a;
                        while (true) {
                            while (!a3.compareAndSet(o, null, f2)) {
                                if (a3.get(o) != null) {
                                    final boolean b2 = false;
                                    if (b2) {
                                        if (((r)o).b()) {
                                            ((ej2.e)o).d();
                                        }
                                        o = f2;
                                        continue Label_0085;
                                    }
                                    continue Label_0085;
                                }
                            }
                            final boolean b2 = true;
                            continue;
                        }
                    }
                    o = r;
                }
                if (m == zd.b.m) {
                    break;
                }
                final r t2 = ah0.b.t0(m);
                Label_0153:
            Label_0245:
                while (true) {
                    final r r2 = (r)this.head;
                    if (r2.c >= t2.c) {
                        break;
                    }
                    if (!t2.g()) {
                        b3 = false;
                        continue Label_0247;
                    }
                    final AtomicReferenceFieldUpdater c = SemaphoreImpl.c;
                    while (true) {
                        while (!c.compareAndSet(this, r2, t2)) {
                            if (c.get(this) != r2) {
                                final boolean b4 = false;
                                if (b4) {
                                    if (r2.e()) {
                                        ((ej2.e)r2).d();
                                        break Label_0245;
                                    }
                                    break Label_0245;
                                }
                                else {
                                    if (t2.e()) {
                                        ((ej2.e)t2).d();
                                        continue Label_0153;
                                    }
                                    continue Label_0153;
                                }
                            }
                        }
                        final boolean b4 = true;
                        continue;
                    }
                }
                b3 = true;
            } while (!b3);
            final f f3 = (f)ah0.b.t0(m);
            ej2.e.b.lazySet(f3, null);
            int n3 = 0;
            Label_0484: {
                if (((r)f3).c > n2) {
                    n3 = (b ? 1 : 0);
                }
                else {
                    final int n4 = (int)(andIncrement % kj2.e.f);
                    final t andSet = f3.e.getAndSet(n4, kj2.e.b);
                    Label_0482: {
                        if (andSet == null) {
                            for (int a4 = kj2.e.a, i = 0; i < a4; ++i) {
                                if (f3.e.get(n4) == kj2.e.c) {
                                    break Label_0482;
                                }
                            }
                            final t b5 = kj2.e.b;
                            final t d = kj2.e.d;
                            final AtomicReferenceArray e = f3.e;
                            while (true) {
                                while (!e.compareAndSet(n4, b5, d)) {
                                    if (e.get(n4) != b5) {
                                        final int n5 = n;
                                        n3 = (n5 ^ 0x1);
                                        break Label_0484;
                                    }
                                }
                                final int n5 = 1;
                                continue;
                            }
                        }
                        if (andSet == kj2.e.e) {
                            n3 = (b ? 1 : 0);
                            break Label_0484;
                        }
                        final zi2.l l = (zi2.l)andSet;
                        if (l.D((Object)j.a, (LockFreeLinkedListNode.a)null, (l)this.b) == null) {
                            n3 = (b ? 1 : 0);
                            break Label_0484;
                        }
                        l.g();
                    }
                    n3 = 1;
                }
            }
            if (n3 != 0) {
                return;
            }
        }
    }
}
