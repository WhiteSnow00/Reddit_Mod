// 
// Decompiled by Procyon v0.6.0
// 

package hb;

import java.io.IOException;
import cb.e;

public final class f
{
    public static final long[] d;
    public final byte[] a;
    public int b;
    public int c;
    
    static {
        d = new long[] { 128L, 64L, 32L, 16L, 8L, 4L, 2L, 1L };
    }
    
    public f() {
        this.a = new byte[8];
    }
    
    public static long a(final byte[] array, final int n, final boolean b) {
        long n3;
        final long n2 = n3 = ((long)array[0] & 0xFFL);
        if (b) {
            n3 = (n2 & ~f.d[n - 1]);
        }
        for (int i = 1; i < n; ++i) {
            n3 = (n3 << 8 | ((long)array[i] & 0xFFL));
        }
        return n3;
    }
    
    public final long b(final e e, final boolean b, final boolean b2, final int n) throws IOException {
        if (this.b == 0) {
            if (!e.e(this.a, 0, 1, b)) {
                return -1L;
            }
            final byte b3 = this.a[0];
            int c = 0;
            while (true) {
                final long[] d = f.d;
                if (c >= 8) {
                    c = -1;
                    break;
                }
                if (((long)(b3 & 0xFF) & d[c]) != 0x0L) {
                    ++c;
                    break;
                }
                ++c;
            }
            this.c = c;
            if (c == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.b = 1;
        }
        final int c2 = this.c;
        if (c2 > n) {
            this.b = 0;
            return -2L;
        }
        if (c2 != 1) {
            e.e(this.a, 1, c2 - 1, false);
        }
        this.b = 0;
        return a(this.a, this.c, b2);
    }
}
