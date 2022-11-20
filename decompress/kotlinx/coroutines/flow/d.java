// 
// Decompiled by Procyon v0.6.0
// 

package kotlinx.coroutines.flow;

import kotlinx.coroutines.flow.internal.AbortFlowException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import gg2.c;
import cj2.f;

public final class d
{
    public static final CoroutineSingletons a(final f l$0, final Object o, final c c) {
        FlowKt__LimitKt$emitAbort$1 flowKt__LimitKt$emitAbort$2 = null;
        Label_0050: {
            if (c instanceof FlowKt__LimitKt$emitAbort$1) {
                final FlowKt__LimitKt$emitAbort$1 flowKt__LimitKt$emitAbort$1 = (FlowKt__LimitKt$emitAbort$1)c;
                final int label = flowKt__LimitKt$emitAbort$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    flowKt__LimitKt$emitAbort$1.label = label + Integer.MIN_VALUE;
                    flowKt__LimitKt$emitAbort$2 = flowKt__LimitKt$emitAbort$1;
                    break Label_0050;
                }
            }
            flowKt__LimitKt$emitAbort$2 = new FlowKt__LimitKt$emitAbort$1(c);
        }
        final Object result = flowKt__LimitKt$emitAbort$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = flowKt__LimitKt$emitAbort$2.label;
        f f;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f = (f)flowKt__LimitKt$emitAbort$2.L$0;
            cg.d.b4(result);
        }
        else {
            cg.d.b4(result);
            flowKt__LimitKt$emitAbort$2.L$0 = l$0;
            flowKt__LimitKt$emitAbort$2.label = 1;
            f = l$0;
            if (l$0.emit(o, (c)flowKt__LimitKt$emitAbort$2) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        throw new AbortFlowException((f<?>)f);
    }
}
