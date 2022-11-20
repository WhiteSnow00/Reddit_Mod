// 
// Decompiled by Procyon v0.6.0
// 

package kotlinx.coroutines;

import kotlin.Pair;
import zi2.y1;
import zi2.x1;
import gg2.c;
import ij2.b;
import kotlin.coroutines.CoroutineContext$b;
import gg2.d$a;
import zi2.k0;
import zi2.c0;
import mg2.p;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.coroutines.CoroutineContext;

public final class CoroutineContextKt
{
    public static final CoroutineContext a(CoroutineContext coroutineContext, final CoroutineContext element, final boolean b) {
        final boolean b2 = b(coroutineContext);
        final boolean b3 = b(element);
        if (!b2 && !b3) {
            return coroutineContext.plus(element);
        }
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = element;
        final EmptyCoroutineContext instance = EmptyCoroutineContext.INSTANCE;
        coroutineContext = (CoroutineContext)coroutineContext.fold((Object)instance, (p)new CoroutineContextKt$foldCopies$folded$1(ref$ObjectRef, b));
        if (b3) {
            ref$ObjectRef.element = ((CoroutineContext)ref$ObjectRef.element).fold((Object)instance, (p)CoroutineContextKt$foldCopies$1.INSTANCE);
        }
        return coroutineContext.plus((CoroutineContext)ref$ObjectRef.element);
    }
    
    public static final boolean b(final CoroutineContext coroutineContext) {
        return (boolean)coroutineContext.fold((Object)Boolean.FALSE, (p)CoroutineContextKt$hasCopyableElements$1.INSTANCE);
    }
    
    public static final CoroutineContext c(final c0 c0, CoroutineContext a) {
        a = a(c0.Kx(), a, true);
        final b a2 = k0.a;
        CoroutineContext plus = a;
        if (a != a2) {
            plus = a;
            if (a.get((CoroutineContext$b)d$a.f) == null) {
                plus = a.plus((CoroutineContext)a2);
            }
        }
        return plus;
    }
    
    public static final x1<?> d(final c<?> c, final CoroutineContext coroutineContext, final Object o) {
        final boolean b = c instanceof hg2.b;
        final x1<?> x1 = null;
        if (!b) {
            return null;
        }
        if (coroutineContext.get((CoroutineContext$b)y1.f) == null) {
            return null;
        }
        hg2.b b2 = (hg2.b)c;
        while (true) {
            while (!(b2 instanceof kotlinx.coroutines.c)) {
                final hg2.b callerFrame = b2.getCallerFrame();
                x1 x2;
                if (callerFrame == null) {
                    x2 = x1;
                }
                else {
                    b2 = callerFrame;
                    if (!(callerFrame instanceof x1)) {
                        continue;
                    }
                    x2 = (x1)callerFrame;
                }
                if (x2 != null) {
                    x2.i.set(new Pair((Object)coroutineContext, o));
                }
                return (x1<?>)x2;
            }
            x1 x2 = x1;
            continue;
        }
    }
}
