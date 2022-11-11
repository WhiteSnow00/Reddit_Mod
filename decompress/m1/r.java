// 
// Decompiled by Procyon v0.6.0
// 

package m1;

import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeWrapper;
import c2.l;
import yg.a;
import n1.d;
import androidx.compose.ui.focus.FocusStateImpl;
import kotlin.NoWhenBranchMatchedException;
import a1.e;
import androidx.compose.ui.focus.FocusModifier;

public final class r
{
    public static final e<FocusModifier> a(final FocusModifier focusModifier) {
        final e h = focusModifier.h;
        final int h2 = h.h;
        final int n = 0;
        boolean b = false;
        Label_0065: {
            Label_0062: {
                if (h2 > 0) {
                    final Object[] f = h.f;
                    int n2 = 0;
                    while (!((FocusModifier)f[n2]).i.isDeactivated()) {
                        if (++n2 >= h2) {
                            break Label_0062;
                        }
                    }
                    b = true;
                    break Label_0065;
                }
            }
            b = false;
        }
        if (!b) {
            return (e<FocusModifier>)focusModifier.h;
        }
        final e e = new e((Object[])new FocusModifier[16]);
        final e h3 = focusModifier.h;
        final int h4 = h3.h;
        if (h4 > 0) {
            final Object[] f2 = h3.f;
            int n3 = n;
            do {
                final FocusModifier focusModifier2 = (FocusModifier)f2[n3];
                if (!focusModifier2.i.isDeactivated()) {
                    e.b((Object)focusModifier2);
                }
                else {
                    e.c(e.h, (e)a(focusModifier2));
                }
            } while (++n3 < h4);
        }
        return (e<FocusModifier>)e;
    }
    
    public static final FocusModifier b(FocusModifier j) {
        sg2.e.f((Object)j, "<this>");
        final FocusStateImpl i = j.i;
        FocusModifier b = j;
        switch (a.b[((Enum)i).ordinal()]) {
            default: {
                throw new NoWhenBranchMatchedException();
            }
            case 3:
            case 4: {
                j = j.j;
                if (j != null) {
                    b = b(j);
                    return b;
                }
                return null;
            }
            case 1:
            case 2: {
                return b;
            }
            case 5:
            case 6: {
                b = null;
                return b;
            }
        }
    }
    
    public static final FocusModifier c(FocusModifier c) {
        final FocusModifier g = c.g;
        if (g != null) {
            switch (a.b[((Enum)c.i).ordinal()]) {
                default: {
                    throw new NoWhenBranchMatchedException();
                }
                case 1:
                case 2:
                case 4:
                case 5:
                case 6: {
                    c = c(g);
                }
                case 3: {
                    break;
                }
            }
        }
        else {
            c = null;
        }
        return c;
    }
    
    public static final d d(final FocusModifier focusModifier) {
        sg2.e.f((Object)focusModifier, "<this>");
        final LayoutNodeWrapper q = focusModifier.q;
        d d;
        if (q == null || (d = yg.a.w0((l)q).A((l)q, false)) == null) {
            d = n1.d.e;
        }
        return d;
    }
    
    public static final boolean e(final FocusModifier focusModifier) {
        sg2.e.f((Object)focusModifier, "<this>");
        final LayoutNodeWrapper q = focusModifier.q;
        boolean b = true;
        boolean b2 = false;
        Label_0041: {
            if (q != null) {
                final LayoutNode j = q.j;
                if (j != null && j.z) {
                    b2 = true;
                    break Label_0041;
                }
            }
            b2 = false;
        }
        if (b2) {
            boolean b3 = false;
            Label_0073: {
                if (q != null) {
                    final LayoutNode i = q.j;
                    if (i != null && i.B()) {
                        b3 = true;
                        break Label_0073;
                    }
                }
                b3 = false;
            }
            if (b3) {
                return b;
            }
        }
        b = false;
        return b;
    }
}
