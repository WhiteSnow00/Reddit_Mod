// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.text;

import z1.o;
import zg2.a;
import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import zg2.p;
import mj2.g;
import pg2.j;
import tg2.c;
import v0.l;
import z1.v;

public final class LongPressTextDragObserverKt
{
    public static final Object a(final v v, final l l, final c<? super j> c) {
        final Object e = g.e((p)new LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2(v, l, (c)null), (c)c);
        if (e == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return e;
        }
        return j.a;
    }
    
    public static final Object b(final v v, final l l, final c<? super j> c) {
        final Object i = DragGestureDetectorKt.i(v, (zg2.l<? super n1.c, j>)new LongPressTextDragObserverKt$detectDragGesturesAfterLongPressWithObserver$2(l), (a<j>)new LongPressTextDragObserverKt$detectDragGesturesAfterLongPressWithObserver$3(l), (a<j>)new LongPressTextDragObserverKt$detectDragGesturesAfterLongPressWithObserver$4(l), (p<? super o, ? super n1.c, j>)new LongPressTextDragObserverKt$detectDragGesturesAfterLongPressWithObserver$5(l), c);
        if (i == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return i;
        }
        return j.a;
    }
}
