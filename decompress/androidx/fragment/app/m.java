// 
// Decompiled by Procyon v0.6.0
// 

package androidx.fragment.app;

import android.util.Log;

public final class m implements Runnable
{
    public final /* synthetic */ d.d f;
    public final /* synthetic */ SpecialEffectsController.Operation g;
    
    public m(final d.d f, final SpecialEffectsController.Operation g) {
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final void run() {
        ((d.c)this.f).a();
        if (d0.M(2)) {
            final StringBuilder k = a.k("Transition for operation ");
            k.append(this.g);
            k.append("has completed");
            Log.v("FragmentManager", k.toString());
        }
    }
}
