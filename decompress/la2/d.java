// 
// Decompiled by Procyon v0.6.0
// 

package la2;

import sg2.e;
import androidx.recyclerview.widget.RecyclerView$b0;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.graphics.Rect;
import androidx.recyclerview.widget.RecyclerView$n;

public final class d extends RecyclerView$n
{
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    
    public d(final int n) {
        this.f = 0;
        this.g = 0;
        this.h = n;
        this.i = n;
    }
    
    public final void getItemOffsets(final Rect rect, final View view, final RecyclerView recyclerView, final RecyclerView$b0 recyclerView$b0) {
        e.f((Object)rect, "outRect");
        e.f((Object)view, "view");
        e.f((Object)recyclerView, "parent");
        e.f((Object)recyclerView$b0, "state");
        super.getItemOffsets(rect, view, recyclerView, recyclerView$b0);
        rect.top = this.h;
        rect.left = this.f;
        rect.right = this.g;
        rect.bottom = this.i;
    }
}
