// 
// Decompiled by Procyon v0.6.0
// 

package l2;

import android.graphics.Paint;
import ah2.f;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

public final class c extends MetricAffectingSpan
{
    public final /* synthetic */ int f;
    public final float g = g;
    
    public final void updateDrawState(final TextPaint textPaint) {
        switch (this.f) {
            default: {
                ah2.f.f((Object)textPaint, "textPaint");
                ((Paint)textPaint).setTextSkewX(((Paint)textPaint).getTextSkewX() + this.g);
                return;
            }
            case 0: {
                ah2.f.f((Object)textPaint, "textPaint");
                ((Paint)textPaint).setLetterSpacing(this.g);
            }
        }
    }
    
    public final void updateMeasureState(final TextPaint textPaint) {
        switch (this.f) {
            default: {
                ah2.f.f((Object)textPaint, "textPaint");
                ((Paint)textPaint).setTextSkewX(((Paint)textPaint).getTextSkewX() + this.g);
                return;
            }
            case 0: {
                ah2.f.f((Object)textPaint, "textPaint");
                ((Paint)textPaint).setLetterSpacing(this.g);
            }
        }
    }
}
