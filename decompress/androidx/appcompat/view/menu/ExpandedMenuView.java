// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.view.menu;

import android.widget.Adapter;
import android.view.ViewGroup;
import android.view.View;
import android.widget.AdapterView;
import android.view.MenuItem;
import androidx.appcompat.widget.z0;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.AdapterView$OnItemClickListener;
import android.widget.ListView;

public final class ExpandedMenuView extends ListView implements MenuBuilder$b, j, AdapterView$OnItemClickListener
{
    public static final int[] g;
    public MenuBuilder f;
    
    static {
        g = new int[] { 16842964, 16843049 };
    }
    
    public ExpandedMenuView(final Context context, final AttributeSet set) {
        super(context, set);
        ((AdapterView)this).setOnItemClickListener((AdapterView$OnItemClickListener)this);
        final z0 z0 = new z0(context, context.obtainStyledAttributes(set, ExpandedMenuView.g, 16842868, 0));
        if (z0.l(0)) {
            ((View)this).setBackgroundDrawable(z0.e(0));
        }
        if (z0.l(1)) {
            this.setDivider(z0.e(1));
        }
        z0.n();
    }
    
    public final void a(final MenuBuilder f) {
        this.f = f;
    }
    
    public final boolean c(final g g) {
        return this.f.performItemAction((MenuItem)g, 0);
    }
    
    public int getWindowAnimations() {
        return 0;
    }
    
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ((ViewGroup)this).setChildrenDrawingCacheEnabled(false);
    }
    
    public final void onItemClick(final AdapterView adapterView, final View view, final int n, final long n2) {
        this.c((g)((Adapter)this.getAdapter()).getItem(n));
    }
}
