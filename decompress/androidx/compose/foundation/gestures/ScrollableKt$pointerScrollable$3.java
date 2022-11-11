// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.gestures;

import m0.p;
import z0.e1;
import kotlin.Metadata;
import rg2.a;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = { 1, 6, 0 }, xi = 48)
final class ScrollableKt$pointerScrollable$3 extends Lambda implements a<Boolean>
{
    public final /* synthetic */ e1<ScrollingLogic> $scrollLogic;
    
    public ScrollableKt$pointerScrollable$3(final e1<ScrollingLogic> $scrollLogic) {
        this.$scrollLogic = $scrollLogic;
        super(0);
    }
    
    public final Boolean invoke() {
        final ScrollingLogic scrollingLogic = (ScrollingLogic)this.$scrollLogic.getValue();
        final boolean b = scrollingLogic.d.b();
        boolean b2 = false;
        if (!b) {
            final p f = scrollingLogic.f;
            if (f == null || !f.a()) {
                return b2;
            }
        }
        b2 = true;
        return b2;
    }
}
