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
final class DividerKt$Divider$1 extends Lambda implements p<d, Integer, j>
{
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ long $color;
    public final /* synthetic */ j1.d $modifier;
    public final /* synthetic */ float $startIndent;
    public final /* synthetic */ float $thickness;
    
    public DividerKt$Divider$1(final j1.d $modifier, final long $color, final float $thickness, final float $startIndent, final int $$changed, final int $$default) {
        this.$modifier = $modifier;
        this.$color = $color;
        this.$thickness = $thickness;
        this.$startIndent = $startIndent;
        this.$$changed = $$changed;
        this.$$default = $$default;
        super(2);
    }
    
    public final void invoke(final d d, final int n) {
        a.a(this.$thickness, this.$startIndent, this.$$changed | 0x1, this.$$default, this.$color, d, this.$modifier);
    }
}
