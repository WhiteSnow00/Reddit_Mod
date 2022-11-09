// 
// Decompiled by Procyon v0.6.0
// 

package vb;

import java.util.List;
import java.nio.ByteBuffer;
import bd.r;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import bd.c0;
import mk2.e;
import java.util.Locale;
import bd.s;
import java.io.UnsupportedEncodingException;
import ak0.o;
import android.support.v4.media.a;

public final class g extends android.support.v4.media.a
{
    public static final o g;
    public final a f;
    
    static {
        g = new o(3);
    }
    
    public g(final a f) {
        this.f = f;
    }
    
    public static String A2(final String s, final byte[] array, final int n, final int n2) throws UnsupportedEncodingException {
        if (n2 > n && n2 <= array.length) {
            return new String(array, n, n2 - n, s);
        }
        return "";
    }
    
    public static l B2(int n, final s s, final String s2) throws UnsupportedEncodingException {
        if (n < 1) {
            return null;
        }
        final int r = s.r();
        final String g2 = G2(r);
        final byte[] array = new byte[--n];
        s.b(0, n, array);
        return new l(s2, null, new String(array, 0, I2(0, r, array), g2));
    }
    
    public static l C2(int i2, final s s) throws UnsupportedEncodingException {
        if (i2 < 1) {
            return null;
        }
        final int r = s.r();
        final String g2 = G2(r);
        final byte[] array = new byte[--i2];
        s.b(0, i2, array);
        i2 = I2(0, r, array);
        final String s2 = new String(array, 0, i2, g2);
        i2 += F2(r);
        return new l("TXXX", s2, A2(g2, array, i2, I2(i2, r, array)));
    }
    
    public static m D2(final int n, final s s, final String s2) throws UnsupportedEncodingException {
        final byte[] array = new byte[n];
        s.b(0, n, array);
        return new m(s2, null, new String(array, 0, J2(0, array), "ISO-8859-1"));
    }
    
    public static m E2(int i2, final s s) throws UnsupportedEncodingException {
        if (i2 < 1) {
            return null;
        }
        final int r = s.r();
        final String g2 = G2(r);
        final byte[] array = new byte[--i2];
        s.b(0, i2, array);
        i2 = I2(0, r, array);
        final String s2 = new String(array, 0, i2, g2);
        i2 += F2(r);
        return new m("WXXX", s2, A2("ISO-8859-1", array, i2, J2(i2, array)));
    }
    
    public static int F2(int n) {
        if (n != 0 && n != 3) {
            n = 2;
        }
        else {
            n = 1;
        }
        return n;
    }
    
    public static String G2(final int n) {
        if (n == 1) {
            return "UTF-16";
        }
        if (n == 2) {
            return "UTF-16BE";
        }
        if (n != 3) {
            return "ISO-8859-1";
        }
        return "UTF-8";
    }
    
    public static String H2(final int n, final int n2, final int n3, final int n4, final int n5) {
        String s;
        if (n == 2) {
            s = String.format(Locale.US, "%c%c%c", n2, n3, n4);
        }
        else {
            s = String.format(Locale.US, "%c%c%c%c", n2, n3, n4, n5);
        }
        return s;
    }
    
    public static int I2(final int n, final int n2, final byte[] array) {
        final int j2 = J2(n, array);
        if (n2 != 0) {
            int i = j2;
            if (n2 != 3) {
                while (i < array.length - 1) {
                    if ((i - n) % 2 == 0 && array[i + 1] == 0) {
                        return i;
                    }
                    i = J2(i + 1, array);
                }
                return array.length;
            }
        }
        return j2;
    }
    
    public static int J2(int i, final byte[] array) {
        while (i < array.length) {
            if (array[i] == 0) {
                return i;
            }
            ++i;
        }
        return array.length;
    }
    
    public static int K2(int n, final s s) {
        final byte[] a = s.a;
        int b;
        final int n2 = b = s.b;
        int n3 = n;
        while (true) {
            final int n4 = b + 1;
            if (n4 >= n2 + n3) {
                break;
            }
            n = n3;
            if ((a[b] & 0xFF) == 0xFF) {
                n = n3;
                if (a[n4] == 0) {
                    System.arraycopy(a, b + 2, a, n4, n3 - (b - n2) - 2);
                    n = n3 - 1;
                }
            }
            b = n4;
            n3 = n;
        }
        return n3;
    }
    
