// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.lazy.grid;

import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.animation.core.Animatable;
import u2.g;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import r0.y;
import kotlin.Metadata;
import pg2.j;
import tg2.c;
import mj2.b0;
import zg2.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@" }, d2 = { "Lmj2/b0;", "Lpg2/j;", "<anonymous>" }, k = 3, mv = { 1, 6, 0 })
@ug2.c(c = "androidx.compose.foundation.lazy.grid.LazyGridItemPlacementAnimator$getAnimatedOffset$1", f = "LazyGridItemPlacementAnimator.kt", l = { 324 }, m = "invokeSuspend")
final class LazyGridItemPlacementAnimator$getAnimatedOffset$1 extends SuspendLambda implements p<b0, c<? super j>, Object>
{
    public final /* synthetic */ y $item;
    public int label;
    
    public LazyGridItemPlacementAnimator$getAnimatedOffset$1(final y $item, final c<? super LazyGridItemPlacementAnimator$getAnimatedOffset$1> c) {
        this.$item = $item;
        super(2, (c)c);
    }
    
    public final c<j> create(final Object o, final c<?> c) {
        return (c<j>)new LazyGridItemPlacementAnimator$getAnimatedOffset$1(this.$item, (c<? super LazyGridItemPlacementAnimator$getAnimatedOffset$1>)c);
    }
    
    public final Object invoke(final b0 b0, final c<? super j> c) {
        return ((LazyGridItemPlacementAnimator$getAnimatedOffset$1)this.create(b0, c)).invokeSuspend(j.a);
    }
    
    public final Object invokeSuspend(final Object o) {
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label = this.label;
        if (label != 0) {
            if (label != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aj2.c.Q0(o);
        }
        else {
            aj2.c.Q0(o);
            final y $item = this.$item;
            final Animatable b = $item.b;
            final g g = new g($item.c);
            this.label = 1;
            if (b.e((Object)g, (c)this) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        ((SnapshotMutableStateImpl<Boolean>)this.$item.d).setValue(Boolean.FALSE);
        return j.a;
    }
}
