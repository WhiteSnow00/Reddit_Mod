// 
// Decompiled by Procyon v0.6.0
// 

package cd;

import com.google.android.exoplayer2.ParserException;
import bd.q;
import dg.l0;
import bd.t;
import java.util.ArrayList;
import java.util.List;

public final class a
{
    public final List<byte[]> a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;
    public final String f;
    
    public a(final ArrayList a, final int b, final int c, final int d, final float e, final String f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public static a a(final t t) throws ParserException {
        try {
            t.C(4);
            final int n = (t.r() & 0x3) + 1;
            if (n != 3) {
                final ArrayList<byte[]> list = new ArrayList<byte[]>();
                final int n2 = t.r() & 0x1F;
                for (int i = 0; i < n2; ++i) {
                    final int w = t.w();
                    final int b = t.b;
                    t.C(w);
                    final byte[] a = t.a;
                    final byte[] h = l0.h;
                    final byte[] array = new byte[w + 4];
                    System.arraycopy(h, 0, array, 0, 4);
                    System.arraycopy(a, b, array, 4, w);
                    list.add(array);
                }
                for (int r = t.r(), j = 0; j < r; ++j) {
                    final int w2 = t.w();
                    final int b2 = t.b;
                    t.C(w2);
                    final byte[] a2 = t.a;
                    final byte[] h2 = l0.h;
                    final byte[] array2 = new byte[w2 + 4];
                    System.arraycopy(h2, 0, array2, 0, 4);
                    System.arraycopy(a2, b2, array2, 4, w2);
                    list.add(array2);
                }
                int e;
                int f;
                float g;
                String a3;
                if (n2 > 0) {
                    final q.c d = q.d(n, list.get(0).length, list.get(0));
                    e = d.e;
                    f = d.f;
                    g = d.g;
                    a3 = l0.A(d.a, d.b, d.c);
                }
                else {
                    g = 1.0f;
                    a3 = null;
                    e = -1;
                    f = -1;
                }
                return new a(list, n, e, f, g, a3);
            }
            throw new IllegalStateException();
        }
        catch (final ArrayIndexOutOfBoundsException ex) {
            throw ParserException.createForMalformedContainer("Error parsing AVC config", (Throwable)ex);
        }
    }
}
