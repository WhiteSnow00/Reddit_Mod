// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.widget.AdapterView;
import android.widget.PopupWindow$OnDismissListener;
import android.view.MenuItem;
import android.widget.HeaderViewListAdapter;
import android.view.View;
import android.widget.FrameLayout;
import android.view.View$MeasureSpec;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import com.bytedance.covode.number.Covode;
import android.graphics.Rect;
import android.widget.AdapterView$OnItemClickListener;

public abstract class 134 implements AdapterView$OnItemClickListener, 02r, 02u
{
    public Rect LJI;
    
    static {
        Covode.recordClassIndex(360);
    }
    
    public static int LIZ(final ListAdapter listAdapter, final ViewGroup viewGroup, final Context context, final int n) {
        int i = 0;
        final int measureSpec = View$MeasureSpec.makeMeasureSpec(0, 0);
        final int measureSpec2 = View$MeasureSpec.makeMeasureSpec(0, 0);
        final int count = listAdapter.getCount();
        final View view = null;
        int n2 = 0;
        int n3 = 0;
        ViewGroup viewGroup2 = viewGroup;
        View view2 = view;
        while (i < count) {
            final int itemViewType = listAdapter.getItemViewType(i);
            int n4;
            if (itemViewType != (n4 = n3)) {
                view2 = null;
                n4 = itemViewType;
            }
            Object o;
            if ((o = viewGroup2) == null) {
                o = new FrameLayout(context);
            }
            view2 = listAdapter.getView(i, view2, (ViewGroup)o);
            view2.measure(measureSpec, measureSpec2);
            final int measuredWidth = view2.getMeasuredWidth();
            if (measuredWidth >= n) {
                return n;
            }
            int n5;
            if (measuredWidth > (n5 = n2)) {
                n5 = measuredWidth;
            }
            ++i;
            n3 = n4;
            n2 = n5;
            viewGroup2 = (ViewGroup)o;
        }
        return n2;
    }
    
    public static 02j LIZ(final ListAdapter listAdapter) {
        if (listAdapter instanceof HeaderViewListAdapter) {
            return (02j)((HeaderViewListAdapter)listAdapter).getWrappedAdapter();
        }
        return (02j)listAdapter;
    }
    
    public static boolean LIZIZ(final 12x 12x) {
        final int size = 12x.size();
        final boolean b = false;
        int n = 0;
        boolean b2;
        while (true) {
            b2 = b;
            if (n >= size) {
                break;
            }
            final MenuItem item = 12x.getItem(n);
            if (item.isVisible() && item.getIcon() != null) {
                b2 = true;
                break;
            }
            ++n;
        }
        return b2;
    }
    
    public abstract void LIZ(final int p0);
    
    public abstract void LIZ(final 12x p0);
    
    public final void LIZ(final Context context, final 12x 12x) {
    }
    
    public abstract void LIZ(final View p0);
    
    public abstract void LIZ(final PopupWindow$OnDismissListener p0);
    
    public final int LIZIZ() {
        return 0;
    }
    
    public abstract void LIZIZ(final int p0);
    
    public abstract void LIZIZ(final boolean p0);
    
    public final boolean LIZIZ(final 130 130) {
        return false;
    }
    
    public abstract void LIZJ(final int p0);
    
    public abstract void LIZJ(final boolean p0);
    
    public final boolean LIZJ(final 130 130) {
        return false;
    }
    
    public boolean LJII() {
        return true;
    }
    
    public void onItemClick(final AdapterView<?> adapterView, final View view, int n, final long n2) {
        final ListAdapter listAdapter = (ListAdapter)adapterView.getAdapter();
        final 12x liz = LIZ(listAdapter).LIZ;
        final MenuItem menuItem = (MenuItem)listAdapter.getItem(n);
        if (this.LJII()) {
            n = 0;
        }
        else {
            n = 4;
        }
        liz.LIZ(menuItem, this, n);
    }
}
