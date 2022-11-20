// 
// Decompiled by Procyon v0.6.0
// 

package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.c;
import e3.b;

public final class a extends b
{
    public boolean q0;
    public boolean r0;
    
    public a() {
        this.q0 = true;
        this.r0 = false;
    }
    
    public final boolean I() {
        boolean b = true;
        int n = 0;
        int p0;
        while (true) {
            p0 = super.p0;
            if (n >= p0) {
                break;
            }
            final ConstraintWidget constraintWidget = super.o0[n];
            if (this.q0 || constraintWidget.d()) {
                if (!constraintWidget.u()) {
                    b = false;
                }
            }
            ++n;
        }
        if (b && p0 > 0) {
            int i = 0;
            int n3;
            int n2 = n3 = 0;
            while (i < super.p0) {
                final ConstraintWidget constraintWidget2 = super.o0[i];
                if (this.q0 || constraintWidget2.d()) {
                    int c = n2;
                    int n4;
                    if ((n4 = n3) == 0) {
                        c = constraintWidget2.g(ConstraintAnchor.Type.LEFT).c();
                        n4 = 1;
                    }
                    final int min = Math.min(c, constraintWidget2.g(ConstraintAnchor.Type.LEFT).c());
                    n3 = n4;
                    n2 = min;
                }
                ++i;
            }
            final int n5 = n2 + 0;
            ((ConstraintWidget)this).z(n5, n5);
            return this.r0 = true;
        }
        return false;
    }
    
    public final void c(final c c, final boolean b) {
        final ConstraintAnchor[] o = ((ConstraintWidget)this).O;
        o[0] = ((ConstraintWidget)this).G;
        o[2] = ((ConstraintWidget)this).H;
        final ConstraintAnchor i = ((ConstraintWidget)this).I;
        boolean b2 = true;
        o[1] = i;
        o[3] = ((ConstraintWidget)this).J;
        int n = 0;
        ConstraintAnchor[] o2;
        while (true) {
            o2 = ((ConstraintWidget)this).O;
            if (n >= o2.length) {
                break;
            }
            final ConstraintAnchor constraintAnchor = o2[n];
            constraintAnchor.i = c.k((Object)constraintAnchor);
            ++n;
        }
        final ConstraintAnchor constraintAnchor2 = o2[0];
        if (!this.r0) {
            this.I();
        }
        if (this.r0) {
            this.r0 = false;
            c.d(((ConstraintWidget)this).G.i, ((ConstraintWidget)this).X);
            c.d(((ConstraintWidget)this).I.i, ((ConstraintWidget)this).X);
            return;
        }
        while (true) {
            for (int j = 0; j < super.p0; ++j) {
                final ConstraintWidget constraintWidget = super.o0[j];
                if (this.q0 || constraintWidget.d()) {
                    if (constraintWidget.R[0] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.G.f != null && constraintWidget.I.f != null) {
                        final boolean b3 = true;
                        final boolean b4 = ((ConstraintWidget)this).G.e() || ((ConstraintWidget)this).I.e();
                        if (!((ConstraintWidget)this).H.e()) {
                            ((ConstraintWidget)this).J.e();
                        }
                        if (b3 || !b4) {
                            b2 = false;
                        }
                        int n2 = 5;
                        if (!b2) {
                            n2 = 4;
                        }
                        for (int k = 0; k < super.p0; ++k) {
                            final ConstraintWidget constraintWidget2 = super.o0[k];
                            if (this.q0 || constraintWidget2.d()) {
                                final SolverVariable l = c.k((Object)constraintWidget2.O[0]);
                                final ConstraintAnchor constraintAnchor3 = constraintWidget2.O[0];
                                constraintAnchor3.i = l;
                                final ConstraintAnchor f = constraintAnchor3.f;
                                int n3;
                                if (f != null && f.d == this) {
                                    n3 = constraintAnchor3.g + 0;
                                }
                                else {
                                    n3 = 0;
                                }
                                final SolverVariable m = constraintAnchor2.i;
                                final androidx.constraintlayout.core.b l2 = c.l();
                                final SolverVariable m2 = c.m();
                                l2.c(m, l, m2, (m2.i = 0) - n3);
                                c.c(l2);
                                c.e(constraintAnchor2.i, l, n3 + 0, n2);
                            }
                        }
                        c.e(((ConstraintWidget)this).I.i, ((ConstraintWidget)this).G.i, 0, 8);
                        c.e(((ConstraintWidget)this).G.i, ((ConstraintWidget)this).S.I.i, 0, 4);
                        c.e(((ConstraintWidget)this).G.i, ((ConstraintWidget)this).S.G.i, 0, 0);
                        return;
                    }
                }
            }
            final boolean b3 = false;
            continue;
        }
    }
    
    public final boolean d() {
        return true;
    }
    
    public final String toString() {
        String s = ph0.a.f(a.t("[Barrier] "), ((ConstraintWidget)this).g0, " {");
        for (int i = 0; i < super.p0; ++i) {
            final ConstraintWidget constraintWidget = super.o0[i];
            String l = s;
            if (i > 0) {
                l = b.l(s, ", ");
            }
            final StringBuilder t = a.t(l);
            t.append(constraintWidget.g0);
            s = t.toString();
        }
        return b.l(s, "}");
    }
    
    public final boolean u() {
        return this.r0;
    }
    
    public final boolean v() {
        return this.r0;
    }
}
