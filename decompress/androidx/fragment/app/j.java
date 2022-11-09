// 
// Decompiled by Procyon v0.6.0
// 

package androidx.fragment.app;

import android.view.View;
import j0.b;

public final class j implements Runnable
{
    public final /* synthetic */ SpecialEffectsController.Operation f;
    public final /* synthetic */ SpecialEffectsController.Operation g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ b i;
    
    public j(final SpecialEffectsController.Operation f, final SpecialEffectsController.Operation g, final boolean h, final b i) {
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    @Override
    public final void run() {
        o0.a(this.f.c, this.g.c, this.h, (b<String, View>)this.i, false);
    }
}
