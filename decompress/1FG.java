// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

public class 1fg extends 13n
{
    public int LIZ;
    public boolean LIZIZ;
    public ArrayList<13o> LJ;
    
    static {
        Covode.recordClassIndex(598);
    }
    
    public 1fg() {
        this.LJ = new ArrayList<13o>(4);
        this.LIZIZ = true;
    }
    
    @Override
    public void addToSolver(final 05Q 05Q) {
        super.mListAnchors[0] = super.mLeft;
        super.mListAnchors[2] = super.mTop;
        super.mListAnchors[1] = super.mRight;
        super.mListAnchors[3] = super.mBottom;
        for (int i = 0; i < super.mListAnchors.length; ++i) {
            super.mListAnchors[i].LJIIIIZZ = 05Q.LIZ(super.mListAnchors[i]);
        }
        final int liz = this.LIZ;
        if (liz >= 0 && liz < 4) {
            final 05D 05D = super.mListAnchors[this.LIZ];
            while (true) {
                for (int j = 0; j < super.LIZLLL; ++j) {
                    final 05G 05G = super.LIZJ[j];
                    if (this.LIZIZ || 05G.allowedInBarrier()) {
                        final int liz2 = this.LIZ;
                        if ((liz2 != 0 && liz2 != 1) || 05G.getHorizontalDimensionBehaviour() != a.MATCH_CONSTRAINT) {
                            final int liz3 = this.LIZ;
                            if ((liz3 != 2 && liz3 != 3) || 05G.getVerticalDimensionBehaviour() != a.MATCH_CONSTRAINT) {
                                continue;
                            }
                        }
                        int n = 1;
                        final int liz4 = this.LIZ;
                        Label_0195: {
                            if (liz4 == 0 || liz4 == 1) {
                                if (super.mParent.getHorizontalDimensionBehaviour() != a.WRAP_CONTENT) {
                                    break Label_0195;
                                }
                            }
                            else if (super.mParent.getVerticalDimensionBehaviour() != a.WRAP_CONTENT) {
                                break Label_0195;
                            }
                            n = 0;
                        }
                        for (int k = 0; k < super.LIZLLL; ++k) {
                            final 05G 05G2 = super.LIZJ[k];
                            if (this.LIZIZ || 05G2.allowedInBarrier()) {
                                final 05V liz5 = 05Q.LIZ(05G2.mListAnchors[this.LIZ]);
                                05G2.mListAnchors[this.LIZ].LJIIIIZZ = liz5;
                                final int liz6 = this.LIZ;
                                if (liz6 == 0 || liz6 == 2) {
                                    final 05V ljiiiizz = 05D.LJIIIIZZ;
                                    final 13r liziz = 05Q.LIZIZ();
                                    final 05V lizj = 05Q.LIZJ();
                                    liziz.LIZIZ(ljiiiizz, liz5, lizj, lizj.LJ = 0);
                                    if (n != 0) {
                                        05Q.LIZ(liziz, (int)(liziz.LIZJ.LIZIZ(lizj) * -1.0f), 1);
                                    }
                                    05Q.LIZ(liziz);
                                }
                                else {
                                    final 05V ljiiiizz2 = 05D.LJIIIIZZ;
                                    final 13r liziz2 = 05Q.LIZIZ();
                                    final 05V lizj2 = 05Q.LIZJ();
                                    liziz2.LIZ(ljiiiizz2, liz5, lizj2, lizj2.LJ = 0);
                                    if (n != 0) {
                                        05Q.LIZ(liziz2, (int)(liziz2.LIZJ.LIZIZ(lizj2) * -1.0f), 1);
                                    }
                                    05Q.LIZ(liziz2);
                                }
                            }
                        }
                        final int liz7 = this.LIZ;
                        if (liz7 == 0) {
                            05Q.LIZJ(super.mRight.LJIIIIZZ, super.mLeft.LJIIIIZZ, 0, 6);
                            if (n == 0) {
                                05Q.LIZJ(super.mLeft.LJIIIIZZ, super.mParent.mRight.LJIIIIZZ, 0, 5);
                            }
                            return;
                        }
                        else if (liz7 == 1) {
                            05Q.LIZJ(super.mLeft.LJIIIIZZ, super.mRight.LJIIIIZZ, 0, 6);
                            if (n == 0) {
                                05Q.LIZJ(super.mLeft.LJIIIIZZ, super.mParent.mLeft.LJIIIIZZ, 0, 5);
                            }
                            return;
                        }
                        else if (liz7 == 2) {
                            05Q.LIZJ(super.mBottom.LJIIIIZZ, super.mTop.LJIIIIZZ, 0, 6);
                            if (n == 0) {
                                05Q.LIZJ(super.mTop.LJIIIIZZ, super.mParent.mBottom.LJIIIIZZ, 0, 5);
                            }
                            return;
                        }
                        else {
                            if (liz7 != 3) {
                                return;
                            }
                            05Q.LIZJ(super.mTop.LJIIIIZZ, super.mBottom.LJIIIIZZ, 0, 6);
                            if (n == 0) {
                                05Q.LIZJ(super.mTop.LJIIIIZZ, super.mParent.mTop.LJIIIIZZ, 0, 5);
                            }
                            return;
                        }
                    }
                }
                int n = 0;
                continue;
            }
        }
    }
    
