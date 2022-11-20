// 
// Decompiled by Procyon v0.6.0
// 

package ai2;

import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import he.vd;
import he.p5;
import he.td;
import he.od;
import he.s5;
import he.kd;
import he.f2;
import he.jc;
import he.r5;
import he.gb;
import he.sc;
import java.nio.ByteBuffer;
import java.util.Set;
import java.util.Collection;
import c91.i$c;
import y8.k;
import y8.i;
import c91.h$b;
import android.graphics.drawable.Drawable;
import com.reddit.frontpage.image.NsfwDrawable;
import ng2.e;
import c91.g;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import java.util.List;
import android.support.v4.media.a;
import java.io.UnsupportedEncodingException;
import io.branch.referral.Defines$Jsonkey;
import android.text.TextUtils;
import java.util.HashMap;
import java.net.URLDecoder;
import qe2.j;
import android.content.Context;
import java.math.BigInteger;
import qb.b;
import jh.c;
import c91.d;

public abstract class h implements d, c, b
{
    public static String a = "bnc_no_value";
    
    public static int[] A(BigInteger shiftRight) {
        if (shiftRight.signum() >= 0 && shiftRight.bitLength() <= 224) {
            final int[] array = new int[7];
            for (int n = 0; shiftRight.signum() != 0; shiftRight = shiftRight.shiftRight(32), ++n) {
                array[n] = shiftRight.intValue();
            }
            return array;
        }
        throw new IllegalArgumentException();
    }
    
    public static boolean D(final int[] array, final int[] array2) {
        for (int i = 4; i >= 0; --i) {
            final int n = array[i] ^ Integer.MIN_VALUE;
            final int n2 = Integer.MIN_VALUE ^ array2[i];
            if (n < n2) {
                return false;
            }
            if (n > n2) {
                return true;
            }
        }
        return true;
    }
    
    public static boolean E(final int[] array, final int[] array2) {
        for (int i = 6; i >= 0; --i) {
            final int n = array[i] ^ Integer.MIN_VALUE;
            final int n2 = Integer.MIN_VALUE ^ array2[i];
            if (n < n2) {
                return false;
            }
            if (n > n2) {
                return true;
            }
        }
        return true;
    }
    
    public static void G(final int n, int n2, final byte[] array) {
        array[n2] = (byte)(n >>> 24);
        ++n2;
        array[n2] = (byte)(n >>> 16);
        ++n2;
        array[n2] = (byte)(n >>> 8);
        array[n2 + 1] = (byte)n;
    }
    
    public static void H(final int n, int n2, final byte[] array) {
        array[n2] = (byte)n;
        ++n2;
        array[n2] = (byte)(n >>> 8);
        ++n2;
        array[n2] = (byte)(n >>> 16);
        array[n2 + 1] = (byte)(n >>> 24);
    }
    
    public static int I(int n, int i, final int[] array, final int[] array2, final int[] array3) {
        final int length = array.length;
        int n2 = 0;
        int n3;
        while (true) {
            n3 = array2[0];
            if (n3 != 0) {
                break;
            }
            int n4 = n;
            int n5 = 0;
            while (--n4 >= 0) {
                final int n6 = array2[n4];
                array2[n4] = n5;
                n5 = n6;
            }
            n2 += 32;
        }
        int n7;
        for (n7 = 0; (n3 & 0x1) == 0x0; n3 >>>= 1, ++n7) {}
        int n8 = n2;
        if (n7 > 0) {
            final int n9 = 0;
            int n10 = n;
            n = n9;
            while (--n10 >= 0) {
                final int n11 = array2[n10];
                array2[n10] = (n << -n7 | n11 >>> n7);
                n = n11;
            }
            n8 = n2 + n7;
        }
        n = 0;
        int n12 = i;
        int n13;
        int n14;
        int n15;
        for (i = n; i < n8; ++i, n12 = n) {
            n = n12;
            if ((array3[0] & 0x1) != 0x0) {
                if (n12 < 0) {
                    n = android.support.v4.media.b.L0(length, array, array3);
                }
                else {
                    n = android.support.v4.media.b.I2(length, array, array3);
                }
                n += n12;
            }
            n13 = n;
            n14 = length;
            while (--n14 >= 0) {
                n15 = array3[n14];
                array3[n14] = (n13 << 31 | n15 >>> 1);
                n13 = n15;
            }
        }
        return n12;
    }
    
    public static void J(final int[] array, int[] array2, final int[] array3) {
        final int length = array.length;
        if (android.support.v4.media.b.V1(length, array2)) {
            throw new IllegalArgumentException("'x' cannot be 0");
        }
        if (android.support.v4.media.b.R1(length, array2)) {
            System.arraycopy(array2, 0, array3, 0, length);
            return;
        }
        final int[] array4 = new int[length];
        System.arraycopy(array2, 0, array4, 0, length);
        array2 = new int[length];
        array2[0] = 1;
        int n;
        if ((0x1 & array4[0]) == 0x0) {
            n = I(length, 0, array, array4, array2);
        }
        else {
            n = 0;
        }
        if (android.support.v4.media.b.R1(length, array4)) {
            if (n < 0) {
                android.support.v4.media.b.p0(array.length, array2, array, array3);
            }
            else {
                System.arraycopy(array2, 0, array3, 0, array.length);
            }
            return;
        }
        final int[] array5 = new int[length];
        System.arraycopy(array, 0, array5, 0, length);
        final int[] array6 = new int[length];
        int n2 = length;
        int i = 0;
        while (true) {
            final int n3 = n2 - 1;
            if (array4[n3] == 0 && array5[n3] == 0) {
                n2 = n3;
            }
            else if (android.support.v4.media.b.J1(n2, array4, array5)) {
                android.support.v4.media.b.I2(n2, array5, array4);
                final int n4 = n = I(n2, android.support.v4.media.b.I2(length, array6, array2) - i + n, array, array4, array2);
                if (android.support.v4.media.b.R1(n2, array4)) {
                    if (n4 < 0) {
                        android.support.v4.media.b.p0(array.length, array2, array, array3);
                    }
                    else {
                        System.arraycopy(array2, 0, array3, 0, array.length);
                    }
                    return;
                }
                continue;
            }
            else {
                android.support.v4.media.b.I2(n2, array4, array5);
                final int n5 = i = I(n2, android.support.v4.media.b.I2(length, array2, array6) - n + i, array, array5, array6);
                if (android.support.v4.media.b.R1(n2, array5)) {
                    if (n5 < 0) {
                        android.support.v4.media.b.p0(array.length, array6, array, array3);
                    }
                    else {
                        System.arraycopy(array6, 0, array3, 0, array.length);
                    }
                    return;
                }
                continue;
            }
        }
    }
    
