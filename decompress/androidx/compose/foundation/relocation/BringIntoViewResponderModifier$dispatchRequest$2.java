// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.relocation;

import kotlinx.coroutines.CoroutineStart;
import kotlin.coroutines.CoroutineContext;
import mj2.g;
import ah2.f;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import n1.d;
import c2.l;
import kotlin.Metadata;
import pg2.j;
import tg2.c;
import mj2.b0;
import zg2.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@" }, d2 = { "Lmj2/b0;", "Lpg2/j;", "<anonymous>" }, k = 3, mv = { 1, 6, 0 })
@ug2.c(c = "androidx.compose.foundation.relocation.BringIntoViewResponderModifier$dispatchRequest$2", f = "BringIntoViewResponder.kt", l = { 272 }, m = "invokeSuspend")
final class BringIntoViewResponderModifier$dispatchRequest$2 extends SuspendLambda implements p<b0, c<? super j>, Object>
{
    public final /* synthetic */ l $layoutCoordinates;
    public final /* synthetic */ d $localRect;
    public final /* synthetic */ d $parentRect;
    private /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ BringIntoViewResponderModifier this$0;
    
    public BringIntoViewResponderModifier$dispatchRequest$2(final BringIntoViewResponderModifier this$0, final d $parentRect, final l $layoutCoordinates, final d $localRect, final c<? super BringIntoViewResponderModifier$dispatchRequest$2> c) {
        this.this$0 = this$0;
        this.$parentRect = $parentRect;
        this.$layoutCoordinates = $layoutCoordinates;
        this.$localRect = $localRect;
        super(2, (c)c);
    }
    
    public final c<j> create(final Object l$0, final c<?> c) {
        final BringIntoViewResponderModifier$dispatchRequest$2 bringIntoViewResponderModifier$dispatchRequest$2 = new BringIntoViewResponderModifier$dispatchRequest$2(this.this$0, this.$parentRect, this.$layoutCoordinates, this.$localRect, (c<? super BringIntoViewResponderModifier$dispatchRequest$2>)c);
        bringIntoViewResponderModifier$dispatchRequest$2.L$0 = l$0;
        return (c<j>)bringIntoViewResponderModifier$dispatchRequest$2;
    }
    
    public final Object invoke(final b0 b0, final c<? super j> c) {
        return ((BringIntoViewResponderModifier$dispatchRequest$2)this.create(b0, c)).invokeSuspend(j.a);
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
            g.i((b0)this.L$0, (CoroutineContext)null, (CoroutineStart)null, (p)new p<b0, c<? super j>, Object>() {
                public final /* synthetic */ d $localRect;
                public int label;
                public final /* synthetic */ BringIntoViewResponderModifier this$0;
                
                public final c<j> create(final Object o, final c<?> c) {
                    return (c<j>)new p<b0, c<? super j>, Object>() {
                        public final /* synthetic */ d $localRect = this.$localRect;
                        public int label;
                        public final /* synthetic */ BringIntoViewResponderModifier this$0 = this.this$0;
                    };
                }
                
                public final Object invoke(final b0 b0, final c<? super j> c) {
                    return ((BringIntoViewResponderModifier$dispatchRequest$2$1)this.create(b0, c)).invokeSuspend(j.a);
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
                        final t0.f i = this.this$0.i;
                        if (i == null) {
                            f.n("responder");
                            throw null;
                        }
                        final d $localRect = this.$localRect;
                        this.label = 1;
                        if (i.a($localRect, (c<? super j>)this) == coroutine_SUSPENDED) {
                            return coroutine_SUSPENDED;
                        }
                    }
                    return j.a;
                }
            }, 3);
            final BringIntoViewResponderModifier this$0 = this.this$0;
            t0.c c;
            if ((c = this$0.g) == null) {
                c = this$0.f;
            }
            final d $parentRect = this.$parentRect;
            final l $layoutCoordinates = this.$layoutCoordinates;
            this.label = 1;
            if (c.a($parentRect, $layoutCoordinates, (c<? super j>)this) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        return j.a;
    }
}