    public static boolean L2(final s s, final int n, final int n2, final boolean b) {
        final int b2 = s.b;
        try {
            while (true) {
                final int c = s.c;
                final int b3 = s.b;
                final int n3 = 1;
                if (c - b3 < n2) {
                    return true;
                }
                int n4;
                long s2;
                int w;
                if (n >= 3) {
                    n4 = s.c();
                    s2 = s.s();
                    w = s.w();
                }
                else {
                    n4 = s.t();
                    s2 = s.t();
                    w = 0;
                }
                if (n4 == 0 && s2 == 0L && w == 0) {
                    return true;
                }
                long n5 = s2;
                if (n == 4) {
                    n5 = s2;
                    if (!b) {
                        if ((0x808080L & s2) != 0x0L) {
                            return false;
                        }
                        n5 = ((s2 >> 24 & 0xFFL) << 21 | ((s2 & 0xFFL) | (s2 >> 8 & 0xFFL) << 7 | (s2 >> 16 & 0xFFL) << 14));
                    }
                }
                int n6 = 0;
                int n8 = 0;
                Label_0287: {
                    int n7;
                    if (n == 4) {
                        if ((w & 0x40) != 0x0) {
                            n6 = 1;
                        }
                        else {
                            n6 = 0;
                        }
                        n7 = n6;
                        if ((w & 0x1) != 0x0) {
                            n8 = n3;
                            break Label_0287;
                        }
                    }
                    else {
                        if (n != 3) {
                            n6 = (n8 = 0);
                            break Label_0287;
                        }
                        if ((w & 0x20) != 0x0) {
                            n6 = 1;
                        }
                        else {
                            n6 = 0;
                        }
                        n7 = n6;
                        if ((w & 0x80) != 0x0) {
                            n8 = n3;
                            break Label_0287;
                        }
                    }
                    final int n9 = 0;
                    n6 = n7;
                    n8 = n9;
                }
                int n10 = n6;
                if (n8 != 0) {
                    n10 = n6 + 4;
                }
                if (n5 < n10) {
                    return false;
                }
                if (s.c - s.b < n5) {
                    return false;
                }
                s.C((int)n5);
            }
        }
        finally {
            s.B(b2);
        }
    }
    
    public static vb.a s2(final s s, int n, int n2) throws UnsupportedEncodingException {
        final int r = s.r();
        final String g2 = G2(r);
        final int n3 = n - 1;
        final byte[] array = new byte[n3];
        s.b(0, n3, array);
        String s3;
        if (n2 == 2) {
            final String value = String.valueOf(e.O(new String(array, 0, 3, "ISO-8859-1")));
            String concat;
            if (value.length() != 0) {
                concat = "image/".concat(value);
            }
            else {
                concat = new String("image/");
            }
            String s2 = concat;
            if ("image/jpg".equals(concat)) {
                s2 = "image/jpeg";
            }
            n = 2;
            s3 = s2;
        }
        else {
            n = J2(0, array);
            s3 = e.O(new String(array, 0, n, "ISO-8859-1"));
            if (s3.indexOf(47) == -1) {
                if (s3.length() != 0) {
                    s3 = "image/".concat(s3);
                }
                else {
                    s3 = new String("image/");
                }
            }
        }
        n2 = array[n + 1];
        final int n4 = n + 2;
        n = I2(n4, r, array);
        final String s4 = new String(array, n4, n - n4, g2);
        n += F2(r);
        byte[] array2;
        if (n3 <= n) {
            array2 = c0.f;
        }
        else {
            array2 = Arrays.copyOfRange(array, n, n3);
        }
        return new vb.a(s3, s4, n2 & 0xFF, array2);
    }
    
    public static c t2(final s s, final int n, final int n2, final boolean b, final int n3, final a a) throws UnsupportedEncodingException {
        final int b2 = s.b;
        final int j2 = J2(b2, s.a);
        final String s2 = new String(s.a, b2, j2 - b2, "ISO-8859-1");
        s.B(j2 + 1);
        final int c = s.c();
        final int c2 = s.c();
        long s3 = s.s();
        if (s3 == 4294967295L) {
            s3 = -1L;
        }
        long s4 = s.s();
        if (s4 == 4294967295L) {
            s4 = -1L;
        }
        final ArrayList<h> list = new ArrayList<h>();
        while (s.b < b2 + n) {
            final h w2 = w2(n2, s, b, n3, a);
            if (w2 != null) {
                list.add(w2);
            }
        }
        return new c(s2, c, c2, s3, s4, list.toArray(new h[0]));
    }
    
