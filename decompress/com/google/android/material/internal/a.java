// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.internal;

import android.text.Layout;
import t4.b;
import android.view.Gravity;
import android.text.TextUtils;
import android.graphics.Canvas;
import android.util.Log;
import android.text.Layout$Alignment;
import android.text.TextUtils$TruncateAt;
import java.util.WeakHashMap;
import y3.f;
import a4.p0;
import android.view.animation.LinearInterpolator;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.RectF;
import android.graphics.Rect;
import android.view.View;
import android.text.StaticLayout;
import android.content.res.ColorStateList;
import android.animation.TimeInterpolator;
import android.text.TextPaint;
import android.graphics.Bitmap;

public final class a
{
    public Bitmap A;
    public float B;
    public float C;
    public int[] D;
    public boolean E;
    public final TextPaint F;
    public final TextPaint G;
    public TimeInterpolator H;
    public TimeInterpolator I;
    public float J;
    public float K;
    public float L;
    public ColorStateList M;
    public float N;
    public float O;
    public float P;
    public ColorStateList Q;
    public StaticLayout R;
    public float S;
    public float T;
    public float U;
    public CharSequence V;
    public int W;
    public final View a;
    public boolean b;
    public float c;
    public final Rect d;
    public final Rect e;
    public final RectF f;
    public int g;
    public int h;
    public float i;
    public float j;
    public ColorStateList k;
    public ColorStateList l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public Typeface s;
    public Typeface t;
    public Typeface u;
    public sf.a v;
    public sf.a w;
    public CharSequence x;
    public CharSequence y;
    public boolean z;
    
    public a(final View a) {
        this.g = 16;
        this.h = 16;
        this.i = 15.0f;
        this.j = 15.0f;
        this.W = 1;
        this.a = a;
        final TextPaint f = new TextPaint(129);
        this.F = f;
        this.G = new TextPaint((Paint)f);
        this.e = new Rect();
        this.d = new Rect();
        this.f = new RectF();
    }
    
    public static int a(final float n, final int n2, final int n3) {
        final float n4 = 1.0f - n;
        return Color.argb((int)(Color.alpha(n3) * n + Color.alpha(n2) * n4), (int)(Color.red(n3) * n + Color.red(n2) * n4), (int)(Color.green(n3) * n + Color.green(n2) * n4), (int)(Color.blue(n3) * n + Color.blue(n2) * n4));
    }
    
    public static float h(final float n, final float n2, final float n3, final TimeInterpolator timeInterpolator) {
        float interpolation = n3;
        if (timeInterpolator != null) {
            interpolation = timeInterpolator.getInterpolation(n3);
        }
        final LinearInterpolator a = ze.a.a;
        return d.c(n2, n, interpolation, n);
    }
    
    public final float b() {
        if (this.x == null) {
            return 0.0f;
        }
        final TextPaint g = this.G;
        ((Paint)g).setTextSize(this.j);
        ((Paint)g).setTypeface(this.s);
        final TextPaint g2 = this.G;
        final CharSequence x = this.x;
        return ((Paint)g2).measureText(x, 0, x.length());
    }
    
    public final boolean c(final CharSequence charSequence) {
        final View a = this.a;
        final WeakHashMap a2 = p0.a;
        final int d = p0.e.d(a);
        boolean b = true;
        if (d != 1) {
            b = false;
        }
        f.d d2;
        if (b) {
            d2 = y3.f.d;
        }
        else {
            d2 = y3.f.c;
        }
        return ((f.c)d2).b(charSequence, charSequence.length());
    }
    
