// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;

public final class 13o extends 05K
{
    public 05D LIZ;
    public 13o LIZIZ;
    public float LIZJ;
    public 13o LIZLLL;
    public float LJ;
    public int LJFF;
    public 13o LJI;
    public 13p LJIIIZ;
    public int LJIIJ;
    public 13p LJIIJJI;
    
    static {
        Covode.recordClassIndex(614);
    }
    
    public 13o(final 05D liz) {
        this.LJIIJ = 1;
        this.LIZ = liz;
    }
    
    private String LIZ(final int n) {
        if (n == 1) {
            return "DIRECT";
        }
        if (n == 2) {
            return "CENTER";
        }
        if (n == 3) {
            return "MATCH";
        }
        if (n == 4) {
            return "CHAIN";
        }
        if (n == 5) {
            return "BARRIER";
        }
        return "UNCONNECTED";
    }
    
    @Override
    public final void LIZ() {
        final int ljiiiizz = super.LJIIIIZZ;
        int n = 1;
        if (ljiiiizz == 1) {
            return;
        }
        if (this.LJFF == 4) {
            return;
        }
        final 13p ljiiiz = this.LJIIIZ;
        if (ljiiiz != null) {
            if (ljiiiz.LJIIIIZZ != 1) {
                return;
            }
            this.LIZJ = this.LJIIJ * this.LJIIIZ.LIZ;
        }
        final 13p ljiijji = this.LJIIJJI;
        if (ljiijji != null && ljiijji.LJIIIIZZ != 1) {
            return;
        }
        if (this.LJFF == 1) {
            final 13o liziz = this.LIZIZ;
            if (liziz == null || liziz.LJIIIIZZ == 1) {
                final 13o liziz2 = this.LIZIZ;
                if (liziz2 == null) {
                    this.LIZLLL = this;
                    this.LJ = this.LIZJ;
                }
                else {
                    this.LIZLLL = liziz2.LIZLLL;
                    this.LJ = liziz2.LJ + this.LIZJ;
                }
                this.LIZLLL();
                return;
            }
        }
        if (this.LJFF == 2) {
            final 13o liziz3 = this.LIZIZ;
            if (liziz3 != null && liziz3.LJIIIIZZ == 1) {
                final 13o lji = this.LJI;
                if (lji != null) {
                    final 13o liziz4 = lji.LIZIZ;
                    if (liziz4 != null && liziz4.LJIIIIZZ == 1) {
                        if (05Q.LJII != null) {
                            final 05R ljii = 05Q.LJII;
                            ++ljii.LJIL;
                        }
                        this.LIZLLL = this.LIZIZ.LIZLLL;
                        final 13o lji2 = this.LJI;
                        lji2.LIZLLL = lji2.LIZIZ.LIZLLL;
                        final 05D.b lizj = this.LIZ.LIZJ;
                        final 05D.b right = 05D.b.RIGHT;
                        int n2 = 0;
                        float n3;
                        float n4;
                        if (lizj == right || this.LIZ.LIZJ == 05D.b.BOTTOM) {
                            n3 = this.LIZIZ.LJ;
                            n4 = this.LJI.LIZIZ.LJ;
                        }
                        else {
                            n = 0;
                            n3 = this.LJI.LIZIZ.LJ;
                            n4 = this.LIZIZ.LJ;
                        }
                        final float n5 = n3 - n4;
                        float n6;
                        float n7;
                        if (this.LIZ.LIZJ == 05D.b.LEFT || this.LIZ.LIZJ == 05D.b.RIGHT) {
                            n6 = n5 - this.LIZ.LIZIZ.getWidth();
                            n7 = this.LIZ.LIZIZ.mHorizontalBiasPercent;
                        }
                        else {
                            n6 = n5 - this.LIZ.LIZIZ.getHeight();
                            n7 = this.LIZ.LIZIZ.mVerticalBiasPercent;
                        }
                        final int liziz5 = this.LIZ.LIZIZ();
                        int liziz6 = this.LJI.LIZ.LIZIZ();
                        if (this.LIZ.LIZLLL == this.LJI.LIZ.LIZLLL) {
                            n7 = 0.5f;
                            liziz6 = 0;
                        }
                        else {
                            n2 = liziz5;
                        }
                        final float n8 = (float)n2;
                        final float n9 = (float)liziz6;
                        final float n10 = n6 - n8 - n9;
                        if (n != 0) {
                            final 13o lji3 = this.LJI;
                            lji3.LJ = lji3.LIZIZ.LJ + n9 + n10 * n7;
                            this.LJ = this.LIZIZ.LJ - n8 - n10 * (1.0f - n7);
                        }
                        else {
                            this.LJ = this.LIZIZ.LJ + n8 + n10 * n7;
                            final 13o lji4 = this.LJI;
                            lji4.LJ = lji4.LIZIZ.LJ - n9 - n10 * (1.0f - n7);
                        }
                        this.LIZLLL();
                        this.LJI.LIZLLL();
                        return;
                    }
                }
            }
        }
        if (this.LJFF == 3) {
            final 13o liziz7 = this.LIZIZ;
            if (liziz7 != null && liziz7.LJIIIIZZ == 1) {
                final 13o lji5 = this.LJI;
                if (lji5 != null) {
                    final 13o liziz8 = lji5.LIZIZ;
                    if (liziz8 != null && liziz8.LJIIIIZZ == 1) {
                        if (05Q.LJII != null) {
                            final 05R ljii2 = 05Q.LJII;
                            ++ljii2.LJJ;
                        }
                        final 13o liziz9 = this.LIZIZ;
                        this.LIZLLL = liziz9.LIZLLL;
                        final 13o lji6 = this.LJI;
                        final 13o liziz10 = lji6.LIZIZ;
                        lji6.LIZLLL = liziz10.LIZLLL;
                        this.LJ = liziz9.LJ + this.LIZJ;
                        lji6.LJ = liziz10.LJ + lji6.LIZJ;
                        this.LIZLLL();
                        this.LJI.LIZLLL();
                        return;
                    }
                }
            }
        }
        if (this.LJFF == 5) {
            this.LIZ.LIZIZ.resolve();
        }
    }
    