    public static d u2(final s s, final int n, final int n2, final boolean b, final int n3, final a a) throws UnsupportedEncodingException {
        final int b2 = s.b;
        final int j2 = J2(b2, s.a);
        final String s2 = new String(s.a, b2, j2 - b2, "ISO-8859-1");
        s.B(j2 + 1);
        final int r = s.r();
        final boolean b3 = (r & 0x2) != 0x0;
        final boolean b4 = (r & 0x1) != 0x0;
        final int r2 = s.r();
        final String[] array = new String[r2];
        for (int i = 0; i < r2; ++i) {
            final int b5 = s.b;
            final int j3 = J2(b5, s.a);
            array[i] = new String(s.a, b5, j3 - b5, "ISO-8859-1");
            s.B(j3 + 1);
        }
        final ArrayList<h> list = new ArrayList<h>();
        while (s.b < b2 + n) {
            final h w2 = w2(n2, s, b, n3, a);
            if (w2 != null) {
                list.add(w2);
            }
        }
        return new d(s2, b3, b4, array, list.toArray(new h[0]));
    }
    
    public static vb.e v2(int i2, final s s) throws UnsupportedEncodingException {
        if (i2 < 4) {
            return null;
        }
        final int r = s.r();
        final String g2 = G2(r);
        final byte[] array = new byte[3];
        s.b(0, 3, array);
        final String s2 = new String(array, 0, 3);
        i2 -= 4;
        final byte[] array2 = new byte[i2];
        s.b(0, i2, array2);
        i2 = I2(0, r, array2);
        final String s3 = new String(array2, 0, i2, g2);
        i2 += F2(r);
        return new vb.e(s2, s3, A2(g2, array2, i2, I2(i2, r, array2)));
    }
    
