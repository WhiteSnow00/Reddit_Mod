// 
// Decompiled by Procyon v0.6.0
// 

package kotlinx.coroutines.channels;

import kotlinx.coroutines.f;
import mg2.p;
import zi2.c0;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContext$DefaultImpls;
import ng2.e;
import zi2.k0;
import zi2.s0;
import kotlin.coroutines.EmptyCoroutineContext;
import bj2.m;
import p5.a;
import cg2.j;
import zi2.g;
import cg.d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import gg2.c;
import bj2.t;

public final class b
{
    public static final CoroutineSingletons a(long j$0, long j$2, t l$0, final c c) {
        Object o = null;
        Label_0058: {
            if (c instanceof TickerChannelsKt$fixedDelayTicker$1) {
                final TickerChannelsKt$fixedDelayTicker$1 tickerChannelsKt$fixedDelayTicker$1 = (TickerChannelsKt$fixedDelayTicker$1)c;
                final int label = tickerChannelsKt$fixedDelayTicker$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    tickerChannelsKt$fixedDelayTicker$1.label = label + Integer.MIN_VALUE;
                    o = tickerChannelsKt$fixedDelayTicker$1;
                    break Label_0058;
                }
            }
            o = new TickerChannelsKt$fixedDelayTicker$1(c);
        }
        final Object result = ((TickerChannelsKt$fixedDelayTicker$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((TickerChannelsKt$fixedDelayTicker$1)o).label;
        while (true) {
            Label_0314: {
                Object o2 = null;
                Label_0275: {
                    if (label2 != 0) {
                        if (label2 != 1) {
                            if (label2 == 2) {
                                j$0 = ((TickerChannelsKt$fixedDelayTicker$1)o).J$0;
                                l$0 = (t)((TickerChannelsKt$fixedDelayTicker$1)o).L$0;
                                d.b4(result);
                                o2 = o;
                                break Label_0275;
                            }
                            if (label2 == 3) {
                                j$2 = ((TickerChannelsKt$fixedDelayTicker$1)o).J$0;
                                l$0 = (t)((TickerChannelsKt$fixedDelayTicker$1)o).L$0;
                                d.b4(result);
                                break Label_0314;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        else {
                            j$0 = ((TickerChannelsKt$fixedDelayTicker$1)o).J$0;
                            l$0 = (t)((TickerChannelsKt$fixedDelayTicker$1)o).L$0;
                            d.b4(result);
                            o2 = o;
                        }
                    }
                    else {
                        d.b4(result);
                        ((TickerChannelsKt$fixedDelayTicker$1)o).L$0 = l$0;
                        ((TickerChannelsKt$fixedDelayTicker$1)o).J$0 = j$0;
                        ((TickerChannelsKt$fixedDelayTicker$1)o).label = 1;
                        o2 = o;
                        if (g.c(j$2, (c)o) == coroutine_SUSPENDED) {
                            return coroutine_SUSPENDED;
                        }
                    }
                    final j a = j.a;
                    ((TickerChannelsKt$fixedDelayTicker$1)o2).L$0 = l$0;
                    ((TickerChannelsKt$fixedDelayTicker$1)o2).J$0 = j$0;
                    ((TickerChannelsKt$fixedDelayTicker$1)o2).label = 2;
                    if (l$0.c((Object)a, (c)o2) == coroutine_SUSPENDED) {
                        return coroutine_SUSPENDED;
                    }
                }
                ((TickerChannelsKt$fixedDelayTicker$1)o2).L$0 = l$0;
                ((TickerChannelsKt$fixedDelayTicker$1)o2).J$0 = j$0;
                ((TickerChannelsKt$fixedDelayTicker$1)o2).label = 3;
                o = o2;
                j$2 = j$0;
                if (g.c(j$0, (c)o2) != coroutine_SUSPENDED) {
                    break Label_0314;
                }
                return coroutine_SUSPENDED;
            }
            Object o2 = o;
            j$0 = j$2;
            continue;
        }
    }
    
    public static final CoroutineSingletons b(long n, long j$0, t t, final c c) {
        TickerChannelsKt$fixedPeriodTicker$1 tickerChannelsKt$fixedPeriodTicker$2 = null;
        Label_0058: {
            if (c instanceof TickerChannelsKt$fixedPeriodTicker$1) {
                final TickerChannelsKt$fixedPeriodTicker$1 tickerChannelsKt$fixedPeriodTicker$1 = (TickerChannelsKt$fixedPeriodTicker$1)c;
                final int label = tickerChannelsKt$fixedPeriodTicker$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    tickerChannelsKt$fixedPeriodTicker$1.label = label + Integer.MIN_VALUE;
                    tickerChannelsKt$fixedPeriodTicker$2 = tickerChannelsKt$fixedPeriodTicker$1;
                    break Label_0058;
                }
            }
            tickerChannelsKt$fixedPeriodTicker$2 = new TickerChannelsKt$fixedPeriodTicker$1(c);
        }
        final Object result = tickerChannelsKt$fixedPeriodTicker$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = tickerChannelsKt$fixedPeriodTicker$2.label;
    Label_0276_Outer:
        while (true) {
            while (true) {
                TickerChannelsKt$fixedPeriodTicker$1 tickerChannelsKt$fixedPeriodTicker$3 = null;
                Label_0333: {
                    Label_0271: {
                        if (label2 != 0) {
                            if (label2 == 1) {
                                j$0 = tickerChannelsKt$fixedPeriodTicker$2.J$1;
                                n = tickerChannelsKt$fixedPeriodTicker$2.J$0;
                                t = (t)tickerChannelsKt$fixedPeriodTicker$2.L$0;
                                d.b4(result);
                                break Label_0271;
                            }
                            if (label2 == 2) {
                                n = tickerChannelsKt$fixedPeriodTicker$2.J$1;
                                j$0 = tickerChannelsKt$fixedPeriodTicker$2.J$0;
                                t = (t)tickerChannelsKt$fixedPeriodTicker$2.L$0;
                                d.b4(result);
                                tickerChannelsKt$fixedPeriodTicker$3 = tickerChannelsKt$fixedPeriodTicker$2;
                                break Label_0333;
                            }
                            if (label2 != 3 && label2 != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            n = tickerChannelsKt$fixedPeriodTicker$2.J$1;
                            j$0 = tickerChannelsKt$fixedPeriodTicker$2.J$0;
                            t = (t)tickerChannelsKt$fixedPeriodTicker$2.L$0;
                            d.b4(result);
                        }
                        else {
                            d.b4(result);
                            final long j$2 = System.nanoTime() + a.f(j$0);
                            tickerChannelsKt$fixedPeriodTicker$2.L$0 = t;
                            tickerChannelsKt$fixedPeriodTicker$2.J$0 = n;
                            tickerChannelsKt$fixedPeriodTicker$2.J$1 = j$2;
                            tickerChannelsKt$fixedPeriodTicker$2.label = 1;
                            if (g.c(j$0, (c)tickerChannelsKt$fixedPeriodTicker$2) == coroutine_SUSPENDED) {
                                return coroutine_SUSPENDED;
                            }
                            j$0 = j$2;
                            break Label_0271;
                        }
                        break Label_0276;
                    }
                    n = a.f(n);
                    j$0 += n;
                    final j a = j.a;
                    tickerChannelsKt$fixedPeriodTicker$2.L$0 = t;
                    tickerChannelsKt$fixedPeriodTicker$2.J$0 = j$0;
                    tickerChannelsKt$fixedPeriodTicker$2.J$1 = n;
                    tickerChannelsKt$fixedPeriodTicker$2.label = 2;
                    if (t.c((Object)a, (c)tickerChannelsKt$fixedPeriodTicker$2) == coroutine_SUSPENDED) {
                        return coroutine_SUSPENDED;
                    }
                    tickerChannelsKt$fixedPeriodTicker$3 = tickerChannelsKt$fixedPeriodTicker$2;
                }
                final long nanoTime = System.nanoTime();
                long n2;
                if ((n2 = j$0 - nanoTime) < 0L) {
                    n2 = 0L;
                }
                if (n2 == 0L && n != 0L) {
                    final long n3 = n - (nanoTime - j$0) % n;
                    j$0 = nanoTime + n3;
                    final long n4 = n3 / 1000000L;
                    tickerChannelsKt$fixedPeriodTicker$3.L$0 = t;
                    tickerChannelsKt$fixedPeriodTicker$3.J$0 = j$0;
                    tickerChannelsKt$fixedPeriodTicker$3.J$1 = n;
                    tickerChannelsKt$fixedPeriodTicker$3.label = 3;
                    if (g.c(n4, (c)tickerChannelsKt$fixedPeriodTicker$3) != coroutine_SUSPENDED) {
                        tickerChannelsKt$fixedPeriodTicker$2 = tickerChannelsKt$fixedPeriodTicker$3;
                        continue;
                    }
                }
                else {
                    final long n5 = n2 / 1000000L;
                    tickerChannelsKt$fixedPeriodTicker$3.L$0 = t;
                    tickerChannelsKt$fixedPeriodTicker$3.J$0 = j$0;
                    tickerChannelsKt$fixedPeriodTicker$3.J$1 = n;
                    tickerChannelsKt$fixedPeriodTicker$3.label = 4;
                    tickerChannelsKt$fixedPeriodTicker$2 = tickerChannelsKt$fixedPeriodTicker$3;
                    if (g.c(n5, (c)tickerChannelsKt$fixedPeriodTicker$3) != coroutine_SUSPENDED) {
                        continue Label_0276_Outer;
                    }
                }
                break;
            }
            break;
        }
        return coroutine_SUSPENDED;
    }
    
    public static m c(final long n) {
        final EmptyCoroutineContext instance = EmptyCoroutineContext.INSTANCE;
        final TickerMode fixed_PERIOD = TickerMode.FIXED_PERIOD;
        final int n2 = 1;
        if (n < 0L) {
            throw new IllegalArgumentException(m5.a.f("Expected non-negative delay, but has ", n, " ms").toString());
        }
        int n3;
        if (n >= 0L) {
            n3 = n2;
        }
        else {
            n3 = 0;
        }
        if (n3 != 0) {
            final s0 f = s0.f;
            final f b = k0.b;
            b.getClass();
            e.f((Object)instance, "context");
            return ProduceKt.b((c0)f, CoroutineContext$DefaultImpls.a((CoroutineContext)b, (CoroutineContext)instance), 0, (p)new TickerChannelsKt$ticker$3(fixed_PERIOD, n, n, (c)null));
        }
        throw new IllegalArgumentException(m5.a.f("Expected non-negative initial delay, but has ", n, " ms").toString());
    }
}
