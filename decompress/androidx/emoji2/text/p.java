// 
// Decompiled by Procyon v0.6.0
// 

package androidx.emoji2.text;

import android.graphics.Typeface;
import android.graphics.Paint;
import android.graphics.Canvas;

public final class p extends k
{
    public p(final i i) {
        super(i);
    }
    
    public final void draw(final Canvas canvas, final CharSequence charSequence, int a, final int n, final float n2, final int n3, final int n4, final int n5, final Paint paint) {
        androidx.emoji2.text.f.a().getClass();
        final i g = super.g;
        final float n6 = (float)n4;
        final Typeface d = g.b.d;
        final Typeface typeface = paint.getTypeface();
        paint.setTypeface(d);
        a = g.a;
        canvas.drawText(g.b.b, a * 2, 2, n2, n6, paint);
        paint.setTypeface(typeface);
    }
}