    public static h w2(int length, final s s, final boolean b, final int n, final a a) {
        final int r = s.r();
        final int r2 = s.r();
        final int r3 = s.r();
        int r4;
        if (length >= 3) {
            r4 = s.r();
        }
        else {
            r4 = 0;
        }
        int n3;
        if (length == 4) {
            final int n2 = n3 = s.u();
            if (!b) {
                n3 = ((n2 >> 24 & 0xFF) << 21 | ((n2 & 0xFF) | (n2 >> 8 & 0xFF) << 7 | (n2 >> 16 & 0xFF) << 14));
            }
        }
        else if (length == 3) {
            n3 = s.u();
        }
        else {
            n3 = s.t();
        }
        final int n4 = n3;
        int w;
        if (length >= 3) {
            w = s.w();
        }
        else {
            w = 0;
        }
        if (r == 0 && r2 == 0 && r3 == 0 && r4 == 0 && n4 == 0 && w == 0) {
            s.B(s.c);
            return null;
        }
        final int n5 = s.b + n4;
        if (n5 > s.c) {
            Log.w("Id3Decoder", "Frame size exceeds remaining tag data");
            s.B(s.c);
            return null;
        }
        if (a != null && !a.b(length, r, r2, r3, r4)) {
            s.B(n5);
            return null;
        }
        final int n6 = w;
        int n7 = 0;
        int n9 = 0;
        int n10 = 0;
        int n11 = 0;
        int n12 = 0;
        Label_0496: {
            if (length == 3) {
                final boolean b2 = (n6 & 0x80) != 0x0;
                final boolean b3 = (n6 & 0x40) != 0x0;
                if ((n6 & 0x20) != 0x0) {
                    n7 = 1;
                }
                else {
                    n7 = 0;
                }
                final int n8 = 0;
                final boolean b4 = b2;
                n9 = (b2 ? 1 : 0);
                n10 = (b4 ? 1 : 0);
                n11 = (b3 ? 1 : 0);
                n12 = n8;
            }
            else {
                int n13;
                int n14;
                int n15;
                if (length == 4) {
                    final boolean b5 = (n6 & 0x40) != 0x0;
                    final boolean b6 = (n6 & 0x8) != 0x0;
                    final boolean b7 = (n6 & 0x4) != 0x0;
                    final boolean b8 = (n6 & 0x2) != 0x0;
                    n9 = (b6 ? 1 : 0);
                    n13 = (b7 ? 1 : 0);
                    n14 = (b5 ? 1 : 0);
                    n15 = (b8 ? 1 : 0);
                    if ((n6 & 0x1) != 0x0) {
                        final boolean b9 = b8;
                        final int n16 = 1;
                        n9 = (b6 ? 1 : 0);
                        n10 = n16;
                        n11 = (b7 ? 1 : 0);
                        n7 = (b5 ? 1 : 0);
                        n12 = (b9 ? 1 : 0);
                        break Label_0496;
                    }
                }
                else {
                    n9 = 0;
                    n13 = 0;
                    n14 = 0;
                    n15 = 0;
                }
                n12 = n15;
                n7 = n14;
                n11 = n13;
                n10 = 0;
            }
        }
        Label_1217: {
            if (n9 != 0 || n11 != 0) {
                break Label_1217;
            }
            int n17 = n4;
            if (n7 != 0) {
                n17 = n4 - 1;
                s.C(1);
            }
            int n18 = n17;
            if (n10 != 0) {
                n18 = n17 - 4;
                s.C(4);
            }
            int k2 = n18;
            if (n12 != 0) {
                k2 = K2(n18, s);
            }
            while (true) {
                h h = null;
                Label_1089: {
                    Label_0610: {
                        if (r != 84 || r2 != 88 || r3 != 88) {
                            break Label_0610;
                        }
                        if (length != 2) {
                            if (r4 != 88) {
                                break Label_0610;
                            }
                        }
                        try {
                            try {
                                C2(k2, s);
                                break Label_1089;
                                iftrue(Label_0650:)(r != 84);
                                B2(k2, s, H2(length, r, r2, r3, r4));
                            }
                            finally {}
                        }
                        catch (final UnsupportedEncodingException ex) {
                            break Label_1190;
                        }
                    }
                    Label_0650: {
                        if (r == 87 && r2 == 88 && r3 == 88 && (length == 2 || r4 == 88)) {
                            h = E2(k2, s);
                        }
                        else if (r == 87) {
                            h = D2(k2, s, H2(length, r, r2, r3, r4));
                        }
                        else if (r == 80 && r2 == 82 && r3 == 73 && r4 == 86) {
                            h = z2(k2, s);
                        }
                        else if (r == 71 && r2 == 69 && r3 == 79 && (r4 == 66 || length == 2)) {
                            h = x2(k2, s);
                        }
                        else {
                            Label_0876: {
                                if (length == 2) {
                                    if (r != 80 || r2 != 73 || r3 != 67) {
                                        break Label_0876;
                                    }
                                }
                                else if (r != 65 || r2 != 80 || r3 != 73 || r4 != 67) {
                                    break Label_0876;
                                }
                                h = s2(s, k2, length);
                                break Label_1089;
                            }
                            if (r == 67 && r2 == 79 && r3 == 77 && (r4 == 77 || length == 2)) {
                                h = v2(k2, s);
                            }
                            else if (r == 67 && r2 == 72 && r3 == 65 && r4 == 80) {
                                h = t2(s, k2, length, b, n, (a)h);
                            }
                            else if (r == 67 && r2 == 84 && r3 == 79 && r4 == 67) {
                                h = u2(s, k2, length, b, n, (a)h);
                            }
                            else if (r == 77 && r2 == 76 && r3 == 76 && r4 == 84) {
                                h = y2(k2, s);
                            }
                            else {
                                final String h2 = H2(length, r, r2, r3, r4);
                                final byte[] array = new byte[k2];
                                s.b(0, k2, array);
                                h = new vb.b(h2, array);
                            }
                        }
                    }
                }
                Label_1181: {
                    if (h != null) {
                        break Label_1181;
                    }
                    final String h3 = H2(length, r, r2, r3, r4);
                    length = String.valueOf(h3).length();
                    final StringBuilder sb = new StringBuilder(length + 50);
                    sb.append("Failed to decode frame: id=");
                    sb.append(h3);
                    sb.append(", frameSize=");
                    sb.append(k2);
                    final String string = sb.toString();
                    try {
                        Log.w("Id3Decoder", string);
                        s.B(n5);
                        return h;
                        s.B(n5);
                        Log.w("Id3Decoder", "Skipping unsupported compressed or encrypted frame");
                        s.B(n5);
                        return null;
                        Log.w("Id3Decoder", "Unsupported character encoding");
                        s.B(n5);
                        return null;
                    }
                    catch (final UnsupportedEncodingException ex2) {
                        continue;
                    }
                }
                break;
            }
        }
    }
    
    public static f x2(int n, final s s) throws UnsupportedEncodingException {
        final int r = s.r();
        final String g2 = G2(r);
        final byte[] array = new byte[--n];
        s.b(0, n, array);
        int j2 = J2(0, array);
        final String s2 = new String(array, 0, j2, "ISO-8859-1");
        final int i2 = I2(++j2, r, array);
        final String a2 = A2(g2, array, j2, i2);
        final int n2 = F2(r) + i2;
        final int i3 = I2(n2, r, array);
        final String a3 = A2(g2, array, n2, i3);
        final int n3 = F2(r) + i3;
        byte[] array2;
        if (n <= n3) {
            array2 = c0.f;
        }
        else {
            array2 = Arrays.copyOfRange(array, n3, n);
        }
        return new f(s2, a2, a3, array2);
    }
    
