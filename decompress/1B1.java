// 
// Decompiled by Procyon v0.6.0
// 

package X;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import androidx.recyclerview.widget.GridLayoutManager;

public final class 1B1 extends c
{
    public final /* synthetic */ 1B2 LJ;
    
    static {
        Covode.recordClassIndex(2163);
    }
    
    public 1B1(final 1B2 lj) {
        this.LJ = lj;
    }
    
    @Override
    public final int LIZ(final int n) {
        try {
            final 0J7<?> liz = this.LJ.LIZ(n);
            ((RecyclerView.a)this.LJ).getItemCount();
            return liz.LJI();
        }
        catch (final IndexOutOfBoundsException ex) {
            this.LJ.LIZ(ex);
            return 1;
        }
    }
}
