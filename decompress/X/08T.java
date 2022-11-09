// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.ArrayList;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;

public final class 08T
{
    static {
        Covode.recordClassIndex(886);
    }
    
    public static int LIZ(final String s, int i) {
        while (i < s.length()) {
            final char char1 = s.charAt(i);
            if (((char1 - 'A') * (char1 - 'Z') <= 0 || (char1 - 'a') * (char1 - 'z') <= 0) && char1 != 'e' && char1 != 'E') {
                return i;
            }
            ++i;
        }
        return i;
    }
    
    public static Path LIZ(final String s) {
        final Path path = new Path();
        final b[] liziz = LIZIZ(s);
        if (liziz != null) {
            try {
                b.LIZ(liziz, path);
                return path;
            }
            catch (final RuntimeException ex) {
                throw new RuntimeException("Error in parsing ".concat(String.valueOf(s)), ex);
            }
        }
        return null;
    }
    
    public static void LIZ(final ArrayList<b> list, final char c, final float[] array) {
        list.add(new b(c, array));
    }
    
    public static boolean LIZ(final b[] array, final b[] array2) {
        if (array == null || array2 == null) {
            return false;
        }
        if (array.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array.length; ++i) {
            if (array[i].LIZ != array2[i].LIZ || array[i].LIZIZ.length != array2[i].LIZIZ.length) {
                return false;
            }
        }
        return true;
    }
    
    public static float[] LIZ(final float[] array, int n) {
        if (n >= 0) {
            final int length = array.length;
            n += 0;
            final int min = Math.min(n, length - 0);
            final float[] array2 = new float[n];
            System.arraycopy(array, 0, array2, 0, min);
            return array2;
        }
        throw new IllegalArgumentException();
    }
    
    public static b[] LIZ(final b[] array) {
        if (array == null) {
            return null;
        }
        final b[] array2 = new b[array.length];
        for (int i = 0; i < array.length; ++i) {
            array2[i] = new b(array[i]);
        }
        return array2;
    }
    
    public static b[] LIZIZ(final String s) {
        if (s == null) {
            return null;
        }
        final ArrayList list = new ArrayList();
        int i = 1;
        int n = 0;
        while (i < s.length()) {
            final int liz = LIZ(s, i);
            final String trim = s.substring(n, liz).trim();
            if (trim.length() > 0) {
                LIZ(list, trim.charAt(0), LIZJ(trim));
            }
            final int n2 = liz + 1;
            n = liz;
            i = n2;
        }
        if (i - n == 1 && n < s.length()) {
            LIZ(list, s.charAt(n), new float[0]);
        }
        return list.toArray(new b[list.size()]);
    }
    
    public static float[] LIZJ(final String s) {
        if (s.charAt(0) == 'z' || s.charAt(0) == 'Z') {
            return new float[0];
        }
        try {
            final float[] array = new float[s.length()];
            final a a = new a();
            final int length = s.length();
            int i = 1;
            int n = 0;
            while (i < length) {
                a.LIZIZ = false;
                int j = i;
                int n2 = 0;
                int n3 = 0;
                boolean b = false;
                while (j < s.length()) {
                    final char char1 = s.charAt(j);
                    Label_0155: {
                        Label_0101: {
                            if (char1 != ' ') {
                                if (char1 != 'E' && char1 != 'e') {
                                    switch (char1) {
                                        case 44: {
                                            break Label_0101;
                                        }
                                        case 46: {
                                            if (n3 == 0) {
                                                n2 = 0;
                                                n3 = 1;
                                                break Label_0155;
                                            }
                                            a.LIZIZ = true;
                                            break Label_0101;
                                        }
                                        case 45: {
                                            if (j != i && n2 == 0) {
                                                a.LIZIZ = true;
                                                break Label_0101;
                                            }
                                            break;
                                        }
                                    }
                                    n2 = 0;
                                    break Label_0155;
                                }
                                n2 = 1;
                                break Label_0155;
                            }
                        }
                        n2 = 0;
                        b = true;
                    }
                    if (b) {
                        break;
                    }
                    ++j;
                }
                a.LIZ = j;
                final int liz = a.LIZ;
                int n4 = n;
                if (i < liz) {
                    array[n] = Float.parseFloat(s.substring(i, liz));
                    n4 = n + 1;
                }
                if (a.LIZIZ) {
                    i = liz;
                    n = n4;
                }
                else {
                    i = liz + 1;
                    n = n4;
                }
            }
            return LIZ(array, n);
        }
        catch (final NumberFormatException ex) {
            final StringBuilder sb = new StringBuilder("error in parsing \"");
            sb.append(s);
            sb.append("\"");
            throw new RuntimeException(sb.toString(), ex);
        }
    }
    
