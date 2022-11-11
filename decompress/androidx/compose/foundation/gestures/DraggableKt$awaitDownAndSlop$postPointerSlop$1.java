// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.gestures;

import yg.a;
import sg2.e;
import a2.g;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.Metadata;
import hg2.j;
import z1.o;
import rg2.p;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006" }, d2 = { "Lz1/o;", "event", "", "offset", "Lhg2/j;", "invoke", "(Lz1/o;F)V", "<anonymous>" }, k = 3, mv = { 1, 6, 0 })
final class DraggableKt$awaitDownAndSlop$postPointerSlop$1 extends Lambda implements p<o, Float, j>
{
    public final /* synthetic */ Ref$FloatRef $initialDelta;
    public final /* synthetic */ g $velocityTracker;
    
    public DraggableKt$awaitDownAndSlop$postPointerSlop$1(final g $velocityTracker, final Ref$FloatRef $initialDelta) {
        this.$velocityTracker = $velocityTracker;
        this.$initialDelta = $initialDelta;
        super(2);
    }
    
    public final void invoke(final o o, final float element) {
        e.f((Object)o, "event");
        a.T(this.$velocityTracker, o);
        o.a();
        this.$initialDelta.element = element;
    }
}
