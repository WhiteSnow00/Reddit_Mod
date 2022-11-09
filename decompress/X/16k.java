// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.View;
import com.bytedance.covode.number.Covode;
import androidx.recyclerview.widget.RecyclerView;

public final class 16k implements b
{
    public final /* synthetic */ RecyclerView.i LIZ;
    
    static {
        Covode.recordClassIndex(1533);
    }
    
    public 16k(final RecyclerView.i liz) {
        this.LIZ = liz;
    }
    
    @Override
    public final int LIZ() {
        return ((RecyclerView.i)this.LIZ).LJIJJ();
    }
    
    @Override
    public final int LIZ(final View view) {
        return ((RecyclerView.i)this.LIZ).LJIILLIIL(view) - ((RecyclerView.j)view.getLayoutParams()).leftMargin;
    }
    
    @Override
    public final View LIZ(final int n) {
        return ((RecyclerView.i)this.LIZ).LJI(n);
    }
    
    @Override
    public final int LIZIZ() {
        return this.LIZ.LJJIJIL - ((RecyclerView.i)this.LIZ).LJIL();
    }
    
    @Override
    public final int LIZIZ(final View view) {
        return ((RecyclerView.i)this.LIZ).LJIJ(view) + ((RecyclerView.j)view.getLayoutParams()).rightMargin;
    }
}
