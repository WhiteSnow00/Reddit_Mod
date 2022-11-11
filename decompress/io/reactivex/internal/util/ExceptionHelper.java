// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.util;

import java.util.concurrent.TimeUnit;
import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;

public final class ExceptionHelper
{
    public static final Throwable a;
    
    static {
        a = new Termination();
    }
    
    public static <T> boolean a(final AtomicReference<Throwable> atomicReference, final Throwable t) {
        boolean b;
    Label_0074:
        do {
            final Throwable t2 = atomicReference.get();
            final Throwable a = ExceptionHelper.a;
            b = false;
            if (t2 == a) {
                return false;
            }
            Throwable t3;
            if (t2 == null) {
                t3 = t;
            }
            else {
                t3 = new CompositeException(new Throwable[] { t2, t });
            }
            while (!atomicReference.compareAndSet(t2, t3)) {
                if (atomicReference.get() != t2) {
                    continue Label_0074;
                }
            }
            b = true;
        } while (!b);
        return true;
    }
    
    public static <T> Throwable b(final AtomicReference<Throwable> atomicReference) {
        final Throwable t = atomicReference.get();
        final Throwable a = ExceptionHelper.a;
        Throwable t2 = t;
        if (t != a) {
            t2 = atomicReference.getAndSet(a);
        }
        return t2;
    }
    
    public static String c(final long n, final TimeUnit timeUnit) {
        final StringBuilder sb = new StringBuilder();
        sb.append("The source did not signal an event for ");
        sb.append(n);
        sb.append(" ");
        sb.append(timeUnit.toString().toLowerCase());
        sb.append(" and has been terminated.");
        return sb.toString();
    }
    
    public static RuntimeException d(final Throwable t) {
        if (t instanceof Error) {
            throw (Error)t;
        }
        if (t instanceof RuntimeException) {
            return (RuntimeException)t;
        }
        return new RuntimeException(t);
    }
    
    public static final class Termination extends Throwable
    {
        private static final long serialVersionUID = -4649703670690200604L;
        
        public Termination() {
            super("No further exceptions");
        }
        
        @Override
        public Throwable fillInStackTrace() {
            return this;
        }
    }
}
