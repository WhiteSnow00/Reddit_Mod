// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.graphics.PathEffect;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Canvas;
import android.graphics.Paint$Style;
import java.util.ArrayList;
import android.graphics.Paint$Join;
import android.graphics.Paint$Cap;
import com.bytedance.covode.number.Covode;
import android.graphics.ColorFilter;
import java.util.List;
import android.graphics.RectF;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Paint;

public abstract class 1gr implements 1BG, 1BH, 0JP.a
{
    public final 1hH LIZ;
    public final Paint LIZIZ;
    public final PathMeasure LIZJ;
    public final Path LIZLLL;
    public final Path LJ;
    public final RectF LJFF;
    public final 0LK LJI;
    public final List<a> LJII;
    public final float[] LJIIIIZZ;
    public final 0JP<?, Float> LJIIIZ;
    public final 0JP<?, Integer> LJIIJ;
    public final List<0JP<?, Float>> LJIIJJI;
    public final 0JP<?, Float> LJIIL;
    public 0JP<ColorFilter, ColorFilter> LJIILIIL;
    
    static {
        Covode.recordClassIndex(2226);
    }
    
    public 1gr(final 0LK lji, final 1hH liz, final Paint$Cap strokeCap, final Paint$Join strokeJoin, final float strokeMiter, final 1hC 1hC, final 1hA 1hA, final List<1hA> list, final 1hA 1hA2) {
        this.LIZJ = new PathMeasure();
        this.LIZLLL = new Path();
        this.LJ = new Path();
        this.LJFF = new RectF();
        this.LJII = new ArrayList<a>();
        if (0KM.a.LIZ) {
            this.LIZIZ = new 0JM(1);
        }
        else {
            this.LIZIZ = new Paint(1);
        }
        this.LJI = lji;
        this.LIZ = liz;
        this.LIZIZ.setStyle(Paint$Style.STROKE);
        this.LIZIZ.setStrokeCap(strokeCap);
        this.LIZIZ.setStrokeJoin(strokeJoin);
        this.LIZIZ.setStrokeMiter(strokeMiter);
        this.LJIIJ = 1hC.LIZ();
        this.LJIIIZ = 1hA.LIZ();
        if (1hA2 == null) {
            this.LJIIL = null;
        }
        else {
            this.LJIIL = 1hA2.LIZ();
        }
        this.LJIIJJI = new ArrayList<0JP<?, Float>>(list.size());
        this.LJIIIIZZ = new float[list.size()];
        final int n = 0;
        for (int i = 0; i < list.size(); ++i) {
            this.LJIIJJI.add(((1hA)list.get(i)).LIZ());
        }
        liz.LIZ(this.LJIIJ);
        liz.LIZ(this.LJIIIZ);
        for (int j = 0; j < this.LJIIJJI.size(); ++j) {
            liz.LIZ(this.LJIIJJI.get(j));
        }
        final 0JP<?, Float> ljiil = this.LJIIL;
        if (ljiil != null) {
            liz.LIZ(ljiil);
        }
        this.LJIIJ.LIZ((0JP.a)this);
        this.LJIIIZ.LIZ((0JP.a)this);
        for (int k = n; k < list.size(); ++k) {
            this.LJIIJJI.get(k).LIZ((0JP.a)this);
        }
        final 0JP<?, Float> ljiil2 = this.LJIIL;
        if (ljiil2 != null) {
            ljiil2.LIZ((0JP.a)this);
        }
    }
    
    private void LIZ(final Canvas canvas, final a a, final Matrix matrix) {
        0KB.LIZIZ("StrokeContent#applyTrimPath");
        if (a.LIZIZ == null) {
            0KB.LIZJ("StrokeContent#applyTrimPath");
            return;
        }
        this.LIZLLL.reset();
        for (int i = a.LIZ.size() - 1; i >= 0; --i) {
            this.LIZLLL.addPath(a.LIZ.get(i).LJ(), matrix);
        }
        this.LIZJ.setPath(this.LIZLLL, false);
        float length = this.LIZJ.getLength();
        while (this.LIZJ.nextContour()) {
            length += this.LIZJ.getLength();
        }
        final float n = a.LIZIZ.LIZLLL.LJFF() * length / 360.0f;
        final float n2 = a.LIZIZ.LIZIZ.LJFF() * length / 100.0f + n;
        final float n3 = a.LIZIZ.LIZJ.LJFF() * length / 100.0f + n;
        int j = a.LIZ.size() - 1;
        float n4 = 0.0f;
    Label_0343_Outer:
        while (j >= 0) {
            this.LJ.set(a.LIZ.get(j).LJ());
            this.LJ.transform(matrix);
            this.LIZJ.setPath(this.LJ, false);
            final float length2 = this.LIZJ.getLength();
            float min = 1.0f;
        Label_0367_Outer:
            while (true) {
                float n7;
                while (true) {
                    Label_0386: {
                        if (n3 <= length) {
                            break Label_0386;
                        }
                        final float n5 = n3 - length;
                        if (n5 >= n4 + length2 || n4 >= n5) {
                            break Label_0386;
                        }
                        float n6;
                        if (n2 > length) {
                            n6 = (n2 - length) / length2;
                        }
                        else {
                            n6 = 0.0f;
                        }
                        min = Math.min(n5 / length2, 1.0f);
                        0L9.LIZ(this.LJ, n6, min, 0.0f);
                        canvas.drawPath(this.LJ, this.LIZIZ);
                        n4 += length2;
                        --j;
                        continue Label_0343_Outer;
                    }
                    n7 = n4 + length2;
                    if (n7 < n2 || n4 > n3) {
                        continue;
                    }
                    if (n7 <= n3 && n2 < n4) {
                        canvas.drawPath(this.LJ, this.LIZIZ);
                        continue;
                    }
                    break;
                }
                if (n2 < n4) {
                    final float n6 = 0.0f;
                }
                else {
                    final float n6 = (n2 - n4) / length2;
                }
                if (n3 > n7) {
                    continue Label_0367_Outer;
                }
                min = (n3 - n4) / length2;
                continue Label_0367_Outer;
            }
        }
        0KB.LIZJ("StrokeContent#applyTrimPath");
    }
    
