// 
// Decompiled by Procyon v0.6.0
// 

package kotlinx.coroutines.flow;

import xd.a;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext$b;
import zi2.z0$b;
import zi2.z0;
import kotlin.jvm.internal.Ref$ObjectRef;
import cg.d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import java.io.Serializable;
import cj2.f;
import cj2.e;

public final class c
{
    public static final Serializable a(gg2.c flowKt__ErrorsKt$catchImpl$1, final e e, final f f) {
        Label_0050: {
            if (flowKt__ErrorsKt$catchImpl$1 instanceof FlowKt__ErrorsKt$catchImpl$1) {
                final FlowKt__ErrorsKt$catchImpl$1 flowKt__ErrorsKt$catchImpl$2 = flowKt__ErrorsKt$catchImpl$1;
                final int label = flowKt__ErrorsKt$catchImpl$2.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    flowKt__ErrorsKt$catchImpl$2.label = label + Integer.MIN_VALUE;
                    flowKt__ErrorsKt$catchImpl$1 = flowKt__ErrorsKt$catchImpl$2;
                    break Label_0050;
                }
            }
            flowKt__ErrorsKt$catchImpl$1 = new FlowKt__ErrorsKt$catchImpl$1((gg2.c)flowKt__ErrorsKt$catchImpl$1);
        }
        final Object result = flowKt__ErrorsKt$catchImpl$1.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = flowKt__ErrorsKt$catchImpl$1.label;
        final int n = 1;
        Object l$0 = null;
        Throwable t = null;
        Label_0166: {
            if (label2 != 0) {
                if (label2 == 1) {
                    l$0 = flowKt__ErrorsKt$catchImpl$1.L$0;
                    try {
                        d.b4(result);
                        break Label_0166;
                    }
                    finally {
                        break Label_0166;
                    }
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d.b4(result);
            l$0 = new Ref$ObjectRef();
            try {
                final FlowKt__ErrorsKt$catchImpl$2 flowKt__ErrorsKt$catchImpl$3 = new FlowKt__ErrorsKt$catchImpl$2(f, (Ref$ObjectRef)l$0);
                flowKt__ErrorsKt$catchImpl$1.L$0 = l$0;
                flowKt__ErrorsKt$catchImpl$1.label = 1;
                if (e.a((f)flowKt__ErrorsKt$catchImpl$3, (gg2.c)flowKt__ErrorsKt$catchImpl$1) == coroutine_SUSPENDED) {
                    return (Serializable)coroutine_SUSPENDED;
                }
                return null;
            }
            finally {
                l$0 = l$0;
                final Throwable t2;
                t = t2;
            }
        }
        final Throwable t3 = (Throwable)((Ref$ObjectRef)l$0).element;
        final boolean b = false;
        if (t3 == null || !ng2.e.a((Object)t3, (Object)t)) {
            final z0 z0 = (z0)((gg2.c)flowKt__ErrorsKt$catchImpl$1).getContext().get((CoroutineContext$b)z0$b.f);
            int n2 = b ? 1 : 0;
            if (z0 != null) {
                if (!z0.isCancelled()) {
                    n2 = (b ? 1 : 0);
                }
                else {
                    final CancellationException e2 = z0.E();
                    if (e2 != null && ng2.e.a((Object)e2, (Object)t)) {
                        n2 = n;
                    }
                    else {
                        n2 = 0;
                    }
                }
            }
            if (n2 == 0) {
                if (t3 == null) {
                    return t;
                }
                if (t instanceof CancellationException) {
                    a.t(t3, t);
                    throw t3;
                }
                a.t(t, t3);
                throw t;
            }
        }
        throw t;
    }
}
