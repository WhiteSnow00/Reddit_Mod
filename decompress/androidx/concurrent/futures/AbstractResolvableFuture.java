// 
// Decompiled by Procyon v0.6.0
// 

package androidx.concurrent.futures;

import java.util.concurrent.TimeoutException;
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
import xg.c;

public abstract class AbstractResolvableFuture<V> implements c<V>
{
    public static final boolean i;
    public static final Logger j;
    public static final AbstractResolvableFuture$a k;
    public static final Object l;
    public volatile Object f;
    public volatile AbstractResolvableFuture$c g;
    public volatile AbstractResolvableFuture$g h;
    
    static {
        i = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        j = Logger.getLogger(AbstractResolvableFuture.class.getName());
        f m;
        try {
            final d d = new d(AtomicReferenceFieldUpdater.newUpdater(AbstractResolvableFuture$g.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(AbstractResolvableFuture$g.class, AbstractResolvableFuture$g.class, "b"), (AtomicReferenceFieldUpdater<AbstractResolvableFuture, AbstractResolvableFuture$g>)AtomicReferenceFieldUpdater.newUpdater(AbstractResolvableFuture.class, AbstractResolvableFuture$g.class, "h"), (AtomicReferenceFieldUpdater<AbstractResolvableFuture, AbstractResolvableFuture$c>)AtomicReferenceFieldUpdater.newUpdater(AbstractResolvableFuture.class, AbstractResolvableFuture$c.class, "g"), (AtomicReferenceFieldUpdater<AbstractResolvableFuture, Object>)AtomicReferenceFieldUpdater.newUpdater(AbstractResolvableFuture.class, Object.class, "f"));
        }
        finally {
            m = new f();
        }
        k = (AbstractResolvableFuture$a)m;
        final Throwable t;
        if (t != null) {
            AbstractResolvableFuture.j.log(Level.SEVERE, "SafeAtomicHelper is broken!", t);
        }
        l = new Object();
    }
    
    public static void c(final AbstractResolvableFuture<?> abstractResolvableFuture) {
        AbstractResolvableFuture$g abstractResolvableFuture$g;
        do {
            abstractResolvableFuture$g = abstractResolvableFuture.h;
        } while (!AbstractResolvableFuture.k.c((AbstractResolvableFuture)abstractResolvableFuture, abstractResolvableFuture$g, AbstractResolvableFuture$g.c));
        while (abstractResolvableFuture$g != null) {
            final Thread a = abstractResolvableFuture$g.a;
            if (a != null) {
                abstractResolvableFuture$g.a = null;
                LockSupport.unpark(a);
            }
            abstractResolvableFuture$g = abstractResolvableFuture$g.b;
        }
        AbstractResolvableFuture$c g;
        do {
            g = abstractResolvableFuture.g;
        } while (!AbstractResolvableFuture.k.a((AbstractResolvableFuture)abstractResolvableFuture, g, AbstractResolvableFuture$c.d));
        AbstractResolvableFuture$c c = null;
        AbstractResolvableFuture$c abstractResolvableFuture$c;
        while (true) {
            abstractResolvableFuture$c = c;
            if (g == null) {
                break;
            }
            final AbstractResolvableFuture$c c2 = g.c;
            g.c = c;
            c = g;
            g = c2;
        }
        while (abstractResolvableFuture$c != null) {
            final AbstractResolvableFuture$c c3 = abstractResolvableFuture$c.c;
            final Runnable a2 = abstractResolvableFuture$c.a;
            if (a2 instanceof AbstractResolvableFuture.AbstractResolvableFuture$e) {
                ((AbstractResolvableFuture.AbstractResolvableFuture$e)a2).getClass();
                throw null;
            }
            d(a2, abstractResolvableFuture$c.b);
            abstractResolvableFuture$c = c3;
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
        AbstractResolvableFuture$c c = this.g;
        if (c != AbstractResolvableFuture$c.d) {
            final AbstractResolvableFuture$c abstractResolvableFuture$c = new AbstractResolvableFuture$c(runnable, executor);
            do {
                abstractResolvableFuture$c.c = c;
                if (AbstractResolvableFuture.k.a(this, c, abstractResolvableFuture$c)) {
                    return;
                }
            } while ((c = this.g) != AbstractResolvableFuture$c.d);
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
        if (o == null | o instanceof AbstractResolvableFuture.AbstractResolvableFuture$e) {
            AbstractResolvableFuture.AbstractResolvableFuture$b abstractResolvableFuture$b;
            if (AbstractResolvableFuture.i) {
                abstractResolvableFuture$b = new AbstractResolvableFuture.AbstractResolvableFuture$b(b, (Throwable)new CancellationException("Future.cancel() was called."));
            }
            else if (b) {
                abstractResolvableFuture$b = AbstractResolvableFuture.AbstractResolvableFuture$b.b;
            }
            else {
                abstractResolvableFuture$b = AbstractResolvableFuture.AbstractResolvableFuture$b.c;
            }
            while (!AbstractResolvableFuture.k.b(this, o, (Object)abstractResolvableFuture$b)) {
                if (!((o = this.f) instanceof AbstractResolvableFuture.AbstractResolvableFuture$e)) {
                    return false;
                }
            }
            c(this);
            if (!(o instanceof AbstractResolvableFuture.AbstractResolvableFuture$e)) {
                return b2;
            }
            ((AbstractResolvableFuture.AbstractResolvableFuture$e)o).getClass();
            throw null;
        }
        return false;
    }
    
    public final V e(final Object o) throws ExecutionException {
        if (o instanceof AbstractResolvableFuture.AbstractResolvableFuture$b) {
            final Throwable a = ((AbstractResolvableFuture.AbstractResolvableFuture$b)o).a;
            final CancellationException ex = new CancellationException("Task was cancelled.");
            ex.initCause(a);
            throw ex;
        }
        if (!(o instanceof AbstractResolvableFuture.AbstractResolvableFuture$Failure)) {
            Object o2;
            if ((o2 = o) == AbstractResolvableFuture.l) {
                o2 = null;
            }
            return (V)o2;
        }
        throw new ExecutionException(((AbstractResolvableFuture.AbstractResolvableFuture$Failure)o).a);
    }
    
    public String f() {
        final Object f = this.f;
        if (f instanceof AbstractResolvableFuture.AbstractResolvableFuture$e) {
            final StringBuilder t = a.t("setFuture=[");
            ((AbstractResolvableFuture.AbstractResolvableFuture$e)f).getClass();
            t.append("null");
            t.append("]");
            return t.toString();
        }
        if (this instanceof ScheduledFuture) {
            final StringBuilder t2 = a.t("remaining delay=[");
            t2.append(((ScheduledFuture)this).getDelay(TimeUnit.MILLISECONDS));
            t2.append(" ms]");
            return t2.toString();
        }
        return null;
    }
    
    public final void g(AbstractResolvableFuture$g h) {
        h.a = null;
    Label_0005:
        while (true) {
            h = this.h;
            if (h == AbstractResolvableFuture$g.c) {
                return;
            }
            AbstractResolvableFuture$g abstractResolvableFuture$g = null;
            while (h != null) {
                final AbstractResolvableFuture$g b = h.b;
                AbstractResolvableFuture$g abstractResolvableFuture$g2;
                if (h.a != null) {
                    abstractResolvableFuture$g2 = h;
                }
                else if (abstractResolvableFuture$g != null) {
                    abstractResolvableFuture$g.b = b;
                    abstractResolvableFuture$g2 = abstractResolvableFuture$g;
                    if (abstractResolvableFuture$g.a == null) {
                        continue Label_0005;
                    }
                }
                else {
                    abstractResolvableFuture$g2 = abstractResolvableFuture$g;
                    if (!AbstractResolvableFuture.k.c(this, h, b)) {
                        continue Label_0005;
                    }
                }
                h = b;
                abstractResolvableFuture$g = abstractResolvableFuture$g2;
            }
        }
    }
    
    public final V get() throws InterruptedException, ExecutionException {
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        final Object f = this.f;
        if (f != null & (f instanceof AbstractResolvableFuture.AbstractResolvableFuture$e ^ true)) {
            return this.e(f);
        }
        AbstractResolvableFuture$g abstractResolvableFuture$g = this.h;
        if (abstractResolvableFuture$g != AbstractResolvableFuture$g.c) {
            final AbstractResolvableFuture$g abstractResolvableFuture$g2 = new AbstractResolvableFuture$g();
            do {
                final AbstractResolvableFuture$a k = AbstractResolvableFuture.k;
                k.d(abstractResolvableFuture$g2, abstractResolvableFuture$g);
                if (k.c(this, abstractResolvableFuture$g, abstractResolvableFuture$g2)) {
                    Object f2;
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            this.g(abstractResolvableFuture$g2);
                            throw new InterruptedException();
                        }
                        f2 = this.f;
                    } while (!(f2 != null & (f2 instanceof AbstractResolvableFuture.AbstractResolvableFuture$e ^ true)));
                    return this.e(f2);
                }
            } while ((abstractResolvableFuture$g = this.h) != AbstractResolvableFuture$g.c);
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
        if (f != null & (f instanceof AbstractResolvableFuture.AbstractResolvableFuture$e ^ true)) {
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
                AbstractResolvableFuture$g abstractResolvableFuture$g = this.h;
                if (abstractResolvableFuture$g != AbstractResolvableFuture$g.c) {
                    final AbstractResolvableFuture$g abstractResolvableFuture$g2 = new AbstractResolvableFuture$g();
                    do {
                        final AbstractResolvableFuture$a k = AbstractResolvableFuture.k;
                        k.d(abstractResolvableFuture$g2, abstractResolvableFuture$g);
                        if (k.c(this, abstractResolvableFuture$g, abstractResolvableFuture$g2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (Thread.interrupted()) {
                                    this.g(abstractResolvableFuture$g2);
                                    throw new InterruptedException();
                                }
                                final Object f2 = this.f;
                                if (f2 != null & (f2 instanceof AbstractResolvableFuture.AbstractResolvableFuture$e ^ true)) {
                                    return this.e(f2);
                                }
                                n3 = (nanos = n2 - System.nanoTime());
                            } while (n3 >= 1000L);
                            this.g(abstractResolvableFuture$g2);
                            break Label_0263;
                        }
                    } while ((abstractResolvableFuture$g = this.h) != AbstractResolvableFuture$g.c);
                }
                return this.e(this.f);
            }
        }
        while (n3 > 0L) {
            final Object f3 = this.f;
            if (f3 != null & (f3 instanceof AbstractResolvableFuture.AbstractResolvableFuture$e ^ true)) {
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
            final String l = b.l(s, " (plus ");
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
                    s3 = b.l(s3, ",");
                }
                i = b.l(s3, " ");
            }
            String f4 = i;
            if (n7 != 0) {
                f4 = m5.a.f(i, n5, " nanoseconds ");
            }
            s2 = b.l(f4, "delay)");
        }
        if (this.isDone()) {
            throw new TimeoutException(b.l(s2, " but future completed as timeout expired"));
        }
        throw new TimeoutException(a.n(s2, " for ", string));
    }
    
