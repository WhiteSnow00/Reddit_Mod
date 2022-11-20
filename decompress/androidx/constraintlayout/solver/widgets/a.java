// 
// Decompiled by Procyon v0.6.0
// 

package androidx.constraintlayout.solver.widgets;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import h3.c;
import java.util.ArrayList;

public final class a
{
    public static int a(final f f, final int n) {
        final int n2 = n * 2;
        ArrayList list;
        if (n == 0) {
            list = f.d;
        }
        else if (n == 1) {
            list = f.e;
        }
        else {
            f.getClass();
            list = null;
        }
        final int size = list.size();
        int i = 0;
        int max = 0;
        while (i < size) {
            final ConstraintWidget constraintWidget = (ConstraintWidget)list.get(i);
            final ConstraintAnchor[] a = constraintWidget.A;
            max = Math.max(max, b(constraintWidget, n, a[n2 + 1].d == null || a[n2].d != null, 0));
            ++i;
        }
        return f.c[n] = max;
    }
    
    public static int b(final ConstraintWidget constraintWidget, final int n, final boolean b, int n2) {
        final boolean a0 = constraintWidget.a0;
        final int n3 = 0;
        if (!a0) {
            return 0;
        }
        final boolean b2 = constraintWidget.w.d != null && n == 1;
        int q;
        int q2;
        int n4;
        int n5;
        if (b) {
            q = constraintWidget.Q;
            q2 = constraintWidget.g() - constraintWidget.Q;
            n4 = n * 2;
            n5 = n4 + 1;
        }
        else {
            final int g = constraintWidget.g();
            q2 = constraintWidget.Q;
            q = g - q2;
            n5 = n * 2;
            n4 = n5 + 1;
        }
        final ConstraintAnchor[] a2 = constraintWidget.A;
        int n8;
        if (a2[n5].d != null && a2[n4].d == null) {
            final int n6 = -1;
            final int n7 = n4;
            n4 = n5;
            n5 = n7;
            n8 = n6;
        }
        else {
            n8 = 1;
        }
        if (b2) {
            n2 -= q;
        }
        final int n9 = c(n, constraintWidget) + a2[n4].b() * n8;
        final int n10 = n2 + n9;
        if (n == 0) {
            n2 = constraintWidget.k();
        }
        else {
            n2 = constraintWidget.g();
        }
        final int n11 = n2 * n8;
        final Iterator iterator = constraintWidget.A[n4].a.a.iterator();
        n2 = n3;
        while (iterator.hasNext()) {
            n2 = Math.max(n2, b(((i)iterator.next()).c.b, n, b, n10));
        }
        final Iterator iterator2 = constraintWidget.A[n5].a.a.iterator();
        int max = 0;
        while (iterator2.hasNext()) {
            max = Math.max(max, b(((i)iterator2.next()).c.b, n, b, n11 + n10));
        }
        int n12;
        int n13;
        if (b2) {
            n2 -= q;
            n12 = max + q2;
            n13 = n2;
        }
        else {
            int n14;
            if (n == 0) {
                n14 = constraintWidget.k();
            }
            else {
                n14 = constraintWidget.g();
            }
            n12 = max + n14 * n8;
            n13 = n2;
        }
        if (n == 1) {
            final Iterator iterator3 = constraintWidget.w.a.a.iterator();
            n2 = 0;
            while (iterator3.hasNext()) {
                final i i = (i)iterator3.next();
                if (n8 == 1) {
                    n2 = Math.max(n2, b(i.c.b, n, b, q + n10));
                }
                else {
                    n2 = Math.max(n2, b(i.c.b, n, b, q2 * n8 + n10));
                }
            }
            if (constraintWidget.w.a.a.size() > 0 && !b2) {
                if (n8 == 1) {
                    n2 += q;
                }
                else {
                    n2 -= q2;
                }
            }
        }
        else {
            n2 = 0;
        }
        final int max2 = Math.max(n13, Math.max(n12, n2));
        int n16;
        final int n15 = n16 = n11 + n10;
        n2 = n10;
        if (n8 == -1) {
            n2 = n15;
            n16 = n10;
        }
        if (b) {
            h.b(constraintWidget, n, n2);
            if (n == 0) {
                constraintWidget.I = n2;
                final int e = n16 - n2;
                constraintWidget.E = e;
                n2 = constraintWidget.R;
                if (e < n2) {
                    constraintWidget.E = n2;
                }
            }
            else if (n == 1) {
                constraintWidget.J = n2;
                n2 = n16 - n2;
                constraintWidget.F = n2;
                final int s = constraintWidget.S;
                if (n2 < s) {
                    constraintWidget.F = s;
                }
            }
            constraintWidget.b0 = true;
        }
        else {
            constraintWidget.p.a(n, constraintWidget);
            if (n == 0) {
                constraintWidget.K = n2;
            }
            else if (n == 1) {
                constraintWidget.L = n2;
            }
        }
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        if (n == 0) {
            dimensionBehaviour = constraintWidget.C[0];
        }
        else if (n == 1) {
            dimensionBehaviour = constraintWidget.C[1];
        }
        else {
            dimensionBehaviour = null;
        }
        if (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.G != 0.0f) {
            constraintWidget.p.a(n, constraintWidget);
        }
        final ConstraintAnchor[] a3 = constraintWidget.A;
        final ConstraintAnchor d = a3[n4].d;
        if (d != null) {
            final ConstraintAnchor d2 = a3[n5].d;
            if (d2 != null) {
                final ConstraintWidget d3 = constraintWidget.D;
                if (d.b == d3 && d2.b == d3) {
                    constraintWidget.p.a(n, constraintWidget);
                }
            }
        }
        return max2 + n9;
    }
    
