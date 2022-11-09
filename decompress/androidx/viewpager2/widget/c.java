// 
// Decompiled by Procyon v0.6.0
// 

package androidx.viewpager2.widget;

import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import java.util.Locale;
import androidx.recyclerview.widget.LinearLayoutManager;

public final class c extends ViewPager2$e
{
    public final LinearLayoutManager a;
    public ViewPager2$g b;
    
    public c(final LinearLayoutManager a) {
        this.a = a;
    }
    
    public final void a(final int n) {
    }
    
    public final void b(final int n, float n2, int i) {
        if (this.b == null) {
            return;
        }
        n2 = -n2;
        View child;
        for (i = 0; i < ((RecyclerView.o)this.a).getChildCount(); ++i) {
            child = ((RecyclerView.o)this.a).getChildAt(i);
            if (child == null) {
                throw new IllegalStateException(String.format(Locale.US, "LayoutManager returned a null child at pos %d/%d while transforming pages", i, ((RecyclerView.o)this.a).getChildCount()));
            }
            this.b.a(child, ((RecyclerView.o)this.a).getPosition(child) - n + n2);
        }
    }
    
    public final void c(final int n) {
    }
}
