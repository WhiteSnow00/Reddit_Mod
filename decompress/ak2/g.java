// 
// Decompiled by Procyon v0.6.0
// 

package ak2;

import zj2.c;
import zj2.d;
import java.util.Arrays;
import ah0.b;
import net.sourceforge.jaad.aac.AACException;
import java.lang.reflect.Array;
import vj2.f;
import zj2.a;

public final class g implements h, e
{
    public int[] A;
    public int A0;
    public int[] B;
    public a B0;
    public int[] C;
    public boolean C0;
    public int[] D;
    public boolean D0;
    public int[] E;
    public boolean E0;
    public int[] F;
    public int F0;
    public int[][] G;
    public int G0;
    public int[][] H;
    public int H0;
    public int[][] I;
    public int I0;
    public int[] J;
    public boolean J0;
    public float[][][] K;
    public int K0;
    public float[][][] L;
    public int L0;
    public int[] M;
    public int M0;
    public int[][][] N;
    public boolean N0;
    public int[][] O;
    public boolean O0;
    public float[][][] P;
    public int P0;
    public float[][][] Q;
    public boolean[] Q0;
    public int[][][] R;
    public boolean[] R0;
    public float[][][] S;
    public int S0;
    public float[][][] T;
    public int T0;
    public int[][] U;
    public boolean U0;
    public int[] V;
    public int[] V0;
    public int[][] W;
    public int[][] W0;
    public int[][] X;
    public int[][] X0;
    public float[][] Y;
    public int[][] Y0;
    public float[][] Z;
    public int[] Z0;
    public int a0;
    public int[] a1;
    public int[] b0;
    public int[] b1;
    public int[] c0;
    public int[][] c1;
    public int[][] d0;
    public int[][] d1;
    public int[][] e0;
    public final boolean f;
    public int[] f0;
    public final f g;
    public int[] g0;
    public int h;
    public int h0;
    public boolean i;
    public int i0;
    public int j;
    public int j0;
    public boolean[] k;
    public int k0;
    public int l;
    public boolean l0;
    public int m;
    public int m0;
    public int n;
    public int[] n0;
    public int o;
    public int o0;
    public int p;
    public int p0;
    public int q;
    public int q0;
    public int r;
    public boolean r0;
    public int[] s;
    public int s0;
    public int[] t;
    public boolean t0;
    public int[] u;
    public ak2.a[] u0;
    public int[][] v;
    public ak2.a[] v0;
    public int[] w;
    public float[][][][] w0;
    public int[][] x;
    public int x0;
    public int[] y;
    public int y0;
    public int[] z;
    public int z0;
    
    public g(final boolean b, final boolean t0, final f g, final boolean f) {
        this.k = new boolean[2];
        this.s = new int[4];
        this.t = new int[2];
        int n = 64;
        this.u = new int[64];
        final Class<Integer> type = Integer.TYPE;
        this.v = (int[][])Array.newInstance(type, 2, 64);
        this.w = new int[64];
        this.x = (int[][])Array.newInstance(type, 4, 64);
        this.y = new int[64];
        this.z = new int[2];
        this.A = new int[2];
        this.B = new int[2];
        this.C = new int[2];
        this.D = new int[2];
        this.E = new int[2];
        this.F = new int[2];
        this.G = (int[][])Array.newInstance(type, 2, 6);
        this.H = (int[][])Array.newInstance(type, 2, 3);
        this.I = (int[][])Array.newInstance(type, 2, 6);
        this.J = new int[2];
        final Class<Float> type2 = Float.TYPE;
        this.K = (float[][][])Array.newInstance(type2, 2, 5, 64);
        this.L = (float[][][])Array.newInstance(type2, 2, 5, 64);
        this.M = new int[2];
        this.N = (int[][][])Array.newInstance(type, 2, 64, 5);
        this.O = (int[][])Array.newInstance(type, 2, 64);
        this.P = (float[][][])Array.newInstance(type2, 2, 64, 5);
        this.Q = (float[][][])Array.newInstance(type2, 2, 64, 5);
        this.R = (int[][][])Array.newInstance(type, 2, 64, 2);
        this.S = (float[][][])Array.newInstance(type2, 2, 64, 2);
        this.T = (float[][][])Array.newInstance(type2, 2, 64, 2);
        this.U = (int[][])Array.newInstance(type, 2, 64);
        this.V = new int[2];
        this.W = (int[][])Array.newInstance(type, 2, 5);
        this.X = (int[][])Array.newInstance(type, 2, 5);
        this.Y = (float[][])Array.newInstance(type2, 2, 64);
        this.Z = (float[][])Array.newInstance(type2, 2, 64);
        this.b0 = new int[64];
        this.c0 = new int[64];
        this.d0 = (int[][])Array.newInstance(type, 2, 64);
        this.e0 = (int[][])Array.newInstance(type, 2, 64);
        this.f0 = new int[2];
        this.g0 = new int[2];
        this.n0 = new int[2];
        this.u0 = new ak2.a[2];
        this.v0 = new ak2.a[2];
        this.w0 = (float[][][][])Array.newInstance(type2, 2, 40, 64, 2);
        this.Q0 = new boolean[2];
        this.R0 = new boolean[2];
        this.V0 = new int[2];
        this.W0 = (int[][])Array.newInstance(type, 2, 9);
        this.X0 = (int[][])Array.newInstance(type, 2, 9);
        this.Y0 = (int[][])Array.newInstance(type, 2, 9);
        this.Z0 = new int[2];
        this.a1 = new int[2];
        this.b1 = new int[2];
        this.c1 = (int[][])Array.newInstance(type, 2, 9);
        this.d1 = (int[][])Array.newInstance(type, 2, 3);
        this.f = f;
        this.t0 = t0;
        this.g = g;
        this.I0 = 2;
        this.J0 = true;
        this.K0 = 2;
        this.L0 = 2;
        this.M0 = 2;
        this.N0 = true;
        this.O0 = true;
        this.F0 = 5;
        this.E0 = true;
        this.P0 = 1;
        final int[] n2 = this.n0;
        n2[1] = (n2[0] = -1);
        this.s0 = 0;
        this.r0 = true;
        this.z0 = 8;
        this.A0 = 2;
        this.p0 = 0;
        this.q0 = 0;
        this.h0 = -1;
        if (b) {
            this.x0 = 30;
            this.y0 = 15;
        }
        else {
            this.x0 = 32;
            this.y0 = 16;
        }
        final int[] m = this.M;
        m[1] = (m[0] = 0);
        if (t0) {
            final ak2.a[] u0 = this.u0;
            u0[0] = new ak2.a();
            u0[1] = new ak2.a();
            final ak2.a[] v0 = this.v0;
            int n3;
            if (f) {
                n3 = 32;
            }
            else {
                n3 = 64;
            }
            v0[0] = new ak2.a(n3);
            final ak2.a[] v2 = this.v0;
            if (f) {
                n = 32;
            }
            v2[1] = new ak2.a(n);
        }
        else {
            this.u0[0] = new ak2.a();
            final ak2.a[] v3 = this.v0;
            if (f) {
                n = 32;
            }
            v3[0] = new ak2.a(n);
            this.v0[1] = null;
        }
    }
    
