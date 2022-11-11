// 
// Decompiled by Procyon v0.6.0
// 

package androidx.fragment.app;

import android.util.Log;
import android.view.ViewGroup;
import android.view.View;
import v3.d$b;

public final class i implements d$b
{
    public final /* synthetic */ View a;
    public final /* synthetic */ ViewGroup b;
    public final /* synthetic */ d.b c;
    public final /* synthetic */ SpecialEffectsController$Operation d;
    
    public i(final View a, final ViewGroup b, final d.b c, final SpecialEffectsController$Operation d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final void onCancel() {
        this.a.clearAnimation();
        this.b.endViewTransition(this.a);
        this.c.a();
        if (d0.M(2)) {
            final StringBuilder r = a.r("Animation from operation ");
            r.append(this.d);
            r.append(" has been cancelled.");
            Log.v("FragmentManager", r.toString());
        }
    }
}
