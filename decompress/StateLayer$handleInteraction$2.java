// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.material.ripple;

import zg2.l;
import androidx.compose.animation.core.Animatable;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import y0.k;
import l0.d;
import kotlin.Metadata;
import pg2.j;
import tg2.c;
import mj2.b0;
import zg2.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@" }, d2 = { "Lmj2/b0;", "Lpg2/j;", "<anonymous>" }, k = 3, mv = { 1, 6, 0 })
@ug2.c(c = "androidx.compose.material.ripple.StateLayer$handleInteraction$2", f = "Ripple.kt", l = { 296 }, m = "invokeSuspend")
final class StateLayer$handleInteraction$2 extends SuspendLambda implements p<b0, c<? super j>, Object>
{
    public final /* synthetic */ d<Float> $outgoingAnimationSpec;
    public int label;
    public final /* synthetic */ k this$0;
    
    public StateLayer$handleInteraction$2(final k this$0, final d<Float> $outgoingAnimationSpec, final c<? super StateLayer$handleInteraction$2> c) {
        this.this$0 = this$0;
        this.$outgoingAnimationSpec = $outgoingAnimationSpec;
        super(2, (c)c);
    }
    
    public final c<j> create(final Object o, final c<?> c) {
        return (c<j>)new StateLayer$handleInteraction$2(this.this$0, this.$outgoingAnimationSpec, (c<? super StateLayer$handleInteraction$2>)c);
    }
    
    public final Object invoke(final b0 b0, final c<? super j> c) {
        return ((StateLayer$handleInteraction$2)this.create(b0, c)).invokeSuspend(j.a);
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
            final Animatable c = this.this$0.c;
            final Float n = new Float(0.0f);
            final d<Float> $outgoingAnimationSpec = this.$outgoingAnimationSpec;
            this.label = 1;
            if (Animatable.c(c, (Object)n, (d)$outgoingAnimationSpec, (Float)null, (l)null, (c)this, 12) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        return j.a;
    }
}
