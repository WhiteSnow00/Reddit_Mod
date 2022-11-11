// 
// Decompiled by Procyon v0.6.0
// 

package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;
import androidx.constraintlayout.core.b;
import androidx.constraintlayout.core.SolverVariable;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.HashSet;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.core.widgets.analyzer.d;
import f3.c;
import java.util.ArrayList;

public class ConstraintWidget
{
    public float A;
    public int B;
    public float C;
    public int[] D;
    public float E;
    public boolean F;
    public ConstraintAnchor G;
    public ConstraintAnchor H;
    public ConstraintAnchor I;
    public ConstraintAnchor J;
    public ConstraintAnchor K;
    public ConstraintAnchor L;
    public ConstraintAnchor M;
    public ConstraintAnchor N;
    public ConstraintAnchor[] O;
    public ArrayList<ConstraintAnchor> P;
    public boolean[] Q;
    public DimensionBehaviour[] R;
    public ConstraintWidget S;
    public int T;
    public int U;
    public float V;
    public int W;
    public int X;
    public int Y;
    public int Z;
    public boolean a;
    public int a0;
    public c b;
    public int b0;
    public c c;
    public float c0;
    public androidx.constraintlayout.core.widgets.analyzer.c d;
    public float d0;
    public d e;
    public Object e0;
    public boolean[] f;
    public int f0;
    public boolean g;
    public String g0;
    public boolean h;
    public int h0;
    public int i;
    public int i0;
    public int j;
    public float[] j0;
    public c3.d k;
    public ConstraintWidget[] k0;
    public String l;
    public ConstraintWidget[] l0;
    public boolean m;
    public int m0;
    public boolean n;
    public int n0;
    public boolean o;
    public boolean p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int[] u;
    public int v;
    public int w;
    public float x;
    public int y;
    public int z;
    
