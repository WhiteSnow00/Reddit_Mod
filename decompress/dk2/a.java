// 
// Decompiled by Procyon v0.6.0
// 

package dk2;

import net.sourceforge.jaad.aac.AACException;
import w3.f;
import java.lang.reflect.Array;

public final class a implements c, b
{
    public boolean[] A;
    public boolean[] B;
    public boolean[] C;
    public int[][] D;
    public int[][] E;
    public int[][] F;
    public int[][] G;
    public boolean H;
    public int[] I;
    public int[] J;
    public int[] K;
    public int[] L;
    public float[][] M;
    public float[][] N;
    public float[][][] O;
    public float[][][] P;
    public boolean p;
    public boolean q;
    public boolean r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public int x;
    public int[] y;
    public boolean[] z;
    
    public a(int i) {
        this.y = new int[6];
        this.z = new boolean[5];
        this.A = new boolean[5];
        this.B = new boolean[5];
        this.C = new boolean[5];
        final Class<Integer> type = Integer.TYPE;
        this.D = (int[][])Array.newInstance(type, 5, 34);
        this.E = (int[][])Array.newInstance(type, 5, 34);
        this.F = (int[][])Array.newInstance(type, 5, 17);
        this.G = (int[][])Array.newInstance(type, 5, 17);
        this.I = new int[3];
        this.J = new int[3];
        this.K = new int[64];
        this.L = new int[64];
        final Class<Float> type2 = Float.TYPE;
        final float[][][] array = (float[][][])Array.newInstance(type2, 14, 64, 2);
        final float[][][] array2 = (float[][][])Array.newInstance(type2, 2, 32, 2);
        final float[][][][] array3 = (float[][][][])Array.newInstance(type2, 3, 5, 64, 2);
        final float[][][][] array4 = (float[][][][])Array.newInstance(type2, 3, 5, 32, 2);
        this.M = (float[][])Array.newInstance(type2, 50, 2);
        this.N = (float[][])Array.newInstance(type2, 50, 2);
        final float[][] array5 = (float[][])Array.newInstance(type2, 50, 2);
        final float[][] array6 = (float[][])Array.newInstance(type2, 50, 2);
        this.O = (float[][][])Array.newInstance(type2, 20, 2, 2);
        this.P = (float[][][])Array.newInstance(type2, 20, 2, 2);
        new f(i);
        for (i = 0; i < 64; ++i) {
            this.L[i] = 0;
        }
        for (i = 0; i < 3; ++i) {
            this.I[i] = 0;
            this.J[i] = c.o[i];
        }
        final int n = 35;
        i = 0;
        int j;
        while (true) {
            j = n;
            if (i >= 35) {
                break;
            }
            this.K[i] = 14;
            ++i;
        }
        while (j < 64) {
            this.K[j] = 1;
            ++j;
        }
        float[] array7;
        float[] array8;
        for (i = 0; i < 50; ++i) {
            array7 = this.M[i];
            array7[0] = 1.0f;
            array8 = this.N[i];
            array8[1] = 1.0f;
            array8[1] = (array7[0] = 1.0f);
        }
        float[][] array9;
        float[] array10;
        float[] array11;
        float[][] array12;
        float[] array13;
        float[] array14;
        for (i = 0; i < 20; ++i) {
            array9 = this.O[i];
            array10 = array9[0];
            array10[1] = (array10[0] = 0.0f);
            array11 = array9[1];
            array11[1] = (array11[0] = 0.0f);
            array12 = this.P[i];
            array13 = array12[0];
            array13[1] = (array13[0] = 0.0f);
            array14 = array12[1];
            array14[1] = (array14[0] = 0.0f);
        }
    }
    
    public static void a(final fk2.a a, final boolean b, final int n, final int[][] array, final int[][] array2, final int[] array3) throws AACException {
        if (b) {
            for (int i = 0; i < n; ++i) {
                int j;
                for (j = 0; j >= 0; j = array[j][a.b()]) {}
                array3[i] = j + 31;
            }
        }
        else {
            int k;
            for (k = 0; k >= 0; k = array2[k][a.b()]) {}
            array3[0] = k + 31;
            for (int l = 1; l < n; ++l) {
                int n2;
                for (n2 = 0; n2 >= 0; n2 = array2[n2][a.b()]) {}
                array3[l] = n2 + 31;
            }
        }
    }
}
