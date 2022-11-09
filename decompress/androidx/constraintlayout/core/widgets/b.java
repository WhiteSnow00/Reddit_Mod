// 
// Decompiled by Procyon v0.6.0
// 

package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.SolverVariable;
import java.util.ArrayList;
import androidx.constraintlayout.core.c;

public final class b
{
    public static void a(final d d, final c c, final ArrayList<ConstraintWidget> list, final int n) {
        int n2 = 2;
        int n3;
        androidx.constraintlayout.core.widgets.c[] array;
        int n4;
        if (n == 0) {
            n3 = d.w0;
            array = d.z0;
            n4 = 0;
        }
        else {
            n3 = d.x0;
            array = d.y0;
            n4 = 2;
        }
        int n37 = 0;
        int n38 = 0;
        for (int i = 0; i < n3; n3 = n38, i = n37) {
            final androidx.constraintlayout.core.widgets.c c2 = array[i];
            final boolean q = c2.q;
            final SolverVariable solverVariable = null;
            if (!q) {
                final int n5 = c2.l * n2;
                ConstraintWidget a;
                ConstraintWidget constraintWidget = a = c2.a;
                int j = 0;
                while (j == 0) {
                    ++c2.i;
                    final ConstraintWidget[] l0 = constraintWidget.l0;
                    final int k = c2.l;
                    l0[k] = null;
                    constraintWidget.k0[k] = null;
                    if (constraintWidget.f0 != 8) {
                        final ConstraintWidget.DimensionBehaviour h = constraintWidget.h(k);
                        final ConstraintWidget.DimensionBehaviour match_CONSTRAINT = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                        if (h != match_CONSTRAINT) {
                            final int m = c2.l;
                        }
                        constraintWidget.O[n5].d();
                        final ConstraintAnchor[] o = constraintWidget.O;
                        final int n6 = n5 + 1;
                        o[n6].d();
                        constraintWidget.O[n5].d();
                        constraintWidget.O[n6].d();
                        if (c2.b == null) {
                            c2.b = constraintWidget;
                        }
                        c2.d = constraintWidget;
                        final ConstraintWidget.DimensionBehaviour[] r = constraintWidget.R;
                        final int l2 = c2.l;
                        final ConstraintWidget.DimensionBehaviour dimensionBehaviour = r[l2];
                        if (dimensionBehaviour == match_CONSTRAINT) {
                            final int n7 = constraintWidget.u[l2];
                            if (n7 == 0 || n7 == 3 || n7 == 2) {
                                ++c2.j;
                                final float n8 = constraintWidget.j0[l2];
                                if (n8 > 0.0f) {
                                    c2.k += n8;
                                }
                                if (constraintWidget.f0 != 8 && dimensionBehaviour == match_CONSTRAINT && (n7 == 0 || n7 == 3)) {
                                    if (n8 < 0.0f) {
                                        c2.n = true;
                                    }
                                    else {
                                        c2.o = true;
                                    }
                                    if (c2.h == null) {
                                        c2.h = new ArrayList<ConstraintWidget>();
                                    }
                                    c2.h.add(constraintWidget);
                                }
                                if (c2.f == null) {
                                    c2.f = constraintWidget;
                                }
                                final ConstraintWidget g = c2.g;
                                if (g != null) {
                                    g.k0[c2.l] = constraintWidget;
                                }
                                c2.g = constraintWidget;
                            }
                        }
                    }
                    if (a != constraintWidget) {
                        a.l0[c2.l] = constraintWidget;
                    }
                    final ConstraintAnchor f = constraintWidget.O[n5 + 1].f;
                    ConstraintWidget d2 = null;
                    Label_0593: {
                        if (f != null) {
                            d2 = f.d;
                            final ConstraintAnchor f2 = d2.O[n5].f;
                            if (f2 != null && f2.d == constraintWidget) {
                                break Label_0593;
                            }
                        }
                        d2 = null;
                    }
                    if (d2 == null) {
                        d2 = constraintWidget;
                        j = 1;
                    }
                    final ConstraintWidget constraintWidget2 = constraintWidget;
                    constraintWidget = d2;
                    a = constraintWidget2;
                }
                final ConstraintWidget b = c2.b;
                if (b != null) {
                    b.O[n5].d();
                }
                final ConstraintWidget d3 = c2.d;
                if (d3 != null) {
                    d3.O[n5 + 1].d();
                }
                c2.c = constraintWidget;
                if (c2.l == 0 && c2.m) {
                    c2.e = constraintWidget;
                }
                else {
                    c2.e = c2.a;
                }
                c2.p = (c2.o && c2.n);
            }
            c2.q = true;
            Label_3823: {
                if (list == null || list.contains(c2.a)) {
                    final ConstraintWidget a2 = c2.a;
                    final ConstraintWidget c3 = c2.c;
                    final ConstraintWidget b2 = c2.b;
                    final ConstraintWidget d4 = c2.d;
                    final ConstraintWidget e = c2.e;
                    float k2 = c2.k;
                    final boolean b3 = ((ConstraintWidget)d).R[n] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    while (true) {
                        int n10 = 0;
                        boolean b5 = false;
                        Label_0986: {
                            int n9;
                            boolean b6;
                            if (n == 0) {
                                final int h2 = e.h0;
                                boolean b4;
                                if (h2 == 0) {
                                    b4 = true;
                                }
                                else {
                                    b4 = false;
                                }
                                if (h2 == 1) {
                                    n9 = 1;
                                }
                                else {
                                    n9 = 0;
                                }
                                n10 = n9;
                                b5 = b4;
                                if (h2 != 2) {
                                    break Label_0986;
                                }
                                b6 = b4;
                            }
                            else {
                                final int i2 = e.i0;
                                boolean b7;
                                if (i2 == 0) {
                                    b7 = true;
                                }
                                else {
                                    b7 = false;
                                }
                                int n11;
                                if (i2 == 1) {
                                    n11 = 1;
                                }
                                else {
                                    n11 = 0;
                                }
                                n10 = n11;
                                b5 = b7;
                                if (i2 != 2) {
                                    break Label_0986;
                                }
                                b6 = b7;
                                n9 = n11;
                            }
                            final boolean b8 = true;
                            final boolean b9 = b6;
                            final int n12 = n9;
                            ConstraintWidget constraintWidget3 = a2;
                            int n13 = 0;
                            while (n13 == 0) {
                                final ConstraintAnchor constraintAnchor = constraintWidget3.O[n4];
                                int n14;
                                if (b8) {
                                    n14 = 1;
                                }
                                else {
                                    n14 = 4;
                                }
                                final int d5 = constraintAnchor.d();
                                final ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = constraintWidget3.R[n];
                                final ConstraintWidget.DimensionBehaviour match_CONSTRAINT2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                                final boolean b10 = dimensionBehaviour2 == match_CONSTRAINT2 && constraintWidget3.u[n] == 0;
                                final ConstraintAnchor f3 = constraintAnchor.f;
                                int n15 = d5;
                                if (f3 != null) {
                                    n15 = d5;
                                    if (constraintWidget3 != a2) {
                                        n15 = f3.d() + d5;
                                    }
                                }
                                int n16;
                                if (b8 && constraintWidget3 != a2 && constraintWidget3 != b2) {
                                    n16 = 8;
                                }
                                else {
                                    n16 = n14;
                                }
                                final ConstraintAnchor f4 = constraintAnchor.f;
                                if (f4 != null) {
                                    if (constraintWidget3 == b2) {
                                        c.f(constraintAnchor.i, f4.i, n15, 6);
                                    }
                                    else {
                                        c.f(constraintAnchor.i, f4.i, n15, 8);
                                    }
                                    int n17 = n16;
                                    if (b10) {
                                        n17 = n16;
                                        if (!b8) {
                                            n17 = 5;
                                        }
                                    }
                                    if (constraintWidget3 == b2 && b8 && constraintWidget3.Q[n]) {
                                        n17 = 5;
                                    }
                                    c.e(constraintAnchor.i, constraintAnchor.f.i, n15, n17);
                                }
                                if (b3) {
                                    if (constraintWidget3.f0 != 8 && constraintWidget3.R[n] == match_CONSTRAINT2) {
                                        final ConstraintAnchor[] o2 = constraintWidget3.O;
                                        c.f(o2[n4 + 1].i, o2[n4].i, 0, 5);
                                    }
                                    c.f(constraintWidget3.O[n4].i, ((ConstraintWidget)d).O[n4].i, 0, 8);
                                }
                                final ConstraintAnchor f5 = constraintWidget3.O[n4 + 1].f;
                                ConstraintWidget d6 = null;
                                Label_1429: {
                                    if (f5 != null) {
                                        d6 = f5.d;
                                        final ConstraintAnchor f6 = d6.O[n4].f;
                                        if (f6 != null && f6.d == constraintWidget3) {
                                            break Label_1429;
                                        }
                                    }
                                    d6 = null;
                                }
                                if (d6 != null) {
                                    constraintWidget3 = d6;
                                }
                                else {
                                    n13 = 1;
                                }
                            }
                            final int n18 = n3;
                            final androidx.constraintlayout.core.widgets.c[] array2 = array;
                            if (d4 != null) {
                                final ConstraintAnchor[] o3 = c3.O;
                                final int n19 = n4 + 1;
                                if (o3[n19].f != null) {
                                    final ConstraintAnchor constraintAnchor2 = d4.O[n19];
                                    Label_1620: {
                                        if (d4.R[n] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && d4.u[n] == 0 && !b8) {
                                            final ConstraintAnchor f7 = constraintAnchor2.f;
                                            if (f7.d == d) {
                                                c.e(constraintAnchor2.i, f7.i, -constraintAnchor2.d(), 5);
                                                break Label_1620;
                                            }
                                        }
                                        if (b8) {
                                            final ConstraintAnchor f8 = constraintAnchor2.f;
                                            if (f8.d == d) {
                                                c.e(constraintAnchor2.i, f8.i, -constraintAnchor2.d(), 4);
                                            }
                                        }
                                    }
                                    c.g(constraintAnchor2.i, c3.O[n19].f.i, -constraintAnchor2.d(), 6);
                                }
                            }
                            if (b3) {
                                final ConstraintAnchor[] o4 = ((ConstraintWidget)d).O;
                                final int n20 = n4 + 1;
                                final SolverVariable i3 = o4[n20].i;
                                final ConstraintAnchor constraintAnchor3 = c3.O[n20];
                                c.f(i3, constraintAnchor3.i, constraintAnchor3.d(), 8);
                            }
                            final ArrayList<ConstraintWidget> h3 = c2.h;
                            if (h3 != null) {
                                final int size = h3.size();
                                if (size > 1) {
                                    if (c2.n && !c2.p) {
                                        k2 = (float)c2.j;
                                    }
                                    ConstraintWidget constraintWidget4 = null;
                                    float n21 = 0.0f;
                                    float n23;
                                    for (int n22 = 0; n22 < size; ++n22, n21 = n23) {
                                        final ConstraintWidget constraintWidget5 = h3.get(n22);
                                        n23 = constraintWidget5.j0[n];
                                        Label_1897: {
                                            if (n23 < 0.0f) {
                                                if (c2.p) {
                                                    final ConstraintAnchor[] o5 = constraintWidget5.O;
                                                    c.e(o5[n4 + 1].i, o5[n4].i, 0, 4);
                                                    break Label_1897;
                                                }
                                                n23 = 1.0f;
                                            }
                                            final float n24 = fcmpl(n23, 0.0f);
                                            if (n24 != 0) {
                                                if (constraintWidget4 != null) {
                                                    final ConstraintAnchor[] o6 = constraintWidget4.O;
                                                    final SolverVariable i4 = o6[n4].i;
                                                    final int n25 = n4 + 1;
                                                    final SolverVariable i5 = o6[n25].i;
                                                    final ConstraintAnchor[] o7 = constraintWidget5.O;
                                                    final SolverVariable i6 = o7[n4].i;
                                                    final SolverVariable i7 = o7[n25].i;
                                                    final androidx.constraintlayout.core.b l3 = c.l();
                                                    l3.b = 0.0f;
                                                    if (k2 != 0.0f && n21 != n23) {
                                                        if (n21 == 0.0f) {
                                                            l3.d.c(i4, 1.0f);
                                                            l3.d.c(i5, -1.0f);
                                                        }
                                                        else if (n24 == 0) {
                                                            l3.d.c(i6, 1.0f);
                                                            l3.d.c(i7, -1.0f);
                                                        }
                                                        else {
                                                            final float n26 = n21 / k2 / (n23 / k2);
                                                            l3.d.c(i4, 1.0f);
                                                            l3.d.c(i5, -1.0f);
                                                            l3.d.c(i7, n26);
                                                            l3.d.c(i6, -n26);
                                                        }
                                                    }
                                                    else {
                                                        l3.d.c(i4, 1.0f);
                                                        l3.d.c(i5, -1.0f);
                                                        l3.d.c(i7, 1.0f);
                                                        l3.d.c(i6, -1.0f);
                                                    }
                                                    c.c(l3);
                                                }
                                                constraintWidget4 = constraintWidget5;
                                                continue;
                                            }
                                            final ConstraintAnchor[] o8 = constraintWidget5.O;
                                            c.e(o8[n4 + 1].i, o8[n4].i, 0, 8);
                                        }
                                        n23 = n21;
                                    }
                                }
                            }
                            int n29;
                            if (b2 != null && (b2 == d4 || b8)) {
                                final ConstraintAnchor constraintAnchor4 = a2.O[n4];
                                final ConstraintAnchor[] o9 = c3.O;
                                final int n27 = n4 + 1;
                                ConstraintAnchor constraintAnchor5 = o9[n27];
                                final ConstraintAnchor f9 = constraintAnchor4.f;
                                SolverVariable i8;
                                if (f9 != null) {
                                    i8 = f9.i;
                                }
                                else {
                                    i8 = null;
                                }
                                final ConstraintAnchor f10 = constraintAnchor5.f;
                                SolverVariable i9;
                                if (f10 != null) {
                                    i9 = f10.i;
                                }
                                else {
                                    i9 = null;
                                }
                                final ConstraintAnchor constraintAnchor6 = b2.O[n4];
                                if (d4 != null) {
                                    constraintAnchor5 = d4.O[n27];
                                }
                                if (i8 != null && i9 != null) {
                                    float n28;
                                    if (n == 0) {
                                        n28 = e.c0;
                                    }
                                    else {
                                        n28 = e.d0;
                                    }
                                    final int d7 = constraintAnchor6.d();
                                    final int d8 = constraintAnchor5.d();
                                    final SolverVariable i10 = constraintAnchor6.i;
                                    final SolverVariable i11 = constraintAnchor5.i;
                                    n29 = i;
                                    c.b(i10, i8, d7, n28, i9, i11, d8, 7);
                                }
                                else {
                                    n29 = i;
                                }
                            }
                            else {
                                final ConstraintWidget constraintWidget6 = d4;
                                final ConstraintWidget constraintWidget7 = b2;
                                if (b9 && constraintWidget7 != null) {
                                    final int j2 = c2.j;
                                    final boolean b11 = j2 > 0 && c2.i == j2;
                                    ConstraintWidget constraintWidget9;
                                    ConstraintWidget constraintWidget8 = constraintWidget9 = constraintWidget7;
                                    while (true) {
                                        n29 = i;
                                        if (constraintWidget9 == null) {
                                            break;
                                        }
                                        ConstraintWidget constraintWidget10;
                                        for (constraintWidget10 = constraintWidget9.l0[n]; constraintWidget10 != null && constraintWidget10.f0 == 8; constraintWidget10 = constraintWidget10.l0[n]) {}
                                        int n30;
                                        if (constraintWidget10 == null && constraintWidget9 != constraintWidget6) {
                                            n30 = 8;
                                        }
                                        else {
                                            final ConstraintAnchor constraintAnchor7 = constraintWidget9.O[n4];
                                            final SolverVariable i12 = constraintAnchor7.i;
                                            final ConstraintAnchor f11 = constraintAnchor7.f;
                                            SolverVariable solverVariable2;
                                            if (f11 != null) {
                                                solverVariable2 = f11.i;
                                            }
                                            else {
                                                solverVariable2 = null;
                                            }
                                            if (constraintWidget8 != constraintWidget9) {
                                                solverVariable2 = constraintWidget8.O[n4 + 1].i;
                                            }
                                            else if (constraintWidget9 == constraintWidget7) {
                                                final ConstraintAnchor f12 = a2.O[n4].f;
                                                if (f12 != null) {
                                                    solverVariable2 = f12.i;
                                                }
                                                else {
                                                    solverVariable2 = null;
                                                }
                                            }
                                            final int d9 = constraintAnchor7.d();
                                            final ConstraintAnchor[] o10 = constraintWidget9.O;
                                            final int n31 = n4 + 1;
                                            final int d10 = o10[n31].d();
                                            ConstraintAnchor f13;
                                            SolverVariable solverVariable3;
                                            if (constraintWidget10 != null) {
                                                f13 = constraintWidget10.O[n4];
                                                solverVariable3 = f13.i;
                                            }
                                            else {
                                                f13 = c3.O[n31].f;
                                                if (f13 != null) {
                                                    solverVariable3 = f13.i;
                                                }
                                                else {
                                                    solverVariable3 = null;
                                                }
                                            }
                                            final SolverVariable i13 = constraintWidget9.O[n31].i;
                                            int d11 = d10;
                                            if (f13 != null) {
                                                d11 = d10 + f13.d();
                                            }
                                            int d12 = constraintWidget8.O[n31].d() + d9;
                                            if (i12 != null && solverVariable2 != null && solverVariable3 != null && i13 != null) {
                                                if (constraintWidget9 == constraintWidget7) {
                                                    d12 = constraintWidget7.O[n4].d();
                                                }
                                                if (constraintWidget9 == constraintWidget6) {
                                                    d11 = constraintWidget6.O[n31].d();
                                                }
                                                int n32;
                                                if (b11) {
                                                    n32 = 8;
                                                }
                                                else {
                                                    n32 = 5;
                                                }
                                                final int n33 = 8;
                                                c.b(i12, solverVariable2, d12, 0.5f, solverVariable3, i13, d11, n32);
                                                n30 = n33;
                                            }
                                            else {
                                                n30 = 8;
                                            }
                                        }
                                        if (constraintWidget9.f0 != n30) {
                                            constraintWidget8 = constraintWidget9;
                                        }
                                        constraintWidget9 = constraintWidget10;
                                    }
                                }
                                else {
                                    n29 = i;
                                    if (n12 != 0) {
                                        n29 = i;
                                        if (constraintWidget7 != null) {
                                            final int j3 = c2.j;
                                            final boolean b12 = j3 > 0 && c2.i == j3;
                                            ConstraintWidget constraintWidget12;
                                            ConstraintWidget constraintWidget13;
                                            for (ConstraintWidget constraintWidget11 = constraintWidget12 = constraintWidget7; constraintWidget12 != null; constraintWidget12 = constraintWidget13) {
                                                for (constraintWidget13 = constraintWidget12.l0[n]; constraintWidget13 != null && constraintWidget13.f0 == 8; constraintWidget13 = constraintWidget13.l0[n]) {}
                                                if (constraintWidget12 != constraintWidget7 && constraintWidget12 != constraintWidget6 && constraintWidget13 != null) {
                                                    if (constraintWidget13 == constraintWidget6) {
                                                        constraintWidget13 = null;
                                                    }
                                                    final ConstraintAnchor constraintAnchor8 = constraintWidget12.O[n4];
                                                    final SolverVariable i14 = constraintAnchor8.i;
                                                    final ConstraintAnchor[] o11 = constraintWidget11.O;
                                                    final int n34 = n4 + 1;
                                                    final SolverVariable i15 = o11[n34].i;
                                                    final int d13 = constraintAnchor8.d();
                                                    int d14 = constraintWidget12.O[n34].d();
                                                    ConstraintAnchor constraintAnchor9;
                                                    SolverVariable solverVariable4;
                                                    SolverVariable solverVariable5;
                                                    if (constraintWidget13 != null) {
                                                        constraintAnchor9 = constraintWidget13.O[n4];
                                                        solverVariable4 = constraintAnchor9.i;
                                                        final ConstraintAnchor f14 = constraintAnchor9.f;
                                                        if (f14 != null) {
                                                            solverVariable5 = f14.i;
                                                        }
                                                        else {
                                                            solverVariable5 = null;
                                                        }
                                                    }
                                                    else {
                                                        constraintAnchor9 = constraintWidget6.O[n4];
                                                        if (constraintAnchor9 != null) {
                                                            solverVariable4 = constraintAnchor9.i;
                                                        }
                                                        else {
                                                            solverVariable4 = null;
                                                        }
                                                        solverVariable5 = constraintWidget12.O[n34].i;
                                                    }
                                                    if (constraintAnchor9 != null) {
                                                        d14 += constraintAnchor9.d();
                                                    }
                                                    final int d15 = constraintWidget11.O[n34].d();
                                                    int n35;
                                                    if (b12) {
                                                        n35 = 8;
                                                    }
                                                    else {
                                                        n35 = 4;
                                                    }
                                                    if (i14 != null && i15 != null && solverVariable4 != null && solverVariable5 != null) {
                                                        c.b(i14, i15, d15 + d13, 0.5f, solverVariable4, solverVariable5, d14, n35);
                                                    }
                                                }
                                                if (constraintWidget12.f0 != 8) {
                                                    constraintWidget11 = constraintWidget12;
                                                }
                                            }
                                            final ConstraintAnchor constraintAnchor10 = constraintWidget7.O[n4];
                                            final ConstraintAnchor f15 = a2.O[n4].f;
                                            final ConstraintAnchor[] o12 = constraintWidget6.O;
                                            final int n36 = n4 + 1;
                                            final ConstraintAnchor constraintAnchor11 = o12[n36];
                                            final ConstraintAnchor f16 = c3.O[n36].f;
                                            if (f15 != null) {
                                                if (constraintWidget7 != constraintWidget6) {
                                                    c.e(constraintAnchor10.i, f15.i, constraintAnchor10.d(), 5);
                                                }
                                                else if (f16 != null) {
                                                    c.b(constraintAnchor10.i, f15.i, constraintAnchor10.d(), 0.5f, constraintAnchor11.i, f16.i, constraintAnchor11.d(), 5);
                                                }
                                            }
                                            n29 = i;
                                            if (f16 != null) {
                                                n29 = i;
                                                if (constraintWidget7 != constraintWidget6) {
                                                    c.e(constraintAnchor11.i, f16.i, -constraintAnchor11.d(), 5);
                                                    n29 = i;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (!b9) {
                                n37 = n29;
                                array = array2;
                                n38 = n18;
                                if (n12 == 0) {
                                    break Label_3823;
                                }
                            }
                            n37 = n29;
                            array = array2;
                            n38 = n18;
                            if (b2 == null) {
                                break Label_3823;
                            }
                            n37 = n29;
                            array = array2;
                            n38 = n18;
                            if (b2 == d4) {
                                break Label_3823;
                            }
                            final ConstraintAnchor[] o13 = b2.O;
                            final ConstraintAnchor constraintAnchor12 = o13[n4];
                            ConstraintWidget constraintWidget14;
                            if (d4 == null) {
                                constraintWidget14 = b2;
                            }
                            else {
                                constraintWidget14 = d4;
                            }
                            final ConstraintAnchor[] o14 = constraintWidget14.O;
                            final int n39 = n4 + 1;
                            ConstraintAnchor constraintAnchor13 = o14[n39];
                            final ConstraintAnchor f17 = constraintAnchor12.f;
                            SolverVariable i16;
                            if (f17 != null) {
                                i16 = f17.i;
                            }
                            else {
                                i16 = null;
                            }
                            final ConstraintAnchor f18 = constraintAnchor13.f;
                            SolverVariable i17;
                            if (f18 != null) {
                                i17 = f18.i;
                            }
                            else {
                                i17 = null;
                            }
                            SolverVariable solverVariable6;
                            if (c3 != constraintWidget14) {
                                final ConstraintAnchor f19 = c3.O[n39].f;
                                SolverVariable i18 = solverVariable;
                                if (f19 != null) {
                                    i18 = f19.i;
                                }
                                solverVariable6 = i18;
                            }
                            else {
                                solverVariable6 = i17;
                            }
                            if (b2 == constraintWidget14) {
                                constraintAnchor13 = o13[n39];
                            }
                            n37 = n29;
                            array = array2;
                            n38 = n18;
                            if (i16 == null) {
                                break Label_3823;
                            }
                            n37 = n29;
                            array = array2;
                            n38 = n18;
                            if (solverVariable6 != null) {
                                c.b(constraintAnchor12.i, i16, constraintAnchor12.d(), 0.5f, solverVariable6, constraintAnchor13.i, constraintWidget14.O[n39].d(), 5);
                                n38 = n18;
                                array = array2;
                                n37 = n29;
                            }
                            break Label_3823;
                        }
                        final boolean b9 = b5;
                        final boolean b8 = false;
                        final int n12 = n10;
                        continue;
                    }
                }
                n37 = i;
                n38 = n3;
            }
            ++n37;
            n2 = 2;
        }
    }
}
