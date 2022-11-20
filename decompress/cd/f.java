// 
// Decompiled by Procyon v0.6.0
// 

package cd;

import com.google.android.exoplayer2.ParserException;
import java.util.Collections;
import dg.l0;
import bd.q;
import bd.t;
import java.util.List;

public final class f
{
    public final List<byte[]> a;
    public final int b;
    public final float c;
    public final String d;
    
    public f(final List a, final int b, final float c, final String d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static f a(final t t) throws ParserException {
        try {
            t.C(21);
            final int r = t.r();
            final int r2 = t.r();
            final int b = t.b;
            int i = 0;
            int n = 0;
            while (i < r2) {
                t.C(1);
                for (int w = t.w(), j = 0; j < w; ++j) {
                    final int w2 = t.w();
                    n += w2 + 4;
                    t.C(w2);
                }
                ++i;
            }
            t.B(b);
            final byte[] array = new byte[n];
            float g = 1.0f;
            String b2 = null;
            int k = 0;
            int n2 = 0;
            while (k < r2) {
                final int r3 = t.r();
                for (int w3 = t.w(), l = 0; l < w3; ++l) {
                    final int w4 = t.w();
                    System.arraycopy(q.a, 0, array, n2, 4);
                    final int n3 = n2 + 4;
                    System.arraycopy(t.a, t.b, array, n3, w4);
                    if ((r3 & 0x7F) == 0x21 && l == 0) {
                        final q.a c = q.c(n3, n3 + w4, array);
                        g = c.g;
                        b2 = l0.B(c.a, c.c, c.d, c.f, c.b, c.e);
                    }
                    n2 = n3 + w4;
                    t.C(w4);
                }
                ++k;
            }
            Object o;
            if (n == 0) {
                o = Collections.emptyList();
            }
            else {
                o = Collections.singletonList(array);
            }
            return new f((List)o, (r & 0x3) + 1, g, b2);
        }
        catch (final ArrayIndexOutOfBoundsException ex) {
            throw ParserException.createForMalformedContainer("Error parsing HEVC config", (Throwable)ex);
        }
    }
}
