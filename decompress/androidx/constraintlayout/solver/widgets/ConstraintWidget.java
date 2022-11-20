// 
// Decompiled by Procyon v0.6.0
// 

package androidx.constraintlayout.solver.widgets;

import g3.a;
import androidx.constraintlayout.solver.SolverVariable;
import androidx.constraintlayout.solver.c;
import h3.b;
import java.util.ArrayList;

public class ConstraintWidget
{
    public ConstraintAnchor[] A;
    public ArrayList<ConstraintAnchor> B;
    public DimensionBehaviour[] C;
    public ConstraintWidget D;
    public int E;
    public int F;
    public float G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public float V;
    public float W;
    public Object X;
    public int Y;
    public String Z;
    public int a;
    public boolean a0;
    public int b;
    public boolean b0;
    public b c;
    public boolean c0;
    public b d;
    public int d0;
    public int e;
    public int e0;
    public int f;
    public float[] f0;
    public int[] g;
    public ConstraintWidget[] g0;
    public int h;
    public ConstraintWidget[] h0;
    public int i;
    public float j;
    public int k;
    public int l;
    public float m;
    public int n;
    public float o;
    public f p;
    public int[] q;
    public float r;
    public ConstraintAnchor s;
    public ConstraintAnchor t;
    public ConstraintAnchor u;
    public ConstraintAnchor v;
    public ConstraintAnchor w;
    public ConstraintAnchor x;
    public ConstraintAnchor y;
    public ConstraintAnchor z;
    
