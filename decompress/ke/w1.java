// 
// Decompiled by Procyon v0.6.0
// 

package ke;

import android.os.Bundle;
import android.app.Activity;
import android.app.Application$ActivityLifecycleCallbacks;

public final class w1 implements Application$ActivityLifecycleCallbacks
{
    public final /* synthetic */ x1 f;
    
    public w1(final x1 f) {
        this.f = f;
    }
    
    public final void onActivityCreated(final Activity activity, final Bundle bundle) {
        this.f.b((s1)new p1(this, bundle, activity));
    }
    
    public final void onActivityDestroyed(final Activity activity) {
        this.f.b((s1)new k1(this, activity));
    }
    
    public final void onActivityPaused(final Activity activity) {
        this.f.b((s1)new c1(this, activity));
    }
    
    public final void onActivityResumed(final Activity activity) {
        this.f.b((s1)new h1(this, activity));
    }
    
    public final void onActivitySaveInstanceState(final Activity activity, final Bundle bundle) {
        final n0 n0 = new n0();
        this.f.b((s1)new v1(this, activity, n0));
        final Bundle m = n0.m(50L);
        if (m != null) {
            bundle.putAll(m);
        }
    }
    
    public final void onActivityStarted(final Activity activity) {
        this.f.b((s1)new l1(this, activity));
    }
    
    public final void onActivityStopped(final Activity activity) {
        this.f.b((s1)new i1(this, activity));
    }
}
