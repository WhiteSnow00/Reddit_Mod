// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.graphics.Shader$TileMode;
import android.graphics.Shader;
import android.graphics.Canvas;
import java.util.ArrayList;
import com.bytedance.covode.number.Covode;
import android.graphics.ColorFilter;
import android.graphics.PointF;
import java.util.List;
import android.graphics.RectF;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Matrix;
import android.graphics.RadialGradient;
import android.graphics.LinearGradient;

public final class 1gv implements 1BG, 1BH, a
{
    public final String LIZ;
    public final 1hH LIZIZ;
    public final 04v<LinearGradient> LIZJ;
    public final 04v<RadialGradient> LIZLLL;
    public final Matrix LJ;
    public final Path LJFF;
    public final Paint LJI;
    public final RectF LJII;
    public final List<1BI> LJIIIIZZ;
    public final 0Jj LJIIIZ;
    public final 0JP<0Ji, 0Ji> LJIIJ;
    public final 0JP<Integer, Integer> LJIIJJI;
    public final 0JP<PointF, PointF> LJIIL;
    public final 0JP<PointF, PointF> LJIILIIL;
    public 0JP<ColorFilter, ColorFilter> LJIILJJIL;
    public final 0LK LJIILL;
    public final int LJIILLIIL;
    
    static {
        Covode.recordClassIndex(2234);
    }
    
    public 1gv(final 0LK ljiill, final 1hH liziz, final 1BX 1bx) {
        this.LIZJ = new 04v<LinearGradient>();
        this.LIZLLL = new 04v<RadialGradient>();
        this.LJ = new Matrix();
        final Path ljff = new Path();
        this.LJFF = ljff;
        this.LJII = new RectF();
        this.LJIIIIZZ = new ArrayList<1BI>();
        if (0KM.a.LIZ) {
            this.LJI = new 0JM(1);
        }
        else {
            this.LJI = new Paint(1);
        }
        this.LIZIZ = liziz;
        this.LIZ = 1bx.LJI;
        this.LJIILL = ljiill;
        this.LJIIIZ = 1bx.LIZ;
        ljff.setFillType(1bx.LIZIZ);
        this.LJIILLIIL = (int)(ljiill.LIZ.LIZ() / 32.0f);
        final 0JP<0Ji, 0Ji> liz = 1bx.LIZJ.LIZ();
        (this.LJIIJ = liz).LIZ((0JP.a)this);
        liziz.LIZ(liz);
        final 0JP<Integer, Integer> liz2 = 1bx.LIZLLL.LIZ();
        (this.LJIIJJI = liz2).LIZ((0JP.a)this);
        liziz.LIZ(liz2);
        final 0JP<PointF, PointF> liz3 = 1bx.LJ.LIZ();
        (this.LJIIL = liz3).LIZ((0JP.a)this);
        liziz.LIZ(liz3);
        final 0JP<PointF, PointF> liz4 = 1bx.LJFF.LIZ();
        (this.LJIILIIL = liz4).LIZ((0JP.a)this);
        liziz.LIZ(liz4);
    }
    
    private int LIZJ() {
        final int round = Math.round(this.LJIIL.LIZJ * this.LJIILLIIL);
        final int round2 = Math.round(this.LJIILIIL.LIZJ * this.LJIILLIIL);
        final int round3 = Math.round(this.LJIIJ.LIZJ * this.LJIILLIIL);
        int n;
        if (round != 0) {
            n = round * 527;
        }
        else {
            n = 17;
        }
        int n2 = n;
        if (round2 != 0) {
            n2 = n * 31 * round2;
        }
        int n3 = n2;
        if (round3 != 0) {
            n3 = n2 * 31 * round3;
        }
        return n3;
    }
    
    @Override
    public final void LIZ() {
        this.LJIILL.invalidateSelf();
    }
    
    @Override
    public final void LIZ(final 0K3 0k3, final int n, final List<0K3> list, final 0K3 0k4) {
        0L4.LIZ(0k3, n, list, 0k4, this);
    }
    
