// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.gestures;

import n0.a$b;
import n1.c;
import sg2.e;
import a2.g;
import n0.a;
import gj2.t;
import kotlin.Metadata;
import hg2.j;
import z1.o;
import rg2.l;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004" }, d2 = { "Lz1/o;", "event", "Lhg2/j;", "invoke", "(Lz1/o;)V", "<anonymous>" }, k = 3, mv = { 1, 6, 0 })
final class DraggableKt$awaitDrag$dragTick$1 extends Lambda implements l<o, j>
{
    public final /* synthetic */ t<a> $channel;
    public final /* synthetic */ Orientation $orientation;
    public final /* synthetic */ boolean $reverseDirection;
    public final /* synthetic */ g $velocityTracker;
    
    public DraggableKt$awaitDrag$dragTick$1(final g $velocityTracker, final Orientation $orientation, final t<? super a> $channel, final boolean $reverseDirection) {
        this.$velocityTracker = $velocityTracker;
        this.$orientation = $orientation;
        this.$channel = (t<a>)$channel;
        this.$reverseDirection = $reverseDirection;
        super(1);
    }
    
    public final void invoke(final o o) {
        e.f((Object)o, "event");
        yg.a.T(this.$velocityTracker, o);
        final long p = wd.a.p0(o);
        float n;
        if (this.$orientation == Orientation.Vertical) {
            n = c.d(p);
        }
        else {
            n = c.c(p);
        }
        o.a();
        final t<a> $channel = this.$channel;
        float n2 = n;
        if (this.$reverseDirection) {
            n2 = n * -1;
        }
        $channel.e((a)new a$b(n2, o.c));
    }
}
