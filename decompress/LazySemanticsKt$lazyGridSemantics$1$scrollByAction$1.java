// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.lazy.grid;

import kotlinx.coroutines.CoroutineStart;
import kotlin.coroutines.CoroutineContext;
import mj2.g;
import n0.k;
import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import pg2.j;
import tg2.c;
import mj2.b0;
import kotlin.Metadata;
import zg2.p;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = { 1, 6, 0 }, xi = 48)
final class LazySemanticsKt$lazyGridSemantics$1$scrollByAction$1 extends Lambda implements p<Float, Float, Boolean>
{
    public final /* synthetic */ b0 $coroutineScope;
    public final /* synthetic */ boolean $isVertical;
    public final /* synthetic */ LazyGridState $state;
    
    public LazySemanticsKt$lazyGridSemantics$1$scrollByAction$1(final boolean $isVertical, final b0 $coroutineScope, final LazyGridState $state) {
        this.$isVertical = $isVertical;
        this.$coroutineScope = $coroutineScope;
        this.$state = $state;
        super(2);
    }
    
    public final Boolean invoke(float n, final float n2) {
        if (this.$isVertical) {
            n = n2;
        }
        g.i(this.$coroutineScope, (CoroutineContext)null, (CoroutineStart)null, (p)new p<b0, c<? super j>, Object>() {
            public final /* synthetic */ float $delta;
            public final /* synthetic */ LazyGridState $state;
            public int label;
            
            public final c<j> create(final Object o, final c<?> c) {
                return (c<j>)new p<b0, c<? super j>, Object>() {
                    public final /* synthetic */ float $delta = this.$delta;
                    public final /* synthetic */ LazyGridState $state = this.$state;
                    public int label;
                };
            }
            
            public final Object invoke(final b0 b0, final c<? super j> c) {
                return ((LazySemanticsKt$lazyGridSemantics$1$scrollByAction$1$1)this.create(b0, c)).invokeSuspend(j.a);
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
                    final LazyGridState $state = this.$state;
                    final float $delta = this.$delta;
                    this.label = 1;
                    if (ScrollExtensionsKt.b((k)$state, $delta, (c)this) == coroutine_SUSPENDED) {
                        return coroutine_SUSPENDED;
                    }
                }
                return j.a;
            }
        }, 3);
        return Boolean.TRUE;
    }
}
