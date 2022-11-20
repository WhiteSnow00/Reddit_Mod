// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.platform;

import android.graphics.Matrix;
import android.view.ViewParent;
import ah0.b;
import ng2.e;
import android.view.View;
import if0.a;

public final class b0 implements a0
{
    public final int[] a;
    public final float[] b;
    
    public b0() {
        this.a = new int[2];
        this.b = if0.a.m();
    }
    
    @Override
    public final void a(final View view, final float[] array) {
        e.f((Object)view, "view");
        e.f((Object)array, "matrix");
        if0.a.V(array);
        this.c(view, array);
    }
    
    public final void b(final float[] array, final float n, final float n2) {
        if0.a.V(this.b);
        if0.a.g0(this.b, n, n2);
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
            ah0.b.q1(matrix, this.b);
            AndroidComposeView_androidKt.a(array, this.b);
        }
    }
}
