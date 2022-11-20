// 
// Decompiled by Procyon v0.6.0
// 

package kotlinx.coroutines.flow;

import xd.a;
import cg2.j;
import cg.d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import gg2.c;
import mg2.q;
import cj2.a0;

public final class b
{
    public static final Object a(final a0 a0, final q q, final Throwable l$0, c t) {
        FlowKt__EmittersKt$invokeSafely$1 flowKt__EmittersKt$invokeSafely$1 = null;
        Label_0051: {
            if (t instanceof FlowKt__EmittersKt$invokeSafely$1) {
                flowKt__EmittersKt$invokeSafely$1 = (FlowKt__EmittersKt$invokeSafely$1)t;
                final int label = flowKt__EmittersKt$invokeSafely$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    flowKt__EmittersKt$invokeSafely$1.label = label + Integer.MIN_VALUE;
                    break Label_0051;
                }
            }
            flowKt__EmittersKt$invokeSafely$1 = new FlowKt__EmittersKt$invokeSafely$1((c)t);
        }
        final Object result = flowKt__EmittersKt$invokeSafely$1.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = flowKt__EmittersKt$invokeSafely$1.label;
        Label_0108: {
            if (label2 == 0) {
                break Label_0108;
            }
            Label_0098: {
                if (label2 != 1) {
                    break Label_0098;
                }
                t = (Throwable)flowKt__EmittersKt$invokeSafely$1.L$0;
                try {
                    d.b4(result);
                    Object a2 = null;
                    Label_0154: {
                        a2 = j.a;
                    }
                    return a2;
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    a2 = coroutine_SUSPENDED;
                    return a2;
                    d.b4(result);
                    t = l$0;
                    flowKt__EmittersKt$invokeSafely$1.L$0 = l$0;
                    t = l$0;
                    flowKt__EmittersKt$invokeSafely$1.label = 1;
                    t = l$0;
                    iftrue(Label_0154:)(q.invoke((Object)a0, (Object)l$0, (Object)flowKt__EmittersKt$invokeSafely$1) != coroutine_SUSPENDED);
                    return coroutine_SUSPENDED;
                }
                finally {
                    final Throwable t2;
                    if (t != null && t != t2) {
                        a.t(t2, t);
                    }
                }
            }
        }
    }
}
