// 
// Decompiled by Procyon v0.6.0
// 

package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import f3.d;
import androidx.constraintlayout.core.widgets.ConstraintWidget;

public final class c extends WidgetRun
{
    public static int[] k;
    
    static {
        c.k = new int[2];
    }
    
    public c(final ConstraintWidget constraintWidget) {
        super(constraintWidget);
        super.h.e = DependencyNode.Type.LEFT;
        super.i.e = DependencyNode.Type.RIGHT;
        super.f = 0;
    }
    
    public static void j(final int[] array, int n, int n2, int n3, int n4, final float n5, final int n6) {
        n = n2 - n;
        n2 = n4 - n3;
        if (n6 != -1) {
            if (n6 != 0) {
                if (n6 == 1) {
                    n2 = (int)(n * n5 + 0.5f);
                    array[0] = n;
                    array[1] = n2;
                }
            }
            else {
                array[0] = (int)(n2 * n5 + 0.5f);
                array[1] = n2;
            }
        }
        else {
            n3 = (int)(n2 * n5 + 0.5f);
            n4 = (int)(n / n5 + 0.5f);
            if (n3 <= n) {
                array[0] = n3;
                array[1] = n2;
            }
            else if (n4 <= n2) {
                array[0] = n;
                array[1] = n4;
            }
        }
    }
    