    public final void d(float min) {
        if (this.x == null) {
            return;
        }
        final float n = (float)this.e.width();
        final float n2 = (float)this.d.width();
        final float abs = Math.abs(min - this.j);
        final int n3 = 1;
        float c;
        int n4;
        if (abs < 0.001f) {
            c = this.j;
            this.B = 1.0f;
            final Typeface u = this.u;
            final Typeface s = this.s;
            if (u != s) {
                this.u = s;
                n4 = 1;
                min = n;
            }
            else {
                n4 = 0;
                min = n;
            }
        }
        else {
            c = this.i;
            final Typeface u2 = this.u;
            final Typeface t = this.t;
            if (u2 != t) {
                this.u = t;
                n4 = 1;
            }
            else {
                n4 = 0;
            }
            if (Math.abs(min - c) < 0.001f) {
                this.B = 1.0f;
            }
            else {
                this.B = min / this.i;
            }
            min = this.j / this.i;
            if (n2 * min > n) {
                min = Math.min(n / min, n2);
            }
            else {
                min = n2;
            }
        }
        int n5 = n4;
        if (min > 0.0f) {
            final boolean b = this.C != c || this.E || n4 != 0;
            this.C = c;
            this.E = false;
            n5 = (b ? 1 : 0);
        }
        if (this.y == null || n5 != 0) {
            ((Paint)this.F).setTextSize(this.C);
            ((Paint)this.F).setTypeface(this.u);
            ((Paint)this.F).setLinearText(this.B != 1.0f);
            final boolean c2 = this.c(this.x);
            this.z = c2;
            final int w = this.W;
            final boolean b2 = w > 1 && !c2;
            int f = n3;
            if (b2) {
                f = w;
            }
            StaticLayout a;
            try {
                final StaticLayoutBuilderCompat staticLayoutBuilderCompat = new StaticLayoutBuilderCompat((int)min, this.x, this.F);
                staticLayoutBuilderCompat.i = TextUtils$TruncateAt.END;
                staticLayoutBuilderCompat.h = c2;
                staticLayoutBuilderCompat.e = Layout$Alignment.ALIGN_NORMAL;
                staticLayoutBuilderCompat.g = false;
                staticLayoutBuilderCompat.f = f;
                a = staticLayoutBuilderCompat.a();
            }
            catch (final StaticLayoutBuilderCompat.StaticLayoutBuilderCompatException ex) {
                Log.e("CollapsingTextHelper", ex.getCause().getMessage(), (Throwable)ex);
                a = null;
            }
            a.getClass();
            this.R = a;
            this.y = ((Layout)a).getText();
        }
    }
    
    public final void e(final Canvas canvas) {
        final int save = canvas.save();
        if (this.y != null && this.b) {
            final float q = this.q;
            final float lineLeft = ((Layout)this.R).getLineLeft(0);
            final float u = this.U;
            ((Paint)this.F).setTextSize(this.C);
            final float q2 = this.q;
            final float r = this.r;
            final float b = this.B;
            if (b != 1.0f) {
                canvas.scale(b, b, q2, r);
            }
            final int w = this.W;
            boolean b2 = true;
            if (w <= 1 || this.z) {
                b2 = false;
            }
            if (b2) {
                final int alpha = ((Paint)this.F).getAlpha();
                canvas.translate(lineLeft + q - u * 2.0f, r);
                final TextPaint f = this.F;
                final float t = this.T;
                final float n = (float)alpha;
                ((Paint)f).setAlpha((int)(t * n));
                ((Layout)this.R).draw(canvas);
                ((Paint)this.F).setAlpha((int)(this.S * n));
                final int lineBaseline = ((Layout)this.R).getLineBaseline(0);
                final CharSequence v = this.V;
                final int length = v.length();
                final float n2 = (float)lineBaseline;
                canvas.drawText(v, 0, length, 0.0f, n2, (Paint)this.F);
                String s2;
                final String s = s2 = this.V.toString().trim();
                if (s.endsWith("\u2026")) {
                    s2 = s.substring(0, s.length() - 1);
                }
                ((Paint)this.F).setAlpha(alpha);
                canvas.drawText(s2, 0, Math.min(((Layout)this.R).getLineEnd(0), s2.length()), 0.0f, n2, (Paint)this.F);
            }
            else {
                canvas.translate(q2, r);
                ((Layout)this.R).draw(canvas);
            }
            canvas.restoreToCount(save);
        }
    }
    
    public final float f() {
        final TextPaint g = this.G;
        ((Paint)g).setTextSize(this.j);
        ((Paint)g).setTypeface(this.s);
        return -((Paint)this.G).ascent();
    }
    
    public final int g(final ColorStateList list) {
        if (list == null) {
            return 0;
        }
        final int[] d = this.D;
        if (d != null) {
            return list.getColorForState(d, 0);
        }
        return list.getDefaultColor();
    }
    
    public final void i() {
        this.b = (this.e.width() > 0 && this.e.height() > 0 && this.d.width() > 0 && this.d.height() > 0);
    }
    
