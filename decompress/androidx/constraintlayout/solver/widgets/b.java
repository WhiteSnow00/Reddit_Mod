// 
// Decompiled by Procyon v0.6.0
// 

package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.SolverVariable;
import androidx.constraintlayout.solver.c;
import java.util.ArrayList;
import h3.a;

public final class b extends a
{
    public int k0;
    public ArrayList<i> l0;
    public boolean m0;
    
    public b() {
        this.k0 = 0;
        this.l0 = new ArrayList<i>(4);
        this.m0 = true;
    }
    
    public final void a(final c c) {
        final ConstraintAnchor[] a = ((ConstraintWidget)this).A;
        a[0] = ((ConstraintWidget)this).s;
        a[2] = ((ConstraintWidget)this).t;
        a[1] = ((ConstraintWidget)this).u;
        a[3] = ((ConstraintWidget)this).v;
        int n = 0;
        ConstraintAnchor[] a2;
        while (true) {
            a2 = ((ConstraintWidget)this).A;
            if (n >= a2.length) {
                break;
            }
            final ConstraintAnchor constraintAnchor = a2[n];
            constraintAnchor.i = c.j(constraintAnchor);
            ++n;
        }
        final int k0 = this.k0;
        if (k0 >= 0 && k0 < 4) {
            final ConstraintAnchor constraintAnchor2 = a2[k0];
            while (true) {
                for (int i = 0; i < super.j0; ++i) {
                    final ConstraintWidget constraintWidget = super.i0[i];
                    if (this.m0 || constraintWidget.b()) {
                        final int k2 = this.k0;
                        if ((k2 != 0 && k2 != 1) || constraintWidget.C[0] != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                            if ((k2 != 2 && k2 != 3) || constraintWidget.C[1] != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                                continue;
                            }
                        }
                        boolean b = true;
                        final int k3 = this.k0;
                        Label_0250: {
                            if (k3 != 0 && k3 != 1) {
                                if (((ConstraintWidget)this).D.C[1] != ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                                    break Label_0250;
                                }
                            }
                            else if (((ConstraintWidget)this).D.C[0] != ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                                break Label_0250;
                            }
                            b = false;
                        }
                        for (int j = 0; j < super.j0; ++j) {
                            final ConstraintWidget constraintWidget2 = super.i0[j];
                            if (this.m0 || constraintWidget2.b()) {
                                final SolverVariable l = c.j(constraintWidget2.A[this.k0]);
                                final ConstraintAnchor[] a3 = constraintWidget2.A;
                                final int k4 = this.k0;
                                a3[k4].i = l;
                                if (k4 != 0 && k4 != 2) {
                                    final SolverVariable m = constraintAnchor2.i;
                                    final androidx.constraintlayout.solver.b k5 = c.k();
                                    final SolverVariable l2 = c.l();
                                    k5.b(m, l, l2, l2.c = 0);
                                    if (b) {
                                        k5.c.f(c.i(1), (float)(int)(k5.c.c(l2) * -1.0f));
                                    }
                                    c.c(k5);
                                }
                                else {
                                    final SolverVariable i2 = constraintAnchor2.i;
                                    final androidx.constraintlayout.solver.b k6 = c.k();
                                    final SolverVariable l3 = c.l();
                                    k6.c(i2, l, l3, l3.c = 0);
                                    if (b) {
                                        k6.c.f(c.i(1), (float)(int)(k6.c.c(l3) * -1.0f));
                                    }
                                    c.c(k6);
                                }
                            }
                        }
                        final int k7 = this.k0;
                        if (k7 == 0) {
                            c.e(((ConstraintWidget)this).u.i, ((ConstraintWidget)this).s.i, 0, 6);
                            if (!b) {
                                c.e(((ConstraintWidget)this).s.i, ((ConstraintWidget)this).D.u.i, 0, 5);
                            }
                            return;
                        }
                        else if (k7 == 1) {
                            c.e(((ConstraintWidget)this).s.i, ((ConstraintWidget)this).u.i, 0, 6);
                            if (!b) {
                                c.e(((ConstraintWidget)this).s.i, ((ConstraintWidget)this).D.s.i, 0, 5);
                            }
                            return;
                        }
                        else if (k7 == 2) {
                            c.e(((ConstraintWidget)this).v.i, ((ConstraintWidget)this).t.i, 0, 6);
                            if (!b) {
                                c.e(((ConstraintWidget)this).t.i, ((ConstraintWidget)this).D.v.i, 0, 5);
                            }
                            return;
                        }
                        else {
                            if (k7 != 3) {
                                return;
                            }
                            c.e(((ConstraintWidget)this).t.i, ((ConstraintWidget)this).v.i, 0, 6);
                            if (!b) {
                                c.e(((ConstraintWidget)this).t.i, ((ConstraintWidget)this).D.t.i, 0, 5);
                            }
                            return;
                        }
                    }
                }
                boolean b = false;
                continue;
            }
        }
    }
    
