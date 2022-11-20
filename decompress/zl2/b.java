// 
// Decompiled by Procyon v0.6.0
// 

package zl2;

import fl2.a;

public final class b extends a
{
    public int f;
    public byte[] g;
    
    public b(final int f, final byte[] array) {
        final int length = array.length;
        int n;
        if (f != 5) {
            if (f != 6) {
                throw new IllegalArgumentException(d.h("unknown security category: ", f));
            }
            n = 38432;
        }
        else {
            n = 14880;
        }
        if (length == n) {
            this.f = f;
            this.g = nm2.a.a(array);
            return;
        }
        throw new IllegalArgumentException("invalid key size for security category");
    }
}
