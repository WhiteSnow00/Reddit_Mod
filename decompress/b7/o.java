// 
// Decompiled by Procyon v0.6.0
// 

package b7;

import java.io.IOException;
import android.graphics.PointF;
import c7.f;
import java.util.Arrays;
import android.graphics.Color;
import com.airbnb.lottie.parser.moshi.JsonReader$Token;
import java.util.ArrayList;
import com.airbnb.lottie.parser.moshi.JsonReader;
import y6.c;

public final class o implements l0<c>
{
    public int a;
    
    public o(final int a) {
        this.a = a;
    }
    
    public final Object a(final JsonReader jsonReader, float n) throws IOException {
        final ArrayList list = new ArrayList();
        final boolean b = jsonReader.w() == JsonReader$Token.BEGIN_ARRAY;
        if (b) {
            jsonReader.b();
        }
        while (jsonReader.hasNext()) {
            list.add((float)jsonReader.t());
        }
        if (list.size() == 4 && (float)list.get(0) == 1.0f) {
            list.set(0, 0.0f);
            list.add(1.0f);
            list.add(list.get(1));
            list.add(list.get(2));
            list.add(list.get(3));
            this.a = 2;
        }
        if (b) {
            jsonReader.q();
        }
        if (this.a == -1) {
            this.a = list.size() / 4;
        }
        final int a = this.a;
        final float[] array = new float[a];
        final int[] array2 = new int[a];
        final int n2 = 0;
        int n4;
        int n3 = n4 = n2;
        int n5 = n2;
        int n6;
        while (true) {
            n6 = this.a * 4;
            if (n5 >= n6) {
                break;
            }
            final int n7 = n5 / 4;
            final double n8 = list.get(n5);
            final int n9 = n5 % 4;
            Label_0373: {
                if (n9 != 0) {
                    if (n9 != 1) {
                        if (n9 != 2) {
                            if (n9 == 3) {
                                array2[n7] = Color.argb(255, n4, n3, (int)(n8 * 255.0));
                            }
                        }
                        else {
                            n3 = (int)(n8 * 255.0);
                        }
                    }
                    else {
                        n4 = (int)(n8 * 255.0);
                    }
                }
                else {
                    if (n7 > 0) {
                        n = array[n7 - 1];
                        final float n10 = (float)n8;
                        if (n >= n10) {
                            array[n7] = n10 + 0.01f;
                            break Label_0373;
                        }
                    }
                    array[n7] = (float)n8;
                }
            }
            ++n5;
        }
        c c = new c(array, array2);
        if (list.size() > n6) {
            final int n11 = (list.size() - n6) / 2;
            final float[] array3 = new float[n11];
            final float[] array4 = new float[n11];
            int n12 = 0;
            for (int i = n6; i < list.size(); ++i) {
                if (i % 2 == 0) {
                    array3[n12] = (float)list.get(i);
                }
                else {
                    array4[n12] = (float)list.get(i);
                    ++n12;
                }
            }
            float[] array5 = c.a;
            if (array5.length == 0) {
                array5 = array3;
            }
            else if (n11 != 0) {
                final int n13 = array5.length + n11;
                final float[] array6 = new float[n13];
                final int n14;
                int j = n14 = 0;
                int n16;
                int n15 = n16 = n14;
                int n17 = n14;
                while (j < n13) {
                    final int length = array5.length;
                    float n18 = Float.NaN;
                    if (n16 < length) {
                        n = array5[n16];
                    }
                    else {
                        n = Float.NaN;
                    }
                    if (n15 < n11) {
                        n18 = array3[n15];
                    }
                    int n19;
                    int n20;
                    if (!Float.isNaN(n18) && n >= n18) {
                        if (!Float.isNaN(n) && n18 >= n) {
                            array6[j] = n;
                            n19 = n16 + 1;
                            n20 = n15 + 1;
                            ++n17;
                        }
                        else {
                            array6[j] = n18;
                            n20 = n15 + 1;
                            n19 = n16;
                        }
                    }
                    else {
                        array6[j] = n;
                        n19 = n16 + 1;
                        n20 = n15;
                    }
                    ++j;
                    n16 = n19;
                    n15 = n20;
                }
                if (n17 == 0) {
                    array5 = array6;
                }
                else {
                    array5 = Arrays.copyOf(array6, n13 - n17);
                }
            }
            final int length2 = array5.length;
            final int[] array7 = new int[length2];
            int k = 0;
            final int n21 = a;
            while (k < length2) {
                n = array5[k];
                final int binarySearch = Arrays.binarySearch(array, n);
                final int binarySearch2 = Arrays.binarySearch(array3, n);
                if (binarySearch >= 0 && binarySearch2 <= 0) {
                    final int n22 = array2[binarySearch];
                    int n30 = 0;
                    Label_0993: {
                        if (n11 >= 2 && n > array3[0]) {
                            for (int l = 1; l < n11; ++l) {
                                final float n23 = array3[l];
                                final float n24 = fcmpg(n23, n);
                                if (n24 >= 0 || l == n11 - 1) {
                                    int n25;
                                    if (n24 <= 0) {
                                        n25 = (int)(array4[l] * 255.0f);
                                    }
                                    else {
                                        final int n26 = l - 1;
                                        final float n27 = array3[n26];
                                        n = (n - n27) / (n23 - n27);
                                        final float n28 = array4[n26];
                                        final float n29 = array4[l];
                                        final PointF a2 = f.a;
                                        n25 = (int)(((n29 - n28) * n + n28) * 255.0f);
                                    }
                                    n30 = Color.argb(n25, Color.red(n22), Color.green(n22), Color.blue(n22));
                                    break Label_0993;
                                }
                            }
                            throw new IllegalArgumentException("Unreachable code.");
                        }
                        n30 = Color.argb((int)(array4[0] * 255.0f), Color.red(n22), Color.green(n22), Color.blue(n22));
                    }
                    array7[k] = n30;
                }
                else {
                    int n31;
                    if ((n31 = binarySearch2) < 0) {
                        n31 = -(binarySearch2 + 1);
                    }
                    final float n32 = array4[n31];
                    int argb = 0;
                    Label_1260: {
                        if (n21 >= 2 && n != array[0]) {
                            for (int n33 = 1; n33 < n21; ++n33) {
                                final float n34 = array[n33];
                                if (n34 >= n || n33 == n21 - 1) {
                                    final int n35 = n33 - 1;
                                    final float n36 = array[n35];
                                    n = (n - n36) / (n34 - n36);
                                    final int n37 = array2[n33];
                                    final int n38 = array2[n35];
                                    final int n39 = (int)(n32 * 255.0f);
                                    final int red = Color.red(n38);
                                    final int red2 = Color.red(n37);
                                    final PointF a3 = f.a;
                                    final int n40 = (int)((red2 - red) * n + red);
                                    final int green = Color.green(n38);
                                    final int n41 = (int)((Color.green(n37) - green) * n + green);
                                    final int blue = Color.blue(n38);
                                    argb = Color.argb(n39, n40, n41, (int)(n * (Color.blue(n37) - blue) + blue));
                                    break Label_1260;
                                }
                            }
                            throw new IllegalArgumentException("Unreachable code.");
                        }
                        argb = array2[0];
                    }
                    array7[k] = argb;
                }
                ++k;
            }
            c = new c(array5, array7);
        }
        return c;
    }
}
