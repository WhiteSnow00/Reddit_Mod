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
@ug2.c(c = "androidx.compose.material.ripple.StateLayer$handleInteraction$1", f = "Ripple.kt", l = { 290 }, m = "invokeSuspend")
final class StateLayer$handleInteraction$1 extends SuspendLambda implements p<b0, c<? super j>, Object>
{
    public final /* synthetic */ d<Float> $incomingAnimationSpec;
    public final /* synthetic */ float $targetAlpha;
    public int label;
    public final /* synthetic */ k this$0;
    
    public StateLayer$handleInteraction$1(final k this$0, final float $targetAlpha, final d<Float> $incomingAnimationSpec, final c<? super StateLayer$handleInteraction$1> c) {
        this.this$0 = this$0;
        this.$targetAlpha = $targetAlpha;
        this.$incomingAnimationSpec = $incomingAnimationSpec;
        super(2, (c)c);
    }
    
    public final c<j> create(final Object o, final c<?> c) {
        return (c<j>)new StateLayer$handleInteraction$1(this.this$0, this.$targetAlpha, this.$incomingAnimationSpec, (c<? super StateLayer$handleInteraction$1>)c);
    }
    
    public final Object invoke(final b0 b0, final c<? super j> c) {
        return ((StateLayer$handleInteraction$1)this.create(b0, c)).invokeSuspend(j.a);
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
            final Float n = new Float(this.$targetAlpha);
            final d<Float> $incomingAnimationSpec = this.$incomingAnimationSpec;
            this.label = 1;
            if (Animatable.c(c, (Object)n, (d)$incomingAnimationSpec, (Float)null, (l)null, (c)this, 12) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        return j.a;
    }
}
