// 
// Decompiled by Procyon v0.6.0
// 

package l2;

import android.graphics.Paint;
import android.text.TextPaint;
import ah2.f;
import android.graphics.Typeface;
import android.text.style.MetricAffectingSpan;

public final class j extends MetricAffectingSpan
{
    public final /* synthetic */ int f;
    public final Typeface g;
    
    public j(final Typeface typeface, final int f) {
        this.f = f;
        if (f != 1) {
            ah2.f.f((Object)typeface, "typeface");
            this.g = typeface;
            return;
        }
        ah2.f.f((Object)typeface, "typeface");
        this.g = typeface;
    }
    
    public final void updateDrawState(final TextPaint textPaint) {
        switch (this.f) {
            default: {
                ah2.f.f((Object)textPaint, "ds");
                ((Paint)textPaint).setTypeface(this.g);
                return;
            }
            case 0: {
                ah2.f.f((Object)textPaint, "ds");
                ((Paint)textPaint).setTypeface(this.g);
            }
        }
    }
    
    public final void updateMeasureState(final TextPaint textPaint) {
        switch (this.f) {
            default: {
                ah2.f.f((Object)textPaint, "paint");
                ((Paint)textPaint).setTypeface(this.g);
                return;
            }
            case 0: {
                ah2.f.f((Object)textPaint, "paint");
                ((Paint)textPaint).setTypeface(this.g);
            }
        }
    }
}
