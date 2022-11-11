// 
// Decompiled by Procyon v0.6.0
// 

package kotlinx.coroutines.flow;

import kotlin.jvm.internal.Ref$ObjectRef;
import yd.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import hg2.j;
import lg2.c;
import hj2.f;
import kotlin.collections.EmptyList;
import rg2.q;
import hj2.e;

public final class FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1 implements e<Object>
{
    public final /* synthetic */ Object f;
    public final /* synthetic */ e g;
    public final /* synthetic */ q h;
    
    public FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1(final EmptyList f, final q h, final e g) {
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    @Override
    public final Object a(final f<Object> l$1, final c<? super j> c) {
        FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1 flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$2 = null;
        Label_0050: {
            if (c instanceof FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1) {
                final FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1 flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1 = (FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1)c;
                final int label = flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1.label = label + Integer.MIN_VALUE;
                    flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$2 = flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1;
                    break Label_0050;
                }
            }
            flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$2 = new FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1(this, (c)c);
        }
        final Object result = flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$2.label;
        Object o;
        f<Object> f;
        FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1 flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1;
        if (label2 != 0) {
            if (label2 != 1) {
                if (label2 == 2) {
                    b.k0(result);
                    return j.a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            else {
                o = flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$2.L$2;
                f = (f)flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$2.L$1;
                flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1 = (FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1)flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$2.L$0;
                b.k0(result);
            }
        }
        else {
            b.k0(result);
            final Ref$ObjectRef l$2 = new Ref$ObjectRef();
            final Object f2 = this.f;
            l$2.element = f2;
            flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$2.L$0 = this;
            flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$2.L$1 = l$1;
            flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$2.L$2 = l$2;
            flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$2.label = 1;
            if (l$1.emit(f2, (c<? super j>)flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$2) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            o = l$2;
            flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1 = this;
            f = l$1;
        }
        final e g = flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1.g;
        final FlowKt__TransformKt$runningFold$1$1 flowKt__TransformKt$runningFold$1$1 = new FlowKt__TransformKt$runningFold$1$1((Ref$ObjectRef)o, flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1.h, f);
        flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$2.L$0 = null;
        flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$2.L$1 = null;
        flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$2.L$2 = null;
        flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$2.label = 2;
        if (g.a(flowKt__TransformKt$runningFold$1$1, (c)flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$2) == coroutine_SUSPENDED) {
            return coroutine_SUSPENDED;
        }
        return j.a;
    }
}
