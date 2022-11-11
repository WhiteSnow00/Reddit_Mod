// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.graphics.RectF;
import android.graphics.Matrix;
import android.graphics.Canvas;
import java.util.ArrayList;
import com.bytedance.covode.number.Covode;
import android.graphics.ColorFilter;
import java.util.List;
import android.graphics.Paint;
import android.graphics.Path;

public final class 1gu implements 1BG, 1BH, a
{
    public final Path LIZ;
    public final Paint LIZIZ;
    public final 1hH LIZJ;
    public final String LIZLLL;
    public final List<1BI> LJ;
    public final 0JP<Integer, Integer> LJFF;
    public final 0JP<Integer, Integer> LJI;
    public 0JP<ColorFilter, ColorFilter> LJII;
    public final 0LK LJIIIIZZ;
    
    static {
        Covode.recordClassIndex(2233);
    }
    
    public 1gu(final 0LK ljiiiizz, final 1hH lizj, final 1Bd 1Bd) {
        final Path liz = new Path();
        this.LIZ = liz;
        this.LIZIZ = new Paint(1);
        this.LJ = new ArrayList<1BI>();
        this.LIZJ = lizj;
        this.LIZLLL = 1Bd.LIZIZ;
        this.LJIIIIZZ = ljiiiizz;
        if (1Bd.LIZJ == null || 1Bd.LIZLLL == null) {
            this.LJFF = null;
            this.LJI = null;
            return;
        }
        liz.setFillType(1Bd.LIZ);
        final 0JP<Integer, Integer> liz2 = 1Bd.LIZJ.LIZ();
        (this.LJFF = liz2).LIZ((0JP.a)this);
        lizj.LIZ(liz2);
        final 0JP<Integer, Integer> liz3 = 1Bd.LIZLLL.LIZ();
        (this.LJI = liz3).LIZ((0JP.a)this);
        lizj.LIZ(liz3);
    }
    
    @Override
    public final void LIZ() {
        this.LJIIIIZZ.invalidateSelf();
    }
    
    @Override
    public final void LIZ(final 0K3 0k3, final int n, final List<0K3> list, final 0K3 0k4) {
        0L4.LIZ(0k3, n, list, 0k4, this);
    }
    
    @Override
    public final void LIZ(final Canvas canvas, final Matrix matrix, int i) {
        0KB.LIZIZ("FillContent#draw");
        this.LIZIZ.setColor((int)this.LJFF.LJFF());
        i = (int)(i / 255.0f * this.LJI.LJFF() / 100.0f * 255.0f);
        this.LIZIZ.setAlpha(0L4.LIZ(i));
        final 0JP<ColorFilter, ColorFilter> ljii = this.LJII;
        if (ljii != null) {
            this.LIZIZ.setColorFilter((ColorFilter)ljii.LJFF());
        }
        this.LIZ.reset();
        for (i = 0; i < this.LJ.size(); ++i) {
            this.LIZ.addPath(this.LJ.get(i).LJ(), matrix);
        }
        canvas.drawPath(this.LIZ, this.LIZIZ);
        0KB.LIZJ("FillContent#draw");
    }
    
    @Override
    public final void LIZ(final RectF rectF, final Matrix matrix) {
        this.LIZ.reset();
        for (int i = 0; i < this.LJ.size(); ++i) {
            this.LIZ.addPath(this.LJ.get(i).LJ(), matrix);
        }
        this.LIZ.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }
    
    @Override
    public final <T> void LIZ(final T t, final 0LI<T> 0li) {
        if (t == 0LS.LIZ) {
            this.LJFF.LIZ((0LI<Integer>)0li);
            return;
        }
        if (t == 0LS.LIZLLL) {
            this.LJI.LIZ((0LI<Integer>)0li);
            return;
        }
        if (t == 0LS.LJJ) {
            if (0KM.a.LIZ) {
                final 0JP<ColorFilter, ColorFilter> ljii = this.LJII;
                if (ljii != null) {
                    this.LIZJ.LIZIZ(ljii);
                }
            }
            if (0li == null) {
                this.LJII = null;
                return;
            }
            (this.LJII = new 1BR<ColorFilter, ColorFilter>((0LI<ColorFilter>)0li)).LIZ((0JP.a)this);
            this.LIZJ.LIZ(this.LJII);
        }
    }
    
    @Override
    public final void LIZ(final List<0JI> list, final List<0JI> list2) {
        for (int i = 0; i < list2.size(); ++i) {
            final 0JI 0ji = list2.get(i);
            if (0ji instanceof 1BI) {
                this.LJ.add((1BI)0ji);
            }
        }
    }
    
    @Override
    public final String LIZIZ() {
        return this.LIZLLL;
    }
}
