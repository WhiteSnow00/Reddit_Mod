// 
// Decompiled by Procyon v0.6.0
// 

package p0;

import androidx.compose.ui.unit.LayoutDirection;
import u2.b;
import sg2.e;

public final class f0 implements i0
{
    public final i0 a;
    public final i0 b;
    
    public f0(final i0 a, final i0 b) {
        e.f((Object)b, "second");
        this.a = a;
        this.b = b;
    }
    
    public final int a(final b b, final LayoutDirection layoutDirection) {
        e.f((Object)b, "density");
        e.f((Object)layoutDirection, "layoutDirection");
        return Math.max(this.a.a(b, layoutDirection), this.b.a(b, layoutDirection));
    }
    
    public final int b(final b b) {
        e.f((Object)b, "density");
        return Math.max(this.a.b(b), this.b.b(b));
    }
    
    public final int c(final b b, final LayoutDirection layoutDirection) {
        e.f((Object)b, "density");
        e.f((Object)layoutDirection, "layoutDirection");
        return Math.max(this.a.c(b, layoutDirection), this.b.c(b, layoutDirection));
    }
    
    public final int d(final b b) {
        e.f((Object)b, "density");
        return Math.max(this.a.d(b), this.b.d(b));
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (!(o instanceof f0)) {
            return false;
        }
        final f0 f0 = (f0)o;
        if (!e.a((Object)f0.a, (Object)this.a) || !e.a((Object)f0.b, (Object)this.b)) {
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
        p.append(" \u222a ");
        p.append(this.b);
        p.append(')');
        return p.toString();
    }
}
