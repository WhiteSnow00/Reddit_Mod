// 
// Decompiled by Procyon v0.6.0
// 

package androidx.paging;

import kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1;
import qg2.s;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.Metadata;
import pg2.j;
import tg2.c;
import pj2.f;
import zg2.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(bv = {}, d1 = { "\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002H\u008a@" }, d2 = { "", "T", "Lpj2/f;", "Landroidx/paging/PageEvent;", "Lpg2/j;", "<anonymous>" }, k = 3, mv = { 1, 5, 1 })
@ug2.c(c = "androidx.paging.CachedPageEventFlow$downstreamFlow$1", f = "CachedPageEventFlow.kt", l = { 257 }, m = "invokeSuspend")
final class CachedPageEventFlow$downstreamFlow$1 extends SuspendLambda implements p<f<? super PageEvent<Object>>, c<? super j>, Object>
{
    private /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ a<Object> this$0;
    
    public CachedPageEventFlow$downstreamFlow$1(final a<Object> this$0, final c<? super CachedPageEventFlow$downstreamFlow$1> c) {
        this.this$0 = this$0;
        super(2, (c)c);
    }
    
    public final c<j> create(final Object l$0, final c<?> c) {
        final CachedPageEventFlow$downstreamFlow$1 cachedPageEventFlow$downstreamFlow$1 = new CachedPageEventFlow$downstreamFlow$1(this.this$0, (c<? super CachedPageEventFlow$downstreamFlow$1>)c);
        cachedPageEventFlow$downstreamFlow$1.L$0 = l$0;
        return (c<j>)cachedPageEventFlow$downstreamFlow$1;
    }
    
    public final Object invoke(final f<? super PageEvent<Object>> f, final c<? super j> c) {
        return ((CachedPageEventFlow$downstreamFlow$1)this.create(f, c)).invokeSuspend(j.a);
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
            final f f = (f)this.L$0;
            final Ref$IntRef ref$IntRef = new Ref$IntRef();
            ref$IntRef.element = Integer.MIN_VALUE;
            final FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1 flowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1 = new FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1((p)new p<s<? extends PageEvent<Object>>, c<? super Boolean>, Object>(null) {
                public /* synthetic */ Object L$0;
                public int label;
                
                public final c<j> create(final Object l$0, final c<?> c) {
                    final p<s<? extends PageEvent<Object>>, c<? super Boolean>, Object> p2 = (p<s<? extends PageEvent<Object>>, c<? super Boolean>, Object>)new p<s<? extends PageEvent<Object>>, c<? super Boolean>, Object>(c) {
                        public /* synthetic */ Object L$0;
                        public int label;
                    };
                    p2.L$0 = l$0;
                    return (c<j>)p2;
                }
                
                public final Object invoke(final s<? extends PageEvent<Object>> s, final c<? super Boolean> c) {
                    return ((CachedPageEventFlow$downstreamFlow$1$1)this.create(s, c)).invokeSuspend(j.a);
                }
                
                public final Object invokeSuspend(final Object o) {
                    final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
                    if (this.label == 0) {
                        aj2.c.Q0(o);
                        return this.L$0 != null;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }, this.this$0.c);
            final CachedPageEventFlow$downstreamFlow$1$invokeSuspend$$inlined$collect.CachedPageEventFlow$downstreamFlow$1$invokeSuspend$$inlined$collect$1 cachedPageEventFlow$downstreamFlow$1$invokeSuspend$$inlined$collect$1 = new CachedPageEventFlow$downstreamFlow$1$invokeSuspend$$inlined$collect.CachedPageEventFlow$downstreamFlow$1$invokeSuspend$$inlined$collect$1(ref$IntRef, f);
            this.label = 1;
            if (flowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1.a((f)cachedPageEventFlow$downstreamFlow$1$invokeSuspend$$inlined$collect$1, (c)this) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        return j.a;
    }
}