    @Override
    public final void LIZ(final Canvas canvas, final Matrix matrix, int n) {
        0KB.LIZIZ("GradientFillContent#draw");
        this.LJFF.reset();
        for (int i = 0; i < this.LJIIIIZZ.size(); ++i) {
            this.LJFF.addPath(this.LJIIIIZZ.get(i).LJ(), matrix);
        }
        this.LJFF.computeBounds(this.LJII, false);
        Object shader;
        if (this.LJIIIZ == 0Jj.Linear) {
            final int lizj = this.LIZJ();
            final 04v<LinearGradient> lizj2 = this.LIZJ;
            final long n2 = lizj;
            shader = lizj2.LIZ(n2, null);
            if (shader == null) {
                final PointF pointF = this.LJIIL.LJFF();
                final PointF pointF2 = this.LJIILIIL.LJFF();
                final 0Ji 0Ji = this.LJIIJ.LJFF();
                shader = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, 0Ji.LIZIZ, 0Ji.LIZ, Shader$TileMode.CLAMP);
                this.LIZJ.LIZIZ(n2, (LinearGradient)shader);
            }
        }
        else {
            final int lizj3 = this.LIZJ();
            final 04v<RadialGradient> lizlll = this.LIZLLL;
            final long n3 = lizj3;
            shader = lizlll.LIZ(n3);
            if (shader == null) {
                final PointF pointF3 = this.LJIIL.LJFF();
                final PointF pointF4 = this.LJIILIIL.LJFF();
                final 0Ji 0Ji2 = this.LJIIJ.LJFF();
                final int[] liziz = 0Ji2.LIZIZ;
                final float[] liz = 0Ji2.LIZ;
                final float x = pointF3.x;
                final float y = pointF3.y;
                shader = new RadialGradient(x, y, (float)Math.hypot(pointF4.x - x, pointF4.y - y), liziz, liz, Shader$TileMode.CLAMP);
                this.LIZLLL.LIZIZ(n3, (RadialGradient)shader);
            }
        }
        this.LJ.set(matrix);
        ((Shader)shader).setLocalMatrix(this.LJ);
        this.LJI.setShader((Shader)shader);
        final 0JP<ColorFilter, ColorFilter> ljiiljjil = this.LJIILJJIL;
        if (ljiiljjil != null) {
            this.LJI.setColorFilter((ColorFilter)ljiiljjil.LJFF());
        }
        n = (int)(n / 255.0f * this.LJIIJJI.LJFF() / 100.0f * 255.0f);
        this.LJI.setAlpha(0L4.LIZ(n));
        canvas.drawPath(this.LJFF, this.LJI);
        0KB.LIZJ("GradientFillContent#draw");
    }
    
    @Override
    public final void LIZ(final RectF rectF, final Matrix matrix) {
        this.LJFF.reset();
        for (int i = 0; i < this.LJIIIIZZ.size(); ++i) {
            this.LJFF.addPath(this.LJIIIIZZ.get(i).LJ(), matrix);
        }
        this.LJFF.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }
    
    @Override
    public final <T> void LIZ(final T t, final 0LI<T> 0li) {
        if (t == 0LS.LJJ) {
            if (0KM.a.LIZ) {
                final 0JP<ColorFilter, ColorFilter> ljiiljjil = this.LJIILJJIL;
                if (ljiiljjil != null) {
                    this.LIZIZ.LIZIZ(ljiiljjil);
                }
            }
            if (0li == null) {
                this.LJIILJJIL = null;
                return;
            }
            (this.LJIILJJIL = new 1BR<ColorFilter, ColorFilter>((0LI<ColorFilter>)0li)).LIZ((0JP.a)this);
            this.LIZIZ.LIZ(this.LJIILJJIL);
        }
    }
    
    @Override
    public final void LIZ(final List<0JI> list, final List<0JI> list2) {
        for (int i = 0; i < list2.size(); ++i) {
            final 0JI 0ji = list2.get(i);
            if (0ji instanceof 1BI) {
                this.LJIIIIZZ.add((1BI)0ji);
            }
        }
    }
    
    @Override
    public final String LIZIZ() {
        return this.LIZ;
    }
}
