// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import com.bytedance.covode.number.Covode;
import android.graphics.RectF;
import java.util.List;

public final class 1nl extends 1hH
{
    public 0JP<Float, Float> LJII;
    public final List<1hH> LJIIIIZZ;
    public final RectF LJIIIZ;
    public final RectF LJIIJ;
    
    static {
        Covode.recordClassIndex(2325);
    }
    
    public 1nl(final 0LK 0lk, final 0Jy 0Jy, final List<0Jy> list, final 0Kp 0Kp) {
        super(0lk, 0Jy);
        this.LJIIIIZZ = new ArrayList<1hH>();
        this.LJIIIZ = new RectF();
        this.LJIIJ = new RectF();
        final 1hA ljiizilj = 0Jy.LJIIZILJ;
        if (ljiizilj != null) {
            this.LIZ(this.LJII = ljiizilj.LIZ());
            this.LJII.LIZ((0JP.a)this);
        }
        else {
            this.LJII = null;
        }
        final 04v<1hH> 04v = new 04v<1hH>(0Kp.LJFF.size());
        int n = list.size() - 1;
        1hH 1hH = null;
        int i;
        while (true) {
            i = 0;
            if (n < 0) {
                break;
            }
            final 0Jy 0Jy2 = list.get(n);
            final 1hH liz = X.1hH.LIZ(0Jy2, 0lk, 0Kp);
            1hH 1hH2 = 1hH;
            if (liz != null) {
                04v.LIZIZ(liz.LIZJ.LIZLLL, liz);
                if (1hH != null) {
                    1hH.LJ = liz;
                    1hH2 = null;
                }
                else {
                    this.LJIIIIZZ.add(0, liz);
                    final int n2 = 0Jv.LIZ[0Jy2.LJIJI.ordinal()];
                    if (n2 != 1 && n2 != 2) {
                        1hH2 = 1hH;
                    }
                    else {
                        1hH2 = liz;
                    }
                }
            }
            --n;
            1hH = 1hH2;
        }
        while (i < 04v.LIZIZ()) {
            final 1hH 1hH3 = 04v.LIZ(04v.LIZIZ(i));
            if (1hH3 != null) {
                final 1hH ljff = 04v.LIZ(1hH3.LIZJ.LJFF);
                if (ljff != null) {
                    1hH3.LJFF = ljff;
                }
            }
            ++i;
        }
    }
    
    private void LIZ(final RectF rectF) {
        if (0KM.a.LIZ) {
            for (int i = this.LJIIIIZZ.size() - 1; i >= 0; --i) {
                this.LJIIIZ.set(0.0f, 0.0f, 0.0f, 0.0f);
                this.LJIIIIZZ.get(i).LIZIZ(this.LJIIIZ, super.LIZ);
                rectF.union(this.LJIIIZ);
            }
            return;
        }
        this.LJIIIZ.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int j = this.LJIIIIZZ.size() - 1; j >= 0; --j) {
            this.LJIIIIZZ.get(j).LIZ(this.LJIIIZ, super.LIZ);
            if (rectF.isEmpty()) {
                rectF.set(this.LJIIIZ);
            }
            else {
                rectF.set(Math.min(rectF.left, this.LJIIIZ.left), Math.min(rectF.top, this.LJIIIZ.top), Math.max(rectF.right, this.LJIIIZ.right), Math.max(rectF.bottom, this.LJIIIZ.bottom));
            }
        }
    }
    
    @Override
    public final void LIZ(float n) {
        super.LIZ(n);
        if (0KM.a.LIZ) {
            float n2 = n;
            if (this.LJII != null) {
                final float liziz = super.LIZIZ.LIZ.LIZIZ();
                n = super.LIZJ.LIZIZ.LJII;
                n2 = (this.LJII.LJFF() * super.LIZJ.LIZIZ.LJIIIZ - n) / (liziz + 0.01f);
            }
            n = n2;
            if (this.LJII == null) {
                n = n2 - super.LIZJ.LIZ();
            }
            float n3 = n;
            if (super.LIZJ.LJIIL != 0.0f) {
                n3 = n / super.LIZJ.LJIIL;
            }
            for (int i = this.LJIIIIZZ.size() - 1; i >= 0; --i) {
                this.LJIIIIZZ.get(i).LIZ(n3);
            }
            return;
        }
        if (this.LJII != null) {
            n = super.LIZIZ.LIZ.LIZ();
            n = (long)(this.LJII.LJFF() * 1000.0f) / n;
        }
        float n4 = n;
        if (super.LIZJ.LJIIL != 0.0f) {
            n4 = n / super.LIZJ.LJIIL;
        }
        n = super.LIZJ.LIZ();
        for (int j = this.LJIIIIZZ.size() - 1; j >= 0; --j) {
            this.LJIIIIZZ.get(j).LIZ(n4 - n);
        }
    }
    
    @Override
    public final void LIZ(final RectF rectF, final Matrix matrix) {
        super.LIZ(rectF, matrix);
        this.LIZ(rectF);
    }
    
    @Override
    public final <T> void LIZ(final T t, final 0LI<T> 0li) {
        super.LIZ(t, 0li);
        if (t == 0LS.LJIL) {
            if (0li == null) {
                if (!0KM.a.LIZ) {
                    this.LJII = null;
                    return;
                }
                final 0JP<Float, Float> ljii = this.LJII;
                if (ljii != null) {
                    ljii.LIZ((0LI<Float>)null);
                }
            }
            else {
                this.LJII = new 1BR<Float, Float>((0LI<Float>)0li);
                if (0KM.a.LIZ) {
                    this.LJII.LIZ((0JP.a)this);
                }
                this.LIZ(this.LJII);
            }
        }
    }
    
    @Override
    public final void LIZIZ(final 0K3 0k3, final int n, final List<0K3> list, final 0K3 0k4) {
        for (int i = 0; i < this.LJIIIIZZ.size(); ++i) {
            this.LJIIIIZZ.get(i).LIZ(0k3, n, list, 0k4);
        }
    }
    
    @Override
    public final void LIZIZ(final Canvas canvas, final Matrix matrix, final int n) {
        0KB.LIZIZ("CompositionLayer#draw");
        canvas.save();
        this.LJIIJ.set(0.0f, 0.0f, (float)super.LIZJ.LJIILIIL, (float)super.LIZJ.LJIILJJIL);
        matrix.mapRect(this.LJIIJ);
        for (int i = this.LJIIIIZZ.size() - 1; i >= 0; --i) {
            if (this.LJIIJ.isEmpty() || canvas.clipRect(this.LJIIJ)) {
                this.LJIIIIZZ.get(i).LIZ(canvas, matrix, n);
            }
        }
        canvas.restore();
        0KB.LIZJ("CompositionLayer#draw");
    }
    
    @Override
    public final void LIZIZ(final RectF rectF, final Matrix matrix) {
        super.LIZIZ(rectF, matrix);
        this.LIZ(rectF);
    }
}
