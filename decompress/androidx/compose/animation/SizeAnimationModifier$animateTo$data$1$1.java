// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.animation;

import androidx.compose.animation.core.AnimationEndReason;
import rg2.l;
import l0.d;
import androidx.compose.animation.core.Animatable;
import u2.i;
import yd.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.Metadata;
import hg2.j;
import lg2.c;
import ej2.b0;
import rg2.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@" }, d2 = { "Lej2/b0;", "Lhg2/j;", "<anonymous>" }, k = 3, mv = { 1, 6, 0 })
@mg2.c(c = "androidx.compose.animation.SizeAnimationModifier$animateTo$data$1$1", f = "AnimationModifier.kt", l = { 121 }, m = "invokeSuspend")
final class SizeAnimationModifier$animateTo$data$1$1 extends SuspendLambda implements p<b0, c<? super j>, Object>
{
    public final /* synthetic */ long $targetSize;
    public final /* synthetic */ SizeAnimationModifier$a $this_apply;
    public int label;
    public final /* synthetic */ SizeAnimationModifier this$0;
    
    public SizeAnimationModifier$animateTo$data$1$1(final SizeAnimationModifier$a $this_apply, final long $targetSize, final SizeAnimationModifier this$0, final c<? super SizeAnimationModifier$animateTo$data$1$1> c) {
        this.$this_apply = $this_apply;
        this.$targetSize = $targetSize;
        this.this$0 = this$0;
        super(2, (c<Object>)c);
    }
    
    public final c<j> create(final Object o, final c<?> c) {
        return (c<j>)new SizeAnimationModifier$animateTo$data$1$1(this.$this_apply, this.$targetSize, this.this$0, (c<? super SizeAnimationModifier$animateTo$data$1$1>)c);
    }
    
    @Override
    public final Object invoke(final b0 b0, final c<? super j> c) {
        return ((SizeAnimationModifier$animateTo$data$1$1)this.create(b0, c)).invokeSuspend(j.a);
    }
    
    public final Object invokeSuspend(Object c) {
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label = this.label;
        if (label != 0) {
            if (label != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.k0(c);
        }
        else {
            b.k0(c);
            final Animatable a = this.$this_apply.a;
            final i i = new i(this.$targetSize);
            final l0.d<i> f = this.this$0.f;
            this.label = 1;
            if ((c = Animatable.c(a, (Object)i, (l0.d)f, (Float)null, (l)null, (c)this, 12)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        final l0.b b = (l0.b)c;
        if (b.b == AnimationEndReason.Finished) {
            final p<? super i, ? super i, j> h = this.this$0.h;
            if (h != null) {
                h.invoke(new i(this.$this_apply.b), b.a.getValue());
            }
        }
        return j.a;
    }
}
