// 
// Decompiled by Procyon v0.6.0
// 

package lc2;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import java.util.logging.Logger;
import rc2.t;
import rc2.n;
import rc2.p;
import java.util.ArrayList;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import com.sendbird.android.shadow.okio.ByteString;
import java.util.Map;

public final class b
{
    public static final lc2.a[] a;
    public static final Map<ByteString, Integer> b;
    
    static {
        final lc2.a[] a2 = new lc2.a[61];
        final lc2.a a3 = new lc2.a(lc2.a.i, "");
        int n = 0;
        a2[0] = a3;
        final ByteString f = lc2.a.f;
        a2[1] = new lc2.a(f, "GET");
        a2[2] = new lc2.a(f, "POST");
        final ByteString g = lc2.a.g;
        a2[3] = new lc2.a(g, "/");
        a2[4] = new lc2.a(g, "/index.html");
        final ByteString h = lc2.a.h;
        a2[5] = new lc2.a(h, "http");
        a2[6] = new lc2.a(h, "https");
        final ByteString e = lc2.a.e;
        a2[7] = new lc2.a(e, "200");
        a2[8] = new lc2.a(e, "204");
        a2[9] = new lc2.a(e, "206");
        a2[10] = new lc2.a(e, "304");
        a2[11] = new lc2.a(e, "400");
        a2[12] = new lc2.a(e, "404");
        a2[13] = new lc2.a(e, "500");
        a2[14] = new lc2.a("accept-charset", "");
        a2[15] = new lc2.a("accept-encoding", "gzip, deflate");
        a2[16] = new lc2.a("accept-language", "");
        a2[17] = new lc2.a("accept-ranges", "");
        a2[18] = new lc2.a("accept", "");
        a2[19] = new lc2.a("access-control-allow-origin", "");
        a2[20] = new lc2.a("age", "");
        a2[21] = new lc2.a("allow", "");
        a2[22] = new lc2.a("authorization", "");
        a2[23] = new lc2.a("cache-control", "");
        a2[24] = new lc2.a("content-disposition", "");
        a2[25] = new lc2.a("content-encoding", "");
        a2[26] = new lc2.a("content-language", "");
        a2[27] = new lc2.a("content-length", "");
        a2[28] = new lc2.a("content-location", "");
        a2[29] = new lc2.a("content-range", "");
        a2[30] = new lc2.a("content-type", "");
        a2[31] = new lc2.a("cookie", "");
        a2[32] = new lc2.a("date", "");
        a2[33] = new lc2.a("etag", "");
        a2[34] = new lc2.a("expect", "");
        a2[35] = new lc2.a("expires", "");
        a2[36] = new lc2.a("from", "");
        a2[37] = new lc2.a("host", "");
        a2[38] = new lc2.a("if-match", "");
        a2[39] = new lc2.a("if-modified-since", "");
        a2[40] = new lc2.a("if-none-match", "");
        a2[41] = new lc2.a("if-range", "");
        a2[42] = new lc2.a("if-unmodified-since", "");
        a2[43] = new lc2.a("last-modified", "");
        a2[44] = new lc2.a("link", "");
        a2[45] = new lc2.a("location", "");
        a2[46] = new lc2.a("max-forwards", "");
        a2[47] = new lc2.a("proxy-authenticate", "");
        a2[48] = new lc2.a("proxy-authorization", "");
        a2[49] = new lc2.a("range", "");
        a2[50] = new lc2.a("referer", "");
        a2[51] = new lc2.a("refresh", "");
        a2[52] = new lc2.a("retry-after", "");
        a2[53] = new lc2.a("server", "");
        a2[54] = new lc2.a("set-cookie", "");
        a2[55] = new lc2.a("strict-transport-security", "");
        a2[56] = new lc2.a("transfer-encoding", "");
        a2[57] = new lc2.a("user-agent", "");
        a2[58] = new lc2.a("vary", "");
        a2[59] = new lc2.a("via", "");
        a2[60] = new lc2.a("www-authenticate", "");
        a = a2;
        final LinkedHashMap linkedHashMap = new LinkedHashMap(a2.length);
        while (true) {
            final lc2.a[] a4 = lc2.b.a;
            if (n >= a4.length) {
                break;
            }
            if (!linkedHashMap.containsKey(a4[n].a)) {
                linkedHashMap.put((Object)a4[n].a, (Object)n);
            }
            ++n;
        }
        b = Collections.unmodifiableMap((Map<? extends ByteString, ? extends Integer>)linkedHashMap);
    }
    
    public static void a(final ByteString byteString) throws IOException {
        for (int size = byteString.size(), i = 0; i < size; ++i) {
            final byte byte1 = byteString.getByte(i);
            if (byte1 >= 65 && byte1 <= 90) {
                final StringBuilder t = a.t("PROTOCOL_ERROR response malformed: mixed case name: ");
                t.append(byteString.utf8());
                throw new IOException(t.toString());
            }
        }
    }
    
    public static final class a
    {
        public final ArrayList a;
        public final p b;
        public final int c;
        public int d;
        public lc2.a[] e;
        public int f;
        public int g;
        public int h;
        
