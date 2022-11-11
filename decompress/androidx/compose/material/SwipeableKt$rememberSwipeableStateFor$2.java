// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.material;

import sg2.e;
import hg2.j;
import z0.h0;
import kotlin.Metadata;
import z0.p;
import z0.q;
import rg2.l;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = { 1, 6, 0 }, xi = 48)
final class SwipeableKt$rememberSwipeableStateFor$2 extends Lambda implements l<q, p>
{
    public final /* synthetic */ h0<Boolean> $forceAnimationCheck;
    public final /* synthetic */ l<Object, j> $onValueChange;
    public final /* synthetic */ SwipeableState<Object> $swipeableState;
    public final /* synthetic */ Object $value;
    
    public SwipeableKt$rememberSwipeableStateFor$2(final Object $value, final SwipeableState<Object> $swipeableState, final l<Object, j> $onValueChange, final h0<Boolean> $forceAnimationCheck) {
        this.$value = $value;
        this.$swipeableState = $swipeableState;
        this.$onValueChange = $onValueChange;
        this.$forceAnimationCheck = $forceAnimationCheck;
        super(1);
    }
    
    public final p invoke(final q q) {
        e.f((Object)q, "$this$DisposableEffect");
        if (!e.a(this.$value, this.$swipeableState.d())) {
            this.$onValueChange.invoke(this.$swipeableState.d());
            final h0<Boolean> $forceAnimationCheck = this.$forceAnimationCheck;
            $forceAnimationCheck.setValue((Object)((boolean)$forceAnimationCheck.getValue() ^ true));
        }
        return (p)new SwipeableKt$rememberSwipeableStateFor$2$a();
    }
}
