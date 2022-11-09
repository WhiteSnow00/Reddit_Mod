// 
// Decompiled by Procyon v0.6.0
// 

package androidx.emoji2.text;

import o4.c;
import o4.a;
import android.graphics.Paint;
import mj2.c0;
import android.graphics.Paint$FontMetricsInt;
import android.text.style.ReplacementSpan;

public abstract class k extends ReplacementSpan
{
    public final Paint$FontMetricsInt f;
    public final i g;
    public float h;
    
    public k(final i g) {
        this.f = new Paint$FontMetricsInt();
        this.h = 1.0f;
        c0.s((Object)g, "metadata cannot be null");
        this.g = g;
    }
    
    public final int getSize(final Paint paint, final CharSequence charSequence, int n, int n2, final Paint$FontMetricsInt paint$FontMetricsInt) {
        paint.getFontMetricsInt(this.f);
        final Paint$FontMetricsInt f = this.f;
        final float n3 = (float)Math.abs(f.descent - f.ascent);
        final a c = this.g.c();
        n = ((c)c).a(14);
        n2 = 0;
        if (n != 0) {
            n = ((c)c).b.getShort(n + ((c)c).a);
        }
        else {
            n = 0;
        }
        this.h = n3 * 1.0f / n;
        final a c2 = this.g.c();
        n = ((c)c2).a(14);
        if (n != 0) {
            ((c)c2).b.getShort(n + ((c)c2).a);
        }
        final a c3 = this.g.c();
        final int a = ((c)c3).a(12);
        n = n2;
        if (a != 0) {
            n = ((c)c3).b.getShort(a + ((c)c3).a);
        }
        n = (short)(n * this.h);
        if (paint$FontMetricsInt != null) {
            final Paint$FontMetricsInt f2 = this.f;
            paint$FontMetricsInt.ascent = f2.ascent;
            paint$FontMetricsInt.descent = f2.descent;
            paint$FontMetricsInt.top = f2.top;
            paint$FontMetricsInt.bottom = f2.bottom;
        }
        return n;
    }
}
