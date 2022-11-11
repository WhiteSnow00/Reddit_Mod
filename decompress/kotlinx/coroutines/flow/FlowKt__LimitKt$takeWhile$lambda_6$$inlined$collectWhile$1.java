// 
// Decompiled by Procyon v0.6.0
// 

package kotlinx.coroutines.flow;

import kotlinx.coroutines.flow.internal.AbortFlowException;
import yd.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import hg2.j;
import lg2.c;
import rg2.p;
import hj2.f;

public final class FlowKt__LimitKt$takeWhile$lambda_6$$inlined$collectWhile$1 implements f<Object>
{
    public final /* synthetic */ p f;
    public final /* synthetic */ f g;
    
    public FlowKt__LimitKt$takeWhile$lambda_6$$inlined$collectWhile$1(final p f, final f g) {
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final Object emit(final Object l$1, final c<? super j> c) {
        FlowKt__LimitKt$takeWhile$lambda_6$$inlined$collectWhile$1$1 flowKt__LimitKt$takeWhile$lambda_6$$inlined$collectWhile$1$2 = null;
        Label_0050: {
            if (c instanceof FlowKt__LimitKt$takeWhile$lambda_6$$inlined$collectWhile$1$1) {
                final FlowKt__LimitKt$takeWhile$lambda_6$$inlined$collectWhile$1$1 flowKt__LimitKt$takeWhile$lambda_6$$inlined$collectWhile$1$1 = (FlowKt__LimitKt$takeWhile$lambda_6$$inlined$collectWhile$1$1)c;
                final int label = flowKt__LimitKt$takeWhile$lambda_6$$inlined$collectWhile$1$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    flowKt__LimitKt$takeWhile$lambda_6$$inlined$collectWhile$1$1.label = label + Integer.MIN_VALUE;
                    flowKt__LimitKt$takeWhile$lambda_6$$inlined$collectWhile$1$2 = flowKt__LimitKt$takeWhile$lambda_6$$inlined$collectWhile$1$1;
                    break Label_0050;
                }
            }
            flowKt__LimitKt$takeWhile$lambda_6$$inlined$collectWhile$1$2 = new FlowKt__LimitKt$takeWhile$lambda_6$$inlined$collectWhile$1$1((FlowKt__LimitKt$takeWhile$lambda-6$$inlined$collectWhile$1)this, (c)c);
        }
        Object o = flowKt__LimitKt$takeWhile$lambda_6$$inlined$collectWhile$1$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = flowKt__LimitKt$takeWhile$lambda_6$$inlined$collectWhile$1$2.label;
        boolean b = true;
        FlowKt__LimitKt$takeWhile$lambda_6$$inlined$collectWhile$1 l$2 = null;
        Label_0235: {
            Object l$3;
            if (label2 != 0) {
                if (label2 != 1) {
                    if (label2 == 2) {
                        l$2 = (FlowKt__LimitKt$takeWhile$lambda_6$$inlined$collectWhile$1)flowKt__LimitKt$takeWhile$lambda_6$$inlined$collectWhile$1$2.L$0;
                        yd.b.k0(o);
                        break Label_0235;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                else {
                    l$3 = flowKt__LimitKt$takeWhile$lambda_6$$inlined$collectWhile$1$2.L$1;
                    l$2 = (FlowKt__LimitKt$takeWhile$lambda_6$$inlined$collectWhile$1)flowKt__LimitKt$takeWhile$lambda_6$$inlined$collectWhile$1$2.L$0;
                    yd.b.k0(o);
                }
            }
            else {
                yd.b.k0(o);
                final p f = this.f;
                flowKt__LimitKt$takeWhile$lambda_6$$inlined$collectWhile$1$2.L$0 = this;
                flowKt__LimitKt$takeWhile$lambda_6$$inlined$collectWhile$1$2.L$1 = l$1;
                flowKt__LimitKt$takeWhile$lambda_6$$inlined$collectWhile$1$2.label = 1;
                o = f.invoke(l$1, flowKt__LimitKt$takeWhile$lambda_6$$inlined$collectWhile$1$2);
                if (o == coroutine_SUSPENDED) {
                    return coroutine_SUSPENDED;
                }
                l$3 = l$1;
                l$2 = this;
            }
            if (o) {
                final f g = l$2.g;
                flowKt__LimitKt$takeWhile$lambda_6$$inlined$collectWhile$1$2.L$0 = l$2;
                flowKt__LimitKt$takeWhile$lambda_6$$inlined$collectWhile$1$2.L$1 = null;
                flowKt__LimitKt$takeWhile$lambda_6$$inlined$collectWhile$1$2.label = 2;
                if (g.emit(l$3, (c<? super j>)flowKt__LimitKt$takeWhile$lambda_6$$inlined$collectWhile$1$2) == coroutine_SUSPENDED) {
                    return coroutine_SUSPENDED;
                }
            }
            else {
                b = false;
            }
        }
        if (b) {
            return j.a;
        }
        throw new AbortFlowException((f)l$2);
    }
}
