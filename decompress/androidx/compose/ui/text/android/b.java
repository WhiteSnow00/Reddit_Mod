// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.text.android;

import android.graphics.Canvas;
import android.text.TextDirectionHeuristic;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import j2.g;
import android.text.TextPaint;
import android.text.BoringLayout;
import android.text.BoringLayout$Metrics;
import android.text.Spanned;
import android.text.Layout$Alignment;
import j2.h;
import j2.i;
import android.text.TextUtils$TruncateAt;
import q2.a;
import pg2.f;
import android.text.Layout;

public final class b
{
    public final boolean a;
    public final Layout b;
    public final int c;
    public final int d;
    public final int e;
    public final f f;
    
    public b(final CharSequence charSequence, final float n, final a a, int i, final TextUtils$TruncateAt textUtils$TruncateAt, int n2, int max, int q, final androidx.compose.ui.text.android.a a2) {
        ah2.f.f((Object)charSequence, "charSequence");
        ah2.f.f((Object)a, "textPaint");
        ah2.f.f((Object)a2, "layoutIntrinsics");
        final int length = charSequence.length();
        final TextDirectionHeuristic a3 = i.a(n2);
        final Layout$Alignment a4 = h.a;
        Layout$Alignment layout$Alignment;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            layout$Alignment = Layout$Alignment.ALIGN_NORMAL;
                        }
                        else {
                            layout$Alignment = h.b;
                        }
                    }
                    else {
                        layout$Alignment = h.a;
                    }
                }
                else {
                    layout$Alignment = Layout$Alignment.ALIGN_CENTER;
                }
            }
            else {
                layout$Alignment = Layout$Alignment.ALIGN_OPPOSITE;
            }
        }
        else {
            layout$Alignment = Layout$Alignment.ALIGN_NORMAL;
        }
        if (charSequence instanceof Spanned && ((Spanned)charSequence).nextSpanTransition(-1, length, (Class)l2.a.class) < length) {
            i = 1;
        }
        else {
            i = 0;
        }
        final BoringLayout$Metrics boringLayout$Metrics = (BoringLayout$Metrics)a2.a.getValue();
        final double n3 = n;
        n2 = (int)(float)Math.ceil(n3);
        Object a5;
        if (boringLayout$Metrics != null && ((Number)a2.c.getValue()).floatValue() <= n && i == 0) {
            ah2.f.f((Object)layout$Alignment, "alignment");
            if (n2 >= 0) {
                i = 1;
            }
            else {
                i = 0;
            }
            if (i == 0) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (n2 >= 0) {
                i = 1;
            }
            else {
                i = 0;
            }
            if (i == 0) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (textUtils$TruncateAt == null) {
                a5 = new BoringLayout(charSequence, (TextPaint)a, n2, layout$Alignment, 1.0f, 0.0f, boringLayout$Metrics, true);
            }
            else {
                a5 = new BoringLayout(charSequence, (TextPaint)a, n2, layout$Alignment, 1.0f, 0.0f, boringLayout$Metrics, true, textUtils$TruncateAt, n2);
            }
            i = 0;
        }
        else {
            i = charSequence.length();
            final int n4 = (int)(float)Math.ceil(n3);
            ah2.f.f((Object)layout$Alignment, "alignment");
            a5 = ((j2.f)gn.a.x0).a(new g(charSequence, i, a, n2, a3, layout$Alignment, max, textUtils$TruncateAt, n4, 1.0f, 0.0f, q, true, true, 0, 0, (int[])null, (int[])null));
            i = 0;
        }
        q = 1;
        this.b = (Layout)a5;
        n2 = Math.min(((Layout)a5).getLineCount(), max);
        this.c = n2;
        Label_0482: {
            if (n2 >= max) {
                --n2;
                if (((Layout)a5).getEllipsisCount(n2) > 0 || ((Layout)a5).getLineEnd(n2) != charSequence.length()) {
                    n2 = 1;
                    break Label_0482;
                }
            }
            n2 = i;
        }
        this.a = (n2 != 0);
        final Pair pair = new Pair((Object)i, (Object)i);
        l2.f[] array;
        if (!(this.e() instanceof Spanned)) {
            array = new l2.f[i];
        }
        else {
            array = (l2.f[])((Spanned)this.e()).getSpans(i, this.e().length(), (Class)l2.f.class);
            ah2.f.e((Object)array, "lineHeightStyleSpans");
            if (array.length == 0) {
                n2 = q;
            }
            else {
                n2 = i;
            }
            if (n2 != 0) {
                array = new l2.f[i];
            }
        }
        int length2;
        l2.f f;
        int p9;
        for (length2 = array.length, n2 = (q = (max = i)); i < length2; ++i, q = n2) {
            f = array[i];
            p9 = f.p;
            n2 = q;
            if (p9 < 0) {
                n2 = Math.max(q, Math.abs(p9));
            }
            q = f.q;
            if (q < 0) {
                max = Math.max(n2, Math.abs(q));
            }
        }
        Pair a6;
        if (q == 0 && max == 0) {
            a6 = i.a;
        }
        else {
            a6 = new Pair((Object)q, (Object)max);
        }
        this.d = Math.max(((Number)pair.getFirst()).intValue(), ((Number)a6.getFirst()).intValue());
        this.e = Math.max(((Number)pair.getSecond()).intValue(), ((Number)a6.getSecond()).intValue());
        this.f = kotlin.a.a(LazyThreadSafetyMode.NONE, (zg2.a)new TextLayout$layoutHelper$2(this));
    }
    
    public static float d(final b b, final int n) {
        return ((j2.b)b.f.getValue()).a(n, true, false);
    }
    
    public final float a(final int n) {
        return this.d + (float)this.b.getLineBaseline(n);
    }
    
    public final float b(int e) {
        final float n = (float)this.d;
        final float n2 = (float)this.b.getLineBottom(e);
        if (e == this.c - 1) {
            e = this.e;
        }
        else {
            e = 0;
        }
        return n + n2 + e;
    }
    
    public final float c(int d) {
        final float n = (float)this.b.getLineTop(d);
        if (d == 0) {
            d = 0;
        }
        else {
            d = this.d;
        }
        return n + d;
    }
    
    public final CharSequence e() {
        final CharSequence text = this.b.getText();
        ah2.f.e((Object)text, "layout.text");
        return text;
    }
    
    public final void f(final Canvas canvas) {
        ah2.f.f((Object)canvas, "canvas");
        final int d = this.d;
        if (d != 0) {
            canvas.translate(0.0f, (float)d);
        }
        this.b.draw(canvas);
        final int d2 = this.d;
        if (d2 != 0) {
            canvas.translate(0.0f, -1 * (float)d2);
        }
    }
}