    public final void j() {
        if (this.a.getHeight() > 0 && this.a.getWidth() > 0) {
            final float c = this.C;
            this.d(this.j);
            final CharSequence y = this.y;
            if (y != null) {
                final StaticLayout r = this.R;
                if (r != null) {
                    this.V = TextUtils.ellipsize(y, this.F, (float)((Layout)r).getWidth(), TextUtils$TruncateAt.END);
                }
            }
            final CharSequence v = this.V;
            float measureText;
            if (v != null) {
                measureText = ((Paint)this.F).measureText(v, 0, v.length());
            }
            else {
                measureText = 0.0f;
            }
            final int absoluteGravity = Gravity.getAbsoluteGravity(this.h, (int)(this.z ? 1 : 0));
            final int n = absoluteGravity & 0x70;
            if (n != 48) {
                if (n != 80) {
                    this.n = this.e.centerY() - (((Paint)this.F).descent() - ((Paint)this.F).ascent()) / 2.0f;
                }
                else {
                    this.n = ((Paint)this.F).ascent() + this.e.bottom;
                }
            }
            else {
                this.n = (float)this.e.top;
            }
            final int n2 = absoluteGravity & 0x800007;
            if (n2 != 1) {
                if (n2 != 5) {
                    this.p = (float)this.e.left;
                }
                else {
                    this.p = this.e.right - measureText;
                }
            }
            else {
                this.p = this.e.centerX() - measureText / 2.0f;
            }
            this.d(this.i);
            final StaticLayout r2 = this.R;
            float n3;
            if (r2 != null) {
                n3 = (float)((Layout)r2).getHeight();
            }
            else {
                n3 = 0.0f;
            }
            final CharSequence y2 = this.y;
            float measureText2;
            if (y2 != null) {
                measureText2 = ((Paint)this.F).measureText(y2, 0, y2.length());
            }
            else {
                measureText2 = 0.0f;
            }
            final StaticLayout r3 = this.R;
            float n4 = measureText2;
            if (r3 != null) {
                n4 = measureText2;
                if (this.W > 1) {
                    n4 = measureText2;
                    if (!this.z) {
                        n4 = (float)((Layout)r3).getWidth();
                    }
                }
            }
            final StaticLayout r4 = this.R;
            float lineLeft;
            if (r4 != null) {
                lineLeft = ((Layout)r4).getLineLeft(0);
            }
            else {
                lineLeft = 0.0f;
            }
            this.U = lineLeft;
            final int absoluteGravity2 = Gravity.getAbsoluteGravity(this.g, (int)(this.z ? 1 : 0));
            final int n5 = absoluteGravity2 & 0x70;
            if (n5 != 48) {
                if (n5 != 80) {
                    this.m = this.d.centerY() - n3 / 2.0f;
                }
                else {
                    this.m = ((Paint)this.F).descent() + (this.d.bottom - n3);
                }
            }
            else {
                this.m = (float)this.d.top;
            }
            final int n6 = absoluteGravity2 & 0x800007;
            if (n6 != 1) {
                if (n6 != 5) {
                    this.o = (float)this.d.left;
                }
                else {
                    this.o = this.d.right - n4;
                }
            }
            else {
                this.o = this.d.centerX() - n4 / 2.0f;
            }
            final Bitmap a = this.A;
            if (a != null) {
                a.recycle();
                this.A = null;
            }
            this.o(c);
            final float c2 = this.c;
            this.f.left = h((float)this.d.left, (float)this.e.left, c2, this.H);
            this.f.top = h(this.m, this.n, c2, this.H);
            this.f.right = h((float)this.d.right, (float)this.e.right, c2, this.H);
            this.f.bottom = h((float)this.d.bottom, (float)this.e.bottom, c2, this.H);
            this.q = h(this.o, this.p, c2, this.H);
            this.r = h(this.m, this.n, c2, this.H);
            this.o(h(this.i, this.j, c2, this.I));
            final b b = ze.a.b;
            this.S = 1.0f - h(0.0f, 1.0f, 1.0f - c2, (TimeInterpolator)b);
            final View a2 = this.a;
            final WeakHashMap a3 = p0.a;
            p0.d.k(a2);
            this.T = h(1.0f, 0.0f, c2, (TimeInterpolator)b);
            p0.d.k(this.a);
            final ColorStateList l = this.l;
            final ColorStateList k = this.k;
            if (l != k) {
                ((Paint)this.F).setColor(a(c2, this.g(k), this.g(this.l)));
            }
            else {
                ((Paint)this.F).setColor(this.g(l));
            }
            ((Paint)this.F).setShadowLayer(h(this.N, this.J, c2, null), h(this.O, this.K, c2, null), h(this.P, this.L, c2, null), a(c2, this.g(this.Q), this.g(this.M)));
            p0.d.k(this.a);
        }
    }
    
