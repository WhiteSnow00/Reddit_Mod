// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;
import androidx.recyclerview.widget.RecyclerView;

public final class 16r extends n
{
    public boolean LIZ;
    public final /* synthetic */ 16s LIZIZ;
    
    static {
        Covode.recordClassIndex(1568);
    }
    
    public 16r(final 16s liziz) {
        this.LIZIZ = liziz;
    }
    
    @Override
    public final void LIZ(final RecyclerView recyclerView, final int n) {
        super.LIZ(recyclerView, n);
        if (n == 0 && this.LIZ) {
            this.LIZ = false;
            this.LIZIZ.LIZ();
        }
    }
    
    @Override
    public final void LIZ(final RecyclerView recyclerView, final int n, final int n2) {
        if (n != 0 || n2 != 0) {
            this.LIZ = true;
        }
    }
}
