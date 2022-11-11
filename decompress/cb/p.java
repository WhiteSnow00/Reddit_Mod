// 
// Decompiled by Procyon v0.6.0
// 

package cb;

import java.util.Collections;
import pb.a$b;
import java.util.Arrays;
import com.google.android.exoplayer2.n;
import ad.c0;
import ad.r;
import pb.a;

public final class p
{
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final long j;
    public final a k;
    public final pb.a l;
    
    public p(final int a, final int b, final int c, final int d, final int e, final int g, final int h, final long j, final a k, final pb.a l) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = d(e);
        this.g = g;
        this.h = h;
        this.i = a(h);
        this.j = j;
        this.k = k;
        this.l = l;
    }
    
    public p(final byte[] array, int n) {
        final r r = new r(array, array.length);
        r.k(n * 8);
        this.a = r.g(16);
        this.b = r.g(16);
        this.c = r.g(24);
        this.d = r.g(24);
        n = r.g(20);
        this.e = n;
        this.f = d(n);
        this.g = r.g(3) + 1;
        n = r.g(5) + 1;
        this.h = n;
        this.i = a(n);
        final int g = r.g(4);
        n = r.g(32);
        final int a = c0.a;
        this.j = (((long)g & 0xFFFFFFFFL) << 32 | ((long)n & 0xFFFFFFFFL));
        this.k = null;
        this.l = null;
    }
    
    public static int a(final int n) {
        if (n == 8) {
            return 1;
        }
        if (n == 12) {
            return 2;
        }
        if (n == 16) {
            return 4;
        }
        if (n == 20) {
            return 5;
        }
        if (n != 24) {
            return -1;
        }
        return 6;
    }
    
    public static int d(final int n) {
        switch (n) {
            default: {
                return -1;
            }
            case 192000: {
                return 3;
            }
            case 176400: {
                return 2;
            }
            case 96000: {
                return 11;
            }
            case 88200: {
                return 1;
            }
            case 48000: {
                return 10;
            }
            case 44100: {
                return 9;
            }
            case 32000: {
                return 8;
            }
            case 24000: {
                return 7;
            }
            case 22050: {
                return 6;
            }
            case 16000: {
                return 5;
            }
            case 8000: {
                return 4;
            }
        }
    }
    
    public final long b() {
        final long j = this.j;
        long n;
        if (j == 0L) {
            n = -9223372036854775807L;
        }
        else {
            n = j * 1000000L / this.e;
        }
        return n;
    }
    
    public final n c(final byte[] array, pb.a i) {
        array[4] = -128;
        int d = this.d;
        if (d <= 0) {
            d = -1;
        }
        final pb.a l = this.l;
        Label_0107: {
            if (l != null) {
                if (i != null) {
                    final a$b[] f = ((pb.a)i).f;
                    if (f.length != 0) {
                        final a$b[] f2 = l.f;
                        final int a = c0.a;
                        final a$b[] copy = Arrays.copyOf(f2, f2.length + f.length);
                        System.arraycopy(f, 0, copy, f2.length, f.length);
                        i = new pb.a((a$b[])copy);
                        break Label_0107;
                    }
                }
                i = l;
            }
        }
        final n.a a2 = new n.a();
        a2.k = "audio/flac";
        a2.l = d;
        a2.x = this.g;
        a2.y = this.e;
        a2.m = Collections.singletonList(array);
        a2.i = (pb.a)i;
        return new n(a2);
    }
    
    public static final class a
    {
        public final long[] a;
        public final long[] b;
        
        public a(final long[] a, final long[] b) {
            this.a = a;
            this.b = b;
        }
    }
}
