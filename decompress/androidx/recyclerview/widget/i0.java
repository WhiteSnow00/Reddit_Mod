// 
// Decompiled by Procyon v0.6.0
// 

package androidx.recyclerview.widget;

import android.view.View;

public final class i0
{
    public static int a(final RecyclerView$b0 recyclerView$b0, final f0 f0, final View view, final View view2, final RecyclerView$o recyclerView$o, final boolean b) {
        if (recyclerView$o.getChildCount() == 0 || recyclerView$b0.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!b) {
            return Math.abs(recyclerView$o.getPosition(view) - recyclerView$o.getPosition(view2)) + 1;
        }
        return Math.min(f0.l(), f0.b(view2) - f0.e(view));
    }
    
    public static int b(final RecyclerView$b0 recyclerView$b0, final f0 f0, final View view, final View view2, final RecyclerView$o recyclerView$o, final boolean b, final boolean b2) {
        if (recyclerView$o.getChildCount() == 0 || recyclerView$b0.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        final int min = Math.min(recyclerView$o.getPosition(view), recyclerView$o.getPosition(view2));
        final int max = Math.max(recyclerView$o.getPosition(view), recyclerView$o.getPosition(view2));
        int n;
        if (b2) {
            n = Math.max(0, recyclerView$b0.b() - max - 1);
        }
        else {
            n = Math.max(0, min);
        }
        if (!b) {
            return n;
        }
        return Math.round(n * (Math.abs(f0.b(view2) - f0.e(view)) / (float)(Math.abs(recyclerView$o.getPosition(view) - recyclerView$o.getPosition(view2)) + 1)) + (f0.k() - f0.e(view)));
    }
    
    public static int c(final RecyclerView$b0 recyclerView$b0, final f0 f0, final View view, final View view2, final RecyclerView$o recyclerView$o, final boolean b) {
        if (recyclerView$o.getChildCount() == 0 || recyclerView$b0.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!b) {
            return recyclerView$b0.b();
        }
        return (int)((f0.b(view2) - f0.e(view)) / (float)(Math.abs(recyclerView$o.getPosition(view) - recyclerView$o.getPosition(view2)) + 1) * recyclerView$b0.b());
    }
}
