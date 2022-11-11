// 
// Decompiled by Procyon v0.6.0
// 

package qb;

import java.nio.charset.Charset;
import java.util.List;
import java.util.ArrayList;
import ad.r;
import pb.a;
import java.nio.ByteBuffer;
import pb.d;
import android.support.v4.media.c;

public final class b extends c
{
    public final a c0(final d d, final ByteBuffer byteBuffer) {
        final byte value = byteBuffer.get();
        a a = null;
        if (value == 116) {
            final r r = new r(byteBuffer.array(), byteBuffer.limit());
            r.m(12);
            final int g = r.g(12);
            final int d2 = r.d();
            r.m(44);
            r.n(r.g(12));
            r.m(16);
            final ArrayList list = new ArrayList();
            while (r.d() < d2 + g - 4) {
                r.m(48);
                final int g2 = r.g(8);
                r.m(4);
                final int n = r.d() + r.g(12);
                String s2;
                String s = s2 = null;
                while (r.d() < n) {
                    final int g3 = r.g(8);
                    final int g4 = r.g(8);
                    final int n2 = r.d() + g4;
                    String s3;
                    String s4;
                    if (g3 == 2) {
                        final int g5 = r.g(16);
                        r.m(8);
                        s3 = s;
                        s4 = s2;
                        if (g5 == 3) {
                            while (true) {
                                s3 = s;
                                s4 = s2;
                                if (r.d() >= n2) {
                                    break;
                                }
                                final int g6 = r.g(8);
                                final Charset a2 = rg.b.a;
                                final byte[] array = new byte[g6];
                                r.i(g6, array);
                                final String s5 = new String(array, a2);
                                final int g7 = r.g(8);
                                int n3 = 0;
                                while (true) {
                                    s = s5;
                                    if (n3 >= g7) {
                                        break;
                                    }
                                    r.n(r.g(8));
                                    ++n3;
                                }
                            }
                        }
                    }
                    else {
                        s3 = s;
                        s4 = s2;
                        if (g3 == 21) {
                            final Charset a3 = rg.b.a;
                            final byte[] array2 = new byte[g4];
                            r.i(g4, array2);
                            s4 = new String(array2, a3);
                            s3 = s;
                        }
                    }
                    r.k(n2 * 8);
                    s = s3;
                    s2 = s4;
                }
                r.k(n * 8);
                if (s != null && s2 != null) {
                    String concat;
                    if (s2.length() != 0) {
                        concat = s.concat(s2);
                    }
                    else {
                        concat = new String(s);
                    }
                    list.add(new qb.a(g2, concat));
                }
            }
            if (list.isEmpty()) {
                a = a;
            }
            else {
                a = new a((List)list);
            }
        }
        return a;
    }
}
