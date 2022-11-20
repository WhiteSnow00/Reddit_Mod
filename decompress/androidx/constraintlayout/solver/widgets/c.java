// 
// Decompiled by Procyon v0.6.0
// 

package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.b;
import androidx.constraintlayout.solver.SolverVariable;
import java.util.ArrayList;

public final class c
{
    public static void a(final e e, final androidx.constraintlayout.solver.c c, final int n) {
        e e2 = e;
        int n2;
        d[] array;
        int n3;
        if (n == 0) {
            n2 = e2.m0;
            array = e2.p0;
            n3 = 0;
        }
        else {
            n2 = e2.n0;
            array = e2.o0;
            n3 = 2;
        }
        int i = 0;
        final d[] array2 = array;
        androidx.constraintlayout.solver.c c2 = c;
        while (i < n2) {
            final d d = array2[i];
            int n7;
            if (!d.q) {
                final int n4 = d.l * 2;
                ConstraintWidget a;
                ConstraintWidget constraintWidget = a = d.a;
                int j = 0;
                while (j == 0) {
                    ++d.i;
                    final ConstraintWidget[] h0 = constraintWidget.h0;
                    final int l = d.l;
                    h0[l] = null;
                    constraintWidget.g0[l] = null;
                    final int y = constraintWidget.Y;
                    if (y != 8) {
                        if (d.b == null) {
                            d.b = constraintWidget;
                        }
                        d.d = constraintWidget;
                        final ConstraintWidget.DimensionBehaviour dimensionBehaviour = constraintWidget.C[l];
                        final ConstraintWidget.DimensionBehaviour match_CONSTRAINT = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                        if (dimensionBehaviour == match_CONSTRAINT) {
                            final int n5 = constraintWidget.g[l];
                            if (n5 == 0 || n5 == 3 || n5 == 2) {
                                ++d.j;
                                final float n6 = constraintWidget.f0[l];
                                if (n6 > 0.0f) {
                                    d.k += n6;
                                }
                                if (y != 8 && dimensionBehaviour == match_CONSTRAINT && (n5 == 0 || n5 == 3)) {
                                    if (n6 < 0.0f) {
                                        d.n = true;
                                    }
                                    else {
                                        d.o = true;
                                    }
                                    if (d.h == null) {
                                        d.h = new ArrayList<ConstraintWidget>();
                                    }
                                    d.h.add(constraintWidget);
                                }
                                if (d.f == null) {
                                    d.f = constraintWidget;
                                }
                                final ConstraintWidget g = d.g;
                                if (g != null) {
                                    g.g0[d.l] = constraintWidget;
                                }
                                d.g = constraintWidget;
                            }
                        }
                    }
                    if (a != constraintWidget) {
                        a.h0[d.l] = constraintWidget;
                    }
                    final ConstraintAnchor d2 = constraintWidget.A[n4 + 1].d;
                    ConstraintWidget b = null;
                    Label_0492: {
                        if (d2 != null) {
                            b = d2.b;
                            final ConstraintAnchor d3 = b.A[n4].d;
                            if (d3 != null && d3.b == constraintWidget) {
                                break Label_0492;
                            }
                        }
                        b = null;
                    }
                    if (b == null) {
                        b = constraintWidget;
                        j = 1;
                    }
                    final ConstraintWidget constraintWidget2 = b;
                    a = constraintWidget;
                    constraintWidget = constraintWidget2;
                }
                d.c = constraintWidget;
                if (d.l == 0 && d.m) {
                    d.e = constraintWidget;
                }
                else {
                    d.e = d.a;
                }
                d.p = (d.o && d.n);
                n7 = n2;
            }
            else {
                n7 = n2;
            }
            d.q = true;
            androidx.constraintlayout.solver.c c4 = null;
            Label_2415: {
                if (e2.C(4)) {
                    ConstraintWidget a2 = d.a;
                    final ConstraintWidget c3 = d.c;
                    final ConstraintWidget b2 = d.b;
                    final ConstraintWidget d4 = d.d;
                    final ConstraintWidget e3 = d.e;
                    final float k = d.k;
                    final ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ((ConstraintWidget)e2).C[n];
                    final ConstraintWidget.DimensionBehaviour fixed = ConstraintWidget.DimensionBehaviour.FIXED;
                    int n10 = 0;
                    int n13 = 0;
                    int n14 = 0;
                    Label_0814: {
                        int n9 = 0;
                        Label_0807: {
                            if (n == 0) {
                                final int d5 = e3.d0;
                                int n8;
                                if (d5 == 0) {
                                    n8 = 1;
                                }
                                else {
                                    n8 = 0;
                                }
                                if (d5 == 1) {
                                    n9 = 1;
                                }
                                else {
                                    n9 = 0;
                                }
                                if (d5 != 2) {
                                    n10 = n8;
                                    break Label_0807;
                                }
                                n10 = n8;
                            }
                            else {
                                final int e4 = e3.e0;
                                int n11;
                                if (e4 == 0) {
                                    n11 = 1;
                                }
                                else {
                                    n11 = 0;
                                }
                                int n12;
                                if (e4 == 1) {
                                    n12 = 1;
                                }
                                else {
                                    n12 = 0;
                                }
                                if (e4 != 2) {
                                    n10 = n11;
                                    n9 = n12;
                                    break Label_0807;
                                }
                                n10 = n11;
                                n9 = n12;
                            }
                            n13 = 1;
                            n14 = n9;
                            break Label_0814;
                        }
                        n13 = 0;
                        n14 = n9;
                    }
                    ConstraintWidget constraintWidget3 = a2;
                    int n15 = 0;
                    int n16 = 0;
                    float n17 = 0.0f;
                    float n18 = 0.0f;
                    int n19 = 0;
                    final d d6 = d;
                Label_1050:
                    while (true) {
                        while (true) {
                            while (n19 == 0) {
                                final int y2 = constraintWidget3.Y;
                                int n20 = n15;
                                float n21 = n17;
                                float n22 = n18;
                                if (y2 != 8) {
                                    n20 = n15 + 1;
                                    int n23;
                                    if (n == 0) {
                                        n23 = constraintWidget3.k();
                                    }
                                    else {
                                        n23 = constraintWidget3.g();
                                    }
                                    float n25;
                                    final float n24 = n25 = n17 + n23;
                                    if (constraintWidget3 != b2) {
                                        n25 = n24 + constraintWidget3.A[n3].b();
                                    }
                                    n21 = n25;
                                    if (constraintWidget3 != d4) {
                                        n21 = n25 + constraintWidget3.A[n3 + 1].b();
                                    }
                                    n22 = n18 + constraintWidget3.A[n3].b() + constraintWidget3.A[n3 + 1].b();
                                }
                                final ConstraintAnchor[] a3 = constraintWidget3.A;
                                final ConstraintAnchor constraintAnchor = a3[n3];
                                int n26 = n16;
                                Label_1115: {
                                    if (constraintWidget3.Y != 8) {
                                        n26 = n16;
                                        if (constraintWidget3.C[n] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                                            n26 = n16 + 1;
                                            Label_1112: {
                                                if (n == 0) {
                                                    if (constraintWidget3.e != 0) {
                                                        break Label_1050;
                                                    }
                                                    if (constraintWidget3.h != 0) {
                                                        break Label_1050;
                                                    }
                                                    if (constraintWidget3.i != 0) {
                                                        break Label_1050;
                                                    }
                                                }
                                                else {
                                                    if (constraintWidget3.f != 0 || constraintWidget3.k != 0) {
                                                        break Label_1050;
                                                    }
                                                    if (constraintWidget3.l != 0) {
                                                        break Label_1112;
                                                    }
                                                }
                                                if (constraintWidget3.G == 0.0f) {
                                                    break Label_1115;
                                                }
                                                final boolean b3 = false;
                                                e2 = e;
                                                c4 = c2;
                                                if (!b3) {
                                                    b(e, c2, n, n3, d6);
                                                    e2 = e;
                                                    c4 = c2;
                                                }
                                                break Label_2415;
                                            }
                                            continue Label_1050;
                                        }
                                    }
                                }
                                final ConstraintAnchor d7 = a3[n3 + 1].d;
                                ConstraintWidget b4 = null;
                                Label_1170: {
                                    if (d7 != null) {
                                        b4 = d7.b;
                                        final ConstraintAnchor d8 = b4.A[n3].d;
                                        if (d8 != null && d8.b == constraintWidget3) {
                                            break Label_1170;
                                        }
                                    }
                                    b4 = null;
                                }
                                if (b4 != null) {
                                    n15 = n20;
                                    n16 = n26;
                                    constraintWidget3 = b4;
                                    n17 = n21;
                                    n18 = n22;
                                }
                                else {
                                    n19 = 1;
                                    n15 = n20;
                                    n16 = n26;
                                    n17 = n21;
                                    n18 = n22;
                                }
                            }
                            final i a4 = a2.A[n3].a;
                            final ConstraintAnchor[] a5 = c3.A;
                            final int n27 = n3 + 1;
                            final i a6 = a5[n27].a;
                            final i d9 = a4.d;
                            if (d9 != null) {
                                final i d10 = a6.d;
                                if (d10 != null) {
                                    if (d9.b == 1) {
                                        if (d10.b == 1) {
                                            if (n16 <= 0 || n16 == n15) {
                                                float n28;
                                                if (n13 == 0 && n10 == 0 && n14 == 0) {
                                                    n28 = 0.0f;
                                                }
                                                else {
                                                    float n29;
                                                    if (b2 != null) {
                                                        n29 = (float)b2.A[n3].b();
                                                    }
                                                    else {
                                                        n29 = 0.0f;
                                                    }
                                                    n28 = n29;
                                                    if (d4 != null) {
                                                        n28 = n29 + d4.A[n27].b();
                                                    }
                                                }
                                                final float g2 = a4.d.g;
                                                final float g3 = a6.d.g;
                                                float n30;
                                                if (g2 < g3) {
                                                    n30 = g3 - g2;
                                                }
                                                else {
                                                    n30 = g2 - g3;
                                                }
                                                final float n31 = n30 - n17;
                                                float n32 = -1.0f;
                                                if (n16 <= 0 || n16 != n15) {
                                                    c2 = c;
                                                    if (n31 < 0.0f) {
                                                        n10 = 0;
                                                        n13 = 1;
                                                        n14 = 0;
                                                    }
                                                    if (n13 != 0) {
                                                        if (n == 0) {
                                                            n32 = a2.V;
                                                        }
                                                        else if (n == 1) {
                                                            n32 = a2.W;
                                                        }
                                                        float n33 = (n31 - n28) * n32 + g2;
                                                        while (a2 != null) {
                                                            final ConstraintWidget constraintWidget4 = a2.h0[n];
                                                            float n34 = 0.0f;
                                                            Label_1957: {
                                                                if (constraintWidget4 == null) {
                                                                    n34 = n33;
                                                                    if (a2 != c3) {
                                                                        break Label_1957;
                                                                    }
                                                                }
                                                                int n35;
                                                                if (n == 0) {
                                                                    n35 = a2.k();
                                                                }
                                                                else {
                                                                    n35 = a2.g();
                                                                }
                                                                final float n36 = (float)n35;
                                                                final float n37 = n33 + a2.A[n3].b();
                                                                a2.A[n3].a.k(a4.f, n37);
                                                                final i a7 = a2.A[n27].a;
                                                                final i f = a4.f;
                                                                final float n38 = n37 + n36;
                                                                a7.k(f, n38);
                                                                a2.A[n3].a.f(c2);
                                                                a2.A[n27].a.f(c2);
                                                                n34 = n38 + a2.A[n27].b();
                                                            }
                                                            a2 = constraintWidget4;
                                                            n33 = n34;
                                                        }
                                                    }
                                                    else if (n10 != 0 || n14 != 0) {
                                                        float n39 = 0.0f;
                                                        Label_2006: {
                                                            if (n10 == 0) {
                                                                n39 = n31;
                                                                if (n14 == 0) {
                                                                    break Label_2006;
                                                                }
                                                            }
                                                            n39 = n31 - n28;
                                                        }
                                                        float n40 = n39 / (n15 + 1);
                                                        if (n14 != 0) {
                                                            float n41;
                                                            if (n15 > 1) {
                                                                n41 = (float)(n15 - 1);
                                                            }
                                                            else {
                                                                n41 = 2.0f;
                                                            }
                                                            n40 = n39 / n41;
                                                        }
                                                        float n42;
                                                        if (a2.Y != 8) {
                                                            n42 = g2 + n40;
                                                        }
                                                        else {
                                                            n42 = g2;
                                                        }
                                                        float n43 = n42;
                                                        if (n14 != 0) {
                                                            n43 = n42;
                                                            if (n15 > 1) {
                                                                n43 = b2.A[n3].b() + g2;
                                                            }
                                                        }
                                                        float n44 = n43;
                                                        if (n10 != 0) {
                                                            n44 = n43;
                                                            if (b2 != null) {
                                                                n44 = n43 + b2.A[n3].b();
                                                            }
                                                        }
                                                        float n45 = n44;
                                                        while (a2 != null) {
                                                            final ConstraintWidget constraintWidget5 = a2.h0[n];
                                                            if (constraintWidget5 != null || a2 == c3) {
                                                                int n46;
                                                                if (n == 0) {
                                                                    n46 = a2.k();
                                                                }
                                                                else {
                                                                    n46 = a2.g();
                                                                }
                                                                final float n47 = (float)n46;
                                                                float n48 = n45;
                                                                if (a2 != b2) {
                                                                    n48 = n45 + a2.A[n3].b();
                                                                }
                                                                a2.A[n3].a.k(a4.f, n48);
                                                                a2.A[n27].a.k(a4.f, n48 + n47);
                                                                a2.A[n3].a.f(c2);
                                                                a2.A[n27].a.f(c2);
                                                                final float n49 = n45 = n47 + a2.A[n27].b() + n48;
                                                                if (constraintWidget5 != null) {
                                                                    n45 = n49;
                                                                    if (constraintWidget5.Y != 8) {
                                                                        n45 = n49 + n40;
                                                                    }
                                                                }
                                                            }
                                                            a2 = constraintWidget5;
                                                        }
                                                    }
                                                    final boolean b3 = true;
                                                    continue;
                                                }
                                                final ConstraintWidget d11 = constraintWidget3.D;
                                                if (d11 == null || d11.C[n] != ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                                                    final float n50 = n31 + n17 - n18;
                                                    float n51 = g2;
                                                    ConstraintWidget constraintWidget7;
                                                    for (ConstraintWidget constraintWidget6 = a2; constraintWidget6 != null; constraintWidget6 = constraintWidget7) {
                                                        constraintWidget7 = constraintWidget6.h0[n];
                                                        if (constraintWidget7 != null || constraintWidget6 == c3) {
                                                            float n52 = n50 / n16;
                                                            if (k > 0.0f) {
                                                                final float n53 = constraintWidget6.f0[n];
                                                                if (n53 == -1.0f) {
                                                                    n52 = 0.0f;
                                                                }
                                                                else {
                                                                    n52 = n53 * n50 / k;
                                                                }
                                                            }
                                                            if (constraintWidget6.Y == 8) {
                                                                n52 = 0.0f;
                                                            }
                                                            final float n54 = n51 + constraintWidget6.A[n3].b();
                                                            constraintWidget6.A[n3].a.k(a4.f, n54);
                                                            final i a8 = constraintWidget6.A[n27].a;
                                                            final i f2 = a4.f;
                                                            final float n55 = n54 + n52;
                                                            a8.k(f2, n55);
                                                            constraintWidget6.A[n3].a.f(c);
                                                            constraintWidget6.A[n27].a.f(c);
                                                            n51 = n55 + constraintWidget6.A[n27].b();
                                                        }
                                                    }
                                                    c2 = c;
                                                    final boolean b3 = true;
                                                    continue;
                                                }
                                            }
                                        }
                                    }
                                }
                                c2 = c;
                            }
                            break;
                        }
                        continue Label_1050;
                    }
                }
                else {
                    b(e2, c2, n, n3, d);
                    c4 = c2;
                }
            }
            ++i;
            c2 = c4;
            n2 = n7;
        }
    }
    
