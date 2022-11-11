// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.View;
import com.bytedance.covode.number.Covode;
import androidx.recyclerview.widget.RecyclerView;

public abstract class 1fB<T> extends ViewHolder
{
    public final FH6 LIZ;
    public boolean LJJIII;
    
    static {
        Covode.recordClassIndex(23343);
    }
    
    public 1fB(final View view) {
        super(view);
        this.LIZ = new FH6();
    }
    
    public final void LIZ(final 2fc 2fc) {
        this.LIZ.LIZ(2fc);
    }
    
    public abstract void LIZ(final T p0, final int p1);
    
    public void LIZIZ() {
        this.LIZ.LIZ();
    }
    
    public void LIZLLL() {
        this.LJJIII = true;
    }
    
    public void LJ() {
        this.LJJIII = false;
    }
    
    public boolean O_() {
        return false;
    }
}
