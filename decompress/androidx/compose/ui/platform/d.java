// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.platform;

import ng2.e;
import android.graphics.Rect;
import androidx.compose.ui.semantics.SemanticsNode;
import i2.n;
import androidx.compose.ui.text.style.ResolvedTextDirection;

public final class d extends a
{
    public static d e;
    public static final ResolvedTextDirection f;
    public static final ResolvedTextDirection g;
    public n c;
    public SemanticsNode d;
    
    static {
        f = ResolvedTextDirection.Rtl;
        g = ResolvedTextDirection.Ltr;
    }
    
    public d() {
        new Rect();
    }
    
    @Override
    public final int[] a(int n) {
        if (this.d().length() <= 0) {
            return null;
        }
        if (n >= this.d().length()) {
            return null;
        }
        try {
            final SemanticsNode d = this.d;
            if (d == null) {
                ng2.e.n("node");
                throw null;
            }
            final n1.d d2 = d.d();
            final int w = p7.a.W(d2.d - d2.b);
            if (n <= 0) {
                n = 0;
            }
            final n c = this.c;
            if (c == null) {
                ng2.e.n("layoutResult");
                throw null;
            }
            final int f = c.f(n);
            final n c2 = this.c;
            if (c2 == null) {
                ng2.e.n("layoutResult");
                throw null;
            }
            final float n2 = c2.k(f) + w;
            final n c3 = this.c;
            if (c3 != null) {
                int n3;
                if (n2 < c3.k(c3.b.f - 1)) {
                    final n c4 = this.c;
                    if (c4 == null) {
                        ng2.e.n("layoutResult");
                        throw null;
                    }
                    n3 = c4.g(n2);
                }
                else {
                    final n c5 = this.c;
                    if (c5 == null) {
                        ng2.e.n("layoutResult");
                        throw null;
                    }
                    n3 = c5.b.f;
                }
                return this.c(n, this.e(n3 - 1, androidx.compose.ui.platform.d.g) + 1);
            }
            ng2.e.n("layoutResult");
            throw null;
        }
        catch (final IllegalStateException ex) {
            return null;
        }
    }
    
    @Override
    public final int[] b(int g) {
        if (this.d().length() <= 0) {
            return null;
        }
        if (g <= 0) {
            return null;
        }
        try {
            final SemanticsNode d = this.d;
            if (d == null) {
                ng2.e.n("node");
                throw null;
            }
            final n1.d d2 = d.d();
            final int w = p7.a.W(d2.d - d2.b);
            int length = this.d().length();
            if (length > g) {
                length = g;
            }
            final n c = this.c;
            if (c == null) {
                ng2.e.n("layoutResult");
                throw null;
            }
            final int f = c.f(length);
            final n c2 = this.c;
            if (c2 != null) {
                final float n = c2.k(f) - w;
                if (n > 0.0f) {
                    final n c3 = this.c;
                    if (c3 == null) {
                        ng2.e.n("layoutResult");
                        throw null;
                    }
                    g = c3.g(n);
                }
                else {
                    g = 0;
                }
                int n2 = g;
                if (length == this.d().length() && (n2 = g) < f) {
                    n2 = g + 1;
                }
                return this.c(this.e(n2, androidx.compose.ui.platform.d.f), length);
            }
            ng2.e.n("layoutResult");
            throw null;
        }
        catch (final IllegalStateException ex) {
            return null;
        }
    }
    
    public final int e(int j, final ResolvedTextDirection resolvedTextDirection) {
        final n c = this.c;
        if (c == null) {
            ng2.e.n("layoutResult");
            throw null;
        }
        final int i = c.j(j);
        final n c2 = this.c;
        if (c2 != null) {
            if (resolvedTextDirection != c2.m(i)) {
                final n c3 = this.c;
                if (c3 == null) {
                    ng2.e.n("layoutResult");
                    throw null;
                }
                j = c3.j(j);
            }
            else {
                final n c4 = this.c;
                if (c4 == null) {
                    ng2.e.n("layoutResult");
                    throw null;
                }
                j = c4.e(j, false) - 1;
            }
            return j;
        }
        ng2.e.n("layoutResult");
        throw null;
    }
}
