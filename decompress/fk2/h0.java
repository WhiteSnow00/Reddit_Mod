// 
// Decompiled by Procyon v0.6.0
// 

package fk2;

import java.io.IOException;
import java.io.InterruptedIOException;
import mg2.a;
import ng2.e;
import java.util.concurrent.TimeUnit;

public class h0
{
    public static final b Companion;
    public static final h0 NONE;
    private long deadlineNanoTime;
    private boolean hasDeadline;
    private long timeoutNanos;
    
    static {
        Companion = new b();
        NONE = (h0)new h0$a();
    }
    
    public h0 clearDeadline() {
        this.hasDeadline = false;
        return this;
    }
    
    public h0 clearTimeout() {
        this.timeoutNanos = 0L;
        return this;
    }
    
    public final h0 deadline(final long n, final TimeUnit timeUnit) {
        e.f((Object)timeUnit, "unit");
        if (n > 0L) {
            return this.deadlineNanoTime(timeUnit.toNanos(n) + System.nanoTime());
        }
        throw new IllegalArgumentException(e.l((Object)n, "duration <= 0: ").toString());
    }
    
    public long deadlineNanoTime() {
        if (this.hasDeadline) {
            return this.deadlineNanoTime;
        }
        throw new IllegalStateException("No deadline".toString());
    }
    
    public h0 deadlineNanoTime(final long deadlineNanoTime) {
        this.hasDeadline = true;
        this.deadlineNanoTime = deadlineNanoTime;
        return this;
    }
    
    public boolean hasDeadline() {
        return this.hasDeadline;
    }
    
    public final <T> T intersectWith(final h0 h0, final a<? extends T> a) {
        e.f((Object)h0, "other");
        e.f((Object)a, "block");
        final long timeoutNanos = this.timeoutNanos();
        final b companion = h0.Companion;
        final long timeoutNanos2 = h0.timeoutNanos();
        long timeoutNanos3 = this.timeoutNanos();
        companion.getClass();
        if (timeoutNanos2 != 0L) {
            if (timeoutNanos3 == 0L) {
                timeoutNanos3 = timeoutNanos2;
            }
            else if (timeoutNanos2 < timeoutNanos3) {
                timeoutNanos3 = timeoutNanos2;
            }
        }
        final TimeUnit nanoseconds = TimeUnit.NANOSECONDS;
        this.timeout(timeoutNanos3, nanoseconds);
        if (this.hasDeadline()) {
            final long deadlineNanoTime = this.deadlineNanoTime();
            if (h0.hasDeadline()) {
                this.deadlineNanoTime(Math.min(this.deadlineNanoTime(), h0.deadlineNanoTime()));
            }
            try {
                final Object invoke = a.invoke();
                this.timeout(timeoutNanos, nanoseconds);
                if (h0.hasDeadline()) {
                    this.deadlineNanoTime(deadlineNanoTime);
                }
                return (T)invoke;
            }
            finally {
                this.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                if (h0.hasDeadline()) {
                    this.deadlineNanoTime(deadlineNanoTime);
                }
            }
        }
        if (h0.hasDeadline()) {
            this.deadlineNanoTime(h0.deadlineNanoTime());
        }
        try {
            final Object invoke2 = a.invoke();
            this.timeout(timeoutNanos, nanoseconds);
            if (h0.hasDeadline()) {
                this.clearDeadline();
            }
            return (T)invoke2;
        }
        finally {
            this.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
            if (h0.hasDeadline()) {
                this.clearDeadline();
            }
        }
    }
    
    public void throwIfReached() throws IOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.hasDeadline && this.deadlineNanoTime - System.nanoTime() <= 0L) {
            throw new InterruptedIOException("deadline reached");
        }
    }
    
    public h0 timeout(final long n, final TimeUnit timeUnit) {
        e.f((Object)timeUnit, "unit");
        if (n >= 0L) {
            this.timeoutNanos = timeUnit.toNanos(n);
            return this;
        }
        throw new IllegalArgumentException(e.l((Object)n, "timeout < 0: ").toString());
    }
    
    public long timeoutNanos() {
        return this.timeoutNanos;
    }
    
    public final void waitUntilNotified(Object o) throws InterruptedIOException {
        e.f(o, "monitor");
        try {
            final boolean hasDeadline = this.hasDeadline();
            long n = this.timeoutNanos();
            long n2 = 0L;
            if (!hasDeadline && n == 0L) {
                o.wait();
                return;
            }
            final long nanoTime = System.nanoTime();
            if (hasDeadline && n != 0L) {
                n = Math.min(n, this.deadlineNanoTime() - nanoTime);
            }
            else if (hasDeadline) {
                n = this.deadlineNanoTime() - nanoTime;
            }
            if (n > 0L) {
                final long n3 = n / 1000000L;
                o.wait(n3, (int)(n - 1000000L * n3));
                n2 = System.nanoTime() - nanoTime;
            }
            if (n2 < n) {
                return;
            }
            o = new InterruptedIOException("timeout");
            throw o;
        }
        catch (final InterruptedException ex) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }
    
    public static final class b
    {
    }
}
