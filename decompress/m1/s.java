// 
// Decompiled by Procyon v0.6.0
// 

package m1;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeWrapper;
import yg.a;
import androidx.compose.ui.focus.FocusModifier;
import java.util.Comparator;

public final class s<T> implements Comparator
{
    @Override
    public final int compare(final T t, final T t2) {
        final LayoutNodeWrapper q = ((FocusModifier)t).q;
        final Comparable comparable = null;
        Integer value = null;
        Label_0036: {
            if (q != null) {
                final LayoutNode j = q.j;
                if (j != null) {
                    value = j.A;
                    break Label_0036;
                }
            }
            value = null;
        }
        final LayoutNodeWrapper q2 = ((FocusModifier)t2).q;
        Comparable value2 = comparable;
        if (q2 != null) {
            final LayoutNode i = q2.j;
            value2 = comparable;
            if (i != null) {
                value2 = i.A;
            }
        }
        return a.h0((Comparable)value, value2);
    }
}
