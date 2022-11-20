// 
// Decompiled by Procyon v0.6.0
// 

package kotlinx.coroutines.flow;

import kotlinx.coroutines.channels.a;
import cj2.a0;
import bj2.h;
import cg.d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import cg2.j;
import gg2.c;
import bj2.p;
import cj2.f;

public final class FlowKt__ChannelsKt
{
    public static final <T> Object a(f<? super T> o, p<? extends T> p, boolean z$0, c<? super j> l$0) {
        FlowKt__ChannelsKt$emitAllImpl$1 flowKt__ChannelsKt$emitAllImpl$1 = null;
        Label_0053: {
            if (l$0 instanceof FlowKt__ChannelsKt$emitAllImpl$1) {
                final Object l$2 = l$0;
                final int label = ((FlowKt__ChannelsKt$emitAllImpl$1)l$2).label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    ((FlowKt__ChannelsKt$emitAllImpl$1)l$2).label = label + Integer.MIN_VALUE;
                    flowKt__ChannelsKt$emitAllImpl$1 = (FlowKt__ChannelsKt$emitAllImpl$1)l$2;
                    break Label_0053;
                }
            }
            flowKt__ChannelsKt$emitAllImpl$1 = new FlowKt__ChannelsKt$emitAllImpl$1((c)l$0);
        }
        final Object result = flowKt__ChannelsKt$emitAllImpl$1.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = flowKt__ChannelsKt$emitAllImpl$1.label;
        while (true) {
            Label_0409: {
                Label_0203: {
                    if (label2 == 0) {
                        break Label_0203;
                    }
                    Label_0138: {
                        if (label2 == 1) {
                            break Label_0138;
                        }
                        Label_0128: {
                            if (label2 != 2) {
                                break Label_0128;
                            }
                            boolean z$2 = flowKt__ChannelsKt$emitAllImpl$1.Z$0;
                            p = (p)flowKt__ChannelsKt$emitAllImpl$1.L$1;
                            Object l$2 = flowKt__ChannelsKt$emitAllImpl$1.L$0;
                            z$0 = z$2;
                            o = p;
                            try {
                                d.b4(result);
                                o = flowKt__ChannelsKt$emitAllImpl$1;
                                z$0 = z$2;
                                break Label_0409;
                                z$2 = flowKt__ChannelsKt$emitAllImpl$1.Z$0;
                                p = (p)flowKt__ChannelsKt$emitAllImpl$1.L$1;
                                Object o2 = flowKt__ChannelsKt$emitAllImpl$1.L$0;
                                z$0 = z$2;
                                o = p;
                                d.b4(result);
                                z$0 = z$2;
                                o = p;
                                final Object a = ((h)result).a;
                                l$2 = flowKt__ChannelsKt$emitAllImpl$1;
                                o2 = a;
                                break Label_0409;
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            finally {
                                break Label_0409;
                            }
                        }
                    }
                }
                d.b4(result);
                if (o instanceof a0) {
                    throw ((a0)o).f;
                }
                Object l$2 = o;
                o = flowKt__ChannelsKt$emitAllImpl$1;
                try {
                    ((FlowKt__ChannelsKt$emitAllImpl$1)o).L$0 = l$2;
                    ((FlowKt__ChannelsKt$emitAllImpl$1)o).L$1 = p;
                    ((FlowKt__ChannelsKt$emitAllImpl$1)o).Z$0 = z$0;
                    ((FlowKt__ChannelsKt$emitAllImpl$1)o).label = 1;
                    Object o2 = p.N((c)o);
                    if (o2 == coroutine_SUSPENDED) {
                        return coroutine_SUSPENDED;
                    }
                    l$0 = (FlowKt__ChannelsKt$emitAllImpl$1)l$2;
                    final boolean z$2 = z$0;
                    l$2 = o;
                    z$0 = z$2;
                    if (o2 instanceof h.a) {
                        z$0 = z$2;
                        final Throwable a2 = h.a(o2);
                        if (a2 == null) {
                            if (z$2) {
                                a.i(p, null);
                            }
                            return j.a;
                        }
                        z$0 = z$2;
                        throw a2;
                    }
                    else {
                        z$0 = z$2;
                        h.b(o2);
                        z$0 = z$2;
                        ((FlowKt__ChannelsKt$emitAllImpl$1)l$2).L$0 = l$0;
                        z$0 = z$2;
                        ((FlowKt__ChannelsKt$emitAllImpl$1)l$2).L$1 = p;
                        z$0 = z$2;
                        ((FlowKt__ChannelsKt$emitAllImpl$1)l$2).Z$0 = z$2;
                        z$0 = z$2;
                        ((FlowKt__ChannelsKt$emitAllImpl$1)l$2).label = 2;
                        z$0 = z$2;
                        o2 = ((f)l$0).emit(o2, (c)l$2);
                        l$2 = l$0;
                        if (o2 == coroutine_SUSPENDED) {
                            return coroutine_SUSPENDED;
                        }
                        continue;
                    }
                }
                finally {
                    o = p;
                    try {}
                    finally {
                        if (z$0) {
                            a.i((p)o, (Throwable)l$0);
                        }
                    }
                }
            }
            break;
        }
        throw ((a0)o).f;
    }
}
