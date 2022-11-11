// 
// Decompiled by Procyon v0.6.0
// 

package ek2;

import java.lang.reflect.Array;

public final class c implements h, f
{
    public static final float[] i;
    public static final int[] j;
    public static final int[] k;
    public static final float[] l;
    public float[][] f;
    public float[][] g;
    public float[][] h;
    
    static {
        i = new float[] { 0.0318305f, 0.11516383f, 0.2181695f, 0.30150282f, 0.33333334f };
        j = new int[] { 1, 0, -1, 0 };
        k = new int[] { 0, 1, 0, -1 };
        l = new float[] { 0.5f, 1.0f, 2.0f, 1.0E10f };
    }
    
    public c() {
        final Class<Float> type = Float.TYPE;
        this.f = (float[][])Array.newInstance(type, 5, 49);
        this.g = (float[][])Array.newInstance(type, 5, 49);
        this.h = (float[][])Array.newInstance(type, 5, 49);
    }
    
    public static int a(final g g, final int n, final int n2, final int n3) {
        if (g.I[n][n2] == 1) {
            if (n2 >= g.V[n] || (g.e0[n][n3] != 0 && g.R0[n])) {
                return g.d0[n][n3];
            }
        }
        else {
            final int p4 = g.p;
            int n4;
            if ((p4 & 0x1) != 0x0) {
                n4 = 1;
            }
            else {
                n4 = 0;
            }
            int i = n3 * 2 - n4;
            int n5;
            if ((p4 & 0x1) != 0x0) {
                n5 = 1;
            }
            else {
                n5 = 0;
            }
            while (i < (n3 + 1) * 2 - n5) {
                if ((n2 >= g.V[n] || (g.e0[n][i] != 0 && g.R0[n])) && g.d0[n][i] == 1) {
                    return 1;
                }
                ++i;
            }
        }
        return 0;
    }
    
