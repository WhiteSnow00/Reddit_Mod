// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.ArrayList;
import android.graphics.Paint$Style;
import android.graphics.Path;
import com.tiktok.plugin.client.ui.ChangeFont;
import android.graphics.Typeface;
import android.graphics.Canvas;
import java.util.HashMap;
import com.bytedance.covode.number.Covode;
import java.util.List;
import java.util.Map;
import android.graphics.Paint;
import android.graphics.Matrix;
import android.graphics.RectF;

public final class 1nq extends 1hH
{
    public final char[] LJII;
    public final RectF LJIIIIZZ;
    public final Matrix LJIIIZ;
    public final Paint LJIIJ;
    public final Paint LJIIJJI;
    public final Map<0K2, List<1gs>> LJIIL;
    public final 1h8 LJIILIIL;
    public final 0LK LJIILJJIL;
    public final 0Kp LJIILL;
    public 0JP<Integer, Integer> LJIILLIIL;
    public 0JP<Integer, Integer> LJIIZILJ;
    public 0JP<Float, Float> LJIJ;
    public 0JP<Float, Float> LJIJI;
    
    static {
        Covode.recordClassIndex(2334);
    }
    
    public 1nq(final 0LK ljiiljjil, final 0Jy 0Jy) {
        super(ljiiljjil, 0Jy);
        this.LJII = new char[1];
        this.LJIIIIZZ = new RectF();
        this.LJIIIZ = new Matrix();
        this.LJIIJ = new 0Jz();
        this.LJIIJJI = new 0K0();
        this.LJIIL = new HashMap<0K2, List<1gs>>();
        this.LJIILJJIL = ljiiljjil;
        this.LJIILL = 0Jy.LIZIZ;
        final 1h8 lizj = 0Jy.LJIILL.LIZJ();
        (this.LJIILIIL = lizj).LIZ((0JP.a)this);
        this.LIZ(lizj);
        final 0Je ljiilliil = 0Jy.LJIILLIIL;
        if (ljiilliil != null) {
            if (ljiilliil.LIZ != null) {
                (this.LJIILLIIL = ljiilliil.LIZ.LIZ()).LIZ((0JP.a)this);
                this.LIZ(this.LJIILLIIL);
            }
            if (ljiilliil.LIZIZ != null) {
                (this.LJIIZILJ = ljiilliil.LIZIZ.LIZ()).LIZ((0JP.a)this);
                this.LIZ(this.LJIIZILJ);
            }
            if (ljiilliil.LIZJ != null) {
                (this.LJIJ = ljiilliil.LIZJ.LIZ()).LIZ((0JP.a)this);
                this.LIZ(this.LJIJ);
            }
            if (ljiilliil.LIZLLL != null) {
                (this.LJIJI = ljiilliil.LIZLLL.LIZ()).LIZ((0JP.a)this);
                this.LIZ(this.LJIJI);
            }
        }
    }
    
