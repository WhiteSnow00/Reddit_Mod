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
        int n2;
        androidx.constraintlayout.core.widgets.c[] array;
        int n3;
        if (n == 0) {
            n2 = d.w0;
            array = d.z0;
            n3 = 0;
        }
        else {
            n2 = d.x0;
            array = d.y0;
            n3 = 2;
        }
        int n35;
    Label_3791:
        for (int i = 0; i < n2; i = n35 + 1) {
            final androidx.constraintlayout.core.widgets.c c2 = array[i];
            final boolean q = c2.q;
            final SolverVariable solverVariable = null;
            if (!q) {
                final int n4 = c2.l * 2;
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
                        constraintWidget.O[n4].d();
                        final ConstraintAnchor[] o = constraintWidget.O;
                        final int n5 = n4 + 1;
                        o[n5].d();
                        constraintWidget.O[n4].d();
                        constraintWidget.O[n5].d();
                        if (c2.b == null) {
                            c2.b = constraintWidget;
                        }
                        c2.d = constraintWidget;
                        final ConstraintWidget.DimensionBehaviour[] r = constraintWidget.R;
                        final int l2 = c2.l;
                        final ConstraintWidget.DimensionBehaviour dimensionBehaviour = r[l2];
                        if (dimensionBehaviour == match_CONSTRAINT) {
                            final int n6 = constraintWidget.u[l2];
                            if (n6 == 0 || n6 == 3 || n6 == 2) {
                                ++c2.j;
                                final float n7 = constraintWidget.j0[l2];
                                if (n7 > 0.0f) {
                                    c2.k += n7;
                                }
                                if (constraintWidget.f0 != 8 && dimensionBehaviour == match_CONSTRAINT && (n6 == 0 || n6 == 3)) {
                                    if (n7 < 0.0f) {
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
                    final ConstraintAnchor f = constraintWidget.O[n4 + 1].f;
                    ConstraintWidget d2 = null;
                    Label_0576: {
                        if (f != null) {
                            d2 = f.d;
                            final ConstraintAnchor f2 = d2.O[n4].f;
                            if (f2 != null && f2.d == constraintWidget) {
                                break Label_0576;
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
                    b.O[n4].d();
                }
                final ConstraintWidget d3 = c2.d;
                if (d3 != null) {
                    d3.O[n4 + 1].d();
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
            if (list == null || list.contains(c2.a)) {
                final ConstraintWidget a2 = c2.a;
                final ConstraintWidget c3 = c2.c;
                final ConstraintWidget b2 = c2.b;
                final ConstraintWidget d4 = c2.d;
                final ConstraintWidget e = c2.e;
                float k2 = c2.k;
                final boolean b3 = ((ConstraintWidget)d).R[n] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                while (true) {
                    int n9 = 0;
                    boolean b5 = false;
                    Label_0962: {
                        int n8;
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
                                n8 = 1;
                            }
                            else {
                                n8 = 0;
                            }
                            n9 = n8;
                            b5 = b4;
                            if (h2 != 2) {
                                break Label_0962;
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
                            int n10;
                            if (i2 == 1) {
                                n10 = 1;
                            }
                            else {
                                n10 = 0;
                            }
                            n9 = n10;
                            b5 = b7;
                            if (i2 != 2) {
                                break Label_0962;
                            }
                            b6 = b7;
                            n8 = n10;
                        }
                        final boolean b8 = true;
                        final boolean b9 = b6;
                        final int n11 = n8;
                        ConstraintWidget constraintWidget3 = a2;
                        int n12 = 0;
                        while (n12 == 0) {
                            final ConstraintAnchor constraintAnchor = constraintWidget3.O[n3];
                            int n13;
                            if (b8) {
                                n13 = 1;
                            }
                            else {
                                n13 = 4;
                            }
                            final int d5 = constraintAnchor.d();
                            final ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = constraintWidget3.R[n];
                            final ConstraintWidget.DimensionBehaviour match_CONSTRAINT2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                            final boolean b10 = dimensionBehaviour2 == match_CONSTRAINT2 && constraintWidget3.u[n] == 0;
                            final ConstraintAnchor f3 = constraintAnchor.f;
                            int n14 = d5;
                            if (f3 != null) {
                                n14 = d5;
                                if (constraintWidget3 != a2) {
                                    n14 = f3.d() + d5;
                                }
                            }
                            int n15;
                            if (b8 && constraintWidget3 != a2 && constraintWidget3 != b2) {
                                n15 = 8;
                            }
                            else {
                                n15 = n13;
                            }
                            final ConstraintAnchor f4 = constraintAnchor.f;
                            if (f4 != null) {
                                if (constraintWidget3 == b2) {
                                    c.f(constraintAnchor.i, f4.i, n14, 6);
                                }
                                else {
                                    c.f(constraintAnchor.i, f4.i, n14, 8);
                                }
                                int n16 = n15;
                                if (b10) {
                                    n16 = n15;
                                    if (!b8) {
                                        n16 = 5;
                                    }
                                }
                                if (constraintWidget3 == b2 && b8 && constraintWidget3.Q[n]) {
                                    n16 = 5;
                                }
                                c.e(constraintAnchor.i, constraintAnchor.f.i, n14, n16);
                            }
                            if (b3) {
                                if (constraintWidget3.f0 != 8 && constraintWidget3.R[n] == match_CONSTRAINT2) {
                                    final ConstraintAnchor[] o2 = constraintWidget3.O;
                                    c.f(o2[n3 + 1].i, o2[n3].i, 0, 5);
                                }
                                c.f(constraintWidget3.O[n3].i, ((ConstraintWidget)d).O[n3].i, 0, 8);
                            }
                            final ConstraintAnchor f5 = constraintWidget3.O[n3 + 1].f;
                            ConstraintWidget d6 = null;
                            Label_1404: {
                                if (f5 != null) {
                                    d6 = f5.d;
                                    final ConstraintAnchor f6 = d6.O[n3].f;
                                    if (f6 != null && f6.d == constraintWidget3) {
                                        break Label_1404;
                                    }
                                }
                                d6 = null;
                            }
                            if (d6 != null) {
                                constraintWidget3 = d6;
                            }
                            else {
                                n12 = 1;
                            }
                        }
                        final int n17 = n2;
                        final androidx.constraintlayout.core.widgets.c[] array2 = array;
                        if (d4 != null) {
                            final ConstraintAnchor[] o3 = c3.O;
                            final int n18 = n3 + 1;
                            if (o3[n18].f != null) {
                                final ConstraintAnchor constraintAnchor2 = d4.O[n18];
                                Label_1593: {
                                    if (d4.R[n] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && d4.u[n] == 0 && !b8) {
                                        final ConstraintAnchor f7 = constraintAnchor2.f;
                                        if (f7.d == d) {
                                            c.e(constraintAnchor2.i, f7.i, -constraintAnchor2.d(), 5);
                                            break Label_1593;
                                        }
                                    }
                                    if (b8) {
                                        final ConstraintAnchor f8 = constraintAnchor2.f;
                                        if (f8.d == d) {
                                            c.e(constraintAnchor2.i, f8.i, -constraintAnchor2.d(), 4);
                                        }
                                    }
                                }
                                c.g(constraintAnchor2.i, c3.O[n18].f.i, -constraintAnchor2.d(), 6);
                            }
                        }
                        if (b3) {
                            final ConstraintAnchor[] o4 = ((ConstraintWidget)d).O;
                            final int n19 = n3 + 1;
                            final SolverVariable i3 = o4[n19].i;
                            final ConstraintAnchor constraintAnchor3 = c3.O[n19];
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
                                float n20 = 0.0f;
                                float n22;
                                for (int n21 = 0; n21 < size; ++n21, n20 = n22) {
                                    final ConstraintWidget constraintWidget5 = h3.get(n21);
                                    n22 = constraintWidget5.j0[n];
                                    Label_1869: {
                                        if (n22 < 0.0f) {
                                            if (c2.p) {
                                                final ConstraintAnchor[] o5 = constraintWidget5.O;
                                                c.e(o5[n3 + 1].i, o5[n3].i, 0, 4);
                                                break Label_1869;
                                            }
                                            n22 = 1.0f;
                                        }
                                        final float n23 = fcmpl(n22, 0.0f);
                                        if (n23 != 0) {
                                            if (constraintWidget4 != null) {
                                                final ConstraintAnchor[] o6 = constraintWidget4.O;
                                                final SolverVariable i4 = o6[n3].i;
                                                final int n24 = n3 + 1;
                                                final SolverVariable i5 = o6[n24].i;
                                                final ConstraintAnchor[] o7 = constraintWidget5.O;
                                                final SolverVariable i6 = o7[n3].i;
                                                final SolverVariable i7 = o7[n24].i;
                                                final androidx.constraintlayout.core.b l3 = c.l();
                                                l3.b = 0.0f;
                                                if (k2 != 0.0f && n20 != n22) {
                                                    if (n20 == 0.0f) {
                                                        l3.d.c(i4, 1.0f);
                                                        l3.d.c(i5, -1.0f);
                                                    }
                                                    else if (n23 == 0) {
                                                        l3.d.c(i6, 1.0f);
                                                        l3.d.c(i7, -1.0f);
                                                    }
                                                    else {
                                                        final float n25 = n20 / k2 / (n22 / k2);
                                                        l3.d.c(i4, 1.0f);
                                                        l3.d.c(i5, -1.0f);
                                                        l3.d.c(i7, n25);
                                                        l3.d.c(i6, -n25);
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
                                        c.e(o8[n3 + 1].i, o8[n3].i, 0, 8);
                                    }
                                    n22 = n20;
                                }
                            }
                        }
                        if (b2 != null && (b2 == d4 || b8)) {
                            final ConstraintAnchor constraintAnchor4 = a2.O[n3];
                            final ConstraintAnchor[] o9 = c3.O;
                            final int n26 = n3 + 1;
                            ConstraintAnchor constraintAnchor5 = o9[n26];
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
                            final ConstraintAnchor constraintAnchor6 = b2.O[n3];
                            if (d4 != null) {
                                constraintAnchor5 = d4.O[n26];
                            }
                            if (i8 != null && i9 != null) {
                                float n27;
                                if (n == 0) {
                                    n27 = e.c0;
                                }
                                else {
                                    n27 = e.d0;
                                }
                                c.b(constraintAnchor6.i, i8, constraintAnchor6.d(), n27, i9, constraintAnchor5.i, constraintAnchor5.d(), 7);
                            }
                        }
                        else if (b9 && b2 != null) {
                            final int j2 = c2.j;
                            final boolean b11 = j2 > 0 && c2.i == j2;
                            ConstraintWidget constraintWidget7;
                            ConstraintWidget constraintWidget6 = constraintWidget7 = b2;
                            final int n28 = i;
                            while (true) {
                                i = n28;
                                if (constraintWidget7 == null) {
                                    break;
                                }
                                ConstraintWidget constraintWidget8;
                                for (constraintWidget8 = constraintWidget7.l0[n]; constraintWidget8 != null && constraintWidget8.f0 == 8; constraintWidget8 = constraintWidget8.l0[n]) {}
                                if (constraintWidget8 != null || constraintWidget7 == d4) {
                                    final ConstraintAnchor constraintAnchor7 = constraintWidget7.O[n3];
                                    final SolverVariable i10 = constraintAnchor7.i;
                                    final ConstraintAnchor f11 = constraintAnchor7.f;
                                    SolverVariable solverVariable2;
                                    if (f11 != null) {
                                        solverVariable2 = f11.i;
                                    }
                                    else {
                                        solverVariable2 = null;
                                    }
                                    if (constraintWidget6 != constraintWidget7) {
                                        solverVariable2 = constraintWidget6.O[n3 + 1].i;
                                    }
                                    else if (constraintWidget7 == b2) {
                                        final ConstraintAnchor f12 = a2.O[n3].f;
                                        if (f12 != null) {
                                            solverVariable2 = f12.i;
                                        }
                                        else {
                                            solverVariable2 = null;
                                        }
                                    }
                                    final int d7 = constraintAnchor7.d();
                                    final ConstraintAnchor[] o10 = constraintWidget7.O;
                                    final int n29 = n3 + 1;
                                    final int d8 = o10[n29].d();
                                    ConstraintAnchor f13;
                                    SolverVariable solverVariable3;
                                    if (constraintWidget8 != null) {
                                        f13 = constraintWidget8.O[n3];
                                        solverVariable3 = f13.i;
                                    }
                                    else {
                                        f13 = c3.O[n29].f;
                                        if (f13 != null) {
                                            solverVariable3 = f13.i;
                                        }
                                        else {
                                            solverVariable3 = null;
                                        }
                                    }
                                    final SolverVariable i11 = constraintWidget7.O[n29].i;
                                    int d9 = d8;
                                    if (f13 != null) {
                                        d9 = d8 + f13.d();
                                    }
                                    int d10 = constraintWidget6.O[n29].d() + d7;
                                    if (i10 != null && solverVariable2 != null && solverVariable3 != null && i11 != null) {
                                        if (constraintWidget7 == b2) {
                                            d10 = b2.O[n3].d();
                                        }
                                        if (constraintWidget7 == d4) {
                                            d9 = d4.O[n29].d();
                                        }
                                        int n30;
                                        if (b11) {
                                            n30 = 8;
                                        }
                                        else {
                                            n30 = 5;
                                        }
                                        c.b(i10, solverVariable2, d10, 0.5f, solverVariable3, i11, d9, n30);
                                    }
                                }
                                if (constraintWidget7.f0 != 8) {
                                    constraintWidget6 = constraintWidget7;
                                }
                                constraintWidget7 = constraintWidget8;
                            }
                        }
                        else {
                            final int n31 = i = i;
                            if (n11 != 0) {
                                i = n31;
                                if (b2 != null) {
                                    final int j3 = c2.j;
                                    final boolean b12 = j3 > 0 && c2.i == j3;
                                    ConstraintWidget constraintWidget10;
                                    ConstraintWidget constraintWidget11;
                                    for (ConstraintWidget constraintWidget9 = constraintWidget10 = b2; constraintWidget10 != null; constraintWidget10 = constraintWidget11) {
                                        for (constraintWidget11 = constraintWidget10.l0[n]; constraintWidget11 != null && constraintWidget11.f0 == 8; constraintWidget11 = constraintWidget11.l0[n]) {}
                                        if (constraintWidget10 != b2 && constraintWidget10 != d4 && constraintWidget11 != null) {
                                            if (constraintWidget11 == d4) {
                                                constraintWidget11 = null;
                                            }
                                            final ConstraintAnchor constraintAnchor8 = constraintWidget10.O[n3];
                                            final SolverVariable i12 = constraintAnchor8.i;
                                            final ConstraintAnchor[] o11 = constraintWidget9.O;
                                            final int n32 = n3 + 1;
                                            final SolverVariable i13 = o11[n32].i;
                                            final int d11 = constraintAnchor8.d();
                                            int d12 = constraintWidget10.O[n32].d();
                                            ConstraintAnchor constraintAnchor9;
                                            SolverVariable i14;
                                            SolverVariable solverVariable4;
                                            if (constraintWidget11 != null) {
                                                constraintAnchor9 = constraintWidget11.O[n3];
                                                i14 = constraintAnchor9.i;
                                                final ConstraintAnchor f14 = constraintAnchor9.f;
                                                if (f14 != null) {
                                                    solverVariable4 = f14.i;
                                                }
                                                else {
                                                    solverVariable4 = null;
                                                }
                                            }
                                            else {
                                                final ConstraintAnchor constraintAnchor10 = d4.O[n3];
                                                SolverVariable i15;
                                                if (constraintAnchor10 != null) {
                                                    i15 = constraintAnchor10.i;
                                                }
                                                else {
                                                    i15 = null;
                                                }
                                                solverVariable4 = constraintWidget10.O[n32].i;
                                                i14 = i15;
                                                constraintAnchor9 = constraintAnchor10;
                                            }
                                            if (constraintAnchor9 != null) {
                                                d12 += constraintAnchor9.d();
                                            }
                                            final int d13 = constraintWidget9.O[n32].d();
                                            int n33;
                                            if (b12) {
                                                n33 = 8;
                                            }
                                            else {
                                                n33 = 4;
                                            }
                                            if (i12 != null && i13 != null && i14 != null && solverVariable4 != null) {
                                                c.b(i12, i13, d13 + d11, 0.5f, i14, solverVariable4, d12, n33);
                                            }
                                        }
                                        if (constraintWidget10.f0 != 8) {
                                            constraintWidget9 = constraintWidget10;
                                        }
                                    }
                                    final ConstraintAnchor constraintAnchor11 = b2.O[n3];
                                    final ConstraintAnchor f15 = a2.O[n3].f;
                                    final ConstraintAnchor[] o12 = d4.O;
                                    final int n34 = n3 + 1;
                                    final ConstraintAnchor constraintAnchor12 = o12[n34];
                                    final ConstraintAnchor f16 = c3.O[n34].f;
                                    if (f15 != null) {
                                        if (b2 != d4) {
                                            c.e(constraintAnchor11.i, f15.i, constraintAnchor11.d(), 5);
                                        }
                                        else if (f16 != null) {
                                            c.b(constraintAnchor11.i, f15.i, constraintAnchor11.d(), 0.5f, constraintAnchor12.i, f16.i, constraintAnchor12.d(), 5);
                                        }
                                    }
                                    i = n31;
                                    if (f16 != null) {
                                        i = n31;
                                        if (b2 != d4) {
                                            c.e(constraintAnchor12.i, f16.i, -constraintAnchor12.d(), 5);
                                            i = n31;
                                        }
                                    }
                                }
                            }
                        }
                        if (!b9) {
                            n35 = i;
                            array = array2;
                            n2 = n17;
                            if (n11 == 0) {
                                continue Label_3791;
                            }
                        }
                        n35 = i;
                        array = array2;
                        n2 = n17;
                        if (b2 == null) {
                            continue Label_3791;
                        }
                        n35 = i;
                        array = array2;
                        n2 = n17;
                        if (b2 == d4) {
                            continue Label_3791;
                        }
                        final ConstraintAnchor[] o13 = b2.O;
                        final ConstraintAnchor constraintAnchor13 = o13[n3];
                        ConstraintWidget constraintWidget12;
                        if (d4 == null) {
                            constraintWidget12 = b2;
                        }
                        else {
                            constraintWidget12 = d4;
                        }
                        final ConstraintAnchor[] o14 = constraintWidget12.O;
                        final int n36 = n3 + 1;
                        ConstraintAnchor constraintAnchor14 = o14[n36];
                        final ConstraintAnchor f17 = constraintAnchor13.f;
                        SolverVariable i16;
                        if (f17 != null) {
                            i16 = f17.i;
                        }
                        else {
                            i16 = null;
                        }
                        final ConstraintAnchor f18 = constraintAnchor14.f;
                        SolverVariable i17;
                        if (f18 != null) {
                            i17 = f18.i;
                        }
                        else {
                            i17 = null;
                        }
                        SolverVariable solverVariable5;
                        if (c3 != constraintWidget12) {
                            final ConstraintAnchor f19 = c3.O[n36].f;
                            SolverVariable i18 = solverVariable;
                            if (f19 != null) {
                                i18 = f19.i;
                            }
                            solverVariable5 = i18;
                        }
                        else {
                            solverVariable5 = i17;
                        }
                        if (b2 == constraintWidget12) {
                            constraintAnchor14 = o13[n36];
                        }
                        n35 = i;
                        array = array2;
                        n2 = n17;
                        if (i16 == null) {
                            continue Label_3791;
                        }
                        n35 = i;
                        array = array2;
                        n2 = n17;
                        if (solverVariable5 != null) {
                            c.b(constraintAnchor13.i, i16, constraintAnchor13.d(), 0.5f, solverVariable5, constraintAnchor14.i, constraintWidget12.O[n36].d(), 5);
                            n2 = n17;
                            array = array2;
                            n35 = i;
                        }
                        continue Label_3791;
                    }
                    final boolean b9 = b5;
                    final boolean b8 = false;
                    final int n11 = n9;
                    continue;
                }
            }
            n35 = i;
        }
    }
}
