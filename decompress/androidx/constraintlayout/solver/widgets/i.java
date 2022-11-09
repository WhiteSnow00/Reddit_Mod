// 
// Decompiled by Procyon v0.6.0
// 

package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.SolverVariable;
import h3.c;
import h3.d;

public final class i extends d
{
    public ConstraintAnchor c;
    public i d;
    public float e;
    public i f;
    public float g;
    public int h;
    public i i;
    public c j;
    public int k;
    public c l;
    
    public i(final ConstraintAnchor c) {
        this.h = 0;
        this.j = null;
        this.k = 1;
        this.l = null;
        this.c = c;
    }
    
    public static String l(final int n) {
        if (n == 1) {
            return "DIRECT";
        }
        if (n == 2) {
            return "CENTER";
        }
        if (n == 3) {
            return "MATCH";
        }
        if (n == 4) {
            return "CHAIN";
        }
        if (n == 5) {
            return "BARRIER";
        }
        return "UNCONNECTED";
    }
    
    public final void e() {
        final int b = super.b;
        final int n = 1;
        if (b == 1) {
            return;
        }
        final int h = this.h;
        if (h == 4) {
            return;
        }
        final c j = this.j;
        if (j != null) {
            if (j.b != 1) {
                return;
            }
            this.e = this.k * j.c;
        }
        final c l = this.l;
        if (l != null && l.b != 1) {
            return;
        }
        if (h == 1) {
            final i d = this.d;
            if (d == null || d.b == 1) {
                if (d == null) {
                    this.f = this;
                    this.g = this.e;
                }
                else {
                    this.f = d.f;
                    this.g = d.g + this.e;
                }
                this.b();
                return;
            }
        }
        if (h == 2) {
            final i d2 = this.d;
            if (d2 != null && d2.b == 1) {
                final i i = this.i;
                if (i != null) {
                    final i d3 = i.d;
                    if (d3 != null && d3.b == 1) {
                        this.f = d2.f;
                        i.f = d3.f;
                        final ConstraintAnchor c = this.c;
                        final ConstraintAnchor.Type c2 = c.c;
                        final ConstraintAnchor.Type right = ConstraintAnchor.Type.RIGHT;
                        int n2 = 0;
                        int n3 = n;
                        if (c2 != right) {
                            if (c2 == ConstraintAnchor.Type.BOTTOM) {
                                n3 = n;
                            }
                            else {
                                n3 = 0;
                            }
                        }
                        float n4;
                        if (n3 != 0) {
                            n4 = d2.g - d3.g;
                        }
                        else {
                            n4 = d3.g - d2.g;
                        }
                        float n5;
                        float n6;
                        if (c2 != ConstraintAnchor.Type.LEFT && c2 != right) {
                            n5 = n4 - c.b.g();
                            n6 = this.c.b.W;
                        }
                        else {
                            n5 = n4 - c.b.k();
                            n6 = this.c.b.V;
                        }
                        final int b2 = this.c.b();
                        int b3 = this.i.c.b();
                        final ConstraintAnchor d4 = this.c.d;
                        final i k = this.i;
                        if (d4 == k.c.d) {
                            n6 = 0.5f;
                            b3 = 0;
                        }
                        else {
                            n2 = b2;
                        }
                        final float n7 = (float)n2;
                        final float n8 = (float)b3;
                        final float n9 = n5 - n7 - n8;
                        if (n3 != 0) {
                            k.g = n9 * n6 + (k.d.g + n8);
                            this.g = this.d.g - n7 - (1.0f - n6) * n9;
                        }
                        else {
                            this.g = n9 * n6 + (this.d.g + n7);
                            k.g = k.d.g - n8 - (1.0f - n6) * n9;
                        }
                        this.b();
                        this.i.b();
                        return;
                    }
                }
            }
        }
        if (h == 3) {
            final i d5 = this.d;
            if (d5 != null && d5.b == 1) {
                final i m = this.i;
                if (m != null) {
                    final i d6 = m.d;
                    if (d6 != null && d6.b == 1) {
                        this.f = d5.f;
                        m.f = d6.f;
                        this.g = d5.g + this.e;
                        m.g = d6.g + m.e;
                        this.b();
                        this.i.b();
                        return;
                    }
                }
            }
        }
        if (h == 5) {
            this.c.b.r();
        }
    }
    
    public final void f(final androidx.constraintlayout.solver.c c) {
        final SolverVariable i = this.c.i;
        final i f = this.f;
        if (f == null) {
            c.d(i, (int)(this.g + 0.5f));
        }
        else {
            c.e(i, c.j(f.c), (int)(this.g + 0.5f), 6);
        }
    }
    
    public final void g(final i d, final int n) {
        this.h = 1;
        this.d = d;
        this.e = (float)n;
        d.a((d)this);
    }
    
    public final void h(final i d, final int k, final c j) {
        (this.d = d).a((d)this);
        this.j = j;
        this.k = k;
        j.a((d)this);
    }
    
    public final void i(final i d, final int n) {
        this.d = d;
        this.e = (float)n;
        d.a((d)this);
    }
    
    public final void j() {
        super.b = 0;
        super.a.clear();
        this.d = null;
        this.e = 0.0f;
        this.j = null;
        this.k = 1;
        this.l = null;
        this.f = null;
        this.g = 0.0f;
        this.i = null;
        this.h = 0;
    }
    
    public final void k(final i f, final float g) {
        final int b = super.b;
        if (b == 0 || (this.f != f && this.g != g)) {
            this.f = f;
            this.g = g;
            if (b == 1) {
                this.c();
            }
            this.b();
        }
    }
    
    public final String toString() {
        if (super.b != 1) {
            final StringBuilder k = a.k("{ ");
            k.append(this.c);
            k.append(" UNRESOLVED} type: ");
            k.append(l(this.h));
            return k.toString();
        }
        if (this.f == this) {
            final StringBuilder i = a.k("[");
            i.append(this.c);
            i.append(", RESOLVED: ");
            i.append(this.g);
            i.append("]  type: ");
            i.append(l(this.h));
            return i.toString();
        }
        final StringBuilder j = a.k("[");
        j.append(this.c);
        j.append(", RESOLVED: ");
        j.append(this.f);
        j.append(":");
        j.append(this.g);
        j.append("] type: ");
        j.append(l(this.h));
        return j.toString();
    }
}