    public static int c(final bk2.a a, final int[][] array) throws AACException {
        int i;
        for (i = 0; i >= 0; i = array[i][a.b()]) {}
        return i + 64;
    }
    
    public static int i(final int n) {
        if (n < 10 && n >= 0) {
            return (new int[] { 0, 0, 1, 2, 2, 3, 3, 3, 3, 4 })[n];
        }
        return 0;
    }
    
    public final void a(final float[] array, final float[] array2) {
        final float[][][] array3 = new float[32][64][2];
        if (!this.t0) {
            return;
        }
        final int j = this.j;
        boolean b;
        if (j == 0 && this.s0 != 0) {
            b = false;
        }
        else {
            if (j != 0 && this.r0) {
                this.h0 = -1;
            }
            b = true;
        }
        this.i = false;
        this.k(array, array3, 0, b);
        this.j = j + 0;
        if (this.f) {
            this.v0[0].b(this, array3, array);
        }
        else {
            this.v0[0].c(this, array3, array);
        }
        final int i = this.j;
        this.k(array2, array3, 1, b);
        this.j = i + 0;
        if (this.f) {
            this.v0[1].b(this, array3, array2);
        }
        else {
            this.v0[1].c(this, array3, array2);
        }
        if (this.D0) {
            this.i = false;
        }
        if (this.s0 != 0 && this.j == 0) {
            if (this.m(0) != 0) {
                return;
            }
            if (this.m(1) != 0) {
                return;
            }
        }
        this.l(0);
        this.l(1);
    }
    
