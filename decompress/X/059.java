// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

public final class 059
{
    public 05G LIZ;
    public 05G LIZIZ;
    public 05G LIZJ;
    public 05G LIZLLL;
    public 05G LJ;
    public 05G LJFF;
    public 05G LJI;
    public ArrayList<05G> LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public float LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIIL;
    public boolean LJIILIIL;
    public boolean LJIILJJIL;
    public int LJIILL;
    public boolean LJIILLIIL;
    
    static {
        Covode.recordClassIndex(600);
    }
    
    public 059(final 05G liz, final int ljiill, final boolean ljiilliil) {
        this.LIZ = liz;
        this.LJIILL = ljiill;
        this.LJIILLIIL = ljiilliil;
    }
    
    public final void LIZ() {
        final int n = this.LJIILL * 2;
        05G liz = this.LIZ;
        final boolean b = false;
        05G 05G = liz;
        while (true) {
            ++this.LJIIIIZZ;
            liz.mNextChainWidget[this.LJIILL] = null;
            liz.mListNextMatchConstraintsWidget[this.LJIILL] = null;
            if (liz.mVisibility != 8) {
                if (this.LIZIZ == null) {
                    this.LIZIZ = liz;
                }
                this.LIZLLL = liz;
                if (liz.mListDimensionBehaviors[this.LJIILL] == X.05G.a.MATCH_CONSTRAINT && (liz.mResolvedMatchConstraintDefault[this.LJIILL] == 0 || liz.mResolvedMatchConstraintDefault[this.LJIILL] == 3 || liz.mResolvedMatchConstraintDefault[this.LJIILL] == 2)) {
                    ++this.LJIIIZ;
                    final float n2 = liz.mWeight[this.LJIILL];
                    if (n2 > 0.0f) {
                        this.LJIIJ += liz.mWeight[this.LJIILL];
                    }
                    final int ljiill = this.LJIILL;
                    if (liz.mVisibility != 8 && liz.mListDimensionBehaviors[ljiill] == X.05G.a.MATCH_CONSTRAINT && (liz.mResolvedMatchConstraintDefault[ljiill] == 0 || liz.mResolvedMatchConstraintDefault[ljiill] == 3)) {
                        if (n2 < 0.0f) {
                            this.LJIIJJI = true;
                        }
                        else {
                            this.LJIIL = true;
                        }
                        if (this.LJII == null) {
                            this.LJII = new ArrayList<05G>();
                        }
                        this.LJII.add(liz);
                    }
                    if (this.LJFF == null) {
                        this.LJFF = liz;
                    }
                    final 05G lji = this.LJI;
                    if (lji != null) {
                        lji.mListNextMatchConstraintsWidget[this.LJIILL] = liz;
                    }
                    this.LJI = liz;
                }
            }
            if (05G != liz) {
                05G.mNextChainWidget[this.LJIILL] = liz;
            }
            final 05D lizlll = liz.mListAnchors[n + 1].LIZLLL;
            if (lizlll == null) {
                break;
            }
            final 05G liziz = lizlll.LIZIZ;
            if (liziz.mListAnchors[n].LIZLLL == null || liziz.mListAnchors[n].LIZLLL.LIZIZ != liz) {
                break;
            }
            05G = liz;
            liz = liziz;
        }
        this.LIZJ = liz;
        if (this.LJIILL == 0 && this.LJIILLIIL) {
            this.LJ = liz;
        }
        else {
            this.LJ = this.LIZ;
        }
        boolean ljiiliil = b;
        if (this.LJIIL) {
            ljiiliil = b;
            if (this.LJIIJJI) {
                ljiiliil = true;
            }
        }
        this.LJIILIIL = ljiiliil;
    }
}
