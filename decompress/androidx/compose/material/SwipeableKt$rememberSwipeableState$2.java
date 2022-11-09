// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.material;

import zg2.l;
import l0.d;
import kotlin.Metadata;
import zg2.a;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = { 1, 6, 0 }, xi = 48)
final class SwipeableKt$rememberSwipeableState$2 extends Lambda implements a<SwipeableState<Object>>
{
    public final /* synthetic */ d<Float> $animationSpec;
    public final /* synthetic */ l<Object, Boolean> $confirmStateChange;
    public final /* synthetic */ Object $initialValue;
    
    public SwipeableKt$rememberSwipeableState$2(final Object $initialValue, final d<Float> $animationSpec, final l<Object, Boolean> $confirmStateChange) {
        this.$initialValue = $initialValue;
        this.$animationSpec = $animationSpec;
        this.$confirmStateChange = $confirmStateChange;
        super(0);
    }
    
    public final SwipeableState<Object> invoke() {
        return (SwipeableState<Object>)new SwipeableState(this.$initialValue, (d)this.$animationSpec, (l)this.$confirmStateChange);
    }
}
