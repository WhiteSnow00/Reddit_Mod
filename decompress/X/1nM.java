// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.Paint;

public final class 1nm extends 1hH
{
    public final Paint LJII;
    public final Rect LJIIIIZZ;
    public final Rect LJIIIZ;
    public 0LL LJIIJ;
    public 0JP<ColorFilter, ColorFilter> LJIIJJI;
    
    static {
        Covode.recordClassIndex(2327);
    }
    
    public 1nm(final 0LK 0lk, final 0Jy 0Jy) {
        super(0lk, 0Jy);
        this.LJIIIIZZ = new Rect();
        this.LJIIIZ = new Rect();
        if (0KM.a.LIZ) {
            if (0KM.a.LJII && 0KM.e.LIZ) {
                this.LJII = new 0JM(1);
            }
            else {
                this.LJII = new 0JM(3);
            }
        }
        else {
            this.LJII = new Paint(3);
        }
        if (0Jy != null && 0Jy.LIZIZ != null && 0Jy.LIZIZ.LIZJ != null) {
            this.LJIIJ = 0Jy.LIZIZ.LIZJ.get(0Jy.LJI);
        }
    }
    
    private int LIZ(final Bitmap bitmap) {
        final 0LL ljiij = this.LJIIJ;
        if (ljiij != null && ljiij.LJII) {
            return this.LJIIJ.LIZ;
        }
        return bitmap.getWidth();
    }
    
    private void LIZ(final RectF rectF) {
        final Bitmap lj = this.LJ();
        if (lj != null) {
            if (0KM.a.LIZ) {
                rectF.set(0.0f, 0.0f, this.LIZ(lj) * 0L9.LIZ(), this.LIZIZ(lj) * 0L9.LIZ());
            }
            else {
                rectF.set(rectF.left, rectF.top, Math.min(rectF.right, (float)lj.getWidth()), Math.min(rectF.bottom, (float)lj.getHeight()));
            }
            super.LIZ.mapRect(rectF);
        }
    }
    
    private int LIZIZ(final Bitmap bitmap) {
        final 0LL ljiij = this.LJIIJ;
        if (ljiij != null && ljiij.LJII) {
            return this.LJIIJ.LIZIZ;
        }
        return bitmap.getHeight();
    }
    
    private Bitmap LJ() {
        return super.LIZIZ.LIZ(super.LIZJ.LJI);
    }
    
    @Override
    public final void LIZ(final RectF rectF, final Matrix matrix) {
        super.LIZ(rectF, matrix);
        this.LIZ(rectF);
    }
    
    @Override
    public final <T> void LIZ(final T t, final 0LI<T> 0li) {
        super.LIZ(t, 0li);
        if (t == 0LS.LJJ) {
            if (0li == null) {
                this.LJIIJJI = null;
                return;
            }
            this.LJIIJJI = new 1BR<ColorFilter, ColorFilter>((0LI<ColorFilter>)0li);
        }
    }
    
    @Override
    public final void LIZIZ(final Canvas canvas, final Matrix matrix, final int alpha) {
        final Bitmap lj = this.LJ();
        if (lj != null && !lj.isRecycled()) {
            final float liz = 0L9.LIZ();
            this.LJII.setAlpha(alpha);
            final 0JP<ColorFilter, ColorFilter> ljiijji = this.LJIIJJI;
            if (ljiijji != null) {
                this.LJII.setColorFilter((ColorFilter)ljiijji.LJFF());
            }
            canvas.save();
            canvas.concat(matrix);
            this.LJIIIIZZ.set(0, 0, lj.getWidth(), lj.getHeight());
            this.LJIIIZ.set(0, 0, (int)(this.LIZ(lj) * liz), (int)(this.LIZIZ(lj) * liz));
            canvas.drawBitmap(lj, this.LJIIIIZZ, this.LJIIIZ, this.LJII);
            canvas.restore();
        }
    }
    
    @Override
    public final void LIZIZ(final RectF rectF, final Matrix matrix) {
        super.LIZIZ(rectF, matrix);
        this.LIZ(rectF);
    }
}
