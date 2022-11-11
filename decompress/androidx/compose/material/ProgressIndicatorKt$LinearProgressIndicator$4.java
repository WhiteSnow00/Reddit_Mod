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
final class ProgressIndicatorKt$LinearProgressIndicator$4 extends Lambda implements p<z0.d, Integer, j>
{
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ long $backgroundColor;
    public final /* synthetic */ long $color;
    public final /* synthetic */ j1.d $modifier;
    
    public ProgressIndicatorKt$LinearProgressIndicator$4(final j1.d $modifier, final long $color, final long $backgroundColor, final int $$changed, final int $$default) {
        this.$modifier = $modifier;
        this.$color = $color;
        this.$backgroundColor = $backgroundColor;
        this.$$changed = $$changed;
        this.$$default = $$default;
        super(2);
    }
    
    public final void invoke(final z0.d d, final int n) {
        ProgressIndicatorKt.c(this.$$changed | 0x1, this.$$default, this.$color, this.$backgroundColor, d, this.$modifier);
    }
}
