// 
// Decompiled by Procyon v0.6.0
// 

package kotlinx.coroutines.scheduling;

import cg2.j;
import kotlin.random.Random;
import kotlin.Metadata;
import zi2.d0;
import java.util.ArrayList;
import java.util.concurrent.RejectedExecutionException;
import ij2.h;
import ij2.i;
import ij2.g;
import ij2.k;
import ij2.f;
import java.util.concurrent.locks.LockSupport;
import ng2.e;
import aq2.a;
import ej2.p;
import ij2.c;
import ej2.t;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.io.Closeable;
import java.util.concurrent.Executor;

public final class CoroutineScheduler implements Executor, Closeable
{
    public static final AtomicLongFieldUpdater m;
    public static final AtomicLongFieldUpdater n;
    public static final AtomicIntegerFieldUpdater o;
    public static final t p;
    private volatile int _isTerminated;
    public volatile long controlState;
    public final int f;
    public final int g;
    public final long h;
    public final String i;
    public final c j;
    public final c k;
    public final p<b> l;
    private volatile long parkedWorkersStack;
    
    static {
        p = new t("NOT_IN_STACK");
        m = AtomicLongFieldUpdater.newUpdater(CoroutineScheduler.class, "parkedWorkersStack");
        n = AtomicLongFieldUpdater.newUpdater(CoroutineScheduler.class, "controlState");
        o = AtomicIntegerFieldUpdater.newUpdater(CoroutineScheduler.class, "_isTerminated");
    }
    
