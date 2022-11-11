// 
// Decompiled by Procyon v0.6.0
// 

package p0;

import c2.h;
import androidx.compose.ui.layout.AlignmentLineKt;
import j1.b;
import hg2.j;
import androidx.compose.ui.platform.n0;
import rg2.l;
import androidx.compose.ui.platform.InspectableValueKt;
import sg2.e;
import j1.d;

public final class d0 implements c0
{
    public static final d0 a;
    
    static {
        a = new d0();
    }
    
    public final d a(final float n, final d d, final boolean b) {
        e.f((Object)d, "<this>");
        if (n > 0.0) {
            return d.j0((d)new t(n, b, InspectableValueKt.a));
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("invalid weight ");
        sb.append(n);
        sb.append("; must be greater than zero");
        throw new IllegalArgumentException(sb.toString().toString());
    }
    
    public final d b(final d d, final b.b b) {
        e.f((Object)d, "<this>");
        return d.j0((d)new h0(b, InspectableValueKt.a));
    }
    
    public final d c(final d d) {
        e.f((Object)d, "<this>");
        final h a = AlignmentLineKt.a;
        e.f((Object)a, "alignmentLine");
        return d.j0((d)new e0.a(a, InspectableValueKt.a));
    }
}
