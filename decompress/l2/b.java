// 
// Decompiled by Procyon v0.6.0
// 

package l2;

import android.graphics.Paint;
import ah2.f;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

public final class b extends MetricAffectingSpan
{
    public final String f;
    
    public b(final String f) {
        this.f = f;
    }
    
    public final void updateDrawState(final TextPaint textPaint) {
        ah2.f.f((Object)textPaint, "textPaint");
        ((Paint)textPaint).setFontFeatureSettings(this.f);
    }
    
    public final void updateMeasureState(final TextPaint textPaint) {
        ah2.f.f((Object)textPaint, "textPaint");
        ((Paint)textPaint).setFontFeatureSettings(this.f);
    }
}
