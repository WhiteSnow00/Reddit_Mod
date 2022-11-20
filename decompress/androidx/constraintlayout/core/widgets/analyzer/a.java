// 
// Decompiled by Procyon v0.6.0
// 

package androidx.constraintlayout.core.widgets.analyzer;

import java.util.Iterator;
import f3.d;

public class a extends DependencyNode
{
    public int m;
    
    public a(final WidgetRun widgetRun) {
        super(widgetRun);
        if (widgetRun instanceof c) {
            super.e = Type.HORIZONTAL_DIMENSION;
        }
        else {
            super.e = Type.VERTICAL_DIMENSION;
        }
    }
    
    @Override
    public final void d(final int g) {
        if (super.j) {
            return;
        }
        super.j = true;
        super.g = g;
        for (final d d : super.k) {
            d.a(d);
        }
    }
}
