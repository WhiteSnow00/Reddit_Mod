// 
// Decompiled by Procyon v0.6.0
// 

package kotlinx.coroutines.flow;

import cj2.w$a;
import cj2.w;
import cj2.o;
import mg2.p;
import kotlinx.coroutines.CoroutineStart;
import zi2.g;
import gg2.c;
import zi2.q1;
import zi2.c0;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;
import bj2.e$a;
import cj2.v;
import cj2.e;

public final class a
{
    public static final v a(final e e, int n) {
        bj2.e.O2.getClass();
        int b = e$a.b;
        if (n >= b) {
            b = n;
        }
        final int n2 = b - n;
        if (e instanceof kotlinx.coroutines.flow.internal.a) {
            final kotlinx.coroutines.flow.internal.a a = (kotlinx.coroutines.flow.internal.a)e;
            final e j = a.j();
            if (j != null) {
                final int g = a.g;
                if (g != -3 && g != -2 && g != 0) {
                    n = g;
                }
                else {
                    if (a.h == BufferOverflow.SUSPEND) {
                        n = n2;
                        if (g != 0) {
                            return new v(n, a.f, a.h, j);
                        }
                    }
                    else if (n == 0) {
                        n = 1;
                        return new v(n, a.f, a.h, j);
                    }
                    n = 0;
                }
                return new v(n, a.f, a.h, j);
            }
        }
        return new v(n2, (CoroutineContext)EmptyCoroutineContext.INSTANCE, BufferOverflow.SUSPEND, e);
    }
    
    public static final q1 b(final e e, final c0 c0) {
        return g.g(c0, null, null, (p)new FlowKt__CollectKt$launchIn$1(e, (c)null), 3);
    }
    
    public static final q1 c(final c0 c0, final CoroutineContext coroutineContext, final e e, final o o, final w w, final Object o2) {
        CoroutineStart coroutineStart;
        if (ng2.e.a((Object)w, (Object)w$a.a)) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        else {
            coroutineStart = CoroutineStart.UNDISPATCHED;
        }
        return g.f(c0, coroutineContext, coroutineStart, (p)new FlowKt__ShareKt$launchSharing$1(w, e, o, o2, (c)null));
    }
}
