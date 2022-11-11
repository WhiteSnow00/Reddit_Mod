// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.lazy.grid;

import androidx.compose.runtime.SnapshotMutableStateImpl;
import r0.r;
import c2.f0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.Metadata;
import tg2.c;
import n0.j;
import zg2.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@" }, d2 = { "Ln0/j;", "Lpg2/j;", "<anonymous>" }, k = 3, mv = { 1, 6, 0 })
@ug2.c(c = "androidx.compose.foundation.lazy.grid.LazyGridState$scrollToItem$2", f = "LazyGridState.kt", l = {}, m = "invokeSuspend")
final class LazyGridState$scrollToItem$2 extends SuspendLambda implements p<j, c<? super pg2.j>, Object>
{
    public final /* synthetic */ int $index;
    public final /* synthetic */ int $scrollOffset;
    public int label;
    public final /* synthetic */ LazyGridState this$0;
    
    public LazyGridState$scrollToItem$2(final LazyGridState this$0, final int $index, final int $scrollOffset, final c<? super LazyGridState$scrollToItem$2> c) {
        this.this$0 = this$0;
        this.$index = $index;
        this.$scrollOffset = $scrollOffset;
        super(2, (c)c);
    }
    
    public final c<pg2.j> create(final Object o, final c<?> c) {
        return (c<pg2.j>)new LazyGridState$scrollToItem$2(this.this$0, this.$index, this.$scrollOffset, (c<? super LazyGridState$scrollToItem$2>)c);
    }
    
    public final Object invoke(final j j, final c<? super pg2.j> c) {
        return ((LazyGridState$scrollToItem$2)this.create(j, c)).invokeSuspend(pg2.j.a);
    }
    
    public final Object invokeSuspend(final Object o) {
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            aj2.c.Q0(o);
            final LazyGridState this$0 = this.this$0;
            final int $index = this.$index;
            final int $scrollOffset = this.$scrollOffset;
            final r a = this$0.a;
            a.a($index, $scrollOffset);
            a.d = null;
            final LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator = ((SnapshotMutableStateImpl<LazyGridItemPlacementAnimator>)this$0.q).getValue();
            if (lazyGridItemPlacementAnimator != null) {
                lazyGridItemPlacementAnimator.d.clear();
                lazyGridItemPlacementAnimator.e = kotlin.collections.c.N1();
                lazyGridItemPlacementAnimator.f = -1;
                lazyGridItemPlacementAnimator.g = 0;
                lazyGridItemPlacementAnimator.h = -1;
                lazyGridItemPlacementAnimator.i = 0;
            }
            final f0 f0 = ((SnapshotMutableStateImpl<f0>)this$0.m).getValue();
            if (f0 != null) {
                f0.b();
            }
            return pg2.j.a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
