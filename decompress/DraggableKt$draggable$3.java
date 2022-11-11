// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.gestures;

import z0.d$a;
import n0.c;
import kotlin.Metadata;
import n0.g;
import z0.d;
import rg2.p;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002" }, d2 = { "Ln0/g;", "invoke", "(Lz0/d;I)Ln0/g;", "<anonymous>" }, k = 3, mv = { 1, 6, 0 })
final class DraggableKt$draggable$3 extends Lambda implements p<z0.d, Integer, g>
{
    public final /* synthetic */ c $state;
    
    public DraggableKt$draggable$3(final c $state) {
        this.$state = $state;
        super(2);
    }
    
    public final g invoke(final z0.d d, final int n) {
        d.A(830271906);
        final c $state = this.$state;
        d.A(1157296644);
        final boolean m = d.m((Object)$state);
        final Object b = d.B();
        IgnorePointerDraggableState ignorePointerDraggableState;
        if (m || (ignorePointerDraggableState = (IgnorePointerDraggableState)b) == d$a.a) {
            ignorePointerDraggableState = new IgnorePointerDraggableState($state);
            d.w((Object)ignorePointerDraggableState);
        }
        d.I();
        final IgnorePointerDraggableState ignorePointerDraggableState2 = ignorePointerDraggableState;
        d.I();
        return (g)ignorePointerDraggableState2;
    }
}
