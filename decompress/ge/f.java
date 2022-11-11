// 
// Decompiled by Procyon v0.6.0
// 

package ge;

import com.google.android.gms.internal.firebase_auth_api.g;
import java.io.IOException;
import com.google.android.gms.internal.firebase_auth_api.zzaau;
import com.google.android.gms.internal.firebase_auth_api.zzacf;

public final class f
{
    public static int a(final byte[] array, int f, final e e) throws com.google.android.gms.internal.firebase-auth-api.zzacf {
        final int j = j(array, f, e);
        f = e.f;
        if (f < 0) {
            throw zzacf.zzf();
        }
        if (f > array.length - j) {
            throw zzacf.zzi();
        }
        if (f == 0) {
            e.h = zzaau.zzb;
            return j;
        }
        e.h = zzaau.zzo(array, j, f);
        return j + f;
    }
    
    public static int b(final int n, final byte[] array) {
        return (array[n + 3] & 0xFF) << 24 | ((array[n] & 0xFF) | (array[n + 1] & 0xFF) << 8 | (array[n + 2] & 0xFF) << 16);
    }
    
    public static int c(final i1 i1, final byte[] array, int c, final int n, final int n2, final e e) throws IOException {
        final a1 a1 = (a1)i1;
        final Object t = a1.t();
        c = a1.C(t, array, c, n, n2, e);
        a1.a(t);
        e.h = t;
        return c;
    }
    
    public static int d(final i1 i1, final byte[] array, int k, int n, final e e) throws IOException {
        final int n2 = k + 1;
        final byte b = array[k];
        k = n2;
        int f = b;
        if (b < 0) {
            k = k(b, array, n2, e);
            f = e.f;
        }
        if (f >= 0 && f <= n - k) {
            final Object t = i1.t();
            n = f + k;
            i1.h(t, array, k, n, e);
            i1.a(t);
            e.h = t;
            return n;
        }
        throw zzacf.zzi();
    }
    
    public static int e(final i1 i1, final int n, final byte[] array, int j, final int n2, final e0 e0, final e e2) throws IOException {
        j = d(i1, array, j, n2, e2);
        e0.add(e2.h);
        while (j < n2) {
            final int k = j(array, j, e2);
            if (n != e2.f) {
                break;
            }
            j = d(i1, array, k, n2, e2);
            e0.add(e2.h);
        }
        return j;
    }
    
    public static int f(final byte[] array, int i, final e0 e0, final e e2) throws IOException {
        final c0 c0 = (c0)e0;
        i = j(array, i, e2);
        final int n = e2.f + i;
        while (i < n) {
            i = j(array, i, e2);
            c0.d(e2.f);
        }
        if (i == n) {
            return i;
        }
        throw zzacf.zzi();
    }
    
    public static int g(final byte[] array, int f, final e e) throws com.google.android.gms.internal.firebase-auth-api.zzacf {
        final int j = j(array, f, e);
        f = e.f;
        if (f < 0) {
            throw zzacf.zzf();
        }
        if (f == 0) {
            e.h = "";
            return j;
        }
        e.h = new String(array, j, f, f0.a);
        return j + f;
    }
    
    public static int h(final byte[] array, int j, final e e) throws com.google.android.gms.internal.firebase-auth-api.zzacf {
        j = j(array, j, e);
        final int f = e.f;
        if (f < 0) {
            throw zzacf.zzf();
        }
        if (f == 0) {
            e.h = "";
            return j;
        }
        e.h = g.d(j, f, array);
        return j + f;
    }
    
    public static int i(final int n, final byte[] array, int n2, int f, final t1 t1, final e e) throws com.google.android.gms.internal.firebase-auth-api.zzacf {
        if (n >>> 3 == 0) {
            throw zzacf.zzc();
        }
        final int n3 = n & 0x7;
        if (n3 == 0) {
            n2 = m(array, n2, e);
            t1.c(n, (Object)e.g);
            return n2;
        }
        if (n3 == 1) {
            t1.c(n, (Object)n(n2, array));
            return n2 + 8;
        }
        if (n3 != 2) {
            if (n3 != 3) {
                if (n3 == 5) {
                    t1.c(n, (Object)b(n2, array));
                    return n2 + 4;
                }
                throw zzacf.zzc();
            }
            else {
                final int n4 = (n & 0xFFFFFFF8) | 0x4;
                final t1 b = t1.b();
                int f2 = 0;
                int n5;
                while (true) {
                    n5 = n2;
                    if (n2 >= f) {
                        break;
                    }
                    n2 = j(array, n2, e);
                    f2 = e.f;
                    if (f2 == n4) {
                        n5 = n2;
                        break;
                    }
                    n2 = i(f2, array, n2, f, b, e);
                }
                if (n5 <= f && f2 == n4) {
                    t1.c(n, (Object)b);
                    return n5;
                }
                throw zzacf.zzg();
            }
        }
        else {
            n2 = j(array, n2, e);
            f = e.f;
            if (f < 0) {
                throw zzacf.zzf();
            }
            if (f <= array.length - n2) {
                if (f == 0) {
                    t1.c(n, (Object)zzaau.zzb);
                }
                else {
                    t1.c(n, (Object)zzaau.zzo(array, n2, f));
                }
                return n2 + f;
            }
            throw zzacf.zzi();
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
        n &= 0x7F;
        final int n3 = n2 + 1;
        n2 = array[n2];
        if (n2 >= 0) {
            e.f = (n | n2 << 7);
            return n3;
        }
        n2 = (n | (n2 & 0x7F) << 7);
        n = n3 + 1;
        final byte b = array[n3];
        if (b >= 0) {
            e.f = (n2 | b << 14);
            return n;
        }
        final int n4 = n2 | (b & 0x7F) << 14;
        n2 = n + 1;
        n = array[n];
        if (n >= 0) {
            e.f = (n4 | n << 21);
            return n2;
        }
        final int n5 = n4 | (n & 0x7F) << 21;
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
    
    public static int l(final int n, final byte[] array, int i, final int n2, final e0 e0, final e e2) {
        final c0 c0 = (c0)e0;
        i = j(array, i, e2);
        c0.d(e2.f);
        while (i < n2) {
            final int j = j(array, i, e2);
            if (n != e2.f) {
                break;
            }
            i = j(array, j, e2);
            c0.d(e2.f);
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
