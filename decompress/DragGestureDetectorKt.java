// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.gestures;

import ah2.f;
import androidx.compose.ui.platform.k1;
import zg2.l;
import androidx.compose.ui.input.pointer.PointerEventPass;
import pg2.j;
import java.util.List;
import yd.a;
import z1.n;
import z1.k;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.jvm.internal.Ref$LongRef;
import kotlinx.coroutines.TimeoutCancellationException;
import zg2.p;
import kotlinx.coroutines.TimeoutKt;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import tg2.c;
import z1.o;
import z1.v;

public final class DragGestureDetectorKt
{
    public static final float a;
    
    static {
        a = (float)0.125 / 18;
    }
    
    public static final Object a(v ex, o o, final c c) {
        Object o2 = null;
        Label_0049: {
            if (c instanceof DragGestureDetectorKt$awaitLongPressOrCancellation$1) {
                final DragGestureDetectorKt$awaitLongPressOrCancellation$1 dragGestureDetectorKt$awaitLongPressOrCancellation$1 = (DragGestureDetectorKt$awaitLongPressOrCancellation$1)c;
                final int label = dragGestureDetectorKt$awaitLongPressOrCancellation$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    dragGestureDetectorKt$awaitLongPressOrCancellation$1.label = label + Integer.MIN_VALUE;
                    o2 = dragGestureDetectorKt$awaitLongPressOrCancellation$1;
                    break Label_0049;
                }
            }
            o2 = new DragGestureDetectorKt$awaitLongPressOrCancellation$1((c<? super DragGestureDetectorKt$awaitLongPressOrCancellation$1>)c);
        }
        Object result = ((DragGestureDetectorKt$awaitLongPressOrCancellation$1)o2).result;
        final Object coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((DragGestureDetectorKt$awaitLongPressOrCancellation$1)o2).label;
        Label_0109: {
            if (label2 == 0) {
                break Label_0109;
            }
            Label_0099: {
                if (label2 != 1) {
                    break Label_0099;
                }
                ex = (TimeoutCancellationException)((DragGestureDetectorKt$awaitLongPressOrCancellation$1)o2).L$1;
                o = (o)((DragGestureDetectorKt$awaitLongPressOrCancellation$1)o2).L$0;
                while (true) {
                    try {
                        aj2.c.Q0(result);
                        Label_0200: {
                            break Label_0200;
                            aj2.c.Q0(result);
                            result = new Ref$ObjectRef();
                            final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                            ref$ObjectRef.element = o;
                            final long d = ((v)ex).getViewConfiguration().d();
                            try {
                                final DragGestureDetectorKt$awaitLongPressOrCancellation$2 dragGestureDetectorKt$awaitLongPressOrCancellation$2 = new DragGestureDetectorKt$awaitLongPressOrCancellation$2((v)ex, ref$ObjectRef, (Ref$ObjectRef)result, (c)null);
                                ((DragGestureDetectorKt$awaitLongPressOrCancellation$1)o2).L$0 = o;
                                ((DragGestureDetectorKt$awaitLongPressOrCancellation$1)o2).L$1 = result;
                                ((DragGestureDetectorKt$awaitLongPressOrCancellation$1)o2).label = 1;
                                if (TimeoutKt.b(d, (p)dragGestureDetectorKt$awaitLongPressOrCancellation$2, (c)o2) == coroutine_SUSPENDED) {
                                    ex = (TimeoutCancellationException)coroutine_SUSPENDED;
                                    return ex;
                                }
                                ex = null;
                                return ex;
                            }
                            catch (TimeoutCancellationException ex) {
                                ex = (TimeoutCancellationException)result;
                            }
                        }
                        ex = (TimeoutCancellationException)((Ref$ObjectRef)ex).element;
                        if (ex == null) {
                            ex = (TimeoutCancellationException)o;
                        }
                        return ex;
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    catch (final TimeoutCancellationException ex2) {
                        continue;
                    }
                    break;
                }
            }
        }
    }
    
