// 
// Decompiled by Procyon v0.6.0
// 

package l2;

import ah2.f;
import android.graphics.Paint$FontMetricsInt;
import android.text.style.LineHeightSpan;

public final class e implements LineHeightSpan
{
    public final float f;
    
    public e(final float f) {
        this.f = f;
    }
    
    public final void chooseHeight(final CharSequence charSequence, int n, int descent, final int n2, final int n3, final Paint$FontMetricsInt paint$FontMetricsInt) {
        ah2.f.f((Object)charSequence, "text");
        ah2.f.f((Object)paint$FontMetricsInt, "fontMetricsInt");
        descent = paint$FontMetricsInt.descent - paint$FontMetricsInt.ascent;
        if (descent <= 0) {
            return;
        }
        n = (int)(float)Math.ceil(this.f);
        descent = (int)Math.ceil(paint$FontMetricsInt.descent * (double)(n * 1.0f / descent));
        paint$FontMetricsInt.descent = descent;
        paint$FontMetricsInt.ascent = descent - n;
    }
}