    public final void k(final int n) {
        final sf.d d = new sf.d(this.a.getContext(), n);
        final ColorStateList b = d.b;
        if (b != null) {
            this.l = b;
        }
        final float a = d.a;
        if (a != 0.0f) {
            this.j = a;
        }
        final ColorStateList f = d.f;
        if (f != null) {
            this.M = f;
        }
        this.K = d.g;
        this.L = d.h;
        this.J = d.i;
        final sf.a w = this.w;
        if (w != null) {
            w.c = true;
        }
        final sf.a.a a2 = new sf.a.a() {
            @Override
            public final void a(final Typeface s) {
                final a a = com.google.android.material.internal.a.this;
                final a w = a.w;
                boolean b = true;
                if (w != null) {
                    w.c = true;
                }
                if (a.s != s) {
                    a.s = s;
                }
                else {
                    b = false;
                }
                if (b) {
                    a.j();
                }
            }
        };
        d.a();
        this.w = new sf.a((sf.a.a)a2, d.l);
        d.b(this.a.getContext(), (bj2.d)this.w);
        this.j();
    }
    
    public final void l(final ColorStateList l) {
        if (this.l != l) {
            this.l = l;
            this.j();
        }
    }
    
    public final void m(final int n) {
        final sf.d d = new sf.d(this.a.getContext(), n);
        final ColorStateList b = d.b;
        if (b != null) {
            this.k = b;
        }
        final float a = d.a;
        if (a != 0.0f) {
            this.i = a;
        }
        final ColorStateList f = d.f;
        if (f != null) {
            this.Q = f;
        }
        this.O = d.g;
        this.P = d.h;
        this.N = d.i;
        final sf.a v = this.v;
        if (v != null) {
            v.c = true;
        }
        final sf.a.a a2 = new sf.a.a() {
            @Override
            public final void a(final Typeface t) {
                final a a = com.google.android.material.internal.a.this;
                final a v = a.v;
                boolean b = true;
                if (v != null) {
                    v.c = true;
                }
                if (a.t != t) {
                    a.t = t;
                }
                else {
                    b = false;
                }
                if (b) {
                    a.j();
                }
            }
        };
        d.a();
        this.v = new sf.a((sf.a.a)a2, d.l);
        d.b(this.a.getContext(), (bj2.d)this.v);
        this.j();
    }
    
    public final void n(final float n) {
        float c;
        if (n < 0.0f) {
            c = 0.0f;
        }
        else {
            c = n;
            if (n > 1.0f) {
                c = 1.0f;
            }
        }
        if (c != this.c) {
            this.c = c;
            this.f.left = h((float)this.d.left, (float)this.e.left, c, this.H);
            this.f.top = h(this.m, this.n, c, this.H);
            this.f.right = h((float)this.d.right, (float)this.e.right, c, this.H);
            this.f.bottom = h((float)this.d.bottom, (float)this.e.bottom, c, this.H);
            this.q = h(this.o, this.p, c, this.H);
            this.r = h(this.m, this.n, c, this.H);
            this.o(h(this.i, this.j, c, this.I));
            final b b = ze.a.b;
            this.S = 1.0f - h(0.0f, 1.0f, 1.0f - c, (TimeInterpolator)b);
            final View a = this.a;
            final WeakHashMap a2 = p0.a;
            p0.d.k(a);
            this.T = h(1.0f, 0.0f, c, (TimeInterpolator)b);
            p0.d.k(this.a);
            final ColorStateList l = this.l;
            final ColorStateList k = this.k;
            if (l != k) {
                ((Paint)this.F).setColor(a(c, this.g(k), this.g(this.l)));
            }
            else {
                ((Paint)this.F).setColor(this.g(l));
            }
            ((Paint)this.F).setShadowLayer(h(this.N, this.J, c, null), h(this.O, this.K, c, null), h(this.P, this.L, c, null), a(c, this.g(this.Q), this.g(this.M)));
            p0.d.k(this.a);
        }
    }
    
    public final void o(final float n) {
        this.d(n);
        final View a = this.a;
        final WeakHashMap a2 = p0.a;
        p0.d.k(a);
    }
    
    public final boolean p(final int[] d) {
        this.D = d;
        final ColorStateList l = this.l;
        boolean b = false;
        Label_0044: {
            if (l == null || !l.isStateful()) {
                final ColorStateList k = this.k;
                if (k == null || !k.isStateful()) {
                    b = false;
                    break Label_0044;
                }
            }
            b = true;
        }
        if (b) {
            this.j();
            return true;
        }
        return false;
    }
}
