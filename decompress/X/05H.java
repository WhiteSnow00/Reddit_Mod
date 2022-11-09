// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.ArrayList;
import com.bytedance.covode.number.Covode;
import java.util.HashSet;
import java.util.List;

public class 05H
{
    public List<05G> LIZ;
    public int LIZIZ;
    public int LIZJ;
    public boolean LIZLLL;
    public final int[] LJ;
    public List<05G> LJFF;
    public List<05G> LJI;
    public HashSet<05G> LJII;
    public HashSet<05G> LJIIIIZZ;
    public List<05G> LJIIIZ;
    public List<05G> LJIIJ;
    
    static {
        Covode.recordClassIndex(609);
    }
    
    public 05H(final List<05G> liz) {
        this.LIZIZ = -1;
        this.LIZJ = -1;
        this.LJ = new int[] { -1, -1 };
        this.LJFF = new ArrayList<05G>();
        this.LJI = new ArrayList<05G>();
        this.LJII = new HashSet<05G>();
        this.LJIIIIZZ = new HashSet<05G>();
        this.LJIIIZ = new ArrayList<05G>();
        this.LJIIJ = new ArrayList<05G>();
        this.LIZ = liz;
    }
    
    public 05H(final List<05G> liz, final byte b) {
        this.LIZIZ = -1;
        this.LIZJ = -1;
        this.LJ = new int[] { -1, -1 };
        this.LJFF = new ArrayList<05G>();
        this.LJI = new ArrayList<05G>();
        this.LJII = new HashSet<05G>();
        this.LJIIIIZZ = new HashSet<05G>();
        this.LJIIIZ = new ArrayList<05G>();
        this.LJIIJ = new ArrayList<05G>();
        this.LIZ = liz;
        this.LIZLLL = true;
    }
    
    public void LIZ(final 05G 05G) {
        if (05G.mOptimizerMeasurable) {
            if (05G.isFullyResolved()) {
                return;
            }
            final 05D lizlll = 05G.mRight.LIZLLL;
            boolean b = false;
            int n;
            05D 05D;
            if (lizlll != null) {
                n = 1;
                05D = 05G.mRight.LIZLLL;
            }
            else {
                n = 0;
                05D = 05G.mLeft.LIZLLL;
            }
            while (true) {
                Label_0238: {
                    if (05D == null) {
                        break Label_0238;
                    }
                    if (!05D.LIZIZ.mOptimizerMeasured) {
                        this.LIZ(05D.LIZIZ);
                    }
                    int mx;
                    if (05D.LIZJ == X.05D.b.RIGHT) {
                        mx = 05D.LIZIZ.mX + 05D.LIZIZ.getWidth();
                    }
                    else {
                        if (05D.LIZJ != X.05D.b.LEFT) {
                            break Label_0238;
                        }
                        mx = 05D.LIZIZ.mX;
                    }
                    int n2;
                    if (n != 0) {
                        n2 = mx - 05G.mRight.LIZIZ();
                    }
                    else {
                        n2 = mx + (05G.mLeft.LIZIZ() + 05G.getWidth());
                    }
                    05G.setHorizontalDimension(n2 - 05G.getWidth(), n2);
                    if (05G.mBaseline.LIZLLL != null) {
                        final 05D lizlll2 = 05G.mBaseline.LIZLLL;
                        if (!lizlll2.LIZIZ.mOptimizerMeasured) {
                            this.LIZ(lizlll2.LIZIZ);
                        }
                        final int n3 = lizlll2.LIZIZ.mY + lizlll2.LIZIZ.mBaselineDistance - 05G.mBaselineDistance;
                        05G.setVerticalDimension(n3, 05G.mHeight + n3);
                        05G.mOptimizerMeasured = true;
                        return;
                    }
                    05D 05D2;
                    if (05G.mBottom.LIZLLL != null) {
                        b = true;
                        05D2 = 05G.mBottom.LIZLLL;
                    }
                    else {
                        05D2 = 05G.mTop.LIZLLL;
                    }
                    int my = n2;
                    if (05D2 != null) {
                        if (!05D2.LIZIZ.mOptimizerMeasured) {
                            this.LIZ(05D2.LIZIZ);
                        }
                        if (05D2.LIZJ == X.05D.b.BOTTOM) {
                            my = 05D2.LIZIZ.mY + 05D2.LIZIZ.getHeight();
                        }
                        else {
                            my = n2;
                            if (05D2.LIZJ == X.05D.b.TOP) {
                                my = 05D2.LIZIZ.mY;
                            }
                        }
                    }
                    int n4;
                    if (b) {
                        n4 = my - 05G.mBottom.LIZIZ();
                    }
                    else {
                        n4 = my + (05G.mTop.LIZIZ() + 05G.getHeight());
                    }
                    05G.setVerticalDimension(n4 - 05G.getHeight(), n4);
                    05G.mOptimizerMeasured = true;
                    return;
                }
                int mx = 0;
                continue;
            }
        }
    }
    
    public final void LIZ(final 05G 05G, final int n) {
        if (n == 0) {
            this.LJII.add(05G);
            return;
        }
        if (n == 1) {
            this.LJIIIIZZ.add(05G);
        }
    }
    
    public final void LIZ(final ArrayList<05G> list, final 05G 05G) {
        if (05G.mGroupsToSolver) {
            return;
        }
        list.add(05G);
        05G.mGroupsToSolver = true;
        if (05G.isFullyResolved()) {
            return;
        }
        final boolean b = 05G instanceof 13n;
        final int n = 0;
        if (b) {
            final 13n 13n = (13n)05G;
            for (int lizlll = 13n.LIZLLL, i = 0; i < lizlll; ++i) {
                this.LIZ(list, 13n.LIZJ[i]);
            }
        }
        for (int length = 05G.mListAnchors.length, j = n; j < length; ++j) {
            final 05D lizlll2 = 05G.mListAnchors[j].LIZLLL;
            if (lizlll2 != null) {
                final 05G liziz = lizlll2.LIZIZ;
                if (liziz != 05G.mParent) {
                    this.LIZ(list, liziz);
                }
            }
        }
    }
}