    public final boolean isCancelled() {
        return this.f instanceof AbstractResolvableFuture.AbstractResolvableFuture$b;
    }
    
    public final boolean isDone() {
        final Object f = this.f;
        return (f instanceof AbstractResolvableFuture.AbstractResolvableFuture$e ^ true) & f != null;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f instanceof AbstractResolvableFuture.AbstractResolvableFuture$b) {
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
                final StringBuilder t = a.t("Exception thrown from implementation: ");
                t.append(ex.getClass());
                s = t.toString();
            }
            if (s != null && !s.isEmpty()) {
                m5.a.r(sb, "PENDING, info=[", s, "]");
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
    
    public static final class d extends AbstractResolvableFuture$a
    {
        public final AtomicReferenceFieldUpdater<AbstractResolvableFuture$g, Thread> a;
        public final AtomicReferenceFieldUpdater<AbstractResolvableFuture$g, AbstractResolvableFuture$g> b;
        public final AtomicReferenceFieldUpdater<AbstractResolvableFuture, AbstractResolvableFuture$g> c;
        public final AtomicReferenceFieldUpdater<AbstractResolvableFuture, AbstractResolvableFuture$c> d;
        public final AtomicReferenceFieldUpdater<AbstractResolvableFuture, Object> e;
        
        public d(final AtomicReferenceFieldUpdater<AbstractResolvableFuture$g, Thread> a, final AtomicReferenceFieldUpdater<AbstractResolvableFuture$g, AbstractResolvableFuture$g> b, final AtomicReferenceFieldUpdater<AbstractResolvableFuture, AbstractResolvableFuture$g> c, final AtomicReferenceFieldUpdater<AbstractResolvableFuture, AbstractResolvableFuture$c> d, final AtomicReferenceFieldUpdater<AbstractResolvableFuture, Object> e) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
        }
        
        public final boolean a(final AbstractResolvableFuture<?> abstractResolvableFuture, final AbstractResolvableFuture$c abstractResolvableFuture$c, final AbstractResolvableFuture$c abstractResolvableFuture$c2) {
            final AtomicReferenceFieldUpdater<AbstractResolvableFuture, AbstractResolvableFuture$c> d = this.d;
            while (!d.compareAndSet(abstractResolvableFuture, abstractResolvableFuture$c, abstractResolvableFuture$c2)) {
                if (d.get(abstractResolvableFuture) != abstractResolvableFuture$c) {
                    return false;
                }
            }
            return true;
        }
        
        public final boolean b(final AbstractResolvableFuture<?> abstractResolvableFuture, final Object o, final Object o2) {
            final AtomicReferenceFieldUpdater<AbstractResolvableFuture, Object> e = this.e;
            while (!e.compareAndSet(abstractResolvableFuture, o, o2)) {
                if (e.get(abstractResolvableFuture) != o) {
                    return false;
                }
            }
            return true;
        }
        
        public final boolean c(final AbstractResolvableFuture<?> abstractResolvableFuture, final AbstractResolvableFuture$g abstractResolvableFuture$g, final AbstractResolvableFuture$g abstractResolvableFuture$g2) {
            final AtomicReferenceFieldUpdater<AbstractResolvableFuture, AbstractResolvableFuture$g> c = this.c;
            while (!c.compareAndSet(abstractResolvableFuture, abstractResolvableFuture$g, abstractResolvableFuture$g2)) {
                if (c.get(abstractResolvableFuture) != abstractResolvableFuture$g) {
                    return false;
                }
            }
            return true;
        }
        
        public final void d(final AbstractResolvableFuture$g abstractResolvableFuture$g, final AbstractResolvableFuture$g abstractResolvableFuture$g2) {
            this.b.lazySet(abstractResolvableFuture$g, abstractResolvableFuture$g2);
        }
        
        public final void e(final AbstractResolvableFuture$g abstractResolvableFuture$g, final Thread thread) {
            this.a.lazySet(abstractResolvableFuture$g, thread);
        }
    }
    
