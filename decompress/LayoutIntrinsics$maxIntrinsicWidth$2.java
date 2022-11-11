// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.text.android;

import android.graphics.Paint;
import l2.c;
import l2.d;
import android.text.Spanned;
import android.text.Layout;
import android.text.BoringLayout$Metrics;
import android.text.TextPaint;
import kotlin.Metadata;
import zg2.a;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = { "\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003" }, d2 = { "<anonymous>", "", "invoke", "()Ljava/lang/Float;" }, k = 3, mv = { 1, 6, 0 }, xi = 48)
final class LayoutIntrinsics$maxIntrinsicWidth$2 extends Lambda implements a<Float>
{
    public final /* synthetic */ CharSequence $charSequence;
    public final /* synthetic */ TextPaint $textPaint;
    public final /* synthetic */ androidx.compose.ui.text.android.a this$0;
    
    public LayoutIntrinsics$maxIntrinsicWidth$2(final androidx.compose.ui.text.android.a this$0, final CharSequence $charSequence, final TextPaint $textPaint) {
        this.this$0 = this$0;
        this.$charSequence = $charSequence;
        this.$textPaint = $textPaint;
        super(0);
    }
    
    public final Float invoke() {
        final BoringLayout$Metrics boringLayout$Metrics = (BoringLayout$Metrics)this.this$0.a.getValue();
        final boolean b = false;
        float desiredWidth;
        if (boringLayout$Metrics != null) {
            desiredWidth = (float)boringLayout$Metrics.width;
        }
        else {
            final CharSequence $charSequence = this.$charSequence;
            desiredWidth = Layout.getDesiredWidth($charSequence, 0, $charSequence.length(), this.$textPaint);
        }
        final CharSequence $charSequence2 = this.$charSequence;
        final TextPaint $textPaint = this.$textPaint;
        final boolean b2 = desiredWidth == 0.0f;
        int n = b ? 1 : 0;
        Label_0150: {
            if (!b2) {
                n = (b ? 1 : 0);
                if ($charSequence2 instanceof Spanned) {
                    if (((Paint)$textPaint).getLetterSpacing() == 0.0f) {
                        final Spanned spanned = (Spanned)$charSequence2;
                        if (!at1.a.O0(spanned, (Class)d.class)) {
                            n = (b ? 1 : 0);
                            if (!at1.a.O0(spanned, (Class)c.class)) {
                                break Label_0150;
                            }
                        }
                    }
                    n = 1;
                }
            }
        }
        float n2 = desiredWidth;
        if (n != 0) {
            n2 = desiredWidth + 0.5f;
        }
        return n2;
    }
}