    public static void b(final e e, final androidx.constraintlayout.solver.c c, int n, int b, final d d) {
        final ConstraintWidget a = d.a;
        final ConstraintWidget c2 = d.c;
        final ConstraintWidget b2 = d.b;
        final ConstraintWidget d2 = d.d;
        final ConstraintWidget e2 = d.e;
        float k = d.k;
        final boolean b3 = ((ConstraintWidget)e).C[n] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        while (true) {
            int n4 = 0;
            int n5 = 0;
            Label_0180: {
                int n2;
                int n3;
                if (n == 0) {
                    final int d3 = e2.d0;
                    if (d3 == 0) {
                        n2 = 1;
                    }
                    else {
                        n2 = 0;
                    }
                    if (d3 == 1) {
                        n3 = 1;
                    }
                    else {
                        n3 = 0;
                    }
                    n4 = n2;
                    n5 = n3;
                    if (d3 != 2) {
                        break Label_0180;
                    }
                }
                else {
                    final int e3 = e2.e0;
                    if (e3 == 0) {
                        n2 = 1;
                    }
                    else {
                        n2 = 0;
                    }
                    if (e3 == 1) {
                        n3 = 1;
                    }
                    else {
                        n3 = 0;
                    }
                    n4 = n2;
                    n5 = n3;
                    if (e3 != 2) {
                        break Label_0180;
                    }
                }
                final boolean b4 = true;
                final int n6 = n3;
                ConstraintWidget constraintWidget = a;
                final int n7 = 0;
                final int n8 = n2;
                int n9 = n7;
                SolverVariable solverVariable;
                while (true) {
                    solverVariable = null;
                    final ConstraintWidget constraintWidget2 = null;
                    if (n9 != 0) {
                        break;
                    }
                    final ConstraintAnchor constraintAnchor = constraintWidget.A[b];
                    int n10;
                    if (!b3 && !b4) {
                        n10 = 4;
                    }
                    else {
                        n10 = 1;
                    }
                    final int b5 = constraintAnchor.b();
                    final ConstraintAnchor d4 = constraintAnchor.d;
                    int n11 = b5;
                    if (d4 != null) {
                        n11 = b5;
                        if (constraintWidget != a) {
                            n11 = d4.b() + b5;
                        }
                    }
                    if (b4 && constraintWidget != a && constraintWidget != b2) {
                        n10 = 6;
                    }
                    else if (n8 != 0 && b3) {
                        n10 = 4;
                    }
                    final ConstraintAnchor d5 = constraintAnchor.d;
                    if (d5 != null) {
                        if (constraintWidget == b2) {
                            c.f(constraintAnchor.i, d5.i, n11, 5);
                        }
                        else {
                            c.f(constraintAnchor.i, d5.i, n11, 6);
                        }
                        c.e(constraintAnchor.i, constraintAnchor.d.i, n11, n10);
                    }
                    if (b3) {
                        if (constraintWidget.Y != 8 && constraintWidget.C[n] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                            final ConstraintAnchor[] a2 = constraintWidget.A;
                            c.f(a2[b + 1].i, a2[b].i, 0, 5);
                        }
                        c.f(constraintWidget.A[b].i, ((ConstraintWidget)e).A[b].i, 0, 6);
                    }
                    final ConstraintAnchor d6 = constraintWidget.A[b + 1].d;
                    ConstraintWidget constraintWidget3 = constraintWidget2;
                    if (d6 != null) {
                        final ConstraintWidget b6 = d6.b;
                        final ConstraintAnchor d7 = b6.A[b].d;
                        constraintWidget3 = constraintWidget2;
                        if (d7 != null) {
                            if (d7.b != constraintWidget) {
                                constraintWidget3 = constraintWidget2;
                            }
                            else {
                                constraintWidget3 = b6;
                            }
                        }
                    }
                    if (constraintWidget3 != null) {
                        constraintWidget = constraintWidget3;
                    }
                    else {
                        n9 = 1;
                    }
                }
                if (d2 != null) {
                    final ConstraintAnchor[] a3 = c2.A;
                    final int n12 = b + 1;
                    final ConstraintAnchor d8 = a3[n12].d;
                    if (d8 != null) {
                        final ConstraintAnchor constraintAnchor2 = d2.A[n12];
                        c.g(constraintAnchor2.i, d8.i, -constraintAnchor2.b(), 5);
                    }
                }
                if (b3) {
                    final ConstraintAnchor[] a4 = ((ConstraintWidget)e).A;
                    final int n13 = b + 1;
                    final SolverVariable i = a4[n13].i;
                    final ConstraintAnchor constraintAnchor3 = c2.A[n13];
                    c.f(i, constraintAnchor3.i, constraintAnchor3.b(), 6);
                }
                final ArrayList<ConstraintWidget> h = d.h;
                if (h != null) {
                    final int size = h.size();
                    if (size > 1) {
                        if (d.n && !d.p) {
                            k = (float)d.j;
                        }
                        float n14 = 0.0f;
                        ConstraintWidget constraintWidget4 = null;
                        int j = 0;
                        final float n15 = k;
                        while (j < size) {
                            final ConstraintWidget constraintWidget5 = h.get(j);
                            float n16 = constraintWidget5.f0[n];
                            Label_0892: {
                                if (n16 < 0.0f) {
                                    if (d.p) {
                                        final ConstraintAnchor[] a5 = constraintWidget5.A;
                                        c.e(a5[b + 1].i, a5[b].i, 0, 4);
                                        break Label_0892;
                                    }
                                    n16 = 1.0f;
                                }
                                final float n17 = fcmpl(n16, 0.0f);
                                if (n17 == 0) {
                                    final ConstraintAnchor[] a6 = constraintWidget5.A;
                                    c.e(a6[b + 1].i, a6[b].i, 0, 6);
                                }
                                else {
                                    if (constraintWidget4 != null) {
                                        final ConstraintAnchor[] a7 = constraintWidget4.A;
                                        final SolverVariable l = a7[b].i;
                                        final int n18 = b + 1;
                                        final SolverVariable m = a7[n18].i;
                                        final ConstraintAnchor[] a8 = constraintWidget5.A;
                                        final SolverVariable i2 = a8[b].i;
                                        final SolverVariable i3 = a8[n18].i;
                                        final b k2 = c.k();
                                        k2.b = 0.0f;
                                        if (n15 != 0.0f && n14 != n16) {
                                            if (n14 == 0.0f) {
                                                k2.c.f(l, 1.0f);
                                                k2.c.f(m, -1.0f);
                                            }
                                            else if (n17 == 0) {
                                                k2.c.f(i2, 1.0f);
                                                k2.c.f(i3, -1.0f);
                                            }
                                            else {
                                                final float n19 = n14 / n15 / (n16 / n15);
                                                k2.c.f(l, 1.0f);
                                                k2.c.f(m, -1.0f);
                                                k2.c.f(i3, n19);
                                                k2.c.f(i2, -n19);
                                            }
                                        }
                                        else {
                                            k2.c.f(l, 1.0f);
                                            k2.c.f(m, -1.0f);
                                            k2.c.f(i3, 1.0f);
                                            k2.c.f(i2, -1.0f);
                                        }
                                        c.c(k2);
                                    }
                                    constraintWidget4 = constraintWidget5;
                                    n14 = n16;
                                }
                            }
                            ++j;
                        }
                    }
                }
                if (b2 != null && (b2 == d2 || b4)) {
                    ConstraintAnchor constraintAnchor4 = a.A[b];
                    final ConstraintAnchor[] a9 = c2.A;
                    final int n20 = b + 1;
                    ConstraintAnchor constraintAnchor5 = a9[n20];
                    final ConstraintAnchor d9 = constraintAnchor4.d;
                    SolverVariable i4;
                    if (d9 != null) {
                        i4 = d9.i;
                    }
                    else {
                        i4 = null;
                    }
                    final ConstraintAnchor d10 = constraintAnchor5.d;
                    SolverVariable i5;
                    if (d10 != null) {
                        i5 = d10.i;
                    }
                    else {
                        i5 = null;
                    }
                    if (b2 == d2) {
                        final ConstraintAnchor[] a10 = b2.A;
                        constraintAnchor4 = a10[b];
                        constraintAnchor5 = a10[n20];
                    }
                    if (i4 != null && i5 != null) {
                        float n21;
                        if (n == 0) {
                            n21 = e2.V;
                        }
                        else {
                            n21 = e2.W;
                        }
                        final int b7 = constraintAnchor4.b();
                        n = constraintAnchor5.b();
                        c.b(constraintAnchor4.i, i4, b7, n21, i5, constraintAnchor5.i, n, 5);
                    }
                }
                else if (n8 != 0 && b2 != null) {
                    final int j2 = d.j;
                    final boolean b8 = j2 > 0 && d.i == j2;
                    ConstraintWidget constraintWidget7;
                    ConstraintWidget constraintWidget8;
                    for (ConstraintWidget constraintWidget6 = constraintWidget7 = b2; constraintWidget6 != null; constraintWidget6 = constraintWidget8) {
                        for (constraintWidget8 = constraintWidget6.h0[n]; constraintWidget8 != null && constraintWidget8.Y == 8; constraintWidget8 = constraintWidget8.h0[n]) {}
                        if (constraintWidget8 != null || constraintWidget6 == d2) {
                            final ConstraintAnchor constraintAnchor6 = constraintWidget6.A[b];
                            final SolverVariable i6 = constraintAnchor6.i;
                            final ConstraintAnchor d11 = constraintAnchor6.d;
                            SolverVariable i7;
                            if (d11 != null) {
                                i7 = d11.i;
                            }
                            else {
                                i7 = null;
                            }
                            SolverVariable solverVariable2;
                            if (constraintWidget7 != constraintWidget6) {
                                solverVariable2 = constraintWidget7.A[b + 1].i;
                            }
                            else {
                                solverVariable2 = i7;
                                if (constraintWidget6 == b2) {
                                    solverVariable2 = i7;
                                    if (constraintWidget7 == constraintWidget6) {
                                        final ConstraintAnchor d12 = a.A[b].d;
                                        if (d12 != null) {
                                            solverVariable2 = d12.i;
                                        }
                                        else {
                                            solverVariable2 = null;
                                        }
                                    }
                                }
                            }
                            final int b9 = constraintAnchor6.b();
                            final ConstraintAnchor[] a11 = constraintWidget6.A;
                            final int n22 = b + 1;
                            final int b10 = a11[n22].b();
                            ConstraintAnchor d13;
                            SolverVariable solverVariable3;
                            SolverVariable solverVariable4;
                            if (constraintWidget8 != null) {
                                d13 = constraintWidget8.A[b];
                                solverVariable3 = d13.i;
                                solverVariable4 = constraintWidget6.A[n22].i;
                            }
                            else {
                                d13 = c2.A[n22].d;
                                if (d13 != null) {
                                    solverVariable3 = d13.i;
                                }
                                else {
                                    solverVariable3 = null;
                                }
                                solverVariable4 = constraintWidget6.A[n22].i;
                            }
                            int b11 = b10;
                            if (d13 != null) {
                                b11 = b10 + d13.b();
                            }
                            int b12 = b9;
                            if (constraintWidget7 != null) {
                                b12 = b9 + constraintWidget7.A[n22].b();
                            }
                            if (i6 != null && solverVariable2 != null && solverVariable3 != null && solverVariable4 != null) {
                                if (constraintWidget6 == b2) {
                                    b12 = b2.A[b].b();
                                }
                                if (constraintWidget6 == d2) {
                                    b11 = d2.A[n22].b();
                                }
                                int n23;
                                if (b8) {
                                    n23 = 6;
                                }
                                else {
                                    n23 = 4;
                                }
                                c.b(i6, solverVariable2, b12, 0.5f, solverVariable3, solverVariable4, b11, n23);
                            }
                        }
                        if (constraintWidget6.Y != 8) {
                            constraintWidget7 = constraintWidget6;
                        }
                    }
                }
                else if (n6 != 0 && b2 != null) {
                    final int j3 = d.j;
                    final boolean b13 = j3 > 0 && d.i == j3;
                    ConstraintWidget constraintWidget10;
                    ConstraintWidget constraintWidget12;
                    for (ConstraintWidget constraintWidget9 = constraintWidget10 = b2; constraintWidget9 != null; constraintWidget9 = constraintWidget12) {
                        ConstraintWidget constraintWidget11;
                        for (constraintWidget11 = constraintWidget9.h0[n]; constraintWidget11 != null && constraintWidget11.Y == 8; constraintWidget11 = constraintWidget11.h0[n]) {}
                        constraintWidget12 = constraintWidget11;
                        if (constraintWidget9 != b2) {
                            constraintWidget12 = constraintWidget11;
                            if (constraintWidget9 != d2 && (constraintWidget12 = constraintWidget11) != null) {
                                if (constraintWidget11 == d2) {
                                    constraintWidget11 = null;
                                }
                                final ConstraintAnchor constraintAnchor7 = constraintWidget9.A[b];
                                final SolverVariable i8 = constraintAnchor7.i;
                                final ConstraintAnchor[] a12 = constraintWidget10.A;
                                final int n24 = b + 1;
                                final SolverVariable i9 = a12[n24].i;
                                final int b14 = constraintAnchor7.b();
                                int b15 = constraintWidget9.A[n24].b();
                                ConstraintAnchor d14;
                                SolverVariable i10;
                                SolverVariable i11;
                                if (constraintWidget11 != null) {
                                    d14 = constraintWidget11.A[b];
                                    i10 = d14.i;
                                    final ConstraintAnchor d15 = d14.d;
                                    if (d15 != null) {
                                        i11 = d15.i;
                                    }
                                    else {
                                        i11 = null;
                                    }
                                }
                                else {
                                    final ConstraintAnchor constraintAnchor8 = constraintWidget9.A[n24];
                                    d14 = constraintAnchor8.d;
                                    SolverVariable i12;
                                    if (d14 != null) {
                                        i12 = d14.i;
                                    }
                                    else {
                                        i12 = null;
                                    }
                                    final SolverVariable i13 = constraintAnchor8.i;
                                    i10 = i12;
                                    i11 = i13;
                                }
                                if (d14 != null) {
                                    b15 += d14.b();
                                }
                                final int b16 = constraintWidget10.A[n24].b();
                                int n25;
                                if (b13) {
                                    n25 = 6;
                                }
                                else {
                                    n25 = 4;
                                }
                                if (i8 != null && i9 != null && i10 != null && i11 != null) {
                                    c.b(i8, i9, b16 + b14, 0.5f, i10, i11, b15, n25);
                                }
                                constraintWidget12 = constraintWidget11;
                            }
                        }
                        if (constraintWidget9.Y != 8) {
                            constraintWidget10 = constraintWidget9;
                        }
                    }
                    final ConstraintAnchor constraintAnchor9 = b2.A[b];
                    final ConstraintAnchor d16 = a.A[b].d;
                    final ConstraintAnchor[] a13 = d2.A;
                    n = b + 1;
                    final ConstraintAnchor constraintAnchor10 = a13[n];
                    final ConstraintAnchor d17 = c2.A[n].d;
                    if (d16 != null) {
                        if (b2 != d2) {
                            c.e(constraintAnchor9.i, d16.i, constraintAnchor9.b(), 5);
                        }
                        else if (d17 != null) {
                            c.b(constraintAnchor9.i, d16.i, constraintAnchor9.b(), 0.5f, constraintAnchor10.i, d17.i, constraintAnchor10.b(), 5);
                        }
                    }
                    if (d17 != null && b2 != d2) {
                        c.e(constraintAnchor10.i, d17.i, -constraintAnchor10.b(), 5);
                    }
                }
                if ((n8 != 0 || n6 != 0) && b2 != null) {
                    final ConstraintAnchor[] a14 = b2.A;
                    final ConstraintAnchor constraintAnchor11 = a14[b];
                    final ConstraintAnchor[] a15 = d2.A;
                    ++b;
                    ConstraintAnchor constraintAnchor12 = a15[b];
                    final ConstraintAnchor d18 = constraintAnchor11.d;
                    SolverVariable i14;
                    if (d18 != null) {
                        i14 = d18.i;
                    }
                    else {
                        i14 = null;
                    }
                    final ConstraintAnchor d19 = constraintAnchor12.d;
                    SolverVariable solverVariable5;
                    if (d19 != null) {
                        solverVariable5 = d19.i;
                    }
                    else {
                        solverVariable5 = null;
                    }
                    if (c2 != d2) {
                        final ConstraintAnchor d20 = c2.A[b].d;
                        solverVariable5 = solverVariable;
                        if (d20 != null) {
                            solverVariable5 = d20.i;
                        }
                    }
                    if (b2 == d2) {
                        constraintAnchor12 = a14[b];
                    }
                    if (i14 != null && solverVariable5 != null) {
                        n = constraintAnchor11.b();
                        b = d2.A[b].b();
                        c.b(constraintAnchor11.i, i14, n, 0.5f, solverVariable5, constraintAnchor12.i, b, 5);
                    }
                }
                return;
            }
            final boolean b4 = false;
            int n2 = n4;
            final int n6 = n5;
            continue;
        }
    }
}
