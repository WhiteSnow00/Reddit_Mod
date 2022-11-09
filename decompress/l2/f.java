// 
// Decompiled by Procyon v0.6.0
// 

package l2;

import android.graphics.Paint$FontMetricsInt;
import android.text.style.LineHeightSpan;

public final class f implements LineHeightSpan
{
    public final float f;
    public final int g;
    public final int h;
    public final boolean i;
    public final boolean j;
    public final int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    
    public f(final float f, int h, final boolean i, final boolean j, final int k) {
        this.f = f;
        final int n = 0;
        this.g = 0;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        if (k >= 0 && k < 101) {
            h = 1;
        }
        else {
            h = 0;
        }
        Label_0073: {
            if (h == 0) {
                h = n;
                if (k != -1) {
                    break Label_0073;
                }
            }
            h = 1;
        }
        if (h != 0) {
            return;
        }
        throw new IllegalStateException("topRatio should be in [0..100] range or -1".toString());
    }
    
    public final void chooseHeight(final CharSequence charSequence, int n, int n2, int n3, int n4, final Paint$FontMetricsInt paint$FontMetricsInt) {
        ah2.f.f((Object)charSequence, "text");
        ah2.f.f((Object)paint$FontMetricsInt, "fontMetricsInt");
        if (paint$FontMetricsInt.descent - paint$FontMetricsInt.ascent <= 0) {
            return;
        }
        n4 = this.g;
        n3 = 1;
        if (n == n4) {
            n = 1;
        }
        else {
            n = 0;
        }
        if (n2 == this.h) {
            n2 = n3;
        }
        else {
            n2 = 0;
        }
        if (n != 0 && n2 != 0 && this.i && this.j) {
            return;
        }
        if (n != 0) {
            n3 = paint$FontMetricsInt.descent;
            n4 = paint$FontMetricsInt.ascent;
            final int n5 = (int)(float)Math.ceil(this.f);
            final int n6 = n5 - (n3 - n4);
            n4 = this.k;
            if ((n3 = n4) == -1) {
                n3 = (int)(Math.abs((float)paint$FontMetricsInt.ascent) / (paint$FontMetricsInt.descent - paint$FontMetricsInt.ascent) * 100.0f);
            }
            double n7;
            if (n6 <= 0) {
                n7 = Math.ceil(n6 * n3 / 100.0f);
            }
            else {
                n7 = Math.ceil((100 - n3) * n6 / 100.0f);
            }
            n3 = (int)(float)n7;
            final int descent = paint$FontMetricsInt.descent;
            n4 = n3 + descent;
            this.n = n4;
            n3 = n4 - n5;
            this.m = n3;
            if (this.i) {
                n3 = paint$FontMetricsInt.ascent;
            }
            this.l = n3;
            if (this.j) {
                n4 = descent;
            }
            this.o = n4;
            this.p = paint$FontMetricsInt.ascent - n3;
            this.q = n4 - descent;
        }
        if (n != 0) {
            n = this.l;
        }
        else {
            n = this.m;
        }
        paint$FontMetricsInt.ascent = n;
        if (n2 != 0) {
            n = this.o;
        }
        else {
            n = this.n;
        }
        paint$FontMetricsInt.descent = n;
    }
}
