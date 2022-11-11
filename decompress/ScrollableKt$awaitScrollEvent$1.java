// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.gestures;

import mg2.c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = { 1, 6, 0 }, xi = 48)
@c(c = "androidx.compose.foundation.gestures.ScrollableKt", f = "Scrollable.kt", l = { 293 }, m = "awaitScrollEvent")
final class ScrollableKt$awaitScrollEvent$1 extends ContinuationImpl
{
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    
    public ScrollableKt$awaitScrollEvent$1(final lg2.c<? super ScrollableKt$awaitScrollEvent$1> c) {
        super((lg2.c)c);
    }
    
    public final Object invokeSuspend(final Object result) {
        this.result = result;
        this.label |= Integer.MIN_VALUE;
        return ScrollableKt.a((z1.c)null, (lg2.c)this);
    }
}