    public final int b(int i, final boolean b, int j, int b2, int k, int l) {
        final f g = this.g;
        final int[] j2 = ak2.h.J2;
        final int a = g.a;
        final int n = j2[a];
        final int n2 = ak2.h.K2[a];
        if (b2 != 0) {
            i = ak2.h.L2[n2][i];
        }
        else {
            i = ak2.h.L2[6][i];
        }
        i += n;
        this.l = i;
        if (j == 15) {
            i = Math.min(64, i * 3);
        }
        else if (j == 14) {
            i = Math.min(64, i * 2);
        }
        else {
            i = Math.min(64, b.g[a] + b.h[a][Math.min(j, 13)]);
        }
        b2 = this.g.b;
        j = 1;
        if ((b2 < 48000) ? ((b2 > 32000) ? (i - this.l > 45) : (i - this.l > 48)) : (i - this.l > 32)) {
            b2 = 1;
        }
        else {
            b2 = 0;
        }
        final int n3 = -1;
        if (k == 0) {
            final int m = this.l;
            final int[] array = new int[64];
            Label_0471: {
                if (i <= m) {
                    this.o = 0;
                }
                else {
                    if (b) {
                        j = 2;
                    }
                    else {
                        j = 1;
                    }
                    if (b) {
                        k = i - m + 2 >> 2;
                    }
                    else {
                        k = i - m >> 1;
                    }
                    final int min = Math.min(k << 1, 63);
                    if (min > 0) {
                        final int n4 = i - (min * j + m);
                        for (k = 0; k < min; ++k) {
                            array[k] = j;
                        }
                        if (n4 != 0) {
                            if (n4 > 0) {
                                k = n3;
                            }
                            else {
                                k = 1;
                            }
                            int n5;
                            if (n4 > 0) {
                                j = min - 1;
                                n5 = n4;
                            }
                            else {
                                j = 0;
                                n5 = n4;
                            }
                            while (n5 != 0) {
                                array[j] -= k;
                                j += k;
                                n5 += k;
                            }
                        }
                        this.u[0] = m;
                        int[] u;
                        for (j = 1; j <= min; ++j) {
                            u = this.u;
                            k = j - 1;
                            u[j] = u[k] + array[k];
                        }
                        this.o = min;
                        this.o = Math.min(min, 64);
                        j = 0;
                        break Label_0471;
                    }
                }
                j = 1;
            }
            b2 += j;
        }
        else {
            final int l2 = this.l;
            final int[] array2 = new int[64];
            final int[] array3 = new int[64];
            final int[] array4 = new int[64];
            final int[] array5 = new int[64];
            Label_1106: {
                if (i <= l2) {
                    this.o = 0;
                }
                else {
                    final int n6 = (new int[] { 6, 5, 4 })[k - 1];
                    final float n7 = (float)i;
                    float n8 = (float)l2;
                    if (n7 / n8 > 2.2449) {
                        j = l2 << 1;
                        k = 1;
                    }
                    else {
                        j = i;
                        k = 0;
                    }
                    final int min2 = Math.min(b.f0(0, n6, l2, j) * 2, 63);
                    Label_1016: {
                        if (min2 > 0) {
                            final float n9 = (float)j;
                            final float n10 = (float)Math.pow(n9 / n8, 1.0f / min2);
                            int n11 = (int)(n8 + 0.5f);
                            int n13;
                            for (int n12 = 0; n12 <= min2; ++n12, n11 = n13) {
                                n8 *= n10;
                                n13 = (int)(n8 + 0.5f);
                                array2[n12] = n13 - n11;
                            }
                            Arrays.sort(array2, 0, min2);
                            array4[0] = l2;
                            for (int n14 = 1; n14 <= min2; ++n14) {
                                final int n15 = n14 - 1;
                                array4[n14] = array4[n15] + array2[n15];
                                if (array2[n15] == 0) {
                                    break Label_1016;
                                }
                            }
                            if (k == 0) {
                                for (j = 0; j <= min2; ++j) {
                                    this.u[j] = array4[j];
                                }
                                this.o = min2;
                                this.o = Math.min(min2, 64);
                            }
                            else {
                                final int min3 = Math.min(b.f0(1, n6, j, i) * 2, 63);
                                final float n16 = (float)Math.pow(n7 / n9, 1.0f / min3);
                                int n17 = (int)(n9 + 0.5f);
                                k = 0;
                                float n18 = n9;
                                int n19;
                                while (true) {
                                    n19 = min3 - 1;
                                    if (k > n19) {
                                        break;
                                    }
                                    n18 *= n16;
                                    final int n20 = (int)(n18 + 0.5f);
                                    array3[k] = n20 - n17;
                                    ++k;
                                    n17 = n20;
                                }
                                final int n21 = array3[0];
                                k = min2 - 1;
                                if (n21 < array2[k]) {
                                    Arrays.sort(array3, 0, min3 + 1);
                                    k = array2[k];
                                    final int n22 = array3[0];
                                    array3[0] = k;
                                    array3[n19] -= k - n22;
                                }
                                Arrays.sort(array3, 0, min3);
                                array5[0] = j;
                                for (j = 1; j <= min3; ++j) {
                                    k = j - 1;
                                    array5[j] = array5[k] + array3[k];
                                    if (array3[k] == 0) {
                                        break Label_1016;
                                    }
                                }
                                j = min3 + min2;
                                this.o = j;
                                this.o = Math.min(j, 64);
                                for (j = 0; j <= min2; ++j) {
                                    this.u[j] = array4[j];
                                }
                                for (j = min2 + 1; j <= this.o; ++j) {
                                    this.u[j] = array5[j - min2];
                                }
                            }
                            j = 0;
                            break Label_1106;
                        }
                    }
                    j = 1;
                }
            }
            b2 += j;
        }
        j = this.o;
        Label_1526: {
            if (j > l) {
                j -= l;
                this.p = j;
                k = j >> 1;
                k += j - (k << 1);
                this.q = k;
                final int[] t = this.t;
                t[0] = k;
                t[1] = j;
                j = 0;
                while (true) {
                    k = this.p;
                    if (j > k) {
                        break;
                    }
                    this.v[1][j] = this.u[j + l];
                    ++j;
                }
                final int[] array6 = this.v[1];
                l = array6[k];
                j = array6[0];
                l -= j;
                this.n = l;
                if ((this.m = j) <= 32) {
                    if (j + l <= 64) {
                        if ((k & 0x1) != 0x0) {
                            k = 1;
                        }
                        else {
                            k = 0;
                        }
                        l = 0;
                        j = 0;
                        while (l <= this.q) {
                            if (l == 0) {
                                j = 0;
                            }
                            else {
                                j = l * 2 - k;
                            }
                            final int[][] v = this.v;
                            v[0][l] = v[1][j];
                            ++l;
                        }
                        this.r = 0;
                        k = this.K0;
                        if (k == 0) {
                            this.r = 1;
                        }
                        else {
                            i = Math.max(1, b.f0(0, k, this.m, i));
                            this.r = i;
                            this.r = Math.min(5, i);
                        }
                        i = j;
                        j = 0;
                        while (true) {
                            k = this.r;
                            if (j > k) {
                                break;
                            }
                            if (j == 0) {
                                i = 0;
                            }
                            else {
                                i += (this.q - i) / (k + 1 - j);
                            }
                            this.w[j] = this.v[0][i];
                            ++j;
                        }
                        int[] w;
                        for (i = 0; i < 64; ++i) {
                            for (j = 0; j < this.r; ++j) {
                                w = this.w;
                                if (w[j] <= i && i < w[j + 1]) {
                                    this.y[i] = j;
                                    break;
                                }
                            }
                        }
                        i = 0;
                        break Label_1526;
                    }
                }
            }
            i = 1;
        }
        j = 1;
        if (b2 + i > 0) {
            i = j;
        }
        else {
            i = 0;
        }
        return i;
    }
    
    public final void d(final bk2.a a, final int n) throws AACException {
        for (int i = 0; i < this.r; ++i) {
            this.W[n][i] = a.c(2);
        }
    }
    
    public final void e(final bk2.a a, final int n) throws AACException {
        final int n2 = 0;
        int n3 = 0;
        int i;
        while (true) {
            i = n2;
            if (n3 >= this.D[n]) {
                break;
            }
            this.c1[n][n3] = a.b();
            ++n3;
        }
        while (i < this.F[n]) {
            this.d1[n][i] = a.b();
            ++i;
        }
    }
    
