// 
// Decompiled by Procyon v0.6.0
// 

package he;

import java.util.HashMap;
import com.google.android.gms.internal.firebase_auth_api.zzace;
import java.nio.charset.Charset;
import com.google.android.gms.internal.firebase_auth_api.g;
import com.google.android.gms.internal.firebase_auth_api.zzacw;
import com.google.android.gms.internal.firebase_auth_api.zzabq;
import com.google.android.gms.internal.firebase_auth_api.d;
import com.google.android.gms.internal.firebase_auth_api.zzacf;
import com.google.android.gms.internal.firebase_auth_api.f;
import java.util.List;
import m5.a;
import java.util.Arrays;
import java.lang.reflect.Field;
import java.io.IOException;
import com.google.android.gms.internal.firebase_auth_api.zzaau;
import com.google.android.gms.internal.firebase_auth_api.e;
import sun.misc.Unsafe;

public final class z0<T> implements h1<T>
{
    public static final int[] o;
    public static final Unsafe p;
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final w0 e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final int[] i;
    public final int j;
    public final int k;
    public final l0 l;
    public final r1 m;
    public final s n;
    
    static {
        o = new int[0];
        p = b2.k();
    }
    
    public z0(final int[] a, final Object[] b, final int c, final int d, final w0 e, final boolean h, final int[] i, final int j, final int k, final l0 l, final r1 m, final s n, final r0 r0) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.g = (e instanceof e);
        this.h = h;
        this.f = (n != null && n.h(e));
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
        this.e = e;
    }
    
    public static final void B(final int n, final Object o, final o o2) throws IOException {
        if (o instanceof String) {
            ((d)o2.a).q(n, (String)o);
            return;
        }
        o2.f(n, (com.google.android.gms.internal.firebase-auth-api.zzaau)o);
    }
    
    public static s1 D(final Object o) {
        final e e = (e)o;
        s1 zzc;
        if ((zzc = e.zzc) == s1.f) {
            zzc = s1.b();
            e.zzc = zzc;
        }
        return zzc;
    }
    
    public static z0 E(final t0 t0, final l0 l0, final r1 r1, final s s, final r0 r2) {
        if (t0 instanceof g1) {
            return F((g1)t0, l0, r1, s, r2);
        }
        final q1 q1 = (q1)t0;
        throw null;
    }
    
    public static z0 F(final g1 g1, final l0 l0, final r1 r1, final s s, final r0 r2) {
        final boolean b = g1.s() == 2;
        final String a = g1.a();
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
        int[] o;
        int n11;
        int n12;
        int n14;
        int n17;
        int n16;
        int char3;
        int n18;
        if (n6 == 0) {
            o = z0.o;
            n11 = 0;
            final int n13;
            n12 = (n13 = 0);
            final int n15;
            n14 = (n15 = n13);
            n16 = (n17 = n15);
            char3 = n13;
            n18 = n15;
        }
        else {
            final int n19 = n5 + 1;
            int char4;
            final char c = (char)(char4 = a.charAt(n5));
            int n20 = n19;
            if (c >= '\ud800') {
                int n21 = c & '\u1fff';
                int n22 = 13;
                int n23 = n19;
                int n24;
                char char5;
                while (true) {
                    n24 = n23 + 1;
                    char5 = a.charAt(n23);
                    if (char5 < '\ud800') {
                        break;
                    }
                    n21 |= (char5 & '\u1fff') << n22;
                    n22 += 13;
                    n23 = n24;
                }
                char4 = (n21 | char5 << n22);
                n20 = n24;
            }
            final int n25 = n20 + 1;
            int char6;
            final char c2 = (char)(char6 = a.charAt(n20));
            int n26 = n25;
            if (c2 >= '\ud800') {
                int n27 = c2 & '\u1fff';
                int n28 = 13;
                int n29 = n25;
                int n30;
                char char7;
                while (true) {
                    n30 = n29 + 1;
                    char7 = a.charAt(n29);
                    if (char7 < '\ud800') {
                        break;
                    }
                    n27 |= (char7 & '\u1fff') << n28;
                    n28 += 13;
                    n29 = n30;
                }
                char6 = (n27 | char7 << n28);
                n26 = n30;
            }
            final int n31 = n26 + 1;
            int char8;
            final char c3 = (char)(char8 = a.charAt(n26));
            int n32 = n31;
            if (c3 >= '\ud800') {
                int n33 = c3 & '\u1fff';
                int n34 = 13;
                int n35 = n31;
                int n36;
                char char9;
                while (true) {
                    n36 = n35 + 1;
                    char9 = a.charAt(n35);
                    if (char9 < '\ud800') {
                        break;
                    }
                    n33 |= (char9 & '\u1fff') << n34;
                    n34 += 13;
                    n35 = n36;
                }
                char8 = (n33 | char9 << n34);
                n32 = n36;
            }
            final int n37 = n32 + 1;
            int char10;
            final char c4 = (char)(char10 = a.charAt(n32));
            int n38 = n37;
            if (c4 >= '\ud800') {
                int n39 = c4 & '\u1fff';
                int n40 = 13;
                int n41 = n37;
                int n42;
                char char11;
                while (true) {
                    n42 = n41 + 1;
                    char11 = a.charAt(n41);
                    if (char11 < '\ud800') {
                        break;
                    }
                    n39 |= (char11 & '\u1fff') << n40;
                    n40 += 13;
                    n41 = n42;
                }
                char10 = (n39 | char11 << n40);
                n38 = n42;
            }
            final int n43 = n38 + 1;
            final char c5 = (char)(char3 = a.charAt(n38));
            int n44 = n43;
            if (c5 >= '\ud800') {
                int n45 = c5 & '\u1fff';
                int n46 = 13;
                int n47 = n43;
                int n48;
                char char12;
                while (true) {
                    n48 = n47 + 1;
                    char12 = a.charAt(n47);
                    if (char12 < '\ud800') {
                        break;
                    }
                    n45 |= (char12 & '\u1fff') << n46;
                    n46 += 13;
                    n47 = n48;
                }
                char3 = (n45 | char12 << n46);
                n44 = n48;
            }
            final int n49 = n44 + 1;
            int char13;
            final char c6 = (char)(char13 = a.charAt(n44));
            int n50 = n49;
            if (c6 >= '\ud800') {
                final int n51 = c6 & '\u1fff';
                int n52 = 13;
                int n53 = n49;
                int n54 = n51;
                int n55;
                char char14;
                while (true) {
                    n55 = n53 + 1;
                    char14 = a.charAt(n53);
                    if (char14 < '\ud800') {
                        break;
                    }
                    n54 |= (char14 & '\u1fff') << n52;
                    n52 += 13;
                    n53 = n55;
                }
                final int n56 = n54 | char14 << n52;
                n50 = n55;
                char13 = n56;
            }
            final int n57 = n50 + 1;
            int char15;
            final char c7 = (char)(char15 = a.charAt(n50));
            int n58 = n57;
            if (c7 >= '\ud800') {
                int n59 = c7 & '\u1fff';
                int n60 = 13;
                int n61 = n57;
                int n62;
                char char16;
                while (true) {
                    n62 = n61 + 1;
                    char16 = a.charAt(n61);
                    if (char16 < '\ud800') {
                        break;
                    }
                    n59 |= (char16 & '\u1fff') << n60;
                    n60 += 13;
                    n61 = n62;
                }
                char15 = (n59 | char16 << n60);
                n58 = n62;
            }
            final int n63 = n58 + 1;
            int char17;
            final char c8 = (char)(char17 = a.charAt(n58));
            int n64 = n63;
            if (c8 >= '\ud800') {
                final int n65 = c8 & '\u1fff';
                int n66 = 13;
                int n67 = n63;
                int n68 = n65;
                char char18;
                while (true) {
                    n64 = n67 + 1;
                    char18 = a.charAt(n67);
                    if (char18 < '\ud800') {
                        break;
                    }
                    n68 |= (char18 & '\u1fff') << n66;
                    n66 += 13;
                    n67 = n64;
                }
                char17 = (n68 | char18 << n66);
            }
            o = new int[char17 + char13 + char15];
            n16 = char4 + char4 + char6;
            n17 = char4;
            final int n69 = n64;
            n18 = char13;
            n14 = char17;
            n12 = char10;
            n11 = char8;
            n5 = n69;
        }
        final Unsafe p5 = z0.p;
        final Object[] b2 = g1.b();
        final Class<? extends w0> class1 = g1.zza().getClass();
        final int[] array = new int[char3 * 3];
        final Object[] array2 = new Object[char3 + char3];
        final int n70 = n18 + n14;
        int n71 = n14;
        int n72 = n70;
        int n73 = 0;
        int n74 = 0;
        int n75 = n16;
        final int n76 = n12;
        final int n77 = n11;
        int n89;
        int n108;
        int n109;
        for (int i = n5; i < length; i = n109, n73 = n89, n72 = n108) {
            int n78 = i + 1;
            final char char19 = a.charAt(i);
            int n81;
            int n82;
            if (char19 >= '\ud800') {
                int n79 = char19 & '\u1fff';
                int n80 = 13;
                char char20;
                while (true) {
                    n81 = n78 + 1;
                    char20 = a.charAt(n78);
                    if (char20 < '\ud800') {
                        break;
                    }
                    n79 |= (char20 & '\u1fff') << n80;
                    n80 += 13;
                    n78 = n81;
                }
                n82 = (n79 | char20 << n80);
            }
            else {
                n81 = n78;
                n82 = char19;
            }
            int n83 = n81 + 1;
            int char21 = a.charAt(n81);
            if (char21 >= 55296) {
                int n84 = char21 & 0x1FFF;
                int n85 = n83;
                int n86 = 13;
                int n87;
                char char22;
                while (true) {
                    n87 = n85 + 1;
                    char22 = a.charAt(n85);
                    if (char22 < '\ud800') {
                        break;
                    }
                    n84 |= (char22 & '\u1fff') << n86;
                    n86 += 13;
                    n85 = n87;
                }
                char21 = (n84 | char22 << n86);
                n83 = n87;
            }
            final int n88 = char21 & 0xFF;
            n89 = n73;
            if ((char21 & 0x400) != 0x0) {
                o[n73] = n74;
                n89 = n73 + 1;
            }
            int n105;
            int n106;
            int n107;
            if (n88 >= 51) {
                final int n90 = n83 + 1;
                int char23 = a.charAt(n83);
                int n95;
                if (char23 >= 55296) {
                    int n91 = char23 & 0x1FFF;
                    int n92 = 13;
                    int n93 = n90;
                    int n94;
                    char char24;
                    while (true) {
                        n94 = n93 + 1;
                        char24 = a.charAt(n93);
                        if (char24 < '\ud800') {
                            break;
                        }
                        n91 |= (char24 & '\u1fff') << n92;
                        n92 += 13;
                        n93 = n94;
                    }
                    char23 = (n91 | char24 << n92);
                    n95 = n94;
                }
                else {
                    n95 = n90;
                }
                final int n96 = n88 - 51;
                final int n97 = n95;
                int n98 = 0;
                Label_1686: {
                    int n101;
                    if (n96 != 9 && n96 != 17) {
                        n98 = n75;
                        if (n96 != 12) {
                            break Label_1686;
                        }
                        n98 = n75;
                        if (b) {
                            break Label_1686;
                        }
                        final int n99 = n74 / 3;
                        final int n100 = n75 + 1;
                        array2[n99 + n99 + 1] = b2[n75];
                        n101 = n100;
                    }
                    else {
                        final int n102 = n74 / 3;
                        final int n103 = n75 + 1;
                        array2[n102 + n102 + 1] = b2[n75];
                        n101 = n103;
                    }
                    n98 = n101;
                }
                int n104 = char23 + char23;
                final Object o2 = b2[n104];
                Field q;
                if (o2 instanceof Field) {
                    q = (Field)o2;
                }
                else {
                    q = q(class1, (String)o2);
                    b2[n104] = q;
                }
                n105 = (int)p5.objectFieldOffset(q);
                ++n104;
                final Object o3 = b2[n104];
                Field q2;
                if (o3 instanceof Field) {
                    q2 = (Field)o3;
                }
                else {
                    q2 = q(class1, (String)o3);
                    b2[n104] = q2;
                }
                n106 = (int)p5.objectFieldOffset(q2);
                n107 = 0;
                n75 = n98;
                n108 = n72;
                n109 = n97;
            }
            else {
                final int n110 = n14;
                final int n111 = n75 + 1;
                final Field q3 = q(class1, (String)b2[n75]);
                int n112 = 0;
                Label_2116: {
                    if (n88 != 9 && n88 != 17) {
                        if (n88 != 27 && n88 != 49) {
                            int n113 = 0;
                            Label_2054: {
                                if (n88 != 12 && n88 != 30 && n88 != 44) {
                                    n112 = n111;
                                    n113 = n71;
                                    if (n88 != 50) {
                                        break Label_2054;
                                    }
                                    final int n114 = n71 + 1;
                                    o[n71] = n74;
                                    final int n115 = n74 / 3;
                                    final int n116 = n115 + n115;
                                    final int n117 = n111 + 1;
                                    array2[n116] = b2[n111];
                                    if ((char21 & 0x800) != 0x0) {
                                        final int n118 = n117 + 1;
                                        array2[n116 + 1] = b2[n117];
                                        n113 = n114;
                                        n112 = n118;
                                        break Label_2054;
                                    }
                                    n71 = n114;
                                    n112 = n117;
                                }
                                else {
                                    n112 = n111;
                                    n113 = n71;
                                    if (b) {
                                        break Label_2054;
                                    }
                                    final int n119 = n74 / 3;
                                    n112 = n111 + 1;
                                    array2[n119 + n119 + 1] = b2[n111];
                                }
                                break Label_2116;
                            }
                            n71 = n113;
                        }
                        else {
                            final int n120 = n74 / 3;
                            n112 = n111 + 1;
                            array2[n120 + n120 + 1] = b2[n111];
                        }
                    }
                    else {
                        final int n121 = n74 / 3;
                        array2[n121 + n121 + 1] = q3.getType();
                        n112 = n111;
                    }
                }
                n105 = (int)p5.objectFieldOffset(q3);
                int n125;
                int n128;
                int n129;
                if ((char21 & 0x1000) == 0x1000 && n88 <= 17) {
                    int n122 = n83 + 1;
                    int char25 = a.charAt(n83);
                    if (char25 >= 55296) {
                        int n123 = char25 & 0x1FFF;
                        int n124 = 13;
                        char char26;
                        while (true) {
                            n125 = n122 + 1;
                            char26 = a.charAt(n122);
                            if (char26 < '\ud800') {
                                break;
                            }
                            n123 |= (char26 & '\u1fff') << n124;
                            n124 += 13;
                            n122 = n125;
                        }
                        char25 = (n123 | char26 << n124);
                    }
                    else {
                        n125 = n122;
                    }
                    final int n126 = char25 / 32 + (n17 + n17);
                    final Object o4 = b2[n126];
                    Field q4;
                    if (o4 instanceof Field) {
                        q4 = (Field)o4;
                    }
                    else {
                        q4 = q(class1, (String)o4);
                        b2[n126] = q4;
                    }
                    final int n127 = (int)p5.objectFieldOffset(q4);
                    n128 = char25 % 32;
                    n129 = n127;
                }
                else {
                    n125 = n83;
                    n129 = 1048575;
                    n128 = 0;
                }
                n108 = n72;
                if (n88 >= 18) {
                    n108 = n72;
                    if (n88 <= 49) {
                        o[n72] = n105;
                        n108 = n72 + 1;
                    }
                }
                final int n130 = n112;
                n109 = n125;
                n14 = n110;
                n75 = n130;
                n107 = n128;
                n106 = n129;
            }
            final int n131 = n74 + 1;
            array[n74] = n82;
            final int n132 = n131 + 1;
            int n133;
            if ((char21 & 0x200) != 0x0) {
                n133 = 536870912;
            }
            else {
                n133 = 0;
            }
            int n134;
            if ((char21 & 0x100) != 0x0) {
                n134 = 268435456;
            }
            else {
                n134 = 0;
            }
            array[n131] = (n134 | n133 | n88 << 20 | n105);
            n74 = n132 + 1;
            array[n132] = (n106 | n107 << 20);
        }
        return new z0(array, array2, n77, n76, g1.zza(), b, o, n14, n70, l0, r1, s, r2);
    }
    
    public static int I(final long n, final Object o) {
        return (int)b2.j(n, o);
    }
    
    public static long l(final long n, final Object o) {
        return (long)b2.j(n, o);
    }
    
    public static Field q(final Class clazz, final String s) {
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
    
    public final void A(final Object o, final o o2) throws IOException {
        if (!this.f) {
            final int length = this.a.length;
            final Unsafe p2 = z0.p;
            int n = 1048575;
            int i = 0;
            int int1 = 0;
            while (i < length) {
                final int k = this.k(i);
                final int[] a = this.a;
                final int n2 = a[i];
                final int n3 = k >>> 20 & 0xFF;
                int n8;
                if (n3 <= 17) {
                    final int n4 = a[i + 2];
                    final int n5 = n4 & 0xFFFFF;
                    int n6;
                    if (n5 != (n6 = n)) {
                        int1 = p2.getInt(o, (long)n5);
                        n6 = n5;
                    }
                    final int n7 = 1 << (n4 >>> 20);
                    n = n6;
                    n8 = n7;
                }
                else {
                    n8 = 0;
                }
                final long n9 = k & 0xFFFFF;
                switch (n3) {
                    case 68: {
                        if (this.z(n2, i, o)) {
                            o2.l(n2, this.n(i), p2.getObject(o, n9));
                            break;
                        }
                        break;
                    }
                    case 67: {
                        if (this.z(n2, i, o)) {
                            o2.b(n2, l(n9, o));
                            break;
                        }
                        break;
                    }
                    case 66: {
                        if (this.z(n2, i, o)) {
                            o2.a(n2, I(n9, o));
                            break;
                        }
                        break;
                    }
                    case 65: {
                        if (this.z(n2, i, o)) {
                            o2.q(n2, l(n9, o));
                            break;
                        }
                        break;
                    }
                    case 64: {
                        if (this.z(n2, i, o)) {
                            o2.p(n2, I(n9, o));
                            break;
                        }
                        break;
                    }
                    case 63: {
                        if (this.z(n2, i, o)) {
                            o2.h(n2, I(n9, o));
                            break;
                        }
                        break;
                    }
                    case 62: {
                        if (this.z(n2, i, o)) {
                            o2.c(n2, I(n9, o));
                            break;
                        }
                        break;
                    }
                    case 61: {
                        if (this.z(n2, i, o)) {
                            o2.f(n2, (com.google.android.gms.internal.firebase-auth-api.zzaau)p2.getObject(o, n9));
                            break;
                        }
                        break;
                    }
                    case 60: {
                        if (this.z(n2, i, o)) {
                            o2.o(n2, this.n(i), p2.getObject(o, n9));
                            break;
                        }
                        break;
                    }
                    case 59: {
                        if (this.z(n2, i, o)) {
                            B(n2, p2.getObject(o, n9), o2);
                            break;
                        }
                        break;
                    }
                    case 58: {
                        if (this.z(n2, i, o)) {
                            o2.e(n2, (boolean)b2.j(n9, o));
                            break;
                        }
                        break;
                    }
                    case 57: {
                        if (this.z(n2, i, o)) {
                            o2.i(n2, I(n9, o));
                            break;
                        }
                        break;
                    }
                    case 56: {
                        if (this.z(n2, i, o)) {
                            o2.j(n2, l(n9, o));
                            break;
                        }
                        break;
                    }
                    case 55: {
                        if (this.z(n2, i, o)) {
                            o2.m(n2, I(n9, o));
                            break;
                        }
                        break;
                    }
                    case 54: {
                        if (this.z(n2, i, o)) {
                            o2.d(n2, l(n9, o));
                            break;
                        }
                        break;
                    }
                    case 53: {
                        if (this.z(n2, i, o)) {
                            o2.n(n2, l(n9, o));
                            break;
                        }
                        break;
                    }
                    case 52: {
                        if (this.z(n2, i, o)) {
                            o2.k((float)b2.j(n9, o), n2);
                            break;
                        }
                        break;
                    }
                    case 51: {
                        if (this.z(n2, i, o)) {
                            o2.g((double)b2.j(n9, o), n2);
                            break;
                        }
                        break;
                    }
                    case 50: {
                        if (p2.getObject(o, n9) == null) {
                            break;
                        }
                        final q0 q0 = (q0)this.p(i);
                        throw null;
                    }
                    case 49: {
                        com.google.android.gms.internal.firebase_auth_api.f.j(this.a[i], (List)p2.getObject(o, n9), o2, this.n(i));
                        break;
                    }
                    case 48: {
                        com.google.android.gms.internal.firebase_auth_api.f.q(this.a[i], (List)p2.getObject(o, n9), o2, true);
                        break;
                    }
                    case 47: {
                        com.google.android.gms.internal.firebase_auth_api.f.p(this.a[i], (List)p2.getObject(o, n9), o2, true);
                        break;
                    }
                    case 46: {
                        com.google.android.gms.internal.firebase_auth_api.f.o(this.a[i], (List)p2.getObject(o, n9), o2, true);
                        break;
                    }
                    case 45: {
                        com.google.android.gms.internal.firebase_auth_api.f.n(this.a[i], (List)p2.getObject(o, n9), o2, true);
                        break;
                    }
                    case 44: {
                        com.google.android.gms.internal.firebase_auth_api.f.f(this.a[i], (List)p2.getObject(o, n9), o2, true);
                        break;
                    }
                    case 43: {
                        com.google.android.gms.internal.firebase_auth_api.f.s(this.a[i], (List)p2.getObject(o, n9), o2, true);
                        break;
                    }
                    case 42: {
                        com.google.android.gms.internal.firebase_auth_api.f.c(this.a[i], (List)p2.getObject(o, n9), o2, true);
                        break;
                    }
                    case 41: {
                        com.google.android.gms.internal.firebase_auth_api.f.g(this.a[i], (List)p2.getObject(o, n9), o2, true);
                        break;
                    }
                    case 40: {
                        com.google.android.gms.internal.firebase_auth_api.f.h(this.a[i], (List)p2.getObject(o, n9), o2, true);
                        break;
                    }
                    case 39: {
                        com.google.android.gms.internal.firebase_auth_api.f.k(this.a[i], (List)p2.getObject(o, n9), o2, true);
                        break;
                    }
                    case 38: {
                        com.google.android.gms.internal.firebase_auth_api.f.u(this.a[i], (List)p2.getObject(o, n9), o2, true);
                        break;
                    }
                    case 37: {
                        com.google.android.gms.internal.firebase_auth_api.f.l(this.a[i], (List)p2.getObject(o, n9), o2, true);
                        break;
                    }
                    case 36: {
                        com.google.android.gms.internal.firebase_auth_api.f.i(this.a[i], (List)p2.getObject(o, n9), o2, true);
                        break;
                    }
                    case 35: {
                        com.google.android.gms.internal.firebase_auth_api.f.e(this.a[i], (List)p2.getObject(o, n9), o2, true);
                        break;
                    }
                    case 34: {
                        com.google.android.gms.internal.firebase_auth_api.f.q(this.a[i], (List)p2.getObject(o, n9), o2, false);
                        break;
                    }
                    case 33: {
                        com.google.android.gms.internal.firebase_auth_api.f.p(this.a[i], (List)p2.getObject(o, n9), o2, false);
                        break;
                    }
                    case 32: {
                        com.google.android.gms.internal.firebase_auth_api.f.o(this.a[i], (List)p2.getObject(o, n9), o2, false);
                        break;
                    }
                    case 31: {
                        com.google.android.gms.internal.firebase_auth_api.f.n(this.a[i], (List)p2.getObject(o, n9), o2, false);
                        break;
                    }
                    case 30: {
                        com.google.android.gms.internal.firebase_auth_api.f.f(this.a[i], (List)p2.getObject(o, n9), o2, false);
                        break;
                    }
                    case 29: {
                        com.google.android.gms.internal.firebase_auth_api.f.s(this.a[i], (List)p2.getObject(o, n9), o2, false);
                        break;
                    }
                    case 28: {
                        com.google.android.gms.internal.firebase_auth_api.f.d(this.a[i], (List)p2.getObject(o, n9), o2);
                        break;
                    }
                    case 27: {
                        com.google.android.gms.internal.firebase_auth_api.f.m(this.a[i], (List)p2.getObject(o, n9), o2, this.n(i));
                        break;
                    }
                    case 26: {
                        com.google.android.gms.internal.firebase_auth_api.f.r(this.a[i], (List)p2.getObject(o, n9), o2);
                        break;
                    }
                    case 25: {
                        com.google.android.gms.internal.firebase_auth_api.f.c(this.a[i], (List)p2.getObject(o, n9), o2, false);
                        break;
                    }
                    case 24: {
                        com.google.android.gms.internal.firebase_auth_api.f.g(this.a[i], (List)p2.getObject(o, n9), o2, false);
                        break;
                    }
                    case 23: {
                        com.google.android.gms.internal.firebase_auth_api.f.h(this.a[i], (List)p2.getObject(o, n9), o2, false);
                        break;
                    }
                    case 22: {
                        com.google.android.gms.internal.firebase_auth_api.f.k(this.a[i], (List)p2.getObject(o, n9), o2, false);
                        break;
                    }
                    case 21: {
                        com.google.android.gms.internal.firebase_auth_api.f.u(this.a[i], (List)p2.getObject(o, n9), o2, false);
                        break;
                    }
                    case 20: {
                        com.google.android.gms.internal.firebase_auth_api.f.l(this.a[i], (List)p2.getObject(o, n9), o2, false);
                        break;
                    }
                    case 19: {
                        com.google.android.gms.internal.firebase_auth_api.f.i(this.a[i], (List)p2.getObject(o, n9), o2, false);
                        break;
                    }
                    case 18: {
                        com.google.android.gms.internal.firebase_auth_api.f.e(this.a[i], (List)p2.getObject(o, n9), o2, false);
                        break;
                    }
                    case 17: {
                        if ((int1 & n8) != 0x0) {
                            o2.l(n2, this.n(i), p2.getObject(o, n9));
                            break;
                        }
                        break;
                    }
                    case 16: {
                        if ((int1 & n8) != 0x0) {
                            o2.b(n2, p2.getLong(o, n9));
                            break;
                        }
                        break;
                    }
                    case 15: {
                        if ((int1 & n8) != 0x0) {
                            o2.a(n2, p2.getInt(o, n9));
                            break;
                        }
                        break;
                    }
                    case 14: {
                        if ((int1 & n8) != 0x0) {
                            o2.q(n2, p2.getLong(o, n9));
                            break;
                        }
                        break;
                    }
                    case 13: {
                        if ((int1 & n8) != 0x0) {
                            o2.p(n2, p2.getInt(o, n9));
                            break;
                        }
                        break;
                    }
                    case 12: {
                        if ((int1 & n8) != 0x0) {
                            o2.h(n2, p2.getInt(o, n9));
                            break;
                        }
                        break;
                    }
                    case 11: {
                        if ((int1 & n8) != 0x0) {
                            o2.c(n2, p2.getInt(o, n9));
                            break;
                        }
                        break;
                    }
                    case 10: {
                        if ((int1 & n8) != 0x0) {
                            o2.f(n2, (com.google.android.gms.internal.firebase-auth-api.zzaau)p2.getObject(o, n9));
                            break;
                        }
                        break;
                    }
                    case 9: {
                        if ((int1 & n8) != 0x0) {
                            o2.o(n2, this.n(i), p2.getObject(o, n9));
                            break;
                        }
                        break;
                    }
                    case 8: {
                        if ((int1 & n8) != 0x0) {
                            B(n2, p2.getObject(o, n9), o2);
                            break;
                        }
                        break;
                    }
                    case 7: {
                        if ((int1 & n8) != 0x0) {
                            o2.e(n2, b2.u(n9, o));
                            break;
                        }
                        break;
                    }
                    case 6: {
                        if ((int1 & n8) != 0x0) {
                            o2.i(n2, p2.getInt(o, n9));
                            break;
                        }
                        break;
                    }
                    case 5: {
                        if ((int1 & n8) != 0x0) {
                            o2.j(n2, p2.getLong(o, n9));
                            break;
                        }
                        break;
                    }
                    case 4: {
                        if ((int1 & n8) != 0x0) {
                            o2.m(n2, p2.getInt(o, n9));
                            break;
                        }
                        break;
                    }
                    case 3: {
                        if ((int1 & n8) != 0x0) {
                            o2.d(n2, p2.getLong(o, n9));
                            break;
                        }
                        break;
                    }
                    case 2: {
                        if ((int1 & n8) != 0x0) {
                            o2.n(n2, p2.getLong(o, n9));
                            break;
                        }
                        break;
                    }
                    case 1: {
                        if ((int1 & n8) != 0x0) {
                            o2.k(b2.f(n9, o), n2);
                            break;
                        }
                        break;
                    }
                    case 0: {
                        if ((int1 & n8) != 0x0) {
                            o2.g(b2.e(n9, o), n2);
                            break;
                        }
                        break;
                    }
                }
                i += 3;
            }
            final r1 m = this.m;
            m.r((Object)m.d(o), o2);
            return;
        }
        this.n.a(o);
        throw null;
    }
    
    public final int C(final Object o, final byte[] array, int n, final int n2, int i, final he.e e) throws IOException {
        z0 z0 = this;
        final Unsafe p6 = he.z0.p;
        int n3 = i;
        int n4 = -1;
        int n5 = 0;
        int n6 = 0;
        int n7 = 1048575;
        int n8 = 0;
        Object o2;
        while (true) {
            o2 = o;
            if (n >= n2) {
                i = n8;
                break;
            }
            final int n9 = n + 1;
            final int n10 = n = array[n];
            int k = n9;
            if (n10 < 0) {
                k = he.f.k(n10, array, n9, e);
                n = e.a;
            }
            final int n11 = n >>> 3;
            final int n12 = n & 0x7;
            int n14;
            if (n11 > n4) {
                final int n13 = n5 / 3;
                if (n11 >= z0.c && n11 <= z0.d) {
                    n14 = z0.j(n11, n13);
                }
                else {
                    n14 = -1;
                }
            }
            else if (n11 >= z0.c && n11 <= z0.d) {
                n14 = z0.j(n11, 0);
            }
            else {
                n14 = -1;
            }
            int n21 = 0;
            int n32 = 0;
            int n33 = 0;
            int n34 = 0;
            Label_1632: {
                Label_1477: {
                    if (n14 != -1) {
                        final int[] a = z0.a;
                        final int n15 = a[n14 + 1];
                        final int n16 = n15 >>> 20 & 0xFF;
                        final long n17 = n15 & 0xFFFFF;
                        int n31 = 0;
                        Label_1339: {
                            int n24 = 0;
                            int n29 = 0;
                            Label_1324: {
                                if (n16 <= 17) {
                                    final int n18 = a[n14 + 2];
                                    final int n19 = 1 << (n18 >>> 20);
                                    final int n20 = n18 & 0xFFFFF;
                                    int n22;
                                    if (n20 != n7) {
                                        if (n7 != 1048575) {
                                            p6.putInt(o2, (long)n7, n8);
                                        }
                                        final int int1 = p6.getInt(o2, (long)n20);
                                        n21 = n20;
                                        n22 = int1;
                                    }
                                    else {
                                        n22 = n8;
                                        n21 = n7;
                                    }
                                    int n23 = 0;
                                    Label_1170: {
                                        int c = 0;
                                        Label_1145: {
                                            Label_1065: {
                                                Label_1058: {
                                                    Label_1016: {
                                                        Label_0941: {
                                                            int n25 = 0;
                                                            switch (n16) {
                                                                default: {
                                                                    n23 = k;
                                                                    if (n12 != 3) {
                                                                        break Label_1170;
                                                                    }
                                                                    c = he.f.c(z0.n(n14), array, k, n2, n11 << 3 | 0x4, e);
                                                                    if ((n22 & n19) == 0x0) {
                                                                        p6.putObject(o2, n17, e.c);
                                                                        break Label_1145;
                                                                    }
                                                                    p6.putObject(o2, n17, f0.b(p6.getObject(o2, n17), e.c));
                                                                    break Label_1145;
                                                                }
                                                                case 16: {
                                                                    if (n12 == 0) {
                                                                        n24 = he.f.m(array, k, e);
                                                                        p6.putLong(o, n17, he.l.g(e.b));
                                                                        break Label_1016;
                                                                    }
                                                                    break Label_0941;
                                                                }
                                                                case 15: {
                                                                    if (n12 == 0) {
                                                                        n24 = he.f.j(array, k, e);
                                                                        p6.putInt(o2, n17, he.l.f(e.a));
                                                                        break Label_1058;
                                                                    }
                                                                    break Label_0941;
                                                                }
                                                                case 12: {
                                                                    if (n12 != 0) {
                                                                        break Label_0941;
                                                                    }
                                                                    n24 = he.f.j(array, k, e);
                                                                    final int a2 = e.a;
                                                                    final d0 m = z0.m(n14);
                                                                    if (m != null && !m.zza()) {
                                                                        D(o).c(n, (Object)(long)a2);
                                                                        break Label_1065;
                                                                    }
                                                                    p6.putInt(o2, n17, a2);
                                                                    break Label_1058;
                                                                }
                                                                case 10: {
                                                                    if (n12 == 2) {
                                                                        n24 = he.f.a(array, k, e);
                                                                        p6.putObject(o2, n17, e.c);
                                                                        break Label_1058;
                                                                    }
                                                                    break Label_0941;
                                                                }
                                                                case 9: {
                                                                    if (n12 != 2) {
                                                                        break Label_0941;
                                                                    }
                                                                    n25 = he.f.d(z0.n(n14), array, k, n2, e);
                                                                    if ((n22 & n19) == 0x0) {
                                                                        p6.putObject(o2, n17, e.c);
                                                                        break;
                                                                    }
                                                                    p6.putObject(o2, n17, f0.b(p6.getObject(o2, n17), e.c));
                                                                    break;
                                                                }
                                                                case 8: {
                                                                    if (n12 == 2) {
                                                                        if ((n15 & 0x20000000) == 0x0) {
                                                                            n25 = he.f.g(array, k, e);
                                                                        }
                                                                        else {
                                                                            n25 = he.f.h(array, k, e);
                                                                        }
                                                                        p6.putObject(o2, n17, e.c);
                                                                        break;
                                                                    }
                                                                    break Label_0941;
                                                                }
                                                                case 7: {
                                                                    if (n12 == 0) {
                                                                        n25 = he.f.m(array, k, e);
                                                                        b2.m(o2, n17, e.b != 0L);
                                                                        break;
                                                                    }
                                                                    break Label_0941;
                                                                }
                                                                case 6:
                                                                case 13: {
                                                                    if (n12 == 5) {
                                                                        p6.putInt(o2, n17, he.f.b(k, array));
                                                                        n25 = k + 4;
                                                                        break;
                                                                    }
                                                                    break Label_0941;
                                                                }
                                                                case 5:
                                                                case 14: {
                                                                    if (n12 == 1) {
                                                                        p6.putLong(o, n17, he.f.n(k, array));
                                                                        n24 = k + 8;
                                                                        break Label_1058;
                                                                    }
                                                                    break Label_0941;
                                                                }
                                                                case 4:
                                                                case 11: {
                                                                    n23 = k;
                                                                    if (n12 == 0) {
                                                                        n24 = he.f.j(array, k, e);
                                                                        p6.putInt(o2, n17, e.a);
                                                                        break Label_1058;
                                                                    }
                                                                    break Label_1170;
                                                                }
                                                                case 2:
                                                                case 3: {
                                                                    n23 = k;
                                                                    if (n12 == 0) {
                                                                        n24 = he.f.m(array, k, e);
                                                                        p6.putLong(o, n17, e.b);
                                                                        break Label_1016;
                                                                    }
                                                                    break Label_1170;
                                                                }
                                                                case 1: {
                                                                    n23 = k;
                                                                    if (n12 == 5) {
                                                                        b2.p(o2, n17, Float.intBitsToFloat(he.f.b(k, array)));
                                                                        n24 = k + 4;
                                                                        break Label_1058;
                                                                    }
                                                                    break Label_1170;
                                                                }
                                                                case 0: {
                                                                    n23 = k;
                                                                    if (n12 == 1) {
                                                                        b2.o(o2, n17, Double.longBitsToDouble(he.f.n(k, array)));
                                                                        c = k + 8;
                                                                        break Label_1145;
                                                                    }
                                                                    break Label_1170;
                                                                }
                                                            }
                                                            final int n26 = n;
                                                            final int n27 = n22 | n19;
                                                            n3 = i;
                                                            n = n25;
                                                            n4 = n11;
                                                            n5 = n14;
                                                            n6 = n26;
                                                            n7 = n21;
                                                            n8 = n27;
                                                            continue;
                                                        }
                                                        n23 = k;
                                                        break Label_1170;
                                                    }
                                                    n22 |= n19;
                                                    break Label_1065;
                                                }
                                                n22 |= n19;
                                            }
                                            final int n28 = n22;
                                            n29 = n21;
                                            n8 = n28;
                                            break Label_1324;
                                        }
                                        final int n30 = n22 | n19;
                                        n31 = c;
                                        n7 = n21;
                                        n8 = n30;
                                        break Label_1339;
                                    }
                                    k = n23;
                                    n32 = n22;
                                    n33 = n14;
                                    n34 = i;
                                    break Label_1632;
                                }
                                int n37 = 0;
                                Label_1461: {
                                    Label_1457: {
                                        if (n16 != 27) {
                                            final int n35 = n7;
                                            final int n36 = n8;
                                            int l;
                                            if (n16 <= 49) {
                                                final int j = this.M(o, array, k, n2, n, n11, n12, n14, n15, n16, n17, e);
                                                if ((n37 = j) == k) {
                                                    break Label_1461;
                                                }
                                                l = j;
                                            }
                                            else {
                                                final int n38 = n11;
                                                if (n16 == 50) {
                                                    if (n12 != 2) {
                                                        break Label_1457;
                                                    }
                                                    this.J(o, n14, n17);
                                                    throw null;
                                                }
                                                else {
                                                    z0 = this;
                                                    l = this.K(o, array, k, n2, n, n38, n12, n15, n16, n17, n14, e);
                                                    if (l == k) {
                                                        final int n39 = i;
                                                        k = l;
                                                        n32 = n36;
                                                        n21 = n35;
                                                        n33 = n14;
                                                        n34 = n39;
                                                        break Label_1632;
                                                    }
                                                }
                                            }
                                            final int n40 = n;
                                            final int n41 = i;
                                            z0 = this;
                                            final int n42 = n35;
                                            final int n43 = n36;
                                            n = l;
                                            n3 = n41;
                                            n4 = n11;
                                            n5 = n14;
                                            n6 = n40;
                                            n7 = n42;
                                            n8 = n43;
                                            continue;
                                        }
                                        if (n12 == 2) {
                                            e0 h;
                                            final e0 e2 = h = (e0)p6.getObject(o2, n17);
                                            if (!e2.s()) {
                                                final int size = ((List)e2).size();
                                                int n44;
                                                if (size == 0) {
                                                    n44 = 10;
                                                }
                                                else {
                                                    n44 = size + size;
                                                }
                                                h = e2.h(n44);
                                                p6.putObject(o2, n17, h);
                                            }
                                            final int e3 = he.f.e(z0.n(n14), n, array, k, n2, h, e);
                                            n29 = n7;
                                            n24 = e3;
                                            break Label_1324;
                                        }
                                    }
                                    n37 = k;
                                }
                                final int n45 = i;
                                n33 = n14;
                                k = n37;
                                n34 = n45;
                                break Label_1477;
                            }
                            final int n46 = n24;
                            n7 = n29;
                            n31 = n46;
                        }
                        final int n47 = i;
                        final int n48 = n;
                        n = n31;
                        n3 = n47;
                        n4 = n11;
                        n5 = n14;
                        n6 = n48;
                        continue;
                    }
                    final int n49 = 0;
                    n34 = n3;
                    n33 = n49;
                }
                final int n50 = n8;
                z0 = this;
                n21 = n7;
                n32 = n50;
            }
            n4 = n11;
            final int n51 = n;
            if (n51 == n34 && n34 != 0) {
                n = k;
                n3 = n34;
                n6 = n51;
                i = n32;
                n7 = n21;
                o2 = o;
                break;
            }
            if (z0.f && e.d != r.a()) {
                if (e.d.b(z0.e, n4) != null) {
                    final a0 a3 = (a0)o;
                    throw null;
                }
                n = he.f.i(n51, array, k, n2, D(o), e);
            }
            else {
                n = he.f.i(n51, array, k, n2, D(o), e);
            }
            final int n52 = n34;
            n6 = n51;
            n5 = n33;
            final int n53 = n32;
            n3 = n52;
            n7 = n21;
            n8 = n53;
        }
        if (n7 != 1048575) {
            p6.putInt(o2, (long)n7, i);
        }
        for (i = z0.j; i < z0.k; ++i) {
            z0.o(o2, z0.i[i], null);
        }
        if (n3 == 0) {
            if (n != n2) {
                throw zzacf.zzg();
            }
        }
        else if (n > n2 || n6 != n3) {
            throw zzacf.zzg();
        }
        return n;
    }
    
    public final int G(final Object o) {
        final Unsafe p = z0.p;
        int int1 = 0;
        int n = 0;
        int i = 0;
        int n2 = 1048575;
        while (i < this.a.length) {
            final int k = this.k(i);
            final int[] a = this.a;
            final int n3 = a[i];
            final int n4 = k >>> 20 & 0xFF;
            int n8;
            int n9;
            if (n4 <= 17) {
                final int n5 = a[i + 2];
                final int n6 = n5 & 0xFFFFF;
                final int n7 = 1 << (n5 >>> 20);
                n8 = n2;
                n9 = n7;
                if (n6 != n2) {
                    int1 = p.getInt(o, (long)n6);
                    n8 = n6;
                    n9 = n7;
                }
            }
            else {
                n9 = 0;
                n8 = n2;
            }
            final long n10 = 0xFFFFF & k;
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
                                                    int c2 = 0;
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
                                                                if (this.z(n3, i, o)) {
                                                                    n11 = com.google.android.gms.internal.firebase_auth_api.d.w(n3, (w0)p.getObject(o, n10), this.n(i));
                                                                    break Label_2802;
                                                                }
                                                                break Label_2807;
                                                            }
                                                            case 67: {
                                                                f = n;
                                                                if (this.z(n3, i, o)) {
                                                                    final long l = l(n10, o);
                                                                    n12 = com.google.android.gms.internal.firebase_auth_api.d.d(n3 << 3);
                                                                    n13 = com.google.android.gms.internal.firebase_auth_api.d.e(l >> 63 ^ l + l);
                                                                    break Label_2222;
                                                                }
                                                                break Label_2807;
                                                            }
                                                            case 66: {
                                                                f = n;
                                                                if (this.z(n3, i, o)) {
                                                                    final int j = I(n10, o);
                                                                    n14 = com.google.android.gms.internal.firebase_auth_api.d.d(n3 << 3);
                                                                    n15 = com.google.android.gms.internal.firebase_auth_api.d.d(j >> 31 ^ j + j);
                                                                    break Label_2668;
                                                                }
                                                                break Label_2807;
                                                            }
                                                            case 65: {
                                                                f = n;
                                                                if (this.z(n3, i, o)) {
                                                                    n11 = com.google.android.gms.internal.firebase_auth_api.d.d(n3 << 3);
                                                                    break Label_2799;
                                                                }
                                                                break Label_2807;
                                                            }
                                                            case 64: {
                                                                f = n;
                                                                if (this.z(n3, i, o)) {
                                                                    n11 = com.google.android.gms.internal.firebase_auth_api.d.d(n3 << 3);
                                                                    break Label_2774;
                                                                }
                                                                break Label_2807;
                                                            }
                                                            case 63: {
                                                                f = n;
                                                                if (this.z(n3, i, o)) {
                                                                    final int m = I(n10, o);
                                                                    n14 = com.google.android.gms.internal.firebase_auth_api.d.d(n3 << 3);
                                                                    n15 = com.google.android.gms.internal.firebase_auth_api.d.x(m);
                                                                    break Label_2668;
                                                                }
                                                                break Label_2807;
                                                            }
                                                            case 62: {
                                                                f = n;
                                                                if (this.z(n3, i, o)) {
                                                                    final int i2 = I(n10, o);
                                                                    n14 = com.google.android.gms.internal.firebase_auth_api.d.d(n3 << 3);
                                                                    n15 = com.google.android.gms.internal.firebase_auth_api.d.d(i2);
                                                                    break Label_2668;
                                                                }
                                                                break Label_2807;
                                                            }
                                                            case 61: {
                                                                f = n;
                                                                if (this.z(n3, i, o)) {
                                                                    final zzaau zzaau = (zzaau)p.getObject(o, n10);
                                                                    n16 = com.google.android.gms.internal.firebase_auth_api.d.d(n3 << 3);
                                                                    n17 = zzaau.zzd();
                                                                    n18 = com.google.android.gms.internal.firebase_auth_api.d.d(n17);
                                                                    break;
                                                                }
                                                                break Label_2807;
                                                            }
                                                            case 60: {
                                                                f = n;
                                                                if (this.z(n3, i, o)) {
                                                                    n11 = com.google.android.gms.internal.firebase_auth_api.f.J(n3, this.n(i), p.getObject(o, n10));
                                                                    break Label_2802;
                                                                }
                                                                break Label_2807;
                                                            }
                                                            case 59: {
                                                                f = n;
                                                                if (!this.z(n3, i, o)) {
                                                                    break Label_2807;
                                                                }
                                                                final Object object = p.getObject(o, n10);
                                                                if (object instanceof zzaau) {
                                                                    final zzaau zzaau2 = (zzaau)object;
                                                                    n16 = com.google.android.gms.internal.firebase_auth_api.d.d(n3 << 3);
                                                                    n17 = zzaau2.zzd();
                                                                    n18 = com.google.android.gms.internal.firebase_auth_api.d.d(n17);
                                                                    break;
                                                                }
                                                                final String s = (String)object;
                                                                n14 = com.google.android.gms.internal.firebase_auth_api.d.d(n3 << 3);
                                                                n15 = com.google.android.gms.internal.firebase_auth_api.d.b(s);
                                                                break Label_2668;
                                                            }
                                                            case 58: {
                                                                f = n;
                                                                if (this.z(n3, i, o)) {
                                                                    n11 = com.google.android.gms.internal.firebase_auth_api.d.d(n3 << 3);
                                                                    break Label_2585;
                                                                }
                                                                break Label_2807;
                                                            }
                                                            case 57: {
                                                                f = n;
                                                                if (this.z(n3, i, o)) {
                                                                    n11 = com.google.android.gms.internal.firebase_auth_api.d.d(n3 << 3);
                                                                    break Label_2774;
                                                                }
                                                                break Label_2807;
                                                            }
                                                            case 56: {
                                                                f = n;
                                                                if (this.z(n3, i, o)) {
                                                                    n11 = com.google.android.gms.internal.firebase_auth_api.d.d(n3 << 3);
                                                                    break Label_2799;
                                                                }
                                                                break Label_2807;
                                                            }
                                                            case 55: {
                                                                f = n;
                                                                if (this.z(n3, i, o)) {
                                                                    final int i3 = I(n10, o);
                                                                    n14 = com.google.android.gms.internal.firebase_auth_api.d.d(n3 << 3);
                                                                    n15 = com.google.android.gms.internal.firebase_auth_api.d.x(i3);
                                                                    break Label_2668;
                                                                }
                                                                break Label_2807;
                                                            }
                                                            case 54: {
                                                                f = n;
                                                                if (this.z(n3, i, o)) {
                                                                    final long l2 = l(n10, o);
                                                                    n19 = com.google.android.gms.internal.firebase_auth_api.d.d(n3 << 3);
                                                                    n20 = com.google.android.gms.internal.firebase_auth_api.d.e(l2);
                                                                    break Label_2748;
                                                                }
                                                                break Label_2807;
                                                            }
                                                            case 53: {
                                                                f = n;
                                                                if (this.z(n3, i, o)) {
                                                                    final long l3 = l(n10, o);
                                                                    n19 = com.google.android.gms.internal.firebase_auth_api.d.d(n3 << 3);
                                                                    n20 = com.google.android.gms.internal.firebase_auth_api.d.e(l3);
                                                                    break Label_2748;
                                                                }
                                                                break Label_2807;
                                                            }
                                                            case 52: {
                                                                f = n;
                                                                if (this.z(n3, i, o)) {
                                                                    n11 = com.google.android.gms.internal.firebase_auth_api.d.d(n3 << 3);
                                                                    break Label_2774;
                                                                }
                                                                break Label_2807;
                                                            }
                                                            case 51: {
                                                                f = n;
                                                                if (this.z(n3, i, o)) {
                                                                    n11 = com.google.android.gms.internal.firebase_auth_api.d.d(n3 << 3);
                                                                    break Label_2799;
                                                                }
                                                                break Label_2807;
                                                            }
                                                            case 50: {
                                                                r0.a(p.getObject(o, n10), this.p(i));
                                                                f = n;
                                                                break Label_2807;
                                                            }
                                                            case 49: {
                                                                n11 = com.google.android.gms.internal.firebase_auth_api.f.E(n3, (List)p.getObject(o, n10), this.n(i));
                                                                break Label_2802;
                                                            }
                                                            case 48: {
                                                                final int o2 = com.google.android.gms.internal.firebase_auth_api.f.O((List)p.getObject(o, n10));
                                                                f = n;
                                                                if (o2 > 0) {
                                                                    final int c = com.google.android.gms.internal.firebase_auth_api.d.c(n3);
                                                                    n21 = com.google.android.gms.internal.firebase_auth_api.d.d(o2);
                                                                    n22 = o2;
                                                                    c2 = c;
                                                                    break Label_1780;
                                                                }
                                                                break Label_2807;
                                                            }
                                                            case 47: {
                                                                final int m2 = com.google.android.gms.internal.firebase_auth_api.f.M((List)p.getObject(o, n10));
                                                                f = n;
                                                                if (m2 > 0) {
                                                                    final int c3 = com.google.android.gms.internal.firebase_auth_api.d.c(n3);
                                                                    n21 = com.google.android.gms.internal.firebase_auth_api.d.d(m2);
                                                                    n22 = m2;
                                                                    c2 = c3;
                                                                    break Label_1780;
                                                                }
                                                                break Label_2807;
                                                            }
                                                            case 46: {
                                                                final int d = com.google.android.gms.internal.firebase_auth_api.f.D((List)p.getObject(o, n10));
                                                                f = n;
                                                                if (d > 0) {
                                                                    final int c4 = com.google.android.gms.internal.firebase_auth_api.d.c(n3);
                                                                    n21 = com.google.android.gms.internal.firebase_auth_api.d.d(d);
                                                                    n22 = d;
                                                                    c2 = c4;
                                                                    break Label_1780;
                                                                }
                                                                break Label_2807;
                                                            }
                                                            case 45: {
                                                                final int b = com.google.android.gms.internal.firebase_auth_api.f.B((List)p.getObject(o, n10));
                                                                f = n;
                                                                if (b > 0) {
                                                                    final int c5 = com.google.android.gms.internal.firebase_auth_api.d.c(n3);
                                                                    n21 = com.google.android.gms.internal.firebase_auth_api.d.d(b);
                                                                    n22 = b;
                                                                    c2 = c5;
                                                                    break Label_1780;
                                                                }
                                                                break Label_2807;
                                                            }
                                                            case 44: {
                                                                final int z = com.google.android.gms.internal.firebase_auth_api.f.z((List)p.getObject(o, n10));
                                                                f = n;
                                                                if (z > 0) {
                                                                    final int c6 = com.google.android.gms.internal.firebase_auth_api.d.c(n3);
                                                                    n21 = com.google.android.gms.internal.firebase_auth_api.d.d(z);
                                                                    n22 = z;
                                                                    c2 = c6;
                                                                    break Label_1780;
                                                                }
                                                                break Label_2807;
                                                            }
                                                            case 43: {
                                                                final int r = com.google.android.gms.internal.firebase_auth_api.f.R((List)p.getObject(o, n10));
                                                                f = n;
                                                                if (r > 0) {
                                                                    final int c7 = com.google.android.gms.internal.firebase_auth_api.d.c(n3);
                                                                    n21 = com.google.android.gms.internal.firebase_auth_api.d.d(r);
                                                                    n22 = r;
                                                                    c2 = c7;
                                                                    break Label_1780;
                                                                }
                                                                break Label_2807;
                                                            }
                                                            case 42: {
                                                                final int w = com.google.android.gms.internal.firebase_auth_api.f.w((List)p.getObject(o, n10));
                                                                f = n;
                                                                if (w > 0) {
                                                                    final int c8 = com.google.android.gms.internal.firebase_auth_api.d.c(n3);
                                                                    n21 = com.google.android.gms.internal.firebase_auth_api.d.d(w);
                                                                    n22 = w;
                                                                    c2 = c8;
                                                                    break Label_1780;
                                                                }
                                                                break Label_2807;
                                                            }
                                                            case 41: {
                                                                final int b2 = com.google.android.gms.internal.firebase_auth_api.f.B((List)p.getObject(o, n10));
                                                                f = n;
                                                                if (b2 > 0) {
                                                                    final int c9 = com.google.android.gms.internal.firebase_auth_api.d.c(n3);
                                                                    n21 = com.google.android.gms.internal.firebase_auth_api.d.d(b2);
                                                                    n22 = b2;
                                                                    c2 = c9;
                                                                    break Label_1780;
                                                                }
                                                                break Label_2807;
                                                            }
                                                            case 40: {
                                                                final int d2 = com.google.android.gms.internal.firebase_auth_api.f.D((List)p.getObject(o, n10));
                                                                f = n;
                                                                if (d2 > 0) {
                                                                    final int c10 = com.google.android.gms.internal.firebase_auth_api.d.c(n3);
                                                                    n21 = com.google.android.gms.internal.firebase_auth_api.d.d(d2);
                                                                    n22 = d2;
                                                                    c2 = c10;
                                                                    break Label_1780;
                                                                }
                                                                break Label_2807;
                                                            }
                                                            case 39: {
                                                                final int g = com.google.android.gms.internal.firebase_auth_api.f.G((List)p.getObject(o, n10));
                                                                f = n;
                                                                if (g > 0) {
                                                                    final int c11 = com.google.android.gms.internal.firebase_auth_api.d.c(n3);
                                                                    n21 = com.google.android.gms.internal.firebase_auth_api.d.d(g);
                                                                    n22 = g;
                                                                    c2 = c11;
                                                                    break Label_1780;
                                                                }
                                                                break Label_2807;
                                                            }
                                                            case 38: {
                                                                final int t = com.google.android.gms.internal.firebase_auth_api.f.T((List)p.getObject(o, n10));
                                                                f = n;
                                                                if (t > 0) {
                                                                    final int c12 = com.google.android.gms.internal.firebase_auth_api.d.c(n3);
                                                                    n21 = com.google.android.gms.internal.firebase_auth_api.d.d(t);
                                                                    n22 = t;
                                                                    c2 = c12;
                                                                    break Label_1780;
                                                                }
                                                                break Label_2807;
                                                            }
                                                            case 37: {
                                                                final int i4 = com.google.android.gms.internal.firebase_auth_api.f.I((List)p.getObject(o, n10));
                                                                f = n;
                                                                if (i4 > 0) {
                                                                    final int c13 = com.google.android.gms.internal.firebase_auth_api.d.c(n3);
                                                                    n21 = com.google.android.gms.internal.firebase_auth_api.d.d(i4);
                                                                    n22 = i4;
                                                                    c2 = c13;
                                                                    break Label_1780;
                                                                }
                                                                break Label_2807;
                                                            }
                                                            case 36: {
                                                                final int b3 = com.google.android.gms.internal.firebase_auth_api.f.B((List)p.getObject(o, n10));
                                                                f = n;
                                                                if (b3 > 0) {
                                                                    final int c14 = com.google.android.gms.internal.firebase_auth_api.d.c(n3);
                                                                    n21 = com.google.android.gms.internal.firebase_auth_api.d.d(b3);
                                                                    n22 = b3;
                                                                    c2 = c14;
                                                                    break Label_1780;
                                                                }
                                                                break Label_2807;
                                                            }
                                                            case 35: {
                                                                final int d3 = com.google.android.gms.internal.firebase_auth_api.f.D((List)p.getObject(o, n10));
                                                                f = n;
                                                                if (d3 > 0) {
                                                                    c2 = com.google.android.gms.internal.firebase_auth_api.d.c(n3);
                                                                    n21 = com.google.android.gms.internal.firebase_auth_api.d.d(d3);
                                                                    n22 = d3;
                                                                    break Label_1780;
                                                                }
                                                                break Label_2807;
                                                            }
                                                            case 34: {
                                                                n11 = com.google.android.gms.internal.firebase_auth_api.f.N(n3, (List)p.getObject(o, n10));
                                                                break Label_2802;
                                                            }
                                                            case 33: {
                                                                n11 = com.google.android.gms.internal.firebase_auth_api.f.L(n3, (List)p.getObject(o, n10));
                                                                break Label_2802;
                                                            }
                                                            case 32: {
                                                                n11 = com.google.android.gms.internal.firebase_auth_api.f.C(n3, (List)p.getObject(o, n10));
                                                                break Label_2802;
                                                            }
                                                            case 31: {
                                                                n11 = com.google.android.gms.internal.firebase_auth_api.f.A(n3, (List)p.getObject(o, n10));
                                                                break Label_2802;
                                                            }
                                                            case 30: {
                                                                n11 = com.google.android.gms.internal.firebase_auth_api.f.y(n3, (List)p.getObject(o, n10));
                                                                break Label_2802;
                                                            }
                                                            case 29: {
                                                                n11 = com.google.android.gms.internal.firebase_auth_api.f.Q(n3, (List)p.getObject(o, n10));
                                                                break Label_2802;
                                                            }
                                                            case 28: {
                                                                n11 = com.google.android.gms.internal.firebase_auth_api.f.x(n3, (List)p.getObject(o, n10));
                                                                break Label_2802;
                                                            }
                                                            case 27: {
                                                                n11 = com.google.android.gms.internal.firebase_auth_api.f.K(n3, (List)p.getObject(o, n10), this.n(i));
                                                                break Label_2802;
                                                            }
                                                            case 26: {
                                                                n11 = com.google.android.gms.internal.firebase_auth_api.f.P(n3, (List)p.getObject(o, n10));
                                                                break Label_2802;
                                                            }
                                                            case 25: {
                                                                n11 = com.google.android.gms.internal.firebase_auth_api.f.t(n3, (List)p.getObject(o, n10));
                                                                break Label_2802;
                                                            }
                                                            case 24: {
                                                                n11 = com.google.android.gms.internal.firebase_auth_api.f.A(n3, (List)p.getObject(o, n10));
                                                                break Label_2802;
                                                            }
                                                            case 23: {
                                                                n11 = com.google.android.gms.internal.firebase_auth_api.f.C(n3, (List)p.getObject(o, n10));
                                                                break Label_2802;
                                                            }
                                                            case 22: {
                                                                n11 = com.google.android.gms.internal.firebase_auth_api.f.F(n3, (List)p.getObject(o, n10));
                                                                break Label_2802;
                                                            }
                                                            case 21: {
                                                                n11 = com.google.android.gms.internal.firebase_auth_api.f.S(n3, (List)p.getObject(o, n10));
                                                                break Label_2802;
                                                            }
                                                            case 20: {
                                                                n11 = com.google.android.gms.internal.firebase_auth_api.f.H(n3, (List)p.getObject(o, n10));
                                                                break Label_2802;
                                                            }
                                                            case 19: {
                                                                n11 = com.google.android.gms.internal.firebase_auth_api.f.A(n3, (List)p.getObject(o, n10));
                                                                break Label_2802;
                                                            }
                                                            case 18: {
                                                                n11 = com.google.android.gms.internal.firebase_auth_api.f.C(n3, (List)p.getObject(o, n10));
                                                                break Label_2802;
                                                            }
                                                            case 17: {
                                                                f = n;
                                                                if ((int1 & n9) != 0x0) {
                                                                    n11 = com.google.android.gms.internal.firebase_auth_api.d.w(n3, (w0)p.getObject(o, n10), this.n(i));
                                                                    break Label_2802;
                                                                }
                                                                break Label_2807;
                                                            }
                                                            case 16: {
                                                                f = n;
                                                                if ((n9 & int1) != 0x0) {
                                                                    final long long1 = p.getLong(o, n10);
                                                                    n12 = com.google.android.gms.internal.firebase_auth_api.d.d(n3 << 3);
                                                                    n13 = com.google.android.gms.internal.firebase_auth_api.d.e(long1 >> 63 ^ long1 + long1);
                                                                    break Label_2222;
                                                                }
                                                                break Label_2807;
                                                            }
                                                            case 15: {
                                                                f = n;
                                                                if ((int1 & n9) != 0x0) {
                                                                    final int int2 = p.getInt(o, n10);
                                                                    n14 = com.google.android.gms.internal.firebase_auth_api.d.d(n3 << 3);
                                                                    n15 = com.google.android.gms.internal.firebase_auth_api.d.d(int2 >> 31 ^ int2 + int2);
                                                                    break Label_2668;
                                                                }
                                                                break Label_2807;
                                                            }
                                                            case 14: {
                                                                f = n;
                                                                if ((int1 & n9) != 0x0) {
                                                                    n11 = com.google.android.gms.internal.firebase_auth_api.d.d(n3 << 3);
                                                                    break Label_2799;
                                                                }
                                                                break Label_2807;
                                                            }
                                                            case 13: {
                                                                f = n;
                                                                if ((int1 & n9) != 0x0) {
                                                                    n11 = com.google.android.gms.internal.firebase_auth_api.d.d(n3 << 3);
                                                                    break Label_2774;
                                                                }
                                                                break Label_2807;
                                                            }
                                                            case 12: {
                                                                f = n;
                                                                if ((int1 & n9) != 0x0) {
                                                                    final int int3 = p.getInt(o, n10);
                                                                    n14 = com.google.android.gms.internal.firebase_auth_api.d.d(n3 << 3);
                                                                    n15 = com.google.android.gms.internal.firebase_auth_api.d.x(int3);
                                                                    break Label_2668;
                                                                }
                                                                break Label_2807;
                                                            }
                                                            case 11: {
                                                                f = n;
                                                                if ((int1 & n9) != 0x0) {
                                                                    final int int4 = p.getInt(o, n10);
                                                                    n14 = com.google.android.gms.internal.firebase_auth_api.d.d(n3 << 3);
                                                                    n15 = com.google.android.gms.internal.firebase_auth_api.d.d(int4);
                                                                    break Label_2668;
                                                                }
                                                                break Label_2807;
                                                            }
                                                            case 10: {
                                                                f = n;
                                                                if ((int1 & n9) != 0x0) {
                                                                    final zzaau zzaau3 = (zzaau)p.getObject(o, n10);
                                                                    n23 = com.google.android.gms.internal.firebase_auth_api.d.d(n3 << 3);
                                                                    n24 = zzaau3.zzd();
                                                                    n25 = com.google.android.gms.internal.firebase_auth_api.d.d(n24);
                                                                    break Label_2529;
                                                                }
                                                                break Label_2807;
                                                            }
                                                            case 9: {
                                                                f = n;
                                                                if ((int1 & n9) != 0x0) {
                                                                    n11 = com.google.android.gms.internal.firebase_auth_api.f.J(n3, this.n(i), p.getObject(o, n10));
                                                                    break Label_2802;
                                                                }
                                                                break Label_2807;
                                                            }
                                                            case 8: {
                                                                f = n;
                                                                if ((int1 & n9) == 0x0) {
                                                                    break Label_2807;
                                                                }
                                                                final Object object2 = p.getObject(o, n10);
                                                                if (object2 instanceof zzaau) {
                                                                    final zzaau zzaau4 = (zzaau)object2;
                                                                    n23 = com.google.android.gms.internal.firebase_auth_api.d.d(n3 << 3);
                                                                    n24 = zzaau4.zzd();
                                                                    n25 = com.google.android.gms.internal.firebase_auth_api.d.d(n24);
                                                                    break Label_2529;
                                                                }
                                                                final String s2 = (String)object2;
                                                                n14 = com.google.android.gms.internal.firebase_auth_api.d.d(n3 << 3);
                                                                n15 = com.google.android.gms.internal.firebase_auth_api.d.b(s2);
                                                                break Label_2668;
                                                            }
                                                            case 7: {
                                                                f = n;
                                                                if ((int1 & n9) != 0x0) {
                                                                    n11 = com.google.android.gms.internal.firebase_auth_api.d.d(n3 << 3);
                                                                    break Label_2585;
                                                                }
                                                                break Label_2807;
                                                            }
                                                            case 6: {
                                                                f = n;
                                                                if ((int1 & n9) != 0x0) {
                                                                    n11 = com.google.android.gms.internal.firebase_auth_api.d.d(n3 << 3);
                                                                    break Label_2774;
                                                                }
                                                                break Label_2807;
                                                            }
                                                            case 5: {
                                                                f = n;
                                                                if ((int1 & n9) != 0x0) {
                                                                    n11 = com.google.android.gms.internal.firebase_auth_api.d.d(n3 << 3);
                                                                    break Label_2799;
                                                                }
                                                                break Label_2807;
                                                            }
                                                            case 4: {
                                                                f = n;
                                                                if ((int1 & n9) != 0x0) {
                                                                    final int int5 = p.getInt(o, n10);
                                                                    n14 = com.google.android.gms.internal.firebase_auth_api.d.d(n3 << 3);
                                                                    n15 = com.google.android.gms.internal.firebase_auth_api.d.x(int5);
                                                                    break Label_2668;
                                                                }
                                                                break Label_2807;
                                                            }
                                                            case 3: {
                                                                f = n;
                                                                if ((int1 & n9) != 0x0) {
                                                                    final long long2 = p.getLong(o, n10);
                                                                    n19 = com.google.android.gms.internal.firebase_auth_api.d.d(n3 << 3);
                                                                    n20 = com.google.android.gms.internal.firebase_auth_api.d.e(long2);
                                                                    break Label_2748;
                                                                }
                                                                break Label_2807;
                                                            }
                                                            case 2: {
                                                                f = n;
                                                                if ((int1 & n9) != 0x0) {
                                                                    final long long3 = p.getLong(o, n10);
                                                                    n19 = com.google.android.gms.internal.firebase_auth_api.d.d(n3 << 3);
                                                                    n20 = com.google.android.gms.internal.firebase_auth_api.d.e(long3);
                                                                    break Label_2748;
                                                                }
                                                                break Label_2807;
                                                            }
                                                            case 1: {
                                                                f = n;
                                                                if ((int1 & n9) != 0x0) {
                                                                    n11 = com.google.android.gms.internal.firebase_auth_api.d.d(n3 << 3);
                                                                    break Label_2774;
                                                                }
                                                                break Label_2807;
                                                            }
                                                            case 0: {
                                                                f = n;
                                                                if ((int1 & n9) != 0x0) {
                                                                    n11 = com.google.android.gms.internal.firebase_auth_api.d.d(n3 << 3);
                                                                    break Label_2799;
                                                                }
                                                                break Label_2807;
                                                            }
                                                        }
                                                        n26 = n18 + n17 + n16;
                                                        break Label_1787;
                                                    }
                                                    n26 = n21 + c2 + n22;
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
        final r1 m3 = this.m;
        final int a2 = m3.a((Object)m3.d(o));
        if (!this.f) {
            return a2 + n;
        }
        this.n.a(o);
        throw null;
    }
    
    public final int H(final Object o) {
        final Unsafe p = z0.p;
        int i = 0;
        int n = 0;
        while (i < this.a.length) {
            final int k = this.k(i);
            final int n2 = k >>> 20 & 0xFF;
            final int n3 = this.a[i];
            final long n4 = k & 0xFFFFF;
            if (n2 >= ((zzabq)zzabq.zzJ).zza() && n2 <= ((zzabq)zzabq.zzW).zza()) {
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
                                                int c2 = 0;
                                                switch (n2) {
                                                    default: {
                                                        n6 = n;
                                                        break Label_2709;
                                                    }
                                                    case 68: {
                                                        n6 = n;
                                                        if (this.z(n3, i, o)) {
                                                            n7 = com.google.android.gms.internal.firebase_auth_api.d.w(n3, (w0)b2.j(n4, o), this.n(i));
                                                            break Label_2704;
                                                        }
                                                        break Label_2709;
                                                    }
                                                    case 67: {
                                                        n6 = n;
                                                        if (this.z(n3, i, o)) {
                                                            final long l = l(n4, o);
                                                            n8 = com.google.android.gms.internal.firebase_auth_api.d.d(n3 << 3);
                                                            n9 = com.google.android.gms.internal.firebase_auth_api.d.e(l >> 63 ^ l + l);
                                                            break Label_2566;
                                                        }
                                                        break Label_2709;
                                                    }
                                                    case 66: {
                                                        n6 = n;
                                                        if (this.z(n3, i, o)) {
                                                            final int j = I(n4, o);
                                                            n8 = com.google.android.gms.internal.firebase_auth_api.d.d(n3 << 3);
                                                            n9 = com.google.android.gms.internal.firebase_auth_api.d.d(j >> 31 ^ j + j);
                                                            break Label_2566;
                                                        }
                                                        break Label_2709;
                                                    }
                                                    case 65: {
                                                        n6 = n;
                                                        if (this.z(n3, i, o)) {
                                                            n7 = com.google.android.gms.internal.firebase_auth_api.d.d(n3 << 3);
                                                            break Label_2701;
                                                        }
                                                        break Label_2709;
                                                    }
                                                    case 64: {
                                                        n6 = n;
                                                        if (this.z(n3, i, o)) {
                                                            n7 = com.google.android.gms.internal.firebase_auth_api.d.d(n3 << 3);
                                                            break Label_2674;
                                                        }
                                                        break Label_2709;
                                                    }
                                                    case 63: {
                                                        n6 = n;
                                                        if (this.z(n3, i, o)) {
                                                            final int m = I(n4, o);
                                                            n8 = com.google.android.gms.internal.firebase_auth_api.d.d(n3 << 3);
                                                            n9 = com.google.android.gms.internal.firebase_auth_api.d.x(m);
                                                            break Label_2566;
                                                        }
                                                        break Label_2709;
                                                    }
                                                    case 62: {
                                                        n6 = n;
                                                        if (this.z(n3, i, o)) {
                                                            final int i2 = I(n4, o);
                                                            n8 = com.google.android.gms.internal.firebase_auth_api.d.d(n3 << 3);
                                                            n9 = com.google.android.gms.internal.firebase_auth_api.d.d(i2);
                                                            break Label_2566;
                                                        }
                                                        break Label_2709;
                                                    }
                                                    case 61: {
                                                        n6 = n;
                                                        if (this.z(n3, i, o)) {
                                                            final zzaau zzaau = (zzaau)b2.j(n4, o);
                                                            n10 = com.google.android.gms.internal.firebase_auth_api.d.d(n3 << 3);
                                                            n11 = zzaau.zzd();
                                                            n12 = com.google.android.gms.internal.firebase_auth_api.d.d(n11);
                                                            break Label_2419;
                                                        }
                                                        break Label_2709;
                                                    }
                                                    case 60: {
                                                        n6 = n;
                                                        if (this.z(n3, i, o)) {
                                                            n7 = com.google.android.gms.internal.firebase_auth_api.f.J(n3, this.n(i), b2.j(n4, o));
                                                            break Label_2704;
                                                        }
                                                        break Label_2709;
                                                    }
                                                    case 59: {
                                                        n6 = n;
                                                        if (!this.z(n3, i, o)) {
                                                            break Label_2709;
                                                        }
                                                        final Object j2 = b2.j(n4, o);
                                                        if (j2 instanceof zzaau) {
                                                            final zzaau zzaau2 = (zzaau)j2;
                                                            n10 = com.google.android.gms.internal.firebase_auth_api.d.d(n3 << 3);
                                                            n11 = zzaau2.zzd();
                                                            n12 = com.google.android.gms.internal.firebase_auth_api.d.d(n11);
                                                            break Label_2419;
                                                        }
                                                        final String s = (String)j2;
                                                        n8 = com.google.android.gms.internal.firebase_auth_api.d.d(n3 << 3);
                                                        n9 = com.google.android.gms.internal.firebase_auth_api.d.b(s);
                                                        break Label_2566;
                                                    }
                                                    case 58: {
                                                        n6 = n;
                                                        if (this.z(n3, i, o)) {
                                                            n7 = com.google.android.gms.internal.firebase_auth_api.d.d(n3 << 3);
                                                            break Label_2479;
                                                        }
                                                        break Label_2709;
                                                    }
                                                    case 57: {
                                                        n6 = n;
                                                        if (this.z(n3, i, o)) {
                                                            n7 = com.google.android.gms.internal.firebase_auth_api.d.d(n3 << 3);
                                                            break Label_2674;
                                                        }
                                                        break Label_2709;
                                                    }
                                                    case 56: {
                                                        n6 = n;
                                                        if (this.z(n3, i, o)) {
                                                            n7 = com.google.android.gms.internal.firebase_auth_api.d.d(n3 << 3);
                                                            break Label_2701;
                                                        }
                                                        break Label_2709;
                                                    }
                                                    case 55: {
                                                        n6 = n;
                                                        if (this.z(n3, i, o)) {
                                                            final int i3 = I(n4, o);
                                                            n8 = com.google.android.gms.internal.firebase_auth_api.d.d(n3 << 3);
                                                            n9 = com.google.android.gms.internal.firebase_auth_api.d.x(i3);
                                                            break Label_2566;
                                                        }
                                                        break Label_2709;
                                                    }
                                                    case 54: {
                                                        n6 = n;
                                                        if (this.z(n3, i, o)) {
                                                            final long l2 = l(n4, o);
                                                            n13 = com.google.android.gms.internal.firebase_auth_api.d.d(n3 << 3);
                                                            n14 = com.google.android.gms.internal.firebase_auth_api.d.e(l2);
                                                            break Label_2646;
                                                        }
                                                        break Label_2709;
                                                    }
                                                    case 53: {
                                                        n6 = n;
                                                        if (this.z(n3, i, o)) {
                                                            final long l3 = l(n4, o);
                                                            n13 = com.google.android.gms.internal.firebase_auth_api.d.d(n3 << 3);
                                                            n14 = com.google.android.gms.internal.firebase_auth_api.d.e(l3);
                                                            break Label_2646;
                                                        }
                                                        break Label_2709;
                                                    }
                                                    case 52: {
                                                        n6 = n;
                                                        if (this.z(n3, i, o)) {
                                                            n7 = com.google.android.gms.internal.firebase_auth_api.d.d(n3 << 3);
                                                            break Label_2674;
                                                        }
                                                        break Label_2709;
                                                    }
                                                    case 51: {
                                                        n6 = n;
                                                        if (this.z(n3, i, o)) {
                                                            n7 = com.google.android.gms.internal.firebase_auth_api.d.d(n3 << 3);
                                                            break Label_2701;
                                                        }
                                                        break Label_2709;
                                                    }
                                                    case 50: {
                                                        r0.a(b2.j(n4, o), this.p(i));
                                                        n6 = n;
                                                        break Label_2709;
                                                    }
                                                    case 49: {
                                                        n7 = com.google.android.gms.internal.firebase_auth_api.f.E(n3, (List)b2.j(n4, o), this.n(i));
                                                        break Label_2704;
                                                    }
                                                    case 48: {
                                                        final int o2 = com.google.android.gms.internal.firebase_auth_api.f.O((List)p.getObject(o, n4));
                                                        n6 = n;
                                                        if (o2 > 0) {
                                                            final int c = com.google.android.gms.internal.firebase_auth_api.d.c(n3);
                                                            n15 = com.google.android.gms.internal.firebase_auth_api.d.d(o2);
                                                            n16 = o2;
                                                            c2 = c;
                                                            break;
                                                        }
                                                        break Label_2709;
                                                    }
                                                    case 47: {
                                                        final int m2 = com.google.android.gms.internal.firebase_auth_api.f.M((List)p.getObject(o, n4));
                                                        n6 = n;
                                                        if (m2 > 0) {
                                                            final int c3 = com.google.android.gms.internal.firebase_auth_api.d.c(n3);
                                                            n15 = com.google.android.gms.internal.firebase_auth_api.d.d(m2);
                                                            n16 = m2;
                                                            c2 = c3;
                                                            break;
                                                        }
                                                        break Label_2709;
                                                    }
                                                    case 46: {
                                                        final int d = com.google.android.gms.internal.firebase_auth_api.f.D((List)p.getObject(o, n4));
                                                        n6 = n;
                                                        if (d > 0) {
                                                            final int c4 = com.google.android.gms.internal.firebase_auth_api.d.c(n3);
                                                            n15 = com.google.android.gms.internal.firebase_auth_api.d.d(d);
                                                            n16 = d;
                                                            c2 = c4;
                                                            break;
                                                        }
                                                        break Label_2709;
                                                    }
                                                    case 45: {
                                                        final int b = com.google.android.gms.internal.firebase_auth_api.f.B((List)p.getObject(o, n4));
                                                        n6 = n;
                                                        if (b > 0) {
                                                            final int c5 = com.google.android.gms.internal.firebase_auth_api.d.c(n3);
                                                            n15 = com.google.android.gms.internal.firebase_auth_api.d.d(b);
                                                            n16 = b;
                                                            c2 = c5;
                                                            break;
                                                        }
                                                        break Label_2709;
                                                    }
                                                    case 44: {
                                                        final int z = com.google.android.gms.internal.firebase_auth_api.f.z((List)p.getObject(o, n4));
                                                        n6 = n;
                                                        if (z > 0) {
                                                            final int c6 = com.google.android.gms.internal.firebase_auth_api.d.c(n3);
                                                            n15 = com.google.android.gms.internal.firebase_auth_api.d.d(z);
                                                            n16 = z;
                                                            c2 = c6;
                                                            break;
                                                        }
                                                        break Label_2709;
                                                    }
                                                    case 43: {
                                                        final int r = com.google.android.gms.internal.firebase_auth_api.f.R((List)p.getObject(o, n4));
                                                        n6 = n;
                                                        if (r > 0) {
                                                            final int c7 = com.google.android.gms.internal.firebase_auth_api.d.c(n3);
                                                            n15 = com.google.android.gms.internal.firebase_auth_api.d.d(r);
                                                            n16 = r;
                                                            c2 = c7;
                                                            break;
                                                        }
                                                        break Label_2709;
                                                    }
                                                    case 42: {
                                                        final int w = com.google.android.gms.internal.firebase_auth_api.f.w((List)p.getObject(o, n4));
                                                        n6 = n;
                                                        if (w > 0) {
                                                            final int c8 = com.google.android.gms.internal.firebase_auth_api.d.c(n3);
                                                            n15 = com.google.android.gms.internal.firebase_auth_api.d.d(w);
                                                            n16 = w;
                                                            c2 = c8;
                                                            break;
                                                        }
                                                        break Label_2709;
                                                    }
                                                    case 41: {
                                                        final int b2 = com.google.android.gms.internal.firebase_auth_api.f.B((List)p.getObject(o, n4));
                                                        n6 = n;
                                                        if (b2 > 0) {
                                                            final int c9 = com.google.android.gms.internal.firebase_auth_api.d.c(n3);
                                                            n15 = com.google.android.gms.internal.firebase_auth_api.d.d(b2);
                                                            n16 = b2;
                                                            c2 = c9;
                                                            break;
                                                        }
                                                        break Label_2709;
                                                    }
                                                    case 40: {
                                                        final int d2 = com.google.android.gms.internal.firebase_auth_api.f.D((List)p.getObject(o, n4));
                                                        n6 = n;
                                                        if (d2 > 0) {
                                                            final int c10 = com.google.android.gms.internal.firebase_auth_api.d.c(n3);
                                                            n15 = com.google.android.gms.internal.firebase_auth_api.d.d(d2);
                                                            n16 = d2;
                                                            c2 = c10;
                                                            break;
                                                        }
                                                        break Label_2709;
                                                    }
                                                    case 39: {
                                                        final int g = com.google.android.gms.internal.firebase_auth_api.f.G((List)p.getObject(o, n4));
                                                        n6 = n;
                                                        if (g > 0) {
                                                            final int c11 = com.google.android.gms.internal.firebase_auth_api.d.c(n3);
                                                            n15 = com.google.android.gms.internal.firebase_auth_api.d.d(g);
                                                            n16 = g;
                                                            c2 = c11;
                                                            break;
                                                        }
                                                        break Label_2709;
                                                    }
                                                    case 38: {
                                                        final int t = com.google.android.gms.internal.firebase_auth_api.f.T((List)p.getObject(o, n4));
                                                        n6 = n;
                                                        if (t > 0) {
                                                            final int c12 = com.google.android.gms.internal.firebase_auth_api.d.c(n3);
                                                            n15 = com.google.android.gms.internal.firebase_auth_api.d.d(t);
                                                            n16 = t;
                                                            c2 = c12;
                                                            break;
                                                        }
                                                        break Label_2709;
                                                    }
                                                    case 37: {
                                                        final int i4 = com.google.android.gms.internal.firebase_auth_api.f.I((List)p.getObject(o, n4));
                                                        n6 = n;
                                                        if (i4 > 0) {
                                                            final int c13 = com.google.android.gms.internal.firebase_auth_api.d.c(n3);
                                                            n15 = com.google.android.gms.internal.firebase_auth_api.d.d(i4);
                                                            n16 = i4;
                                                            c2 = c13;
                                                            break;
                                                        }
                                                        break Label_2709;
                                                    }
                                                    case 36: {
                                                        final int b3 = com.google.android.gms.internal.firebase_auth_api.f.B((List)p.getObject(o, n4));
                                                        n6 = n;
                                                        if (b3 > 0) {
                                                            final int c14 = com.google.android.gms.internal.firebase_auth_api.d.c(n3);
                                                            n15 = com.google.android.gms.internal.firebase_auth_api.d.d(b3);
                                                            n16 = b3;
                                                            c2 = c14;
                                                            break;
                                                        }
                                                        break Label_2709;
                                                    }
                                                    case 35: {
                                                        final int d3 = com.google.android.gms.internal.firebase_auth_api.f.D((List)p.getObject(o, n4));
                                                        n6 = n;
                                                        if (d3 > 0) {
                                                            c2 = com.google.android.gms.internal.firebase_auth_api.d.c(n3);
                                                            n15 = com.google.android.gms.internal.firebase_auth_api.d.d(d3);
                                                            n16 = d3;
                                                            break;
                                                        }
                                                        break Label_2709;
                                                    }
                                                    case 34: {
                                                        n7 = com.google.android.gms.internal.firebase_auth_api.f.N(n3, (List)b2.j(n4, o));
                                                        break Label_2704;
                                                    }
                                                    case 33: {
                                                        n7 = com.google.android.gms.internal.firebase_auth_api.f.L(n3, (List)b2.j(n4, o));
                                                        break Label_2704;
                                                    }
                                                    case 32: {
                                                        n7 = com.google.android.gms.internal.firebase_auth_api.f.C(n3, (List)b2.j(n4, o));
                                                        break Label_2704;
                                                    }
                                                    case 31: {
                                                        n7 = com.google.android.gms.internal.firebase_auth_api.f.A(n3, (List)b2.j(n4, o));
                                                        break Label_2704;
                                                    }
                                                    case 30: {
                                                        n7 = com.google.android.gms.internal.firebase_auth_api.f.y(n3, (List)b2.j(n4, o));
                                                        break Label_2704;
                                                    }
                                                    case 29: {
                                                        n7 = com.google.android.gms.internal.firebase_auth_api.f.Q(n3, (List)b2.j(n4, o));
                                                        break Label_2704;
                                                    }
                                                    case 28: {
                                                        n7 = com.google.android.gms.internal.firebase_auth_api.f.x(n3, (List)b2.j(n4, o));
                                                        break Label_2704;
                                                    }
                                                    case 27: {
                                                        n7 = com.google.android.gms.internal.firebase_auth_api.f.K(n3, (List)b2.j(n4, o), this.n(i));
                                                        break Label_2704;
                                                    }
                                                    case 26: {
                                                        n7 = com.google.android.gms.internal.firebase_auth_api.f.P(n3, (List)b2.j(n4, o));
                                                        break Label_2704;
                                                    }
                                                    case 25: {
                                                        n7 = com.google.android.gms.internal.firebase_auth_api.f.t(n3, (List)b2.j(n4, o));
                                                        break Label_2704;
                                                    }
                                                    case 24: {
                                                        n7 = com.google.android.gms.internal.firebase_auth_api.f.A(n3, (List)b2.j(n4, o));
                                                        break Label_2704;
                                                    }
                                                    case 23: {
                                                        n7 = com.google.android.gms.internal.firebase_auth_api.f.C(n3, (List)b2.j(n4, o));
                                                        break Label_2704;
                                                    }
                                                    case 22: {
                                                        n7 = com.google.android.gms.internal.firebase_auth_api.f.F(n3, (List)b2.j(n4, o));
                                                        break Label_2704;
                                                    }
                                                    case 21: {
                                                        n7 = com.google.android.gms.internal.firebase_auth_api.f.S(n3, (List)b2.j(n4, o));
                                                        break Label_2704;
                                                    }
                                                    case 20: {
                                                        n7 = com.google.android.gms.internal.firebase_auth_api.f.H(n3, (List)b2.j(n4, o));
                                                        break Label_2704;
                                                    }
                                                    case 19: {
                                                        n7 = com.google.android.gms.internal.firebase_auth_api.f.A(n3, (List)b2.j(n4, o));
                                                        break Label_2704;
                                                    }
                                                    case 18: {
                                                        n7 = com.google.android.gms.internal.firebase_auth_api.f.C(n3, (List)b2.j(n4, o));
                                                        break Label_2704;
                                                    }
                                                    case 17: {
                                                        n6 = n;
                                                        if (this.y(i, o)) {
                                                            n7 = com.google.android.gms.internal.firebase_auth_api.d.w(n3, (w0)b2.j(n4, o), this.n(i));
                                                            break Label_2704;
                                                        }
                                                        break Label_2709;
                                                    }
                                                    case 16: {
                                                        n6 = n;
                                                        if (this.y(i, o)) {
                                                            final long h = b2.h(n4, o);
                                                            n8 = com.google.android.gms.internal.firebase_auth_api.d.d(n3 << 3);
                                                            n9 = com.google.android.gms.internal.firebase_auth_api.d.e(h >> 63 ^ h + h);
                                                            break Label_2566;
                                                        }
                                                        break Label_2709;
                                                    }
                                                    case 15: {
                                                        n6 = n;
                                                        if (this.y(i, o)) {
                                                            final int g2 = b2.g(n4, o);
                                                            n8 = com.google.android.gms.internal.firebase_auth_api.d.d(n3 << 3);
                                                            n9 = com.google.android.gms.internal.firebase_auth_api.d.d(g2 >> 31 ^ g2 + g2);
                                                            break Label_2566;
                                                        }
                                                        break Label_2709;
                                                    }
                                                    case 14: {
                                                        n6 = n;
                                                        if (this.y(i, o)) {
                                                            n7 = com.google.android.gms.internal.firebase_auth_api.d.d(n3 << 3);
                                                            break Label_2701;
                                                        }
                                                        break Label_2709;
                                                    }
                                                    case 13: {
                                                        n6 = n;
                                                        if (this.y(i, o)) {
                                                            n7 = com.google.android.gms.internal.firebase_auth_api.d.d(n3 << 3);
                                                            break Label_2674;
                                                        }
                                                        break Label_2709;
                                                    }
                                                    case 12: {
                                                        n6 = n;
                                                        if (this.y(i, o)) {
                                                            final int g3 = b2.g(n4, o);
                                                            n8 = com.google.android.gms.internal.firebase_auth_api.d.d(n3 << 3);
                                                            n9 = com.google.android.gms.internal.firebase_auth_api.d.x(g3);
                                                            break Label_2566;
                                                        }
                                                        break Label_2709;
                                                    }
                                                    case 11: {
                                                        n6 = n;
                                                        if (this.y(i, o)) {
                                                            final int g4 = b2.g(n4, o);
                                                            n8 = com.google.android.gms.internal.firebase_auth_api.d.d(n3 << 3);
                                                            n9 = com.google.android.gms.internal.firebase_auth_api.d.d(g4);
                                                            break Label_2566;
                                                        }
                                                        break Label_2709;
                                                    }
                                                    case 10: {
                                                        n6 = n;
                                                        if (this.y(i, o)) {
                                                            final zzaau zzaau3 = (zzaau)b2.j(n4, o);
                                                            n10 = com.google.android.gms.internal.firebase_auth_api.d.d(n3 << 3);
                                                            n11 = zzaau3.zzd();
                                                            n12 = com.google.android.gms.internal.firebase_auth_api.d.d(n11);
                                                            break Label_2419;
                                                        }
                                                        break Label_2709;
                                                    }
                                                    case 9: {
                                                        n6 = n;
                                                        if (this.y(i, o)) {
                                                            n7 = com.google.android.gms.internal.firebase_auth_api.f.J(n3, this.n(i), b2.j(n4, o));
                                                            break Label_2704;
                                                        }
                                                        break Label_2709;
                                                    }
                                                    case 8: {
                                                        n6 = n;
                                                        if (!this.y(i, o)) {
                                                            break Label_2709;
                                                        }
                                                        final Object j3 = b2.j(n4, o);
                                                        if (j3 instanceof zzaau) {
                                                            final zzaau zzaau4 = (zzaau)j3;
                                                            n10 = com.google.android.gms.internal.firebase_auth_api.d.d(n3 << 3);
                                                            n11 = zzaau4.zzd();
                                                            n12 = com.google.android.gms.internal.firebase_auth_api.d.d(n11);
                                                            break Label_2419;
                                                        }
                                                        final String s2 = (String)j3;
                                                        n8 = com.google.android.gms.internal.firebase_auth_api.d.d(n3 << 3);
                                                        n9 = com.google.android.gms.internal.firebase_auth_api.d.b(s2);
                                                        break Label_2566;
                                                    }
                                                    case 7: {
                                                        n6 = n;
                                                        if (this.y(i, o)) {
                                                            n7 = com.google.android.gms.internal.firebase_auth_api.d.d(n3 << 3);
                                                            break Label_2479;
                                                        }
                                                        break Label_2709;
                                                    }
                                                    case 6: {
                                                        n6 = n;
                                                        if (this.y(i, o)) {
                                                            n7 = com.google.android.gms.internal.firebase_auth_api.d.d(n3 << 3);
                                                            break Label_2674;
                                                        }
                                                        break Label_2709;
                                                    }
                                                    case 5: {
                                                        n6 = n;
                                                        if (this.y(i, o)) {
                                                            n7 = com.google.android.gms.internal.firebase_auth_api.d.d(n3 << 3);
                                                            break Label_2701;
                                                        }
                                                        break Label_2709;
                                                    }
                                                    case 4: {
                                                        n6 = n;
                                                        if (this.y(i, o)) {
                                                            final int g5 = b2.g(n4, o);
                                                            n8 = com.google.android.gms.internal.firebase_auth_api.d.d(n3 << 3);
                                                            n9 = com.google.android.gms.internal.firebase_auth_api.d.x(g5);
                                                            break Label_2566;
                                                        }
                                                        break Label_2709;
                                                    }
                                                    case 3: {
                                                        n6 = n;
                                                        if (this.y(i, o)) {
                                                            final long h2 = b2.h(n4, o);
                                                            n13 = com.google.android.gms.internal.firebase_auth_api.d.d(n3 << 3);
                                                            n14 = com.google.android.gms.internal.firebase_auth_api.d.e(h2);
                                                            break Label_2646;
                                                        }
                                                        break Label_2709;
                                                    }
                                                    case 2: {
                                                        n6 = n;
                                                        if (this.y(i, o)) {
                                                            final long h3 = b2.h(n4, o);
                                                            n13 = com.google.android.gms.internal.firebase_auth_api.d.d(n3 << 3);
                                                            n14 = com.google.android.gms.internal.firebase_auth_api.d.e(h3);
                                                            break Label_2646;
                                                        }
                                                        break Label_2709;
                                                    }
                                                    case 1: {
                                                        n6 = n;
                                                        if (this.y(i, o)) {
                                                            n7 = com.google.android.gms.internal.firebase_auth_api.d.d(n3 << 3);
                                                            break Label_2674;
                                                        }
                                                        break Label_2709;
                                                    }
                                                    case 0: {
                                                        n6 = n;
                                                        if (this.y(i, o)) {
                                                            n7 = com.google.android.gms.internal.firebase_auth_api.d.d(n3 << 3);
                                                            break Label_2701;
                                                        }
                                                        break Label_2709;
                                                    }
                                                }
                                                n17 = n15 + c2 + n16;
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
        final r1 m3 = this.m;
        return m3.a((Object)m3.d(o)) + n;
    }
    
    public final void J(final Object o, final int n, final long n2) throws IOException {
        final Unsafe p3 = z0.p;
        final Object p4 = this.p(n);
        final Object object = p3.getObject(o, n2);
        if (r0.b(object)) {
            final com.google.android.gms.internal.firebase-auth-api.zzacw zzb = ((zzacw)zzacw.zza()).zzb();
            r0.c((Object)zzb, object);
            p3.putObject(o, n2, zzb);
        }
        final q0 q0 = (q0)p4;
        throw null;
    }
    
    public final int K(final Object o, final byte[] array, int n, int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final long n8, final int n9, final he.e e) throws IOException {
        final Unsafe p12 = z0.p;
        final long n10 = this.a[n9 + 2] & 0xFFFFF;
        switch (n7) {
            case 68: {
                if (n5 == 3) {
                    n = he.f.c(this.n(n9), array, n, n2, (n3 & 0xFFFFFFF8) | 0x4, e);
                    Object object;
                    if (p12.getInt(o, n10) == n4) {
                        object = p12.getObject(o, n8);
                    }
                    else {
                        object = null;
                    }
                    if (object == null) {
                        p12.putObject(o, n8, e.c);
                    }
                    else {
                        p12.putObject(o, n8, f0.b(object, e.c));
                    }
                    p12.putInt(o, n10, n4);
                    break;
                }
                break;
            }
            case 67: {
                if (n5 != 0) {
                    break;
                }
                n = he.f.m(array, n, e);
                p12.putObject(o, n8, he.l.g(e.b));
                p12.putInt(o, n10, n4);
                return n;
            }
            case 66: {
                if (n5 != 0) {
                    break;
                }
                n = he.f.j(array, n, e);
                p12.putObject(o, n8, he.l.f(e.a));
                p12.putInt(o, n10, n4);
                return n;
            }
            case 63: {
                if (n5 == 0) {
                    n = he.f.j(array, n, e);
                    n2 = e.a;
                    final d0 m = this.m(n9);
                    if (m != null && !m.zza()) {
                        D(o).c(n3, (Object)(long)n2);
                    }
                    else {
                        p12.putObject(o, n8, n2);
                        p12.putInt(o, n10, n4);
                    }
                    break;
                }
                break;
            }
            case 61: {
                if (n5 != 2) {
                    break;
                }
                n = he.f.a(array, n, e);
                p12.putObject(o, n8, e.c);
                p12.putInt(o, n10, n4);
                return n;
            }
            case 60: {
                if (n5 == 2) {
                    n = he.f.d(this.n(n9), array, n, n2, e);
                    Object object2;
                    if (p12.getInt(o, n10) == n4) {
                        object2 = p12.getObject(o, n8);
                    }
                    else {
                        object2 = null;
                    }
                    if (object2 == null) {
                        p12.putObject(o, n8, e.c);
                    }
                    else {
                        p12.putObject(o, n8, f0.b(object2, e.c));
                    }
                    p12.putInt(o, n10, n4);
                    break;
                }
                break;
            }
            case 59: {
                if (n5 == 2) {
                    n = he.f.j(array, n, e);
                    n2 = e.a;
                    if (n2 == 0) {
                        p12.putObject(o, n8, "");
                    }
                    else {
                        if ((n6 & 0x20000000) != 0x0 && !com.google.android.gms.internal.firebase_auth_api.g.e(n, n + n2, array)) {
                            throw zzacf.zzd();
                        }
                        p12.putObject(o, n8, new String(array, n, n2, f0.a));
                        n += n2;
                    }
                    p12.putInt(o, n10, n4);
                    break;
                }
                break;
            }
            case 58: {
                if (n5 == 0) {
                    n = he.f.m(array, n, e);
                    p12.putObject(o, n8, e.b != 0L);
                    p12.putInt(o, n10, n4);
                    return n;
                }
                break;
            }
            case 57:
            case 64: {
                if (n5 != 5) {
                    break;
                }
                p12.putObject(o, n8, he.f.b(n, array));
                p12.putInt(o, n10, n4);
                return n + 4;
            }
            case 56:
            case 65: {
                if (n5 != 1) {
                    break;
                }
                p12.putObject(o, n8, he.f.n(n, array));
                p12.putInt(o, n10, n4);
                return n + 8;
            }
            case 55:
            case 62: {
                if (n5 != 0) {
                    break;
                }
                n = he.f.j(array, n, e);
                p12.putObject(o, n8, e.a);
                p12.putInt(o, n10, n4);
                return n;
            }
            case 53:
            case 54: {
                if (n5 != 0) {
                    break;
                }
                n = he.f.m(array, n, e);
                p12.putObject(o, n8, e.b);
                p12.putInt(o, n10, n4);
                return n;
            }
            case 52: {
                if (n5 != 5) {
                    break;
                }
                p12.putObject(o, n8, Float.intBitsToFloat(he.f.b(n, array)));
                p12.putInt(o, n10, n4);
                return n + 4;
            }
            case 51: {
                if (n5 != 1) {
                    break;
                }
                p12.putObject(o, n8, Double.longBitsToDouble(he.f.n(n, array)));
                p12.putInt(o, n10, n4);
                return n + 8;
            }
        }
        return n;
    }
    
    public final void L(final Object o, final byte[] array, int n, final int n2, final he.e e) throws IOException {
        Object o2 = o;
        Unsafe p5 = z0.p;
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
                k = he.f.k(a, array, n7, e);
                a = e.a;
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
                        n = this.j(n8, n);
                        break Label_0165;
                    }
                }
                else if (n8 >= this.c && n8 <= this.d) {
                    n = this.j(n8, n3);
                    break Label_0165;
                }
                n = n4;
            }
            Object o3 = null;
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
                                        p5.putInt(o2, (long)n5, int1);
                                    }
                                    if (n14 != 1048575) {
                                        int1 = p5.getInt(o2, (long)n14);
                                    }
                                    n5 = n14;
                                    n15 = int1;
                                }
                                else {
                                    n15 = int1;
                                }
                                final Unsafe unsafe = p5;
                            Label_0944:
                                while (true) {
                                    Label_0915: {
                                        Label_0877: {
                                            switch (n11) {
                                                case 16: {
                                                    if (n9 == 0) {
                                                        final int n16 = he.f.m(array, k, e);
                                                        unsafe.putLong(o, n12, he.l.g(e.b));
                                                        break Label_0821;
                                                    }
                                                    break;
                                                }
                                                case 15: {
                                                    if (n9 == 0) {
                                                        final int n16 = he.f.j(array, k, e);
                                                        unsafe.putInt(o2, n12, he.l.f(e.a));
                                                        break Label_0821;
                                                    }
                                                    break;
                                                }
                                                case 12: {
                                                    if (n9 == 0) {
                                                        final int n16 = he.f.j(array, k, e);
                                                        unsafe.putInt(o2, n12, e.a);
                                                        break Label_0821;
                                                    }
                                                    break;
                                                }
                                                case 10: {
                                                    if (n9 == 2) {
                                                        final int n16 = he.f.a(array, k, e);
                                                        unsafe.putObject(o2, n12, e.c);
                                                        break Label_0821;
                                                    }
                                                    break;
                                                }
                                                case 9: {
                                                    if (n9 != 2) {
                                                        break;
                                                    }
                                                    final int n16 = he.f.d(this.n(n), array, k, n2, e);
                                                    final Object object = unsafe.getObject(o2, n12);
                                                    if (object == null) {
                                                        unsafe.putObject(o2, n12, e.c);
                                                        break Label_0821;
                                                    }
                                                    unsafe.putObject(o2, n12, f0.b(object, e.c));
                                                    break Label_0821;
                                                }
                                                case 8: {
                                                    if (n9 == 2) {
                                                        if ((n10 & 0x20000000) == 0x0) {
                                                            final int n16 = he.f.g(array, k, e);
                                                        }
                                                        else {
                                                            final int n16 = he.f.h(array, k, e);
                                                        }
                                                        unsafe.putObject(o2, n12, e.c);
                                                        break Label_0821;
                                                    }
                                                    break;
                                                }
                                                case 7: {
                                                    if (n9 == 0) {
                                                        final int n16 = he.f.m(array, k, e);
                                                        b2.m(o2, n12, e.b != 0L);
                                                        break Label_0821;
                                                    }
                                                    break;
                                                }
                                                case 6:
                                                case 13: {
                                                    if (n9 == 5) {
                                                        unsafe.putInt(o2, n12, he.f.b(k, array));
                                                        break Label_0877;
                                                    }
                                                    break;
                                                }
                                                case 5:
                                                case 14: {
                                                    if (n9 == 1) {
                                                        unsafe.putLong(o, n12, he.f.n(k, array));
                                                        final int n16 = k + 8;
                                                        break Label_0915;
                                                    }
                                                    break;
                                                }
                                                case 4:
                                                case 11: {
                                                    if (n9 == 0) {
                                                        final int n16 = he.f.j(array, k, e);
                                                        unsafe.putInt(o2, n12, e.a);
                                                        break Label_0821;
                                                    }
                                                    break;
                                                }
                                                case 2:
                                                case 3: {
                                                    if (n9 == 0) {
                                                        final int n16 = he.f.m(array, k, e);
                                                        unsafe.putLong(o, n12, e.b);
                                                        break Label_0821;
                                                    }
                                                    break;
                                                }
                                                case 1: {
                                                    if (n9 == 5) {
                                                        b2.p(o2, n12, Float.intBitsToFloat(he.f.b(k, array)));
                                                        break Label_0877;
                                                    }
                                                    break;
                                                }
                                                case 0: {
                                                    if (n9 == 1) {
                                                        b2.o(o2, n12, Double.longBitsToDouble(he.f.n(k, array)));
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
                                o3 = o2;
                                n19 = n5;
                                final int n20 = -1;
                                n21 = 0;
                                int1 = n15;
                                n3 = n;
                                n = n20;
                                unsafe2 = unsafe;
                                break Label_1302;
                            }
                            final Unsafe unsafe3 = p5;
                            int n22 = 0;
                            Label_1271: {
                                Label_1188: {
                                    if (n11 != 27) {
                                        if (n11 <= 49) {
                                            n22 = this.M(o, array, k, n2, a, n8, n9, n, n10, n11, n12, e);
                                            if (n22 == k) {
                                                break Label_1271;
                                            }
                                            i = n22;
                                        }
                                        else if (n11 == 50) {
                                            if (n9 != 2) {
                                                break Label_1188;
                                            }
                                            this.J(o, n, n12);
                                            throw null;
                                        }
                                        else {
                                            n22 = this.K(o, array, k, n2, a, n8, n9, n10, n11, n12, n, e);
                                            if (n22 == k) {
                                                break Label_1271;
                                            }
                                            i = n22;
                                        }
                                        unsafe2 = p5;
                                        n3 = 0;
                                        final int n23 = -1;
                                        o3 = o;
                                        n6 = n;
                                        n = n23;
                                        break Label_1336;
                                    }
                                    if (n9 == 2) {
                                        e0 h;
                                        final e0 e2 = h = (e0)unsafe3.getObject(o2, n12);
                                        if (!e2.s()) {
                                            final int size = ((List)e2).size();
                                            int n24;
                                            if (size == 0) {
                                                n24 = 10;
                                            }
                                            else {
                                                n24 = size + size;
                                            }
                                            h = e2.h(n24);
                                            unsafe3.putObject(o2, n12, h);
                                        }
                                        i = he.f.e(this.n(n), a, array, k, n2, h, e);
                                        break Label_1102;
                                    }
                                }
                                n22 = k;
                            }
                            unsafe2 = p5;
                            final int n25 = 0;
                            final int n26 = -1;
                            o3 = o;
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
                    final Unsafe unsafe4 = p5;
                    n21 = n3;
                    o3 = o2;
                    n18 = n27;
                    unsafe2 = unsafe4;
                }
                final int j = he.f.i(a, array, n18, n2, D(o), e);
                n6 = n3;
                n3 = n21;
                n5 = n19;
                i = j;
            }
            final Object o4 = o3;
            n4 = n;
            n = n8;
            p5 = unsafe2;
            o2 = o4;
        }
        if (n5 != 1048575) {
            p5.putInt(o2, (long)n5, int1);
        }
        if (i == n2) {
            return;
        }
        throw zzacf.zzg();
    }
    
    public final int M(Object a, final byte[] array, int i, int n, final int n2, int n3, int n4, final int n5, final long n6, final int n7, final long n8, final he.e e) throws IOException {
        int n9 = i;
        final Unsafe p12 = z0.p;
        e0 h;
        final e0 e2 = h = (e0)p12.getObject(a, n8);
        if (!e2.s()) {
            final int size = ((List)e2).size();
            int n10;
            if (size == 0) {
                n10 = 10;
            }
            else {
                n10 = size + size;
            }
            h = e2.h(n10);
            p12.putObject(a, n8, h);
        }
        Label_2320: {
            switch (n7) {
                default: {
                    if (n4 == 3) {
                        final h1 n11 = this.n(n5);
                        n3 = ((n2 & 0xFFFFFFF8) | 0x4);
                        i = he.f.c(n11, array, i, n, n3, e);
                        ((List<Object>)h).add(e.c);
                        while (i < n) {
                            n4 = he.f.j(array, i, e);
                            if (n2 != e.a) {
                                break;
                            }
                            i = he.f.c(n11, array, n4, n, n3, e);
                            ((List<String>)h).add((String)e.c);
                        }
                        return i;
                    }
                    return n9;
                }
                case 34:
                case 48: {
                    if (n4 == 2) {
                        final m0 m0 = (m0)h;
                        i = he.f.j(array, n9, e);
                        n = e.a + i;
                        while (i < n) {
                            i = he.f.m(array, i, e);
                            m0.c(he.l.g(e.b));
                        }
                        if (i == n) {
                            break;
                        }
                        throw zzacf.zzi();
                    }
                    else {
                        if (n4 == 0) {
                            final m0 m2 = (m0)h;
                            i = he.f.m(array, n9, e);
                            m2.c(he.l.g(e.b));
                            while (i < n) {
                                n3 = he.f.j(array, i, e);
                                if (n2 != e.a) {
                                    break;
                                }
                                i = he.f.m(array, n3, e);
                                m2.c(he.l.g(e.b));
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
                        final c0 c0 = (c0)h;
                        i = he.f.j(array, n9, e);
                        n = e.a + i;
                        while (i < n) {
                            i = he.f.j(array, i, e);
                            c0.d(he.l.f(e.a));
                        }
                        if (i == n) {
                            break;
                        }
                        throw zzacf.zzi();
                    }
                    else {
                        if (n4 == 0) {
                            final c0 c2 = (c0)h;
                            i = he.f.j(array, n9, e);
                            c2.d(he.l.f(e.a));
                            while (i < n) {
                                n3 = he.f.j(array, i, e);
                                if (n2 != e.a) {
                                    break;
                                }
                                i = he.f.j(array, n3, e);
                                c2.d(he.l.f(e.a));
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
                        i = he.f.f(array, n9, h, e);
                    }
                    else {
                        if (n4 != 0) {
                            return n9;
                        }
                        i = he.f.l(n2, array, i, n, h, e);
                    }
                    final e e3 = (e)a;
                    s1 zzc;
                    if ((zzc = e3.zzc) == s1.f) {
                        zzc = null;
                    }
                    a = com.google.android.gms.internal.firebase_auth_api.f.a(n3, (List)h, this.m(n5), (Object)zzc, this.m);
                    if (a == null) {
                        break;
                    }
                    e3.zzc = (s1)a;
                    return i;
                }
                case 28: {
                    if (n4 != 2) {
                        return n9;
                    }
                    i = he.f.j(array, n9, e);
                    n3 = e.a;
                    if (n3 < 0) {
                        throw zzacf.zzf();
                    }
                    if (n3 <= array.length - i) {
                        while (true) {
                            Label_0760: {
                                if (n3 != 0) {
                                    ((List<com.google.android.gms.internal.firebase-auth-api.zzaau>)h).add(zzaau.zzo(array, i, n3));
                                    break Label_0760;
                                }
                                ((List<com.google.android.gms.internal.firebase-auth-api.zzaau>)h).add(zzaau.zzb);
                                while (i < n) {
                                    n3 = he.f.j(array, i, e);
                                    if (n2 != e.a) {
                                        break;
                                    }
                                    i = he.f.j(array, n3, e);
                                    n3 = e.a;
                                    if (n3 < 0) {
                                        throw zzacf.zzf();
                                    }
                                    if (n3 > array.length - i) {
                                        throw zzacf.zzi();
                                    }
                                    if (n3 != 0) {
                                        ((List<com.google.android.gms.internal.firebase-auth-api.zzaau>)h).add(zzaau.zzo(array, i, n3));
                                        break Label_0760;
                                    }
                                    ((List<com.google.android.gms.internal.firebase-auth-api.zzaau>)h).add(zzaau.zzb);
                                }
                                return i;
                            }
                            i += n3;
                            continue;
                        }
                    }
                    throw zzacf.zzi();
                }
                case 27: {
                    if (n4 != 2) {
                        return n9;
                    }
                    return he.f.e(this.n(n5), n2, array, i, n, h, e);
                }
                case 26: {
                    if (n4 != 2) {
                        return n9;
                    }
                    if ((n6 & 0x20000000L) == 0x0L) {
                        n3 = he.f.j(array, n9, e);
                        i = e.a;
                        if (i >= 0) {
                            while (true) {
                                Label_0984: {
                                    if (i != 0) {
                                        ((List<String>)h).add(new String(array, n3, i, f0.a));
                                        break Label_0984;
                                    }
                                    ((List<String>)h).add("");
                                    while (true) {
                                        i = n3;
                                        if (n3 >= n) {
                                            break Label_2320;
                                        }
                                        n4 = he.f.j(array, n3, e);
                                        i = n3;
                                        if (n2 != e.a) {
                                            break Label_2320;
                                        }
                                        n3 = he.f.j(array, n4, e);
                                        i = e.a;
                                        if (i < 0) {
                                            throw zzacf.zzf();
                                        }
                                        if (i != 0) {
                                            ((List<String>)h).add(new String(array, n3, i, f0.a));
                                            break;
                                        }
                                        ((List<String>)h).add("");
                                    }
                                }
                                n3 += i;
                                continue;
                            }
                        }
                        throw zzacf.zzf();
                    }
                    else {
                        n3 = he.f.j(array, n9, e);
                        n4 = e.a;
                        if (n4 >= 0) {
                            while (true) {
                                Label_1174: {
                                    if (n4 == 0) {
                                        ((List<String>)h).add("");
                                    }
                                    else {
                                        i = n3 + n4;
                                        if (com.google.android.gms.internal.firebase_auth_api.g.e(n3, i, array)) {
                                            ((List<String>)h).add(new String(array, n3, n4, f0.a));
                                            break Label_1174;
                                        }
                                        throw zzacf.zzd();
                                    }
                                    while (true) {
                                        i = n3;
                                        if (n3 >= n) {
                                            break Label_2320;
                                        }
                                        n4 = he.f.j(array, n3, e);
                                        i = n3;
                                        if (n2 != e.a) {
                                            break Label_2320;
                                        }
                                        n3 = he.f.j(array, n4, e);
                                        n4 = e.a;
                                        if (n4 < 0) {
                                            throw zzacf.zzf();
                                        }
                                        if (n4 == 0) {
                                            ((List<String>)h).add("");
                                        }
                                        else {
                                            i = n3 + n4;
                                            if (com.google.android.gms.internal.firebase_auth_api.g.e(n3, i, array)) {
                                                ((List<String>)h).add(new String(array, n3, n4, f0.a));
                                                break;
                                            }
                                            throw zzacf.zzd();
                                        }
                                    }
                                }
                                n3 = i;
                                continue;
                            }
                        }
                        throw zzacf.zzf();
                    }
                    break;
                }
                case 25:
                case 42: {
                    if (n4 == 2) {
                        final he.g g = (he.g)h;
                        i = he.f.j(array, n9, e);
                        n = e.a + i;
                        while (i < n) {
                            i = he.f.m(array, i, e);
                            g.c(e.b != 0L);
                        }
                        if (i == n) {
                            break;
                        }
                        throw zzacf.zzi();
                    }
                    else {
                        if (n4 == 0) {
                            final he.g g2 = (he.g)h;
                            i = he.f.m(array, n9, e);
                            g2.c(e.b != 0L);
                            while (i < n) {
                                n3 = he.f.j(array, i, e);
                                if (n2 != e.a) {
                                    break;
                                }
                                i = he.f.m(array, n3, e);
                                g2.c(e.b != 0L);
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
                        final c0 c3 = (c0)h;
                        for (i = he.f.j(array, n9, e), n = e.a + i; i < n; i += 4) {
                            c3.d(he.f.b(i, array));
                        }
                        if (i == n) {
                            break;
                        }
                        throw zzacf.zzi();
                    }
                    else {
                        if (n4 == 5) {
                            final c0 c4 = (c0)h;
                            c4.d(he.f.b(n9, array));
                            i = n9;
                            while (true) {
                                n3 = i + 4;
                                if (n3 >= n) {
                                    break;
                                }
                                i = he.f.j(array, n3, e);
                                if (n2 != e.a) {
                                    break;
                                }
                                c4.d(he.f.b(i, array));
                            }
                            return n3;
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
                        final m0 m3 = (m0)h;
                        for (i = he.f.j(array, n9, e), n = e.a + i; i < n; i += 8) {
                            m3.c(he.f.n(i, array));
                        }
                        if (i == n) {
                            break;
                        }
                        throw zzacf.zzi();
                    }
                    else {
                        if (n4 == 1) {
                            final m0 m4 = (m0)h;
                            m4.c(he.f.n(n9, array));
                            while (true) {
                                i = n9 + 8;
                                if (i >= n) {
                                    break;
                                }
                                n9 = he.f.j(array, i, e);
                                if (n2 != e.a) {
                                    break;
                                }
                                m4.c(he.f.n(n9, array));
                            }
                            return i;
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
                        i = he.f.f(array, n9, h, e);
                        break;
                    }
                    if (n4 != 0) {
                        return n9;
                    }
                    return he.f.l(n2, array, i, n, h, e);
                }
                case 20:
                case 21:
                case 37:
                case 38: {
                    if (n4 == 2) {
                        final m0 m5 = (m0)h;
                        i = he.f.j(array, n9, e);
                        n = e.a + i;
                        while (i < n) {
                            i = he.f.m(array, i, e);
                            m5.c(e.b);
                        }
                        if (i == n) {
                            break;
                        }
                        throw zzacf.zzi();
                    }
                    else {
                        if (n4 == 0) {
                            final m0 m6 = (m0)h;
                            i = he.f.m(array, n9, e);
                            m6.c(e.b);
                            while (i < n) {
                                n3 = he.f.j(array, i, e);
                                if (n2 != e.a) {
                                    break;
                                }
                                i = he.f.m(array, n3, e);
                                m6.c(e.b);
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
                        final x x = (x)h;
                        for (i = he.f.j(array, n9, e), n = e.a + i; i < n; i += 4) {
                            x.c(Float.intBitsToFloat(he.f.b(i, array)));
                        }
                        if (i == n) {
                            break;
                        }
                        throw zzacf.zzi();
                    }
                    else {
                        if (n4 == 5) {
                            final x x2 = (x)h;
                            x2.c(Float.intBitsToFloat(he.f.b(n9, array)));
                            while (true) {
                                i = n9 + 4;
                                if (i >= n) {
                                    break;
                                }
                                n9 = he.f.j(array, i, e);
                                if (n2 != e.a) {
                                    break;
                                }
                                x2.c(Float.intBitsToFloat(he.f.b(n9, array)));
                            }
                            return i;
                        }
                        return n9;
                    }
                    break;
                }
                case 18:
                case 35: {
                    if (n4 == 2) {
                        final p p13 = (p)h;
                        for (i = he.f.j(array, n9, e), n = e.a + i; i < n; i += 8) {
                            p13.c(Double.longBitsToDouble(he.f.n(i, array)));
                        }
                        if (i == n) {
                            break;
                        }
                        throw zzacf.zzi();
                    }
                    else {
                        if (n4 == 1) {
                            final p p14 = (p)h;
                            p14.c(Double.longBitsToDouble(he.f.n(n9, array)));
                            while (true) {
                                i = n9 + 8;
                                if (i >= n) {
                                    break;
                                }
                                n9 = he.f.j(array, i, e);
                                if (n2 != e.a) {
                                    break;
                                }
                                p14.c(Double.longBitsToDouble(he.f.n(n9, array)));
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
    
    public final void a(final Object o) {
        int j = this.j;
        int k;
        while (true) {
            k = this.k;
            if (j >= k) {
                break;
            }
            final long n = this.k(this.i[j]) & 0xFFFFF;
            final Object i = b2.j(n, o);
            if (i != null) {
                ((zzacw)i).zzc();
                b2.s(o, n, i);
            }
            ++j;
        }
        for (int length = this.i.length, l = k; l < length; ++l) {
            this.l.b((long)this.i[l], o);
        }
        this.m.m(o);
        if (this.f) {
            this.n.e(o);
        }
    }
    
    public final int b(final Object o) {
        final int length = this.a.length;
        int i = 0;
        int n = 0;
        while (i < length) {
            final int k = this.k(i);
            final int n2 = this.a[i];
            final long n3 = 0xFFFFF & k;
            int n4 = 37;
            final int n5 = 1231;
            int n6 = 0;
            Label_1340: {
                int n7 = 0;
                int n8 = 0;
                Label_1213: {
                    Label_1209: {
                        switch (k >>> 20 & 0xFF) {
                            default: {
                                n6 = n;
                                break Label_1340;
                            }
                            case 68: {
                                n6 = n;
                                if (this.z(n2, i, o)) {
                                    n7 = n * 53;
                                    n8 = b2.j(n3, o).hashCode();
                                    break Label_1213;
                                }
                                break Label_1340;
                            }
                            case 67: {
                                n6 = n;
                                if (this.z(n2, i, o)) {
                                    n7 = n * 53;
                                    n8 = f0.a(l(n3, o));
                                    break Label_1213;
                                }
                                break Label_1340;
                            }
                            case 66: {
                                n6 = n;
                                if (this.z(n2, i, o)) {
                                    n7 = n * 53;
                                    n8 = I(n3, o);
                                    break Label_1213;
                                }
                                break Label_1340;
                            }
                            case 65: {
                                n6 = n;
                                if (this.z(n2, i, o)) {
                                    n7 = n * 53;
                                    n8 = f0.a(l(n3, o));
                                    break Label_1213;
                                }
                                break Label_1340;
                            }
                            case 64: {
                                n6 = n;
                                if (this.z(n2, i, o)) {
                                    n7 = n * 53;
                                    n8 = I(n3, o);
                                    break Label_1213;
                                }
                                break Label_1340;
                            }
                            case 63: {
                                n6 = n;
                                if (this.z(n2, i, o)) {
                                    n7 = n * 53;
                                    n8 = I(n3, o);
                                    break Label_1213;
                                }
                                break Label_1340;
                            }
                            case 62: {
                                n6 = n;
                                if (this.z(n2, i, o)) {
                                    n7 = n * 53;
                                    n8 = I(n3, o);
                                    break Label_1213;
                                }
                                break Label_1340;
                            }
                            case 61: {
                                n6 = n;
                                if (this.z(n2, i, o)) {
                                    n7 = n * 53;
                                    n8 = b2.j(n3, o).hashCode();
                                    break Label_1213;
                                }
                                break Label_1340;
                            }
                            case 60: {
                                n6 = n;
                                if (this.z(n2, i, o)) {
                                    n7 = n * 53;
                                    n8 = b2.j(n3, o).hashCode();
                                    break Label_1213;
                                }
                                break Label_1340;
                            }
                            case 59: {
                                n6 = n;
                                if (this.z(n2, i, o)) {
                                    n7 = n * 53;
                                    n8 = ((String)b2.j(n3, o)).hashCode();
                                    break Label_1213;
                                }
                                break Label_1340;
                            }
                            case 58: {
                                n6 = n;
                                if (!this.z(n2, i, o)) {
                                    break Label_1340;
                                }
                                final int n9 = n * 53;
                                final boolean booleanValue = (boolean)b2.j(n3, o);
                                final Charset a = f0.a;
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
                                if (this.z(n2, i, o)) {
                                    n7 = n * 53;
                                    n8 = I(n3, o);
                                    break Label_1213;
                                }
                                break Label_1340;
                            }
                            case 56: {
                                n6 = n;
                                if (this.z(n2, i, o)) {
                                    n7 = n * 53;
                                    n8 = f0.a(l(n3, o));
                                    break Label_1213;
                                }
                                break Label_1340;
                            }
                            case 55: {
                                n6 = n;
                                if (this.z(n2, i, o)) {
                                    n7 = n * 53;
                                    n8 = I(n3, o);
                                    break Label_1213;
                                }
                                break Label_1340;
                            }
                            case 54: {
                                n6 = n;
                                if (this.z(n2, i, o)) {
                                    n7 = n * 53;
                                    n8 = f0.a(l(n3, o));
                                    break Label_1213;
                                }
                                break Label_1340;
                            }
                            case 53: {
                                n6 = n;
                                if (this.z(n2, i, o)) {
                                    n7 = n * 53;
                                    n8 = f0.a(l(n3, o));
                                    break Label_1213;
                                }
                                break Label_1340;
                            }
                            case 52: {
                                n6 = n;
                                if (this.z(n2, i, o)) {
                                    n7 = n * 53;
                                    n8 = Float.floatToIntBits((float)b2.j(n3, o));
                                    break Label_1213;
                                }
                                break Label_1340;
                            }
                            case 51: {
                                n6 = n;
                                if (this.z(n2, i, o)) {
                                    n7 = n * 53;
                                    n8 = f0.a(Double.doubleToLongBits((double)b2.j(n3, o)));
                                    break Label_1213;
                                }
                                break Label_1340;
                            }
                            case 50: {
                                n7 = n * 53;
                                n8 = b2.j(n3, o).hashCode();
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
                                n8 = b2.j(n3, o).hashCode();
                                break Label_1213;
                            }
                            case 17: {
                                final Object j = b2.j(n3, o);
                                if (j != null) {
                                    n4 = j.hashCode();
                                    break;
                                }
                                break;
                            }
                            case 16: {
                                n7 = n * 53;
                                n8 = f0.a(b2.h(n3, o));
                                break Label_1213;
                            }
                            case 15: {
                                n7 = n * 53;
                                n8 = b2.g(n3, o);
                                break Label_1213;
                            }
                            case 14: {
                                n7 = n * 53;
                                n8 = f0.a(b2.h(n3, o));
                                break Label_1213;
                            }
                            case 13: {
                                n7 = n * 53;
                                n8 = b2.g(n3, o);
                                break Label_1213;
                            }
                            case 12: {
                                n7 = n * 53;
                                n8 = b2.g(n3, o);
                                break Label_1213;
                            }
                            case 11: {
                                n7 = n * 53;
                                n8 = b2.g(n3, o);
                                break Label_1213;
                            }
                            case 10: {
                                n7 = n * 53;
                                n8 = b2.j(n3, o).hashCode();
                                break Label_1213;
                            }
                            case 9: {
                                final Object l = b2.j(n3, o);
                                if (l != null) {
                                    n4 = l.hashCode();
                                    break;
                                }
                                break;
                            }
                            case 8: {
                                n7 = n * 53;
                                n8 = ((String)b2.j(n3, o)).hashCode();
                                break Label_1213;
                            }
                            case 7: {
                                final int n10 = n * 53;
                                final boolean u = b2.u(n3, o);
                                final Charset a2 = f0.a;
                                n7 = n10;
                                if (u) {
                                    n7 = n10;
                                    n8 = n5;
                                    break Label_1213;
                                }
                                break Label_1209;
                            }
                            case 6: {
                                n7 = n * 53;
                                n8 = b2.g(n3, o);
                                break Label_1213;
                            }
                            case 5: {
                                n7 = n * 53;
                                n8 = f0.a(b2.h(n3, o));
                                break Label_1213;
                            }
                            case 4: {
                                n7 = n * 53;
                                n8 = b2.g(n3, o);
                                break Label_1213;
                            }
                            case 3: {
                                n7 = n * 53;
                                n8 = f0.a(b2.h(n3, o));
                                break Label_1213;
                            }
                            case 2: {
                                n7 = n * 53;
                                n8 = f0.a(b2.h(n3, o));
                                break Label_1213;
                            }
                            case 1: {
                                n7 = n * 53;
                                n8 = Float.floatToIntBits(b2.f(n3, o));
                                break Label_1213;
                            }
                            case 0: {
                                n7 = n * 53;
                                n8 = f0.a(Double.doubleToLongBits(b2.e(n3, o)));
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
        final int hashCode = this.m.d(o).hashCode();
        if (!this.f) {
            return hashCode + n * 53;
        }
        this.n.a(o);
        throw null;
    }
    
    public final int c(final Object o) {
        int n;
        if (this.h) {
            n = this.H(o);
        }
        else {
            n = this.G(o);
        }
        return n;
    }
    
    public final void d(final Object o, final Object o2) {
        o2.getClass();
        for (int i = 0; i < this.a.length; i += 3) {
            final int k = this.k(i);
            final long n = 0xFFFFF & k;
            final int n2 = this.a[i];
            switch (k >>> 20 & 0xFF) {
                case 68: {
                    this.s(i, o, o2);
                    break;
                }
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67: {
                    if (this.z(n2, i, o2)) {
                        b2.s(o, n, b2.j(n, o2));
                        this.w(n2, i, o);
                        break;
                    }
                    break;
                }
                case 60: {
                    this.s(i, o, o2);
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
                    if (this.z(n2, i, o2)) {
                        b2.s(o, n, b2.j(n, o2));
                        this.w(n2, i, o);
                        break;
                    }
                    break;
                }
                case 50: {
                    final Class a = com.google.android.gms.internal.firebase_auth_api.f.a;
                    b2.s(o, n, (Object)r0.c(b2.j(n, o), b2.j(n, o2)));
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
                    this.l.c(o, n, o2);
                    break;
                }
                case 17: {
                    this.r(i, o, o2);
                    break;
                }
                case 16: {
                    if (this.y(i, o2)) {
                        b2.r(o, n, b2.h(n, o2));
                        this.v(i, o);
                        break;
                    }
                    break;
                }
                case 15: {
                    if (this.y(i, o2)) {
                        b2.q(o, b2.g(n, o2), n);
                        this.v(i, o);
                        break;
                    }
                    break;
                }
                case 14: {
                    if (this.y(i, o2)) {
                        b2.r(o, n, b2.h(n, o2));
                        this.v(i, o);
                        break;
                    }
                    break;
                }
                case 13: {
                    if (this.y(i, o2)) {
                        b2.q(o, b2.g(n, o2), n);
                        this.v(i, o);
                        break;
                    }
                    break;
                }
                case 12: {
                    if (this.y(i, o2)) {
                        b2.q(o, b2.g(n, o2), n);
                        this.v(i, o);
                        break;
                    }
                    break;
                }
                case 11: {
                    if (this.y(i, o2)) {
                        b2.q(o, b2.g(n, o2), n);
                        this.v(i, o);
                        break;
                    }
                    break;
                }
                case 10: {
                    if (this.y(i, o2)) {
                        b2.s(o, n, b2.j(n, o2));
                        this.v(i, o);
                        break;
                    }
                    break;
                }
                case 9: {
                    this.r(i, o, o2);
                    break;
                }
                case 8: {
                    if (this.y(i, o2)) {
                        b2.s(o, n, b2.j(n, o2));
                        this.v(i, o);
                        break;
                    }
                    break;
                }
                case 7: {
                    if (this.y(i, o2)) {
                        b2.m(o, n, b2.u(n, o2));
                        this.v(i, o);
                        break;
                    }
                    break;
                }
                case 6: {
                    if (this.y(i, o2)) {
                        b2.q(o, b2.g(n, o2), n);
                        this.v(i, o);
                        break;
                    }
                    break;
                }
                case 5: {
                    if (this.y(i, o2)) {
                        b2.r(o, n, b2.h(n, o2));
                        this.v(i, o);
                        break;
                    }
                    break;
                }
                case 4: {
                    if (this.y(i, o2)) {
                        b2.q(o, b2.g(n, o2), n);
                        this.v(i, o);
                        break;
                    }
                    break;
                }
                case 3: {
                    if (this.y(i, o2)) {
                        b2.r(o, n, b2.h(n, o2));
                        this.v(i, o);
                        break;
                    }
                    break;
                }
                case 2: {
                    if (this.y(i, o2)) {
                        b2.r(o, n, b2.h(n, o2));
                        this.v(i, o);
                        break;
                    }
                    break;
                }
                case 1: {
                    if (this.y(i, o2)) {
                        b2.p(o, n, b2.f(n, o2));
                        this.v(i, o);
                        break;
                    }
                    break;
                }
                case 0: {
                    if (this.y(i, o2)) {
                        b2.o(o, n, b2.e(n, o2));
                        this.v(i, o);
                        break;
                    }
                    break;
                }
            }
        }
        final r1 m = this.m;
        final Class a2 = com.google.android.gms.internal.firebase_auth_api.f.a;
        m.o(o, m.e((Object)m.d(o), (Object)m.d(o2)));
        if (!this.f) {
            return;
        }
        this.n.a(o2);
        throw null;
    }
    
    public final boolean e(final Object o, final Object o2) {
        for (int length = this.a.length, i = 0; i < length; i += 3) {
            final int k = this.k(i);
            final long n = k & 0xFFFFF;
            boolean b = false;
            switch (k >>> 20 & 0xFF) {
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
                    if (b2.g(n2, o) != b2.g(n2, o2)) {
                        return false;
                    }
                    if (!com.google.android.gms.internal.firebase_auth_api.f.b(b2.j(n, o), b2.j(n, o2))) {
                        return false;
                    }
                    continue;
                }
                case 50: {
                    b = com.google.android.gms.internal.firebase_auth_api.f.b(b2.j(n, o), b2.j(n, o2));
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
                    b = com.google.android.gms.internal.firebase_auth_api.f.b(b2.j(n, o), b2.j(n, o2));
                    break;
                }
                case 17: {
                    if (this.x(i, o, o2) && com.google.android.gms.internal.firebase_auth_api.f.b(b2.j(n, o), b2.j(n, o2))) {
                        continue;
                    }
                    return false;
                }
                case 16: {
                    if (this.x(i, o, o2) && b2.h(n, o) == b2.h(n, o2)) {
                        continue;
                    }
                    return false;
                }
                case 15: {
                    if (this.x(i, o, o2) && b2.g(n, o) == b2.g(n, o2)) {
                        continue;
                    }
                    return false;
                }
                case 14: {
                    if (this.x(i, o, o2) && b2.h(n, o) == b2.h(n, o2)) {
                        continue;
                    }
                    return false;
                }
                case 13: {
                    if (this.x(i, o, o2) && b2.g(n, o) == b2.g(n, o2)) {
                        continue;
                    }
                    return false;
                }
                case 12: {
                    if (this.x(i, o, o2) && b2.g(n, o) == b2.g(n, o2)) {
                        continue;
                    }
                    return false;
                }
                case 11: {
                    if (this.x(i, o, o2) && b2.g(n, o) == b2.g(n, o2)) {
                        continue;
                    }
                    return false;
                }
                case 10: {
                    if (this.x(i, o, o2) && com.google.android.gms.internal.firebase_auth_api.f.b(b2.j(n, o), b2.j(n, o2))) {
                        continue;
                    }
                    return false;
                }
                case 9: {
                    if (this.x(i, o, o2) && com.google.android.gms.internal.firebase_auth_api.f.b(b2.j(n, o), b2.j(n, o2))) {
                        continue;
                    }
                    return false;
                }
                case 8: {
                    if (this.x(i, o, o2) && com.google.android.gms.internal.firebase_auth_api.f.b(b2.j(n, o), b2.j(n, o2))) {
                        continue;
                    }
                    return false;
                }
                case 7: {
                    if (this.x(i, o, o2) && b2.u(n, o) == b2.u(n, o2)) {
                        continue;
                    }
                    return false;
                }
                case 6: {
                    if (this.x(i, o, o2) && b2.g(n, o) == b2.g(n, o2)) {
                        continue;
                    }
                    return false;
                }
                case 5: {
                    if (this.x(i, o, o2) && b2.h(n, o) == b2.h(n, o2)) {
                        continue;
                    }
                    return false;
                }
                case 4: {
                    if (this.x(i, o, o2) && b2.g(n, o) == b2.g(n, o2)) {
                        continue;
                    }
                    return false;
                }
                case 3: {
                    if (this.x(i, o, o2) && b2.h(n, o) == b2.h(n, o2)) {
                        continue;
                    }
                    return false;
                }
                case 2: {
                    if (this.x(i, o, o2) && b2.h(n, o) == b2.h(n, o2)) {
                        continue;
                    }
                    return false;
                }
                case 1: {
                    if (this.x(i, o, o2) && Float.floatToIntBits(b2.f(n, o)) == Float.floatToIntBits(b2.f(n, o2))) {
                        continue;
                    }
                    return false;
                }
                case 0: {
                    if (this.x(i, o, o2) && Double.doubleToLongBits(b2.e(n, o)) == Double.doubleToLongBits(b2.e(n, o2))) {
                        continue;
                    }
                    return false;
                }
            }
            if (!b) {
                return false;
            }
        }
        if (!this.m.d(o).equals((Object)this.m.d(o2))) {
            return false;
        }
        if (!this.f) {
            return true;
        }
        this.n.a(o);
        this.n.a(o2);
        throw null;
    }
    
    public final boolean f(final Object o) {
        int n = 0;
        int int1 = 0;
        int n2 = 1048575;
        while (true) {
            final int j = this.j;
            final int n3 = 1;
            if (n < j) {
                final int n4 = this.i[n];
                final int n5 = this.a[n4];
                final int k = this.k(n4);
                final int n6 = this.a[n4 + 2];
                final int n7 = n6 & 0xFFFFF;
                final int n8 = 1 << (n6 >>> 20);
                int n9 = n2;
                int n10 = int1;
                if (n7 != n2) {
                    if (n7 != 1048575) {
                        int1 = z0.p.getInt(o, (long)n7);
                    }
                    n9 = n7;
                    n10 = int1;
                }
                if ((0x10000000 & k) != 0x0) {
                    boolean y;
                    if (n9 == 1048575) {
                        y = this.y(n4, o);
                    }
                    else {
                        y = ((n10 & n8) != 0x0);
                    }
                    if (!y) {
                        return false;
                    }
                }
                final int n11 = k >>> 20 & 0xFF;
                Label_0435: {
                    if (n11 != 9 && n11 != 17) {
                        if (n11 != 27) {
                            if (n11 != 60 && n11 != 68) {
                                if (n11 != 49) {
                                    if (n11 != 50) {
                                        break Label_0435;
                                    }
                                    if (((HashMap)b2.j((long)(k & 0xFFFFF), o)).isEmpty()) {
                                        break Label_0435;
                                    }
                                    final q0 q0 = (q0)this.p(n4);
                                    throw null;
                                }
                            }
                            else {
                                if (this.z(n5, n4, o) && !this.n(n4).f(b2.j((long)(k & 0xFFFFF), o))) {
                                    return false;
                                }
                                break Label_0435;
                            }
                        }
                        final List list = (List)b2.j((long)(k & 0xFFFFF), o);
                        if (!list.isEmpty()) {
                            final h1 n12 = this.n(n4);
                            for (int i = 0; i < list.size(); ++i) {
                                if (!n12.f(list.get(i))) {
                                    return false;
                                }
                            }
                        }
                    }
                    else {
                        int y2;
                        if (n9 == 1048575) {
                            y2 = (this.y(n4, o) ? 1 : 0);
                        }
                        else if ((n10 & n8) != 0x0) {
                            y2 = n3;
                        }
                        else {
                            y2 = 0;
                        }
                        if (y2 != 0 && !this.n(n4).f(b2.j((long)(k & 0xFFFFF), o))) {
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
                this.n.a(o);
                throw null;
            }
        }
    }
    
    public final void g(final Object o, final m m, final r r) throws IOException {
        r.getClass();
        final r1 i = this.m;
        final s n = this.n;
        Object o2 = null;
        w w = null;
    Label_0082_Outer:
        while (true) {
            Object o3 = o2;
            int t;
            int j;
            Object o4;
            Object f;
            boolean p3;
            int l;
            long n2;
            List a;
            h1 n3;
            long n4;
            int j2;
            long n5;
            h1 n6;
            int i2;
            long n7;
            long n8;
            h1 n9;
            long n10;
            long n11;
            long n12;
            h1 n13;
            d0 m2;
            Object o5;
            long n14;
            long n15;
            long n16;
            long n17;
            long n18;
            Class a2;
            Object p4;
            long n19;
            Object o6;
            long n20;
            zzacw zzacw;
            q0 q0;
            long n21;
            long n22;
            long n23;
            long n24;
            int j3;
            long n25;
            Object c;
            boolean p5;
            long n26;
            h1 n27;
            long n28;
            long n29;
            long n30;
            int i3;
            d0 m3;
            long n31;
            Class a3;
            long n32;
            long n33;
            long n34;
            long n35;
            Object j4;
            h1 n36;
            long n37;
            h1 n38;
            long n39;
            long n40;
            h1 n41;
            long n42;
            long n43;
            Object j5;
            h1 n44;
            long n45;
            List a4;
            long n46;
            Object c2 = null;
            int j6 = 0;
            b0 c3;
            int j7;
            w b = null;
            boolean p6;
            Block_17_Outer:Block_8_Outer:
            while (true) {
                try {
                    t = m.t();
                    o3 = o2;
                    if (t < this.c) {
                        break Block_17_Outer;
                    }
                    o3 = o2;
                    if (t <= this.d) {
                        o3 = o2;
                        j = this.j(t, 0);
                        break Label_0082;
                    }
                    break Block_17_Outer;
                }
                finally {
                    Block_10_Outer:Block_9_Outer:Label_0286_Outer:
                    while (true) {
                        Label_0101: {
                            Block_16: {
                                Label_4712_Outer:Label_3663_Outer:Label_3643_Outer:Block_25_Outer:
                                while (true) {
                                    Label_4706: {
                                        break Label_4706;
                                        o4 = o2;
                                        try {
                                            f = i.f();
                                            Label_4528: {
                                                o4 = f;
                                            }
                                            p3 = i.p(f, m);
                                            o2 = f;
                                            if (!p3) {
                                                for (int k = this.j; k < this.k; ++k) {
                                                    this.o(o, this.i[k], f);
                                                }
                                                if (f != null) {
                                                    i.n(o, f);
                                                    return;
                                                }
                                                Label_4705:
                                                return;
                                            }
                                            continue Label_0082_Outer;
                                            Label_2486:
                                            o4 = o2;
                                            m.j(this.l.a((long)(l & 0xFFFFF), o));
                                            continue Label_0082_Outer;
                                            Label_2670:
                                            o4 = o2;
                                            m.l(this.l.a((long)(l & 0xFFFFF), o));
                                            continue Label_0082_Outer;
                                            Label_3007:
                                            o4 = o2;
                                            m.e(this.l.a((long)(l & 0xFFFFF), o));
                                            continue Label_0082_Outer;
                                            Label_4021:
                                            n2 = (l & 0xFFFFF);
                                            o4 = o2;
                                            m.q(0);
                                            o4 = o2;
                                            b2.m(o, n2, m.a.d());
                                            o4 = o2;
                                            this.v(j, o);
                                            continue Label_0082_Outer;
                                            Label_2070:
                                            o4 = o2;
                                            m.i(this.l.a((long)(l & 0xFFFFF), o));
                                            continue Label_0082_Outer;
                                            Label_2602:
                                            o4 = o2;
                                            a = this.l.a((long)(l & 0xFFFFF), o);
                                            o4 = o2;
                                            m.A(a);
                                            o4 = o2;
                                            o2 = com.google.android.gms.internal.firebase_auth_api.f.a(t, a, this.m(j), o2, i);
                                            continue Label_0082_Outer;
                                            Label_2832:
                                            o4 = o2;
                                            m.k(this.l.a((long)(l & 0xFFFFF), o), false);
                                            continue Label_0082_Outer;
                                            Label_2728:
                                            o4 = o2;
                                            n3 = this.n(j);
                                            n4 = (l & 0xFFFFF);
                                            o4 = o2;
                                            m.f(this.l.a(n4, o), n3, r);
                                            continue Label_0082_Outer;
                                            Block_36: {
                                                while (true) {
                                                    Block_24: {
                                                        while (true) {
                                                        Label_3643:
                                                            while (true) {
                                                                Block_26: {
                                                                Label_3663:
                                                                    while (true) {
                                                                        Label_4712:Label_4663_Outer:Label_3670_Outer:
                                                                        while (true) {
                                                                            while (true) {
                                                                                while (true) {
                                                                                    Label_4604: {
                                                                                    Label_4663:
                                                                                        while (true) {
                                                                                            Block_33: {
                                                                                                Block_23: {
                                                                                                    while (true) {
                                                                                                        while (true) {
                                                                                                            this.o(o, this.i[j2], o3);
                                                                                                            ++j2;
                                                                                                            break Label_4712;
                                                                                                            Label_0667:
                                                                                                            n5 = (l & 0xFFFFF);
                                                                                                            try {
                                                                                                                n6 = this.n(j);
                                                                                                                m.q(3);
                                                                                                                b2.s(o, n5, m.n(n6, r));
                                                                                                                this.w(t, j, o);
                                                                                                            Block_41_Outer:
                                                                                                                while (true) {
                                                                                                                    continue Label_0082_Outer;
                                                                                                                    Label_1069:
                                                                                                                    b2.s(o, (long)(l & 0xFFFFF), (Object)i2);
                                                                                                                    this.w(t, j, o);
                                                                                                                    continue Label_3663_Outer;
                                                                                                                    Label_1377:
                                                                                                                    n7 = (l & 0xFFFFF);
                                                                                                                    m.q(0);
                                                                                                                    b2.s(o, n7, (Object)m.a.d());
                                                                                                                    this.w(t, j, o);
                                                                                                                    continue Label_3663_Outer;
                                                                                                                    Label_1276:
                                                                                                                    n8 = (l & 0xFFFFF);
                                                                                                                    n9 = this.n(j);
                                                                                                                    m.q(2);
                                                                                                                    b2.s(o, n8, m.o(n9, r));
                                                                                                                    this.v(j, o);
                                                                                                                    while (true) {
                                                                                                                        Block_43: {
                                                                                                                            Label_1333: {
                                                                                                                                break Label_1333;
                                                                                                                                Label_0847:
                                                                                                                                n10 = (l & 0xFFFFF);
                                                                                                                                m.q(1);
                                                                                                                                b2.s(o, n10, (Object)((k)m.a).j());
                                                                                                                                this.w(t, j, o);
                                                                                                                                continue Block_41_Outer;
                                                                                                                                Label_0729:
                                                                                                                                n11 = (l & 0xFFFFF);
                                                                                                                                m.q(0);
                                                                                                                                b2.s(o, n11, (Object)he.l.g(((k)m.a).k()));
                                                                                                                                this.w(t, j, o);
                                                                                                                                continue Block_41_Outer;
                                                                                                                            Label_1050_Outer:
                                                                                                                                while (true) {
                                                                                                                                    n12 = (l & 0xFFFFF);
                                                                                                                                    o4 = b2.j(n12, o);
                                                                                                                                    n13 = this.n(j);
                                                                                                                                    m.q(2);
                                                                                                                                    b2.s(o, n12, (Object)f0.b(o4, m.o(n13, r)));
                                                                                                                                    break Label_1333;
                                                                                                                                    Label_0959:
                                                                                                                                    m.q(0);
                                                                                                                                    i2 = ((k)m.a).i();
                                                                                                                                    m2 = this.m(j);
                                                                                                                                    iftrue(Label_1069:)(m2 == null || m2.zza());
                                                                                                                                    while (true) {
                                                                                                                                        Label_1018: {
                                                                                                                                            break Label_1018;
                                                                                                                                            i.l(o5, t, (long)i2);
                                                                                                                                            break Label_3663;
                                                                                                                                            Label_1654:
                                                                                                                                            n14 = (l & 0xFFFFF);
                                                                                                                                            m.q(0);
                                                                                                                                            b2.s(o, n14, (Object)((k)m.a).k());
                                                                                                                                            this.w(t, j, o);
                                                                                                                                            continue Block_41_Outer;
                                                                                                                                            Label_0903:
                                                                                                                                            n15 = (l & 0xFFFFF);
                                                                                                                                            m.q(5);
                                                                                                                                            b2.s(o, n15, (Object)((k)m.a).h());
                                                                                                                                            this.w(t, j, o);
                                                                                                                                            continue Block_41_Outer;
                                                                                                                                            Label_1710:
                                                                                                                                            n16 = (l & 0xFFFFF);
                                                                                                                                            m.q(5);
                                                                                                                                            b2.s(o, n16, (Object)Float.intBitsToFloat(((k)m.a).h()));
                                                                                                                                            this.w(t, j, o);
                                                                                                                                            continue Block_41_Outer;
                                                                                                                                            Label_1486:
                                                                                                                                            n17 = (l & 0xFFFFF);
                                                                                                                                            m.q(1);
                                                                                                                                            b2.s(o, n17, (Object)((k)m.a).j());
                                                                                                                                            this.w(t, j, o);
                                                                                                                                            continue Block_41_Outer;
                                                                                                                                            Label_1769:
                                                                                                                                            n18 = (l & 0xFFFFF);
                                                                                                                                            m.q(1);
                                                                                                                                            b2.s(o, n18, (Object)Double.longBitsToDouble(((k)m.a).j()));
                                                                                                                                            this.w(t, j, o);
                                                                                                                                            continue Block_41_Outer;
                                                                                                                                        }
                                                                                                                                        a2 = com.google.android.gms.internal.firebase_auth_api.f.a;
                                                                                                                                        iftrue(Label_1046:)(o2 != null);
                                                                                                                                        Block_40: {
                                                                                                                                            break Block_40;
                                                                                                                                            Label_1828:
                                                                                                                                            p4 = this.p(j);
                                                                                                                                            n19 = (this.k(j) & 0xFFFFF);
                                                                                                                                            o4 = b2.j(n19, o);
                                                                                                                                            iftrue(Label_1928:)(o4 == null);
                                                                                                                                            o6 = o4;
                                                                                                                                            iftrue(Label_1952:)(!r0.b(o4));
                                                                                                                                            break Block_43;
                                                                                                                                        }
                                                                                                                                        o5 = i.f();
                                                                                                                                        continue Label_3663_Outer;
                                                                                                                                        Label_1104:
                                                                                                                                        n20 = (l & 0xFFFFF);
                                                                                                                                        m.q(0);
                                                                                                                                        b2.s(o, n20, (Object)((k)m.a).i());
                                                                                                                                        this.w(t, j, o);
                                                                                                                                        continue Block_41_Outer;
                                                                                                                                        zzacw = (zzacw)o6;
                                                                                                                                        q0 = (q0)p4;
                                                                                                                                        o4 = o2;
                                                                                                                                        throw null;
                                                                                                                                        Label_1046:
                                                                                                                                        o5 = o2;
                                                                                                                                        continue Label_3663_Outer;
                                                                                                                                    }
                                                                                                                                    Label_1194:
                                                                                                                                    iftrue(Label_1276:)(!this.z(t, j, o));
                                                                                                                                    continue Label_1050_Outer;
                                                                                                                                }
                                                                                                                                Label_1598:
                                                                                                                                n21 = (l & 0xFFFFF);
                                                                                                                                m.q(0);
                                                                                                                                b2.s(o, n21, (Object)((k)m.a).k());
                                                                                                                                this.w(t, j, o);
                                                                                                                                continue Block_41_Outer;
                                                                                                                                Label_1430:
                                                                                                                                n22 = (l & 0xFFFFF);
                                                                                                                                m.q(5);
                                                                                                                                b2.s(o, n22, (Object)((k)m.a).h());
                                                                                                                                this.w(t, j, o);
                                                                                                                                continue Block_41_Outer;
                                                                                                                                Label_1349:
                                                                                                                                this.u(o, l, m);
                                                                                                                                this.w(t, j, o);
                                                                                                                                continue Block_41_Outer;
                                                                                                                                Label_1160:
                                                                                                                                b2.s(o, (long)(l & 0xFFFFF), (Object)m.u());
                                                                                                                                this.w(t, j, o);
                                                                                                                                continue Block_41_Outer;
                                                                                                                                Label_1928:
                                                                                                                                o6 = ((zzacw)com.google.android.gms.internal.firebase_auth_api.zzacw.zza()).zzb();
                                                                                                                                b2.s(o, n19, o6);
                                                                                                                                continue Label_4663_Outer;
                                                                                                                            }
                                                                                                                            this.w(t, j, o);
                                                                                                                            continue Label_3663_Outer;
                                                                                                                            Label_0788:
                                                                                                                            n23 = (l & 0xFFFFF);
                                                                                                                            m.q(0);
                                                                                                                            b2.s(o, n23, (Object)he.l.f(((k)m.a).i()));
                                                                                                                            this.w(t, j, o);
                                                                                                                            continue Label_3663_Outer;
                                                                                                                        }
                                                                                                                        o6 = ((zzacw)com.google.android.gms.internal.firebase_auth_api.zzacw.zza()).zzb();
                                                                                                                        r0.c(o6, o4);
                                                                                                                        b2.s(o, n19, o6);
                                                                                                                        continue Label_4663_Outer;
                                                                                                                    }
                                                                                                                    Label_1542:
                                                                                                                    n24 = (l & 0xFFFFF);
                                                                                                                    m.q(0);
                                                                                                                    b2.s(o, n24, (Object)((k)m.a).i());
                                                                                                                    this.w(t, j, o);
                                                                                                                    continue Label_3663_Outer;
                                                                                                                }
                                                                                                            }
                                                                                                            catch (final zzace zzace) {
                                                                                                                break Label_4604;
                                                                                                            }
                                                                                                            Label_1989: {
                                                                                                                break Label_1989;
                                                                                                                while (true) {
                                                                                                                    j3 = this.j;
                                                                                                                    break Label_4663;
                                                                                                                    Label_3708:
                                                                                                                    n25 = (l & 0xFFFFF);
                                                                                                                    o4 = o2;
                                                                                                                    m.q(0);
                                                                                                                    o4 = o2;
                                                                                                                    b2.q(o, ((k)m.a).i(), n25);
                                                                                                                    o4 = o2;
                                                                                                                    this.v(j, o);
                                                                                                                    continue Label_0082_Outer;
                                                                                                                    p5 = i.p(c, m);
                                                                                                                    o2 = c;
                                                                                                                    iftrue(Label_0023:)(p5);
                                                                                                                    continue Label_4663_Outer;
                                                                                                                }
                                                                                                            }
                                                                                                            n26 = (l & 0xFFFFF);
                                                                                                            o4 = o2;
                                                                                                            n27 = this.n(j);
                                                                                                            o4 = o2;
                                                                                                            m.c(this.l.a(n26, o), n27, r);
                                                                                                            continue Label_0082_Outer;
                                                                                                            Label_4462:
                                                                                                            n28 = (l & 0xFFFFF);
                                                                                                            o4 = o2;
                                                                                                            m.q(1);
                                                                                                            o4 = o2;
                                                                                                            b2.o(o, n28, Double.longBitsToDouble(((k)m.a).j()));
                                                                                                            o4 = o2;
                                                                                                            this.v(j, o);
                                                                                                            continue Label_0082_Outer;
                                                                                                            Label_4396:
                                                                                                            n29 = (l & 0xFFFFF);
                                                                                                            o4 = o2;
                                                                                                            m.q(5);
                                                                                                            o4 = o2;
                                                                                                            b2.p(o, n29, Float.intBitsToFloat(((k)m.a).h()));
                                                                                                            o4 = o2;
                                                                                                            this.v(j, o);
                                                                                                            continue Label_0082_Outer;
                                                                                                            Label_2041:
                                                                                                            o4 = o2;
                                                                                                            m.j(this.l.a((long)(l & 0xFFFFF), o));
                                                                                                            continue Label_0082_Outer;
                                                                                                            Label_2457:
                                                                                                            o4 = o2;
                                                                                                            m.z(this.l.a((long)(l & 0xFFFFF), o));
                                                                                                            continue Label_0082_Outer;
                                                                                                            Label_2780:
                                                                                                            iftrue(Label_2832:)((0x20000000 & l) == 0x0);
                                                                                                            Block_22: {
                                                                                                                break Block_22;
                                                                                                                Label_2283:
                                                                                                                o4 = o2;
                                                                                                                m.B(this.l.a((long)(l & 0xFFFFF), o));
                                                                                                                continue Label_0082_Outer;
                                                                                                            }
                                                                                                            o4 = o2;
                                                                                                            m.k(this.l.a((long)(l & 0xFFFFF), o), true);
                                                                                                            continue Label_0082_Outer;
                                                                                                            Label_2949:
                                                                                                            o4 = o2;
                                                                                                            m.d(this.l.a((long)(l & 0xFFFFF), o));
                                                                                                            continue Label_0082_Outer;
                                                                                                            Label_3270:
                                                                                                            n30 = (l & 0xFFFFF);
                                                                                                            o4 = o2;
                                                                                                            m.q(0);
                                                                                                            o4 = o2;
                                                                                                            b2.r(o, n30, he.l.g(((k)m.a).k()));
                                                                                                            o4 = o2;
                                                                                                            this.v(j, o);
                                                                                                            continue Label_0082_Outer;
                                                                                                            o2 = o5;
                                                                                                            continue Label_0082_Outer;
                                                                                                            Label_3528:
                                                                                                            o4 = o2;
                                                                                                            m.q(0);
                                                                                                            o4 = o2;
                                                                                                            i3 = ((k)m.a).i();
                                                                                                            o4 = o2;
                                                                                                            m3 = this.m(j);
                                                                                                            iftrue(Label_3670:)(m3 == null);
                                                                                                            break Block_24;
                                                                                                            Label_3639:
                                                                                                            o5 = o2;
                                                                                                            break Label_3643;
                                                                                                            Label_4270:
                                                                                                            n31 = (l & 0xFFFFF);
                                                                                                            o4 = o2;
                                                                                                            m.q(0);
                                                                                                            o4 = o2;
                                                                                                            b2.r(o, n31, ((k)m.a).k());
                                                                                                            o4 = o2;
                                                                                                            this.v(j, o);
                                                                                                            continue Label_0082_Outer;
                                                                                                            Label_3036:
                                                                                                            o4 = o2;
                                                                                                            m.b(this.l.a((long)(l & 0xFFFFF), o));
                                                                                                            continue Label_0082_Outer;
                                                                                                            Label_3094:
                                                                                                            o4 = o2;
                                                                                                            iftrue(Label_3194:)(!this.y(j, o));
                                                                                                            break Block_23;
                                                                                                            Label_2099:
                                                                                                            o4 = o2;
                                                                                                            m.h(this.l.a((long)(l & 0xFFFFF), o));
                                                                                                            continue Label_0082_Outer;
                                                                                                            Label_2891:
                                                                                                            o4 = o2;
                                                                                                            m.B(this.l.a((long)(l & 0xFFFFF), o));
                                                                                                            continue Label_0082_Outer;
                                                                                                            Label_3603:
                                                                                                            o4 = o2;
                                                                                                            a3 = com.google.android.gms.internal.firebase_auth_api.f.a;
                                                                                                            iftrue(Label_3639:)(o2 != null);
                                                                                                            break Block_26;
                                                                                                            Label_2544:
                                                                                                            o4 = o2;
                                                                                                            m.h(this.l.a((long)(l & 0xFFFFF), o));
                                                                                                            continue Label_0082_Outer;
                                                                                                            Label_4333:
                                                                                                            n32 = (l & 0xFFFFF);
                                                                                                            o4 = o2;
                                                                                                            m.q(0);
                                                                                                            o4 = o2;
                                                                                                            b2.r(o, n32, ((k)m.a).k());
                                                                                                            o4 = o2;
                                                                                                            this.v(j, o);
                                                                                                            continue Label_0082_Outer;
                                                                                                            Label_3402:
                                                                                                            n33 = (l & 0xFFFFF);
                                                                                                            o4 = o2;
                                                                                                            m.q(1);
                                                                                                            o4 = o2;
                                                                                                            b2.r(o, n33, ((k)m.a).j());
                                                                                                            o4 = o2;
                                                                                                            this.v(j, o);
                                                                                                            continue Label_0082_Outer;
                                                                                                            Label_3987:
                                                                                                            o4 = o2;
                                                                                                            this.u(o, l, m);
                                                                                                            o4 = o2;
                                                                                                            this.v(j, o);
                                                                                                            continue Label_0082_Outer;
                                                                                                            Label_4144:
                                                                                                            n34 = (l & 0xFFFFF);
                                                                                                            o4 = o2;
                                                                                                            m.q(1);
                                                                                                            o4 = o2;
                                                                                                            b2.r(o, n34, ((k)m.a).j());
                                                                                                            o4 = o2;
                                                                                                            this.v(j, o);
                                                                                                            continue Label_0082_Outer;
                                                                                                            iftrue(Label_4741:)(j2 >= this.k);
                                                                                                            continue Label_4712_Outer;
                                                                                                        }
                                                                                                        n35 = (l & 0xFFFFF);
                                                                                                        o4 = o2;
                                                                                                        j4 = b2.j(n35, o);
                                                                                                        o4 = o2;
                                                                                                        n36 = this.n(j);
                                                                                                        o4 = o2;
                                                                                                        m.q(2);
                                                                                                        o4 = o2;
                                                                                                        b2.s(o, n35, (Object)f0.b(j4, m.o(n36, r)));
                                                                                                        continue Label_0082_Outer;
                                                                                                        Label_3911:
                                                                                                        n37 = (l & 0xFFFFF);
                                                                                                        o4 = o2;
                                                                                                        n38 = this.n(j);
                                                                                                        o4 = o2;
                                                                                                        m.q(2);
                                                                                                        o4 = o2;
                                                                                                        b2.s(o, n37, m.o(n38, r));
                                                                                                        o4 = o2;
                                                                                                        this.v(j, o);
                                                                                                        continue Label_0082_Outer;
                                                                                                        Label_4081:
                                                                                                        n39 = (l & 0xFFFFF);
                                                                                                        o4 = o2;
                                                                                                        m.q(5);
                                                                                                        o4 = o2;
                                                                                                        b2.q(o, ((k)m.a).h(), n39);
                                                                                                        o4 = o2;
                                                                                                        this.v(j, o);
                                                                                                        continue Label_0082_Outer;
                                                                                                        iftrue(Label_4692:)(j3 >= this.k);
                                                                                                        break Block_33;
                                                                                                        Label_4692:
                                                                                                        iftrue(Label_4705:)(c == null);
                                                                                                        Block_34: {
                                                                                                            break Block_34;
                                                                                                            Label_3194:
                                                                                                            n40 = (l & 0xFFFFF);
                                                                                                            o4 = o2;
                                                                                                            n41 = this.n(j);
                                                                                                            o4 = o2;
                                                                                                            m.q(3);
                                                                                                            o4 = o2;
                                                                                                            b2.s(o, n40, m.n(n41, r));
                                                                                                            o4 = o2;
                                                                                                            this.v(j, o);
                                                                                                            continue Label_0082_Outer;
                                                                                                            Label_4741:
                                                                                                            iftrue(Label_4754:)(o3 == null);
                                                                                                            break Block_36;
                                                                                                        }
                                                                                                        i.n(o, c);
                                                                                                        return;
                                                                                                        Label_2920:
                                                                                                        o4 = o2;
                                                                                                        m.a(this.l.a((long)(l & 0xFFFFF), o));
                                                                                                        continue Label_0082_Outer;
                                                                                                        Label_2699:
                                                                                                        o4 = o2;
                                                                                                        m.y(this.l.a((long)(l & 0xFFFFF), o));
                                                                                                        continue Label_0082_Outer;
                                                                                                        Label_3465:
                                                                                                        n42 = (l & 0xFFFFF);
                                                                                                        o4 = o2;
                                                                                                        m.q(5);
                                                                                                        o4 = o2;
                                                                                                        b2.q(o, ((k)m.a).h(), n42);
                                                                                                        o4 = o2;
                                                                                                        this.v(j, o);
                                                                                                        continue Label_0082_Outer;
                                                                                                        c = i.c(o);
                                                                                                        continue Label_3643_Outer;
                                                                                                    }
                                                                                                    Label_2399:
                                                                                                    o4 = o2;
                                                                                                    m.e(this.l.a((long)(l & 0xFFFFF), o));
                                                                                                    continue Label_0082_Outer;
                                                                                                    Label_2254:
                                                                                                    o4 = o2;
                                                                                                    m.x(this.l.a((long)(l & 0xFFFFF), o));
                                                                                                    continue Label_0082_Outer;
                                                                                                }
                                                                                                n43 = (l & 0xFFFFF);
                                                                                                o4 = o2;
                                                                                                j5 = b2.j(n43, o);
                                                                                                o4 = o2;
                                                                                                n44 = this.n(j);
                                                                                                o4 = o2;
                                                                                                m.q(3);
                                                                                                o4 = o2;
                                                                                                b2.s(o, n43, (Object)f0.b(j5, m.n(n44, r)));
                                                                                                continue Label_0082_Outer;
                                                                                                Label_2978:
                                                                                                o4 = o2;
                                                                                                m.m(this.l.a((long)(l & 0xFFFFF), o));
                                                                                                continue Label_0082_Outer;
                                                                                                Label_3336:
                                                                                                n45 = (l & 0xFFFFF);
                                                                                                o4 = o2;
                                                                                                m.q(0);
                                                                                                o4 = o2;
                                                                                                b2.q(o, he.l.f(((k)m.a).i()), n45);
                                                                                                o4 = o2;
                                                                                                this.v(j, o);
                                                                                                continue Label_0082_Outer;
                                                                                                Label_2515:
                                                                                                o4 = o2;
                                                                                                m.i(this.l.a((long)(l & 0xFFFFF), o));
                                                                                                continue Label_0082_Outer;
                                                                                                Label_3065:
                                                                                                o4 = o2;
                                                                                                m.z(this.l.a((long)(l & 0xFFFFF), o));
                                                                                                continue Label_0082_Outer;
                                                                                            }
                                                                                            this.o(o, this.i[j3], c);
                                                                                            ++j3;
                                                                                            continue Label_4663;
                                                                                        }
                                                                                        Label_2862:
                                                                                        o4 = o2;
                                                                                        m.x(this.l.a((long)(l & 0xFFFFF), o));
                                                                                        continue Label_0082_Outer;
                                                                                        Label_2312:
                                                                                        o4 = o2;
                                                                                        m.a(this.l.a((long)(l & 0xFFFFF), o));
                                                                                        continue Label_0082_Outer;
                                                                                        o4 = o2;
                                                                                        b2.q(o, i3, (long)(l & 0xFFFFF));
                                                                                        o4 = o2;
                                                                                        this.v(j, o);
                                                                                        continue Label_0082_Outer;
                                                                                    }
                                                                                    i.q();
                                                                                    c = o2;
                                                                                    iftrue(Label_4634:)(o2 != null);
                                                                                    continue Label_3670_Outer;
                                                                                }
                                                                                Label_2128:
                                                                                o4 = o2;
                                                                                m.g(this.l.a((long)(l & 0xFFFFF), o));
                                                                                continue Label_0082_Outer;
                                                                                continue Block_25_Outer;
                                                                            }
                                                                            Label_3771:
                                                                            o4 = o2;
                                                                            b2.s(o, (long)(l & 0xFFFFF), (Object)m.u());
                                                                            o4 = o2;
                                                                            this.v(j, o);
                                                                            continue Label_0082_Outer;
                                                                            Label_2370:
                                                                            o4 = o2;
                                                                            m.m(this.l.a((long)(l & 0xFFFFF), o));
                                                                            continue Label_0082_Outer;
                                                                            j2 = this.j;
                                                                            continue Label_4712;
                                                                        }
                                                                        Label_2341:
                                                                        o4 = o2;
                                                                        m.d(this.l.a((long)(l & 0xFFFFF), o));
                                                                        continue Label_0082_Outer;
                                                                        o4 = o2;
                                                                        i.l(o5, t, (long)i3);
                                                                        continue Label_3663;
                                                                    }
                                                                }
                                                                o4 = o2;
                                                                o5 = i.f();
                                                                continue Label_3643;
                                                            }
                                                            Label_4754:
                                                            o4 = o2;
                                                            m.g(this.l.a((long)(l & 0xFFFFF), o));
                                                            continue Label_0082_Outer;
                                                            Label_3811:
                                                            o4 = o2;
                                                            iftrue(Label_3911:)(!this.y(j, o));
                                                            continue Block_25_Outer;
                                                        }
                                                        Label_2428:
                                                        o4 = o2;
                                                        m.b(this.l.a((long)(l & 0xFFFFF), o));
                                                        continue Label_0082_Outer;
                                                        Label_2157:
                                                        o4 = o2;
                                                        a4 = this.l.a((long)(l & 0xFFFFF), o);
                                                        o4 = o2;
                                                        m.A(a4);
                                                        o4 = o2;
                                                        o2 = com.google.android.gms.internal.firebase_auth_api.f.a(t, a4, this.m(j), o2, i);
                                                        continue Label_0082_Outer;
                                                    }
                                                    o4 = o2;
                                                    iftrue(Label_3603:)(!m3.zza());
                                                    continue Block_8_Outer;
                                                }
                                                Label_4207:
                                                n46 = (l & 0xFFFFF);
                                                o4 = o2;
                                                m.q(0);
                                                o4 = o2;
                                                b2.q(o, ((k)m.a).i(), n46);
                                                o4 = o2;
                                                this.v(j, o);
                                                continue Label_0082_Outer;
                                                Label_2225:
                                                o4 = o2;
                                                m.l(this.l.a((long)(l & 0xFFFFF), o));
                                                continue Label_0082_Outer;
                                            }
                                            i.n(o, o3);
                                        }
                                        catch (final zzace zzace2) {
                                            o2 = o4;
                                        }
                                    }
                                    Label_0315: {
                                        iftrue(Label_4705:)(c2 == null);
                                    }
                                    break Block_16;
                                    Label_0640:
                                    f = o2;
                                    iftrue(Label_4528:)(o2 != null);
                                    continue Block_8_Outer;
                                }
                                this.o(o, this.i[j6], o2);
                                ++j6;
                                break Label_0101;
                            Label_0286:
                                while (true) {
                                    Block_15: {
                                    Block_11_Outer:
                                        while (true) {
                                            Label_0257: {
                                            Block_12:
                                                while (true) {
                                                    Label_0183: {
                                                        while (true) {
                                                            Block_13: {
                                                                while (true) {
                                                                    while (true) {
                                                                        iftrue(Label_0144:)(t != Integer.MAX_VALUE);
                                                                        break Block_11_Outer;
                                                                        Label_0329: {
                                                                            l = this.k(j);
                                                                        }
                                                                        switch([Lcom.strobel.decompiler.ast.Label;@1451275)(l >>> 20 & 0xFF);
                                                                        Label_0227:
                                                                        i.q();
                                                                        iftrue(Label_0257:)((c2 = o2) != null);
                                                                        break Block_13;
                                                                        c3 = null;
                                                                        break Label_0183;
                                                                        i.n(o, o2);
                                                                        return;
                                                                        iftrue(Label_0315:)(j7 >= this.k);
                                                                        break Block_15;
                                                                        iftrue(Label_0329:)(j >= 0);
                                                                        continue Block_10_Outer;
                                                                    }
                                                                    Label_0161: {
                                                                        c3 = n.c(r, this.e, t);
                                                                    }
                                                                    break Label_0183;
                                                                    j7 = this.j;
                                                                    continue Label_0286;
                                                                    j = -1;
                                                                    continue Block_17_Outer;
                                                                    Label_0144:
                                                                    iftrue(Label_0161:)(this.f);
                                                                    continue Block_9_Outer;
                                                                }
                                                                iftrue(Label_0209:)((b = w) != null);
                                                                break Block_12;
                                                            }
                                                            c2 = i.c(o);
                                                            break Label_0257;
                                                            Label_0130: {
                                                                iftrue(Label_4705:)(o2 == null);
                                                            }
                                                            continue Label_0286_Outer;
                                                        }
                                                    }
                                                    iftrue(Label_0227:)(c3 == null);
                                                    continue;
                                                }
                                                b = n.b(o);
                                                break Block_10_Outer;
                                            }
                                            p6 = i.p(c2, m);
                                            o2 = c2;
                                            iftrue(Label_0023:)(p6);
                                            continue Block_11_Outer;
                                        }
                                        j6 = this.j;
                                        break Label_0101;
                                    }
                                    this.o(o, this.i[j7], c2);
                                    ++j7;
                                    continue Label_0286;
                                }
                            }
                            i.n(o, c2);
                            return;
                        }
                        iftrue(Label_0130:)(j6 >= this.k);
                        continue;
                    }
                    o2 = n.d();
                    w = b;
                }
                break;
            }
        }
    }
    
    public final void h(final Object o, final byte[] array, final int n, final int n2, final he.e e) throws IOException {
        if (this.h) {
            this.L(o, array, n, n2, e);
            return;
        }
        this.C(o, array, n, n2, 0, e);
    }
    
    public final void i(final Object o, final o o2) throws IOException {
        if (!this.h) {
            this.A(o, o2);
            return;
        }
        if (!this.f) {
            for (int length = this.a.length, i = 0; i < length; i += 3) {
                final int k = this.k(i);
                final int n = this.a[i];
                switch (k >>> 20 & 0xFF) {
                    case 68: {
                        if (this.z(n, i, o)) {
                            o2.l(n, this.n(i), b2.j((long)(k & 0xFFFFF), o));
                            break;
                        }
                        break;
                    }
                    case 67: {
                        if (this.z(n, i, o)) {
                            o2.b(n, l(k & 0xFFFFF, o));
                            break;
                        }
                        break;
                    }
                    case 66: {
                        if (this.z(n, i, o)) {
                            o2.a(n, I(k & 0xFFFFF, o));
                            break;
                        }
                        break;
                    }
                    case 65: {
                        if (this.z(n, i, o)) {
                            o2.q(n, l(k & 0xFFFFF, o));
                            break;
                        }
                        break;
                    }
                    case 64: {
                        if (this.z(n, i, o)) {
                            o2.p(n, I(k & 0xFFFFF, o));
                            break;
                        }
                        break;
                    }
                    case 63: {
                        if (this.z(n, i, o)) {
                            o2.h(n, I(k & 0xFFFFF, o));
                            break;
                        }
                        break;
                    }
                    case 62: {
                        if (this.z(n, i, o)) {
                            o2.c(n, I(k & 0xFFFFF, o));
                            break;
                        }
                        break;
                    }
                    case 61: {
                        if (this.z(n, i, o)) {
                            o2.f(n, (com.google.android.gms.internal.firebase-auth-api.zzaau)b2.j((long)(k & 0xFFFFF), o));
                            break;
                        }
                        break;
                    }
                    case 60: {
                        if (this.z(n, i, o)) {
                            o2.o(n, this.n(i), b2.j((long)(k & 0xFFFFF), o));
                            break;
                        }
                        break;
                    }
                    case 59: {
                        if (this.z(n, i, o)) {
                            B(n, b2.j((long)(k & 0xFFFFF), o), o2);
                            break;
                        }
                        break;
                    }
                    case 58: {
                        if (this.z(n, i, o)) {
                            o2.e(n, (boolean)b2.j((long)(k & 0xFFFFF), o));
                            break;
                        }
                        break;
                    }
                    case 57: {
                        if (this.z(n, i, o)) {
                            o2.i(n, I(k & 0xFFFFF, o));
                            break;
                        }
                        break;
                    }
                    case 56: {
                        if (this.z(n, i, o)) {
                            o2.j(n, l(k & 0xFFFFF, o));
                            break;
                        }
                        break;
                    }
                    case 55: {
                        if (this.z(n, i, o)) {
                            o2.m(n, I(k & 0xFFFFF, o));
                            break;
                        }
                        break;
                    }
                    case 54: {
                        if (this.z(n, i, o)) {
                            o2.d(n, l(k & 0xFFFFF, o));
                            break;
                        }
                        break;
                    }
                    case 53: {
                        if (this.z(n, i, o)) {
                            o2.n(n, l(k & 0xFFFFF, o));
                            break;
                        }
                        break;
                    }
                    case 52: {
                        if (this.z(n, i, o)) {
                            o2.k((float)b2.j((long)(k & 0xFFFFF), o), n);
                            break;
                        }
                        break;
                    }
                    case 51: {
                        if (this.z(n, i, o)) {
                            o2.g((double)b2.j((long)(k & 0xFFFFF), o), n);
                            break;
                        }
                        break;
                    }
                    case 50: {
                        if (b2.j((long)(k & 0xFFFFF), o) == null) {
                            break;
                        }
                        final q0 q0 = (q0)this.p(i);
                        throw null;
                    }
                    case 49: {
                        com.google.android.gms.internal.firebase_auth_api.f.j(n, (List)b2.j((long)(k & 0xFFFFF), o), o2, this.n(i));
                        break;
                    }
                    case 48: {
                        com.google.android.gms.internal.firebase_auth_api.f.q(n, (List)b2.j((long)(k & 0xFFFFF), o), o2, true);
                        break;
                    }
                    case 47: {
                        com.google.android.gms.internal.firebase_auth_api.f.p(n, (List)b2.j((long)(k & 0xFFFFF), o), o2, true);
                        break;
                    }
                    case 46: {
                        com.google.android.gms.internal.firebase_auth_api.f.o(n, (List)b2.j((long)(k & 0xFFFFF), o), o2, true);
                        break;
                    }
                    case 45: {
                        com.google.android.gms.internal.firebase_auth_api.f.n(n, (List)b2.j((long)(k & 0xFFFFF), o), o2, true);
                        break;
                    }
                    case 44: {
                        com.google.android.gms.internal.firebase_auth_api.f.f(n, (List)b2.j((long)(k & 0xFFFFF), o), o2, true);
                        break;
                    }
                    case 43: {
                        com.google.android.gms.internal.firebase_auth_api.f.s(n, (List)b2.j((long)(k & 0xFFFFF), o), o2, true);
                        break;
                    }
                    case 42: {
                        com.google.android.gms.internal.firebase_auth_api.f.c(n, (List)b2.j((long)(k & 0xFFFFF), o), o2, true);
                        break;
                    }
                    case 41: {
                        com.google.android.gms.internal.firebase_auth_api.f.g(n, (List)b2.j((long)(k & 0xFFFFF), o), o2, true);
                        break;
                    }
                    case 40: {
                        com.google.android.gms.internal.firebase_auth_api.f.h(n, (List)b2.j((long)(k & 0xFFFFF), o), o2, true);
                        break;
                    }
                    case 39: {
                        com.google.android.gms.internal.firebase_auth_api.f.k(n, (List)b2.j((long)(k & 0xFFFFF), o), o2, true);
                        break;
                    }
                    case 38: {
                        com.google.android.gms.internal.firebase_auth_api.f.u(n, (List)b2.j((long)(k & 0xFFFFF), o), o2, true);
                        break;
                    }
                    case 37: {
                        com.google.android.gms.internal.firebase_auth_api.f.l(n, (List)b2.j((long)(k & 0xFFFFF), o), o2, true);
                        break;
                    }
                    case 36: {
                        com.google.android.gms.internal.firebase_auth_api.f.i(n, (List)b2.j((long)(k & 0xFFFFF), o), o2, true);
                        break;
                    }
                    case 35: {
                        com.google.android.gms.internal.firebase_auth_api.f.e(n, (List)b2.j((long)(k & 0xFFFFF), o), o2, true);
                        break;
                    }
                    case 34: {
                        com.google.android.gms.internal.firebase_auth_api.f.q(n, (List)b2.j((long)(k & 0xFFFFF), o), o2, false);
                        break;
                    }
                    case 33: {
                        com.google.android.gms.internal.firebase_auth_api.f.p(n, (List)b2.j((long)(k & 0xFFFFF), o), o2, false);
                        break;
                    }
                    case 32: {
                        com.google.android.gms.internal.firebase_auth_api.f.o(n, (List)b2.j((long)(k & 0xFFFFF), o), o2, false);
                        break;
                    }
                    case 31: {
                        com.google.android.gms.internal.firebase_auth_api.f.n(n, (List)b2.j((long)(k & 0xFFFFF), o), o2, false);
                        break;
                    }
                    case 30: {
                        com.google.android.gms.internal.firebase_auth_api.f.f(n, (List)b2.j((long)(k & 0xFFFFF), o), o2, false);
                        break;
                    }
                    case 29: {
                        com.google.android.gms.internal.firebase_auth_api.f.s(n, (List)b2.j((long)(k & 0xFFFFF), o), o2, false);
                        break;
                    }
                    case 28: {
                        com.google.android.gms.internal.firebase_auth_api.f.d(n, (List)b2.j((long)(k & 0xFFFFF), o), o2);
                        break;
                    }
                    case 27: {
                        com.google.android.gms.internal.firebase_auth_api.f.m(n, (List)b2.j((long)(k & 0xFFFFF), o), o2, this.n(i));
                        break;
                    }
                    case 26: {
                        com.google.android.gms.internal.firebase_auth_api.f.r(n, (List)b2.j((long)(k & 0xFFFFF), o), o2);
                        break;
                    }
                    case 25: {
                        com.google.android.gms.internal.firebase_auth_api.f.c(n, (List)b2.j((long)(k & 0xFFFFF), o), o2, false);
                        break;
                    }
                    case 24: {
                        com.google.android.gms.internal.firebase_auth_api.f.g(n, (List)b2.j((long)(k & 0xFFFFF), o), o2, false);
                        break;
                    }
                    case 23: {
                        com.google.android.gms.internal.firebase_auth_api.f.h(n, (List)b2.j((long)(k & 0xFFFFF), o), o2, false);
                        break;
                    }
                    case 22: {
                        com.google.android.gms.internal.firebase_auth_api.f.k(n, (List)b2.j((long)(k & 0xFFFFF), o), o2, false);
                        break;
                    }
                    case 21: {
                        com.google.android.gms.internal.firebase_auth_api.f.u(n, (List)b2.j((long)(k & 0xFFFFF), o), o2, false);
                        break;
                    }
                    case 20: {
                        com.google.android.gms.internal.firebase_auth_api.f.l(n, (List)b2.j((long)(k & 0xFFFFF), o), o2, false);
                        break;
                    }
                    case 19: {
                        com.google.android.gms.internal.firebase_auth_api.f.i(n, (List)b2.j((long)(k & 0xFFFFF), o), o2, false);
                        break;
                    }
                    case 18: {
                        com.google.android.gms.internal.firebase_auth_api.f.e(n, (List)b2.j((long)(k & 0xFFFFF), o), o2, false);
                        break;
                    }
                    case 17: {
                        if (this.y(i, o)) {
                            o2.l(n, this.n(i), b2.j((long)(k & 0xFFFFF), o));
                            break;
                        }
                        break;
                    }
                    case 16: {
                        if (this.y(i, o)) {
                            o2.b(n, b2.h((long)(k & 0xFFFFF), o));
                            break;
                        }
                        break;
                    }
                    case 15: {
                        if (this.y(i, o)) {
                            o2.a(n, b2.g((long)(k & 0xFFFFF), o));
                            break;
                        }
                        break;
                    }
                    case 14: {
                        if (this.y(i, o)) {
                            o2.q(n, b2.h((long)(k & 0xFFFFF), o));
                            break;
                        }
                        break;
                    }
                    case 13: {
                        if (this.y(i, o)) {
                            o2.p(n, b2.g((long)(k & 0xFFFFF), o));
                            break;
                        }
                        break;
                    }
                    case 12: {
                        if (this.y(i, o)) {
                            o2.h(n, b2.g((long)(k & 0xFFFFF), o));
                            break;
                        }
                        break;
                    }
                    case 11: {
                        if (this.y(i, o)) {
                            o2.c(n, b2.g((long)(k & 0xFFFFF), o));
                            break;
                        }
                        break;
                    }
                    case 10: {
                        if (this.y(i, o)) {
                            o2.f(n, (com.google.android.gms.internal.firebase-auth-api.zzaau)b2.j((long)(k & 0xFFFFF), o));
                            break;
                        }
                        break;
                    }
                    case 9: {
                        if (this.y(i, o)) {
                            o2.o(n, this.n(i), b2.j((long)(k & 0xFFFFF), o));
                            break;
                        }
                        break;
                    }
                    case 8: {
                        if (this.y(i, o)) {
                            B(n, b2.j((long)(k & 0xFFFFF), o), o2);
                            break;
                        }
                        break;
                    }
                    case 7: {
                        if (this.y(i, o)) {
                            o2.e(n, b2.u((long)(k & 0xFFFFF), o));
                            break;
                        }
                        break;
                    }
                    case 6: {
                        if (this.y(i, o)) {
                            o2.i(n, b2.g((long)(k & 0xFFFFF), o));
                            break;
                        }
                        break;
                    }
                    case 5: {
                        if (this.y(i, o)) {
                            o2.j(n, b2.h((long)(k & 0xFFFFF), o));
                            break;
                        }
                        break;
                    }
                    case 4: {
                        if (this.y(i, o)) {
                            o2.m(n, b2.g((long)(k & 0xFFFFF), o));
                            break;
                        }
                        break;
                    }
                    case 3: {
                        if (this.y(i, o)) {
                            o2.d(n, b2.h((long)(k & 0xFFFFF), o));
                            break;
                        }
                        break;
                    }
                    case 2: {
                        if (this.y(i, o)) {
                            o2.n(n, b2.h((long)(k & 0xFFFFF), o));
                            break;
                        }
                        break;
                    }
                    case 1: {
                        if (this.y(i, o)) {
                            o2.k(b2.f((long)(k & 0xFFFFF), o), n);
                            break;
                        }
                        break;
                    }
                    case 0: {
                        if (this.y(i, o)) {
                            o2.g(b2.e((long)(k & 0xFFFFF), o), n);
                            break;
                        }
                        break;
                    }
                }
            }
            final r1 m = this.m;
            m.r((Object)m.d(o), o2);
            return;
        }
        this.n.a(o);
        throw null;
    }
    
    public final int j(final int n, int i) {
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
    
    public final int k(final int n) {
        return this.a[n + 1];
    }
    
    public final d0 m(int n) {
        n /= 3;
        return (d0)this.b[n + n + 1];
    }
    
    public final h1 n(int n) {
        n /= 3;
        n += n;
        final Object[] b = this.b;
        final h1 h1 = (h1)b[n];
        if (h1 != null) {
            return h1;
        }
        return (h1)(this.b[n] = e1.c.a((Class)b[n + 1]));
    }
    
    public final void o(Object j, final int n, final Object o) {
        final int n2 = this.a[n];
        j = b2.j((long)(this.k(n) & 0xFFFFF), j);
        if (j == null) {
            return;
        }
        if (this.m(n) == null) {
            return;
        }
        final zzacw zzacw = (zzacw)j;
        final q0 q0 = (q0)this.p(n);
        throw null;
    }
    
    public final Object p(int n) {
        n /= 3;
        return this.b[n + n];
    }
    
    public final void r(final int n, final Object o, Object j) {
        final long n2 = this.k(n) & 0xFFFFF;
        if (!this.y(n, j)) {
            return;
        }
        final Object i = b2.j(n2, o);
        j = b2.j(n2, j);
        if (i != null && j != null) {
            b2.s(o, n2, (Object)f0.b(i, j));
            this.v(n, o);
            return;
        }
        if (j != null) {
            b2.s(o, n2, j);
            this.v(n, o);
        }
    }
    
    public final void s(final int n, final Object o, Object j) {
        final int k = this.k(n);
        final int n2 = this.a[n];
        final long n3 = k & 0xFFFFF;
        if (!this.z(n2, n, j)) {
            return;
        }
        Object i;
        if (this.z(n2, n, o)) {
            i = b2.j(n3, o);
        }
        else {
            i = null;
        }
        j = b2.j(n3, j);
        if (i != null && j != null) {
            b2.s(o, n3, (Object)f0.b(i, j));
            this.w(n2, n, o);
            return;
        }
        if (j != null) {
            b2.s(o, n3, j);
            this.w(n2, n, o);
        }
    }
    
    public final Object t() {
        return ((e)this.e).h(4);
    }
    
    public final void u(final Object o, final int n, final m m) throws IOException {
        if ((0x20000000 & n) != 0x0) {
            b2.s(o, (long)(n & 0xFFFFF), (Object)m.w());
            return;
        }
        if (this.g) {
            b2.s(o, (long)(n & 0xFFFFF), (Object)m.v());
            return;
        }
        b2.s(o, (long)(n & 0xFFFFF), (Object)m.u());
    }
    
    public final void v(int n, final Object o) {
        n = this.a[n + 2];
        final long n2 = 0xFFFFF & n;
        if (n2 == 1048575L) {
            return;
        }
        b2.q(o, 1 << (n >>> 20) | b2.g(n2, o), n2);
    }
    
    public final void w(final int n, final int n2, final Object o) {
        b2.q(o, n, (long)(this.a[n2 + 2] & 0xFFFFF));
    }
    
    public final boolean x(final int n, final Object o, final Object o2) {
        return this.y(n, o) == this.y(n, o2);
    }
    
    public final boolean y(int k, Object j) {
        final int n = this.a[k + 2];
        final long n2 = n & 0xFFFFF;
        if (n2 != 1048575L) {
            return (b2.g(n2, j) & 1 << (n >>> 20)) != 0x0;
        }
        k = this.k(k);
        final long n3 = k & 0xFFFFF;
        switch (k >>> 20 & 0xFF) {
            default: {
                throw new IllegalArgumentException();
            }
            case 17: {
                return b2.j(n3, j) != null;
            }
            case 16: {
                return b2.h(n3, j) != 0L;
            }
            case 15: {
                return b2.g(n3, j) != 0;
            }
            case 14: {
                return b2.h(n3, j) != 0L;
            }
            case 13: {
                return b2.g(n3, j) != 0;
            }
            case 12: {
                return b2.g(n3, j) != 0;
            }
            case 11: {
                return b2.g(n3, j) != 0;
            }
            case 10: {
                return !((zzaau)zzaau.zzb).equals(b2.j(n3, j));
            }
            case 9: {
                return b2.j(n3, j) != null;
            }
            case 8: {
                j = b2.j(n3, j);
                if (j instanceof String) {
                    return !((String)j).isEmpty();
                }
                if (j instanceof zzaau) {
                    return !((zzaau)zzaau.zzb).equals(j);
                }
                throw new IllegalArgumentException();
            }
            case 7: {
                return b2.u(n3, j);
            }
            case 6: {
                return b2.g(n3, j) != 0;
            }
            case 5: {
                return b2.h(n3, j) != 0L;
            }
            case 4: {
                return b2.g(n3, j) != 0;
            }
            case 3: {
                return b2.h(n3, j) != 0L;
            }
            case 2: {
                return b2.h(n3, j) != 0L;
            }
            case 1: {
                return Float.floatToRawIntBits(b2.f(n3, j)) != 0;
            }
            case 0: {
                return Double.doubleToRawLongBits(b2.e(n3, j)) != 0L;
            }
        }
    }
    
    public final boolean z(final int n, final int n2, final Object o) {
        return b2.g((long)(this.a[n2 + 2] & 0xFFFFF), o) == n;
    }
}
