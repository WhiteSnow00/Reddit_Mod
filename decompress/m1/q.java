// 
// Decompiled by Procyon v0.6.0
// 

package m1;

import e2.m;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeWrapper;
import kotlin.NoWhenBranchMatchedException;
import androidx.compose.ui.focus.FocusStateImpl;
import sg2.e;
import androidx.compose.ui.focus.FocusModifier;

public final class q
{
    public static final void a(final FocusModifier focusModifier) {
        e.f((Object)focusModifier, "<this>");
        final int n = a.a[((Enum)focusModifier.i).ordinal()];
        if (n != 3) {
            if (n == 4) {
                focusModifier.b(FocusStateImpl.ActiveParent);
            }
        }
        else {
            focusModifier.b(FocusStateImpl.Inactive);
        }
    }
    
    public static final boolean b(final FocusModifier focusModifier) {
        final FocusModifier j = focusModifier.j;
        if (j != null) {
            boolean b = false;
            if (c(j, false)) {
                focusModifier.j = null;
                b = true;
            }
            return b;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
    
    public static final boolean c(final FocusModifier focusModifier, final boolean b) {
        e.f((Object)focusModifier, "<this>");
        switch (a.a[((Enum)focusModifier.i).ordinal()]) {
            default: {
                throw new NoWhenBranchMatchedException();
            }
            case 5: {
                if (b(focusModifier)) {
                    focusModifier.b(FocusStateImpl.Inactive);
                    return true;
                }
                break;
            }
            case 4: {
                if (b(focusModifier)) {
                    focusModifier.b(FocusStateImpl.Deactivated);
                    return true;
                }
                break;
            }
            case 2: {
                boolean b2 = b;
                if (b) {
                    focusModifier.b(FocusStateImpl.Inactive);
                    b2 = b;
                    return b2;
                }
                return b2;
            }
            case 1: {
                focusModifier.b(FocusStateImpl.Inactive);
            }
            case 3:
            case 6: {
                return true;
            }
        }
        return false;
    }
    
    public static final void d(final FocusModifier focusModifier) {
        e.f((Object)focusModifier, "<this>");
        final int n = a.a[((Enum)focusModifier.i).ordinal()];
        if (n != 1 && n != 2) {
            if (n != 5) {
                if (n == 6) {
                    focusModifier.b(FocusStateImpl.Deactivated);
                }
            }
            else {
                focusModifier.b(FocusStateImpl.DeactivatedParent);
            }
        }
        else {
            final LayoutNodeWrapper q = focusModifier.q;
            if (q != null) {
                final LayoutNode j = q.j;
                if (j != null) {
                    final m l = j.l;
                    if (l != null) {
                        final d focusManager = l.getFocusManager();
                        if (focusManager != null) {
                            focusManager.b(true);
                        }
                    }
                }
            }
            focusModifier.b(FocusStateImpl.Deactivated);
        }
    }
    
    public static final void e(final FocusModifier focusModifier) {
        FocusStateImpl focusStateImpl = null;
        switch (a.a[((Enum)focusModifier.i).ordinal()]) {
            default: {
                throw new NoWhenBranchMatchedException();
            }
            case 3:
            case 4: {
                throw new IllegalStateException("Granting focus to a deactivated node.".toString());
            }
            case 2: {
                focusStateImpl = FocusStateImpl.Captured;
                break;
            }
            case 1:
            case 5:
            case 6: {
                focusStateImpl = FocusStateImpl.Active;
                break;
            }
        }
        focusModifier.b(focusStateImpl);
    }
    
    public static final void f(final FocusModifier focusModifier) {
        e.f((Object)focusModifier, "<this>");
        final LayoutNodeWrapper q = focusModifier.q;
        m l = null;
        Label_0034: {
            if (q != null) {
                final LayoutNode j = q.j;
                if (j != null) {
                    l = j.l;
                    break Label_0034;
                }
            }
            l = null;
        }
        if (l == null) {
            focusModifier.r = true;
            return;
        }
        switch (a.a[((Enum)focusModifier.i).ordinal()]) {
            case 6: {
                final FocusModifier g = focusModifier.g;
                if (g != null) {
                    g(g, focusModifier);
                    break;
                }
                if (h(focusModifier)) {
                    e(focusModifier);
                    break;
                }
                break;
            }
            case 5: {
                if (b(focusModifier)) {
                    e(focusModifier);
                    break;
                }
                break;
            }
            case 1:
            case 2:
            case 3:
            case 4: {
                final c k = focusModifier.k;
                if (k != null) {
                    k.d();
                    break;
                }
                break;
            }
        }
    }
    
    public static final boolean g(final FocusModifier focusModifier, final FocusModifier focusModifier2) {
        if (focusModifier.h.f((Object)focusModifier2)) {
            final int n = a.a[((Enum)focusModifier.i).ordinal()];
            boolean b2;
            final boolean b = b2 = false;
            switch (n) {
                default: {
                    throw new NoWhenBranchMatchedException();
                }
                case 6: {
                    final FocusModifier g = focusModifier.g;
                    if (g == null && h(focusModifier)) {
                        focusModifier.b(FocusStateImpl.Active);
                        b2 = g(focusModifier, focusModifier2);
                        return b2;
                    }
                    b2 = b;
                    if (g == null) {
                        return b2;
                    }
                    b2 = b;
                    if (g(g, focusModifier)) {
                        b2 = g(focusModifier, focusModifier2);
                        return b2;
                    }
                    return b2;
                }
                case 5: {
                    b2 = b;
                    if (b(focusModifier)) {
                        e(focusModifier.j = focusModifier2);
                        break;
                    }
                    return b2;
                }
                case 4: {
                    if (focusModifier.j == null) {
                        e(focusModifier.j = focusModifier2);
                        break;
                    }
                    b2 = b;
                    if (b(focusModifier)) {
                        e(focusModifier.j = focusModifier2);
                        break;
                    }
                    return b2;
                }
                case 1: {
                    focusModifier.b(FocusStateImpl.ActiveParent);
                    e(focusModifier.j = focusModifier2);
                    break;
                }
                case 2: {
                    return b2;
                }
                case 3: {
                    a(focusModifier);
                    b2 = g(focusModifier, focusModifier2);
                    d(focusModifier);
                    return b2;
                }
            }
            b2 = true;
            return b2;
        }
        throw new IllegalStateException("Non child node cannot request focus.".toString());
    }
    
    public static final boolean h(final FocusModifier focusModifier) {
        final LayoutNodeWrapper q = focusModifier.q;
        if (q != null) {
            final LayoutNode j = q.j;
            if (j != null) {
                final m l = j.l;
                if (l != null) {
                    return l.requestFocus();
                }
            }
        }
        throw new IllegalStateException("Owner not initialized.".toString());
    }
}
