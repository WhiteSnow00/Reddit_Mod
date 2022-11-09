// 
// Decompiled by Procyon v0.6.0
// 

package androidx.lifecycle;

import uj2.b;
import kotlin.coroutines.CoroutineContext;
import mj2.g;
import mj2.j0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.Metadata;
import pg2.j;
import tg2.c;
import mj2.b0;
import zg2.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@" }, d2 = { "Lmj2/b0;", "Lpg2/j;", "<anonymous>" }, k = 3, mv = { 1, 6, 0 })
@ug2.c(c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenResumed$1", f = "Lifecycle.kt", l = { 114 }, m = "invokeSuspend")
final class LifecycleCoroutineScope$launchWhenResumed$1 extends SuspendLambda implements p<b0, c<? super j>, Object>
{
    public final /* synthetic */ p<b0, c<? super j>, Object> $block;
    public int label;
    public final /* synthetic */ m this$0;
    
    public LifecycleCoroutineScope$launchWhenResumed$1(final m this$0, final p<? super b0, ? super c<? super j>, ?> $block, final c<? super LifecycleCoroutineScope$launchWhenResumed$1> c) {
        this.this$0 = this$0;
        this.$block = (p<b0, c<? super j>, Object>)$block;
        super(2, (c)c);
    }
    
    public final c<j> create(final Object o, final c<?> c) {
        return (c<j>)new LifecycleCoroutineScope$launchWhenResumed$1(this.this$0, this.$block, (c<? super LifecycleCoroutineScope$launchWhenResumed$1>)c);
    }
    
    public final Object invoke(final b0 b0, final c<? super j> c) {
        return ((LifecycleCoroutineScope$launchWhenResumed$1)this.create(b0, c)).invokeSuspend(j.a);
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
            final Lifecycle d = this.this$0.d();
            final p<b0, c<? super j>, Object> $block = this.$block;
            this.label = 1;
            final Lifecycle.State resumed = Lifecycle.State.RESUMED;
            final b a = j0.a;
            if (g.l((CoroutineContext)rj2.m.a.c0(), (p)new PausingDispatcherKt$whenStateAtLeast$2(d, resumed, $block, null), (c)this) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        return j.a;
    }
}
