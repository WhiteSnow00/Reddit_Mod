// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;

public class 1gi extends 16s
{
    public 0Fj LIZIZ;
    public 0Fj LIZJ;
    
    static {
        Covode.recordClassIndex(1656);
    }
    
    private int LIZ(final i i, final 0Fj 0Fj, int n, final int n2) {
        final int[] liziz = this.LIZIZ(n, n2);
        final float liziz2 = this.LIZIZ(i, 0Fj);
        if (liziz2 <= 0.0f) {
            return 0;
        }
        if (Math.abs(liziz[0]) > Math.abs(liziz[1])) {
            n = liziz[0];
        }
        else {
            n = liziz[1];
        }
        return Math.round(n / liziz2);
    }
    
    private int LIZ(final View view, final 0Fj 0Fj) {
        return 0Fj.LIZ(view) + 0Fj.LJ(view) / 2 - (0Fj.LIZIZ() + 0Fj.LJ() / 2);
    }
    
    private View LIZ(final i i, final 0Fj 0Fj) {
        final int ljiji = i.LJIJI();
        View view = null;
        if (ljiji == 0) {
            return null;
        }
        final int liziz = 0Fj.LIZIZ();
        final int n = 0Fj.LJ() / 2;
        int n2 = Integer.MAX_VALUE;
        int n3;
        for (int j = 0; j < ljiji; ++j, n2 = n3) {
            final View lji = i.LJI(j);
            final int abs = Math.abs(0Fj.LIZ(lji) + 0Fj.LJ(lji) / 2 - (liziz + n));
            if (abs < (n3 = n2)) {
                view = lji;
                n3 = abs;
            }
        }
        return view;
    }
    
    private float LIZIZ(final i i, final 0Fj 0Fj) {
        final int ljiji = i.LJIJI();
        if (ljiji == 0) {
            return 1.0f;
        }
        int j = 0;
        View view = null;
        View view2 = null;
        int n = Integer.MAX_VALUE;
        int n2 = Integer.MIN_VALUE;
        while (j < ljiji) {
            final View lji = i.LJI(j);
            final int lji2 = i.LJI(lji);
            int n3 = n2;
            int n4 = n;
            View view3 = view2;
            View view4 = view;
            if (lji2 != -1) {
                int n5;
                if (lji2 < (n5 = n)) {
                    view = lji;
                    n5 = lji2;
                }
                n3 = n2;
                n4 = n5;
                view3 = view2;
                view4 = view;
                if (lji2 > n2) {
                    n3 = lji2;
                    view4 = view;
                    view3 = lji;
                    n4 = n5;
                }
            }
            ++j;
            n2 = n3;
            n = n4;
            view2 = view3;
            view = view4;
        }
        if (view == null || view2 == null) {
            return 1.0f;
        }
        final int n6 = Math.max(0Fj.LIZIZ(view), 0Fj.LIZIZ(view2)) - Math.min(0Fj.LIZ(view), 0Fj.LIZ(view2));
        if (n6 == 0) {
            return 1.0f;
        }
        return n6 * 1.0f / (n2 - n + 1);
    }
    
    private 0Fj LIZLLL(final i i) {
        final 0Fj liziz = this.LIZIZ;
        if (liziz == null || liziz.LIZ != i) {
            this.LIZIZ = 0Fj.LIZIZ(i);
        }
        return this.LIZIZ;
    }
    
    private 0Fj LJ(final i i) {
        final 0Fj lizj = this.LIZJ;
        if (lizj == null || lizj.LIZ != i) {
            this.LIZJ = 0Fj.LIZ(i);
        }
        return this.LIZJ;
    }
    
    @Override
    public final int LIZ(final i i, int liz, int liz2) {
        if (!(i instanceof RecyclerView.s.b)) {
            return -1;
        }
        final int ljjiii = i.LJJIII();
        if (ljjiii == 0) {
            return -1;
        }
        final View liz3 = this.LIZ(i);
        if (liz3 == null) {
            return -1;
        }
        final int lji = i.LJI(liz3);
        if (lji == -1) {
            return -1;
        }
        final RecyclerView.s.b b = (RecyclerView.s.b)i;
        final int n = ljjiii - 1;
        final PointF lizlll = b.LIZLLL(n);
        if (lizlll == null) {
            return -1;
        }
        final boolean ljff = i.LJFF();
        final int n2 = 0;
        if (ljff) {
            final int n3 = liz = this.LIZ(i, this.LJ(i), liz, 0);
            if (lizlll.x < 0.0f) {
                liz = -n3;
            }
        }
        else {
            liz = 0;
        }
        if (i.LJI()) {
            final int n4 = liz2 = this.LIZ(i, this.LIZLLL(i), 0, liz2);
            if (lizlll.y < 0.0f) {
                liz2 = -n4;
            }
        }
        else {
            liz2 = 0;
        }
        if (i.LJI()) {
            liz = liz2;
        }
        if (liz == 0) {
            return -1;
        }
        liz += lji;
        if (liz < 0) {
            liz = n2;
        }
        if (liz >= ljjiii) {
            liz = n;
        }
        return liz;
    }
    
    @Override
    public View LIZ(final i i) {
        if (i.LJI()) {
            return this.LIZ(i, this.LIZLLL(i));
        }
        if (i.LJFF()) {
            return this.LIZ(i, this.LJ(i));
        }
        return null;
    }
    
    @Override
    public final int[] LIZ(final i i, final View view) {
        final int[] array = new int[2];
        if (i.LJFF()) {
            array[0] = this.LIZ(view, this.LJ(i));
        }
        else {
            array[0] = 0;
        }
        if (i.LJI()) {
            array[1] = this.LIZ(view, this.LIZLLL(i));
        }
        else {
            array[1] = 0;
        }
        return array;
    }
}
