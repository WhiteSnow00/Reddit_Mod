// 
// Decompiled by Procyon v0.6.0
// 

package androidx.lifecycle;

import java.util.Collections;
import java.util.List;
import android.os.Handler;
import android.app.Application$ActivityLifecycleCallbacks;
import android.app.Application;
import p5.a;
import android.content.Context;
import p5.b;

public final class ProcessLifecycleInitializer implements b<q>
{
    public final Object create(final Context context) {
        if (a.c(context).b.contains(ProcessLifecycleInitializer.class)) {
            if (!n.a.getAndSet(true)) {
                ((Application)context.getApplicationContext()).registerActivityLifecycleCallbacks((Application$ActivityLifecycleCallbacks)new n$a());
            }
            final b0 n = b0.n;
            n.getClass();
            n.j = new Handler();
            n.k.f(Lifecycle.Event.ON_CREATE);
            ((Application)context.getApplicationContext()).registerActivityLifecycleCallbacks((Application$ActivityLifecycleCallbacks)new c0(n));
            return n;
        }
        throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily. \nPlease ensure that you have: \n<meta-data\n    android:name='androidx.lifecycle.ProcessLifecycleInitializer' \n    android:value='androidx.startup' /> \nunder InitializationProvider in your AndroidManifest.xml");
    }
    
    public final List<Class<? extends b<?>>> dependencies() {
        return Collections.emptyList();
    }
}
