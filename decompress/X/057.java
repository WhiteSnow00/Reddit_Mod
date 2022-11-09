// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Iterator;
import com.bytedance.covode.number.Covode;

public final class 057
{
    static {
        Covode.recordClassIndex(597);
    }
    
    public static int LIZ(final 05G 05G) {
        int n2;
        if (05G.getHorizontalDimensionBehaviour() == 05G.a.MATCH_CONSTRAINT) {
            float n;
            if (05G.mDimensionRatioSide == 0) {
                n = 05G.getHeight() * 05G.mDimensionRatio;
            }
            else {
                n = 05G.getHeight() / 05G.mDimensionRatio;
            }
            n2 = (int)n;
            05G.setWidth(n2);
        }
        else if (05G.getVerticalDimensionBehaviour() == 05G.a.MATCH_CONSTRAINT) {
            float n3;
            if (05G.mDimensionRatioSide == 1) {
                n3 = 05G.getWidth() * 05G.mDimensionRatio;
            }
            else {
                n3 = 05G.getWidth() / 05G.mDimensionRatio;
            }
            n2 = (int)n3;
            05G.setHeight(n2);
        }
        else {
            n2 = -1;
        }
        return n2;
    }
    
    public static int LIZ(final 05G 05G, int length) {
        final int n = length * 2;
        final 05D 05D = 05G.mListAnchors[n];
        final 05D 05D2 = 05G.mListAnchors[n + 1];
        if (05D.LIZLLL != null && 05D.LIZLLL.LIZIZ == 05G.mParent && 05D2.LIZLLL != null && 05D2.LIZLLL.LIZIZ == 05G.mParent) {
            final int length2 = 05G.mParent.getLength(length);
            float n2;
            if (length == 0) {
                n2 = 05G.mHorizontalBiasPercent;
            }
            else {
                n2 = 05G.mVerticalBiasPercent;
            }
            length = 05G.getLength(length);
            return (int)((length2 - 05D.LIZIZ() - 05D2.LIZIZ() - length) * n2);
        }
        return 0;
    }
    
