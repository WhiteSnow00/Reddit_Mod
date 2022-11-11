// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.lazy;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.Metadata;
import tg2.c;
import n0.j;
import zg2.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@" }, d2 = { "Ln0/j;", "Lpg2/j;", "<anonymous>" }, k = 3, mv = { 1, 6, 0 })
@ug2.c(c = "androidx.compose.foundation.lazy.LazyListState$scrollToItem$2", f = "LazyListState.kt", l = {}, m = "invokeSuspend")
final class LazyListState$scrollToItem$2 extends SuspendLambda implements p<j, c<? super pg2.j>, Object>
{
    public final /* synthetic */ int $index;
    public final /* synthetic */ int $scrollOffset;
    public int label;
    public final /* synthetic */ LazyListState this$0;
    
    public LazyListState$scrollToItem$2(final LazyListState this$0, final int $index, final int $scrollOffset, final c<? super LazyListState$scrollToItem$2> c) {
        this.this$0 = this$0;
        this.$index = $index;
        this.$scrollOffset = $scrollOffset;
        super(2, (c)c);
    }
    
    public final c<pg2.j> create(final Object o, final c<?> c) {
        return (c<pg2.j>)new LazyListState$scrollToItem$2(this.this$0, this.$index, this.$scrollOffset, (c<? super LazyListState$scrollToItem$2>)c);
    }
    
    public final Object invoke(final j j, final c<? super pg2.j> c) {
        return ((LazyListState$scrollToItem$2)this.create(j, c)).invokeSuspend(pg2.j.a);
    }
    
    public final Object invokeSuspend(final Object o) {
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            aj2.c.Q0(o);
            this.this$0.j(this.$index, this.$scrollOffset);
            return pg2.j.a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
