// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;

public final class 05J
{
    public static boolean[] LIZ;
    
    static {
        Covode.recordClassIndex(613);
        05J.LIZ = new boolean[3];
    }
    
    public static void LIZ(int n, final 05G 05G) {
        05G.updateResolutionNodes();
        final 13o liz = 05G.mLeft.LIZ;
        final 13o liz2 = 05G.mTop.LIZ;
        final 13o liz3 = 05G.mRight.LIZ;
        final 13o liz4 = 05G.mBottom.LIZ;
        if ((n & 0x8) == 0x8) {
            n = 1;
        }
        else {
            n = 0;
        }
        int n2;
        if (05G.mListDimensionBehaviors[0] == 05G.a.MATCH_CONSTRAINT && LIZ(05G, 0)) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        Label_0161: {
            if (liz.LJFF != 4 && liz3.LJFF != 4) {
                if (05G.mListDimensionBehaviors[0] != 05G.a.FIXED) {
                    if (n2 == 0) {
                        break Label_0161;
                    }
                    if (05G.mVisibility != 8) {
                        final int width = 05G.getWidth();
                        liz.LJFF = 1;
                        liz3.LJFF = 1;
                        if (05G.mLeft.LIZLLL == null && 05G.mRight.LIZLLL == null) {
                            if (n != 0) {
                                liz3.LIZ(liz, 1, 05G.getResolutionWidth());
                                break Label_0161;
                            }
                            liz3.LIZIZ(liz, width);
                            break Label_0161;
                        }
                        else if (05G.mLeft.LIZLLL != null && 05G.mRight.LIZLLL == null) {
                            if (n != 0) {
                                liz3.LIZ(liz, 1, 05G.getResolutionWidth());
                                break Label_0161;
                            }
                            liz3.LIZIZ(liz, width);
                            break Label_0161;
                        }
                        else if (05G.mLeft.LIZLLL == null && 05G.mRight.LIZLLL != null) {
                            if (n != 0) {
                                liz.LIZ(liz3, -1, 05G.getResolutionWidth());
                                break Label_0161;
                            }
                            liz.LIZIZ(liz3, -width);
                            break Label_0161;
                        }
                        else {
                            if (05G.mLeft.LIZLLL == null || 05G.mRight.LIZLLL == null) {
                                break Label_0161;
                            }
                            if (n != 0) {
                                05G.getResolutionWidth().LIZ(liz);
                                05G.getResolutionWidth().LIZ(liz3);
                            }
                            if (05G.mDimensionRatio == 0.0f) {
                                liz.LJFF = 3;
                                liz3.LJFF = 3;
                                liz.LJI = liz3;
                                liz3.LJI = liz;
                                break Label_0161;
                            }
                            liz.LJFF = 2;
                            liz3.LJFF = 2;
                            liz.LJI = liz3;
                            liz3.LJI = liz;
                            05G.setWidth(width);
                            break Label_0161;
                        }
                    }
                }
                if (05G.mLeft.LIZLLL == null && 05G.mRight.LIZLLL == null) {
                    liz.LJFF = 1;
                    liz3.LJFF = 1;
                    if (n != 0) {
                        liz3.LIZ(liz, 1, 05G.getResolutionWidth());
                    }
                    else {
                        liz3.LIZIZ(liz, 05G.getWidth());
                    }
                }
                else if (05G.mLeft.LIZLLL != null && 05G.mRight.LIZLLL == null) {
                    liz.LJFF = 1;
                    liz3.LJFF = 1;
                    if (n != 0) {
                        liz3.LIZ(liz, 1, 05G.getResolutionWidth());
                    }
                    else {
                        liz3.LIZIZ(liz, 05G.getWidth());
                    }
                }
                else if (05G.mLeft.LIZLLL == null && 05G.mRight.LIZLLL != null) {
                    liz.LJFF = 1;
                    liz3.LJFF = 1;
                    liz.LIZIZ(liz3, -05G.getWidth());
                    if (n != 0) {
                        liz.LIZ(liz3, -1, 05G.getResolutionWidth());
                    }
                    else {
                        liz.LIZIZ(liz3, -05G.getWidth());
                    }
                }
                else if (05G.mLeft.LIZLLL != null && 05G.mRight.LIZLLL != null) {
                    liz.LJFF = 2;
                    liz3.LJFF = 2;
                    if (n != 0) {
                        05G.getResolutionWidth().LIZ(liz);
                        05G.getResolutionWidth().LIZ(liz3);
                        liz.LIZ(liz3, 05G.getResolutionWidth());
                        liz3.LIZ(liz, 05G.getResolutionWidth());
                    }
                    else {
                        05G.getWidth();
                        liz.LJI = liz3;
                        05G.getWidth();
                        liz3.LJI = liz;
                    }
                }
            }
        }
        int n3;
        if (05G.mListDimensionBehaviors[1] == 05G.a.MATCH_CONSTRAINT && LIZ(05G, 1)) {
            n3 = 1;
        }
        else {
            n3 = 0;
        }
        if (liz2.LJFF != 4 && liz4.LJFF != 4) {
            if (05G.mListDimensionBehaviors[1] != 05G.a.FIXED) {
                if (n3 == 0) {
                    return;
                }
                if (05G.mVisibility != 8) {
                    final int height = 05G.getHeight();
                    liz2.LJFF = 1;
                    liz4.LJFF = 1;
                    if (05G.mTop.LIZLLL == null && 05G.mBottom.LIZLLL == null) {
                        if (n != 0) {
                            liz4.LIZ(liz2, 1, 05G.getResolutionHeight());
                            return;
                        }
                        liz4.LIZIZ(liz2, height);
                        return;
                    }
                    else if (05G.mTop.LIZLLL != null && 05G.mBottom.LIZLLL == null) {
                        if (n != 0) {
                            liz4.LIZ(liz2, 1, 05G.getResolutionHeight());
                            return;
                        }
                        liz4.LIZIZ(liz2, height);
                        return;
                    }
                    else if (05G.mTop.LIZLLL == null && 05G.mBottom.LIZLLL != null) {
                        if (n != 0) {
                            liz2.LIZ(liz4, -1, 05G.getResolutionHeight());
                            return;
                        }
                        liz2.LIZIZ(liz4, -height);
                        return;
                    }
                    else {
                        if (05G.mTop.LIZLLL == null || 05G.mBottom.LIZLLL == null) {
                            return;
                        }
                        if (n != 0) {
                            05G.getResolutionHeight().LIZ(liz2);
                            05G.getResolutionWidth().LIZ(liz4);
                        }
                        if (05G.mDimensionRatio == 0.0f) {
                            liz2.LJFF = 3;
                            liz4.LJFF = 3;
                            liz2.LJI = liz4;
                            liz4.LJI = liz2;
                            return;
                        }
                        liz2.LJFF = 2;
                        liz4.LJFF = 2;
                        liz2.LJI = liz4;
                        liz4.LJI = liz2;
                        05G.setHeight(height);
                        if (05G.mBaselineDistance > 0) {
                            05G.mBaseline.LIZ.LIZ(liz2, 05G.mBaselineDistance);
                        }
                        return;
                    }
                }
            }
            if (05G.mTop.LIZLLL == null && 05G.mBottom.LIZLLL == null) {
                liz2.LJFF = 1;
                liz4.LJFF = 1;
                if (n != 0) {
                    liz4.LIZ(liz2, 1, 05G.getResolutionHeight());
                }
                else {
                    liz4.LIZIZ(liz2, 05G.getHeight());
                }
                if (05G.mBaseline.LIZLLL != null) {
                    05G.mBaseline.LIZ.LJFF = 1;
                    liz2.LIZ(05G.mBaseline.LIZ, -05G.mBaselineDistance);
                }
            }
            else if (05G.mTop.LIZLLL != null && 05G.mBottom.LIZLLL == null) {
                liz2.LJFF = 1;
                liz4.LJFF = 1;
                if (n != 0) {
                    liz4.LIZ(liz2, 1, 05G.getResolutionHeight());
                }
                else {
                    liz4.LIZIZ(liz2, 05G.getHeight());
                }
                if (05G.mBaselineDistance > 0) {
                    05G.mBaseline.LIZ.LIZ(liz2, 05G.mBaselineDistance);
                }
            }
            else if (05G.mTop.LIZLLL == null && 05G.mBottom.LIZLLL != null) {
                liz2.LJFF = 1;
                liz4.LJFF = 1;
                if (n != 0) {
                    liz2.LIZ(liz4, -1, 05G.getResolutionHeight());
                }
                else {
                    liz2.LIZIZ(liz4, -05G.getHeight());
                }
                if (05G.mBaselineDistance > 0) {
                    05G.mBaseline.LIZ.LIZ(liz2, 05G.mBaselineDistance);
                }
            }
            else if (05G.mTop.LIZLLL != null && 05G.mBottom.LIZLLL != null) {
                liz2.LJFF = 2;
                liz4.LJFF = 2;
                if (n != 0) {
                    liz2.LIZ(liz4, 05G.getResolutionHeight());
                    liz4.LIZ(liz2, 05G.getResolutionHeight());
                    05G.getResolutionHeight().LIZ(liz2);
                    05G.getResolutionWidth().LIZ(liz4);
                }
                else {
                    05G.getHeight();
                    liz2.LJI = liz4;
                    05G.getHeight();
                    liz4.LJI = liz2;
                }
                if (05G.mBaselineDistance > 0) {
                    05G.mBaseline.LIZ.LIZ(liz2, 05G.mBaselineDistance);
                }
            }
        }
    }
    
