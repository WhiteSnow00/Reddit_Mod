// 
// Decompiled by Procyon v0.6.0
// 

package androidx.constraintlayout.compose;

import androidx.constraintlayout.core.state.State;
import sg2.e;
import kotlin.Metadata;
import hg2.j;
import y2.g;
import rg2.l;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n" }, d2 = { "Ly2/g;", "state", "Lhg2/j;", "<anonymous>" }, k = 3, mv = { 1, 5, 1 })
final class ConstrainScope$linkTo$1 extends Lambda implements l<g, j>
{
    public final /* synthetic */ float $bias;
    public final /* synthetic */ ConstrainScope this$0;
    
    public ConstrainScope$linkTo$1(final ConstrainScope this$0, final float $bias) {
        this.this$0 = this$0;
        this.$bias = $bias;
        super(1);
    }
    
    public final void invoke(final g g) {
        e.f((Object)g, "state");
        ((State)g).a(this.this$0.a).d = this.$bias;
    }
}