    public static int c(int h, final ConstraintWidget constraintWidget) {
        final int n = h * 2;
        final ConstraintAnchor[] a = constraintWidget.A;
        final ConstraintAnchor constraintAnchor = a[n];
        final ConstraintAnchor constraintAnchor2 = a[n + 1];
        final ConstraintAnchor d = constraintAnchor.d;
        if (d != null) {
            final ConstraintWidget b = d.b;
            final ConstraintWidget d2 = constraintWidget.D;
            if (b == d2) {
                final ConstraintAnchor d3 = constraintAnchor2.d;
                if (d3 != null && d3.b == d2) {
                    final int h2 = d2.h(h);
                    float n2;
                    if (h == 0) {
                        n2 = constraintWidget.V;
                    }
                    else {
                        n2 = constraintWidget.W;
                    }
                    h = constraintWidget.h(h);
                    return (int)((h2 - constraintAnchor.b() - constraintAnchor2.b() - h) * n2);
                }
            }
        }
        return 0;
    }
    
    public static int d(final ConstraintWidget constraintWidget) {
        final ConstraintWidget.DimensionBehaviour[] c = constraintWidget.C;
        final ConstraintWidget.DimensionBehaviour dimensionBehaviour = c[0];
        final ConstraintWidget.DimensionBehaviour match_CONSTRAINT = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        int n2;
        if (dimensionBehaviour == match_CONSTRAINT) {
            float n;
            if (constraintWidget.H == 0) {
                n = constraintWidget.g() * constraintWidget.G;
            }
            else {
                n = constraintWidget.g() / constraintWidget.G;
            }
            n2 = (int)n;
            constraintWidget.w(n2);
        }
        else if (c[1] == match_CONSTRAINT) {
            float n3;
            if (constraintWidget.H == 1) {
                n3 = constraintWidget.k() * constraintWidget.G;
            }
            else {
                n3 = constraintWidget.k() / constraintWidget.G;
            }
            n2 = (int)n3;
            constraintWidget.s(n2);
        }
        else {
            n2 = -1;
        }
        return n2;
    }
    
