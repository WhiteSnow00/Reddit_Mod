// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Collection;
import android.graphics.Canvas;
import java.util.ArrayList;
import com.bytedance.covode.number.Covode;
import java.util.List;
import android.graphics.RectF;
import android.graphics.Path;
import android.graphics.Matrix;

public final class 1gs implements 1BG, 1BI, a, 0K4
{
    public final Matrix LIZ;
    public final Path LIZIZ;
    public final RectF LIZJ;
    public final String LIZLLL;
    public final List<0JI> LJ;
    public final 0LK LJFF;
    public List<1BI> LJI;
    public 0JR LJII;
    
    static {
        Covode.recordClassIndex(2230);
    }
    
    public 1gs(final 0LK 0lk, final 1hH 1hH, final 1Be 1Be) {
        this(0lk, 1hH, 1Be.LIZ, LIZ(0lk, 1hH, 1Be.LIZIZ), LIZ(1Be.LIZIZ));
    }
    
    public 1gs(final 0LK ljff, final 1hH 1hH, final String lizlll, final List<0JI> lj, final 1BU 1bu) {
        this.LIZ = new Matrix();
        this.LIZIZ = new Path();
        this.LIZJ = new RectF();
        this.LIZLLL = lizlll;
        this.LJFF = ljff;
        this.LJ = lj;
        if (1bu != null) {
            (this.LJII = 1bu.LIZ()).LIZ(1hH);
            this.LJII.LIZ(this);
        }
        final ArrayList list = new ArrayList();
        for (int i = lj.size() - 1; i >= 0; --i) {
            final 0JI 0ji = lj.get(i);
            if (0ji instanceof 0JJ) {
                list.add(0ji);
            }
        }
        for (int j = list.size() - 1; j >= 0; --j) {
            ((0JJ)list.get(j)).LIZ(lj.listIterator(lj.size()));
        }
    }
    
    public static 1BU LIZ(final List<0Jh> list) {
        for (int i = 0; i < list.size(); ++i) {
            final 0Jh 0Jh = list.get(i);
            if (0Jh instanceof 1BU) {
                return (1BU)0Jh;
            }
        }
        return null;
    }
    
    public static List<0JI> LIZ(final 0LK 0lk, final 1hH 1hH, final List<0Jh> list) {
        final ArrayList list2 = new ArrayList(list.size());
        for (int i = 0; i < list.size(); ++i) {
            final 0JI liz = list.get(i).LIZ(0lk, 1hH);
            if (liz != null) {
                list2.add(liz);
            }
        }
        return list2;
    }
    
    @Override
    public final void LIZ() {
        this.LJFF.invalidateSelf();
    }
    
    @Override
    public final void LIZ(final 0K3 0k3, final int n, final List<0K3> list, 0K3 0k4) {
        if (!0k3.LIZ(this.LIZLLL, n)) {
            return;
        }
        0K3 liz = 0k4;
        if (!"__container".equals(this.LIZLLL)) {
            0k4 = (liz = 0k4.LIZ(this.LIZLLL));
            if (0k3.LIZJ(this.LIZLLL, n)) {
                list.add(0k4.LIZ(this));
                liz = 0k4;
            }
        }
        if (0k3.LIZLLL(this.LIZLLL, n)) {
            final int liziz = 0k3.LIZIZ(this.LIZLLL, n);
            for (int i = 0; i < this.LJ.size(); ++i) {
                final 0JI 0ji = this.LJ.get(i);
                if (0ji instanceof 0K4) {
                    ((0K4)0ji).LIZ(0k3, n + liziz, list, liz);
                }
            }
        }
    }
    
    @Override
    public final void LIZ(final Canvas canvas, final Matrix matrix, int i) {
        this.LIZ.set(matrix);
        final 0JR ljii = this.LJII;
        int n = i;
        if (ljii != null) {
            this.LIZ.preConcat(ljii.LIZ());
            n = (int)(this.LJII.LJ.LJFF() / 100.0f * i / 255.0f * 255.0f);
        }
        1BG value;
        for (i = this.LJ.size() - 1; i >= 0; --i) {
            value = this.LJ.get(i);
            if (value instanceof 1BG) {
                value.LIZ(canvas, this.LIZ, n);
            }
        }
    }
    
    @Override
    public final void LIZ(final RectF rectF, final Matrix matrix) {
        this.LIZ.set(matrix);
        final 0JR ljii = this.LJII;
        if (ljii != null) {
            this.LIZ.preConcat(ljii.LIZ());
        }
        this.LIZJ.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int i = this.LJ.size() - 1; i >= 0; --i) {
            final 0JI 0ji = this.LJ.get(i);
            if (0ji instanceof 1BG) {
                final 1BG 1bg = (1BG)0ji;
                1bg.LIZ(this.LIZJ, this.LIZ);
                if (0KM.a.LIZ) {
                    1bg.LIZ(this.LIZJ, this.LIZ);
                    rectF.union(this.LIZJ);
                }
                else if (rectF.isEmpty()) {
                    rectF.set(this.LIZJ);
                }
                else {
                    rectF.set(Math.min(rectF.left, this.LIZJ.left), Math.min(rectF.top, this.LIZJ.top), Math.max(rectF.right, this.LIZJ.right), Math.max(rectF.bottom, this.LIZJ.bottom));
                }
            }
        }
    }
    
    @Override
    public final <T> void LIZ(final T t, final 0LI<T> 0li) {
        final 0JR ljii = this.LJII;
        if (ljii != null) {
            ljii.LIZ(t, 0li);
        }
    }
    
    @Override
    public final void LIZ(final List<0JI> list, final List<0JI> list2) {
        final ArrayList list3 = new ArrayList(list.size() + this.LJ.size());
        list3.addAll(list);
        for (int i = this.LJ.size() - 1; i >= 0; --i) {
            final 0JI 0ji = this.LJ.get(i);
            0ji.LIZ(list3, this.LJ.subList(0, i));
            list3.add(0ji);
        }
    }
    
    @Override
    public final String LIZIZ() {
        return this.LIZLLL;
    }
    
    public final List<1BI> LIZJ() {
        if (this.LJI == null) {
            this.LJI = new ArrayList<1BI>();
            for (int i = 0; i < this.LJ.size(); ++i) {
                final 0JI 0ji = this.LJ.get(i);
                if (0ji instanceof 1BI) {
                    this.LJI.add((1BI)0ji);
                }
            }
        }
        return this.LJI;
    }
    
    public final Matrix LIZLLL() {
        final 0JR ljii = this.LJII;
        if (ljii != null) {
            return ljii.LIZ();
        }
        this.LIZ.reset();
        return this.LIZ;
    }
    
    @Override
    public final Path LJ() {
        this.LIZ.reset();
        final 0JR ljii = this.LJII;
        if (ljii != null) {
            this.LIZ.set(ljii.LIZ());
        }
        this.LIZIZ.reset();
        for (int i = this.LJ.size() - 1; i >= 0; --i) {
            final 0JI 0ji = this.LJ.get(i);
            if (0ji instanceof 1BI) {
                this.LIZIZ.addPath(((1BI)0ji).LJ(), this.LIZ);
            }
        }
        return this.LIZIZ;
    }
}
