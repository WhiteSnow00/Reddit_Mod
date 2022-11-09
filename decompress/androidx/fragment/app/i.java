// 
// Decompiled by Procyon v0.6.0
// 

package androidx.fragment.app;

import android.util.Log;
import android.view.ViewGroup;
import android.view.View;
import v3.d;

public final class i implements b
{
    public final /* synthetic */ View a;
    public final /* synthetic */ ViewGroup b;
    public final /* synthetic */ androidx.fragment.app.d.b c;
    public final /* synthetic */ SpecialEffectsController.Operation d;
    
    public i(final View a, final ViewGroup b, final androidx.fragment.app.d.b c, final SpecialEffectsController.Operation d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final void onCancel() {
        this.a.clearAnimation();
        this.b.endViewTransition(this.a);
        ((androidx.fragment.app.d.c)this.c).a();
        if (d0.M(2)) {
            final StringBuilder k = a.k("Animation from operation ");
            k.append(this.d);
            k.append(" has been cancelled.");
            Log.v("FragmentManager", k.toString());
        }
    }
}
