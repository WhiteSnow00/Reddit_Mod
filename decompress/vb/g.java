// 
// Decompiled by Procyon v0.6.0
// 

package vb;

import java.nio.ByteBuffer;
import java.util.List;
import bd.s;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import bd.c0;
import zd.b;
import java.util.Locale;
import bd.t;
import java.io.UnsupportedEncodingException;
import sa.m;
import ai2.h;

public final class g extends h
{
    public static final m c;
    public final g.g$a b;
    
    static {
        c = new m(9);
    }
    
    public g(final g.g$a b) {
        this.b = b;
    }
    
    public static String A0(final String s, final byte[] array, final int n, final int n2) throws UnsupportedEncodingException {
        if (n2 > n && n2 <= array.length) {
            return new String(array, n, n2 - n, s);
        }
        return "";
    }
    
    public static l B0(int n, final t t, final String s) throws UnsupportedEncodingException {
        if (n < 1) {
            return null;
        }
        final int r = t.r();
        final String g0 = G0(r);
        final byte[] array = new byte[--n];
        t.b(0, n, array);
        return new l(s, null, new String(array, 0, I0(0, r, array), g0));
    }
    
    public static l C0(int i0, final t t) throws UnsupportedEncodingException {
        if (i0 < 1) {
            return null;
        }
        final int r = t.r();
        final String g0 = G0(r);
        final byte[] array = new byte[--i0];
        t.b(0, i0, array);
        i0 = I0(0, r, array);
        final String s = new String(array, 0, i0, g0);
        i0 += F0(r);
        return new l("TXXX", s, A0(g0, array, i0, I0(i0, r, array)));
    }
    
    public static vb.m D0(final int n, final t t, final String s) throws UnsupportedEncodingException {
        final byte[] array = new byte[n];
        t.b(0, n, array);
        return new vb.m(s, null, new String(array, 0, J0(0, array), "ISO-8859-1"));
    }
    
    public static vb.m E0(int i0, final t t) throws UnsupportedEncodingException {
        if (i0 < 1) {
            return null;
        }
        final int r = t.r();
        final String g0 = G0(r);
        final byte[] array = new byte[--i0];
        t.b(0, i0, array);
        i0 = I0(0, r, array);
        final String s = new String(array, 0, i0, g0);
        i0 += F0(r);
        return new vb.m("WXXX", s, A0("ISO-8859-1", array, i0, J0(i0, array)));
    }
    
    public static int F0(int n) {
        if (n != 0 && n != 3) {
            n = 2;
        }
        else {
            n = 1;
        }
        return n;
    }
    
