// 
// Decompiled by Procyon v0.6.0
// 

package kotlinx.coroutines.flow;

import yd.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import hg2.j;
import lg2.c;
import kotlin.jvm.internal.Ref$IntRef;
import ig2.t;
import hj2.f;

public final class FlowKt__TransformKt$withIndex$1$1<T> implements f
{
    public final /* synthetic */ f<t<? extends T>> f;
    public final /* synthetic */ Ref$IntRef g;
    
    public FlowKt__TransformKt$withIndex$1$1(final Ref$IntRef g, final f f) {
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final Object emit(final T t, final c<? super j> c) {
        FlowKt__TransformKt$withIndex$1$1$emit$1 flowKt__TransformKt$withIndex$1$1$emit$2 = null;
        Label_0050: {
            if (c instanceof FlowKt__TransformKt$withIndex$1$1$emit$1) {
                final FlowKt__TransformKt$withIndex$1$1$emit$1 flowKt__TransformKt$withIndex$1$1$emit$1 = (FlowKt__TransformKt$withIndex$1$1$emit$1)c;
                final int label = flowKt__TransformKt$withIndex$1$1$emit$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    flowKt__TransformKt$withIndex$1$1$emit$1.label = label + Integer.MIN_VALUE;
                    flowKt__TransformKt$withIndex$1$1$emit$2 = flowKt__TransformKt$withIndex$1$1$emit$1;
                    break Label_0050;
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
            b.k0(result);
        }
        else {
            b.k0(result);
            final f<t<? extends T>> f = this.f;
            final int n = this.g.element++;
            if (n < 0) {
                throw new ArithmeticException("Index overflow has happened");
            }
            final t t2 = new t(n, (Object)t);
            flowKt__TransformKt$withIndex$1$1$emit$2.label = 1;
            if (f.emit((t<? extends T>)t2, (c<? super j>)flowKt__TransformKt$withIndex$1$1$emit$2) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        return j.a;
    }
}
