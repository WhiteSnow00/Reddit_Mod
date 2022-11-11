// 
// Decompiled by Procyon v0.6.0
// 

package m1;

import androidx.compose.ui.focus.FocusPropertiesKt;
import androidx.compose.ui.focus.FocusStateImpl;
import kotlin.NoWhenBranchMatchedException;
import androidx.compose.ui.focus.FocusModifier;

public final class e
{
    public static final FocusModifier a(FocusModifier j) {
        final FocusStateImpl i = j.i;
        FocusModifier a = j;
        switch (e.a.a[((Enum)i).ordinal()]) {
            default: {
                throw new NoWhenBranchMatchedException();
            }
            case 3:
            case 4: {
                j = j.j;
                if (j != null) {
                    a = a(j);
                    if (a != null) {
                        return a;
                    }
                }
                throw new IllegalStateException("no child".toString());
            }
            case 1:
            case 2: {
                return a;
            }
            case 5:
            case 6: {
                a = null;
                return a;
            }
        }
    }
    
    public static final void b(final FocusModifier focusModifier) {
        FocusPropertiesKt.a(focusModifier);
        final a1.e h = focusModifier.h;
        final int h2 = h.h;
        if (h2 > 0) {
            int n = 0;
            final Object[] f = h.f;
            do {
                b((FocusModifier)f[n]);
            } while (++n < h2);
        }
    }
}