    public static String G0(final int n) {
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
    
    public static String H0(final int n, final int n2, final int n3, final int n4, final int n5) {
        String s;
        if (n == 2) {
            s = String.format(Locale.US, "%c%c%c", n2, n3, n4);
        }
        else {
            s = String.format(Locale.US, "%c%c%c%c", n2, n3, n4, n5);
        }
        return s;
    }
    
    public static int I0(final int n, final int n2, final byte[] array) {
        final int j0 = J0(n, array);
        if (n2 != 0) {
            int i = j0;
            if (n2 != 3) {
                while (i < array.length - 1) {
                    if ((i - n) % 2 == 0 && array[i + 1] == 0) {
                        return i;
                    }
                    i = J0(i + 1, array);
                }
                return array.length;
            }
        }
        return j0;
    }
    
    public static int J0(int i, final byte[] array) {
        while (i < array.length) {
            if (array[i] == 0) {
                return i;
            }
            ++i;
        }
        return array.length;
    }
    
    public static int K0(int n, final t t) {
        final byte[] a = t.a;
        int b;
        final int n2 = b = t.b;
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
    
    public static boolean L0(final t t, final int n, final int n2, final boolean b) {
        final int b2 = t.b;
        try {
            while (true) {
                final int c = t.c;
                final int b3 = t.b;
                final boolean b4 = true;
                if (c - b3 < n2) {
                    return true;
                }
                int n3;
                long s;
                int w;
                if (n >= 3) {
                    n3 = t.c();
                    s = t.s();
                    w = t.w();
                }
                else {
                    n3 = t.t();
                    s = t.t();
                    w = 0;
                }
                if (n3 == 0 && s == 0L && w == 0) {
                    return true;
                }
                long n4 = s;
                if (n == 4) {
                    n4 = s;
                    if (!b) {
                        if ((0x808080L & s) != 0x0L) {
                            return false;
                        }
                        n4 = ((s >> 24 & 0xFFL) << 21 | ((s & 0xFFL) | (s >> 8 & 0xFFL) << 7 | (s >> 16 & 0xFFL) << 14));
                    }
                }
                int n5 = 0;
                int n7 = 0;
                Label_0286: {
                    int n6;
                    if (n == 4) {
                        if ((w & 0x40) != 0x0) {
                            n5 = 1;
                        }
                        else {
                            n5 = 0;
                        }
                        n6 = n5;
                        if ((w & 0x1) != 0x0) {
                            n7 = (b4 ? 1 : 0);
                            break Label_0286;
                        }
                    }
                    else {
                        if (n != 3) {
                            n5 = 0;
                            n7 = 0;
                            break Label_0286;
                        }
                        if ((w & 0x20) != 0x0) {
                            n5 = 1;
                        }
                        else {
                            n5 = 0;
                        }
                        n6 = n5;
                        if ((w & 0x80) != 0x0) {
                            n7 = (b4 ? 1 : 0);
                            break Label_0286;
                        }
                    }
                    final int n8 = 0;
                    n5 = n6;
                    n7 = n8;
                }
                int n9 = n5;
                if (n7 != 0) {
                    n9 = n5 + 4;
                }
                if (n4 < n9) {
                    return false;
                }
                if (t.c - t.b < n4) {
                    return false;
                }
                t.C((int)n4);
            }
        }
        finally {
            t.B(b2);
        }
    }
    
    public static a s0(final t t, int j0, int n) throws UnsupportedEncodingException {
        final int r = t.r();
        final String g0 = G0(r);
        final int n2 = j0 - 1;
        final byte[] array = new byte[n2];
        t.b(0, n2, array);
        String s;
        if (n == 2) {
            final String value = String.valueOf(b.p1(new String(array, 0, 3, "ISO-8859-1")));
            String concat;
            if (value.length() != 0) {
                concat = "image/".concat(value);
            }
            else {
                concat = new String("image/");
            }
            s = concat;
            if ("image/jpg".equals(concat)) {
                s = "image/jpeg";
            }
            j0 = 2;
        }
        else {
            j0 = J0(0, array);
            s = b.p1(new String(array, 0, j0, "ISO-8859-1"));
            if (s.indexOf(47) == -1) {
                if (s.length() != 0) {
                    s = "image/".concat(s);
                }
                else {
                    s = new String("image/");
                }
            }
        }
        n = array[j0 + 1];
        j0 += 2;
        final int i0 = I0(j0, r, array);
        final String s2 = new String(array, j0, i0 - j0, g0);
        j0 = F0(r) + i0;
        byte[] array2;
        if (n2 <= j0) {
            array2 = c0.f;
        }
        else {
            array2 = Arrays.copyOfRange(array, j0, n2);
        }
        return new a(s, s2, n & 0xFF, array2);
    }
    
    public static c t0(final t t, final int n, final int n2, final boolean b, final int n3, final g.g$a g$a) throws UnsupportedEncodingException {
        final int b2 = t.b;
        final int j0 = J0(b2, t.a);
        final String s = new String(t.a, b2, j0 - b2, "ISO-8859-1");
        t.B(j0 + 1);
        final int c = t.c();
        final int c2 = t.c();
        long s2 = t.s();
        if (s2 == 4294967295L) {
            s2 = -1L;
        }
        long s3 = t.s();
        if (s3 == 4294967295L) {
            s3 = -1L;
        }
        final ArrayList<vb.h> list = new ArrayList<vb.h>();
        while (t.b < b2 + n) {
            final vb.h w0 = w0(n2, t, b, n3, g$a);
            if (w0 != null) {
                list.add(w0);
            }
        }
        return new c(s, c, c2, s2, s3, list.toArray(new vb.h[0]));
    }
    
    public static d u0(final t t, final int n, final int n2, final boolean b, final int n3, final g.g$a g$a) throws UnsupportedEncodingException {
        final int b2 = t.b;
        final int j0 = J0(b2, t.a);
        final String s = new String(t.a, b2, j0 - b2, "ISO-8859-1");
        t.B(j0 + 1);
        final int r = t.r();
        final boolean b3 = (r & 0x2) != 0x0;
        final boolean b4 = (r & 0x1) != 0x0;
        final int r2 = t.r();
        final String[] array = new String[r2];
        for (int i = 0; i < r2; ++i) {
            final int b5 = t.b;
            final int j2 = J0(b5, t.a);
            array[i] = new String(t.a, b5, j2 - b5, "ISO-8859-1");
            t.B(j2 + 1);
        }
        final ArrayList<vb.h> list = new ArrayList<vb.h>();
        while (t.b < b2 + n) {
            final vb.h w0 = w0(n2, t, b, n3, g$a);
            if (w0 != null) {
                list.add(w0);
            }
        }
        return new d(s, b3, b4, array, list.toArray(new vb.h[0]));
    }
    
    public static e v0(int i0, final t t) throws UnsupportedEncodingException {
        if (i0 < 4) {
            return null;
        }
        final int r = t.r();
        final String g0 = G0(r);
        final byte[] array = new byte[3];
        t.b(0, 3, array);
        final String s = new String(array, 0, 3);
        i0 -= 4;
        final byte[] array2 = new byte[i0];
        t.b(0, i0, array2);
        i0 = I0(0, r, array2);
        final String s2 = new String(array2, 0, i0, g0);
        i0 += F0(r);
        return new e(s, s2, A0(g0, array2, i0, I0(i0, r, array2)));
    }
    
    public static vb.h w0(int length, final t t, final boolean b, final int n, final g.g$a g$a) {
        final int r = t.r();
        final int r2 = t.r();
        final int r3 = t.r();
        int r4;
        if (length >= 3) {
            r4 = t.r();
        }
        else {
            r4 = 0;
        }
        int n3;
        if (length == 4) {
            final int n2 = n3 = t.u();
            if (!b) {
                n3 = ((n2 >> 24 & 0xFF) << 21 | ((n2 & 0xFF) | (n2 >> 8 & 0xFF) << 7 | (n2 >> 16 & 0xFF) << 14));
            }
        }
        else if (length == 3) {
            n3 = t.u();
        }
        else {
            n3 = t.t();
        }
        final int n4 = n3;
        int w;
        if (length >= 3) {
            w = t.w();
        }
        else {
            w = 0;
        }
        if (r == 0 && r2 == 0 && r3 == 0 && r4 == 0 && n4 == 0 && w == 0) {
            t.B(t.c);
            return null;
        }
        final int n5 = t.b + n4;
        if (n5 > t.c) {
            Log.w("Id3Decoder", "Frame size exceeds remaining tag data");
            t.B(t.c);
            return null;
        }
        if (g$a != null && !g$a.a(length, r, r2, r3, r4)) {
            t.B(n5);
            return null;
        }
        int n6 = 0;
        int n8 = 0;
        int n9 = 0;
        int n10 = 0;
        int n11 = 0;
        Label_0492: {
            if (length == 3) {
                final boolean b2 = (w & 0x80) != 0x0;
                final boolean b3 = (w & 0x40) != 0x0;
                n6 = (((w & 0x20) != 0x0) ? 1 : 0);
                final int n7 = 0;
                final boolean b4 = b2;
                n8 = (b2 ? 1 : 0);
                n9 = (b4 ? 1 : 0);
                n10 = (b3 ? 1 : 0);
                n11 = n7;
            }
            else {
                int n12;
                int n13;
                int n14;
                if (length == 4) {
                    final boolean b5 = (w & 0x40) != 0x0;
                    final boolean b6 = (w & 0x8) != 0x0;
                    if ((w & 0x4) != 0x0) {
                        n10 = 1;
                    }
                    else {
                        n10 = 0;
                    }
                    final boolean b7 = (w & 0x2) != 0x0;
                    n8 = (b6 ? 1 : 0);
                    n12 = n10;
                    n13 = (b5 ? 1 : 0);
                    n14 = (b7 ? 1 : 0);
                    if ((w & 0x1) != 0x0) {
                        final boolean b8 = b7;
                        final int n15 = 1;
                        n8 = (b6 ? 1 : 0);
                        n9 = n15;
                        n6 = (b5 ? 1 : 0);
                        n11 = (b8 ? 1 : 0);
                        break Label_0492;
                    }
                }
                else {
                    n8 = 0;
                    n12 = 0;
                    n13 = 0;
                    n14 = 0;
                }
                n11 = n14;
                n6 = n13;
                n10 = n12;
                n9 = 0;
            }
        }
        Label_1213: {
            if (n8 != 0 || n10 != 0) {
                break Label_1213;
            }
            int n16 = n4;
            if (n6 != 0) {
                n16 = n4 - 1;
                t.C(1);
            }
            int n17 = n16;
            if (n9 != 0) {
                n17 = n16 - 4;
                t.C(4);
            }
            int k0 = n17;
            if (n11 != 0) {
                k0 = K0(n17, t);
            }
            while (true) {
                vb.h h = null;
                Label_1085: {
                    Label_0606: {
                        if (r != 84 || r2 != 88 || r3 != 88) {
                            break Label_0606;
                        }
                        if (length != 2) {
                            if (r4 != 88) {
                                break Label_0606;
                            }
                        }
                        try {
                            try {
                                C0(k0, t);
                                break Label_1085;
                                iftrue(Label_0646:)(r != 84);
                                B0(k0, t, H0(length, r, r2, r3, r4));
                            }
                            finally {}
                        }
                        catch (final UnsupportedEncodingException ex) {
                            break Label_1186;
                        }
                    }
                    Label_0646: {
                        if (r == 87 && r2 == 88 && r3 == 88 && (length == 2 || r4 == 88)) {
                            h = E0(k0, t);
                        }
                        else if (r == 87) {
                            h = D0(k0, t, H0(length, r, r2, r3, r4));
                        }
                        else if (r == 80 && r2 == 82 && r3 == 73 && r4 == 86) {
                            h = z0(k0, t);
                        }
                        else if (r == 71 && r2 == 69 && r3 == 79 && (r4 == 66 || length == 2)) {
                            h = x0(k0, t);
                        }
                        else {
                            Label_0872: {
                                if (length == 2) {
                                    if (r != 80 || r2 != 73 || r3 != 67) {
                                        break Label_0872;
                                    }
                                }
                                else if (r != 65 || r2 != 80 || r3 != 73 || r4 != 67) {
                                    break Label_0872;
                                }
                                h = s0(t, k0, length);
                                break Label_1085;
                            }
                            if (r == 67 && r2 == 79 && r3 == 77 && (r4 == 77 || length == 2)) {
                                h = v0(k0, t);
                            }
                            else if (r == 67 && r2 == 72 && r3 == 65 && r4 == 80) {
                                h = t0(t, k0, length, b, n, (g.g$a)h);
                            }
                            else if (r == 67 && r2 == 84 && r3 == 79 && r4 == 67) {
                                h = u0(t, k0, length, b, n, (g.g$a)h);
                            }
                            else if (r == 77 && r2 == 76 && r3 == 76 && r4 == 84) {
                                h = y0(k0, t);
                            }
                            else {
                                final String h2 = H0(length, r, r2, r3, r4);
                                final byte[] array = new byte[k0];
                                t.b(0, k0, array);
                                h = new vb.b(h2, array);
                            }
                        }
                    }
                }
                Label_1177: {
                    if (h != null) {
                        break Label_1177;
                    }
                    final String h3 = H0(length, r, r2, r3, r4);
                    length = String.valueOf(h3).length();
                    final StringBuilder sb = new StringBuilder(length + 50);
                    sb.append("Failed to decode frame: id=");
                    sb.append(h3);
                    sb.append(", frameSize=");
                    sb.append(k0);
                    final String string = sb.toString();
                    try {
                        Log.w("Id3Decoder", string);
                        t.B(n5);
                        return h;
                        t.B(n5);
                        Log.w("Id3Decoder", "Unsupported character encoding");
                        t.B(n5);
                        return null;
                        Log.w("Id3Decoder", "Skipping unsupported compressed or encrypted frame");
                        t.B(n5);
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
    
    public static f x0(int n, final t t) throws UnsupportedEncodingException {
        final int r = t.r();
        final String g0 = G0(r);
        final byte[] array = new byte[--n];
        t.b(0, n, array);
        final int j0 = J0(0, array);
        final String s = new String(array, 0, j0, "ISO-8859-1");
        final int n2 = j0 + 1;
        final int i0 = I0(n2, r, array);
        final String a0 = A0(g0, array, n2, i0);
        final int n3 = F0(r) + i0;
        final int i2 = I0(n3, r, array);
        final String a2 = A0(g0, array, n3, i2);
        final int n4 = F0(r) + i2;
        byte[] array2;
        if (n <= n4) {
            array2 = c0.f;
        }
        else {
            array2 = Arrays.copyOfRange(array, n4, n);
        }
        return new f(s, a0, a2, array2);
    }
    
    public static j y0(int i, final t t) {
        final int w = t.w();
        final int t2 = t.t();
        final int t3 = t.t();
        final int r = t.r();
        final int r2 = t.r();
        final s s = new s();
        s.j(t.c, t.a);
        s.k(t.b * 8);
        final int n = (i - 10) * 8 / (r + r2);
        final int[] array = new int[n];
        final int[] array2 = new int[n];
        int g;
        int g2;
        for (i = 0; i < n; ++i) {
            g = s.g(r);
            g2 = s.g(r2);
            array[i] = g;
            array2[i] = g2;
        }
        return new j(w, t2, t3, array, array2);
    }
    
    public static k z0(final int n, final t t) throws UnsupportedEncodingException {
        final byte[] array = new byte[n];
        t.b(0, n, array);
        int j0 = J0(0, array);
        final String s = new String(array, 0, j0, "ISO-8859-1");
        ++j0;
        byte[] array2;
        if (n <= j0) {
            array2 = c0.f;
        }
        else {
            array2 = Arrays.copyOfRange(array, j0, n);
        }
        return new k(s, array2);
    }
    
    public final qb.a r0(int n, final byte[] array) {
        final ArrayList list = new ArrayList();
        final t t = new t(array, n);
        final int c = t.c;
        n = t.b;
        final int n2 = 10;
        final boolean b = true;
        g.g$b g$b = null;
        Label_0383: {
            Label_0381: {
                if (c - n < 10) {
                    Log.w("Id3Decoder", "Data too short to be an ID3 tag");
                }
                else {
                    n = t.t();
                    if (n == 4801587) {
                        final int r = t.r();
                        t.C(1);
                        final int r2 = t.r();
                        final int q = t.q();
                        if (r == 2) {
                            final boolean b2 = (r2 & 0x40) != 0x0;
                            n = q;
                            if (b2) {
                                Log.w("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                                break Label_0381;
                            }
                        }
                        else if (r == 3) {
                            final boolean b3 = (r2 & 0x40) != 0x0;
                            n = q;
                            if (b3) {
                                n = t.c();
                                t.C(n);
                                n = q - (n + 4);
                            }
                        }
                        else {
                            if (r != 4) {
                                ph0.a.h(57, "Skipped ID3 tag with unsupported majorVersion=", r, "Id3Decoder");
                                break Label_0381;
                            }
                            if ((r2 & 0x40) != 0x0) {
                                n = 1;
                            }
                            else {
                                n = 0;
                            }
                            int n3 = q;
                            if (n != 0) {
                                n = t.q();
                                t.C(n - 4);
                                n3 = q - n;
                            }
                            final boolean b4 = (r2 & 0x10) != 0x0;
                            n = n3;
                            if (b4) {
                                n = n3 - 10;
                            }
                        }
                        g$b = new g.g$b(r, r < 4 && (r2 & 0x80) != 0x0, n);
                        break Label_0383;
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
            g$b = null;
        }
        if (g$b == null) {
            return null;
        }
        final int b5 = t.b;
        n = n2;
        if (g$b.a == 2) {
            n = 6;
        }
        int n4 = g$b.c;
        if (g$b.b) {
            n4 = K0(n4, t);
        }
        t.A(b5 + n4);
        boolean b6;
        if (!L0(t, g$b.a, n, false)) {
            if (g$b.a != 4 || !L0(t, 4, n, true)) {
                ph0.a.h(56, "Failed to validate ID3 tag with majorVersion=", g$b.a, "Id3Decoder");
                return null;
            }
            b6 = b;
        }
        else {
            b6 = false;
        }
        while (t.c - t.b >= n) {
            final vb.h w0 = w0(g$b.a, t, b6, n, this.b);
            if (w0 != null) {
                list.add(w0);
            }
        }
        return new qb.a((List)list);
    }
    
    @Override
    public final qb.a w(final qb.d d, final ByteBuffer byteBuffer) {
        return this.r0(byteBuffer.limit(), byteBuffer.array());
    }
}
