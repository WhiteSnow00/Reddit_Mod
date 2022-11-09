// 
// Decompiled by Procyon v0.6.0
// 

package androidx.fragment.app;

import java.util.ArrayList;
import java.util.List;

public final class e implements Runnable
{
    public final /* synthetic */ List f;
    public final /* synthetic */ SpecialEffectsController.Operation g;
    public final /* synthetic */ d h;
    
    public e(final d h, final ArrayList f, final SpecialEffectsController.Operation g) {
        this.h = h;
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final void run() {
        if (this.f.contains(this.g)) {
            this.f.remove(this.g);
            final d h = this.h;
            final SpecialEffectsController.Operation g = this.g;
            h.getClass();
            g.a.applyState(g.c.mView);
        }
    }
}