    public static j y2(int i, final s s) {
        final int w = s.w();
        final int t = s.t();
        final int t2 = s.t();
        final int r = s.r();
        final int r2 = s.r();
        final r r3 = new r();
        r3.j(s.c, s.a);
        r3.k(s.b * 8);
        final int n = (i - 10) * 8 / (r + r2);
        final int[] array = new int[n];
        final int[] array2 = new int[n];
        int g;
        int g2;
        for (i = 0; i < n; ++i) {
            g = r3.g(r);
            g2 = r3.g(r2);
            array[i] = g;
            array2[i] = g2;
        }
        return new j(w, t, t2, array, array2);
    }
    
    public static k z2(final int n, final s s) throws UnsupportedEncodingException {
        final byte[] array = new byte[n];
        s.b(0, n, array);
        int j2 = J2(0, array);
        final String s2 = new String(array, 0, j2, "ISO-8859-1");
        ++j2;
        byte[] array2;
        if (n <= j2) {
            array2 = c0.f;
        }
        else {
            array2 = Arrays.copyOfRange(array, j2, n);
        }
        return new k(s2, array2);
    }
    
    public final qb.a j0(final qb.d d, final ByteBuffer byteBuffer) {
        return this.r2(byteBuffer.limit(), byteBuffer.array());
    }
    
    public final qb.a r2(int n, final byte[] array) {
        final ArrayList list = new ArrayList();
        final s s = new s(array, n);
        n = s.c;
        final int b = s.b;
        final int n2 = 10;
        final boolean b2 = true;
        b b6 = null;
        Label_0394: {
            Label_0392: {
                if (n - b < 10) {
                    Log.w("Id3Decoder", "Data too short to be an ID3 tag");
                }
                else {
                    n = s.t();
                    if (n == 4801587) {
                        final int r = s.r();
                        s.C(1);
                        final int r2 = s.r();
                        final int q = s.q();
                        if (r == 2) {
                            final boolean b3 = (r2 & 0x40) != 0x0;
                            n = q;
                            if (b3) {
                                Log.w("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                                break Label_0392;
                            }
                        }
                        else if (r == 3) {
                            final boolean b4 = (r2 & 0x40) != 0x0;
                            n = q;
                            if (b4) {
                                n = s.c();
                                s.C(n);
                                n = q - (n + 4);
                            }
                        }
                        else {
                            if (r != 4) {
                                ag0.a.u(57, "Skipped ID3 tag with unsupported majorVersion=", r, "Id3Decoder");
                                break Label_0392;
                            }
                            if ((r2 & 0x40) != 0x0) {
                                n = 1;
                            }
                            else {
                                n = 0;
                            }
                            int n3 = q;
                            if (n != 0) {
                                n = s.q();
                                s.C(n - 4);
                                n3 = q - n;
                            }
                            final boolean b5 = (r2 & 0x10) != 0x0;
                            n = n3;
                            if (b5) {
                                n = n3 - 10;
                            }
                        }
                        b6 = new b(r, r < 4 && (r2 & 0x80) != 0x0, n);
                        break Label_0394;
                    }
                    final String value = String.valueOf(String.format("%06X", n));
                    String concat;
                    if (value.length() != 0) {
                        concat = "Unexpected first three bytes of ID3 tag header: 0x".concat(value);
                    }
                    else {
                        concat = new String("Unexpected first three bytes of ID3 tag header: 0x");
                    }
                    Log.w("Id3Decoder", concat);
                }
            }
            b6 = null;
        }
        if (b6 == null) {
            return null;
        }
        final int b7 = s.b;
        n = n2;
        if (b6.a == 2) {
            n = 6;
        }
        int n4 = b6.c;
        if (b6.b) {
            n4 = K2(n4, s);
        }
        s.A(b7 + n4);
        boolean b8;
        if (!L2(s, b6.a, n, false)) {
            if (b6.a != 4 || !L2(s, 4, n, true)) {
                ag0.a.u(56, "Failed to validate ID3 tag with majorVersion=", b6.a, "Id3Decoder");
                return null;
            }
            b8 = b2;
        }
        else {
            b8 = false;
        }
        while (s.c - s.b >= n) {
            final h w2 = w2(b6.a, s, b8, n, this.f);
            if (w2 != null) {
                list.add(w2);
            }
        }
        return new qb.a((List)list);
    }
    
    public interface a
    {
        boolean b(final int p0, final int p1, final int p2, final int p3, final int p4);
    }
    
    public static final class b
    {
        public final int a;
        public final boolean b;
        public final int c;
        
        public b(final int a, final boolean b, final int c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
}
