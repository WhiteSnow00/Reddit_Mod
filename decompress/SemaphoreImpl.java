// 
// Decompiled by Procyon v0.6.0
// 

package kotlinx.coroutines.sync;

import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import ej2.k;
import jj2.t;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import a92.b;
import jj2.r;
import oj2.e;
import ej2.g;
import lg2.c;
import ml0.a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import oj2.f;
import hg2.j;
import rg2.l;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import oj2.d;

public final class SemaphoreImpl implements d
{
    public static final /* synthetic */ AtomicReferenceFieldUpdater c;
    public static final /* synthetic */ AtomicLongFieldUpdater d;
    public static final /* synthetic */ AtomicReferenceFieldUpdater e;
    public static final /* synthetic */ AtomicLongFieldUpdater f;
    public static final /* synthetic */ AtomicIntegerFieldUpdater g;
    public volatile /* synthetic */ int _availablePermits;
    public final int a;
    public final l<Throwable, j> b;
    private volatile /* synthetic */ long deqIdx;
    private volatile /* synthetic */ long enqIdx;
    private volatile /* synthetic */ Object head;
    private volatile /* synthetic */ Object tail;
    
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
    
    public final Object a(final ContinuationImpl continuationImpl) {
        if (SemaphoreImpl.g.getAndDecrement(this) > 0) {
            return j.a;
        }
        final ej2.l f = ej2.g.f(ml0.a.V((c)continuationImpl));
    Label_0289_Outer:
        while (true) {
            final f f2 = (f)this.tail;
            final long andIncrement = SemaphoreImpl.f.getAndIncrement(this);
            final long n = andIncrement / oj2.e.f;
            Object t = null;
            boolean b2;
        Label_0212:
            do {
                Object o = f2;
            Label_0050:
                while (true) {
                    if (((r)o).c >= n) {
                        t = o;
                        if (!((r)o).b()) {
                            break;
                        }
                    }
                    final Object a = jj2.e.a((r)o);
                    t = a92.b.t;
                    if (a == t) {
                        break;
                    }
                    final r r = (r)a;
                    if (r == null) {
                        final f f3 = new f(((r)o).c + 1L, (f)o, 0);
                        final AtomicReferenceFieldUpdater a2 = jj2.e.a;
                        while (true) {
                            while (!a2.compareAndSet(o, null, f3)) {
                                if (a2.get(o) != null) {
                                    final boolean b = false;
                                    if (b) {
                                        if (((r)o).b()) {
                                            ((jj2.e)o).d();
                                        }
                                        o = f3;
                                        continue Label_0050;
                                    }
                                    continue Label_0050;
                                }
                            }
                            final boolean b = true;
                            continue Label_0289_Outer;
                        }
                    }
                    o = r;
                }
                if (t == a92.b.t) {
                    break;
                }
                final r t2 = vl.a.T(t);
                Label_0116:
            Label_0209:
                while (true) {
                    final r r2 = (r)this.tail;
                    if (r2.c >= t2.c) {
                        break;
                    }
                    if (!t2.g()) {
                        b2 = false;
                        continue Label_0212;
                    }
                    final AtomicReferenceFieldUpdater e = SemaphoreImpl.e;
                    while (true) {
                        while (!e.compareAndSet(this, r2, t2)) {
                            if (e.get(this) != r2) {
                                final boolean b3 = false;
                                if (b3) {
                                    if (r2.e()) {
                                        r2.d();
                                        break Label_0209;
                                    }
                                    break Label_0209;
                                }
                                else {
                                    if (t2.e()) {
                                        t2.d();
                                        continue Label_0116;
                                    }
                                    continue Label_0116;
                                }
                            }
                        }
                        final boolean b3 = true;
                        continue Label_0289_Outer;
                    }
                }
                b2 = true;
            } while (!b2);
            final f f4 = (f)vl.a.T(t);
            final int n2 = (int)(andIncrement % oj2.e.f);
            final AtomicReferenceArray e2 = f4.e;
            while (true) {
                while (!e2.compareAndSet(n2, null, f)) {
                    if (e2.get(n2) != null) {
                        final boolean b4 = false;
                        boolean b7 = false;
                        Label_0386: {
                            Label_0377: {
                                if (!b4) {
                                    final t b5 = oj2.e.b;
                                    final t c = oj2.e.c;
                                    final AtomicReferenceArray e3 = f4.e;
                                    while (true) {
                                        while (!e3.compareAndSet(n2, b5, c)) {
                                            if (e3.get(n2) != b5) {
                                                final boolean b6 = false;
                                                if (b6) {
                                                    f.y((l)this.b, (Object)j.a);
                                                    break Label_0377;
                                                }
                                                b7 = false;
                                                break Label_0386;
                                            }
                                        }
                                        final boolean b6 = true;
                                        continue;
                                    }
                                }
                                f.F((l)new oj2.a(f4, n2));
                            }
                            b7 = true;
                        }
                        if (b7) {
                            break Label_0289_Outer;
                        }
                        if (SemaphoreImpl.g.getAndDecrement(this) > 0) {
                            f.y((l)this.b, (Object)j.a);
                            break Label_0289_Outer;
                        }
                        continue Label_0289_Outer;
                    }
                }
                final boolean b4 = true;
                continue;
            }
        }
        Object o2 = f.p();
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (o2 != coroutine_SUSPENDED) {
            o2 = j.a;
        }
        if (o2 == coroutine_SUSPENDED) {
            return o2;
        }
        return j.a;
    }
    
