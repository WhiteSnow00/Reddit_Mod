// 
// Decompiled by Procyon v0.6.0
// 

package kotlinx.coroutines.flow;

import cg.d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import cg2.j;
import gg2.c;
import kotlin.jvm.internal.Ref$IntRef;
import dg2.t;
import cj2.f;

public final class FlowKt__TransformKt$withIndex$1$1<T> implements f
{
    public final f<t<? extends T>> f;
    public final Ref$IntRef g;
    
    public FlowKt__TransformKt$withIndex$1$1(final Ref$IntRef g, final f f) {
        this.f = (f<t<? extends T>>)f;
        this.g = g;
    }
    
    public final Object emit(final T t, final c<? super j> c) {
        FlowKt__TransformKt$withIndex$1$1$emit$1 flowKt__TransformKt$withIndex$1$1$emit$2 = null;
        Label_0051: {
            if (c instanceof FlowKt__TransformKt$withIndex$1$1$emit$1) {
                final FlowKt__TransformKt$withIndex$1$1$emit$1 flowKt__TransformKt$withIndex$1$1$emit$1 = (FlowKt__TransformKt$withIndex$1$1$emit$1)c;
                final int label = flowKt__TransformKt$withIndex$1$1$emit$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    flowKt__TransformKt$withIndex$1$1$emit$1.label = label + Integer.MIN_VALUE;
                    flowKt__TransformKt$withIndex$1$1$emit$2 = flowKt__TransformKt$withIndex$1$1$emit$1;
                    break Label_0051;
                }
            }
            flowKt__TransformKt$withIndex$1$1$emit$2 = new FlowKt__TransformKt$withIndex$1$1$emit$1(this, (c)c);
        }
        final Object result = flowKt__TransformKt$withIndex$1$1$emit$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = flowKt__TransformKt$withIndex$1$1$emit$2.label;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d.b4(result);
        }
        else {
            d.b4(result);
            final f<t<? extends T>> f = this.f;
            final int n = this.g.element++;
            if (n < 0) {
                throw new ArithmeticException("Index overflow has happened");
            }
            final t t2 = new t(n, (Object)t);
            flowKt__TransformKt$withIndex$1$1$emit$2.label = 1;
            if (f.emit((Object)t2, (c)flowKt__TransformKt$withIndex$1$1$emit$2) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        return j.a;
    }
}
