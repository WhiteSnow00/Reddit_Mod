// 
// Decompiled by Procyon v0.6.0
// 

package androidx.constraintlayout.solver.widgets;

import h3.a;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;

public final class f
{
    public List<ConstraintWidget> a;
    public boolean b;
    public final int[] c;
    public ArrayList d;
    public ArrayList e;
    public HashSet<ConstraintWidget> f;
    public HashSet<ConstraintWidget> g;
    public ArrayList h;
    public ArrayList i;
    
    public f(final ArrayList a) {
        this.b = false;
        this.c = new int[] { -1, -1 };
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new HashSet<ConstraintWidget>();
        this.g = new HashSet<ConstraintWidget>();
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.a = a;
    }
    
    public f(final ArrayList a, final int n) {
        this.b = false;
        this.c = new int[] { -1, -1 };
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new HashSet<ConstraintWidget>();
        this.g = new HashSet<ConstraintWidget>();
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.a = a;
        this.b = true;
    }
    
    public static void b(final ArrayList list, final ConstraintWidget constraintWidget) {
        if (constraintWidget.c0) {
            return;
        }
        list.add(constraintWidget);
        constraintWidget.c0 = true;
        if (constraintWidget.n()) {
            return;
        }
        final boolean b = constraintWidget instanceof a;
        final int n = 0;
        if (b) {
            final a a = (a)constraintWidget;
            for (int j0 = a.j0, i = 0; i < j0; ++i) {
                b(list, a.i0[i]);
            }
        }
        for (int length = constraintWidget.A.length, k = n; k < length; ++k) {
            final ConstraintAnchor d = constraintWidget.A[k].d;
            if (d != null) {
                final ConstraintWidget b2 = d.b;
                if (b2 != constraintWidget.D) {
                    b(list, b2);
                }
            }
        }
    }
    
    public static void c(final ConstraintWidget constraintWidget) {
        if (constraintWidget.a0) {
            if (constraintWidget.n()) {
                return;
            }
            ConstraintAnchor constraintAnchor = constraintWidget.u.d;
            boolean b = false;
            final boolean b2 = constraintAnchor != null;
            if (!b2) {
                constraintAnchor = constraintWidget.s.d;
            }
            int i = 0;
            Label_0140: {
                if (constraintAnchor != null) {
                    final ConstraintWidget b3 = constraintAnchor.b;
                    if (!b3.b0) {
                        c(b3);
                    }
                    final ConstraintAnchor.Type c = constraintAnchor.c;
                    if (c == ConstraintAnchor.Type.RIGHT) {
                        final ConstraintWidget b4 = constraintAnchor.b;
                        i = b4.k() + b4.I;
                        break Label_0140;
                    }
                    if (c == ConstraintAnchor.Type.LEFT) {
                        i = constraintAnchor.b.I;
                        break Label_0140;
                    }
                }
                i = 0;
            }
            int n;
            if (b2) {
                n = i - constraintWidget.u.b();
            }
            else {
                n = i + (constraintWidget.k() + constraintWidget.s.b());
            }
            final int j = n - constraintWidget.k();
            constraintWidget.I = j;
            final int e = n - j;
            constraintWidget.E = e;
            final int r = constraintWidget.R;
            if (e < r) {
                constraintWidget.E = r;
            }
            final ConstraintAnchor d = constraintWidget.w.d;
            if (d != null) {
                final ConstraintWidget b5 = d.b;
                if (!b5.b0) {
                    c(b5);
                }
                final ConstraintWidget b6 = d.b;
                final int k = b6.J + b6.Q - constraintWidget.Q;
                final int f = constraintWidget.F;
                constraintWidget.J = k;
                final int f2 = f + k - k;
                constraintWidget.F = f2;
                final int s = constraintWidget.S;
                if (f2 < s) {
                    constraintWidget.F = s;
                }
                constraintWidget.b0 = true;
                return;
            }
            ConstraintAnchor constraintAnchor2 = constraintWidget.v.d;
            if (constraintAnchor2 != null) {
                b = true;
            }
            if (!b) {
                constraintAnchor2 = constraintWidget.t.d;
            }
            int l = n;
            if (constraintAnchor2 != null) {
                final ConstraintWidget b7 = constraintAnchor2.b;
                if (!b7.b0) {
                    c(b7);
                }
                final ConstraintAnchor.Type c2 = constraintAnchor2.c;
                if (c2 == ConstraintAnchor.Type.BOTTOM) {
                    final ConstraintWidget b8 = constraintAnchor2.b;
                    l = b8.g() + b8.J;
                }
                else {
                    l = n;
                    if (c2 == ConstraintAnchor.Type.TOP) {
                        l = constraintAnchor2.b.J;
                    }
                }
            }
            int n2;
            if (b) {
                n2 = l - constraintWidget.v.b();
            }
            else {
                n2 = l + (constraintWidget.g() + constraintWidget.t.b());
            }
            final int m = n2 - constraintWidget.g();
            constraintWidget.J = m;
            final int f3 = n2 - m;
            constraintWidget.F = f3;
            final int s2 = constraintWidget.S;
            if (f3 < s2) {
                constraintWidget.F = s2;
            }
            constraintWidget.b0 = true;
        }
    }
    
    public final void a(final int n, final ConstraintWidget constraintWidget) {
        if (n == 0) {
            this.f.add(constraintWidget);
        }
        else if (n == 1) {
            this.g.add(constraintWidget);
        }
    }
}
