// 
// Decompiled by Procyon v0.6.0
// 

package androidx.constraintlayout.solver.widgets;

public final class h
{
    public static boolean[] a;
    
    static {
        h.a = new boolean[3];
    }
    
    public static boolean a(int n, final ConstraintWidget constraintWidget) {
        final ConstraintWidget.DimensionBehaviour[] c = constraintWidget.C;
        if (c[n] != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            return false;
        }
        final float g = constraintWidget.G;
        final int n2 = 1;
        if (g != 0.0f) {
            if (n == 0) {
                n = n2;
            }
            else {
                n = 0;
            }
            final ConstraintWidget.DimensionBehaviour dimensionBehaviour = c[n];
            return false;
        }
        if (n == 0) {
            if (constraintWidget.e != 0) {
                return false;
            }
            if (constraintWidget.h != 0 || constraintWidget.i != 0) {
                return false;
            }
        }
        else {
            if (constraintWidget.f != 0) {
                return false;
            }
            if (constraintWidget.k != 0 || constraintWidget.l != 0) {
                return false;
            }
        }
        return true;
    }
    
    public static void b(final ConstraintWidget constraintWidget, final int n, final int n2) {
        final int n3 = n * 2;
        final int n4 = n3 + 1;
        final ConstraintAnchor[] a = constraintWidget.A;
        final i a2 = a[n3].a;
        a2.f = constraintWidget.D.s.a;
        a2.g = (float)n2;
        a2.b = 1;
        final i a3 = a[n4].a;
        a3.f = a2;
        a3.g = (float)constraintWidget.h(n);
        constraintWidget.A[n4].a.b = 1;
    }
}
