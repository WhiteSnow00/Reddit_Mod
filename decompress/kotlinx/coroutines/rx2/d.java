// 
// Decompiled by Procyon v0.6.0
// 

package kotlinx.coroutines.rx2;

import af2.y;
import af2.p;
import java.util.NoSuchElementException;
import af2.n;
import af2.a0;
import af2.t;
import af2.e0;
import af2.c0;
import cg2.j;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import zi2.m;
import gg2.c;
import af2.a;

public final class d
{
    public static final Object a(final a a, final c c) {
        final m m = new m(1, cg.d.e3(c));
        m.r();
        a.a((af2.c)new kotlinx.coroutines.rx2.a(m));
        final Object q = m.q();
        if (q == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return q;
        }
        return j.a;
    }
    
    public static final Object b(final c0 c0, final c c2) {
        final m m = new m(1, cg.d.e3(c2));
        m.r();
        c0.a((e0)new b(m));
        final Object q = m.q();
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        return q;
    }
    
    public static final Object c(final t t, final c c) {
        return e(t, Mode.FIRST, c);
    }
    
    public static final Object d(final t t, final c c) {
        return e(t, Mode.FIRST_OR_DEFAULT, c);
    }
    
    public static Object e(final t t, final Mode mode, final c c) {
        final m m = new m(1, cg.d.e3(c));
        m.r();
        ((y)t).subscribe((a0)new RxAwaitKt$awaitOne$2$1(m, mode, null));
        final Object q = m.q();
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        return q;
    }
    
    public static final Object f(final n n, final c c) {
        RxAwaitKt$awaitSingle$1 rxAwaitKt$awaitSingle$2 = null;
        Label_0046: {
            if (c instanceof RxAwaitKt$awaitSingle$1) {
                final RxAwaitKt$awaitSingle$1 rxAwaitKt$awaitSingle$1 = (RxAwaitKt$awaitSingle$1)c;
                final int label = rxAwaitKt$awaitSingle$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    rxAwaitKt$awaitSingle$1.label = label + Integer.MIN_VALUE;
                    rxAwaitKt$awaitSingle$2 = rxAwaitKt$awaitSingle$1;
                    break Label_0046;
                }
            }
            rxAwaitKt$awaitSingle$2 = new RxAwaitKt$awaitSingle$1(c);
        }
        final Object result = rxAwaitKt$awaitSingle$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = rxAwaitKt$awaitSingle$2.label;
        Object g;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cg.d.b4(result);
            g = result;
        }
        else {
            cg.d.b4(result);
            rxAwaitKt$awaitSingle$2.label = 1;
            if ((g = g(n, (c)rxAwaitKt$awaitSingle$2)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        if (g != null) {
            return g;
        }
        throw new NoSuchElementException();
    }
    
    public static final Object g(final n n, final c c) {
        final m m = new m(1, cg.d.e3(c));
        m.r();
        n.a((p)new kotlinx.coroutines.rx2.c(m));
        final Object q = m.q();
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        return q;
    }
}
