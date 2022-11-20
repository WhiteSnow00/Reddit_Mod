// 
// Decompiled by Procyon v0.6.0
// 

package q0;

import z0.c1;
import cg2.j;
import androidx.compose.ui.platform.o0;
import androidx.compose.foundation.lazy.ParentSizeModifier;
import mg2.l;
import androidx.compose.ui.platform.InspectableValueKt;
import u2.g;
import l0.t;
import j1.d;
import ah0.b;
import z0.k0;

public final class f implements e
{
    public k0 a;
    public k0 b;
    
    public f() {
        final Integer value = Integer.MAX_VALUE;
        this.a = ah0.b.Z0((Object)value);
        this.b = ah0.b.Z0((Object)value);
    }
    
    public final d a(final d d, final t<g> t) {
        ng2.e.f((Object)d, "<this>");
        ng2.e.f((Object)t, "animationSpec");
        return d.l0((d)new a((t)t, (l)InspectableValueKt.a));
    }
    
    public final d b(final float n) {
        return (d)new ParentSizeModifier(n, InspectableValueKt.a, (c1<Integer>)this.a, (c1<Integer>)this.b);
    }
    
    public final d c(final d d, final float n) {
        ng2.e.f((Object)d, "<this>");
        return d.l0((d)new ParentSizeModifier(n, InspectableValueKt.a, null, this.b, 4));
    }
    
    public final d d(final d d, final float n) {
        ng2.e.f((Object)d, "<this>");
        return d.l0((d)new ParentSizeModifier(n, InspectableValueKt.a, this.a, null, 8));
    }
}
