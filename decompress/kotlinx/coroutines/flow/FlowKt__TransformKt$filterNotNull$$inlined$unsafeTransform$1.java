// 
// Decompiled by Procyon v0.6.0
// 

package kotlinx.coroutines.flow;

import yd.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import hg2.j;
import lg2.c;
import hj2.f;
import hj2.e;

public final class FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 implements e<Object>
{
    public final /* synthetic */ e f;
    
    public FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(final e f) {
        this.f = f;
    }
    
    @Override
    public final Object a(final f f, final c c) {
        final Object a = this.f.a(new f() {
            @Override
            public final Object emit(final T t, final c<? super j> c) {
                FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2$1 flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2$2 = null;
                Label_0050: {
                    if (c instanceof FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2$1) {
                        final FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2$1 flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2$1 = (FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2$1)c;
                        final int label = flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2$1.label;
                        if ((label & Integer.MIN_VALUE) != 0x0) {
                            flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2$1.label = label + Integer.MIN_VALUE;
                            flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2$2 = flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2$1;
                            break Label_0050;
                        }
                    }
                    flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2$2 = new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2$1(this, (c)c);
                }
                final Object result = flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2$2.result;
                final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
                final int label2 = flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2$2.label;
                if (label2 != 0) {
                    if (label2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b.k0(result);
                }
                else {
                    b.k0(result);
                    final f f = f;
                    if (t != null) {
                        flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2$2.label = 1;
                        if (f.emit(t, (c<? super j>)flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2$2) == coroutine_SUSPENDED) {
                            return coroutine_SUSPENDED;
                        }
                    }
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
