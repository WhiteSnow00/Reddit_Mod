// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.material;

import ah2.f;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.Metadata;
import pg2.j;
import tg2.c;
import mj2.b0;
import zg2.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(k = 3, mv = { 1, 6, 0 }, xi = 48)
@ug2.c(c = "androidx.compose.material.SwipeableKt$rememberSwipeableStateFor$1", f = "Swipeable.kt", l = { 512 }, m = "invokeSuspend")
final class SwipeableKt$rememberSwipeableStateFor$1 extends SuspendLambda implements p<b0, c<? super j>, Object>
{
    public final /* synthetic */ SwipeableState<Object> $swipeableState;
    public final /* synthetic */ Object $value;
    public int label;
    
    public SwipeableKt$rememberSwipeableStateFor$1(final Object $value, final SwipeableState<Object> $swipeableState, final c<? super SwipeableKt$rememberSwipeableStateFor$1> c) {
        this.$value = $value;
        this.$swipeableState = $swipeableState;
        super(2, (c)c);
    }
    
    public final c<j> create(final Object o, final c<?> c) {
        return (c<j>)new SwipeableKt$rememberSwipeableStateFor$1(this.$value, this.$swipeableState, (c<? super SwipeableKt$rememberSwipeableStateFor$1>)c);
    }
    
    public final Object invoke(final b0 b0, final c<? super j> c) {
        return ((SwipeableKt$rememberSwipeableStateFor$1)this.create(b0, c)).invokeSuspend(j.a);
    }
    
    public final Object invokeSuspend(Object $value) {
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label = this.label;
        if (label != 0) {
            if (label != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aj2.c.Q0($value);
        }
        else {
            aj2.c.Q0($value);
            if (!f.a(this.$value, this.$swipeableState.d())) {
                final SwipeableState<Object> $swipeableState = this.$swipeableState;
                $value = this.$value;
                this.label = 1;
                if (SwipeableState.b((SwipeableState)$swipeableState, $value, (c)this) == coroutine_SUSPENDED) {
                    return coroutine_SUSPENDED;
                }
            }
        }
        return j.a;
    }
}
