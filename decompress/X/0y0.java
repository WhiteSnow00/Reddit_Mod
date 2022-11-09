// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.concurrent.TimeUnit;
import com.bytedance.covode.number.Covode;

public final class 0y0
{
    public String LIZ;
    public String LIZIZ;
    public float LIZJ;
    public long LIZLLL;
    public int LJ;
    public int LJFF;
    public int LJI;
    public int LJII;
    public 2fc LJIIIIZZ;
    
    static {
        Covode.recordClassIndex(10349);
    }
    
    public 0y0(final String liz, final String liziz, final long lizlll, final int lj, final int ljff, final int lji, final int ljii) {
        this.LIZ = liz;
        this.LIZIZ = liziz;
        this.LIZLLL = lizlll;
        this.LJ = lj;
        this.LJFF = ljff;
        this.LJI = lji;
        this.LJII = ljii;
    }
    
    public final void LIZ() {
        this.LIZJ = 0c9.LIZ() / 1024.0f;
        this.LJIIIIZZ = FBH.LIZIZ(5000L, TimeUnit.MILLISECONDS).LIZ(FAr.LIZIZ(FGw.LIZJ)).LJ((5Vs)new 1dA(this)).LIZ(1dB.LIZ, false).LIZ(F8U.LIZ(F8V.LIZ)).LIZ(1dC.LIZ, 1dD.LIZ);
    }
    
    public final void LIZIZ() {
        final 2fc ljiiiizz = this.LJIIIIZZ;
        if (ljiiiizz != null && !ljiiiizz.isDisposed()) {
            this.LJIIIIZZ.dispose();
        }
    }
}
