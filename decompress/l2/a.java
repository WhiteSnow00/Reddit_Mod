// 
// Decompiled by Procyon v0.6.0
// 

package l2;

import android.graphics.Paint;
import ah2.f;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

public final class a extends MetricAffectingSpan
{
    public final float f;
    
    public a(final float f) {
        this.f = f;
    }
    
    public final void updateDrawState(final TextPaint textPaint) {
        ah2.f.f((Object)textPaint, "textPaint");
        textPaint.baselineShift += (int)(float)Math.ceil(((Paint)textPaint).ascent() * this.f);
    }
    
    public final void updateMeasureState(final TextPaint textPaint) {
        ah2.f.f((Object)textPaint, "textPaint");
        textPaint.baselineShift += (int)(float)Math.ceil(((Paint)textPaint).ascent() * this.f);
    }
}
