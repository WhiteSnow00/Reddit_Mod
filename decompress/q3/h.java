// 
// Decompiled by Procyon v0.6.0
// 

package q3;

import android.util.Log;
import android.graphics.Path;
import a40.f;
import java.util.ArrayList;

public final class h
{
    public static boolean a(final b[] array, final b[] array2) {
        if (array == null || array2 == null) {
            return false;
        }
        if (array.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array.length; ++i) {
            final b b = array[i];
            final char a = b.a;
            final b b2 = array2[i];
            if (a != b2.a || b.b.length != b2.b.length) {
                return false;
            }
        }
        return true;
    }
    
    public static float[] b(int n, final float[] array) {
        if (n < 0) {
            throw new IllegalArgumentException();
        }
        final int length = array.length;
        if (length >= 0) {
            n += 0;
            final int min = Math.min(n, length - 0);
            final float[] array2 = new float[n];
            System.arraycopy(array, 0, array2, 0, min);
            return array2;
        }
        throw new ArrayIndexOutOfBoundsException();
    }
    
    public static b[] c(final String s) {
        if (s == null) {
            return null;
        }
        final ArrayList list = new ArrayList();
        int n = 0;
        int i = 1;
        while (true) {
            int n2 = 0;
            if (i >= s.length()) {
                break;
            }
            while (i < s.length()) {
                final char char1 = s.charAt(i);
                if (((char1 - 'Z') * (char1 - 'A') <= 0 || (char1 - 'z') * (char1 - 'a') <= 0) && char1 != 'e' && char1 != 'E') {
                    break;
                }
                ++i;
            }
            final String trim = s.substring(n, i).trim();
            if (trim.length() > 0) {
                float[] b = null;
                Label_0476: {
                    if (trim.charAt(0) != 'z') {
                        if (trim.charAt(0) != 'Z') {
                            try {
                                final float[] array = new float[trim.length()];
                                final a a = new a();
                                final int length = trim.length();
                                int j = 1;
                                int a2 = 0;
                                while (j < length) {
                                    a.a = (a2 != 0);
                                    int n4;
                                    int n3 = n4 = a2;
                                    int k = j;
                                    int n5 = a2;
                                    while (k < trim.length()) {
                                        final char char2 = trim.charAt(k);
                                        int n6 = 0;
                                        Label_0363: {
                                            int n7 = 0;
                                            Label_0356: {
                                                if (char2 != ' ') {
                                                    if (char2 == 'E' || char2 == 'e') {
                                                        n4 = 1;
                                                        n6 = n5;
                                                        break Label_0363;
                                                    }
                                                    switch (char2) {
                                                        default: {
                                                            n6 = n5;
                                                            n7 = n3;
                                                            break Label_0356;
                                                        }
                                                        case 46: {
                                                            if (n3 == 0) {
                                                                n7 = 1;
                                                                n6 = n5;
                                                                break Label_0356;
                                                            }
                                                            a.a = true;
                                                            break;
                                                        }
                                                        case 45: {
                                                            n6 = n5;
                                                            n7 = n3;
                                                            if (k == j) {
                                                                break Label_0356;
                                                            }
                                                            n6 = n5;
                                                            n7 = n3;
                                                            if (n4 == 0) {
                                                                a.a = true;
                                                                break;
                                                            }
                                                            break Label_0356;
                                                        }
                                                        case 44: {
                                                            break;
                                                        }
                                                    }
                                                }
                                                n6 = 1;
                                                n7 = n3;
                                            }
                                            n4 = 0;
                                            n3 = n7;
                                        }
                                        if (n6 != 0) {
                                            break;
                                        }
                                        ++k;
                                        n5 = n6;
                                    }
                                    int n8 = n2;
                                    if (j < k) {
                                        array[n2] = Float.parseFloat(trim.substring(j, k));
                                        n8 = n2 + 1;
                                    }
                                    if (!a.a) {
                                        ++k;
                                    }
                                    j = k;
                                    a2 = 0;
                                    n2 = n8;
                                }
                                b = b(n2, array);
                                break Label_0476;
                            }
                            catch (final NumberFormatException ex) {
                                throw new RuntimeException(f.n("error in parsing \"", trim, "\""), ex);
                            }
                        }
                    }
                    b = new float[0];
                }
                list.add(new b(trim.charAt(0), b));
            }
            final int n9 = i + 1;
            n = i;
            i = n9;
        }
        if (i - n == 1 && n < s.length()) {
            list.add(new b(s.charAt(n), new float[0]));
        }
        return list.toArray(new b[list.size()]);
    }
    
