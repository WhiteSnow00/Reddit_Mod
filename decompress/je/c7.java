// 
// Decompiled by Procyon v0.6.0
// 

package je;

import java.util.HashMap;
import java.nio.charset.Charset;
import com.google.android.gms.internal.measurement.zzko;
import com.google.android.gms.internal.measurement.f;
import com.google.android.gms.internal.measurement.zzlf;
import com.google.android.gms.internal.measurement.zzjw;
import java.util.List;
import com.google.android.gms.internal.measurement.e;
import com.google.android.gms.internal.measurement.d;
import java.io.IOException;
import com.google.android.gms.internal.measurement.zzjd;
import m5.a;
import java.util.Arrays;
import java.lang.reflect.Field;
import sun.misc.Unsafe;

public final class c7<T> implements k7<T>
{
    public static final int[] n;
    public static final Unsafe o;
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final z6 e;
    public final boolean f;
    public final boolean g;
    public final int[] h;
    public final int i;
    public final int j;
    public final o6 k;
    public final u7 l;
    public final q5 m;
    
    static {
        n = new int[0];
        o = e8.k();
    }
    
    public c7(final int[] a, final Object[] b, final int c, final int d, final z6 e, final boolean g, final int[] h, final int i, final int j, final o6 k, final u7 l, final q5 m, final v6 v6) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.g = g;
        this.f = (m != null && m.c(e));
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.e = e;
    }
    
    public static c7 A(final j7 j7, final o6 o6, final u7 u7, final q5 q5, final v6 v6) {
        final boolean b = j7.s() == 2;
        final String a = j7.a();
        final int length = a.length();
        int n3;
        if (a.charAt(0) >= '\ud800') {
            int n = 1;
            while (true) {
                final int n2 = n3 = n + 1;
                if (a.charAt(n) < '\ud800') {
                    break;
                }
                n = n2;
            }
        }
        else {
            n3 = 1;
        }
        final int n4 = n3 + 1;
        final char char1 = a.charAt(n3);
        int n5 = n4;
        int n6;
        if ((n6 = char1) >= 55296) {
            int n7 = char1 & '\u1fff';
            int n8 = 13;
            int n9 = n4;
            int n10;
            char char2;
            while (true) {
                n10 = n9 + 1;
                char2 = a.charAt(n9);
                if (char2 < '\ud800') {
                    break;
                }
                n7 |= (char2 & '\u1fff') << n8;
                n8 += 13;
                n9 = n10;
            }
            n6 = (n7 | char2 << n8);
            n5 = n10;
        }
        int[] n11;
        int n12;
        int n13;
        int n15;
        int n18;
        int n17;
        int char3;
        int n19;
        if (n6 == 0) {
            n11 = c7.n;
            n12 = 0;
            final int n14;
            n13 = (n14 = 0);
            final int n16;
            n15 = (n16 = n14);
            n17 = (n18 = n16);
            char3 = n14;
            n19 = n16;
        }
        else {
            final int n20 = n5 + 1;
            int char4;
            final char c = (char)(char4 = a.charAt(n5));
            int n21 = n20;
            if (c >= '\ud800') {
                int n22 = c & '\u1fff';
                int n23 = 13;
                int n24 = n20;
                int n25;
                char char5;
                while (true) {
                    n25 = n24 + 1;
                    char5 = a.charAt(n24);
                    if (char5 < '\ud800') {
                        break;
                    }
                    n22 |= (char5 & '\u1fff') << n23;
                    n23 += 13;
                    n24 = n25;
                }
                char4 = (n22 | char5 << n23);
                n21 = n25;
            }
            final int n26 = n21 + 1;
            int char6;
            final char c2 = (char)(char6 = a.charAt(n21));
            int n27 = n26;
            if (c2 >= '\ud800') {
                int n28 = c2 & '\u1fff';
                int n29 = 13;
                int n30 = n26;
                int n31;
                char char7;
                while (true) {
                    n31 = n30 + 1;
                    char7 = a.charAt(n30);
                    if (char7 < '\ud800') {
                        break;
                    }
                    n28 |= (char7 & '\u1fff') << n29;
                    n29 += 13;
                    n30 = n31;
                }
                char6 = (n28 | char7 << n29);
                n27 = n31;
            }
            final int n32 = n27 + 1;
            int char8;
            final char c3 = (char)(char8 = a.charAt(n27));
            int n33 = n32;
            if (c3 >= '\ud800') {
                final int n34 = c3 & '\u1fff';
                int n35 = 13;
                int n36 = n32;
                int n37 = n34;
                int n38;
                char char9;
                while (true) {
                    n38 = n36 + 1;
                    char9 = a.charAt(n36);
                    if (char9 < '\ud800') {
                        break;
                    }
                    n37 |= (char9 & '\u1fff') << n35;
                    n35 += 13;
                    n36 = n38;
                }
                final int n39 = n37 | char9 << n35;
                n33 = n38;
                char8 = n39;
            }
            final int n40 = n33 + 1;
            int char10;
            final char c4 = (char)(char10 = a.charAt(n33));
            int n41 = n40;
            if (c4 >= '\ud800') {
                int n42 = c4 & '\u1fff';
                int n43 = 13;
                int n44 = n40;
                int n45;
                char char11;
                while (true) {
                    n45 = n44 + 1;
                    char11 = a.charAt(n44);
                    if (char11 < '\ud800') {
                        break;
                    }
                    n42 |= (char11 & '\u1fff') << n43;
                    n43 += 13;
                    n44 = n45;
                }
                char10 = (n42 | char11 << n43);
                n41 = n45;
            }
            final int n46 = n41 + 1;
            final char c5 = (char)(char3 = a.charAt(n41));
            int n47 = n46;
            if (c5 >= '\ud800') {
                int n48 = c5 & '\u1fff';
                int n49 = 13;
                int n50 = n46;
                int n51;
                char char12;
                while (true) {
                    n51 = n50 + 1;
                    char12 = a.charAt(n50);
                    if (char12 < '\ud800') {
                        break;
                    }
                    n48 |= (char12 & '\u1fff') << n49;
                    n49 += 13;
                    n50 = n51;
                }
                char3 = (n48 | char12 << n49);
                n47 = n51;
            }
            final int n52 = n47 + 1;
            int char13;
            final char c6 = (char)(char13 = a.charAt(n47));
            int n53 = n52;
            if (c6 >= '\ud800') {
                final int n54 = c6 & '\u1fff';
                int n55 = 13;
                int n56 = n52;
                int n57 = n54;
                int n58;
                char char14;
                while (true) {
                    n58 = n56 + 1;
                    char14 = a.charAt(n56);
                    if (char14 < '\ud800') {
                        break;
                    }
                    n57 |= (char14 & '\u1fff') << n55;
                    n55 += 13;
                    n56 = n58;
                }
                final int n59 = n57 | char14 << n55;
                n53 = n58;
                char13 = n59;
            }
            final int n60 = n53 + 1;
            int char15;
            final char c7 = (char)(char15 = a.charAt(n53));
            int n61 = n60;
            if (c7 >= '\ud800') {
                int n62 = c7 & '\u1fff';
                int n63 = 13;
                int n64 = n60;
                int n65;
                char char16;
                while (true) {
                    n65 = n64 + 1;
                    char16 = a.charAt(n64);
                    if (char16 < '\ud800') {
                        break;
                    }
                    n62 |= (char16 & '\u1fff') << n63;
                    n63 += 13;
                    n64 = n65;
                }
                char15 = (n62 | char16 << n63);
                n61 = n65;
            }
            final int n66 = n61 + 1;
            int char17;
            final char c8 = (char)(char17 = a.charAt(n61));
            int n67 = n66;
            if (c8 >= '\ud800') {
                final int n68 = c8 & '\u1fff';
                int n69 = 13;
                int n70 = n66;
                int n71 = n68;
                char char18;
                while (true) {
                    n67 = n70 + 1;
                    char18 = a.charAt(n70);
                    if (char18 < '\ud800') {
                        break;
                    }
                    n71 |= (char18 & '\u1fff') << n69;
                    n69 += 13;
                    n70 = n67;
                }
                char17 = (n71 | char18 << n69);
            }
            n11 = new int[char17 + char13 + char15];
            n17 = char4 + char4 + char6;
            n18 = char4;
            final int n72 = n67;
            n19 = char13;
            n15 = char17;
            n13 = char10;
            n12 = char8;
            n5 = n72;
        }
        final Unsafe o7 = c7.o;
        final Object[] b2 = j7.b();
        final Class<? extends z6> class1 = j7.zza().getClass();
        final int[] array = new int[char3 * 3];
        final Object[] array2 = new Object[char3 + char3];
        final int n73 = n19 + n15;
        int n74 = n15;
        int n75 = n73;
        int n76 = 0;
        int n77 = 0;
        int n78 = n17;
        final int n79 = n13;
        final int n80 = n12;
        int n93;
        int n112;
        int n113;
        for (int i = n5; i < length; i = n113, n76 = n93, n75 = n112) {
            int n81 = i + 1;
            final char char19 = a.charAt(i);
            int n85;
            int n86;
            if (char19 >= '\ud800') {
                int n82 = char19 & '\u1fff';
                int n83 = 13;
                int n84;
                char char20;
                while (true) {
                    n84 = n81 + 1;
                    char20 = a.charAt(n81);
                    if (char20 < '\ud800') {
                        break;
                    }
                    n82 |= (char20 & '\u1fff') << n83;
                    n83 += 13;
                    n81 = n84;
                }
                n85 = (n82 | char20 << n83);
                n86 = n84;
            }
            else {
                n86 = n81;
                n85 = char19;
            }
            int n87 = n86 + 1;
            int char21 = a.charAt(n86);
            if (char21 >= 55296) {
                int n88 = char21 & 0x1FFF;
                int n89 = n87;
                int n90 = 13;
                int n91;
                char char22;
                while (true) {
                    n91 = n89 + 1;
                    char22 = a.charAt(n89);
                    if (char22 < '\ud800') {
                        break;
                    }
                    n88 |= (char22 & '\u1fff') << n90;
                    n90 += 13;
                    n89 = n91;
                }
                char21 = (n88 | char22 << n90);
                n87 = n91;
            }
            final int n92 = char21 & 0xFF;
            n93 = n76;
            if ((char21 & 0x400) != 0x0) {
                n11[n76] = n77;
                n93 = n76 + 1;
            }
            int n109;
            int n110;
            int n111;
            if (n92 >= 51) {
                final int n94 = n87 + 1;
                int char23 = a.charAt(n87);
                int n99;
                if (char23 >= 55296) {
                    int n95 = char23 & 0x1FFF;
                    int n96 = 13;
                    int n97 = n94;
                    int n98;
                    char char24;
                    while (true) {
                        n98 = n97 + 1;
                        char24 = a.charAt(n97);
                        if (char24 < '\ud800') {
                            break;
                        }
                        n95 |= (char24 & '\u1fff') << n96;
                        n96 += 13;
                        n97 = n98;
                    }
                    char23 = (n95 | char24 << n96);
                    n99 = n98;
                }
                else {
                    n99 = n94;
                }
                final int n100 = n92 - 51;
                final int n101 = n99;
                int n102 = 0;
                Label_1698: {
                    int n105;
                    if (n100 != 9 && n100 != 17) {
                        n102 = n78;
                        if (n100 != 12) {
                            break Label_1698;
                        }
                        n102 = n78;
                        if (b) {
                            break Label_1698;
                        }
                        final int n103 = n77 / 3;
                        final int n104 = n78 + 1;
                        array2[n103 + n103 + 1] = b2[n78];
                        n105 = n104;
                    }
                    else {
                        final int n106 = n77 / 3;
                        final int n107 = n78 + 1;
                        array2[n106 + n106 + 1] = b2[n78];
                        n105 = n107;
                    }
                    n102 = n105;
                }
                int n108 = char23 + char23;
                final Object o8 = b2[n108];
                Field m;
                if (o8 instanceof Field) {
                    m = (Field)o8;
                }
                else {
                    m = m(class1, (String)o8);
                    b2[n108] = m;
                }
                n109 = (int)o7.objectFieldOffset(m);
                ++n108;
                final Object o9 = b2[n108];
                Field k;
                if (o9 instanceof Field) {
                    k = (Field)o9;
                }
                else {
                    k = m(class1, (String)o9);
                    b2[n108] = k;
                }
                n110 = (int)o7.objectFieldOffset(k);
                n111 = 0;
                n78 = n102;
                n112 = n75;
                n113 = n101;
            }
            else {
                final int n114 = n15;
                final int n115 = n78 + 1;
                final Field l = m(class1, (String)b2[n78]);
                int n117 = 0;
                Label_2128: {
                    int n118 = 0;
                    if (n92 != 9 && n92 != 17) {
                        if (n92 == 27 || n92 == 49) {
                            final int n116 = n77 / 3;
                            n117 = n115 + 1;
                            array2[n116 + n116 + 1] = b2[n115];
                            break Label_2128;
                        }
                        int n119 = 0;
                        Label_2062: {
                            if (n92 != 12 && n92 != 30 && n92 != 44) {
                                n118 = n115;
                                n119 = n74;
                                if (n92 != 50) {
                                    break Label_2062;
                                }
                                n119 = n74 + 1;
                                n11[n74] = n77;
                                final int n120 = n77 / 3;
                                final int n121 = n120 + n120;
                                final int n122 = n115 + 1;
                                array2[n121] = b2[n115];
                                if ((char21 & 0x800) != 0x0) {
                                    final int n123 = n122 + 1;
                                    array2[n121 + 1] = b2[n122];
                                    n118 = n123;
                                    break Label_2062;
                                }
                                n74 = n119;
                                n117 = n122;
                            }
                            else {
                                n118 = n115;
                                n119 = n74;
                                if (b) {
                                    break Label_2062;
                                }
                                final int n124 = n77 / 3;
                                n117 = n115 + 1;
                                array2[n124 + n124 + 1] = b2[n115];
                            }
                            break Label_2128;
                        }
                        n74 = n119;
                    }
                    else {
                        final int n125 = n77 / 3;
                        array2[n125 + n125 + 1] = l.getType();
                        n118 = n115;
                    }
                    n117 = n118;
                }
                n109 = (int)o7.objectFieldOffset(l);
                int n133;
                int n134;
                int n135;
                if ((char21 & 0x1000) == 0x1000 && n92 <= 17) {
                    int n126 = n87 + 1;
                    int char25 = a.charAt(n87);
                    int n129;
                    if (char25 >= 55296) {
                        int n127 = char25 & 0x1FFF;
                        int n128 = 13;
                        char char26;
                        while (true) {
                            n129 = n126 + 1;
                            char26 = a.charAt(n126);
                            if (char26 < '\ud800') {
                                break;
                            }
                            n127 |= (char26 & '\u1fff') << n128;
                            n128 += 13;
                            n126 = n129;
                        }
                        char25 = (n127 | char26 << n128);
                    }
                    else {
                        n129 = n126;
                    }
                    final int n130 = char25 / 32 + (n18 + n18);
                    final Object o10 = b2[n130];
                    Field m2;
                    if (o10 instanceof Field) {
                        m2 = (Field)o10;
                    }
                    else {
                        m2 = m(class1, (String)o10);
                        b2[n130] = m2;
                    }
                    final int n131 = (int)o7.objectFieldOffset(m2);
                    final int n132 = char25 % 32;
                    n133 = n131;
                    n134 = n132;
                    n135 = n129;
                }
                else {
                    final int n136 = 1048575;
                    n134 = 0;
                    n135 = n87;
                    n133 = n136;
                }
                int n137 = n75;
                if (n92 >= 18) {
                    n137 = n75;
                    if (n92 <= 49) {
                        n11[n75] = n109;
                        n137 = n75 + 1;
                    }
                }
                final int n138 = n117;
                n113 = n135;
                n15 = n114;
                n112 = n137;
                n78 = n138;
                n111 = n134;
                n110 = n133;
            }
            final int n139 = n77 + 1;
            array[n77] = n85;
            final int n140 = n139 + 1;
            int n141;
            if ((char21 & 0x200) != 0x0) {
                n141 = 536870912;
            }
            else {
                n141 = 0;
            }
            int n142;
            if ((char21 & 0x100) != 0x0) {
                n142 = 268435456;
            }
            else {
                n142 = 0;
            }
            array[n139] = (n142 | n141 | n92 << 20 | n109);
            n77 = n140 + 1;
            array[n140] = (n110 | n111 << 20);
        }
        return new c7(array, array2, n80, n79, j7.zza(), b, n11, n15, n73, o6, u7, q5, v6);
    }
    
    public static int D(final long n, final Object o) {
        return (int)e8.j(n, o);
    }
    
    public static long j(final long n, final Object o) {
        return (long)e8.j(n, o);
    }
    
    public static Field m(final Class clazz, final String s) {
        try {
            return clazz.getDeclaredField(s);
        }
        catch (final NoSuchFieldException ex) {
            final Field[] declaredFields = clazz.getDeclaredFields();
            for (final Field field : declaredFields) {
                if (s.equals(field.getName())) {
                    return field;
                }
            }
            final String name = clazz.getName();
            final String string = Arrays.toString(declaredFields);
            final StringBuilder l = a.l("Field ", s, " for ", name, " not found. Known fields are ");
            l.append(string);
            throw new RuntimeException(l.toString());
        }
    }
    
    public static final void w(final int n, final Object o, final m5 m5) throws IOException {
        if (o instanceof String) {
            m5.a.l(n, (String)o);
            return;
        }
        m5.f(n, (zzjd)o);
    }
    
    public static v7 y(final Object o) {
        final c6 c6 = (c6)o;
        v7 zzc;
        if ((zzc = c6.zzc) == v7.f) {
            zzc = v7.b();
            c6.zzc = zzc;
        }
        return zzc;
    }
    
    public static c7 z(final x6 x6, final o6 o6, final u7 u7, final q5 q5, final v6 v6) {
        if (x6 instanceof j7) {
            return A((j7)x6, o6, u7, q5, v6);
        }
        final t7 t7 = (t7)x6;
        throw null;
    }
    
    public final int B(final Object o) {
        final Unsafe o2 = c7.o;
        int int1 = 0;
        int n = 0;
        int i = 0;
        int n2 = 1048575;
        while (i < this.a.length) {
            final int j = this.i(i);
            final int[] a = this.a;
            final int n3 = a[i];
            final int n4 = j >>> 20 & 0xFF;
            int n8;
            int n9;
            if (n4 <= 17) {
                final int n5 = a[i + 2];
                final int n6 = n5 & 0xFFFFF;
                final int n7 = 1 << (n5 >>> 20);
                n8 = n2;
                n9 = n7;
                if (n6 != n2) {
                    int1 = o2.getInt(o, (long)n6);
                    n8 = n6;
                    n9 = n7;
                }
            }
            else {
                n9 = 0;
                n8 = n2;
            }
            final long n10 = 0xFFFFF & j;
            int f = 0;
            Label_2807: {
                int n11 = 0;
                Label_2802: {
                    Label_2799: {
                        Label_2774: {
                            int n19 = 0;
                            int n20 = 0;
                            Label_2748: {
                                int n14 = 0;
                                int n15 = 0;
                                Label_2668: {
                                    Label_2585: {
                                        int n23 = 0;
                                        int n24 = 0;
                                        int n25 = 0;
                                        Label_2529: {
                                            int n12 = 0;
                                            int n13 = 0;
                                            Label_2222: {
                                                int n26 = 0;
                                                Label_1787: {
                                                    int n21 = 0;
                                                    int n22 = 0;
                                                    int u2 = 0;
                                                    Label_1780: {
                                                        int n16 = 0;
                                                        int n17 = 0;
                                                        int n18 = 0;
                                                        switch (n4) {
                                                            default: {
                                                                f = n;
                                                                break Label_2807;
                                                            }
                                                            case 68: {
                                                                f = n;
                                                                if (this.v(n3, i, o)) {
                                                                    n11 = com.google.android.gms.internal.measurement.d.r(n3, (z6)o2.getObject(o, n10), this.k(i));
                                                                    break Label_2802;
                                                                }
                                                                break Label_2807;
                                                            }
                                                            case 67: {
                                                                f = n;
                                                                if (this.v(n3, i, o)) {
                                                                    final long k = j(n10, o);
                                                                    n12 = com.google.android.gms.internal.measurement.d.a(n3 << 3);
                                                                    n13 = com.google.android.gms.internal.measurement.d.b(k >> 63 ^ k + k);
                                                                    break Label_2222;
                                                                }
                                                                break Label_2807;
                                                            }
                                                            case 66: {
                                                                f = n;
                                                                if (this.v(n3, i, o)) {
                                                                    final int d = D(n10, o);
                                                                    n14 = com.google.android.gms.internal.measurement.d.a(n3 << 3);
                                                                    n15 = com.google.android.gms.internal.measurement.d.a(d >> 31 ^ d + d);
                                                                    break Label_2668;
                                                                }
                                                                break Label_2807;
                                                            }
                                                            case 65: {
                                                                f = n;
                                                                if (this.v(n3, i, o)) {
                                                                    n11 = com.google.android.gms.internal.measurement.d.a(n3 << 3);
                                                                    break Label_2799;
                                                                }
                                                                break Label_2807;
                                                            }
                                                            case 64: {
                                                                f = n;
                                                                if (this.v(n3, i, o)) {
                                                                    n11 = com.google.android.gms.internal.measurement.d.a(n3 << 3);
                                                                    break Label_2774;
                                                                }
                                                                break Label_2807;
                                                            }
                                                            case 63: {
                                                                f = n;
                                                                if (this.v(n3, i, o)) {
                                                                    final int d2 = D(n10, o);
                                                                    n14 = com.google.android.gms.internal.measurement.d.a(n3 << 3);
                                                                    n15 = com.google.android.gms.internal.measurement.d.s(d2);
                                                                    break Label_2668;
                                                                }
                                                                break Label_2807;
                                                            }
                                                            case 62: {
                                                                f = n;
                                                                if (this.v(n3, i, o)) {
                                                                    final int d3 = D(n10, o);
                                                                    n14 = com.google.android.gms.internal.measurement.d.a(n3 << 3);
                                                                    n15 = com.google.android.gms.internal.measurement.d.a(d3);
                                                                    break Label_2668;
                                                                }
                                                                break Label_2807;
                                                            }
                                                            case 61: {
                                                                f = n;
                                                                if (this.v(n3, i, o)) {
                                                                    final zzjd zzjd = (zzjd)o2.getObject(o, n10);
                                                                    n16 = com.google.android.gms.internal.measurement.d.a(n3 << 3);
                                                                    n17 = zzjd.zzd();
                                                                    n18 = com.google.android.gms.internal.measurement.d.a(n17);
                                                                    break;
                                                                }
                                                                break Label_2807;
                                                            }
                                                            case 60: {
                                                                f = n;
                                                                if (this.v(n3, i, o)) {
                                                                    n11 = com.google.android.gms.internal.measurement.e.J(n3, this.k(i), o2.getObject(o, n10));
                                                                    break Label_2802;
                                                                }
                                                                break Label_2807;
                                                            }
                                                            case 59: {
                                                                f = n;
                                                                if (!this.v(n3, i, o)) {
                                                                    break Label_2807;
                                                                }
                                                                final Object object = o2.getObject(o, n10);
                                                                if (object instanceof zzjd) {
                                                                    final zzjd zzjd2 = (zzjd)object;
                                                                    n16 = com.google.android.gms.internal.measurement.d.a(n3 << 3);
                                                                    n17 = zzjd2.zzd();
                                                                    n18 = com.google.android.gms.internal.measurement.d.a(n17);
                                                                    break;
                                                                }
                                                                final String s = (String)object;
                                                                n14 = com.google.android.gms.internal.measurement.d.a(n3 << 3);
                                                                n15 = com.google.android.gms.internal.measurement.d.t(s);
                                                                break Label_2668;
                                                            }
                                                            case 58: {
                                                                f = n;
                                                                if (this.v(n3, i, o)) {
                                                                    n11 = com.google.android.gms.internal.measurement.d.a(n3 << 3);
                                                                    break Label_2585;
                                                                }
                                                                break Label_2807;
                                                            }
                                                            case 57: {
                                                                f = n;
                                                                if (this.v(n3, i, o)) {
                                                                    n11 = com.google.android.gms.internal.measurement.d.a(n3 << 3);
                                                                    break Label_2774;
                                                                }
                                                                break Label_2807;
                                                            }
                                                            case 56: {
                                                                f = n;
                                                                if (this.v(n3, i, o)) {
                                                                    n11 = com.google.android.gms.internal.measurement.d.a(n3 << 3);
                                                                    break Label_2799;
                                                                }
                                                                break Label_2807;
                                                            }
                                                            case 55: {
                                                                f = n;
                                                                if (this.v(n3, i, o)) {
                                                                    final int d4 = D(n10, o);
                                                                    n14 = com.google.android.gms.internal.measurement.d.a(n3 << 3);
                                                                    n15 = com.google.android.gms.internal.measurement.d.s(d4);
                                                                    break Label_2668;
                                                                }
                                                                break Label_2807;
                                                            }
                                                            case 54: {
                                                                f = n;
                                                                if (this.v(n3, i, o)) {
                                                                    final long l = j(n10, o);
                                                                    n19 = com.google.android.gms.internal.measurement.d.a(n3 << 3);
                                                                    n20 = com.google.android.gms.internal.measurement.d.b(l);
                                                                    break Label_2748;
                                                                }
                                                                break Label_2807;
                                                            }
                                                            case 53: {
                                                                f = n;
                                                                if (this.v(n3, i, o)) {
                                                                    final long m = j(n10, o);
                                                                    n19 = com.google.android.gms.internal.measurement.d.a(n3 << 3);
                                                                    n20 = com.google.android.gms.internal.measurement.d.b(m);
                                                                    break Label_2748;
                                                                }
                                                                break Label_2807;
                                                            }
                                                            case 52: {
                                                                f = n;
                                                                if (this.v(n3, i, o)) {
                                                                    n11 = com.google.android.gms.internal.measurement.d.a(n3 << 3);
                                                                    break Label_2774;
                                                                }
                                                                break Label_2807;
                                                            }
                                                            case 51: {
                                                                f = n;
                                                                if (this.v(n3, i, o)) {
                                                                    n11 = com.google.android.gms.internal.measurement.d.a(n3 << 3);
                                                                    break Label_2799;
                                                                }
                                                                break Label_2807;
                                                            }
                                                            case 50: {
                                                                v6.a(o2.getObject(o, n10), this.l(i));
                                                                f = n;
                                                                break Label_2807;
                                                            }
                                                            case 49: {
                                                                n11 = com.google.android.gms.internal.measurement.e.E(n3, (List)o2.getObject(o, n10), this.k(i));
                                                                break Label_2802;
                                                            }
                                                            case 48: {
                                                                final int o3 = com.google.android.gms.internal.measurement.e.O((List)o2.getObject(o, n10));
                                                                f = n;
                                                                if (o3 > 0) {
                                                                    final int u = com.google.android.gms.internal.measurement.d.u(n3);
                                                                    n21 = com.google.android.gms.internal.measurement.d.a(o3);
                                                                    n22 = o3;
                                                                    u2 = u;
                                                                    break Label_1780;
                                                                }
                                                                break Label_2807;
                                                            }
                                                            case 47: {
                                                                final int m2 = com.google.android.gms.internal.measurement.e.M((List)o2.getObject(o, n10));
                                                                f = n;
                                                                if (m2 > 0) {
                                                                    final int u3 = com.google.android.gms.internal.measurement.d.u(n3);
                                                                    n21 = com.google.android.gms.internal.measurement.d.a(m2);
                                                                    n22 = m2;
                                                                    u2 = u3;
                                                                    break Label_1780;
                                                                }
                                                                break Label_2807;
                                                            }
                                                            case 46: {
                                                                final int d5 = com.google.android.gms.internal.measurement.e.D((List)o2.getObject(o, n10));
                                                                f = n;
                                                                if (d5 > 0) {
                                                                    final int u4 = com.google.android.gms.internal.measurement.d.u(n3);
                                                                    n21 = com.google.android.gms.internal.measurement.d.a(d5);
                                                                    n22 = d5;
                                                                    u2 = u4;
                                                                    break Label_1780;
                                                                }
                                                                break Label_2807;
                                                            }
                                                            case 45: {
                                                                final int b = com.google.android.gms.internal.measurement.e.B((List)o2.getObject(o, n10));
                                                                f = n;
                                                                if (b > 0) {
                                                                    final int u5 = com.google.android.gms.internal.measurement.d.u(n3);
                                                                    n21 = com.google.android.gms.internal.measurement.d.a(b);
                                                                    n22 = b;
                                                                    u2 = u5;
                                                                    break Label_1780;
                                                                }
                                                                break Label_2807;
                                                            }
                                                            case 44: {
                                                                final int z = com.google.android.gms.internal.measurement.e.z((List)o2.getObject(o, n10));
                                                                f = n;
                                                                if (z > 0) {
                                                                    final int u6 = com.google.android.gms.internal.measurement.d.u(n3);
                                                                    n21 = com.google.android.gms.internal.measurement.d.a(z);
                                                                    n22 = z;
                                                                    u2 = u6;
                                                                    break Label_1780;
                                                                }
                                                                break Label_2807;
                                                            }
                                                            case 43: {
                                                                final int r = com.google.android.gms.internal.measurement.e.R((List)o2.getObject(o, n10));
                                                                f = n;
                                                                if (r > 0) {
                                                                    final int u7 = com.google.android.gms.internal.measurement.d.u(n3);
                                                                    n21 = com.google.android.gms.internal.measurement.d.a(r);
                                                                    n22 = r;
                                                                    u2 = u7;
                                                                    break Label_1780;
                                                                }
                                                                break Label_2807;
                                                            }
                                                            case 42: {
                                                                final int w = com.google.android.gms.internal.measurement.e.w((List)o2.getObject(o, n10));
                                                                f = n;
                                                                if (w > 0) {
                                                                    final int u8 = com.google.android.gms.internal.measurement.d.u(n3);
                                                                    n21 = com.google.android.gms.internal.measurement.d.a(w);
                                                                    n22 = w;
                                                                    u2 = u8;
                                                                    break Label_1780;
                                                                }
                                                                break Label_2807;
                                                            }
                                                            case 41: {
                                                                final int b2 = com.google.android.gms.internal.measurement.e.B((List)o2.getObject(o, n10));
                                                                f = n;
                                                                if (b2 > 0) {
                                                                    final int u9 = com.google.android.gms.internal.measurement.d.u(n3);
                                                                    n21 = com.google.android.gms.internal.measurement.d.a(b2);
                                                                    n22 = b2;
                                                                    u2 = u9;
                                                                    break Label_1780;
                                                                }
                                                                break Label_2807;
                                                            }
                                                            case 40: {
                                                                final int d6 = com.google.android.gms.internal.measurement.e.D((List)o2.getObject(o, n10));
                                                                f = n;
                                                                if (d6 > 0) {
                                                                    final int u10 = com.google.android.gms.internal.measurement.d.u(n3);
                                                                    n21 = com.google.android.gms.internal.measurement.d.a(d6);
                                                                    n22 = d6;
                                                                    u2 = u10;
                                                                    break Label_1780;
                                                                }
                                                                break Label_2807;
                                                            }
                                                            case 39: {
                                                                final int g = com.google.android.gms.internal.measurement.e.G((List)o2.getObject(o, n10));
                                                                f = n;
                                                                if (g > 0) {
                                                                    final int u11 = com.google.android.gms.internal.measurement.d.u(n3);
                                                                    n21 = com.google.android.gms.internal.measurement.d.a(g);
                                                                    n22 = g;
                                                                    u2 = u11;
                                                                    break Label_1780;
                                                                }
                                                                break Label_2807;
                                                            }
                                                            case 38: {
                                                                final int t = com.google.android.gms.internal.measurement.e.T((List)o2.getObject(o, n10));
                                                                f = n;
                                                                if (t > 0) {
                                                                    final int u12 = com.google.android.gms.internal.measurement.d.u(n3);
                                                                    n21 = com.google.android.gms.internal.measurement.d.a(t);
                                                                    n22 = t;
                                                                    u2 = u12;
                                                                    break Label_1780;
                                                                }
                                                                break Label_2807;
                                                            }
                                                            case 37: {
                                                                final int i2 = com.google.android.gms.internal.measurement.e.I((List)o2.getObject(o, n10));
                                                                f = n;
                                                                if (i2 > 0) {
                                                                    final int u13 = com.google.android.gms.internal.measurement.d.u(n3);
                                                                    n21 = com.google.android.gms.internal.measurement.d.a(i2);
                                                                    n22 = i2;
                                                                    u2 = u13;
                                                                    break Label_1780;
                                                                }
                                                                break Label_2807;
                                                            }
                                                            case 36: {
                                                                final int b3 = com.google.android.gms.internal.measurement.e.B((List)o2.getObject(o, n10));
                                                                f = n;
                                                                if (b3 > 0) {
                                                                    final int u14 = com.google.android.gms.internal.measurement.d.u(n3);
                                                                    n21 = com.google.android.gms.internal.measurement.d.a(b3);
                                                                    n22 = b3;
                                                                    u2 = u14;
                                                                    break Label_1780;
                                                                }
                                                                break Label_2807;
                                                            }
                                                            case 35: {
                                                                final int d7 = com.google.android.gms.internal.measurement.e.D((List)o2.getObject(o, n10));
                                                                f = n;
                                                                if (d7 > 0) {
                                                                    u2 = com.google.android.gms.internal.measurement.d.u(n3);
                                                                    n21 = com.google.android.gms.internal.measurement.d.a(d7);
                                                                    n22 = d7;
                                                                    break Label_1780;
                                                                }
                                                                break Label_2807;
                                                            }
                                                            case 34: {
                                                                n11 = com.google.android.gms.internal.measurement.e.N(n3, (List)o2.getObject(o, n10));
                                                                break Label_2802;
                                                            }
                                                            case 33: {
                                                                n11 = com.google.android.gms.internal.measurement.e.L(n3, (List)o2.getObject(o, n10));
                                                                break Label_2802;
                                                            }
                                                            case 32: {
                                                                n11 = com.google.android.gms.internal.measurement.e.C(n3, (List)o2.getObject(o, n10));
                                                                break Label_2802;
                                                            }
                                                            case 31: {
                                                                n11 = com.google.android.gms.internal.measurement.e.A(n3, (List)o2.getObject(o, n10));
                                                                break Label_2802;
                                                            }
                                                            case 30: {
                                                                n11 = com.google.android.gms.internal.measurement.e.y(n3, (List)o2.getObject(o, n10));
                                                                break Label_2802;
                                                            }
                                                            case 29: {
                                                                n11 = com.google.android.gms.internal.measurement.e.Q(n3, (List)o2.getObject(o, n10));
                                                                break Label_2802;
                                                            }
                                                            case 28: {
                                                                n11 = com.google.android.gms.internal.measurement.e.x(n3, (List)o2.getObject(o, n10));
                                                                break Label_2802;
                                                            }
                                                            case 27: {
                                                                n11 = com.google.android.gms.internal.measurement.e.K(n3, (List)o2.getObject(o, n10), this.k(i));
                                                                break Label_2802;
                                                            }
                                                            case 26: {
                                                                n11 = com.google.android.gms.internal.measurement.e.P(n3, (List)o2.getObject(o, n10));
                                                                break Label_2802;
                                                            }
                                                            case 25: {
                                                                n11 = com.google.android.gms.internal.measurement.e.u(n3, (List)o2.getObject(o, n10));
                                                                break Label_2802;
                                                            }
                                                            case 24: {
                                                                n11 = com.google.android.gms.internal.measurement.e.A(n3, (List)o2.getObject(o, n10));
                                                                break Label_2802;
                                                            }
                                                            case 23: {
                                                                n11 = com.google.android.gms.internal.measurement.e.C(n3, (List)o2.getObject(o, n10));
                                                                break Label_2802;
                                                            }
                                                            case 22: {
                                                                n11 = com.google.android.gms.internal.measurement.e.F(n3, (List)o2.getObject(o, n10));
                                                                break Label_2802;
                                                            }
                                                            case 21: {
                                                                n11 = com.google.android.gms.internal.measurement.e.S(n3, (List)o2.getObject(o, n10));
                                                                break Label_2802;
                                                            }
                                                            case 20: {
                                                                n11 = com.google.android.gms.internal.measurement.e.H(n3, (List)o2.getObject(o, n10));
                                                                break Label_2802;
                                                            }
                                                            case 19: {
                                                                n11 = com.google.android.gms.internal.measurement.e.A(n3, (List)o2.getObject(o, n10));
                                                                break Label_2802;
                                                            }
                                                            case 18: {
                                                                n11 = com.google.android.gms.internal.measurement.e.C(n3, (List)o2.getObject(o, n10));
                                                                break Label_2802;
                                                            }
                                                            case 17: {
                                                                f = n;
                                                                if ((int1 & n9) != 0x0) {
                                                                    n11 = com.google.android.gms.internal.measurement.d.r(n3, (z6)o2.getObject(o, n10), this.k(i));
                                                                    break Label_2802;
                                                                }
                                                                break Label_2807;
                                                            }
                                                            case 16: {
                                                                f = n;
                                                                if ((n9 & int1) != 0x0) {
                                                                    final long long1 = o2.getLong(o, n10);
                                                                    n12 = com.google.android.gms.internal.measurement.d.a(n3 << 3);
                                                                    n13 = com.google.android.gms.internal.measurement.d.b(long1 >> 63 ^ long1 + long1);
                                                                    break Label_2222;
                                                                }
                                                                break Label_2807;
                                                            }
                                                            case 15: {
                                                                f = n;
                                                                if ((int1 & n9) != 0x0) {
                                                                    final int int2 = o2.getInt(o, n10);
                                                                    n14 = com.google.android.gms.internal.measurement.d.a(n3 << 3);
                                                                    n15 = com.google.android.gms.internal.measurement.d.a(int2 >> 31 ^ int2 + int2);
                                                                    break Label_2668;
                                                                }
                                                                break Label_2807;
                                                            }
                                                            case 14: {
                                                                f = n;
                                                                if ((int1 & n9) != 0x0) {
                                                                    n11 = com.google.android.gms.internal.measurement.d.a(n3 << 3);
                                                                    break Label_2799;
                                                                }
                                                                break Label_2807;
                                                            }
                                                            case 13: {
                                                                f = n;
                                                                if ((int1 & n9) != 0x0) {
                                                                    n11 = com.google.android.gms.internal.measurement.d.a(n3 << 3);
                                                                    break Label_2774;
                                                                }
                                                                break Label_2807;
                                                            }
                                                            case 12: {
                                                                f = n;
                                                                if ((int1 & n9) != 0x0) {
                                                                    final int int3 = o2.getInt(o, n10);
                                                                    n14 = com.google.android.gms.internal.measurement.d.a(n3 << 3);
                                                                    n15 = com.google.android.gms.internal.measurement.d.s(int3);
                                                                    break Label_2668;
                                                                }
                                                                break Label_2807;
                                                            }
                                                            case 11: {
                                                                f = n;
                                                                if ((int1 & n9) != 0x0) {
                                                                    final int int4 = o2.getInt(o, n10);
                                                                    n14 = com.google.android.gms.internal.measurement.d.a(n3 << 3);
                                                                    n15 = com.google.android.gms.internal.measurement.d.a(int4);
                                                                    break Label_2668;
                                                                }
                                                                break Label_2807;
                                                            }
                                                            case 10: {
                                                                f = n;
                                                                if ((int1 & n9) != 0x0) {
                                                                    final zzjd zzjd3 = (zzjd)o2.getObject(o, n10);
                                                                    n23 = com.google.android.gms.internal.measurement.d.a(n3 << 3);
                                                                    n24 = zzjd3.zzd();
                                                                    n25 = com.google.android.gms.internal.measurement.d.a(n24);
                                                                    break Label_2529;
                                                                }
                                                                break Label_2807;
                                                            }
                                                            case 9: {
                                                                f = n;
                                                                if ((int1 & n9) != 0x0) {
                                                                    n11 = com.google.android.gms.internal.measurement.e.J(n3, this.k(i), o2.getObject(o, n10));
                                                                    break Label_2802;
                                                                }
                                                                break Label_2807;
                                                            }
                                                            case 8: {
                                                                f = n;
                                                                if ((int1 & n9) == 0x0) {
                                                                    break Label_2807;
                                                                }
                                                                final Object object2 = o2.getObject(o, n10);
                                                                if (object2 instanceof zzjd) {
                                                                    final zzjd zzjd4 = (zzjd)object2;
                                                                    n23 = com.google.android.gms.internal.measurement.d.a(n3 << 3);
                                                                    n24 = zzjd4.zzd();
                                                                    n25 = com.google.android.gms.internal.measurement.d.a(n24);
                                                                    break Label_2529;
                                                                }
                                                                final String s2 = (String)object2;
                                                                n14 = com.google.android.gms.internal.measurement.d.a(n3 << 3);
                                                                n15 = com.google.android.gms.internal.measurement.d.t(s2);
                                                                break Label_2668;
                                                            }
                                                            case 7: {
                                                                f = n;
                                                                if ((int1 & n9) != 0x0) {
                                                                    n11 = com.google.android.gms.internal.measurement.d.a(n3 << 3);
                                                                    break Label_2585;
                                                                }
                                                                break Label_2807;
                                                            }
                                                            case 6: {
                                                                f = n;
                                                                if ((int1 & n9) != 0x0) {
                                                                    n11 = com.google.android.gms.internal.measurement.d.a(n3 << 3);
                                                                    break Label_2774;
                                                                }
                                                                break Label_2807;
                                                            }
                                                            case 5: {
                                                                f = n;
                                                                if ((int1 & n9) != 0x0) {
                                                                    n11 = com.google.android.gms.internal.measurement.d.a(n3 << 3);
                                                                    break Label_2799;
                                                                }
                                                                break Label_2807;
                                                            }
                                                            case 4: {
                                                                f = n;
                                                                if ((int1 & n9) != 0x0) {
                                                                    final int int5 = o2.getInt(o, n10);
                                                                    n14 = com.google.android.gms.internal.measurement.d.a(n3 << 3);
                                                                    n15 = com.google.android.gms.internal.measurement.d.s(int5);
                                                                    break Label_2668;
                                                                }
                                                                break Label_2807;
                                                            }
                                                            case 3: {
                                                                f = n;
                                                                if ((int1 & n9) != 0x0) {
                                                                    final long long2 = o2.getLong(o, n10);
                                                                    n19 = com.google.android.gms.internal.measurement.d.a(n3 << 3);
                                                                    n20 = com.google.android.gms.internal.measurement.d.b(long2);
                                                                    break Label_2748;
                                                                }
                                                                break Label_2807;
                                                            }
                                                            case 2: {
                                                                f = n;
                                                                if ((int1 & n9) != 0x0) {
                                                                    final long long3 = o2.getLong(o, n10);
                                                                    n19 = com.google.android.gms.internal.measurement.d.a(n3 << 3);
                                                                    n20 = com.google.android.gms.internal.measurement.d.b(long3);
                                                                    break Label_2748;
                                                                }
                                                                break Label_2807;
                                                            }
                                                            case 1: {
                                                                f = n;
                                                                if ((int1 & n9) != 0x0) {
                                                                    n11 = com.google.android.gms.internal.measurement.d.a(n3 << 3);
                                                                    break Label_2774;
                                                                }
                                                                break Label_2807;
                                                            }
                                                            case 0: {
                                                                f = n;
                                                                if ((int1 & n9) != 0x0) {
                                                                    n11 = com.google.android.gms.internal.measurement.d.a(n3 << 3);
                                                                    break Label_2799;
                                                                }
                                                                break Label_2807;
                                                            }
                                                        }
                                                        n26 = n18 + n17 + n16;
                                                        break Label_1787;
                                                    }
                                                    n26 = n21 + u2 + n22;
                                                }
                                                f = n + n26;
                                                break Label_2807;
                                            }
                                            n11 = n13 + n12;
                                            break Label_2802;
                                        }
                                        f = a.f(n25, n24, n23, n);
                                        break Label_2807;
                                    }
                                    ++n11;
                                    break Label_2802;
                                }
                                n11 = n15 + n14;
                                break Label_2802;
                            }
                            n11 = n19 + n20;
                            break Label_2802;
                        }
                        n11 += 4;
                        break Label_2802;
                    }
                    n11 += 8;
                }
                f = n + n11;
            }
            i += 3;
            n2 = n8;
            n = f;
        }
        final u7 l2 = this.l;
        final int a2 = l2.a((Object)l2.c(o));
        if (!this.f) {
            return a2 + n;
        }
        this.m.a(o);
        throw null;
    }
    
    public final int C(final Object o) {
        final Unsafe o2 = c7.o;
        int i = 0;
        int n = 0;
        while (i < this.a.length) {
            final int j = this.i(i);
            final int n2 = j >>> 20 & 0xFF;
            final int n3 = this.a[i];
            final long n4 = j & 0xFFFFF;
            if (n2 >= zzjw.zzJ.zza() && n2 <= zzjw.zzW.zza()) {
                final int n5 = this.a[i + 2];
            }
            int n6 = 0;
            Label_2709: {
                int n7 = 0;
                Label_2704: {
                    Label_2701: {
                        Label_2674: {
                            int n13 = 0;
                            int n14 = 0;
                            Label_2646: {
                                int n8 = 0;
                                int n9 = 0;
                                Label_2566: {
                                    Label_2479: {
                                        int n17 = 0;
                                        Label_2426: {
                                            int n10 = 0;
                                            int n11 = 0;
                                            int n12 = 0;
                                            Label_2419: {
                                                int n15 = 0;
                                                int n16 = 0;
                                                int u2 = 0;
                                                switch (n2) {
                                                    default: {
                                                        n6 = n;
                                                        break Label_2709;
                                                    }
                                                    case 68: {
                                                        n6 = n;
                                                        if (this.v(n3, i, o)) {
                                                            n7 = com.google.android.gms.internal.measurement.d.r(n3, (z6)e8.j(n4, o), this.k(i));
                                                            break Label_2704;
                                                        }
                                                        break Label_2709;
                                                    }
                                                    case 67: {
                                                        n6 = n;
                                                        if (this.v(n3, i, o)) {
                                                            final long k = j(n4, o);
                                                            n8 = com.google.android.gms.internal.measurement.d.a(n3 << 3);
                                                            n9 = com.google.android.gms.internal.measurement.d.b(k >> 63 ^ k + k);
                                                            break Label_2566;
                                                        }
                                                        break Label_2709;
                                                    }
                                                    case 66: {
                                                        n6 = n;
                                                        if (this.v(n3, i, o)) {
                                                            final int d = D(n4, o);
                                                            n8 = com.google.android.gms.internal.measurement.d.a(n3 << 3);
                                                            n9 = com.google.android.gms.internal.measurement.d.a(d >> 31 ^ d + d);
                                                            break Label_2566;
                                                        }
                                                        break Label_2709;
                                                    }
                                                    case 65: {
                                                        n6 = n;
                                                        if (this.v(n3, i, o)) {
                                                            n7 = com.google.android.gms.internal.measurement.d.a(n3 << 3);
                                                            break Label_2701;
                                                        }
                                                        break Label_2709;
                                                    }
                                                    case 64: {
                                                        n6 = n;
                                                        if (this.v(n3, i, o)) {
                                                            n7 = com.google.android.gms.internal.measurement.d.a(n3 << 3);
                                                            break Label_2674;
                                                        }
                                                        break Label_2709;
                                                    }
                                                    case 63: {
                                                        n6 = n;
                                                        if (this.v(n3, i, o)) {
                                                            final int d2 = D(n4, o);
                                                            n8 = com.google.android.gms.internal.measurement.d.a(n3 << 3);
                                                            n9 = com.google.android.gms.internal.measurement.d.s(d2);
                                                            break Label_2566;
                                                        }
                                                        break Label_2709;
                                                    }
                                                    case 62: {
                                                        n6 = n;
                                                        if (this.v(n3, i, o)) {
                                                            final int d3 = D(n4, o);
                                                            n8 = com.google.android.gms.internal.measurement.d.a(n3 << 3);
                                                            n9 = com.google.android.gms.internal.measurement.d.a(d3);
                                                            break Label_2566;
                                                        }
                                                        break Label_2709;
                                                    }
                                                    case 61: {
                                                        n6 = n;
                                                        if (this.v(n3, i, o)) {
                                                            final zzjd zzjd = (zzjd)e8.j(n4, o);
                                                            n10 = com.google.android.gms.internal.measurement.d.a(n3 << 3);
                                                            n11 = zzjd.zzd();
                                                            n12 = com.google.android.gms.internal.measurement.d.a(n11);
                                                            break Label_2419;
                                                        }
                                                        break Label_2709;
                                                    }
                                                    case 60: {
                                                        n6 = n;
                                                        if (this.v(n3, i, o)) {
                                                            n7 = com.google.android.gms.internal.measurement.e.J(n3, this.k(i), e8.j(n4, o));
                                                            break Label_2704;
                                                        }
                                                        break Label_2709;
                                                    }
                                                    case 59: {
                                                        n6 = n;
                                                        if (!this.v(n3, i, o)) {
                                                            break Label_2709;
                                                        }
                                                        final Object l = e8.j(n4, o);
                                                        if (l instanceof zzjd) {
                                                            final zzjd zzjd2 = (zzjd)l;
                                                            n10 = com.google.android.gms.internal.measurement.d.a(n3 << 3);
                                                            n11 = zzjd2.zzd();
                                                            n12 = com.google.android.gms.internal.measurement.d.a(n11);
                                                            break Label_2419;
                                                        }
                                                        final String s = (String)l;
                                                        n8 = com.google.android.gms.internal.measurement.d.a(n3 << 3);
                                                        n9 = com.google.android.gms.internal.measurement.d.t(s);
                                                        break Label_2566;
                                                    }
                                                    case 58: {
                                                        n6 = n;
                                                        if (this.v(n3, i, o)) {
                                                            n7 = com.google.android.gms.internal.measurement.d.a(n3 << 3);
                                                            break Label_2479;
                                                        }
                                                        break Label_2709;
                                                    }
                                                    case 57: {
                                                        n6 = n;
                                                        if (this.v(n3, i, o)) {
                                                            n7 = com.google.android.gms.internal.measurement.d.a(n3 << 3);
                                                            break Label_2674;
                                                        }
                                                        break Label_2709;
                                                    }
                                                    case 56: {
                                                        n6 = n;
                                                        if (this.v(n3, i, o)) {
                                                            n7 = com.google.android.gms.internal.measurement.d.a(n3 << 3);
                                                            break Label_2701;
                                                        }
                                                        break Label_2709;
                                                    }
                                                    case 55: {
                                                        n6 = n;
                                                        if (this.v(n3, i, o)) {
                                                            final int d4 = D(n4, o);
                                                            n8 = com.google.android.gms.internal.measurement.d.a(n3 << 3);
                                                            n9 = com.google.android.gms.internal.measurement.d.s(d4);
                                                            break Label_2566;
                                                        }
                                                        break Label_2709;
                                                    }
                                                    case 54: {
                                                        n6 = n;
                                                        if (this.v(n3, i, o)) {
                                                            final long m = j(n4, o);
                                                            n13 = com.google.android.gms.internal.measurement.d.a(n3 << 3);
                                                            n14 = com.google.android.gms.internal.measurement.d.b(m);
                                                            break Label_2646;
                                                        }
                                                        break Label_2709;
                                                    }
                                                    case 53: {
                                                        n6 = n;
                                                        if (this.v(n3, i, o)) {
                                                            final long j2 = j(n4, o);
                                                            n13 = com.google.android.gms.internal.measurement.d.a(n3 << 3);
                                                            n14 = com.google.android.gms.internal.measurement.d.b(j2);
                                                            break Label_2646;
                                                        }
                                                        break Label_2709;
                                                    }
                                                    case 52: {
                                                        n6 = n;
                                                        if (this.v(n3, i, o)) {
                                                            n7 = com.google.android.gms.internal.measurement.d.a(n3 << 3);
                                                            break Label_2674;
                                                        }
                                                        break Label_2709;
                                                    }
                                                    case 51: {
                                                        n6 = n;
                                                        if (this.v(n3, i, o)) {
                                                            n7 = com.google.android.gms.internal.measurement.d.a(n3 << 3);
                                                            break Label_2701;
                                                        }
                                                        break Label_2709;
                                                    }
                                                    case 50: {
                                                        v6.a(e8.j(n4, o), this.l(i));
                                                        n6 = n;
                                                        break Label_2709;
                                                    }
                                                    case 49: {
                                                        n7 = com.google.android.gms.internal.measurement.e.E(n3, (List)e8.j(n4, o), this.k(i));
                                                        break Label_2704;
                                                    }
                                                    case 48: {
                                                        final int o3 = com.google.android.gms.internal.measurement.e.O((List)o2.getObject(o, n4));
                                                        n6 = n;
                                                        if (o3 > 0) {
                                                            final int u = com.google.android.gms.internal.measurement.d.u(n3);
                                                            n15 = com.google.android.gms.internal.measurement.d.a(o3);
                                                            n16 = o3;
                                                            u2 = u;
                                                            break;
                                                        }
                                                        break Label_2709;
                                                    }
                                                    case 47: {
                                                        final int m2 = com.google.android.gms.internal.measurement.e.M((List)o2.getObject(o, n4));
                                                        n6 = n;
                                                        if (m2 > 0) {
                                                            final int u3 = com.google.android.gms.internal.measurement.d.u(n3);
                                                            n15 = com.google.android.gms.internal.measurement.d.a(m2);
                                                            n16 = m2;
                                                            u2 = u3;
                                                            break;
                                                        }
                                                        break Label_2709;
                                                    }
                                                    case 46: {
                                                        final int d5 = com.google.android.gms.internal.measurement.e.D((List)o2.getObject(o, n4));
                                                        n6 = n;
                                                        if (d5 > 0) {
                                                            final int u4 = com.google.android.gms.internal.measurement.d.u(n3);
                                                            n15 = com.google.android.gms.internal.measurement.d.a(d5);
                                                            n16 = d5;
                                                            u2 = u4;
                                                            break;
                                                        }
                                                        break Label_2709;
                                                    }
                                                    case 45: {
                                                        final int b = com.google.android.gms.internal.measurement.e.B((List)o2.getObject(o, n4));
                                                        n6 = n;
                                                        if (b > 0) {
                                                            final int u5 = com.google.android.gms.internal.measurement.d.u(n3);
                                                            n15 = com.google.android.gms.internal.measurement.d.a(b);
                                                            n16 = b;
                                                            u2 = u5;
                                                            break;
                                                        }
                                                        break Label_2709;
                                                    }
                                                    case 44: {
                                                        final int z = com.google.android.gms.internal.measurement.e.z((List)o2.getObject(o, n4));
                                                        n6 = n;
                                                        if (z > 0) {
                                                            final int u6 = com.google.android.gms.internal.measurement.d.u(n3);
                                                            n15 = com.google.android.gms.internal.measurement.d.a(z);
                                                            n16 = z;
                                                            u2 = u6;
                                                            break;
                                                        }
                                                        break Label_2709;
                                                    }
                                                    case 43: {
                                                        final int r = com.google.android.gms.internal.measurement.e.R((List)o2.getObject(o, n4));
                                                        n6 = n;
                                                        if (r > 0) {
                                                            final int u7 = com.google.android.gms.internal.measurement.d.u(n3);
                                                            n15 = com.google.android.gms.internal.measurement.d.a(r);
                                                            n16 = r;
                                                            u2 = u7;
                                                            break;
                                                        }
                                                        break Label_2709;
                                                    }
                                                    case 42: {
                                                        final int w = com.google.android.gms.internal.measurement.e.w((List)o2.getObject(o, n4));
                                                        n6 = n;
                                                        if (w > 0) {
                                                            final int u8 = com.google.android.gms.internal.measurement.d.u(n3);
                                                            n15 = com.google.android.gms.internal.measurement.d.a(w);
                                                            n16 = w;
                                                            u2 = u8;
                                                            break;
                                                        }
                                                        break Label_2709;
                                                    }
                                                    case 41: {
                                                        final int b2 = com.google.android.gms.internal.measurement.e.B((List)o2.getObject(o, n4));
                                                        n6 = n;
                                                        if (b2 > 0) {
                                                            final int u9 = com.google.android.gms.internal.measurement.d.u(n3);
                                                            n15 = com.google.android.gms.internal.measurement.d.a(b2);
                                                            n16 = b2;
                                                            u2 = u9;
                                                            break;
                                                        }
                                                        break Label_2709;
                                                    }
                                                    case 40: {
                                                        final int d6 = com.google.android.gms.internal.measurement.e.D((List)o2.getObject(o, n4));
                                                        n6 = n;
                                                        if (d6 > 0) {
                                                            final int u10 = com.google.android.gms.internal.measurement.d.u(n3);
                                                            n15 = com.google.android.gms.internal.measurement.d.a(d6);
                                                            n16 = d6;
                                                            u2 = u10;
                                                            break;
                                                        }
                                                        break Label_2709;
                                                    }
                                                    case 39: {
                                                        final int g = com.google.android.gms.internal.measurement.e.G((List)o2.getObject(o, n4));
                                                        n6 = n;
                                                        if (g > 0) {
                                                            final int u11 = com.google.android.gms.internal.measurement.d.u(n3);
                                                            n15 = com.google.android.gms.internal.measurement.d.a(g);
                                                            n16 = g;
                                                            u2 = u11;
                                                            break;
                                                        }
                                                        break Label_2709;
                                                    }
                                                    case 38: {
                                                        final int t = com.google.android.gms.internal.measurement.e.T((List)o2.getObject(o, n4));
                                                        n6 = n;
                                                        if (t > 0) {
                                                            final int u12 = com.google.android.gms.internal.measurement.d.u(n3);
                                                            n15 = com.google.android.gms.internal.measurement.d.a(t);
                                                            n16 = t;
                                                            u2 = u12;
                                                            break;
                                                        }
                                                        break Label_2709;
                                                    }
                                                    case 37: {
                                                        final int i2 = com.google.android.gms.internal.measurement.e.I((List)o2.getObject(o, n4));
                                                        n6 = n;
                                                        if (i2 > 0) {
                                                            final int u13 = com.google.android.gms.internal.measurement.d.u(n3);
                                                            n15 = com.google.android.gms.internal.measurement.d.a(i2);
                                                            n16 = i2;
                                                            u2 = u13;
                                                            break;
                                                        }
                                                        break Label_2709;
                                                    }
                                                    case 36: {
                                                        final int b3 = com.google.android.gms.internal.measurement.e.B((List)o2.getObject(o, n4));
                                                        n6 = n;
                                                        if (b3 > 0) {
                                                            final int u14 = com.google.android.gms.internal.measurement.d.u(n3);
                                                            n15 = com.google.android.gms.internal.measurement.d.a(b3);
                                                            n16 = b3;
                                                            u2 = u14;
                                                            break;
                                                        }
                                                        break Label_2709;
                                                    }
                                                    case 35: {
                                                        final int d7 = com.google.android.gms.internal.measurement.e.D((List)o2.getObject(o, n4));
                                                        n6 = n;
                                                        if (d7 > 0) {
                                                            u2 = com.google.android.gms.internal.measurement.d.u(n3);
                                                            n15 = com.google.android.gms.internal.measurement.d.a(d7);
                                                            n16 = d7;
                                                            break;
                                                        }
                                                        break Label_2709;
                                                    }
                                                    case 34: {
                                                        n7 = com.google.android.gms.internal.measurement.e.N(n3, (List)e8.j(n4, o));
                                                        break Label_2704;
                                                    }
                                                    case 33: {
                                                        n7 = com.google.android.gms.internal.measurement.e.L(n3, (List)e8.j(n4, o));
                                                        break Label_2704;
                                                    }
                                                    case 32: {
                                                        n7 = com.google.android.gms.internal.measurement.e.C(n3, (List)e8.j(n4, o));
                                                        break Label_2704;
                                                    }
                                                    case 31: {
                                                        n7 = com.google.android.gms.internal.measurement.e.A(n3, (List)e8.j(n4, o));
                                                        break Label_2704;
                                                    }
                                                    case 30: {
                                                        n7 = com.google.android.gms.internal.measurement.e.y(n3, (List)e8.j(n4, o));
                                                        break Label_2704;
                                                    }
                                                    case 29: {
                                                        n7 = com.google.android.gms.internal.measurement.e.Q(n3, (List)e8.j(n4, o));
                                                        break Label_2704;
                                                    }
                                                    case 28: {
                                                        n7 = com.google.android.gms.internal.measurement.e.x(n3, (List)e8.j(n4, o));
                                                        break Label_2704;
                                                    }
                                                    case 27: {
                                                        n7 = com.google.android.gms.internal.measurement.e.K(n3, (List)e8.j(n4, o), this.k(i));
                                                        break Label_2704;
                                                    }
                                                    case 26: {
                                                        n7 = com.google.android.gms.internal.measurement.e.P(n3, (List)e8.j(n4, o));
                                                        break Label_2704;
                                                    }
                                                    case 25: {
                                                        n7 = com.google.android.gms.internal.measurement.e.u(n3, (List)e8.j(n4, o));
                                                        break Label_2704;
                                                    }
                                                    case 24: {
                                                        n7 = com.google.android.gms.internal.measurement.e.A(n3, (List)e8.j(n4, o));
                                                        break Label_2704;
                                                    }
                                                    case 23: {
                                                        n7 = com.google.android.gms.internal.measurement.e.C(n3, (List)e8.j(n4, o));
                                                        break Label_2704;
                                                    }
                                                    case 22: {
                                                        n7 = com.google.android.gms.internal.measurement.e.F(n3, (List)e8.j(n4, o));
                                                        break Label_2704;
                                                    }
                                                    case 21: {
                                                        n7 = com.google.android.gms.internal.measurement.e.S(n3, (List)e8.j(n4, o));
                                                        break Label_2704;
                                                    }
                                                    case 20: {
                                                        n7 = com.google.android.gms.internal.measurement.e.H(n3, (List)e8.j(n4, o));
                                                        break Label_2704;
                                                    }
                                                    case 19: {
                                                        n7 = com.google.android.gms.internal.measurement.e.A(n3, (List)e8.j(n4, o));
                                                        break Label_2704;
                                                    }
                                                    case 18: {
                                                        n7 = com.google.android.gms.internal.measurement.e.C(n3, (List)e8.j(n4, o));
                                                        break Label_2704;
                                                    }
                                                    case 17: {
                                                        n6 = n;
                                                        if (this.u(i, o)) {
                                                            n7 = com.google.android.gms.internal.measurement.d.r(n3, (z6)e8.j(n4, o), this.k(i));
                                                            break Label_2704;
                                                        }
                                                        break Label_2709;
                                                    }
                                                    case 16: {
                                                        n6 = n;
                                                        if (this.u(i, o)) {
                                                            final long h = e8.h(n4, o);
                                                            n8 = com.google.android.gms.internal.measurement.d.a(n3 << 3);
                                                            n9 = com.google.android.gms.internal.measurement.d.b(h >> 63 ^ h + h);
                                                            break Label_2566;
                                                        }
                                                        break Label_2709;
                                                    }
                                                    case 15: {
                                                        n6 = n;
                                                        if (this.u(i, o)) {
                                                            final int g2 = e8.g(n4, o);
                                                            n8 = com.google.android.gms.internal.measurement.d.a(n3 << 3);
                                                            n9 = com.google.android.gms.internal.measurement.d.a(g2 >> 31 ^ g2 + g2);
                                                            break Label_2566;
                                                        }
                                                        break Label_2709;
                                                    }
                                                    case 14: {
                                                        n6 = n;
                                                        if (this.u(i, o)) {
                                                            n7 = com.google.android.gms.internal.measurement.d.a(n3 << 3);
                                                            break Label_2701;
                                                        }
                                                        break Label_2709;
                                                    }
                                                    case 13: {
                                                        n6 = n;
                                                        if (this.u(i, o)) {
                                                            n7 = com.google.android.gms.internal.measurement.d.a(n3 << 3);
                                                            break Label_2674;
                                                        }
                                                        break Label_2709;
                                                    }
                                                    case 12: {
                                                        n6 = n;
                                                        if (this.u(i, o)) {
                                                            final int g3 = e8.g(n4, o);
                                                            n8 = com.google.android.gms.internal.measurement.d.a(n3 << 3);
                                                            n9 = com.google.android.gms.internal.measurement.d.s(g3);
                                                            break Label_2566;
                                                        }
                                                        break Label_2709;
                                                    }
                                                    case 11: {
                                                        n6 = n;
                                                        if (this.u(i, o)) {
                                                            final int g4 = e8.g(n4, o);
                                                            n8 = com.google.android.gms.internal.measurement.d.a(n3 << 3);
                                                            n9 = com.google.android.gms.internal.measurement.d.a(g4);
                                                            break Label_2566;
                                                        }
                                                        break Label_2709;
                                                    }
                                                    case 10: {
                                                        n6 = n;
                                                        if (this.u(i, o)) {
                                                            final zzjd zzjd3 = (zzjd)e8.j(n4, o);
                                                            n10 = com.google.android.gms.internal.measurement.d.a(n3 << 3);
                                                            n11 = zzjd3.zzd();
                                                            n12 = com.google.android.gms.internal.measurement.d.a(n11);
                                                            break Label_2419;
                                                        }
                                                        break Label_2709;
                                                    }
                                                    case 9: {
                                                        n6 = n;
                                                        if (this.u(i, o)) {
                                                            n7 = com.google.android.gms.internal.measurement.e.J(n3, this.k(i), e8.j(n4, o));
                                                            break Label_2704;
                                                        }
                                                        break Label_2709;
                                                    }
                                                    case 8: {
                                                        n6 = n;
                                                        if (!this.u(i, o)) {
                                                            break Label_2709;
                                                        }
                                                        final Object j3 = e8.j(n4, o);
                                                        if (j3 instanceof zzjd) {
                                                            final zzjd zzjd4 = (zzjd)j3;
                                                            n10 = com.google.android.gms.internal.measurement.d.a(n3 << 3);
                                                            n11 = zzjd4.zzd();
                                                            n12 = com.google.android.gms.internal.measurement.d.a(n11);
                                                            break Label_2419;
                                                        }
                                                        final String s2 = (String)j3;
                                                        n8 = com.google.android.gms.internal.measurement.d.a(n3 << 3);
                                                        n9 = com.google.android.gms.internal.measurement.d.t(s2);
                                                        break Label_2566;
                                                    }
                                                    case 7: {
                                                        n6 = n;
                                                        if (this.u(i, o)) {
                                                            n7 = com.google.android.gms.internal.measurement.d.a(n3 << 3);
                                                            break Label_2479;
                                                        }
                                                        break Label_2709;
                                                    }
                                                    case 6: {
                                                        n6 = n;
                                                        if (this.u(i, o)) {
                                                            n7 = com.google.android.gms.internal.measurement.d.a(n3 << 3);
                                                            break Label_2674;
                                                        }
                                                        break Label_2709;
                                                    }
                                                    case 5: {
                                                        n6 = n;
                                                        if (this.u(i, o)) {
                                                            n7 = com.google.android.gms.internal.measurement.d.a(n3 << 3);
                                                            break Label_2701;
                                                        }
                                                        break Label_2709;
                                                    }
                                                    case 4: {
                                                        n6 = n;
                                                        if (this.u(i, o)) {
                                                            final int g5 = e8.g(n4, o);
                                                            n8 = com.google.android.gms.internal.measurement.d.a(n3 << 3);
                                                            n9 = com.google.android.gms.internal.measurement.d.s(g5);
                                                            break Label_2566;
                                                        }
                                                        break Label_2709;
                                                    }
                                                    case 3: {
                                                        n6 = n;
                                                        if (this.u(i, o)) {
                                                            final long h2 = e8.h(n4, o);
                                                            n13 = com.google.android.gms.internal.measurement.d.a(n3 << 3);
                                                            n14 = com.google.android.gms.internal.measurement.d.b(h2);
                                                            break Label_2646;
                                                        }
                                                        break Label_2709;
                                                    }
                                                    case 2: {
                                                        n6 = n;
                                                        if (this.u(i, o)) {
                                                            final long h3 = e8.h(n4, o);
                                                            n13 = com.google.android.gms.internal.measurement.d.a(n3 << 3);
                                                            n14 = com.google.android.gms.internal.measurement.d.b(h3);
                                                            break Label_2646;
                                                        }
                                                        break Label_2709;
                                                    }
                                                    case 1: {
                                                        n6 = n;
                                                        if (this.u(i, o)) {
                                                            n7 = com.google.android.gms.internal.measurement.d.a(n3 << 3);
                                                            break Label_2674;
                                                        }
                                                        break Label_2709;
                                                    }
                                                    case 0: {
                                                        n6 = n;
                                                        if (this.u(i, o)) {
                                                            n7 = com.google.android.gms.internal.measurement.d.a(n3 << 3);
                                                            break Label_2701;
                                                        }
                                                        break Label_2709;
                                                    }
                                                }
                                                n17 = n15 + u2 + n16;
                                                break Label_2426;
                                            }
                                            n17 = n12 + n11 + n10;
                                        }
                                        n6 = n + n17;
                                        break Label_2709;
                                    }
                                    ++n7;
                                    break Label_2704;
                                }
                                n7 = n9 + n8;
                                break Label_2704;
                            }
                            n7 = n14 + n13;
                            break Label_2704;
                        }
                        n7 += 4;
                        break Label_2704;
                    }
                    n7 += 8;
                }
                n6 = n + n7;
            }
            i += 3;
            n = n6;
        }
        final u7 l2 = this.l;
        return l2.a((Object)l2.c(o)) + n;
    }
    
    public final void E(final Object o, final int n, final long n2) throws IOException {
        final Unsafe o2 = c7.o;
        final Object l = this.l(n);
        final Object object = o2.getObject(o, n2);
        if (!((zzlf)object).zze()) {
            final zzlf zzb = zzlf.zza().zzb();
            v6.b((Object)zzb, object);
            o2.putObject(o, n2, zzb);
        }
        final u6 u6 = (u6)l;
        throw null;
    }
    
    public final int F(final Object o, final byte[] array, int n, int n2, final int n3, final int n4, int n5, final int n6, final int n7, final long n8, final int n9, final e5 e5) throws IOException {
        final Unsafe o2 = c7.o;
        final long n10 = this.a[n9 + 2] & 0xFFFFF;
        switch (n7) {
            case 68: {
                if (n5 == 3) {
                    n = f5.c(this.k(n9), array, n, n2, (n3 & 0xFFFFFFF8) | 0x4, e5);
                    Object object;
                    if (o2.getInt(o, n10) == n4) {
                        object = o2.getObject(o, n8);
                    }
                    else {
                        object = null;
                    }
                    if (object == null) {
                        o2.putObject(o, n8, e5.c);
                    }
                    else {
                        o2.putObject(o, n8, i6.b(object, e5.c));
                    }
                    o2.putInt(o, n10, n4);
                    break;
                }
                break;
            }
            case 67: {
                if (n5 != 0) {
                    break;
                }
                n = f5.m(array, n, e5);
                o2.putObject(o, n8, l5.b(e5.b));
                o2.putInt(o, n10, n4);
                return n;
            }
            case 66: {
                if (n5 != 0) {
                    break;
                }
                n = f5.j(array, n, e5);
                o2.putObject(o, n8, l5.a(e5.a));
                o2.putInt(o, n10, n4);
                return n;
            }
            case 63: {
                if (n5 == 0) {
                    n = f5.j(array, n, e5);
                    n2 = e5.a;
                    n5 = n9 / 3;
                    final e6 e6 = (e6)this.b[n5 + n5 + 1];
                    if (e6 != null && !e6.b(n2)) {
                        y(o).c(n3, (Object)(long)n2);
                    }
                    else {
                        o2.putObject(o, n8, n2);
                        o2.putInt(o, n10, n4);
                    }
                    break;
                }
                break;
            }
            case 61: {
                if (n5 != 2) {
                    break;
                }
                n = f5.a(array, n, e5);
                o2.putObject(o, n8, e5.c);
                o2.putInt(o, n10, n4);
                return n;
            }
            case 60: {
                if (n5 == 2) {
                    n = f5.d(this.k(n9), array, n, n2, e5);
                    Object object2;
                    if (o2.getInt(o, n10) == n4) {
                        object2 = o2.getObject(o, n8);
                    }
                    else {
                        object2 = null;
                    }
                    if (object2 == null) {
                        o2.putObject(o, n8, e5.c);
                    }
                    else {
                        o2.putObject(o, n8, i6.b(object2, e5.c));
                    }
                    o2.putInt(o, n10, n4);
                    break;
                }
                break;
            }
            case 59: {
                if (n5 == 2) {
                    n = f5.j(array, n, e5);
                    n2 = e5.a;
                    if (n2 == 0) {
                        o2.putObject(o, n8, "");
                    }
                    else {
                        if ((n6 & 0x20000000) != 0x0 && !com.google.android.gms.internal.measurement.f.d(n, n + n2, array)) {
                            throw zzko.zzc();
                        }
                        o2.putObject(o, n8, new String(array, n, n2, i6.a));
                        n += n2;
                    }
                    o2.putInt(o, n10, n4);
                    break;
                }
                break;
            }
            case 58: {
                if (n5 == 0) {
                    n = f5.m(array, n, e5);
                    o2.putObject(o, n8, e5.b != 0L);
                    o2.putInt(o, n10, n4);
                    return n;
                }
                break;
            }
            case 57:
            case 64: {
                if (n5 != 5) {
                    break;
                }
                o2.putObject(o, n8, f5.b(n, array));
                o2.putInt(o, n10, n4);
                return n + 4;
            }
            case 56:
            case 65: {
                if (n5 != 1) {
                    break;
                }
                o2.putObject(o, n8, f5.n(n, array));
                o2.putInt(o, n10, n4);
                return n + 8;
            }
            case 55:
            case 62: {
                if (n5 != 0) {
                    break;
                }
                n = f5.j(array, n, e5);
                o2.putObject(o, n8, e5.a);
                o2.putInt(o, n10, n4);
                return n;
            }
            case 53:
            case 54: {
                if (n5 != 0) {
                    break;
                }
                n = f5.m(array, n, e5);
                o2.putObject(o, n8, e5.b);
                o2.putInt(o, n10, n4);
                return n;
            }
            case 52: {
                if (n5 != 5) {
                    break;
                }
                o2.putObject(o, n8, Float.intBitsToFloat(f5.b(n, array)));
                o2.putInt(o, n10, n4);
                return n + 4;
            }
            case 51: {
                if (n5 != 1) {
                    break;
                }
                o2.putObject(o, n8, Double.longBitsToDouble(f5.n(n, array)));
                o2.putInt(o, n10, n4);
                return n + 8;
            }
        }
        return n;
    }
    
    public final void G(final Object o, final byte[] array, int n, final int n2, final e5 e5) throws IOException {
        Object o2 = o;
        Unsafe o3 = c7.o;
        int n3 = 0;
        int n4 = -1;
        int i = n;
        n = -1;
        int n5 = 1048575;
        int n6 = 0;
        int int1 = 0;
        while (i < n2) {
            final int n7 = i + 1;
            int a = array[i];
            int k;
            if (a < 0) {
                k = f5.k(a, array, n7, e5);
                a = e5.a;
            }
            else {
                k = n7;
            }
            final int n8 = a >>> 3;
            final int n9 = a & 0x7;
            Label_0165: {
                if (n8 > n) {
                    n = n6 / 3;
                    if (n8 >= this.c && n8 <= this.d) {
                        n = this.I(n8, n);
                        break Label_0165;
                    }
                }
                else if (n8 >= this.c && n8 <= this.d) {
                    n = this.I(n8, n3);
                    break Label_0165;
                }
                n = n4;
            }
            Object o4 = null;
            Unsafe unsafe2 = null;
            Label_1336: {
                int n18 = 0;
                int n19 = 0;
                int n21 = 0;
                Label_1302: {
                    if (n != n4) {
                        final int[] a2 = this.a;
                        final int n10 = a2[n + 1];
                        final int n11 = n10 >>> 20 & 0xFF;
                        final long n12 = n10 & 0xFFFFF;
                        Label_1102: {
                            if (n11 <= 17) {
                                final int n13 = a2[n + 2];
                                final int n14 = n13 & 0xFFFFF;
                                int n15;
                                if (n14 != n5) {
                                    if (n5 != 1048575) {
                                        o3.putInt(o2, (long)n5, int1);
                                    }
                                    if (n14 != 1048575) {
                                        int1 = o3.getInt(o2, (long)n14);
                                    }
                                    n5 = n14;
                                    n15 = int1;
                                }
                                else {
                                    n15 = int1;
                                }
                                final Unsafe unsafe = o3;
                            Label_0944:
                                while (true) {
                                    Label_0915: {
                                        Label_0877: {
                                            switch (n11) {
                                                case 16: {
                                                    if (n9 == 0) {
                                                        final int n16 = f5.m(array, k, e5);
                                                        unsafe.putLong(o, n12, l5.b(e5.b));
                                                        break Label_0821;
                                                    }
                                                    break;
                                                }
                                                case 15: {
                                                    if (n9 == 0) {
                                                        final int n16 = f5.j(array, k, e5);
                                                        unsafe.putInt(o2, n12, l5.a(e5.a));
                                                        break Label_0821;
                                                    }
                                                    break;
                                                }
                                                case 12: {
                                                    if (n9 == 0) {
                                                        final int n16 = f5.j(array, k, e5);
                                                        unsafe.putInt(o2, n12, e5.a);
                                                        break Label_0821;
                                                    }
                                                    break;
                                                }
                                                case 10: {
                                                    if (n9 == 2) {
                                                        final int n16 = f5.a(array, k, e5);
                                                        unsafe.putObject(o2, n12, e5.c);
                                                        break Label_0821;
                                                    }
                                                    break;
                                                }
                                                case 9: {
                                                    if (n9 != 2) {
                                                        break;
                                                    }
                                                    final int n16 = f5.d(this.k(n), array, k, n2, e5);
                                                    final Object object = unsafe.getObject(o2, n12);
                                                    if (object == null) {
                                                        unsafe.putObject(o2, n12, e5.c);
                                                        break Label_0821;
                                                    }
                                                    unsafe.putObject(o2, n12, i6.b(object, e5.c));
                                                    break Label_0821;
                                                }
                                                case 8: {
                                                    if (n9 == 2) {
                                                        if ((n10 & 0x20000000) == 0x0) {
                                                            final int n16 = f5.g(array, k, e5);
                                                        }
                                                        else {
                                                            final int n16 = f5.h(array, k, e5);
                                                        }
                                                        unsafe.putObject(o2, n12, e5.c);
                                                        break Label_0821;
                                                    }
                                                    break;
                                                }
                                                case 7: {
                                                    if (n9 == 0) {
                                                        final int n16 = f5.m(array, k, e5);
                                                        e8.m(o2, n12, e5.b != 0L);
                                                        break Label_0821;
                                                    }
                                                    break;
                                                }
                                                case 6:
                                                case 13: {
                                                    if (n9 == 5) {
                                                        unsafe.putInt(o2, n12, f5.b(k, array));
                                                        break Label_0877;
                                                    }
                                                    break;
                                                }
                                                case 5:
                                                case 14: {
                                                    if (n9 == 1) {
                                                        unsafe.putLong(o, n12, f5.n(k, array));
                                                        final int n16 = k + 8;
                                                        break Label_0915;
                                                    }
                                                    break;
                                                }
                                                case 4:
                                                case 11: {
                                                    if (n9 == 0) {
                                                        final int n16 = f5.j(array, k, e5);
                                                        unsafe.putInt(o2, n12, e5.a);
                                                        break Label_0821;
                                                    }
                                                    break;
                                                }
                                                case 2:
                                                case 3: {
                                                    if (n9 == 0) {
                                                        final int n16 = f5.m(array, k, e5);
                                                        unsafe.putLong(o, n12, e5.b);
                                                        break Label_0821;
                                                    }
                                                    break;
                                                }
                                                case 1: {
                                                    if (n9 == 5) {
                                                        e8.o(o2, n12, Float.intBitsToFloat(f5.b(k, array)));
                                                        break Label_0877;
                                                    }
                                                    break;
                                                }
                                                case 0: {
                                                    if (n9 == 1) {
                                                        e8.n(o2, n12, Double.longBitsToDouble(f5.n(k, array)));
                                                        final int n16 = k + 8;
                                                        break Label_0915;
                                                    }
                                                    break;
                                                }
                                            }
                                            break Label_0944;
                                            final int n17 = n15 | 1 << (n13 >>> 20);
                                            int n16 = 0;
                                            i = n16;
                                            int1 = n17;
                                            break Label_1102;
                                        }
                                        final int n16 = k + 4;
                                    }
                                    continue;
                                }
                                n18 = k;
                                o4 = o2;
                                n19 = n5;
                                final int n20 = -1;
                                n21 = 0;
                                int1 = n15;
                                n3 = n;
                                n = n20;
                                unsafe2 = unsafe;
                                break Label_1302;
                            }
                            final Unsafe unsafe3 = o3;
                            int n22 = 0;
                            Label_1271: {
                                Label_1188: {
                                    if (n11 != 27) {
                                        if (n11 <= 49) {
                                            n22 = this.H(o, array, k, n2, a, n8, n9, n, n10, n11, n12, e5);
                                            if (n22 == k) {
                                                break Label_1271;
                                            }
                                            i = n22;
                                        }
                                        else if (n11 == 50) {
                                            if (n9 != 2) {
                                                break Label_1188;
                                            }
                                            this.E(o, n, n12);
                                            throw null;
                                        }
                                        else {
                                            n22 = this.F(o, array, k, n2, a, n8, n9, n10, n11, n12, n, e5);
                                            if (n22 == k) {
                                                break Label_1271;
                                            }
                                            i = n22;
                                        }
                                        unsafe2 = o3;
                                        n3 = 0;
                                        final int n23 = -1;
                                        o4 = o;
                                        n6 = n;
                                        n = n23;
                                        break Label_1336;
                                    }
                                    if (n9 == 2) {
                                        h6 h7;
                                        final h6 h6 = h7 = (h6)unsafe3.getObject(o2, n12);
                                        if (!h6.s()) {
                                            final int size = ((List)h6).size();
                                            int n24;
                                            if (size == 0) {
                                                n24 = 10;
                                            }
                                            else {
                                                n24 = size + size;
                                            }
                                            h7 = h6.h(n24);
                                            unsafe3.putObject(o2, n12, h7);
                                        }
                                        i = f5.e(this.k(n), a, array, k, n2, h7, e5);
                                        break Label_1102;
                                    }
                                }
                                n22 = k;
                            }
                            unsafe2 = o3;
                            final int n25 = 0;
                            final int n26 = -1;
                            o4 = o;
                            n18 = n22;
                            n3 = n;
                            n19 = n5;
                            n21 = n25;
                            n = n26;
                            break Label_1302;
                        }
                        n6 = n;
                        n = n8;
                        n4 = -1;
                        n3 = 0;
                        continue;
                    }
                    final int n27 = k;
                    n19 = n5;
                    n = n4;
                    final Unsafe unsafe4 = o3;
                    n21 = n3;
                    o4 = o2;
                    n18 = n27;
                    unsafe2 = unsafe4;
                }
                final int j = f5.i(a, array, n18, n2, y(o), e5);
                n6 = n3;
                n3 = n21;
                n5 = n19;
                i = j;
            }
            final Object o5 = o4;
            n4 = n;
            n = n8;
            o3 = unsafe2;
            o2 = o5;
        }
        if (n5 != 1048575) {
            o3.putInt(o2, (long)n5, int1);
        }
        if (i == n2) {
            return;
        }
        throw zzko.zze();
    }
    
    public final int H(Object a, final byte[] array, int i, int n, final int n2, int n3, int n4, final int n5, final long n6, final int n7, final long n8, final e5 e5) throws IOException {
        int n9 = i;
        final Unsafe o = c7.o;
        h6 h7;
        final h6 h6 = h7 = (h6)o.getObject(a, n8);
        if (!h6.s()) {
            final int size = ((List)h6).size();
            int n10;
            if (size == 0) {
                n10 = 10;
            }
            else {
                n10 = size + size;
            }
            h7 = h6.h(n10);
            o.putObject(a, n8, h7);
        }
        Label_2356: {
            switch (n7) {
                default: {
                    if (n4 == 3) {
                        final k7 k = this.k(n5);
                        n3 = ((n2 & 0xFFFFFFF8) | 0x4);
                        i = f5.c(k, array, i, n, n3, e5);
                        ((List<Object>)h7).add(e5.c);
                        while (i < n) {
                            n4 = f5.j(array, i, e5);
                            if (n2 != e5.a) {
                                break;
                            }
                            i = f5.c(k, array, n4, n, n3, e5);
                            ((List<zzjd>)h7).add((zzjd)e5.c);
                        }
                        return i;
                    }
                    return n9;
                }
                case 34:
                case 48: {
                    if (n4 == 2) {
                        final q6 q6 = (q6)h7;
                        i = f5.j(array, n9, e5);
                        n = e5.a + i;
                        while (i < n) {
                            i = f5.m(array, i, e5);
                            q6.c(l5.b(e5.b));
                        }
                        if (i == n) {
                            break;
                        }
                        throw zzko.zzf();
                    }
                    else {
                        if (n4 == 0) {
                            final q6 q7 = (q6)h7;
                            i = f5.m(array, n9, e5);
                            q7.c(l5.b(e5.b));
                            while (i < n) {
                                n3 = f5.j(array, i, e5);
                                if (n2 != e5.a) {
                                    break;
                                }
                                i = f5.m(array, n3, e5);
                                q7.c(l5.b(e5.b));
                            }
                            return i;
                        }
                        return n9;
                    }
                    break;
                }
                case 33:
                case 47: {
                    if (n4 == 2) {
                        final d6 d6 = (d6)h7;
                        i = f5.j(array, n9, e5);
                        n = e5.a + i;
                        while (i < n) {
                            i = f5.j(array, i, e5);
                            d6.d(l5.a(e5.a));
                        }
                        if (i == n) {
                            break;
                        }
                        throw zzko.zzf();
                    }
                    else {
                        if (n4 == 0) {
                            final d6 d7 = (d6)h7;
                            i = f5.j(array, n9, e5);
                            d7.d(l5.a(e5.a));
                            while (i < n) {
                                n3 = f5.j(array, i, e5);
                                if (n2 != e5.a) {
                                    break;
                                }
                                i = f5.j(array, n3, e5);
                                d7.d(l5.a(e5.a));
                            }
                            return i;
                        }
                        return n9;
                    }
                    break;
                }
                case 30:
                case 44: {
                    if (n4 == 2) {
                        i = f5.f(array, n9, h7, e5);
                    }
                    else {
                        if (n4 != 0) {
                            return n9;
                        }
                        i = f5.l(n2, array, i, n, h7, e5);
                    }
                    final c6 c6 = (c6)a;
                    v7 zzc;
                    if ((zzc = c6.zzc) == v7.f) {
                        zzc = null;
                    }
                    n = n5 / 3;
                    a = com.google.android.gms.internal.measurement.e.a(n3, h7, (e6)this.b[n + n + 1], zzc, this.l);
                    if (a == null) {
                        break;
                    }
                    c6.zzc = (v7)a;
                    return i;
                }
                case 28: {
                    if (n4 != 2) {
                        return n9;
                    }
                    n3 = f5.j(array, n9, e5);
                    i = e5.a;
                    if (i < 0) {
                        throw zzko.zzd();
                    }
                    if (i <= array.length - n3) {
                        while (true) {
                            Label_0776: {
                                if (i != 0) {
                                    ((List<zzjd>)h7).add(zzjd.zzl(array, n3, i));
                                    break Label_0776;
                                }
                                ((List<zzjd>)h7).add(zzjd.zzb);
                                i = n3;
                                while (i < n) {
                                    n3 = f5.j(array, i, e5);
                                    if (n2 != e5.a) {
                                        break;
                                    }
                                    i = f5.j(array, n3, e5);
                                    n4 = e5.a;
                                    if (n4 < 0) {
                                        throw zzko.zzd();
                                    }
                                    if (n4 > array.length - i) {
                                        throw zzko.zzf();
                                    }
                                    if (n4 != 0) {
                                        ((List<zzjd>)h7).add(zzjd.zzl(array, i, n4));
                                        n3 = i;
                                        i = n4;
                                        break Label_0776;
                                    }
                                    ((List<zzjd>)h7).add(zzjd.zzb);
                                }
                                return i;
                            }
                            i += n3;
                            continue;
                        }
                    }
                    throw zzko.zzf();
                }
                case 27: {
                    if (n4 != 2) {
                        return n9;
                    }
                    return f5.e(this.k(n5), n2, array, i, n, h7, e5);
                }
                case 26: {
                    if (n4 != 2) {
                        return n9;
                    }
                    if ((n6 & 0x20000000L) == 0x0L) {
                        i = f5.j(array, n9, e5);
                        n3 = e5.a;
                        if (n3 >= 0) {
                            while (true) {
                                Label_1011: {
                                    if (n3 != 0) {
                                        ((List<String>)h7).add(new String(array, i, n3, i6.a));
                                        break Label_1011;
                                    }
                                    ((List<String>)h7).add("");
                                    n3 = i;
                                    while (true) {
                                        i = n3;
                                        if (n3 >= n) {
                                            break Label_2356;
                                        }
                                        n4 = f5.j(array, n3, e5);
                                        i = n3;
                                        if (n2 != e5.a) {
                                            break Label_2356;
                                        }
                                        i = f5.j(array, n4, e5);
                                        n3 = e5.a;
                                        if (n3 < 0) {
                                            throw zzko.zzd();
                                        }
                                        if (n3 != 0) {
                                            ((List<String>)h7).add(new String(array, i, n3, i6.a));
                                            break;
                                        }
                                        ((List<String>)h7).add("");
                                        n3 = i;
                                    }
                                }
                                n3 += i;
                                continue;
                            }
                        }
                        throw zzko.zzd();
                    }
                    else {
                        n3 = f5.j(array, n9, e5);
                        n4 = e5.a;
                        if (n4 >= 0) {
                            while (true) {
                                Label_1206: {
                                    if (n4 == 0) {
                                        ((List<String>)h7).add("");
                                    }
                                    else {
                                        i = n3 + n4;
                                        if (com.google.android.gms.internal.measurement.f.d(n3, i, array)) {
                                            ((List<String>)h7).add(new String(array, n3, n4, i6.a));
                                            break Label_1206;
                                        }
                                        throw zzko.zzc();
                                    }
                                    while (true) {
                                        i = n3;
                                        if (n3 >= n) {
                                            break Label_2356;
                                        }
                                        n4 = f5.j(array, n3, e5);
                                        i = n3;
                                        if (n2 != e5.a) {
                                            break Label_2356;
                                        }
                                        n3 = f5.j(array, n4, e5);
                                        n4 = e5.a;
                                        if (n4 < 0) {
                                            throw zzko.zzd();
                                        }
                                        if (n4 == 0) {
                                            ((List<String>)h7).add("");
                                        }
                                        else {
                                            i = n3 + n4;
                                            if (com.google.android.gms.internal.measurement.f.d(n3, i, array)) {
                                                ((List<String>)h7).add(new String(array, n3, n4, i6.a));
                                                break;
                                            }
                                            throw zzko.zzc();
                                        }
                                    }
                                }
                                n3 = i;
                                continue;
                            }
                        }
                        throw zzko.zzd();
                    }
                    break;
                }
                case 25:
                case 42: {
                    if (n4 == 2) {
                        final g5 g5 = (g5)h7;
                        i = f5.j(array, n9, e5);
                        n = e5.a + i;
                        while (i < n) {
                            i = f5.m(array, i, e5);
                            g5.c(e5.b != 0L);
                        }
                        if (i == n) {
                            break;
                        }
                        throw zzko.zzf();
                    }
                    else {
                        if (n4 == 0) {
                            final g5 g6 = (g5)h7;
                            i = f5.m(array, n9, e5);
                            g6.c(e5.b != 0L);
                            while (i < n) {
                                n3 = f5.j(array, i, e5);
                                if (n2 != e5.a) {
                                    break;
                                }
                                i = f5.m(array, n3, e5);
                                g6.c(e5.b != 0L);
                            }
                            return i;
                        }
                        return n9;
                    }
                    break;
                }
                case 24:
                case 31:
                case 41:
                case 45: {
                    if (n4 == 2) {
                        final d6 d8 = (d6)h7;
                        for (i = f5.j(array, n9, e5), n = e5.a + i; i < n; i += 4) {
                            d8.d(f5.b(i, array));
                        }
                        if (i == n) {
                            break;
                        }
                        throw zzko.zzf();
                    }
                    else {
                        if (n4 == 5) {
                            final d6 d9 = (d6)h7;
                            d9.d(f5.b(n9, array));
                            while (true) {
                                i = n9 + 4;
                                if (i >= n) {
                                    break;
                                }
                                n9 = f5.j(array, i, e5);
                                if (n2 != e5.a) {
                                    break;
                                }
                                d9.d(f5.b(n9, array));
                            }
                            return i;
                        }
                        return n9;
                    }
                    break;
                }
                case 23:
                case 32:
                case 40:
                case 46: {
                    if (n4 == 2) {
                        final q6 q8 = (q6)h7;
                        for (i = f5.j(array, n9, e5), n = e5.a + i; i < n; i += 8) {
                            q8.c(f5.n(i, array));
                        }
                        if (i == n) {
                            break;
                        }
                        throw zzko.zzf();
                    }
                    else {
                        if (n4 == 1) {
                            final q6 q9 = (q6)h7;
                            q9.c(f5.n(n9, array));
                            i = n9;
                            while (true) {
                                n3 = i + 8;
                                if (n3 >= n) {
                                    break;
                                }
                                i = f5.j(array, n3, e5);
                                if (n2 != e5.a) {
                                    break;
                                }
                                q9.c(f5.n(i, array));
                            }
                            return n3;
                        }
                        return n9;
                    }
                    break;
                }
                case 22:
                case 29:
                case 39:
                case 43: {
                    if (n4 == 2) {
                        i = f5.f(array, n9, h7, e5);
                        break;
                    }
                    if (n4 != 0) {
                        return n9;
                    }
                    return f5.l(n2, array, i, n, h7, e5);
                }
                case 20:
                case 21:
                case 37:
                case 38: {
                    if (n4 == 2) {
                        final q6 q10 = (q6)h7;
                        i = f5.j(array, n9, e5);
                        n = e5.a + i;
                        while (i < n) {
                            i = f5.m(array, i, e5);
                            q10.c(e5.b);
                        }
                        if (i == n) {
                            break;
                        }
                        throw zzko.zzf();
                    }
                    else {
                        if (n4 == 0) {
                            final q6 q11 = (q6)h7;
                            i = f5.m(array, n9, e5);
                            q11.c(e5.b);
                            while (i < n) {
                                n3 = f5.j(array, i, e5);
                                if (n2 != e5.a) {
                                    break;
                                }
                                i = f5.m(array, n3, e5);
                                q11.c(e5.b);
                            }
                            return i;
                        }
                        return n9;
                    }
                    break;
                }
                case 19:
                case 36: {
                    if (n4 == 2) {
                        final v5 v5 = (v5)h7;
                        for (i = f5.j(array, n9, e5), n = e5.a + i; i < n; i += 4) {
                            v5.c(Float.intBitsToFloat(f5.b(i, array)));
                        }
                        if (i == n) {
                            break;
                        }
                        throw zzko.zzf();
                    }
                    else {
                        if (n4 == 5) {
                            final v5 v6 = (v5)h7;
                            v6.c(Float.intBitsToFloat(f5.b(n9, array)));
                            i = n9;
                            while (true) {
                                n3 = i + 4;
                                if (n3 >= n) {
                                    break;
                                }
                                i = f5.j(array, n3, e5);
                                if (n2 != e5.a) {
                                    break;
                                }
                                v6.c(Float.intBitsToFloat(f5.b(i, array)));
                            }
                            return n3;
                        }
                        return n9;
                    }
                    break;
                }
                case 18:
                case 35: {
                    if (n4 == 2) {
                        final n5 n11 = (n5)h7;
                        for (i = f5.j(array, n9, e5), n = e5.a + i; i < n; i += 8) {
                            n11.c(Double.longBitsToDouble(f5.n(i, array)));
                        }
                        if (i == n) {
                            break;
                        }
                        throw zzko.zzf();
                    }
                    else {
                        if (n4 == 1) {
                            final n5 n12 = (n5)h7;
                            n12.c(Double.longBitsToDouble(f5.n(n9, array)));
                            while (true) {
                                i = n9 + 8;
                                if (i >= n) {
                                    break;
                                }
                                n9 = f5.j(array, i, e5);
                                if (n2 != e5.a) {
                                    break;
                                }
                                n12.c(Double.longBitsToDouble(f5.n(n9, array)));
                            }
                            return i;
                        }
                        return n9;
                    }
                    break;
                }
            }
            return i;
            i = n9;
        }
        return i;
    }
    
    public final int I(final int n, int i) {
        int n2 = this.a.length / 3 - 1;
        while (i <= n2) {
            final int n3 = n2 + i >>> 1;
            final int n4 = n3 * 3;
            final int n5 = this.a[n4];
            if (n == n5) {
                return n4;
            }
            if (n < n5) {
                n2 = n3 - 1;
            }
            else {
                i = n3 + 1;
            }
        }
        return -1;
    }
    
    public final void a(final Object o) {
        int i = this.i;
        int j;
        while (true) {
            j = this.j;
            if (i >= j) {
                break;
            }
            final long n = this.i(this.h[i]) & 0xFFFFF;
            final Object k = e8.j(n, o);
            if (k != null) {
                ((zzlf)k).zzc();
                e8.q(o, n, k);
            }
            ++i;
        }
        for (int length = this.h.length, l = j; l < length; ++l) {
            this.k.a((long)this.h[l], o);
        }
        this.l.g(o);
        if (this.f) {
            this.m.b(o);
        }
    }
    
    public final int b(final Object o) {
        final int length = this.a.length;
        int i = 0;
        int n = 0;
        while (i < length) {
            final int j = this.i(i);
            final int n2 = this.a[i];
            final long n3 = 0xFFFFF & j;
            int n4 = 37;
            final int n5 = 1231;
            int n6 = 0;
            Label_1340: {
                int n7 = 0;
                int n8 = 0;
                Label_1213: {
                    Label_1209: {
                        switch (j >>> 20 & 0xFF) {
                            default: {
                                n6 = n;
                                break Label_1340;
                            }
                            case 68: {
                                n6 = n;
                                if (this.v(n2, i, o)) {
                                    n7 = n * 53;
                                    n8 = e8.j(n3, o).hashCode();
                                    break Label_1213;
                                }
                                break Label_1340;
                            }
                            case 67: {
                                n6 = n;
                                if (this.v(n2, i, o)) {
                                    n7 = n * 53;
                                    n8 = i6.a(j(n3, o));
                                    break Label_1213;
                                }
                                break Label_1340;
                            }
                            case 66: {
                                n6 = n;
                                if (this.v(n2, i, o)) {
                                    n7 = n * 53;
                                    n8 = D(n3, o);
                                    break Label_1213;
                                }
                                break Label_1340;
                            }
                            case 65: {
                                n6 = n;
                                if (this.v(n2, i, o)) {
                                    n7 = n * 53;
                                    n8 = i6.a(j(n3, o));
                                    break Label_1213;
                                }
                                break Label_1340;
                            }
                            case 64: {
                                n6 = n;
                                if (this.v(n2, i, o)) {
                                    n7 = n * 53;
                                    n8 = D(n3, o);
                                    break Label_1213;
                                }
                                break Label_1340;
                            }
                            case 63: {
                                n6 = n;
                                if (this.v(n2, i, o)) {
                                    n7 = n * 53;
                                    n8 = D(n3, o);
                                    break Label_1213;
                                }
                                break Label_1340;
                            }
                            case 62: {
                                n6 = n;
                                if (this.v(n2, i, o)) {
                                    n7 = n * 53;
                                    n8 = D(n3, o);
                                    break Label_1213;
                                }
                                break Label_1340;
                            }
                            case 61: {
                                n6 = n;
                                if (this.v(n2, i, o)) {
                                    n7 = n * 53;
                                    n8 = e8.j(n3, o).hashCode();
                                    break Label_1213;
                                }
                                break Label_1340;
                            }
                            case 60: {
                                n6 = n;
                                if (this.v(n2, i, o)) {
                                    n7 = n * 53;
                                    n8 = e8.j(n3, o).hashCode();
                                    break Label_1213;
                                }
                                break Label_1340;
                            }
                            case 59: {
                                n6 = n;
                                if (this.v(n2, i, o)) {
                                    n7 = n * 53;
                                    n8 = ((String)e8.j(n3, o)).hashCode();
                                    break Label_1213;
                                }
                                break Label_1340;
                            }
                            case 58: {
                                n6 = n;
                                if (!this.v(n2, i, o)) {
                                    break Label_1340;
                                }
                                final int n9 = n * 53;
                                final boolean booleanValue = (boolean)e8.j(n3, o);
                                final Charset a = i6.a;
                                n7 = n9;
                                if (booleanValue) {
                                    n7 = n9;
                                    n8 = n5;
                                    break Label_1213;
                                }
                                break Label_1209;
                            }
                            case 57: {
                                n6 = n;
                                if (this.v(n2, i, o)) {
                                    n7 = n * 53;
                                    n8 = D(n3, o);
                                    break Label_1213;
                                }
                                break Label_1340;
                            }
                            case 56: {
                                n6 = n;
                                if (this.v(n2, i, o)) {
                                    n7 = n * 53;
                                    n8 = i6.a(j(n3, o));
                                    break Label_1213;
                                }
                                break Label_1340;
                            }
                            case 55: {
                                n6 = n;
                                if (this.v(n2, i, o)) {
                                    n7 = n * 53;
                                    n8 = D(n3, o);
                                    break Label_1213;
                                }
                                break Label_1340;
                            }
                            case 54: {
                                n6 = n;
                                if (this.v(n2, i, o)) {
                                    n7 = n * 53;
                                    n8 = i6.a(j(n3, o));
                                    break Label_1213;
                                }
                                break Label_1340;
                            }
                            case 53: {
                                n6 = n;
                                if (this.v(n2, i, o)) {
                                    n7 = n * 53;
                                    n8 = i6.a(j(n3, o));
                                    break Label_1213;
                                }
                                break Label_1340;
                            }
                            case 52: {
                                n6 = n;
                                if (this.v(n2, i, o)) {
                                    n7 = n * 53;
                                    n8 = Float.floatToIntBits((float)e8.j(n3, o));
                                    break Label_1213;
                                }
                                break Label_1340;
                            }
                            case 51: {
                                n6 = n;
                                if (this.v(n2, i, o)) {
                                    n7 = n * 53;
                                    n8 = i6.a(Double.doubleToLongBits((double)e8.j(n3, o)));
                                    break Label_1213;
                                }
                                break Label_1340;
                            }
                            case 50: {
                                n7 = n * 53;
                                n8 = e8.j(n3, o).hashCode();
                                break Label_1213;
                            }
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49: {
                                n7 = n * 53;
                                n8 = e8.j(n3, o).hashCode();
                                break Label_1213;
                            }
                            case 17: {
                                final Object k = e8.j(n3, o);
                                if (k != null) {
                                    n4 = k.hashCode();
                                    break;
                                }
                                break;
                            }
                            case 16: {
                                n7 = n * 53;
                                n8 = i6.a(e8.h(n3, o));
                                break Label_1213;
                            }
                            case 15: {
                                n7 = n * 53;
                                n8 = e8.g(n3, o);
                                break Label_1213;
                            }
                            case 14: {
                                n7 = n * 53;
                                n8 = i6.a(e8.h(n3, o));
                                break Label_1213;
                            }
                            case 13: {
                                n7 = n * 53;
                                n8 = e8.g(n3, o);
                                break Label_1213;
                            }
                            case 12: {
                                n7 = n * 53;
                                n8 = e8.g(n3, o);
                                break Label_1213;
                            }
                            case 11: {
                                n7 = n * 53;
                                n8 = e8.g(n3, o);
                                break Label_1213;
                            }
                            case 10: {
                                n7 = n * 53;
                                n8 = e8.j(n3, o).hashCode();
                                break Label_1213;
                            }
                            case 9: {
                                final Object l = e8.j(n3, o);
                                if (l != null) {
                                    n4 = l.hashCode();
                                    break;
                                }
                                break;
                            }
                            case 8: {
                                n7 = n * 53;
                                n8 = ((String)e8.j(n3, o)).hashCode();
                                break Label_1213;
                            }
                            case 7: {
                                final int n10 = n * 53;
                                final boolean s = e8.s(n3, o);
                                final Charset a2 = i6.a;
                                n7 = n10;
                                if (s) {
                                    n7 = n10;
                                    n8 = n5;
                                    break Label_1213;
                                }
                                break Label_1209;
                            }
                            case 6: {
                                n7 = n * 53;
                                n8 = e8.g(n3, o);
                                break Label_1213;
                            }
                            case 5: {
                                n7 = n * 53;
                                n8 = i6.a(e8.h(n3, o));
                                break Label_1213;
                            }
                            case 4: {
                                n7 = n * 53;
                                n8 = e8.g(n3, o);
                                break Label_1213;
                            }
                            case 3: {
                                n7 = n * 53;
                                n8 = i6.a(e8.h(n3, o));
                                break Label_1213;
                            }
                            case 2: {
                                n7 = n * 53;
                                n8 = i6.a(e8.h(n3, o));
                                break Label_1213;
                            }
                            case 1: {
                                n7 = n * 53;
                                n8 = Float.floatToIntBits(e8.f(n3, o));
                                break Label_1213;
                            }
                            case 0: {
                                n7 = n * 53;
                                n8 = i6.a(Double.doubleToLongBits(e8.e(n3, o)));
                                break Label_1213;
                            }
                        }
                        n6 = n * 53 + n4;
                        break Label_1340;
                    }
                    n8 = 1237;
                }
                n6 = n8 + n7;
            }
            i += 3;
            n = n6;
        }
        final int hashCode = this.l.c(o).hashCode();
        if (!this.f) {
            return hashCode + n * 53;
        }
        this.m.a(o);
        throw null;
    }
    
    public final int c(final Object o) {
        int n;
        if (this.g) {
            n = this.C(o);
        }
        else {
            n = this.B(o);
        }
        return n;
    }
    
    public final void d(final Object o, final Object o2) {
        o2.getClass();
        for (int i = 0; i < this.a.length; i += 3) {
            final int j = this.i(i);
            final long n = 0xFFFFF & j;
            final int n2 = this.a[i];
            switch (j >>> 20 & 0xFF) {
                case 68: {
                    this.o(i, o, o2);
                    break;
                }
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67: {
                    if (this.v(n2, i, o2)) {
                        e8.q(o, n, e8.j(n, o2));
                        this.q(n2, i, o);
                        break;
                    }
                    break;
                }
                case 60: {
                    this.o(i, o, o2);
                    break;
                }
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59: {
                    if (this.v(n2, i, o2)) {
                        e8.q(o, n, e8.j(n, o2));
                        this.q(n2, i, o);
                        break;
                    }
                    break;
                }
                case 50: {
                    final Class a = com.google.android.gms.internal.measurement.e.a;
                    e8.q(o, n, (Object)v6.b(e8.j(n, o), e8.j(n, o2)));
                    break;
                }
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49: {
                    this.k.b(o, n, o2);
                    break;
                }
                case 17: {
                    this.n(i, o, o2);
                    break;
                }
                case 16: {
                    if (this.u(i, o2)) {
                        e8.c.o(o, n, e8.h(n, o2));
                        this.p(i, o);
                        break;
                    }
                    break;
                }
                case 15: {
                    if (this.u(i, o2)) {
                        e8.p(o, e8.g(n, o2), n);
                        this.p(i, o);
                        break;
                    }
                    break;
                }
                case 14: {
                    if (this.u(i, o2)) {
                        e8.c.o(o, n, e8.h(n, o2));
                        this.p(i, o);
                        break;
                    }
                    break;
                }
                case 13: {
                    if (this.u(i, o2)) {
                        e8.p(o, e8.g(n, o2), n);
                        this.p(i, o);
                        break;
                    }
                    break;
                }
                case 12: {
                    if (this.u(i, o2)) {
                        e8.p(o, e8.g(n, o2), n);
                        this.p(i, o);
                        break;
                    }
                    break;
                }
                case 11: {
                    if (this.u(i, o2)) {
                        e8.p(o, e8.g(n, o2), n);
                        this.p(i, o);
                        break;
                    }
                    break;
                }
                case 10: {
                    if (this.u(i, o2)) {
                        e8.q(o, n, e8.j(n, o2));
                        this.p(i, o);
                        break;
                    }
                    break;
                }
                case 9: {
                    this.n(i, o, o2);
                    break;
                }
                case 8: {
                    if (this.u(i, o2)) {
                        e8.q(o, n, e8.j(n, o2));
                        this.p(i, o);
                        break;
                    }
                    break;
                }
                case 7: {
                    if (this.u(i, o2)) {
                        e8.m(o, n, e8.s(n, o2));
                        this.p(i, o);
                        break;
                    }
                    break;
                }
                case 6: {
                    if (this.u(i, o2)) {
                        e8.p(o, e8.g(n, o2), n);
                        this.p(i, o);
                        break;
                    }
                    break;
                }
                case 5: {
                    if (this.u(i, o2)) {
                        e8.c.o(o, n, e8.h(n, o2));
                        this.p(i, o);
                        break;
                    }
                    break;
                }
                case 4: {
                    if (this.u(i, o2)) {
                        e8.p(o, e8.g(n, o2), n);
                        this.p(i, o);
                        break;
                    }
                    break;
                }
                case 3: {
                    if (this.u(i, o2)) {
                        e8.c.o(o, n, e8.h(n, o2));
                        this.p(i, o);
                        break;
                    }
                    break;
                }
                case 2: {
                    if (this.u(i, o2)) {
                        e8.c.o(o, n, e8.h(n, o2));
                        this.p(i, o);
                        break;
                    }
                    break;
                }
                case 1: {
                    if (this.u(i, o2)) {
                        e8.o(o, n, e8.f(n, o2));
                        this.p(i, o);
                        break;
                    }
                    break;
                }
                case 0: {
                    if (this.u(i, o2)) {
                        e8.n(o, n, e8.e(n, o2));
                        this.p(i, o);
                        break;
                    }
                    break;
                }
            }
        }
        final u7 l = this.l;
        final Class a2 = com.google.android.gms.internal.measurement.e.a;
        l.h(o, l.d((Object)l.c(o), (Object)l.c(o2)));
        if (!this.f) {
            return;
        }
        this.m.a(o2);
        throw null;
    }
    
    public final boolean e(final Object o, final Object o2) {
        for (int length = this.a.length, i = 0; i < length; i += 3) {
            final int j = this.i(i);
            final long n = j & 0xFFFFF;
            boolean b = false;
            switch (j >>> 20 & 0xFF) {
                default: {
                    continue;
                }
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68: {
                    final long n2 = this.a[i + 2] & 0xFFFFF;
                    if (e8.g(n2, o) != e8.g(n2, o2)) {
                        return false;
                    }
                    if (!com.google.android.gms.internal.measurement.e.t(e8.j(n, o), e8.j(n, o2))) {
                        return false;
                    }
                    continue;
                }
                case 50: {
                    b = com.google.android.gms.internal.measurement.e.t(e8.j(n, o), e8.j(n, o2));
                    break;
                }
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49: {
                    b = com.google.android.gms.internal.measurement.e.t(e8.j(n, o), e8.j(n, o2));
                    break;
                }
                case 17: {
                    if (this.s(i, o, o2) && com.google.android.gms.internal.measurement.e.t(e8.j(n, o), e8.j(n, o2))) {
                        continue;
                    }
                    return false;
                }
                case 16: {
                    if (this.s(i, o, o2) && e8.h(n, o) == e8.h(n, o2)) {
                        continue;
                    }
                    return false;
                }
                case 15: {
                    if (this.s(i, o, o2) && e8.g(n, o) == e8.g(n, o2)) {
                        continue;
                    }
                    return false;
                }
                case 14: {
                    if (this.s(i, o, o2) && e8.h(n, o) == e8.h(n, o2)) {
                        continue;
                    }
                    return false;
                }
                case 13: {
                    if (this.s(i, o, o2) && e8.g(n, o) == e8.g(n, o2)) {
                        continue;
                    }
                    return false;
                }
                case 12: {
                    if (this.s(i, o, o2) && e8.g(n, o) == e8.g(n, o2)) {
                        continue;
                    }
                    return false;
                }
                case 11: {
                    if (this.s(i, o, o2) && e8.g(n, o) == e8.g(n, o2)) {
                        continue;
                    }
                    return false;
                }
                case 10: {
                    if (this.s(i, o, o2) && com.google.android.gms.internal.measurement.e.t(e8.j(n, o), e8.j(n, o2))) {
                        continue;
                    }
                    return false;
                }
                case 9: {
                    if (this.s(i, o, o2) && com.google.android.gms.internal.measurement.e.t(e8.j(n, o), e8.j(n, o2))) {
                        continue;
                    }
                    return false;
                }
                case 8: {
                    if (this.s(i, o, o2) && com.google.android.gms.internal.measurement.e.t(e8.j(n, o), e8.j(n, o2))) {
                        continue;
                    }
                    return false;
                }
                case 7: {
                    if (this.s(i, o, o2) && e8.s(n, o) == e8.s(n, o2)) {
                        continue;
                    }
                    return false;
                }
                case 6: {
                    if (this.s(i, o, o2) && e8.g(n, o) == e8.g(n, o2)) {
                        continue;
                    }
                    return false;
                }
                case 5: {
                    if (this.s(i, o, o2) && e8.h(n, o) == e8.h(n, o2)) {
                        continue;
                    }
                    return false;
                }
                case 4: {
                    if (this.s(i, o, o2) && e8.g(n, o) == e8.g(n, o2)) {
                        continue;
                    }
                    return false;
                }
                case 3: {
                    if (this.s(i, o, o2) && e8.h(n, o) == e8.h(n, o2)) {
                        continue;
                    }
                    return false;
                }
                case 2: {
                    if (this.s(i, o, o2) && e8.h(n, o) == e8.h(n, o2)) {
                        continue;
                    }
                    return false;
                }
                case 1: {
                    if (this.s(i, o, o2) && Float.floatToIntBits(e8.f(n, o)) == Float.floatToIntBits(e8.f(n, o2))) {
                        continue;
                    }
                    return false;
                }
                case 0: {
                    if (this.s(i, o, o2) && Double.doubleToLongBits(e8.e(n, o)) == Double.doubleToLongBits(e8.e(n, o2))) {
                        continue;
                    }
                    return false;
                }
            }
            if (!b) {
                return false;
            }
        }
        if (!this.l.c(o).equals((Object)this.l.c(o2))) {
            return false;
        }
        if (!this.f) {
            return true;
        }
        this.m.a(o);
        this.m.a(o2);
        throw null;
    }
    
    public final boolean f(final Object o) {
        int n = 0;
        int int1 = 0;
        int n2 = 1048575;
        while (true) {
            final int i = this.i;
            final int n3 = 1;
            if (n < i) {
                final int n4 = this.h[n];
                final int n5 = this.a[n4];
                final int j = this.i(n4);
                final int n6 = this.a[n4 + 2];
                final int n7 = n6 & 0xFFFFF;
                final int n8 = 1 << (n6 >>> 20);
                int n9 = n2;
                int n10 = int1;
                if (n7 != n2) {
                    if (n7 != 1048575) {
                        int1 = c7.o.getInt(o, (long)n7);
                    }
                    n9 = n7;
                    n10 = int1;
                }
                if ((0x10000000 & j) != 0x0) {
                    boolean u;
                    if (n9 == 1048575) {
                        u = this.u(n4, o);
                    }
                    else {
                        u = ((n10 & n8) != 0x0);
                    }
                    if (!u) {
                        return false;
                    }
                }
                final int n11 = j >>> 20 & 0xFF;
                Label_0435: {
                    if (n11 != 9 && n11 != 17) {
                        if (n11 != 27) {
                            if (n11 != 60 && n11 != 68) {
                                if (n11 != 49) {
                                    if (n11 != 50) {
                                        break Label_0435;
                                    }
                                    if (((HashMap)e8.j((long)(j & 0xFFFFF), o)).isEmpty()) {
                                        break Label_0435;
                                    }
                                    final u6 u2 = (u6)this.l(n4);
                                    throw null;
                                }
                            }
                            else {
                                if (this.v(n5, n4, o) && !this.k(n4).f(e8.j((long)(j & 0xFFFFF), o))) {
                                    return false;
                                }
                                break Label_0435;
                            }
                        }
                        final List list = (List)e8.j((long)(j & 0xFFFFF), o);
                        if (!list.isEmpty()) {
                            final k7 k = this.k(n4);
                            for (int l = 0; l < list.size(); ++l) {
                                if (!k.f(list.get(l))) {
                                    return false;
                                }
                            }
                        }
                    }
                    else {
                        int u3;
                        if (n9 == 1048575) {
                            u3 = (this.u(n4, o) ? 1 : 0);
                        }
                        else if ((n10 & n8) != 0x0) {
                            u3 = n3;
                        }
                        else {
                            u3 = 0;
                        }
                        if (u3 != 0 && !this.k(n4).f(e8.j((long)(j & 0xFFFFF), o))) {
                            return false;
                        }
                    }
                }
                ++n;
                n2 = n9;
                int1 = n10;
            }
            else {
                if (!this.f) {
                    return true;
                }
                this.m.a(o);
                throw null;
            }
        }
    }
    
    public final void g(final Object o, final m5 m5) throws IOException {
        if (!this.g) {
            this.r(o, m5);
            return;
        }
        if (!this.f) {
            for (int length = this.a.length, i = 0; i < length; i += 3) {
                final int j = this.i(i);
                final int n = this.a[i];
                switch (j >>> 20 & 0xFF) {
                    case 68: {
                        if (this.v(n, i, o)) {
                            m5.l(n, this.k(i), e8.j((long)(j & 0xFFFFF), o));
                            break;
                        }
                        break;
                    }
                    case 67: {
                        if (this.v(n, i, o)) {
                            m5.b(n, j(j & 0xFFFFF, o));
                            break;
                        }
                        break;
                    }
                    case 66: {
                        if (this.v(n, i, o)) {
                            m5.a(n, D(j & 0xFFFFF, o));
                            break;
                        }
                        break;
                    }
                    case 65: {
                        if (this.v(n, i, o)) {
                            m5.q(n, j(j & 0xFFFFF, o));
                            break;
                        }
                        break;
                    }
                    case 64: {
                        if (this.v(n, i, o)) {
                            m5.p(n, D(j & 0xFFFFF, o));
                            break;
                        }
                        break;
                    }
                    case 63: {
                        if (this.v(n, i, o)) {
                            m5.h(n, D(j & 0xFFFFF, o));
                            break;
                        }
                        break;
                    }
                    case 62: {
                        if (this.v(n, i, o)) {
                            m5.c(n, D(j & 0xFFFFF, o));
                            break;
                        }
                        break;
                    }
                    case 61: {
                        if (this.v(n, i, o)) {
                            m5.f(n, (zzjd)e8.j((long)(j & 0xFFFFF), o));
                            break;
                        }
                        break;
                    }
                    case 60: {
                        if (this.v(n, i, o)) {
                            m5.o(n, this.k(i), e8.j((long)(j & 0xFFFFF), o));
                            break;
                        }
                        break;
                    }
                    case 59: {
                        if (this.v(n, i, o)) {
                            w(n, e8.j((long)(j & 0xFFFFF), o), m5);
                            break;
                        }
                        break;
                    }
                    case 58: {
                        if (this.v(n, i, o)) {
                            m5.e(n, (boolean)e8.j((long)(j & 0xFFFFF), o));
                            break;
                        }
                        break;
                    }
                    case 57: {
                        if (this.v(n, i, o)) {
                            m5.i(n, D(j & 0xFFFFF, o));
                            break;
                        }
                        break;
                    }
                    case 56: {
                        if (this.v(n, i, o)) {
                            m5.j(n, j(j & 0xFFFFF, o));
                            break;
                        }
                        break;
                    }
                    case 55: {
                        if (this.v(n, i, o)) {
                            m5.m(n, D(j & 0xFFFFF, o));
                            break;
                        }
                        break;
                    }
                    case 54: {
                        if (this.v(n, i, o)) {
                            m5.d(n, j(j & 0xFFFFF, o));
                            break;
                        }
                        break;
                    }
                    case 53: {
                        if (this.v(n, i, o)) {
                            m5.n(n, j(j & 0xFFFFF, o));
                            break;
                        }
                        break;
                    }
                    case 52: {
                        if (this.v(n, i, o)) {
                            m5.k((float)e8.j((long)(j & 0xFFFFF), o), n);
                            break;
                        }
                        break;
                    }
                    case 51: {
                        if (this.v(n, i, o)) {
                            m5.g((double)e8.j((long)(j & 0xFFFFF), o), n);
                            break;
                        }
                        break;
                    }
                    case 50: {
                        if (e8.j((long)(j & 0xFFFFF), o) == null) {
                            break;
                        }
                        final u6 u6 = (u6)this.l(i);
                        throw null;
                    }
                    case 49: {
                        com.google.android.gms.internal.measurement.e.i(n, (List)e8.j((long)(j & 0xFFFFF), o), m5, this.k(i));
                        break;
                    }
                    case 48: {
                        com.google.android.gms.internal.measurement.e.p(n, (List)e8.j((long)(j & 0xFFFFF), o), m5, true);
                        break;
                    }
                    case 47: {
                        com.google.android.gms.internal.measurement.e.o(n, (List)e8.j((long)(j & 0xFFFFF), o), m5, true);
                        break;
                    }
                    case 46: {
                        com.google.android.gms.internal.measurement.e.n(n, (List)e8.j((long)(j & 0xFFFFF), o), m5, true);
                        break;
                    }
                    case 45: {
                        com.google.android.gms.internal.measurement.e.m(n, (List)e8.j((long)(j & 0xFFFFF), o), m5, true);
                        break;
                    }
                    case 44: {
                        com.google.android.gms.internal.measurement.e.e(n, (List)e8.j((long)(j & 0xFFFFF), o), m5, true);
                        break;
                    }
                    case 43: {
                        com.google.android.gms.internal.measurement.e.r(n, (List)e8.j((long)(j & 0xFFFFF), o), m5, true);
                        break;
                    }
                    case 42: {
                        com.google.android.gms.internal.measurement.e.b(n, (List)e8.j((long)(j & 0xFFFFF), o), m5, true);
                        break;
                    }
                    case 41: {
                        com.google.android.gms.internal.measurement.e.f(n, (List)e8.j((long)(j & 0xFFFFF), o), m5, true);
                        break;
                    }
                    case 40: {
                        com.google.android.gms.internal.measurement.e.g(n, (List)e8.j((long)(j & 0xFFFFF), o), m5, true);
                        break;
                    }
                    case 39: {
                        com.google.android.gms.internal.measurement.e.j(n, (List)e8.j((long)(j & 0xFFFFF), o), m5, true);
                        break;
                    }
                    case 38: {
                        com.google.android.gms.internal.measurement.e.s(n, (List)e8.j((long)(j & 0xFFFFF), o), m5, true);
                        break;
                    }
                    case 37: {
                        com.google.android.gms.internal.measurement.e.k(n, (List)e8.j((long)(j & 0xFFFFF), o), m5, true);
                        break;
                    }
                    case 36: {
                        com.google.android.gms.internal.measurement.e.h(n, (List)e8.j((long)(j & 0xFFFFF), o), m5, true);
                        break;
                    }
                    case 35: {
                        com.google.android.gms.internal.measurement.e.d(n, (List)e8.j((long)(j & 0xFFFFF), o), m5, true);
                        break;
                    }
                    case 34: {
                        com.google.android.gms.internal.measurement.e.p(n, (List)e8.j((long)(j & 0xFFFFF), o), m5, false);
                        break;
                    }
                    case 33: {
                        com.google.android.gms.internal.measurement.e.o(n, (List)e8.j((long)(j & 0xFFFFF), o), m5, false);
                        break;
                    }
                    case 32: {
                        com.google.android.gms.internal.measurement.e.n(n, (List)e8.j((long)(j & 0xFFFFF), o), m5, false);
                        break;
                    }
                    case 31: {
                        com.google.android.gms.internal.measurement.e.m(n, (List)e8.j((long)(j & 0xFFFFF), o), m5, false);
                        break;
                    }
                    case 30: {
                        com.google.android.gms.internal.measurement.e.e(n, (List)e8.j((long)(j & 0xFFFFF), o), m5, false);
                        break;
                    }
                    case 29: {
                        com.google.android.gms.internal.measurement.e.r(n, (List)e8.j((long)(j & 0xFFFFF), o), m5, false);
                        break;
                    }
                    case 28: {
                        com.google.android.gms.internal.measurement.e.c(n, (List)e8.j((long)(j & 0xFFFFF), o), m5);
                        break;
                    }
                    case 27: {
                        com.google.android.gms.internal.measurement.e.l(n, (List)e8.j((long)(j & 0xFFFFF), o), m5, this.k(i));
                        break;
                    }
                    case 26: {
                        com.google.android.gms.internal.measurement.e.q(n, (List)e8.j((long)(j & 0xFFFFF), o), m5);
                        break;
                    }
                    case 25: {
                        com.google.android.gms.internal.measurement.e.b(n, (List)e8.j((long)(j & 0xFFFFF), o), m5, false);
                        break;
                    }
                    case 24: {
                        com.google.android.gms.internal.measurement.e.f(n, (List)e8.j((long)(j & 0xFFFFF), o), m5, false);
                        break;
                    }
                    case 23: {
                        com.google.android.gms.internal.measurement.e.g(n, (List)e8.j((long)(j & 0xFFFFF), o), m5, false);
                        break;
                    }
                    case 22: {
                        com.google.android.gms.internal.measurement.e.j(n, (List)e8.j((long)(j & 0xFFFFF), o), m5, false);
                        break;
                    }
                    case 21: {
                        com.google.android.gms.internal.measurement.e.s(n, (List)e8.j((long)(j & 0xFFFFF), o), m5, false);
                        break;
                    }
                    case 20: {
                        com.google.android.gms.internal.measurement.e.k(n, (List)e8.j((long)(j & 0xFFFFF), o), m5, false);
                        break;
                    }
                    case 19: {
                        com.google.android.gms.internal.measurement.e.h(n, (List)e8.j((long)(j & 0xFFFFF), o), m5, false);
                        break;
                    }
                    case 18: {
                        com.google.android.gms.internal.measurement.e.d(n, (List)e8.j((long)(j & 0xFFFFF), o), m5, false);
                        break;
                    }
                    case 17: {
                        if (this.u(i, o)) {
                            m5.l(n, this.k(i), e8.j((long)(j & 0xFFFFF), o));
                            break;
                        }
                        break;
                    }
                    case 16: {
                        if (this.u(i, o)) {
                            m5.b(n, e8.h((long)(j & 0xFFFFF), o));
                            break;
                        }
                        break;
                    }
                    case 15: {
                        if (this.u(i, o)) {
                            m5.a(n, e8.g((long)(j & 0xFFFFF), o));
                            break;
                        }
                        break;
                    }
                    case 14: {
                        if (this.u(i, o)) {
                            m5.q(n, e8.h((long)(j & 0xFFFFF), o));
                            break;
                        }
                        break;
                    }
                    case 13: {
                        if (this.u(i, o)) {
                            m5.p(n, e8.g((long)(j & 0xFFFFF), o));
                            break;
                        }
                        break;
                    }
                    case 12: {
                        if (this.u(i, o)) {
                            m5.h(n, e8.g((long)(j & 0xFFFFF), o));
                            break;
                        }
                        break;
                    }
                    case 11: {
                        if (this.u(i, o)) {
                            m5.c(n, e8.g((long)(j & 0xFFFFF), o));
                            break;
                        }
                        break;
                    }
                    case 10: {
                        if (this.u(i, o)) {
                            m5.f(n, (zzjd)e8.j((long)(j & 0xFFFFF), o));
                            break;
                        }
                        break;
                    }
                    case 9: {
                        if (this.u(i, o)) {
                            m5.o(n, this.k(i), e8.j((long)(j & 0xFFFFF), o));
                            break;
                        }
                        break;
                    }
                    case 8: {
                        if (this.u(i, o)) {
                            w(n, e8.j((long)(j & 0xFFFFF), o), m5);
                            break;
                        }
                        break;
                    }
                    case 7: {
                        if (this.u(i, o)) {
                            m5.e(n, e8.s((long)(j & 0xFFFFF), o));
                            break;
                        }
                        break;
                    }
                    case 6: {
                        if (this.u(i, o)) {
                            m5.i(n, e8.g((long)(j & 0xFFFFF), o));
                            break;
                        }
                        break;
                    }
                    case 5: {
                        if (this.u(i, o)) {
                            m5.j(n, e8.h((long)(j & 0xFFFFF), o));
                            break;
                        }
                        break;
                    }
                    case 4: {
                        if (this.u(i, o)) {
                            m5.m(n, e8.g((long)(j & 0xFFFFF), o));
                            break;
                        }
                        break;
                    }
                    case 3: {
                        if (this.u(i, o)) {
                            m5.d(n, e8.h((long)(j & 0xFFFFF), o));
                            break;
                        }
                        break;
                    }
                    case 2: {
                        if (this.u(i, o)) {
                            m5.n(n, e8.h((long)(j & 0xFFFFF), o));
                            break;
                        }
                        break;
                    }
                    case 1: {
                        if (this.u(i, o)) {
                            m5.k(e8.f((long)(j & 0xFFFFF), o), n);
                            break;
                        }
                        break;
                    }
                    case 0: {
                        if (this.u(i, o)) {
                            m5.g(e8.e((long)(j & 0xFFFFF), o), n);
                            break;
                        }
                        break;
                    }
                }
            }
            final u7 l = this.l;
            l.i((Object)l.c(o), m5);
            return;
        }
        this.m.a(o);
        throw null;
    }
    
    public final void h(final Object o, final byte[] array, final int n, final int n2, final e5 e5) throws IOException {
        if (this.g) {
            this.G(o, array, n, n2, e5);
            return;
        }
        this.x(o, array, n, n2, 0, e5);
    }
    
    public final int i(final int n) {
        return this.a[n + 1];
    }
    
    public final k7 k(int n) {
        n /= 3;
        n += n;
        final Object[] b = this.b;
        final k7 k7 = (k7)b[n];
        if (k7 != null) {
            return k7;
        }
        return (k7)(this.b[n] = h7.c.a((Class)b[n + 1]));
    }
    
    public final Object l(int n) {
        n /= 3;
        return this.b[n + n];
    }
    
    public final void n(final int n, final Object o, Object j) {
        final long n2 = this.i(n) & 0xFFFFF;
        if (!this.u(n, j)) {
            return;
        }
        final Object i = e8.j(n2, o);
        j = e8.j(n2, j);
        if (i != null && j != null) {
            e8.q(o, n2, (Object)i6.b(i, j));
            this.p(n, o);
            return;
        }
        if (j != null) {
            e8.q(o, n2, j);
            this.p(n, o);
        }
    }
    
    public final void o(final int n, final Object o, Object j) {
        final int i = this.i(n);
        final int n2 = this.a[n];
        final long n3 = i & 0xFFFFF;
        if (!this.v(n2, n, j)) {
            return;
        }
        Object k;
        if (this.v(n2, n, o)) {
            k = e8.j(n3, o);
        }
        else {
            k = null;
        }
        j = e8.j(n3, j);
        if (k != null && j != null) {
            e8.q(o, n3, (Object)i6.b(k, j));
            this.q(n2, n, o);
            return;
        }
        if (j != null) {
            e8.q(o, n3, j);
            this.q(n2, n, o);
        }
    }
    
    public final void p(int n, final Object o) {
        n = this.a[n + 2];
        final long n2 = 0xFFFFF & n;
        if (n2 == 1048575L) {
            return;
        }
        e8.p(o, 1 << (n >>> 20) | e8.g(n2, o), n2);
    }
    
    public final void q(final int n, final int n2, final Object o) {
        e8.p(o, n, (long)(this.a[n2 + 2] & 0xFFFFF));
    }
    
    public final void r(final Object o, final m5 m5) throws IOException {
        if (!this.f) {
            final int length = this.a.length;
            final Unsafe o2 = c7.o;
            int n = 1048575;
            int i = 0;
            int int1 = 0;
            while (i < length) {
                final int j = this.i(i);
                final int[] a = this.a;
                final int n2 = a[i];
                final int n3 = j >>> 20 & 0xFF;
                int n8;
                if (n3 <= 17) {
                    final int n4 = a[i + 2];
                    final int n5 = n4 & 0xFFFFF;
                    int n6;
                    if (n5 != (n6 = n)) {
                        int1 = o2.getInt(o, (long)n5);
                        n6 = n5;
                    }
                    final int n7 = 1 << (n4 >>> 20);
                    n = n6;
                    n8 = n7;
                }
                else {
                    n8 = 0;
                }
                final long n9 = j & 0xFFFFF;
                switch (n3) {
                    case 68: {
                        if (this.v(n2, i, o)) {
                            m5.l(n2, this.k(i), o2.getObject(o, n9));
                            break;
                        }
                        break;
                    }
                    case 67: {
                        if (this.v(n2, i, o)) {
                            m5.b(n2, j(n9, o));
                            break;
                        }
                        break;
                    }
                    case 66: {
                        if (this.v(n2, i, o)) {
                            m5.a(n2, D(n9, o));
                            break;
                        }
                        break;
                    }
                    case 65: {
                        if (this.v(n2, i, o)) {
                            m5.q(n2, j(n9, o));
                            break;
                        }
                        break;
                    }
                    case 64: {
                        if (this.v(n2, i, o)) {
                            m5.p(n2, D(n9, o));
                            break;
                        }
                        break;
                    }
                    case 63: {
                        if (this.v(n2, i, o)) {
                            m5.h(n2, D(n9, o));
                            break;
                        }
                        break;
                    }
                    case 62: {
                        if (this.v(n2, i, o)) {
                            m5.c(n2, D(n9, o));
                            break;
                        }
                        break;
                    }
                    case 61: {
                        if (this.v(n2, i, o)) {
                            m5.f(n2, (zzjd)o2.getObject(o, n9));
                            break;
                        }
                        break;
                    }
                    case 60: {
                        if (this.v(n2, i, o)) {
                            m5.o(n2, this.k(i), o2.getObject(o, n9));
                            break;
                        }
                        break;
                    }
                    case 59: {
                        if (this.v(n2, i, o)) {
                            w(n2, o2.getObject(o, n9), m5);
                            break;
                        }
                        break;
                    }
                    case 58: {
                        if (this.v(n2, i, o)) {
                            m5.e(n2, (boolean)e8.j(n9, o));
                            break;
                        }
                        break;
                    }
                    case 57: {
                        if (this.v(n2, i, o)) {
                            m5.i(n2, D(n9, o));
                            break;
                        }
                        break;
                    }
                    case 56: {
                        if (this.v(n2, i, o)) {
                            m5.j(n2, j(n9, o));
                            break;
                        }
                        break;
                    }
                    case 55: {
                        if (this.v(n2, i, o)) {
                            m5.m(n2, D(n9, o));
                            break;
                        }
                        break;
                    }
                    case 54: {
                        if (this.v(n2, i, o)) {
                            m5.d(n2, j(n9, o));
                            break;
                        }
                        break;
                    }
                    case 53: {
                        if (this.v(n2, i, o)) {
                            m5.n(n2, j(n9, o));
                            break;
                        }
                        break;
                    }
                    case 52: {
                        if (this.v(n2, i, o)) {
                            m5.k((float)e8.j(n9, o), n2);
                            break;
                        }
                        break;
                    }
                    case 51: {
                        if (this.v(n2, i, o)) {
                            m5.g((double)e8.j(n9, o), n2);
                            break;
                        }
                        break;
                    }
                    case 50: {
                        if (o2.getObject(o, n9) == null) {
                            break;
                        }
                        final u6 u6 = (u6)this.l(i);
                        throw null;
                    }
                    case 49: {
                        com.google.android.gms.internal.measurement.e.i(this.a[i], (List)o2.getObject(o, n9), m5, this.k(i));
                        break;
                    }
                    case 48: {
                        com.google.android.gms.internal.measurement.e.p(this.a[i], (List)o2.getObject(o, n9), m5, true);
                        break;
                    }
                    case 47: {
                        com.google.android.gms.internal.measurement.e.o(this.a[i], (List)o2.getObject(o, n9), m5, true);
                        break;
                    }
                    case 46: {
                        com.google.android.gms.internal.measurement.e.n(this.a[i], (List)o2.getObject(o, n9), m5, true);
                        break;
                    }
                    case 45: {
                        com.google.android.gms.internal.measurement.e.m(this.a[i], (List)o2.getObject(o, n9), m5, true);
                        break;
                    }
                    case 44: {
                        com.google.android.gms.internal.measurement.e.e(this.a[i], (List)o2.getObject(o, n9), m5, true);
                        break;
                    }
                    case 43: {
                        com.google.android.gms.internal.measurement.e.r(this.a[i], (List)o2.getObject(o, n9), m5, true);
                        break;
                    }
                    case 42: {
                        com.google.android.gms.internal.measurement.e.b(this.a[i], (List)o2.getObject(o, n9), m5, true);
                        break;
                    }
                    case 41: {
                        com.google.android.gms.internal.measurement.e.f(this.a[i], (List)o2.getObject(o, n9), m5, true);
                        break;
                    }
                    case 40: {
                        com.google.android.gms.internal.measurement.e.g(this.a[i], (List)o2.getObject(o, n9), m5, true);
                        break;
                    }
                    case 39: {
                        com.google.android.gms.internal.measurement.e.j(this.a[i], (List)o2.getObject(o, n9), m5, true);
                        break;
                    }
                    case 38: {
                        com.google.android.gms.internal.measurement.e.s(this.a[i], (List)o2.getObject(o, n9), m5, true);
                        break;
                    }
                    case 37: {
                        com.google.android.gms.internal.measurement.e.k(this.a[i], (List)o2.getObject(o, n9), m5, true);
                        break;
                    }
                    case 36: {
                        com.google.android.gms.internal.measurement.e.h(this.a[i], (List)o2.getObject(o, n9), m5, true);
                        break;
                    }
                    case 35: {
                        com.google.android.gms.internal.measurement.e.d(this.a[i], (List)o2.getObject(o, n9), m5, true);
                        break;
                    }
                    case 34: {
                        com.google.android.gms.internal.measurement.e.p(this.a[i], (List)o2.getObject(o, n9), m5, false);
                        break;
                    }
                    case 33: {
                        com.google.android.gms.internal.measurement.e.o(this.a[i], (List)o2.getObject(o, n9), m5, false);
                        break;
                    }
                    case 32: {
                        com.google.android.gms.internal.measurement.e.n(this.a[i], (List)o2.getObject(o, n9), m5, false);
                        break;
                    }
                    case 31: {
                        com.google.android.gms.internal.measurement.e.m(this.a[i], (List)o2.getObject(o, n9), m5, false);
                        break;
                    }
                    case 30: {
                        com.google.android.gms.internal.measurement.e.e(this.a[i], (List)o2.getObject(o, n9), m5, false);
                        break;
                    }
                    case 29: {
                        com.google.android.gms.internal.measurement.e.r(this.a[i], (List)o2.getObject(o, n9), m5, false);
                        break;
                    }
                    case 28: {
                        com.google.android.gms.internal.measurement.e.c(this.a[i], (List)o2.getObject(o, n9), m5);
                        break;
                    }
                    case 27: {
                        com.google.android.gms.internal.measurement.e.l(this.a[i], (List)o2.getObject(o, n9), m5, this.k(i));
                        break;
                    }
                    case 26: {
                        com.google.android.gms.internal.measurement.e.q(this.a[i], (List)o2.getObject(o, n9), m5);
                        break;
                    }
                    case 25: {
                        com.google.android.gms.internal.measurement.e.b(this.a[i], (List)o2.getObject(o, n9), m5, false);
                        break;
                    }
                    case 24: {
                        com.google.android.gms.internal.measurement.e.f(this.a[i], (List)o2.getObject(o, n9), m5, false);
                        break;
                    }
                    case 23: {
                        com.google.android.gms.internal.measurement.e.g(this.a[i], (List)o2.getObject(o, n9), m5, false);
                        break;
                    }
                    case 22: {
                        com.google.android.gms.internal.measurement.e.j(this.a[i], (List)o2.getObject(o, n9), m5, false);
                        break;
                    }
                    case 21: {
                        com.google.android.gms.internal.measurement.e.s(this.a[i], (List)o2.getObject(o, n9), m5, false);
                        break;
                    }
                    case 20: {
                        com.google.android.gms.internal.measurement.e.k(this.a[i], (List)o2.getObject(o, n9), m5, false);
                        break;
                    }
                    case 19: {
                        com.google.android.gms.internal.measurement.e.h(this.a[i], (List)o2.getObject(o, n9), m5, false);
                        break;
                    }
                    case 18: {
                        com.google.android.gms.internal.measurement.e.d(this.a[i], (List)o2.getObject(o, n9), m5, false);
                        break;
                    }
                    case 17: {
                        if ((int1 & n8) != 0x0) {
                            m5.l(n2, this.k(i), o2.getObject(o, n9));
                            break;
                        }
                        break;
                    }
                    case 16: {
                        if ((int1 & n8) != 0x0) {
                            m5.b(n2, o2.getLong(o, n9));
                            break;
                        }
                        break;
                    }
                    case 15: {
                        if ((int1 & n8) != 0x0) {
                            m5.a(n2, o2.getInt(o, n9));
                            break;
                        }
                        break;
                    }
                    case 14: {
                        if ((int1 & n8) != 0x0) {
                            m5.q(n2, o2.getLong(o, n9));
                            break;
                        }
                        break;
                    }
                    case 13: {
                        if ((int1 & n8) != 0x0) {
                            m5.p(n2, o2.getInt(o, n9));
                            break;
                        }
                        break;
                    }
                    case 12: {
                        if ((int1 & n8) != 0x0) {
                            m5.h(n2, o2.getInt(o, n9));
                            break;
                        }
                        break;
                    }
                    case 11: {
                        if ((int1 & n8) != 0x0) {
                            m5.c(n2, o2.getInt(o, n9));
                            break;
                        }
                        break;
                    }
                    case 10: {
                        if ((int1 & n8) != 0x0) {
                            m5.f(n2, (zzjd)o2.getObject(o, n9));
                            break;
                        }
                        break;
                    }
                    case 9: {
                        if ((int1 & n8) != 0x0) {
                            m5.o(n2, this.k(i), o2.getObject(o, n9));
                            break;
                        }
                        break;
                    }
                    case 8: {
                        if ((int1 & n8) != 0x0) {
                            w(n2, o2.getObject(o, n9), m5);
                            break;
                        }
                        break;
                    }
                    case 7: {
                        if ((int1 & n8) != 0x0) {
                            m5.e(n2, e8.s(n9, o));
                            break;
                        }
                        break;
                    }
                    case 6: {
                        if ((int1 & n8) != 0x0) {
                            m5.i(n2, o2.getInt(o, n9));
                            break;
                        }
                        break;
                    }
                    case 5: {
                        if ((int1 & n8) != 0x0) {
                            m5.j(n2, o2.getLong(o, n9));
                            break;
                        }
                        break;
                    }
                    case 4: {
                        if ((int1 & n8) != 0x0) {
                            m5.m(n2, o2.getInt(o, n9));
                            break;
                        }
                        break;
                    }
                    case 3: {
                        if ((int1 & n8) != 0x0) {
                            m5.d(n2, o2.getLong(o, n9));
                            break;
                        }
                        break;
                    }
                    case 2: {
                        if ((int1 & n8) != 0x0) {
                            m5.n(n2, o2.getLong(o, n9));
                            break;
                        }
                        break;
                    }
                    case 1: {
                        if ((int1 & n8) != 0x0) {
                            m5.k(e8.f(n9, o), n2);
                            break;
                        }
                        break;
                    }
                    case 0: {
                        if ((int1 & n8) != 0x0) {
                            m5.g(e8.e(n9, o), n2);
                            break;
                        }
                        break;
                    }
                }
                i += 3;
            }
            final u7 l = this.l;
            l.i((Object)l.c(o), m5);
            return;
        }
        this.m.a(o);
        throw null;
    }
    
    public final boolean s(final int n, final Object o, final Object o2) {
        return this.u(n, o) == this.u(n, o2);
    }
    
    public final Object t() {
        return ((c6)this.e).q(4);
    }
    
    public final boolean u(int i, Object j) {
        final int n = this.a[i + 2];
        final long n2 = n & 0xFFFFF;
        if (n2 != 1048575L) {
            return (e8.g(n2, j) & 1 << (n >>> 20)) != 0x0;
        }
        i = this.i(i);
        final long n3 = i & 0xFFFFF;
        switch (i >>> 20 & 0xFF) {
            default: {
                throw new IllegalArgumentException();
            }
            case 17: {
                return e8.j(n3, j) != null;
            }
            case 16: {
                return e8.h(n3, j) != 0L;
            }
            case 15: {
                return e8.g(n3, j) != 0;
            }
            case 14: {
                return e8.h(n3, j) != 0L;
            }
            case 13: {
                return e8.g(n3, j) != 0;
            }
            case 12: {
                return e8.g(n3, j) != 0;
            }
            case 11: {
                return e8.g(n3, j) != 0;
            }
            case 10: {
                return !zzjd.zzb.equals(e8.j(n3, j));
            }
            case 9: {
                return e8.j(n3, j) != null;
            }
            case 8: {
                j = e8.j(n3, j);
                if (j instanceof String) {
                    return !((String)j).isEmpty();
                }
                if (j instanceof zzjd) {
                    return !zzjd.zzb.equals(j);
                }
                throw new IllegalArgumentException();
            }
            case 7: {
                return e8.s(n3, j);
            }
            case 6: {
                return e8.g(n3, j) != 0;
            }
            case 5: {
                return e8.h(n3, j) != 0L;
            }
            case 4: {
                return e8.g(n3, j) != 0;
            }
            case 3: {
                return e8.h(n3, j) != 0L;
            }
            case 2: {
                return e8.h(n3, j) != 0L;
            }
            case 1: {
                return Float.floatToRawIntBits(e8.f(n3, j)) != 0;
            }
            case 0: {
                return Double.doubleToRawLongBits(e8.e(n3, j)) != 0L;
            }
        }
    }
    
    public final boolean v(final int n, final int n2, final Object o) {
        return e8.g((long)(this.a[n2 + 2] & 0xFFFFF), o) == n;
    }
    
    public final int x(Object j, final byte[] array, int i, final int n, int n2, final e5 e5) throws IOException {
        c7 c7 = this;
        e5 e6 = e5;
        final Unsafe o = je.c7.o;
        byte[] array2 = array;
        int n3 = n2;
        int n4 = n;
        int n5 = -1;
        int n6 = 0;
        int n7 = 1048575;
        int n8 = 0;
        int n9 = 0;
        Object o2;
        c7 c8 = null;
        while (true) {
            o2 = j;
            if (i >= n4) {
                c8 = c7;
                n2 = i;
                break;
            }
            final int n10 = i + 1;
            final byte b = (byte)(i = array2[i]);
            int k = n10;
            if (b < 0) {
                k = f5.k((int)b, array2, n10, e6);
                i = e6.a;
            }
            final int n11 = i >>> 3;
            final int n12 = i & 0x7;
            int n14;
            if (n11 > n5) {
                final int n13 = n6 / 3;
                if (n11 >= c7.c && n11 <= c7.d) {
                    n14 = c7.I(n11, n13);
                }
                else {
                    n14 = -1;
                }
            }
            else if (n11 >= c7.c && n11 <= c7.d) {
                n14 = c7.I(n11, 0);
            }
            else {
                n14 = -1;
            }
            int n33 = 0;
            int n34 = 0;
            int n35 = 0;
            int n36 = 0;
            Label_1606: {
                if (n14 != -1) {
                    final int[] a = c7.a;
                    final int n15 = a[n14 + 1];
                    final int n16 = n15 >>> 20 & 0xFF;
                    final long n17 = n15 & 0xFFFFF;
                    int int1 = 0;
                    int n24 = 0;
                    Label_1390: {
                        int n21 = 0;
                        int n29 = 0;
                        Label_1378: {
                            if (n16 <= 17) {
                                final int n18 = a[n14 + 2];
                                final int n19 = 1 << (n18 >>> 20);
                                final int n20 = n18 & 0xFFFFF;
                                if (n20 != n7) {
                                    if (n7 != 1048575) {
                                        o.putInt(o2, (long)n7, n8);
                                    }
                                    int1 = o.getInt(o2, (long)n20);
                                    n21 = n20;
                                }
                                else {
                                    int1 = n8;
                                    n21 = n7;
                                }
                                Label_1209: {
                                    int n25 = 0;
                                    Label_1128: {
                                        Label_1114: {
                                            Label_1081: {
                                                Label_1032: {
                                                    Label_1000: {
                                                        switch (n16) {
                                                            default: {
                                                                e6 = e5;
                                                                if (n12 == 3) {
                                                                    final int c9 = f5.c(c7.k(n14), array, k, n, n11 << 3 | 0x4, e5);
                                                                    if ((int1 & n19) == 0x0) {
                                                                        o.putObject(o2, n17, e6.c);
                                                                    }
                                                                    else {
                                                                        o.putObject(o2, n17, i6.b(o.getObject(o2, n17), e6.c));
                                                                    }
                                                                    array2 = array;
                                                                    final int n22 = int1 | n19;
                                                                    final int n23 = i;
                                                                    n7 = n21;
                                                                    n4 = n;
                                                                    i = c9;
                                                                    n24 = n23;
                                                                    int1 = n22;
                                                                    break Label_1390;
                                                                }
                                                                break;
                                                            }
                                                            case 16: {
                                                                if (n12 == 0) {
                                                                    n25 = f5.m(array2, k, e5);
                                                                    o.putLong(j, n17, l5.b(e5.b));
                                                                    break Label_1032;
                                                                }
                                                                break;
                                                            }
                                                            case 15: {
                                                                if (n12 == 0) {
                                                                    n25 = f5.j(array2, k, e5);
                                                                    o.putInt(o2, n17, l5.a(e5.a));
                                                                    break Label_1000;
                                                                }
                                                                break;
                                                            }
                                                            case 12: {
                                                                e6 = e5;
                                                                final int n26 = n21;
                                                                if (n12 != 0) {
                                                                    break;
                                                                }
                                                                n25 = f5.j(array2, k, e6);
                                                                final int a2 = e6.a;
                                                                final int n27 = n14 / 3;
                                                                final e6 e7 = (e6)c7.b[n27 + n27 + 1];
                                                                if (e7 != null && !e7.b(a2)) {
                                                                    y(j).c(i, (Object)(long)a2);
                                                                    final int n28 = i;
                                                                    i = n25;
                                                                    n29 = n28;
                                                                    n21 = n26;
                                                                    break Label_1378;
                                                                }
                                                                o.putInt(o2, n17, a2);
                                                                break Label_1000;
                                                            }
                                                            case 10: {
                                                                if (n12 == 2) {
                                                                    n25 = f5.a(array2, k, e5);
                                                                    o.putObject(o2, n17, e5.c);
                                                                    break Label_1000;
                                                                }
                                                                break;
                                                            }
                                                            case 9: {
                                                                if (n12 != 2) {
                                                                    break;
                                                                }
                                                                n25 = f5.d(c7.k(n14), array2, k, n4, e5);
                                                                if ((int1 & n19) == 0x0) {
                                                                    o.putObject(o2, n17, e5.c);
                                                                    break Label_1000;
                                                                }
                                                                o.putObject(o2, n17, i6.b(o.getObject(o2, n17), e5.c));
                                                                break Label_1000;
                                                            }
                                                            case 8: {
                                                                if (n12 == 2) {
                                                                    if ((n15 & 0x20000000) == 0x0) {
                                                                        n25 = f5.g(array2, k, e5);
                                                                    }
                                                                    else {
                                                                        n25 = f5.h(array2, k, e5);
                                                                    }
                                                                    o.putObject(o2, n17, e5.c);
                                                                    break Label_1000;
                                                                }
                                                                break;
                                                            }
                                                            case 7: {
                                                                if (n12 == 0) {
                                                                    n25 = f5.m(array2, k, e5);
                                                                    e8.m(o2, n17, e5.b != 0L);
                                                                    break Label_1000;
                                                                }
                                                                break;
                                                            }
                                                            case 6:
                                                            case 13: {
                                                                if (n12 == 5) {
                                                                    o.putInt(o2, n17, f5.b(k, array2));
                                                                    n25 = k + 4;
                                                                    break Label_1000;
                                                                }
                                                                break;
                                                            }
                                                            case 5:
                                                            case 14: {
                                                                if (n12 == 1) {
                                                                    o.putLong(j, n17, f5.n(k, array2));
                                                                    n25 = k + 8;
                                                                    break Label_1114;
                                                                }
                                                                break;
                                                            }
                                                            case 4:
                                                            case 11: {
                                                                if (n12 == 0) {
                                                                    n25 = f5.j(array2, k, e5);
                                                                    o.putInt(o2, n17, e5.a);
                                                                    break Label_1000;
                                                                }
                                                                break;
                                                            }
                                                            case 2:
                                                            case 3: {
                                                                if (n12 == 0) {
                                                                    n25 = f5.m(array2, k, e5);
                                                                    o.putLong(j, n17, e5.b);
                                                                    break Label_1032;
                                                                }
                                                                break;
                                                            }
                                                            case 1: {
                                                                if (n12 == 5) {
                                                                    e8.o(o2, n17, Float.intBitsToFloat(f5.b(k, array2)));
                                                                    n25 = k + 4;
                                                                    break Label_1114;
                                                                }
                                                                break;
                                                            }
                                                            case 0: {
                                                                if (n12 == 1) {
                                                                    e8.n(o2, n17, Double.longBitsToDouble(f5.n(k, array2)));
                                                                    n25 = k + 8;
                                                                    break Label_1114;
                                                                }
                                                                break;
                                                            }
                                                        }
                                                        break Label_1081;
                                                    }
                                                    break Label_1114;
                                                }
                                                int1 |= n19;
                                                break Label_1128;
                                            }
                                            break Label_1209;
                                        }
                                        int1 |= n19;
                                    }
                                    e6 = e5;
                                    final int n30 = i;
                                    i = n25;
                                    n29 = n30;
                                    break Label_1378;
                                }
                                final int n31 = n21;
                                final int n32 = n14;
                                n33 = k;
                                n8 = int1;
                                c8 = c7;
                                n34 = n2;
                                n35 = n31;
                                n36 = n32;
                                break Label_1606;
                            }
                            int1 = n8;
                            int n37 = 0;
                            Label_1485: {
                                Label_1481: {
                                    if (n16 != 27) {
                                        if (n16 <= 49) {
                                            n37 = this.H(j, array, k, n, i, n11, n12, n14, n15, n16, n17, e5);
                                            if (n37 == k) {
                                                break Label_1485;
                                            }
                                        }
                                        else if (n16 == 50) {
                                            if (n12 != 2) {
                                                break Label_1481;
                                            }
                                            this.E(j, n14, n17);
                                            throw null;
                                        }
                                        else {
                                            n37 = this.F(j, array, k, n, i, n11, n12, n15, n16, n17, n14, e5);
                                            if (n37 == k) {
                                                break Label_1485;
                                            }
                                        }
                                        array2 = array;
                                        n4 = n;
                                        final int n38 = n2;
                                        e6 = e5;
                                        c7 = this;
                                        n5 = n11;
                                        n6 = n14;
                                        n9 = i;
                                        i = n37;
                                        n3 = n38;
                                        continue;
                                    }
                                    if (n12 == 2) {
                                        h6 h7;
                                        final h6 h6 = h7 = (h6)o.getObject(o2, n17);
                                        if (!h6.s()) {
                                            final int size = ((List)h6).size();
                                            int n39;
                                            if (size == 0) {
                                                n39 = 10;
                                            }
                                            else {
                                                n39 = size + size;
                                            }
                                            h7 = h6.h(n39);
                                            o.putObject(o2, n17, h7);
                                        }
                                        final k7 l = c7.k(n14);
                                        n21 = n7;
                                        n29 = i;
                                        i = f5.e(l, i, array, k, n, h7, e5);
                                        array2 = array;
                                        n4 = n;
                                        break Label_1378;
                                    }
                                }
                                n37 = k;
                            }
                            final int n40 = n14;
                            n35 = n7;
                            c8 = this;
                            n34 = n2;
                            n33 = n37;
                            n36 = n40;
                            break Label_1606;
                        }
                        final int n41 = n21;
                        n24 = n29;
                        n7 = n41;
                    }
                    final int n42 = n2;
                    n6 = n14;
                    n9 = n24;
                    n8 = int1;
                    n5 = n11;
                    n3 = n42;
                    continue;
                }
                final int n43 = 0;
                n35 = n7;
                n33 = k;
                c8 = c7;
                n34 = n3;
                n36 = n43;
            }
            if (i == n34 && n34 != 0) {
                n2 = n33;
                n3 = n34;
                n7 = n35;
                n9 = i;
                o2 = j;
                break;
            }
            int n44;
            if (c8.f && e5.d != p5.a()) {
                if (e5.d.b(c8.e, n11) != null) {
                    final a6 a3 = (a6)j;
                    throw null;
                }
                n44 = f5.i(i, array, n33, n, y(j), e5);
            }
            else {
                n44 = f5.i(i, array, n33, n, y(j), e5);
            }
            e6 = e5;
            n5 = n11;
            final int n45 = i;
            c7 = c8;
            n6 = n36;
            i = n44;
            n3 = n34;
            array2 = array;
            n7 = n35;
            n4 = n;
            n9 = n45;
        }
        if (n7 != 1048575) {
            o.putInt(o2, (long)n7, n8);
        }
        int n46;
        int n47;
        int n48;
        zzlf zzlf;
        u6 u6;
        for (i = c8.i; i < c8.j; ++i) {
            n46 = c8.h[i];
            n47 = c8.a[n46];
            j = e8.j((long)(c8.i(n46) & 0xFFFFF), o2);
            if (j != null) {
                n48 = n46 / 3;
                if (c8.b[n48 + n48 + 1] != null) {
                    zzlf = (zzlf)j;
                    u6 = (u6)c8.l(n46);
                    throw null;
                }
            }
        }
        if (n3 == 0) {
            if (n2 != n) {
                throw zzko.zze();
            }
        }
        else if (n2 > n || n9 != n3) {
            throw zzko.zze();
        }
        return n2;
    }
}