    public static int LIZ(final 05G 05G, final int n, final boolean b, int n2) {
        final int n3 = n2;
        final boolean mOptimizerMeasurable = 05G.mOptimizerMeasurable;
        final int n4 = 0;
        if (!mOptimizerMeasurable) {
            return 0;
        }
        boolean b2;
        if (05G.mBaseline.LIZLLL != null && n == 1) {
            b2 = true;
        }
        else {
            b2 = false;
        }
        int mBaselineDistance;
        int mBaselineDistance2;
        int n5;
        if (b) {
            mBaselineDistance = 05G.mBaselineDistance;
            mBaselineDistance2 = 05G.getHeight() - 05G.mBaselineDistance;
            n2 = n * 2;
            n5 = n2 + 1;
        }
        else {
            mBaselineDistance = 05G.getHeight() - 05G.mBaselineDistance;
            mBaselineDistance2 = 05G.mBaselineDistance;
            n5 = n * 2;
            n2 = n5 + 1;
        }
        int n6;
        int n7;
        int n8;
        if (05G.mListAnchors[n5].LIZLLL != null && 05G.mListAnchors[n2].LIZLLL == null) {
            n6 = -1;
            n7 = n5;
            n8 = n2;
        }
        else {
            n6 = 1;
            n8 = n5;
            n7 = n2;
        }
        n2 = n3;
        if (b2) {
            n2 = n3 - mBaselineDistance;
        }
        final int n9 = 05G.mListAnchors[n7].LIZIZ() * n6 + LIZ(05G, n);
        final int n10 = n2 + n9;
        if (n == 0) {
            n2 = 05G.getWidth();
        }
        else {
            n2 = 05G.getHeight();
        }
        final int n11 = n2 * n6;
        final Iterator<05K> iterator = 05G.mListAnchors[n7].LIZ.LJII.iterator();
        n2 = n4;
        while (iterator.hasNext()) {
            n2 = Math.max(n2, LIZ(((13o)iterator.next()).LIZ.LIZIZ, n, b, n10));
        }
        final Iterator<05K> iterator2 = 05G.mListAnchors[n8].LIZ.LJII.iterator();
        int max = 0;
        while (iterator2.hasNext()) {
            max = Math.max(max, LIZ(((13o)iterator2.next()).LIZ.LIZIZ, n, b, n11 + n10));
        }
        int n12;
        int n13;
        if (b2) {
            n12 = n2 - mBaselineDistance;
            n13 = max + mBaselineDistance2;
        }
        else {
            int n14;
            if (n == 0) {
                n14 = 05G.getWidth();
            }
            else {
                n14 = 05G.getHeight();
            }
            n13 = max + n14 * n6;
            n12 = n2;
        }
        if (n == 1) {
            final Iterator<05K> iterator3 = 05G.mBaseline.LIZ.LJII.iterator();
            int n15 = 0;
            while (iterator3.hasNext()) {
                final 13o 13o = (13o)iterator3.next();
                if (n6 == 1) {
                    n15 = Math.max(n15, LIZ(13o.LIZ.LIZIZ, n, b, mBaselineDistance + n10));
                }
                else {
                    n15 = Math.max(n15, LIZ(13o.LIZ.LIZIZ, n, b, mBaselineDistance2 * n6 + n10));
                }
            }
            n2 = n15;
            if (05G.mBaseline.LIZ.LJII.size() > 0) {
                n2 = n15;
                if (!b2) {
                    if (n6 == 1) {
                        n2 = n15 + mBaselineDistance;
                    }
                    else {
                        n2 = n15 - mBaselineDistance2;
                    }
                }
            }
        }
        else {
            n2 = 0;
        }
        final int max2 = Math.max(n12, Math.max(n13, n2));
        int n16 = n11 + n10;
        n2 = n10;
        if (n6 == -1) {
            n16 = (n2 = n10);
        }
        if (b) {
            05J.LIZ(05G, n, n2);
            05G.setFrame(n2, n16, n);
        }
        else {
            05G.mBelongingGroup.LIZ(05G, n);
            05G.setRelativePositioning(n2, n);
        }
        if (05G.getDimensionBehaviour(n) == 05G.a.MATCH_CONSTRAINT && 05G.mDimensionRatio != 0.0f) {
            05G.mBelongingGroup.LIZ(05G, n);
        }
        if (05G.mListAnchors[n7].LIZLLL != null && 05G.mListAnchors[n8].LIZLLL != null) {
            final 05G mParent = 05G.mParent;
            if (05G.mListAnchors[n7].LIZLLL.LIZIZ == mParent && 05G.mListAnchors[n8].LIZLLL.LIZIZ == mParent) {
                05G.mBelongingGroup.LIZ(05G, n);
            }
        }
        return n9 + max2;
    }
    
    public static int LIZ(final 05H 05H, final int n) {
        final int n2 = n * 2;
        List<05G> list;
        if (n == 0) {
            list = 05H.LJFF;
        }
        else if (n == 1) {
            list = 05H.LJI;
        }
        else {
            list = null;
        }
        final int size = list.size();
        int i = 0;
        int max = 0;
        while (i < size) {
            final 05G 05G = list.get(i);
            final 05D[] mListAnchors = 05G.mListAnchors;
            final int n3 = n2 + 1;
            max = Math.max(max, LIZ(05G, n, mListAnchors[n3].LIZLLL == null || (05G.mListAnchors[n2].LIZLLL != null && 05G.mListAnchors[n3].LIZLLL != null), 0));
            ++i;
        }
        return 05H.LJ[n] = max;
    }
    
    public static void LIZ(final 1fh 1fh) {
        1fh.LJIIJ.clear();
        1fh.LJIIJ.add(0, new 05H(1fh.LJIJJ));
    }
    
