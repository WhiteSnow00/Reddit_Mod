// 
// Decompiled by Procyon v0.6.0
// 

package kotlinx.coroutines.reactive;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import zi2.m;
import cg.d;
import gg2.c;
import af2.g;
import p2.b;
import kotlin.coroutines.CoroutineContext;

public final class a
{
    public static final void a(final CoroutineContext coroutineContext, final String s) {
        final StringBuilder sb = new StringBuilder();
        sb.append('\'');
        sb.append(s);
        sb.append("' was called after the publisher already signalled being in a terminal state");
        b.K(coroutineContext, (Throwable)new IllegalStateException(sb.toString()));
    }
    
    public static final Object b(g a, final c c) {
        final Mode single = Mode.SINGLE;
        final m m = new m(1, d.e3(c));
        m.r();
        final gj2.a[] a2 = gj2.b.a;
        for (int length = a2.length, i = 0; i < length; ++i) {
            a = a2[i].a();
        }
        a.subscribe((nt2.c)new AwaitKt$awaitOne$2$1(m, single, null));
        final Object q = m.q();
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        return q;
    }
}