    @Override
    public final void a(final d d) {
        if (c$a.a[super.j.ordinal()] != 3) {
            final a e = super.e;
            Label_1472: {
                if (!e.j && super.d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    final ConstraintWidget b = super.b;
                    final int s = b.s;
                    if (s != 2) {
                        if (s == 3) {
                            final int t = b.t;
                            if (t != 0 && t != 3) {
                                final int w = b.W;
                                int n2 = 0;
                                Label_0190: {
                                    float n = 0.0f;
                                    Label_0183: {
                                        float n3;
                                        float n4;
                                        if (w != -1) {
                                            if (w == 0) {
                                                n = b.e.e.g / b.V;
                                                break Label_0183;
                                            }
                                            if (w != 1) {
                                                n2 = 0;
                                                break Label_0190;
                                            }
                                            n3 = (float)b.e.e.g;
                                            n4 = b.V;
                                        }
                                        else {
                                            n3 = (float)b.e.e.g;
                                            n4 = b.V;
                                        }
                                        n = n3 * n4;
                                    }
                                    n2 = (int)(n + 0.5f);
                                }
                                e.d(n2);
                            }
                            else {
                                final androidx.constraintlayout.core.widgets.analyzer.d e2 = b.e;
                                final DependencyNode h = e2.h;
                                final DependencyNode i = e2.i;
                                final boolean b2 = b.G.f != null;
                                final boolean b3 = b.H.f != null;
                                final boolean b4 = b.I.f != null;
                                final boolean b5 = b.J.f != null;
                                final int w2 = b.W;
                                if (b2 && b3 && b4 && b5) {
                                    final float v = b.V;
                                    if (h.j && i.j) {
                                        final DependencyNode h2 = super.h;
                                        if (h2.c) {
                                            if (super.i.c) {
                                                final int g = h2.l.get(0).g;
                                                final int f = super.h.f;
                                                final int g2 = super.i.l.get(0).g;
                                                final int f2 = super.i.f;
                                                final int g3 = h.g;
                                                final int f3 = h.f;
                                                final int g4 = i.g;
                                                final int f4 = i.f;
                                                final int[] k = c.k;
                                                j(k, g + f, g2 - f2, f3 + g3, g4 - f4, v, w2);
                                                super.e.d(k[0]);
                                                super.b.e.e.d(k[1]);
                                            }
                                        }
                                        return;
                                    }
                                    final DependencyNode h3 = super.h;
                                    if (h3.j) {
                                        final DependencyNode j = super.i;
                                        if (j.j) {
                                            if (!h.c || !i.c) {
                                                return;
                                            }
                                            final int g5 = h3.g;
                                            final int f5 = h3.f;
                                            final int g6 = j.g;
                                            final int f6 = j.f;
                                            final int g7 = h.l.get(0).g;
                                            final int f7 = h.f;
                                            final int g8 = i.l.get(0).g;
                                            final int f8 = i.f;
                                            final int[] l = c.k;
                                            j(l, g5 + f5, g6 - f6, g7 + f7, g8 - f8, v, w2);
                                            super.e.d(l[0]);
                                            super.b.e.e.d(l[1]);
                                        }
                                    }
                                    final DependencyNode h4 = super.h;
                                    if (!h4.c || !super.i.c || !h.c || !i.c) {
                                        return;
                                    }
                                    final int g9 = h4.l.get(0).g;
                                    final int f9 = super.h.f;
                                    final int g10 = super.i.l.get(0).g;
                                    final int f10 = super.i.f;
                                    final int g11 = h.l.get(0).g;
                                    final int f11 = h.f;
                                    final int g12 = i.l.get(0).g;
                                    final int f12 = i.f;
                                    final int[] m = c.k;
                                    j(m, g9 + f9, g10 - f10, g11 + f11, g12 - f12, v, w2);
                                    super.e.d(m[0]);
                                    super.b.e.e.d(m[1]);
                                }
                                else if (b2 && b4) {
                                    final DependencyNode h5 = super.h;
                                    if (!h5.c || !super.i.c) {
                                        return;
                                    }
                                    final float v2 = b.V;
                                    final int n5 = h5.l.get(0).g + super.h.f;
                                    final int n6 = super.i.l.get(0).g - super.i.f;
                                    if (w2 != -1 && w2 != 0) {
                                        if (w2 == 1) {
                                            int f13 = this.f(n6 - n5, 0);
                                            final int n7 = (int)(f13 / v2 + 0.5f);
                                            final int f14 = this.f(n7, 1);
                                            if (n7 != f14) {
                                                f13 = (int)(f14 * v2 + 0.5f);
                                            }
                                            super.e.d(f13);
                                            super.b.e.e.d(f14);
                                        }
                                    }
                                    else {
                                        int f15 = this.f(n6 - n5, 0);
                                        final int n8 = (int)(f15 * v2 + 0.5f);
                                        final int f16 = this.f(n8, 1);
                                        if (n8 != f16) {
                                            f15 = (int)(f16 / v2 + 0.5f);
                                        }
                                        super.e.d(f15);
                                        super.b.e.e.d(f16);
                                    }
                                }
                                else if (b3 && b5) {
                                    if (!h.c || !i.c) {
                                        return;
                                    }
                                    final float v3 = b.V;
                                    final int n9 = h.l.get(0).g + h.f;
                                    final int n10 = i.l.get(0).g - i.f;
                                    if (w2 != -1) {
                                        if (w2 == 0) {
                                            int f17 = this.f(n10 - n9, 1);
                                            final int n11 = (int)(f17 * v3 + 0.5f);
                                            final int f18 = this.f(n11, 0);
                                            if (n11 != f18) {
                                                f17 = (int)(f18 / v3 + 0.5f);
                                            }
                                            super.e.d(f18);
                                            super.b.e.e.d(f17);
                                            break Label_1472;
                                        }
                                        if (w2 != 1) {
                                            break Label_1472;
                                        }
                                    }
                                    int f19 = this.f(n10 - n9, 1);
                                    final int n12 = (int)(f19 / v3 + 0.5f);
                                    final int f20 = this.f(n12, 0);
                                    if (n12 != f20) {
                                        f19 = (int)(f20 * v3 + 0.5f);
                                    }
                                    super.e.d(f20);
                                    super.b.e.e.d(f19);
                                }
                            }
                        }
                    }
                    else {
                        final ConstraintWidget s2 = b.S;
                        if (s2 != null) {
                            final a e3 = s2.d.e;
                            if (e3.j) {
                                e.d((int)(e3.g * b.x + 0.5f));
                            }
                        }
                    }
                }
            }
            final DependencyNode h6 = super.h;
            if (h6.c) {
                final DependencyNode i2 = super.i;
                if (i2.c) {
                    if (h6.j && i2.j && super.e.j) {
                        return;
                    }
                    if (!super.e.j && super.d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        final ConstraintWidget b6 = super.b;
                        if (b6.s == 0 && !b6.r()) {
                            final DependencyNode dependencyNode = super.h.l.get(0);
                            final DependencyNode dependencyNode2 = super.i.l.get(0);
                            final int g13 = dependencyNode.g;
                            final DependencyNode h7 = super.h;
                            final int n13 = g13 + h7.f;
                            final int n14 = dependencyNode2.g + super.i.f;
                            h7.d(n13);
                            super.i.d(n14);
                            super.e.d(n14 - n13);
                            return;
                        }
                    }
                    if (!super.e.j && super.d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && super.a == 1 && super.h.l.size() > 0 && super.i.l.size() > 0) {
                        final int min = Math.min(super.i.l.get(0).g + super.i.f - (super.h.l.get(0).g + super.h.f), super.e.m);
                        final ConstraintWidget b7 = super.b;
                        final int w3 = b7.w;
                        int n15 = Math.max(b7.v, min);
                        if (w3 > 0) {
                            n15 = Math.min(w3, n15);
                        }
                        super.e.d(n15);
                    }
                    if (!super.e.j) {
                        return;
                    }
                    final DependencyNode dependencyNode3 = super.h.l.get(0);
                    final DependencyNode dependencyNode4 = super.i.l.get(0);
                    int g14 = dependencyNode3.g;
                    final DependencyNode h8 = super.h;
                    final int f21 = h8.f;
                    int g15 = dependencyNode4.g;
                    final int f22 = super.i.f;
                    float c0 = super.b.c0;
                    if (dependencyNode3 == dependencyNode4) {
                        c0 = 0.5f;
                    }
                    else {
                        g14 += f21;
                        g15 += f22;
                    }
                    h8.d((int)((g15 - g14 - super.e.g) * c0 + (g14 + 0.5f)));
                    super.i.d(super.h.g + super.e.g);
                }
            }
            return;
        }
        final ConstraintWidget b8 = super.b;
        this.i(b8.G, b8.I, 0);
    }
    
