// 
// Decompiled by Procyon v0.6.0
// 

package ib;

import java.io.IOException;
import bd.s;

public final class e
{
    public final s a;
    public int b;
    
    public e() {
        this.a = new s(8);
    }
    
    public final long a(final db.e e) throws IOException {
        final byte[] a = this.a.a;
        final int n = 0;
        e.h(a, 0, 1, false);
        final int n2 = this.a.a[0] & 0xFF;
        if (n2 == 0) {
            return Long.MIN_VALUE;
        }
        int n3;
        int n4;
        for (n3 = 128, n4 = 0; (n2 & n3) == 0x0; n3 >>= 1, ++n4) {}
        final int n5 = n2 & ~n3;
        e.h(this.a.a, 1, n4, false);
        int i;
        int n6;
        byte[] a2;
        for (i = n, n6 = n5; i < n4; ++i, n6 = (a2[i] & 0xFF) + (n6 << 8)) {
            a2 = this.a.a;
        }
        this.b += n4 + 1;
        return n6;
    }
}
