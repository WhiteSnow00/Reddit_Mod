// 
// Decompiled by Procyon v0.6.0
// 

package kotlinx.coroutines.internal;

import ng2.e;
import kotlin.coroutines.CoroutineContext;
import ej2.z;
import zi2.t1;
import kotlin.coroutines.CoroutineContext$a;
import mg2.p;
import ej2.t;

public final class ThreadContextKt
{
    public static final t a;
    public static final p<Object, CoroutineContext$a, Object> b;
    public static final p<t1<?>, CoroutineContext$a, t1<?>> c;
    public static final p<z, CoroutineContext$a, z> d;
    
    static {
        a = new t("NO_THREAD_ELEMENTS");
        b = (p)ThreadContextKt$countAll$1.INSTANCE;
        c = (p)ThreadContextKt$findOne$1.INSTANCE;
        d = (p)ThreadContextKt$updateState$1.INSTANCE;
    }
    
    public static final void a(final CoroutineContext coroutineContext, final Object o) {
        if (o == ThreadContextKt.a) {
            return;
        }
        if (o instanceof z) {
            final z z = (z)o;
            int n = z.c.length - 1;
            if (n >= 0) {
                while (true) {
                    final int n2 = n - 1;
                    final t1 t1 = z.c[n];
                    e.c((Object)t1);
                    t1.n(z.b[n]);
                    if (n2 < 0) {
                        break;
                    }
                    n = n2;
                }
            }
        }
        else {
            final Object fold = coroutineContext.fold((Object)null, (p)ThreadContextKt.c);
            if (fold == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            }
            ((t1)fold).n(o);
        }
    }
    
    public static final Object b(final CoroutineContext coroutineContext) {
        final Object fold = coroutineContext.fold((Object)0, (p)ThreadContextKt.b);
        e.c(fold);
        return fold;
    }
    
    public static final Object c(final CoroutineContext coroutineContext, final Object o) {
        Object b = o;
        if (o == null) {
            b = b(coroutineContext);
        }
        Object o2;
        if (b == Integer.valueOf(0)) {
            o2 = ThreadContextKt.a;
        }
        else if (b instanceof Integer) {
            o2 = coroutineContext.fold((Object)new z(coroutineContext, ((Number)b).intValue()), (p)ThreadContextKt.d);
        }
        else {
            o2 = ((t1)b).S(coroutineContext);
        }
        return o2;
    }
}