    public final void f(final bk2.a a, final int n) throws AACException {
        if (this.D[n] == 1 && this.V0[n] == 0) {
            this.k[n] = false;
        }
        else {
            this.k[n] = this.E0;
        }
        int[][] array;
        int n2;
        int[][] array3;
        if (this.U0 && n == 1) {
            int[][] array2;
            if (this.k[n]) {
                array = e.E2;
                array2 = e.F2;
            }
            else {
                array = e.A2;
                array2 = e.B2;
            }
            n2 = 1;
            array3 = array2;
        }
        else {
            int[][] array4;
            int[][] array5;
            if (this.k[n]) {
                array4 = e.C2;
                array5 = e.D2;
            }
            else {
                array4 = e.w2;
                array5 = e.z2;
            }
            n2 = 0;
            array3 = array5;
            array = array4;
        }
        for (int i = 0; i < this.D[n]; ++i) {
            if (this.c1[n][i] == 0) {
                if (this.U0 && n == 1) {
                    if (this.k[n]) {
                        this.N[n][0][i] = a.c(5) << n2;
                    }
                    else {
                        this.N[n][0][i] = a.c(6) << n2;
                    }
                }
                else if (this.k[n]) {
                    this.N[n][0][i] = a.c(6) << n2;
                }
                else {
                    this.N[n][0][i] = a.c(7) << n2;
                }
                for (int j = 1; j < this.t[this.I[n][i]]; ++j) {
                    this.N[n][j][i] = c(a, array3) << n2;
                }
            }
            else {
                for (int k = 0; k < this.t[this.I[n][i]]; ++k) {
                    this.N[n][k][i] = c(a, array) << n2;
                }
            }
        }
        for (int l = 0; l < this.D[n]; ++l) {
            if (this.c1[n][l] == 0) {
                for (int n3 = 1; n3 < this.t[this.I[n][l]]; ++n3) {
                    final int[][] array6 = this.N[n];
                    final int[] array7 = array6[n3];
                    if ((array7[l] += array6[n3 - 1][l]) < 0) {
                        array7[l] = 0;
                    }
                }
            }
            else {
                int n4;
                if (l == 0) {
                    n4 = this.J[n];
                }
                else {
                    n4 = this.I[n][l - 1];
                }
                final int n5 = this.I[n][l];
                if (n5 == n4) {
                    for (int n6 = 0; n6 < this.t[this.I[n][l]]; ++n6) {
                        int n7;
                        if (l == 0) {
                            n7 = this.O[n][n6];
                        }
                        else {
                            n7 = this.N[n][n6][l - 1];
                        }
                        final int[] array8 = this.N[n][n6];
                        array8[l] += n7;
                    }
                }
                else if (n4 == 1 && n5 == 0) {
                    for (int n8 = 0; n8 < this.t[this.I[n][l]]; ++n8) {
                        for (int n9 = 0; n9 < this.p; ++n9) {
                            final int[][] v = this.v;
                            if (v[1][n9] == v[0][n8]) {
                                int n10;
                                if (l == 0) {
                                    n10 = this.O[n][n9];
                                }
                                else {
                                    n10 = this.N[n][n9][l - 1];
                                }
                                final int[] array9 = this.N[n][n8];
                                array9[l] += n10;
                            }
                        }
                    }
                }
                else if (n4 == 0 && n5 == 1) {
                    for (int n11 = 0; n11 < this.t[this.I[n][l]]; ++n11) {
                        for (int n12 = 0; n12 < this.q; ++n12) {
                            final int[][] v2 = this.v;
                            final int[] array10 = v2[0];
                            final int n13 = array10[n12];
                            final int n14 = v2[1][n11];
                            if (n13 <= n14 && n14 < array10[n12 + 1]) {
                                int n15;
                                if (l == 0) {
                                    n15 = this.O[n][n12];
                                }
                                else {
                                    n15 = this.N[n][n12][l - 1];
                                }
                                final int[] array11 = this.N[n][n11];
                                array11[l] += n15;
                            }
                        }
                    }
                }
            }
        }
    }
    
    public final int g(final bk2.a a, int i) throws AACException {
        if (i != 2) {
            this.T0 = a.c(6);
            return 6;
        }
        if (this.B0 == null) {
            this.B0 = new a(this.x0);
        }
        final a b0 = this.B0;
        b0.getClass();
        final long n = a.e;
        if (a.d()) {
            b0.H = true;
            final boolean d = a.d();
            b0.p = d;
            if (d) {
                i = a.c(3);
                b0.s = i;
                b0.t = zj2.d.k[i];
                b0.u = zj2.d.m[i];
            }
            final boolean d2 = a.d();
            b0.q = d2;
            if (d2) {
                i = a.c(3);
                b0.v = zj2.d.l[i];
            }
            b0.r = a.d();
        }
        if (!b0.H) {
            i = 1;
        }
        else {
            b0.w = a.b();
            final int c = a.c(2);
            final int[][] n2 = d.n;
            i = b0.w;
            b0.x = n2[i][c];
            if (i != 0) {
                for (i = 1; i < b0.x + 1; ++i) {
                    b0.y[i] = a.c(5) + 1;
                }
            }
            if (b0.p) {
                for (i = 0; i < b0.x; ++i) {
                    b0.z[i] = a.d();
                    if (b0.s < 3) {
                        a.a(a, b0.z[i], b0.t, zj2.c.b, zj2.c.a, b0.D[i]);
                    }
                    else {
                        a.a(a, b0.z[i], b0.t, zj2.c.d, zj2.c.c, b0.D[i]);
                    }
                }
            }
            if (b0.q) {
                for (i = 0; i < b0.x; ++i) {
                    a.a(a, b0.A[i] = a.d(), b0.v, zj2.c.f, zj2.c.e, b0.E[i]);
                }
            }
            if (b0.r) {
                final int c2 = a.c(4);
                if ((i = c2) == 15) {
                    i = c2 + a.c(8);
                }
                int c3;
                long n3;
                long n4;
                int n5;
                for (i *= 8; i > 7; i = i - 2 - (int)(a.e - n4)) {
                    c3 = a.c(2);
                    n3 = a.e;
                    if (c3 == 0) {
                        n4 = n3;
                        if (a.d()) {
                            n5 = 0;
                            while (true) {
                                n4 = n3;
                                if (n5 >= b0.x) {
                                    break;
                                }
                                a.a(a, b0.B[n5] = a.d(), b0.u, zj2.c.h, zj2.c.g, b0.F[n5]);
                                a.a(a, b0.C[n5] = a.d(), b0.u, zj2.c.j, zj2.c.i, b0.G[n5]);
                                ++n5;
                            }
                        }
                        a.b();
                    }
                    else {
                        n4 = n3;
                    }
                }
                a.g(i);
            }
            i = (int)(a.e - n);
        }
        if (!this.C0 && this.B0.H) {
            this.C0 = true;
        }
        final boolean h = this.B0.H;
        return i;
    }
    
