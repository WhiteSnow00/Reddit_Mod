// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.material;

import kotlin.Metadata;
import hg2.j;
import z0.d;
import rg2.p;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = { 1, 6, 0 }, xi = 48)
final class ProgressIndicatorKt$CircularProgressIndicator$2 extends Lambda implements p<z0.d, Integer, j>
{
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ long $color;
    public final /* synthetic */ j1.d $modifier;
    public final /* synthetic */ float $progress;
    public final /* synthetic */ float $strokeWidth;
    
    public ProgressIndicatorKt$CircularProgressIndicator$2(final float $progress, final j1.d $modifier, final long $color, final float $strokeWidth, final int $$changed, final int $$default) {
        this.$progress = $progress;
        this.$modifier = $modifier;
        this.$color = $color;
        this.$strokeWidth = $strokeWidth;
        this.$$changed = $$changed;
        this.$$default = $$default;
        super(2);
    }
    
    public final void invoke(final z0.d d, final int n) {
        ProgressIndicatorKt.a(this.$progress, this.$strokeWidth, this.$$changed | 0x1, this.$$default, this.$color, d, this.$modifier);
    }
}
