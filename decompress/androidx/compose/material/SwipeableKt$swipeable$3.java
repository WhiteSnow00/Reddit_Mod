// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.material;

import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.foundation.gestures.DraggableKt;
import z0.s;
import lg2.c;
import z0.o0;
import androidx.compose.ui.platform.CompositionLocalsKt;
import u2.b;
import kotlin.collections.CollectionsKt___CollectionsKt;
import sg2.e;
import rg2.p;
import x0.m;
import androidx.compose.foundation.gestures.Orientation;
import o0.j;
import java.util.Map;
import kotlin.Metadata;
import j1.d;
import rg2.q;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003" }, d2 = { "T", "Lj1/d;", "invoke", "(Lj1/d;Lz0/d;I)Lj1/d;", "<anonymous>" }, k = 3, mv = { 1, 6, 0 })
final class SwipeableKt$swipeable$3 extends Lambda implements q<j1.d, z0.d, Integer, j1.d>
{
    public final /* synthetic */ Map<Float, Object> $anchors;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ j $interactionSource;
    public final /* synthetic */ Orientation $orientation;
    public final /* synthetic */ m $resistance;
    public final /* synthetic */ boolean $reverseDirection;
    public final /* synthetic */ SwipeableState<Object> $state;
    public final /* synthetic */ p<Object, Object, x0.q> $thresholds;
    public final /* synthetic */ float $velocityThreshold;
    
    public SwipeableKt$swipeable$3(final Map<Float, Object> $anchors, final SwipeableState<Object> $state, final Orientation $orientation, final boolean $enabled, final j $interactionSource, final boolean $reverseDirection, final m $resistance, final p<Object, Object, ? extends x0.q> $thresholds, final float $velocityThreshold) {
        this.$anchors = $anchors;
        this.$state = $state;
        this.$orientation = $orientation;
        this.$enabled = $enabled;
        this.$interactionSource = $interactionSource;
        this.$reverseDirection = $reverseDirection;
        this.$resistance = $resistance;
        this.$thresholds = (p<Object, Object, x0.q>)$thresholds;
        this.$velocityThreshold = $velocityThreshold;
        super(3);
    }
    
    public final j1.d invoke(j1.d d, final z0.d d2, int n) {
        e.f((Object)d, "$this$composed");
        d2.A(43594985);
        final boolean empty = this.$anchors.isEmpty();
        n = 1;
        if (!(empty ^ true)) {
            throw new IllegalArgumentException("You must have at least one anchor.".toString());
        }
        if (CollectionsKt___CollectionsKt.t3((Iterable)this.$anchors.values()).size() != this.$anchors.size()) {
            n = 0;
        }
        if (n != 0) {
            final b b = (b)d2.u((o0)CompositionLocalsKt.e);
            final SwipeableState<Object> $state = this.$state;
            final Map<Float, Object> $anchors = this.$anchors;
            $state.getClass();
            e.f((Object)$anchors, "newAnchors");
            if ($state.c().isEmpty()) {
                final Float b2 = androidx.compose.material.b.b($anchors, $state.d());
                if (b2 == null) {
                    throw new IllegalArgumentException("The initial value must have an associated anchor.".toString());
                }
                ((SnapshotMutableStateImpl)$state.e).setValue((Object)b2);
                ((SnapshotMutableStateImpl)$state.g).setValue((Object)b2);
            }
            final Map<Float, Object> $anchors2 = this.$anchors;
            final SwipeableState<Object> $state2 = this.$state;
            s.e((Object)$anchors2, (Object)$state2, (p)new SwipeableKt$swipeable$3$3((SwipeableState)$state2, (Map)$anchors2, this.$resistance, b, (p)this.$thresholds, this.$velocityThreshold, (c)null), d2);
            final boolean booleanValue = (boolean)((SnapshotMutableStateImpl)this.$state.d).getValue();
            final SwipeableState<Object> $state3 = this.$state;
            d = DraggableKt.d((n0.c)$state3.p, this.$orientation, this.$enabled, this.$interactionSource, booleanValue, (q)new SwipeableKt$swipeable$3$4((SwipeableState)$state3, (c)null), this.$reverseDirection);
            d2.I();
            return d;
        }
        throw new IllegalArgumentException("You cannot have two anchors mapped to the same state.".toString());
    }
}
