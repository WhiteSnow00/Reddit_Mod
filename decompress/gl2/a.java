// 
// Decompiled by Procyon v0.6.0
// 

package gl2;

import android.support.v4.media.c;
import rm2.h;

public final class a
{
    static {
        final byte[] b = h.b("expand 16-byte kexpand 32-byte k");
        final int[] array = new int[8];
        int i = 0;
        int n = 0;
        while (i < 8) {
            array[i] = c.v0(n, b);
            n += 4;
            ++i;
        }
        h.b("expand 32-byte k");
        h.b("expand 16-byte k");
    }
}
