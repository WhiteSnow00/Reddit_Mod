// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.graphics.ColorFilter;
import android.graphics.Canvas;
import android.graphics.Shader;
import android.graphics.Shader$TileMode;
import android.content.res.Resources;
import com.bytedance.covode.number.Covode;
import android.graphics.RectF;
import android.graphics.Matrix;
import android.graphics.BitmapShader;
import android.graphics.Rect;
import android.graphics.Paint;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

public abstract class 08V extends Drawable
{
    public final Bitmap LIZ;
    public int LIZIZ;
    public final Paint LIZJ;
    public float LIZLLL;
    public final Rect LJ;
    public boolean LJFF;
    public int LJI;
    public final BitmapShader LJII;
    public final Matrix LJIIIIZZ;
    public final RectF LJIIIZ;
    public boolean LJIIJ;
    public int LJIIJJI;
    public int LJIIL;
    
    static {
        Covode.recordClassIndex(892);
    }
    
    public 08V(final Resources resources, final Bitmap liz) {
        this.LJI = 160;
        this.LIZIZ = 119;
        this.LIZJ = new Paint(3);
        this.LJIIIIZZ = new Matrix();
        this.LJ = new Rect();
        this.LJIIIZ = new RectF();
        this.LJIIJ = true;
        if (resources != null) {
            this.LJI = resources.getDisplayMetrics().densityDpi;
        }
        if ((this.LIZ = liz) != null) {
            this.LJIIJJI = liz.getScaledWidth(this.LJI);
            this.LJIIL = liz.getScaledHeight(this.LJI);
            final Shader$TileMode clamp = Shader$TileMode.CLAMP;
            this.LJII = new BitmapShader(liz, clamp, clamp);
            return;
        }
        this.LJIIL = -1;
        this.LJIIJJI = -1;
        this.LJII = null;
    }
    
    public static boolean LIZIZ(final float n) {
        return n > 0.05f;
    }
    
    private void LIZJ() {
        this.LIZLLL = (float)(Math.min(this.LJIIL, this.LJIIJJI) / 2);
    }
    
    public final void LIZ() {
        if (this.LJIIJ) {
            if (this.LJFF) {
                final int min = Math.min(this.LJIIJJI, this.LJIIL);
                this.LIZ(this.LIZIZ, min, min, this.getBounds(), this.LJ);
                final int min2 = Math.min(this.LJ.width(), this.LJ.height());
                this.LJ.inset(Math.max(0, (this.LJ.width() - min2) / 2), Math.max(0, (this.LJ.height() - min2) / 2));
                this.LIZLLL = min2 * 0.5f;
            }
            else {
                this.LIZ(this.LIZIZ, this.LJIIJJI, this.LJIIL, this.getBounds(), this.LJ);
            }
            this.LJIIIZ.set(this.LJ);
            if (this.LJII != null) {
                this.LJIIIIZZ.setTranslate(this.LJIIIZ.left, this.LJIIIZ.top);
                this.LJIIIIZZ.preScale(this.LJIIIZ.width() / this.LIZ.getWidth(), this.LJIIIZ.height() / this.LIZ.getHeight());
                this.LJII.setLocalMatrix(this.LJIIIIZZ);
                this.LIZJ.setShader((Shader)this.LJII);
            }
            this.LJIIJ = false;
        }
    }
    
    public final void LIZ(final float lizlll) {
        if (this.LIZLLL == lizlll) {
            return;
        }
        this.LJFF = false;
        if (LIZIZ(lizlll)) {
            this.LIZJ.setShader((Shader)this.LJII);
        }
        else {
            this.LIZJ.setShader((Shader)null);
        }
        this.LIZLLL = lizlll;
        this.invalidateSelf();
    }
    
    public void LIZ(final int n, final int n2, final int n3, final Rect rect, final Rect rect2) {
        throw new UnsupportedOperationException();
    }
    
    public final void LIZIZ() {
        this.LJFF = true;
        this.LJIIJ = true;
        this.LIZJ();
        this.LIZJ.setShader((Shader)this.LJII);
        this.invalidateSelf();
    }
    
    public void draw(final Canvas canvas) {
        final Bitmap liz = this.LIZ;
        if (liz == null) {
            return;
        }
        this.LIZ();
        if (this.LIZJ.getShader() == null) {
            canvas.drawBitmap(liz, (Rect)null, this.LJ, this.LIZJ);
            return;
        }
        final RectF ljiiiz = this.LJIIIZ;
        final float lizlll = this.LIZLLL;
        canvas.drawRoundRect(ljiiiz, lizlll, lizlll, this.LIZJ);
    }
    
    public int getAlpha() {
        return this.LIZJ.getAlpha();
    }
    
    public ColorFilter getColorFilter() {
        return this.LIZJ.getColorFilter();
    }
    
    public int getIntrinsicHeight() {
        return this.LJIIL;
    }
    
    public int getIntrinsicWidth() {
        return this.LJIIJJI;
    }
    
    public int getOpacity() {
        if (this.LIZIZ == 119 && !this.LJFF) {
            final Bitmap liz = this.LIZ;
            if (liz != null && !liz.hasAlpha() && this.LIZJ.getAlpha() >= 255) {
                if (!LIZIZ(this.LIZLLL)) {
                    return -1;
                }
            }
        }
        return -3;
    }
    
    public void onBoundsChange(final Rect rect) {
        super.onBoundsChange(rect);
        if (this.LJFF) {
            this.LIZJ();
        }
        this.LJIIJ = true;
    }
    
    public void setAlpha(final int alpha) {
        if (alpha != this.LIZJ.getAlpha()) {
            this.LIZJ.setAlpha(alpha);
            this.invalidateSelf();
        }
    }
    
    public void setColorFilter(final ColorFilter colorFilter) {
        this.LIZJ.setColorFilter(colorFilter);
        this.invalidateSelf();
    }
    
    public void setDither(final boolean dither) {
        this.LIZJ.setDither(dither);
        this.invalidateSelf();
    }
    
    public void setFilterBitmap(final boolean filterBitmap) {
        this.LIZJ.setFilterBitmap(filterBitmap);
        this.invalidateSelf();
    }
}
