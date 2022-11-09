// 
// Decompiled by Procyon v0.6.0
// 

package m8;

import androidx.recyclerview.widget.LinearLayoutManager;
import android.widget.AbsListView;
import com.bumptech.glide.h;
import android.widget.AbsListView$OnScrollListener;
import androidx.recyclerview.widget.RecyclerView;

public final class a extends t
{
    public final AbsListView$OnScrollListener f;
    public int g;
    public int h;
    public int i;
    
    public a(final h f) {
        this.g = -1;
        this.h = -1;
        this.i = -1;
        this.f = (AbsListView$OnScrollListener)f;
    }
    
    @Override
    public final void onScrollStateChanged(final RecyclerView recyclerView, final int n) {
        int n2 = 2;
        if (n != 0) {
            if (n != 1) {
                if (n != 2) {
                    n2 = Integer.MIN_VALUE;
                }
            }
            else {
                n2 = 1;
            }
        }
        else {
            n2 = 0;
        }
        this.f.onScrollStateChanged((AbsListView)null, n2);
    }
    
    @Override
    public final void onScrolled(final RecyclerView recyclerView, int firstVisibleItemPosition, int abs) {
        final LinearLayoutManager linearLayoutManager = (LinearLayoutManager)recyclerView.getLayoutManager();
        firstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        abs = Math.abs(firstVisibleItemPosition - linearLayoutManager.findLastVisibleItemPosition());
        final int itemCount = recyclerView.getAdapter().getItemCount();
        if (firstVisibleItemPosition != this.g || abs != this.h || itemCount != this.i) {
            this.f.onScroll((AbsListView)null, firstVisibleItemPosition, abs, itemCount);
            this.g = firstVisibleItemPosition;
            this.h = abs;
            this.i = itemCount;
        }
    }
}
