// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.text.selection;

import l0.d0;
import zg2.l;
import l0.d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import l0.g;
import androidx.compose.animation.core.Animatable;
import kotlin.Metadata;
import pg2.j;
import tg2.c;
import mj2.b0;
import zg2.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(k = 3, mv = { 1, 6, 0 }, xi = 48)
@ug2.c(c = "androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$2$emit$2", f = "SelectionMagnifier.kt", l = { 102 }, m = "invokeSuspend")
final class SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$2$emit$2 extends SuspendLambda implements p<b0, c<? super j>, Object>
{
    public final /* synthetic */ Animatable<n1.c, g> $animatable;
    public final /* synthetic */ long $targetValue;
    public int label;
    
    public SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$2$emit$2(final Animatable<n1.c, g> $animatable, final long $targetValue, final c<? super SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$2$emit$2> c) {
        this.$animatable = $animatable;
        this.$targetValue = $targetValue;
        super(2, (c)c);
    }
    
    public final c<j> create(final Object o, final c<?> c) {
        return (c<j>)new SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$2$emit$2(this.$animatable, this.$targetValue, (c<? super SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$2$emit$2>)c);
    }
    
    public final Object invoke(final b0 b0, final c<? super j> c) {
        return ((SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$2$emit$2)this.create(b0, c)).invokeSuspend(j.a);
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
            final Animatable<n1.c, g> $animatable = this.$animatable;
            final n1.c c = new n1.c(this.$targetValue);
            final d0 d = SelectionMagnifierKt.d;
            this.label = 1;
            if (Animatable.c((Animatable)$animatable, (Object)c, (d)d, (Float)null, (l)null, (c)this, 12) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        return j.a;
    }
}
