// 
// Decompiled by Procyon v0.6.0
// 

package al2;

import aq2.a;
import zk2.d;

public final class i extends b implements d
{
    public i(final int n) {
        if (n != 128 && n != 256) {
            throw new IllegalArgumentException(a.l("'bitLength' ", n, " not supported for SHAKE"));
        }
        super(n);
    }
    
    public final int d(final int n, final int n2, final byte[] array) {
        final boolean f = super.f;
        if (!f) {
            final int d = super.d;
            if (d % 8 != 0) {
                throw new IllegalStateException("attempt to absorb with odd length queue");
            }
            if (f) {
                throw new IllegalStateException("attempt to absorb while squeezing");
            }
            super.b[d >> 3] = 15;
            super.d = d + 4;
        }
        this.m(n2 * 8L, array, n);
        this.reset();
        return n2;
    }
    
    public final String e() {
        final StringBuilder t = a.t("SHAKE");
        t.append(super.e);
        return t.toString();
    }
    
    public final int g(final int n, final byte[] array) {
        final int n2 = super.e / 8;
        this.d(n, n2, array);
        return n2;
    }
}
