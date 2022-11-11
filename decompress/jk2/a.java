// 
// Decompiled by Procyon v0.6.0
// 

package jk2;

import java.io.InterruptedIOException;
import hg2.j;
import sg2.e;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class a extends h0
{
    public static final a.a$a Companion;
    private static final long IDLE_TIMEOUT_MILLIS;
    private static final long IDLE_TIMEOUT_NANOS;
    private static final int TIMEOUT_WRITE_SIZE = 65536;
    private static a head;
    private boolean inQueue;
    private a next;
    private long timeoutAt;
    
    static {
        Companion = new a.a$a();
        IDLE_TIMEOUT_NANOS = TimeUnit.MILLISECONDS.toNanos(IDLE_TIMEOUT_MILLIS = TimeUnit.SECONDS.toMillis(60L));
    }
    
    public static final /* synthetic */ a access$getHead$cp() {
        return a.head;
    }
    
    public static final /* synthetic */ boolean access$getInQueue$p(final a a) {
        return a.inQueue;
    }
    
    public static final /* synthetic */ a access$getNext$p(final a a) {
        return a.next;
    }
    
    public static final /* synthetic */ void access$setHead$cp(final a head) {
        a.head = head;
    }
    
    public static final /* synthetic */ void access$setInQueue$p(final a a, final boolean inQueue) {
        a.inQueue = inQueue;
    }
    
    public static final /* synthetic */ void access$setNext$p(final a a, final a next) {
        a.next = next;
    }
    
    public static final /* synthetic */ void access$setTimeoutAt$p(final a a, final long timeoutAt) {
        a.timeoutAt = timeoutAt;
    }
    
    private final long remainingNanos(final long n) {
        return this.timeoutAt - n;
    }
    
    public final IOException access$newTimeoutException(final IOException ex) {
        return this.newTimeoutException(ex);
    }
    
    public final void enter() {
        final long timeoutNanos = this.timeoutNanos();
        final boolean hasDeadline = this.hasDeadline();
        final long n = lcmp(timeoutNanos, 0L);
        if (n == 0 && !hasDeadline) {
            return;
        }
        a.Companion.getClass();
        synchronized (a.class) {
            if (access$getInQueue$p(this) ^ true) {
                access$setInQueue$p(this, true);
                if (access$getHead$cp() == null) {
                    access$setHead$cp(new a());
                    ((Thread)new a.a$b()).start();
                }
                final long nanoTime = System.nanoTime();
                if (n != 0 && hasDeadline) {
                    access$setTimeoutAt$p(this, Math.min(timeoutNanos, this.deadlineNanoTime() - nanoTime) + nanoTime);
                }
                else if (n != 0) {
                    access$setTimeoutAt$p(this, timeoutNanos + nanoTime);
                }
                else {
                    if (!hasDeadline) {
                        throw new AssertionError();
                    }
                    access$setTimeoutAt$p(this, this.deadlineNanoTime());
                }
                final long access$remainingNanos = this.remainingNanos(nanoTime);
                a a = access$getHead$cp();
                e.c((Object)a);
                while (access$getNext$p(a) != null) {
                    final a access$getNext$p = access$getNext$p(a);
                    e.c((Object)access$getNext$p);
                    if (access$remainingNanos < access$getNext$p.remainingNanos(nanoTime)) {
                        break;
                    }
                    a = access$getNext$p(a);
                    e.c((Object)a);
                }
                access$setNext$p(this, access$getNext$p(a));
                access$setNext$p(a, this);
                if (a == access$getHead$cp()) {
                    a.class.notify();
                }
                final j a2 = j.a;
                return;
            }
            throw new IllegalStateException("Unbalanced enter/exit".toString());
        }
    }
    
    public final boolean exit() {
        a.Companion.getClass();
        synchronized (a.class) {
            final boolean access$getInQueue$p = access$getInQueue$p(this);
            boolean b = false;
            if (!access$getInQueue$p) {
                monitorexit(a.class);
            }
            else {
                access$setInQueue$p(this, false);
                for (a a = access$getHead$cp(); a != null; a = access$getNext$p(a)) {
                    if (access$getNext$p(a) == this) {
                        access$setNext$p(a, access$getNext$p(this));
                        access$setNext$p(this, null);
                        monitorexit(a.class);
                        return b;
                    }
                }
                b = true;
            }
            return b;
        }
    }
    
    public IOException newTimeoutException(final IOException ex) {
        final InterruptedIOException ex2 = new InterruptedIOException("timeout");
        if (ex != null) {
            ex2.initCause(ex);
        }
        return ex2;
    }
    
    public final e0 sink(final e0 e0) {
        e.f((Object)e0, "sink");
        return (e0)new e0() {
            public final /* synthetic */ a f;
            
            public final void close() {
                final a f = this.f;
                final e0 g = e0;
                f.enter();
                try {
                    try {
                        g.close();
                        final j a = j.a;
                        if (!f.exit()) {
                            return;
                        }
                        throw f.access$newTimeoutException(null);
                    }
                    finally {}
                }
                catch (final IOException access$newTimeoutException) {
                    if (f.exit()) {
                        access$newTimeoutException = f.access$newTimeoutException(access$newTimeoutException);
                    }
                    throw access$newTimeoutException;
                }
                f.exit();
            }
            
            public final void flush() {
                final a f = this.f;
                final e0 g = e0;
                f.enter();
                try {
                    try {
                        g.flush();
                        final j a = j.a;
                        if (!f.exit()) {
                            return;
                        }
                        throw f.access$newTimeoutException(null);
                    }
                    finally {}
                }
                catch (final IOException access$newTimeoutException) {
                    if (f.exit()) {
                        access$newTimeoutException = f.access$newTimeoutException(access$newTimeoutException);
                    }
                    throw access$newTimeoutException;
                }
                f.exit();
            }
            
            public final h0 timeout() {
                return this.f;
            }
            
            @Override
            public final String toString() {
                final StringBuilder r = a.r("AsyncTimeout.sink(");
                r.append(e0);
                r.append(')');
                return r.toString();
            }
            
            public final void write(final c c, long n) {
                e.f((Object)c, "source");
                k0.b(c.g, 0L, n);
                while (true) {
                    long n2 = 0L;
                    if (n <= 0L) {
                        return;
                    }
                    c0 c2 = c.f;
                    e.c((Object)c2);
                    long n3;
                    while (true) {
                        n3 = n2;
                        if (n2 >= 65536L) {
                            break;
                        }
                        n2 += c2.c - c2.b;
                        if (n2 >= n) {
                            n3 = n;
                            break;
                        }
                        c2 = c2.f;
                        e.c((Object)c2);
                    }
                    final a f = this.f;
                    final e0 g = e0;
                    f.enter();
                    try {
                        try {
                            g.write(c, n3);
                            final j a = j.a;
                            if (!f.exit()) {
                                n -= n3;
                                continue;
                            }
                            throw f.access$newTimeoutException(null);
                        }
                        finally {}
                    }
                    catch (final IOException access$newTimeoutException) {
                        if (f.exit()) {
                            access$newTimeoutException = f.access$newTimeoutException(access$newTimeoutException);
                        }
                        throw access$newTimeoutException;
                    }
                    f.exit();
                }
            }
        };
    }
    
    public final g0 source(final g0 g0) {
        e.f((Object)g0, "source");
        return (g0)new g0() {
            public final /* synthetic */ a f;
            
            public final void close() {
                final a f = this.f;
                final g0 g = g0;
                f.enter();
                try {
                    try {
                        g.close();
                        final j a = j.a;
                        if (!f.exit()) {
                            return;
                        }
                        throw f.access$newTimeoutException(null);
                    }
                    finally {}
                }
                catch (final IOException access$newTimeoutException) {
                    if (f.exit()) {
                        access$newTimeoutException = f.access$newTimeoutException(access$newTimeoutException);
                    }
                    throw access$newTimeoutException;
                }
                f.exit();
            }
            
            public final long read(final c c, long read) {
                e.f((Object)c, "sink");
                final a f = this.f;
                final g0 g = g0;
                f.enter();
                try {
                    try {
                        read = g.read(c, read);
                        if (!f.exit()) {
                            return read;
                        }
                        throw f.access$newTimeoutException(null);
                    }
                    finally {}
                }
                catch (final IOException access$newTimeoutException) {
                    if (f.exit()) {
                        access$newTimeoutException = f.access$newTimeoutException(access$newTimeoutException);
                    }
                    throw access$newTimeoutException;
                }
                f.exit();
            }
            
            public final h0 timeout() {
                return this.f;
            }
            
            @Override
            public final String toString() {
                final StringBuilder r = a.r("AsyncTimeout.source(");
                r.append(g0);
                r.append(')');
                return r.toString();
            }
        };
    }
    
    public void timedOut() {
    }
    
    public final <T> T withTimeout(final rg2.a<? extends T> a) {
        e.f((Object)a, "block");
        this.enter();
        try {
            try {
                final T invoke = (T)a.invoke();
                if (!this.exit()) {
                    return invoke;
                }
                throw this.access$newTimeoutException(null);
            }
            finally {}
        }
        catch (final IOException access$newTimeoutException) {
            if (this.exit()) {
                access$newTimeoutException = this.access$newTimeoutException(access$newTimeoutException);
            }
            throw access$newTimeoutException;
        }
        this.exit();
    }
}
