// 
// Decompiled by Procyon v0.6.0
// 

package kotlinx.coroutines.flow;

import hg2.j;
import yd.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import lg2.c;
import hj2.f;
import hj2.v;
import rg2.p;
import hj2.e;

public final class FlowKt__MergeKt$flatMapConcat$$inlined$map$1 implements e<e<Object>>
{
    public final /* synthetic */ e f;
    public final /* synthetic */ p g;
    
    public FlowKt__MergeKt$flatMapConcat$$inlined$map$1(final p g, final v f) {
        this.f = (e)f;
        this.g = g;
    }
    
    @Override
    public final Object a(final f f, final c c) {
        final Object a = this.f.a(new f() {
            public final /* synthetic */ p g = FlowKt__MergeKt$flatMapConcat$$inlined$map$1.this.g;
            
            @Override
            public final Object emit(final Object o, final c c) {
                FlowKt__MergeKt$flatMapConcat$$inlined$map$1$2$1 flowKt__MergeKt$flatMapConcat$$inlined$map$1$2$2 = null;
                Label_0050: {
                    if (c instanceof FlowKt__MergeKt$flatMapConcat$$inlined$map$1$2$1) {
                        final FlowKt__MergeKt$flatMapConcat$$inlined$map$1$2$1 flowKt__MergeKt$flatMapConcat$$inlined$map$1$2$1 = (FlowKt__MergeKt$flatMapConcat$$inlined$map$1$2$1)c;
                        final int label = flowKt__MergeKt$flatMapConcat$$inlined$map$1$2$1.label;
                        if ((label & Integer.MIN_VALUE) != 0x0) {
                            flowKt__MergeKt$flatMapConcat$$inlined$map$1$2$1.label = label + Integer.MIN_VALUE;
                            flowKt__MergeKt$flatMapConcat$$inlined$map$1$2$2 = flowKt__MergeKt$flatMapConcat$$inlined$map$1$2$1;
                            break Label_0050;
                        }
                    }
                    flowKt__MergeKt$flatMapConcat$$inlined$map$1$2$2 = new FlowKt__MergeKt$flatMapConcat$$inlined$map$1$2$1(this, c);
                }
                Object o2 = flowKt__MergeKt$flatMapConcat$$inlined$map$1$2$2.result;
                final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
                final int label2 = flowKt__MergeKt$flatMapConcat$$inlined$map$1$2$2.label;
                f f;
                if (label2 != 0) {
                    if (label2 != 1) {
                        if (label2 == 2) {
                            b.k0(o2);
                            return j.a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    else {
                        f = (f)flowKt__MergeKt$flatMapConcat$$inlined$map$1$2$2.L$0;
                        b.k0(o2);
                    }
                }
                else {
                    b.k0(o2);
                    final f f2 = f;
                    final p g = this.g;
                    flowKt__MergeKt$flatMapConcat$$inlined$map$1$2$2.L$0 = f2;
                    flowKt__MergeKt$flatMapConcat$$inlined$map$1$2$2.label = 1;
                    o2 = g.invoke(o, flowKt__MergeKt$flatMapConcat$$inlined$map$1$2$2);
                    if (o2 == coroutine_SUSPENDED) {
                        return coroutine_SUSPENDED;
                    }
                    f = f2;
                }
                flowKt__MergeKt$flatMapConcat$$inlined$map$1$2$2.L$0 = null;
                flowKt__MergeKt$flatMapConcat$$inlined$map$1$2$2.label = 2;
                if (f.emit(o2, (c<? super j>)flowKt__MergeKt$flatMapConcat$$inlined$map$1$2$2) == coroutine_SUSPENDED) {
                    return coroutine_SUSPENDED;
                }
                return j.a;
            }
        }, c);
        if (a == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return a;
        }
        return j.a;
    }
}
