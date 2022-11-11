// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.gestures;

import mj2.g;
import zg2.p;
import u2.b;
import zg2.l;
import z1.v;
import yd.a;
import ah2.f;
import androidx.compose.ui.input.pointer.PointerEventPass;
import java.util.List;
import z1.o;
import z1.k;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import pg2.j;
import n1.c;
import n0.h;
import zg2.q;

public final class TapGestureDetectorKt
{
    public static final q<h, c, tg2.c<? super j>, Object> a;
    
    static {
        a = (q)new TapGestureDetectorKt$NoPressGesture$1((tg2.c)null);
    }
    
    public static final Object a(z1.c l$0, final tg2.c c) {
        TapGestureDetectorKt$consumeUntilUp$1 tapGestureDetectorKt$consumeUntilUp$2 = null;
        Label_0046: {
            if (c instanceof TapGestureDetectorKt$consumeUntilUp$1) {
                final TapGestureDetectorKt$consumeUntilUp$1 tapGestureDetectorKt$consumeUntilUp$1 = (TapGestureDetectorKt$consumeUntilUp$1)c;
                final int label = tapGestureDetectorKt$consumeUntilUp$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    tapGestureDetectorKt$consumeUntilUp$1.label = label + Integer.MIN_VALUE;
                    tapGestureDetectorKt$consumeUntilUp$2 = tapGestureDetectorKt$consumeUntilUp$1;
                    break Label_0046;
                }
            }
            tapGestureDetectorKt$consumeUntilUp$2 = new TapGestureDetectorKt$consumeUntilUp$1(c);
        }
        Object o = tapGestureDetectorKt$consumeUntilUp$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = tapGestureDetectorKt$consumeUntilUp$2.label;
        while (true) {
            Label_0132: {
                if (label2 != 0) {
                    if (label2 == 1) {
                        l$0 = (z1.c)tapGestureDetectorKt$consumeUntilUp$2.L$0;
                        aj2.c.Q0(o);
                        break Label_0132;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                else {
                    aj2.c.Q0(o);
                }
                tapGestureDetectorKt$consumeUntilUp$2.L$0 = l$0;
                tapGestureDetectorKt$consumeUntilUp$2.label = 1;
                if ((o = z1.c.O0(l$0, (BaseContinuationImpl)tapGestureDetectorKt$consumeUntilUp$2)) == coroutine_SUSPENDED) {
                    return coroutine_SUSPENDED;
                }
            }
            final k k = (k)o;
            final List<o> a2 = k.a;
            final int size = a2.size();
            final int n = 0;
            for (int i = 0; i < size; ++i) {
                ((o)a2.get(i)).a();
            }
            final List<o> a3 = k.a;
            final int size2 = a3.size();
            int n2 = 0;
            int n3;
            while (true) {
                n3 = n;
                if (n2 >= size2) {
                    break;
                }
                if (((o)a3.get(n2)).d) {
                    n3 = 1;
                    break;
                }
                ++n2;
            }
            if (n3 != 0) {
                continue;
            }
            break;
        }
        return j.a;
    }
    
    public static final Object b(final z1.c c, final boolean b, final tg2.c<? super o> c2) {
        return c(c, PointerEventPass.Main, b, c2);
    }
    
    public static final Object c(z1.c l$0, PointerEventPass l$2, boolean z$0, final tg2.c<? super o> c) {
        Object o = null;
        Label_0053: {
            if (c instanceof TapGestureDetectorKt$awaitFirstDownOnPass$1) {
                final TapGestureDetectorKt$awaitFirstDownOnPass$1 tapGestureDetectorKt$awaitFirstDownOnPass$1 = (TapGestureDetectorKt$awaitFirstDownOnPass$1)c;
                final int label = tapGestureDetectorKt$awaitFirstDownOnPass$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    tapGestureDetectorKt$awaitFirstDownOnPass$1.label = label + Integer.MIN_VALUE;
                    o = tapGestureDetectorKt$awaitFirstDownOnPass$1;
                    break Label_0053;
                }
            }
            o = new TapGestureDetectorKt$awaitFirstDownOnPass$1((tg2.c)c);
        }
        Object result = ((TapGestureDetectorKt$awaitFirstDownOnPass$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((TapGestureDetectorKt$awaitFirstDownOnPass$1)o).label;
        while (true) {
        Label_0126:
            while (true) {
                boolean z$2 = false;
                Label_0173: {
                    if (label2 != 0) {
                        if (label2 == 1) {
                            z$2 = ((TapGestureDetectorKt$awaitFirstDownOnPass$1)o).Z$0;
                            l$2 = (PointerEventPass)((TapGestureDetectorKt$awaitFirstDownOnPass$1)o).L$1;
                            l$0 = (z1.c)((TapGestureDetectorKt$awaitFirstDownOnPass$1)o).L$0;
                            aj2.c.Q0(result);
                            break Label_0173;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    else {
                        aj2.c.Q0(result);
                    }
                    ((TapGestureDetectorKt$awaitFirstDownOnPass$1)o).L$0 = l$0;
                    ((TapGestureDetectorKt$awaitFirstDownOnPass$1)o).L$1 = l$2;
                    ((TapGestureDetectorKt$awaitFirstDownOnPass$1)o).Z$0 = z$0;
                    ((TapGestureDetectorKt$awaitFirstDownOnPass$1)o).label = 1;
                    final Object p4 = l$0.P(l$2, (BaseContinuationImpl)o);
                    z$2 = z$0;
                    if ((result = p4) == coroutine_SUSPENDED) {
                        return coroutine_SUSPENDED;
                    }
                }
                final k k = (k)result;
                final List<o> a = k.a;
                final int size = a.size();
                int i = 0;
                while (i < size) {
                    final o o2 = a.get(i);
                    boolean h0;
                    if (z$2) {
                        f.f((Object)o2, "<this>");
                        h0 = (!o2.b() && !o2.g && o2.d);
                    }
                    else {
                        h0 = yd.a.H0(o2);
                    }
                    if (!h0) {
                        final boolean b = false;
                        z$0 = z$2;
                        if (b) {
                            return k.a.get(0);
                        }
                        continue Label_0126;
                    }
                    else {
                        ++i;
                    }
                }
                break;
            }
            final boolean b = true;
            continue;
        }
    }
    
    public static final Object d(final v v, final q<? super h, ? super c, ? super tg2.c<? super j>, ?> q, final l<? super c, j> l, final tg2.c<? super j> c) {
        final Object b = ForEachGestureKt.b(v, (p<? super v, ? super tg2.c<? super j>, ?>)new TapGestureDetectorKt$detectTapAndPress$2(new PressGestureScopeImpl((b)v), (q)q, (l)l, (tg2.c)null), c);
        if (b == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return b;
        }
        return j.a;
    }
    
    public static final Object e(final v v, final q q, final l l, final l i, final l j, final tg2.c c) {
        final Object e = g.e((p)new TapGestureDetectorKt$detectTapGestures$2(v, q, i, l, j, (tg2.c)null), c);
        if (e == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return e;
        }
        return j.a;
    }
    
    public static final Object g(z1.c c, final tg2.c<? super o> c2) {
        Object o = null;
        Label_0046: {
            if (c2 instanceof TapGestureDetectorKt$waitForUpOrCancellation$1) {
                final TapGestureDetectorKt$waitForUpOrCancellation$1 tapGestureDetectorKt$waitForUpOrCancellation$1 = (TapGestureDetectorKt$waitForUpOrCancellation$1)c2;
                final int label = tapGestureDetectorKt$waitForUpOrCancellation$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    tapGestureDetectorKt$waitForUpOrCancellation$1.label = label + Integer.MIN_VALUE;
                    o = tapGestureDetectorKt$waitForUpOrCancellation$1;
                    break Label_0046;
                }
            }
            o = new TapGestureDetectorKt$waitForUpOrCancellation$1((tg2.c)c2);
        }
        Object o2 = ((TapGestureDetectorKt$waitForUpOrCancellation$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((TapGestureDetectorKt$waitForUpOrCancellation$1)o).label;
        while (true) {
        Label_0119:
            while (true) {
                Label_0404: {
                    Label_0156: {
                        if (label2 != 0) {
                            if (label2 == 1) {
                                c = (z1.c)((TapGestureDetectorKt$waitForUpOrCancellation$1)o).L$0;
                                aj2.c.Q0(o2);
                                break Label_0156;
                            }
                            if (label2 == 2) {
                                c = (z1.c)((TapGestureDetectorKt$waitForUpOrCancellation$1)o).L$0;
                                aj2.c.Q0(o2);
                                break Label_0404;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        else {
                            aj2.c.Q0(o2);
                        }
                        final PointerEventPass main = PointerEventPass.Main;
                        ((TapGestureDetectorKt$waitForUpOrCancellation$1)o).L$0 = c;
                        ((TapGestureDetectorKt$waitForUpOrCancellation$1)o).label = 1;
                        if ((o2 = c.P(main, (BaseContinuationImpl)o)) == coroutine_SUSPENDED) {
                            return coroutine_SUSPENDED;
                        }
                    }
                    final k k = (k)o2;
                    final List<o> a = k.a;
                    final int size = a.size();
                    int i = 0;
                    while (true) {
                        while (i < size) {
                            final o o3 = a.get(i);
                            f.f((Object)o3, "<this>");
                            if (o3.b() || !o3.g || o3.d) {
                                final boolean b = false;
                                if (b) {
                                    return k.a.get(0);
                                }
                                final List<o> a2 = k.a;
                                final int size2 = a2.size();
                                int j = 0;
                                while (true) {
                                    while (j < size2) {
                                        final o o4 = a2.get(j);
                                        if (o4.b() || yd.a.L1(o4, c.a(), c.r0())) {
                                            final boolean b2 = true;
                                            if (b2) {
                                                return null;
                                            }
                                            final PointerEventPass final1 = PointerEventPass.Final;
                                            ((TapGestureDetectorKt$waitForUpOrCancellation$1)o).L$0 = c;
                                            ((TapGestureDetectorKt$waitForUpOrCancellation$1)o).label = 2;
                                            if ((o2 = c.P(final1, (BaseContinuationImpl)o)) == coroutine_SUSPENDED) {
                                                return coroutine_SUSPENDED;
                                            }
                                            break Label_0404;
                                        }
                                        else {
                                            ++j;
                                        }
                                    }
                                    final boolean b2 = false;
                                    continue;
                                }
                            }
                            else {
                                ++i;
                            }
                        }
                        final boolean b = true;
                        continue;
                    }
                }
                final List<o> a3 = ((k)o2).a;
                final int size3 = a3.size();
                int l = 0;
                while (l < size3) {
                    if (((o)a3.get(l)).b()) {
                        final boolean b3 = true;
                        if (b3) {
                            return null;
                        }
                        continue Label_0119;
                    }
                    else {
                        ++l;
                    }
                }
                break;
            }
            final boolean b3 = false;
            continue;
        }
    }
}