        public a(final m.a a) {
            this.a = new ArrayList();
            this.e = new lc2.a[8];
            this.f = 7;
            this.g = 0;
            this.h = 0;
            this.c = 4096;
            this.d = 4096;
            final Logger a2 = n.a;
            this.b = new p((t)a);
        }
        
        public final int a(int n) {
            int n2 = 0;
            final int n3 = 0;
            if (n > 0) {
                int n4 = this.e.length - 1;
                int n5 = n;
                n = n3;
                int f;
                while (true) {
                    f = this.f;
                    if (n4 < f || n5 <= 0) {
                        break;
                    }
                    final int c = this.e[n4].c;
                    n5 -= c;
                    this.h -= c;
                    --this.g;
                    ++n;
                    --n4;
                }
                final lc2.a[] e = this.e;
                System.arraycopy(e, f + 1, e, f + 1 + n, this.g);
                this.f += n;
                n2 = n;
            }
            return n2;
        }
        
        public final ByteString b(final int n) throws IOException {
            if (n >= 0 && n <= lc2.b.a.length - 1) {
                return lc2.b.a[n].a;
            }
            final int n2 = this.f + 1 + (n - lc2.b.a.length);
            if (n2 >= 0) {
                final lc2.a[] e = this.e;
                if (n2 < e.length) {
                    return e[n2].a;
                }
            }
            final StringBuilder t = a.t("Header index too large ");
            t.append(n + 1);
            throw new IOException(t.toString());
        }
        
        public final void c(final lc2.a a) {
            this.a.add(a);
            final int c = a.c;
            final int d = this.d;
            if (c > d) {
                Arrays.fill(this.e, null);
                this.f = this.e.length - 1;
                this.g = 0;
                this.h = 0;
                return;
            }
            this.a(this.h + c - d);
            final int g = this.g;
            final lc2.a[] e = this.e;
            if (g + 1 > e.length) {
                final lc2.a[] e2 = new lc2.a[e.length * 2];
                System.arraycopy(e, 0, e2, e.length, e.length);
                this.f = this.e.length - 1;
                this.e = e2;
            }
            this.e[this.f--] = a;
            ++this.g;
            this.h += c;
        }
        
        public final ByteString d() throws IOException {
            final int n = this.b.readByte() & 0xFF;
            int n2 = 0;
            final boolean b = (n & 0x80) == 0x80;
            final int e = this.e(n, 127);
            if (b) {
                final lc2.p d = lc2.p.d;
                final p b2 = this.b;
                final long n3 = e;
                b2.c1(n3);
                final byte[] o = b2.f.o(n3);
                d.getClass();
                final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                lc2.p.a a = d.a;
                int i = 0;
                int n4 = 0;
                int j;
                Object a2;
                while (true) {
                    j = i;
                    a2 = a;
                    if (n2 >= o.length) {
                        break;
                    }
                    n4 = (n4 << 8 | (o[n2] & 0xFF));
                    i += 8;
                    while (i >= 8) {
                        final int n5 = i - 8;
                        a = a.a[n4 >>> n5 & 0xFF];
                        if (a.a == null) {
                            byteArrayOutputStream.write(a.b);
                            i -= a.c;
                            a = d.a;
                        }
                        else {
                            i = n5;
                        }
                    }
                    ++n2;
                }
                while (j > 0) {
                    final lc2.p.a a3 = ((lc2.p.a)a2).a[n4 << 8 - j & 0xFF];
                    if (a3.a != null) {
                        break;
                    }
                    if (a3.c > j) {
                        break;
                    }
                    byteArrayOutputStream.write(a3.b);
                    j -= a3.c;
                    a2 = d.a;
                }
                return ByteString.of(byteArrayOutputStream.toByteArray());
            }
            return this.b.U0(e);
        }
        
        public final int e(int n, int n2) throws IOException {
            n &= n2;
            if (n < n2) {
                return n;
            }
            n = 0;
            int n3;
            while (true) {
                n3 = (this.b.readByte() & 0xFF);
                if ((n3 & 0x80) == 0x0) {
                    break;
                }
                n2 += (n3 & 0x7F) << n;
                n += 7;
            }
            return n2 + (n3 << n);
        }
    }
    
    public static final class b
    {
        public final com.sendbird.android.shadow.okio.a a;
        public int b;
        public boolean c;
        public int d;
        public lc2.a[] e;
        public int f;
        public int g;
        public int h;
        
        public b(final com.sendbird.android.shadow.okio.a a) {
            this.b = Integer.MAX_VALUE;
            this.e = new lc2.a[8];
            this.f = 7;
            this.g = 0;
            this.h = 0;
            this.d = 4096;
            this.a = a;
        }
        
        public final void a(int n) {
            if (n > 0) {
                int n2 = this.e.length - 1;
                final int n3 = 0;
                int n4 = n;
                n = n3;
                int f;
                while (true) {
                    f = this.f;
                    if (n2 < f || n4 <= 0) {
                        break;
                    }
                    final int c = this.e[n2].c;
                    n4 -= c;
                    this.h -= c;
                    --this.g;
                    ++n;
                    --n2;
                }
                final lc2.a[] e = this.e;
                final int n5 = f + 1;
                System.arraycopy(e, n5, e, n5 + n, this.g);
                final lc2.a[] e2 = this.e;
                final int n6 = this.f + 1;
                Arrays.fill(e2, n6, n6 + n, null);
                this.f += n;
            }
        }
        