    @Override
    public boolean allowedInBarrier() {
        return true;
    }
    
    @Override
    public void analyze(int i) {
        if (super.mParent == null) {
            return;
        }
        if (!((1fh)super.mParent).LIZ(2)) {
            return;
        }
        i = this.LIZ;
        13o 13o;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return;
                    }
                    13o = super.mBottom.LIZ;
                }
                else {
                    13o = super.mTop.LIZ;
                }
            }
            else {
                13o = super.mRight.LIZ;
            }
        }
        else {
            13o = super.mLeft.LIZ;
        }
        13o.LJFF = 5;
        i = this.LIZ;
        if (i == 0 || i == 1) {
            super.mTop.LIZ.LIZ(null, 0.0f);
            super.mBottom.LIZ.LIZ(null, 0.0f);
        }
        else {
            super.mLeft.LIZ.LIZ(null, 0.0f);
            super.mRight.LIZ.LIZ(null, 0.0f);
        }
        this.LJ.clear();
        05G 05G;
        int liz;
        13o 13o2;
        for (i = 0; i < super.LIZLLL; ++i) {
            05G = super.LIZJ[i];
            if (this.LIZIZ || 05G.allowedInBarrier()) {
                liz = this.LIZ;
                if (liz != 0) {
                    if (liz != 1) {
                        if (liz != 2) {
                            if (liz != 3) {
                                continue;
                            }
                            13o2 = 05G.mBottom.LIZ;
                        }
                        else {
                            13o2 = 05G.mTop.LIZ;
                        }
                    }
                    else {
                        13o2 = 05G.mRight.LIZ;
                    }
                }
                else {
                    13o2 = 05G.mLeft.LIZ;
                }
                if (13o2 != null) {
                    this.LJ.add(13o2);
                    13o2.LIZ(13o);
                }
            }
        }
    }
    
    @Override
    public void resetResolutionNodes() {
        super.resetResolutionNodes();
        this.LJ.clear();
    }
    
    @Override
    public void resolve() {
        final int liz = this.LIZ;
        float n = Float.MAX_VALUE;
        13o 13o = null;
        Label_0071: {
            if (liz != 0) {
                if (liz != 1) {
                    if (liz == 2) {
                        13o = super.mTop.LIZ;
                        break Label_0071;
                    }
                    if (liz != 3) {
                        return;
                    }
                    13o = super.mBottom.LIZ;
                }
                else {
                    13o = super.mRight.LIZ;
                }
                n = 0.0f;
            }
            else {
                13o = super.mLeft.LIZ;
            }
        }
        final int size = this.LJ.size();
        13o lizlll = null;
        int i = 0;
        float lj = n;
        while (i < size) {
            final 13o 13o2 = this.LJ.get(i);
            if (13o2.LJIIIIZZ != 1) {
                return;
            }
            final int liz2 = this.LIZ;
            float n2;
            if (liz2 == 0 || liz2 == 2) {
                n2 = lj;
                if (13o2.LJ < lj) {
                    n2 = 13o2.LJ;
                    lizlll = 13o2.LIZLLL;
                }
            }
            else {
                n2 = lj;
                if (13o2.LJ > lj) {
                    n2 = 13o2.LJ;
                    lizlll = 13o2.LIZLLL;
                }
            }
            ++i;
            lj = n2;
        }
        if (05Q.LJII != null) {
            final 05R ljii = 05Q.LJII;
            ++ljii.LJJIFFI;
        }
        13o.LIZLLL = lizlll;
        13o.LJ = lj;
        13o.LIZLLL();
        final int liz3 = this.LIZ;
        if (liz3 == 0) {
            super.mRight.LIZ.LIZ(lizlll, lj);
            return;
        }
        if (liz3 == 1) {
            super.mLeft.LIZ.LIZ(lizlll, lj);
            return;
        }
        if (liz3 == 2) {
            super.mBottom.LIZ.LIZ(lizlll, lj);
            return;
        }
        if (liz3 != 3) {
            return;
        }
        super.mTop.LIZ.LIZ(lizlll, lj);
    }
}
