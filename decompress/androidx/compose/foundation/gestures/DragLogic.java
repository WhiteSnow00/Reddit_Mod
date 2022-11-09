// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.gestures;

import o0.h;
import o0.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ah2.f;
import o0.b;
import z0.h0;
import pg2.j;
import n1.c;
import mj2.b0;
import zg2.q;

public final class DragLogic
{
    public final q<b0, c, tg2.c<? super j>, Object> a;
    public final q<b0, Float, tg2.c<? super j>, Object> b;
    public final h0<b> c;
    public final o0.j d;
    
    public DragLogic(final q<? super b0, ? super c, ? super tg2.c<? super j>, ?> a, final q<? super b0, ? super Float, ? super tg2.c<? super j>, ?> b, final h0<b> c, final o0.j d) {
        f.f((Object)a, "onDragStarted");
        f.f((Object)b, "onDragStopped");
        f.f((Object)c, "dragStartInteraction");
        this.a = (q<b0, c, tg2.c<? super j>, Object>)a;
        this.b = (q<b0, Float, tg2.c<? super j>, Object>)b;
        this.c = c;
        this.d = d;
    }
    
    public final Object a(b0 l$1, final tg2.c<? super j> c) {
        DragLogic$processDragCancel$1 dragLogic$processDragCancel$1 = null;
        Label_0048: {
            if (c instanceof DragLogic$processDragCancel$1) {
                dragLogic$processDragCancel$1 = (DragLogic$processDragCancel$1)c;
                final int label = dragLogic$processDragCancel$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    dragLogic$processDragCancel$1.label = label + Integer.MIN_VALUE;
                    break Label_0048;
                }
            }
            dragLogic$processDragCancel$1 = new DragLogic$processDragCancel$1(this, (tg2.c)c);
        }
        final Object result = dragLogic$processDragCancel$1.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = dragLogic$processDragCancel$1.label;
        DragLogic dragLogic = null;
        Label_0217: {
            if (label2 != 0) {
                if (label2 != 1) {
                    if (label2 == 2) {
                        aj2.c.Q0(result);
                        return j.a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                else {
                    l$1 = (b0)dragLogic$processDragCancel$1.L$1;
                    dragLogic = (DragLogic)dragLogic$processDragCancel$1.L$0;
                    aj2.c.Q0(result);
                }
            }
            else {
                aj2.c.Q0(result);
                final b b = this.c.getValue();
                if (b == null) {
                    dragLogic = this;
                    break Label_0217;
                }
                final o0.j d = this.d;
                if (d != null) {
                    final a a = new a(b);
                    dragLogic$processDragCancel$1.L$0 = this;
                    dragLogic$processDragCancel$1.L$1 = l$1;
                    dragLogic$processDragCancel$1.label = 1;
                    if (d.a((h)a, (tg2.c<? super j>)dragLogic$processDragCancel$1) == coroutine_SUSPENDED) {
                        return coroutine_SUSPENDED;
                    }
                }
                dragLogic = this;
            }
            dragLogic.c.setValue(null);
        }
        final q<b0, Float, tg2.c<? super j>, Object> b2 = dragLogic.b;
        final Float n = new Float(0.0f);
        dragLogic$processDragCancel$1.L$0 = null;
        dragLogic$processDragCancel$1.L$1 = null;
        dragLogic$processDragCancel$1.label = 2;
        if (b2.invoke((Object)l$1, (Object)n, (Object)dragLogic$processDragCancel$1) == coroutine_SUSPENDED) {
            return coroutine_SUSPENDED;
        }
        return j.a;
    }
    
    public final Object b(b0 b0, n0.a.c c, final tg2.c<? super j> c2) {
        DragLogic$processDragStart$1 dragLogic$processDragStart$1 = null;
        Label_0052: {
            if (c2 instanceof DragLogic$processDragStart$1) {
                dragLogic$processDragStart$1 = (DragLogic$processDragStart$1)c2;
                final int label = dragLogic$processDragStart$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    dragLogic$processDragStart$1.label = label + Integer.MIN_VALUE;
                    break Label_0052;
                }
            }
            dragLogic$processDragStart$1 = new DragLogic$processDragStart$1(this, (tg2.c)c2);
        }
        final Object result = dragLogic$processDragStart$1.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = dragLogic$processDragStart$1.label;
        Object value = null;
        DragLogic dragLogic2 = null;
        b0 b4 = null;
        n0.a.c c3 = null;
        Label_0384: {
            b0 b2 = null;
            DragLogic dragLogic = null;
            Label_0375: {
                DragLogic l$0;
                if (label2 != 0) {
                    if (label2 != 1) {
                        if (label2 == 2) {
                            value = dragLogic$processDragStart$1.L$3;
                            c = (n0.a.c)dragLogic$processDragStart$1.L$2;
                            b2 = (b0)dragLogic$processDragStart$1.L$1;
                            dragLogic = (DragLogic)dragLogic$processDragStart$1.L$0;
                            aj2.c.Q0(result);
                            break Label_0375;
                        }
                        if (label2 == 3) {
                            aj2.c.Q0(result);
                            return j.a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    else {
                        c = (n0.a.c)dragLogic$processDragStart$1.L$2;
                        b0 = (b0)dragLogic$processDragStart$1.L$1;
                        l$0 = (DragLogic)dragLogic$processDragStart$1.L$0;
                        aj2.c.Q0(result);
                    }
                }
                else {
                    aj2.c.Q0(result);
                    final b b3 = this.c.getValue();
                    if (b3 != null) {
                        final o0.j d = this.d;
                        if (d != null) {
                            final a a = new a(b3);
                            dragLogic$processDragStart$1.L$0 = this;
                            dragLogic$processDragStart$1.L$1 = b0;
                            dragLogic$processDragStart$1.L$2 = c;
                            dragLogic$processDragStart$1.label = 1;
                            if (d.a((h)a, (tg2.c<? super j>)dragLogic$processDragStart$1) == coroutine_SUSPENDED) {
                                return coroutine_SUSPENDED;
                            }
                        }
                    }
                    l$0 = this;
                }
                final b l$2 = new b();
                final o0.j d2 = l$0.d;
                dragLogic2 = l$0;
                b4 = b0;
                c3 = c;
                value = l$2;
                if (d2 == null) {
                    break Label_0384;
                }
                dragLogic$processDragStart$1.L$0 = l$0;
                dragLogic$processDragStart$1.L$1 = b0;
                dragLogic$processDragStart$1.L$2 = c;
                dragLogic$processDragStart$1.L$3 = l$2;
                dragLogic$processDragStart$1.label = 2;
                if (d2.a((h)l$2, (tg2.c<? super j>)dragLogic$processDragStart$1) == coroutine_SUSPENDED) {
                    return coroutine_SUSPENDED;
                }
                final b0 b5 = b0;
                value = l$2;
                dragLogic = l$0;
                b2 = b5;
            }
            c3 = c;
            b4 = b2;
            dragLogic2 = dragLogic;
        }
        dragLogic2.c.setValue((b)value);
        final q<b0, c, tg2.c<? super j>, Object> a2 = dragLogic2.a;
        final c c4 = new c(c3.a);
        dragLogic$processDragStart$1.L$0 = null;
        dragLogic$processDragStart$1.L$1 = null;
        dragLogic$processDragStart$1.L$2 = null;
        dragLogic$processDragStart$1.L$3 = null;
        dragLogic$processDragStart$1.label = 3;
        if (a2.invoke((Object)b4, (Object)c4, (Object)dragLogic$processDragStart$1) == coroutine_SUSPENDED) {
            return coroutine_SUSPENDED;
        }
        return j.a;
    }
    
    public final Object c(b0 l$1, n0.a.d l$2, final tg2.c<? super j> c) {
        DragLogic$processDragStop$1 dragLogic$processDragStop$1 = null;
        Label_0052: {
            if (c instanceof DragLogic$processDragStop$1) {
                dragLogic$processDragStop$1 = (DragLogic$processDragStop$1)c;
                final int label = dragLogic$processDragStop$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    dragLogic$processDragStop$1.label = label + Integer.MIN_VALUE;
                    break Label_0052;
                }
            }
            dragLogic$processDragStop$1 = new DragLogic$processDragStop$1(this, (tg2.c)c);
        }
        final Object result = dragLogic$processDragStop$1.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = dragLogic$processDragStop$1.label;
        DragLogic dragLogic = null;
        Label_0244: {
            if (label2 != 0) {
                if (label2 != 1) {
                    if (label2 == 2) {
                        aj2.c.Q0(result);
                        return j.a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                else {
                    l$2 = (n0.a.d)dragLogic$processDragStop$1.L$2;
                    l$1 = (b0)dragLogic$processDragStop$1.L$1;
                    dragLogic = (DragLogic)dragLogic$processDragStop$1.L$0;
                    aj2.c.Q0(result);
                }
            }
            else {
                aj2.c.Q0(result);
                final b b = this.c.getValue();
                if (b == null) {
                    dragLogic = this;
                    break Label_0244;
                }
                final o0.j d = this.d;
                if (d != null) {
                    final o0.c c2 = new o0.c(b);
                    dragLogic$processDragStop$1.L$0 = this;
                    dragLogic$processDragStop$1.L$1 = l$1;
                    dragLogic$processDragStop$1.L$2 = l$2;
                    dragLogic$processDragStop$1.label = 1;
                    if (d.a((h)c2, (tg2.c<? super j>)dragLogic$processDragStop$1) == coroutine_SUSPENDED) {
                        return coroutine_SUSPENDED;
                    }
                }
                dragLogic = this;
            }
            dragLogic.c.setValue(null);
        }
        final q<b0, Float, tg2.c<? super j>, Object> b2 = dragLogic.b;
        final Float n = new Float(l$2.a);
        dragLogic$processDragStop$1.L$0 = null;
        dragLogic$processDragStop$1.L$1 = null;
        dragLogic$processDragStop$1.L$2 = null;
        dragLogic$processDragStop$1.label = 2;
        if (b2.invoke((Object)l$1, (Object)n, (Object)dragLogic$processDragStop$1) == coroutine_SUSPENDED) {
            return coroutine_SUSPENDED;
        }
        return j.a;
    }
}