    @Override
    public final void d() {
        final ConstraintWidget b = super.b;
        if (b.a) {
            super.e.d(b.l());
        }
        final a e = super.e;
        if (!e.j) {
            final ConstraintWidget b2 = super.b;
            final ConstraintWidget.DimensionBehaviour d = b2.R[0];
            if ((super.d = d) != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                final ConstraintWidget.DimensionBehaviour match_PARENT = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
                if (d == match_PARENT) {
                    final ConstraintWidget s = b2.S;
                    if (s != null) {
                        final ConstraintWidget.DimensionBehaviour dimensionBehaviour = s.R[0];
                        if (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviour == match_PARENT) {
                            final int l = s.l();
                            final int d2 = super.b.G.d();
                            final int d3 = super.b.I.d();
                            WidgetRun.b(super.h, s.d.h, super.b.G.d());
                            WidgetRun.b(super.i, s.d.i, -super.b.I.d());
                            super.e.d(l - d2 - d3);
                            return;
                        }
                    }
                }
                if (d == ConstraintWidget.DimensionBehaviour.FIXED) {
                    e.d(b2.l());
                }
            }
        }
        else {
            final ConstraintWidget.DimensionBehaviour d4 = super.d;
            final ConstraintWidget.DimensionBehaviour match_PARENT2 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
            if (d4 == match_PARENT2) {
                final ConstraintWidget b3 = super.b;
                final ConstraintWidget s2 = b3.S;
                if (s2 != null) {
                    final ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = s2.R[0];
                    if (dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviour2 == match_PARENT2) {
                        WidgetRun.b(super.h, s2.d.h, b3.G.d());
                        WidgetRun.b(super.i, s2.d.i, -super.b.I.d());
                        return;
                    }
                }
            }
        }
        final a e2 = super.e;
        if (e2.j) {
            final ConstraintWidget b4 = super.b;
            if (b4.a) {
                final ConstraintAnchor[] o = b4.O;
                final ConstraintAnchor constraintAnchor = o[0];
                final ConstraintAnchor f = constraintAnchor.f;
                if (f != null && o[1].f != null) {
                    if (b4.r()) {
                        super.h.f = super.b.O[0].d();
                        super.i.f = -super.b.O[1].d();
                        return;
                    }
                    final DependencyNode g = WidgetRun.g(super.b.O[0]);
                    if (g != null) {
                        WidgetRun.b(super.h, g, super.b.O[0].d());
                    }
                    final DependencyNode g2 = WidgetRun.g(super.b.O[1]);
                    if (g2 != null) {
                        WidgetRun.b(super.i, g2, -super.b.O[1].d());
                    }
                    super.h.b = true;
                    super.i.b = true;
                    return;
                }
                else if (f != null) {
                    final DependencyNode g3 = WidgetRun.g(constraintAnchor);
                    if (g3 != null) {
                        WidgetRun.b(super.h, g3, super.b.O[0].d());
                        WidgetRun.b(super.i, super.h, super.e.g);
                    }
                    return;
                }
                else {
                    final ConstraintAnchor constraintAnchor2 = o[1];
                    if (constraintAnchor2.f != null) {
                        final DependencyNode g4 = WidgetRun.g(constraintAnchor2);
                        if (g4 != null) {
                            WidgetRun.b(super.i, g4, -super.b.O[1].d());
                            WidgetRun.b(super.h, super.i, -super.e.g);
                        }
                        return;
                    }
                    else {
                        if (!(b4 instanceof e3.a) && b4.S != null && b4.g(ConstraintAnchor.Type.CENTER).f == null) {
                            final ConstraintWidget b5 = super.b;
                            WidgetRun.b(super.h, b5.S.d.h, b5.m());
                            WidgetRun.b(super.i, super.h, super.e.g);
                        }
                        return;
                    }
                }
            }
        }
        if (super.d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            final ConstraintWidget b6 = super.b;
            final int s3 = b6.s;
            if (s3 != 2) {
                if (s3 == 3) {
                    if (b6.t == 3) {
                        super.h.a = this;
                        super.i.a = this;
                        final androidx.constraintlayout.core.widgets.analyzer.d e3 = b6.e;
                        e3.h.a = this;
                        e3.i.a = this;
                        e2.a = this;
                        if (b6.s()) {
                            super.e.l.add(super.b.e.e);
                            super.b.e.e.k.add(super.e);
                            final androidx.constraintlayout.core.widgets.analyzer.d e4 = super.b.e;
                            e4.e.a = this;
                            super.e.l.add(e4.h);
                            super.e.l.add(super.b.e.i);
                            super.b.e.h.k.add(super.e);
                            super.b.e.i.k.add(super.e);
                        }
                        else if (super.b.r()) {
                            super.b.e.e.l.add(super.e);
                            super.e.k.add(super.b.e.e);
                        }
                        else {
                            super.b.e.e.l.add(super.e);
                        }
                    }
                    else {
                        final a e5 = b6.e.e;
                        e2.l.add(e5);
                        e5.k.add(super.e);
                        super.b.e.h.k.add(super.e);
                        super.b.e.i.k.add(super.e);
                        final a e6 = super.e;
                        e6.b = true;
                        e6.k.add(super.h);
                        super.e.k.add(super.i);
                        super.h.l.add(super.e);
                        super.i.l.add(super.e);
                    }
                }
            }
            else {
                final ConstraintWidget s4 = b6.S;
                if (s4 != null) {
                    final a e7 = s4.e.e;
                    e2.l.add(e7);
                    e7.k.add(super.e);
                    final a e8 = super.e;
                    e8.b = true;
                    e8.k.add(super.h);
                    super.e.k.add(super.i);
                }
            }
        }
        final ConstraintWidget b7 = super.b;
        final ConstraintAnchor[] o2 = b7.O;
        final ConstraintAnchor constraintAnchor3 = o2[0];
        final ConstraintAnchor f2 = constraintAnchor3.f;
        if (f2 != null && o2[1].f != null) {
            if (b7.r()) {
                super.h.f = super.b.O[0].d();
                super.i.f = -super.b.O[1].d();
            }
            else {
                final DependencyNode g5 = WidgetRun.g(super.b.O[0]);
                final DependencyNode g6 = WidgetRun.g(super.b.O[1]);
                if (g5 != null) {
                    g5.b((d)this);
                }
                if (g6 != null) {
                    g6.b((d)this);
                }
                super.j = RunType.CENTER;
            }
        }
        else if (f2 != null) {
            final DependencyNode g7 = WidgetRun.g(constraintAnchor3);
            if (g7 != null) {
                WidgetRun.b(super.h, g7, super.b.O[0].d());
                this.c(super.i, super.h, 1, super.e);
            }
        }
        else {
            final ConstraintAnchor constraintAnchor4 = o2[1];
            if (constraintAnchor4.f != null) {
                final DependencyNode g8 = WidgetRun.g(constraintAnchor4);
                if (g8 != null) {
                    WidgetRun.b(super.i, g8, -super.b.O[1].d());
                    this.c(super.h, super.i, -1, super.e);
                }
            }
            else if (!(b7 instanceof e3.a)) {
                final ConstraintWidget s5 = b7.S;
                if (s5 != null) {
                    WidgetRun.b(super.h, s5.d.h, b7.m());
                    this.c(super.i, super.h, 1, super.e);
                }
            }
        }
    }
    
    @Override
    public final void e() {
        super.c = null;
        super.h.c();
        super.i.c();
        super.e.c();
        super.g = false;
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("HorizontalRun ");
        t.append(super.b.g0);
        return t.toString();
    }
}