    public static final Object b(final z1.c c, final long element, final c<? super o> c2) {
        Object o = null;
        Label_0053: {
            if (c2 instanceof DragGestureDetectorKt$awaitDragOrCancellation.DragGestureDetectorKt$awaitDragOrCancellation$1) {
                final DragGestureDetectorKt$awaitDragOrCancellation.DragGestureDetectorKt$awaitDragOrCancellation$1 dragGestureDetectorKt$awaitDragOrCancellation$1 = (DragGestureDetectorKt$awaitDragOrCancellation.DragGestureDetectorKt$awaitDragOrCancellation$1)c2;
                final int label = dragGestureDetectorKt$awaitDragOrCancellation$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    dragGestureDetectorKt$awaitDragOrCancellation$1.label = label + Integer.MIN_VALUE;
                    o = dragGestureDetectorKt$awaitDragOrCancellation$1;
                    break Label_0053;
                }
            }
            o = new DragGestureDetectorKt$awaitDragOrCancellation.DragGestureDetectorKt$awaitDragOrCancellation$1((c)c2);
        }
        Object o2 = ((DragGestureDetectorKt$awaitDragOrCancellation.DragGestureDetectorKt$awaitDragOrCancellation$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((DragGestureDetectorKt$awaitDragOrCancellation.DragGestureDetectorKt$awaitDragOrCancellation$1)o).label;
        final Object o3 = null;
        final int n = 1;
        while (true) {
        Label_0163:
            while (true) {
                Object l$1 = null;
                Label_0197: {
                    z1.c l$2;
                    if (label2 != 0) {
                        if (label2 == 1) {
                            l$1 = ((DragGestureDetectorKt$awaitDragOrCancellation.DragGestureDetectorKt$awaitDragOrCancellation$1)o).L$1;
                            l$2 = (z1.c)((DragGestureDetectorKt$awaitDragOrCancellation.DragGestureDetectorKt$awaitDragOrCancellation$1)o).L$0;
                            aj2.c.Q0(o2);
                            break Label_0197;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    else {
                        aj2.c.Q0(o2);
                        if (l(c.B0(), element)) {
                            return null;
                        }
                        final Ref$LongRef ref$LongRef = new Ref$LongRef();
                        ref$LongRef.element = element;
                        l$2 = c;
                        l$1 = ref$LongRef;
                    }
                    ((DragGestureDetectorKt$awaitDragOrCancellation.DragGestureDetectorKt$awaitDragOrCancellation$1)o).L$0 = l$2;
                    ((DragGestureDetectorKt$awaitDragOrCancellation.DragGestureDetectorKt$awaitDragOrCancellation$1)o).L$1 = l$1;
                    ((DragGestureDetectorKt$awaitDragOrCancellation.DragGestureDetectorKt$awaitDragOrCancellation$1)o).label = 1;
                    o2 = z1.c.O0(l$2, (BaseContinuationImpl)o);
                    if (o2 == coroutine_SUSPENDED) {
                        return coroutine_SUSPENDED;
                    }
                }
                final k k = (k)o2;
                final List<o> a = k.a;
                for (int size = a.size(), i = 0; i < size; ++i) {
                    final Object value = a.get(i);
                    if (z1.n.a(((o)value).a, ((Ref$LongRef)l$1).element)) {
                        final o o4 = (o)value;
                        o o6 = null;
                        Label_0406: {
                            if (o4 != null) {
                                Label_0439: {
                                    if (yd.a.I0(o4)) {
                                        final List<o> a2 = k.a;
                                        final int size2 = a2.size();
                                        int j = 0;
                                        while (true) {
                                            while (j < size2) {
                                                final Object value2 = a2.get(j);
                                                if (((o)value2).d) {
                                                    final o o5 = (o)value2;
                                                    if (o5 == null) {
                                                        o6 = o4;
                                                        break Label_0406;
                                                    }
                                                    ((Ref$LongRef)l$1).element = o5.a;
                                                    break Label_0439;
                                                }
                                                else {
                                                    ++j;
                                                }
                                            }
                                            final Object value2 = null;
                                            continue;
                                        }
                                    }
                                    if (n1.c.a(yd.a.g2(o4, true), n1.c.b) ^ true) {
                                        o6 = o4;
                                        break Label_0406;
                                    }
                                }
                                continue Label_0163;
                            }
                            o6 = null;
                        }
                        int n2;
                        if (o6 != null && !o6.b()) {
                            n2 = n;
                        }
                        else {
                            n2 = 0;
                        }
                        Object o7 = o3;
                        if (n2 != 0) {
                            o7 = o6;
                        }
                        return o7;
                    }
                }
                break;
            }
            final Object value = null;
            continue;
        }
    }
    
    public static final Object c(z1.c l$1, long f, int i, final p<? super o, ? super Float, j> p5, final c<? super o> c) {
        DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation.DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1 dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1 = null;
        Label_0054: {
            if (c instanceof DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation.DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1) {
                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1 = (DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation.DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1)c;
                final int label = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.label = label + Integer.MIN_VALUE;
                    break Label_0054;
                }
            }
            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1 = new DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation.DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1((c)c);
        }
        Object o = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.result;
        CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.label;
        final Object o2 = null;
        while (true) {
            p l$3 = null;
            z1.c c4 = null;
            Label_0721: {
                z1.c l$2 = null;
                Label_0709: {
                    o l$4 = null;
                    z1.c c2 = null;
                    DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation.DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1 dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$2 = null;
                    CoroutineSingletons coroutineSingletons = null;
                    Label_0684: {
                        float n = 0.0f;
                        float n2 = 0.0f;
                        Object o3 = null;
                        Label_0371: {
                            CoroutineSingletons coroutineSingletons2;
                            p<? super o, ? super Float, j> l$5;
                            if (label2 != 0) {
                                if (label2 == 1) {
                                    n = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.F$1;
                                    n2 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.F$0;
                                    o3 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$2;
                                    l$2 = (z1.c)dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$1;
                                    l$3 = (p)dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$0;
                                    aj2.c.Q0(o);
                                    break Label_0371;
                                }
                                if (label2 == 2) {
                                    n = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.F$1;
                                    n2 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.F$0;
                                    l$4 = (o)dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$3;
                                    o3 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$2;
                                    c2 = (z1.c)dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$1;
                                    l$3 = (p)dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$0;
                                    aj2.c.Q0(o);
                                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$2 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;
                                    coroutineSingletons = coroutine_SUSPENDED;
                                    break Label_0684;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            else {
                                aj2.c.Q0(o);
                                if (l(l$1.B0(), f)) {
                                    return o2;
                                }
                                n2 = m(l$1.getViewConfiguration(), i);
                                final Ref$LongRef ref$LongRef = new Ref$LongRef();
                                ref$LongRef.element = f;
                                o3 = ref$LongRef;
                                coroutineSingletons2 = coroutine_SUSPENDED;
                                n = 0.0f;
                                l$5 = p5;
                            }
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$0 = l$5;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$1 = l$1;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$2 = o3;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$3 = null;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.F$0 = n2;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.F$1 = n;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.label = 1;
                            o = z1.c.O0(l$1, (BaseContinuationImpl)dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1);
                            if (o == coroutineSingletons2) {
                                return coroutineSingletons2;
                            }
                            final p<? super o, ? super Float, j> p6 = l$5;
                            coroutine_SUSPENDED = coroutineSingletons2;
                            l$2 = l$1;
                            l$3 = p6;
                        }
                        final k k = (k)o;
                        final List<o> a = k.a;
                        final int size = a.size();
                        i = 0;
                        while (true) {
                            while (i < size) {
                                final Object value = a.get(i);
                                if (z1.n.a(((o)value).a, ((Ref$LongRef)o3).element)) {
                                    l$4 = (o)value;
                                    if (l$4 == null) {
                                        return null;
                                    }
                                    if (l$4.b()) {
                                        return null;
                                    }
                                    if (yd.a.I0(l$4)) {
                                        final List<o> a2 = k.a;
                                        final int size2 = a2.size();
                                        i = 0;
                                        while (true) {
                                            while (i < size2) {
                                                final Object value2 = a2.get(i);
                                                if (((o)value2).d) {
                                                    final o o5 = (o)value2;
                                                    if (o5 == null) {
                                                        return null;
                                                    }
                                                    ((Ref$LongRef)o3).element = o5.a;
                                                    break Label_0709;
                                                }
                                                else {
                                                    ++i;
                                                }
                                            }
                                            final Object value2 = null;
                                            continue;
                                        }
                                    }
                                    final long c3 = l$4.c;
                                    f = l$4.f;
                                    n += n1.c.c(c3) - n1.c.c(f);
                                    if (Math.abs(n) < n2) {
                                        final PointerEventPass final1 = PointerEventPass.Final;
                                        dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$0 = l$3;
                                        dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$1 = l$2;
                                        dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$2 = o3;
                                        dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$3 = l$4;
                                        dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.F$0 = n2;
                                        dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.F$1 = n;
                                        dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.label = 2;
                                        dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$2 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;
                                        coroutineSingletons = coroutine_SUSPENDED;
                                        c2 = l$2;
                                        if (l$2.P(final1, (BaseContinuationImpl)dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1) == coroutine_SUSPENDED) {
                                            return coroutine_SUSPENDED;
                                        }
                                        break Label_0684;
                                    }
                                    else {
                                        l$3.invoke((Object)l$4, (Object)new Float(n - Math.signum(n) * n2));
                                        if (l$4.b()) {
                                            return l$4;
                                        }
                                        final CoroutineSingletons coroutineSingletons3 = coroutine_SUSPENDED;
                                        n = 0.0f;
                                        c4 = l$2;
                                        final CoroutineSingletons coroutineSingletons2 = coroutineSingletons3;
                                        break Label_0721;
                                    }
                                }
                                else {
                                    ++i;
                                }
                            }
                            final Object value = null;
                            continue;
                        }
                    }
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$2;
                    coroutine_SUSPENDED = coroutineSingletons;
                    l$2 = c2;
                    if (!l$4.b()) {
                        break Label_0709;
                    }
                    return null;
                }
                final CoroutineSingletons coroutineSingletons4 = coroutine_SUSPENDED;
                c4 = l$2;
                CoroutineSingletons coroutineSingletons2 = coroutineSingletons4;
            }
            final p<? super o, ? super Float, j> p7 = (p<? super o, ? super Float, j>)l$3;
            l$1 = c4;
            p<? super o, ? super Float, j> l$5 = p7;
            continue;
        }
    }
    
    public static final Object d(z1.c l$1, long f, final p<? super o, ? super Float, j> p4, final c<? super o> c) {
        DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation.DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1 = null;
        Label_0054: {
            if (c instanceof DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation.DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1) {
                dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1 = (DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation.DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1)c;
                final int label = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.label = label + Integer.MIN_VALUE;
                    break Label_0054;
                }
            }
            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1 = new DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation.DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1((c)c);
        }
        Object o = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.result;
        CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.label;
        final Object o2 = null;
        while (true) {
            p l$3 = null;
            float n2 = 0.0f;
            z1.c c4 = null;
            Label_0734: {
                float f$1 = 0.0f;
                z1.c l$2 = null;
                Label_0720: {
                    float f$2 = 0.0f;
                    o l$4 = null;
                    z1.c c2 = null;
                    DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation.DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$2 = null;
                    CoroutineSingletons coroutineSingletons = null;
                    Label_0692: {
                        Object o3 = null;
                        Label_0372: {
                            float m;
                            CoroutineSingletons coroutineSingletons2;
                            float f$3;
                            p<? super o, ? super Float, j> l$5;
                            if (label2 != 0) {
                                if (label2 == 1) {
                                    f$1 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.F$1;
                                    f$2 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.F$0;
                                    o3 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.L$2;
                                    l$2 = (z1.c)dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.L$1;
                                    l$3 = (p)dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.L$0;
                                    aj2.c.Q0(o);
                                    break Label_0372;
                                }
                                if (label2 == 2) {
                                    f$1 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.F$1;
                                    f$2 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.F$0;
                                    l$4 = (o)dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.L$3;
                                    o3 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.L$2;
                                    c2 = (z1.c)dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.L$1;
                                    l$3 = (p)dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.L$0;
                                    aj2.c.Q0(o);
                                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$2 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1;
                                    coroutineSingletons = coroutine_SUSPENDED;
                                    break Label_0692;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            else {
                                aj2.c.Q0(o);
                                if (l(l$1.B0(), f)) {
                                    return o2;
                                }
                                m = m(l$1.getViewConfiguration(), 1);
                                o3 = new Ref$LongRef();
                                ((Ref$LongRef)o3).element = f;
                                coroutineSingletons2 = coroutine_SUSPENDED;
                                f$3 = 0.0f;
                                l$5 = p4;
                            }
                            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.L$0 = l$5;
                            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.L$1 = l$1;
                            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.L$2 = o3;
                            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.L$3 = null;
                            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.F$0 = m;
                            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.F$1 = f$3;
                            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.label = 1;
                            o = z1.c.O0(l$1, (BaseContinuationImpl)dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1);
                            if (o == coroutineSingletons2) {
                                return coroutineSingletons2;
                            }
                            final p<? super o, ? super Float, j> p5 = l$5;
                            coroutine_SUSPENDED = coroutineSingletons2;
                            l$2 = l$1;
                            final float n = f$3;
                            l$3 = p5;
                            f$2 = m;
                            f$1 = n;
                        }
                        final k k = (k)o;
                        final List<o> a = k.a;
                        final int size = a.size();
                        int i = 0;
                        while (true) {
                            while (i < size) {
                                final Object value = a.get(i);
                                if (n.a(((o)value).a, ((Ref$LongRef)o3).element)) {
                                    l$4 = (o)value;
                                    if (l$4 == null) {
                                        return null;
                                    }
                                    if (l$4.b()) {
                                        return null;
                                    }
                                    if (yd.a.I0(l$4)) {
                                        final List<o> a2 = k.a;
                                        final int size2 = a2.size();
                                        int j = 0;
                                        while (true) {
                                            while (j < size2) {
                                                final Object value2 = a2.get(j);
                                                if (((o)value2).d) {
                                                    final o o5 = (o)value2;
                                                    if (o5 == null) {
                                                        return null;
                                                    }
                                                    ((Ref$LongRef)o3).element = o5.a;
                                                    n2 = f$2;
                                                    break Label_0720;
                                                }
                                                else {
                                                    ++j;
                                                }
                                            }
                                            final Object value2 = null;
                                            continue;
                                        }
                                    }
                                    final long c3 = l$4.c;
                                    f = l$4.f;
                                    f$1 += n1.c.c(c3) - n1.c.c(f);
                                    if (Math.abs(f$1) < f$2) {
                                        final PointerEventPass final1 = PointerEventPass.Final;
                                        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.L$0 = l$3;
                                        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.L$1 = l$2;
                                        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.L$2 = o3;
                                        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.L$3 = l$4;
                                        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.F$0 = f$2;
                                        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.F$1 = f$1;
                                        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.label = 2;
                                        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$2 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1;
                                        coroutineSingletons = coroutine_SUSPENDED;
                                        c2 = l$2;
                                        if (l$2.P(final1, (BaseContinuationImpl)dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1) == coroutine_SUSPENDED) {
                                            return coroutine_SUSPENDED;
                                        }
                                        break Label_0692;
                                    }
                                    else {
                                        l$3.invoke((Object)l$4, (Object)new Float(f$1 - Math.signum(f$1) * f$2));
                                        if (l$4.b()) {
                                            return l$4;
                                        }
                                        final CoroutineSingletons coroutineSingletons3 = coroutine_SUSPENDED;
                                        final float n3 = 0.0f;
                                        c4 = l$2;
                                        n2 = f$2;
                                        final float f$3 = n3;
                                        final CoroutineSingletons coroutineSingletons2 = coroutineSingletons3;
                                        break Label_0734;
                                    }
                                }
                                else {
                                    ++i;
                                }
                            }
                            final Object value = null;
                            continue;
                        }
                    }
                    n2 = f$2;
                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$2;
                    coroutine_SUSPENDED = coroutineSingletons;
                    l$2 = c2;
                    if (!l$4.b()) {
                        break Label_0720;
                    }
                    return null;
                }
                float f$3 = f$1;
                final CoroutineSingletons coroutineSingletons4 = coroutine_SUSPENDED;
                c4 = l$2;
                CoroutineSingletons coroutineSingletons2 = coroutineSingletons4;
            }
            float m = n2;
            final p<? super o, ? super Float, j> p6 = (p<? super o, ? super Float, j>)l$3;
            l$1 = c4;
            p<? super o, ? super Float, j> l$5 = p6;
            continue;
        }
    }
    
    public static final Object e(final z1.c c, long j$0, int i, final p<? super o, ? super n1.c, j> p5, final c<? super o> c2) {
        DragGestureDetectorKt$awaitPointerSlopOrCancellation.DragGestureDetectorKt$awaitPointerSlopOrCancellation$1 dragGestureDetectorKt$awaitPointerSlopOrCancellation$2 = null;
        Label_0058: {
            if (c2 instanceof DragGestureDetectorKt$awaitPointerSlopOrCancellation.DragGestureDetectorKt$awaitPointerSlopOrCancellation$1) {
                final DragGestureDetectorKt$awaitPointerSlopOrCancellation.DragGestureDetectorKt$awaitPointerSlopOrCancellation$1 dragGestureDetectorKt$awaitPointerSlopOrCancellation$1 = (DragGestureDetectorKt$awaitPointerSlopOrCancellation.DragGestureDetectorKt$awaitPointerSlopOrCancellation$1)c2;
                final int label = dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.label = label + Integer.MIN_VALUE;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$2 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$1;
                    break Label_0058;
                }
            }
            dragGestureDetectorKt$awaitPointerSlopOrCancellation$2 = new DragGestureDetectorKt$awaitPointerSlopOrCancellation.DragGestureDetectorKt$awaitPointerSlopOrCancellation$1((c)c2);
        }
        Object o = dragGestureDetectorKt$awaitPointerSlopOrCancellation$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$2.label;
        Object l$3 = null;
        while (true) {
            Label_0738: {
                o l$4 = null;
                z1.c c4 = null;
                DragGestureDetectorKt$awaitPointerSlopOrCancellation.DragGestureDetectorKt$awaitPointerSlopOrCancellation$1 dragGestureDetectorKt$awaitPointerSlopOrCancellation$3 = null;
                Label_0720: {
                    float n = 0.0f;
                    Object o2 = null;
                    p p6 = null;
                    z1.c c3 = null;
                    Label_0351: {
                        if (label2 != 0) {
                            if (label2 == 1) {
                                n = dragGestureDetectorKt$awaitPointerSlopOrCancellation$2.F$0;
                                j$0 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$2.J$0;
                                o2 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$2.L$2;
                                p6 = (p)dragGestureDetectorKt$awaitPointerSlopOrCancellation$2.L$1;
                                c3 = (z1.c)dragGestureDetectorKt$awaitPointerSlopOrCancellation$2.L$0;
                                aj2.c.Q0(o);
                                break Label_0351;
                            }
                            if (label2 == 2) {
                                n = dragGestureDetectorKt$awaitPointerSlopOrCancellation$2.F$0;
                                j$0 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$2.J$0;
                                l$4 = (o)dragGestureDetectorKt$awaitPointerSlopOrCancellation$2.L$3;
                                o2 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$2.L$2;
                                p6 = (p)dragGestureDetectorKt$awaitPointerSlopOrCancellation$2.L$1;
                                c4 = (z1.c)dragGestureDetectorKt$awaitPointerSlopOrCancellation$2.L$0;
                                aj2.c.Q0(o);
                                dragGestureDetectorKt$awaitPointerSlopOrCancellation$3 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$2;
                                break Label_0720;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        else {
                            aj2.c.Q0(o);
                            if (l(c.B0(), j$0)) {
                                return null;
                            }
                            final long b = n1.c.b;
                            n = m(c.getViewConfiguration(), i);
                            o2 = new Ref$LongRef();
                            ((Ref$LongRef)o2).element = j$0;
                            p6 = p5;
                            j$0 = b;
                            c3 = c;
                        }
                        dragGestureDetectorKt$awaitPointerSlopOrCancellation$2.L$0 = c3;
                        dragGestureDetectorKt$awaitPointerSlopOrCancellation$2.L$1 = p6;
                        dragGestureDetectorKt$awaitPointerSlopOrCancellation$2.L$2 = o2;
                        dragGestureDetectorKt$awaitPointerSlopOrCancellation$2.L$3 = l$3;
                        dragGestureDetectorKt$awaitPointerSlopOrCancellation$2.J$0 = j$0;
                        dragGestureDetectorKt$awaitPointerSlopOrCancellation$2.F$0 = n;
                        dragGestureDetectorKt$awaitPointerSlopOrCancellation$2.label = 1;
                        o = z1.c.O0(c3, (BaseContinuationImpl)dragGestureDetectorKt$awaitPointerSlopOrCancellation$2);
                        if (o == coroutine_SUSPENDED) {
                            return coroutine_SUSPENDED;
                        }
                    }
                    final k k = (k)o;
                    final List<o> a = k.a;
                    final int size = a.size();
                    i = 0;
                    while (true) {
                        while (i < size) {
                            final Object value = a.get(i);
                            if (z1.n.a(((o)value).a, ((Ref$LongRef)o2).element)) {
                                l$4 = (o)value;
                                if (l$4 == null) {
                                    return null;
                                }
                                if (l$4.b()) {
                                    return null;
                                }
                                if (yd.a.I0(l$4)) {
                                    final List<o> a2 = k.a;
                                    final int size2 = a2.size();
                                    i = 0;
                                    while (true) {
                                        while (i < size2) {
                                            final Object value2 = a2.get(i);
                                            if (((o)value2).d) {
                                                final o o3 = (o)value2;
                                                if (o3 == null) {
                                                    return null;
                                                }
                                                ((Ref$LongRef)o2).element = o3.a;
                                                break Label_0738;
                                            }
                                            else {
                                                ++i;
                                            }
                                        }
                                        final Object value2 = null;
                                        continue;
                                    }
                                }
                                final long f = n1.c.f(j$0, yd.a.f2(l$4));
                                final float b2 = n1.c.b(f);
                                j$0 = f;
                                Label_0635: {
                                    if (b2 >= n) {
                                        p6.invoke((Object)l$4, (Object)new n1.c(n1.c.e(f, n1.c.g(n, yd.a.y0(n1.c.c(f) / b2, n1.c.d(f) / b2)))));
                                        if (l$4.b()) {
                                            j$0 = f;
                                            i = 1;
                                            break Label_0635;
                                        }
                                        j$0 = n1.c.b;
                                    }
                                    i = 0;
                                }
                                if (i != 0) {
                                    return l$4;
                                }
                                final PointerEventPass final1 = PointerEventPass.Final;
                                dragGestureDetectorKt$awaitPointerSlopOrCancellation$2.L$0 = c3;
                                dragGestureDetectorKt$awaitPointerSlopOrCancellation$2.L$1 = p6;
                                dragGestureDetectorKt$awaitPointerSlopOrCancellation$2.L$2 = o2;
                                dragGestureDetectorKt$awaitPointerSlopOrCancellation$2.L$3 = l$4;
                                dragGestureDetectorKt$awaitPointerSlopOrCancellation$2.J$0 = j$0;
                                dragGestureDetectorKt$awaitPointerSlopOrCancellation$2.F$0 = n;
                                dragGestureDetectorKt$awaitPointerSlopOrCancellation$2.label = 2;
                                dragGestureDetectorKt$awaitPointerSlopOrCancellation$3 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$2;
                                c4 = c3;
                                if (c3.P(final1, (BaseContinuationImpl)dragGestureDetectorKt$awaitPointerSlopOrCancellation$2) == coroutine_SUSPENDED) {
                                    return coroutine_SUSPENDED;
                                }
                                break Label_0720;
                            }
                            else {
                                ++i;
                            }
                        }
                        final Object value = null;
                        continue;
                    }
                }
                if (l$4.b()) {
                    return null;
                }
                z1.c c3 = c4;
                dragGestureDetectorKt$awaitPointerSlopOrCancellation$2 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$3;
            }
            l$3 = null;
            continue;
        }
    }
    
    public static final Object f(z1.c l$1, long c, int i, final p<? super o, ? super Float, j> p5, final c<? super o> c2) {
        DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation.DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1 dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1 = null;
        Label_0054: {
            if (c2 instanceof DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation.DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1) {
                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1 = (DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation.DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1)c2;
                final int label = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.label = label + Integer.MIN_VALUE;
                    break Label_0054;
                }
            }
            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1 = new DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation.DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1((c)c2);
        }
        Object o = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.result;
        CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.label;
        final Object o2 = null;
        while (true) {
            float f$1 = 0.0f;
            float f$2 = 0.0f;
            p l$3 = null;
            z1.c c4 = null;
            Label_0729: {
                z1.c l$2 = null;
                Label_0717: {
                    o l$4 = null;
                    z1.c c3 = null;
                    DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation.DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1 dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$2 = null;
                    CoroutineSingletons coroutineSingletons = null;
                    Label_0692: {
                        Object o3 = null;
                        Label_0379: {
                            float m;
                            CoroutineSingletons coroutineSingletons2;
                            float f$3;
                            p<? super o, ? super Float, j> l$5;
                            if (label2 != 0) {
                                if (label2 == 1) {
                                    f$1 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.F$1;
                                    f$2 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.F$0;
                                    o3 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$2;
                                    l$2 = (z1.c)dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$1;
                                    l$3 = (p)dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$0;
                                    aj2.c.Q0(o);
                                    break Label_0379;
                                }
                                if (label2 == 2) {
                                    f$1 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.F$1;
                                    f$2 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.F$0;
                                    l$4 = (o)dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$3;
                                    o3 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$2;
                                    c3 = (z1.c)dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$1;
                                    l$3 = (p)dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$0;
                                    aj2.c.Q0(o);
                                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$2 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;
                                    coroutineSingletons = coroutine_SUSPENDED;
                                    break Label_0692;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            else {
                                aj2.c.Q0(o);
                                if (l(l$1.B0(), c)) {
                                    return o2;
                                }
                                m = m(l$1.getViewConfiguration(), i);
                                o3 = new Ref$LongRef();
                                ((Ref$LongRef)o3).element = c;
                                coroutineSingletons2 = coroutine_SUSPENDED;
                                f$3 = 0.0f;
                                l$5 = p5;
                            }
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$0 = l$5;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$1 = l$1;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$2 = o3;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$3 = null;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.F$0 = m;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.F$1 = f$3;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.label = 1;
                            o = z1.c.O0(l$1, (BaseContinuationImpl)dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1);
                            if (o == coroutineSingletons2) {
                                return coroutineSingletons2;
                            }
                            final p<? super o, ? super Float, j> p6 = l$5;
                            coroutine_SUSPENDED = coroutineSingletons2;
                            l$2 = l$1;
                            final float n = f$3;
                            l$3 = p6;
                            f$2 = m;
                            f$1 = n;
                        }
                        final k k = (k)o;
                        final List<o> a = k.a;
                        final int size = a.size();
                        i = 0;
                        while (true) {
                            while (i < size) {
                                final Object value = a.get(i);
                                if (n.a(((o)value).a, ((Ref$LongRef)o3).element)) {
                                    l$4 = (o)value;
                                    if (l$4 == null) {
                                        return null;
                                    }
                                    if (l$4.b()) {
                                        return null;
                                    }
                                    if (yd.a.I0(l$4)) {
                                        final List<o> a2 = k.a;
                                        final int size2 = a2.size();
                                        i = 0;
                                        while (true) {
                                            while (i < size2) {
                                                final Object value2 = a2.get(i);
                                                if (((o)value2).d) {
                                                    final o o5 = (o)value2;
                                                    if (o5 == null) {
                                                        return null;
                                                    }
                                                    ((Ref$LongRef)o3).element = o5.a;
                                                    break Label_0717;
                                                }
                                                else {
                                                    ++i;
                                                }
                                            }
                                            final Object value2 = null;
                                            continue;
                                        }
                                    }
                                    c = l$4.c;
                                    f$1 += n1.c.d(c) - n1.c.d(l$4.f);
                                    if (Math.abs(f$1) < f$2) {
                                        final PointerEventPass final1 = PointerEventPass.Final;
                                        dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$0 = l$3;
                                        dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$1 = l$2;
                                        dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$2 = o3;
                                        dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$3 = l$4;
                                        dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.F$0 = f$2;
                                        dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.F$1 = f$1;
                                        dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.label = 2;
                                        dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$2 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;
                                        coroutineSingletons = coroutine_SUSPENDED;
                                        c3 = l$2;
                                        if (l$2.P(final1, (BaseContinuationImpl)dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1) == coroutine_SUSPENDED) {
                                            return coroutine_SUSPENDED;
                                        }
                                        break Label_0692;
                                    }
                                    else {
                                        l$3.invoke((Object)l$4, (Object)new Float(f$1 - Math.signum(f$1) * f$2));
                                        if (l$4.b()) {
                                            return l$4;
                                        }
                                        final CoroutineSingletons coroutineSingletons3 = coroutine_SUSPENDED;
                                        f$1 = 0.0f;
                                        c4 = l$2;
                                        final CoroutineSingletons coroutineSingletons2 = coroutineSingletons3;
                                        break Label_0729;
                                    }
                                }
                                else {
                                    ++i;
                                }
                            }
                            final Object value = null;
                            continue;
                        }
                    }
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$2;
                    coroutine_SUSPENDED = coroutineSingletons;
                    l$2 = c3;
                    if (!l$4.b()) {
                        break Label_0717;
                    }
                    return null;
                }
                final CoroutineSingletons coroutineSingletons4 = coroutine_SUSPENDED;
                c4 = l$2;
                CoroutineSingletons coroutineSingletons2 = coroutineSingletons4;
            }
            final float n2 = f$2;
            final p<? super o, ? super Float, j> p7 = (p<? super o, ? super Float, j>)l$3;
            l$1 = c4;
            p<? super o, ? super Float, j> l$5 = p7;
            float f$3 = f$1;
            float m = n2;
            continue;
        }
    }
    
    public static final Object g(z1.c l$1, long c, final p<? super o, ? super Float, j> p4, final c<? super o> c2) {
        DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation.DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1 = null;
        Label_0054: {
            if (c2 instanceof DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation.DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1) {
                dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1 = (DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation.DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1)c2;
                final int label = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.label = label + Integer.MIN_VALUE;
                    break Label_0054;
                }
            }
            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1 = new DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation.DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1((c)c2);
        }
        Object o = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.result;
        CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.label;
        final Object o2 = null;
        while (true) {
            p l$3 = null;
            z1.c c4 = null;
            Label_0730: {
                float f$1 = 0.0f;
                z1.c l$2 = null;
                Label_0716: {
                    float f$2 = 0.0f;
                    o l$4 = null;
                    z1.c c3 = null;
                    DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation.DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$2 = null;
                    CoroutineSingletons coroutineSingletons = null;
                    Label_0688: {
                        Object o3 = null;
                        Label_0368: {
                            float m;
                            CoroutineSingletons coroutineSingletons2;
                            float f$3;
                            p<? super o, ? super Float, j> l$5;
                            if (label2 != 0) {
                                if (label2 == 1) {
                                    f$1 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.F$1;
                                    f$2 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.F$0;
                                    o3 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.L$2;
                                    l$2 = (z1.c)dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.L$1;
                                    l$3 = (p)dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.L$0;
                                    aj2.c.Q0(o);
                                    break Label_0368;
                                }
                                if (label2 == 2) {
                                    f$1 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.F$1;
                                    f$2 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.F$0;
                                    l$4 = (o)dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.L$3;
                                    o3 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.L$2;
                                    c3 = (z1.c)dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.L$1;
                                    l$3 = (p)dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.L$0;
                                    aj2.c.Q0(o);
                                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$2 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;
                                    coroutineSingletons = coroutine_SUSPENDED;
                                    break Label_0688;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            else {
                                aj2.c.Q0(o);
                                if (l(l$1.B0(), c)) {
                                    return o2;
                                }
                                m = m(l$1.getViewConfiguration(), 1);
                                o3 = new Ref$LongRef();
                                ((Ref$LongRef)o3).element = c;
                                coroutineSingletons2 = coroutine_SUSPENDED;
                                f$3 = 0.0f;
                                l$5 = p4;
                            }
                            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.L$0 = l$5;
                            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.L$1 = l$1;
                            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.L$2 = o3;
                            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.L$3 = null;
                            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.F$0 = m;
                            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.F$1 = f$3;
                            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.label = 1;
                            o = z1.c.O0(l$1, (BaseContinuationImpl)dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1);
                            if (o == coroutineSingletons2) {
                                return coroutineSingletons2;
                            }
                            final p<? super o, ? super Float, j> p5 = l$5;
                            coroutine_SUSPENDED = coroutineSingletons2;
                            l$2 = l$1;
                            f$1 = f$3;
                            l$3 = p5;
                            f$2 = m;
                        }
                        final k k = (k)o;
                        final List<o> a = k.a;
                        final int size = a.size();
                        int i = 0;
                        while (true) {
                            while (i < size) {
                                final Object value = a.get(i);
                                if (n.a(((o)value).a, ((Ref$LongRef)o3).element)) {
                                    l$4 = (o)value;
                                    if (l$4 == null) {
                                        return null;
                                    }
                                    if (l$4.b()) {
                                        return null;
                                    }
                                    if (yd.a.I0(l$4)) {
                                        final List<o> a2 = k.a;
                                        final int size2 = a2.size();
                                        int j = 0;
                                        while (true) {
                                            while (j < size2) {
                                                final Object value2 = a2.get(j);
                                                if (((o)value2).d) {
                                                    final o o5 = (o)value2;
                                                    if (o5 == null) {
                                                        return null;
                                                    }
                                                    ((Ref$LongRef)o3).element = o5.a;
                                                    final float m = f$2;
                                                    break Label_0716;
                                                }
                                                else {
                                                    ++j;
                                                }
                                            }
                                            final Object value2 = null;
                                            continue;
                                        }
                                    }
                                    c = l$4.c;
                                    f$1 += n1.c.d(c) - n1.c.d(l$4.f);
                                    if (Math.abs(f$1) < f$2) {
                                        final PointerEventPass final1 = PointerEventPass.Final;
                                        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.L$0 = l$3;
                                        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.L$1 = l$2;
                                        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.L$2 = o3;
                                        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.L$3 = l$4;
                                        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.F$0 = f$2;
                                        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.F$1 = f$1;
                                        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.label = 2;
                                        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$2 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;
                                        coroutineSingletons = coroutine_SUSPENDED;
                                        c3 = l$2;
                                        if (l$2.P(final1, (BaseContinuationImpl)dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1) == coroutine_SUSPENDED) {
                                            return coroutine_SUSPENDED;
                                        }
                                        break Label_0688;
                                    }
                                    else {
                                        l$3.invoke((Object)l$4, (Object)new Float(f$1 - Math.signum(f$1) * f$2));
                                        if (l$4.b()) {
                                            return l$4;
                                        }
                                        final CoroutineSingletons coroutineSingletons3 = coroutine_SUSPENDED;
                                        final float n = 0.0f;
                                        c4 = l$2;
                                        final float m = f$2;
                                        final float f$3 = n;
                                        final CoroutineSingletons coroutineSingletons2 = coroutineSingletons3;
                                        break Label_0730;
                                    }
                                }
                                else {
                                    ++i;
                                }
                            }
                            final Object value = null;
                            continue;
                        }
                    }
                    float m = f$2;
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$2;
                    coroutine_SUSPENDED = coroutineSingletons;
                    l$2 = c3;
                    if (!l$4.b()) {
                        break Label_0716;
                    }
                    return null;
                }
                float f$3 = f$1;
                final CoroutineSingletons coroutineSingletons4 = coroutine_SUSPENDED;
                c4 = l$2;
                CoroutineSingletons coroutineSingletons2 = coroutineSingletons4;
            }
            final p<? super o, ? super Float, j> p6 = (p<? super o, ? super Float, j>)l$3;
            l$1 = c4;
            p<? super o, ? super Float, j> l$5 = p6;
            continue;
        }
    }
    
    public static final Object h(final v v, final l<? super n1.c, j> l, final zg2.a<j> a, final zg2.a<j> a2, final p<? super o, ? super n1.c, j> p6, final c<? super j> c) {
        final Object b = ForEachGestureKt.b(v, (p<? super v, ? super c<? super j>, ?>)new DragGestureDetectorKt$detectDragGestures$5((l)l, (p)p6, (zg2.a)a2, (zg2.a)a, (c)null), c);
        if (b == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return b;
        }
        return j.a;
    }
    
    public static final Object i(final v v, final l<? super n1.c, j> l, final zg2.a<j> a, final zg2.a<j> a2, final p<? super o, ? super n1.c, j> p6, final c<? super j> c) {
        final Object b = ForEachGestureKt.b(v, (p<? super v, ? super c<? super j>, ?>)new DragGestureDetectorKt$detectDragGesturesAfterLongPress$5((l)l, (zg2.a)a2, (zg2.a)a, (p)p6, (c)null), c);
        if (b == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return b;
        }
        return j.a;
    }
    
    public static final Object j(z1.c l$0, long a, l<? super o, j> l$2, final c<? super Boolean> c) {
        Object o = null;
        Label_0058: {
            if (c instanceof DragGestureDetectorKt$drag$1) {
                final DragGestureDetectorKt$drag$1 dragGestureDetectorKt$drag$1 = (DragGestureDetectorKt$drag$1)c;
                final int label = dragGestureDetectorKt$drag$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    dragGestureDetectorKt$drag$1.label = label + Integer.MIN_VALUE;
                    o = dragGestureDetectorKt$drag$1;
                    break Label_0058;
                }
            }
            o = new DragGestureDetectorKt$drag$1((c)c);
        }
        Object o2 = ((DragGestureDetectorKt$drag$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((DragGestureDetectorKt$drag$1)o).label;
        while (true) {
            Label_0170: {
                if (label2 != 0) {
                    if (label2 == 1) {
                        l$2 = (l)((DragGestureDetectorKt$drag$1)o).L$1;
                        l$0 = (z1.c)((DragGestureDetectorKt$drag$1)o).L$0;
                        aj2.c.Q0(o2);
                        break Label_0170;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                else {
                    aj2.c.Q0(o2);
                }
                ((DragGestureDetectorKt$drag$1)o).L$0 = l$0;
                ((DragGestureDetectorKt$drag$1)o).L$1 = l$2;
                ((DragGestureDetectorKt$drag$1)o).label = 1;
                if ((o2 = b(l$0, a, (c<? super o>)o)) == coroutine_SUSPENDED) {
                    return coroutine_SUSPENDED;
                }
            }
            final o o3 = (o)o2;
            if (o3 == null) {
                return Boolean.FALSE;
            }
            if (a.I0(o3)) {
                return Boolean.TRUE;
            }
            l$2.invoke((Object)o3);
            a = o3.a;
            continue;
        }
    }
    
    public static final Object k(z1.c l$1, long a, final l<? super o, j> l, final c<? super Boolean> c) {
        DragGestureDetectorKt$horizontalDrag$1 dragGestureDetectorKt$horizontalDrag$2 = null;
        Label_0058: {
            if (c instanceof DragGestureDetectorKt$horizontalDrag$1) {
                final DragGestureDetectorKt$horizontalDrag$1 dragGestureDetectorKt$horizontalDrag$1 = (DragGestureDetectorKt$horizontalDrag$1)c;
                final int label = dragGestureDetectorKt$horizontalDrag$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    dragGestureDetectorKt$horizontalDrag$1.label = label + Integer.MIN_VALUE;
                    dragGestureDetectorKt$horizontalDrag$2 = dragGestureDetectorKt$horizontalDrag$1;
                    break Label_0058;
                }
            }
            dragGestureDetectorKt$horizontalDrag$2 = new DragGestureDetectorKt$horizontalDrag$1((c)c);
        }
        Object o = dragGestureDetectorKt$horizontalDrag$2.result;
        CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = dragGestureDetectorKt$horizontalDrag$2.label;
        while (true) {
        Label_0191:
            while (true) {
            Label_0217:
                while (true) {
                    Object l$2 = null;
                    z1.c c2 = null;
                    l l$3 = null;
                    Label_0271: {
                        BaseContinuationImpl baseContinuationImpl;
                        if (label2 != 0) {
                            if (label2 == 1) {
                                l$2 = dragGestureDetectorKt$horizontalDrag$2.L$3;
                                c2 = (z1.c)dragGestureDetectorKt$horizontalDrag$2.L$2;
                                l$1 = (z1.c)dragGestureDetectorKt$horizontalDrag$2.L$1;
                                final l i = (l)dragGestureDetectorKt$horizontalDrag$2.L$0;
                                aj2.c.Q0(o);
                                baseContinuationImpl = (BaseContinuationImpl)dragGestureDetectorKt$horizontalDrag$2;
                                l$3 = i;
                                break Label_0271;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        else {
                            aj2.c.Q0(o);
                            if (l(l$1.B0(), a)) {
                                return Boolean.FALSE;
                            }
                            baseContinuationImpl = (BaseContinuationImpl)dragGestureDetectorKt$horizontalDrag$2;
                            l$3 = l;
                        }
                        l$2 = new Ref$LongRef();
                        ((Ref$LongRef)l$2).element = a;
                        final z1.c c3 = l$1;
                        final CoroutineSingletons coroutineSingletons = coroutine_SUSPENDED;
                        final z1.c l$4 = c3;
                        ((DragGestureDetectorKt$horizontalDrag$1)baseContinuationImpl).L$0 = l$3;
                        ((DragGestureDetectorKt$horizontalDrag$1)baseContinuationImpl).L$1 = l$1;
                        ((DragGestureDetectorKt$horizontalDrag$1)baseContinuationImpl).L$2 = l$4;
                        ((DragGestureDetectorKt$horizontalDrag$1)baseContinuationImpl).L$3 = l$2;
                        ((DragGestureDetectorKt$horizontalDrag$1)baseContinuationImpl).label = 1;
                        o = z1.c.O0(l$4, baseContinuationImpl);
                        if (o == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        c2 = l$4;
                        coroutine_SUSPENDED = coroutineSingletons;
                    }
                    final k k = (k)o;
                    final List<o> a2 = k.a;
                    final int size = a2.size();
                    final int n = 0;
                    final int n2 = 0;
                    int j = 0;
                    while (j < size) {
                        final Object value = a2.get(j);
                        if (z1.n.a(((o)value).a, ((Ref$LongRef)l$2).element)) {
                            final o o2 = (o)value;
                            o o4 = null;
                            Label_0499: {
                                if (o2 != null) {
                                    Label_0559: {
                                        Label_0495: {
                                            if (a.I0(o2)) {
                                                final List<o> a3 = k.a;
                                                final int size2 = a3.size();
                                                int n3 = n2;
                                                while (true) {
                                                    while (n3 < size2) {
                                                        final Object value2 = a3.get(n3);
                                                        if (((o)value2).d) {
                                                            final o o3 = (o)value2;
                                                            if (o3 == null) {
                                                                break Label_0495;
                                                            }
                                                            ((Ref$LongRef)l$2).element = o3.a;
                                                            break Label_0559;
                                                        }
                                                        else {
                                                            ++n3;
                                                        }
                                                    }
                                                    final Object value2 = null;
                                                    continue;
                                                }
                                            }
                                            int n4 = n;
                                            if (n1.c.c(a.g2(o2, true)) == 0.0f) {
                                                n4 = 1;
                                            }
                                            if ((n4 ^ 0x1) == 0x0) {
                                                break Label_0559;
                                            }
                                        }
                                        o4 = o2;
                                        break Label_0499;
                                    }
                                    final CoroutineSingletons coroutineSingletons = coroutine_SUSPENDED;
                                    final z1.c l$4 = c2;
                                    continue Label_0217;
                                }
                                o4 = null;
                            }
                            if (o4 == null) {
                                return Boolean.FALSE;
                            }
                            if (o4.b()) {
                                return Boolean.FALSE;
                            }
                            if (a.I0(o4)) {
                                return Boolean.TRUE;
                            }
                            l$3.invoke((Object)o4);
                            a = o4.a;
                            continue Label_0191;
                        }
                        else {
                            ++j;
                        }
                    }
                    break;
                }
                break;
            }
            final Object value = null;
            continue;
        }
    }
    
    public static final boolean l(final k k, final long n) {
        final List<o> a = k.a;
        final int size = a.size();
        final boolean b = false;
        while (true) {
            for (int i = 0; i < size; ++i) {
                final Object value = a.get(i);
                if (n.a(((o)value).a, n)) {
                    final o o = (o)value;
                    boolean b2 = b;
                    if (o != null) {
                        b2 = b;
                        if (o.d) {
                            b2 = true;
                        }
                    }
                    return true ^ b2;
                }
            }
            final Object value = null;
            continue;
        }
    }
    
    public static final float m(final k1 k1, int n) {
        f.f((Object)k1, "$this$pointerSlop");
        if (n == 2) {
            n = 1;
        }
        else {
            n = 0;
        }
        float b;
        if (n != 0) {
            b = k1.b() * DragGestureDetectorKt.a;
        }
        else {
            b = k1.b();
        }
        return b;
    }
    
    public static final Object n(z1.c l$1, long a, final l<? super o, j> l, final c<? super Boolean> c) {
        DragGestureDetectorKt$verticalDrag$1 dragGestureDetectorKt$verticalDrag$2 = null;
        Label_0058: {
            if (c instanceof DragGestureDetectorKt$verticalDrag$1) {
                final DragGestureDetectorKt$verticalDrag$1 dragGestureDetectorKt$verticalDrag$1 = (DragGestureDetectorKt$verticalDrag$1)c;
                final int label = dragGestureDetectorKt$verticalDrag$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    dragGestureDetectorKt$verticalDrag$1.label = label + Integer.MIN_VALUE;
                    dragGestureDetectorKt$verticalDrag$2 = dragGestureDetectorKt$verticalDrag$1;
                    break Label_0058;
                }
            }
            dragGestureDetectorKt$verticalDrag$2 = new DragGestureDetectorKt$verticalDrag$1((c)c);
        }
        Object o = dragGestureDetectorKt$verticalDrag$2.result;
        CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = dragGestureDetectorKt$verticalDrag$2.label;
        while (true) {
        Label_0195:
            while (true) {
            Label_0223:
                while (true) {
                    Object l$2 = null;
                    z1.c c2 = null;
                    BaseContinuationImpl baseContinuationImpl = null;
                    l l$3 = null;
                    Label_0283: {
                        CoroutineSingletons coroutineSingletons;
                        BaseContinuationImpl baseContinuationImpl2;
                        if (label2 != 0) {
                            if (label2 == 1) {
                                l$2 = dragGestureDetectorKt$verticalDrag$2.L$3;
                                c2 = (z1.c)dragGestureDetectorKt$verticalDrag$2.L$2;
                                l$1 = (z1.c)dragGestureDetectorKt$verticalDrag$2.L$1;
                                final l i = (l)dragGestureDetectorKt$verticalDrag$2.L$0;
                                aj2.c.Q0(o);
                                baseContinuationImpl = (BaseContinuationImpl)dragGestureDetectorKt$verticalDrag$2;
                                l$3 = i;
                                break Label_0283;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        else {
                            aj2.c.Q0(o);
                            if (l(l$1.B0(), a)) {
                                return Boolean.FALSE;
                            }
                            coroutineSingletons = coroutine_SUSPENDED;
                            baseContinuationImpl2 = (BaseContinuationImpl)dragGestureDetectorKt$verticalDrag$2;
                            l$3 = l;
                        }
                        l$2 = new Ref$LongRef();
                        ((Ref$LongRef)l$2).element = a;
                        final z1.c c3 = l$1;
                        final CoroutineSingletons coroutineSingletons2 = coroutineSingletons;
                        final z1.c l$4 = c3;
                        final Object o2 = baseContinuationImpl2;
                        ((DragGestureDetectorKt$verticalDrag$1)o2).L$0 = l$3;
                        ((DragGestureDetectorKt$verticalDrag$1)o2).L$1 = l$1;
                        ((DragGestureDetectorKt$verticalDrag$1)o2).L$2 = l$4;
                        ((DragGestureDetectorKt$verticalDrag$1)o2).L$3 = l$2;
                        ((DragGestureDetectorKt$verticalDrag$1)o2).label = 1;
                        o = z1.c.O0(l$4, (BaseContinuationImpl)o2);
                        if (o == coroutineSingletons2) {
                            return coroutineSingletons2;
                        }
                        c2 = l$4;
                        coroutine_SUSPENDED = coroutineSingletons2;
                        baseContinuationImpl = (BaseContinuationImpl)o2;
                    }
                    final k k = (k)o;
                    final List<o> a2 = k.a;
                    final int size = a2.size();
                    final int n = 0;
                    final int n2 = 0;
                    int j = 0;
                    while (j < size) {
                        final Object value = a2.get(j);
                        if (z1.n.a(((o)value).a, ((Ref$LongRef)l$2).element)) {
                            final o o3 = (o)value;
                            o o5 = null;
                            Label_0511: {
                                if (o3 != null) {
                                    Label_0581: {
                                        Label_0507: {
                                            if (a.I0(o3)) {
                                                final List<o> a3 = k.a;
                                                final int size2 = a3.size();
                                                int n3 = n2;
                                                while (true) {
                                                    while (n3 < size2) {
                                                        final Object value2 = a3.get(n3);
                                                        if (((o)value2).d) {
                                                            final o o4 = (o)value2;
                                                            if (o4 == null) {
                                                                break Label_0507;
                                                            }
                                                            ((Ref$LongRef)l$2).element = o4.a;
                                                            break Label_0581;
                                                        }
                                                        else {
                                                            ++n3;
                                                        }
                                                    }
                                                    final Object value2 = null;
                                                    continue;
                                                }
                                            }
                                            int n4 = n;
                                            if (n1.c.d(a.g2(o3, true)) == 0.0f) {
                                                n4 = 1;
                                            }
                                            if ((n4 ^ 0x1) == 0x0) {
                                                break Label_0581;
                                            }
                                        }
                                        o5 = o3;
                                        break Label_0511;
                                    }
                                    final Object o2 = baseContinuationImpl;
                                    final CoroutineSingletons coroutineSingletons2 = coroutine_SUSPENDED;
                                    final z1.c l$4 = c2;
                                    continue Label_0223;
                                }
                                o5 = null;
                            }
                            if (o5 == null) {
                                return Boolean.FALSE;
                            }
                            if (o5.b()) {
                                return Boolean.FALSE;
                            }
                            if (a.I0(o5)) {
                                return Boolean.TRUE;
                            }
                            l$3.invoke((Object)o5);
                            a = o5.a;
                            final CoroutineSingletons coroutineSingletons3 = coroutine_SUSPENDED;
                            final BaseContinuationImpl baseContinuationImpl2 = baseContinuationImpl;
                            final CoroutineSingletons coroutineSingletons = coroutineSingletons3;
                            continue Label_0195;
                        }
                        else {
                            ++j;
                        }
                    }
                    break;
                }
                break;
            }
            final Object value = null;
            continue;
        }
    }
}
