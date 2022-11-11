// 
// Decompiled by Procyon v0.6.0
// 

package androidx.constraintlayout.compose;

import sg2.e;
import kotlin.Metadata;
import c3.a;
import y2.g;
import rg2.l;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0001\u001a\u00020\u0000H\n" }, d2 = { "Ly2/g;", "it", "Lc3/a;", "Landroidx/constraintlayout/compose/SolverDimension;", "<anonymous>" }, k = 3, mv = { 1, 5, 1 })
final class Dimension$Companion$percent$1 extends Lambda implements l<g, a>
{
    public final /* synthetic */ float $percent;
    
    public Dimension$Companion$percent$1(final float $percent) {
        this.$percent = $percent;
        super(1);
    }
    
    public final a invoke(final g g) {
        e.f((Object)g, "it");
        final float $percent = this.$percent;
        final a a = new a(c3.a.k);
        a.c = $percent;
        a.f = true;
        return a;
    }
}
