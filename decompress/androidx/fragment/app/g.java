// 
// Decompiled by Procyon v0.6.0
// 

package androidx.fragment.app;

import android.util.Log;
import android.animation.Animator;
import v3.d;

public final class g implements b
{
    public final /* synthetic */ Animator a;
    public final /* synthetic */ SpecialEffectsController.Operation b;
    
    public g(final Animator a, final SpecialEffectsController.Operation b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void onCancel() {
        this.a.end();
        if (d0.M(2)) {
            final StringBuilder k = a.k("Animator from operation ");
            k.append(this.b);
            k.append(" has been canceled.");
            Log.v("FragmentManager", k.toString());
        }
    }
}
