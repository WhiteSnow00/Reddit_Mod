// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.graphics.Matrix;
import android.graphics.Canvas;
import com.bytedance.covode.number.Covode;
import android.graphics.ColorFilter;

public final class 1nk extends 1gr
{
    public final 1hH LIZJ;
    public final String LIZLLL;
    public final 0JP<Integer, Integer> LJ;
    public 0JP<ColorFilter, ColorFilter> LJFF;
    
    static {
        Covode.recordClassIndex(2246);
    }
    
    public 1nk(final 0LK 0lk, final 1hH lizj, final 1Bg 1Bg) {
        super(0lk, lizj, 1Bg.LJI.toPaintCap(), 1Bg.LJII.toPaintJoin(), 1Bg.LJIIIIZZ, 1Bg.LJ, 1Bg.LJFF, 1Bg.LIZJ, 1Bg.LIZIZ);
        this.LIZJ = lizj;
        this.LIZLLL = 1Bg.LIZ;
        final 0JP<Integer, Integer> liz = 1Bg.LIZLLL.LIZ();
        (this.LJ = liz).LIZ((0JP.a)this);
        lizj.LIZ(liz);
    }
    
    @Override
    public final void LIZ(final Canvas canvas, final Matrix matrix, final int n) {
        super.LIZIZ.setColor((int)this.LJ.LJFF());
        if (this.LJFF != null) {
            super.LIZIZ.setColorFilter((ColorFilter)this.LJFF.LJFF());
        }
        super.LIZ(canvas, matrix, n);
    }
    
    @Override
    public final <T> void LIZ(final T t, final 0LI<T> 0li) {
        super.LIZ(t, 0li);
        if (t == 0LS.LIZIZ) {
            this.LJ.LIZ((0LI<Integer>)0li);
            return;
        }
        if (t == 0LS.LJJ) {
            if (0KM.a.LIZ) {
                final 0JP<ColorFilter, ColorFilter> ljff = this.LJFF;
                if (ljff != null) {
                    this.LIZJ.LIZIZ(ljff);
                }
            }
            if (0li == null) {
                this.LJFF = null;
                return;
            }
            (this.LJFF = new 1BR<ColorFilter, ColorFilter>((0LI<ColorFilter>)0li)).LIZ((0JP.a)this);
            this.LIZJ.LIZ(this.LJ);
        }
    }
    
    @Override
    public final String LIZIZ() {
        return this.LIZLLL;
    }
}
