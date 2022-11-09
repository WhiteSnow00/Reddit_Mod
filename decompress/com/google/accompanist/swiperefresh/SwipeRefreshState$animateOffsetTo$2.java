// 
// Decompiled by Procyon v0.6.0
// 

package com.google.accompanist.swiperefresh;

import l0.d;
import androidx.compose.animation.core.Animatable;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import pg2.j;
import kotlin.Metadata;
import l0.f;
import l0.b;
import tg2.c;
import zg2.l;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(bv = {}, d1 = { "\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u008a@" }, d2 = { "Ll0/b;", "", "Ll0/f;", "<anonymous>" }, k = 3, mv = { 1, 7, 1 })
@ug2.c(c = "com.google.accompanist.swiperefresh.SwipeRefreshState$animateOffsetTo$2", f = "SwipeRefresh.kt", l = { 104 }, m = "invokeSuspend")
final class SwipeRefreshState$animateOffsetTo$2 extends SuspendLambda implements l<c<? super b<Float, f>>, Object>
{
    public final /* synthetic */ float $offset;
    public int label;
    public final /* synthetic */ fa.c this$0;
    
    public SwipeRefreshState$animateOffsetTo$2(final fa.c this$0, final float $offset, final c<? super SwipeRefreshState$animateOffsetTo$2> c) {
        this.this$0 = this$0;
        this.$offset = $offset;
        super(1, (c)c);
    }
    
    public final c<j> create(final c<?> c) {
        return (c<j>)new SwipeRefreshState$animateOffsetTo$2(this.this$0, this.$offset, (c<? super SwipeRefreshState$animateOffsetTo$2>)c);
    }
    
    public final Object invoke(final c<? super b<Float, f>> c) {
        return ((SwipeRefreshState$animateOffsetTo$2)this.create(c)).invokeSuspend(j.a);
    }
    
    public final Object invokeSuspend(Object c) {
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label = this.label;
        if (label != 0) {
            if (label != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aj2.c.Q0(c);
        }
        else {
            aj2.c.Q0(c);
            final Animatable a = this.this$0.a;
            final Float n = new Float(this.$offset);
            this.label = 1;
            if ((c = Animatable.c(a, (Object)n, (d)null, (Float)null, (l)null, (c)this, 14)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        return c;
    }
}
