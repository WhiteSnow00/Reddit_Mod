// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.material;

import rg2.l;
import l0.d;
import kotlin.Metadata;
import rg2.a;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = { 1, 6, 0 }, xi = 48)
final class SwipeableKt$rememberSwipeableState$2 extends Lambda implements a<SwipeableState<Object>>
{
    public final /* synthetic */ l0.d<Float> $animationSpec;
    public final /* synthetic */ l<Object, Boolean> $confirmStateChange;
    public final /* synthetic */ Object $initialValue;
    
    public SwipeableKt$rememberSwipeableState$2(final Object $initialValue, final l0.d<Float> $animationSpec, final l<Object, Boolean> $confirmStateChange) {
        this.$initialValue = $initialValue;
        this.$animationSpec = $animationSpec;
        this.$confirmStateChange = $confirmStateChange;
        super(0);
    }
    
    public final SwipeableState<Object> invoke() {
        return new SwipeableState<Object>(this.$initialValue, this.$animationSpec, this.$confirmStateChange);
    }
}
