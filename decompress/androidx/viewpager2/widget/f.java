// 
// Decompiled by Procyon v0.6.0
// 

package androidx.viewpager2.widget;

import android.view.View;

public final class f extends ViewPager2$e
{
    public final /* synthetic */ ViewPager2 a;
    
    public f(final ViewPager2 a) {
        this.a = a;
    }
    
    public final void c(final int n) {
        ((View)this.a).clearFocus();
        if (((View)this.a).hasFocus()) {
            ((View)this.a.o).requestFocus(2);
        }
    }
}
