// 
// Decompiled by Procyon v0.6.0
// 

package androidx.constraintlayout.compose;

import androidx.constraintlayout.core.state.State;
import androidx.constraintlayout.core.state.a;
import d3.b;
import sg2.e;
import kotlin.Metadata;
import hg2.j;
import y2.g;
import rg2.l;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n" }, d2 = { "Ly2/g;", "state", "Lhg2/j;", "<anonymous>" }, k = 3, mv = { 1, 5, 1 })
final class ConstraintLayoutBaseScope$createGuidelineFromTop$2 extends Lambda implements l<g, j>
{
    public final /* synthetic */ float $fraction;
    public final /* synthetic */ int $id;
    
    public ConstraintLayoutBaseScope$createGuidelineFromTop$2(final int $id, final float $fraction) {
        this.$id = $id;
        this.$fraction = $fraction;
        super(1);
    }
    
    public final void invoke(final g g) {
        e.f((Object)g, "state");
        final Integer value = this.$id;
        final a a = ((State)g).a((Object)value);
        final d3.a c = a.c;
        if (c == null || !(c instanceof b)) {
            final b c2 = new b();
            c2.a = 0;
            c2.f = value;
            a.c = (d3.a)c2;
            a.b(c2.a());
        }
        final b b = (b)a.c;
        final float $fraction = this.$fraction;
        b.c = -1;
        b.d = -1;
        b.e = $fraction;
    }
}
