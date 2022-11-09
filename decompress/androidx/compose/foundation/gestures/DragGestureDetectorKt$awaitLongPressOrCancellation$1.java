// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.gestures;

import z1.o;
import z1.v;
import ug2.c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = { 1, 6, 0 }, xi = 48)
@c(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", l = { 754 }, m = "awaitLongPressOrCancellation")
final class DragGestureDetectorKt$awaitLongPressOrCancellation$1 extends ContinuationImpl
{
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    
    public DragGestureDetectorKt$awaitLongPressOrCancellation$1(final tg2.c<? super DragGestureDetectorKt$awaitLongPressOrCancellation$1> c) {
        super((tg2.c)c);
    }
    
    public final Object invokeSuspend(final Object result) {
        this.result = result;
        this.label |= Integer.MIN_VALUE;
        return DragGestureDetectorKt.a(null, null, (tg2.c)this);
    }
}
