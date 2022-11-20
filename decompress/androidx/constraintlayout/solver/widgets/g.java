// 
// Decompiled by Procyon v0.6.0
// 

package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.b;
import androidx.constraintlayout.solver.SolverVariable;
import androidx.constraintlayout.solver.c;

public final class g extends ConstraintWidget
{
    public float i0;
    public int j0;
    public int k0;
    public ConstraintAnchor l0;
    public int m0;
    
    public g() {
        this.i0 = -1.0f;
        this.j0 = -1;
        this.k0 = -1;
        this.l0 = super.t;
        int i = 0;
        this.m0 = 0;
        super.B.clear();
        super.B.add(this.l0);
        while (i < super.A.length) {
            super.A[i] = this.l0;
            ++i;
        }
    }
    
    @Override
    public final void a(final c c) {
        final e e = (e)super.D;
        if (e == null) {
            return;
        }
        ConstraintAnchor constraintAnchor = ((ConstraintWidget)e).f(ConstraintAnchor.Type.LEFT);
        ConstraintAnchor constraintAnchor2 = ((ConstraintWidget)e).f(ConstraintAnchor.Type.RIGHT);
        final ConstraintWidget d = super.D;
        final int n = 1;
        int n2;
        if (d != null && d.C[0] == DimensionBehaviour.WRAP_CONTENT) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        if (this.m0 == 0) {
            constraintAnchor = ((ConstraintWidget)e).f(ConstraintAnchor.Type.TOP);
            constraintAnchor2 = ((ConstraintWidget)e).f(ConstraintAnchor.Type.BOTTOM);
            final ConstraintWidget d2 = super.D;
            if (d2 != null && d2.C[1] == DimensionBehaviour.WRAP_CONTENT) {
                n2 = n;
            }
            else {
                n2 = 0;
            }
        }
        if (this.j0 != -1) {
            final SolverVariable j = c.j(this.l0);
            c.e(j, c.j(constraintAnchor), this.j0, 6);
            if (n2 != 0) {
                c.f(c.j(constraintAnchor2), j, 0, 5);
            }
        }
        else if (this.k0 != -1) {
            final SolverVariable i = c.j(this.l0);
            final SolverVariable k = c.j(constraintAnchor2);
            c.e(i, k, -this.k0, 6);
            if (n2 != 0) {
                c.f(i, c.j(constraintAnchor), 0, 5);
                c.f(k, i, 0, 5);
            }
        }
        else if (this.i0 != -1.0f) {
            final SolverVariable l = c.j(this.l0);
            final SolverVariable m = c.j(constraintAnchor);
            final SolverVariable j2 = c.j(constraintAnchor2);
            final float i2 = this.i0;
            final b k2 = c.k();
            k2.c.f(l, -1.0f);
            k2.c.f(m, 1.0f - i2);
            k2.c.f(j2, i2);
            c.c(k2);
        }
    }
    
    @Override
    public final boolean b() {
        return true;
    }
    
    @Override
    public final void c(int n) {
        final ConstraintWidget d = super.D;
        if (d == null) {
            return;
        }
        if (this.m0 == 1) {
            super.t.a.g(d.t.a, 0);
            super.v.a.g(d.t.a, 0);
            n = this.j0;
            if (n != -1) {
                super.s.a.g(d.s.a, n);
                super.u.a.g(d.s.a, this.j0);
            }
            else {
                n = this.k0;
                if (n != -1) {
                    super.s.a.g(d.u.a, -n);
                    super.u.a.g(d.u.a, -this.k0);
                }
                else {
                    final float i0 = this.i0;
                    if (i0 != -1.0f && d.C[0] == DimensionBehaviour.FIXED) {
                        n = (int)(d.E * i0);
                        super.s.a.g(d.s.a, n);
                        super.u.a.g(d.s.a, n);
                    }
                }
            }
        }
        else {
            super.s.a.g(d.s.a, 0);
            super.u.a.g(d.s.a, 0);
            n = this.j0;
            if (n != -1) {
                super.t.a.g(d.t.a, n);
                super.v.a.g(d.t.a, this.j0);
            }
            else {
                n = this.k0;
                if (n != -1) {
                    super.t.a.g(d.v.a, -n);
                    super.v.a.g(d.v.a, -this.k0);
                }
                else {
                    final float i2 = this.i0;
                    if (i2 != -1.0f && d.C[1] == DimensionBehaviour.FIXED) {
                        n = (int)(d.F * i2);
                        super.t.a.g(d.t.a, n);
                        super.v.a.g(d.t.a, n);
                    }
                }
            }
        }
    }
    
    @Override
    public final ConstraintAnchor f(final ConstraintAnchor.Type type) {
        switch (g$a.a[type.ordinal()]) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9: {
                return null;
            }
            case 3:
            case 4: {
                if (this.m0 == 0) {
                    return this.l0;
                }
                break;
            }
            case 1:
            case 2: {
                if (this.m0 == 1) {
                    return this.l0;
                }
                break;
            }
        }
        throw new AssertionError((Object)type.name());
    }
    
    @Override
    public final void y(final c c) {
        if (super.D == null) {
            return;
        }
        final int m = c.m(this.l0);
        if (this.m0 == 1) {
            super.I = m;
            super.J = 0;
            this.s(super.D.g());
            this.w(0);
        }
        else {
            super.I = 0;
            super.J = m;
            this.w(super.D.k());
            this.s(0);
        }
    }
    
    public final void z(int i) {
        if (this.m0 == i) {
            return;
        }
        this.m0 = i;
        super.B.clear();
        if (this.m0 == 1) {
            this.l0 = super.s;
        }
        else {
            this.l0 = super.t;
        }
        super.B.add(this.l0);
        int length;
        for (length = super.A.length, i = 0; i < length; ++i) {
            super.A[i] = this.l0;
        }
    }
}