    public static void e(final int n, final int n2, final ArrayList list) {
        for (int size = list.size(), i = 0; i < size; ++i) {
            final f f = (f)list.get(i);
            HashSet<ConstraintWidget> set;
            if (n == 0) {
                set = f.f;
            }
            else if (n == 1) {
                set = f.g;
            }
            else {
                f.getClass();
                set = null;
            }
            for (final ConstraintWidget constraintWidget : set) {
                if (constraintWidget.a0) {
                    final int n3 = n * 2;
                    final ConstraintAnchor[] a = constraintWidget.A;
                    final ConstraintAnchor constraintAnchor = a[n3];
                    final ConstraintAnchor constraintAnchor2 = a[n3 + 1];
                    if (constraintAnchor.d != null && constraintAnchor2.d != null) {
                        h.b(constraintWidget, n, constraintAnchor.b() + c(n, constraintWidget));
                    }
                    else {
                        if (constraintWidget.G != 0.0f) {
                            Enum<ConstraintWidget.DimensionBehaviour> enum1;
                            if (n == 0) {
                                enum1 = constraintWidget.C[0];
                            }
                            else if (n == 1) {
                                enum1 = constraintWidget.C[1];
                            }
                            else {
                                enum1 = null;
                            }
                            if (enum1 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                                final int d = d(constraintWidget);
                                final int n4 = (int)constraintWidget.A[n3].a.g;
                                final int n5 = n4 + d;
                                final i a2 = constraintAnchor2.a;
                                a2.f = constraintAnchor.a;
                                a2.g = (float)d;
                                a2.b = 1;
                                if (n == 0) {
                                    constraintWidget.I = n4;
                                    final int e = n5 - n4;
                                    constraintWidget.E = e;
                                    final int r = constraintWidget.R;
                                    if (e < r) {
                                        constraintWidget.E = r;
                                    }
                                }
                                else if (n == 1) {
                                    constraintWidget.J = n4;
                                    final int f2 = n5 - n4;
                                    constraintWidget.F = f2;
                                    final int s = constraintWidget.S;
                                    if (f2 < s) {
                                        constraintWidget.F = s;
                                    }
                                }
                                constraintWidget.b0 = true;
                                continue;
                            }
                        }
                        int n6;
                        if (n == 0) {
                            n6 = constraintWidget.K;
                        }
                        else if (n == 1) {
                            n6 = constraintWidget.L;
                        }
                        else {
                            n6 = 0;
                        }
                        final int n7 = n2 - n6;
                        final int n8 = n7 - constraintWidget.h(n);
                        if (n == 0) {
                            constraintWidget.I = n8;
                            final int e2 = n7 - n8;
                            constraintWidget.E = e2;
                            final int r2 = constraintWidget.R;
                            if (e2 < r2) {
                                constraintWidget.E = r2;
                            }
                        }
                        else if (n == 1) {
                            constraintWidget.J = n8;
                            final int f3 = n7 - n8;
                            constraintWidget.F = f3;
                            final int s2 = constraintWidget.S;
                            if (f3 < s2) {
                                constraintWidget.F = s2;
                            }
                        }
                        constraintWidget.b0 = true;
                        h.b(constraintWidget, n, n8);
                    }
                }
            }
        }
    }
    
