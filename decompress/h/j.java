// 
// Decompiled by Procyon v0.6.0
// 

package h;

import java.util.WeakHashMap;
import android.view.ViewGroup;
import a4.t1;
import a4.u1;
import yg.a;
import a4.q0$g;
import a4.q0;
import android.view.View;

public final class j implements Runnable
{
    public final /* synthetic */ g f;
    
    public j(final g f) {
        this.f = f;
    }
    
    @Override
    public final void run() {
        final g f = this.f;
        f.D.showAtLocation((View)f.C, 55, 0, 0);
        final t1 f2 = this.f.F;
        if (f2 != null) {
            f2.b();
        }
        final g f3 = this.f;
        boolean b = false;
        Label_0075: {
            if (f3.H) {
                final ViewGroup i = f3.I;
                if (i != null) {
                    final WeakHashMap<View, t1> a = q0.a;
                    if (q0$g.c((View)i)) {
                        b = true;
                        break Label_0075;
                    }
                }
            }
            b = false;
        }
        if (b) {
            ((View)this.f.C).setAlpha(0.0f);
            final g f4 = this.f;
            final t1 a2 = q0.a((View)f4.C);
            a2.a(1.0f);
            f4.F = a2;
            this.f.F.e((u1)new a() {
                public final void e() {
                    j.this.f.C.setVisibility(0);
                }
                
                public final void o() {
                    ((View)j.this.f.C).setAlpha(1.0f);
                    j.this.f.F.e(null);
                    j.this.f.F = null;
                }
            });
        }
        else {
            ((View)this.f.C).setAlpha(1.0f);
            this.f.C.setVisibility(0);
        }
    }
}
