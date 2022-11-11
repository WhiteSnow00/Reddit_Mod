// 
// Decompiled by Procyon v0.6.0
// 

package androidx.fragment.app;

import android.util.Log;
import android.animation.Animator;
import v3.d$b;

public final class g implements d$b
{
    public final /* synthetic */ Animator a;
    public final /* synthetic */ SpecialEffectsController$Operation b;
    
    public g(final Animator a, final SpecialEffectsController$Operation b) {
        this.a = a;
        this.b = b;
    }
    
    public final void onCancel() {
        this.a.end();
        if (d0.M(2)) {
            final StringBuilder r = a.r("Animator from operation ");
            r.append(this.b);
            r.append(" has been canceled.");
            Log.v("FragmentManager", r.toString());
        }
    }
}
