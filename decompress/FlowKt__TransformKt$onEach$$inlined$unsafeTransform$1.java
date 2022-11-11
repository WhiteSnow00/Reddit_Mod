// 
// Decompiled by Procyon v0.6.0
// 

package kotlinx.coroutines.flow;

import yd.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import hg2.j;
import lg2.c;
import hj2.f;
import rg2.p;
import hj2.e;

public final class FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 implements e<Object>
{
    public final /* synthetic */ e f;
    public final /* synthetic */ p g;
    
    public FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(final p g, final e f) {
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final Object a(final f f, final c c) {
        final Object a = this.f.a(new f() {
            public final /* synthetic */ p g = FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1.this.g;
            
            @Override
            public final Object emit(T l$0, final c<? super j> c) {
                FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$2 = null;
                Label_0050: {
                    if (c instanceof FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1) {
                        final FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1 = (FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1)c;
                        final int label = flowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1.label;
                        if ((label & Integer.MIN_VALUE) != 0x0) {
                            flowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1.label = label + Integer.MIN_VALUE;
                            flowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$2 = flowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1;
                            break Label_0050;
                        }
                    }
                    flowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$2 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1(this, (c)c);
                }
                final Object result = flowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$2.result;
                final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
                final int label2 = flowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$2.label;
                f f;
                if (label2 != 0) {
                    if (label2 != 1) {
                        if (label2 == 2) {
                            b.k0(result);
                            return j.a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    else {
                        f = (f)flowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$2.L$1;
                        l$0 = (T)flowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$2.L$0;
                        b.k0(result);
                    }
                }
                else {
                    b.k0(result);
                    f = f;
                    final p g = this.g;
                    flowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$2.L$0 = l$0;
                    flowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$2.L$1 = f;
                    flowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$2.label = 1;
                    if (g.invoke(l$0, flowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$2) == coroutine_SUSPENDED) {
                        return coroutine_SUSPENDED;
                    }
                }
                flowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$2.L$0 = null;
                flowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$2.L$1 = null;
                flowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$2.label = 2;
                if (f.emit(l$0, (c<? super j>)flowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$2) == coroutine_SUSPENDED) {
                    return coroutine_SUSPENDED;
                }
                return j.a;
            }
        }, c);
        if (a == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return a;
        }
        return j.a;
    }
}