    public CoroutineScheduler(final int f, int g, final long h, final String i) {
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        final int n = 1;
        if (f < 1) {
            throw new IllegalArgumentException(aq2.a.l("Core pool size ", f, " should be at least 1").toString());
        }
        if (g < f) {
            throw new IllegalArgumentException(b.i("Max pool size ", g, " should be greater than or equals to core pool size ", f).toString());
        }
        if (g > 2097150) {
            throw new IllegalArgumentException(aq2.a.l("Max pool size ", g, " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (h > 0L) {
            g = n;
        }
        else {
            g = 0;
        }
        if (g != 0) {
            this.j = new c();
            this.k = new c();
            this.parkedWorkersStack = 0L;
            this.l = (p<b>)new p(f + 1);
            this.controlState = (long)f << 42;
            this._isTerminated = 0;
            return;
        }
        throw new IllegalArgumentException(m5.a.f("Idle worker keep alive time ", h, " must be positive").toString());
    }
    
    public final int b() {
        synchronized (this.l) {
            if (this._isTerminated != 0) {
                return -1;
            }
            final long controlState = this.controlState;
            final int n = (int)(controlState & 0x1FFFFFL);
            final int n2 = n - (int)((controlState & 0x3FFFFE00000L) >> 21);
            final int n3 = 0;
            int n4;
            if ((n4 = n2) < 0) {
                n4 = 0;
            }
            if (n4 >= this.f) {
                return 0;
            }
            if (n >= this.g) {
                return 0;
            }
            final int n5 = (int)(this.controlState & 0x1FFFFFL) + 1;
            if (n5 <= 0 || this.l.b(n5) != null) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            final b b = new b(n5);
            this.l.c(n5, b);
            int n6 = n3;
            if (n5 == (int)(0x1FFFFFL & CoroutineScheduler.n.incrementAndGet(this))) {
                n6 = 1;
            }
            if (n6 != 0) {
                b.start();
                monitorexit(this.l);
                return n4 + 1;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }
    
    @Override
    public final void close() {
        if (!CoroutineScheduler.o.compareAndSet(this, 0, 1)) {
            return;
        }
        final Thread currentThread = Thread.currentThread();
        Object o;
        if (currentThread instanceof b) {
            o = currentThread;
        }
        else {
            o = null;
        }
        Object o2;
        if (o != null && e.a((Object)((b)o).l, (Object)this)) {
            o2 = o;
        }
        else {
            o2 = null;
        }
        Object o3 = this.l;
        synchronized (o3) {
            final int n = (int)(this.controlState & 0x1FFFFFL);
            monitorexit(o3);
            if (1 <= n) {
                int n2 = 1;
                while (true) {
                    o3 = this.l.b(n2);
                    e.c(o3);
                    o3 = o3;
                    if (o3 != o2) {
                        while (((Thread)o3).isAlive()) {
                            LockSupport.unpark((Thread)o3);
                            ((Thread)o3).join(10000L);
                        }
                        final k f = ((b)o3).f;
                        o3 = this.k;
                        f.getClass();
                        final f f2 = ij2.k.b.getAndSet(f, null);
                        if (f2 != null) {
                            ((ej2.j)o3).a((Object)f2);
                        }
                        boolean b;
                        do {
                            final f d = f.d();
                            if (d == null) {
                                b = false;
                            }
                            else {
                                ((ej2.j)o3).a((Object)d);
                                b = true;
                            }
                        } while (b);
                    }
                    if (n2 == n) {
                        break;
                    }
                    ++n2;
                }
            }
            ((ej2.j)this.k).b();
            ((ej2.j)this.j).b();
            while ((o2 != null && (o3 = ((b)o2).a(true)) != null) || (o3 = ((ej2.j)this.j).d()) != null || (o3 = ((ej2.j)this.k).d()) != null) {
                try {
                    ((Runnable)o3).run();
                }
                finally {
                    try {
                        final Thread currentThread2 = Thread.currentThread();
                        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, (Throwable)o3);
                    }
                    finally {}
                }
            }
            if (o2 != null) {
                ((b)o2).h(WorkerState.TERMINATED);
            }
            this.parkedWorkersStack = 0L;
            this.controlState = 0L;
        }
    }
    
    public final void d(final Runnable runnable, final g g, final boolean b) {
        ij2.i.e.getClass();
        final long nanoTime = System.nanoTime();
        Object o;
        if (runnable instanceof f) {
            o = runnable;
            ((f)o).f = nanoTime;
            ((f)o).g = g;
        }
        else {
            o = new h(runnable, nanoTime, g);
        }
        final Thread currentThread = Thread.currentThread();
        final boolean b2 = currentThread instanceof b;
        final b b3 = null;
        b b4;
        if (b2) {
            b4 = (b)currentThread;
        }
        else {
            b4 = null;
        }
        b b5 = b3;
        if (b4 != null) {
            b5 = b3;
            if (e.a((Object)b4.l, (Object)this)) {
                b5 = b4;
            }
        }
        final int n = 1;
        f a = null;
        Label_0174: {
            if (b5 != null) {
                if (b5.g != WorkerState.TERMINATED) {
                    if (((f)o).g.b() != 0 || b5.g != WorkerState.BLOCKING) {
                        b5.k = true;
                        a = b5.f.a((f)o, b);
                        break Label_0174;
                    }
                }
            }
            a = (f)o;
        }
        if (a != null) {
            boolean b6;
            if (a.g.b() == 1) {
                b6 = ((ej2.j)this.k).a((Object)a);
            }
            else {
                b6 = ((ej2.j)this.j).a((Object)a);
            }
            if (!b6) {
                throw new RejectedExecutionException(ph0.a.f(new StringBuilder(), this.i, " was terminated"));
            }
        }
        int n2;
        if (b && b5 != null) {
            n2 = n;
        }
        else {
            n2 = 0;
        }
        if (((f)o).g.b() == 0) {
            if (n2 != 0) {
                return;
            }
            if (!this.q()) {
                if (!this.k(this.controlState)) {
                    this.q();
                }
            }
        }
        else {
            final long addAndGet = CoroutineScheduler.n.addAndGet(this, 2097152L);
            if (n2 == 0) {
                if (!this.q()) {
                    if (!this.k(addAndGet)) {
                        this.q();
                    }
                }
            }
        }
    }
    
    @Override
    public final void execute(final Runnable runnable) {
        this.d(runnable, (g)ij2.i.f, false);
    }
    
    public final void h(final b b) {
        if (b.c() != CoroutineScheduler.p) {
            return;
        }
        long parkedWorkersStack;
        int b2;
        do {
            parkedWorkersStack = this.parkedWorkersStack;
            final int n = (int)(0x1FFFFFL & parkedWorkersStack);
            b2 = b.b();
            b.g(this.l.b(n));
        } while (!CoroutineScheduler.m.compareAndSet(this, parkedWorkersStack, (long)b2 | (2097152L + parkedWorkersStack & 0xFFFFFFFFFFE00000L)));
    }
    
    public final boolean isTerminated() {
        return this._isTerminated != 0;
    }
    
    public final void j(final b b, final int n, final int n2) {
        int b2;
        long parkedWorkersStack;
    Label_0095:
        do {
            parkedWorkersStack = this.parkedWorkersStack;
            if ((b2 = (int)(0x1FFFFFL & parkedWorkersStack)) == n) {
                if (n2 == 0) {
                    b b3;
                    for (Object o = b.c(); o != CoroutineScheduler.p; o = b3.c()) {
                        if (o == null) {
                            b2 = 0;
                            continue Label_0095;
                        }
                        b3 = (b)o;
                        b2 = b3.b();
                        if (b2 != 0) {
                            continue Label_0095;
                        }
                    }
                    b2 = -1;
                }
                else {
                    b2 = n2;
                }
            }
        } while (b2 < 0 || !CoroutineScheduler.m.compareAndSet(this, parkedWorkersStack, (2097152L + parkedWorkersStack & 0xFFFFFFFFFFE00000L) | (long)b2));
    }
    
    public final boolean k(final long n) {
        int n2;
        if ((n2 = (int)(0x1FFFFFL & n) - (int)((n & 0x3FFFFE00000L) >> 21)) < 0) {
            n2 = 0;
        }
        if (n2 < this.f) {
            final int b = this.b();
            if (b == 1 && this.f > 1) {
                this.b();
            }
            if (b > 0) {
                return true;
            }
        }
        return false;
    }
    
    public final boolean q() {
        while (true) {
            final long parkedWorkersStack = this.parkedWorkersStack;
            final b b = (b)this.l.b((int)(0x1FFFFFL & parkedWorkersStack));
            b b2;
            if (b == null) {
                b2 = null;
            }
            else {
                Object o = b.c();
                t p;
                int b3;
                while (true) {
                    p = CoroutineScheduler.p;
                    if (o == p) {
                        b3 = -1;
                        break;
                    }
                    if (o == null) {
                        b3 = 0;
                        break;
                    }
                    final b b4 = (b)o;
                    b3 = b4.b();
                    if (b3 != 0) {
                        break;
                    }
                    o = b4.c();
                }
                if (b3 < 0 || !CoroutineScheduler.m.compareAndSet(this, parkedWorkersStack, (long)b3 | (2097152L + parkedWorkersStack & 0xFFFFFFFFFFE00000L))) {
                    continue;
                }
                b.g(p);
                b2 = b;
            }
            if (b2 == null) {
                return false;
            }
            if (CoroutineScheduler.b.m.compareAndSet(b2, -1, 0)) {
                LockSupport.unpark(b2);
                return true;
            }
        }
    }
    
    @Override
    public final String toString() {
        final ArrayList list = new ArrayList();
        final int a = this.l.a();
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        int n5;
        int n4 = n5 = n3;
        int n6;
        int n7;
        int n8;
        int n9;
        for (int i = 1; i < a; ++i, n = n6, n2 = n7, n3 = n8, n5 = n9) {
            final b b = (b)this.l.b(i);
            if (b == null) {
                n6 = n;
                n7 = n2;
                n8 = n3;
                n9 = n5;
            }
            else {
                final int c = b.f.c();
                final int n10 = CoroutineScheduler.a.a[b.g.ordinal()];
                if (n10 != 1) {
                    if (n10 != 2) {
                        if (n10 != 3) {
                            if (n10 != 4) {
                                if (n10 != 5) {
                                    n6 = n;
                                    n7 = n2;
                                    n8 = n3;
                                    n9 = n5;
                                }
                                else {
                                    n9 = n5 + 1;
                                    n6 = n;
                                    n7 = n2;
                                    n8 = n3;
                                }
                            }
                            else {
                                final int n11 = n4 + 1;
                                n6 = n;
                                n7 = n2;
                                n8 = n3;
                                n4 = n11;
                                n9 = n5;
                                if (c > 0) {
                                    final StringBuilder sb = new StringBuilder();
                                    sb.append(c);
                                    sb.append('d');
                                    list.add(sb.toString());
                                    n6 = n;
                                    n7 = n2;
                                    n8 = n3;
                                    n4 = n11;
                                    n9 = n5;
                                }
                            }
                        }
                        else {
                            n6 = n + 1;
                            final StringBuilder sb2 = new StringBuilder();
                            sb2.append(c);
                            sb2.append('c');
                            list.add(sb2.toString());
                            n7 = n2;
                            n8 = n3;
                            n9 = n5;
                        }
                    }
                    else {
                        n7 = n2 + 1;
                        final StringBuilder sb3 = new StringBuilder();
                        sb3.append(c);
                        sb3.append('b');
                        list.add(sb3.toString());
                        n6 = n;
                        n8 = n3;
                        n9 = n5;
                    }
                }
                else {
                    n8 = n3 + 1;
                    n9 = n5;
                    n7 = n2;
                    n6 = n;
                }
            }
        }
        final long controlState = this.controlState;
        final StringBuilder sb4 = new StringBuilder();
        sb4.append(this.i);
        sb4.append('@');
        sb4.append(d0.y((Object)this));
        sb4.append("[Pool Size {core = ");
        sb4.append(this.f);
        sb4.append(", max = ");
        b5.k.y(sb4, this.g, "}, Worker States {CPU = ", n, ", blocking = ");
        b5.k.y(sb4, n2, ", parked = ", n3, ", dormant = ");
        b5.k.y(sb4, n4, ", terminated = ", n5, "}, running workers queues = ");
        sb4.append(list);
        sb4.append(", global CPU queue size = ");
        sb4.append(((ej2.j)this.j).c());
        sb4.append(", global blocking queue size = ");
        sb4.append(((ej2.j)this.k).c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int)(0x1FFFFFL & controlState));
        sb4.append(", blocking tasks = ");
        sb4.append((int)((0x3FFFFE00000L & controlState) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(this.f - (int)((0x7FFFFC0000000000L & controlState) >> 42));
        sb4.append("}]");
        return sb4.toString();
    }
    
    @Metadata(d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b" }, d2 = { "Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;", "", "(Ljava/lang/String;I)V", "CPU_ACQUIRED", "BLOCKING", "PARKING", "DORMANT", "TERMINATED", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 6, 0 }, xi = 48)
    public enum WorkerState
    {
        private static final WorkerState[] $VALUES;
        
        BLOCKING, 
        CPU_ACQUIRED, 
        DORMANT, 
        PARKING, 
        TERMINATED;
        
        private static final WorkerState[] $values() {
            return new WorkerState[] { WorkerState.CPU_ACQUIRED, WorkerState.BLOCKING, WorkerState.PARKING, WorkerState.DORMANT, WorkerState.TERMINATED };
        }
        
        static {
            $VALUES = $values();
        }
    }
    
    public final class a
    {
        public static final int[] a;
        
        static {
            final int[] a2 = new int[WorkerState.values().length];
            a2[WorkerState.PARKING.ordinal()] = 1;
            a2[WorkerState.BLOCKING.ordinal()] = 2;
            a2[WorkerState.CPU_ACQUIRED.ordinal()] = 3;
            a2[WorkerState.DORMANT.ordinal()] = 4;
            a2[WorkerState.TERMINATED.ordinal()] = 5;
            a = a2;
        }
    }
    
    public final class b extends Thread
    {
        public static final AtomicIntegerFieldUpdater m;
        public final k f;
        public WorkerState g;
        public long h;
        public long i;
        private volatile int indexInArray;
        public int j;
        public boolean k;
        public final CoroutineScheduler l;
        private volatile Object nextParkedWorker;
        public volatile int workerCtl;
        
        static {
            m = AtomicIntegerFieldUpdater.newUpdater(b.class, "workerCtl");
        }
        
        public b() {
            throw null;
        }
        
        public b(final CoroutineScheduler l, final int n) {
            this.l = l;
            this.setDaemon(true);
            this.f = new k();
            this.g = WorkerState.DORMANT;
            this.workerCtl = 0;
            this.nextParkedWorker = CoroutineScheduler.p;
            this.j = Random.Default.nextInt();
            this.f(n);
        }
        
        public final f a(final boolean b) {
            final WorkerState g = this.g;
            final WorkerState cpu_ACQUIRED = WorkerState.CPU_ACQUIRED;
            final int n = 1;
            boolean b3 = false;
            Label_0093: {
                Label_0086: {
                    if (g != cpu_ACQUIRED) {
                        final CoroutineScheduler l = this.l;
                        while (true) {
                            long controlState;
                            do {
                                controlState = l.controlState;
                                if ((int)((0x7FFFFC0000000000L & controlState) >> 42) == 0) {
                                    final boolean b2 = false;
                                    if (b2) {
                                        this.g = WorkerState.CPU_ACQUIRED;
                                        break Label_0086;
                                    }
                                    b3 = false;
                                    break Label_0093;
                                }
                            } while (!CoroutineScheduler.n.compareAndSet(l, controlState, controlState - 4398046511104L));
                            final boolean b2 = true;
                            continue;
                        }
                    }
                }
                b3 = true;
            }
            if (b3) {
                if (b) {
                    int n2;
                    if (this.d(this.l.f * 2) == 0) {
                        n2 = n;
                    }
                    else {
                        n2 = 0;
                    }
                    if (n2 != 0) {
                        final f f = this.e();
                        if (f != null) {
                            return f;
                        }
                    }
                    final k f2 = this.f;
                    f2.getClass();
                    f f = ij2.k.b.getAndSet(f2, null);
                    if (f == null) {
                        f = f2.d();
                    }
                    if (f != null) {
                        return f;
                    }
                    if (n2 == 0) {
                        f = this.e();
                        if (f != null) {
                            return f;
                        }
                    }
                }
                else {
                    final f f = this.e();
                    if (f != null) {
                        return f;
                    }
                }
                return this.i(false);
            }
            f f4;
            if (b) {
                final k f3 = this.f;
                f3.getClass();
                f d;
                if ((d = ij2.k.b.getAndSet(f3, null)) == null) {
                    d = f3.d();
                }
                if ((f4 = d) == null) {
                    f4 = (f)((ej2.j)this.l.k).d();
                }
            }
            else {
                f4 = (f)((ej2.j)this.l.k).d();
            }
            f i;
            if ((i = f4) == null) {
                i = this.i(true);
            }
            return i;
        }
        
        public final int b() {
            return this.indexInArray;
        }
        
        public final Object c() {
            return this.nextParkedWorker;
        }
        
        public final int d(final int n) {
            final int j = this.j;
            final int n2 = j ^ j << 13;
            final int n3 = n2 ^ n2 >> 17;
            final int i = n3 ^ n3 << 5;
            this.j = i;
            final int n4 = n - 1;
            if ((n4 & n) == 0x0) {
                return i & n4;
            }
            return (i & Integer.MAX_VALUE) % n;
        }
        
        public final f e() {
            if (this.d(2) == 0) {
                final f f = (f)((ej2.j)this.l.j).d();
                if (f != null) {
                    return f;
                }
                return (f)((ej2.j)this.l.k).d();
            }
            else {
                final f f2 = (f)((ej2.j)this.l.k).d();
                if (f2 != null) {
                    return f2;
                }
                return (f)((ej2.j)this.l.j).d();
            }
        }
        
        public final void f(final int indexInArray) {
            final StringBuilder sb = new StringBuilder();
            sb.append(this.l.i);
            sb.append("-worker-");
            String value;
            if (indexInArray == 0) {
                value = "TERMINATED";
            }
            else {
                value = String.valueOf(indexInArray);
            }
            sb.append(value);
            this.setName(sb.toString());
            this.indexInArray = indexInArray;
        }
        
        public final void g(final Object nextParkedWorker) {
            this.nextParkedWorker = nextParkedWorker;
        }
        
        public final boolean h(final WorkerState g) {
            final WorkerState g2 = this.g;
            final boolean b = g2 == WorkerState.CPU_ACQUIRED;
            if (b) {
                CoroutineScheduler.n.addAndGet(this.l, 4398046511104L);
            }
            if (g2 != g) {
                this.g = g;
            }
            return b;
        }
        
        public final f i(final boolean b) {
            final int n = (int)(this.l.controlState & 0x1FFFFFL);
            if (n < 2) {
                return null;
            }
            int d = this.d(n);
            final CoroutineScheduler l = this.l;
            int i = 0;
            long j = Long.MAX_VALUE;
            while (i < n) {
                if (++d > n) {
                    d = 1;
                }
                final b b2 = (b)l.l.b(d);
                long min = j;
                if (b2 != null) {
                    min = j;
                    if (b2 != this) {
                        long n2;
                        if (b) {
                            n2 = this.f.e(b2.f);
                        }
                        else {
                            final k f = this.f;
                            final k f2 = b2.f;
                            f.getClass();
                            final f d2 = f2.d();
                            if (d2 != null) {
                                f.a(d2, false);
                                n2 = -1L;
                            }
                            else {
                                n2 = f.f(f2, false);
                            }
                        }
                        if (n2 == -1L) {
                            final k f3 = this.f;
                            f3.getClass();
                            f d3;
                            if ((d3 = ij2.k.b.getAndSet(f3, null)) == null) {
                                d3 = f3.d();
                            }
                            return d3;
                        }
                        min = j;
                        if (n2 > 0L) {
                            min = Math.min(j, n2);
                        }
                    }
                }
                ++i;
                j = min;
            }
            if (j == Long.MAX_VALUE) {
                j = 0L;
            }
            this.i = j;
            return null;
        }
        
        @Override
        public final void run() {
        Label_0643:
            while (true) {
                int n = 0;
                while (!this.l.isTerminated()) {
                    final WorkerState g = this.g;
                    final WorkerState terminated = WorkerState.TERMINATED;
                    if (g == terminated) {
                        break;
                    }
                    final f a = this.a(this.k);
                    if (a != null) {
                        this.i = 0L;
                        final int b = a.g.b();
                        this.h = 0L;
                        if (this.g == WorkerState.PARKING) {
                            this.g = WorkerState.BLOCKING;
                        }
                        if (b != 0) {
                            if (this.h(WorkerState.BLOCKING)) {
                                final CoroutineScheduler l = this.l;
                                if (!l.q()) {
                                    if (!l.k(l.controlState)) {
                                        l.q();
                                    }
                                }
                            }
                        }
                        this.l.getClass();
                        Label_0178: {
                            final Throwable t2;
                            try {
                                ((Runnable)a).run();
                                break Label_0178;
                            }
                            finally {
                                final Thread thread = Thread.currentThread();
                                final Thread thread3;
                                final Thread thread2 = thread3 = thread;
                                final UncaughtExceptionHandler uncaughtExceptionHandler = thread3.getUncaughtExceptionHandler();
                                final Thread thread4 = thread2;
                                final Throwable t = t2;
                                uncaughtExceptionHandler.uncaughtException(thread4, t);
                            }
                            try {
                                final Thread thread = Thread.currentThread();
                                final Thread thread3;
                                final Thread thread2 = thread3 = thread;
                                final UncaughtExceptionHandler uncaughtExceptionHandler = thread3.getUncaughtExceptionHandler();
                                final Thread thread4 = thread2;
                                final Throwable t = t2;
                                uncaughtExceptionHandler.uncaughtException(thread4, t);
                                if (b == 0) {
                                    continue Label_0643;
                                }
                                CoroutineScheduler.n.addAndGet(this.l, -2097152L);
                                if (this.g != terminated) {
                                    this.g = WorkerState.DORMANT;
                                    continue Label_0643;
                                }
                                continue Label_0643;
                            }
                            finally {}
                        }
                    }
                    this.k = false;
                    if (this.i != 0L) {
                        if (n != 0) {
                            this.h(WorkerState.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.i);
                            this.i = 0L;
                            continue Label_0643;
                        }
                        n = 1;
                    }
                    else if (this.nextParkedWorker == CoroutineScheduler.p) {
                        this.l.h(this);
                    }
                    else {
                        this.workerCtl = -1;
                        while (this.nextParkedWorker != CoroutineScheduler.p && this.workerCtl == -1 && !this.l.isTerminated()) {
                            final WorkerState g2 = this.g;
                            final WorkerState terminated2 = WorkerState.TERMINATED;
                            if (g2 == terminated2) {
                                break;
                            }
                            this.h(WorkerState.PARKING);
                            Thread.interrupted();
                            if (this.h == 0L) {
                                this.h = System.nanoTime() + this.l.h;
                            }
                            LockSupport.parkNanos(this.l.h);
                            if (System.nanoTime() - this.h >= 0L) {
                                this.h = 0L;
                                final CoroutineScheduler i = this.l;
                                synchronized (i.l) {
                                    if (i.isTerminated()) {
                                        continue;
                                    }
                                    if ((int)(i.controlState & 0x1FFFFFL) <= i.f) {
                                        continue;
                                    }
                                    if (!b.m.compareAndSet(this, -1, 1)) {
                                        continue;
                                    }
                                    final int indexInArray = this.indexInArray;
                                    this.f(0);
                                    i.j(this, indexInArray, 0);
                                    final int n2 = (int)(CoroutineScheduler.n.getAndDecrement(i) & 0x1FFFFFL);
                                    if (n2 != indexInArray) {
                                        final Object b2 = i.l.b(n2);
                                        e.c(b2);
                                        final b b3 = (b)b2;
                                        i.l.c(indexInArray, b3);
                                        b3.f(indexInArray);
                                        i.j(b3, n2, indexInArray);
                                    }
                                    i.l.c(n2, (b)null);
                                    final j a2 = cg2.j.a;
                                    monitorexit(i.l);
                                    this.g = terminated2;
                                    continue;
                                }
                                break Label_0643;
                            }
                        }
                    }
                }
                break;
            }
            this.h(WorkerState.TERMINATED);
        }
    }
}
