// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Collections;
import java.util.ArrayList;
import java.util.ListIterator;
import android.graphics.RectF;
import android.graphics.Canvas;
import java.util.List;
import com.bytedance.covode.number.Covode;
import android.graphics.Path;
import android.graphics.Matrix;

public final class 1gz implements 1BG, 0JJ, 1BH, 1BI, a
{
    public final Matrix LIZ;
    public final Path LIZIZ;
    public final 0LK LIZJ;
    public final 1hH LIZLLL;
    public final String LJ;
    public final 0JP<Float, Float> LJFF;
    public final 0JP<Float, Float> LJI;
    public final 0JR LJII;
    public 1gs LJIIIIZZ;
    
    static {
        Covode.recordClassIndex(2244);
    }
    
    public 1gz(final 0LK lizj, final 1hH lizlll, final 1Bc 1Bc) {
        this.LIZ = new Matrix();
        this.LIZIZ = new Path();
        this.LIZJ = lizj;
        this.LIZLLL = lizlll;
        this.LJ = 1Bc.LIZ;
        final 0JP<Float, Float> liz = 1Bc.LIZIZ.LIZ();
        lizlll.LIZ(this.LJFF = liz);
        liz.LIZ((0JP.a)this);
        final 0JP<Float, Float> liz2 = 1Bc.LIZJ.LIZ();
        lizlll.LIZ(this.LJI = liz2);
        liz2.LIZ((0JP.a)this);
        final 0JR liz3 = 1Bc.LIZLLL.LIZ();
        (this.LJII = liz3).LIZ(lizlll);
        liz3.LIZ(this);
    }
    
    @Override
    public final void LIZ() {
        this.LIZJ.invalidateSelf();
    }
    
    @Override
    public final void LIZ(final 0K3 0k3, final int n, final List<0K3> list, final 0K3 0k4) {
        0L4.LIZ(0k3, n, list, 0k4, this);
    }
    
    @Override
    public final void LIZ(final Canvas canvas, final Matrix matrix, final int n) {
        final float floatValue = this.LJFF.LJFF();
        final float floatValue2 = this.LJI.LJFF();
        final float n2 = this.LJII.LJFF.LJFF() / 100.0f;
        final float n3 = this.LJII.LJI.LJFF() / 100.0f;
        for (int i = (int)floatValue - 1; i >= 0; --i) {
            this.LIZ.set(matrix);
            final Matrix liz = this.LIZ;
            final 0JR ljii = this.LJII;
            final float n4 = (float)i;
            liz.preConcat(ljii.LIZ(n4 + floatValue2));
            this.LJIIIIZZ.LIZ(canvas, this.LIZ, (int)(n * (n4 / floatValue * (n3 - n2) + n2)));
        }
    }
    
    @Override
    public final void LIZ(final RectF rectF, final Matrix matrix) {
        this.LJIIIIZZ.LIZ(rectF, matrix);
    }
    
    @Override
    public final <T> void LIZ(final T t, final 0LI<T> 0li) {
        if (this.LJII.LIZ(t, 0li)) {
            return;
        }
        if (t == 0LS.LJIIL) {
            this.LJFF.LIZ((0LI<Float>)0li);
            return;
        }
        if (t == 0LS.LJIILIIL) {
            this.LJI.LIZ((0LI<Float>)0li);
        }
    }
    
    @Override
    public final void LIZ(final List<0JI> list, final List<0JI> list2) {
        this.LJIIIIZZ.LIZ(list, list2);
    }
    
    @Override
    public final void LIZ(final ListIterator<0JI> listIterator) {
        if (this.LJIIIIZZ != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {}
        final ArrayList list = new ArrayList();
        while (listIterator.hasPrevious()) {
            list.add(listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(list);
        this.LJIIIIZZ = new 1gs(this.LIZJ, this.LIZLLL, "Repeater", list, null);
    }
    
    @Override
    public final String LIZIZ() {
        return this.LJ;
    }
    
    @Override
    public final Path LJ() {
        final Path lj = this.LJIIIIZZ.LJ();
        this.LIZIZ.reset();
        final float floatValue = this.LJFF.LJFF();
        final float floatValue2 = this.LJI.LJFF();
        for (int i = (int)floatValue - 1; i >= 0; --i) {
            this.LIZ.set(this.LJII.LIZ(i + floatValue2));
            this.LIZIZ.addPath(lj, this.LIZ);
        }
        return this.LIZIZ;
    }
}
