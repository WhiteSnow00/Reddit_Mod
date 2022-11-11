// 
// Decompiled by Procyon v0.6.0
// 

package androidx.concurrent.futures;

import androidx.appcompat.widget.s0;
import a40.f;
import java.util.concurrent.TimeoutException;
import ak0.m;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Logger;
import yg.c;

public abstract class AbstractResolvableFuture<V> implements yg.c<V>
{
    public static final boolean i;
    public static final Logger j;
    public static final a k;
    public static final Object l;
    public volatile Object f;
    public volatile c g;
    public volatile g h;
    
    static {
        i = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        j = Logger.getLogger(AbstractResolvableFuture.class.getName());
        f m;
        try {
            final d d = new d(AtomicReferenceFieldUpdater.newUpdater(g.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(g.class, g.class, "b"), (AtomicReferenceFieldUpdater<AbstractResolvableFuture, g>)AtomicReferenceFieldUpdater.newUpdater(AbstractResolvableFuture.class, g.class, "h"), (AtomicReferenceFieldUpdater<AbstractResolvableFuture, c>)AtomicReferenceFieldUpdater.newUpdater(AbstractResolvableFuture.class, c.class, "g"), (AtomicReferenceFieldUpdater<AbstractResolvableFuture, Object>)AtomicReferenceFieldUpdater.newUpdater(AbstractResolvableFuture.class, Object.class, "f"));
        }
        finally {
            m = new f();
        }
        k = (a)m;
        final Throwable t;
        if (t != null) {
            AbstractResolvableFuture.j.log(Level.SEVERE, "SafeAtomicHelper is broken!", t);
        }
        l = new Object();
    }
    
    public static void c(final AbstractResolvableFuture<?> abstractResolvableFuture) {
        g g;
        do {
            g = abstractResolvableFuture.h;
        } while (!AbstractResolvableFuture.k.c(abstractResolvableFuture, g, AbstractResolvableFuture.g.c));
        while (g != null) {
            final Thread a = g.a;
            if (a != null) {
                g.a = null;
                LockSupport.unpark(a);
            }
            g = g.b;
        }
        c g2;
        do {
            g2 = abstractResolvableFuture.g;
        } while (!AbstractResolvableFuture.k.a(abstractResolvableFuture, g2, c.d));
        c c = null;
        c c2 = g2;
        c c3;
        while (true) {
            c3 = c;
            if (c2 == null) {
                break;
            }
            final c c4 = c2.c;
            c2.c = c;
            c = c2;
            c2 = c4;
        }
        while (c3 != null) {
            final c c5 = c3.c;
            final Runnable a2 = c3.a;
            if (a2 instanceof e) {
                ((e<?>)a2).getClass();
                throw null;
            }
            d(a2, c3.b);
            c3 = c5;
        }
    }
    
    public static void d(final Runnable runnable, final Executor executor) {
        try {
            executor.execute(runnable);
        }
        catch (final RuntimeException ex) {
            final Logger j = AbstractResolvableFuture.j;
            final Level severe = Level.SEVERE;
            final StringBuilder sb = new StringBuilder();
            sb.append("RuntimeException while executing runnable ");
            sb.append(runnable);
            sb.append(" with executor ");
            sb.append(executor);
            j.log(severe, sb.toString(), ex);
        }
    }
    
    public final void a(final Runnable runnable, final Executor executor) {
        runnable.getClass();
        executor.getClass();
        c c = this.g;
        if (c != AbstractResolvableFuture.c.d) {
            final c c2 = new c(runnable, executor);
            do {
                c2.c = c;
                if (AbstractResolvableFuture.k.a(this, c, c2)) {
                    return;
                }
            } while ((c = this.g) != AbstractResolvableFuture.c.d);
        }
        d(runnable, executor);
    }
    
    public final void b(final StringBuilder sb) {
        int n = 0;
        while (true) {
            try {
                final AbstractResolvableFuture<AbstractResolvableFuture<AbstractResolvableFuture<AbstractResolvableFuture>>> value = (AbstractResolvableFuture<AbstractResolvableFuture<AbstractResolvableFuture<AbstractResolvableFuture>>>)this.get();
                Label_0017: {
                    if (n == 0) {
                        break Label_0017;
                    }
                    try {
                        Thread.currentThread().interrupt();
                        sb.append("SUCCESS, result=[");
                        String value2;
                        if (value == this) {
                            value2 = "this future";
                        }
                        else {
                            value2 = String.valueOf(value);
                        }
                        sb.append(value2);
                        sb.append("]");
                    }
                    catch (final RuntimeException ex) {}
                    catch (final ExecutionException ex2) {}
                    catch (final CancellationException ex3) {
                        sb.append("CANCELLED");
                    }
                }
            }
            catch (final InterruptedException ex4) {
                n = 1;
                continue;
            }
            break;
        }
    }
    
    public final boolean cancel(final boolean b) {
        Object o = this.f;
        final boolean b2 = true;
        if (o == null | o instanceof e) {
            b b3;
            if (AbstractResolvableFuture.i) {
                b3 = new b(b, new CancellationException("Future.cancel() was called."));
            }
            else if (b) {
                b3 = AbstractResolvableFuture.b.b;
            }
            else {
                b3 = AbstractResolvableFuture.b.c;
            }
            while (!AbstractResolvableFuture.k.b(this, o, b3)) {
                if (!((o = this.f) instanceof e)) {
                    return false;
                }
            }
            c(this);
            if (!(o instanceof e)) {
                return b2;
            }
            ((e<?>)o).getClass();
            throw null;
        }
        return false;
    }
    
    public final V e(final Object o) throws ExecutionException {
        if (o instanceof b) {
            final Throwable a = ((b)o).a;
            final CancellationException ex = new CancellationException("Task was cancelled.");
            ex.initCause(a);
            throw ex;
        }
        if (!(o instanceof Failure)) {
            Object o2;
            if ((o2 = o) == AbstractResolvableFuture.l) {
                o2 = null;
            }
            return (V)o2;
        }
        throw new ExecutionException(((Failure)o).a);
    }
    
    public String f() {
        final Object f = this.f;
        if (f instanceof e) {
            final StringBuilder k = a.k("setFuture=[");
            ((e<?>)f).getClass();
            k.append("null");
            k.append("]");
            return k.toString();
        }
        if (this instanceof ScheduledFuture) {
            final StringBuilder i = a.k("remaining delay=[");
            i.append(((ScheduledFuture)this).getDelay(TimeUnit.MILLISECONDS));
            i.append(" ms]");
            return i.toString();
        }
        return null;
    }
    
    public final void g(g h) {
        h.a = null;
    Label_0005:
        while (true) {
            h = this.h;
            if (h == AbstractResolvableFuture.g.c) {
                return;
            }
            g g = null;
            while (h != null) {
                final g b = h.b;
                g g2;
                if (h.a != null) {
                    g2 = h;
                }
                else if (g != null) {
                    g.b = b;
                    g2 = g;
                    if (g.a == null) {
                        continue Label_0005;
                    }
                }
                else {
                    g2 = g;
                    if (!AbstractResolvableFuture.k.c(this, h, b)) {
                        continue Label_0005;
                    }
                }
                h = b;
                g = g2;
            }
        }
    }
    
    public final V get() throws InterruptedException, ExecutionException {
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        final Object f = this.f;
        if (f != null & (f instanceof e ^ true)) {
            return this.e(f);
        }
        g g = this.h;
        if (g != AbstractResolvableFuture.g.c) {
            final g g2 = new g();
            do {
                final a k = AbstractResolvableFuture.k;
                k.d(g2, g);
                if (k.c(this, g, g2)) {
                    Object f2;
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            this.g(g2);
                            throw new InterruptedException();
                        }
                        f2 = this.f;
                    } while (!(f2 != null & (f2 instanceof e ^ true)));
                    return this.e(f2);
                }
            } while ((g = this.h) != AbstractResolvableFuture.g.c);
        }
        return this.e(this.f);
    }
    
    public final V get(long convert, final TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        long nanos = timeUnit.toNanos(convert);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        final Object f = this.f;
        final int n = 1;
        if (f != null & (f instanceof e ^ true)) {
            return this.e(f);
        }
        long n2;
        if (nanos > 0L) {
            n2 = System.nanoTime() + nanos;
        }
        else {
            n2 = 0L;
        }
        long n3 = nanos;
        Label_0263: {
            if (nanos >= 1000L) {
                g g = this.h;
                if (g != AbstractResolvableFuture.g.c) {
                    final g g2 = new g();
                    do {
                        final a k = AbstractResolvableFuture.k;
                        k.d(g2, g);
                        if (k.c(this, g, g2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (Thread.interrupted()) {
                                    this.g(g2);
                                    throw new InterruptedException();
                                }
                                final Object f2 = this.f;
                                if (f2 != null & (f2 instanceof e ^ true)) {
                                    return this.e(f2);
                                }
                                n3 = (nanos = n2 - System.nanoTime());
                            } while (n3 >= 1000L);
                            this.g(g2);
                            break Label_0263;
                        }
                    } while ((g = this.h) != AbstractResolvableFuture.g.c);
                }
                return this.e(this.f);
            }
        }
        while (n3 > 0L) {
            final Object f3 = this.f;
            if (f3 != null & (f3 instanceof e ^ true)) {
                return this.e(f3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            n3 = n2 - System.nanoTime();
        }
        final String string = this.toString();
        final String string2 = timeUnit.toString();
        final Locale root = Locale.ROOT;
        final String lowerCase = string2.toLowerCase(root);
        final StringBuilder sb = new StringBuilder();
        sb.append("Waited ");
        sb.append(convert);
        sb.append(" ");
        sb.append(timeUnit.toString().toLowerCase(root));
        String s2;
        final String s = s2 = sb.toString();
        if (n3 + 1000L < 0L) {
            final String l = m.l(s, " (plus ");
            final long n4 = -n3;
            convert = timeUnit.convert(n4, TimeUnit.NANOSECONDS);
            final long n5 = n4 - timeUnit.toNanos(convert);
            final long n6 = lcmp(convert, 0L);
            int n7 = n;
            if (n6 != 0) {
                if (n5 > 1000L) {
                    n7 = n;
                }
                else {
                    n7 = 0;
                }
            }
            String i = l;
            if (n6 > 0) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(l);
                sb2.append(convert);
                sb2.append(" ");
                sb2.append(lowerCase);
                String s3 = sb2.toString();
                if (n7 != 0) {
                    s3 = m.l(s3, ",");
                }
                i = m.l(s3, " ");
            }
            String o = i;
            if (n7 != 0) {
                o = ag0.a.o(i, n5, " nanoseconds ");
            }
            s2 = m.l(o, "delay)");
        }
        if (this.isDone()) {
            throw new TimeoutException(m.l(s2, " but future completed as timeout expired"));
        }
        throw new TimeoutException(a40.f.n(s2, " for ", string));
    }
    
    public final boolean isCancelled() {
        return this.f instanceof b;
    }
    
    public final boolean isDone() {
        final Object f = this.f;
        return (f instanceof e ^ true) & f != null;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f instanceof b) {
            sb.append("CANCELLED");
        }
        else if (this.isDone()) {
            this.b(sb);
        }
        else {
            String s;
            try {
                s = this.f();
            }
            catch (final RuntimeException ex) {
                final StringBuilder k = a.k("Exception thrown from implementation: ");
                k.append(ex.getClass());
                s = k.toString();
            }
            if (s != null && !s.isEmpty()) {
                s0.v(sb, "PENDING, info=[", s, "]");
            }
            else if (this.isDone()) {
                this.b(sb);
            }
            else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }
    
    public static final class Failure
    {
        public final Throwable a;
        
        static {
            new Failure(new Throwable("Failure occurred while trying to finish a future.") {
                @Override
                public Throwable fillInStackTrace() {
                    monitorenter(this);
                    monitorexit(this);
                    return this;
                }
            });
        }
        
        public Failure(final Throwable a) {
            final boolean i = AbstractResolvableFuture.i;
            a.getClass();
            this.a = a;
        }
    }
    
    public abstract static class a
    {
        public abstract boolean a(final AbstractResolvableFuture<?> p0, final c p1, final c p2);
        
        public abstract boolean b(final AbstractResolvableFuture<?> p0, final Object p1, final Object p2);
        
        public abstract boolean c(final AbstractResolvableFuture<?> p0, final g p1, final g p2);
        
        public abstract void d(final g p0, final g p1);
        
        public abstract void e(final g p0, final Thread p1);
    }
    
    public static final class b
    {
        public static final b b;
        public static final b c;
        public final Throwable a;
        
        static {
            if (AbstractResolvableFuture.i) {
                c = null;
                b = null;
            }
            else {
                c = new b(false, null);
                b = new b(true, null);
            }
        }
        
        public b(final boolean b, final Throwable a) {
            this.a = a;
        }
    }
    
    public static final class c
    {
        public static final c d;
        public final Runnable a;
        public final Executor b;
        public c c;
        
        static {
            d = new c(null, null);
        }
        
        public c(final Runnable a, final Executor b) {
            this.a = a;
            this.b = b;
        }
    }
    
    public static final class d extends a
    {
        public final AtomicReferenceFieldUpdater<g, Thread> a;
        public final AtomicReferenceFieldUpdater<g, g> b;
        public final AtomicReferenceFieldUpdater<AbstractResolvableFuture, g> c;
        public final AtomicReferenceFieldUpdater<AbstractResolvableFuture, c> d;
        public final AtomicReferenceFieldUpdater<AbstractResolvableFuture, Object> e;
        
        public d(final AtomicReferenceFieldUpdater<g, Thread> a, final AtomicReferenceFieldUpdater<g, g> b, final AtomicReferenceFieldUpdater<AbstractResolvableFuture, g> c, final AtomicReferenceFieldUpdater<AbstractResolvableFuture, c> d, final AtomicReferenceFieldUpdater<AbstractResolvableFuture, Object> e) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
        }
        
        @Override
        public final boolean a(final AbstractResolvableFuture<?> abstractResolvableFuture, final c c, final c c2) {
            final AtomicReferenceFieldUpdater<AbstractResolvableFuture, c> d = this.d;
            while (!d.compareAndSet(abstractResolvableFuture, c, c2)) {
                if (d.get(abstractResolvableFuture) != c) {
                    return false;
                }
            }
            return true;
        }
        
        @Override
        public final boolean b(final AbstractResolvableFuture<?> abstractResolvableFuture, final Object o, final Object o2) {
            final AtomicReferenceFieldUpdater<AbstractResolvableFuture, Object> e = this.e;
            while (!e.compareAndSet(abstractResolvableFuture, o, o2)) {
                if (e.get(abstractResolvableFuture) != o) {
                    return false;
                }
            }
            return true;
        }
        
        @Override
        public final boolean c(final AbstractResolvableFuture<?> abstractResolvableFuture, final g g, final g g2) {
            final AtomicReferenceFieldUpdater<AbstractResolvableFuture, g> c = this.c;
            while (!c.compareAndSet(abstractResolvableFuture, g, g2)) {
                if (c.get(abstractResolvableFuture) != g) {
                    return false;
                }
            }
            return true;
        }
        
        @Override
        public final void d(final g g, final g g2) {
            this.b.lazySet(g, g2);
        }
        
        @Override
        public final void e(final g g, final Thread thread) {
            this.a.lazySet(g, thread);
        }
    }
    
    public static final class e<V> implements Runnable
    {
        @Override
        public final void run() {
            throw null;
        }
    }
    
    public static final class f extends a
    {
        @Override
        public final boolean a(final AbstractResolvableFuture<?> abstractResolvableFuture, final c c, final c g) {
            synchronized (abstractResolvableFuture) {
                if (abstractResolvableFuture.g == c) {
                    abstractResolvableFuture.g = g;
                    return true;
                }
                return false;
            }
        }
        
        @Override
        public final boolean b(final AbstractResolvableFuture<?> abstractResolvableFuture, final Object o, final Object f) {
            synchronized (abstractResolvableFuture) {
                if (abstractResolvableFuture.f == o) {
                    abstractResolvableFuture.f = f;
                    return true;
                }
                return false;
            }
        }
        
        @Override
        public final boolean c(final AbstractResolvableFuture<?> abstractResolvableFuture, final g g, final g h) {
            synchronized (abstractResolvableFuture) {
                if (abstractResolvableFuture.h == g) {
                    abstractResolvableFuture.h = h;
                    return true;
                }
                return false;
            }
        }
        
        @Override
        public final void d(final g g, final g b) {
            g.b = b;
        }
        
        @Override
        public final void e(final g g, final Thread a) {
            g.a = a;
        }
    }
    
    public static final class g
    {
        public static final g c;
        public volatile Thread a;
        public volatile g b;
        
        static {
            c = new g(0);
        }
        
        public g() {
            AbstractResolvableFuture.k.e(this, Thread.currentThread());
        }
        
        public g(final int n) {
        }
    }
}
