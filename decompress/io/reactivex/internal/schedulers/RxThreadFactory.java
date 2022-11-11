// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.schedulers;

import wf2.g;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

public final class RxThreadFactory extends AtomicLong implements ThreadFactory
{
    private static final long serialVersionUID = -7789753024099756196L;
    public final boolean nonBlocking;
    public final String prefix;
    public final int priority;
    
    public RxThreadFactory(final String s) {
        this(s, 5, false);
    }
    
    public RxThreadFactory(final String s, final int n) {
        this(s, n, false);
    }
    
    public RxThreadFactory(final String prefix, final int priority, final boolean nonBlocking) {
        this.prefix = prefix;
        this.priority = priority;
        this.nonBlocking = nonBlocking;
    }
    
    @Override
    public Thread newThread(final Runnable runnable) {
        final StringBuilder sb = new StringBuilder(this.prefix);
        sb.append('-');
        sb.append(this.incrementAndGet());
        final String string = sb.toString();
        Thread thread;
        if (this.nonBlocking) {
            thread = new a(runnable, string);
        }
        else {
            thread = new Thread(runnable, string);
        }
        thread.setPriority(this.priority);
        thread.setDaemon(true);
        return thread;
    }
    
    @Override
    public String toString() {
        return a.o(a.r("RxThreadFactory["), this.prefix, "]");
    }
    
    public static final class a extends Thread implements g
    {
        public a(final Runnable runnable, final String s) {
            super(runnable, s);
        }
    }
}
