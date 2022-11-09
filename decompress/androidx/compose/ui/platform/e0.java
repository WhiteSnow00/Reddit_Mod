// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.platform;

import android.view.ViewParent;
import eg.n0;
import androidx.appcompat.widget.z;
import ah2.f;
import android.view.View;
import android.graphics.Matrix;

public final class e0 implements c0
{
    public final Matrix a;
    public final int[] b;
    
    public e0() {
        this.a = new Matrix();
        this.b = new int[2];
    }
    
    public void a(View view, final float[] array) {
        f.f((Object)view, "view");
        f.f((Object)array, "matrix");
        this.a.reset();
        z.i(view, this.a);
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
        n0.v0(this.a, array);
    }
}
