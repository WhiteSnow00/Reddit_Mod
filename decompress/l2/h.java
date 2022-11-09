// 
// Decompiled by Procyon v0.6.0
// 

package l2;

import android.graphics.Paint;
import ah2.f;
import android.text.TextPaint;
import android.text.style.CharacterStyle;

public final class h extends CharacterStyle
{
    public final int a;
    public final float b;
    public final float c;
    public final float d;
    
    public h(final int a, final float b, final float c, final float d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final void updateDrawState(final TextPaint textPaint) {
        f.f((Object)textPaint, "tp");
        ((Paint)textPaint).setShadowLayer(this.d, this.b, this.c, this.a);
    }
}
