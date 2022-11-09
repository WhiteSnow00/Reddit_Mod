// 
// Decompiled by Procyon v0.6.0
// 

package androidx.work.impl.utils.futures;

import java.util.concurrent.Future;
import androidx.appcompat.widget.s0;
import a40.f;
import java.util.concurrent.TimeoutException;
import ak0.m;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ScheduledFuture;
import a2.b;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Logger;
import yg.c;

public abstract class AbstractFuture<V> implements c<V>
{
    public static final boolean i;
    public static final Logger j;
    public static final AbstractFuture$a k;
    public static final Object l;
    public volatile Object f;
    public volatile AbstractFuture$c g;
    public volatile AbstractFuture$g h;
    
    static {
        i = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        j = Logger.getLogger(AbstractFuture.class.getName());
        f m;
        try {
            final d d = new d(AtomicReferenceFieldUpdater.newUpdater(AbstractFuture$g.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture$g.class, AbstractFuture$g.class, "b"), (AtomicReferenceFieldUpdater<AbstractFuture, AbstractFuture$g>)AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, AbstractFuture$g.class, "h"), (AtomicReferenceFieldUpdater<AbstractFuture, AbstractFuture$c>)AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, AbstractFuture$c.class, "g"), (AtomicReferenceFieldUpdater<AbstractFuture, Object>)AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, Object.class, "f"));
        }
        finally {
            m = new f();
        }
        k = (AbstractFuture$a)m;
        final Throwable t;
        if (t != null) {
            AbstractFuture.j.log(Level.SEVERE, "SafeAtomicHelper is broken!", t);
        }
        l = new Object();
    }
    
    public static void c(final AbstractFuture<?> abstractFuture) {
        final AbstractFuture$c abstractFuture$c = null;
        AbstractFuture<?> f = abstractFuture;
        AbstractFuture$c c = abstractFuture$c;
    Label_0006:
        while (true) {
            AbstractFuture$g abstractFuture$g = f.h;
            if (AbstractFuture.k.c((AbstractFuture)f, abstractFuture$g, AbstractFuture$g.c)) {
                while (abstractFuture$g != null) {
                    final Thread a = abstractFuture$g.a;
                    if (a != null) {
                        abstractFuture$g.a = null;
                        LockSupport.unpark(a);
                    }
                    abstractFuture$g = abstractFuture$g.b;
                }
                AbstractFuture$c g;
                do {
                    g = f.g;
                } while (!AbstractFuture.k.a((AbstractFuture)f, g, AbstractFuture$c.d));
                AbstractFuture$c c2 = g;
                AbstractFuture$c abstractFuture$c3;
                while (true) {
                    final AbstractFuture$c abstractFuture$c2 = c2;
                    abstractFuture$c3 = c;
                    if (abstractFuture$c2 == null) {
                        break;
                    }
                    c2 = abstractFuture$c2.c;
                    abstractFuture$c2.c = c;
                    c = abstractFuture$c2;
                }
                while (abstractFuture$c3 != null) {
                    c = abstractFuture$c3.c;
                    final Runnable a2 = abstractFuture$c3.a;
                    if (a2 instanceof AbstractFuture.AbstractFuture$e) {
                        final AbstractFuture.AbstractFuture$e abstractFuture$e = (AbstractFuture.AbstractFuture$e)a2;
                        f = abstractFuture$e.f;
                        if (f.f == abstractFuture$e && AbstractFuture.k.b((AbstractFuture)f, (Object)abstractFuture$e, f((c<?>)abstractFuture$e.g))) {
                            continue Label_0006;
                        }
                    }
                    else {
                        d(a2, abstractFuture$c3.b);
                    }
                    abstractFuture$c3 = c;
                }
                break;
            }
        }
    }
    
    public static void d(final Runnable runnable, final Executor executor) {
        try {
            executor.execute(runnable);
        }
        catch (final RuntimeException ex) {
            final Logger j = AbstractFuture.j;
            final Level severe = Level.SEVERE;
            final StringBuilder sb = new StringBuilder();
            sb.append("RuntimeException while executing runnable ");
            sb.append(runnable);
            sb.append(" with executor ");
            sb.append(executor);
            j.log(severe, sb.toString(), ex);
        }
    }
    
    public static Object f(final c<?> ex) {
        if (ex instanceof AbstractFuture) {
            Object o2;
            final Object o = o2 = ((AbstractFuture)ex).f;
            if (o instanceof AbstractFuture.AbstractFuture$b) {
                final AbstractFuture.AbstractFuture$b abstractFuture$b = (AbstractFuture.AbstractFuture$b)o;
                o2 = o;
                if (abstractFuture$b.a) {
                    if (abstractFuture$b.b != null) {
                        o2 = new AbstractFuture.AbstractFuture$b(false, abstractFuture$b.b);
                    }
                    else {
                        o2 = AbstractFuture.AbstractFuture$b.d;
                    }
                }
            }
            return o2;
        }
        if ((AbstractFuture.i ^ true) & ((Future)ex).isCancelled()) {
            return AbstractFuture.AbstractFuture$b.d;
        }
        int n = 0;
        while (true) {
            try {
                final Object value = ((Future)ex).get();
                while (true) {
                    if (n != 0) {
                        Object l;
                        try {
                            Thread.currentThread().interrupt();
                            if ((l = value) == null) {
                                l = AbstractFuture.l;
                            }
                        }
                        catch (final CancellationException l) {
                            goto Label_0159;
                        }
                        catch (final ExecutionException ex) {
                            goto Label_0214;
                        }
                        finally {
                            goto Label_0150;
                        }
                        return l;
                    }
                    continue;
                }
            }
            catch (final InterruptedException l) {
                n = 1;
                continue;
            }
            finally {
                if (n != 0) {
                    Thread.currentThread().interrupt();
                }
            }
            break;
        }
    }
    
    public final void a(final Runnable runnable, final Executor executor) {
        runnable.getClass();
        executor.getClass();
        AbstractFuture$c c = this.g;
        if (c != AbstractFuture$c.d) {
            final AbstractFuture$c abstractFuture$c = new AbstractFuture$c(runnable, executor);
            do {
                abstractFuture$c.c = c;
                if (AbstractFuture.k.a(this, c, abstractFuture$c)) {
                    return;
                }
            } while ((c = this.g) != AbstractFuture$c.d);
        }
        d(runnable, executor);
    }
    
    public final void b(final StringBuilder sb) {
        int n = 0;
        while (true) {
            try {
                final AbstractFuture<AbstractFuture<AbstractFuture<AbstractFuture>>> value = (AbstractFuture<AbstractFuture<AbstractFuture<AbstractFuture>>>)this.get();
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
        boolean b3;
        if (o == null | o instanceof AbstractFuture.AbstractFuture$e) {
            AbstractFuture.AbstractFuture$b abstractFuture$b;
            if (AbstractFuture.i) {
                abstractFuture$b = new AbstractFuture.AbstractFuture$b(b, (Throwable)new CancellationException("Future.cancel() was called."));
            }
            else if (b) {
                abstractFuture$b = AbstractFuture.AbstractFuture$b.c;
            }
            else {
                abstractFuture$b = AbstractFuture.AbstractFuture$b.d;
            }
            AbstractFuture abstractFuture = this;
            b3 = false;
            while (true) {
                if (AbstractFuture.k.b(abstractFuture, o, (Object)abstractFuture$b)) {
                    c(abstractFuture);
                    b3 = b2;
                    if (!(o instanceof AbstractFuture.AbstractFuture$e)) {
                        break;
                    }
                    final c g = ((AbstractFuture.AbstractFuture$e)o).g;
                    if (!(g instanceof AbstractFuture)) {
                        ((Future)g).cancel(b);
                        b3 = b2;
                        break;
                    }
                    abstractFuture = (AbstractFuture)g;
                    o = abstractFuture.f;
                    final boolean b4 = o == null;
                    b3 = b2;
                    if (!(b4 | o instanceof AbstractFuture.AbstractFuture$e)) {
                        break;
                    }
                    b3 = true;
                }
                else {
                    if (!((o = abstractFuture.f) instanceof AbstractFuture.AbstractFuture$e)) {
                        break;
                    }
                    continue;
                }
            }
        }
        else {
            b3 = false;
        }
        return b3;
    }
    
    public final V e(final Object o) throws ExecutionException {
        if (o instanceof AbstractFuture.AbstractFuture$b) {
            final Throwable b = ((AbstractFuture.AbstractFuture$b)o).b;
            final CancellationException ex = new CancellationException("Task was cancelled.");
            ex.initCause(b);
            throw ex;
        }
        if (!(o instanceof AbstractFuture.AbstractFuture$Failure)) {
            Object o2;
            if ((o2 = o) == AbstractFuture.l) {
                o2 = null;
            }
            return (V)o2;
        }
        throw new ExecutionException(((AbstractFuture.AbstractFuture$Failure)o).a);
    }
    
    public final String g() {
        final Object f = this.f;
        if (f instanceof AbstractFuture.AbstractFuture$e) {
            final StringBuilder k = a.k("setFuture=[");
            final c g = ((AbstractFuture.AbstractFuture$e)f).g;
            String value;
            if (g == this) {
                value = "this future";
            }
            else {
                value = String.valueOf(g);
            }
            return b.j(k, value, "]");
        }
        if (this instanceof ScheduledFuture) {
            final StringBuilder i = a.k("remaining delay=[");
            i.append(((ScheduledFuture)this).getDelay(TimeUnit.MILLISECONDS));
            i.append(" ms]");
            return i.toString();
        }
        return null;
    }
    
    public final V get() throws InterruptedException, ExecutionException {
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        final Object f = this.f;
        if (f != null & (f instanceof AbstractFuture.AbstractFuture$e ^ true)) {
            return this.e(f);
        }
        AbstractFuture$g abstractFuture$g = this.h;
        if (abstractFuture$g != AbstractFuture$g.c) {
            final AbstractFuture$g abstractFuture$g2 = new AbstractFuture$g();
            do {
                final AbstractFuture$a k = AbstractFuture.k;
                k.d(abstractFuture$g2, abstractFuture$g);
                if (k.c(this, abstractFuture$g, abstractFuture$g2)) {
                    Object f2;
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            this.h(abstractFuture$g2);
                            throw new InterruptedException();
                        }
                        f2 = this.f;
                    } while (!(f2 != null & (f2 instanceof AbstractFuture.AbstractFuture$e ^ true)));
                    return this.e(f2);
                }
            } while ((abstractFuture$g = this.h) != AbstractFuture$g.c);
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
        if (f != null & (f instanceof AbstractFuture.AbstractFuture$e ^ true)) {
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
                AbstractFuture$g abstractFuture$g = this.h;
                if (abstractFuture$g != AbstractFuture$g.c) {
                    final AbstractFuture$g abstractFuture$g2 = new AbstractFuture$g();
                    do {
                        final AbstractFuture$a k = AbstractFuture.k;
                        k.d(abstractFuture$g2, abstractFuture$g);
                        if (k.c(this, abstractFuture$g, abstractFuture$g2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (Thread.interrupted()) {
                                    this.h(abstractFuture$g2);
                                    throw new InterruptedException();
                                }
                                final Object f2 = this.f;
                                if (f2 != null & (f2 instanceof AbstractFuture.AbstractFuture$e ^ true)) {
                                    return this.e(f2);
                                }
                                n3 = (nanos = n2 - System.nanoTime());
                            } while (n3 >= 1000L);
                            this.h(abstractFuture$g2);
                            break Label_0263;
                        }
                    } while ((abstractFuture$g = this.h) != AbstractFuture$g.c);
                }
                return this.e(this.f);
            }
        }
        while (n3 > 0L) {
            final Object f3 = this.f;
            if (f3 != null & (f3 instanceof AbstractFuture.AbstractFuture$e ^ true)) {
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
    
    public final void h(AbstractFuture$g h) {
        h.a = null;
    Label_0005:
        while (true) {
            h = this.h;
            if (h == AbstractFuture$g.c) {
                return;
            }
            AbstractFuture$g abstractFuture$g = null;
            while (h != null) {
                final AbstractFuture$g b = h.b;
                AbstractFuture$g abstractFuture$g2;
                if (h.a != null) {
                    abstractFuture$g2 = h;
                }
                else if (abstractFuture$g != null) {
                    abstractFuture$g.b = b;
                    abstractFuture$g2 = abstractFuture$g;
                    if (abstractFuture$g.a == null) {
                        continue Label_0005;
                    }
                }
                else {
                    abstractFuture$g2 = abstractFuture$g;
                    if (!AbstractFuture.k.c(this, h, b)) {
                        continue Label_0005;
                    }
                }
                h = b;
                abstractFuture$g = abstractFuture$g2;
            }
        }
    }
    
    public final boolean isCancelled() {
        return this.f instanceof AbstractFuture.AbstractFuture$b;
    }
    
    public final boolean isDone() {
        final Object f = this.f;
        return (f instanceof AbstractFuture.AbstractFuture$e ^ true) & f != null;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f instanceof AbstractFuture.AbstractFuture$b) {
            sb.append("CANCELLED");
        }
        else if (this.isDone()) {
            this.b(sb);
        }
        else {
            String s;
            try {
                s = this.g();
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
    
    public static final class d extends AbstractFuture$a
    {
        public final AtomicReferenceFieldUpdater<AbstractFuture$g, Thread> a;
        public final AtomicReferenceFieldUpdater<AbstractFuture$g, AbstractFuture$g> b;
        public final AtomicReferenceFieldUpdater<AbstractFuture, AbstractFuture$g> c;
        public final AtomicReferenceFieldUpdater<AbstractFuture, AbstractFuture$c> d;
        public final AtomicReferenceFieldUpdater<AbstractFuture, Object> e;
        
        public d(final AtomicReferenceFieldUpdater<AbstractFuture$g, Thread> a, final AtomicReferenceFieldUpdater<AbstractFuture$g, AbstractFuture$g> b, final AtomicReferenceFieldUpdater<AbstractFuture, AbstractFuture$g> c, final AtomicReferenceFieldUpdater<AbstractFuture, AbstractFuture$c> d, final AtomicReferenceFieldUpdater<AbstractFuture, Object> e) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
        }
        
        public final boolean a(final AbstractFuture<?> abstractFuture, final AbstractFuture$c abstractFuture$c, final AbstractFuture$c abstractFuture$c2) {
            final AtomicReferenceFieldUpdater<AbstractFuture, AbstractFuture$c> d = this.d;
            while (!d.compareAndSet(abstractFuture, abstractFuture$c, abstractFuture$c2)) {
                if (d.get(abstractFuture) != abstractFuture$c) {
                    return false;
                }
            }
            return true;
        }
        
        public final boolean b(final AbstractFuture<?> abstractFuture, final Object o, final Object o2) {
            final AtomicReferenceFieldUpdater<AbstractFuture, Object> e = this.e;
            while (!e.compareAndSet(abstractFuture, o, o2)) {
                if (e.get(abstractFuture) != o) {
                    return false;
                }
            }
            return true;
        }
        
        public final boolean c(final AbstractFuture<?> abstractFuture, final AbstractFuture$g abstractFuture$g, final AbstractFuture$g abstractFuture$g2) {
            final AtomicReferenceFieldUpdater<AbstractFuture, AbstractFuture$g> c = this.c;
            while (!c.compareAndSet(abstractFuture, abstractFuture$g, abstractFuture$g2)) {
                if (c.get(abstractFuture) != abstractFuture$g) {
                    return false;
                }
            }
            return true;
        }
        
        public final void d(final AbstractFuture$g abstractFuture$g, final AbstractFuture$g abstractFuture$g2) {
            this.b.lazySet(abstractFuture$g, abstractFuture$g2);
        }
        
        public final void e(final AbstractFuture$g abstractFuture$g, final Thread thread) {
            this.a.lazySet(abstractFuture$g, thread);
        }
    }
    
    public static final class f extends AbstractFuture$a
    {
        public final boolean a(final AbstractFuture<?> abstractFuture, final AbstractFuture$c abstractFuture$c, final AbstractFuture$c g) {
            synchronized (abstractFuture) {
                if (abstractFuture.g == abstractFuture$c) {
                    abstractFuture.g = g;
                    return true;
                }
                return false;
            }
        }
        
        public final boolean b(final AbstractFuture<?> abstractFuture, final Object o, final Object f) {
            synchronized (abstractFuture) {
                if (abstractFuture.f == o) {
                    abstractFuture.f = f;
                    return true;
                }
                return false;
            }
        }
        
        public final boolean c(final AbstractFuture<?> abstractFuture, final AbstractFuture$g abstractFuture$g, final AbstractFuture$g h) {
            synchronized (abstractFuture) {
                if (abstractFuture.h == abstractFuture$g) {
                    abstractFuture.h = h;
                    return true;
                }
                return false;
            }
        }
        
        public final void d(final AbstractFuture$g abstractFuture$g, final AbstractFuture$g b) {
            abstractFuture$g.b = b;
        }
        
        public final void e(final AbstractFuture$g abstractFuture$g, final Thread a) {
            abstractFuture$g.a = a;
        }
    }
}
