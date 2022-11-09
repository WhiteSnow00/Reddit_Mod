// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;
import androidx.recyclerview.widget.RecyclerView;

public final class 17J extends c
{
    public final /* synthetic */ 0Fg LIZ;
    
    static {
        Covode.recordClassIndex(1661);
    }
    
    public 17J(final 0Fg liz) {
        this.LIZ = liz;
    }
    
    @Override
    public final void LIZ() {
        final 0Fg liz = this.LIZ;
        liz.LJ = liz.LIZJ.getItemCount();
        this.LIZ.LIZLLL.LIZ();
    }
    
    @Override
    public final void LIZ(final int n, final int n2) {
        this.LIZ.LIZLLL.LIZ(this.LIZ, n, n2, null);
    }
    
    @Override
    public final void LIZ(final int n, final int n2, final int n3) {
        boolean b = true;
        if (n3 != 1) {
            b = false;
        }
        07U.LIZ(b, (Object)"moving more than 1 item is not supported in RecyclerView");
        this.LIZ.LIZLLL.LIZJ(this.LIZ, n, n2);
    }
    
    @Override
    public final void LIZ(final int n, final int n2, final Object o) {
        this.LIZ.LIZLLL.LIZ(this.LIZ, n, n2, o);
    }
    
    @Override
    public final void LIZIZ() {
        this.LIZ.LIZLLL.LIZIZ();
    }
    
    @Override
    public final void LIZIZ(final int n, final int n2) {
        final 0Fg liz = this.LIZ;
        liz.LJ += n2;
        this.LIZ.LIZLLL.LIZ(this.LIZ, n, n2);
        if (this.LIZ.LJ > 0 && this.LIZ.LIZJ.mStateRestorationPolicy == a.a.PREVENT_WHEN_EMPTY) {
            this.LIZ.LIZLLL.LIZIZ();
        }
    }
    
    @Override
    public final void LIZJ(final int n, final int n2) {
        final 0Fg liz = this.LIZ;
        liz.LJ -= n2;
        this.LIZ.LIZLLL.LIZIZ(this.LIZ, n, n2);
        if (this.LIZ.LJ <= 0 && this.LIZ.LIZJ.mStateRestorationPolicy == a.a.PREVENT_WHEN_EMPTY) {
            this.LIZ.LIZLLL.LIZIZ();
        }
    }
}
