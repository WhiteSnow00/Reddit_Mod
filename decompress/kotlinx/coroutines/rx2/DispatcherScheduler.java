// 
// Decompiled by Procyon v0.6.0
// 

package kotlinx.coroutines.rx2;

import kotlinx.coroutines.JobSupport;
import zi2.c0;
import mg.d0;
import kotlin.coroutines.CoroutineContext;
import zi2.h;
import zi2.u;
import kotlinx.coroutines.CoroutineDispatcher;
import mg2.l;
import df2.a;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import af2.b0;

public final class DispatcherScheduler extends b0
{
    public static final AtomicLongFieldUpdater b;
    private volatile long workerCounter;
    
    static {
        b = AtomicLongFieldUpdater.newUpdater(DispatcherScheduler.class, "workerCounter");
    }
    
    public final b0.c a() {
        new DispatcherWorker(DispatcherScheduler.b.getAndIncrement(this));
        throw null;
    }
    
    public final a d(final Runnable runnable, final long n, final TimeUnit timeUnit) {
        f.a(null, runnable, timeUnit.toMillis(n), (l)new DispatcherScheduler$scheduleDirect$1(this));
        throw null;
    }
    
    public final String toString() {
        throw null;
    }
    
    public static final class DispatcherWorker extends c
    {
        public final long f;
        public final CoroutineDispatcher g;
        public final u h;
        
        public DispatcherWorker(final long f) {
            this.f = f;
            this.g = null;
            ((JobSupport)(this.h = (u)h.a())).plus((CoroutineContext)null);
            throw null;
        }
        
        @Override
        public final a c(final Runnable runnable, final long n, final TimeUnit timeUnit) {
            return kotlinx.coroutines.rx2.f.a(null, runnable, timeUnit.toMillis(n), (l)new DispatcherScheduler$DispatcherWorker$schedule$1(this));
        }
        
        public final void dispose() {
            throw null;
        }
        
        public final boolean isDisposed() {
            return d0.h0((c0)null) ^ true;
        }
        
        @Override
        public final String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append(this.g);
            sb.append(" (worker ");
            sb.append(this.f);
            sb.append(", ");
            String s;
            if (this.isDisposed()) {
                s = "disposed";
            }
            else {
                s = "active";
            }
            return p1.h.c(sb, s, ')');
        }
    }
}
