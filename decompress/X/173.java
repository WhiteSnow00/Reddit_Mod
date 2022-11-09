// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;
import androidx.recyclerview.widget.RecyclerView;

public final class 173 implements 0Fe
{
    public final RecyclerView.a LIZ;
    
    static {
        Covode.recordClassIndex(1590);
    }
    
    public 173(final RecyclerView.a liz) {
        this.LIZ = liz;
    }
    
    @Override
    public final void LIZ(final int n, final int n2) {
        this.LIZ.notifyItemRangeInserted(n, n2);
    }
    
    @Override
    public final void LIZ(final int n, final int n2, final Object o) {
        this.LIZ.notifyItemRangeChanged(n, n2, o);
    }
    
    @Override
    public final void LIZIZ(final int n, final int n2) {
        this.LIZ.notifyItemRangeRemoved(n, n2);
    }
    
    @Override
    public final void LIZJ(final int n, final int n2) {
        this.LIZ.notifyItemMoved(n, n2);
    }
}
