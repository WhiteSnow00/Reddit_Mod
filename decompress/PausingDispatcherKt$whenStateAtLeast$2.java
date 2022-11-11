// 
// Decompiled by Procyon v0.6.0
// 

package androidx.lifecycle;

import kotlin.coroutines.CoroutineContext;
import mj2.g;
import kotlin.coroutines.CoroutineContext$b;
import mj2.z0$b;
import mj2.z0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import pg2.j;
import kotlin.Metadata;
import tg2.c;
import mj2.b0;
import zg2.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(bv = {}, d1 = { "\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@" }, d2 = { "T", "Lmj2/b0;", "<anonymous>" }, k = 3, mv = { 1, 6, 0 })
@ug2.c(c = "androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2", f = "PausingDispatcher.kt", l = { 162 }, m = "invokeSuspend")
final class PausingDispatcherKt$whenStateAtLeast$2 extends SuspendLambda implements p<b0, c<Object>, Object>
{
    public final /* synthetic */ p<b0, c<Object>, Object> $block;
    public final /* synthetic */ Lifecycle.State $minState;
    public final /* synthetic */ Lifecycle $this_whenStateAtLeast;
    private /* synthetic */ Object L$0;
    public int label;
    
    public PausingDispatcherKt$whenStateAtLeast$2(final Lifecycle $this_whenStateAtLeast, final Lifecycle.State $minState, final p<? super b0, ? super c<Object>, ?> $block, final c<? super PausingDispatcherKt$whenStateAtLeast$2> c) {
        this.$this_whenStateAtLeast = $this_whenStateAtLeast;
        this.$minState = $minState;
        this.$block = (p<b0, c<Object>, Object>)$block;
        super(2, (c)c);
    }
    
    public final c<j> create(final Object l$0, final c<?> c) {
        final PausingDispatcherKt$whenStateAtLeast$2 pausingDispatcherKt$whenStateAtLeast$2 = new PausingDispatcherKt$whenStateAtLeast$2(this.$this_whenStateAtLeast, this.$minState, this.$block, (c<? super PausingDispatcherKt$whenStateAtLeast$2>)c);
        pausingDispatcherKt$whenStateAtLeast$2.L$0 = l$0;
        return (c<j>)pausingDispatcherKt$whenStateAtLeast$2;
    }
    
    public final Object invoke(final b0 b0, final c<Object> c) {
        return ((PausingDispatcherKt$whenStateAtLeast$2)this.create(b0, c)).invokeSuspend(j.a);
    }
    
    public final Object invokeSuspend(Object l$0) {
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label = this.label;
        Object o = null;
        Object l = null;
        Label_0171: {
            if (label != 0) {
                if (label == 1) {
                    o = this.L$0;
                    try {
                        aj2.c.Q0(l$0);
                    }
                    finally {
                        l = l$0;
                        break Label_0171;
                    }
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aj2.c.Q0(l$0);
            final CoroutineContext kx = ((b0)this.L$0).Kx();
            final int p3 = z0.P3;
            final z0 z0 = (z0)kx.get((CoroutineContext$b)z0$b.f);
            if (z0 == null) {
                throw new IllegalStateException("when[State] methods should have a parent job".toString());
            }
            final a0 a0 = new a0();
            l$0 = new l(this.$this_whenStateAtLeast, this.$minState, a0.h, z0);
            try {
                final p<b0, c<Object>, Object> $block = this.$block;
                this.L$0 = l$0;
                this.label = 1;
                l = g.l((CoroutineContext)a0, (p)$block, (c)this);
                if (l == coroutine_SUSPENDED) {
                    return coroutine_SUSPENDED;
                }
                o = l$0;
                ((l)o).a();
                return l;
            }
            finally {
                final Throwable t;
                l = t;
                o = l$0;
            }
        }
        ((l)o).a();
        throw l;
    }
}
