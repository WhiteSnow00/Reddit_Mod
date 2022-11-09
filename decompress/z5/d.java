// 
// Decompiled by Procyon v0.6.0
// 

package z5;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public final class d implements q
{
    @Override
    public final void Gn(final View view) {
    }
    
    @Override
    public final void hp(final View view) {
        final RecyclerView.p p = (RecyclerView.p)view.getLayoutParams();
        if (p.width == -1 && p.height == -1) {
            return;
        }
        throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
    }
}
