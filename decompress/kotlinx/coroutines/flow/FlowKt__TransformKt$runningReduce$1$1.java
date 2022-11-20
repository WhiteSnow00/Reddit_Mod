// 
// Decompiled by Procyon v0.6.0
// 

package kotlinx.coroutines.flow;

import xd.a;
import cg.d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import cg2.j;
import gg2.c;
import mg2.q;
import kotlin.jvm.internal.Ref$ObjectRef;
import cj2.f;

public final class FlowKt__TransformKt$runningReduce$1$1<T> implements f
{
    public final Ref$ObjectRef<Object> f;
    public final q<T, T, c<? super T>, Object> g;
    public final f<T> h;
    
    public FlowKt__TransformKt$runningReduce$1$1(final Ref$ObjectRef<Object> f, final q<? super T, ? super T, ? super c<? super T>, ?> g, final f<? super T> h) {
        this.f = f;
        this.g = (q<T, T, c<? super T>, Object>)g;
        this.h = (f<T>)h;
    }
    
    public final Object emit(final T t, final c<? super j> c) {
        FlowKt__TransformKt$runningReduce$1$1$emit$1 flowKt__TransformKt$runningReduce$1$1$emit$1 = null;
        Label_0049: {
            if (c instanceof FlowKt__TransformKt$runningReduce$1$1$emit$1) {
                flowKt__TransformKt$runningReduce$1$1$emit$1 = (FlowKt__TransformKt$runningReduce$1$1$emit$1)c;
                final int label = flowKt__TransformKt$runningReduce$1$1$emit$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    flowKt__TransformKt$runningReduce$1$1$emit$1.label = label + Integer.MIN_VALUE;
                    break Label_0049;
                }
            }
            flowKt__TransformKt$runningReduce$1$1$emit$1 = new FlowKt__TransformKt$runningReduce$1$1$emit$1(this, (c)c);
        }
        Object result = flowKt__TransformKt$runningReduce$1$1$emit$1.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = flowKt__TransformKt$runningReduce$1$1$emit$1.label;
        Ref$ObjectRef f = null;
        FlowKt__TransformKt$runningReduce$1$1 flowKt__TransformKt$runningReduce$1$2 = null;
        Object element2 = null;
        Label_0224: {
            Ref$ObjectRef ref$ObjectRef;
            FlowKt__TransformKt$runningReduce$1$1 flowKt__TransformKt$runningReduce$1$1;
            if (label2 != 0) {
                if (label2 != 1) {
                    if (label2 == 2) {
                        d.b4(result);
                        return j.a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                else {
                    ref$ObjectRef = (Ref$ObjectRef)flowKt__TransformKt$runningReduce$1$1$emit$1.L$1;
                    flowKt__TransformKt$runningReduce$1$1 = (FlowKt__TransformKt$runningReduce$1$1)flowKt__TransformKt$runningReduce$1$1$emit$1.L$0;
                    d.b4(result);
                }
            }
            else {
                d.b4(result);
                f = this.f;
                final Object element = f.element;
                if (element == a.l) {
                    flowKt__TransformKt$runningReduce$1$2 = this;
                    element2 = t;
                    break Label_0224;
                }
                final q<T, T, c<? super T>, Object> g = this.g;
                flowKt__TransformKt$runningReduce$1$1$emit$1.L$0 = this;
                flowKt__TransformKt$runningReduce$1$1$emit$1.L$1 = f;
                flowKt__TransformKt$runningReduce$1$1$emit$1.label = 1;
                final Object invoke = g.invoke(element, (Object)t, (Object)flowKt__TransformKt$runningReduce$1$1$emit$1);
                if (invoke == coroutine_SUSPENDED) {
                    return coroutine_SUSPENDED;
                }
                flowKt__TransformKt$runningReduce$1$1 = this;
                final Ref$ObjectRef ref$ObjectRef2 = f;
                result = invoke;
                ref$ObjectRef = ref$ObjectRef2;
            }
            element2 = result;
            f = ref$ObjectRef;
            flowKt__TransformKt$runningReduce$1$2 = flowKt__TransformKt$runningReduce$1$1;
        }
        f.element = element2;
        final f<T> h = flowKt__TransformKt$runningReduce$1$2.h;
        final Object element3 = flowKt__TransformKt$runningReduce$1$2.f.element;
        flowKt__TransformKt$runningReduce$1$1$emit$1.L$0 = null;
        flowKt__TransformKt$runningReduce$1$1$emit$1.L$1 = null;
        flowKt__TransformKt$runningReduce$1$1$emit$1.label = 2;
        if (h.emit(element3, (c)flowKt__TransformKt$runningReduce$1$1$emit$1) == coroutine_SUSPENDED) {
            return coroutine_SUSPENDED;
        }
        return j.a;
    }
}
