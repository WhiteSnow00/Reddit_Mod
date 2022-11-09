// 
// Decompiled by Procyon v0.6.0
// 

package ke;

import com.google.android.gms.internal.measurement.a;
import com.google.android.gms.internal.measurement.f;
import java.io.IOException;
import com.google.android.gms.internal.measurement.zzjd;
import com.google.android.gms.internal.measurement.zzko;
import ie.e;

public final class f5
{
    public static int a(final byte[] array, int f, final e e) throws zzko {
        final int j = j(array, f, e);
        f = e.f;
        if (f < 0) {
            throw zzko.zzd();
        }
        if (f > array.length - j) {
            throw zzko.zzf();
        }
        if (f == 0) {
            e.h = zzjd.zzb;
            return j;
        }
        e.h = zzjd.zzl(array, j, f);
        return j + f;
    }
    
    public static int b(final int n, final byte[] array) {
        return (array[n + 3] & 0xFF) << 24 | ((array[n] & 0xFF) | (array[n + 1] & 0xFF) << 8 | (array[n + 2] & 0xFF) << 16);
    }
    
    public static int c(final k7 k7, final byte[] array, int x, final int n, final int n2, final e e) throws IOException {
        final c7 c7 = (c7)k7;
        final Object t = c7.t();
        x = c7.x(t, array, x, n, n2, e);
        c7.a(t);
        e.h = t;
        return x;
    }
    
    public static int d(final k7 k7, final byte[] array, int f, final int n, final e e) throws IOException {
        final int n2 = f + 1;
        final int n3 = array[f];
        int i = n2;
        f = n3;
        if (n3 < 0) {
            i = k(n3, array, n2, e);
            f = e.f;
        }
        if (f >= 0 && f <= n - i) {
            final Object t = k7.t();
            f += i;
            k7.h(t, array, i, f, e);
            k7.a(t);
            e.h = t;
            return f;
        }
        throw zzko.zzf();
    }
    
    public static int e(final k7 k7, final int n, final byte[] array, int i, final int n2, final h6 h6, final e e) throws IOException {
        i = d(k7, array, i, n2, e);
        h6.add(e.h);
        while (i < n2) {
            final int j = j(array, i, e);
            if (n != e.f) {
                break;
            }
            i = d(k7, array, j, n2, e);
            h6.add(e.h);
        }
        return i;
    }
    
    public static int f(final byte[] array, int i, final h6 h6, final e e) throws IOException {
        final d6 d6 = (d6)h6;
        i = j(array, i, e);
        final int n = e.f + i;
        while (i < n) {
            i = j(array, i, e);
            d6.d(e.f);
        }
        if (i == n) {
            return i;
        }
        throw zzko.zzf();
    }
    
    public static int g(final byte[] array, int j, final e e) throws zzko {
        j = j(array, j, e);
        final int f = e.f;
        if (f < 0) {
            throw zzko.zzd();
        }
        if (f == 0) {
            e.h = "";
            return j;
        }
        e.h = new String(array, j, f, i6.a);
        return j + f;
    }
    
