// 
// Decompiled by Procyon v0.6.0
// 

package r1;

import n1.f;
import sg2.e;
import u2.i;
import lw0.b;
import u2.g;
import o1.s;
import o1.w;
import androidx.compose.ui.graphics.painter.Painter;

public final class a extends Painter
{
    public final w k;
    public final long l;
    public final long m;
    public int n;
    public final long o;
    public float p;
    public s q;
    
    public a(final w w) {
        this(w, g.b, b.l(w.getWidth(), w.getHeight()));
    }
    
    public a(final w k, final long l, final long n) {
        this.k = k;
        this.l = l;
        this.m = n;
        boolean b = true;
        this.n = 1;
        final int c = g.c;
        Label_0100: {
            if ((int)(l >> 32) >= 0 && g.b(l) >= 0) {
                final int n2 = (int)(n >> 32);
                if (n2 >= 0 && i.b(n) >= 0 && n2 <= k.getWidth() && i.b(n) <= k.getHeight()) {
                    break Label_0100;
                }
            }
            b = false;
        }
        if (b) {
            this.o = n;
            this.p = 1.0f;
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
    
    public final boolean b(final float p) {
        this.p = p;
        return true;
    }
    
    public final boolean c(final s q) {
        this.q = q;
        return true;
    }
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof a)) {
            return false;
        }
        final w k = this.k;
        final a a = (a)o;
        if (!e.a((Object)k, (Object)a.k)) {
            return false;
        }
        final long l = this.l;
        final long i = a.l;
        final int c = g.c;
        return l == i && u2.i.a(this.m, a.m) && this.n == a.n;
    }
    
    public final long h() {
        return b.S2(this.o);
    }
    
    public final int hashCode() {
        final int hashCode = this.k.hashCode();
        final long l = this.l;
        final int c = g.c;
        return Integer.hashCode(this.n) + b.b(this.m, b.b(l, hashCode * 31, 31), 31);
    }
    
    public final void i(final q1.e e) {
        e.f((Object)e, "<this>");
        q1.e.J(e, this.k, this.l, this.m, 0L, b.l(b.k2(f.f(e.b())), b.k2(f.d(e.b()))), this.p, (q1.f)null, this.q, 0, this.n, 328);
    }
    
    public final String toString() {
        final StringBuilder r = a.r("BitmapPainter(image=");
        r.append(this.k);
        r.append(", srcOffset=");
        r.append((Object)g.c(this.l));
        r.append(", srcSize=");
        r.append((Object)i.c(this.m));
        r.append(", filterQuality=");
        final int n = this.n;
        final int n2 = 0;
        String s;
        if (n == 0) {
            s = "None";
        }
        else if (n == 1) {
            s = "Low";
        }
        else if (n == 2) {
            s = "Medium";
        }
        else {
            int n3 = n2;
            if (n == 3) {
                n3 = 1;
            }
            if (n3 != 0) {
                s = "High";
            }
            else {
                s = "Unknown";
            }
        }
        r.append((Object)s);
        r.append(')');
        return r.toString();
    }
}
