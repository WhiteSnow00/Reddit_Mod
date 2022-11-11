// 
// Decompiled by Procyon v0.6.0
// 

package kotlinx.coroutines.flow;

import yd.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import hg2.j;
import lg2.c;
import hj2.e;
import hj2.f;

public final class FlowKt__MergeKt$flattenConcat$1$1<T> implements f
{
    public final /* synthetic */ f<T> f;
    
    public FlowKt__MergeKt$flattenConcat$1$1(final f<? super T> f) {
        this.f = (f<T>)f;
    }
    
    public final Object a(final e<? extends T> e, final c<? super j> c) {
        FlowKt__MergeKt$flattenConcat$1$1$emit$1 flowKt__MergeKt$flattenConcat$1$1$emit$2 = null;
        Label_0050: {
            if (c instanceof FlowKt__MergeKt$flattenConcat$1$1$emit$1) {
                final FlowKt__MergeKt$flattenConcat$1$1$emit$1 flowKt__MergeKt$flattenConcat$1$1$emit$1 = (FlowKt__MergeKt$flattenConcat$1$1$emit$1)c;
                final int label = flowKt__MergeKt$flattenConcat$1$1$emit$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    flowKt__MergeKt$flattenConcat$1$1$emit$1.label = label + Integer.MIN_VALUE;
                    flowKt__MergeKt$flattenConcat$1$1$emit$2 = flowKt__MergeKt$flattenConcat$1$1$emit$1;
                    break Label_0050;
                }
            }
            flowKt__MergeKt$flattenConcat$1$1$emit$2 = new FlowKt__MergeKt$flattenConcat$1$1$emit$1(this, (c)c);
        }
        final Object result = flowKt__MergeKt$flattenConcat$1$1$emit$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = flowKt__MergeKt$flattenConcat$1$1$emit$2.label;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.k0(result);
        }
        else {
            b.k0(result);
            final f<T> f = this.f;
            flowKt__MergeKt$flattenConcat$1$1$emit$2.label = 1;
            if (a.u((c)flowKt__MergeKt$flattenConcat$1$1$emit$2, e, f) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        return j.a;
    }
}