    public static int h(final byte[] array, int f, final e e) throws zzko {
        int j = j(array, f, e);
        f = e.f;
        if (f < 0) {
            throw zzko.zzd();
        }
        if (f == 0) {
            e.h = "";
            return j;
        }
        final g8 a = f.a;
        final int length = array.length;
        if ((j | f | length - j - f) >= 0) {
            final int n = j + f;
            final char[] array2 = new char[f];
            int n2 = 0;
            int i;
            while (true) {
                f = n2;
                i = j;
                if (j >= n) {
                    break;
                }
                final byte b = array[j];
                if (b >= 0) {
                    f = 1;
                }
                else {
                    f = 0;
                }
                if (f == 0) {
                    f = n2;
                    i = j;
                    break;
                }
                ++j;
                array2[n2] = (char)b;
                ++n2;
            }
        Label_0123:
            while (i < n) {
                int n3 = i + 1;
                final byte b2 = array[i];
                if (b2 >= 0) {
                    final int n4 = f + 1;
                    array2[f] = (char)b2;
                    f = n4;
                    int n5;
                    while (true) {
                        n5 = (f = f);
                        i = n3;
                        if (n3 >= n) {
                            continue Label_0123;
                        }
                        final byte b3 = array[n3];
                        if (b3 >= 0) {
                            f = 1;
                        }
                        else {
                            f = 0;
                        }
                        if (f == 0) {
                            break;
                        }
                        ++n3;
                        f = n5 + 1;
                        array2[n5] = (char)b3;
                    }
                    f = n5;
                    i = n3;
                }
                else if (b2 < -32) {
                    if (n3 >= n) {
                        throw zzko.zzc();
                    }
                    final byte b4 = array[n3];
                    if (b2 < -62 || com.google.android.gms.internal.measurement.a.c(b4)) {
                        throw zzko.zzc();
                    }
                    array2[f] = (char)((b2 & 0x1F) << 6 | (b4 & 0x3F));
                    i = n3 + 1;
                    ++f;
                }
                else if (b2 < -16) {
                    if (n3 < n - 1) {
                        final int n6 = n3 + 1;
                        final byte b5 = array[n3];
                        final byte b6 = array[n6];
                        if (!com.google.android.gms.internal.measurement.a.c(b5)) {
                            int n7;
                            if ((n7 = b2) == -32) {
                                if (b5 < -96) {
                                    throw zzko.zzc();
                                }
                                n7 = -32;
                            }
                            int n8;
                            if ((n8 = n7) == -19) {
                                if (b5 >= -96) {
                                    throw zzko.zzc();
                                }
                                n8 = -19;
                            }
                            if (!com.google.android.gms.internal.measurement.a.c(b6)) {
                                array2[f] = (char)((n8 & 0xF) << 12 | (b5 & 0x3F) << 6 | (b6 & 0x3F));
                                i = n6 + 1;
                                ++f;
                                continue;
                            }
                        }
                        throw zzko.zzc();
                    }
                    throw zzko.zzc();
                }
                else {
                    if (n3 >= n - 2) {
                        throw zzko.zzc();
                    }
                    final int n9 = n3 + 1;
                    i = n9 + 1;
                    final byte b7 = array[n3];
                    final byte b8 = array[n9];
                    final byte b9 = array[i];
                    if (com.google.android.gms.internal.measurement.a.c(b7) || b7 + 112 + (b2 << 28) >> 30 != 0 || com.google.android.gms.internal.measurement.a.c(b8) || com.google.android.gms.internal.measurement.a.c(b9)) {
                        throw zzko.zzc();
                    }
                    final int n10 = (b2 & 0x7) << 18 | (b7 & 0x3F) << 12 | (b8 & 0x3F) << 6 | (b9 & 0x3F);
                    array2[f] = (char)((n10 >>> 10) + 55232);
                    array2[f + 1] = (char)((n10 & 0x3FF) + 56320);
                    f += 2;
                    ++i;
                }
            }
            e.h = new String(array2, 0, f);
            return n;
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", length, j, f));
    }
    
    public static int i(final int n, final byte[] array, int n2, int j, final v7 v7, final e e) throws zzko {
        if (n >>> 3 == 0) {
            throw zzko.zzb();
        }
        final int n3 = n & 0x7;
        if (n3 == 0) {
            n2 = m(array, n2, e);
            v7.c(n, e.g);
            return n2;
        }
        if (n3 == 1) {
            v7.c(n, n(n2, array));
            return n2 + 8;
        }
        if (n3 != 2) {
            if (n3 != 3) {
                if (n3 == 5) {
                    v7.c(n, b(n2, array));
                    return n2 + 4;
                }
                throw zzko.zzb();
            }
            else {
                final int n4 = (n & 0xFFFFFFF8) | 0x4;
                final v7 b = v7.b();
                int f = 0;
                int n5;
                while (true) {
                    n5 = n2;
                    if (n2 >= j) {
                        break;
                    }
                    n2 = j(array, n2, e);
                    f = e.f;
                    if (f == n4) {
                        n5 = n2;
                        break;
                    }
                    n2 = i(f, array, n2, j, b, e);
                }
                if (n5 <= j && f == n4) {
                    v7.c(n, b);
                    return n5;
                }
                throw zzko.zze();
            }
        }
        else {
            j = j(array, n2, e);
            n2 = e.f;
            if (n2 < 0) {
                throw zzko.zzd();
            }
            if (n2 <= array.length - j) {
                if (n2 == 0) {
                    v7.c(n, zzjd.zzb);
                }
                else {
                    v7.c(n, zzjd.zzl(array, j, n2));
                }
                return j + n2;
            }
            throw zzko.zzf();
        }
    }
    
    public static int j(final byte[] array, int f, final e e) {
        final int n = f + 1;
        f = array[f];
        if (f >= 0) {
            e.f = f;
            return n;
        }
        return k(f, array, n, e);
    }
    
    public static int k(int n, final byte[] array, int n2, final e e) {
        final int n3 = n & 0x7F;
        n = n2 + 1;
        n2 = array[n2];
        if (n2 >= 0) {
            e.f = (n3 | n2 << 7);
            return n;
        }
        n2 = (n3 | (n2 & 0x7F) << 7);
        final int n4 = n + 1;
        n = array[n];
        if (n >= 0) {
            e.f = (n2 | n << 14);
            return n4;
        }
        n = (n2 | (n & 0x7F) << 14);
        n2 = n4 + 1;
        final byte b = array[n4];
        if (b >= 0) {
            e.f = (n | b << 21);
            return n2;
        }
        final int n5 = n | (b & 0x7F) << 21;
        n = n2 + 1;
        final byte b2 = array[n2];
        if (b2 >= 0) {
            e.f = (n5 | b2 << 28);
            return n;
        }
        while (true) {
            n2 = n + 1;
            if (array[n] >= 0) {
                break;
            }
            n = n2;
        }
        e.f = (n5 | (b2 & 0x7F) << 28);
        return n2;
    }
    
    public static int l(final int n, final byte[] array, int i, final int n2, final h6 h6, final e e) {
        final d6 d6 = (d6)h6;
        i = j(array, i, e);
        d6.d(e.f);
        while (i < n2) {
            final int j = j(array, i, e);
            if (n != e.f) {
                break;
            }
            i = j(array, j, e);
            d6.d(e.f);
        }
        return i;
    }
    
    public static int m(final byte[] array, int n, final e e) {
        final int n2 = n + 1;
        final long g = array[n];
        if (g >= 0L) {
            e.g = g;
            return n2;
        }
        n = n2 + 1;
        byte b = array[n2];
        long g2 = (g & 0x7FL) | (long)(b & 0x7F) << 7;
        for (int n3 = 7; b < 0; b = array[n], n3 += 7, g2 |= (long)(b & 0x7F) << n3, ++n) {}
        e.g = g2;
        return n;
    }
    
    public static long n(final int n, final byte[] array) {
        return ((long)array[n + 7] & 0xFFL) << 56 | (((long)array[n] & 0xFFL) | ((long)array[n + 1] & 0xFFL) << 8 | ((long)array[n + 2] & 0xFFL) << 16 | ((long)array[n + 3] & 0xFFL) << 24 | ((long)array[n + 4] & 0xFFL) << 32 | ((long)array[n + 5] & 0xFFL) << 40 | ((long)array[n + 6] & 0xFFL) << 48);
    }
}
