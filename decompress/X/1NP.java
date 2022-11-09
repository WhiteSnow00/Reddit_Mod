// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.graphics.Color;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint$Style;
import com.bytedance.covode.number.Covode;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Paint;
import android.graphics.RectF;

public final class 1np extends 1hH
{
    public final RectF LJII;
    public final Paint LJIIIIZZ;
    public final float[] LJIIIZ;
    public final Path LJIIJ;
    public final 0Jy LJIIJJI;
    public 0JP<ColorFilter, ColorFilter> LJIIL;
    
    static {
        Covode.recordClassIndex(2333);
    }
    
    public 1np(final 0LK 0lk, final 0Jy ljiijji) {
        super(0lk, ljiijji);
        this.LJII = new RectF();
        final Paint ljiiiizz = new Paint();
        this.LJIIIIZZ = ljiiiizz;
        this.LJIIIZ = new float[8];
        this.LJIIJ = new Path();
        this.LJIIJJI = ljiijji;
        ljiiiizz.setAlpha(0);
        ljiiiizz.setStyle(Paint$Style.FILL);
        ljiiiizz.setColor(ljiijji.LJIIJJI);
    }
    
    private void LIZ(final RectF rectF) {
        this.LJII.set(0.0f, 0.0f, (float)this.LJIIJJI.LJIIIZ, (float)this.LJIIJJI.LJIIJ);
        super.LIZ.mapRect(this.LJII);
        rectF.set(this.LJII);
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
                this.LJIIL = null;
                return;
            }
            this.LJIIL = new 1BR<ColorFilter, ColorFilter>((0LI<ColorFilter>)0li);
        }
    }
    
    @Override
    public final void LIZIZ(final Canvas canvas, final Matrix matrix, int alpha) {
        final int alpha2 = Color.alpha(this.LJIIJJI.LJIIJJI);
        if (alpha2 == 0) {
            return;
        }
        alpha = (int)(alpha / 255.0f * (alpha2 / 255.0f * super.LJI.LJ.LJFF() / 100.0f) * 255.0f);
        this.LJIIIIZZ.setAlpha(alpha);
        final 0JP<ColorFilter, ColorFilter> ljiil = this.LJIIL;
        if (ljiil != null) {
            this.LJIIIIZZ.setColorFilter((ColorFilter)ljiil.LJFF());
        }
        if (alpha > 0) {
            final float[] ljiiiz = this.LJIIIZ;
            ljiiiz[1] = (ljiiiz[0] = 0.0f);
            ljiiiz[2] = (float)this.LJIIJJI.LJIIIZ;
            final float[] ljiiiz2 = this.LJIIIZ;
            ljiiiz2[3] = 0.0f;
            ljiiiz2[4] = (float)this.LJIIJJI.LJIIIZ;
            this.LJIIIZ[5] = (float)this.LJIIJJI.LJIIJ;
            final float[] ljiiiz3 = this.LJIIIZ;
            ljiiiz3[6] = 0.0f;
            ljiiiz3[7] = (float)this.LJIIJJI.LJIIJ;
            matrix.mapPoints(this.LJIIIZ);
            this.LJIIJ.reset();
            final Path ljiij = this.LJIIJ;
            final float[] ljiiiz4 = this.LJIIIZ;
            ljiij.moveTo(ljiiiz4[0], ljiiiz4[1]);
            final Path ljiij2 = this.LJIIJ;
            final float[] ljiiiz5 = this.LJIIIZ;
            ljiij2.lineTo(ljiiiz5[2], ljiiiz5[3]);
            final Path ljiij3 = this.LJIIJ;
            final float[] ljiiiz6 = this.LJIIIZ;
            ljiij3.lineTo(ljiiiz6[4], ljiiiz6[5]);
            final Path ljiij4 = this.LJIIJ;
            final float[] ljiiiz7 = this.LJIIIZ;
            ljiij4.lineTo(ljiiiz7[6], ljiiiz7[7]);
            final Path ljiij5 = this.LJIIJ;
            final float[] ljiiiz8 = this.LJIIIZ;
            ljiij5.lineTo(ljiiiz8[0], ljiiiz8[1]);
            this.LJIIJ.close();
            canvas.drawPath(this.LJIIJ, this.LJIIIIZZ);
        }
    }
    
    @Override
    public final void LIZIZ(final RectF rectF, final Matrix matrix) {
        super.LIZIZ(rectF, matrix);
        this.LIZ(rectF);
    }
}
