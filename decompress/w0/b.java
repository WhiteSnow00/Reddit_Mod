// 
// Decompiled by Procyon v0.6.0
// 

package w0;

import u2.g;
import kotlin.NoWhenBranchMatchedException;
import sg2.e;
import androidx.compose.ui.unit.LayoutDirection;
import u2.h;
import androidx.compose.foundation.text.selection.HandleReferencePoint;
import w2.d;

public final class b implements d
{
    public final HandleReferencePoint a;
    public final long b;
    
    public b(final HandleReferencePoint a, final long b) {
        this.a = a;
        this.b = b;
    }
    
    public final long a(final h h, long n, final LayoutDirection layoutDirection, final long n2) {
        e.f((Object)layoutDirection, "layoutDirection");
        final int n3 = w0.b.b$a.a[this.a.ordinal()];
        if (n3 != 1) {
            if (n3 != 2) {
                if (n3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                final int a = h.a;
                n = this.b;
                final int c = g.c;
                n = a92.b.j(a + (int)(n >> 32) - (int)(n2 >> 32) / 2, g.b(n) + h.b);
            }
            else {
                final int a2 = h.a;
                n = this.b;
                final int c2 = g.c;
                n = a92.b.j(a2 + (int)(n >> 32) - (int)(n2 >> 32), g.b(n) + h.b);
            }
        }
        else {
            final int a3 = h.a;
            n = this.b;
            final int c3 = g.c;
            n = a92.b.j(a3 + (int)(n >> 32), g.b(n) + h.b);
        }
        return n;
    }
}
