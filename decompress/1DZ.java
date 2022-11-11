// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.List;
import com.bytedance.covode.number.Covode;

public final class 1Dz implements 0Su
{
    public int LIZ;
    public 0Su LIZIZ;
    
    static {
        Covode.recordClassIndex(4560);
    }
    
    public 1Dz(final 1hm 1hm) {
        final int liziz = 1hm.LIZ.LIZIZ;
        this.LIZ = liziz;
        this.LIZIZ = LIZIZ(liziz);
    }
    
    public static 0Su LIZIZ(final int n) {
        0Su 0Su;
        if (n != 0) {
            if (n != 1) {
                if (n != 2) {
                    0Su = null;
                }
                else {
                    0Su = new 1E0();
                }
            }
            else {
                0Su = new 1Dy();
            }
        }
        else {
            0Su = new 1E1();
        }
        return 0Su;
    }
    
    @Override
    public final List<1Dk> LIZ(final List<1Dk> list) {
        return this.LIZIZ.LIZ(list);
    }
    
    @Override
    public final void LIZ() {
        this.LIZIZ.LIZ();
    }
    
    @Override
    public final void LIZ(final int n) {
        if (n == this.LIZ && this.LIZIZ != null) {
            return;
        }
        final 0Su liziz = LIZIZ(n);
        if (liziz == null) {
            return;
        }
        final 0Su liziz2 = this.LIZIZ;
        List<1Dk> liziz3 = null;
        if (liziz2 != null) {
            liziz3 = liziz2.LIZIZ();
            liziz2.LIZ();
            liziz2.LIZLLL();
        }
        this.LIZIZ = liziz;
        if (liziz3 != null) {
            liziz.LIZ(liziz3);
        }
    }
    
    @Override
    public final boolean LIZ(final 1Dk 1Dk) {
        return this.LIZIZ.LIZ(1Dk);
    }
    
    @Override
    public final List<1Dk> LIZIZ() {
        return this.LIZIZ.LIZIZ();
    }
    
    @Override
    public final void LIZIZ(final 1Dk 1Dk) {
        this.LIZIZ.LIZIZ(1Dk);
    }
    
    @Override
    public final List<1Dk> LIZJ() {
        return this.LIZIZ.LIZJ();
    }
    
    @Override
    public final void LIZJ(final 1Dk 1Dk) {
        this.LIZIZ.LIZJ(1Dk);
    }
    
    @Override
    public final void LIZLLL() {
        this.LIZIZ.LIZLLL();
    }
}
