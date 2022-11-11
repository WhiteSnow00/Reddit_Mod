// 
// Decompiled by Procyon v0.6.0
// 

package com.google.accompanist.swiperefresh;

import androidx.compose.animation.core.Animatable;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.Metadata;
import pg2.j;
import tg2.c;
import zg2.l;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(bv = {}, d1 = { "\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@" }, d2 = { "Lpg2/j;", "<anonymous>" }, k = 3, mv = { 1, 7, 1 })
@ug2.c(c = "com.google.accompanist.swiperefresh.SwipeRefreshState$dispatchScrollDelta$2", f = "SwipeRefresh.kt", l = { 113 }, m = "invokeSuspend")
final class SwipeRefreshState$dispatchScrollDelta$2 extends SuspendLambda implements l<c<? super j>, Object>
{
    public final /* synthetic */ float $delta;
    public int label;
    public final /* synthetic */ fa.c this$0;
    
    public SwipeRefreshState$dispatchScrollDelta$2(final fa.c this$0, final float $delta, final c<? super SwipeRefreshState$dispatchScrollDelta$2> c) {
        this.this$0 = this$0;
        this.$delta = $delta;
        super(1, (c)c);
    }
    
    public final c<j> create(final c<?> c) {
        return (c<j>)new SwipeRefreshState$dispatchScrollDelta$2(this.this$0, this.$delta, (c<? super SwipeRefreshState$dispatchScrollDelta$2>)c);
    }
    
    public final Object invoke(final c<? super j> c) {
        return ((SwipeRefreshState$dispatchScrollDelta$2)this.create(c)).invokeSuspend(j.a);
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
            final Animatable a = this.this$0.a;
            final Float n = new Float(((Number)a.d()).floatValue() + this.$delta);
            this.label = 1;
            if (a.e((Object)n, (c)this) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        return j.a;
    }
}