    public static final class f extends AbstractResolvableFuture$a
    {
        public final boolean a(final AbstractResolvableFuture<?> abstractResolvableFuture, final AbstractResolvableFuture$c abstractResolvableFuture$c, final AbstractResolvableFuture$c g) {
            synchronized (abstractResolvableFuture) {
                if (abstractResolvableFuture.g == abstractResolvableFuture$c) {
                    abstractResolvableFuture.g = g;
                    return true;
                }
                return false;
            }
        }
        
        public final boolean b(final AbstractResolvableFuture<?> abstractResolvableFuture, final Object o, final Object f) {
            synchronized (abstractResolvableFuture) {
                if (abstractResolvableFuture.f == o) {
                    abstractResolvableFuture.f = f;
                    return true;
                }
                return false;
            }
        }
        
        public final boolean c(final AbstractResolvableFuture<?> abstractResolvableFuture, final AbstractResolvableFuture$g abstractResolvableFuture$g, final AbstractResolvableFuture$g h) {
            synchronized (abstractResolvableFuture) {
                if (abstractResolvableFuture.h == abstractResolvableFuture$g) {
                    abstractResolvableFuture.h = h;
                    return true;
                }
                return false;
            }
        }
        
        public final void d(final AbstractResolvableFuture$g abstractResolvableFuture$g, final AbstractResolvableFuture$g b) {
            abstractResolvableFuture$g.b = b;
        }
        
        public final void e(final AbstractResolvableFuture$g abstractResolvableFuture$g, final Thread a) {
            abstractResolvableFuture$g.a = a;
        }
    }
}
