// 
// Decompiled by Procyon v0.6.0
// 

package m3;

import android.app.Application$ActivityLifecycleCallbacks;
import android.app.Application;

public final class d implements Runnable
{
    public final /* synthetic */ Application f;
    public final /* synthetic */ f.a g;
    
    public d(final Application f, final f.a g) {
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final void run() {
        this.f.unregisterActivityLifecycleCallbacks((Application$ActivityLifecycleCallbacks)this.g);
    }
}
