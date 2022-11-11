// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;

public final class 1ZB implements b
{
    public final /* synthetic */ 1mN LIZ;
    
    static {
        Covode.recordClassIndex(9482);
    }
    
    public 1ZB(final 1mN liz) {
        this.LIZ = liz;
    }
    
    @Override
    public final void LIZ() {
        if (this.LIZ.LJIIL().getVisibility() != 0) {
            this.LIZ.LJIIL().setVisibility(0);
        }
    }
    
    @Override
    public final void LIZIZ() {
        if (this.LIZ.LIZIZ) {
            return;
        }
        this.LIZ.LIZIZ = true;
        final 1XD ljii = this.LIZ.LJII();
        if (ljii != null) {
            0sg.a.LIZ(ljii, "");
        }
    }
    
    @Override
    public final void LIZJ() {
        final HoY ljiil = this.LIZ.LJIIL();
        if (ljiil != null) {
            ljiil.setVisibility(8);
        }
    }
}
