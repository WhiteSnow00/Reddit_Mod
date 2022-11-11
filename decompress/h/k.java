// 
// Decompiled by Procyon v0.6.0
// 

package h;

import a4.u1;
import a4.t1;
import java.util.WeakHashMap;
import a4.q0$h;
import a4.q0;
import android.view.View;
import yg.a;

public final class k extends a
{
    public final /* synthetic */ g s;
    
    public k(final g s) {
        this.s = s;
    }
    
    public final void e() {
        this.s.C.setVisibility(0);
        if (((View)this.s.C).getParent() instanceof View) {
            final View view = (View)((View)this.s.C).getParent();
            final WeakHashMap<View, t1> a = q0.a;
            q0$h.c(view);
        }
    }
    
    public final void o() {
        ((View)this.s.C).setAlpha(1.0f);
        this.s.F.e(null);
        this.s.F = null;
    }
}
