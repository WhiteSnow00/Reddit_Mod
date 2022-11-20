// 
// Decompiled by Procyon v0.6.0
// 

package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import f3.a;

public final class d extends WidgetRun
{
    public DependencyNode k;
    public a l;
    
    public d(final ConstraintWidget constraintWidget) {
        super(constraintWidget);
        final DependencyNode k = new DependencyNode(this);
        this.k = k;
        this.l = null;
        super.h.e = DependencyNode.Type.TOP;
        super.i.e = DependencyNode.Type.BOTTOM;
        k.e = DependencyNode.Type.BASELINE;
        super.f = 1;
    }
    
    @Override
    public final void a(final f3.d d) {
        if (d$a.a[super.j.ordinal()] != 3) {
            final androidx.constraintlayout.core.widgets.analyzer.a e = super.e;
            if (e.c && !e.j && super.d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                final ConstraintWidget b = super.b;
                final int t = b.t;
                if (t != 2) {
                    if (t == 3) {
                        final androidx.constraintlayout.core.widgets.analyzer.a e2 = b.d.e;
                        if (e2.j) {
                            final int w = b.W;
                            int n2 = 0;
                            Label_0176: {
                                float n = 0.0f;
                                Label_0169: {
                                    float n3;
                                    float n4;
                                    if (w != -1) {
                                        if (w == 0) {
                                            n = e2.g * b.V;
                                            break Label_0169;
                                        }
                                        if (w != 1) {
                                            n2 = 0;
                                            break Label_0176;
                                        }
                                        n3 = (float)e2.g;
                                        n4 = b.V;
                                    }
                                    else {
                                        n3 = (float)e2.g;
                                        n4 = b.V;
                                    }
                                    n = n3 / n4;
                                }
                                n2 = (int)(n + 0.5f);
                            }
                            e.d(n2);
                        }
                    }
                }
                else {
                    final ConstraintWidget s = b.S;
                    if (s != null) {
                        final androidx.constraintlayout.core.widgets.analyzer.a e3 = s.e.e;
                        if (e3.j) {
                            e.d((int)(e3.g * b.A + 0.5f));
                        }
                    }
                }
            }
            final DependencyNode h = super.h;
            if (h.c) {
                final DependencyNode i = super.i;
                if (i.c) {
                    if (h.j && i.j && super.e.j) {
                        return;
                    }
                    if (!super.e.j && super.d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        final ConstraintWidget b2 = super.b;
                        if (b2.s == 0 && !b2.s()) {
                            final DependencyNode dependencyNode = super.h.l.get(0);
                            final DependencyNode dependencyNode2 = super.i.l.get(0);
                            final int g = dependencyNode.g;
                            final DependencyNode h2 = super.h;
                            final int n5 = g + h2.f;
                            final int n6 = dependencyNode2.g + super.i.f;
                            h2.d(n5);
                            super.i.d(n6);
                            super.e.d(n6 - n5);
                            return;
                        }
                    }
                    if (!super.e.j && super.d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && super.a == 1 && super.h.l.size() > 0 && super.i.l.size() > 0) {
                        final int n7 = super.i.l.get(0).g + super.i.f - (super.h.l.get(0).g + super.h.f);
                        final androidx.constraintlayout.core.widgets.analyzer.a e4 = super.e;
                        final int m = e4.m;
                        if (n7 < m) {
                            e4.d(n7);
                        }
                        else {
                            e4.d(m);
                        }
                    }
                    if (!super.e.j) {
                        return;
                    }
                    if (super.h.l.size() > 0 && super.i.l.size() > 0) {
                        final DependencyNode dependencyNode3 = super.h.l.get(0);
                        final DependencyNode dependencyNode4 = super.i.l.get(0);
                        int g2 = dependencyNode3.g;
                        final DependencyNode h3 = super.h;
                        final int f = h3.f;
                        int g3 = dependencyNode4.g;
                        final int f2 = super.i.f;
                        float d2 = super.b.d0;
                        if (dependencyNode3 == dependencyNode4) {
                            d2 = 0.5f;
                        }
                        else {
                            g2 += f;
                            g3 += f2;
                        }
                        h3.d((int)((g3 - g2 - super.e.g) * d2 + (g2 + 0.5f)));
                        super.i.d(super.h.g + super.e.g);
                    }
                }
            }
            return;
        }
        final ConstraintWidget b3 = super.b;
        this.i(b3.H, b3.J, 1);
    }
    
