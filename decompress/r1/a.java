// 
// Decompiled by Procyon v0.6.0
// 

package r1;

import q1.e;
import ah2.f;
import u2.i;
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
        this(w, g.b, yl.a.c(w.getWidth(), w.getHeight()));
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
    
    public final boolean e(final s q) {
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
        if (!f.a((Object)k, (Object)a.k)) {
            return false;
        }
        final long l = this.l;
        final long i = a.l;
        final int c = g.c;
        return l == i && u2.i.a(this.m, a.m) && this.n == a.n;
    }
    
    public final long h() {
        return yl.a.x1(this.o);
    }
    
    public final int hashCode() {
        final int hashCode = this.k.hashCode();
        final long l = this.l;
        final int c = g.c;
        return Integer.hashCode(this.n) + b.c(this.m, b.c(l, hashCode * 31, 31), 31);
    }
    
    public final void i(final e e) {
        f.f((Object)e, "<this>");
        e.H(e, this.k, this.l, this.m, 0L, yl.a.c(at1.a.D1(n1.f.e(e.b())), at1.a.D1(n1.f.c(e.b()))), this.p, null, this.q, 0, this.n, 328);
    }
    
    public final String toString() {
        final StringBuilder k = a.k("BitmapPainter(image=");
        k.append(this.k);
        k.append(", srcOffset=");
        k.append((Object)g.c(this.l));
        k.append(", srcSize=");
        k.append((Object)i.c(this.m));
        k.append(", filterQuality=");
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
        k.append((Object)s);
        k.append(')');
        return k.toString();
    }
}
