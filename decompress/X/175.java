// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;

public final class 175 implements 0Fe
{
    public final 0Fe LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public Object LJ;
    
    static {
        Covode.recordClassIndex(1599);
    }
    
    public 175(final 0Fe liz) {
        this.LIZJ = -1;
        this.LIZLLL = -1;
        this.LIZ = liz;
    }
    
    public final void LIZ() {
        final int liziz = this.LIZIZ;
        if (liziz == 0) {
            return;
        }
        if (liziz != 1) {
            if (liziz != 2) {
                if (liziz == 3) {
                    this.LIZ.LIZ(this.LIZJ, this.LIZLLL, this.LJ);
                }
            }
            else {
                this.LIZ.LIZIZ(this.LIZJ, this.LIZLLL);
            }
        }
        else {
            this.LIZ.LIZ(this.LIZJ, this.LIZLLL);
        }
        this.LJ = null;
        this.LIZIZ = 0;
    }
    
    @Override
    public final void LIZ(final int lizj, final int lizlll) {
        if (this.LIZIZ == 1) {
            final int lizj2 = this.LIZJ;
            if (lizj >= lizj2) {
                final int lizlll2 = this.LIZLLL;
                if (lizj <= lizj2 + lizlll2) {
                    this.LIZLLL = lizlll2 + lizlll;
                    this.LIZJ = Math.min(lizj, lizj2);
                    return;
                }
            }
        }
        this.LIZ();
        this.LIZJ = lizj;
        this.LIZLLL = lizlll;
        this.LIZIZ = 1;
    }
    
    @Override
    public final void LIZ(final int lizj, final int lizlll, final Object lj) {
        if (this.LIZIZ == 3) {
            final int lizj2 = this.LIZJ;
            final int lizlll2 = this.LIZLLL;
            if (lizj <= lizj2 + lizlll2) {
                final int n = lizj + lizlll;
                if (n >= lizj2 && this.LJ == lj) {
                    this.LIZJ = Math.min(lizj, lizj2);
                    this.LIZLLL = Math.max(lizlll2 + lizj2, n) - this.LIZJ;
                    return;
                }
            }
        }
        this.LIZ();
        this.LIZJ = lizj;
        this.LIZLLL = lizlll;
        this.LJ = lj;
        this.LIZIZ = 3;
    }
    
    @Override
    public final void LIZIZ(final int n, final int lizlll) {
        if (this.LIZIZ == 2) {
            final int lizj = this.LIZJ;
            if (lizj >= n && lizj <= n + lizlll) {
                this.LIZLLL += lizlll;
                this.LIZJ = n;
                return;
            }
        }
        this.LIZ();
        this.LIZJ = n;
        this.LIZLLL = lizlll;
        this.LIZIZ = 2;
    }
    
    @Override
    public final void LIZJ(final int n, final int n2) {
        this.LIZ();
        this.LIZ.LIZJ(n, n2);
    }
}
