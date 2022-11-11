// 
// Decompiled by Procyon v0.6.0
// 

package kotlinx.coroutines.rx2;

import rg2.l;
import if2.a;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import ff2.b0;

public final class DispatcherScheduler extends b0
{
    public static final /* synthetic */ AtomicLongFieldUpdater b;
    
    static {
        b = AtomicLongFieldUpdater.newUpdater(DispatcherScheduler.class, "workerCounter");
    }
    
    public final b0.c a() {
        new DispatcherScheduler.DispatcherScheduler$DispatcherWorker(DispatcherScheduler.b.getAndIncrement(this));
        throw null;
    }
    
    public final a d(final Runnable runnable, final long n, final TimeUnit timeUnit) {
        f.a((jj2.f)null, runnable, timeUnit.toMillis(n), (l)new DispatcherScheduler$scheduleDirect$1(this));
        throw null;
    }
    
    public final String toString() {
        throw null;
    }
}