    public static void LIZ(final 1fh 1fh, final 05G 05G, final 05H 05H) {
        05H.LIZLLL = false;
        1fh.LJIIZILJ = false;
        05G.mOptimizerMeasurable = false;
    }
    
    public static void LIZ(final List<05H> list, final int n, final int n2) {
        for (int size = list.size(), i = 0; i < size; ++i) {
            final 05H 05H = list.get(i);
            HashSet<05G> set;
            if (n == 0) {
                set = 05H.LJII;
            }
            else if (n == 1) {
                set = 05H.LJIIIIZZ;
            }
            else {
                set = null;
            }
            for (final 05G 05G : set) {
                if (05G.mOptimizerMeasurable) {
                    final int n3 = n * 2;
                    final 05D 05D = 05G.mListAnchors[n3];
                    final 05D 05D2 = 05G.mListAnchors[n3 + 1];
                    if (05D.LIZLLL != null && 05D2.LIZLLL != null) {
                        05J.LIZ(05G, n, LIZ(05G, n) + 05D.LIZIZ());
                    }
                    else if (05G.mDimensionRatio != 0.0f && 05G.getDimensionBehaviour(n) == 05G.a.MATCH_CONSTRAINT) {
                        final int liz = LIZ(05G);
                        final int n4 = (int)05G.mListAnchors[n3].LIZ.LJ;
                        05D2.LIZ.LIZLLL = 05D.LIZ;
                        05D2.LIZ.LJ = (float)liz;
                        05D2.LIZ.LJIIIIZZ = 1;
                        05G.setFrame(n4, n4 + liz, n);
                    }
                    else {
                        final int n5 = n2 - 05G.getRelativePositioning(n);
                        final int n6 = n5 - 05G.getLength(n);
                        05G.setFrame(n6, n5, n);
                        05J.LIZ(05G, n, n6);
                    }
                }
            }
        }
    }
    