    public static boolean f(final ConstraintWidget constraintWidget, final f f, final ArrayList list, final boolean b) {
        if (constraintWidget == null) {
            return true;
        }
        constraintWidget.b0 = false;
        final e e = (e)constraintWidget.D;
        final f p4 = constraintWidget.p;
        if (p4 == null) {
            constraintWidget.a0 = true;
            f.a.add(constraintWidget);
            constraintWidget.p = f;
            final ConstraintAnchor d = constraintWidget.s.d;
            if (d == null && constraintWidget.u.d == null && constraintWidget.t.d == null && constraintWidget.v.d == null && constraintWidget.w.d == null && constraintWidget.z.d == null) {
                f.b = false;
                e.x0 = false;
                constraintWidget.a0 = false;
                if (b) {
                    return false;
                }
            }
            final ConstraintAnchor d2 = constraintWidget.t.d;
            if (d2 != null) {
                final ConstraintAnchor d3 = constraintWidget.v.d;
                if (d3 != null) {
                    final ConstraintWidget.DimensionBehaviour dimensionBehaviour = ((ConstraintWidget)e).C[1];
                    final ConstraintWidget.DimensionBehaviour fixed = ConstraintWidget.DimensionBehaviour.FIXED;
                    if (b) {
                        f.b = false;
                        e.x0 = false;
                        return constraintWidget.a0 = false;
                    }
                    final ConstraintWidget b2 = d2.b;
                    final ConstraintWidget d4 = constraintWidget.D;
                    if (b2 != d4 || d3.b != d4) {
                        f.b = false;
                        e.x0 = false;
                        constraintWidget.a0 = false;
                    }
                }
            }
            if (d != null) {
                final ConstraintAnchor d5 = constraintWidget.u.d;
                if (d5 != null) {
                    final ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ((ConstraintWidget)e).C[0];
                    final ConstraintWidget.DimensionBehaviour fixed2 = ConstraintWidget.DimensionBehaviour.FIXED;
                    if (b) {
                        f.b = false;
                        e.x0 = false;
                        return constraintWidget.a0 = false;
                    }
                    final ConstraintWidget b3 = d.b;
                    final ConstraintWidget d6 = constraintWidget.D;
                    if (b3 != d6 || d5.b != d6) {
                        f.b = false;
                        e.x0 = false;
                        constraintWidget.a0 = false;
                    }
                }
            }
            final ConstraintWidget.DimensionBehaviour[] c = constraintWidget.C;
            final ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = c[0];
            final ConstraintWidget.DimensionBehaviour match_CONSTRAINT = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
            final boolean b4 = dimensionBehaviour3 == match_CONSTRAINT;
            final ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = c[1];
            if ((b4 ^ dimensionBehaviour4 == match_CONSTRAINT) && constraintWidget.G != 0.0f) {
                d(constraintWidget);
            }
            else if (dimensionBehaviour3 == match_CONSTRAINT || dimensionBehaviour4 == match_CONSTRAINT) {
                f.b = false;
                e.x0 = false;
                constraintWidget.a0 = false;
                if (b) {
                    return false;
                }
            }
            final ConstraintAnchor d7 = constraintWidget.s.d;
            Label_0620: {
                if ((d7 != null || constraintWidget.u.d != null) && (d7 == null || d7.b != constraintWidget.D || constraintWidget.u.d != null)) {
                    final ConstraintAnchor d8 = constraintWidget.u.d;
                    if (d8 == null || d8.b != constraintWidget.D || d7 != null) {
                        if (d7 == null) {
                            break Label_0620;
                        }
                        final ConstraintWidget b5 = d7.b;
                        final ConstraintWidget d9 = constraintWidget.D;
                        if (b5 != d9 || d8 == null || d8.b != d9) {
                            break Label_0620;
                        }
                    }
                }
                if (constraintWidget.z.d == null && !(constraintWidget instanceof g) && !(constraintWidget instanceof h3.a)) {
                    f.d.add(constraintWidget);
                }
            }
            final ConstraintAnchor d10 = constraintWidget.t.d;
            Label_0785: {
                if ((d10 != null || constraintWidget.v.d != null) && (d10 == null || d10.b != constraintWidget.D || constraintWidget.v.d != null)) {
                    final ConstraintAnchor d11 = constraintWidget.v.d;
                    if (d11 == null || d11.b != constraintWidget.D || d10 != null) {
                        if (d10 == null) {
                            break Label_0785;
                        }
                        final ConstraintWidget b6 = d10.b;
                        final ConstraintWidget d12 = constraintWidget.D;
                        if (b6 != d12 || d11 == null || d11.b != d12) {
                            break Label_0785;
                        }
                    }
                }
                if (constraintWidget.z.d == null && constraintWidget.w.d == null && !(constraintWidget instanceof g) && !(constraintWidget instanceof h3.a)) {
                    f.e.add(constraintWidget);
                }
            }
            if (constraintWidget instanceof h3.a) {
                f.b = false;
                e.x0 = false;
                constraintWidget.a0 = false;
                if (b) {
                    return false;
                }
                final h3.a a = (h3.a)constraintWidget;
                for (int i = 0; i < a.j0; ++i) {
                    if (!f(a.i0[i], f, list, b)) {
                        return false;
                    }
                }
            }
            for (int length = constraintWidget.A.length, j = 0; j < length; ++j) {
                final ConstraintAnchor constraintAnchor = constraintWidget.A[j];
                final ConstraintAnchor d13 = constraintAnchor.d;
                if (d13 != null && d13.b != constraintWidget.D) {
                    if (constraintAnchor.c == ConstraintAnchor.Type.CENTER) {
                        f.b = false;
                        e.x0 = false;
                        constraintWidget.a0 = false;
                        if (b) {
                            return false;
                        }
                    }
                    else {
                        final i a2 = constraintAnchor.a;
                        if (d13.d != constraintAnchor) {
                            d13.a.a((c)a2);
                        }
                    }
                    if (!f(constraintAnchor.d.b, f, list, b)) {
                        return false;
                    }
                }
            }
            return true;
        }
        if (p4 != f) {
            f.a.addAll(p4.a);
            f.d.addAll(constraintWidget.p.d);
            f.e.addAll(constraintWidget.p.e);
            final f p5 = constraintWidget.p;
            if (!p5.b) {
                f.b = false;
            }
            list.remove(p5);
            final Iterator<ConstraintWidget> iterator = constraintWidget.p.a.iterator();
            while (iterator.hasNext()) {
                iterator.next().p = f;
            }
        }
        return true;
    }
}
