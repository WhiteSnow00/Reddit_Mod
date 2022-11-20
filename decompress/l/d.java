// 
// Decompiled by Procyon v0.6.0
// 

package l;

import android.widget.Adapter;
import android.widget.BaseAdapter;
import android.widget.PopupWindow$OnDismissListener;
import androidx.appcompat.view.menu.b;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.g;
import android.view.MenuItem;
import androidx.appcompat.view.menu.MenuBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.view.View$MeasureSpec;
import android.content.Context;
import androidx.appcompat.view.menu.e;
import android.graphics.Rect;
import android.widget.AdapterView$OnItemClickListener;
import androidx.appcompat.view.menu.i;

public abstract class d implements f, i, AdapterView$OnItemClickListener
{
    public Rect f;
    
    public static int n(final e e, final Context context, final int n) {
        int i = 0;
        final int measureSpec = View$MeasureSpec.makeMeasureSpec(0, 0);
        final int measureSpec2 = View$MeasureSpec.makeMeasureSpec(0, 0);
        final int count = e.getCount();
        int n2 = 0;
        int n3 = 0;
        ViewGroup viewGroup = null;
        View view = null;
        while (i < count) {
            final int itemViewType = ((BaseAdapter)e).getItemViewType(i);
            int n4;
            if (itemViewType != (n4 = n3)) {
                view = null;
                n4 = itemViewType;
            }
            Object o;
            if ((o = viewGroup) == null) {
                o = new FrameLayout(context);
            }
            view = e.getView(i, view, (ViewGroup)o);
            view.measure(measureSpec, measureSpec2);
            final int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= n) {
                return n;
            }
            int n5;
            if (measuredWidth > (n5 = n2)) {
                n5 = measuredWidth;
            }
            ++i;
            n2 = n5;
            n3 = n4;
            viewGroup = (ViewGroup)o;
        }
        return n2;
    }
    
    public static boolean v(final MenuBuilder menuBuilder) {
        final int size = menuBuilder.size();
        final boolean b = false;
        int n = 0;
        boolean b2;
        while (true) {
            b2 = b;
            if (n >= size) {
                break;
            }
            final MenuItem item = menuBuilder.getItem(n);
            if (item.isVisible() && item.getIcon() != null) {
                b2 = true;
                break;
            }
            ++n;
        }
        return b2;
    }
    
    public final boolean d(final g g) {
        return false;
    }
    
    public final void f(final Context context, final MenuBuilder menuBuilder) {
    }
    
    public final int getId() {
        return 0;
    }
    
    public final boolean i(final g g) {
        return false;
    }
    
    public abstract void m(final MenuBuilder p0);
    
    public abstract void o(final View p0);
    
    public final void onItemClick(final AdapterView<?> adapterView, final View view, int n, final long n2) {
        final ListAdapter listAdapter = (ListAdapter)adapterView.getAdapter();
        e e;
        if (listAdapter instanceof HeaderViewListAdapter) {
            e = (e)((HeaderViewListAdapter)listAdapter).getWrappedAdapter();
        }
        else {
            e = (e)listAdapter;
        }
        final MenuBuilder f = e.f;
        final MenuItem menuItem = (MenuItem)((Adapter)listAdapter).getItem(n);
        if (this instanceof b ^ true) {
            n = 0;
        }
        else {
            n = 4;
        }
        f.performItemAction(menuItem, (i)this, n);
    }
    
    public abstract void p(final boolean p0);
    
    public abstract void q(final int p0);
    
    public abstract void r(final int p0);
    
    public abstract void s(final PopupWindow$OnDismissListener p0);
    
    public abstract void t(final boolean p0);
    
    public abstract void u(final int p0);
}
