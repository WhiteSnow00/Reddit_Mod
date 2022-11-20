// 
// Decompiled by Procyon v0.6.0
// 

package je2;

import android.view.View;
import com.yalantis.ucrop.view.GestureCropImageView;
import java.lang.ref.WeakReference;
import zd.b;
import java.util.Arrays;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;

public class a extends c
{
    public float A;
    public float B;
    public fe2.c C;
    public a.a$a D;
    public b E;
    public float F;
    public float G;
    public int H;
    public int I;
    public long J;
    public final RectF y;
    public final Matrix z;
    
    public a(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public a(final Context context, final AttributeSet set, final int n) {
        super(context, set, 0);
        this.y = new RectF();
        this.z = new Matrix();
        this.B = 10.0f;
        this.E = null;
        this.H = 0;
        this.I = 0;
        this.J = 500L;
    }
    
    @Override
    public final void f() {
        super.f();
        final Drawable drawable = this.getDrawable();
        if (drawable == null) {
            return;
        }
        final float n = (float)drawable.getIntrinsicWidth();
        final float n2 = (float)drawable.getIntrinsicHeight();
        if (this.A == 0.0f) {
            this.A = n / n2;
        }
        final int n3 = super.n;
        final float n4 = (float)n3;
        final float a = this.A;
        final int n5 = (int)(n4 / a);
        final int o = super.o;
        if (n5 > o) {
            final float n6 = (float)o;
            final int n7 = (int)(a * n6);
            final int n8 = (n3 - n7) / 2;
            this.y.set((float)n8, 0.0f, (float)(n7 + n8), n6);
        }
        else {
            final int n9 = (o - n5) / 2;
            this.y.set(0.0f, (float)n9, n4, (float)(n5 + n9));
        }
        this.i(n, n2);
        final float width = this.y.width();
        final float height = this.y.height();
        final float max = Math.max(this.y.width() / n, this.y.height() / n2);
        final float n10 = (width - n * max) / 2.0f;
        final RectF y = this.y;
        final float left = y.left;
        final float n11 = (height - n2 * max) / 2.0f;
        final float top = y.top;
        super.m.reset();
        super.m.postScale(max, max);
        super.m.postTranslate(n10 + left, n11 + top);
        this.setImageMatrix(super.m);
        final fe2.c c = this.C;
        if (c != null) {
            ((d)c).a.g.setTargetAspectRatio(this.A);
        }
        final c.a p = super.p;
        if (p != null) {
            this.getCurrentScale();
            p.c();
            final c.a p2 = super.p;
            this.getCurrentAngle();
            p2.d();
        }
    }
    
    @Override
    public final void g(final float n, final float n2, final float n3) {
        if (n > 1.0f && this.getCurrentScale() * n <= this.getMaxScale()) {
            super.g(n, n2, n3);
        }
        else if (n < 1.0f && this.getCurrentScale() * n >= this.getMinScale()) {
            super.g(n, n2, n3);
        }
    }
    
    public fe2.c getCropBoundsChangeListener() {
        return this.C;
    }
    
    public float getMaxScale() {
        return this.F;
    }
    
    public float getMinScale() {
        return this.G;
    }
    
    public float getTargetAspectRatio() {
        return this.A;
    }
    
    public final void i(float min, final float n) {
        min = Math.min(Math.min(this.y.width() / min, this.y.width() / n), Math.min(this.y.height() / n, this.y.height() / min));
        this.G = min;
        this.F = min * this.B;
    }
    
    public final boolean j(float[] copy) {
        this.z.reset();
        this.z.setRotate(-this.getCurrentAngle());
        copy = Arrays.copyOf(copy, copy.length);
        this.z.mapPoints(copy);
        final float[] a0 = zd.b.a0(this.y);
        this.z.mapPoints(a0);
        return zd.b.t1(copy).contains(zd.b.t1(a0));
    }
    
    public final void k(final float n, final float n2, final float n3) {
        if (n <= this.getMaxScale()) {
            this.g(n / this.getCurrentScale(), n2, n3);
        }
    }
    
    public void setCropBoundsChangeListener(final fe2.c c) {
        this.C = c;
    }
    
    public void setCropRect(final RectF rectF) {
        this.A = rectF.width() / rectF.height();
        this.y.set(rectF.left - ((View)this).getPaddingLeft(), rectF.top - ((View)this).getPaddingTop(), rectF.right - ((View)this).getPaddingRight(), rectF.bottom - ((View)this).getPaddingBottom());
        final Drawable drawable = this.getDrawable();
        if (drawable != null) {
            this.i((float)drawable.getIntrinsicWidth(), (float)drawable.getIntrinsicHeight());
        }
        this.setImageToWrapCropBounds(true);
    }
    
    public void setImageToWrapCropBounds(final boolean b) {
        if (super.t && !this.j(super.j)) {
            final float[] k = super.k;
            final float n = k[0];
            final float n2 = k[1];
            final float currentScale = this.getCurrentScale();
            float n3 = this.y.centerX() - n;
            float n4 = this.y.centerY() - n2;
            this.z.reset();
            this.z.setTranslate(n3, n4);
            final float[] j = super.j;
            final float[] copy = Arrays.copyOf(j, j.length);
            this.z.mapPoints(copy);
            final boolean i = this.j(copy);
            float n12;
            if (i) {
                this.z.reset();
                this.z.setRotate(-this.getCurrentAngle());
                final float[] l = super.j;
                final float[] copy2 = Arrays.copyOf(l, l.length);
                final float[] a0 = b.a0(this.y);
                this.z.mapPoints(copy2);
                this.z.mapPoints(a0);
                final RectF t1 = b.t1(copy2);
                final RectF t2 = b.t1(a0);
                float n5 = t1.left - t2.left;
                final float n6 = t1.top - t2.top;
                final float n7 = t1.right - t2.right;
                final float n8 = t1.bottom - t2.bottom;
                final float[] array = new float[4];
                if (n5 <= 0.0f) {
                    n5 = 0.0f;
                }
                array[0] = n5;
                float n9;
                if (n6 > 0.0f) {
                    n9 = n6;
                }
                else {
                    n9 = 0.0f;
                }
                array[1] = n9;
                float n10;
                if (n7 < 0.0f) {
                    n10 = n7;
                }
                else {
                    n10 = 0.0f;
                }
                array[2] = n10;
                float n11;
                if (n8 < 0.0f) {
                    n11 = n8;
                }
                else {
                    n11 = 0.0f;
                }
                array[3] = n11;
                this.z.reset();
                this.z.setRotate(this.getCurrentAngle());
                this.z.mapPoints(array);
                n3 = -(array[0] + array[2]);
                n4 = -(array[1] + array[3]);
                n12 = 0.0f;
            }
            else {
                final RectF rectF = new RectF(this.y);
                this.z.reset();
                this.z.setRotate(this.getCurrentAngle());
                this.z.mapRect(rectF);
                final float[] m = super.j;
                final float[] array2 = { (float)Math.sqrt(Math.pow(m[1] - m[3], 2.0) + Math.pow(m[0] - m[2], 2.0)), (float)Math.sqrt(Math.pow(m[3] - m[5], 2.0) + Math.pow(m[2] - m[4], 2.0)) };
                n12 = Math.max(rectF.width() / array2[0], rectF.height() / array2[1]) * currentScale - currentScale;
            }
            if (b) {
                ((View)this).post((Runnable)(this.D = new a.a$a(this, this.J, n, n2, n3, n4, currentScale, n12, i)));
            }
            else {
                this.h(n3, n4);
                if (!i) {
                    this.k(currentScale + n12, this.y.centerX(), this.y.centerY());
                }
            }
        }
    }
    
    public void setImageToWrapCropBoundsAnimDuration(final long j) {
        if (j > 0L) {
            this.J = j;
            return;
        }
        throw new IllegalArgumentException("Animation duration cannot be negative value.");
    }
    
    public void setMaxResultImageSizeX(final int h) {
        this.H = h;
    }
    
    public void setMaxResultImageSizeY(final int i) {
        this.I = i;
    }
    
    public void setMaxScaleMultiplier(final float b) {
        this.B = b;
    }
    
    public void setTargetAspectRatio(float a) {
        final Drawable drawable = this.getDrawable();
        if (drawable == null) {
            this.A = a;
            return;
        }
        if (a == 0.0f) {
            this.A = drawable.getIntrinsicWidth() / (float)drawable.getIntrinsicHeight();
        }
        else {
            this.A = a;
        }
        final fe2.c c = this.C;
        if (c != null) {
            a = this.A;
            ((d)c).a.g.setTargetAspectRatio(a);
        }
    }
    
    public static final class b implements Runnable
    {
        public final WeakReference<a> f;
        public final long g;
        public final long h;
        public final float i;
        public final float j;
        public final float k;
        public final float l;
        
        public b(final GestureCropImageView gestureCropImageView, final float i, final float j, final float k, final float l) {
            this.f = new WeakReference<a>(gestureCropImageView);
            this.h = System.currentTimeMillis();
            this.g = 200L;
            this.i = i;
            this.j = j;
            this.k = k;
            this.l = l;
        }
        
        @Override
        public final void run() {
            final a a = this.f.get();
            if (a == null) {
                return;
            }
            final float n = (float)Math.min(this.g, System.currentTimeMillis() - this.h);
            final float j = this.j;
            final long g = this.g;
            final float n2 = n / (g / 2.0f);
            final float n3 = j / 2.0f;
            float n4;
            if (n2 < 1.0f) {
                n4 = n3 * n2 * n2 * n2 + 0.0f;
            }
            else {
                final float n5 = n2 - 2.0f;
                n4 = (n5 * n5 * n5 + 2.0f) * n3 + 0.0f;
            }
            if (n < g) {
                a.k(this.i + n4, this.k, this.l);
                ((View)a).post((Runnable)this);
            }
            else {
                a.setImageToWrapCropBounds(true);
            }
        }
    }
}
