// 
// Decompiled by Procyon v0.6.0
// 

package kotlinx.coroutines.flow;

import kotlinx.coroutines.flow.internal.AbortFlowException;
import yd.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import hg2.j;
import lg2.c;
import kotlin.jvm.internal.Ref$ObjectRef;
import rg2.p;
import hj2.f;

public final class FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2 implements f<Object>
{
    public final /* synthetic */ p f;
    public final /* synthetic */ Ref$ObjectRef g;
    
    public FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2(final p f, final Ref$ObjectRef g) {
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final Object emit(final Object l$1, final c<? super j> c) {
        FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2$1 flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2$2 = null;
        Label_0050: {
            if (c instanceof FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2$1) {
                final FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2$1 flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2$1 = (FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2$1)c;
                final int label = flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2$1.label = label + Integer.MIN_VALUE;
                    flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2$2 = flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2$1;
                    break Label_0050;
                }
            }
            flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2$2 = new FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2$1(this, (c)c);
        }
        Object o = flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2$2.label;
        boolean b = true;
        FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2 flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2;
        Object element;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            final Object l$2 = flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2$2.L$1;
            flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2 = (FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2)flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2$2.L$0;
            yd.b.k0(o);
            element = l$2;
        }
        else {
            yd.b.k0(o);
            final p f = this.f;
            flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2$2.L$0 = this;
            flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2$2.L$1 = l$1;
            flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2$2.label = 1;
            o = f.invoke(l$1, flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2$2);
            if (o == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            element = l$1;
            flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2 = this;
        }
        if (o) {
            flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2.g.element = element;
            b = false;
        }
        if (b) {
            return j.a;
        }
        throw new AbortFlowException((f)flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2);
    }
}