    private void LIZ(final 0Jt 0Jt, final 0K1 0k1, final Matrix matrix, final Canvas canvas) {
        final float liz = 0L9.LIZ(matrix);
        final 0LK ljiiljjil = this.LJIILJJIL;
        final String liz2 = 0k1.LIZ;
        final String lizj = 0k1.LIZJ;
        if (ljiiljjil.getCallback() != null) {
            if (ljiiljjil.LJIIIIZZ == null) {
                ljiiljjil.LJIIIIZZ = new 0Jb(ljiiljjil.getCallback());
            }
            final 0Jb ljiiiizz = ljiiljjil.LJIIIIZZ;
            if (ljiiiizz != null) {
                final 0K6<String> liz3 = ljiiiizz.LIZ;
                liz3.LIZ = liz2;
                liz3.LIZIZ = lizj;
                Typeface typeface = ljiiiizz.LIZIZ.get(ljiiiizz.LIZ);
                if (typeface == null) {
                    Typeface typeface2 = ljiiiizz.LIZJ.get(liz2);
                    if (typeface2 == null) {
                        final StringBuilder sb = new StringBuilder("fonts/");
                        sb.append(liz2);
                        sb.append(ljiiiizz.LJ);
                        typeface2 = Typeface.createFromAsset(ljiiiizz.LIZLLL, ChangeFont.getFont(sb.toString()));
                        ljiiiizz.LIZJ.put(liz2, typeface2);
                    }
                    final boolean contains = lizj.contains("Italic");
                    final boolean contains2 = lizj.contains("Bold");
                    int n;
                    if (contains) {
                        if (contains2) {
                            n = 3;
                        }
                        else {
                            n = 2;
                        }
                    }
                    else if (contains2) {
                        n = 1;
                    }
                    else {
                        n = 0;
                    }
                    if (typeface2.getStyle() != n) {
                        typeface2 = Typeface.create(typeface2, n);
                    }
                    ljiiiizz.LIZIZ.put(ljiiiizz.LIZ, typeface2);
                    if ((typeface = typeface2) == null) {
                        return;
                    }
                }
                final String liz4 = 0Jt.LIZ;
                final 0Ld ljiij = this.LJIILJJIL.LJIIJ;
                String s = liz4;
                if (ljiij != null) {
                    if (ljiij.LIZIZ && ljiij.LIZ.containsKey(liz4)) {
                        s = ljiij.LIZ.get(liz4);
                    }
                    else {
                        s = liz4;
                        if (ljiij.LIZIZ) {
                            ljiij.LIZ.put(liz4, liz4);
                            s = liz4;
                        }
                    }
                }
                this.LJIIJ.setTypeface(typeface);
                this.LJIIJ.setTextSize((float)(0Jt.LIZJ * 0L9.LIZ()));
                this.LJIIJJI.setTypeface(this.LJIIJ.getTypeface());
                this.LJIIJJI.setTextSize(this.LJIIJ.getTextSize());
                for (int i = 0; i < s.length(); ++i) {
                    final char char1 = s.charAt(i);
                    this.LJII[0] = char1;
                    if (0Jt.LJIIJ) {
                        this.LIZ(this.LJII, this.LJIIJ, canvas);
                        this.LIZ(this.LJII, this.LJIIJJI, canvas);
                    }
                    else {
                        this.LIZ(this.LJII, this.LJIIJJI, canvas);
                        this.LIZ(this.LJII, this.LJIIJ, canvas);
                    }
                    final char[] ljii = this.LJII;
                    ljii[0] = char1;
                    final float measureText = this.LJIIJ.measureText(ljii, 0, 1);
                    final float n2 = 0Jt.LJ / 10.0f;
                    final 0JP<Float, Float> ljiji = this.LJIJI;
                    float n3 = n2;
                    if (ljiji != null) {
                        n3 = n2 + ljiji.LJFF();
                    }
                    canvas.translate(measureText + n3 * liz, 0.0f);
                }
            }
        }
    }
    
    private void LIZ(final Path path, final Paint paint, final Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint$Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }
    
    private void LIZ(final RectF rectF) {
        if (0KM.a.LIZ) {
            rectF.set(0.0f, 0.0f, (float)this.LJIILL.LJI.width(), (float)this.LJIILL.LJI.height());
        }
    }
    
    private void LIZ(final char[] array, final Paint paint, final Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint$Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(array, 0, 1, 0.0f, 0.0f, paint);
    }
    
    @Override
    public final void LIZ(final RectF rectF, final Matrix matrix) {
        super.LIZ(rectF, matrix);
        this.LIZ(rectF);
    }
    
    @Override
    public final <T> void LIZ(final T t, final 0LI<T> 0li) {
        super.LIZ(t, 0li);
        if (t == 0LS.LIZ) {
            final 0JP<Integer, Integer> ljiilliil = this.LJIILLIIL;
            if (ljiilliil != null) {
                ljiilliil.LIZ((0LI<Integer>)0li);
                return;
            }
        }
        if (t == 0LS.LIZIZ) {
            final 0JP<Integer, Integer> ljiizilj = this.LJIIZILJ;
            if (ljiizilj != null) {
                ljiizilj.LIZ((0LI<Integer>)0li);
                return;
            }
        }
        if (t == 0LS.LJIIJ) {
            final 0JP<Float, Float> ljij = this.LJIJ;
            if (ljij != null) {
                ljij.LIZ((0LI<Float>)0li);
                return;
            }
        }
        if (t == 0LS.LJIIJJI) {
            final 0JP<Float, Float> ljiji = this.LJIJI;
            if (ljiji != null) {
                ljiji.LIZ((0LI<Float>)0li);
            }
        }
    }
    
