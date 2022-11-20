// 
// Decompiled by Procyon v0.6.0
// 

package f3;

import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.core.widgets.e;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;

public final class h extends WidgetRun
{
    public h(final ConstraintWidget constraintWidget) {
        super(constraintWidget);
        constraintWidget.d.e();
        constraintWidget.e.e();
        super.f = ((e)constraintWidget).s0;
    }
    
    @Override
    public final void a(final d d) {
        final DependencyNode h = super.h;
        if (!h.c) {
            return;
        }
        if (h.j) {
            return;
        }
        super.h.d((int)(((DependencyNode)h.l.get(0)).g * ((e)super.b).o0 + 0.5f));
    }
    
    @Override
    public final void d() {
        final ConstraintWidget b = super.b;
        final e e = (e)b;
        final int p0 = e.p0;
        final int q0 = e.q0;
        if (e.s0 == 1) {
            if (p0 != -1) {
                super.h.l.add(b.S.d.h);
                super.b.S.d.h.k.add(super.h);
                super.h.f = p0;
            }
            else if (q0 != -1) {
                super.h.l.add(b.S.d.i);
                super.b.S.d.i.k.add(super.h);
                super.h.f = -q0;
            }
            else {
                final DependencyNode h = super.h;
                h.b = true;
                h.l.add(b.S.d.i);
                super.b.S.d.i.k.add(super.h);
            }
            this.j(super.b.d.h);
            this.j(super.b.d.i);
        }
        else {
            if (p0 != -1) {
                super.h.l.add(b.S.e.h);
                super.b.S.e.h.k.add(super.h);
                super.h.f = p0;
            }
            else if (q0 != -1) {
                super.h.l.add(b.S.e.i);
                super.b.S.e.i.k.add(super.h);
                super.h.f = -q0;
            }
            else {
                final DependencyNode h2 = super.h;
                h2.b = true;
                h2.l.add(b.S.e.i);
                super.b.S.e.i.k.add(super.h);
            }
            this.j(super.b.e.h);
            this.j(super.b.e.i);
        }
    }
    
    @Override
    public final void e() {
        super.h.c();
    }
    
    public final void j(final DependencyNode dependencyNode) {
        super.h.k.add(dependencyNode);
        dependencyNode.l.add(super.h);
    }
}
