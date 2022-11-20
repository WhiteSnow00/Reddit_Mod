// 
// Decompiled by Procyon v0.6.0
// 

package k72;

import androidx.recyclerview.widget.RecyclerView$f0;
import androidx.recyclerview.widget.RecyclerView$o;
import at0.c;
import kotlin.Pair;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.lifecycle.d;
import androidx.recyclerview.widget.RecyclerView;
import ng2.e;
import android.os.Looper;
import android.os.Handler;
import androidx.recyclerview.widget.RecyclerView$t;

public final class b extends RecyclerView$t
{
    public final long f;
    public final Handler g;
    
    public b() {
        this(0L, 3);
    }
    
    public b(long f, final int n) {
        if ((n & 0x1) != 0x0) {
            f = 0L;
        }
        Handler g;
        if ((n & 0x2) != 0x0) {
            g = new Handler(Looper.getMainLooper());
        }
        else {
            g = null;
        }
        e.f((Object)g, "handler");
        this.f = f;
        this.g = g;
    }
    
    public final void a(final RecyclerView recyclerView) {
        e.f((Object)recyclerView, "recyclerView");
        this.g.postDelayed((Runnable)new d(23, (Object)this, (Object)recyclerView), this.f);
    }
    
    public final void onScrollStateChanged(final RecyclerView recyclerView, int n) {
        e.f((Object)recyclerView, "recyclerView");
        super.onScrollStateChanged(recyclerView, n);
        if (n == 0) {
            this.g.removeCallbacksAndMessages((Object)null);
            final RecyclerView$o layoutManager = recyclerView.getLayoutManager();
            int n2;
            if (layoutManager instanceof LinearLayoutManager) {
                final LinearLayoutManager linearLayoutManager = (LinearLayoutManager)layoutManager;
                n2 = linearLayoutManager.findFirstVisibleItemPosition();
                n = linearLayoutManager.findLastVisibleItemPosition();
            }
            else {
                if (!(layoutManager instanceof GridLayoutManager)) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Error handling auto scroll for ");
                    sb.append(layoutManager);
                    throw new IllegalStateException(sb.toString());
                }
                final GridLayoutManager gridLayoutManager = (GridLayoutManager)layoutManager;
                n2 = ((LinearLayoutManager)gridLayoutManager).findFirstVisibleItemPosition();
                n = ((LinearLayoutManager)gridLayoutManager).findLastVisibleItemPosition();
            }
            final Pair pair = new Pair((Object)n2, (Object)n);
            n = ((Number)pair.component1()).intValue();
            final int intValue = ((Number)pair.component2()).intValue();
            int n3 = 0;
            if (n <= intValue) {
                while (true) {
                    final RecyclerView$f0 viewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(n);
                    int n4 = n3;
                    if (viewHolderForAdapterPosition instanceof a) {
                        final a a = (a)viewHolderForAdapterPosition;
                        if (!a.g0()) {
                            a.play();
                            n4 = n3;
                        }
                        else if (!a.isPlaying() && n3 == 0) {
                            this.g.postDelayed((Runnable)new c((Object)a, 5), this.f);
                            n4 = n3 + 1;
                        }
                        else if ((n4 = n3) > 0) {
                            a.pause();
                            n4 = n3;
                        }
                    }
                    if (n == intValue) {
                        break;
                    }
                    ++n;
                    n3 = n4;
                }
            }
        }
    }
}
