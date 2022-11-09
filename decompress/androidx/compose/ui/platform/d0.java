// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.platform;

import android.graphics.Matrix;
import android.view.ViewParent;
import eg.n0;
import ah2.f;
import android.view.View;
import aj2.c;

public final class d0 implements c0
{
    public final int[] a;
    public final float[] b;
    
    public d0() {
        this.a = new int[2];
        this.b = c.B();
    }
    
    public final void a(final View view, final float[] array) {
        f.f((Object)view, "view");
        f.f((Object)array, "matrix");
        c.I0(array);
        this.c(view, array);
    }
    
    public final void b(final float[] array, final float n, final float n2) {
        c.I0(this.b);
        c.Y0(this.b, n, n2);
        AndroidComposeView_androidKt.a(array, this.b);
    }
    
    public final void c(final View view, final float[] array) {
        final ViewParent parent = view.getParent();
        if (parent instanceof View) {
            this.c((View)parent, array);
            this.b(array, -(float)view.getScrollX(), -(float)view.getScrollY());
            this.b(array, (float)view.getLeft(), (float)view.getTop());
        }
        else {
            final int[] a = this.a;
            view.getLocationInWindow(a);
            this.b(array, -(float)view.getScrollX(), -(float)view.getScrollY());
            this.b(array, (float)a[0], (float)a[1]);
        }
        final Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            n0.v0(matrix, this.b);
            AndroidComposeView_androidKt.a(array, this.b);
        }
    }
}