    @Override
    public final void LIZIZ(final Canvas canvas, final Matrix matrix, int i) {
        canvas.save();
        if (!this.LJIILJJIL.LJII()) {
            if (0KM.a.LIZ) {
                canvas.concat(matrix);
            }
            else {
                canvas.setMatrix(matrix);
            }
        }
        final 0Jt 0Jt = ((0JP<K, 0Jt>)this.LJIILIIL).LJFF();
        final 0K1 0k1 = this.LJIILL.LIZLLL.get(0Jt.LIZIZ);
        if (0k1 == null) {
            canvas.restore();
            return;
        }
        final 0JP<Integer, Integer> ljiilliil = this.LJIILLIIL;
        if (ljiilliil != null) {
            this.LJIIJ.setColor((int)ljiilliil.LJFF());
        }
        else {
            this.LJIIJ.setColor(0Jt.LJII);
        }
        final 0JP<Integer, Integer> ljiizilj = this.LJIIZILJ;
        if (ljiizilj != null) {
            this.LJIIJJI.setColor((int)ljiizilj.LJFF());
        }
        else {
            this.LJIIJJI.setColor(0Jt.LJIIIIZZ);
        }
        i = super.LJI.LJ.LJFF() * 255 / 100;
        this.LJIIJ.setAlpha(i);
        this.LJIIJJI.setAlpha(i);
        final 0JP<Float, Float> ljij = this.LJIJ;
        if (ljij != null) {
            this.LJIIJJI.setStrokeWidth((float)ljij.LJFF());
        }
        else {
            this.LJIIJJI.setStrokeWidth(0Jt.LJIIIZ * 0L9.LIZ() * 0L9.LIZ(matrix));
        }
        if (this.LJIILJJIL.LJII()) {
            final float n = (float)0Jt.LIZJ / 100.0f;
            final float liz = 0L9.LIZ(matrix);
            String liz2;
            0K2 0k2;
            List<1gs> list;
            List<1Be> liz3;
            int size;
            int j;
            int k;
            Path lj;
            float n2;
            float liz4;
            float n3;
            0JP<Float, Float> ljiji;
            float n4;
            for (liz2 = 0Jt.LIZ, i = 0; i < liz2.length(); ++i) {
                0k2 = this.LJIILL.LJ.LIZ(0K2.LIZ(liz2.charAt(i), 0k1.LIZ, 0k1.LIZJ), null);
                if (0k2 != null) {
                    if (this.LJIIL.containsKey(0k2)) {
                        list = this.LJIIL.get(0k2);
                    }
                    else {
                        liz3 = 0k2.LIZ;
                        size = liz3.size();
                        list = new ArrayList<1gs>(size);
                        for (j = 0; j < size; ++j) {
                            list.add(new 1gs(this.LJIILJJIL, this, liz3.get(j)));
                        }
                        this.LJIIL.put(0k2, list);
                    }
                    for (k = 0; k < list.size(); ++k) {
                        lj = list.get(k).LJ();
                        lj.computeBounds(this.LJIIIIZZ, false);
                        this.LJIIIZ.set(matrix);
                        this.LJIIIZ.preTranslate(0.0f, (float)(-0Jt.LJI) * 0L9.LIZ());
                        this.LJIIIZ.preScale(n, n);
                        lj.transform(this.LJIIIZ);
                        if (0Jt.LJIIJ) {
                            this.LIZ(lj, this.LJIIJ, canvas);
                            this.LIZ(lj, this.LJIIJJI, canvas);
                        }
                        else {
                            this.LIZ(lj, this.LJIIJJI, canvas);
                            this.LIZ(lj, this.LJIIJ, canvas);
                        }
                    }
                    n2 = (float)0k2.LIZIZ;
                    liz4 = 0L9.LIZ();
                    n3 = 0Jt.LJ / 10.0f;
                    ljiji = this.LJIJI;
                    n4 = n3;
                    if (ljiji != null) {
                        n4 = n3 + ljiji.LJFF();
                    }
                    canvas.translate(n2 * n * liz4 * liz + n4 * liz, 0.0f);
                }
            }
        }
        else {
            this.LIZ(0Jt, 0k1, matrix, canvas);
        }
        canvas.restore();
    }
    
    @Override
    public final void LIZIZ(final RectF rectF, final Matrix matrix) {
        super.LIZIZ(rectF, matrix);
        this.LIZ(rectF);
    }
}