    public final int h(final bk2.a a, final int n) throws AACException {
        final int n2 = this.D[n];
        final int n3 = this.F[n];
        final int[] v0 = this.V0;
        final int n4 = v0[n];
        v0[n] = a.c(2);
        final int n5 = this.V0[n];
        int n6;
        if (n5 != 0) {
            if (n5 != 1) {
                if (n5 != 2) {
                    if (n5 != 3) {
                        n6 = 0;
                    }
                    else {
                        final int c = a.c(2);
                        final int c2 = a.c(2);
                        final int y0 = this.y0;
                        this.a1[n] = a.c(2);
                        this.b1[n] = a.c(2);
                        final int min = Math.min(5, this.a1[n] + this.b1[n] + 1);
                        for (int i = 0; i < this.a1[n]; ++i) {
                            this.X0[n][i] = a.c(2) * 2 + 2;
                        }
                        int n7 = 0;
                        int n8;
                        while (true) {
                            n8 = this.b1[n];
                            if (n7 >= n8) {
                                break;
                            }
                            this.Y0[n][n7] = a.c(2) * 2 + 2;
                            ++n7;
                        }
                        this.Z0[n] = a.c(i(this.a1[n] + n8 + 2));
                        for (int j = 0; j < min; ++j) {
                            this.I[n][j] = a.b();
                        }
                        this.z[n] = c;
                        this.A[n] = c2 + y0;
                        this.B[n] = this.a1[n];
                        this.C[n] = this.b1[n];
                        n6 = min;
                    }
                }
                else {
                    final int c3 = a.c(2);
                    final int n9 = a.c(2) + 1;
                    int n10 = 0;
                    int n11;
                    while (true) {
                        n11 = n9 - 1;
                        if (n10 >= n11) {
                            break;
                        }
                        this.W0[n][n10] = a.c(2) * 2 + 2;
                        ++n10;
                    }
                    this.Z0[n] = a.c(i(n9 + 1));
                    for (int k = 0; k < n9; ++k) {
                        this.I[n][k] = a.b();
                    }
                    this.z[n] = c3;
                    this.A[n] = this.y0;
                    this.B[n] = n11;
                    this.C[n] = 0;
                    n6 = n9;
                }
            }
            else {
                final int c4 = a.c(2);
                final int y2 = this.y0;
                final int n12 = a.c(2) + 1;
                int n13 = 0;
                int n14;
                while (true) {
                    n14 = n12 - 1;
                    if (n13 >= n14) {
                        break;
                    }
                    this.W0[n][n13] = a.c(2) * 2 + 2;
                    ++n13;
                }
                this.Z0[n] = a.c(i(n12 + 1));
                for (int l = 0; l < n12; ++l) {
                    this.I[n][n12 - l - 1] = a.b();
                }
                this.z[n] = 0;
                this.A[n] = c4 + y2;
                this.B[n] = 0;
                this.C[n] = n14;
                n6 = n12;
            }
        }
        else {
            final int min2 = Math.min(1 << a.c(2), 5);
            final int b = a.b();
            for (int n15 = 0; n15 < min2; ++n15) {
                this.I[n][n15] = b;
            }
            this.z[n] = 0;
            this.A[n] = this.y0;
            this.B[n] = min2 - 1;
            this.C[n] = 0;
            n6 = min2;
        }
        if (this.V0[n] == 3) {
            this.D[n] = Math.min(n6, 5);
        }
        else {
            this.D[n] = Math.min(n6, 4);
        }
        final int[] d = this.D;
        final int n16 = d[n];
        if (n16 <= 0) {
            return 1;
        }
        if (n16 > 1) {
            this.F[n] = 2;
        }
        else {
            this.F[n] = 1;
        }
        final int[] array = new int[6];
        final int h = this.h;
        final int[] z = this.z;
        array[0] = z[n] * h;
        final int n17 = d[n];
        final int[] a2 = this.A;
        array[n17] = a2[n] * h;
        final int n18 = this.V0[n];
        int n35 = 0;
        Label_1275: {
            Label_1247: {
                if (n18 != 0) {
                    Label_1142: {
                        if (n18 != 1) {
                            if (n18 != 2) {
                                if (n18 != 3) {
                                    break Label_1247;
                                }
                                if (this.a1[n] != 0) {
                                    int n19 = z[n];
                                    for (int n20 = 0, n21 = 1; n20 < this.a1[n]; ++n20, ++n21) {
                                        n19 += this.X0[n][n20];
                                        final int n22 = this.h * n19;
                                        if (this.A0 + n22 > this.x0 + this.z0) {
                                            break Label_1142;
                                        }
                                        array[n21] = n22;
                                    }
                                }
                                if (this.b1[n] != 0) {
                                    int n23 = this.D[n];
                                    int n24 = this.A[n];
                                    for (int n25 = 0; n25 < this.b1[n]; ++n25) {
                                        final int n26 = this.Y0[n][n25];
                                        if (n24 < n26) {
                                            break Label_1142;
                                        }
                                        n24 -= n26;
                                        --n23;
                                        array[n23] = this.h * n24;
                                    }
                                }
                                break Label_1247;
                            }
                            else {
                                if (d[n] > 1) {
                                    int n27 = z[n];
                                    for (int n28 = 1, n29 = 0; n29 < this.D[n] - 1; ++n29, ++n28) {
                                        n27 += this.W0[n][n29];
                                        final int n30 = this.h * n27;
                                        if (this.A0 + n30 > this.x0 + this.z0) {
                                            break Label_1142;
                                        }
                                        array[n28] = n30;
                                    }
                                }
                                break Label_1247;
                            }
                        }
                        else {
                            int n31 = d[n];
                            if (n31 > 1) {
                                int n32 = a2[n];
                                for (int n33 = 0; n33 < this.D[n] - 1; ++n33) {
                                    final int n34 = this.W0[n][n33];
                                    if (n32 < n34) {
                                        break Label_1142;
                                    }
                                    n32 -= n34;
                                    --n31;
                                    array[n31] = this.h * n32;
                                }
                            }
                            break Label_1247;
                        }
                    }
                    n35 = 1;
                    break Label_1275;
                }
                final int n36 = d[n];
                if (n36 != 2) {
                    if (n36 == 4) {
                        final int n37 = this.y0 / 4;
                        array[3] = h * 3 * n37;
                        array[2] = h * 2 * n37;
                        array[1] = h * n37;
                    }
                }
                else {
                    array[1] = this.y0 / 2 * h;
                }
            }
            for (int n38 = 0; n38 < 6; ++n38) {
                this.G[n][n38] = array[n38];
            }
            n35 = 0;
        }
        if (n35 > 0) {
            this.V0[n] = n4;
            this.D[n] = n2;
            this.F[n] = n3;
            return n35;
        }
        final int[] array2 = this.H[n];
        final int[] array3 = this.G[n];
        array2[0] = array3[0];
        final int[] d2 = this.D;
        int n39 = d2[n];
        if (n39 == 1) {
            array2[1] = array3[1];
            array2[2] = 0;
        }
        else {
            final int n40 = this.V0[n];
            Label_1462: {
                if (n40 != 0) {
                    Label_1452: {
                        if (n40 != 1) {
                            if (n40 != 2) {
                                if (n40 != 3) {
                                    n39 = 0;
                                    break Label_1462;
                                }
                            }
                            else {
                                final int n41 = this.Z0[n];
                                if (n41 == 0) {
                                    n39 = 1;
                                    break Label_1462;
                                }
                                if (n41 == 1) {
                                    break Label_1452;
                                }
                                n39 = n41 - 1;
                                break Label_1462;
                            }
                        }
                        final int n42 = this.Z0[n];
                        if (n42 > 1) {
                            n39 = n39 + 1 - n42;
                            break Label_1462;
                        }
                    }
                    --n39;
                }
                else {
                    n39 /= 2;
                }
            }
            if (n39 <= 0) {
                n39 = 0;
            }
            array2[1] = array3[n39];
            array2[2] = array3[d2[n]];
        }
        return 0;
    }
    
