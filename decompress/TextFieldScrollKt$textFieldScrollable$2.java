// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.text;

import androidx.compose.runtime.SnapshotMutableStateImpl;
import n0.k;
import androidx.compose.foundation.gestures.ScrollableKt;
import zg2.l;
import androidx.compose.foundation.gestures.a;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.unit.LayoutDirection;
import z0.o0;
import androidx.compose.ui.platform.CompositionLocalsKt;
import ah2.f;
import o0.j;
import kotlin.Metadata;
import j1.d;
import zg2.q;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002" }, d2 = { "Lj1/d;", "invoke", "(Lj1/d;Lz0/d;I)Lj1/d;", "<anonymous>" }, k = 3, mv = { 1, 6, 0 })
final class TextFieldScrollKt$textFieldScrollable$2 extends Lambda implements q<d, z0.d, Integer, d>
{
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ j $interactionSource;
    public final /* synthetic */ TextFieldScrollerPosition $scrollerPosition;
    
    public TextFieldScrollKt$textFieldScrollable$2(final TextFieldScrollerPosition $scrollerPosition, final boolean $enabled, final j $interactionSource) {
        this.$scrollerPosition = $scrollerPosition;
        this.$enabled = $enabled;
        this.$interactionSource = $interactionSource;
        super(3);
    }
    
    public final d invoke(d c, final z0.d d, int n) {
        f.f((Object)c, "$this$composed");
        d.A(805428266);
        if (d.t(CompositionLocalsKt.k) == LayoutDirection.Rtl) {
            n = 1;
        }
        else {
            n = 0;
        }
        final boolean b = ((SnapshotMutableStateImpl<Orientation>)this.$scrollerPosition.e).getValue() == Orientation.Vertical || n == 0;
        final k a = androidx.compose.foundation.gestures.a.a((l)new TextFieldScrollKt$textFieldScrollable$2$controller.TextFieldScrollKt$textFieldScrollable$2$controller$1(this.$scrollerPosition), d);
        final d.a f = j1.d.a.f;
        final Orientation orientation = ((SnapshotMutableStateImpl<Orientation>)this.$scrollerPosition.e).getValue();
        boolean b2 = false;
        Label_0155: {
            if (this.$enabled) {
                if (((SnapshotMutableStateImpl<Number>)this.$scrollerPosition.b).getValue().floatValue() == 0.0f) {
                    n = 1;
                }
                else {
                    n = 0;
                }
                if (n == 0) {
                    b2 = true;
                    break Label_0155;
                }
            }
            b2 = false;
        }
        c = ScrollableKt.c((d)f, a, orientation, b2, b, this.$interactionSource, 16);
        d.I();
        return c;
    }
}
