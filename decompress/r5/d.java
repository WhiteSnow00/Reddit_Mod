// 
// Decompiled by Procyon v0.6.0
// 

package r5;

import android.animation.Animator;
import android.graphics.Paint$Style;
import android.graphics.Paint$Cap;
import android.graphics.Paint;
import android.graphics.ColorFilter;
import android.graphics.RectF;
import android.graphics.Rect;
import android.graphics.Path$FillType;
import android.graphics.Path;
import android.graphics.Canvas;
import android.animation.Animator$AnimatorListener;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.content.Context;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import t4.b;
import android.view.animation.LinearInterpolator;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;

public final class d extends Drawable implements Animatable
{
    public static final LinearInterpolator l;
    public static final b m;
    public static final int[] n;
    public final a f;
    public float g;
    public Resources h;
    public ValueAnimator i;
    public float j;
    public boolean k;
    
    static {
        l = new LinearInterpolator();
        m = new b();
        n = new int[] { -16777216 };
    }
    
    public d(final Context context) {
        context.getClass();
        this.h = context.getResources();
        final a f = new a();
        this.f = f;
        f.i = d.n;
        f.a(0);
        f.h = 2.5f;
        f.b.setStrokeWidth(2.5f);
        this.invalidateSelf();
        final ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[] { 0.0f, 1.0f });
        ofFloat.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new r5.b(this, f));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator((TimeInterpolator)d.l);
        ((Animator)ofFloat).addListener((Animator$AnimatorListener)new c(this, f));
        this.i = ofFloat;
    }
    
    public static void d(float n, final a a) {
        if (n > 0.75f) {
            n = (n - 0.75f) / 0.25f;
            final int[] i = a.i;
            final int j = a.j;
            final int n2 = i[j];
            final int n3 = i[(j + 1) % i.length];
            final int n4 = n2 >> 24 & 0xFF;
            final int n5 = n2 >> 16 & 0xFF;
            final int n6 = n2 >> 8 & 0xFF;
            final int n7 = n2 & 0xFF;
            a.u = (n4 + (int)(((n3 >> 24 & 0xFF) - n4) * n) << 24 | n5 + (int)(((n3 >> 16 & 0xFF) - n5) * n) << 16 | n6 + (int)(((n3 >> 8 & 0xFF) - n6) * n) << 8 | n7 + (int)(n * ((n3 & 0xFF) - n7)));
        }
        else {
            a.u = a.i[a.j];
        }
    }
    
    public final void a(final float n, final a a, final boolean b) {
        if (this.k) {
            d(n, a);
            final float n2 = (float)(Math.floor(a.m / 0.8f) + 1.0);
            final float k = a.k;
            final float l = a.l;
            a.e = (l - 0.01f - k) * n + k;
            a.f = l;
            final float m = a.m;
            a.g = d.c(n2, m, n, m);
        }
        else if (n != 1.0f || b) {
            final float i = a.m;
            float j;
            float f;
            if (n < 0.5f) {
                final float n3 = n / 0.5f;
                j = a.k;
                f = d.m.getInterpolation(n3) * 0.79f + 0.01f + j;
            }
            else {
                final float n4 = (n - 0.5f) / 0.5f;
                f = a.k + 0.79f;
                j = f - ((1.0f - d.m.getInterpolation(n4)) * 0.79f + 0.01f);
            }
            final float j2 = this.j;
            a.e = j;
            a.f = f;
            a.g = 0.20999998f * n + i;
            this.g = (n + j2) * 216.0f;
        }
    }
    
    public final void b(final float n, float n2, final float n3, final float n4) {
        final a f = this.f;
        final float density = this.h.getDisplayMetrics().density;
        n2 *= density;
        f.h = n2;
        f.b.setStrokeWidth(n2);
        f.q = n * density;
        f.a(0);
        f.r = (int)(n3 * density);
        f.s = (int)(n4 * density);
    }
    
    public final void c(final int n) {
        if (n == 0) {
            this.b(11.0f, 3.0f, 12.0f, 6.0f);
        }
        else {
            this.b(7.5f, 2.5f, 10.0f, 5.0f);
        }
        this.invalidateSelf();
    }
    
    public final void draw(final Canvas canvas) {
        final Rect bounds = this.getBounds();
        canvas.save();
        canvas.rotate(this.g, bounds.exactCenterX(), bounds.exactCenterY());
        final a f = this.f;
        final RectF a = f.a;
        final float q = f.q;
        float n = f.h / 2.0f + q;
        if (q <= 0.0f) {
            n = Math.min(bounds.width(), bounds.height()) / 2.0f - Math.max(f.r * f.p / 2.0f, f.h / 2.0f);
        }
        a.set(bounds.centerX() - n, bounds.centerY() - n, bounds.centerX() + n, bounds.centerY() + n);
        final float e = f.e;
        final float g = f.g;
        final float n2 = (e + g) * 360.0f;
        final float n3 = (f.f + g) * 360.0f - n2;
        f.b.setColor(f.u);
        f.b.setAlpha(f.t);
        final float n4 = f.h / 2.0f;
        a.inset(n4, n4);
        canvas.drawCircle(a.centerX(), a.centerY(), a.width() / 2.0f, f.d);
        final float n5 = -n4;
        a.inset(n5, n5);
        canvas.drawArc(a, n2, n3, false, f.b);
        if (f.n) {
            final Path o = f.o;
            if (o == null) {
                (f.o = new Path()).setFillType(Path$FillType.EVEN_ODD);
            }
            else {
                o.reset();
            }
            final float n6 = Math.min(a.width(), a.height()) / 2.0f;
            final float n7 = f.r * f.p / 2.0f;
            f.o.moveTo(0.0f, 0.0f);
            f.o.lineTo(f.r * f.p, 0.0f);
            final Path o2 = f.o;
            final float n8 = (float)f.r;
            final float p = f.p;
            o2.lineTo(n8 * p / 2.0f, f.s * p);
            f.o.offset(a.centerX() + n6 - n7, f.h / 2.0f + a.centerY());
            f.o.close();
            f.c.setColor(f.u);
            f.c.setAlpha(f.t);
            canvas.save();
            canvas.rotate(n2 + n3, a.centerX(), a.centerY());
            canvas.drawPath(f.o, f.c);
            canvas.restore();
        }
        canvas.restore();
    }
    
    public final int getAlpha() {
        return this.f.t;
    }
    
    public final int getOpacity() {
        return -3;
    }
    
    public final boolean isRunning() {
        return ((Animator)this.i).isRunning();
    }
    
    public final void setAlpha(final int t) {
        this.f.t = t;
        this.invalidateSelf();
    }
    
    public final void setColorFilter(final ColorFilter colorFilter) {
        this.f.b.setColorFilter(colorFilter);
        this.invalidateSelf();
    }
    
    public final void start() {
        ((Animator)this.i).cancel();
        final a f = this.f;
        final float e = f.e;
        f.k = e;
        final float f2 = f.f;
        f.l = f2;
        f.m = f.g;
        if (f2 != e) {
            this.k = true;
            ((Animator)this.i).setDuration(666L);
            ((Animator)this.i).start();
        }
        else {
            f.a(0);
            final a f3 = this.f;
            f3.k = 0.0f;
            f3.l = 0.0f;
            f3.m = 0.0f;
            f3.e = 0.0f;
            f3.f = 0.0f;
            f3.g = 0.0f;
            ((Animator)this.i).setDuration(1332L);
            ((Animator)this.i).start();
        }
    }
    
    public final void stop() {
        ((Animator)this.i).cancel();
        this.g = 0.0f;
        final a f = this.f;
        if (f.n) {
            f.n = false;
        }
        f.a(0);
        final a f2 = this.f;
        f2.k = 0.0f;
        f2.l = 0.0f;
        f2.m = 0.0f;
        f2.e = 0.0f;
        f2.f = 0.0f;
        f2.g = 0.0f;
        this.invalidateSelf();
    }
    
    public static final class a
    {
        public final RectF a;
        public final Paint b;
        public final Paint c;
        public final Paint d;
        public float e;
        public float f;
        public float g;
        public float h;
        public int[] i;
        public int j;
        public float k;
        public float l;
        public float m;
        public boolean n;
        public Path o;
        public float p;
        public float q;
        public int r;
        public int s;
        public int t;
        public int u;
        
        public a() {
            this.a = new RectF();
            final Paint b = new Paint();
            this.b = b;
            final Paint c = new Paint();
            this.c = c;
            final Paint d = new Paint();
            this.d = d;
            this.e = 0.0f;
            this.f = 0.0f;
            this.g = 0.0f;
            this.h = 5.0f;
            this.p = 1.0f;
            this.t = 255;
            b.setStrokeCap(Paint$Cap.SQUARE);
            b.setAntiAlias(true);
            b.setStyle(Paint$Style.STROKE);
            c.setStyle(Paint$Style.FILL);
            c.setAntiAlias(true);
            d.setColor(0);
        }
        
        public final void a(final int j) {
            this.j = j;
            this.u = this.i[j];
        }
    }
}