    public final void j(final bk2.a a, final int n) throws AACException {
        int[][] array;
        int[][] array2;
        int n2;
        if (this.U0 && n == 1) {
            array = e.H2;
            array2 = e.F2;
            n2 = 1;
        }
        else {
            array = e.G2;
            array2 = e.D2;
            n2 = 0;
        }
        for (int i = 0; i < this.F[n]; ++i) {
            if (this.d1[n][i] == 0) {
                if (this.U0 && n == 1) {
                    this.R[n][0][i] = a.c(5) << n2;
                }
                else {
                    this.R[n][0][i] = a.c(5) << n2;
                }
                for (int j = 1; j < this.r; ++j) {
                    this.R[n][j][i] = c(a, array2) << n2;
                }
            }
            else {
                for (int k = 0; k < this.r; ++k) {
                    this.R[n][k][i] = c(a, array) << n2;
                }
            }
        }
        for (int l = 0; l < this.F[n]; ++l) {
            if (this.d1[n][l] == 0) {
                for (int n3 = 1; n3 < this.r; ++n3) {
                    final int[][] array3 = this.R[n];
                    final int[] array4 = array3[n3];
                    array4[l] += array3[n3 - 1][l];
                }
            }
            else if (l == 0) {
                for (int n4 = 0; n4 < this.r; ++n4) {
                    final int[] array5 = this.R[n][n4];
                    array5[l] = this.U[n][n4] + array5[0];
                }
            }
            else {
                for (int n5 = 0; n5 < this.r; ++n5) {
                    final int[] array6 = this.R[n][n5];
                    array6[l] += array6[l - 1];
                }
            }
        }
    }
    