    public ConstraintWidget() {
        this.a = false;
        this.d = null;
        this.e = null;
        this.f = new boolean[] { true, true };
        this.g = true;
        this.h = true;
        this.i = -1;
        this.j = -1;
        this.k = new c3.d(this);
        this.m = false;
        this.n = false;
        this.o = false;
        this.p = false;
        this.q = -1;
        this.r = -1;
        this.s = 0;
        this.t = 0;
        this.u = new int[2];
        this.v = 0;
        this.w = 0;
        this.x = 1.0f;
        this.y = 0;
        this.z = 0;
        this.A = 1.0f;
        this.B = -1;
        this.C = 1.0f;
        this.D = new int[] { Integer.MAX_VALUE, Integer.MAX_VALUE };
        this.E = 0.0f;
        this.F = false;
        final ConstraintAnchor g = new ConstraintAnchor(this, ConstraintAnchor.Type.LEFT);
        this.G = g;
        final ConstraintAnchor h = new ConstraintAnchor(this, ConstraintAnchor.Type.TOP);
        this.H = h;
        final ConstraintAnchor i = new ConstraintAnchor(this, ConstraintAnchor.Type.RIGHT);
        this.I = i;
        final ConstraintAnchor j = new ConstraintAnchor(this, ConstraintAnchor.Type.BOTTOM);
        this.J = j;
        final ConstraintAnchor k = new ConstraintAnchor(this, ConstraintAnchor.Type.BASELINE);
        this.K = k;
        this.L = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_X);
        this.M = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_Y);
        final ConstraintAnchor n = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER);
        this.N = n;
        this.O = new ConstraintAnchor[] { g, i, h, j, k, n };
        this.P = new ArrayList<ConstraintAnchor>();
        this.Q = new boolean[2];
        final DimensionBehaviour fixed = DimensionBehaviour.FIXED;
        this.R = new DimensionBehaviour[] { fixed, fixed };
        this.S = null;
        this.T = 0;
        this.U = 0;
        this.V = 0.0f;
        this.W = -1;
        this.X = 0;
        this.Y = 0;
        this.Z = 0;
        this.c0 = 0.5f;
        this.d0 = 0.5f;
        this.f0 = 0;
        this.g0 = null;
        this.h0 = 0;
        this.i0 = 0;
        this.j0 = new float[] { -1.0f, -1.0f };
        this.k0 = new ConstraintWidget[] { null, null };
        this.l0 = new ConstraintWidget[] { null, null };
        this.m0 = -1;
        this.n0 = -1;
        this.a();
    }
    
    public ConstraintWidget(final int t, final int u) {
        this.a = false;
        this.d = null;
        this.e = null;
        this.f = new boolean[] { true, true };
        this.g = true;
        this.h = true;
        this.i = -1;
        this.j = -1;
        this.k = new c3.d(this);
        this.m = false;
        this.n = false;
        this.o = false;
        this.p = false;
        this.q = -1;
        this.r = -1;
        this.s = 0;
        this.t = 0;
        this.u = new int[2];
        this.v = 0;
        this.w = 0;
        this.x = 1.0f;
        this.y = 0;
        this.z = 0;
        this.A = 1.0f;
        this.B = -1;
        this.C = 1.0f;
        this.D = new int[] { Integer.MAX_VALUE, Integer.MAX_VALUE };
        this.E = 0.0f;
        this.F = false;
        final ConstraintAnchor g = new ConstraintAnchor(this, ConstraintAnchor.Type.LEFT);
        this.G = g;
        final ConstraintAnchor h = new ConstraintAnchor(this, ConstraintAnchor.Type.TOP);
        this.H = h;
        final ConstraintAnchor i = new ConstraintAnchor(this, ConstraintAnchor.Type.RIGHT);
        this.I = i;
        final ConstraintAnchor j = new ConstraintAnchor(this, ConstraintAnchor.Type.BOTTOM);
        this.J = j;
        final ConstraintAnchor k = new ConstraintAnchor(this, ConstraintAnchor.Type.BASELINE);
        this.K = k;
        this.L = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_X);
        this.M = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_Y);
        final ConstraintAnchor n = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER);
        this.N = n;
        this.O = new ConstraintAnchor[] { g, i, h, j, k, n };
        this.P = new ArrayList<ConstraintAnchor>();
        this.Q = new boolean[2];
        final DimensionBehaviour fixed = DimensionBehaviour.FIXED;
        this.R = new DimensionBehaviour[] { fixed, fixed };
        this.S = null;
        this.V = 0.0f;
        this.W = -1;
        this.Z = 0;
        this.c0 = 0.5f;
        this.d0 = 0.5f;
        this.f0 = 0;
        this.g0 = null;
        this.h0 = 0;
        this.i0 = 0;
        this.j0 = new float[] { -1.0f, -1.0f };
        this.k0 = new ConstraintWidget[] { null, null };
        this.l0 = new ConstraintWidget[] { null, null };
        this.m0 = -1;
        this.n0 = -1;
        this.X = 0;
        this.Y = 0;
        this.T = t;
        this.U = u;
        this.a();
    }
    
    public final void A(final int y, final int n) {
        if (this.n) {
            return;
        }
        this.H.i(y);
        this.J.i(n);
        this.Y = y;
        this.U = n - y;
        if (this.F) {
            this.K.i(y + this.Z);
        }
        this.n = true;
    }
    
    public final void B(final int u) {
        this.U = u;
        final int b0 = this.b0;
        if (u < b0) {
            this.U = b0;
        }
    }
    
    public final void C(final DimensionBehaviour dimensionBehaviour) {
        this.R[0] = dimensionBehaviour;
    }
    
    public final void D(final DimensionBehaviour dimensionBehaviour) {
        this.R[1] = dimensionBehaviour;
    }
    
    public final void E(final int t) {
        this.T = t;
        final int a0 = this.a0;
        if (t < a0) {
            this.T = a0;
        }
    }
    
    public void F(final boolean b, final boolean b2) {
        final androidx.constraintlayout.core.widgets.analyzer.c d = this.d;
        final boolean b3 = b & ((WidgetRun)d).g;
        final d e = this.e;
        final boolean b4 = b2 & ((WidgetRun)e).g;
        int g = ((WidgetRun)d).h.g;
        int g2 = ((WidgetRun)e).h.g;
        int g3 = ((WidgetRun)d).i.g;
        final int g4 = ((WidgetRun)e).i.g;
        int n;
        if (g3 - g < 0 || g4 - g2 < 0 || g == Integer.MIN_VALUE || g == Integer.MAX_VALUE || g2 == Integer.MIN_VALUE || g2 == Integer.MAX_VALUE || g3 == Integer.MIN_VALUE || g3 == Integer.MAX_VALUE || g4 == Integer.MIN_VALUE || (n = g4) == Integer.MAX_VALUE) {
            g3 = (n = 0);
            g = (g2 = n);
        }
        final int n2 = g3 - g;
        final int n3 = n - g2;
        if (b3) {
            this.X = g;
        }
        if (b4) {
            this.Y = g2;
        }
        if (this.f0 == 8) {
            this.T = 0;
            this.U = 0;
            return;
        }
        if (b3) {
            int t = n2;
            if (this.R[0] == DimensionBehaviour.FIXED) {
                final int t2 = this.T;
                if ((t = n2) < t2) {
                    t = t2;
                }
            }
            this.T = t;
            final int a0 = this.a0;
            if (t < a0) {
                this.T = a0;
            }
        }
        if (b4) {
            int u = n3;
            if (this.R[1] == DimensionBehaviour.FIXED) {
                final int u2 = this.U;
                if ((u = n3) < u2) {
                    u = u2;
                }
            }
            this.U = u;
            final int b5 = this.b0;
            if (u < b5) {
                this.U = b5;
            }
        }
    }
    
    public void G(final androidx.constraintlayout.core.c c, final boolean b) {
        final ConstraintAnchor g = this.G;
        c.getClass();
        final int n = androidx.constraintlayout.core.c.n(g);
        final int n2 = androidx.constraintlayout.core.c.n(this.H);
        final int n3 = androidx.constraintlayout.core.c.n(this.I);
        final int n4 = androidx.constraintlayout.core.c.n(this.J);
        int g2 = n3;
        int g3 = n;
        if (b) {
            final androidx.constraintlayout.core.widgets.analyzer.c d = this.d;
            g2 = n3;
            g3 = n;
            if (d != null) {
                final DependencyNode h = ((WidgetRun)d).h;
                g2 = n3;
                g3 = n;
                if (h.j) {
                    final DependencyNode i = ((WidgetRun)d).i;
                    g2 = n3;
                    g3 = n;
                    if (i.j) {
                        g3 = h.g;
                        g2 = i.g;
                    }
                }
            }
        }
        int g4 = n2;
        int g5 = n4;
        if (b) {
            final d e = this.e;
            g4 = n2;
            g5 = n4;
            if (e != null) {
                final DependencyNode h2 = ((WidgetRun)e).h;
                g4 = n2;
                g5 = n4;
                if (h2.j) {
                    final DependencyNode j = ((WidgetRun)e).i;
                    g4 = n2;
                    g5 = n4;
                    if (j.j) {
                        g4 = h2.g;
                        g5 = j.g;
                    }
                }
            }
        }
        int y = 0;
        int n5 = 0;
        int n6 = 0;
        int x = 0;
        Label_0320: {
            if (g2 - g3 >= 0 && g5 - g4 >= 0 && g3 != Integer.MIN_VALUE && g3 != Integer.MAX_VALUE && g4 != Integer.MIN_VALUE && g4 != Integer.MAX_VALUE && g2 != Integer.MIN_VALUE && g2 != Integer.MAX_VALUE && g5 != Integer.MIN_VALUE) {
                y = g4;
                n5 = g2;
                n6 = g5;
                x = g3;
                if (g5 != Integer.MAX_VALUE) {
                    break Label_0320;
                }
            }
            final int n7;
            x = (n7 = 0);
            n6 = (n5 = n7);
            y = n7;
        }
        final int n8 = n5 - x;
        final int n9 = n6 - y;
        this.X = x;
        this.Y = y;
        if (this.f0 == 8) {
            this.T = 0;
            this.U = 0;
        }
        else {
            final DimensionBehaviour[] r = this.R;
            final DimensionBehaviour dimensionBehaviour = r[0];
            final DimensionBehaviour fixed = DimensionBehaviour.FIXED;
            int t = n8;
            if (dimensionBehaviour == fixed) {
                final int t2 = this.T;
                if ((t = n8) < t2) {
                    t = t2;
                }
            }
            int u = n9;
            if (r[1] == fixed) {
                final int u2 = this.U;
                if ((u = n9) < u2) {
                    u = u2;
                }
            }
            this.T = t;
            this.U = u;
            final int b2 = this.b0;
            if (u < b2) {
                this.U = b2;
            }
            final int a0 = this.a0;
            if (t < a0) {
                this.T = a0;
            }
            final int w = this.w;
            if (w > 0 && dimensionBehaviour == DimensionBehaviour.MATCH_CONSTRAINT) {
                this.T = Math.min(this.T, w);
            }
            final int z = this.z;
            if (z > 0 && this.R[1] == DimensionBehaviour.MATCH_CONSTRAINT) {
                this.U = Math.min(this.U, z);
            }
            final int t3 = this.T;
            if (t != t3) {
                this.i = t3;
            }
            final int u3 = this.U;
            if (u != u3) {
                this.j = u3;
            }
        }
    }
    
    public final void a() {
        this.P.add(this.G);
        this.P.add(this.H);
        this.P.add(this.I);
        this.P.add(this.J);
        this.P.add(this.L);
        this.P.add(this.M);
        this.P.add(this.N);
        this.P.add(this.K);
    }
    
    public final void b(final androidx.constraintlayout.core.widgets.d d, final androidx.constraintlayout.core.c c, final HashSet<ConstraintWidget> set, final int n, final boolean b) {
        if (b) {
            if (!set.contains(this)) {
                return;
            }
            androidx.constraintlayout.core.widgets.f.a(d, c, this);
            set.remove(this);
            this.c(c, d.L(64));
        }
        if (n == 0) {
            final HashSet<ConstraintAnchor> a = this.G.a;
            if (a != null) {
                final Iterator<ConstraintAnchor> iterator = a.iterator();
                while (iterator.hasNext()) {
                    iterator.next().d.b(d, c, set, n, true);
                }
            }
            final HashSet<ConstraintAnchor> a2 = this.I.a;
            if (a2 != null) {
                final Iterator<ConstraintAnchor> iterator2 = a2.iterator();
                while (iterator2.hasNext()) {
                    iterator2.next().d.b(d, c, set, n, true);
                }
            }
        }
        else {
            final HashSet<ConstraintAnchor> a3 = this.H.a;
            if (a3 != null) {
                final Iterator<ConstraintAnchor> iterator3 = a3.iterator();
                while (iterator3.hasNext()) {
                    iterator3.next().d.b(d, c, set, n, true);
                }
            }
            final HashSet<ConstraintAnchor> a4 = this.J.a;
            if (a4 != null) {
                final Iterator<ConstraintAnchor> iterator4 = a4.iterator();
                while (iterator4.hasNext()) {
                    iterator4.next().d.b(d, c, set, n, true);
                }
            }
            final HashSet<ConstraintAnchor> a5 = this.K.a;
            if (a5 != null) {
                final Iterator<ConstraintAnchor> iterator5 = a5.iterator();
                while (iterator5.hasNext()) {
                    iterator5.next().d.b(d, c, set, n, true);
                }
            }
        }
    }
    
    public void c(final androidx.constraintlayout.core.c c, final boolean b) {
        final SolverVariable k = c.k(this.G);
        final SolverVariable i = c.k(this.I);
        final SolverVariable j = c.k(this.H);
        final SolverVariable l = c.k(this.J);
        final SolverVariable m = c.k(this.K);
        final ConstraintWidget s = this.S;
        boolean b3;
        boolean b4;
        if (s != null) {
            final DimensionBehaviour[] r = s.R;
            final DimensionBehaviour dimensionBehaviour = r[0];
            final DimensionBehaviour wrap_CONTENT = DimensionBehaviour.WRAP_CONTENT;
            final boolean b2 = dimensionBehaviour == wrap_CONTENT;
            b3 = (r[1] == wrap_CONTENT);
            b4 = b2;
        }
        else {
            b3 = (b4 = false);
        }
        Label_0246: {
            if (this.f0 == 8) {
                final int size = this.P.size();
                int n = 0;
                while (true) {
                    while (n < size) {
                        final HashSet<ConstraintAnchor> a = this.P.get(n).a;
                        boolean b5 = false;
                        Label_0200: {
                            if (a != null) {
                                if (a.size() > 0) {
                                    b5 = true;
                                    break Label_0200;
                                }
                            }
                            b5 = false;
                        }
                        if (b5) {
                            final boolean b6 = true;
                            if (b6) {
                                break Label_0246;
                            }
                            final boolean[] q = this.Q;
                            if (!q[0] && !q[1]) {
                                return;
                            }
                            break Label_0246;
                        }
                        else {
                            ++n;
                        }
                    }
                    final boolean b6 = false;
                    continue;
                }
            }
        }
        final boolean m2 = this.m;
        if (m2 || this.n) {
            if (m2) {
                c.d(k, this.X);
                c.d(i, this.X + this.T);
                if (b4) {
                    final ConstraintWidget s2 = this.S;
                    if (s2 != null) {
                        if (this.h) {
                            final androidx.constraintlayout.core.widgets.d d = (androidx.constraintlayout.core.widgets.d)s2;
                            final ConstraintAnchor g = this.G;
                            final WeakReference c2 = d.C0;
                            if (c2 == null || c2.get() == null || g.c() > ((ConstraintAnchor)d.C0.get()).c()) {
                                d.C0 = new WeakReference(g);
                            }
                            final ConstraintAnchor i2 = this.I;
                            final WeakReference e0 = d.E0;
                            if (e0 == null || e0.get() == null || i2.c() > ((ConstraintAnchor)d.E0.get()).c()) {
                                d.E0 = new WeakReference(i2);
                            }
                        }
                        else {
                            c.f(c.k(s2.I), i, 0, 5);
                        }
                    }
                }
            }
            if (this.n) {
                c.d(j, this.Y);
                c.d(l, this.Y + this.U);
                final HashSet<ConstraintAnchor> a2 = this.K.a;
                boolean b7 = false;
                Label_0533: {
                    if (a2 != null) {
                        if (a2.size() > 0) {
                            b7 = true;
                            break Label_0533;
                        }
                    }
                    b7 = false;
                }
                if (b7) {
                    c.d(m, this.Y + this.Z);
                }
                if (b3) {
                    final ConstraintWidget s3 = this.S;
                    if (s3 != null) {
                        if (this.h) {
                            final androidx.constraintlayout.core.widgets.d d2 = (androidx.constraintlayout.core.widgets.d)s3;
                            final ConstraintAnchor h = this.H;
                            final WeakReference b8 = d2.B0;
                            if (b8 == null || b8.get() == null || h.c() > ((ConstraintAnchor)d2.B0.get()).c()) {
                                d2.B0 = new WeakReference(h);
                            }
                            final ConstraintAnchor j2 = this.J;
                            final WeakReference d3 = d2.D0;
                            if (d3 == null || d3.get() == null || j2.c() > ((ConstraintAnchor)d2.D0.get()).c()) {
                                d2.D0 = new WeakReference(j2);
                            }
                        }
                        else {
                            c.f(c.k(s3.J), l, 0, 5);
                        }
                    }
                }
            }
            if (this.m && this.n) {
                this.m = false;
                this.n = false;
                return;
            }
        }
        if (b) {
            final androidx.constraintlayout.core.widgets.analyzer.c d4 = this.d;
            if (d4 != null) {
                final d e2 = this.e;
                if (e2 != null) {
                    final DependencyNode h2 = ((WidgetRun)d4).h;
                    if (h2.j && ((WidgetRun)d4).i.j && ((WidgetRun)e2).h.j && ((WidgetRun)e2).i.j) {
                        c.d(k, h2.g);
                        c.d(i, ((WidgetRun)this.d).i.g);
                        c.d(j, ((WidgetRun)this.e).h.g);
                        c.d(l, ((WidgetRun)this.e).i.g);
                        c.d(m, this.e.k.g);
                        if (this.S != null) {
                            if (b4 && this.f[0] && !this.r()) {
                                c.f(c.k(this.S.I), i, 0, 8);
                            }
                            if (b3 && this.f[1] && !this.s()) {
                                c.f(c.k(this.S.J), l, 0, 8);
                            }
                        }
                        this.m = false;
                        this.n = false;
                        return;
                    }
                }
            }
        }
        int n3;
        boolean b9;
        if (this.S != null) {
            int r2;
            if (this.q(0)) {
                ((androidx.constraintlayout.core.widgets.d)this.S).I(0, this);
                r2 = 1;
            }
            else {
                r2 = (this.r() ? 1 : 0);
            }
            int s4;
            if (this.q(1)) {
                ((androidx.constraintlayout.core.widgets.d)this.S).I(1, this);
                s4 = 1;
            }
            else {
                s4 = (this.s() ? 1 : 0);
            }
            if (r2 == 0 && b4 && this.f0 != 8 && this.G.f == null && this.I.f == null) {
                c.f(c.k(this.S.I), i, 0, 1);
            }
            if (s4 == 0 && b3 && this.f0 != 8 && this.H.f == null && this.J.f == null && this.K == null) {
                c.f(c.k(this.S.J), l, 0, 1);
            }
            final int n2 = r2;
            n3 = s4;
            b9 = (n2 != 0);
        }
        else {
            n3 = ((b9 = false) ? 1 : 0);
        }
        final int t = this.T;
        int a3 = this.a0;
        if (t >= a3) {
            a3 = t;
        }
        final int u = this.U;
        int b10 = this.b0;
        if (u >= b10) {
            b10 = u;
        }
        final DimensionBehaviour[] r3 = this.R;
        final DimensionBehaviour dimensionBehaviour2 = r3[0];
        final DimensionBehaviour match_CONSTRAINT = DimensionBehaviour.MATCH_CONSTRAINT;
        final boolean b11 = dimensionBehaviour2 != match_CONSTRAINT;
        final DimensionBehaviour dimensionBehaviour3 = r3[1];
        final boolean b12 = dimensionBehaviour3 != match_CONSTRAINT;
        final int w = this.W;
        this.B = w;
        final float v = this.V;
        this.C = v;
        final int s5 = this.s;
        final int t2 = this.t;
        int n4 = 0;
        int n6 = 0;
        int n10 = 0;
        int n12 = 0;
        int n13 = 0;
        Label_1961: {
            int n5 = 0;
            Label_1796: {
                if (v > 0.0f) {
                    n4 = s5;
                    n5 = t2;
                    n6 = a3;
                    if (this.f0 != 8) {
                        int n7 = s5;
                        if (dimensionBehaviour2 == match_CONSTRAINT && (n7 = s5) == 0) {
                            n7 = 3;
                        }
                        n5 = t2;
                        if (dimensionBehaviour3 == match_CONSTRAINT && (n5 = t2) == 0) {
                            n5 = 3;
                        }
                        if (dimensionBehaviour2 == match_CONSTRAINT && dimensionBehaviour3 == match_CONSTRAINT && n7 == 3 && n5 == 3) {
                            if (w == -1) {
                                if (b11 && !b12) {
                                    this.B = 0;
                                }
                                else if (!b11 && b12) {
                                    this.B = 1;
                                    if (w == -1) {
                                        this.C = 1.0f / v;
                                    }
                                }
                            }
                            if (this.B == 0 && (!this.H.f() || !this.J.f())) {
                                this.B = 1;
                            }
                            else if (this.B == 1 && (!this.G.f() || !this.I.f())) {
                                this.B = 0;
                            }
                            if (this.B == -1 && (!this.H.f() || !this.J.f() || !this.G.f() || !this.I.f())) {
                                if (this.H.f() && this.J.f()) {
                                    this.B = 0;
                                }
                                else if (this.G.f() && this.I.f()) {
                                    this.C = 1.0f / this.C;
                                    this.B = 1;
                                }
                            }
                            if (this.B == -1) {
                                final int v2 = this.v;
                                if (v2 > 0 && this.y == 0) {
                                    this.B = 0;
                                }
                                else if (v2 == 0 && this.y > 0) {
                                    this.C = 1.0f / this.C;
                                    this.B = 1;
                                }
                            }
                        }
                        else if (dimensionBehaviour2 == match_CONSTRAINT && n7 == 3) {
                            this.B = 0;
                            final int n8 = (int)(v * u);
                            if (dimensionBehaviour3 != match_CONSTRAINT) {
                                n6 = n8;
                                n4 = 4;
                                break Label_1796;
                            }
                            n4 = n7;
                            final int n9 = n5;
                            n10 = b10;
                            final int n11 = 1;
                            n6 = n8;
                            n12 = n11;
                            n13 = n9;
                            break Label_1961;
                        }
                        else if (dimensionBehaviour3 == match_CONSTRAINT && n5 == 3) {
                            this.B = 1;
                            if (w == -1) {
                                this.C = 1.0f / v;
                            }
                            final int n14 = b10 = (int)(this.C * t);
                            if (dimensionBehaviour2 != match_CONSTRAINT) {
                                b10 = n14;
                                n5 = 4;
                                n4 = n7;
                                n6 = a3;
                                break Label_1796;
                            }
                        }
                        n4 = n7;
                        final int n15 = n5;
                        n6 = a3;
                        n12 = 1;
                        n10 = b10;
                        n13 = n15;
                        break Label_1961;
                    }
                }
                else {
                    n4 = s5;
                    n5 = t2;
                    n6 = a3;
                }
            }
            final int n16 = b10;
            final int n17 = 0;
            n13 = n5;
            n10 = n16;
            n12 = n17;
        }
        final int[] u2 = this.u;
        u2[0] = n4;
        u2[1] = n13;
        boolean b14 = false;
        Label_2010: {
            if (n12 != 0) {
                final int b13 = this.B;
                if (b13 == 0 || b13 == -1) {
                    b14 = true;
                    break Label_2010;
                }
            }
            b14 = false;
        }
        boolean b16 = false;
        Label_2042: {
            if (n12 != 0) {
                final int b15 = this.B;
                if (b15 == 1 || b15 == -1) {
                    b16 = true;
                    break Label_2042;
                }
            }
            b16 = false;
        }
        final DimensionBehaviour dimensionBehaviour4 = this.R[0];
        final DimensionBehaviour wrap_CONTENT2 = DimensionBehaviour.WRAP_CONTENT;
        final boolean b17 = dimensionBehaviour4 == wrap_CONTENT2 && this instanceof androidx.constraintlayout.core.widgets.d;
        if (b17) {
            n6 = 0;
        }
        final boolean b18 = this.N.f() ^ true;
        final boolean[] q2 = this.Q;
        final boolean b19 = q2[0];
        final boolean b20 = q2[1];
        Label_2455: {
            if (this.q != 2 && !this.m) {
                if (b) {
                    final androidx.constraintlayout.core.widgets.analyzer.c d5 = this.d;
                    if (d5 != null) {
                        final DependencyNode h3 = ((WidgetRun)d5).h;
                        if (h3.j) {
                            if (((WidgetRun)d5).i.j) {
                                if (!b) {
                                    break Label_2455;
                                }
                                c.d(k, h3.g);
                                c.d(i, ((WidgetRun)this.d).i.g);
                                if (this.S != null && b4 && this.f[0] && !this.r()) {
                                    c.f(c.k(this.S.I), i, 0, 8);
                                }
                                break Label_2455;
                            }
                        }
                    }
                }
                final ConstraintWidget s6 = this.S;
                SolverVariable k2;
                if (s6 != null) {
                    k2 = c.k(s6.I);
                }
                else {
                    k2 = null;
                }
                final ConstraintWidget s7 = this.S;
                SolverVariable k3;
                if (s7 != null) {
                    k3 = c.k(s7.G);
                }
                else {
                    k3 = null;
                }
                final boolean b21 = this.f[0];
                final DimensionBehaviour[] r4 = this.R;
                this.e(c, true, b4, b3, b21, k3, k2, r4[0], b17, this.G, this.I, this.X, n6, this.a0, this.D[0], this.c0, b14, r4[1] == match_CONSTRAINT, b9, (boolean)(n3 != 0), b19, n4, n13, this.v, this.w, this.x, b18);
            }
        }
        final SolverVariable solverVariable = j;
        final SolverVariable solverVariable2 = l;
        final SolverVariable solverVariable3 = m;
        boolean b22 = false;
        Label_2645: {
            if (b) {
                final d e3 = this.e;
                if (e3 != null) {
                    final DependencyNode h4 = ((WidgetRun)e3).h;
                    if (h4.j && ((WidgetRun)e3).i.j) {
                        c.d(solverVariable, h4.g);
                        final int g2 = ((WidgetRun)this.e).i.g;
                        final SolverVariable solverVariable4 = solverVariable2;
                        c.d(solverVariable4, g2);
                        c.d(solverVariable3, this.e.k.g);
                        final ConstraintWidget s8 = this.S;
                        if (s8 != null && n3 == 0 && b3) {
                            if (this.f[1]) {
                                c.f(c.k(s8.J), solverVariable4, 0, 8);
                            }
                        }
                        b22 = false;
                        break Label_2645;
                    }
                }
            }
            b22 = true;
        }
        final SolverVariable solverVariable5 = solverVariable;
        final SolverVariable solverVariable6 = solverVariable3;
        if (this.r == 2) {
            b22 = false;
        }
        if (b22 && !this.n) {
            final boolean b23 = this.R[1] == wrap_CONTENT2 && this instanceof androidx.constraintlayout.core.widgets.d;
            if (b23) {
                n10 = 0;
            }
            final ConstraintWidget s9 = this.S;
            SolverVariable k4;
            if (s9 != null) {
                k4 = c.k(s9.J);
            }
            else {
                k4 = null;
            }
            final ConstraintWidget s10 = this.S;
            SolverVariable k5;
            if (s10 != null) {
                k5 = c.k(s10.H);
            }
            else {
                k5 = null;
            }
            final int z = this.Z;
            boolean b24 = false;
            Label_2934: {
                if (z > 0 || this.f0 == 8) {
                    final ConstraintAnchor k6 = this.K;
                    if (k6.f != null) {
                        c.e(solverVariable6, solverVariable5, z, 8);
                        c.e(solverVariable6, c.k(this.K.f), this.K.d(), 8);
                        if (b3) {
                            c.f(k4, c.k(this.J), 0, 5);
                        }
                        b24 = false;
                        break Label_2934;
                    }
                    if (this.f0 == 8) {
                        c.e(solverVariable6, solverVariable5, k6.d(), 8);
                    }
                    else {
                        c.e(solverVariable6, solverVariable5, z, 8);
                    }
                }
                b24 = b18;
            }
            final boolean b25 = this.f[1];
            final DimensionBehaviour[] r5 = this.R;
            this.e(c, false, b3, b4, b25, k5, k4, r5[1], b23, this.H, this.J, this.Y, n10, this.b0, this.D[1], this.d0, b16, r5[0] == match_CONSTRAINT, (boolean)(n3 != 0), b9, b20, n13, n4, this.y, this.z, this.A, b24);
        }
        if (n12 != 0) {
            if (this.B == 1) {
                final float c3 = this.C;
                final b l2 = c.l();
                l2.d.c(solverVariable2, -1.0f);
                l2.d.c(solverVariable5, 1.0f);
                l2.d.c(i, c3);
                l2.d.c(k, -c3);
                c.c(l2);
            }
            else {
                final float c4 = this.C;
                final b l3 = c.l();
                l3.d.c(i, -1.0f);
                l3.d.c(k, 1.0f);
                l3.d.c(solverVariable2, c4);
                l3.d.c(solverVariable5, -c4);
                c.c(l3);
            }
        }
        if (this.N.f()) {
            final ConstraintWidget d6 = this.N.f.d;
            final float n18 = (float)Math.toRadians(this.E + 90.0f);
            final int d7 = this.N.d();
            final ConstraintAnchor.Type left = ConstraintAnchor.Type.LEFT;
            final SolverVariable k7 = c.k(this.g(left));
            final ConstraintAnchor.Type top = ConstraintAnchor.Type.TOP;
            final SolverVariable k8 = c.k(this.g(top));
            final ConstraintAnchor.Type right = ConstraintAnchor.Type.RIGHT;
            final SolverVariable k9 = c.k(this.g(right));
            final ConstraintAnchor.Type bottom = ConstraintAnchor.Type.BOTTOM;
            final SolverVariable k10 = c.k(this.g(bottom));
            final SolverVariable k11 = c.k(d6.g(left));
            final SolverVariable k12 = c.k(d6.g(top));
            final SolverVariable k13 = c.k(d6.g(right));
            final SolverVariable k14 = c.k(d6.g(bottom));
            final b l4 = c.l();
            final double n19 = n18;
            final double sin = Math.sin(n19);
            final double n20 = d7;
            final float n21 = (float)(sin * n20);
            l4.d.c(k12, 0.5f);
            l4.d.c(k14, 0.5f);
            l4.d.c(k8, -0.5f);
            l4.d.c(k10, -0.5f);
            l4.b = -n21;
            c.c(l4);
            final b l5 = c.l();
            final float n22 = (float)(Math.cos(n19) * n20);
            l5.d.c(k11, 0.5f);
            l5.d.c(k13, 0.5f);
            l5.d.c(k7, -0.5f);
            l5.d.c(k9, -0.5f);
            l5.b = -n22;
            c.c(l5);
        }
        this.m = false;
        this.n = false;
    }
    
    public boolean d() {
        return this.f0 != 8;
    }
    
    public final void e(final androidx.constraintlayout.core.c c, final boolean b, final boolean b2, final boolean b3, boolean b4, final SolverVariable solverVariable, final SolverVariable solverVariable2, DimensionBehaviour dimensionBehaviour, final boolean b5, final ConstraintAnchor constraintAnchor, final ConstraintAnchor constraintAnchor2, int n, int n2, final int n3, int n4, final float n5, final boolean b6, final boolean b7, final boolean b8, final boolean b9, final boolean b10, int n6, int n7, int n8, int n9, final float n10, final boolean b11) {
        final SolverVariable k = c.k(constraintAnchor);
        final SolverVariable i = c.k(constraintAnchor2);
        final SolverVariable j = c.k(constraintAnchor.f);
        SolverVariable l = c.k(constraintAnchor2.f);
        final int f = constraintAnchor.f() ? 1 : 0;
        final boolean f2 = constraintAnchor2.f();
        final boolean f3 = this.N.f();
        int n11;
        if (f2) {
            n11 = f + 1;
        }
        else {
            n11 = f;
        }
        int n12 = n11;
        if (f3) {
            n12 = n11 + 1;
        }
        if (b6) {
            n6 = 3;
        }
        final int n13 = ConstraintWidget$a.b[dimensionBehaviour.ordinal()];
        boolean b12 = false;
        Label_0158: {
            if (n13 != 1 && n13 != 2 && n13 != 3) {
                if (n13 == 4) {
                    if (n6 != 4) {
                        b12 = true;
                        break Label_0158;
                    }
                }
            }
            b12 = false;
        }
        final int n14 = n6;
        final int m = this.i;
        int n15 = b12 ? 1 : 0;
        n6 = n2;
        if (m != -1) {
            n15 = (b12 ? 1 : 0);
            n6 = n2;
            if (b) {
                this.i = -1;
                n6 = m;
                n15 = 0;
            }
        }
        n2 = this.j;
        if (n2 != -1 && !b) {
            this.j = -1;
            final int n16 = 0;
            n6 = n2;
            n2 = n16;
        }
        else {
            n2 = n15;
        }
        if (this.f0 == 8) {
            n6 = 0;
            n2 = 0;
        }
        if (b11) {
            if (f == 0 && !f2 && !f3) {
                c.d(k, n);
            }
            else if (f != 0 && !f2) {
                c.e(k, j, constraintAnchor.d(), 8);
            }
        }
        int n17 = 0;
        Label_0925: {
            Label_0707: {
                if (n2 == 0) {
                    if (b5) {
                        c.e(i, k, 0, 3);
                        if (n3 > 0) {
                            c.f(i, k, n3, 8);
                        }
                        if (n4 < Integer.MAX_VALUE) {
                            c.g(i, k, n4, 8);
                        }
                    }
                    else {
                        c.e(i, k, n6, 8);
                    }
                    n4 = n8;
                }
                else if (n12 != 2 && !b6 && (n14 == 1 || n14 == 0)) {
                    n2 = (n = Math.max(n8, n6));
                    if (n9 > 0) {
                        n = Math.min(n9, n2);
                    }
                    c.e(i, k, n, 8);
                    n2 = 0;
                    n4 = n8;
                }
                else {
                    if ((n4 = n8) == -2) {
                        n4 = n6;
                    }
                    if ((n = n9) == -2) {
                        n = n6;
                    }
                    if ((n8 = n6) > 0) {
                        n8 = n6;
                        if (n14 != 1) {
                            n8 = 0;
                        }
                    }
                    n6 = n8;
                    if (n4 > 0) {
                        c.f(i, k, n4, 8);
                        n6 = Math.max(n8, n4);
                    }
                    if (n > 0) {
                        if (b2 && n14 == 1) {
                            n8 = 0;
                        }
                        else {
                            n8 = 1;
                        }
                        if (n8 != 0) {
                            c.g(i, k, n, 8);
                        }
                        n6 = Math.min(n6, n);
                    }
                    if (n14 == 1) {
                        if (b2) {
                            c.e(i, k, n6, 8);
                            n9 = n;
                        }
                        else if (b8) {
                            c.e(i, k, n6, 5);
                            c.g(i, k, n6, 8);
                            n9 = n;
                        }
                        else {
                            c.e(i, k, n6, 5);
                            c.g(i, k, n6, 8);
                            n9 = n;
                        }
                    }
                    else {
                        if (n14 == 2) {
                            final ConstraintAnchor.Type e = constraintAnchor.e;
                            final ConstraintAnchor.Type top = ConstraintAnchor.Type.TOP;
                            SolverVariable solverVariable3;
                            SolverVariable solverVariable4;
                            if (e != top && e != ConstraintAnchor.Type.BOTTOM) {
                                solverVariable3 = c.k(this.S.g(ConstraintAnchor.Type.LEFT));
                                solverVariable4 = c.k(this.S.g(ConstraintAnchor.Type.RIGHT));
                            }
                            else {
                                solverVariable3 = c.k(this.S.g(top));
                                solverVariable4 = c.k(this.S.g(ConstraintAnchor.Type.BOTTOM));
                            }
                            final b l2 = c.l();
                            l2.d.c(i, -1.0f);
                            l2.d.c(k, 1.0f);
                            l2.d.c(solverVariable4, n10);
                            l2.d.c(solverVariable3, -n10);
                            c.c(l2);
                            if (b2) {
                                n2 = 0;
                            }
                            n9 = n;
                            n = n2;
                            break Label_0707;
                        }
                        b4 = true;
                        n17 = n2;
                        n9 = n4;
                        n2 = n;
                        break Label_0925;
                    }
                }
                n = n2;
            }
            n2 = n9;
            n9 = n4;
            n17 = n;
        }
        if (b11 && !b8) {
            boolean b13 = false;
            SolverVariable solverVariable5 = null;
            Label_2355: {
                Label_2352: {
                    if (f != 0 || f2 || f3) {
                        if (f != 0 && !f2) {
                            final ConstraintWidget d = constraintAnchor.f.d;
                            if (b2 && d instanceof a) {
                                n = 8;
                            }
                            else {
                                n = 5;
                            }
                            b13 = b2;
                            solverVariable5 = i;
                            break Label_2355;
                        }
                        if (f == 0 && f2) {
                            n = -constraintAnchor2.d();
                            final SolverVariable solverVariable6 = l;
                            c.e(i, solverVariable6, n, 8);
                            if (b2) {
                                c.f(k, solverVariable, 0, 5);
                                l = solverVariable6;
                            }
                        }
                        else {
                            final SolverVariable solverVariable7 = l;
                            if (f != 0 && f2) {
                                final ConstraintWidget d2 = constraintAnchor.f.d;
                                final ConstraintWidget d3 = constraintAnchor2.f.d;
                                final ConstraintWidget s = this.S;
                                final int n18 = 6;
                                Label_1691: {
                                    Label_1662: {
                                        if (n17 != 0) {
                                            if (n14 == 0) {
                                                if (n2 == 0 && n9 == 0) {
                                                    if (j.k && solverVariable7.k) {
                                                        c.e(k, j, constraintAnchor.d(), 8);
                                                        c.e(i, solverVariable7, -constraintAnchor2.d(), 8);
                                                        return;
                                                    }
                                                    n7 = 8;
                                                    n4 = 8;
                                                    n = 0;
                                                    n2 = 1;
                                                    n6 = 0;
                                                }
                                                else {
                                                    n7 = 5;
                                                    n4 = 5;
                                                    n = 1;
                                                    n2 = 0;
                                                    n6 = 1;
                                                }
                                                if (d2 instanceof a || d3 instanceof a) {
                                                    n7 = 4;
                                                }
                                                n8 = n7;
                                                n7 = n2;
                                                final int n19 = n;
                                                final int n20 = 6;
                                                n = n4;
                                                n2 = n8;
                                                n4 = n20;
                                                n8 = n19;
                                                break Label_1691;
                                            }
                                            if (n14 == 2) {
                                                if (!(d2 instanceof a) && !(d3 instanceof a)) {
                                                    n2 = 5;
                                                }
                                                else {
                                                    n2 = 4;
                                                }
                                                n = 5;
                                            }
                                            else if (n14 == 1) {
                                                n2 = 4;
                                                n = 8;
                                            }
                                            else {
                                                if (n14 == 3) {
                                                    Label_1395: {
                                                        if (this.B == -1) {
                                                            if (b9) {
                                                                if (b2) {
                                                                    n = 5;
                                                                }
                                                                else {
                                                                    n = 4;
                                                                }
                                                            }
                                                            else {
                                                                n = 8;
                                                            }
                                                            n6 = 8;
                                                            n2 = 5;
                                                            n4 = n;
                                                            n = n6;
                                                        }
                                                        else {
                                                            if (b6) {
                                                                if (n7 != 2 && n7 != 1) {
                                                                    n = 0;
                                                                }
                                                                else {
                                                                    n = 1;
                                                                }
                                                                if (n == 0) {
                                                                    n2 = 5;
                                                                    n = 8;
                                                                }
                                                                else {
                                                                    n2 = 4;
                                                                    n = 5;
                                                                }
                                                                n4 = 6;
                                                                n8 = 1;
                                                                n6 = 1;
                                                                n7 = 1;
                                                                break Label_1691;
                                                            }
                                                            if (n2 > 0) {
                                                                n = 5;
                                                            }
                                                            else if (n2 == 0 && n9 == 0) {
                                                                if (b9) {
                                                                    if (d2 != s && d3 != s) {
                                                                        n = 4;
                                                                    }
                                                                    else {
                                                                        n = 5;
                                                                    }
                                                                    n4 = 6;
                                                                    n2 = 4;
                                                                    break Label_1395;
                                                                }
                                                                n = 8;
                                                            }
                                                            else {
                                                                n = 4;
                                                            }
                                                            n2 = n;
                                                            n4 = 6;
                                                            n = 5;
                                                        }
                                                    }
                                                    n8 = 1;
                                                    n6 = 1;
                                                    n7 = 1;
                                                    break Label_1691;
                                                }
                                                n2 = 0;
                                                n = 0;
                                                break Label_1662;
                                            }
                                            n4 = 6;
                                            n8 = 1;
                                            n6 = 1;
                                            n7 = 0;
                                            break Label_1691;
                                        }
                                        else {
                                            if (j.k && solverVariable7.k) {
                                                c.b(k, j, constraintAnchor.d(), n5, solverVariable7, i, constraintAnchor2.d(), 8);
                                                if (b2 && b4) {
                                                    if (constraintAnchor2.f != null) {
                                                        n = constraintAnchor2.d();
                                                    }
                                                    else {
                                                        n = 0;
                                                    }
                                                    if (solverVariable7 != solverVariable2) {
                                                        c.f(solverVariable2, i, n, 5);
                                                    }
                                                }
                                                return;
                                            }
                                            n2 = 1;
                                            n = 1;
                                        }
                                    }
                                    n4 = 6;
                                    final int n21 = 5;
                                    final int n22 = 4;
                                    n7 = 0;
                                    n6 = n2;
                                    n8 = n;
                                    n2 = n22;
                                    n = n21;
                                }
                                int n23;
                                if (n6 != 0 && j == solverVariable7 && d2 != s) {
                                    n6 = 0;
                                    n23 = 0;
                                }
                                else {
                                    final int n24 = 1;
                                    n23 = n6;
                                    n6 = n24;
                                }
                                if (n8 != 0) {
                                    if (n17 == 0 && !b7 && !b9 && j == solverVariable && solverVariable7 == solverVariable2) {
                                        b13 = false;
                                        n4 = 8;
                                        n6 = 8;
                                        n = 0;
                                    }
                                    else {
                                        n8 = n;
                                        n = n6;
                                        b13 = b2;
                                        n6 = n4;
                                        n4 = n8;
                                    }
                                    c.b(k, j, constraintAnchor.d(), n5, solverVariable7, i, constraintAnchor2.d(), n6);
                                    n6 = n;
                                    n = n4;
                                }
                                else {
                                    b13 = b2;
                                }
                                solverVariable5 = i;
                                final ConstraintWidget constraintWidget = d3;
                                if (this.f0 == 8) {
                                    final HashSet<ConstraintAnchor> a = constraintAnchor2.a;
                                    Label_1886: {
                                        if (a != null) {
                                            if (a.size() > 0) {
                                                n4 = 1;
                                                break Label_1886;
                                            }
                                        }
                                        n4 = 0;
                                    }
                                    if (n4 == 0) {
                                        return;
                                    }
                                }
                                if (n23 != 0) {
                                    final SolverVariable solverVariable8 = l;
                                    n4 = n;
                                    Label_1953: {
                                        if (b13) {
                                            n4 = n;
                                            if (j != solverVariable8) {
                                                n4 = n;
                                                if (n17 == 0) {
                                                    if (!(d2 instanceof a)) {
                                                        n4 = n;
                                                        if (!(constraintWidget instanceof a)) {
                                                            break Label_1953;
                                                        }
                                                    }
                                                    n4 = 6;
                                                }
                                            }
                                        }
                                    }
                                    c.f(k, j, constraintAnchor.d(), n4);
                                    c.g(solverVariable5, solverVariable8, -constraintAnchor2.d(), n4);
                                }
                                else {
                                    n4 = n;
                                }
                                if (b13 && b10 && !(d2 instanceof a) && !(constraintWidget instanceof a) && constraintWidget != s) {
                                    n4 = (n = 6);
                                    n2 = 1;
                                }
                                else {
                                    n = n2;
                                    n2 = n6;
                                }
                                if (n2 != 0) {
                                    n2 = n;
                                    Label_2160: {
                                        if (n7 != 0) {
                                            if (b9) {
                                                n2 = n;
                                                if (!b3) {
                                                    break Label_2160;
                                                }
                                            }
                                            n2 = n18;
                                            if (d2 != s) {
                                                if (constraintWidget == s) {
                                                    n2 = n18;
                                                }
                                                else {
                                                    n2 = n;
                                                }
                                            }
                                            if (d2 instanceof e || constraintWidget instanceof e) {
                                                n2 = 5;
                                            }
                                            if (d2 instanceof a || constraintWidget instanceof a) {
                                                n2 = 5;
                                            }
                                            if (b9) {
                                                n2 = 5;
                                            }
                                            n2 = Math.max(n2, n);
                                        }
                                    }
                                    if (b13) {
                                        n = Math.min(n4, n2);
                                        if (b6 && !b9 && (d2 == s || constraintWidget == s)) {
                                            n = 4;
                                        }
                                    }
                                    else {
                                        n = n2;
                                    }
                                    c.e(k, j, constraintAnchor.d(), n);
                                    c.e(solverVariable5, l, -constraintAnchor2.d(), n);
                                }
                                if (b13) {
                                    if (solverVariable == j) {
                                        n = constraintAnchor.d();
                                    }
                                    else {
                                        n = 0;
                                    }
                                    if (j != solverVariable) {
                                        c.f(k, solverVariable, n, 5);
                                    }
                                }
                                if (!b13 || n17 == 0 || n3 != 0 || n9 != 0) {
                                    break Label_2352;
                                }
                                if (n17 != 0 && n14 == 3) {
                                    c.f(solverVariable5, k, 0, 8);
                                    n = 5;
                                    break Label_2355;
                                }
                                c.f(solverVariable5, k, 0, 5);
                                break Label_2352;
                            }
                        }
                    }
                    solverVariable5 = i;
                    b13 = b2;
                }
                n = 5;
            }
            if (b13 && b4) {
                if (constraintAnchor2.f != null) {
                    n2 = constraintAnchor2.d();
                }
                else {
                    n2 = 0;
                }
                if (l != solverVariable2) {
                    c.f(solverVariable2, solverVariable5, n2, n);
                }
            }
            return;
        }
        if (n12 < 2 && b2 && b4) {
            c.f(k, solverVariable, 0, 8);
            if (!b && this.K.f != null) {
                n = 0;
            }
            else {
                n = 1;
            }
            n2 = n;
            Label_2543: {
                if (!b) {
                    final ConstraintAnchor f4 = this.K.f;
                    n2 = n;
                    if (f4 != null) {
                        final ConstraintWidget d4 = f4.d;
                        if (d4.V != 0.0f) {
                            final DimensionBehaviour[] r = d4.R;
                            dimensionBehaviour = r[0];
                            final DimensionBehaviour match_CONSTRAINT = DimensionBehaviour.MATCH_CONSTRAINT;
                            if (dimensionBehaviour == match_CONSTRAINT && r[1] == match_CONSTRAINT) {
                                n2 = 1;
                                break Label_2543;
                            }
                        }
                        n2 = 0;
                    }
                }
            }
            if (n2 != 0) {
                c.f(solverVariable2, i, 0, 8);
            }
        }
    }
    
    public final void f(final androidx.constraintlayout.core.c c) {
        c.k(this.G);
        c.k(this.H);
        c.k(this.I);
        c.k(this.J);
        if (this.Z > 0) {
            c.k(this.K);
        }
    }
    
    public ConstraintAnchor g(final ConstraintAnchor.Type type) {
        switch (ConstraintWidget$a.a[type.ordinal()]) {
            default: {
                throw new AssertionError((Object)type.name());
            }
            case 9: {
                return null;
            }
            case 8: {
                return this.M;
            }
            case 7: {
                return this.L;
            }
            case 6: {
                return this.N;
            }
            case 5: {
                return this.K;
            }
            case 4: {
                return this.J;
            }
            case 3: {
                return this.I;
            }
            case 2: {
                return this.H;
            }
            case 1: {
                return this.G;
            }
        }
    }
    
    public final DimensionBehaviour h(final int n) {
        if (n == 0) {
            return this.R[0];
        }
        if (n == 1) {
            return this.R[1];
        }
        return null;
    }
    
    public final int i() {
        if (this.f0 == 8) {
            return 0;
        }
        return this.U;
    }
    
    public final ConstraintWidget j(final int n) {
        if (n == 0) {
            final ConstraintAnchor i = this.I;
            final ConstraintAnchor f = i.f;
            if (f != null && f.f == i) {
                return f.d;
            }
        }
        else if (n == 1) {
            final ConstraintAnchor j = this.J;
            final ConstraintAnchor f2 = j.f;
            if (f2 != null && f2.f == j) {
                return f2.d;
            }
        }
        return null;
    }
    
    public final ConstraintWidget k(final int n) {
        if (n == 0) {
            final ConstraintAnchor g = this.G;
            final ConstraintAnchor f = g.f;
            if (f != null && f.f == g) {
                return f.d;
            }
        }
        else if (n == 1) {
            final ConstraintAnchor h = this.H;
            final ConstraintAnchor f2 = h.f;
            if (f2 != null && f2.f == h) {
                return f2.d;
            }
        }
        return null;
    }
    
    public final int l() {
        if (this.f0 == 8) {
            return 0;
        }
        return this.T;
    }
    
    public final int m() {
        final ConstraintWidget s = this.S;
        if (s != null && s instanceof androidx.constraintlayout.core.widgets.d) {
            return ((androidx.constraintlayout.core.widgets.d)s).u0 + this.X;
        }
        return this.X;
    }
    
    public final int n() {
        final ConstraintWidget s = this.S;
        if (s != null && s instanceof androidx.constraintlayout.core.widgets.d) {
            return ((androidx.constraintlayout.core.widgets.d)s).v0 + this.Y;
        }
        return this.Y;
    }
    
    public final boolean o(int n) {
        final boolean b = true;
        boolean b2 = true;
        if (n == 0) {
            if (this.G.f != null) {
                n = 1;
            }
            else {
                n = 0;
            }
            int n2;
            if (this.I.f != null) {
                n2 = 1;
            }
            else {
                n2 = 0;
            }
            if (n + n2 >= 2) {
                b2 = false;
            }
            return b2;
        }
        if (this.H.f != null) {
            n = 1;
        }
        else {
            n = 0;
        }
        int n3;
        if (this.J.f != null) {
            n3 = 1;
        }
        else {
            n3 = 0;
        }
        int n4;
        if (this.K.f != null) {
            n4 = 1;
        }
        else {
            n4 = 0;
        }
        return n + n3 + n4 < 2 && b;
    }
    
    public final boolean p(int n, final int n2) {
        final boolean b = true;
        boolean b2 = true;
        if (n == 0) {
            final ConstraintAnchor f = this.G.f;
            if (f != null && f.c) {
                final ConstraintAnchor f2 = this.I.f;
                if (f2 != null && f2.c) {
                    final int c = f2.c();
                    final int d = this.I.d();
                    n = this.G.f.c();
                    if (c - d - (this.G.d() + n) < n2) {
                        b2 = false;
                    }
                    return b2;
                }
            }
        }
        else {
            final ConstraintAnchor f3 = this.H.f;
            if (f3 != null && f3.c) {
                final ConstraintAnchor f4 = this.J.f;
                if (f4 != null && f4.c) {
                    final int c2 = f4.c();
                    n = this.J.d();
                    return c2 - n - (this.H.d() + this.H.f.c()) >= n2 && b;
                }
            }
        }
        return false;
    }
    
    public final boolean q(int n) {
        n *= 2;
        final ConstraintAnchor[] o = this.O;
        final ConstraintAnchor constraintAnchor = o[n];
        final ConstraintAnchor f = constraintAnchor.f;
        boolean b = true;
        if (f != null && f.f != constraintAnchor) {
            final ConstraintAnchor constraintAnchor2 = o[n + 1];
            final ConstraintAnchor f2 = constraintAnchor2.f;
            if (f2 != null && f2.f == constraintAnchor2) {
                return b;
            }
        }
        b = false;
        return b;
    }
    
    public final boolean r() {
        final ConstraintAnchor g = this.G;
        final ConstraintAnchor f = g.f;
        if (f == null || f.f != g) {
            final ConstraintAnchor i = this.I;
            final ConstraintAnchor f2 = i.f;
            if (f2 == null || f2.f != i) {
                return false;
            }
        }
        return true;
    }
    
    public final boolean s() {
        final ConstraintAnchor h = this.H;
        final ConstraintAnchor f = h.f;
        if (f == null || f.f != h) {
            final ConstraintAnchor j = this.J;
            final ConstraintAnchor f2 = j.f;
            if (f2 == null || f2.f != j) {
                return false;
            }
        }
        return true;
    }
    
    public final boolean t() {
        return this.g && this.f0 != 8;
    }
    
    @Override
    public String toString() {
        String j = "";
        final StringBuilder k = a.k("");
        if (this.g0 != null) {
            j = a2.b.j(a.k("id: "), this.g0, " ");
        }
        k.append(j);
        k.append("(");
        k.append(this.X);
        k.append(", ");
        k.append(this.Y);
        k.append(") - (");
        k.append(this.T);
        k.append(" x ");
        return d.l(k, this.U, ")");
    }
    
    public boolean u() {
        return this.m || (this.G.c && this.I.c);
    }
    
    public boolean v() {
        return this.n || (this.H.c && this.J.c);
    }
    
    public void w() {
        this.G.g();
        this.H.g();
        this.I.g();
        this.J.g();
        this.K.g();
        this.L.g();
        this.M.g();
        this.N.g();
        this.S = null;
        this.E = 0.0f;
        this.T = 0;
        this.U = 0;
        this.V = 0.0f;
        this.W = -1;
        this.X = 0;
        this.Y = 0;
        this.Z = 0;
        this.a0 = 0;
        this.b0 = 0;
        this.c0 = 0.5f;
        this.d0 = 0.5f;
        final DimensionBehaviour[] r = this.R;
        r[1] = (r[0] = DimensionBehaviour.FIXED);
        this.e0 = null;
        this.f0 = 0;
        this.h0 = 0;
        this.i0 = 0;
        final float[] j0 = this.j0;
        j0[1] = (j0[0] = -1.0f);
        this.q = -1;
        this.r = -1;
        final int[] d = this.D;
        d[1] = (d[0] = Integer.MAX_VALUE);
        this.s = 0;
        this.t = 0;
        this.x = 1.0f;
        this.A = 1.0f;
        this.w = Integer.MAX_VALUE;
        this.z = Integer.MAX_VALUE;
        this.v = 0;
        this.y = 0;
        this.B = -1;
        this.C = 1.0f;
        final boolean[] f = this.f;
        f[1] = (f[0] = true);
        final boolean[] q = this.Q;
        q[1] = (q[0] = false);
        this.g = true;
        final int[] u = this.u;
        u[1] = (u[0] = 0);
        this.i = -1;
        this.j = -1;
    }
    
    public final void x() {
        this.m = false;
        this.n = false;
        this.o = false;
        this.p = false;
        for (int size = this.P.size(), i = 0; i < size; ++i) {
            final ConstraintAnchor constraintAnchor = this.P.get(i);
            constraintAnchor.c = false;
            constraintAnchor.b = 0;
        }
    }
    
    public void y(final z2.a a) {
        this.G.h();
        this.H.h();
        this.I.h();
        this.J.h();
        this.K.h();
        this.N.h();
        this.L.h();
        this.M.h();
    }
    
    public final void z(final int x, final int n) {
        if (this.m) {
            return;
        }
        this.G.i(x);
        this.I.i(n);
        this.X = x;
        this.T = n - x;
        this.m = true;
    }
    
    public enum DimensionBehaviour
    {
        FIXED, 
        MATCH_CONSTRAINT, 
        MATCH_PARENT, 
        WRAP_CONTENT;
    }
}
