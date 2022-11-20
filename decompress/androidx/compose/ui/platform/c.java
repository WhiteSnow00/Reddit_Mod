// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.platform;

import ng2.e;
import i2.n;
import androidx.compose.ui.text.style.ResolvedTextDirection;

public final class c extends a
{
    public static c d;
    public static final ResolvedTextDirection e;
    public static final ResolvedTextDirection f;
    public n c;
    
    static {
        e = ResolvedTextDirection.Rtl;
        f = ResolvedTextDirection.Ltr;
    }
    
    @Override
    public final int[] a(int f) {
        if (this.d().length() <= 0) {
            return null;
        }
        if (f >= this.d().length()) {
            return null;
        }
        if (f < 0) {
            final n c = this.c;
            if (c == null) {
                ng2.e.n("layoutResult");
                throw null;
            }
            f = c.f(0);
        }
        else {
            final n c2 = this.c;
            if (c2 == null) {
                ng2.e.n("layoutResult");
                throw null;
            }
            final int f2 = c2.f(f);
            if (this.e(f2, androidx.compose.ui.platform.c.e) == f) {
                f = f2;
            }
            else {
                f = f2 + 1;
            }
        }
        final n c3 = this.c;
        if (c3 == null) {
            ng2.e.n("layoutResult");
            throw null;
        }
        if (f >= c3.b.f) {
            return null;
        }
        return this.c(this.e(f, androidx.compose.ui.platform.c.e), this.e(f, androidx.compose.ui.platform.c.f) + 1);
    }
    
    @Override
    public final int[] b(int f) {
        if (this.d().length() <= 0) {
            return null;
        }
        if (f <= 0) {
            return null;
        }
        if (f > this.d().length()) {
            final n c = this.c;
            if (c == null) {
                ng2.e.n("layoutResult");
                throw null;
            }
            f = c.f(this.d().length());
        }
        else {
            final n c2 = this.c;
            if (c2 == null) {
                ng2.e.n("layoutResult");
                throw null;
            }
            final int f2 = c2.f(f);
            if (this.e(f2, androidx.compose.ui.platform.c.f) + 1 == f) {
                f = f2;
            }
            else {
                f = f2 - 1;
            }
        }
        if (f < 0) {
            return null;
        }
        return this.c(this.e(f, androidx.compose.ui.platform.c.e), this.e(f, androidx.compose.ui.platform.c.f) + 1);
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
