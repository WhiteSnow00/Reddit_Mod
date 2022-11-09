// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.View;
import com.bytedance.covode.number.Covode;
import androidx.recyclerview.widget.RecyclerView;

public final class 16l implements b
{
    public final /* synthetic */ RecyclerView.i LIZ;
    
    static {
        Covode.recordClassIndex(1534);
    }
    
    public 16l(final RecyclerView.i liz) {
        this.LIZ = liz;
    }
    
    @Override
    public final int LIZ() {
        return ((RecyclerView.i)this.LIZ).LJIJJLI();
    }
    
    @Override
    public final int LIZ(final View view) {
        return ((RecyclerView.i)this.LIZ).LJIIZILJ(view) - ((RecyclerView.j)view.getLayoutParams()).topMargin;
    }
    
    @Override
    public final View LIZ(final int n) {
        return ((RecyclerView.i)this.LIZ).LJI(n);
    }
    
    @Override
    public final int LIZIZ() {
        return this.LIZ.LJJIJL - ((RecyclerView.i)this.LIZ).LJJ();
    }
    
    @Override
    public final int LIZIZ(final View view) {
        return ((RecyclerView.i)this.LIZ).LJIJI(view) + ((RecyclerView.j)view.getLayoutParams()).bottomMargin;
    }
}