    public final void release() {
        while (true) {
            final int availablePermits = this._availablePermits;
            final int a = this.a;
            final boolean b = false;
            final int n = 0;
            if (availablePermits >= a) {
                final StringBuilder r = a.r("The number of released permits cannot be greater than ");
                r.append(this.a);
                throw new IllegalStateException(r.toString().toString());
            }
            if (!SemaphoreImpl.g.compareAndSet(this, availablePermits, availablePermits + 1)) {
                continue;
            }
            if (availablePermits >= 0) {
                return;
            }
            final f f = (f)this.head;
            final long andIncrement = SemaphoreImpl.d.getAndIncrement(this);
            final long n2 = andIncrement / oj2.e.f;
            Object t = null;
            boolean b3;
        Label_0243:
            do {
                Object o = f;
            Label_0081:
                while (true) {
                    if (((r)o).c >= n2) {
                        t = o;
                        if (!((r)o).b()) {
                            break;
                        }
                    }
                    final Object a2 = jj2.e.a((r)o);
                    t = a92.b.t;
                    if (a2 == t) {
                        break;
                    }
                    final r r2 = (r)a2;
                    if (r2 == null) {
                        final f f2 = new f(((r)o).c + 1L, (f)o, 0);
                        final AtomicReferenceFieldUpdater a3 = jj2.e.a;
                        while (true) {
                            while (!a3.compareAndSet(o, null, f2)) {
                                if (a3.get(o) != null) {
                                    final boolean b2 = false;
                                    if (b2) {
                                        if (((r)o).b()) {
                                            ((jj2.e)o).d();
                                        }
                                        o = f2;
                                        continue Label_0081;
                                    }
                                    continue Label_0081;
                                }
                            }
                            final boolean b2 = true;
                            continue;
                        }
                    }
                    o = r2;
                }
                if (t == a92.b.t) {
                    break;
                }
                final r t2 = vl.a.T(t);
                Label_0149:
            Label_0241:
                while (true) {
                    final r r3 = (r)this.head;
                    if (r3.c >= t2.c) {
                        break;
                    }
                    if (!t2.g()) {
                        b3 = false;
                        continue Label_0243;
                    }
                    final AtomicReferenceFieldUpdater c = SemaphoreImpl.c;
                    while (true) {
                        while (!c.compareAndSet(this, r3, t2)) {
                            if (c.get(this) != r3) {
                                final boolean b4 = false;
                                if (b4) {
                                    if (r3.e()) {
                                        r3.d();
                                        break Label_0241;
                                    }
                                    break Label_0241;
                                }
                                else {
                                    if (t2.e()) {
                                        t2.d();
                                        continue Label_0149;
                                    }
                                    continue Label_0149;
                                }
                            }
                        }
                        final boolean b4 = true;
                        continue;
                    }
                }
                b3 = true;
            } while (!b3);
            final f f3 = (f)vl.a.T(t);
            jj2.e.b.lazySet(f3, null);
            int n3 = 0;
            Label_0476: {
                if (((r)f3).c > n2) {
                    n3 = (b ? 1 : 0);
                }
                else {
                    final int n4 = (int)(andIncrement % oj2.e.f);
                    final t andSet = f3.e.getAndSet(n4, oj2.e.b);
                    Label_0474: {
                        if (andSet == null) {
                            for (int a4 = oj2.e.a, i = 0; i < a4; ++i) {
                                if (f3.e.get(n4) == oj2.e.c) {
                                    break Label_0474;
                                }
                            }
                            final t b5 = oj2.e.b;
                            final t d = oj2.e.d;
                            final AtomicReferenceArray e = f3.e;
                            while (true) {
                                while (!e.compareAndSet(n4, b5, d)) {
                                    if (e.get(n4) != b5) {
                                        final int n5 = n;
                                        n3 = (n5 ^ 0x1);
                                        break Label_0476;
                                    }
                                }
                                final int n5 = 1;
                                continue;
                            }
                        }
                        if (andSet == oj2.e.e) {
                            n3 = (b ? 1 : 0);
                            break Label_0476;
                        }
                        final k k = (k)andSet;
                        if (k.j0(j.a, null, this.b) == null) {
                            n3 = (b ? 1 : 0);
                            break Label_0476;
                        }
                        k.k();
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