    public static void LIZ(final 05G 05G, final int n, final int n2) {
        final int n3 = n * 2;
        final int n4 = n3 + 1;
        05G.mListAnchors[n3].LIZ.LIZLLL = 05G.mParent.mLeft.LIZ;
        05G.mListAnchors[n3].LIZ.LJ = (float)n2;
        05G.mListAnchors[n3].LIZ.LJIIIIZZ = 1;
        05G.mListAnchors[n4].LIZ.LIZLLL = 05G.mListAnchors[n3].LIZ;
        05G.mListAnchors[n4].LIZ.LJ = (float)05G.getLength(n);
        05G.mListAnchors[n4].LIZ.LJIIIIZZ = 1;
    }
    
    public static void LIZ(final 1fh 1fh, final 05Q 05Q, final 05G 05G) {
        if (1fh.mListDimensionBehaviors[0] != 05G.a.WRAP_CONTENT && 05G.mListDimensionBehaviors[0] == 05G.a.MATCH_PARENT) {
            final int lj = 05G.mLeft.LJ;
            final int n = 1fh.getWidth() - 05G.mRight.LJ;
            05G.mLeft.LJIIIIZZ = 05Q.LIZ(05G.mLeft);
            05G.mRight.LJIIIIZZ = 05Q.LIZ(05G.mRight);
            05Q.LIZ(05G.mLeft.LJIIIIZZ, lj);
            05Q.LIZ(05G.mRight.LJIIIIZZ, n);
            05G.mHorizontalResolution = 2;
            05G.setHorizontalDimension(lj, n);
        }
        if (1fh.mListDimensionBehaviors[1] != 05G.a.WRAP_CONTENT && 05G.mListDimensionBehaviors[1] == 05G.a.MATCH_PARENT) {
            final int lj2 = 05G.mTop.LJ;
            final int n2 = 1fh.getHeight() - 05G.mBottom.LJ;
            05G.mTop.LJIIIIZZ = 05Q.LIZ(05G.mTop);
            05G.mBottom.LJIIIIZZ = 05Q.LIZ(05G.mBottom);
            05Q.LIZ(05G.mTop.LJIIIIZZ, lj2);
            05Q.LIZ(05G.mBottom.LJIIIIZZ, n2);
            if (05G.mBaselineDistance > 0 || 05G.mVisibility == 8) {
                05Q.LIZ(05G.mBaseline.LJIIIIZZ = 05Q.LIZ(05G.mBaseline), 05G.mBaselineDistance + lj2);
            }
            05G.mVerticalResolution = 2;
            05G.setVerticalDimension(lj2, n2);
        }
    }
    
