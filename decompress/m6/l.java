// 
// Decompiled by Procyon v0.6.0
// 

package m6;

import java.util.concurrent.ExecutorService;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

public final class l implements Executor
{
    public final ArrayDeque<a> f;
    public final Executor g;
    public final Object h;
    public volatile Runnable i;
    
    public l(final ExecutorService g) {
        this.g = g;
        this.f = new ArrayDeque<a>();
        this.h = new Object();
    }
    
    public final void a() {
        synchronized (this.h) {
            final Runnable i = this.f.poll();
            this.i = i;
            if (i != null) {
                this.g.execute(this.i);
            }
        }
    }
    
    @Override
    public final void execute(final Runnable runnable) {
        synchronized (this.h) {
            this.f.add(new a(this, runnable));
            if (this.i == null) {
                this.a();
            }
        }
    }
    
    public static final class a implements Runnable
    {
        public final l f;
        public final Runnable g;
        
        public a(final l f, final Runnable g) {
            this.f = f;
            this.g = g;
        }
        
        @Override
        public final void run() {
            try {
                this.g.run();
            }
            finally {
                this.f.a();
            }
        }
    }
}
