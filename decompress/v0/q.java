// 
// Decompiled by Procyon v0.6.0
// 

package v0;

import ah2.f;
import i2.p;
import n2.g;
import u2.b;
import androidx.compose.ui.unit.LayoutDirection;

public final class q
{
    public LayoutDirection a;
    public b b;
    public g.a c;
    public p d;
    public Object e;
    public long f;
    
    public q(final LayoutDirection a, final b b, final g.a c, final p d, final Object e) {
        ah2.f.f((Object)a, "layoutDirection");
        ah2.f.f((Object)b, "density");
        ah2.f.f((Object)c, "fontFamilyResolver");
        ah2.f.f((Object)d, "resolvedStyle");
        ah2.f.f(e, "typeface");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = n.a(d, b, c, n.a, 1);
    }
}
