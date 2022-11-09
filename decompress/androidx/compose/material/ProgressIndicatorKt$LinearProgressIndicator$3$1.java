// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.material;

import ah2.f;
import z0.e1;
import kotlin.Metadata;
import pg2.j;
import q1.e;
import zg2.l;
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
        f.f((Object)e, "$this$Canvas");
        final float c = n1.f.c(e.b());
        ProgressIndicatorKt.f(e, 0.0f, 1.0f, this.$backgroundColor, c);
        if (this.$firstLineHead$delegate.getValue().floatValue() - this.$firstLineTail$delegate.getValue().floatValue() > 0.0f) {
            ProgressIndicatorKt.f(e, this.$firstLineHead$delegate.getValue().floatValue(), this.$firstLineTail$delegate.getValue().floatValue(), this.$color, c);
        }
        if (this.$secondLineHead$delegate.getValue().floatValue() - this.$secondLineTail$delegate.getValue().floatValue() > 0.0f) {
            ProgressIndicatorKt.f(e, this.$secondLineHead$delegate.getValue().floatValue(), this.$secondLineTail$delegate.getValue().floatValue(), this.$color, c);
        }
    }
}