    public static boolean K(final int[] array) {
        if (array[0] != 1) {
            return false;
        }
        for (int i = 1; i < 5; ++i) {
            if (array[i] != 0) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean L(final int[] array) {
        if (array[0] != 1) {
            return false;
        }
        for (int i = 1; i < 7; ++i) {
            if (array[i] != 0) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean M(final int[] array) {
        for (int i = 0; i < 5; ++i) {
            if (array[i] != 0) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean N(final int[] array) {
        for (int i = 0; i < 7; ++i) {
            if (array[i] != 0) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean O(final long[] array) {
        for (int i = 0; i < 9; ++i) {
            if (array[i] != 0L) {
                return false;
            }
        }
        return true;
    }
    
    public static int P(int n, final byte[] array) {
        final byte b = array[n];
        int n2 = n + 1;
        n = array[n2];
        ++n2;
        return array[n2 + 1] << 24 | ((b & 0xFF) | (n & 0xFF) << 8 | (array[n2] & 0xFF) << 16);
    }
    
    public static long Q(final int n, final byte[] array) {
        return ((long)P(n + 4, array) & 0xFFFFFFFFL) << 32 | ((long)P(n, array) & 0xFFFFFFFFL);
    }
    
    public static void V(final long n, final byte[] array, final int n2) {
        G((int)(n >>> 32), n2, array);
        G((int)(n & 0xFFFFFFFFL), n2 + 4, array);
    }
    
    public static void W(final int[] array, final int[] array2, final int[] array3) {
        final long n = (long)array2[0] & 0xFFFFFFFFL;
        int i = 1;
        final long n2 = (long)array2[1] & 0xFFFFFFFFL;
        final long n3 = (long)array2[2] & 0xFFFFFFFFL;
        final long n4 = (long)array2[3] & 0xFFFFFFFFL;
        final long n5 = (long)array2[4] & 0xFFFFFFFFL;
        final long n6 = (long)array[0] & 0xFFFFFFFFL;
        final long n7 = n6 * n + 0L;
        array3[0] = (int)n7;
        final long n8 = n6 * n2 + (n7 >>> 32);
        array3[1] = (int)n8;
        final long n9 = n6 * n3 + (n8 >>> 32);
        array3[2] = (int)n9;
        final long n10 = n6 * n4 + (n9 >>> 32);
        array3[3] = (int)n10;
        final long n11 = n6 * n5 + (n10 >>> 32);
        array3[4] = (int)n11;
        array3[5] = (int)(n11 >>> 32);
        while (i < 5) {
            final long n12 = (long)array[i] & 0xFFFFFFFFL;
            final int n13 = i + 0;
            final long n14 = n12 * n + ((long)array3[n13] & 0xFFFFFFFFL) + 0L;
            array3[n13] = (int)n14;
            final int n15 = i + 1;
            final long n16 = n12 * n2 + ((long)array3[n15] & 0xFFFFFFFFL) + (n14 >>> 32);
            array3[n15] = (int)n16;
            final int n17 = i + 2;
            final long n18 = n12 * n3 + ((long)array3[n17] & 0xFFFFFFFFL) + (n16 >>> 32);
            array3[n17] = (int)n18;
            final int n19 = i + 3;
            final long n20 = n12 * n4 + ((long)array3[n19] & 0xFFFFFFFFL) + (n18 >>> 32);
            array3[n19] = (int)n20;
            final int n21 = i + 4;
            final long n22 = n12 * n5 + ((long)array3[n21] & 0xFFFFFFFFL) + (n20 >>> 32);
            array3[n21] = (int)n22;
            array3[i + 5] = (int)(n22 >>> 32);
            i = n15;
        }
    }
    
    public static void X(final int[] array, final int[] array2, final int[] array3) {
        final long n = (long)array2[0] & 0xFFFFFFFFL;
        final long n2 = (long)array2[1] & 0xFFFFFFFFL;
        final long n3 = (long)array2[2] & 0xFFFFFFFFL;
        final long n4 = (long)array2[3] & 0xFFFFFFFFL;
        final long n5 = (long)array2[4] & 0xFFFFFFFFL;
        final long n6 = (long)array2[5] & 0xFFFFFFFFL;
        final long n7 = (long)array2[6] & 0xFFFFFFFFL;
        final long n8 = (long)array[0] & 0xFFFFFFFFL;
        final long n9 = n8 * n + 0L;
        array3[0] = (int)n9;
        final long n10 = n8 * n2 + (n9 >>> 32);
        array3[1] = (int)n10;
        final long n11 = n8 * n3 + (n10 >>> 32);
        array3[2] = (int)n11;
        final long n12 = n8 * n4 + (n11 >>> 32);
        array3[3] = (int)n12;
        final long n13 = n8 * n5 + (n12 >>> 32);
        array3[4] = (int)n13;
        final long n14 = n8 * n6 + (n13 >>> 32);
        array3[5] = (int)n14;
        final long n15 = n8 * n7 + (n14 >>> 32);
        array3[6] = (int)n15;
        array3[7] = (int)(n15 >>> 32);
        int n19;
        for (int i = 1; i < 7; i = n19) {
            final long n16 = (long)array[i] & 0xFFFFFFFFL;
            final int n17 = i + 0;
            final long n18 = n16 * n + ((long)array3[n17] & 0xFFFFFFFFL) + 0L;
            array3[n17] = (int)n18;
            n19 = i + 1;
            final long n20 = n16 * n2 + ((long)array3[n19] & 0xFFFFFFFFL) + (n18 >>> 32);
            array3[n19] = (int)n20;
            final int n21 = i + 2;
            final long n22 = n16 * n3 + ((long)array3[n21] & 0xFFFFFFFFL) + (n20 >>> 32);
            array3[n21] = (int)n22;
            final int n23 = i + 3;
            final long n24 = n16 * n4 + ((long)array3[n23] & 0xFFFFFFFFL) + (n22 >>> 32);
            array3[n23] = (int)n24;
            final int n25 = i + 4;
            final long n26 = n16 * n5 + ((long)array3[n25] & 0xFFFFFFFFL) + (n24 >>> 32);
            array3[n25] = (int)n26;
            final int n27 = i + 5;
            final long n28 = n16 * n6 + ((long)array3[n27] & 0xFFFFFFFFL) + (n26 >>> 32);
            array3[n27] = (int)n28;
            final int n29 = i + 6;
            final long n30 = n16 * n7 + ((long)array3[n29] & 0xFFFFFFFFL) + (n28 >>> 32);
            array3[n29] = (int)n30;
            array3[i + 7] = (int)(n30 >>> 32);
        }
    }
    
    public static int Y(final int[] array, final int[] array2, final int[] array3) {
        int i = 0;
        final long n = (long)array2[0] & 0xFFFFFFFFL;
        final long n2 = (long)array2[1] & 0xFFFFFFFFL;
        final long n3 = (long)array2[2] & 0xFFFFFFFFL;
        final long n4 = array2[3];
        final long n5 = array2[4];
        long n6;
        int n10;
        long n17;
        long n18;
        for (n6 = 0L; i < 5; i += 5, n18 = (n17 >>> 32) + ((long)array3[i] & 0xFFFFFFFFL) + n6, array3[i] = (int)n18, n6 = n18 >>> 32, i = n10) {
            final long n7 = (long)array[i] & 0xFFFFFFFFL;
            final int n8 = i + 0;
            final long n9 = n7 * n + ((long)array3[n8] & 0xFFFFFFFFL) + 0L;
            array3[n8] = (int)n9;
            n10 = i + 1;
            final long n11 = n7 * n2 + ((long)array3[n10] & 0xFFFFFFFFL) + (n9 >>> 32);
            array3[n10] = (int)n11;
            final int n12 = i + 2;
            final long n13 = n7 * n3 + ((long)array3[n12] & 0xFFFFFFFFL) + (n11 >>> 32);
            array3[n12] = (int)n13;
            final int n14 = i + 3;
            final long n15 = n7 * (n4 & 0xFFFFFFFFL) + ((long)array3[n14] & 0xFFFFFFFFL) + (n13 >>> 32);
            array3[n14] = (int)n15;
            final int n16 = i + 4;
            n17 = n7 * (n5 & 0xFFFFFFFFL) + ((long)array3[n16] & 0xFFFFFFFFL) + (n15 >>> 32);
            array3[n16] = (int)n17;
        }
        return (int)n6;
    }
    
    public static int Z(final int[] array, final int[] array2, final int[] array3) {
        final long n = array2[0];
        final long n2 = (long)array2[1] & 0xFFFFFFFFL;
        final long n3 = (long)array2[2] & 0xFFFFFFFFL;
        final long n4 = array2[3];
        final long n5 = array2[4];
        final long n6 = (long)array2[5] & 0xFFFFFFFFL;
        final long n7 = (long)array2[6] & 0xFFFFFFFFL;
        long n8 = 0L;
        int n12;
        long n23;
        long n24;
        for (int i = 0; i < 7; i += 7, n24 = (n23 >>> 32) + ((long)array3[i] & 0xFFFFFFFFL) + n8, array3[i] = (int)n24, n8 = n24 >>> 32, i = n12) {
            final long n9 = (long)array[i] & 0xFFFFFFFFL;
            final int n10 = i + 0;
            final long n11 = n9 * (n & 0xFFFFFFFFL) + ((long)array3[n10] & 0xFFFFFFFFL) + 0L;
            array3[n10] = (int)n11;
            n12 = i + 1;
            final long n13 = n9 * n2 + ((long)array3[n12] & 0xFFFFFFFFL) + (n11 >>> 32);
            array3[n12] = (int)n13;
            final int n14 = i + 2;
            final long n15 = n9 * n3 + ((long)array3[n14] & 0xFFFFFFFFL) + (n13 >>> 32);
            array3[n14] = (int)n15;
            final int n16 = i + 3;
            final long n17 = n9 * (n4 & 0xFFFFFFFFL) + ((long)array3[n16] & 0xFFFFFFFFL) + (n15 >>> 32);
            array3[n16] = (int)n17;
            final int n18 = i + 4;
            final long n19 = n9 * (n5 & 0xFFFFFFFFL) + ((long)array3[n18] & 0xFFFFFFFFL) + (n17 >>> 32);
            array3[n18] = (int)n19;
            final int n20 = i + 5;
            final long n21 = n9 * n6 + ((long)array3[n20] & 0xFFFFFFFFL) + (n19 >>> 32);
            array3[n20] = (int)n21;
            final int n22 = i + 6;
            n23 = n9 * n7 + ((long)array3[n22] & 0xFFFFFFFFL) + (n21 >>> 32);
            array3[n22] = (int)n23;
        }
        return (int)n8;
    }
    
    public static void a0(final Context context, String decode, final long n, final long n2) {
        final j g = j.g(context);
        if (n > 0L) {
            g.v(n, "bnc_referrer_click_ts");
        }
        if (n2 > 0L) {
            g.v(n2, "bnc_install_begin_ts");
        }
        if (decode != null) {
            try {
                decode = URLDecoder.decode(decode, "UTF-8");
                final HashMap<String, String> hashMap = new HashMap<String, String>();
                final String[] split = decode.split("&");
                g.y("bnc_google_play_install_referrer_extras", decode);
                for (final String s : split) {
                    if (!TextUtils.isEmpty((CharSequence)s)) {
                        final boolean contains = s.contains("=");
                        decode = "-";
                        if (contains || !s.contains("-")) {
                            decode = "=";
                        }
                        final String[] split2 = s.split(decode);
                        if (split2.length > 1) {
                            hashMap.put(URLDecoder.decode(split2[0], "UTF-8"), URLDecoder.decode(split2[1], "UTF-8"));
                        }
                    }
                }
                final Defines$Jsonkey linkClickID = Defines$Jsonkey.LinkClickID;
                if (hashMap.containsKey(linkClickID.getKey())) {
                    decode = hashMap.get(linkClickID.getKey());
                    g.u(h.a = decode);
                }
                final Defines$Jsonkey isFullAppConv = Defines$Jsonkey.IsFullAppConv;
                if (hashMap.containsKey(isFullAppConv.getKey())) {
                    final Defines$Jsonkey referringLink = Defines$Jsonkey.ReferringLink;
                    if (hashMap.containsKey(referringLink.getKey())) {
                        g.b.putBoolean("bnc_is_full_app_conversion", (boolean)Boolean.parseBoolean(hashMap.get(isFullAppConv.getKey()))).apply();
                        g.y("bnc_app_link", hashMap.get(referringLink.getKey()));
                    }
                }
                final Defines$Jsonkey googleSearchInstallReferrer = Defines$Jsonkey.GoogleSearchInstallReferrer;
                if (hashMap.containsKey(googleSearchInstallReferrer.getKey())) {
                    g.y("bnc_google_search_install_identifier", hashMap.get(googleSearchInstallReferrer.getKey()));
                }
                if (hashMap.containsValue(Defines$Jsonkey.PlayAutoInstalls.getKey())) {
                    p2.b.O(context, (HashMap)hashMap);
                }
                final Defines$Jsonkey referrerExtraGclidParam = Defines$Jsonkey.ReferrerExtraGclidParam;
                if (hashMap.containsKey(referrerExtraGclidParam.getKey())) {
                    g.w(hashMap.get(referrerExtraGclidParam.getKey()));
                }
            }
            catch (final IllegalArgumentException ex) {
                ex.printStackTrace();
            }
            catch (final UnsupportedEncodingException ex2) {
                ex2.printStackTrace();
            }
        }
    }
    
    public static void c0(final int[] array, final int[] array2) {
        final long n = (long)array[0] & 0xFFFFFFFFL;
        int n2 = 10;
        int n3 = 0;
        int n4 = 4;
        while (true) {
            final int n5 = n4 - 1;
            final long n6 = (long)array[n4] & 0xFFFFFFFFL;
            final long n7 = n6 * n6;
            --n2;
            array2[n2] = (n3 << 31 | (int)(n7 >>> 33));
            --n2;
            array2[n2] = (int)(n7 >>> 1);
            n3 = (int)n7;
            if (n5 <= 0) {
                break;
            }
            n4 = n5;
        }
        final long n8 = n * n;
        final long n9 = n3 << 31;
        array2[0] = (int)n8;
        final int n10 = (int)(n8 >>> 32);
        final long n11 = (long)array[1] & 0xFFFFFFFFL;
        final long n12 = array2[2];
        final long n13 = ((n9 & 0xFFFFFFFFL) | n8 >>> 33) + n11 * n;
        final int n14 = (int)n13;
        array2[1] = (n14 << 1 | (n10 & 0x1));
        final long n15 = (long)array[2] & 0xFFFFFFFFL;
        final long n16 = array2[3];
        final long n17 = array2[4];
        final long n18 = n15 * n + ((n12 & 0xFFFFFFFFL) + (n13 >>> 32));
        final int n19 = (int)n18;
        array2[2] = (n14 >>> 31 | n19 << 1);
        final long i = android.support.v4.media.a.i(n15, n11, n18 >>> 32, n16 & 0xFFFFFFFFL);
        final long n20 = (n17 & 0xFFFFFFFFL) + (i >>> 32);
        final long n21 = (long)array[3] & 0xFFFFFFFFL;
        final long n22 = ((long)array2[5] & 0xFFFFFFFFL) + (n20 >>> 32);
        final long n23 = array2[6];
        final long n24 = n21 * n + (i & 0xFFFFFFFFL);
        final int n25 = (int)n24;
        array2[3] = (n19 >>> 31 | n25 << 1);
        final long j = android.support.v4.media.a.i(n21, n11, n24 >>> 32, n20 & 0xFFFFFFFFL);
        final long k = android.support.v4.media.a.i(n21, n15, j >>> 32, n22 & 0xFFFFFFFFL);
        final long n26 = (n23 & 0xFFFFFFFFL) + (n22 >>> 32) + (k >>> 32);
        final long n27 = (long)array[4] & 0xFFFFFFFFL;
        final long n28 = ((long)array2[7] & 0xFFFFFFFFL) + (n26 >>> 32);
        final long n29 = array2[8];
        final long n30 = n * n27 + (j & 0xFFFFFFFFL);
        final int n31 = (int)n30;
        array2[4] = (n25 >>> 31 | n31 << 1);
        final long l = android.support.v4.media.a.i(n27, n11, n30 >>> 32, k & 0xFFFFFFFFL);
        final long m = android.support.v4.media.a.i(n27, n15, l >>> 32, n26 & 0xFFFFFFFFL);
        final long i2 = android.support.v4.media.a.i(n27, n21, m >>> 32, n28 & 0xFFFFFFFFL);
        final long n32 = (n29 & 0xFFFFFFFFL) + (n28 >>> 32) + (i2 >>> 32);
        final int n33 = (int)l;
        array2[5] = (n33 << 1 | n31 >>> 31);
        final int n34 = (int)m;
        array2[6] = (n33 >>> 31 | n34 << 1);
        final int n35 = (int)i2;
        array2[7] = (n34 >>> 31 | n35 << 1);
        final int n36 = (int)n32;
        array2[8] = (n35 >>> 31 | n36 << 1);
        array2[9] = (n36 >>> 31 | array2[9] + (int)(n32 >>> 32) << 1);
    }
    
    public static void d0(final int[] array, final int[] array2) {
        final long n = (long)array[0] & 0xFFFFFFFFL;
        int n2 = 14;
        int n3 = 6;
        int n4 = 0;
        while (true) {
            final int n5 = n3 - 1;
            final long n6 = (long)array[n3] & 0xFFFFFFFFL;
            final long n7 = n6 * n6;
            --n2;
            array2[n2] = (n4 << 31 | (int)(n7 >>> 33));
            --n2;
            array2[n2] = (int)(n7 >>> 1);
            n4 = (int)n7;
            if (n5 <= 0) {
                break;
            }
            n3 = n5;
        }
        final long n8 = n * n;
        final long n9 = n4 << 31;
        array2[0] = (int)n8;
        final int n10 = (int)(n8 >>> 32);
        final long n11 = (long)array[1] & 0xFFFFFFFFL;
        final long n12 = array2[2];
        final long n13 = n11 * n + ((n9 & 0xFFFFFFFFL) | n8 >>> 33);
        final int n14 = (int)n13;
        array2[1] = ((n10 & 0x1) | n14 << 1);
        final long n15 = (long)array[2] & 0xFFFFFFFFL;
        final long n16 = array2[3];
        final long n17 = array2[4];
        final long n18 = n15 * n + ((n12 & 0xFFFFFFFFL) + (n13 >>> 32));
        final int n19 = (int)n18;
        array2[2] = (n14 >>> 31 | n19 << 1);
        final long i = android.support.v4.media.a.i(n15, n11, n18 >>> 32, n16 & 0xFFFFFFFFL);
        final long n20 = (n17 & 0xFFFFFFFFL) + (i >>> 32);
        final long n21 = (long)array[3] & 0xFFFFFFFFL;
        final long n22 = ((long)array2[5] & 0xFFFFFFFFL) + (n20 >>> 32);
        final long n23 = array2[6];
        final long n24 = n21 * n + (i & 0xFFFFFFFFL);
        final int n25 = (int)n24;
        array2[3] = (n19 >>> 31 | n25 << 1);
        final long j = android.support.v4.media.a.i(n21, n11, n24 >>> 32, n20 & 0xFFFFFFFFL);
        final long k = android.support.v4.media.a.i(n21, n15, j >>> 32, n22 & 0xFFFFFFFFL);
        final long n26 = (n23 & 0xFFFFFFFFL) + (n22 >>> 32) + (k >>> 32);
        final long n27 = (long)array[4] & 0xFFFFFFFFL;
        final long n28 = ((long)array2[7] & 0xFFFFFFFFL) + (n26 >>> 32);
        final long n29 = array2[8];
        final long n30 = n27 * n + (j & 0xFFFFFFFFL);
        final int n31 = (int)n30;
        array2[4] = (n31 << 1 | n25 >>> 31);
        final long l = android.support.v4.media.a.i(n27, n11, n30 >>> 32, k & 0xFFFFFFFFL);
        final long m = android.support.v4.media.a.i(n27, n15, l >>> 32, n26 & 0xFFFFFFFFL);
        final long i2 = android.support.v4.media.a.i(n27, n21, m >>> 32, n28 & 0xFFFFFFFFL);
        final long n32 = (n29 & 0xFFFFFFFFL) + (n28 >>> 32) + (i2 >>> 32);
        final long n33 = (long)array[5] & 0xFFFFFFFFL;
        final long n34 = ((long)array2[9] & 0xFFFFFFFFL) + (n32 >>> 32);
        final long n35 = array2[10];
        final long n36 = n33 * n + (l & 0xFFFFFFFFL);
        final int n37 = (int)n36;
        array2[5] = (n31 >>> 31 | n37 << 1);
        final long i3 = android.support.v4.media.a.i(n33, n11, n36 >>> 32, m & 0xFFFFFFFFL);
        final long i4 = android.support.v4.media.a.i(n33, n15, i3 >>> 32, i2 & 0xFFFFFFFFL);
        final long i5 = android.support.v4.media.a.i(n33, n21, i4 >>> 32, n32 & 0xFFFFFFFFL);
        final long i6 = android.support.v4.media.a.i(n33, n27, i5 >>> 32, n34 & 0xFFFFFFFFL);
        final long n38 = (n35 & 0xFFFFFFFFL) + (n34 >>> 32) + (i6 >>> 32);
        final long n39 = (long)array[6] & 0xFFFFFFFFL;
        final long n40 = ((long)array2[11] & 0xFFFFFFFFL) + (n38 >>> 32);
        final long n41 = array2[12];
        final long n42 = n * n39 + (i3 & 0xFFFFFFFFL);
        final int n43 = (int)n42;
        array2[6] = (n37 >>> 31 | n43 << 1);
        final long i7 = android.support.v4.media.a.i(n11, n39, n42 >>> 32, i4 & 0xFFFFFFFFL);
        final long i8 = android.support.v4.media.a.i(n39, n15, i7 >>> 32, i5 & 0xFFFFFFFFL);
        final long i9 = android.support.v4.media.a.i(n39, n21, i8 >>> 32, i6 & 0xFFFFFFFFL);
        final long i10 = android.support.v4.media.a.i(n39, n27, i9 >>> 32, n38 & 0xFFFFFFFFL);
        final long i11 = android.support.v4.media.a.i(n39, n33, i10 >>> 32, n40 & 0xFFFFFFFFL);
        final long n44 = (n41 & 0xFFFFFFFFL) + (n40 >>> 32) + (i11 >>> 32);
        final int n45 = (int)i7;
        array2[7] = (n43 >>> 31 | n45 << 1);
        final int n46 = (int)i8;
        array2[8] = (n45 >>> 31 | n46 << 1);
        final int n47 = (int)i9;
        array2[9] = (n46 >>> 31 | n47 << 1);
        final int n48 = (int)i10;
        array2[10] = (n48 << 1 | n47 >>> 31);
        final int n49 = (int)i11;
        array2[11] = (n48 >>> 31 | n49 << 1);
        final int n50 = (int)n44;
        array2[12] = (n49 >>> 31 | n50 << 1);
        array2[13] = (n50 >>> 31 | array2[13] + (int)(n44 >>> 32) << 1);
    }
    
    public static int e0(final int[] array, final int[] array2, final int[] array3) {
        final long n = ((long)array[0] & 0xFFFFFFFFL) - ((long)array2[0] & 0xFFFFFFFFL) + 0L;
        array3[0] = (int)n;
        final long n2 = ((long)array[1] & 0xFFFFFFFFL) - ((long)array2[1] & 0xFFFFFFFFL) + (n >> 32);
        array3[1] = (int)n2;
        final long n3 = ((long)array[2] & 0xFFFFFFFFL) - ((long)array2[2] & 0xFFFFFFFFL) + (n2 >> 32);
        array3[2] = (int)n3;
        final long n4 = ((long)array[3] & 0xFFFFFFFFL) - ((long)array2[3] & 0xFFFFFFFFL) + (n3 >> 32);
        array3[3] = (int)n4;
        final long n5 = ((long)array[4] & 0xFFFFFFFFL) - ((long)array2[4] & 0xFFFFFFFFL) + (n4 >> 32);
        array3[4] = (int)n5;
        return (int)(n5 >> 32);
    }
    
    public static int f0(final int[] array, final int[] array2, final int[] array3) {
        final long n = ((long)array[0] & 0xFFFFFFFFL) - ((long)array2[0] & 0xFFFFFFFFL) + 0L;
        array3[0] = (int)n;
        final long n2 = ((long)array[1] & 0xFFFFFFFFL) - ((long)array2[1] & 0xFFFFFFFFL) + (n >> 32);
        array3[1] = (int)n2;
        final long n3 = ((long)array[2] & 0xFFFFFFFFL) - ((long)array2[2] & 0xFFFFFFFFL) + (n2 >> 32);
        array3[2] = (int)n3;
        final long n4 = ((long)array[3] & 0xFFFFFFFFL) - ((long)array2[3] & 0xFFFFFFFFL) + (n3 >> 32);
        array3[3] = (int)n4;
        final long n5 = ((long)array[4] & 0xFFFFFFFFL) - ((long)array2[4] & 0xFFFFFFFFL) + (n4 >> 32);
        array3[4] = (int)n5;
        final long n6 = ((long)array[5] & 0xFFFFFFFFL) - ((long)array2[5] & 0xFFFFFFFFL) + (n5 >> 32);
        array3[5] = (int)n6;
        final long n7 = ((long)array[6] & 0xFFFFFFFFL) - ((long)array2[6] & 0xFFFFFFFFL) + (n6 >> 32);
        array3[6] = (int)n7;
        return (int)(n7 >> 32);
    }
    
    public static void g0(final int[] array, final int[] array2) {
        final long n = ((long)array2[0] & 0xFFFFFFFFL) - ((long)array[0] & 0xFFFFFFFFL) + 0L;
        array2[0] = (int)n;
        final long n2 = ((long)array2[1] & 0xFFFFFFFFL) - ((long)array[1] & 0xFFFFFFFFL) + (n >> 32);
        array2[1] = (int)n2;
        final long n3 = ((long)array2[2] & 0xFFFFFFFFL) - ((long)array[2] & 0xFFFFFFFFL) + (n2 >> 32);
        array2[2] = (int)n3;
        final long n4 = ((long)array2[3] & 0xFFFFFFFFL) - ((long)array[3] & 0xFFFFFFFFL) + (n3 >> 32);
        array2[3] = (int)n4;
        array2[4] = (int)(((long)array2[4] & 0xFFFFFFFFL) - (0xFFFFFFFFL & (long)array[4]) + (n4 >> 32));
    }
    
    public static BigInteger h0(final int[] array) {
        final byte[] array2 = new byte[20];
        for (int i = 0; i < 5; ++i) {
            final int n = array[i];
            if (n != 0) {
                G(n, 4 - i << 2, array2);
            }
        }
        return new BigInteger(1, array2);
    }
    
    public static BigInteger i0(final int[] array) {
        final byte[] array2 = new byte[28];
        for (int i = 0; i < 7; ++i) {
            final int n = array[i];
            if (n != 0) {
                G(n, 6 - i << 2, array2);
            }
        }
        return new BigInteger(1, array2);
    }
    
    public static int j(final int[] array, final int[] array2, final int[] array3) {
        final long n = ((long)array[0] & 0xFFFFFFFFL) + ((long)array2[0] & 0xFFFFFFFFL) + 0L;
        array3[0] = (int)n;
        final long n2 = ((long)array[1] & 0xFFFFFFFFL) + ((long)array2[1] & 0xFFFFFFFFL) + (n >>> 32);
        array3[1] = (int)n2;
        final long n3 = ((long)array[2] & 0xFFFFFFFFL) + ((long)array2[2] & 0xFFFFFFFFL) + (n2 >>> 32);
        array3[2] = (int)n3;
        final long n4 = ((long)array[3] & 0xFFFFFFFFL) + ((long)array2[3] & 0xFFFFFFFFL) + (n3 >>> 32);
        array3[3] = (int)n4;
        final long n5 = ((long)array[4] & 0xFFFFFFFFL) + ((long)array2[4] & 0xFFFFFFFFL) + (n4 >>> 32);
        array3[4] = (int)n5;
        return (int)(n5 >>> 32);
    }
    
    public static int k(final int[] array, final int[] array2, final int[] array3) {
        final long n = ((long)array[0] & 0xFFFFFFFFL) + ((long)array2[0] & 0xFFFFFFFFL) + 0L;
        array3[0] = (int)n;
        final long n2 = ((long)array[1] & 0xFFFFFFFFL) + ((long)array2[1] & 0xFFFFFFFFL) + (n >>> 32);
        array3[1] = (int)n2;
        final long n3 = ((long)array[2] & 0xFFFFFFFFL) + ((long)array2[2] & 0xFFFFFFFFL) + (n2 >>> 32);
        array3[2] = (int)n3;
        final long n4 = ((long)array[3] & 0xFFFFFFFFL) + ((long)array2[3] & 0xFFFFFFFFL) + (n3 >>> 32);
        array3[3] = (int)n4;
        final long n5 = ((long)array[4] & 0xFFFFFFFFL) + ((long)array2[4] & 0xFFFFFFFFL) + (n4 >>> 32);
        array3[4] = (int)n5;
        final long n6 = ((long)array[5] & 0xFFFFFFFFL) + ((long)array2[5] & 0xFFFFFFFFL) + (n5 >>> 32);
        array3[5] = (int)n6;
        final long n7 = ((long)array[6] & 0xFFFFFFFFL) + ((long)array2[6] & 0xFFFFFFFFL) + (n6 >>> 32);
        array3[6] = (int)n7;
        return (int)(n7 >>> 32);
    }
    
    public static int l(final int[] array, final int[] array2, final int[] array3) {
        final long n = ((long)array[0] & 0xFFFFFFFFL) + ((long)array2[0] & 0xFFFFFFFFL) + ((long)array3[0] & 0xFFFFFFFFL) + 0L;
        array3[0] = (int)n;
        final long n2 = ((long)array[1] & 0xFFFFFFFFL) + ((long)array2[1] & 0xFFFFFFFFL) + ((long)array3[1] & 0xFFFFFFFFL) + (n >>> 32);
        array3[1] = (int)n2;
        final long n3 = ((long)array[2] & 0xFFFFFFFFL) + ((long)array2[2] & 0xFFFFFFFFL) + ((long)array3[2] & 0xFFFFFFFFL) + (n2 >>> 32);
        array3[2] = (int)n3;
        final long n4 = ((long)array[3] & 0xFFFFFFFFL) + ((long)array2[3] & 0xFFFFFFFFL) + ((long)array3[3] & 0xFFFFFFFFL) + (n3 >>> 32);
        array3[3] = (int)n4;
        final long n5 = ((long)array[4] & 0xFFFFFFFFL) + ((long)array2[4] & 0xFFFFFFFFL) + ((long)array3[4] & 0xFFFFFFFFL) + (n4 >>> 32);
        array3[4] = (int)n5;
        return (int)(n5 >>> 32);
    }
    
    public static int m(final int[] array, final int[] array2, final int[] array3) {
        final long n = ((long)array[0] & 0xFFFFFFFFL) + ((long)array2[0] & 0xFFFFFFFFL) + ((long)array3[0] & 0xFFFFFFFFL) + 0L;
        array3[0] = (int)n;
        final long n2 = ((long)array[1] & 0xFFFFFFFFL) + ((long)array2[1] & 0xFFFFFFFFL) + ((long)array3[1] & 0xFFFFFFFFL) + (n >>> 32);
        array3[1] = (int)n2;
        final long n3 = ((long)array[2] & 0xFFFFFFFFL) + ((long)array2[2] & 0xFFFFFFFFL) + ((long)array3[2] & 0xFFFFFFFFL) + (n2 >>> 32);
        array3[2] = (int)n3;
        final long n4 = ((long)array[3] & 0xFFFFFFFFL) + ((long)array2[3] & 0xFFFFFFFFL) + ((long)array3[3] & 0xFFFFFFFFL) + (n3 >>> 32);
        array3[3] = (int)n4;
        final long n5 = ((long)array[4] & 0xFFFFFFFFL) + ((long)array2[4] & 0xFFFFFFFFL) + ((long)array3[4] & 0xFFFFFFFFL) + (n4 >>> 32);
        array3[4] = (int)n5;
        final long n6 = ((long)array[5] & 0xFFFFFFFFL) + ((long)array2[5] & 0xFFFFFFFFL) + ((long)array3[5] & 0xFFFFFFFFL) + (n5 >>> 32);
        array3[5] = (int)n6;
        final long n7 = ((long)array[6] & 0xFFFFFFFFL) + ((long)array2[6] & 0xFFFFFFFFL) + ((long)array3[6] & 0xFFFFFFFFL) + (n6 >>> 32);
        array3[6] = (int)n7;
        return (int)(n7 >>> 32);
    }
    
    public static int o(int n, final byte[] array) {
        final byte b = array[n];
        int n2 = n + 1;
        n = array[n2];
        ++n2;
        return (array[n2 + 1] & 0xFF) | (b << 24 | (n & 0xFF) << 16 | (array[n2] & 0xFF) << 8);
    }
    
    public static void q(final int n, final int[] array, final int[] array2) {
        array2[n + 0] = array[0];
        array2[n + 1] = array[1];
        array2[n + 2] = array[2];
        array2[n + 3] = array[3];
        array2[n + 4] = array[4];
    }
    
    public static void r(final int[] array, final int[] array2) {
        array2[0] = array[0];
        array2[1] = array[1];
        array2[2] = array[2];
        array2[3] = array[3];
        array2[4] = array[4];
        array2[5] = array[5];
        array2[6] = array[6];
    }
    
    public static void s(final int n, final int[] array, final int[] array2) {
        array2[n + 0] = array[0];
        array2[n + 1] = array[1];
        array2[n + 2] = array[2];
        array2[n + 3] = array[3];
        array2[n + 4] = array[4];
        array2[n + 5] = array[5];
        array2[n + 6] = array[6];
    }
    
    public static void t(final long[] array, final long[] array2, final int n) {
        array2[n + 0] = array[0];
        array2[n + 1] = array[1];
        array2[n + 2] = array[2];
        array2[n + 3] = array[3];
        array2[n + 4] = array[4];
    }
    
    public static void u(final long[] array, final long[] array2, final int n) {
        array2[n + 0] = array[0];
        array2[n + 1] = array[1];
        array2[n + 2] = array[2];
        array2[n + 3] = array[3];
        array2[n + 4] = array[4];
        array2[n + 5] = array[5];
        array2[n + 6] = array[6];
    }
    
    public static void v(final long[] array, final long[] array2, final int n) {
        array2[n + 0] = array[0];
        array2[n + 1] = array[1];
        array2[n + 2] = array[2];
        array2[n + 3] = array[3];
        array2[n + 4] = array[4];
        array2[n + 5] = array[5];
        array2[n + 6] = array[6];
        array2[n + 7] = array[7];
        array2[n + 8] = array[8];
    }
    
    public static boolean x(final int[] array, final int[] array2) {
        for (int i = 4; i >= 0; --i) {
            if (array[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean y(final int[] array, final int[] array2) {
        for (int i = 6; i >= 0; --i) {
            if (array[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }
    
    public static int[] z(BigInteger shiftRight) {
        if (shiftRight.signum() >= 0 && shiftRight.bitLength() <= 160) {
            final int[] array = new int[5];
            for (int n = 0; shiftRight.signum() != 0; shiftRight = shiftRight.shiftRight(32), ++n) {
                array[n] = shiftRight.intValue();
            }
            return array;
        }
        throw new IllegalArgumentException();
    }
    
    public abstract List B();
    
    public abstract b6.h C();
    
    public abstract void F(final CallableMemberDescriptor p0, final CallableMemberDescriptor p1);
    
    public void R(final g g) {
        e.f((Object)g, "icon");
        final Context p = this.p();
        final dr0.d m = ah0.b.M1(p).m((Drawable)new NsfwDrawable(p, g.f));
        e.e((Object)m, "with(context)\n      .loa\u2026ble(context, icon.shape))");
        this.U(m);
    }
    
    public void S(final h$b h$b) {
        e.f((Object)h$b, "icon");
        final Context p = this.p();
        final Integer i = h$b.i;
        int n;
        if (i != null) {
            n = i;
        }
        else {
            n = cg.d.y2(((c91.h)h$b).g, p);
        }
        final dr0.d z = ah0.b.M1(p).r(h$b.h).z(new p8.j[] { (p8.j)new i(), (p8.j)new hr0.a(n), (p8.j)new k() });
        e.e((Object)z, "with(context)\n      .loa\u2026    CircleCrop(),\n      )");
        this.U(z);
    }
    
    public void T(final i$c i$c) {
        e.f((Object)i$c, "icon");
        final Context p = this.p();
        final Integer i = i$c.i;
        int n;
        if (i != null) {
            n = i;
        }
        else {
            n = cg.d.y2(((c91.i)i$c).g, p);
        }
        final dr0.d z = ah0.b.M1(p).r(i$c.h).w(((c91.i)i$c).a(p)).h().z(new p8.j[] { (p8.j)new i(), (p8.j)new hr0.a(n), (p8.j)new k() });
        e.e((Object)z, "with(context)\n      .loa\u2026    CircleCrop(),\n      )");
        this.U(z);
    }
    
    public abstract void U(final dr0.d p0);
    
    public Object a(final Class clazz) {
        final ii.b g = ((c)this).g(clazz);
        if (g == null) {
            return null;
        }
        return g.get();
    }
    
    public void b0(final CallableMemberDescriptor callableMemberDescriptor, final Collection collection) {
        e.f((Object)callableMemberDescriptor, "member");
        callableMemberDescriptor.R(collection);
    }
    
    public Set d(final Class clazz) {
        return (Set)((c)this).c(clazz).get();
    }
    
    public qb.a h(final qb.d d) {
        final ByteBuffer h = ((DecoderInputBuffer)d).h;
        h.getClass();
        ah0.b.C(h.position() == 0 && h.hasArray() && h.arrayOffset() == 0);
        qb.a w;
        if (((ab.a)d).o()) {
            w = null;
        }
        else {
            w = this.w(d, h);
        }
        return w;
    }
    
    public abstract void j0(final sc p0, final gb p1);
    
    public abstract void k0(final r5 p0, final jc p1);
    
    public abstract void l0(final f2 p0, final jc p1);
    
    public abstract void m0(final kd p0, final s5 p1);
    
    public abstract void n(final CallableMemberDescriptor p0);
    
    public abstract void n0(final od p0, final jc p1);
    
    public abstract void o0(final com.google.android.gms.internal.firebase-auth-api.h p0, final r5 p1);
    
    public abstract Context p();
    
    public abstract void p0(final td p0, final p5 p1);
    
    public abstract void q0(final vd p0, final jc p1);
    
    public abstract qb.a w(final qb.d p0, final ByteBuffer p1);
}
