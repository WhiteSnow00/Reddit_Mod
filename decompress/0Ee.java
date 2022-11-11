// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;

public final class 0Ee
{
    static {
        Covode.recordClassIndex(1565);
    }
    
    public static int LIZ(final RecyclerView.t t, final 0Fj 0Fj, final View view, final View view2, final RecyclerView.i i, final boolean b) {
        if (i.LJIJI() == 0 || t.LIZ() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!b) {
            return Math.abs(i.LJI(view) - i.LJI(view2)) + 1;
        }
        return Math.min(0Fj.LJ(), 0Fj.LIZIZ(view2) - 0Fj.LIZ(view));
    }
    
    public static int LIZ(final RecyclerView.t t, final 0Fj 0Fj, final View view, final View view2, final RecyclerView.i i, final boolean b, final boolean b2) {
        if (i.LJIJI() == 0 || t.LIZ() == 0 || view == null || view2 == null) {
            return 0;
        }
        final int min = Math.min(i.LJI(view), i.LJI(view2));
        final int max = Math.max(i.LJI(view), i.LJI(view2));
        int n;
        if (b2) {
            n = Math.max(0, t.LIZ() - max - 1);
        }
        else {
            n = Math.max(0, min);
        }
        if (!b) {
            return n;
        }
        return Math.round(n * (Math.abs(0Fj.LIZIZ(view2) - 0Fj.LIZ(view)) / (float)(Math.abs(i.LJI(view) - i.LJI(view2)) + 1)) + (0Fj.LIZIZ() - 0Fj.LIZ(view)));
    }
    
    public static int LIZIZ(final RecyclerView.t t, final 0Fj 0Fj, final View view, final View view2, final RecyclerView.i i, final boolean b) {
        if (i.LJIJI() == 0 || t.LIZ() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!b) {
            return t.LIZ();
        }
        return (int)((0Fj.LIZIZ(view2) - 0Fj.LIZ(view)) / (float)(Math.abs(i.LJI(view) - i.LJI(view2)) + 1) * t.LIZ());
    }
}
