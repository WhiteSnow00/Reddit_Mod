// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.gestures;

import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.platform.InspectableValueKt;
import ah2.f;
import mj2.b0;
import zg2.q;
import n0.g;
import j1.d;
import oj2.t;
import oj2.e;
import pg2.j;
import zg2.p;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.Pair;
import zg2.a;
import zg2.l;
import z1.o;
import androidx.compose.ui.input.pointer.PointerEventPass;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import java.io.Serializable;
import a2.h;
import z0.e1;
import z1.c;

public final class DraggableKt
{
    public static final Serializable a(c c, e1 l$1, e1 l$2, h h, Orientation orientation, final tg2.c c2) {
        DraggableKt$awaitDownAndSlop$1 draggableKt$awaitDownAndSlop$1 = null;
        Label_0054: {
            if (c2 instanceof DraggableKt$awaitDownAndSlop$1) {
                draggableKt$awaitDownAndSlop$1 = (DraggableKt$awaitDownAndSlop$1)c2;
                final int label = draggableKt$awaitDownAndSlop$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    draggableKt$awaitDownAndSlop$1.label = label + Integer.MIN_VALUE;
                    break Label_0054;
                }
            }
            draggableKt$awaitDownAndSlop$1 = new DraggableKt$awaitDownAndSlop$1(c2);
        }
        Object o = draggableKt$awaitDownAndSlop$1.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = draggableKt$awaitDownAndSlop$1.label;
        Object o2 = null;
        o o6 = null;
        Label_0651: {
            Label_0645: {
                Label_0570: {
                    Orientation orientation2 = null;
                    h h2 = null;
                    c c3 = null;
                    Label_0466: {
                        if (label2 != 0) {
                            if (label2 != 1) {
                                if (label2 == 2) {
                                    orientation2 = (Orientation)draggableKt$awaitDownAndSlop$1.L$2;
                                    h2 = (h)draggableKt$awaitDownAndSlop$1.L$1;
                                    c3 = (c)draggableKt$awaitDownAndSlop$1.L$0;
                                    aj2.c.Q0(o);
                                    break Label_0466;
                                }
                                if (label2 == 3) {
                                    o2 = draggableKt$awaitDownAndSlop$1.L$0;
                                    aj2.c.Q0(o);
                                    break Label_0570;
                                }
                                if (label2 == 4) {
                                    o2 = draggableKt$awaitDownAndSlop$1.L$0;
                                    aj2.c.Q0(o);
                                    break Label_0645;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            else {
                                orientation = (Orientation)draggableKt$awaitDownAndSlop$1.L$4;
                                h = (h)draggableKt$awaitDownAndSlop$1.L$3;
                                l$2 = (e1)draggableKt$awaitDownAndSlop$1.L$2;
                                l$1 = (e1)draggableKt$awaitDownAndSlop$1.L$1;
                                c = (c)draggableKt$awaitDownAndSlop$1.L$0;
                                aj2.c.Q0(o);
                            }
                        }
                        else {
                            aj2.c.Q0(o);
                            final PointerEventPass initial = PointerEventPass.Initial;
                            draggableKt$awaitDownAndSlop$1.L$0 = c;
                            draggableKt$awaitDownAndSlop$1.L$1 = l$1;
                            draggableKt$awaitDownAndSlop$1.L$2 = l$2;
                            draggableKt$awaitDownAndSlop$1.L$3 = h;
                            draggableKt$awaitDownAndSlop$1.L$4 = orientation;
                            draggableKt$awaitDownAndSlop$1.label = 1;
                            if ((o = TapGestureDetectorKt.c(c, initial, false, (tg2.c<? super o>)draggableKt$awaitDownAndSlop$1)) == coroutine_SUSPENDED) {
                                final Object o3 = coroutine_SUSPENDED;
                                return (Serializable)o3;
                            }
                        }
                        final o o4 = (o)o;
                        if (!(boolean)l$1.getValue().invoke((Object)o4)) {
                            return null;
                        }
                        Object o3;
                        if (((a)l$2.getValue()).invoke()) {
                            o4.a();
                            gn.a.U(h, o4);
                            o3 = new Pair((Object)o4, (Object)new Float(0.0f));
                        }
                        else {
                            draggableKt$awaitDownAndSlop$1.L$0 = c;
                            draggableKt$awaitDownAndSlop$1.L$1 = h;
                            draggableKt$awaitDownAndSlop$1.L$2 = orientation;
                            draggableKt$awaitDownAndSlop$1.L$3 = null;
                            draggableKt$awaitDownAndSlop$1.L$4 = null;
                            draggableKt$awaitDownAndSlop$1.label = 2;
                            o = TapGestureDetectorKt.b(c, false, (tg2.c<? super o>)draggableKt$awaitDownAndSlop$1);
                            if (o != coroutine_SUSPENDED) {
                                h2 = h;
                                c3 = c;
                                orientation2 = orientation;
                                break Label_0466;
                            }
                            o3 = coroutine_SUSPENDED;
                        }
                        return (Serializable)o3;
                    }
                    final o o5 = (o)o;
                    gn.a.U(h2, o5);
                    final Ref$FloatRef ref$FloatRef = new Ref$FloatRef();
                    final DraggableKt$awaitDownAndSlop$postPointerSlop$1 draggableKt$awaitDownAndSlop$postPointerSlop$1 = new DraggableKt$awaitDownAndSlop$postPointerSlop$1(h2, ref$FloatRef);
                    if (orientation2 == Orientation.Vertical) {
                        final long a = o5.a;
                        final int h3 = o5.h;
                        draggableKt$awaitDownAndSlop$1.L$0 = ref$FloatRef;
                        draggableKt$awaitDownAndSlop$1.L$1 = null;
                        draggableKt$awaitDownAndSlop$1.L$2 = null;
                        draggableKt$awaitDownAndSlop$1.label = 3;
                        o = DragGestureDetectorKt.f(c3, a, h3, (p<? super o, ? super Float, j>)draggableKt$awaitDownAndSlop$postPointerSlop$1, (tg2.c<? super o>)draggableKt$awaitDownAndSlop$1);
                        if (o == coroutine_SUSPENDED) {
                            final Object o3 = coroutine_SUSPENDED;
                            return (Serializable)o3;
                        }
                        o2 = ref$FloatRef;
                    }
                    else {
                        final long a2 = o5.a;
                        final int h4 = o5.h;
                        draggableKt$awaitDownAndSlop$1.L$0 = ref$FloatRef;
                        draggableKt$awaitDownAndSlop$1.L$1 = null;
                        draggableKt$awaitDownAndSlop$1.L$2 = null;
                        draggableKt$awaitDownAndSlop$1.label = 4;
                        o = DragGestureDetectorKt.c(c3, a2, h4, (p<? super o, ? super Float, j>)draggableKt$awaitDownAndSlop$postPointerSlop$1, (tg2.c<? super o>)draggableKt$awaitDownAndSlop$1);
                        if (o == coroutine_SUSPENDED) {
                            final Object o3 = coroutine_SUSPENDED;
                            return (Serializable)o3;
                        }
                        o2 = ref$FloatRef;
                        break Label_0645;
                    }
                }
                o6 = (o)o;
                break Label_0651;
            }
            o6 = (o)o;
        }
        if (o6 != null) {
            final Object o3 = new Pair((Object)o6, (Object)new Float(((Ref$FloatRef)o2).element));
            return (Serializable)o3;
        }
        Object o3 = null;
        return (Serializable)o3;
    }
    
    public static final Object b(final c c, final Pair pair, final h h, final e e, final boolean b, final Orientation orientation, final tg2.c c2) {
        final float floatValue = ((Number)pair.getSecond()).floatValue();
        final o o = (o)pair.getFirst();
        final Orientation vertical = Orientation.Vertical;
        long n;
        if (orientation == vertical) {
            n = yd.a.y0(0.0f, floatValue);
        }
        else {
            n = yd.a.y0(floatValue, 0.0f);
        }
        final long c3 = o.c;
        float n2;
        if (orientation == vertical) {
            n2 = n1.c.d(c3);
        }
        else {
            n2 = n1.c.c(c3);
        }
        final long e2 = n1.c.e(c3, n1.c.g(Math.signum(n2), n));
        ((t)e).e((Object)new n0.a.c(e2));
        float n3 = floatValue;
        if (b) {
            n3 = floatValue * -1;
        }
        ((t)e).e((Object)new n0.a.b(n3, e2));
        final DraggableKt$awaitDrag$dragTick$1 draggableKt$awaitDrag$dragTick$1 = new DraggableKt$awaitDrag$dragTick$1(h, orientation, (t)e, b);
        Object o2;
        if (orientation == vertical) {
            o2 = DragGestureDetectorKt.n(c, o.a, (l<? super o, j>)draggableKt$awaitDrag$dragTick$1, (tg2.c<? super Boolean>)c2);
        }
        else {
            o2 = DragGestureDetectorKt.k(c, o.a, (l<? super o, j>)draggableKt$awaitDrag$dragTick$1, (tg2.c<? super Boolean>)c2);
        }
        return o2;
    }
    
    public static final d c(final d d, final p<? super z0.d, ? super Integer, ? extends g> p10, final l<? super o, Boolean> l, final Orientation orientation, final boolean b, final o0.j j, final a<Boolean> a, final q<? super b0, ? super n1.c, ? super tg2.c<? super j>, ?> q, final q<? super b0, ? super Float, ? super tg2.c<? super j>, ?> q2, final boolean b2) {
        f.f((Object)d, "<this>");
        f.f((Object)l, "canDrag");
        f.f((Object)orientation, "orientation");
        f.f((Object)q, "onDragStarted");
        f.f((Object)q2, "onDragStopped");
        return ComposedModifierKt.a(d, InspectableValueKt.a, (q)new DraggableKt$draggable$9((p)p10, j, (a)a, (l)l, (q)q, (q)q2, orientation, b, b2));
    }
    
    public static d d(final n0.c c, final Orientation orientation, final boolean b, final o0.j j, final boolean b2, final q q, final boolean b3) {
        final d.a f = d.a.f;
        final DraggableKt$draggable$1 draggableKt$draggable$1 = new DraggableKt$draggable$1((tg2.c)null);
        ah2.f.f((Object)c, "state");
        ah2.f.f((Object)orientation, "orientation");
        ah2.f.f((Object)q, "onDragStopped");
        return c((d)f, (p<? super z0.d, ? super Integer, ? extends g>)new DraggableKt$draggable$3(c), (l<? super o, Boolean>)DraggableKt$draggable$4.INSTANCE, orientation, b, j, (a<Boolean>)new DraggableKt$draggable$5(b2), (q<? super b0, ? super n1.c, ? super tg2.c<? super j>, ?>)draggableKt$draggable$1, (q<? super b0, ? super Float, ? super tg2.c<? super j>, ?>)q, b3);
    }
}
