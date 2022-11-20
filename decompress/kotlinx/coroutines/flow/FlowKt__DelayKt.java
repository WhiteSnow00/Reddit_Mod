// 
// Decompiled by Procyon v0.6.0
// 

package kotlinx.coroutines.flow;

import mg2.p;
import kotlinx.coroutines.channels.ProduceKt;
import m5.a;
import bj2.m;
import zi2.c0;
import mg2.q;
import gg2.c;
import mg2.l;
import cj2.e;

public final class FlowKt__DelayKt
{
    public static final <T> e<T> a(final e<? extends T> e, final long n) {
        final long n2 = lcmp(n, 0L);
        if (n2 < 0) {
            throw new IllegalArgumentException("Debounce timeout should not be negative".toString());
        }
        if (n2 == 0) {
            return (e<T>)e;
        }
        return (e<T>)b(e, (l)new FlowKt__DelayKt$debounce$2(n));
    }
    
    public static final kotlinx.coroutines.flow.internal.e b(final e e, final l l) {
        return new kotlinx.coroutines.flow.internal.e((q)new FlowKt__DelayKt$debounceInternal$1(l, e, (c)null));
    }
    
    public static final m c(final c0 c0, final long n, final long n2) {
        if (n < 0L) {
            throw new IllegalArgumentException(a.f("Expected non-negative delay, but has ", n, " ms").toString());
        }
        if (n2 >= 0L) {
            return ProduceKt.c(c0, 0, (p)new FlowKt__DelayKt$fixedPeriodTicker$3(n2, n, (c)null), 1);
        }
        throw new IllegalArgumentException(a.f("Expected non-negative initial delay, but has ", n2, " ms").toString());
    }
    
    public static final kotlinx.coroutines.flow.internal.e d(final e e, final long n) {
        if (n > 0L) {
            return new kotlinx.coroutines.flow.internal.e((q)new FlowKt__DelayKt$sample$2(n, e, (c)null));
        }
        throw new IllegalArgumentException("Sample period should be positive".toString());
    }
}
