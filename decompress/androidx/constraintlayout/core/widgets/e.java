// 
// Decompiled by Procyon v0.6.0
// 

package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.b;
import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.c;

public final class e extends ConstraintWidget
{
    public float o0;
    public int p0;
    public int q0;
    public ConstraintAnchor r0;
    public int s0;
    public boolean t0;
    
    public e() {
        this.o0 = -1.0f;
        this.p0 = -1;
        this.q0 = -1;
        this.r0 = super.H;
        int i = 0;
        this.s0 = 0;
        super.P.clear();
        super.P.add(this.r0);
        while (i < super.O.length) {
            super.O[i] = this.r0;
            ++i;
        }
    }
    
    @Override
    public final void G(final c c, final boolean b) {
        if (super.S == null) {
            return;
        }
        final ConstraintAnchor r0 = this.r0;
        c.getClass();
        final int n = c.n(r0);
        if (this.s0 == 1) {
            super.X = n;
            super.Y = 0;
            this.B(super.S.i());
            this.E(0);
        }
        else {
            super.X = 0;
            super.Y = n;
            this.E(super.S.l());
            this.B(0);
        }
    }
    
    public final void H(final int n) {
        this.r0.i(n);
        this.t0 = true;
    }
    
    @Override
    public final void c(final c c, final boolean b) {
        final d d = (d)super.S;
        if (d == null) {
            return;
        }
        ConstraintAnchor constraintAnchor = ((ConstraintWidget)d).g(ConstraintAnchor.Type.LEFT);
        ConstraintAnchor constraintAnchor2 = ((ConstraintWidget)d).g(ConstraintAnchor.Type.RIGHT);
        final ConstraintWidget s = super.S;
        final int n = 1;
        int n2;
        if (s != null && s.R[0] == DimensionBehaviour.WRAP_CONTENT) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        if (this.s0 == 0) {
            constraintAnchor = ((ConstraintWidget)d).g(ConstraintAnchor.Type.TOP);
            constraintAnchor2 = ((ConstraintWidget)d).g(ConstraintAnchor.Type.BOTTOM);
            final ConstraintWidget s2 = super.S;
            if (s2 != null && s2.R[1] == DimensionBehaviour.WRAP_CONTENT) {
                n2 = n;
            }
            else {
                n2 = 0;
            }
        }
        if (this.t0) {
            final ConstraintAnchor r0 = this.r0;
            if (r0.c) {
                final SolverVariable k = c.k(r0);
                c.d(k, this.r0.c());
                if (this.p0 != -1) {
                    if (n2 != 0) {
                        c.f(c.k(constraintAnchor2), k, 0, 5);
                    }
                }
                else if (this.q0 != -1 && n2 != 0) {
                    final SolverVariable i = c.k(constraintAnchor2);
                    c.f(k, c.k(constraintAnchor), 0, 5);
                    c.f(i, k, 0, 5);
                }
                this.t0 = false;
                return;
            }
        }
        if (this.p0 != -1) {
            final SolverVariable j = c.k(this.r0);
            c.e(j, c.k(constraintAnchor), this.p0, 8);
            if (n2 != 0) {
                c.f(c.k(constraintAnchor2), j, 0, 5);
            }
        }
        else if (this.q0 != -1) {
            final SolverVariable l = c.k(this.r0);
            final SolverVariable m = c.k(constraintAnchor2);
            c.e(l, m, -this.q0, 8);
            if (n2 != 0) {
                c.f(l, c.k(constraintAnchor), 0, 5);
                c.f(m, l, 0, 5);
            }
        }
        else if (this.o0 != -1.0f) {
            final SolverVariable k2 = c.k(this.r0);
            final SolverVariable k3 = c.k(constraintAnchor2);
            final float o0 = this.o0;
            final b l2 = c.l();
            l2.d.c(k2, -1.0f);
            l2.d.c(k3, o0);
            c.c(l2);
        }
    }
    
    @Override
    public final boolean d() {
        return true;
    }
    
    @Override
    public final ConstraintAnchor g(final ConstraintAnchor.Type type) {
        final int n = e$a.a[type.ordinal()];
        if (n != 1 && n != 2) {
            if (n == 3 || n == 4) {
                if (this.s0 == 0) {
                    return this.r0;
                }
            }
        }
        else if (this.s0 == 1) {
            return this.r0;
        }
        return null;
    }
    
    @Override
    public final boolean u() {
        return this.t0;
    }
    
    @Override
    public final boolean v() {
        return this.t0;
    }
}
