// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;
import androidx.recyclerview.widget.RecyclerView;

public final class 179 extends n
{
    public final /* synthetic */ 17A LIZ;
    
    static {
        Covode.recordClassIndex(1633);
    }
    
    public 179(final 17A liz) {
        this.LIZ = liz;
    }
    
    @Override
    public final void LIZ(final RecyclerView recyclerView, int computeHorizontalScrollOffset, int computeHorizontalScrollRange) {
        final 17A liz = this.LIZ;
        computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        final int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        final int computeVerticalScrollRange = liz.LJIILIIL.computeVerticalScrollRange();
        final int ljiil = liz.LJIIL;
        liz.LJIILJJIL = (computeVerticalScrollRange - ljiil > 0 && liz.LJIIL >= liz.LIZ);
        computeHorizontalScrollRange = liz.LJIILIIL.computeHorizontalScrollRange();
        final int ljiijji = liz.LJIIJJI;
        liz.LJIILL = (computeHorizontalScrollRange - ljiijji > 0 && liz.LJIIJJI >= liz.LIZ);
        if (!liz.LJIILJJIL && !liz.LJIILL) {
            if (liz.LJIILLIIL != 0) {
                liz.LIZ(0);
            }
            return;
        }
        if (liz.LJIILJJIL) {
            final float n = (float)computeVerticalScrollOffset;
            final float n2 = (float)ljiil;
            liz.LJI = (int)(n2 * (n + n2 / 2.0f) / computeVerticalScrollRange);
            liz.LJFF = Math.min(ljiil, ljiil * ljiil / computeVerticalScrollRange);
        }
        if (liz.LJIILL) {
            final float n3 = (float)computeHorizontalScrollOffset;
            final float n4 = (float)ljiijji;
            liz.LJIIIZ = (int)(n4 * (n3 + n4 / 2.0f) / computeHorizontalScrollRange);
            liz.LJIIIIZZ = Math.min(ljiijji, ljiijji * ljiijji / computeHorizontalScrollRange);
        }
        if (liz.LJIILLIIL == 0 || liz.LJIILLIIL == 1) {
            liz.LIZ(1);
        }
    }
}
