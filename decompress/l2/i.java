// 
// Decompiled by Procyon v0.6.0
// 

package l2;

import android.graphics.Paint;
import ah2.f;
import android.text.TextPaint;
import android.text.style.CharacterStyle;

public final class i extends CharacterStyle
{
    public final boolean a;
    public final boolean b;
    
    public i(final boolean a, final boolean b) {
        this.a = a;
        this.b = b;
    }
    
    public final void updateDrawState(final TextPaint textPaint) {
        f.f((Object)textPaint, "textPaint");
        ((Paint)textPaint).setUnderlineText(this.a);
        ((Paint)textPaint).setStrikeThruText(this.b);
    }
}
