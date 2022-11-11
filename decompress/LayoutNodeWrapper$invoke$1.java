// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.node;

import zg2.l;
import o1.p;
import kotlin.Metadata;
import pg2.j;
import zg2.a;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002" }, d2 = { "Lpg2/j;", "invoke", "()V", "<anonymous>" }, k = 3, mv = { 1, 6, 0 })
final class LayoutNodeWrapper$invoke$1 extends Lambda implements a<j>
{
    public final /* synthetic */ p $canvas;
    public final /* synthetic */ LayoutNodeWrapper this$0;
    
    public LayoutNodeWrapper$invoke$1(final LayoutNodeWrapper this$0, final p $canvas) {
        this.this$0 = this$0;
        this.$canvas = $canvas;
        super(0);
    }
    
    public final void invoke() {
        final LayoutNodeWrapper this$0 = this.this$0;
        final p $canvas = this.$canvas;
        final l b = LayoutNodeWrapper.B;
        final DrawEntity drawEntity = (DrawEntity)this$0.x[0];
        if (drawEntity == null) {
            this$0.j1($canvas);
        }
        else {
            drawEntity.c($canvas);
        }
    }
}
