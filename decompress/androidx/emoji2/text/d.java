// 
// Decompiled by Procyon v0.6.0
// 

package androidx.emoji2.text;

import android.graphics.Paint;
import android.text.TextPaint;

public final class d implements f$d
{
    public static final ThreadLocal<StringBuilder> b;
    public final TextPaint a;
    
    static {
        b = new ThreadLocal<StringBuilder>();
    }
    
    public d() {
        ((Paint)(this.a = new TextPaint())).setTextSize(10.0f);
    }
}
