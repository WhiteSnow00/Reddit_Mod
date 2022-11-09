// 
// Decompiled by Procyon v0.6.0
// 

package l2;

import android.graphics.Paint;
import android.graphics.Canvas;
import ah2.f;
import android.graphics.Paint$FontMetricsInt;
import android.text.style.ReplacementSpan;

public final class g extends ReplacementSpan
{
    public final float f;
    public final int g;
    public final float h;
    public final int i;
    public final float j;
    public final int k;
    public Paint$FontMetricsInt l;
    public int m;
    public int n;
    public boolean o;
    
    public g(final float f, final float h, final float j, final int g, final int i, final int k) {
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
    }
    
    public final Paint$FontMetricsInt a() {
        final Paint$FontMetricsInt l = this.l;
        if (l != null) {
            return l;
        }
        ah2.f.n("fontMetrics");
        throw null;
    }
    
    public final int b() {
        if (this.o) {
            return this.n;
        }
        throw new IllegalStateException("PlaceholderSpan is not laid out yet.".toString());
    }
    
    public final int c() {
        if (this.o) {
            return this.m;
        }
        throw new IllegalStateException("PlaceholderSpan is not laid out yet.".toString());
    }
    
    public final void draw(final Canvas canvas, final CharSequence charSequence, final int n, final int n2, final float n3, final int n4, final int n5, final int n6, final Paint paint) {
        ah2.f.f((Object)canvas, "canvas");
        ah2.f.f((Object)paint, "paint");
    }
    
    public final int getSize(final Paint paint, final CharSequence charSequence, int n, final int n2, final Paint$FontMetricsInt paint$FontMetricsInt) {
        ah2.f.f((Object)paint, "paint");
        this.o = true;
        final float textSize = paint.getTextSize();
        final Paint$FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        ah2.f.e((Object)fontMetricsInt, "paint.fontMetricsInt");
        this.l = fontMetricsInt;
        if (this.a().descent > this.a().ascent) {
            n = 1;
        }
        else {
            n = 0;
        }
        if (n != 0) {
            n = this.g;
            float n3;
            if (n != 0) {
                if (n != 1) {
                    throw new IllegalArgumentException("Unsupported unit.");
                }
                n3 = this.f * textSize;
            }
            else {
                n3 = this.f * this.j;
            }
            this.m = (int)(float)Math.ceil(n3);
            n = this.i;
            double n4;
            if (n != 0) {
                if (n != 1) {
                    throw new IllegalArgumentException("Unsupported unit.");
                }
                n4 = Math.ceil(this.h * textSize);
            }
            else {
                n4 = Math.ceil(this.h * this.j);
            }
            n = (int)(float)n4;
            this.n = n;
            if (paint$FontMetricsInt != null) {
                paint$FontMetricsInt.ascent = this.a().ascent;
                paint$FontMetricsInt.descent = this.a().descent;
                paint$FontMetricsInt.leading = this.a().leading;
                switch (this.k) {
                    default: {
                        throw new IllegalArgumentException("Unknown verticalAlign.");
                    }
                    case 3:
                    case 6: {
                        if (paint$FontMetricsInt.descent - paint$FontMetricsInt.ascent < this.b()) {
                            n = paint$FontMetricsInt.ascent - (this.b() - (paint$FontMetricsInt.descent - paint$FontMetricsInt.ascent)) / 2;
                            paint$FontMetricsInt.ascent = n;
                            paint$FontMetricsInt.descent = this.b() + n;
                            break;
                        }
                        break;
                    }
                    case 2:
                    case 5: {
                        if (paint$FontMetricsInt.ascent > paint$FontMetricsInt.descent - this.b()) {
                            paint$FontMetricsInt.ascent = paint$FontMetricsInt.descent - this.b();
                            break;
                        }
                        break;
                    }
                    case 1:
                    case 4: {
                        n = paint$FontMetricsInt.ascent;
                        if (this.b() + n > paint$FontMetricsInt.descent) {
                            n = paint$FontMetricsInt.ascent;
                            paint$FontMetricsInt.descent = this.b() + n;
                            break;
                        }
                        break;
                    }
                    case 0: {
                        if (paint$FontMetricsInt.ascent > -this.b()) {
                            paint$FontMetricsInt.ascent = -this.b();
                            break;
                        }
                        break;
                    }
                }
                paint$FontMetricsInt.top = Math.min(this.a().top, paint$FontMetricsInt.ascent);
                paint$FontMetricsInt.bottom = Math.max(this.a().bottom, paint$FontMetricsInt.descent);
            }
            return this.c();
        }
        throw new IllegalArgumentException("Invalid fontMetrics: line height can not be negative.".toString());
    }
}
