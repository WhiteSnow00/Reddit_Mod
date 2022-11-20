// 
// Decompiled by Procyon v0.6.0
// 

package s2;

import android.graphics.Paint;
import cg.d;
import android.text.TextPaint;
import n1.f;
import o1.j0;
import android.text.style.UpdateAppearance;
import android.text.style.CharacterStyle;

public final class a extends CharacterStyle implements UpdateAppearance
{
    public final j0 f;
    public final float g;
    public f h;
    
    public a(final j0 f, final float g) {
        this.f = f;
        this.g = g;
    }
    
    public final void updateDrawState(final TextPaint textPaint) {
        if (textPaint != null) {
            final f h = this.h;
            if (h != null) {
                ((Paint)textPaint).setShader(this.f.b(h.a));
            }
            d.M3(textPaint, this.g);
        }
    }
}