    public static void b(final g g, final float[][][] array, final int n) {
        final c c = new c();
        final int n2 = g.V0[n];
        if (n2 == 0) {
            g.V[n] = -1;
        }
        else if (n2 == 2) {
            final int n3 = g.Z0[n];
            if (n3 > 1) {
                g.V[n] = n3 - 1;
            }
            else {
                g.V[n] = -1;
            }
        }
        else {
            final int n4 = g.Z0[n];
            if (n4 == 0) {
                g.V[n] = -1;
            }
            else {
                g.V[n] = g.D[n] + 1 - n4;
            }
        }
        if (g.N0) {
            int n6;
            for (int i = 0; i < g.D[n]; i = n6) {
                final int[] array2 = g.G[n];
                final int n5 = array2[i];
                n6 = i + 1;
                final int n7 = array2[n6];
                float n8;
                if ((n8 = (float)(n7 - n5)) == 0.0f) {
                    n8 = 1.0f;
                }
                for (int j = 0; j < g.n; ++j) {
                    int k = g.A0 + n5;
                    float n9 = 0.0f;
                    while (k < g.A0 + n7) {
                        final float[] array3 = array[k][g.m + j];
                        final float n10 = array3[0];
                        final float n11 = array3[1];
                        n9 += n11 * n11 + n10 * n10;
                        ++k;
                    }
                    g.Q[n][j][i] = n9 / n8;
                }
            }
        }
        else {
            for (int l = 0; l < g.D[n]; ++l) {
                int n12 = 0;
                while (true) {
                    final int[] t = g.t;
                    final int n13 = g.I[n][l];
                    if (n12 >= t[n13]) {
                        break;
                    }
                    final int[] array4 = g.v[n13];
                    final int n14 = array4[n12];
                    final int n15 = n12 + 1;
                    final int n16 = array4[n15];
                    int n17 = n14;
                    while (true) {
                        n12 = n15;
                        if (n17 >= n16) {
                            break;
                        }
                        final int[] array5 = g.G[n];
                        final int n18 = array5[l];
                        final int n19 = array5[l + 1];
                        float n20;
                        if ((n20 = (float)((n16 - n14) * (n19 - n18))) == 0.0f) {
                            n20 = 1.0f;
                        }
                        int n21 = n18 + g.A0;
                        float n22 = 0.0f;
                        while (n21 < g.A0 + n19) {
                            for (int n23 = n14; n23 < n16; ++n23) {
                                final float[] array6 = array[n21][n23];
                                final float n24 = array6[0];
                                final float n25 = array6[1];
                                n22 += n25 * n25 + n24 * n24;
                            }
                            ++n21;
                        }
                        g.Q[n][n17 - g.m][l] = n22 / n20;
                        ++n17;
                    }
                }
            }
        }
        final float[] array7 = new float[49];
        final float[] array8 = new float[49];
        final float[] array9 = new float[49];
        int n27;
        int n38;
        for (int n26 = n27 = 0; n26 < g.D[n]; n26 = n38) {
            float n28;
            if (n26 != g.V[n] && n26 != g.n0[n]) {
                n28 = 1.0f;
            }
            else {
                n28 = 0.0f;
            }
            final int a = a(g, n, n26, 0);
            final int[] array10 = g.G[n];
            final int n29 = n26 + 1;
            final int n30 = array10[n29];
            final int[] array11 = g.H[n];
            final int n31 = n27 + 1;
            if (n30 > array11[n31]) {
                n27 = n31;
            }
            int n32 = 0;
            final int n34;
            int n33 = n34 = n32;
            int n36;
            int n35 = n36 = n34;
            int n37 = n34;
            n38 = n29;
            int n39 = a;
            while (true) {
                final int[] s = g.s;
                final int l2 = g.L0;
                if (n32 >= s[l2]) {
                    break;
                }
                final int[] array12 = g.x[l2];
                final int n40 = array12[n32];
                ++n32;
                final int n41 = array12[n32];
                final int n42 = n40;
                float n43 = 0.0f;
                float n44 = 0.0f;
                final int n45 = n39;
                int n46 = n40;
                for (int n47 = n42; n47 < n41; ++n47) {
                    final int m = g.m;
                    final int[] array13 = g.v[g.I[n][n26]];
                    final int n48 = n33 + 1;
                    if (m + n47 == array13[n48]) {
                        n33 = n48;
                    }
                    n43 += g.P[n][n33][n26];
                    n44 += g.Q[n][n47][n26];
                }
                final float n49 = n43 + 1.0E-12f;
                final float min = Math.min(n49 / (n44 + 1.0E-12f) * ek2.c.l[g.M0], 1.0E10f);
                int n50 = n46;
                final int n51 = n45;
                float n52 = 0.0f;
                int n53 = n37;
                final int n54 = n38;
                int a2 = n51;
                int n55;
                for (n55 = n41; n50 < n55; ++n50) {
                    final int n56 = g.m + n50;
                    final int[] w = g.w;
                    final int n57 = n53 + 1;
                    if (n56 == w[n57]) {
                        n53 = n57;
                    }
                    final int[] array14 = g.v[g.I[n][n26]];
                    final int n58 = n36 + 1;
                    if (n56 == array14[n58]) {
                        a2 = a(g, n, n26, n58);
                        n36 = n58;
                    }
                    final int n59 = g.m + n50;
                    final int[] array15 = g.v[1];
                    final int n60 = n35 + 1;
                    if (n59 == array15[n60]) {
                        n35 = n60;
                    }
                    final int n61 = g.V[n];
                    int n62;
                    if ((n26 >= n61 || (g.e0[n][n35] != 0 && g.R0[n])) && n59 == array15[n35 + 1] + array15[n35] >> 1) {
                        n62 = g.d0[n][n35];
                    }
                    else {
                        n62 = 0;
                    }
                    final float n63 = g.S[n][n53][n27];
                    final float n64 = g.T[n][n53][n27];
                    final float[] array16 = g.P[n][n36];
                    final float n65 = array16[n26];
                    final float n66 = n65 * n64;
                    float n67;
                    if (n62 == 0) {
                        array9[n50] = 0.0f;
                        n67 = n52;
                    }
                    else {
                        final float n68 = n65 * n63;
                        array9[n50] = n68;
                        n67 = n52 + n68;
                    }
                    final float n69 = array16[n26];
                    final float[] array17 = g.Q[n][n50];
                    final float n70 = n69 / (array17[n26] + 1.0f);
                    float n71;
                    if (a2 == 0 && n28 == 1.0f) {
                        n71 = n70 * n63;
                    }
                    else {
                        n71 = n70;
                        if (a2 == 1) {
                            n71 = n70 * n64;
                        }
                    }
                    if (min > n71) {
                        array7[n50] = n66;
                        array8[n50] = n71;
                    }
                    else {
                        array7[n50] = n66 * min / n71;
                        array8[n50] = min;
                    }
                    final float n72 = n52 = array17[n26] * array8[n50] + n67;
                    if (n62 == 0) {
                        n52 = n72;
                        if (n26 != n61) {
                            n52 = n72 + array7[n50];
                        }
                    }
                }
                final float min2 = Math.min(n49 / (n52 + 1.0E-12f), 2.5118864f);
                while (n46 < n55) {
                    c.f[n26][n46] = (float)Math.sqrt(array8[n46] * min2);
                    c.g[n26][n46] = (float)Math.sqrt(array7[n46] * min2);
                    final float n73 = array9[n46];
                    if (n73 != 0.0f) {
                        c.h[n26][n46] = (float)Math.sqrt(n73 * min2);
                    }
                    else {
                        c.h[n26][n46] = 0.0f;
                    }
                    ++n46;
                }
                n39 = a2;
                n38 = n54;
                n37 = n53;
            }
        }
        int n74;
        int n75;
        if (g.r0) {
            n74 = 0;
            n75 = 1;
        }
        else {
            n74 = g.f0[n];
            n75 = 0;
        }
        int n76 = g.g0[n];
        int n77 = 0;
        int n78 = n75;
        int n79 = n74;
        while (n77 < g.D[n]) {
            final boolean b = n77 == g.V[n] || n77 == g.n0[n];
            int n80;
            if (g.O0) {
                n80 = 0;
            }
            else {
                n80 = 4;
            }
            int n81 = n80;
            if (b) {
                n81 = 0;
            }
            int n82;
            if ((n82 = n78) != 0) {
                for (int n83 = 0; n83 < 4; ++n83) {
                    System.arraycopy(c.f[n77], 0, g.K[n][n83], 0, g.n);
                    System.arraycopy(c.g[n77], 0, g.L[n][n83], 0, g.n);
                }
                g.M[n] = 4;
                n82 = 0;
            }
            int n84 = g.G[n][n77];
            int n85 = n79;
            int n86;
            while (true) {
                final int[] array18 = g.G[n];
                n86 = n77 + 1;
                if (n84 >= array18[n86]) {
                    break;
                }
                System.arraycopy(c.f[n77], 0, g.K[n][g.M[n]], 0, g.n);
                System.arraycopy(c.g[n77], 0, g.L[n][g.M[n]], 0, g.n);
                for (int n87 = 0; n87 < g.n; ++n87) {
                    float n92;
                    float n93;
                    if (n81 != 0) {
                        int n88 = g.M[n];
                        int n89 = 0;
                        float n90 = 0.0f;
                        float n91 = 0.0f;
                        while (true) {
                            n92 = n90;
                            n93 = n91;
                            if (n89 > 4) {
                                break;
                            }
                            final float n94 = ek2.c.i[n89];
                            final int n95 = n88 + 1;
                            if ((n88 = n95) >= 5) {
                                n88 = n95 - 5;
                            }
                            n91 += g.K[n][n88][n87] * n94;
                            n90 += g.L[n][n88][n87] * n94;
                            ++n89;
                        }
                    }
                    else {
                        final float[][] array19 = g.K[n];
                        final int n96 = g.M[n];
                        n93 = array19[n96][n87];
                        n92 = g.L[n][n96][n87];
                    }
                    final float[] array20 = c.h[n77];
                    if (array20[n87] != 0.0f || b) {
                        n92 = 0.0f;
                    }
                    n85 = (n85 + 1 & 0x1FF);
                    final float[][] array21 = array[g.A0 + n84];
                    final int n97 = g.m + n87;
                    final float[] array22 = array21[n97];
                    final float n98 = array22[0];
                    final float[] array23 = f.F3[n85];
                    array22[0] = array23[0] * n92 + n98 * n93;
                    if (g.S0 == 3 && g.T0 == 42) {
                        array22[0] = 1.642832E7f;
                    }
                    final float n99 = n92 * array23[1] + n93 * array22[1];
                    array22[1] = n99;
                    int n100;
                    if ((n97 & 0x1) != 0x0) {
                        n100 = -1;
                    }
                    else {
                        n100 = 1;
                    }
                    array22[0] += array20[n87] * ek2.c.j[n76];
                    array22[1] = n100 * array20[n87] * ek2.c.k[n76] + n99;
                }
                n76 = (n76 + 1 & 0x3);
                final int[] m2 = g.M;
                if (++m2[n] >= 5) {
                    m2[n] = 0;
                }
                ++n84;
            }
            n77 = n86;
            n79 = n85;
            n78 = n82;
        }
        g.f0[n] = n79;
        g.g0[n] = n76;
    }
}