    public final boolean b() {
        return true;
    }
    
    public final void c(int i) {
        final ConstraintWidget d = ((ConstraintWidget)this).D;
        if (d == null) {
            return;
        }
        if (!((e)d).C(2)) {
            return;
        }
        i = this.k0;
        i j;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return;
                    }
                    j = ((ConstraintWidget)this).v.a;
                }
                else {
                    j = ((ConstraintWidget)this).t.a;
                }
            }
            else {
                j = ((ConstraintWidget)this).u.a;
            }
        }
        else {
            j = ((ConstraintWidget)this).s.a;
        }
        j.h = 5;
        if (i != 0 && i != 1) {
            ((ConstraintWidget)this).s.a.k(null, 0.0f);
            ((ConstraintWidget)this).u.a.k(null, 0.0f);
        }
        else {
            ((ConstraintWidget)this).t.a.k(null, 0.0f);
            ((ConstraintWidget)this).v.a.k(null, 0.0f);
        }
        this.l0.clear();
        ConstraintWidget constraintWidget;
        int k0;
        i l;
        for (i = 0; i < super.j0; ++i) {
            constraintWidget = super.i0[i];
            if (this.m0 || constraintWidget.b()) {
                k0 = this.k0;
                if (k0 != 0) {
                    if (k0 != 1) {
                        if (k0 != 2) {
                            if (k0 != 3) {
                                l = null;
                            }
                            else {
                                l = constraintWidget.v.a;
                            }
                        }
                        else {
                            l = constraintWidget.t.a;
                        }
                    }
                    else {
                        l = constraintWidget.u.a;
                    }
                }
                else {
                    l = constraintWidget.s.a;
                }
                if (l != null) {
                    this.l0.add(l);
                    l.a((h3.c)j);
                }
            }
        }
    }
    
    public final void p() {
        super.p();
        this.l0.clear();
    }
    
    public final void r() {
        final int k0 = this.k0;
        float g = Float.MAX_VALUE;
        i i = null;
        Label_0080: {
            if (k0 != 0) {
                if (k0 != 1) {
                    if (k0 == 2) {
                        i = ((ConstraintWidget)this).t.a;
                        break Label_0080;
                    }
                    if (k0 != 3) {
                        return;
                    }
                    i = ((ConstraintWidget)this).v.a;
                }
                else {
                    i = ((ConstraintWidget)this).u.a;
                }
                g = 0.0f;
            }
            else {
                i = ((ConstraintWidget)this).s.a;
            }
        }
        final int size = this.l0.size();
        i f = null;
        float n;
        for (int j = 0; j < size; ++j, g = n) {
            final i l = this.l0.get(j);
            if (l.b != 1) {
                return;
            }
            final int k2 = this.k0;
            float n2;
            if (k2 != 0 && k2 != 2) {
                final float g2 = l.g;
                n = g;
                if (g2 <= g) {
                    continue;
                }
                f = l.f;
                n2 = g2;
            }
            else {
                final float g3 = l.g;
                n = g;
                if (g3 >= g) {
                    continue;
                }
                f = l.f;
                n2 = g3;
            }
            n = n2;
        }
        i.f = f;
        i.g = g;
        i.b();
        final int k3 = this.k0;
        if (k3 != 0) {
            if (k3 != 1) {
                if (k3 != 2) {
                    if (k3 != 3) {
                        return;
                    }
                    ((ConstraintWidget)this).t.a.k(f, g);
                }
                else {
                    ((ConstraintWidget)this).v.a.k(f, g);
                }
            }
            else {
                ((ConstraintWidget)this).s.a.k(f, g);
            }
        }
        else {
            ((ConstraintWidget)this).u.a.k(f, g);
        }
    }
}