    public static boolean LIZ(final 05G 05G, int n) {
        if (05G.mListDimensionBehaviors[n] != 05G.a.MATCH_CONSTRAINT) {
            return false;
        }
        final float mDimensionRatio = 05G.mDimensionRatio;
        final int n2 = 1;
        if (mDimensionRatio != 0.0f) {
            final 05G.a[] mListDimensionBehaviors = 05G.mListDimensionBehaviors;
            if (n == 0) {
                n = n2;
            }
            else {
                n = 0;
            }
            final 05G.a a = mListDimensionBehaviors[n];
            final 05G.a match_CONSTRAINT = X.05G.a.MATCH_CONSTRAINT;
            return false;
        }
        if (n == 0) {
            if (05G.mMatchConstraintDefaultWidth != 0) {
                return false;
            }
            if (05G.mMatchConstraintMinWidth != 0 || 05G.mMatchConstraintMaxWidth != 0) {
                return false;
            }
        }
        else {
            if (05G.mMatchConstraintDefaultHeight != 0) {
                return false;
            }
            if (05G.mMatchConstraintMinHeight != 0 || 05G.mMatchConstraintMaxHeight != 0) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean LIZ(final 05Q 05Q, final int n, final int n2, final 059 059) {
        05G liz = 059.LIZ;
        final 05G lizj = 059.LIZJ;
        final 05G liziz = 059.LIZIZ;
        final 05G lizlll = 059.LIZLLL;
        final 05G lj = 059.LJ;
        final float ljiij = 059.LJIIJ;
        while (true) {
            int n5 = 0;
            int n6 = 0;
            Label_0606: {
                int n3;
                int n4;
                if (n == 0) {
                    if (lj.mHorizontalChainStyle == 0) {
                        n3 = 1;
                    }
                    else {
                        n3 = 0;
                    }
                    if (lj.mHorizontalChainStyle == 1) {
                        n4 = 1;
                    }
                    else {
                        n4 = 0;
                    }
                    n5 = n4;
                    n6 = n3;
                    if (lj.mHorizontalChainStyle != 2) {
                        break Label_0606;
                    }
                }
                else {
                    if (lj.mVerticalChainStyle == 0) {
                        n3 = 1;
                    }
                    else {
                        n3 = 0;
                    }
                    if (lj.mVerticalChainStyle == 1) {
                        n4 = 1;
                    }
                    else {
                        n4 = 0;
                    }
                    n5 = n4;
                    n6 = n3;
                    if (lj.mVerticalChainStyle != 2) {
                        break Label_0606;
                    }
                }
                final boolean b = true;
                final int n7 = n3;
                final int n8 = n4;
                05G 05G = liz;
                int n9 = 0;
                int n10 = 0;
                float n11 = 0.0f;
                float n12 = 0.0f;
                int n13 = 0;
                int n14 = 0;
                float n15 = 0.0f;
                float n16 = 0.0f;
                Label_0465: {
                    while (true) {
                        n13 = n9;
                        n14 = n10;
                        n15 = n12;
                        n16 = n11;
                        if (false) {
                            break Label_0465;
                        }
                        int n17 = n10;
                        float n18 = n12;
                        float n19 = n11;
                        if (05G.mVisibility != 8) {
                            ++n10;
                            int n20;
                            if (n == 0) {
                                n20 = 05G.getWidth();
                            }
                            else {
                                n20 = 05G.getHeight();
                            }
                            float n22;
                            final float n21 = n22 = n11 + n20;
                            if (05G != liziz) {
                                n22 = n21 + 05G.mListAnchors[n2].LIZIZ();
                            }
                            n19 = n22;
                            if (05G != lizlll) {
                                n19 = n22 + 05G.mListAnchors[n2 + 1].LIZIZ();
                            }
                            n18 = n12 + 05G.mListAnchors[n2].LIZIZ() + 05G.mListAnchors[n2 + 1].LIZIZ();
                            n17 = n10;
                        }
                        int n23 = n9;
                        if (05G.mVisibility != 8) {
                            n23 = n9;
                            if (05G.mListDimensionBehaviors[n] == X.05G.a.MATCH_CONSTRAINT) {
                                n23 = n9 + 1;
                                if (n == 0) {
                                    if (05G.mMatchConstraintDefaultWidth != 0) {
                                        return false;
                                    }
                                    if (05G.mMatchConstraintMinWidth != 0 || 05G.mMatchConstraintMaxWidth != 0) {
                                        return false;
                                    }
                                }
                                else {
                                    if (05G.mMatchConstraintDefaultHeight != 0) {
                                        return false;
                                    }
                                    if (05G.mMatchConstraintMinHeight != 0 || 05G.mMatchConstraintMaxHeight != 0) {
                                        break;
                                    }
                                }
                                if (05G.mDimensionRatio != 0.0f) {
                                    break;
                                }
                            }
                        }
                        final 05D lizlll2 = 05G.mListAnchors[n2 + 1].LIZLLL;
                        n13 = n23;
                        n14 = n17;
                        n15 = n18;
                        n16 = n19;
                        if (lizlll2 == null) {
                            break Label_0465;
                        }
                        final 05G liziz2 = lizlll2.LIZIZ;
                        n13 = n23;
                        n14 = n17;
                        n15 = n18;
                        n16 = n19;
                        if (liziz2.mListAnchors[n2].LIZLLL == null) {
                            break Label_0465;
                        }
                        if (liziz2.mListAnchors[n2].LIZLLL.LIZIZ != 05G) {
                            n16 = n19;
                            n15 = n18;
                            n14 = n17;
                            n13 = n23;
                            break Label_0465;
                        }
                        05G = liziz2;
                        n9 = n23;
                        n10 = n17;
                        n12 = n18;
                        n11 = n19;
                    }
                    return false;
                }
                final 13o liz2 = liz.mListAnchors[n2].LIZ;
                final 05D[] mListAnchors = lizj.mListAnchors;
                final int n24 = n2 + 1;
                final 13o liz3 = mListAnchors[n24].LIZ;
                if (liz2.LIZIZ == null || liz3.LIZIZ == null) {
                    return false;
                }
                if (liz2.LIZIZ.LJIIIIZZ != 1 || liz3.LIZIZ.LJIIIIZZ != 1) {
                    return false;
                }
                if (n13 > 0 && n13 != n14) {
                    return false;
                }
                float n26;
                if (b || n7 != 0 || n8 != 0) {
                    float n25;
                    if (liziz != null) {
                        n25 = (float)liziz.mListAnchors[n2].LIZIZ();
                    }
                    else {
                        n25 = 0.0f;
                    }
                    n26 = n25;
                    if (lizlll != null) {
                        n26 = n25 + lizlll.mListAnchors[n24].LIZIZ();
                    }
                }
                else {
                    n26 = 0.0f;
                }
                float lj2 = liz2.LIZIZ.LJ;
                final float lj3 = liz3.LIZIZ.LJ;
                float n27;
                if (lj2 < lj3) {
                    n27 = lj3 - lj2;
                }
                else {
                    n27 = lj2 - lj3;
                }
                final float n28 = n27 - n16;
                if (n13 <= 0 || n13 != n14) {
                    if (n28 >= 0.0f && !b) {
                        if (n7 != 0 || n8 != 0) {
                            final float n29 = n28 - n26;
                            float n30 = n29 / (n14 + 1);
                            if (n8 != 0) {
                                float n31;
                                if (n14 > 1) {
                                    n31 = (float)(n14 - 1);
                                }
                                else {
                                    n31 = 2.0f;
                                }
                                n30 = n29 / n31;
                            }
                            float n32;
                            if (liz.mVisibility != 8) {
                                n32 = lj2 + n30;
                            }
                            else {
                                n32 = lj2;
                            }
                            float n33 = n32;
                            if (n8 != 0) {
                                n33 = n32;
                                if (n14 > 1) {
                                    n33 = liziz.mListAnchors[n2].LIZIZ() + lj2;
                                }
                            }
                            05G 05G2 = liz;
                            float n34 = n33;
                            if (n7 != 0) {
                                05G2 = liz;
                                n34 = n33;
                                if (liziz != null) {
                                    n34 = n33 + liziz.mListAnchors[n2].LIZIZ();
                                    05G2 = liz;
                                }
                            }
                            do {
                                if (05Q.LJII != null) {
                                    final 05R ljii = 05Q.LJII;
                                    --ljii.LJJIII;
                                    final 05R ljii2 = 05Q.LJII;
                                    ++ljii2.LJIJ;
                                    final 05R ljii3 = 05Q.LJII;
                                    ++ljii3.LJJI;
                                }
                                final 05G 05G3 = 05G2.mNextChainWidget[n];
                                if (05G3 == null && 05G2 != lizj) {
                                    break;
                                }
                                int n35;
                                if (n == 0) {
                                    n35 = 05G2.getWidth();
                                }
                                else {
                                    n35 = 05G2.getHeight();
                                }
                                final float n36 = (float)n35;
                                float n37 = n34;
                                if (05G2 != liziz) {
                                    n37 = n34 + 05G2.mListAnchors[n2].LIZIZ();
                                }
                                05G2.mListAnchors[n2].LIZ.LIZ(liz2.LIZLLL, n37);
                                05G2.mListAnchors[n24].LIZ.LIZ(liz2.LIZLLL, n37 + n36);
                                05G2.mListAnchors[n2].LIZ.LIZ(05Q);
                                05G2.mListAnchors[n24].LIZ.LIZ(05Q);
                                final float n38 = n37 + (n36 + 05G2.mListAnchors[n24].LIZIZ());
                                if (05G3 == null) {
                                    break;
                                }
                                n34 = n38;
                                if (05G3.mVisibility != 8) {
                                    n34 = n38 + n30;
                                }
                                05G2 = 05G3;
                            } while (05G2 != null);
                        }
                    }
                    else {
                        float n39 = lj2 + (n28 - n26) * liz.getBiasPercent(n);
                        while (liz != null) {
                            if (05Q.LJII != null) {
                                final 05R ljii4 = 05Q.LJII;
                                --ljii4.LJJIII;
                                final 05R ljii5 = 05Q.LJII;
                                ++ljii5.LJIJ;
                                final 05R ljii6 = 05Q.LJII;
                                ++ljii6.LJJI;
                            }
                            final 05G 05G4 = liz.mNextChainWidget[n];
                            if (05G4 == null && liz != lizj) {
                                break;
                            }
                            int n40;
                            if (n == 0) {
                                n40 = liz.getWidth();
                            }
                            else {
                                n40 = liz.getHeight();
                            }
                            final float n41 = (float)n40;
                            final float n42 = n39 + liz.mListAnchors[n2].LIZIZ();
                            liz.mListAnchors[n2].LIZ.LIZ(liz2.LIZLLL, n42);
                            final 13o liz4 = liz.mListAnchors[n24].LIZ;
                            final 13o lizlll3 = liz2.LIZLLL;
                            final float n43 = n42 + n41;
                            liz4.LIZ(lizlll3, n43);
                            liz.mListAnchors[n2].LIZ.LIZ(05Q);
                            liz.mListAnchors[n24].LIZ.LIZ(05Q);
                            n39 = n43 + liz.mListAnchors[n24].LIZIZ();
                            liz = 05G4;
                        }
                    }
                    return true;
                }
                if (05G.mParent != null && 05G.mParent.mListDimensionBehaviors[n] == X.05G.a.WRAP_CONTENT) {
                    return false;
                }
                final float n44 = n28 + n16 - n15;
                do {
                    if (05Q.LJII != null) {
                        final 05R ljii7 = 05Q.LJII;
                        --ljii7.LJJIII;
                        final 05R ljii8 = 05Q.LJII;
                        ++ljii8.LJIJ;
                        final 05R ljii9 = 05Q.LJII;
                        ++ljii9.LJJI;
                    }
                    final 05G 05G5 = liz.mNextChainWidget[n];
                    if (05G5 == null && liz != lizj) {
                        break;
                    }
                    float n45 = n44 / n13;
                    if (ljiij > 0.0f) {
                        if (liz.mWeight[n] == -1.0f) {
                            n45 = 0.0f;
                        }
                        else {
                            n45 = liz.mWeight[n] * n44 / ljiij;
                        }
                    }
                    if (liz.mVisibility == 8) {
                        n45 = 0.0f;
                    }
                    final float n46 = lj2 + liz.mListAnchors[n2].LIZIZ();
                    liz.mListAnchors[n2].LIZ.LIZ(liz2.LIZLLL, n46);
                    final 13o liz5 = liz.mListAnchors[n24].LIZ;
                    final 13o lizlll4 = liz2.LIZLLL;
                    final float n47 = n46 + n45;
                    liz5.LIZ(lizlll4, n47);
                    liz.mListAnchors[n2].LIZ.LIZ(05Q);
                    liz.mListAnchors[n24].LIZ.LIZ(05Q);
                    lj2 = n47 + liz.mListAnchors[n24].LIZIZ();
                    liz = 05G5;
                } while (liz != null);
                return true;
            }
            final boolean b = false;
            final int n8 = n5;
            final int n7 = n6;
            continue;
        }
    }
}
