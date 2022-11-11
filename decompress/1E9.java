// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;
import android.graphics.Bitmap;
import android.content.Context;

public class 1e9 extends 0zr<1mq>
{
    public final Context LIZ;
    public final Bitmap LIZIZ;
    public final String LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final int LJFF;
    public 1mq.a LJI;
    
    static {
        Covode.recordClassIndex(10591);
    }
    
    public 1e9(final Context liz, final Bitmap liziz, final String lizj, final int lizlll, final int lj, final int ljff) {
        CTM.LIZ((Object)liz, (Object)lizj);
        this.LIZ = liz;
        this.LIZIZ = liziz;
        this.LIZJ = lizj;
        this.LIZLLL = lizlll;
        this.LJ = lj;
        this.LJFF = ljff;
    }
    
    public 1mq.a LIZ() {
        return this.LJI;
    }
    
    public void LIZ(final 1mq.a lji) {
        this.LJI = lji;
    }
    
    @Override
    public final int LIZIZ() {
        return 0;
    }
    
    public 1mq LIZJ() {
        final Context liz = this.LIZ;
        final Bitmap liziz = this.LIZIZ;
        final int ljff = this.LJFF;
        final String lizj = this.LIZJ;
        final int lizlll = this.LIZLLL;
        final boolean lji = 0cB.LJI();
        final boolean b = this.LIZIZ != null;
        final int lj = this.LJ;
        final 1mq 1mq = new 1mq(liz, liziz, ljff, lizj, lizlll, new 1eJ(b, true, false, true, false, false, lji, 0, lj, lj, 0, 0, 6580, (byte)0));
        1mq.LIZIZ = this.LIZ();
        return 1mq;
    }
    
    public final void LJ() {
        this.LJII().LIZ().start();
    }
    
    public void LJFF() {
        this.LJII().LIZ = 255;
    }
    
    public final void LJI() {
        this.LJII().LJ();
    }
}
