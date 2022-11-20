// 
// Decompiled by Procyon v0.6.0
// 

package kotlinx.coroutines.flow;

import kotlin.jvm.internal.Ref$ObjectRef;
import cg.d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import cg2.j;
import gg2.c;
import cj2.f;
import kotlin.collections.EmptyList;
import mg2.q;
import cj2.e;

public final class FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1 implements e<Object>
{
    public final Object f;
    public final e g;
    public final q h;
    
    public FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1(final EmptyList f, final q h, final e g) {
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public final Object a(final f<Object> l$1, final c<? super j> c) {
        Object o = null;
        Label_0051: {
            if (c instanceof FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1) {
                final FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1 flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1 = (FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1)c;
                final int label = flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1.label = label + Integer.MIN_VALUE;
                    o = flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1;
                    break Label_0051;
                }
            }
            o = new FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1(this, (c)c);
        }
        final Object result = ((FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1)o).label;
        Object o2;
        f f;
        FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1 flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1;
        if (label2 != 0) {
            if (label2 != 1) {
                if (label2 == 2) {
                    d.b4(result);
                    return j.a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            else {
                o2 = ((FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1)o).L$2;
                f = (f)((FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1)o).L$1;
                flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1 = (FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1)((FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1)o).L$0;
                d.b4(result);
            }
        }
        else {
            d.b4(result);
            final Ref$ObjectRef l$2 = new Ref$ObjectRef();
            final Object f2 = this.f;
            l$2.element = f2;
            ((FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1)o).L$0 = this;
            ((FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1)o).L$1 = l$1;
            ((FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1)o).L$2 = l$2;
            ((FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1)o).label = 1;
            if (l$1.emit(f2, (c)o) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1 = this;
            f = l$1;
            o2 = l$2;
        }
        final e g = flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1.g;
        final FlowKt__TransformKt$runningFold$1$1 flowKt__TransformKt$runningFold$1$1 = new FlowKt__TransformKt$runningFold$1$1((Ref$ObjectRef<Object>)o2, (mg2.q<Object, ? super Object, ? super c<Object>, ?>)flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1.h, (f<Object>)f);
        ((FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1)o).L$0 = null;
        ((FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1)o).L$1 = null;
        ((FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1)o).L$2 = null;
        ((FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1)o).label = 2;
        if (g.a((f)flowKt__TransformKt$runningFold$1$1, (c)o) == coroutine_SUSPENDED) {
            return coroutine_SUSPENDED;
        }
        return j.a;
    }
}
