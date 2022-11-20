// 
// Decompiled by Procyon v0.6.0
// 

package androidx.constraintlayout.core.widgets.analyzer;

import java.util.Iterator;
import androidx.constraintlayout.core.widgets.a;
import f3.d;
import androidx.constraintlayout.core.widgets.ConstraintWidget;

public final class b extends WidgetRun
{
    public b(final ConstraintWidget constraintWidget) {
        super(constraintWidget);
    }
    
    @Override
    public final void a(final d d) {
        ((a)super.b).getClass();
        final Iterator iterator = super.h.l.iterator();
        int n = 0;
        int n2 = -1;
        while (iterator.hasNext()) {
            final int g = ((DependencyNode)iterator.next()).g;
            int n3;
            if (n2 == -1 || g < (n3 = n2)) {
                n3 = g;
            }
            n2 = n3;
            if (n < g) {
                n = g;
                n2 = n3;
            }
        }
        super.h.d(n2 + 0);
    }
    
    @Override
    public final void d() {
        final ConstraintWidget b = super.b;
        if (b instanceof a) {
            super.h.b = true;
            final a a = (a)b;
            a.getClass();
            final boolean q0 = a.q0;
            super.h.e = DependencyNode.Type.LEFT;
            for (int i = 0; i < a.p0; ++i) {
                final ConstraintWidget constraintWidget = a.o0[i];
                if (q0 || constraintWidget.f0 != 8) {
                    final DependencyNode h = constraintWidget.d.h;
                    h.k.add(super.h);
                    super.h.l.add(h);
                }
            }
            final DependencyNode h2 = super.b.d.h;
            super.h.k.add(h2);
            h2.l.add(super.h);
            final DependencyNode j = super.b.d.i;
            super.h.k.add(j);
            j.l.add(super.h);
        }
    }
    
    @Override
    public final void e() {
        super.c = null;
        super.h.c();
    }
}
