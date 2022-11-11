// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.animation;

import ah2.f;
import kotlin.Metadata;
import c2.i;
import zg2.l;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004" }, d2 = { "Lc2/i;", "it", "", "invoke", "(Lc2/i;)Ljava/lang/Integer;", "<anonymous>" }, k = 3, mv = { 1, 6, 0 })
final class AnimatedContentMeasurePolicy$maxIntrinsicHeight$1 extends Lambda implements l<i, Integer>
{
    public final /* synthetic */ int $width;
    
    public AnimatedContentMeasurePolicy$maxIntrinsicHeight$1(final int $width) {
        this.$width = $width;
        super(1);
    }
    
    public final Integer invoke(final i i) {
        f.f((Object)i, "it");
        return i.u(this.$width);
    }
}
