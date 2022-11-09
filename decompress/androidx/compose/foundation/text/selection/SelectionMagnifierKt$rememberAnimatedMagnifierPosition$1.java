// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.text.selection;

import kotlinx.coroutines.flow.AbstractFlow;
import pj2.s;
import pj2.f;
import androidx.compose.runtime.e;
import kotlin.jvm.internal.Lambda;
import zg2.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import z0.e1;
import l0.g;
import androidx.compose.animation.core.Animatable;
import kotlin.Metadata;
import pg2.j;
import tg2.c;
import mj2.b0;
import zg2.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(k = 3, mv = { 1, 6, 0 }, xi = 48)
@ug2.c(c = "androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1", f = "SelectionMagnifier.kt", l = { 88 }, m = "invokeSuspend")
final class SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1 extends SuspendLambda implements p<b0, c<? super j>, Object>
{
    public final /* synthetic */ Animatable<n1.c, g> $animatable;
    public final /* synthetic */ e1<n1.c> $targetValue$delegate;
    private /* synthetic */ Object L$0;
    public int label;
    
    public SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1(final e1<n1.c> $targetValue$delegate, final Animatable<n1.c, g> $animatable, final c<? super SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1> c) {
        this.$targetValue$delegate = $targetValue$delegate;
        this.$animatable = $animatable;
        super(2, (c)c);
    }
    
    public final c<j> create(final Object l$0, final c<?> c) {
        final SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1 selectionMagnifierKt$rememberAnimatedMagnifierPosition$1 = new SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1(this.$targetValue$delegate, this.$animatable, (c<? super SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1>)c);
        selectionMagnifierKt$rememberAnimatedMagnifierPosition$1.L$0 = l$0;
        return (c<j>)selectionMagnifierKt$rememberAnimatedMagnifierPosition$1;
    }
    
    public final Object invoke(final b0 b0, final c<? super j> c) {
        return ((SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1)this.create(b0, c)).invokeSuspend(j.a);
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
            final b0 b0 = (b0)this.L$0;
            final s b2 = e.b((a)new a<n1.c>() {
                public final /* synthetic */ e1<n1.c> $targetValue$delegate = SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1.this.$targetValue$delegate;
                
                public final long invoke-F1C5BW0() {
                    final e1<n1.c> $targetValue$delegate = this.$targetValue$delegate;
                    final g a = SelectionMagnifierKt.a;
                    return $targetValue$delegate.getValue().a;
                }
            });
            final SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$a selectionMagnifierKt$rememberAnimatedMagnifierPosition$1$a = new SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$a((Animatable)this.$animatable, b0);
            this.label = 1;
            if (((AbstractFlow)b2).a((f)selectionMagnifierKt$rememberAnimatedMagnifierPosition$1$a, (c)this) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        return j.a;
    }
}
