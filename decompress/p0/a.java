// 
// Decompiled by Procyon v0.6.0
// 

package p0;

import androidx.compose.ui.unit.LayoutDirection;
import u2.b;
import sg2.e;

public final class a implements i0
{
    public final i0 a;
    public final i0 b;
    
    public a(final c a, final m b) {
        e.f((Object)a, "first");
        this.a = (i0)a;
        this.b = (i0)b;
    }
    
    public final int a(final b b, final LayoutDirection layoutDirection) {
        e.f((Object)b, "density");
        e.f((Object)layoutDirection, "layoutDirection");
        return this.b.a(b, layoutDirection) + this.a.a(b, layoutDirection);
    }
    
    public final int b(final b b) {
        e.f((Object)b, "density");
        return this.b.b(b) + this.a.b(b);
    }
    
    public final int c(final b b, final LayoutDirection layoutDirection) {
        e.f((Object)b, "density");
        e.f((Object)layoutDirection, "layoutDirection");
        return this.b.c(b, layoutDirection) + this.a.c(b, layoutDirection);
    }
    
    public final int d(final b b) {
        e.f((Object)b, "density");
        return this.b.d(b) + this.a.d(b);
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (!(o instanceof a)) {
            return false;
        }
        final a a = (a)o;
        if (!e.a((Object)a.a, (Object)this.a) || !e.a((Object)a.b, (Object)this.b)) {
            b = false;
        }
        return b;
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() * 31 + this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        final StringBuilder p = d.p('(');
        p.append(this.a);
        p.append(" + ");
        p.append(this.b);
        p.append(')');
        return p.toString();
    }
}
