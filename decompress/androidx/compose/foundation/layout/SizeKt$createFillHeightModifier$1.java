// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.layout;

import ng2.e;
import kotlin.Metadata;
import cg2.j;
import androidx.compose.ui.platform.o0;
import mg2.l;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003" }, d2 = { "Landroidx/compose/ui/platform/o0;", "Lcg2/j;", "invoke", "(Landroidx/compose/ui/platform/o0;)V", "<anonymous>" }, k = 3, mv = { 1, 7, 1 })
final class SizeKt$createFillHeightModifier$1 extends Lambda implements l<o0, j>
{
    public final float $fraction;
    
    public SizeKt$createFillHeightModifier$1(final float $fraction) {
        this.$fraction = $fraction;
        super(1);
    }
    
    public /* bridge */ Object invoke(final Object o) {
        this.invoke((o0)o);
        return j.a;
    }
    
    public final void invoke(final o0 o0) {
        e.f((Object)o0, "$this$$receiver");
        o0.a.c(this.$fraction, "fraction");
    }
}
