// 
// Decompiled by Procyon v0.6.0
// 

package qf;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.support.v4.media.b;

public final class e extends b
{
    public final /* synthetic */ TextPaint f;
    public final /* synthetic */ b g;
    public final /* synthetic */ d h;
    
    public e(final d h, final TextPaint f, final b g) {
        this.h = h;
        this.f = f;
        this.g = g;
    }
    
    public final void y0(final int n) {
        this.g.y0(n);
    }
    
    public final void z0(final Typeface typeface, final boolean b) {
        this.h.d(this.f, typeface);
        this.g.z0(typeface, b);
    }
}
