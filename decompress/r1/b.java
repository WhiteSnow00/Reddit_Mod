// 
// Decompiled by Procyon v0.6.0
// 

package r1;

import q1.e;
import pg2.i;
import o1.r;
import n1.f;
import o1.s;
import androidx.compose.ui.graphics.painter.Painter;

public final class b extends Painter
{
    public final long k;
    public float l;
    public s m;
    public final long n;
    
    public b(final long k) {
        this.k = k;
        this.l = 1.0f;
        this.n = f.c;
    }
    
    public final boolean b(final float l) {
        this.l = l;
        return true;
    }
    
    public final boolean e(final s m) {
        this.m = m;
        return true;
    }
    
    public final boolean equals(final Object o) {
        return this == o || (o instanceof b && r.c(this.k, ((b)o).k));
    }
    
    public final long h() {
        return this.n;
    }
    
    public final int hashCode() {
        final long k = this.k;
        final int m = r.m;
        return i.a(k);
    }
    
    public final void i(final e e) {
        ah2.f.f((Object)e, "<this>");
        e.P0(e, this.k, 0L, 0L, this.l, this.m, 86);
    }
    
    public final String toString() {
        return d.i(this.k, a.k("ColorPainter(color="), ')');
    }
}
