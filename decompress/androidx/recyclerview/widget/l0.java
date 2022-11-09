// 
// Decompiled by Procyon v0.6.0
// 

package androidx.recyclerview.widget;

import android.view.animation.Interpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.View;
import android.util.DisplayMetrics;
import android.content.Context;

public final class l0 extends x
{
    public final /* synthetic */ k0 d;
    
    public l0(final k0 d, final Context context) {
        this.d = d;
        super(context);
    }
    
    public final float calculateSpeedPerPixel(final DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }
    
    public final void onTargetFound(final View view, final RecyclerView.b0 b0, final RecyclerView.a0.a a) {
        final k0 d = this.d;
        final RecyclerView a2 = d.a;
        if (a2 == null) {
            return;
        }
        final int[] c = d.c(a2.getLayoutManager(), view);
        final int a3 = c[0];
        final int b2 = c[1];
        final int calculateTimeForDeceleration = this.calculateTimeForDeceleration(Math.max(Math.abs(a3), Math.abs(b2)));
        if (calculateTimeForDeceleration > 0) {
            final DecelerateInterpolator mDecelerateInterpolator = super.mDecelerateInterpolator;
            a.a = a3;
            a.b = b2;
            a.c = calculateTimeForDeceleration;
            a.e = (Interpolator)mDecelerateInterpolator;
            a.f = true;
        }
    }
}
