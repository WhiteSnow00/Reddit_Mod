// 
// Decompiled by Procyon v0.6.0
// 

package hb;

import java.io.IOException;
import ad.s;

public final class e
{
    public final s a;
    public int b;
    
    public e() {
        this.a = new s(8);
    }
    
    public final long a(final cb.e e) throws IOException {
        final byte[] a = this.a.a;
        int i = 0;
        e.g(a, 0, 1, false);
        final int n = this.a.a[0] & 0xFF;
        if (n == 0) {
            return Long.MIN_VALUE;
        }
        int n2;
        int n3;
        for (n2 = 128, n3 = 0; (n & n2) == 0x0; n2 >>= 1, ++n3) {}
        int n4 = n & ~n2;
        e.g(this.a.a, 1, n3, false);
        while (i < n3) {
            final byte[] a2 = this.a.a;
            ++i;
            n4 = (a2[i] & 0xFF) + (n4 << 8);
        }
        this.b += n3 + 1;
        return n4;
    }
}
