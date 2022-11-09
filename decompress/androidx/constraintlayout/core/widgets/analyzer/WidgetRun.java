// 
// Decompiled by Procyon v0.6.0
// 

package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import f3.i;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import f3.d;

public abstract class WidgetRun implements d
{
    public int a;
    public ConstraintWidget b;
    public i c;
    public ConstraintWidget.DimensionBehaviour d;
    public a e;
    public int f;
    public boolean g;
    public DependencyNode h;
    public DependencyNode i;
    public RunType j;
    
    public WidgetRun(final ConstraintWidget b) {
        this.e = new a(this);
        this.f = 0;
        this.g = false;
        this.h = new DependencyNode(this);
        this.i = new DependencyNode(this);
        this.j = RunType.NONE;
        this.b = b;
    }
    
    public static void b(final DependencyNode dependencyNode, final DependencyNode dependencyNode2, final int f) {
        dependencyNode.l.add(dependencyNode2);
        dependencyNode.f = f;
        dependencyNode2.k.add(dependencyNode);
    }
    
    public static DependencyNode g(final ConstraintAnchor constraintAnchor) {
        final ConstraintAnchor f = constraintAnchor.f;
        DependencyNode dependencyNode = null;
        if (f == null) {
            return null;
        }
        final ConstraintWidget d = f.d;
        final int n = WidgetRun$a.a[f.e.ordinal()];
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    if (n != 4) {
                        if (n == 5) {
                            dependencyNode = ((WidgetRun)d.e).i;
                        }
                    }
                    else {
                        dependencyNode = d.e.k;
                    }
                }
                else {
                    dependencyNode = ((WidgetRun)d.e).h;
                }
            }
            else {
                dependencyNode = ((WidgetRun)d.d).i;
            }
        }
        else {
            dependencyNode = ((WidgetRun)d.d).h;
        }
        return dependencyNode;
    }
    
    public static DependencyNode h(final ConstraintAnchor constraintAnchor, int n) {
        final ConstraintAnchor f = constraintAnchor.f;
        final DependencyNode dependencyNode = null;
        if (f == null) {
            return null;
        }
        final ConstraintWidget d = f.d;
        Object o;
        if (n == 0) {
            o = d.d;
        }
        else {
            o = d.e;
        }
        n = WidgetRun$a.a[f.e.ordinal()];
        if (n != 1) {
            if (n != 2) {
                if (n == 3) {
                    return ((WidgetRun)o).h;
                }
                if (n != 5) {
                    return dependencyNode;
                }
            }
            return ((WidgetRun)o).i;
        }
        return ((WidgetRun)o).h;
    }
    
    public void a(final d d) {
    }
    
    public final void c(final DependencyNode dependencyNode, final DependencyNode dependencyNode2, final int h, final a i) {
        dependencyNode.l.add(dependencyNode2);
        dependencyNode.l.add(this.e);
        dependencyNode.h = h;
        dependencyNode.i = i;
        dependencyNode2.k.add(dependencyNode);
        ((DependencyNode)i).k.add(dependencyNode);
    }
    
    public abstract void d();
    
    public abstract void e();
    
    public final int f(final int n, int n2) {
        if (n2 == 0) {
            final ConstraintWidget b = this.b;
            final int w = b.w;
            n2 = Math.max(b.v, n);
            if (w > 0) {
                n2 = Math.min(w, n);
            }
            final int n3;
            if (n2 == (n3 = n)) {
                return n3;
            }
        }
        else {
            final ConstraintWidget b2 = this.b;
            final int z = b2.z;
            n2 = Math.max(b2.y, n);
            if (z > 0) {
                n2 = Math.min(z, n);
            }
            final int n3;
            if (n2 == (n3 = n)) {
                return n3;
            }
        }
        return n2;
    }
    
    public final void i(final ConstraintAnchor constraintAnchor, final ConstraintAnchor constraintAnchor2, int g) {
        final DependencyNode g2 = g(constraintAnchor);
        final DependencyNode g3 = g(constraintAnchor2);
        if (g2.j) {
            if (g3.j) {
                final int n = constraintAnchor.d() + g2.g;
                final int n2 = g3.g - constraintAnchor2.d();
                final int n3 = n2 - n;
                final a e = this.e;
                Label_0387: {
                    if (!((DependencyNode)e).j) {
                        final ConstraintWidget.DimensionBehaviour d = this.d;
                        final ConstraintWidget.DimensionBehaviour match_CONSTRAINT = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                        if (d == match_CONSTRAINT) {
                            final int a = this.a;
                            if (a != 0) {
                                if (a != 1) {
                                    if (a != 2) {
                                        if (a == 3) {
                                            final ConstraintWidget b = this.b;
                                            Object o = b.d;
                                            if (((WidgetRun)o).d == match_CONSTRAINT && ((WidgetRun)o).a == 3) {
                                                final androidx.constraintlayout.core.widgets.analyzer.d e2 = b.e;
                                                if (((WidgetRun)e2).d == match_CONSTRAINT && ((WidgetRun)e2).a == 3) {
                                                    break Label_0387;
                                                }
                                            }
                                            if (g == 0) {
                                                o = b.e;
                                            }
                                            final a e3 = ((WidgetRun)o).e;
                                            if (((DependencyNode)e3).j) {
                                                final float v = b.V;
                                                int n4;
                                                if (g == 1) {
                                                    n4 = (int)(((DependencyNode)e3).g / v + 0.5f);
                                                }
                                                else {
                                                    n4 = (int)(v * ((DependencyNode)e3).g + 0.5f);
                                                }
                                                e.d(n4);
                                            }
                                        }
                                    }
                                    else {
                                        final ConstraintWidget b2 = this.b;
                                        final ConstraintWidget s = b2.S;
                                        if (s != null) {
                                            Object o2;
                                            if (g == 0) {
                                                o2 = s.d;
                                            }
                                            else {
                                                o2 = s.e;
                                            }
                                            final a e4 = ((WidgetRun)o2).e;
                                            if (((DependencyNode)e4).j) {
                                                float n5;
                                                if (g == 0) {
                                                    n5 = b2.x;
                                                }
                                                else {
                                                    n5 = b2.A;
                                                }
                                                e.d(this.f((int)(((DependencyNode)e4).g * n5 + 0.5f), g));
                                            }
                                        }
                                    }
                                }
                                else {
                                    this.e.d(Math.min(this.f(e.m, g), n3));
                                }
                            }
                            else {
                                e.d(this.f(n3, g));
                            }
                        }
                    }
                }
                final a e5 = this.e;
                if (!((DependencyNode)e5).j) {
                    return;
                }
                final int g4 = ((DependencyNode)e5).g;
                if (g4 == n3) {
                    this.h.d(n);
                    this.i.d(n2);
                    return;
                }
                final ConstraintWidget b3 = this.b;
                float n6;
                if (g == 0) {
                    n6 = b3.c0;
                }
                else {
                    n6 = b3.d0;
                }
                g = n2;
                int g5 = n;
                if (g2 == g3) {
                    g5 = g2.g;
                    g = g3.g;
                    n6 = 0.5f;
                }
                this.h.d((int)((g - g5 - g4) * n6 + (g5 + 0.5f)));
                this.i.d(this.h.g + ((DependencyNode)this.e).g);
            }
        }
    }
    
    public enum RunType
    {
        CENTER, 
        END, 
        NONE, 
        START;
    }
}
