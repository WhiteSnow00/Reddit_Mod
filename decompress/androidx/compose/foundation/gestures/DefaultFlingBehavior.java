// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.gestures;

import l0.e;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import zg2.l;
import androidx.compose.animation.core.SuspendAnimationKt;
import a80.a;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import tg2.c;
import n0.j;
import ah2.f;
import l0.n;
import n0.d;

public final class DefaultFlingBehavior implements d
{
    public final n<Float> a;
    
    public DefaultFlingBehavior(final n<Float> a) {
        f.f((Object)a, "flingDecay");
        this.a = a;
    }
    
    @Override
    public final Object a(final j j, final float element, final c<? super Float> c) {
        DefaultFlingBehavior$performFling.DefaultFlingBehavior$performFling$1 defaultFlingBehavior$performFling$2 = null;
        Label_0054: {
            if (c instanceof DefaultFlingBehavior$performFling.DefaultFlingBehavior$performFling$1) {
                final DefaultFlingBehavior$performFling.DefaultFlingBehavior$performFling$1 defaultFlingBehavior$performFling$1 = (DefaultFlingBehavior$performFling.DefaultFlingBehavior$performFling$1)c;
                final int label = defaultFlingBehavior$performFling$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    defaultFlingBehavior$performFling$1.label = label + Integer.MIN_VALUE;
                    defaultFlingBehavior$performFling$2 = defaultFlingBehavior$performFling$1;
                    break Label_0054;
                }
            }
            defaultFlingBehavior$performFling$2 = new DefaultFlingBehavior$performFling.DefaultFlingBehavior$performFling$1(this, (c)c);
        }
        final Object result = defaultFlingBehavior$performFling$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = defaultFlingBehavior$performFling$2.label;
        Object o;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o = defaultFlingBehavior$performFling$2.L$0;
            aj2.c.Q0(result);
        }
        else {
            aj2.c.Q0(result);
            final float element2 = element;
            if (Math.abs(element) <= 1.0f) {
                return new Float(element2);
            }
            final Ref$FloatRef l$0 = new Ref$FloatRef();
            l$0.element = element;
            final Ref$FloatRef ref$FloatRef = new Ref$FloatRef();
            final e b = a80.a.b(0.0f, element, 28);
            final n<Float> a = this.a;
            final DefaultFlingBehavior$performFling.DefaultFlingBehavior$performFling$2 defaultFlingBehavior$performFling$3 = new DefaultFlingBehavior$performFling.DefaultFlingBehavior$performFling$2(ref$FloatRef, j, l$0);
            defaultFlingBehavior$performFling$2.L$0 = l$0;
            defaultFlingBehavior$performFling$2.label = 1;
            if (SuspendAnimationKt.c(b, (n)a, (l)defaultFlingBehavior$performFling$3, (ContinuationImpl)defaultFlingBehavior$performFling$2) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            o = l$0;
        }
        final float element2 = ((Ref$FloatRef)o).element;
        return new Float(element2);
    }
}
