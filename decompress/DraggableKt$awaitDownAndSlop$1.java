// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.gestures;

import a2.g;
import z0.e1;
import mg2.c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = { 1, 6, 0 }, xi = 48)
@c(c = "androidx.compose.foundation.gestures.DraggableKt", f = "Draggable.kt", l = { 315, 324, 333, 335 }, m = "awaitDownAndSlop")
final class DraggableKt$awaitDownAndSlop$1 extends ContinuationImpl
{
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public int label;
    public /* synthetic */ Object result;
    
    public DraggableKt$awaitDownAndSlop$1(final lg2.c<? super DraggableKt$awaitDownAndSlop$1> c) {
        super((lg2.c)c);
    }
    
    public final Object invokeSuspend(final Object result) {
        this.result = result;
        this.label |= Integer.MIN_VALUE;
        return DraggableKt.a((z1.c)null, (e1)null, (e1)null, (g)null, (Orientation)null, (lg2.c)this);
    }
}
