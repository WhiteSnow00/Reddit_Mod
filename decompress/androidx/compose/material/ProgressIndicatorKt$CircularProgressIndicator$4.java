// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.material;

import kotlin.Metadata;
import pg2.j;
import z0.d;
import zg2.p;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = { 1, 6, 0 }, xi = 48)
final class ProgressIndicatorKt$CircularProgressIndicator$4 extends Lambda implements p<d, Integer, j>
{
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ long $color;
    public final /* synthetic */ j1.d $modifier;
    public final /* synthetic */ float $strokeWidth;
    
    public ProgressIndicatorKt$CircularProgressIndicator$4(final j1.d $modifier, final long $color, final float $strokeWidth, final int $$changed, final int $$default) {
        this.$modifier = $modifier;
        this.$color = $color;
        this.$strokeWidth = $strokeWidth;
        this.$$changed = $$changed;
        this.$$default = $$default;
        super(2);
    }
    
    public final void invoke(final d d, final int n) {
        ProgressIndicatorKt.b(this.$strokeWidth, this.$$changed | 0x1, this.$$default, this.$color, d, this.$modifier);
    }
}