    public static b[] d(final b[] array) {
        if (array == null) {
            return null;
        }
        final b[] array2 = new b[array.length];
        for (int i = 0; i < array.length; ++i) {
            array2[i] = new b(array[i]);
        }
        return array2;
    }
    
    public static final class a
    {
        public boolean a;
    }
    
    public static final class b
    {
        public char a;
        public float[] b;
        
        public b(final char c, final float[] b) {
            this.a = c;
            this.b = b;
        }
        
        public b(final b b) {
            this.a = b.a;
            final float[] b2 = b.b;
            this.b = h.b(b2.length, b2);
        }
        
        public static void a(final Path path, final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7, final boolean b, final boolean b2) {
            final double radians = Math.toRadians(n7);
            final double cos = Math.cos(radians);
            final double sin = Math.sin(radians);
            final double n8 = n;
            final double n9 = n2;
            final double n10 = n8;
            final double n11 = n5;
            final double n12 = (n9 * sin + n8 * cos) / n11;
            final double n13 = -n;
            final double n14 = n6;
            final double n15 = (n9 * cos + n13 * sin) / n14;
            final double n16 = n3;
            final double n17 = n4;
            final double n18 = (n17 * sin + n16 * cos) / n11;
            final double n19 = (n17 * cos + -n3 * sin) / n14;
            final double n20 = n12 - n18;
            final double n21 = n15 - n19;
            final double n22 = (n12 + n18) / 2.0;
            final double n23 = (n15 + n19) / 2.0;
            final double n24 = n21 * n21 + n20 * n20;
            if (n24 == 0.0) {
                Log.w("PathParser", " Points are coincident");
                return;
            }
            final double n25 = 1.0 / n24 - 0.25;
            if (n25 < 0.0) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Points are too far apart ");
                sb.append(n24);
                Log.w("PathParser", sb.toString());
                final float n26 = (float)(Math.sqrt(n24) / 1.99999);
                a(path, n, n2, n3, n4, n5 * n26, n6 * n26, n7, b, b2);
                return;
            }
            final double sqrt = Math.sqrt(n25);
            final double n27 = n20 * sqrt;
            final double n28 = sqrt * n21;
            double n29;
            double n30;
            if (b == b2) {
                n29 = n22 - n28;
                n30 = n23 + n27;
            }
            else {
                n29 = n22 + n28;
                n30 = n23 - n27;
            }
            double atan2 = Math.atan2(n15 - n30, n12 - n29);
            final double n31 = Math.atan2(n19 - n30, n18 - n29) - atan2;
            final double n32 = dcmpl(n31, 0.0);
            final boolean b3 = n32 >= 0;
            double n33 = n31;
            if (b2 != b3) {
                if (n32 > 0) {
                    n33 = n31 - 6.283185307179586;
                }
                else {
                    n33 = n31 + 6.283185307179586;
                }
            }
            final double n34 = n29 * n11;
            final double n35 = n30 * n14;
            final double n36 = n34 * cos - n35 * sin;
            final int n37 = (int)Math.ceil(Math.abs(n33 * 4.0 / 3.141592653589793));
            final double cos2 = Math.cos(radians);
            final double sin2 = Math.sin(radians);
            final double cos3 = Math.cos(atan2);
            final double sin3 = Math.sin(atan2);
            final double n38 = -n11;
            final double n39 = n38 * cos2;
            final double n40 = n14 * sin2;
            double n41 = n39 * sin3 - n40 * cos3;
            final double n42 = n38 * sin2;
            final double n43 = n14 * cos2;
            double n44 = cos3 * n43 + sin3 * n42;
            final double n45 = n33 / n37;
            int i = 0;
            final double n46 = n43;
            double n47 = n9;
            double n48 = n10;
            final double n49 = n11;
            final double n50 = cos2;
            final double n51 = n42;
            final double n52 = n45;
            while (i < n37) {
                final double n53 = atan2 + n52;
                final double sin4 = Math.sin(n53);
                final double cos4 = Math.cos(n53);
                final double n54 = n49 * n50 * cos4 + n36 - n40 * sin4;
                final double n55 = n46 * sin4 + (n49 * sin2 * cos4 + (n35 * cos + n34 * sin));
                final double n56 = n39 * sin4 - n40 * cos4;
                final double n57 = cos4 * n46 + sin4 * n51;
                final double n58 = n53 - atan2;
                final double tan = Math.tan(n58 / 2.0);
                final double n59 = (Math.sqrt(tan * 3.0 * tan + 4.0) - 1.0) * Math.sin(n58) / 3.0;
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float)(n41 * n59 + n48), (float)(n44 * n59 + n47), (float)(n54 - n59 * n56), (float)(n55 - n59 * n57), (float)n54, (float)n55);
                ++i;
                atan2 = n53;
                n44 = n57;
                n41 = n56;
                n48 = n54;
                n47 = n55;
            }
        }
        
        public static void b(final b[] array, final Path path) {
            final float[] array2 = new float[6];
            int n = 0;
            int a = 109;
            int n12;
            int n13;
            for (int i = 0; i < array.length; i = n13 + 1, n = n12) {
                final b b = array[i];
                final char a2 = b.a;
                final float[] b2 = b.b;
                float n2 = array2[n];
                float n3 = array2[1];
                float n4 = array2[2];
                float n5 = array2[3];
                float n6 = array2[4];
                float n7 = array2[5];
                int n8 = 0;
                Label_0263: {
                    switch (a2) {
                        case 90:
                        case 122: {
                            path.close();
                            path.moveTo(n6, n7);
                            n2 = (n4 = n6);
                            n3 = (n5 = n7);
                            break;
                        }
                        case 81:
                        case 83:
                        case 113:
                        case 115: {
                            n8 = 4;
                            break Label_0263;
                        }
                        case 72:
                        case 86:
                        case 104:
                        case 118: {
                            n8 = 1;
                            break Label_0263;
                        }
                        case 67:
                        case 99: {
                            n8 = 6;
                            break Label_0263;
                        }
                        case 65:
                        case 97: {
                            n8 = 7;
                            break Label_0263;
                        }
                    }
                    n8 = 2;
                }
                final float n9 = n2;
                float n10 = n3;
                final int n11 = n;
                n12 = n;
                n13 = i;
                int n14 = a2;
                float n15 = n9;
                int n126;
                int n127;
                for (int j = n11; j < b2.length; j += n8, n126 = n14, n127 = 0, a = n14, n14 = n126, n12 = n127) {
                    Label_2152: {
                        if (n14 != 65) {
                            float n110;
                            float n111;
                            if (n14 != 67) {
                                if (n14 == 72) {
                                    final float[] array3 = b2;
                                    final int n16 = j + 0;
                                    path.lineTo(array3[n16], n10);
                                    n15 = array3[n16];
                                    continue;
                                }
                                if (n14 != 81) {
                                    if (n14 == 86) {
                                        final float[] array4 = b2;
                                        final int n17 = j + 0;
                                        path.lineTo(n15, array4[n17]);
                                        n10 = array4[n17];
                                        continue;
                                    }
                                    if (n14 != 97) {
                                        Label_1572: {
                                            float n62 = 0.0f;
                                            float n63 = 0.0f;
                                            float n64 = 0.0f;
                                            Label_1553: {
                                                if (n14 != 99) {
                                                    if (n14 == 104) {
                                                        final int n18 = j + 0;
                                                        path.rLineTo(b2[n18], 0.0f);
                                                        n15 += b2[n18];
                                                        break Label_1572;
                                                    }
                                                    if (n14 != 113) {
                                                        float n44 = 0.0f;
                                                        Label_1276: {
                                                            if (n14 != 118) {
                                                                Label_1251: {
                                                                    if (n14 != 76) {
                                                                        if (n14 != 77) {
                                                                            if (n14 == 83) {
                                                                                int n19 = j;
                                                                                float n21;
                                                                                float n22;
                                                                                if (a != 99 && a != 115 && a != 67 && a != 83) {
                                                                                    final float n20 = n10;
                                                                                    n21 = n15;
                                                                                    n22 = n20;
                                                                                }
                                                                                else {
                                                                                    final float n23 = n10 * 2.0f - n5;
                                                                                    final float n24 = n15 * 2.0f - n4;
                                                                                    n22 = n23;
                                                                                    n21 = n24;
                                                                                }
                                                                                final int n25 = n19 + 0;
                                                                                final float n26 = b2[n25];
                                                                                final int n27 = n19 + 1;
                                                                                final float n28 = b2[n27];
                                                                                final int n29 = n19 + 2;
                                                                                final float n30 = b2[n29];
                                                                                n19 += 3;
                                                                                path.cubicTo(n21, n22, n26, n28, n30, b2[n19]);
                                                                                n4 = b2[n25];
                                                                                n5 = b2[n27];
                                                                                n15 = b2[n29];
                                                                                n10 = b2[n19];
                                                                                break Label_1572;
                                                                            }
                                                                            if (n14 == 84) {
                                                                                int n31 = j;
                                                                                float n33;
                                                                                float n34;
                                                                                if (a != 113 && a != 116 && a != 81 && a != 84) {
                                                                                    final float n32 = n15;
                                                                                    n33 = n10;
                                                                                    n34 = n32;
                                                                                }
                                                                                else {
                                                                                    final float n35 = n15 * 2.0f - n4;
                                                                                    final float n36 = n10 * 2.0f - n5;
                                                                                    n34 = n35;
                                                                                    n33 = n36;
                                                                                }
                                                                                final int n37 = n31 + 0;
                                                                                final float n38 = b2[n37];
                                                                                ++n31;
                                                                                path.quadTo(n34, n33, n38, b2[n31]);
                                                                                final float n39 = b2[n37];
                                                                                final float n40 = b2[n31];
                                                                                n5 = n33;
                                                                                n15 = n39;
                                                                                n4 = n34;
                                                                                n10 = n40;
                                                                                continue;
                                                                            }
                                                                            if (n14 == 108) {
                                                                                int n41 = j;
                                                                                final int n42 = n41 + 0;
                                                                                final float n43 = b2[n42];
                                                                                ++n41;
                                                                                path.rLineTo(n43, b2[n41]);
                                                                                n15 += b2[n42];
                                                                                n44 = b2[n41];
                                                                                break Label_1276;
                                                                            }
                                                                            if (n14 != 109) {
                                                                                if (n14 != 115) {
                                                                                    if (n14 == 116) {
                                                                                        float n45;
                                                                                        float n46;
                                                                                        if (a != 113 && a != 116 && a != 81 && a != 84) {
                                                                                            n45 = 0.0f;
                                                                                            n46 = 0.0f;
                                                                                        }
                                                                                        else {
                                                                                            n46 = n15 - n4;
                                                                                            n45 = n10 - n5;
                                                                                        }
                                                                                        final int n47 = j + 0;
                                                                                        final float n48 = b2[n47];
                                                                                        final int n49 = j + 1;
                                                                                        path.rQuadTo(n46, n45, n48, b2[n49]);
                                                                                        final float n50 = n15 + b2[n47];
                                                                                        final float n51 = n10 + b2[n49];
                                                                                        n5 = n45 + n10;
                                                                                        n4 = n46 + n15;
                                                                                        n15 = n50;
                                                                                        n10 = n51;
                                                                                    }
                                                                                    break Label_1572;
                                                                                }
                                                                                float n52;
                                                                                float n53;
                                                                                if (a != 99 && a != 115 && a != 67 && a != 83) {
                                                                                    n52 = 0.0f;
                                                                                    n53 = 0.0f;
                                                                                }
                                                                                else {
                                                                                    n53 = n10 - n5;
                                                                                    n52 = n15 - n4;
                                                                                }
                                                                                final int n54 = j + 0;
                                                                                final float n55 = b2[n54];
                                                                                final int n56 = j + 1;
                                                                                final float n57 = b2[n56];
                                                                                final int n58 = j + 2;
                                                                                final float n59 = b2[n58];
                                                                                final int n60 = j + 3;
                                                                                path.rCubicTo(n52, n53, n55, n57, n59, b2[n60]);
                                                                                final float n61 = b2[n54] + n15;
                                                                                n5 = b2[n56] + n10;
                                                                                n62 = n15 + b2[n58];
                                                                                n63 = b2[n60];
                                                                                n64 = n61;
                                                                                break Label_1553;
                                                                            }
                                                                            else {
                                                                                final int n65 = j;
                                                                                final float n66 = b2[n65 + 0];
                                                                                n15 += n66;
                                                                                final float n67 = b2[n65 + 1];
                                                                                n10 += n67;
                                                                                if (n65 > 0) {
                                                                                    path.rLineTo(n66, n67);
                                                                                    break Label_1572;
                                                                                }
                                                                                path.rMoveTo(n66, n67);
                                                                                n6 = n15;
                                                                                n7 = n10;
                                                                            }
                                                                        }
                                                                        else {
                                                                            final int n68 = j;
                                                                            n15 = b2[n68 + 0];
                                                                            n10 = b2[n68 + 1];
                                                                            if (n68 > 0) {
                                                                                path.lineTo(n15, n10);
                                                                                break Label_1251;
                                                                            }
                                                                            path.moveTo(n15, n10);
                                                                            n7 = n10;
                                                                            n6 = n15;
                                                                        }
                                                                        n15 = n6;
                                                                        n10 = n7;
                                                                    }
                                                                    else {
                                                                        int n69 = j;
                                                                        final int n70 = n69 + 0;
                                                                        final float n71 = b2[n70];
                                                                        ++n69;
                                                                        path.lineTo(n71, b2[n69]);
                                                                        n15 = b2[n70];
                                                                        n10 = b2[n69];
                                                                    }
                                                                }
                                                                break Label_1572;
                                                            }
                                                            final int n72 = j + 0;
                                                            path.rLineTo(0.0f, b2[n72]);
                                                            n44 = b2[n72];
                                                        }
                                                        n10 += n44;
                                                        break Label_1572;
                                                    }
                                                    int n73 = j;
                                                    final int n74 = n73 + 0;
                                                    final float n75 = b2[n74];
                                                    final int n76 = n73 + 1;
                                                    final float n77 = b2[n76];
                                                    final int n78 = n73 + 2;
                                                    final float n79 = b2[n78];
                                                    n73 += 3;
                                                    path.rQuadTo(n75, n77, n79, b2[n73]);
                                                    final float n80 = b2[n74] + n15;
                                                    n5 = b2[n76] + n10;
                                                    final float n81 = b2[n78];
                                                    n63 = b2[n73];
                                                    final float n82 = n15 + n81;
                                                    n64 = n80;
                                                    n62 = n82;
                                                }
                                                else {
                                                    int n83 = j;
                                                    final float n84 = b2[n83 + 0];
                                                    final float n85 = b2[n83 + 1];
                                                    final int n86 = n83 + 2;
                                                    final float n87 = b2[n86];
                                                    final int n88 = n83 + 3;
                                                    final float n89 = b2[n88];
                                                    final int n90 = n83 + 4;
                                                    final float n91 = b2[n90];
                                                    n83 += 5;
                                                    path.rCubicTo(n84, n85, n87, n89, n91, b2[n83]);
                                                    final float n92 = b2[n86] + n15;
                                                    n5 = b2[n88] + n10;
                                                    n62 = n15 + b2[n90];
                                                    final float n93 = b2[n83];
                                                    n64 = n92;
                                                    n63 = n93;
                                                }
                                            }
                                            n10 += n63;
                                            final float n94 = n62;
                                            n4 = n64;
                                            n15 = n94;
                                        }
                                        continue;
                                    }
                                    final int n95 = j;
                                    final int n96 = n95 + 5;
                                    final float n97 = b2[n96];
                                    final int n98 = n95 + 6;
                                    final float n99 = b2[n98];
                                    final float n100 = b2[n95 + 0];
                                    final float n101 = b2[n95 + 1];
                                    final float n102 = b2[n95 + 2];
                                    final boolean b3 = b2[n95 + 3] != 0.0f;
                                    final boolean b4 = b2[n95 + 4] != 0.0f;
                                    final float[] array5 = b2;
                                    a(path, n15, n10, n97 + n15, n99 + n10, n100, n101, n102, b3, b4);
                                    n15 += array5[n96];
                                    n10 += array5[n98];
                                    break Label_2152;
                                }
                                else {
                                    int n103 = j;
                                    final float[] array6 = b2;
                                    final int n104 = n103 + 0;
                                    final float n105 = array6[n104];
                                    final int n106 = n103 + 1;
                                    final float n107 = array6[n106];
                                    final int n108 = n103 + 2;
                                    final float n109 = array6[n108];
                                    n103 += 3;
                                    path.quadTo(n105, n107, n109, array6[n103]);
                                    n110 = array6[n104];
                                    n111 = array6[n106];
                                    n15 = array6[n108];
                                    n10 = array6[n103];
                                }
                            }
                            else {
                                int n112 = j;
                                final float[] array7 = b2;
                                final float n113 = array7[n112 + 0];
                                final float n114 = array7[n112 + 1];
                                final int n115 = n112 + 2;
                                final float n116 = array7[n115];
                                final int n117 = n112 + 3;
                                final float n118 = array7[n117];
                                final int n119 = n112 + 4;
                                final float n120 = array7[n119];
                                n112 += 5;
                                path.cubicTo(n113, n114, n116, n118, n120, array7[n112]);
                                n15 = array7[n119];
                                n10 = array7[n112];
                                n110 = array7[n115];
                                n111 = array7[n117];
                            }
                            final float n121 = n111;
                            n4 = n110;
                            n5 = n121;
                            continue;
                        }
                        final int n122 = j;
                        final float[] array8 = b2;
                        final int n123 = n122 + 5;
                        final float n124 = array8[n123];
                        final int n125 = n122 + 6;
                        a(path, n15, n10, n124, array8[n125], array8[n122 + 0], array8[n122 + 1], array8[n122 + 2], array8[n122 + 3] != 0.0f, array8[n122 + 4] != 0.0f);
                        n15 = array8[n123];
                        n10 = array8[n125];
                    }
                    n5 = n10;
                    n4 = n15;
                }
                array2[n12] = n15;
                array2[1] = n10;
                array2[2] = n4;
                array2[3] = n5;
                array2[4] = n6;
                array2[5] = n7;
                a = array[n13].a;
            }
        }
    }
}