    public static final class a
    {
        public int LIZ;
        public boolean LIZIZ;
        
        static {
            Covode.recordClassIndex(887);
        }
    }
    
    public static class b
    {
        public char LIZ;
        public float[] LIZIZ;
        
        static {
            Covode.recordClassIndex(888);
        }
        
        public b(final char c, final float[] liziz) {
            this.LIZ = c;
            this.LIZIZ = liziz;
        }
        
        public b(final b b) {
            this.LIZ = b.LIZ;
            final float[] liziz = b.LIZIZ;
            this.LIZIZ = 08T.LIZ(liziz, liziz.length);
        }
        
        public static void LIZ(final Path path, final double n, final double n2, final double n3, double n4, double n5, double n6, double sin, double tan, double n7) {
            final double n8 = n6;
            final int n9 = (int)Math.ceil(Math.abs(n7 * 4.0 / 3.141592653589793));
            final double cos = Math.cos(sin);
            final double sin2 = Math.sin(sin);
            final double cos2 = Math.cos(tan);
            sin = Math.sin(tan);
            final double n10 = -n3;
            final double n11 = n10 * cos;
            final double n12 = n4 * sin2;
            n6 = n11 * sin - n12 * cos2;
            final double n13 = n10 * sin2;
            final double n14 = n4 * cos;
            n4 = sin * n13 + cos2 * n14;
            final double n15 = n7 / n9;
            int i = 0;
            sin = n8;
            while (i < n9) {
                final double n16 = tan + n15;
                final double sin3 = Math.sin(n16);
                final double cos3 = Math.cos(n16);
                final double n17 = n + n3 * cos * cos3 - n12 * sin3;
                n7 = n2 + n3 * sin2 * cos3 + n14 * sin3;
                final double n18 = n11 * sin3 - n12 * cos3;
                final double n19 = sin3 * n13 + cos3 * n14;
                final double n20 = n16 - tan;
                tan = Math.tan(n20 / 2.0);
                tan = Math.sin(n20) * (Math.sqrt(tan * 3.0 * tan + 4.0) - 1.0) / 3.0;
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float)(n5 + n6 * tan), (float)(sin + n4 * tan), (float)(n17 - tan * n18), (float)(n7 - tan * n19), (float)n17, (float)n7);
                ++i;
                n5 = n17;
                tan = n16;
                n4 = n19;
                n6 = n18;
                sin = n7;
            }
        }
        
        public static void LIZ(final Path path, final float n, final float n2, final float n3, final float n4, float n5, float n6, final float n7, final boolean b, final boolean b2) {
            while (true) {
                final double radians = Math.toRadians(n7);
                final double cos = Math.cos(radians);
                final double sin = Math.sin(radians);
                final double n8 = n;
                final double n9 = n2;
                final double n10 = n5;
                final double n11 = (n8 * cos + n9 * sin) / n10;
                final double n12 = -n;
                final double n13 = n6;
                final double n14 = (n12 * sin + n9 * cos) / n13;
                final double n15 = n3;
                final double n16 = n4;
                final double n17 = (n15 * cos + n16 * sin) / n10;
                final double n18 = (-n3 * sin + n16 * cos) / n13;
                final double n19 = n11 - n17;
                final double n20 = n14 - n18;
                final double n21 = (n11 + n17) / 2.0;
                final double n22 = (n14 + n18) / 2.0;
                final double n23 = n19 * n19 + n20 * n20;
                if (n23 == 0.0) {
                    return;
                }
                final double n24 = 1.0 / n23 - 0.25;
                if (n24 >= 0.0) {
                    final double sqrt = Math.sqrt(n24);
                    final double n25 = n19 * sqrt;
                    final double n26 = sqrt * n20;
                    double n27;
                    double n28;
                    if (b == b2) {
                        n27 = n21 - n26;
                        n28 = n22 + n25;
                    }
                    else {
                        n27 = n21 + n26;
                        n28 = n22 - n25;
                    }
                    final double atan2 = Math.atan2(n14 - n28, n11 - n27);
                    final double n29 = Math.atan2(n18 - n28, n17 - n27) - atan2;
                    final double n30 = dcmpl(n29, 0.0);
                    final boolean b3 = n30 >= 0;
                    double n31 = n29;
                    if (b2 != b3) {
                        if (n30 > 0) {
                            n31 = n29 - 6.283185307179586;
                        }
                        else {
                            n31 = n29 + 6.283185307179586;
                        }
                    }
                    final double n32 = n27 * n10;
                    final double n33 = n28 * n13;
                    LIZ(path, n32 * cos - n33 * sin, n32 * sin + n33 * cos, n10, n13, n8, n9, radians, atan2, n31);
                    return;
                }
                final float n34 = (float)(Math.sqrt(n23) / 1.99999);
                n5 *= n34;
                n6 *= n34;
            }
        }
        
        public static void LIZ(final b[] array, final Path path) {
            final float[] array2 = new float[6];
            int liz = 109;
            for (int i = 0; i < array.length; ++i) {
                final char liz2 = array[i].LIZ;
                final float[] liziz = array[i].LIZIZ;
                float n = array2[0];
                float n2 = array2[1];
                float n3 = array2[2];
                float n4 = array2[3];
                float n5 = array2[4];
                float n6 = array2[5];
                int n7 = 0;
                Label_0195: {
                    switch (liz2) {
                        case 90:
                        case 122: {
                            path.close();
                            path.moveTo(n5, n6);
                            n = (n3 = n5);
                            n2 = (n4 = n6);
                            break;
                        }
                        case 81:
                        case 83:
                        case 113:
                        case 115: {
                            n7 = 4;
                            break Label_0195;
                        }
                        case 72:
                        case 86:
                        case 104:
                        case 118: {
                            n7 = 1;
                            break Label_0195;
                        }
                        case 67:
                        case 99: {
                            n7 = 6;
                            break Label_0195;
                        }
                        case 65:
                        case 97: {
                            n7 = 7;
                            break Label_0195;
                        }
                    }
                    n7 = 2;
                }
                final int n8 = 0;
                float n9 = n4;
                float n10 = n3;
                int n11 = liz;
                int n12 = liz2;
                int j = n8;
            Label_0340_Outer:
                while (j < liziz.length) {
                    while (true) {
                        Label_2076: {
                            if (n12 == 65) {
                                n12 = 65;
                                final int n13 = j + 5;
                                final float n14 = liziz[n13];
                                final int n15 = j + 6;
                                LIZ(path, n, n2, n14, liziz[n15], liziz[j + 0], liziz[j + 1], liziz[j + 2], liziz[j + 3] != 0.0f, liziz[j + 4] != 0.0f);
                                n = liziz[n13];
                                n2 = liziz[n15];
                                break Label_2076;
                            }
                            float n24;
                            float n25;
                            if (n12 != 67) {
                                if (n12 != 72) {
                                    if (n12 != 81) {
                                        if (n12 != 86) {
                                            if (n12 == 97) {
                                                final int n16 = j + 5;
                                                final float n17 = liziz[n16];
                                                final int n18 = j + 6;
                                                final float n19 = liziz[n18];
                                                final float n20 = liziz[j + 0];
                                                final float n21 = liziz[j + 1];
                                                final float n22 = liziz[j + 2];
                                                final boolean b = liziz[j + 3] != 0.0f;
                                                final boolean b2 = liziz[j + 4] != 0.0f;
                                                n12 = 97;
                                                LIZ(path, n, n2, n17 + n, n19 + n2, n20, n21, n22, b, b2);
                                                n += liziz[n16];
                                                n2 += liziz[n18];
                                                break Label_2076;
                                            }
                                            float n49 = 0.0f;
                                            float n50 = 0.0f;
                                            Label_1506: {
                                                float n63 = 0.0f;
                                                float n64 = 0.0f;
                                                Label_1382: {
                                                    if (n12 != 99) {
                                                        if (n12 == 104) {
                                                            final int n23 = j + 0;
                                                            path.rLineTo(liziz[n23], 0.0f);
                                                            n += liziz[n23];
                                                            n24 = n10;
                                                            n25 = n9;
                                                            break Label_0340;
                                                        }
                                                        if (n12 == 113) {
                                                            final int n26 = j + 0;
                                                            final float n27 = liziz[n26];
                                                            final int n28 = j + 1;
                                                            final float n29 = liziz[n28];
                                                            final int n30 = j + 2;
                                                            final float n31 = liziz[n30];
                                                            final int n32 = j + 3;
                                                            path.rQuadTo(n27, n29, n31, liziz[n32]);
                                                            n24 = liziz[n26] + n;
                                                            n25 = n2 + liziz[n28];
                                                            n += liziz[n30];
                                                            final float n33 = liziz[n32];
                                                            n12 = 113;
                                                            n2 += n33;
                                                            break Label_0340;
                                                        }
                                                        if (n12 == 118) {
                                                            final int n34 = j + 0;
                                                            path.rLineTo(0.0f, liziz[n34]);
                                                            n2 += liziz[n34];
                                                            n24 = n10;
                                                            n25 = n9;
                                                            break Label_0340;
                                                        }
                                                        if (n12 != 76) {
                                                            if (n12 != 77) {
                                                                if (n12 == 83) {
                                                                    float n35 = 0.0f;
                                                                    float n36 = 0.0f;
                                                                    Label_0843: {
                                                                        if (n11 != 99 && n11 != 115 && n11 != 67) {
                                                                            n35 = n;
                                                                            n36 = n2;
                                                                            if (n11 != 83) {
                                                                                break Label_0843;
                                                                            }
                                                                        }
                                                                        n35 = n * 2.0f - n10;
                                                                        n36 = n2 * 2.0f - n9;
                                                                    }
                                                                    final int n37 = j + 0;
                                                                    final float n38 = liziz[n37];
                                                                    final int n39 = j + 1;
                                                                    final float n40 = liziz[n39];
                                                                    final int n41 = j + 2;
                                                                    final float n42 = liziz[n41];
                                                                    final int n43 = j + 3;
                                                                    path.cubicTo(n35, n36, n38, n40, n42, liziz[n43]);
                                                                    n24 = liziz[n37];
                                                                    n25 = liziz[n39];
                                                                    n = liziz[n41];
                                                                    n2 = liziz[n43];
                                                                    break Label_0340;
                                                                }
                                                                if (n12 == 84) {
                                                                    float n44 = 0.0f;
                                                                    float n45 = 0.0f;
                                                                    Label_1450: {
                                                                        if (n11 != 113 && n11 != 116 && n11 != 81) {
                                                                            n44 = n;
                                                                            n45 = n2;
                                                                            if (n11 != 84) {
                                                                                break Label_1450;
                                                                            }
                                                                        }
                                                                        n44 = n * 2.0f - n10;
                                                                        n45 = n2 * 2.0f - n9;
                                                                    }
                                                                    final int n46 = j + 0;
                                                                    final float n47 = liziz[n46];
                                                                    final int n48 = j + 1;
                                                                    path.quadTo(n44, n45, n47, liziz[n48]);
                                                                    n = liziz[n46];
                                                                    n2 = liziz[n48];
                                                                    n49 = n45;
                                                                    n50 = n44;
                                                                    break Label_1506;
                                                                }
                                                                if (n12 == 108) {
                                                                    final int n51 = j + 0;
                                                                    final float n52 = liziz[n51];
                                                                    final int n53 = j + 1;
                                                                    path.rLineTo(n52, liziz[n53]);
                                                                    n += liziz[n51];
                                                                    n2 += liziz[n53];
                                                                    n24 = n10;
                                                                    n25 = n9;
                                                                    break Label_0340;
                                                                }
                                                                if (n12 != 109) {
                                                                    if (n12 == 115) {
                                                                        float n54;
                                                                        float n55;
                                                                        if (n11 == 99 || n11 == 115 || n11 == 67 || n11 == 83) {
                                                                            n54 = n - n10;
                                                                            n55 = n2 - n9;
                                                                        }
                                                                        else {
                                                                            n54 = 0.0f;
                                                                            n55 = 0.0f;
                                                                        }
                                                                        final int n56 = j + 0;
                                                                        final float n57 = liziz[n56];
                                                                        final int n58 = j + 1;
                                                                        final float n59 = liziz[n58];
                                                                        final int n60 = j + 2;
                                                                        final float n61 = liziz[n60];
                                                                        final int n62 = j + 3;
                                                                        path.rCubicTo(n54, n55, n57, n59, n61, liziz[n62]);
                                                                        n50 = liziz[n56] + n;
                                                                        n63 = liziz[n58] + n2;
                                                                        n += liziz[n60];
                                                                        n64 = liziz[n62];
                                                                        break Label_1382;
                                                                    }
                                                                    if (n12 != 116) {
                                                                        n25 = n9;
                                                                        n24 = n10;
                                                                        break Label_0340;
                                                                    }
                                                                    float n65;
                                                                    float n66;
                                                                    if (n11 == 113 || n11 == 116 || n11 == 81 || n11 == 84) {
                                                                        n65 = n - n10;
                                                                        n66 = n2 - n9;
                                                                    }
                                                                    else {
                                                                        n66 = 0.0f;
                                                                        n65 = 0.0f;
                                                                    }
                                                                    final int n67 = j + 0;
                                                                    final float n68 = liziz[n67];
                                                                    final int n69 = j + 1;
                                                                    path.rQuadTo(n65, n66, n68, liziz[n69]);
                                                                    final float n70 = n65 + n;
                                                                    final float n71 = n66 + n2;
                                                                    n += liziz[n67];
                                                                    n2 += liziz[n69];
                                                                    n12 = 116;
                                                                    n24 = n70;
                                                                    n25 = n71;
                                                                    break Label_0340;
                                                                }
                                                                else {
                                                                    final int n72 = j + 0;
                                                                    n += liziz[n72];
                                                                    final int n73 = j + 1;
                                                                    n2 += liziz[n73];
                                                                    if (j > 0) {
                                                                        path.rLineTo(liziz[n72], liziz[n73]);
                                                                        n24 = n10;
                                                                        n25 = n9;
                                                                        break Label_0340;
                                                                    }
                                                                    path.rMoveTo(liziz[n72], liziz[n73]);
                                                                }
                                                            }
                                                            else {
                                                                final int n74 = j + 0;
                                                                n = liziz[n74];
                                                                final int n75 = j + 1;
                                                                n2 = liziz[n75];
                                                                if (j > 0) {
                                                                    path.lineTo(liziz[n74], liziz[n75]);
                                                                    n24 = n10;
                                                                    n25 = n9;
                                                                    break Label_0340;
                                                                }
                                                                path.moveTo(liziz[n74], liziz[n75]);
                                                            }
                                                            n6 = n2;
                                                            n5 = n;
                                                            n24 = n10;
                                                            n25 = n9;
                                                            break Label_0340;
                                                        }
                                                        final int n76 = j + 0;
                                                        final float n77 = liziz[n76];
                                                        final int n78 = j + 1;
                                                        path.lineTo(n77, liziz[n78]);
                                                        n = liziz[n76];
                                                        n2 = liziz[n78];
                                                        n24 = n10;
                                                        n25 = n9;
                                                        break Label_0340;
                                                    }
                                                    else {
                                                        final float n79 = liziz[j + 0];
                                                        final float n80 = liziz[j + 1];
                                                        final int n81 = j + 2;
                                                        final float n82 = liziz[n81];
                                                        final int n83 = j + 3;
                                                        final float n84 = liziz[n83];
                                                        final int n85 = j + 4;
                                                        final float n86 = liziz[n85];
                                                        final int n87 = j + 5;
                                                        path.rCubicTo(n79, n80, n82, n84, n86, liziz[n87]);
                                                        n50 = liziz[n81] + n;
                                                        n63 = liziz[n83] + n2;
                                                        n += liziz[n85];
                                                        n64 = liziz[n87];
                                                    }
                                                }
                                                n2 += n64;
                                                n49 = n63;
                                            }
                                            n24 = n50;
                                            n25 = n49;
                                        }
                                        else {
                                            n12 = 86;
                                            final int n88 = j + 0;
                                            path.lineTo(n, liziz[n88]);
                                            n2 = liziz[n88];
                                            n24 = n10;
                                            n25 = n9;
                                        }
                                    }
                                    else {
                                        n12 = 81;
                                        final int n89 = j + 0;
                                        final float n90 = liziz[n89];
                                        final int n91 = j + 1;
                                        final float n92 = liziz[n91];
                                        final int n93 = j + 2;
                                        final float n94 = liziz[n93];
                                        final int n95 = j + 3;
                                        path.quadTo(n90, n92, n94, liziz[n95]);
                                        n24 = liziz[n89];
                                        n25 = liziz[n91];
                                        n = liziz[n93];
                                        n2 = liziz[n95];
                                    }
                                }
                                else {
                                    n12 = 72;
                                    final int n96 = j + 0;
                                    path.lineTo(liziz[n96], n2);
                                    n = liziz[n96];
                                    n24 = n10;
                                    n25 = n9;
                                }
                            }
                            else {
                                n12 = 67;
                                final float n97 = liziz[j + 0];
                                final float n98 = liziz[j + 1];
                                final int n99 = j + 2;
                                final float n100 = liziz[n99];
                                final int n101 = j + 3;
                                final float n102 = liziz[n101];
                                final int n103 = j + 4;
                                final float n104 = liziz[n103];
                                final int n105 = j + 5;
                                path.cubicTo(n97, n98, n100, n102, n104, liziz[n105]);
                                n = liziz[n103];
                                n2 = liziz[n105];
                                n24 = liziz[n99];
                                n25 = liziz[n101];
                            }
                            j += n7;
                            n11 = (n12 = n12);
                            n10 = n24;
                            n9 = n25;
                            continue Label_0340_Outer;
                        }
                        float n25 = n2;
                        float n24 = n;
                        continue;
                    }
                }
                array2[0] = n;
                array2[1] = n2;
                array2[2] = n10;
                array2[3] = n9;
                array2[4] = n5;
                array2[5] = n6;
                liz = array[i].LIZ;
            }
        }
        
        public final void LIZ(final b b, final b b2, final float n) {
            this.LIZ = b.LIZ;
            int n2 = 0;
            while (true) {
                final float[] liziz = b.LIZIZ;
                if (n2 >= liziz.length) {
                    break;
                }
                this.LIZIZ[n2] = liziz[n2] * (1.0f - n) + b2.LIZIZ[n2] * n;
                ++n2;
            }
        }
    }
}
