// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.lazy.grid;

import kotlinx.coroutines.flow.AbstractFlow;
import pj2.s;
import pj2.f;
import androidx.compose.runtime.e;
import kotlin.jvm.internal.Lambda;
import zg2.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import gh2.i;
import z0.h0;
import kotlin.Metadata;
import pg2.j;
import tg2.c;
import mj2.b0;
import zg2.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(k = 3, mv = { 1, 6, 0 }, xi = 48)
@ug2.c(c = "androidx.compose.foundation.lazy.grid.LazyGridItemProviderImplKt$rememberItemProvider$1", f = "LazyGridItemProviderImpl.kt", l = { 53 }, m = "invokeSuspend")
final class LazyGridItemProviderImplKt$rememberItemProvider$1 extends SuspendLambda implements p<b0, c<? super j>, Object>
{
    public final /* synthetic */ h0<i> $nearestItemsRangeState;
    public final /* synthetic */ LazyGridState $state;
    public int label;
    
    public LazyGridItemProviderImplKt$rememberItemProvider$1(final LazyGridState $state, final h0<i> $nearestItemsRangeState, final c<? super LazyGridItemProviderImplKt$rememberItemProvider$1> c) {
        this.$state = $state;
        this.$nearestItemsRangeState = $nearestItemsRangeState;
        super(2, (c)c);
    }
    
    public final c<j> create(final Object o, final c<?> c) {
        return (c<j>)new LazyGridItemProviderImplKt$rememberItemProvider$1(this.$state, this.$nearestItemsRangeState, (c<? super LazyGridItemProviderImplKt$rememberItemProvider$1>)c);
    }
    
    public final Object invoke(final b0 b0, final c<? super j> c) {
        return ((LazyGridItemProviderImplKt$rememberItemProvider$1)this.create(b0, c)).invokeSuspend(j.a);
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
            final s b = e.b((a)new a<i>() {
                public final /* synthetic */ LazyGridState $state = LazyGridItemProviderImplKt$rememberItemProvider$1.this.$state;
                
                public final i invoke() {
                    final int n = this.$state.e() / 90 * 90;
                    return yl.a.C1(Math.max(n - 200, 0), n + 90 + 200);
                }
            });
            final LazyGridItemProviderImplKt$rememberItemProvider$1$a lazyGridItemProviderImplKt$rememberItemProvider$1$a = new LazyGridItemProviderImplKt$rememberItemProvider$1$a((h0)this.$nearestItemsRangeState);
            this.label = 1;
            if (((AbstractFlow)b).a((f)lazyGridItemProviderImplKt$rememberItemProvider$1$a, (c)this) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        return j.a;
    }
}
