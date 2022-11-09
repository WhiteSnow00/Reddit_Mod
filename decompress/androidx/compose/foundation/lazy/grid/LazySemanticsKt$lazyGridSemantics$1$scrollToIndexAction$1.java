// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.lazy.grid;

import androidx.compose.runtime.SnapshotMutableStateImpl;
import kotlinx.coroutines.CoroutineStart;
import kotlin.coroutines.CoroutineContext;
import mj2.g;
import h1.e;
import n0.k;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import pg2.j;
import tg2.c;
import zg2.p;
import r0.m;
import mj2.b0;
import kotlin.Metadata;
import zg2.l;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = { 1, 6, 0 }, xi = 48)
final class LazySemanticsKt$lazyGridSemantics$1$scrollToIndexAction$1 extends Lambda implements l<Integer, Boolean>
{
    public final /* synthetic */ b0 $coroutineScope;
    public final /* synthetic */ LazyGridState $state;
    
    public LazySemanticsKt$lazyGridSemantics$1$scrollToIndexAction$1(final LazyGridState $state, final b0 $coroutineScope) {
        this.$state = $state;
        this.$coroutineScope = $coroutineScope;
        super(1);
    }
    
    public final Boolean invoke(final int n) {
        final boolean b = n >= 0 && n < ((SnapshotMutableStateImpl<m>)this.$state.b).getValue().a();
        final LazyGridState $state = this.$state;
        if (b) {
            g.i(this.$coroutineScope, (CoroutineContext)null, (CoroutineStart)null, (p)new p<b0, c<? super j>, Object>() {
                public final /* synthetic */ int $index;
                public final /* synthetic */ LazyGridState $state;
                public int label;
                
                public final c<j> create(final Object o, final c<?> c) {
                    return (c<j>)new p<b0, c<? super j>, Object>() {
                        public final /* synthetic */ int $index = this.$index;
                        public final /* synthetic */ LazyGridState $state = this.$state;
                        public int label;
                    };
                }
                
                public final Object invoke(final b0 b0, final c<? super j> c) {
                    return ((LazySemanticsKt$lazyGridSemantics$1$scrollToIndexAction$1$2)this.create(b0, c)).invokeSuspend(j.a);
                }
                
                public final Object invokeSuspend(Object o) {
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
                        final int $index = this.$index;
                        this.label = 1;
                        final e u = LazyGridState.u;
                        $state.getClass();
                        o = k.d((k)$state, (p)new LazyGridState$scrollToItem$2($state, $index, 0, null), (c)this);
                        if (o != coroutine_SUSPENDED) {
                            o = j.a;
                        }
                        if (o == coroutine_SUSPENDED) {
                            return coroutine_SUSPENDED;
                        }
                    }
                    return j.a;
                }
            }, 3);
            return Boolean.TRUE;
        }
        final StringBuilder p = d.p("Can't scroll to index ", n, ", it is out of bounds [0, ");
        p.append(((SnapshotMutableStateImpl<m>)$state.b).getValue().a());
        p.append(')');
        throw new IllegalArgumentException(p.toString().toString());
    }
}
