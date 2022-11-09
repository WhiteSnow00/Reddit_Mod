// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.List;
import com.bytedance.covode.number.Covode;
import androidx.recyclerview.widget.RecyclerView;

public abstract class 17I<T, VH extends ViewHolder> extends RecyclerView.a<VH>
{
    public final 0Ev<T> LIZ;
    public final 0Ev.a<T> LIZIZ;
    
    static {
        Covode.recordClassIndex(1657);
    }
    
    public 17I(final 0FM.e<T> e) {
        final 17H liziz = new 17H();
        this.LIZIZ = (0Ev.a<T>)liziz;
        final 0Ev liz = new 0Ev(new 173(this), (0Eq<T>)new 0Eq.a<T>(e).LIZ());
        this.LIZ = liz;
        liz.LIZLLL.add((0Ev.a<T>)liziz);
    }
    
    public void LIZ(final List<T> list) {
        this.LIZ.LIZ(list, null);
    }
    
    public void LIZ(final List<T> list, final Runnable runnable) {
        this.LIZ.LIZ(list, runnable);
    }
    
    public final T e_(final int n) {
        return this.LIZ.LJFF.get(n);
    }
    
    @Override
    public int getItemCount() {
        return this.LIZ.LJFF.size();
    }
}
