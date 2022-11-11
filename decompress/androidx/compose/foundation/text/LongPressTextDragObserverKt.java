// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.text;

import rg2.a;
import rg2.l;
import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import rg2.p;
import ej2.g;
import hg2.j;
import lg2.c;
import v0.k;
import z1.v;

public final class LongPressTextDragObserverKt
{
    public static final Object a(final v v, final k k, final c<? super j> c) {
        final Object e = g.e((p)new LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2(v, k, (c)null), (c)c);
        if (e == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return e;
        }
        return j.a;
    }
    
    public static final Object b(final v v, final k k, final c<? super j> c) {
        final Object i = DragGestureDetectorKt.i(v, (l)new LongPressTextDragObserverKt$detectDragGesturesAfterLongPressWithObserver$2(k), (a)new LongPressTextDragObserverKt$detectDragGesturesAfterLongPressWithObserver$3(k), (a)new LongPressTextDragObserverKt$detectDragGesturesAfterLongPressWithObserver$4(k), (p)new LongPressTextDragObserverKt$detectDragGesturesAfterLongPressWithObserver$5(k), (c)c);
        if (i == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return i;
        }
        return j.a;
    }
}
