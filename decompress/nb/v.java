// 
// Decompiled by Procyon v0.6.0
// 

package nb;

import bd.c0;
import db.e;
import bd.t;
import bd.a0;

public final class v
{
    public final a0 a;
    public final t b;
    public boolean c;
    public boolean d;
    public boolean e;
    public long f;
    public long g;
    public long h;
    
    public v() {
        this.a = new a0(0L);
        this.f = -9223372036854775807L;
        this.g = -9223372036854775807L;
        this.h = -9223372036854775807L;
        this.b = new t();
    }
    
    public static int b(final int n, final byte[] array) {
        return (array[n + 3] & 0xFF) | ((array[n] & 0xFF) << 24 | (array[n + 1] & 0xFF) << 16 | (array[n + 2] & 0xFF) << 8);
    }
    
    public static long c(final t t) {
        final int b = t.b;
        if (t.c - b < 9) {
            return -9223372036854775807L;
        }
        final byte[] array = new byte[9];
        boolean b2 = false;
        t.b(0, 9, array);
        t.B(b);
        final byte b3 = array[0];
        if ((b3 & 0xC4) == 0x44) {
            if ((array[2] & 0x4) == 0x4) {
                if ((array[4] & 0x4) == 0x4) {
                    if ((array[5] & 0x1) == 0x1) {
                        if ((array[8] & 0x3) == 0x3) {
                            b2 = true;
                        }
                    }
                }
            }
        }
        if (!b2) {
            return -9223372036854775807L;
        }
        final long n = b3;
        final long n2 = array[1];
        final long n3 = array[2];
        return (n & 0x3L) << 28 | (0x38L & n) >> 3 << 30 | (n2 & 0xFFL) << 20 | (n3 & 0xF8L) >> 3 << 15 | (n3 & 0x3L) << 13 | ((long)array[3] & 0xFFL) << 5 | ((long)array[4] & 0xF8L) >> 3;
    }
    
    public final void a(final e e) {
        final t b = this.b;
        final byte[] f = c0.f;
        b.getClass();
        b.z(f.length, f);
        this.c = true;
        e.f = 0;
    }
}
