// 
// Decompiled by Procyon v0.6.0
// 

package kotlinx.coroutines.flow;

import cg.d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import cg2.j;
import gg2.c;
import cj2.f;
import mg2.p;
import cj2.e;

public final class FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 implements e<Object>
{
    public final e f;
    public final p g;
    
    public FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(final p g, final e f) {
        this.f = f;
        this.g = g;
    }
    
    public final Object a(final f f, final c c) {
        final Object a = this.f.a((f)new f(this.g, f) {
            public final f f;
            public final p g;
            
            public final Object emit(T l$0, final c<? super j> c) {
                FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$2 = null;
                Label_0051: {
                    if (c instanceof FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1) {
                        final FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1 = (FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1)c;
                        final int label = flowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1.label;
                        if ((label & Integer.MIN_VALUE) != 0x0) {
                            flowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1.label = label + Integer.MIN_VALUE;
                            flowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$2 = flowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1;
                            break Label_0051;
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
                            d.b4(result);
                            return j.a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    else {
                        f = (f)flowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$2.L$1;
                        l$0 = (T)flowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$2.L$0;
                        d.b4(result);
                    }
                }
                else {
                    d.b4(result);
                    f = this.f;
                    final p g = this.g;
                    flowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$2.L$0 = l$0;
                    flowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$2.L$1 = f;
                    flowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$2.label = 1;
                    if (g.invoke((Object)l$0, (Object)flowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$2) == coroutine_SUSPENDED) {
                        return coroutine_SUSPENDED;
                    }
                }
                flowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$2.L$0 = null;
                flowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$2.L$1 = null;
                flowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$2.label = 2;
                if (f.emit((Object)l$0, (c)flowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$2) == coroutine_SUSPENDED) {
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
