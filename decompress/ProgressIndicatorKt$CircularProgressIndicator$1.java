// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.material;

import q1.i;
import kotlin.Metadata;
import hg2.j;
import q1.e;
import rg2.l;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = { 1, 6, 0 }, xi = 48)
final class ProgressIndicatorKt$CircularProgressIndicator$1 extends Lambda implements l<e, j>
{
    public final /* synthetic */ long $color;
    public final /* synthetic */ float $progress;
    public final /* synthetic */ i $stroke;
    
    public ProgressIndicatorKt$CircularProgressIndicator$1(final float $progress, final long $color, final i $stroke) {
        this.$progress = $progress;
        this.$color = $color;
        this.$stroke = $stroke;
        super(1);
    }
    
    public final void invoke(final e e) {
        sg2.e.f((Object)e, "$this$Canvas");
        ProgressIndicatorKt.e(e, 270.0f, this.$progress * 360.0f, this.$color, this.$stroke);
    }
}