    public final void LIZ(final 05Q 05Q) {
        final 05V ljiiiizz = this.LIZ.LJIIIIZZ;
        final 13o lizlll = this.LIZLLL;
        if (lizlll == null) {
            05Q.LIZ(ljiiiizz, (int)(this.LJ + 0.5f));
            return;
        }
        05Q.LIZJ(ljiiiizz, 05Q.LIZ(lizlll.LIZ), (int)(this.LJ + 0.5f), 6);
    }
    
    public final void LIZ(final 13o lizlll, final float lj) {
        if (super.LJIIIIZZ == 0 || (this.LIZLLL != lizlll && this.LJ != lj)) {
            this.LIZLLL = lizlll;
            this.LJ = lj;
            if (super.LJIIIIZZ == 1) {
                this.LIZJ();
            }
            this.LIZLLL();
        }
    }
    
    public final void LIZ(final 13o liziz, final int n) {
        this.LJFF = 1;
        this.LIZIZ = liziz;
        this.LIZJ = (float)n;
        liziz.LIZ(this);
    }
    
    public final void LIZ(final 13o liziz, final int ljiij, final 13p ljiiiz) {
        (this.LIZIZ = liziz).LIZ(this);
        this.LJIIIZ = ljiiiz;
        this.LJIIJ = ljiij;
        ljiiiz.LIZ(this);
    }
    
    public final void LIZ(final 13o lji, final 13p ljiijji) {
        this.LJI = lji;
        this.LJIIJJI = ljiijji;
    }
    
    @Override
    public final void LIZIZ() {
        super.LIZIZ();
        this.LIZIZ = null;
        this.LIZJ = 0.0f;
        this.LJIIIZ = null;
        this.LJIIJ = 1;
        this.LJIIJJI = null;
        this.LIZLLL = null;
        this.LJ = 0.0f;
        this.LJI = null;
        this.LJFF = 0;
    }
    
    public final void LIZIZ(final 13o liziz, final int n) {
        this.LIZIZ = liziz;
        this.LIZJ = (float)n;
        liziz.LIZ(this);
    }
    
    @Override
    public final String toString() {
        if (super.LJIIIIZZ != 1) {
            final StringBuilder sb = new StringBuilder("{ ");
            sb.append(this.LIZ);
            sb.append(" UNRESOLVED} type: ");
            sb.append(this.LIZ(this.LJFF));
            return sb.toString();
        }
        if (this.LIZLLL == this) {
            final StringBuilder sb2 = new StringBuilder("[");
            sb2.append(this.LIZ);
            sb2.append(", RESOLVED: ");
            sb2.append(this.LJ);
            sb2.append("]  type: ");
            sb2.append(this.LIZ(this.LJFF));
            return sb2.toString();
        }
        final StringBuilder sb3 = new StringBuilder("[");
        sb3.append(this.LIZ);
        sb3.append(", RESOLVED: ");
        sb3.append(this.LIZLLL);
        sb3.append(":");
        sb3.append(this.LJ);
        sb3.append("] type: ");
        sb3.append(this.LIZ(this.LJFF));
        return sb3.toString();
    }
}