    @Override
    public final void d() {
        final ConstraintWidget b = super.b;
        if (b.a) {
            super.e.d(b.i());
        }
        if (!super.e.j) {
            final ConstraintWidget b2 = super.b;
            super.d = b2.R[1];
            if (b2.F) {
                this.l = new a((WidgetRun)this);
            }
            final ConstraintWidget.DimensionBehaviour d = super.d;
            if (d != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                if (d == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
                    final ConstraintWidget s = super.b.S;
                    if (s != null && s.R[1] == ConstraintWidget.DimensionBehaviour.FIXED) {
                        final int i = s.i();
                        final int d2 = super.b.H.d();
                        final int d3 = super.b.J.d();
                        WidgetRun.b(super.h, s.e.h, super.b.H.d());
                        WidgetRun.b(super.i, s.e.i, -super.b.J.d());
                        super.e.d(i - d2 - d3);
                        return;
                    }
                }
                if (d == ConstraintWidget.DimensionBehaviour.FIXED) {
                    super.e.d(super.b.i());
                }
            }
        }
        else if (super.d == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
            final ConstraintWidget b3 = super.b;
            final ConstraintWidget s2 = b3.S;
            if (s2 != null && s2.R[1] == ConstraintWidget.DimensionBehaviour.FIXED) {
                WidgetRun.b(super.h, s2.e.h, b3.H.d());
                WidgetRun.b(super.i, s2.e.i, -super.b.J.d());
                return;
            }
        }
        final androidx.constraintlayout.core.widgets.analyzer.a e = super.e;
        final boolean j = e.j;
        if (j) {
            final ConstraintWidget b4 = super.b;
            if (b4.a) {
                final ConstraintAnchor[] o = b4.O;
                final ConstraintAnchor constraintAnchor = o[2];
                final ConstraintAnchor f = constraintAnchor.f;
                if (f != null && o[3].f != null) {
                    if (b4.s()) {
                        super.h.f = super.b.O[2].d();
                        super.i.f = -super.b.O[3].d();
                    }
                    else {
                        final DependencyNode g = WidgetRun.g(super.b.O[2]);
                        if (g != null) {
                            WidgetRun.b(super.h, g, super.b.O[2].d());
                        }
                        final DependencyNode g2 = WidgetRun.g(super.b.O[3]);
                        if (g2 != null) {
                            WidgetRun.b(super.i, g2, -super.b.O[3].d());
                        }
                        super.h.b = true;
                        super.i.b = true;
                    }
                    final ConstraintWidget b5 = super.b;
                    if (b5.F) {
                        WidgetRun.b(this.k, super.h, b5.Z);
                    }
                    return;
                }
                else if (f != null) {
                    final DependencyNode g3 = WidgetRun.g(constraintAnchor);
                    if (g3 == null) {
                        return;
                    }
                    WidgetRun.b(super.h, g3, super.b.O[2].d());
                    WidgetRun.b(super.i, super.h, super.e.g);
                    final ConstraintWidget b6 = super.b;
                    if (b6.F) {
                        WidgetRun.b(this.k, super.h, b6.Z);
                    }
                    return;
                }
                else {
                    final ConstraintAnchor constraintAnchor2 = o[3];
                    if (constraintAnchor2.f != null) {
                        final DependencyNode g4 = WidgetRun.g(constraintAnchor2);
                        if (g4 != null) {
                            WidgetRun.b(super.i, g4, -super.b.O[3].d());
                            WidgetRun.b(super.h, super.i, -super.e.g);
                        }
                        final ConstraintWidget b7 = super.b;
                        if (b7.F) {
                            WidgetRun.b(this.k, super.h, b7.Z);
                        }
                        return;
                    }
                    else {
                        final ConstraintAnchor constraintAnchor3 = o[4];
                        if (constraintAnchor3.f != null) {
                            final DependencyNode g5 = WidgetRun.g(constraintAnchor3);
                            if (g5 != null) {
                                WidgetRun.b(this.k, g5, 0);
                                WidgetRun.b(super.h, this.k, -super.b.Z);
                                WidgetRun.b(super.i, super.h, super.e.g);
                            }
                            return;
                        }
                        else {
                            if (b4 instanceof e3.a || b4.S == null || b4.g(ConstraintAnchor.Type.CENTER).f != null) {
                                return;
                            }
                            final ConstraintWidget b8 = super.b;
                            WidgetRun.b(super.h, b8.S.e.h, b8.n());
                            WidgetRun.b(super.i, super.h, super.e.g);
                            final ConstraintWidget b9 = super.b;
                            if (b9.F) {
                                WidgetRun.b(this.k, super.h, b9.Z);
                            }
                            return;
                        }
                    }
                }
            }
        }
        if (!j && super.d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            final ConstraintWidget b10 = super.b;
            final int t = b10.t;
            if (t != 2) {
                if (t == 3) {
                    if (!b10.s()) {
                        final ConstraintWidget b11 = super.b;
                        if (b11.s != 3) {
                            final androidx.constraintlayout.core.widgets.analyzer.a e2 = b11.d.e;
                            super.e.l.add(e2);
                            e2.k.add(super.e);
                            final androidx.constraintlayout.core.widgets.analyzer.a e3 = super.e;
                            e3.b = true;
                            e3.k.add(super.h);
                            super.e.k.add(super.i);
                        }
                    }
                }
            }
            else {
                final ConstraintWidget s3 = b10.S;
                if (s3 != null) {
                    final androidx.constraintlayout.core.widgets.analyzer.a e4 = s3.e.e;
                    e.l.add(e4);
                    e4.k.add(super.e);
                    final androidx.constraintlayout.core.widgets.analyzer.a e5 = super.e;
                    e5.b = true;
                    e5.k.add(super.h);
                    super.e.k.add(super.i);
                }
            }
        }
        else {
            e.b((f3.d)this);
        }
        final ConstraintWidget b12 = super.b;
        final ConstraintAnchor[] o2 = b12.O;
        final ConstraintAnchor constraintAnchor4 = o2[2];
        final ConstraintAnchor f2 = constraintAnchor4.f;
        if (f2 != null && o2[3].f != null) {
            if (b12.s()) {
                super.h.f = super.b.O[2].d();
                super.i.f = -super.b.O[3].d();
            }
            else {
                final DependencyNode g6 = WidgetRun.g(super.b.O[2]);
                final DependencyNode g7 = WidgetRun.g(super.b.O[3]);
                if (g6 != null) {
                    g6.b((f3.d)this);
                }
                if (g7 != null) {
                    g7.b((f3.d)this);
                }
                super.j = RunType.CENTER;
            }
            if (super.b.F) {
                this.c(this.k, super.h, 1, (androidx.constraintlayout.core.widgets.analyzer.a)this.l);
            }
        }
        else if (f2 != null) {
            final DependencyNode g8 = WidgetRun.g(constraintAnchor4);
            if (g8 != null) {
                WidgetRun.b(super.h, g8, super.b.O[2].d());
                this.c(super.i, super.h, 1, super.e);
                if (super.b.F) {
                    this.c(this.k, super.h, 1, (androidx.constraintlayout.core.widgets.analyzer.a)this.l);
                }
                final ConstraintWidget.DimensionBehaviour d4 = super.d;
                final ConstraintWidget.DimensionBehaviour match_CONSTRAINT = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (d4 == match_CONSTRAINT) {
                    final ConstraintWidget b13 = super.b;
                    if (b13.V > 0.0f) {
                        final c d5 = b13.d;
                        if (d5.d == match_CONSTRAINT) {
                            d5.e.k.add(super.e);
                            super.e.l.add(super.b.d.e);
                            super.e.a = this;
                        }
                    }
                }
            }
        }
        else {
            final ConstraintAnchor constraintAnchor5 = o2[3];
            if (constraintAnchor5.f != null) {
                final DependencyNode g9 = WidgetRun.g(constraintAnchor5);
                if (g9 != null) {
                    WidgetRun.b(super.i, g9, -super.b.O[3].d());
                    this.c(super.h, super.i, -1, super.e);
                    if (super.b.F) {
                        this.c(this.k, super.h, 1, (androidx.constraintlayout.core.widgets.analyzer.a)this.l);
                    }
                }
            }
            else {
                final ConstraintAnchor constraintAnchor6 = o2[4];
                if (constraintAnchor6.f != null) {
                    final DependencyNode g10 = WidgetRun.g(constraintAnchor6);
                    if (g10 != null) {
                        WidgetRun.b(this.k, g10, 0);
                        this.c(super.h, this.k, -1, (androidx.constraintlayout.core.widgets.analyzer.a)this.l);
                        this.c(super.i, super.h, 1, super.e);
                    }
                }
                else if (!(b12 instanceof e3.a)) {
                    final ConstraintWidget s4 = b12.S;
                    if (s4 != null) {
                        WidgetRun.b(super.h, s4.e.h, b12.n());
                        this.c(super.i, super.h, 1, super.e);
                        if (super.b.F) {
                            this.c(this.k, super.h, 1, (androidx.constraintlayout.core.widgets.analyzer.a)this.l);
                        }
                        final ConstraintWidget.DimensionBehaviour d6 = super.d;
                        final ConstraintWidget.DimensionBehaviour match_CONSTRAINT2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                        if (d6 == match_CONSTRAINT2) {
                            final ConstraintWidget b14 = super.b;
                            if (b14.V > 0.0f) {
                                final c d7 = b14.d;
                                if (d7.d == match_CONSTRAINT2) {
                                    d7.e.k.add(super.e);
                                    super.e.l.add(super.b.d.e);
                                    super.e.a = this;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (super.e.l.size() == 0) {
            super.e.c = true;
        }
    }
    
    @Override
    public final void e() {
        super.c = null;
        super.h.c();
        super.i.c();
        this.k.c();
        super.e.c();
        super.g = false;
    }
    
    public final void j() {
        super.g = false;
        super.h.c();
        super.h.j = false;
        super.i.c();
        super.i.j = false;
        this.k.c();
        this.k.j = false;
        super.e.j = false;
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("VerticalRun ");
        t.append(super.b.g0);
        return t.toString();
    }
}
