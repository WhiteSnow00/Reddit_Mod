// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.text.android;

import android.text.TextDirectionHeuristic;
import android.text.BoringLayout;
import ah2.f;
import j2.i;
import android.text.TextPaint;
import kotlin.Metadata;
import android.text.BoringLayout$Metrics;
import zg2.a;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = { "\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002" }, d2 = { "<anonymous>", "Landroid/text/BoringLayout$Metrics;", "invoke" }, k = 3, mv = { 1, 6, 0 }, xi = 48)
final class LayoutIntrinsics$boringMetrics$2 extends Lambda implements a<BoringLayout$Metrics>
{
    public final /* synthetic */ CharSequence $charSequence;
    public final /* synthetic */ int $textDirectionHeuristic;
    public final /* synthetic */ TextPaint $textPaint;
    
    public LayoutIntrinsics$boringMetrics$2(final int $textDirectionHeuristic, final CharSequence $charSequence, final TextPaint $textPaint) {
        this.$textDirectionHeuristic = $textDirectionHeuristic;
        this.$charSequence = $charSequence;
        this.$textPaint = $textPaint;
        super(0);
    }
    
    public final BoringLayout$Metrics invoke() {
        final TextDirectionHeuristic a = i.a(this.$textDirectionHeuristic);
        final CharSequence $charSequence = this.$charSequence;
        final TextPaint $textPaint = this.$textPaint;
        f.f((Object)$charSequence, "text");
        final boolean rtl = a.isRtl($charSequence, 0, $charSequence.length());
        BoringLayout$Metrics boring = null;
        if (!rtl) {
            boring = BoringLayout.isBoring($charSequence, $textPaint, (BoringLayout$Metrics)null);
        }
        return boring;
    }
}
