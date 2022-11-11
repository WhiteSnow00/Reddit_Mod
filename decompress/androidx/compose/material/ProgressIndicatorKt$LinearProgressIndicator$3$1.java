// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.material;

import n1.f;
import z0.e1;
import kotlin.Metadata;
import hg2.j;
import q1.e;
import rg2.l;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = { 1, 6, 0 }, xi = 48)
final class ProgressIndicatorKt$LinearProgressIndicator$3$1 extends Lambda implements l<e, j>
{
    public final /* synthetic */ long $backgroundColor;
    public final /* synthetic */ long $color;
    public final /* synthetic */ e1<Float> $firstLineHead$delegate;
    public final /* synthetic */ e1<Float> $firstLineTail$delegate;
    public final /* synthetic */ e1<Float> $secondLineHead$delegate;
    public final /* synthetic */ e1<Float> $secondLineTail$delegate;
    
    public ProgressIndicatorKt$LinearProgressIndicator$3$1(final long $backgroundColor, final long $color, final e1<Float> $firstLineHead$delegate, final e1<Float> $firstLineTail$delegate, final e1<Float> $secondLineHead$delegate, final e1<Float> $secondLineTail$delegate) {
        this.$backgroundColor = $backgroundColor;
        this.$color = $color;
        this.$firstLineHead$delegate = $firstLineHead$delegate;
        this.$firstLineTail$delegate = $firstLineTail$delegate;
        this.$secondLineHead$delegate = $secondLineHead$delegate;
        this.$secondLineTail$delegate = $secondLineTail$delegate;
        super(1);
    }
    
    public final void invoke(final e e) {
        sg2.e.f((Object)e, "$this$Canvas");
        final float d = f.d(e.b());
        ProgressIndicatorKt.f(e, 0.0f, 1.0f, this.$backgroundColor, d);
        if (((Number)this.$firstLineHead$delegate.getValue()).floatValue() - ((Number)this.$firstLineTail$delegate.getValue()).floatValue() > 0.0f) {
            ProgressIndicatorKt.f(e, ((Number)this.$firstLineHead$delegate.getValue()).floatValue(), ((Number)this.$firstLineTail$delegate.getValue()).floatValue(), this.$color, d);
        }
        if (((Number)this.$secondLineHead$delegate.getValue()).floatValue() - ((Number)this.$secondLineTail$delegate.getValue()).floatValue() > 0.0f) {
            ProgressIndicatorKt.f(e, ((Number)this.$secondLineHead$delegate.getValue()).floatValue(), ((Number)this.$secondLineTail$delegate.getValue()).floatValue(), this.$color, d);
        }
    }
}
