// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.material;

import androidx.compose.runtime.SnapshotMutableStateImpl;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.Metadata;
import pg2.j;
import tg2.c;
import n0.b;
import zg2.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(bv = {}, d1 = { "\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@" }, d2 = { "T", "Ln0/b;", "Lpg2/j;", "<anonymous>" }, k = 3, mv = { 1, 6, 0 })
@ug2.c(c = "androidx.compose.material.SwipeableState$snapInternalToOffset$2", f = "Swipeable.kt", l = {}, m = "invokeSuspend")
final class SwipeableState$snapInternalToOffset$2 extends SuspendLambda implements p<b, c<? super j>, Object>
{
    public final /* synthetic */ float $target;
    private /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ SwipeableState<Object> this$0;
    
    public SwipeableState$snapInternalToOffset$2(final float $target, final SwipeableState<Object> this$0, final c<? super SwipeableState$snapInternalToOffset$2> c) {
        this.$target = $target;
        this.this$0 = this$0;
        super(2, (c)c);
    }
    
    public final c<j> create(final Object l$0, final c<?> c) {
        final SwipeableState$snapInternalToOffset$2 swipeableState$snapInternalToOffset$2 = new SwipeableState$snapInternalToOffset$2(this.$target, this.this$0, (c<? super SwipeableState$snapInternalToOffset$2>)c);
        swipeableState$snapInternalToOffset$2.L$0 = l$0;
        return (c<j>)swipeableState$snapInternalToOffset$2;
    }
    
    public final Object invoke(final b b, final c<? super j> c) {
        return ((SwipeableState$snapInternalToOffset$2)this.create(b, c)).invokeSuspend(j.a);
    }
    
    public final Object invokeSuspend(final Object o) {
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            aj2.c.Q0(o);
            ((b)this.L$0).b(this.$target - ((SnapshotMutableStateImpl<Number>)this.this$0.g).getValue().floatValue());
            return j.a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
