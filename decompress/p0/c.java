// 
// Decompiled by Procyon v0.6.0
// 

package p0;

import androidx.compose.runtime.SnapshotMutableStateImpl;
import a4.a2;
import sg2.e;
import androidx.compose.ui.unit.LayoutDirection;
import u2.b;
import bg.d;
import q3.f;
import z0.l0;

public final class c implements i0
{
    public final int a;
    public final String b;
    public final l0 c;
    public final l0 d;
    
    public c(final int a, final String b) {
        this.a = a;
        this.b = b;
        this.c = bg.d.t0((Object)f.e);
        this.d = bg.d.t0((Object)Boolean.TRUE);
    }
    
    public final int a(final b b, final LayoutDirection layoutDirection) {
        e.f((Object)b, "density");
        e.f((Object)layoutDirection, "layoutDirection");
        return this.e().a;
    }
    
    public final int b(final b b) {
        e.f((Object)b, "density");
        return this.e().d;
    }
    
    public final int c(final b b, final LayoutDirection layoutDirection) {
        e.f((Object)b, "density");
        e.f((Object)layoutDirection, "layoutDirection");
        return this.e().c;
    }
    
    public final int d(final b b) {
        e.f((Object)b, "density");
        return this.e().b;
    }
    
    public final f e() {
        return (f)((SnapshotMutableStateImpl)this.c).getValue();
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (!(o instanceof c)) {
            return false;
        }
        if (this.a != ((c)o).a) {
            b = false;
        }
        return b;
    }
    
    public final void f(final a2 a2, final int n) {
        e.f((Object)a2, "windowInsetsCompat");
        if (n == 0 || (n & this.a) != 0x0) {
            final f a3 = a2.a(this.a);
            e.f((Object)a3, "<set-?>");
            ((SnapshotMutableStateImpl)this.c).setValue((Object)a3);
            ((SnapshotMutableStateImpl)this.d).setValue((Object)a2.h(this.a));
        }
    }
    
    @Override
    public final int hashCode() {
        return this.a;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.b);
        sb.append('(');
        sb.append(this.e().a);
        sb.append(", ");
        sb.append(this.e().b);
        sb.append(", ");
        sb.append(this.e().c);
        sb.append(", ");
        return d.l(sb, this.e().d, ')');
    }
}
