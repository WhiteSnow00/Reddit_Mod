// 
// Decompiled by Procyon v0.6.0
// 

package i2;

import t2.i;
import sg2.e;
import n2.g$a;
import androidx.compose.ui.unit.LayoutDirection;
import u2.b;
import java.util.List;

public final class m
{
    public final a a;
    public final p b;
    public final List<a.b<j>> c;
    public final int d;
    public final boolean e;
    public final int f;
    public final b g;
    public final LayoutDirection h;
    public final g$a i;
    public final long j;
    
    public m() {
        throw null;
    }
    
    public m(final a a, final p b, final List c, final int d, final boolean e, final int f, final b g, final LayoutDirection h, final g$a i, final long j) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof m)) {
            return false;
        }
        final a a = this.a;
        final m m = (m)o;
        return sg2.e.a((Object)a, (Object)m.a) && sg2.e.a((Object)this.b, (Object)m.b) && sg2.e.a((Object)this.c, (Object)m.c) && this.d == m.d && this.e == m.e && this.f == m.f && sg2.e.a((Object)this.g, (Object)m.g) && this.h == m.h && sg2.e.a((Object)this.i, (Object)m.i) && u2.a.b(this.j, m.j);
    }
    
    @Override
    public final int hashCode() {
        return Long.hashCode(this.j) + (this.i.hashCode() + (this.h.hashCode() + (this.g.hashCode() + a.c(this.f, (Boolean.hashCode(this.e) + (aw.b.c((List)this.c, al0.a.e(this.b, this.a.hashCode() * 31, 31), 31) + this.d) * 31) * 31, 31)) * 31) * 31) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("TextLayoutInput(text=");
        r.append((Object)this.a);
        r.append(", style=");
        r.append(this.b);
        r.append(", placeholders=");
        r.append(this.c);
        r.append(", maxLines=");
        r.append(this.d);
        r.append(", softWrap=");
        r.append(this.e);
        r.append(", overflow=");
        r.append((Object)t2.i.a(this.f));
        r.append(", density=");
        r.append(this.g);
        r.append(", layoutDirection=");
        r.append(this.h);
        r.append(", fontFamilyResolver=");
        r.append(this.i);
        r.append(", constraints=");
        r.append((Object)u2.a.k(this.j));
        r.append(')');
        return r.toString();
    }
}
