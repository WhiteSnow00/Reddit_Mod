// 
// Decompiled by Procyon v0.6.0
// 

package h;

import a4.t1;
import java.util.WeakHashMap;
import a4.p0;
import android.view.View;
import a4.u1;

public final class j extends u1
{
    public final /* synthetic */ f z;
    
    public j(final f z) {
        this.z = z;
    }
    
    public final void e() {
        this.z.C.setVisibility(0);
        if (((View)this.z.C).getParent() instanceof View) {
            final View view = (View)((View)this.z.C).getParent();
            final WeakHashMap a = p0.a;
            p0.h.c(view);
        }
    }
    
    public final void j() {
        ((View)this.z.C).setAlpha(1.0f);
        this.z.F.e((t1)null);
        this.z.F = null;
    }
}
