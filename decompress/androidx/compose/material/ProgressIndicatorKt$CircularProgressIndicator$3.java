// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.material;

import q1.i;
import z0.e1;
import kotlin.Metadata;
import hg2.j;
import q1.e;
import rg2.l;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = { 1, 6, 0 }, xi = 48)
final class ProgressIndicatorKt$CircularProgressIndicator$3 extends Lambda implements l<e, j>
{
    public final /* synthetic */ e1<Float> $baseRotation$delegate;
    public final /* synthetic */ long $color;
    public final /* synthetic */ e1<Integer> $currentRotation$delegate;
    public final /* synthetic */ e1<Float> $endAngle$delegate;
    public final /* synthetic */ e1<Float> $startAngle$delegate;
    public final /* synthetic */ i $stroke;
    public final /* synthetic */ float $strokeWidth;
    
    public ProgressIndicatorKt$CircularProgressIndicator$3(final float $strokeWidth, final long $color, final i $stroke, final e1<Integer> $currentRotation$delegate, final e1<Float> $endAngle$delegate, final e1<Float> $startAngle$delegate, final e1<Float> $baseRotation$delegate) {
        this.$strokeWidth = $strokeWidth;
        this.$color = $color;
        this.$stroke = $stroke;
        this.$currentRotation$delegate = $currentRotation$delegate;
        this.$endAngle$delegate = $endAngle$delegate;
        this.$startAngle$delegate = $startAngle$delegate;
        this.$baseRotation$delegate = $baseRotation$delegate;
        super(1);
    }
    
    public final void invoke(final e e) {
        sg2.e.f((Object)e, "$this$Canvas");
        final e1<Integer> $currentRotation$delegate = this.$currentRotation$delegate;
        final float a = ProgressIndicatorKt.a;
        ProgressIndicatorKt.e(e, this.$strokeWidth / (ProgressIndicatorKt.c / 2) * 57.29578f / 2.0f + (((Number)this.$startAngle$delegate.getValue()).floatValue() + (((Number)this.$baseRotation$delegate.getValue()).floatValue() + (((Number)$currentRotation$delegate.getValue()).intValue() * 216.0f % 360.0f - 90.0f))), Math.max(Math.abs(((Number)this.$endAngle$delegate.getValue()).floatValue() - ((Number)this.$startAngle$delegate.getValue()).floatValue()), 0.1f), this.$color, this.$stroke);
    }
}