    @Override
    public final void LIZ() {
        this.LJI.invalidateSelf();
    }
    
    @Override
    public final void LIZ(final 0K3 0k3, final int n, final List<0K3> list, final 0K3 0k4) {
        0L4.LIZ(0k3, n, list, 0k4, this);
    }
    
    @Override
    public void LIZ(final Canvas canvas, final Matrix matrix, int i) {
        0KB.LIZIZ("StrokeContent#draw");
        final boolean liz = 0KM.a.LIZ;
        float floatValue = 0.0f;
        final int n = 0;
        if (liz) {
            final float[] array = 0L9.LIZ.get();
            array[1] = (array[0] = 0.0f);
            array[2] = 37394.73f;
            array[3] = 39575.234f;
            matrix.mapPoints(array);
            if (array[0] == array[2] || array[1] == array[3]) {
                0KB.LIZJ("StrokeContent#draw");
                return;
            }
            i = (int)(i / 255.0f * ((1h4)this.LJIIJ).LJI() / 100.0f * 255.0f);
            this.LIZIZ.setAlpha(0L4.LIZ(i));
            this.LIZIZ.setStrokeWidth(((1h2)this.LJIIIZ).LJI() * 0L9.LIZ(matrix));
        }
        else {
            i = (int)(i / 255.0f * this.LJIIJ.LJFF() / 100.0f * 255.0f);
            this.LIZIZ.setAlpha(0L4.LIZ(i));
            this.LIZIZ.setStrokeWidth(this.LJIIIZ.LJFF() * 0L9.LIZ(matrix));
        }
        if (this.LIZIZ.getStrokeWidth() <= 0.0f) {
            0KB.LIZJ("StrokeContent#draw");
            return;
        }
        0KB.LIZIZ("StrokeContent#applyDashPattern");
        if (this.LJIIJJI.isEmpty()) {
            0KB.LIZJ("StrokeContent#applyDashPattern");
        }
        else {
            final float liz2 = 0L9.LIZ(matrix);
            float[] ljiiiizz;
            float[] ljiiiizz2;
            float[] ljiiiizz3;
            for (i = 0; i < this.LJIIJJI.size(); ++i) {
                this.LJIIIIZZ[i] = (float)this.LJIIJJI.get(i).LJFF();
                if (i % 2 == 0) {
                    ljiiiizz = this.LJIIIIZZ;
                    if (ljiiiizz[i] < 1.0f) {
                        ljiiiizz[i] = 1.0f;
                    }
                }
                else {
                    ljiiiizz2 = this.LJIIIIZZ;
                    if (ljiiiizz2[i] < 0.1f) {
                        ljiiiizz2[i] = 0.1f;
                    }
                }
                ljiiiizz3 = this.LJIIIIZZ;
                ljiiiizz3[i] *= liz2;
            }
            if (0KM.a.LIZ) {
                final 0JP<?, Float> ljiil = this.LJIIL;
                if (ljiil != null) {
                    floatValue = ljiil.LJFF() * liz2;
                }
            }
            else {
                final 0JP<?, Float> ljiil2 = this.LJIIL;
                if (ljiil2 != null) {
                    floatValue = ljiil2.LJFF();
                }
            }
            this.LIZIZ.setPathEffect((PathEffect)new DashPathEffect(this.LJIIIIZZ, floatValue));
            0KB.LIZJ("StrokeContent#applyDashPattern");
        }
        final 0JP<ColorFilter, ColorFilter> ljiiliil = this.LJIILIIL;
        i = n;
        if (ljiiliil != null) {
            this.LIZIZ.setColorFilter((ColorFilter)ljiiliil.LJFF());
            i = n;
        }
        while (i < this.LJII.size()) {
            final a a = this.LJII.get(i);
            if (a.LIZIZ != null) {
                this.LIZ(canvas, a, matrix);
            }
            else {
                0KB.LIZIZ("StrokeContent#buildPath");
                this.LIZLLL.reset();
                for (int j = a.LIZ.size() - 1; j >= 0; --j) {
                    this.LIZLLL.addPath(a.LIZ.get(j).LJ(), matrix);
                }
                0KB.LIZJ("StrokeContent#buildPath");
                0KB.LIZIZ("StrokeContent#drawPath");
                canvas.drawPath(this.LIZLLL, this.LIZIZ);
                0KB.LIZJ("StrokeContent#drawPath");
            }
            ++i;
        }
        0KB.LIZJ("StrokeContent#draw");
    }
    