    public final void k(final float[] array, final float[][][] array2, final int n, final boolean b) {
        if (b) {
            this.u0[n].a(this, array, this.w0[n], this.z0, 32);
        }
        else {
            this.u0[n].a(this, array, this.w0[n], this.z0, this.m);
        }
        int i = 0;
        if (!b) {
            final float[][][] array3 = this.w0[n];
            final Class<Float> type = Float.TYPE;
            final float[][] array4 = (float[][])Array.newInstance(type, 64, 2);
            final float[][] array5 = (float[][])Array.newInstance(type, 64, 2);
            final int a0 = this.A0;
            final int[] array6 = this.G[n];
            final int n2 = array6[0];
            final int n3 = array6[this.D[n]];
            while (i < this.r) {
                final float[] array7 = this.Y[n];
                final int n4 = this.W[n][i];
                final int[] array8 = this.X[n];
                final int n5 = array8[i];
                float n6 = 0.6f;
                if (n4 != 1) {
                    if (n4 != 2) {
                        if (n4 != 3) {
                            if (n5 != 1) {
                                n6 = 0.0f;
                            }
                        }
                        else {
                            n6 = 0.98f;
                        }
                    }
                    else {
                        n6 = 0.9f;
                    }
                }
                else if (n5 != 0) {
                    n6 = 0.75f;
                }
                array7[i] = n6;
                final float[] array9 = this.Z[n];
                final float n7 = array9[i];
                if (n6 < n7) {
                    array7[i] = n7 * 0.25f + n6 * 0.75f;
                }
                else {
                    array7[i] = n7 * 0.09375f + n6 * 0.90625f;
                }
                if (array7[i] < 0.015625f) {
                    array7[i] = 0.0f;
                }
                if (array7[i] >= 0.99609375f) {
                    array7[i] = 0.99609375f;
                }
                array9[i] = array7[i];
                array8[i] = n4;
                ++i;
            }
            if (n == 0 && this.r0) {
                int l = this.l;
                int m = this.m;
                final int n8 = ak2.d.a[this.g.a];
                this.a0 = 0;
                int o;
                if (n8 < this.n + m) {
                    int n9 = 0;
                    while (true) {
                        o = n9;
                        if (this.u[n9] >= n8) {
                            break;
                        }
                        ++n9;
                    }
                }
                else {
                    o = this.o;
                }
                int n10 = o;
                if (this.o == 0) {
                    this.a0 = 0;
                    this.b0[0] = 0;
                    this.c0[0] = 0;
                }
                else {
                    int[] b2;
                    while (true) {
                        int n11 = n10 + 1;
                        int j;
                        int k;
                        int n12;
                        do {
                            --n11;
                            j = this.u[n11];
                            k = this.l;
                            n12 = (j - 2 + k) % 2;
                        } while (j > k - 1 + l - n12);
                        this.b0[this.a0] = Math.max(j - m, 0);
                        final int[] c0 = this.c0;
                        final int a2 = this.a0;
                        final int l2 = this.l;
                        b2 = this.b0;
                        c0[a2] = l2 - n12 - b2[a2];
                        int m2;
                        if (b2[a2] > 0) {
                            this.a0 = a2 + 1;
                            m2 = (m = j);
                        }
                        else {
                            m2 = this.m;
                        }
                        int o2 = n10;
                        if (this.u[n10] - j < 3) {
                            o2 = this.o;
                        }
                        if (j == this.m + this.n) {
                            break;
                        }
                        l = m2;
                        n10 = o2;
                    }
                    final int a3 = this.a0;
                    if (b2[a3 - 1] < 3 && a3 > 1) {
                        this.a0 = a3 - 1;
                    }
                    this.a0 = Math.min(this.a0, 5);
                }
            }
            int n13 = 0;
            final int n14 = n3;
            while (n13 < this.a0) {
                for (int n15 = 0; n15 < this.b0[n13]; ++n15) {
                    int n16 = this.m + n15;
                    for (int n17 = 0; n17 < n13; ++n17) {
                        n16 += this.b0[n17];
                    }
                    final int n18 = this.c0[n13] + n15;
                    final float n19 = this.Y[n][this.y[n16]];
                    final float n20 = n19 * n19;
                    if (n20 > 0.0f) {
                        final d$a d$a = new d$a();
                        final int x0 = this.x0;
                        final int a4 = this.A0;
                        final float[] array10 = array3[a4 - 2][n18];
                        final float n21 = array10[0];
                        final float n22 = array10[1];
                        final float[] array11 = array3[a4 - 1][n18];
                        final float n23 = array11[0];
                        final float n24 = array11[1];
                        float n25 = 0.0f;
                        float n26 = 0.0f;
                        float n27 = 0.0f;
                        float n28 = n22;
                        float n29 = n21;
                        float n30 = n24;
                        float n31 = n23;
                        float n32 = 0.0f;
                        float n33 = 0.0f;
                        float n35;
                        float n36;
                        for (int n34 = a4; n34 < x0 + 6 + a4; ++n34, n28 = n30, n30 = n36, n29 = n31, n31 = n35) {
                            final float[] array12 = array3[n34][n18];
                            n35 = array12[0];
                            n36 = array12[1];
                            n25 += n36 * n30 + n35 * n31;
                            n26 += n36 * n31 - n35 * n30;
                            n27 += n36 * n28 + n35 * n29;
                            n33 += n29 * n36 - n28 * n35;
                            n32 += n30 * n30 + n31 * n31;
                        }
                        final float[] d = d$a.d;
                        d[0] = n24 * n22 + n23 * n21 + (n25 - (n30 * n28 + n31 * n29));
                        d[1] = n24 * n21 - n23 * n22 + (n26 - (n30 * n29 - n31 * n28));
                        final float[] e = d$a.e;
                        e[0] = n22 * n22 + n21 * n21 + (n32 - (n28 * n28 + n29 * n29));
                        final float[] a5 = d$a.a;
                        a5[0] = n25;
                        a5[1] = n26;
                        final float[] b3 = d$a.b;
                        b3[0] = n27;
                        b3[1] = n33;
                        final float[] c2 = d$a.c;
                        c2[0] = n32;
                        final float n37 = e[0];
                        final float n38 = d[0];
                        final float n39 = d[1];
                        final float n40 = n37 * n32 - (n39 * n39 + n38 * n38) * 0.99999905f;
                        if (n40 == 0.0f) {
                            final float[] array13 = array5[n18];
                            array13[1] = (array13[0] = 0.0f);
                        }
                        else {
                            final float n41 = 1.0f / n40;
                            final float[] array14 = array5[n18];
                            final float n42 = a5[0];
                            final float n43 = a5[1];
                            array14[0] = b.a(b3[0], n32, n38 * n42 - n43 * n39, n41);
                            array14[1] = b.a(n33, c2[0], a5[0] * n39 + n43 * d[0], n41);
                        }
                        final float n44 = c2[0];
                        if (n44 == 0.0f) {
                            final float[] array15 = array4[n18];
                            array15[1] = (array15[0] = 0.0f);
                        }
                        else {
                            final float n45 = 1.0f / n44;
                            final float[] array16 = array4[n18];
                            final float n46 = a5[0];
                            final float[] array17 = array5[n18];
                            final float n47 = array17[0];
                            final float n48 = d[0];
                            final float n49 = array17[1];
                            final float n50 = d[1];
                            array16[0] = -(n49 * n50 + (n47 * n48 + n46)) * n45;
                            array16[1] = -(n49 * d[0] + a5[1] - array17[0] * n50) * n45;
                        }
                        final float[] array18 = array4[n18];
                        final float n51 = array18[0];
                        final float n52 = array18[1];
                        Label_1646: {
                            if (n52 * n52 + n51 * n51 < 16.0f) {
                                final float[] array19 = array5[n18];
                                final float n53 = array19[0];
                                final float n54 = array19[1];
                                if (n54 * n54 + n53 * n53 < 16.0f) {
                                    break Label_1646;
                                }
                            }
                            array18[1] = (array18[0] = 0.0f);
                            final float[] array20 = array5[n18];
                            array20[1] = (array20[0] = 0.0f);
                        }
                        final float n55 = array18[0] * n19;
                        final float[] array21 = array5[n18];
                        final float n56 = array21[0] * n20;
                        final float n57 = array18[1] * n19;
                        final float n58 = array21[1] * n20;
                        final float[] array22 = array3[n2 - 2 + a0][n18];
                        float n59 = array22[0];
                        final float[] array23 = array3[n2 - 1 + a0][n18];
                        float n60 = array23[0];
                        float n61 = array22[1];
                        float n62 = array23[1];
                        float n64;
                        float n65;
                        for (int n63 = n2; n63 < n14; ++n63, n59 = n60, n60 = n64, n61 = n62, n62 = n65) {
                            final float[][] array24 = array3[n63 + a0];
                            final float[] array25 = array24[n18];
                            n64 = array25[0];
                            n65 = array25[1];
                            final float[] array26 = array24[n16];
                            array26[0] = n56 * n59 + (n55 * n60 - n57 * n62) - n58 * n61 + n64;
                            array26[1] = n61 * n56 + (n59 * n58 + (n55 * n62 + n57 * n60)) + n65;
                        }
                    }
                    else {
                        for (int n66 = n2; n66 < n14; ++n66) {
                            final float[][] array27 = array3[n66 + a0];
                            final float[] array28 = array27[n16];
                            final float[] array29 = array27[n18];
                            array28[0] = array29[0];
                            array28[1] = array29[1];
                        }
                    }
                }
                ++n13;
            }
            if (this.r0) {
                final int[] array30 = this.x[0];
                final int[] array31 = this.v[0];
                final int n67 = array31[0];
                final int m3 = this.m;
                array30[0] = n67 - m3;
                array30[1] = array31[this.q] - m3;
                this.s[0] = 1;
                for (int n68 = 1; n68 < 4; ++n68) {
                    final int[] array32 = new int[100];
                    final int[] array33 = new int[64];
                    array33[0] = this.m;
                    for (int n69 = 1; n69 <= this.a0; ++n69) {
                        final int n70 = n69 - 1;
                        array33[n69] = array33[n70] + this.b0[n70];
                    }
                    for (int n71 = 0; n71 <= this.q; ++n71) {
                        array32[n71] = this.v[0][n71];
                    }
                    int n72 = 1;
                    int a6;
                    while (true) {
                        a6 = this.a0;
                        if (n72 >= a6) {
                            break;
                        }
                        array32[this.q + n72] = array33[n72];
                        ++n72;
                    }
                    Arrays.sort(array32, 0, a6 + this.q);
                    int n73 = this.a0 + this.q - 1;
                    if (n73 < 0) {
                        break;
                    }
                    int n74 = 1;
                    while (n74 <= n73) {
                        final int n75 = n74 - 1;
                        final int n76 = array32[n75];
                        float n77;
                        if (n76 != 0) {
                            n77 = array32[n74] / (float)n76;
                        }
                        else {
                            n77 = 0.0f;
                        }
                        Label_2411: {
                            if (n77 < b.i[n68 - 1]) {
                                Label_2405: {
                                    if (array32[n74] != n76) {
                                        int n78 = 0;
                                        boolean b4 = false;
                                        while (n78 <= this.a0) {
                                            if (array32[n74] == array33[n78]) {
                                                b4 = true;
                                            }
                                            ++n78;
                                        }
                                        if (b4) {
                                            int n79 = 0;
                                            boolean b5 = false;
                                            int a7;
                                            while (true) {
                                                a7 = this.a0;
                                                if (n79 > a7) {
                                                    break;
                                                }
                                                if (array32[n75] == array33[n79]) {
                                                    b5 = true;
                                                }
                                                ++n79;
                                            }
                                            if (b5) {
                                                break Label_2411;
                                            }
                                            final int[] array34 = this.v[0];
                                            final int q = this.q;
                                            array32[n75] = array34[q];
                                            Arrays.sort(array32, 0, a7 + q);
                                            break Label_2405;
                                        }
                                    }
                                    array32[n74] = this.v[0][this.q];
                                    Arrays.sort(array32, 0, n73);
                                }
                                --n73;
                                continue;
                            }
                        }
                        ++n74;
                    }
                    this.s[n68] = n73;
                    for (int n80 = 0; n80 <= n73; ++n80) {
                        this.x[n68][n80] = array32[n80] - this.m;
                    }
                }
            }
            ak2.c.b(this, this.w0[n], n);
        }
        if (!this.i && !b) {
            for (int n81 = 0; n81 < this.x0; ++n81) {
                int n82;
                int n83;
                int p4;
                if (n81 < this.G[n][0]) {
                    n82 = this.o0;
                    n83 = this.q0;
                    p4 = this.p0;
                }
                else {
                    n82 = this.m;
                    n83 = this.n;
                    p4 = 0;
                }
                int n84 = 0;
                int n85;
                while (true) {
                    n85 = n82 + p4;
                    if (n84 >= n85) {
                        break;
                    }
                    final float[] array35 = array2[n81][n84];
                    final float[] array36 = this.w0[n][this.A0 + n81][n84];
                    array35[0] = array36[0];
                    array35[1] = array36[1];
                    ++n84;
                }
                int n86 = n85;
                int n87;
                while (true) {
                    n87 = n82 + n83;
                    if (n86 >= n87) {
                        break;
                    }
                    final float[] array37 = array2[n81][n86];
                    final float[] array38 = this.w0[n][this.A0 + n81][n86];
                    array37[0] = array38[0];
                    array37[1] = array38[1];
                    ++n86;
                }
                for (int max = Math.max(n85, n87); max < 64; ++max) {
                    final float[] array39 = array2[n81][max];
                    array39[1] = (array39[0] = 0.0f);
                }
            }
        }
        else {
            for (int n88 = 0; n88 < this.x0; ++n88) {
                int n89 = 0;
                int n90;
                while (true) {
                    n90 = 32;
                    if (n89 >= 32) {
                        break;
                    }
                    final float[] array40 = array2[n88][n89];
                    final float[] array41 = this.w0[n][this.A0 + n88][n89];
                    array40[0] = array41[0];
                    array40[1] = array41[1];
                    ++n89;
                }
                for (int n91 = n90; n91 < 64; ++n91) {
                    final float[] array42 = array2[n88][n91];
                    array42[1] = (array42[0] = 0.0f);
                }
            }
        }
    }
    
