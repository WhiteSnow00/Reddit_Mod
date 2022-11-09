// 
// Decompiled by Procyon v0.6.0
// 

package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.c;

public final class f
{
    public static boolean[] a;
    
    static {
        f.a = new boolean[3];
    }
    
    public static void a(final d d, final c c, final ConstraintWidget constraintWidget) {
        constraintWidget.q = -1;
        constraintWidget.r = -1;
        final ConstraintWidget.DimensionBehaviour dimensionBehaviour = ((ConstraintWidget)d).R[0];
        final ConstraintWidget.DimensionBehaviour wrap_CONTENT = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (dimensionBehaviour != wrap_CONTENT && constraintWidget.R[0] == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
            final int g = constraintWidget.G.g;
            final int n = ((ConstraintWidget)d).l() - constraintWidget.I.g;
            final ConstraintAnchor g2 = constraintWidget.G;
            g2.i = c.k(g2);
            final ConstraintAnchor i = constraintWidget.I;
            i.i = c.k(i);
            c.d(constraintWidget.G.i, g);
            c.d(constraintWidget.I.i, n);
            constraintWidget.q = 2;
            constraintWidget.X = g;
            final int t = n - g;
            constraintWidget.T = t;
            final int a0 = constraintWidget.a0;
            if (t < a0) {
                constraintWidget.T = a0;
            }
        }
        if (((ConstraintWidget)d).R[1] != wrap_CONTENT && constraintWidget.R[1] == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
            final int g3 = constraintWidget.H.g;
            final int n2 = ((ConstraintWidget)d).i() - constraintWidget.J.g;
            final ConstraintAnchor h = constraintWidget.H;
            h.i = c.k(h);
            final ConstraintAnchor j = constraintWidget.J;
            j.i = c.k(j);
            c.d(constraintWidget.H.i, g3);
            c.d(constraintWidget.J.i, n2);
            if (constraintWidget.Z > 0 || constraintWidget.f0 == 8) {
                final ConstraintAnchor k = constraintWidget.K;
                k.i = c.k(k);
                c.d(constraintWidget.K.i, constraintWidget.Z + g3);
            }
            constraintWidget.r = 2;
            constraintWidget.Y = g3;
            final int u = n2 - g3;
            constraintWidget.U = u;
            final int b0 = constraintWidget.b0;
            if (u < b0) {
                constraintWidget.U = b0;
            }
        }
    }
}
