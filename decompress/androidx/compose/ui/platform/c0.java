// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.platform;

import android.view.ViewParent;
import ah0.b;
import a4.u0;
import ng2.e;
import android.view.View;
import android.graphics.Matrix;

public final class c0 implements a0
{
    public final Matrix a;
    public final int[] b;
    
    public c0() {
        this.a = new Matrix();
        this.b = new int[2];
    }
    
    @Override
    public void a(View view, final float[] array) {
        e.f((Object)view, "view");
        e.f((Object)array, "matrix");
        this.a.reset();
        u0.k(view, this.a);
        for (ViewParent viewParent = view.getParent(); viewParent instanceof View; viewParent = view.getParent()) {
            view = (View)viewParent;
        }
        view.getLocationOnScreen(this.b);
        final int[] b = this.b;
        final int n = b[0];
        final int n2 = b[1];
        view.getLocationInWindow(b);
        final int[] b2 = this.b;
        this.a.postTranslate((float)(b2[0] - n), (float)(b2[1] - n2));
        ah0.b.q1(this.a, array);
    }
}