    public final void l(final int n) {
        int j;
        for (int i = 0; i < (j = this.z0); ++i) {
            for (int k = 0; k < 64; ++k) {
                final float[][][] array = this.w0[n];
                final float[] array2 = array[i][k];
                final int x0 = this.x0;
                array2[0] = array[i + x0][k][0];
                array2[1] = array[x0 + i][k][1];
            }
        }
        while (j < 40) {
            for (int l = 0; l < 64; ++l) {
                final float[] array3 = this.w0[n][j][l];
                array3[1] = (array3[0] = 0.0f);
            }
            ++j;
        }
    }
    
    public final int m(final int n) {
        this.o0 = this.m;
        this.q0 = this.n;
        this.p0 = 0;
        final int[] e = this.E;
        final int[] d = this.D;
        e[n] = d[n];
        final int n2 = d[n];
        if (n2 <= 0) {
            return 19;
        }
        this.J[n] = this.I[n][n2 - 1];
        for (int i = 0; i < 49; ++i) {
            this.O[n][i] = this.N[n][i][this.D[n] - 1];
            this.U[n][i] = this.R[n][i][this.F[n] - 1];
        }
        for (int j = 0; j < 49; ++j) {
            this.e0[n][j] = this.d0[n][j];
        }
        this.R0[n] = this.Q0[n];
        if (this.V[n] == this.D[n]) {
            this.n0[n] = 0;
        }
        else {
            this.n0[n] = -1;
        }
        return 0;
    }
    
    public final void n(final bk2.a a, final int n) throws AACException {
        for (int i = 0; i < this.p; ++i) {
            this.d0[n][i] = a.b();
        }
    }
}
