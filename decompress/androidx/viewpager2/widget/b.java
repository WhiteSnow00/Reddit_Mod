// 
// Decompiled by Procyon v0.6.0
// 

package androidx.viewpager2.widget;

import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import mj2.c0;

public final class b implements ViewPager2$g
{
    public final int a;
    
    public b(final int a) {
        c0.r(a, "Margin must be non-negative");
        this.a = a;
    }
    
    public final void a(final View view, float translationX) {
        final ViewParent parent = view.getParent();
        final ViewParent parent2 = parent.getParent();
        if (parent instanceof RecyclerView && parent2 instanceof ViewPager2) {
            final ViewPager2 viewPager2 = (ViewPager2)parent2;
            final float translationY = this.a * translationX;
            if (viewPager2.getOrientation() == 0) {
                final int layoutDirection = ((RecyclerView.o)viewPager2.l).getLayoutDirection();
                boolean b = true;
                if (layoutDirection != 1) {
                    b = false;
                }
                translationX = translationY;
                if (b) {
                    translationX = -translationY;
                }
                view.setTranslationX(translationX);
            }
            else {
                view.setTranslationY(translationY);
            }
            return;
        }
        throw new IllegalStateException("Expected the page view to be managed by a ViewPager2 instance.");
    }
}
