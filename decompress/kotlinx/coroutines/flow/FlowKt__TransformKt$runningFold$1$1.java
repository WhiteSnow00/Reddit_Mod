// 
// Decompiled by Procyon v0.6.0
// 

package kotlinx.coroutines.flow;

import cg.d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import cg2.j;
import gg2.c;
import mg2.q;
import kotlin.jvm.internal.Ref$ObjectRef;
import cj2.f;

public final class FlowKt__TransformKt$runningFold$1$1<T> implements f
{
    public final Ref$ObjectRef<Object> f;
    public final q<Object, T, c<Object>, Object> g;
    public final f<Object> h;
    
    public FlowKt__TransformKt$runningFold$1$1(final Ref$ObjectRef<Object> f, final q<Object, ? super T, ? super c<Object>, ?> g, final f<Object> h) {
        this.f = f;
        this.g = (q<Object, T, c<Object>, Object>)g;
        this.h = h;
    }
    
    public final Object emit(final T t, final c<? super j> c) {
        FlowKt__TransformKt$runningFold$1$1$emit$1 flowKt__TransformKt$runningFold$1$1$emit$2 = null;
        Label_0051: {
            if (c instanceof FlowKt__TransformKt$runningFold$1$1$emit$1) {
                final FlowKt__TransformKt$runningFold$1$1$emit$1 flowKt__TransformKt$runningFold$1$1$emit$1 = (FlowKt__TransformKt$runningFold$1$1$emit$1)c;
                final int label = flowKt__TransformKt$runningFold$1$1$emit$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    flowKt__TransformKt$runningFold$1$1$emit$1.label = label + Integer.MIN_VALUE;
                    flowKt__TransformKt$runningFold$1$1$emit$2 = flowKt__TransformKt$runningFold$1$1$emit$1;
                    break Label_0051;
                }
            }
            flowKt__TransformKt$runningFold$1$1$emit$2 = new FlowKt__TransformKt$runningFold$1$1$emit$1(this, (c)c);
        }
        Object element = flowKt__TransformKt$runningFold$1$1$emit$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = flowKt__TransformKt$runningFold$1$1$emit$2.label;
        Ref$ObjectRef f;
        FlowKt__TransformKt$runningFold$1$1 flowKt__TransformKt$runningFold$1$1;
        if (label2 != 0) {
            if (label2 != 1) {
                if (label2 == 2) {
                    d.b4(element);
                    return j.a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            else {
                f = (Ref$ObjectRef)flowKt__TransformKt$runningFold$1$1$emit$2.L$1;
                flowKt__TransformKt$runningFold$1$1 = (FlowKt__TransformKt$runningFold$1$1)flowKt__TransformKt$runningFold$1$1$emit$2.L$0;
                d.b4(element);
            }
        }
        else {
            d.b4(element);
            f = this.f;
            final q<Object, T, c<Object>, Object> g = this.g;
            final Object element2 = f.element;
            flowKt__TransformKt$runningFold$1$1$emit$2.L$0 = this;
            flowKt__TransformKt$runningFold$1$1$emit$2.L$1 = f;
            flowKt__TransformKt$runningFold$1$1$emit$2.label = 1;
            element = g.invoke(element2, (Object)t, (Object)flowKt__TransformKt$runningFold$1$1$emit$2);
            if (element == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            flowKt__TransformKt$runningFold$1$1 = this;
        }
        f.element = element;
        final f<Object> h = flowKt__TransformKt$runningFold$1$1.h;
        final Object element3 = flowKt__TransformKt$runningFold$1$1.f.element;
        flowKt__TransformKt$runningFold$1$1$emit$2.L$0 = null;
        flowKt__TransformKt$runningFold$1$1$emit$2.L$1 = null;
        flowKt__TransformKt$runningFold$1$1$emit$2.label = 2;
        if (h.emit(element3, (c)flowKt__TransformKt$runningFold$1$1$emit$2) == coroutine_SUSPENDED) {
            return coroutine_SUSPENDED;
        }
        return j.a;
    }
}
