// 
// Decompiled by Procyon v0.6.0
// 

package androidx.paging;

import pj2.f;
import pj2.n;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import pj2.e;
import kotlin.Metadata;
import pg2.j;
import tg2.c;
import mj2.b0;
import zg2.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(bv = {}, d1 = { "\u0000\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\u008a@" }, d2 = { "", "T", "Lmj2/b0;", "Lpg2/j;", "<anonymous>" }, k = 3, mv = { 1, 5, 1 })
@ug2.c(c = "androidx.paging.CachedPageEventFlow$job$1", f = "CachedPageEventFlow.kt", l = { 257 }, m = "invokeSuspend")
final class CachedPageEventFlow$job$1 extends SuspendLambda implements p<b0, c<? super j>, Object>
{
    public final /* synthetic */ e<PageEvent<Object>> $src;
    public int label;
    public final /* synthetic */ a<Object> this$0;
    
    public CachedPageEventFlow$job$1(final e<? extends PageEvent<Object>> $src, final a<Object> this$0, final c<? super CachedPageEventFlow$job$1> c) {
        this.$src = (e<PageEvent<Object>>)$src;
        this.this$0 = this$0;
        super(2, (c)c);
    }
    
    public final c<j> create(final Object o, final c<?> c) {
        return (c<j>)new CachedPageEventFlow$job$1(this.$src, this.this$0, (c<? super CachedPageEventFlow$job$1>)c);
    }
    
    public final Object invoke(final b0 b0, final c<? super j> c) {
        return ((CachedPageEventFlow$job$1)this.create(b0, c)).invokeSuspend(j.a);
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
            final n n = new n((e)this.$src);
            final CachedPageEventFlow$job$1$invokeSuspend$$inlined$collect.CachedPageEventFlow$job$1$invokeSuspend$$inlined$collect$1 cachedPageEventFlow$job$1$invokeSuspend$$inlined$collect$1 = new CachedPageEventFlow$job$1$invokeSuspend$$inlined$collect.CachedPageEventFlow$job$1$invokeSuspend$$inlined$collect$1((a)this.this$0);
            this.label = 1;
            if (n.a((f)cachedPageEventFlow$job$1$invokeSuspend$$inlined$collect$1, (c)this) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        return j.a;
    }
}