        public final void b(final lc2.a a) {
            final int c = a.c;
            final int d = this.d;
            if (c > d) {
                Arrays.fill(this.e, null);
                this.f = this.e.length - 1;
                this.g = 0;
                this.h = 0;
                return;
            }
            this.a(this.h + c - d);
            final int g = this.g;
            final lc2.a[] e = this.e;
            if (g + 1 > e.length) {
                final lc2.a[] e2 = new lc2.a[e.length * 2];
                System.arraycopy(e, 0, e2, e.length, e.length);
                this.f = this.e.length - 1;
                this.e = e2;
            }
            this.e[this.f--] = a;
            ++this.g;
            this.h += c;
        }
        
        public final void c(ByteString q) throws IOException {
            lc2.p.d.getClass();
            final long n = 0L;
            int i = 0;
            long n2 = 0L;
            for (int j = 0; j < q.size(); ++j) {
                n2 += lc2.p.c[q.getByte(j) & 0xFF];
            }
            if ((int)(n2 + 7L >> 3) < q.size()) {
                final com.sendbird.android.shadow.okio.a a = new com.sendbird.android.shadow.okio.a();
                lc2.p.d.getClass();
                int k = 0;
                long n3 = n;
                while (i < q.size()) {
                    final int n4 = q.getByte(i) & 0xFF;
                    final int n5 = lc2.p.b[n4];
                    final byte b = lc2.p.c[n4];
                    n3 = (n3 << b | (long)n5);
                    k += b;
                    while (k >= 8) {
                        k -= 8;
                        a.A((int)(n3 >> k));
                    }
                    ++i;
                }
                if (k > 0) {
                    a.A((int)(n3 << 8 - k | (long)(255 >>> k)));
                }
                q = a.q();
                this.e(q.size(), 127, 128);
                this.a.x(q);
            }
            else {
                this.e(q.size(), 127, 0);
                this.a.x(q);
            }
        }
        
        public final void d(final ArrayList list) throws IOException {
            if (this.c) {
                final int b = this.b;
                if (b < this.d) {
                    this.e(b, 31, 32);
                }
                this.c = false;
                this.b = Integer.MAX_VALUE;
                this.e(this.d, 31, 32);
            }
            for (int size = list.size(), i = 0; i < size; ++i) {
                final lc2.a a = list.get(i);
                final ByteString asciiLowercase = a.a.toAsciiLowercase();
                final ByteString b2 = a.b;
                final Integer n = lc2.b.b.get(asciiLowercase);
                int n2 = 0;
                int n3 = 0;
                Label_0191: {
                    Label_0189: {
                        if (n != null) {
                            n2 = n + 1;
                            if (n2 > 1 && n2 < 8) {
                                final lc2.a[] a2 = lc2.b.a;
                                if (gc2.b.k(a2[n2 - 1].b, b2)) {
                                    break Label_0189;
                                }
                                if (gc2.b.k(a2[n2].b, b2)) {
                                    n3 = n2 + 1;
                                    break Label_0191;
                                }
                            }
                            n3 = -1;
                            break Label_0191;
                        }
                        n2 = -1;
                    }
                    n3 = n2;
                }
                int n4 = n2;
                int n5 = n3;
                if (n3 == -1) {
                    int n6 = this.f + 1;
                    final int length = this.e.length;
                    while (true) {
                        n4 = n2;
                        n5 = n3;
                        if (n6 >= length) {
                            break;
                        }
                        int n7 = n2;
                        if (gc2.b.k(this.e[n6].a, asciiLowercase)) {
                            if (gc2.b.k(this.e[n6].b, b2)) {
                                n5 = lc2.b.a.length + (n6 - this.f);
                                n4 = n2;
                                break;
                            }
                            if ((n7 = n2) == -1) {
                                n7 = n6 - this.f + lc2.b.a.length;
                            }
                        }
                        ++n6;
                        n2 = n7;
                    }
                }
                if (n5 != -1) {
                    this.e(n5, 127, 128);
                }
                else if (n4 == -1) {
                    this.a.A(64);
                    this.c(asciiLowercase);
                    this.c(b2);
                    this.b(a);
                }
                else if (asciiLowercase.startsWith(lc2.a.d) && !lc2.a.i.equals((Object)asciiLowercase)) {
                    this.e(n4, 15, 0);
                    this.c(b2);
                }
                else {
                    this.e(n4, 63, 64);
                    this.c(b2);
                    this.b(a);
                }
            }
        }
        
        public final void e(int i, final int n, final int n2) {
            if (i < n) {
                this.a.A(i | n2);
                return;
            }
            this.a.A(n2 | n);
            for (i -= n; i >= 128; i >>>= 7) {
                this.a.A(0x80 | (i & 0x7F));
            }
            this.a.A(i);
        }
    }
}
