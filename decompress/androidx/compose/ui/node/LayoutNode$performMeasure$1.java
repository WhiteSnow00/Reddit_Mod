// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.node;

import c2.r;
import kotlin.Metadata;
import pg2.j;
import zg2.a;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002" }, d2 = { "Lpg2/j;", "invoke", "()V", "<anonymous>" }, k = 3, mv = { 1, 6, 0 })
final class LayoutNode$performMeasure$1 extends Lambda implements a<j>
{
    public final /* synthetic */ long $constraints;
    public final /* synthetic */ LayoutNode this$0;
    
    public LayoutNode$performMeasure$1(final LayoutNode this$0, final long $constraints) {
        this.this$0 = this$0;
        this.$constraints = $constraints;
        super(0);
    }
    
    public final void invoke() {
        ((r)this.this$0.I.k).I(this.$constraints);
    }
}