    public ConstraintWidget() {
        this.a = -1;
        this.b = -1;
        this.e = 0;
        this.f = 0;
        this.g = new int[2];
        this.h = 0;
        this.i = 0;
        this.j = 1.0f;
        this.k = 0;
        this.l = 0;
        this.m = 1.0f;
        this.n = -1;
        this.o = 1.0f;
        this.p = null;
        this.q = new int[] { Integer.MAX_VALUE, Integer.MAX_VALUE };
        this.r = 0.0f;
        this.s = new ConstraintAnchor(this, ConstraintAnchor.Type.LEFT);
        this.t = new ConstraintAnchor(this, ConstraintAnchor.Type.TOP);
        this.u = new ConstraintAnchor(this, ConstraintAnchor.Type.RIGHT);
        this.v = new ConstraintAnchor(this, ConstraintAnchor.Type.BOTTOM);
        this.w = new ConstraintAnchor(this, ConstraintAnchor.Type.BASELINE);
        this.x = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_X);
        this.y = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_Y);
        final ConstraintAnchor z = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER);
        this.z = z;
        this.A = new ConstraintAnchor[] { this.s, this.u, this.t, this.v, this.w, z };
        final ArrayList b = new ArrayList();
        this.B = b;
        final DimensionBehaviour fixed = DimensionBehaviour.FIXED;
        this.C = new DimensionBehaviour[] { fixed, fixed };
        this.D = null;
        this.E = 0;
        this.F = 0;
        this.G = 0.0f;
        this.H = -1;
        this.I = 0;
        this.J = 0;
        this.K = 0;
        this.L = 0;
        this.M = 0;
        this.N = 0;
        this.O = 0;
        this.P = 0;
        this.Q = 0;
        this.V = 0.5f;
        this.W = 0.5f;
        this.Y = 0;
        this.Z = null;
        this.a0 = false;
        this.b0 = false;
        this.c0 = false;
        this.d0 = 0;
        this.e0 = 0;
        this.f0 = new float[] { -1.0f, -1.0f };
        this.g0 = new ConstraintWidget[] { null, null };
        this.h0 = new ConstraintWidget[] { null, null };
        b.add(this.s);
        this.B.add(this.t);
        this.B.add(this.u);
        this.B.add(this.v);
        this.B.add(this.x);
        this.B.add(this.y);
        this.B.add(this.z);
        this.B.add(this.w);
    }
    
    public void a(final c c) {
        final SolverVariable j = c.j(this.s);
        final SolverVariable i = c.j(this.u);
        final SolverVariable k = c.j(this.t);
        final SolverVariable l = c.j(this.v);
        final SolverVariable m = c.j(this.w);
        final ConstraintWidget d = this.D;
        boolean b6;
        boolean b7;
        boolean b8;
        boolean b9;
        if (d != null) {
            final DimensionBehaviour[] c2 = d.C;
            final DimensionBehaviour dimensionBehaviour = c2[0];
            final DimensionBehaviour wrap_CONTENT = DimensionBehaviour.WRAP_CONTENT;
            final boolean b = dimensionBehaviour == wrap_CONTENT;
            final boolean b2 = c2[1] == wrap_CONTENT;
            boolean b3 = false;
            Label_0201: {
                if (this.m(0)) {
                    ((e)this.D).A(0, this);
                }
                else {
                    final ConstraintAnchor s = this.s;
                    final ConstraintAnchor d2 = s.d;
                    if (d2 == null || d2.d != s) {
                        final ConstraintAnchor u = this.u;
                        final ConstraintAnchor d3 = u.d;
                        if (d3 == null || d3.d != u) {
                            b3 = false;
                            break Label_0201;
                        }
                    }
                }
                b3 = true;
            }
            boolean b4 = false;
            Label_0289: {
                if (this.m(1)) {
                    ((e)this.D).A(1, this);
                }
                else {
                    final ConstraintAnchor t = this.t;
                    final ConstraintAnchor d4 = t.d;
                    if (d4 == null || d4.d != t) {
                        final ConstraintAnchor v = this.v;
                        final ConstraintAnchor d5 = v.d;
                        if (d5 == null || d5.d != v) {
                            b4 = false;
                            break Label_0289;
                        }
                    }
                }
                b4 = true;
            }
            if (b && this.Y != 8 && this.s.d == null && this.u.d == null) {
                c.f(c.j(this.D.u), i, 0, 1);
            }
            if (b2 && this.Y != 8 && this.t.d == null && this.v.d == null && this.w == null) {
                c.f(c.j(this.D.v), l, 0, 1);
            }
            final boolean b5 = b2;
            b6 = b3;
            b7 = b4;
            b8 = b;
            b9 = b5;
        }
        else {
            b8 = false;
            b6 = false;
            b9 = (b7 = b6);
        }
        final int e = this.E;
        int r = this.R;
        if (e >= r) {
            r = e;
        }
        final int f = this.F;
        int s2 = this.S;
        if (f >= s2) {
            s2 = f;
        }
        final DimensionBehaviour[] c3 = this.C;
        final DimensionBehaviour dimensionBehaviour2 = c3[0];
        final DimensionBehaviour match_CONSTRAINT = DimensionBehaviour.MATCH_CONSTRAINT;
        final boolean b10 = dimensionBehaviour2 != match_CONSTRAINT;
        final DimensionBehaviour dimensionBehaviour3 = c3[1];
        final boolean b11 = dimensionBehaviour3 != match_CONSTRAINT;
        final int h = this.H;
        this.n = h;
        final float g = this.G;
        this.o = g;
        final int e2 = this.e;
        final int f2 = this.f;
        int n2 = 0;
        int n5 = 0;
        int n7 = 0;
        int n8 = 0;
        Label_1252: {
            if (g > 0.0f && this.Y != 8) {
                int n = e2;
                if (dimensionBehaviour2 == match_CONSTRAINT && (n = e2) == 0) {
                    n = 3;
                }
                n2 = f2;
                if (dimensionBehaviour3 == match_CONSTRAINT && (n2 = f2) == 0) {
                    n2 = 3;
                }
                int n3;
                if (dimensionBehaviour2 == match_CONSTRAINT && dimensionBehaviour3 == match_CONSTRAINT && n == 3 && n2 == 3) {
                    if (h == -1) {
                        if (b10 && !b11) {
                            this.n = 0;
                        }
                        else if (!b10 && b11) {
                            this.n = 1;
                            if (h == -1) {
                                this.o = 1.0f / g;
                            }
                        }
                    }
                    if (this.n == 0 && (!this.t.c() || !this.v.c())) {
                        this.n = 1;
                    }
                    else if (this.n == 1 && (!this.s.c() || !this.u.c())) {
                        this.n = 0;
                    }
                    if (this.n == -1 && (!this.t.c() || !this.v.c() || !this.s.c() || !this.u.c())) {
                        if (this.t.c() && this.v.c()) {
                            this.n = 0;
                        }
                        else if (this.s.c() && this.u.c()) {
                            this.o = 1.0f / this.o;
                            this.n = 1;
                        }
                    }
                    if (this.n == -1) {
                        if (b8 && !b9) {
                            this.n = 0;
                        }
                        else if (!b8 && b9) {
                            this.o = 1.0f / this.o;
                            this.n = 1;
                        }
                    }
                    if (this.n == -1) {
                        final int h2 = this.h;
                        if (h2 > 0 && this.k == 0) {
                            this.n = 0;
                        }
                        else if (h2 == 0 && this.k > 0) {
                            this.o = 1.0f / this.o;
                            this.n = 1;
                        }
                    }
                    n3 = r;
                    if (this.n == -1) {
                        n3 = r;
                        if (b8) {
                            n3 = r;
                            if (b9) {
                                this.o = 1.0f / this.o;
                                this.n = 1;
                                n3 = r;
                            }
                        }
                    }
                }
                else if (dimensionBehaviour2 == match_CONSTRAINT && n == 3) {
                    this.n = 0;
                    final int n4 = (int)(g * f);
                    if (dimensionBehaviour3 != match_CONSTRAINT) {
                        n5 = 4;
                        final int n6 = 0;
                        n7 = n4;
                        n8 = n6;
                        break Label_1252;
                    }
                    n3 = n4;
                }
                else {
                    n3 = r;
                    if (dimensionBehaviour3 == match_CONSTRAINT) {
                        n3 = r;
                        if (n2 == 3) {
                            this.n = 1;
                            if (h == -1) {
                                this.o = 1.0f / g;
                            }
                            final int n9 = (int)(this.o * e);
                            n3 = r;
                            s2 = n9;
                            if (dimensionBehaviour2 != match_CONSTRAINT) {
                                n5 = n;
                                s2 = n9;
                                n2 = 4;
                                final int n10 = 0;
                                n7 = r;
                                n8 = n10;
                                break Label_1252;
                            }
                        }
                    }
                }
                final int n11 = n;
                n7 = n3;
                n8 = 1;
                n5 = n11;
            }
            else {
                n5 = e2;
                n2 = f2;
                final int n12 = 0;
                n7 = r;
                n8 = n12;
            }
        }
        final int[] g2 = this.g;
        g2[0] = n5;
        g2[1] = n2;
        boolean b12 = false;
        Label_1301: {
            if (n8 != 0) {
                final int n13 = this.n;
                if (n13 == 0 || n13 == -1) {
                    b12 = true;
                    break Label_1301;
                }
            }
            b12 = false;
        }
        final DimensionBehaviour dimensionBehaviour4 = this.C[0];
        final DimensionBehaviour wrap_CONTENT2 = DimensionBehaviour.WRAP_CONTENT;
        final boolean b13 = dimensionBehaviour4 == wrap_CONTENT2 && this instanceof e;
        final boolean b14 = this.z.c() ^ true;
        if (this.a != 2) {
            final ConstraintWidget d6 = this.D;
            SolverVariable j2;
            if (d6 != null) {
                j2 = c.j(d6.u);
            }
            else {
                j2 = null;
            }
            final ConstraintWidget d7 = this.D;
            SolverVariable j3;
            if (d7 != null) {
                j3 = c.j(d7.s);
            }
            else {
                j3 = null;
            }
            this.d(c, b8, j3, j2, this.C[0], b13, this.s, this.u, this.I, n7, this.R, this.q[0], this.V, b12, b6, n5, this.h, this.i, this.j, b14);
        }
        if (this.b == 2) {
            return;
        }
        final boolean b15 = this.C[1] == wrap_CONTENT2 && this instanceof e;
        boolean b16 = false;
        Label_1550: {
            if (n8 != 0) {
                final int n14 = this.n;
                if (n14 == 1 || n14 == -1) {
                    b16 = true;
                    break Label_1550;
                }
            }
            b16 = false;
        }
        final int q = this.Q;
        boolean b17 = false;
        Label_1639: {
            if (q > 0) {
                final i a = this.w.a;
                if (a.b == 1) {
                    a.f(c);
                }
                else {
                    c.e(m, k, q, 6);
                    final ConstraintAnchor d8 = this.w.d;
                    if (d8 != null) {
                        c.e(m, c.j(d8), 0, 6);
                        b17 = false;
                        break Label_1639;
                    }
                }
            }
            b17 = b14;
        }
        final ConstraintWidget d9 = this.D;
        SolverVariable j4;
        if (d9 != null) {
            j4 = c.j(d9.v);
        }
        else {
            j4 = null;
        }
        final ConstraintWidget d10 = this.D;
        SolverVariable j5;
        if (d10 != null) {
            j5 = c.j(d10.t);
        }
        else {
            j5 = null;
        }
        this.d(c, b9, j5, j4, this.C[1], b15, this.t, this.v, this.J, s2, this.S, this.q[1], this.W, b16, b7, n2, this.k, this.l, this.m, b17);
        if (n8 != 0) {
            if (this.n == 1) {
                final float o = this.o;
                final androidx.constraintlayout.solver.b k2 = c.k();
                k2.c.f(l, -1.0f);
                k2.c.f(k, 1.0f);
                k2.c.f(i, o);
                k2.c.f(j, -o);
                c.c(k2);
            }
            else {
                final float o2 = this.o;
                final androidx.constraintlayout.solver.b k3 = c.k();
                k3.c.f(i, -1.0f);
                k3.c.f(j, 1.0f);
                k3.c.f(l, o2);
                k3.c.f(k, -o2);
                c.c(k3);
            }
        }
        if (this.z.c()) {
            final ConstraintWidget b18 = this.z.d.b;
            final float n15 = (float)Math.toRadians(this.r + 90.0f);
            final int b19 = this.z.b();
            final ConstraintAnchor.Type left = ConstraintAnchor.Type.LEFT;
            final SolverVariable j6 = c.j(this.f(left));
            final ConstraintAnchor.Type top = ConstraintAnchor.Type.TOP;
            final SolverVariable j7 = c.j(this.f(top));
            final ConstraintAnchor.Type right = ConstraintAnchor.Type.RIGHT;
            final SolverVariable j8 = c.j(this.f(right));
            final ConstraintAnchor.Type bottom = ConstraintAnchor.Type.BOTTOM;
            final SolverVariable j9 = c.j(this.f(bottom));
            final SolverVariable j10 = c.j(b18.f(left));
            final SolverVariable j11 = c.j(b18.f(top));
            final SolverVariable j12 = c.j(b18.f(right));
            final SolverVariable j13 = c.j(b18.f(bottom));
            final androidx.constraintlayout.solver.b k4 = c.k();
            final double n16 = n15;
            final double sin = Math.sin(n16);
            final double n17 = b19;
            final float n18 = (float)(sin * n17);
            k4.c.f(j11, 0.5f);
            k4.c.f(j13, 0.5f);
            k4.c.f(j7, -0.5f);
            k4.c.f(j9, -0.5f);
            k4.b = -n18;
            c.c(k4);
            final androidx.constraintlayout.solver.b k5 = c.k();
            final float n19 = (float)(Math.cos(n16) * n17);
            k5.c.f(j10, 0.5f);
            k5.c.f(j12, 0.5f);
            k5.c.f(j6, -0.5f);
            k5.c.f(j8, -0.5f);
            k5.b = -n19;
            c.c(k5);
        }
    }
    
    public boolean b() {
        return this.Y != 8;
    }
    
    public void c(int n) {
        for (int i = 0; i < 6; ++i) {
            final i a = this.A[i].a;
            final ConstraintAnchor c = a.c;
            final ConstraintAnchor d = c.d;
            if (d != null) {
                if (d.d == c) {
                    a.h = 4;
                    d.a.h = 4;
                }
                final int b = c.b();
                final ConstraintAnchor.Type c2 = a.c.c;
                int n2 = 0;
                Label_0106: {
                    if (c2 != ConstraintAnchor.Type.RIGHT) {
                        n2 = b;
                        if (c2 != ConstraintAnchor.Type.BOTTOM) {
                            break Label_0106;
                        }
                    }
                    n2 = -b;
                }
                a.i(d.a, n2);
            }
        }
        final i a2 = this.s.a;
        final i a3 = this.t.a;
        final i a4 = this.u.a;
        final i a5 = this.v.a;
        if ((n & 0x8) == 0x8) {
            n = 1;
        }
        else {
            n = 0;
        }
        final DimensionBehaviour dimensionBehaviour = this.C[0];
        final DimensionBehaviour match_CONSTRAINT = DimensionBehaviour.MATCH_CONSTRAINT;
        final boolean b2 = dimensionBehaviour == match_CONSTRAINT && androidx.constraintlayout.solver.widgets.h.a(0, this);
        if (a2.h != 4 && a4.h != 4) {
            if (this.C[0] != DimensionBehaviour.FIXED && (!b2 || this.Y != 8)) {
                if (b2) {
                    final int k = this.k();
                    a2.h = 1;
                    a4.h = 1;
                    final ConstraintAnchor d2 = this.s.d;
                    if (d2 == null && this.u.d == null) {
                        if (n != 0) {
                            a4.h(a2, 1, this.j());
                        }
                        else {
                            a4.i(a2, k);
                        }
                    }
                    else if (d2 != null && this.u.d == null) {
                        if (n != 0) {
                            a4.h(a2, 1, this.j());
                        }
                        else {
                            a4.i(a2, k);
                        }
                    }
                    else if (d2 == null && this.u.d != null) {
                        if (n != 0) {
                            a2.h(a4, -1, this.j());
                        }
                        else {
                            a2.i(a4, -k);
                        }
                    }
                    else if (d2 != null && this.u.d != null) {
                        if (n != 0) {
                            ((h3.c)this.j()).a((h3.c)a2);
                            ((h3.c)this.j()).a((h3.c)a4);
                        }
                        if (this.G == 0.0f) {
                            a2.h = 3;
                            a4.h = 3;
                            a2.i = a4;
                            a4.i = a2;
                        }
                        else {
                            a2.h = 2;
                            a4.h = 2;
                            a2.i = a4;
                            a4.i = a2;
                            this.w(k);
                        }
                    }
                }
            }
            else {
                final ConstraintAnchor d3 = this.s.d;
                if (d3 == null && this.u.d == null) {
                    a2.h = 1;
                    a4.h = 1;
                    if (n != 0) {
                        a4.h(a2, 1, this.j());
                    }
                    else {
                        a4.i(a2, this.k());
                    }
                }
                else if (d3 != null && this.u.d == null) {
                    a2.h = 1;
                    a4.h = 1;
                    if (n != 0) {
                        a4.h(a2, 1, this.j());
                    }
                    else {
                        a4.i(a2, this.k());
                    }
                }
                else if (d3 == null && this.u.d != null) {
                    a2.h = 1;
                    a4.h = 1;
                    a2.i(a4, -this.k());
                    if (n != 0) {
                        a2.h(a4, -1, this.j());
                    }
                    else {
                        a2.i(a4, -this.k());
                    }
                }
                else if (d3 != null && this.u.d != null) {
                    a2.h = 2;
                    a4.h = 2;
                    if (n != 0) {
                        ((h3.c)this.j()).a((h3.c)a2);
                        ((h3.c)this.j()).a((h3.c)a4);
                        final b j = this.j();
                        a2.i = a4;
                        a2.l = j;
                        final b l = this.j();
                        a4.i = a2;
                        a4.l = l;
                    }
                    else {
                        a2.i = a4;
                        a4.i = a2;
                    }
                }
            }
        }
        final boolean b3 = this.C[1] == match_CONSTRAINT && androidx.constraintlayout.solver.widgets.h.a(1, this);
        if (a3.h != 4 && a5.h != 4) {
            if (this.C[1] != DimensionBehaviour.FIXED && (!b3 || this.Y != 8)) {
                if (b3) {
                    final int g = this.g();
                    a3.h = 1;
                    a5.h = 1;
                    final ConstraintAnchor d4 = this.t.d;
                    if (d4 == null && this.v.d == null) {
                        if (n != 0) {
                            a5.h(a3, 1, this.i());
                        }
                        else {
                            a5.i(a3, g);
                        }
                    }
                    else if (d4 != null && this.v.d == null) {
                        if (n != 0) {
                            a5.h(a3, 1, this.i());
                        }
                        else {
                            a5.i(a3, g);
                        }
                    }
                    else if (d4 == null && this.v.d != null) {
                        if (n != 0) {
                            a3.h(a5, -1, this.i());
                        }
                        else {
                            a3.i(a5, -g);
                        }
                    }
                    else if (d4 != null && this.v.d != null) {
                        if (n != 0) {
                            ((h3.c)this.i()).a((h3.c)a3);
                            ((h3.c)this.j()).a((h3.c)a5);
                        }
                        if (this.G == 0.0f) {
                            a3.h = 3;
                            a5.h = 3;
                            a3.i = a5;
                            a5.i = a3;
                        }
                        else {
                            a3.h = 2;
                            a5.h = 2;
                            a3.i = a5;
                            a5.i = a3;
                            this.s(g);
                            n = this.Q;
                            if (n > 0) {
                                this.w.a.g(a3, n);
                            }
                        }
                    }
                }
            }
            else {
                final ConstraintAnchor d5 = this.t.d;
                if (d5 == null && this.v.d == null) {
                    a3.h = 1;
                    a5.h = 1;
                    if (n != 0) {
                        a5.h(a3, 1, this.i());
                    }
                    else {
                        a5.i(a3, this.g());
                    }
                    final ConstraintAnchor w = this.w;
                    if (w.d != null) {
                        final i a6 = w.a;
                        a6.h = 1;
                        a3.g(a6, -this.Q);
                    }
                }
                else if (d5 != null && this.v.d == null) {
                    a3.h = 1;
                    a5.h = 1;
                    if (n != 0) {
                        a5.h(a3, 1, this.i());
                    }
                    else {
                        a5.i(a3, this.g());
                    }
                    n = this.Q;
                    if (n > 0) {
                        this.w.a.g(a3, n);
                    }
                }
                else if (d5 == null && this.v.d != null) {
                    a3.h = 1;
                    a5.h = 1;
                    if (n != 0) {
                        a3.h(a5, -1, this.i());
                    }
                    else {
                        a3.i(a5, -this.g());
                    }
                    n = this.Q;
                    if (n > 0) {
                        this.w.a.g(a3, n);
                    }
                }
                else if (d5 != null && this.v.d != null) {
                    a3.h = 2;
                    a5.h = 2;
                    if (n != 0) {
                        final b m = this.i();
                        a3.i = a5;
                        a3.l = m;
                        final b i2 = this.i();
                        a5.i = a3;
                        a5.l = i2;
                        ((h3.c)this.i()).a((h3.c)a3);
                        ((h3.c)this.j()).a((h3.c)a5);
                    }
                    else {
                        a3.i = a5;
                        a5.i = a3;
                    }
                    n = this.Q;
                    if (n > 0) {
                        this.w.a.g(a3, n);
                    }
                }
            }
        }
    }
    
    public final void d(final c c, final boolean b, final SolverVariable solverVariable, final SolverVariable solverVariable2, final DimensionBehaviour dimensionBehaviour, final boolean b2, final ConstraintAnchor constraintAnchor, final ConstraintAnchor constraintAnchor2, int n, int n2, int n3, int n4, final float n5, final boolean b3, final boolean b4, int n6, int max, int n7, final float n8, final boolean b5) {
        final SolverVariable j = c.j(constraintAnchor);
        final SolverVariable i = c.j(constraintAnchor2);
        final SolverVariable k = c.j(constraintAnchor.d);
        final SolverVariable l = c.j(constraintAnchor2.d);
        if (c.f) {
            final i a = constraintAnchor.a;
            if (a.b == 1 && constraintAnchor2.a.b == 1) {
                a.f(c);
                constraintAnchor2.a.f(c);
                if (!b4 && b) {
                    c.f(solverVariable2, i, 0, 6);
                }
                return;
            }
        }
        final int c2 = constraintAnchor.c() ? 1 : 0;
        final boolean c3 = constraintAnchor2.c();
        final boolean c4 = this.z.c();
        int n9;
        if (c3) {
            n9 = c2 + 1;
        }
        else {
            n9 = c2;
        }
        int n10 = n9;
        if (c4) {
            n10 = n9 + 1;
        }
        int n11;
        if (b3) {
            n11 = 3;
        }
        else {
            n11 = n6;
        }
        n6 = ConstraintWidget$a.b[dimensionBehaviour.ordinal()];
        Label_0236: {
            if (n6 != 1 && n6 != 2 && n6 != 3) {
                if (n6 == 4) {
                    if (n11 != 4) {
                        n6 = 1;
                        break Label_0236;
                    }
                }
            }
            n6 = 0;
        }
        if (this.Y == 8) {
            n2 = 0;
            n6 = 0;
        }
        if (b5) {
            if (c2 == 0 && !c3 && !c4) {
                c.d(j, n);
            }
            else if (c2 != 0 && !c3) {
                c.e(j, k, constraintAnchor.b(), 6);
            }
        }
        if (n6 == 0) {
            if (b2) {
                c.e(i, j, 0, 3);
                if (n3 > 0) {
                    c.f(i, j, n3, 6);
                }
                if (n4 < Integer.MAX_VALUE) {
                    c.g(i, j, n4, 6);
                }
            }
            else {
                c.e(i, j, n2, 6);
            }
            n = max;
            max = n7;
            n7 = n;
        }
        else {
            if ((n = max) == -2) {
                n = n2;
            }
            if ((n4 = n7) == -2) {
                n4 = n2;
            }
            max = n2;
            if (n > 0) {
                c.f(i, j, n, 6);
                max = Math.max(n2, n);
            }
            int min = max;
            if (n4 > 0) {
                c.g(i, j, n4, 6);
                min = Math.min(max, n4);
            }
            Label_0723: {
                if (n11 == 1) {
                    if (b) {
                        c.e(i, j, min, 6);
                    }
                    else if (b4) {
                        c.e(i, j, min, 4);
                    }
                    else {
                        c.e(i, j, min, 1);
                    }
                }
                else if (n11 == 2) {
                    final ConstraintAnchor.Type c5 = constraintAnchor.c;
                    final ConstraintAnchor.Type top = ConstraintAnchor.Type.TOP;
                    SolverVariable solverVariable3;
                    SolverVariable solverVariable4;
                    if (c5 != top && c5 != ConstraintAnchor.Type.BOTTOM) {
                        solverVariable3 = c.j(this.D.f(ConstraintAnchor.Type.LEFT));
                        solverVariable4 = c.j(this.D.f(ConstraintAnchor.Type.RIGHT));
                    }
                    else {
                        solverVariable3 = c.j(this.D.f(top));
                        solverVariable4 = c.j(this.D.f(ConstraintAnchor.Type.BOTTOM));
                    }
                    final androidx.constraintlayout.solver.b m = c.k();
                    m.c.f(i, -1.0f);
                    m.c.f(j, 1.0f);
                    m.c.f(solverVariable4, n8);
                    m.c.f(solverVariable3, -n8);
                    c.c(m);
                    n2 = 0;
                    break Label_0723;
                }
                n2 = n6;
            }
            max = n4;
            n7 = n;
            n6 = n2;
            if (n2 != 0) {
                max = n4;
                n7 = n;
                n6 = n2;
                if (n10 != 2) {
                    max = n4;
                    n7 = n;
                    n6 = n2;
                    if (!b3) {
                        n6 = (n2 = Math.max(n, min));
                        if (n4 > 0) {
                            n2 = Math.min(n4, n6);
                        }
                        c.e(i, j, n2, 6);
                        n6 = 0;
                        n7 = n;
                        max = n4;
                    }
                }
            }
        }
        if (b5 && !b4) {
            if (c2 == 0 && !c3 && !c4) {
                if (b) {
                    c.f(solverVariable2, i, 0, 5);
                }
            }
            else if (c2 != 0 && !c3) {
                if (b) {
                    c.f(solverVariable2, i, 0, 5);
                }
            }
            else if (c2 == 0 && c3) {
                c.e(i, l, -constraintAnchor2.b(), 6);
                if (b) {
                    c.f(j, solverVariable, 0, 5);
                }
            }
            else if (c2 != 0 && c3) {
                Label_1182: {
                    if (n6 != 0) {
                        if (b && n3 == 0) {
                            c.f(i, j, 0, 6);
                        }
                        if (n11 == 0) {
                            if (max <= 0 && n7 <= 0) {
                                n2 = 6;
                                n = 0;
                            }
                            else {
                                n = 1;
                                n2 = 4;
                            }
                            c.e(j, k, constraintAnchor.b(), n2);
                            c.e(i, l, -constraintAnchor2.b(), n2);
                            if (max <= 0 && n7 <= 0) {
                                n2 = 0;
                            }
                            else {
                                n2 = 1;
                            }
                            n3 = 5;
                            break Label_1182;
                        }
                        if (n11 == 1) {
                            n3 = 6;
                            n2 = 1;
                            n = 1;
                            break Label_1182;
                        }
                        if (n11 == 3) {
                            if (!b3 && this.n != -1 && max <= 0) {
                                n = 6;
                            }
                            else {
                                n = 4;
                            }
                            c.e(j, k, constraintAnchor.b(), n);
                            c.e(i, l, -constraintAnchor2.b(), n);
                            n = 1;
                        }
                        else {
                            n = 0;
                        }
                        n2 = n;
                    }
                    else {
                        n = 0;
                        n2 = 1;
                    }
                    n3 = 5;
                }
                boolean b8 = false;
                boolean b9 = false;
                Label_1301: {
                    Label_1291: {
                        if (n2 != 0) {
                            c.b(j, k, constraintAnchor.b(), n5, l, i, constraintAnchor2.b(), n3);
                            final boolean b6 = constraintAnchor.d.b instanceof androidx.constraintlayout.solver.widgets.b;
                            final boolean b7 = constraintAnchor2.d.b instanceof androidx.constraintlayout.solver.widgets.b;
                            if (b6 && !b7) {
                                b8 = true;
                                n2 = 6;
                                break Label_1291;
                            }
                            if (!b6 && b7) {
                                b8 = b;
                                n3 = 5;
                                b9 = true;
                                n2 = 6;
                                break Label_1301;
                            }
                        }
                        b8 = b;
                        n2 = 5;
                    }
                    n3 = n2;
                    n2 = 5;
                    b9 = b;
                }
                if (n != 0) {
                    n3 = 6;
                    n2 = 6;
                }
                if ((n6 == 0 && b9) || n != 0) {
                    c.f(j, k, constraintAnchor.b(), n2);
                }
                if ((n6 == 0 && b8) || n != 0) {
                    c.g(i, l, -constraintAnchor2.b(), n3);
                }
                if (b) {
                    c.f(j, solverVariable, 0, 6);
                }
            }
            if (b) {
                c.f(solverVariable2, i, 0, 6);
            }
            return;
        }
        if (n10 < 2 && b) {
            c.f(j, solverVariable, 0, 6);
            c.f(solverVariable2, i, 0, 6);
        }
    }
    
    public final void e(final c c) {
        c.j(this.s);
        c.j(this.t);
        c.j(this.u);
        c.j(this.v);
        if (this.Q > 0) {
            c.j(this.w);
        }
    }
    
    public ConstraintAnchor f(final ConstraintAnchor.Type type) {
        switch (ConstraintWidget$a.a[type.ordinal()]) {
            default: {
                throw new AssertionError((Object)type.name());
            }
            case 9: {
                return null;
            }
            case 8: {
                return this.y;
            }
            case 7: {
                return this.x;
            }
            case 6: {
                return this.z;
            }
            case 5: {
                return this.w;
            }
            case 4: {
                return this.v;
            }
            case 3: {
                return this.u;
            }
            case 2: {
                return this.t;
            }
            case 1: {
                return this.s;
            }
        }
    }
    
    public final int g() {
        if (this.Y == 8) {
            return 0;
        }
        return this.F;
    }
    
    public final int h(final int n) {
        if (n == 0) {
            return this.k();
        }
        if (n == 1) {
            return this.g();
        }
        return 0;
    }
    
    public final b i() {
        if (this.d == null) {
            this.d = new b();
        }
        return this.d;
    }
    
    public final b j() {
        if (this.c == null) {
            this.c = new b();
        }
        return this.c;
    }
    
    public final int k() {
        if (this.Y == 8) {
            return 0;
        }
        return this.E;
    }
    
    public final void l(final ConstraintAnchor.Type type, final ConstraintWidget constraintWidget, final ConstraintAnchor.Type type2, final int n, final int n2) {
        this.f(type).a(constraintWidget.f(type2), n, n2, ConstraintAnchor.Strength.STRONG, 0, true);
    }
    
    public final boolean m(int n) {
        n *= 2;
        final ConstraintAnchor[] a = this.A;
        final ConstraintAnchor constraintAnchor = a[n];
        final ConstraintAnchor d = constraintAnchor.d;
        boolean b = true;
        if (d != null && d.d != constraintAnchor) {
            final ConstraintAnchor constraintAnchor2 = a[n + 1];
            final ConstraintAnchor d2 = constraintAnchor2.d;
            if (d2 != null && d2.d == constraintAnchor2) {
                return b;
            }
        }
        b = false;
        return b;
    }
    
    public final boolean n() {
        return this.s.a.b == 1 && this.u.a.b == 1 && this.t.a.b == 1 && this.v.a.b == 1;
    }
    
    public void o() {
        this.s.d();
        this.t.d();
        this.u.d();
        this.v.d();
        this.w.d();
        this.x.d();
        this.y.d();
        this.z.d();
        this.D = null;
        this.r = 0.0f;
        this.E = 0;
        this.F = 0;
        this.G = 0.0f;
        this.H = -1;
        this.I = 0;
        this.J = 0;
        this.M = 0;
        this.N = 0;
        this.O = 0;
        this.P = 0;
        this.Q = 0;
        this.R = 0;
        this.S = 0;
        this.T = 0;
        this.U = 0;
        this.V = 0.5f;
        this.W = 0.5f;
        final DimensionBehaviour[] c = this.C;
        c[1] = (c[0] = DimensionBehaviour.FIXED);
        this.X = null;
        this.Y = 0;
        this.d0 = 0;
        this.e0 = 0;
        final float[] f0 = this.f0;
        f0[1] = (f0[0] = -1.0f);
        this.a = -1;
        this.b = -1;
        final int[] q = this.q;
        q[1] = (q[0] = Integer.MAX_VALUE);
        this.e = 0;
        this.f = 0;
        this.j = 1.0f;
        this.m = 1.0f;
        this.i = Integer.MAX_VALUE;
        this.l = Integer.MAX_VALUE;
        this.h = 0;
        this.k = 0;
        this.n = -1;
        this.o = 1.0f;
        final b c2 = this.c;
        if (c2 != null) {
            c2.f();
        }
        final b d = this.d;
        if (d != null) {
            d.f();
        }
        this.p = null;
        this.a0 = false;
        this.b0 = false;
        this.c0 = false;
    }
    
    public void p() {
        for (int i = 0; i < 6; ++i) {
            this.A[i].a.j();
        }
    }
    
    public void q(final a a) {
        this.s.e();
        this.t.e();
        this.u.e();
        this.v.e();
        this.w.e();
        this.z.e();
        this.x.e();
        this.y.e();
    }
    
    public void r() {
    }
    
    public final void s(final int f) {
        this.F = f;
        final int s = this.S;
        if (f < s) {
            this.F = s;
        }
    }
    
    public final void t(final DimensionBehaviour dimensionBehaviour) {
        this.C[0] = dimensionBehaviour;
        if (dimensionBehaviour == DimensionBehaviour.WRAP_CONTENT) {
            this.w(this.T);
        }
    }
    
    @Override
    public final String toString() {
        String f = "";
        final StringBuilder t = a.t("");
        if (this.Z != null) {
            f = ph0.a.f(a.t("id: "), this.Z, " ");
        }
        t.append(f);
        t.append("(");
        t.append(this.I);
        t.append(", ");
        t.append(this.J);
        t.append(") - (");
        t.append(this.E);
        t.append(" x ");
        t.append(this.F);
        t.append(") wrap: (");
        t.append(this.T);
        t.append(" x ");
        return a.q(t, this.U, ")");
    }
    
    public void u(final int o, final int p2) {
        this.O = o;
        this.P = p2;
    }
    
    public final void v(final DimensionBehaviour dimensionBehaviour) {
        this.C[1] = dimensionBehaviour;
        if (dimensionBehaviour == DimensionBehaviour.WRAP_CONTENT) {
            this.s(this.U);
        }
    }
    
    public final void w(final int e) {
        this.E = e;
        final int r = this.R;
        if (e < r) {
            this.E = r;
        }
    }
    
    public void x() {
        final int i = this.I;
        final int j = this.J;
        this.M = i;
        this.N = j;
    }
    
    public void y(final c c) {
        final ConstraintAnchor s = this.s;
        c.getClass();
        int m = c.m(s);
        int i = c.m(this.t);
        int j = c.m(this.u);
        final int k = c.m(this.v);
        int n;
        if (j - m < 0 || k - i < 0 || m == Integer.MIN_VALUE || m == Integer.MAX_VALUE || i == Integer.MIN_VALUE || i == Integer.MAX_VALUE || j == Integer.MIN_VALUE || j == Integer.MAX_VALUE || k == Integer.MIN_VALUE || (n = k) == Integer.MAX_VALUE) {
            m = 0;
            final int n2 = 0;
            n = (j = n2);
            i = n2;
        }
        final int n3 = j - m;
        final int n4 = n - i;
        this.I = m;
        this.J = i;
        if (this.Y == 8) {
            this.E = 0;
            this.F = 0;
        }
        else {
            final DimensionBehaviour[] c2 = this.C;
            final DimensionBehaviour dimensionBehaviour = c2[0];
            final DimensionBehaviour fixed = DimensionBehaviour.FIXED;
            int e = n3;
            if (dimensionBehaviour == fixed) {
                final int e2 = this.E;
                if ((e = n3) < e2) {
                    e = e2;
                }
            }
            int f = n4;
            if (c2[1] == fixed) {
                final int f2 = this.F;
                if ((f = n4) < f2) {
                    f = f2;
                }
            }
            this.E = e;
            this.F = f;
            final int s2 = this.S;
            if (f < s2) {
                this.F = s2;
            }
            final int r = this.R;
            if (e < r) {
                this.E = r;
            }
            this.b0 = true;
        }
    }
    
    public enum DimensionBehaviour
    {
        private static final DimensionBehaviour[] $VALUES;
        
        FIXED, 
        MATCH_CONSTRAINT, 
        MATCH_PARENT, 
        WRAP_CONTENT;
    }
}
