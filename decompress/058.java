// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.ArrayList;
import com.bytedance.covode.number.Covode;

public final class 058
{
    static {
        Covode.recordClassIndex(599);
    }
    
    public static void LIZ(final 1fh 1fh, final 05Q 05Q, final int n) {
        059[] array;
        int n3;
        if (n == 0) {
            final int n2 = 1fh.LJI;
            array = 1fh.LJIIIZ;
            n3 = 0;
        }
        else {
            final int n2 = 1fh.LJII;
            array = 1fh.LJIIIIZZ;
            n3 = 2;
        }
        for (final 059 059 : array) {
            if (!059.LJIILJJIL) {
                059.LIZ();
            }
            059.LJIILJJIL = true;
            Label_1631: {
                if (!1fh.LIZ(4) || !05J.LIZ(05Q, n, n3, 059)) {
                    final 05G liz = 059.LIZ;
                    final 05G lizj = 059.LIZJ;
                    final 05G liziz = 059.LIZIZ;
                    final 05G lizlll = 059.LIZLLL;
                    final 05G lj = 059.LJ;
                    final float ljiij = 059.LJIIJ;
                    boolean b;
                    if (1fh.mListDimensionBehaviors[n] == 05G.a.WRAP_CONTENT) {
                        b = true;
                    }
                    else {
                        b = false;
                    }
                    05G 05G;
                    int n8;
                    int n9;
                    int n10;
                    int n11;
                    if (n == 0) {
                        int n4;
                        if (lj.mHorizontalChainStyle == 0) {
                            n4 = 1;
                        }
                        else {
                            n4 = 0;
                        }
                        int n5;
                        if (lj.mHorizontalChainStyle == 1) {
                            n5 = 1;
                        }
                        else {
                            n5 = 0;
                        }
                        int n6;
                        if (lj.mHorizontalChainStyle == 2) {
                            n6 = 1;
                        }
                        else {
                            n6 = 0;
                        }
                        final int n7 = 0;
                        05G = liz;
                        n8 = n5;
                        n9 = n4;
                        n10 = n6;
                        n11 = n7;
                    }
                    else {
                        int n12;
                        if (lj.mVerticalChainStyle == 0) {
                            n12 = 1;
                        }
                        else {
                            n12 = 0;
                        }
                        int n13;
                        if (lj.mVerticalChainStyle == 1) {
                            n13 = 1;
                        }
                        else {
                            n13 = 0;
                        }
                        int n14;
                        if (lj.mVerticalChainStyle == 2) {
                            n14 = 1;
                        }
                        else {
                            n14 = 0;
                        }
                        05G = liz;
                        n11 = 0;
                        n10 = n14;
                        n9 = n12;
                        n8 = n13;
                    }
                    05V 05V;
                    while (true) {
                        05V = null;
                        if (n11 != 0) {
                            break;
                        }
                        final 05D 05D = 05G.mListAnchors[n3];
                        int n15;
                        if (b || n10 != 0) {
                            n15 = 1;
                        }
                        else {
                            n15 = 4;
                        }
                        int liziz2;
                        final int n16 = liziz2 = 05D.LIZIZ();
                        if (05D.LIZLLL != null) {
                            liziz2 = n16;
                            if (05G != liz) {
                                liziz2 = n16 + 05D.LIZLLL.LIZIZ();
                            }
                        }
                        int n17;
                        if (n10 != 0 && 05G != liz && 05G != liziz) {
                            n17 = 6;
                        }
                        else {
                            n17 = n15;
                            if (n9 != 0) {
                                n17 = n15;
                                if (b) {
                                    n17 = 4;
                                }
                            }
                        }
                        if (05D.LIZLLL != null) {
                            if (05G == liziz) {
                                05Q.LIZ(05D.LJIIIIZZ, 05D.LIZLLL.LJIIIIZZ, liziz2, 5);
                            }
                            else {
                                05Q.LIZ(05D.LJIIIIZZ, 05D.LIZLLL.LJIIIIZZ, liziz2, 6);
                            }
                            05Q.LIZJ(05D.LJIIIIZZ, 05D.LIZLLL.LJIIIIZZ, liziz2, n17);
                        }
                        if (b) {
                            if (05G.mVisibility != 8 && 05G.mListDimensionBehaviors[n] == X.05G.a.MATCH_CONSTRAINT) {
                                05Q.LIZ(05G.mListAnchors[n3 + 1].LJIIIIZZ, 05G.mListAnchors[n3].LJIIIIZZ, 0, 5);
                            }
                            05Q.LIZ(05G.mListAnchors[n3].LJIIIIZZ, 1fh.mListAnchors[n3].LJIIIIZZ, 0, 6);
                        }
                        final 05D lizlll2 = 05G.mListAnchors[n3 + 1].LIZLLL;
                        if (lizlll2 != null) {
                            final 05G liziz3 = lizlll2.LIZIZ;
                            if (liziz3.mListAnchors[n3].LIZLLL != null && liziz3.mListAnchors[n3].LIZLLL.LIZIZ == 05G) {
                                05G = liziz3;
                                continue;
                            }
                        }
                        n11 = 1;
                    }
                    if (lizlll != null) {
                        final 05D[] mListAnchors = lizj.mListAnchors;
                        final int n18 = n3 + 1;
                        if (mListAnchors[n18].LIZLLL != null) {
                            final 05D 05D2 = lizlll.mListAnchors[n18];
                            05Q.LIZIZ(05D2.LJIIIIZZ, lizj.mListAnchors[n18].LIZLLL.LJIIIIZZ, -05D2.LIZIZ(), 5);
                        }
                    }
                    if (b) {
                        final 05D[] mListAnchors2 = 1fh.mListAnchors;
                        final int n19 = n3 + 1;
                        05Q.LIZ(mListAnchors2[n19].LJIIIIZZ, lizj.mListAnchors[n19].LJIIIIZZ, lizj.mListAnchors[n19].LIZIZ(), 6);
                    }
                    final ArrayList<05G> ljii = 059.LJII;
                    if (ljii != null) {
                        final int size = ljii.size();
                        if (size > 1) {
                            float n20 = ljiij;
                            if (059.LJIIJJI) {
                                n20 = ljiij;
                                if (!059.LJIILIIL) {
                                    n20 = (float)059.LJIIIZ;
                                }
                            }
                            05G 05G2 = null;
                            int j = 0;
                            float n21 = 0.0f;
                        Label_0824_Outer:
                            while (j < size) {
                                final 05G 05G3 = ljii.get(j);
                                final float n22 = 05G3.mWeight[n];
                                while (true) {
                                    float n23 = 0.0f;
                                    Label_0879: {
                                        if (n22 < 0.0f) {
                                            if (!059.LJIILIIL) {
                                                n23 = 1.0f;
                                                break Label_0879;
                                            }
                                            05Q.LIZJ(05G3.mListAnchors[n3 + 1].LJIIIIZZ, 05G3.mListAnchors[n3].LJIIIIZZ, 0, 4);
                                        }
                                        else {
                                            n23 = n22;
                                            if (n22 != 0.0f) {
                                                break Label_0879;
                                            }
                                            05Q.LIZJ(05G3.mListAnchors[n3 + 1].LJIIIIZZ, 05G3.mListAnchors[n3].LJIIIIZZ, 0, 6);
                                        }
                                        ++j;
                                        continue Label_0824_Outer;
                                    }
                                    if (05G2 != null) {
                                        final 05V ljiiiizz = 05G2.mListAnchors[n3].LJIIIIZZ;
                                        final 05D[] mListAnchors3 = 05G2.mListAnchors;
                                        final int n24 = n3 + 1;
                                        final 05V ljiiiizz2 = mListAnchors3[n24].LJIIIIZZ;
                                        final 05V ljiiiizz3 = 05G3.mListAnchors[n3].LJIIIIZZ;
                                        final 05V ljiiiizz4 = 05G3.mListAnchors[n24].LJIIIIZZ;
                                        final 13r liziz4 = 05Q.LIZIZ();
                                        liziz4.LIZIZ = 0.0f;
                                        if (n20 == 0.0f || n21 == n23) {
                                            liziz4.LIZJ.LIZ(ljiiiizz, 1.0f);
                                            liziz4.LIZJ.LIZ(ljiiiizz2, -1.0f);
                                            liziz4.LIZJ.LIZ(ljiiiizz4, 1.0f);
                                            liziz4.LIZJ.LIZ(ljiiiizz3, -1.0f);
                                        }
                                        else if (n21 == 0.0f) {
                                            liziz4.LIZJ.LIZ(ljiiiizz, 1.0f);
                                            liziz4.LIZJ.LIZ(ljiiiizz2, -1.0f);
                                        }
                                        else {
                                            final float n25 = n21 / n20 / (n23 / n20);
                                            liziz4.LIZJ.LIZ(ljiiiizz, 1.0f);
                                            liziz4.LIZJ.LIZ(ljiiiizz2, -1.0f);
                                            liziz4.LIZJ.LIZ(ljiiiizz4, n25);
                                            liziz4.LIZJ.LIZ(ljiiiizz3, -n25);
                                        }
                                        05Q.LIZ(liziz4);
                                    }
                                    05G2 = 05G3;
                                    n21 = n23;
                                    continue;
                                }
                            }
                        }
                    }
                    Label_1444: {
                        Label_1429: {
                            if (liziz != null && (liziz == lizlll || n10 != 0)) {
                                05D 05D3 = liz.mListAnchors[n3];
                                final 05D[] mListAnchors4 = lizj.mListAnchors;
                                final int n26 = n3 + 1;
                                05D 05D4 = mListAnchors4[n26];
                                05V ljiiiizz5;
                                if (liz.mListAnchors[n3].LIZLLL != null) {
                                    ljiiiizz5 = liz.mListAnchors[n3].LIZLLL.LJIIIIZZ;
                                }
                                else {
                                    ljiiiizz5 = null;
                                }
                                05V ljiiiizz6;
                                if (lizj.mListAnchors[n26].LIZLLL != null) {
                                    ljiiiizz6 = lizj.mListAnchors[n26].LIZLLL.LJIIIIZZ;
                                }
                                else {
                                    ljiiiizz6 = null;
                                }
                                if (liziz == lizlll) {
                                    05D3 = liziz.mListAnchors[n3];
                                    05D4 = liziz.mListAnchors[n26];
                                }
                                if (ljiiiizz5 != null && ljiiiizz6 != null) {
                                    float n27;
                                    if (n == 0) {
                                        n27 = lj.mHorizontalBiasPercent;
                                    }
                                    else {
                                        n27 = lj.mVerticalBiasPercent;
                                    }
                                    05Q.LIZ(05D3.LJIIIIZZ, ljiiiizz5, 05D3.LIZIZ(), n27, ljiiiizz6, 05D4.LJIIIIZZ, 05D4.LIZIZ(), 5);
                                }
                            }
                            else if (n9 != 0 && liziz != null) {
                                int n28;
                                if (059.LJIIIZ > 0 && 059.LJIIIIZZ == 059.LJIIIZ) {
                                    n28 = 1;
                                }
                                else {
                                    n28 = 0;
                                }
                                05G 05G5;
                                05G 05G4 = 05G5 = liziz;
                            Label_2009_Outer:
                                while (true) {
                                    05G 05G6 = 05G4.mNextChainWidget[n];
                                    while (true) {
                                        while (true) {
                                            while (05G6 != null) {
                                                if (05G6.mVisibility == 8) {
                                                    05G6 = 05G6.mNextChainWidget[n];
                                                }
                                                else {
                                                    final 05D 05D5 = 05G4.mListAnchors[n3];
                                                    final 05V ljiiiizz7 = 05D5.LJIIIIZZ;
                                                    05V ljiiiizz8;
                                                    if (05D5.LIZLLL != null) {
                                                        ljiiiizz8 = 05D5.LIZLLL.LJIIIIZZ;
                                                    }
                                                    else {
                                                        ljiiiizz8 = null;
                                                    }
                                                    05V 05V2;
                                                    if (05G5 != 05G4) {
                                                        05V2 = 05G5.mListAnchors[n3 + 1].LJIIIIZZ;
                                                    }
                                                    else {
                                                        05V2 = ljiiiizz8;
                                                        if (05G4 == liziz) {
                                                            05V2 = ljiiiizz8;
                                                            if (05G5 == 05G4) {
                                                                if (liz.mListAnchors[n3].LIZLLL != null) {
                                                                    05V2 = liz.mListAnchors[n3].LIZLLL.LJIIIIZZ;
                                                                }
                                                                else {
                                                                    05V2 = null;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    final int liziz5 = 05D5.LIZIZ();
                                                    final 05D[] mListAnchors5 = 05G4.mListAnchors;
                                                    final int n29 = n3 + 1;
                                                    final int liziz6 = mListAnchors5[n29].LIZIZ();
                                                    05D lizlll3;
                                                    05V 05V3;
                                                    if (05G6 != null) {
                                                        lizlll3 = 05G6.mListAnchors[n3];
                                                        05V3 = lizlll3.LJIIIIZZ;
                                                    }
                                                    else {
                                                        lizlll3 = lizj.mListAnchors[n29].LIZLLL;
                                                        if (lizlll3 != null) {
                                                            05V3 = lizlll3.LJIIIIZZ;
                                                        }
                                                        else {
                                                            05V3 = null;
                                                        }
                                                    }
                                                    final 05V ljiiiizz9 = 05G4.mListAnchors[n29].LJIIIIZZ;
                                                    int liziz7 = liziz6;
                                                    if (lizlll3 != null) {
                                                        liziz7 = liziz6 + lizlll3.LIZIZ();
                                                    }
                                                    int liziz8 = liziz5 + 05G5.mListAnchors[n29].LIZIZ();
                                                    if (ljiiiizz7 != null && 05V2 != null && 05V3 != null && ljiiiizz9 != null) {
                                                        if (05G4 == liziz) {
                                                            liziz8 = liziz.mListAnchors[n3].LIZIZ();
                                                        }
                                                        if (05G4 == lizlll) {
                                                            liziz7 = lizlll.mListAnchors[n29].LIZIZ();
                                                        }
                                                        int n30;
                                                        if (n28 != 0) {
                                                            n30 = 6;
                                                        }
                                                        else {
                                                            n30 = 4;
                                                        }
                                                        05Q.LIZ(ljiiiizz7, 05V2, liziz8, 0.5f, 05V3, ljiiiizz9, liziz7, n30);
                                                    }
                                                    if (05G4.mVisibility != 8) {
                                                        05G5 = 05G4;
                                                    }
                                                    05G4 = 05G6;
                                                    if (05G4 != null) {
                                                        continue Label_2009_Outer;
                                                    }
                                                    break Label_1444;
                                                }
                                            }
                                            if (05G4 == lizlll) {
                                                continue Label_2009_Outer;
                                            }
                                            break;
                                        }
                                        continue;
                                    }
                                }
                            }
                            else if (n8 != 0 && liziz != null) {
                                int n31;
                                if (059.LJIIIZ > 0 && 059.LJIIIIZZ == 059.LJIIIZ) {
                                    n31 = 1;
                                }
                                else {
                                    n31 = 0;
                                }
                                05G 05G8;
                                05G 05G7 = 05G8 = liziz;
                                while (true) {
                                    05G 05G9;
                                    for (05G9 = 05G7.mNextChainWidget[n]; 05G9 != null && 05G9.mVisibility == 8; 05G9 = 05G9.mNextChainWidget[n]) {}
                                    05G 05G10 = 05G9;
                                    if (05G7 != liziz) {
                                        05G10 = 05G9;
                                        if (05G7 != lizlll && (05G10 = 05G9) != null) {
                                            05G 05G11;
                                            if ((05G11 = 05G9) == lizlll) {
                                                05G11 = null;
                                            }
                                            final 05D 05D6 = 05G7.mListAnchors[n3];
                                            final 05V ljiiiizz10 = 05D6.LJIIIIZZ;
                                            final 05D[] mListAnchors6 = 05G8.mListAnchors;
                                            final int n32 = n3 + 1;
                                            final 05V ljiiiizz11 = mListAnchors6[n32].LJIIIIZZ;
                                            final int liziz9 = 05D6.LIZIZ();
                                            final int liziz10 = 05G7.mListAnchors[n32].LIZIZ();
                                            05V 05V5 = null;
                                            05V 05V7 = null;
                                            int n33 = 0;
                                            Label_2385: {
                                                05D 05D7;
                                                05V 05V4;
                                                if (05G11 != null) {
                                                    05D7 = 05G11.mListAnchors[n3];
                                                    05V4 = 05D7.LJIIIIZZ;
                                                    if (05D7.LIZLLL != null) {
                                                        05V5 = 05D7.LIZLLL.LJIIIIZZ;
                                                    }
                                                    else {
                                                        05V5 = null;
                                                    }
                                                }
                                                else {
                                                    final 05D lizlll4 = 05G7.mListAnchors[n32].LIZLLL;
                                                    if (lizlll4 != null) {
                                                        05V4 = lizlll4.LJIIIIZZ;
                                                    }
                                                    else {
                                                        05V4 = null;
                                                    }
                                                    final 05V 05V6 = 05V5 = 05G7.mListAnchors[n32].LJIIIIZZ;
                                                    05V7 = 05V4;
                                                    n33 = liziz10;
                                                    if (lizlll4 == null) {
                                                        break Label_2385;
                                                    }
                                                    05V5 = 05V6;
                                                    05D7 = lizlll4;
                                                }
                                                n33 = liziz10 + 05D7.LIZIZ();
                                                05V7 = 05V4;
                                            }
                                            final int liziz11 = 05G8.mListAnchors[n32].LIZIZ();
                                            int n34;
                                            if (n31 != 0) {
                                                n34 = 6;
                                            }
                                            else {
                                                n34 = 4;
                                            }
                                            05G10 = 05G11;
                                            if (ljiiiizz10 != null) {
                                                05G10 = 05G11;
                                                if (ljiiiizz11 != null) {
                                                    05G10 = 05G11;
                                                    if (05V7 != null) {
                                                        05G10 = 05G11;
                                                        if (05V5 != null) {
                                                            05Q.LIZ(ljiiiizz10, ljiiiizz11, liziz9 + liziz11, 0.5f, 05V7, 05V5, n33, n34);
                                                            05G10 = 05G11;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    if (05G7.mVisibility != 8) {
                                        05G8 = 05G7;
                                    }
                                    if (05G10 == null) {
                                        break;
                                    }
                                    05G7 = 05G10;
                                }
                                final 05D 05D8 = liziz.mListAnchors[n3];
                                final 05D lizlll5 = liz.mListAnchors[n3].LIZLLL;
                                final 05D[] mListAnchors7 = lizlll.mListAnchors;
                                final int n35 = n3 + 1;
                                final 05D 05D9 = mListAnchors7[n35];
                                final 05D lizlll6 = lizj.mListAnchors[n35].LIZLLL;
                                Label_2680: {
                                    if (lizlll5 != null) {
                                        if (liziz != lizlll) {
                                            05Q.LIZJ(05D8.LJIIIIZZ, lizlll5.LJIIIIZZ, 05D8.LIZIZ(), 5);
                                        }
                                        else {
                                            if (lizlll6 != null) {
                                                05Q.LIZ(05D8.LJIIIIZZ, lizlll5.LJIIIIZZ, 05D8.LIZIZ(), 0.5f, 05D9.LJIIIIZZ, lizlll6.LJIIIIZZ, 05D9.LIZIZ(), 5);
                                                break Label_2680;
                                            }
                                            break Label_1429;
                                        }
                                    }
                                    if (lizlll6 == null) {
                                        break Label_1429;
                                    }
                                }
                                if (liziz != lizlll) {
                                    05Q.LIZJ(05D9.LJIIIIZZ, lizlll6.LJIIIIZZ, -05D9.LIZIZ(), 5);
                                }
                            }
                        }
                        if ((n9 == 0 && n8 == 0) || liziz == null) {
                            break Label_1631;
                        }
                    }
                    05D 05D10 = liziz.mListAnchors[n3];
                    final 05D[] mListAnchors8 = lizlll.mListAnchors;
                    final int n36 = n3 + 1;
                    05D 05D11 = mListAnchors8[n36];
                    05V ljiiiizz12;
                    if (05D10.LIZLLL != null) {
                        ljiiiizz12 = 05D10.LIZLLL.LJIIIIZZ;
                    }
                    else {
                        ljiiiizz12 = null;
                    }
                    05V 05V8;
                    if (05D11.LIZLLL != null) {
                        05V8 = 05D11.LIZLLL.LJIIIIZZ;
                    }
                    else {
                        05V8 = null;
                    }
                    if (lizj != lizlll) {
                        final 05D 05D12 = lizj.mListAnchors[n36];
                        05V8 = 05V;
                        if (05D12.LIZLLL != null) {
                            05V8 = 05D12.LIZLLL.LJIIIIZZ;
                        }
                    }
                    if (liziz == lizlll) {
                        05D10 = liziz.mListAnchors[n3];
                        05D11 = liziz.mListAnchors[n36];
                    }
                    if (ljiiiizz12 != null && 05V8 != null) {
                        05Q.LIZ(05D10.LJIIIIZZ, ljiiiizz12, 05D10.LIZIZ(), 0.5f, 05V8, 05D11.LJIIIIZZ, lizlll.mListAnchors[n36].LIZIZ(), 5);
                    }
                }
            }
        }
    }
}
