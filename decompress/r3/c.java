// 
// Decompiled by Procyon v0.6.0
// 

package r3;

import android.graphics.ColorFilter;
import android.graphics.Canvas;
import android.graphics.Shader;
import android.graphics.Shader$TileMode;
import android.content.res.Resources;
import android.graphics.RectF;
import android.graphics.Rect;
import android.graphics.Matrix;
import android.graphics.BitmapShader;
import android.graphics.Paint;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

public abstract class c extends Drawable
{
    public final Bitmap a;
    public int b;
    public int c;
    public final Paint d;
    public final BitmapShader e;
    public final Matrix f;
    public float g;
    public final Rect h;
    public final RectF i;
    public boolean j;
    public boolean k;
    public int l;
    public int m;
    
    public c(final Resources resources, final Bitmap a) {
        this.b = 160;
        this.c = 119;
        this.d = new Paint(3);
        this.f = new Matrix();
        this.h = new Rect();
        this.i = new RectF();
        this.j = true;
        if (resources != null) {
            this.b = resources.getDisplayMetrics().densityDpi;
        }
        if ((this.a = a) != null) {
            this.l = a.getScaledWidth(this.b);
            this.m = a.getScaledHeight(this.b);
            final Shader$TileMode clamp = Shader$TileMode.CLAMP;
            this.e = new BitmapShader(a, clamp, clamp);
        }
        else {
            this.m = -1;
            this.l = -1;
            this.e = null;
        }
    }
    
    public abstract void a(final int p0, final int p1, final int p2, final Rect p3, final Rect p4);
    
    public final void b() {
        if (this.j) {
            if (this.k) {
                final int min = Math.min(this.l, this.m);
                this.a(this.c, min, min, this.getBounds(), this.h);
                final int min2 = Math.min(this.h.width(), this.h.height());
                this.h.inset(Math.max(0, (this.h.width() - min2) / 2), Math.max(0, (this.h.height() - min2) / 2));
                this.g = min2 * 0.5f;
            }
            else {
                this.a(this.c, this.l, this.m, this.getBounds(), this.h);
            }
            this.i.set(this.h);
            if (this.e != null) {
                final Matrix f = this.f;
                final RectF i = this.i;
                f.setTranslate(i.left, i.top);
                this.f.preScale(this.i.width() / this.a.getWidth(), this.i.height() / this.a.getHeight());
                ((Shader)this.e).setLocalMatrix(this.f);
                this.d.setShader((Shader)this.e);
            }
            this.j = false;
        }
    }
    
    public final void draw(final Canvas canvas) {
        final Bitmap a = this.a;
        if (a == null) {
            return;
        }
        this.b();
        if (this.d.getShader() == null) {
            canvas.drawBitmap(a, (Rect)null, this.h, this.d);
        }
        else {
            final RectF i = this.i;
            final float g = this.g;
            canvas.drawRoundRect(i, g, g, this.d);
        }
    }
    
    public final int getAlpha() {
        return this.d.getAlpha();
    }
    
    public final ColorFilter getColorFilter() {
        return this.d.getColorFilter();
    }
    
    public final int getIntrinsicHeight() {
        return this.m;
    }
    
    public final int getIntrinsicWidth() {
        return this.l;
    }
    
    public final int getOpacity() {
        if (this.c == 119) {
            if (!this.k) {
                final Bitmap a = this.a;
                if (a != null && !a.hasAlpha() && this.d.getAlpha() >= 255) {
                    if (this.g <= 0.05f) {
                        return -1;
                    }
                }
            }
        }
        return -3;
    }
    
    public final void onBoundsChange(final Rect rect) {
        super.onBoundsChange(rect);
        if (this.k) {
            this.g = (float)(Math.min(this.m, this.l) / 2);
        }
        this.j = true;
    }
    
    public final void setAlpha(final int alpha) {
        if (alpha != this.d.getAlpha()) {
            this.d.setAlpha(alpha);
            this.invalidateSelf();
        }
    }
    
    public final void setColorFilter(final ColorFilter colorFilter) {
        this.d.setColorFilter(colorFilter);
        this.invalidateSelf();
    }
    
    public final void setDither(final boolean dither) {
        this.d.setDither(dither);
        this.invalidateSelf();
    }
    
    public final void setFilterBitmap(final boolean filterBitmap) {
        this.d.setFilterBitmap(filterBitmap);
        this.invalidateSelf();
    }
}
