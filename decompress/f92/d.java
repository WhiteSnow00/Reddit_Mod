// 
// Decompiled by Procyon v0.6.0
// 

package f92;

import androidx.recyclerview.widget.RecyclerView$f0;
import android.view.View;
import java.util.Iterator;
import sg2.e;
import androidx.recyclerview.widget.RecyclerView;

public final class d extends t
{
    public final /* synthetic */ c f;
    
    public d(final c f) {
        this.f = f;
    }
    
    @Override
    public final void onScrolled(final RecyclerView recyclerView, int top, int height) {
        e.f((Object)recyclerView, "recyclerView");
        final c f = this.f;
        height = ((View)recyclerView).getHeight();
        for (final b b : f.l) {
            top = ((RecyclerView$f0)b).itemView.getTop();
            b.g.setProgress(1 - (((View)b.g).getHeight() / 2 + (((View)b.g).getTop() + top)) / (float)(height - ((View)b.g).getHeight() / 2));
        }
    }
}