    @Override
    public final void LIZ(final RectF rectF, final Matrix matrix) {
        0KB.LIZIZ("StrokeContent#getBounds");
        this.LIZLLL.reset();
        for (int i = 0; i < this.LJII.size(); ++i) {
            final a a = this.LJII.get(i);
            for (int j = 0; j < a.LIZ.size(); ++j) {
                this.LIZLLL.addPath(a.LIZ.get(j).LJ(), matrix);
            }
        }
        this.LIZLLL.computeBounds(this.LJFF, false);
        float n;
        if (0KM.a.LIZ) {
            n = ((1h2)this.LJIIIZ).LJI();
        }
        else {
            n = this.LJIIIZ.LJFF();
        }
        final RectF ljff = this.LJFF;
        final float left = ljff.left;
        final float n2 = n / 2.0f;
        ljff.set(left - n2, this.LJFF.top - n2, this.LJFF.right + n2, this.LJFF.bottom + n2);
        rectF.set(this.LJFF);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        0KB.LIZJ("StrokeContent#getBounds");
    }
    
    @Override
    public <T> void LIZ(final T t, final 0LI<T> 0li) {
        if (t == 0LS.LIZLLL) {
            this.LJIIJ.LIZ((0LI<Integer>)0li);
            return;
        }
        if (t == 0LS.LJIIJ) {
            this.LJIIIZ.LIZ((0LI<Float>)0li);
            return;
        }
        if (t == 0LS.LJJ) {
            if (0KM.a.LIZ) {
                final 0JP<ColorFilter, ColorFilter> ljiiliil = this.LJIILIIL;
                if (ljiiliil != null) {
                    this.LIZ.LIZIZ(ljiiliil);
                }
            }
            if (0li == null) {
                this.LJIILIIL = null;
                return;
            }
            (this.LJIILIIL = new 1BR<ColorFilter, ColorFilter>((0LI<ColorFilter>)0li)).LIZ((0JP.a)this);
            this.LIZ.LIZ(this.LJIILIIL);
        }
    }
    
    @Override
    public final void LIZ(final List<0JI> list, final List<0JI> list2) {
        int i = list.size() - 1;
        final a a = null;
        1BJ 1bj = null;
        while (i >= 0) {
            final 0JI 0ji = list.get(i);
            1BJ 1bj2 = 1bj;
            if (0ji instanceof 1BJ) {
                final 1BJ 1bj3 = (1BJ)0ji;
                1bj2 = 1bj;
                if (1bj3.LIZ == 1Bh.a.Individually) {
                    1bj2 = 1bj3;
                }
            }
            --i;
            1bj = 1bj2;
        }
        if (1bj != null) {
            1bj.LIZ(this);
        }
        int j = list2.size() - 1;
        a a2 = a;
    Label_0177_Outer:
        while (j >= 0) {
            final 0JI 0ji2 = list2.get(j);
            while (true) {
                Label_0186: {
                    if (!(0ji2 instanceof 1BJ)) {
                        break Label_0186;
                    }
                    final 1BJ 1bj4 = (1BJ)0ji2;
                    if (1bj4.LIZ != 1Bh.a.Individually) {
                        break Label_0186;
                    }
                    if (a2 != null) {
                        this.LJII.add(a2);
                    }
                    final a a3 = new a(1bj4, (byte)0);
                    1bj4.LIZ(this);
                    --j;
                    a2 = a3;
                    continue Label_0177_Outer;
                }
                a a3 = a2;
                if (0ji2 instanceof 1BI) {
                    if ((a3 = a2) == null) {
                        a3 = new a(1bj, (byte)0);
                    }
                    a3.LIZ.add((1BI)0ji2);
                }
                continue;
            }
        }
        if (a2 != null) {
            this.LJII.add(a2);
        }
    }
    
    public static final class a
    {
        public final List<1BI> LIZ;
        public final 1BJ LIZIZ;
        
        static {
            Covode.recordClassIndex(2227);
        }
        
        public a(final 1BJ liziz) {
            this.LIZ = new ArrayList<1BI>();
            this.LIZIZ = liziz;
        }
    }
}
