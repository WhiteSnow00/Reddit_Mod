// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.List;
import com.bytedance.covode.number.Covode;
import androidx.recyclerview.widget.RecyclerView;

public abstract class 15Y<T, VH extends ViewHolder> extends a<VH>
{
    public final 0Ao<T> LIZ;
    
    static {
        Covode.recordClassIndex(1164);
    }
    
    public 15Y(final 0FM.e<T> e) {
        this.LIZ = new 0Ao<T>(this, e);
    }
    
    public final 0BD<T> LIZ() {
        final 0Ao<T> liz = this.LIZ;
        if (liz.LJFF != null) {
            return liz.LJFF;
        }
        return liz.LJ;
    }
    
    public T LIZ(final int n) {
        final 0Ao<T> liz = this.LIZ;
        if (liz.LJ != null) {
            final 0BD<T> lj = liz.LJ;
            lj.LJII = lj.LJI.LJ + n;
            lj.LIZ(n);
            lj.LJIIJJI = Math.min(lj.LJIIJJI, n);
            lj.LJIIL = Math.max(lj.LJIIL, n);
            lj.LIZ(true);
            return liz.LJ.get(n);
        }
        if (liz.LJFF != null) {
            return liz.LJFF.get(n);
        }
        throw new IndexOutOfBoundsException("Item count is zero, getItem() call is invalid");
    }
    
    public final void LIZ(final 0BD<T> lj) {
        final 0Ao<T> liz = this.LIZ;
        if (lj != null) {
            if (liz.LJ == null && liz.LJFF == null) {
                liz.LIZLLL = lj.LIZ();
            }
            else if (lj.LIZ() != liz.LIZLLL) {
                throw new IllegalArgumentException("AsyncPagedListDiffer cannot handle both contiguous and non-contiguous lists.");
            }
        }
        final int lji = liz.LJI + 1;
        liz.LJI = lji;
        if (lj != liz.LJ) {
            if (lj == null) {
                final int liz2 = liz.LIZ();
                if (liz.LJ != null) {
                    liz.LJ.LIZ(liz.LJII);
                    liz.LJ = null;
                }
                else if (liz.LJFF != null) {
                    liz.LJFF = null;
                }
                liz.LIZ.LIZIZ(0, liz2);
                return;
            }
            if (liz.LJ == null && liz.LJFF == null) {
                (liz.LJ = lj).LIZ((List<T>)null, liz.LJII);
                liz.LIZ.LIZ(0, lj.size());
                return;
            }
            if (liz.LJ != null) {
                liz.LJ.LIZ(liz.LJII);
                liz.LJFF = (0BD)liz.LJ.LJ();
                liz.LJ = null;
            }
            if (liz.LJFF == null || liz.LJ != null) {
                throw new IllegalStateException("must be in snapshot state to diff");
            }
            liz.LIZIZ.LIZIZ.execute(new 0An(liz, liz.LJFF, (0BD)lj.LJ(), lji, lj));
        }
    }
    
    @Override
    public int getItemCount() {
        return this.LIZ.LIZ();
    }
}
