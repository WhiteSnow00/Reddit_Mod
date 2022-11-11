// 
// Decompiled by Procyon v0.6.0
// 

package androidx.paging;

import ml0.a;
import sg2.e;
import c5.b0;
import kotlin.Metadata;
import hg2.j;
import c5.h;
import rg2.p;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\n\u0010\u0002\u001a\u00060\u0000R\u00020\u00012\n\u0010\u0003\u001a\u00060\u0000R\u00020\u0001H\n" }, d2 = { "Lc5/h$a;", "Lc5/h;", "prependHint", "appendHint", "Lhg2/j;", "<anonymous>" }, k = 3, mv = { 1, 5, 1 })
final class HintHandler$processHint$1 extends Lambda implements p<h.a, h.a, j>
{
    public final /* synthetic */ b0 $viewportHint;
    
    public HintHandler$processHint$1(final b0 $viewportHint) {
        this.$viewportHint = $viewportHint;
        super(2);
    }
    
    public final void invoke(final h.a a, final h.a a2) {
        e.f((Object)a, "prependHint");
        e.f((Object)a2, "appendHint");
        if (a.z0(this.$viewportHint, a.a, LoadType.PREPEND)) {
            final b0 $viewportHint = this.$viewportHint;
            if ((a.a = $viewportHint) != null) {
                a.b.d((Object)$viewportHint);
            }
        }
        if (a.z0(this.$viewportHint, a2.a, LoadType.APPEND)) {
            final b0 $viewportHint2 = this.$viewportHint;
            if ((a2.a = $viewportHint2) != null) {
                a2.b.d((Object)$viewportHint2);
            }
        }
    }
}
