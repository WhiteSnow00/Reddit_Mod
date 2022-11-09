// 
// Decompiled by Procyon v0.6.0
// 

package t2;

import pg2.i;
import o1.r;
import androidx.compose.ui.text.style.TextDrawStyle;

public final class b implements TextDrawStyle
{
    public final long a;
    
    public b(final long a) {
        this.a = a;
        if (a != r.l) {
            return;
        }
        throw new IllegalArgumentException("ColorStyle value must be specified, use TextDrawStyle.Unspecified instead.".toString());
    }
    
    @Override
    public final long a() {
        return this.a;
    }
    
    @Override
    public final void d() {
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof b && r.c(this.a, ((b)o).a));
    }
    
    @Override
    public final int hashCode() {
        final long a = this.a;
        final int m = r.m;
        return i.a(a);
    }
    
    @Override
    public final String toString() {
        return d.i(this.a, a.k("ColorStyle(value="), ')');
    }
}
