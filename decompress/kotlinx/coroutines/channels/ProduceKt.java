// 
// Decompiled by Procyon v0.6.0
// 

package kotlinx.coroutines.channels;

import bj2.t;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineStart;
import mg2.p;
import kotlin.coroutines.CoroutineContext;
import zi2.c0;
import zi2.l;
import zi2.m;
import kotlin.coroutines.CoroutineContext$b;
import zi2.z0$b;
import cg.d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import gg2.c;
import cg2.j;
import mg2.a;
import bj2.n;

public final class ProduceKt
{
    public static final Object a(final n<?> l$0, final a<j> l$2, c<? super j> c) {
        ProduceKt$awaitClose$1 produceKt$awaitClose$1 = null;
        Label_0048: {
            if (c instanceof ProduceKt$awaitClose$1) {
                produceKt$awaitClose$1 = (ProduceKt$awaitClose$1)c;
                final int label = produceKt$awaitClose$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    produceKt$awaitClose$1.label = label + Integer.MIN_VALUE;
                    break Label_0048;
                }
            }
            produceKt$awaitClose$1 = new ProduceKt$awaitClose$1(c);
        }
        final Object result = produceKt$awaitClose$1.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = produceKt$awaitClose$1.label;
        final a<j> a2;
        Label_0250: {
            if (label2 != 0) {
                if (label2 == 1) {
                    final a a = (a)produceKt$awaitClose$1.L$1;
                    final n n = (n)produceKt$awaitClose$1.L$0;
                    c = (c)a;
                    Label_0261: {
                        try {
                            d.b4(result);
                            break Label_0250;
                        }
                        finally {
                            break Label_0261;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ((a)c).invoke();
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d.b4(result);
            if (((c)produceKt$awaitClose$1).getContext().get((CoroutineContext$b)z0$b.f) != l$0) {
                throw new IllegalStateException("awaitClose() can only be invoked from the producer context".toString());
            }
            produceKt$awaitClose$1.L$0 = l$0;
            produceKt$awaitClose$1.L$1 = l$2;
            produceKt$awaitClose$1.label = 1;
            final m m = new m(1, d.e3((c)produceKt$awaitClose$1));
            m.r();
            ((t)l$0).d((mg2.l)new ProduceKt$awaitClose$4$1((l)m));
            final Object q = m.q();
            a2 = l$2;
            if (q == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        a2.invoke();
        return j.a;
    }
    
    public static final bj2.m b(final c0 c0, final CoroutineContext coroutineContext, final int n, final p p4) {
        final BufferOverflow suspend = BufferOverflow.SUSPEND;
        final CoroutineStart default1 = CoroutineStart.DEFAULT;
        final bj2.m m = new bj2.m(CoroutineContextKt.c(c0, coroutineContext), zg.a.e(n, suspend, 4));
        default1.invoke((mg2.p<? super bj2.m, ? super c<? super Object>, ?>)p4, m, (c<? super Object>)m);
        return m;
    }
    
    public static bj2.m c(final c0 c0, int n, final p p4, final int n2) {
        Object instance;
        if ((n2 & 0x1) != 0x0) {
            instance = EmptyCoroutineContext.INSTANCE;
        }
        else {
            instance = null;
        }
        if ((n2 & 0x2) != 0x0) {
            n = 0;
        }
        return b(c0, (CoroutineContext)instance, n, p4);
    }
}
