// 
// Decompiled by Procyon v0.6.0
// 

package l2;

import android.graphics.Paint;
import ah2.f;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

public final class d extends MetricAffectingSpan
{
    public final float f;
    
    public d(final float f) {
        this.f = f;
    }
    
    public final void updateDrawState(final TextPaint textPaint) {
        ah2.f.f((Object)textPaint, "textPaint");
        final float n = ((Paint)textPaint).getTextScaleX() * ((Paint)textPaint).getTextSize();
        if (n != 0.0f) {
            ((Paint)textPaint).setLetterSpacing(this.f / n);
        }
    }
    
    public final void updateMeasureState(final TextPaint textPaint) {
        ah2.f.f((Object)textPaint, "textPaint");
        final float n = ((Paint)textPaint).getTextScaleX() * ((Paint)textPaint).getTextSize();
        if (n != 0.0f) {
            ((Paint)textPaint).setLetterSpacing(this.f / n);
        }
    }
}