    public static boolean LIZ(final 05G 05G, final 05H 05H, final List<05H> list, final boolean b) {
        if (05G == null) {
            return true;
        }
        05G.mOptimizerMeasured = false;
        final 1fh 1fh = (1fh)05G.mParent;
        if (05G.mBelongingGroup == null) {
            05G.mOptimizerMeasurable = true;
            05H.LIZ.add(05G);
            05G.mBelongingGroup = 05H;
            if (05G.mLeft.LIZLLL == null && 05G.mRight.LIZLLL == null && 05G.mTop.LIZLLL == null && 05G.mBottom.LIZLLL == null && 05G.mBaseline.LIZLLL == null && 05G.mCenter.LIZLLL == null) {
                LIZ(1fh, 05G, 05H);
                if (b) {
                    return false;
                }
            }
            if (05G.mTop.LIZLLL != null && 05G.mBottom.LIZLLL != null) {
                1fh.getVerticalDimensionBehaviour();
                if (b) {
                    LIZ(1fh, 05G, 05H);
                    return false;
                }
                if (05G.mTop.LIZLLL.LIZIZ != 05G.mParent || 05G.mBottom.LIZLLL.LIZIZ != 05G.mParent) {
                    LIZ(1fh, 05G, 05H);
                }
            }
            if (05G.mLeft.LIZLLL != null && 05G.mRight.LIZLLL != null) {
                1fh.getHorizontalDimensionBehaviour();
                if (b) {
                    LIZ(1fh, 05G, 05H);
                    return false;
                }
                if (05G.mLeft.LIZLLL.LIZIZ != 05G.mParent || 05G.mRight.LIZLLL.LIZIZ != 05G.mParent) {
                    LIZ(1fh, 05G, 05H);
                }
            }
            boolean b2;
            if (05G.getHorizontalDimensionBehaviour() == 05G.a.MATCH_CONSTRAINT) {
                b2 = true;
            }
            else {
                b2 = false;
            }
            boolean b3;
            if (05G.getVerticalDimensionBehaviour() == 05G.a.MATCH_CONSTRAINT) {
                b3 = true;
            }
            else {
                b3 = false;
            }
            if ((b2 ^ b3) && 05G.mDimensionRatio != 0.0f) {
                LIZ(05G);
            }
            else if (05G.getHorizontalDimensionBehaviour() == 05G.a.MATCH_CONSTRAINT || 05G.getVerticalDimensionBehaviour() == 05G.a.MATCH_CONSTRAINT) {
                LIZ(1fh, 05G, 05H);
                if (b) {
                    return false;
                }
            }
            if (((05G.mLeft.LIZLLL == null && 05G.mRight.LIZLLL == null) || (05G.mLeft.LIZLLL != null && 05G.mLeft.LIZLLL.LIZIZ == 05G.mParent && 05G.mRight.LIZLLL == null) || (05G.mRight.LIZLLL != null && 05G.mRight.LIZLLL.LIZIZ == 05G.mParent && 05G.mLeft.LIZLLL == null) || (05G.mLeft.LIZLLL != null && 05G.mLeft.LIZLLL.LIZIZ == 05G.mParent && 05G.mRight.LIZLLL != null && 05G.mRight.LIZLLL.LIZIZ == 05G.mParent)) && 05G.mCenter.LIZLLL == null && !(05G instanceof 13m) && !(05G instanceof 13n)) {
                05H.LJFF.add(05G);
            }
            if (((05G.mTop.LIZLLL == null && 05G.mBottom.LIZLLL == null) || (05G.mTop.LIZLLL != null && 05G.mTop.LIZLLL.LIZIZ == 05G.mParent && 05G.mBottom.LIZLLL == null) || (05G.mBottom.LIZLLL != null && 05G.mBottom.LIZLLL.LIZIZ == 05G.mParent && 05G.mTop.LIZLLL == null) || (05G.mTop.LIZLLL != null && 05G.mTop.LIZLLL.LIZIZ == 05G.mParent && 05G.mBottom.LIZLLL != null && 05G.mBottom.LIZLLL.LIZIZ == 05G.mParent)) && 05G.mCenter.LIZLLL == null && 05G.mBaseline.LIZLLL == null && !(05G instanceof 13m) && !(05G instanceof 13n)) {
                05H.LJI.add(05G);
            }
            if (05G instanceof 13n) {
                LIZ(1fh, 05G, 05H);
                if (b) {
                    return false;
                }
                final 13n 13n = (13n)05G;
                for (int i = 0; i < 13n.LIZLLL; ++i) {
                    if (!LIZ(13n.LIZJ[i], 05H, list, b)) {
                        return false;
                    }
                }
            }
            for (int length = 05G.mListAnchors.length, j = 0; j < length; ++j) {
                final 05D 05D = 05G.mListAnchors[j];
                if (05D.LIZLLL != null && 05D.LIZLLL.LIZIZ != 05G.mParent) {
                    if (05D.LIZJ == X.05D.b.CENTER) {
                        LIZ(1fh, 05G, 05H);
                        if (b) {
                            return false;
                        }
                    }
                    else {
                        final 13o liz = 05D.LIZ;
                        if (05D.LIZLLL != null && 05D.LIZLLL.LIZLLL != 05D) {
                            05D.LIZLLL.LIZ.LIZ(liz);
                        }
                    }
                    if (!LIZ(05D.LIZLLL.LIZIZ, 05H, list, b)) {
                        return false;
                    }
                }
            }
            return true;
        }
        if (05G.mBelongingGroup != 05H) {
            05H.LIZ.addAll(05G.mBelongingGroup.LIZ);
            05H.LJFF.addAll(05G.mBelongingGroup.LJFF);
            05H.LJI.addAll(05G.mBelongingGroup.LJI);
            if (!05G.mBelongingGroup.LIZLLL) {
                05H.LIZLLL = false;
            }
            list.remove(05G.mBelongingGroup);
            final Iterator<05G> iterator = 05G.mBelongingGroup.LIZ.iterator();
            while (iterator.hasNext()) {
                iterator.next().mBelongingGroup = 05H;
            }
        }
        return true;
    }
}
