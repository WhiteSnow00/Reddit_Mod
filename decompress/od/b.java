// 
// Decompiled by Procyon v0.6.0
// 

package od;

import android.content.res.Configuration;
import android.os.Bundle;
import android.app.Activity;
import java.util.Iterator;
import android.content.ComponentCallbacks;
import android.app.Application;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import android.content.ComponentCallbacks2;
import android.app.Application$ActivityLifecycleCallbacks;

public final class b implements Application$ActivityLifecycleCallbacks, ComponentCallbacks2
{
    public static final b j;
    public final AtomicBoolean f;
    public final AtomicBoolean g;
    public final ArrayList<a> h;
    public boolean i;
    
    static {
        j = new b();
    }
    
    public b() {
        this.f = new AtomicBoolean();
        this.g = new AtomicBoolean();
        this.h = new ArrayList<a>();
        this.i = false;
    }
    
    public static void a(final Application application) {
        final b j = b.j;
        synchronized (j) {
            if (!j.i) {
                application.registerActivityLifecycleCallbacks((Application$ActivityLifecycleCallbacks)j);
                application.registerComponentCallbacks((ComponentCallbacks)j);
                j.i = true;
            }
        }
    }
    
    public final void b(final boolean b) {
        synchronized (b.j) {
            final Iterator<a> iterator = this.h.iterator();
            while (iterator.hasNext()) {
                iterator.next().a(b);
            }
        }
    }
    
    public final void onActivityCreated(final Activity activity, final Bundle bundle) {
        final boolean compareAndSet = this.f.compareAndSet(true, false);
        this.g.set(true);
        if (compareAndSet) {
            this.b(false);
        }
    }
    
    public final void onActivityDestroyed(final Activity activity) {
    }
    
    public final void onActivityPaused(final Activity activity) {
    }
    
    public final void onActivityResumed(final Activity activity) {
        final boolean compareAndSet = this.f.compareAndSet(true, false);
        this.g.set(true);
        if (compareAndSet) {
            this.b(false);
        }
    }
    
    public final void onActivitySaveInstanceState(final Activity activity, final Bundle bundle) {
    }
    
    public final void onActivityStarted(final Activity activity) {
    }
    
    public final void onActivityStopped(final Activity activity) {
    }
    
    public final void onConfigurationChanged(final Configuration configuration) {
    }
    
    public final void onLowMemory() {
    }
    
    public final void onTrimMemory(final int n) {
        if (n == 20 && this.f.compareAndSet(false, true)) {
            this.g.set(true);
            this.b(true);
        }
    }
    
    public interface a
    {
        void a(final boolean p0);
    }
}
