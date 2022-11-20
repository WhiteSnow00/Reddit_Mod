// 
// Decompiled by Procyon v0.6.0
// 

package kk2;

import org.bouncycastle.asn1.ASN1Exception;
import java.util.concurrent.ConcurrentHashMap;
import java.io.EOFException;
import java.io.IOException;
import aq2.a;
import java.io.InputStream;
import java.io.FilterInputStream;

public final class i extends FilterInputStream
{
    public final int f;
    public final boolean g;
    public final byte[][] h;
    
    public i() {
        throw null;
    }
    
    public i(final InputStream inputStream, final int f, final boolean g) {
        super(inputStream);
        this.f = f;
        this.g = g;
        this.h = new byte[11][];
    }
    
    public static q b(int read, final n1 n1, final byte[][] array) throws IOException {
        final int n2 = 0;
        if (read == 10) {
            final byte[] d = d(n1, array);
            f f;
            if (d.length > 1) {
                f = new f(d);
            }
            else {
                if (d.length == 0) {
                    throw new IllegalArgumentException("ENUMERATED has zero length");
                }
                read = (d[0] & 0xFF);
                final f[] g = kk2.f.g;
                if (read >= 12) {
                    f = new f(d);
                }
                else if ((f = g[read]) == null) {
                    f = new f(d);
                    g[read] = f;
                }
            }
            return (q)f;
        }
        if (read == 12) {
            return (q)new b1(n1.h());
        }
        if (read != 30) {
            switch (read) {
                default: {
                    switch (read) {
                        default: {
                            throw new IOException(a.l("unknown tag ", read, " encountered"));
                        }
                        case 28: {
                            return (q)new c1(n1.h());
                        }
                        case 27: {
                            return (q)new o0(n1.h());
                        }
                        case 26: {
                            return (q)new e1(n1.h());
                        }
                        case 25: {
                            return (q)new q0(n1.h());
                        }
                        case 24: {
                            return (q)new h(n1.h());
                        }
                        case 23: {
                            return (q)new x(n1.h());
                        }
                        case 22: {
                            return (q)new r0(n1.h());
                        }
                        case 21: {
                            return (q)new d1(n1.h());
                        }
                        case 20: {
                            return (q)new z0(n1.h());
                        }
                        case 19: {
                            return (q)new w0(n1.h());
                        }
                        case 18: {
                            return (q)new t0(n1.h());
                        }
                    }
                    break;
                }
                case 6: {
                    final byte[] d2 = d(n1, array);
                    final ConcurrentHashMap h = m.h;
                    m m;
                    if ((m = kk2.m.h.get(new m$a(d2))) == null) {
                        m = new m(d2);
                    }
                    return (q)m;
                }
                case 5: {
                    return (q)s0.f;
                }
                case 4: {
                    return (q)new u0(n1.h());
                }
                case 3: {
                    int i = n1.i;
                    if (i >= 1) {
                        read = n1.read();
                        final byte[] array2 = new byte[--i];
                        if (i != 0) {
                            if (pm2.a.b((InputStream)n1, array2, i) != i) {
                                throw new EOFException("EOF encountered in middle of BIT STRING");
                            }
                            if (read > 0 && read < 8) {
                                final byte b = array2[i - 1];
                                if (b != (byte)(255 << read & b)) {
                                    final Object o = new g1(array2, read);
                                    return (q)o;
                                }
                            }
                        }
                        final Object o = new l0(array2, read);
                        return (q)o;
                    }
                    throw new IllegalArgumentException("truncated BIT STRING detected");
                }
                case 2: {
                    return (q)new j(n1.h(), false);
                }
                case 1: {
                    final byte[] d3 = d(n1, array);
                    final c g2 = c.g;
                    if (d3.length == 1) {
                        final byte b2 = d3[0];
                        c c;
                        if (b2 != -1) {
                            if (b2 != 0) {
                                c = new c(b2);
                            }
                            else {
                                c = kk2.c.g;
                            }
                        }
                        else {
                            c = kk2.c.h;
                        }
                        return (q)c;
                    }
                    throw new IllegalArgumentException("BOOLEAN value should have 1 byte in it");
                }
            }
        }
        else {
            int j = n1.i;
            if ((j & 0x1) != 0x0) {
                throw new IOException("malformed BMPString encoding encountered");
            }
            final int n3 = j / 2;
            final char[] array3 = new char[n3];
            final byte[] array4 = new byte[8];
            read = 0;
            while (j >= 8) {
                if (pm2.a.b((InputStream)n1, array4, 8) != 8) {
                    throw new EOFException("EOF encountered in middle of BMPString");
                }
                array3[read] = (char)(array4[0] << 8 | (array4[1] & 0xFF));
                array3[read + 1] = (char)(array4[2] << 8 | (array4[3] & 0xFF));
                array3[read + 2] = (char)(array4[4] << 8 | (array4[5] & 0xFF));
                array3[read + 3] = (char)(array4[6] << 8 | (array4[7] & 0xFF));
                read += 4;
                j -= 8;
            }
            int n4 = read;
            if (j > 0) {
                if (pm2.a.b((InputStream)n1, array4, j) != j) {
                    throw new EOFException("EOF encountered in middle of BMPString");
                }
                int n5 = n2;
                while (true) {
                    final int n6 = n5 + 1;
                    final byte b3 = array4[n5];
                    final int n7 = n6 + 1;
                    final byte b4 = array4[n6];
                    n4 = read + 1;
                    array3[read] = (char)((b4 & 0xFF) | b3 << 8);
                    if (n7 >= j) {
                        break;
                    }
                    read = n4;
                    n5 = n7;
                }
            }
            if (n1.i == 0 && n3 == n4) {
                return (q)new k0(array3);
            }
            throw new IllegalStateException();
        }
    }
    
    public static byte[] d(final n1 n1, final byte[][] array) throws IOException {
        final int i = n1.i;
        if (i >= array.length) {
            return n1.h();
        }
        byte[] array2;
        if ((array2 = array[i]) == null) {
            array2 = new byte[i];
            array[i] = array2;
        }
        if (i == array2.length) {
            if (i != 0) {
                final int g = ((s1)n1).g;
                if (i >= g) {
                    final StringBuilder t = a.t("corrupted stream - out of bounds length found: ");
                    t.append(n1.i);
                    t.append(" >= ");
                    t.append(g);
                    throw new IOException(t.toString());
                }
                if ((n1.i = i - pm2.a.b(((s1)n1).f, array2, array2.length)) != 0) {
                    final StringBuilder t2 = a.t("DEF length ");
                    t2.append(n1.h);
                    t2.append(" object truncated by ");
                    t2.append(n1.i);
                    throw new EOFException(t2.toString());
                }
                ((s1)n1).b();
            }
            return array2;
        }
        throw new IllegalArgumentException("buffer length not right for data");
    }
    
    public static int h(final InputStream inputStream, final int n, final boolean b) throws IOException {
        final int read = inputStream.read();
        if (read < 0) {
            throw new EOFException("EOF found when length expected");
        }
        if (read == 128) {
            return -1;
        }
        int n2;
        if ((n2 = read) > 127) {
            final int n3 = read & 0x7F;
            if (n3 > 4) {
                throw new IOException(d.h("DER length more than 4 bytes: ", n3));
            }
            n2 = 0;
            for (int i = 0; i < n3; ++i) {
                final int read2 = inputStream.read();
                if (read2 < 0) {
                    throw new EOFException("EOF found reading length");
                }
                n2 = (n2 << 8) + read2;
            }
            if (n2 < 0) {
                throw new IOException("corrupted stream - negative length found");
            }
            if (n2 >= n && !b) {
                throw new IOException(b.i("corrupted stream - out of bounds length found: ", n2, " >= ", n));
            }
        }
        return n2;
    }
    
    public static int r(final InputStream inputStream, int n) throws IOException {
        if ((n &= 0x1F) == 0x1F) {
            int n2 = 0;
            n = inputStream.read();
            if ((n & 0x7F) == 0x0) {
                throw new IOException("corrupted stream - invalid high tag number found");
            }
            while (n >= 0 && (n & 0x80) != 0x0) {
                n2 = (n2 | (n & 0x7F)) << 7;
                n = inputStream.read();
            }
            if (n < 0) {
                throw new EOFException("EOF found inside tag value.");
            }
            n = (n2 | (n & 0x7F));
        }
        return n;
    }
    
    public static e s(final n1 n1) throws IOException {
        if (n1.i < 1) {
            return new e(0);
        }
        final i i = new i((InputStream)n1, u1.c((InputStream)n1), false);
        final e e = new e();
        while (true) {
            final q q = i.q();
            if (q == null) {
                break;
            }
            e.a((kk2.d)q);
        }
        return e;
    }
    
    public final q a(int i, int b, final int n) throws IOException {
        final int n2 = 0;
        final boolean b2 = (i & 0x20) != 0x0;
        final n1 n3 = new n1((InputStream)this, n, this.f);
        if ((i & 0x40) != 0x0) {
            return (q)new f1(n3.h(), b, b2);
        }
        if ((i & 0x80) != 0x0) {
            return (q)new v(n3).b(b, b2);
        }
        if (!b2) {
            return b(b, n3, this.h);
        }
        if (b == 4) {
            final e s = s(n3);
            b = s.b;
            final n[] array = new n[b];
            kk2.d b3;
            StringBuilder t;
            for (i = n2; i != b; ++i) {
                b3 = s.b(i);
                if (!(b3 instanceof n)) {
                    t = a.t("unknown object encountered in constructed OCTET STRING: ");
                    t.append(((n)b3).getClass());
                    throw new ASN1Exception(t.toString());
                }
                array[i] = (n)b3;
            }
            return (q)new b0(array);
        }
        if (b == 8) {
            return (q)new h1(s(n3));
        }
        if (b != 16) {
            if (b == 17) {
                final e s2 = s(n3);
                final x0 a = i1.a;
                k1 b4;
                if (s2.b < 1) {
                    b4 = i1.b;
                }
                else {
                    b4 = new k1(s2);
                }
                return (q)b4;
            }
            throw new IOException(a.l("unknown tag ", b, " encountered"));
        }
        else {
            if (this.g) {
                return (q)new r1(n3.h());
            }
            final e s3 = s(n3);
            final x0 a2 = i1.a;
            x0 a3;
            if (s3.b < 1) {
                a3 = i1.a;
            }
            else {
                a3 = new x0(1, s3);
            }
            return (q)a3;
        }
    }
    
    public final q q() throws IOException {
        final int read = this.read();
        if (read <= 0) {
            if (read != 0) {
                return null;
            }
            throw new IOException("unexpected end-of-contents marker");
        }
        else {
            final int r = r(this, read);
            final boolean b = (read & 0x20) != 0x0;
            final int h = h(this, this.f, false);
            if (h < 0) {
                if (!b) {
                    throw new IOException("indefinite-length primitive encoding encountered");
                }
                final v v = new v((s1)new p1((InputStream)this, this.f), this.f);
                if ((read & 0x40) != 0x0) {
                    return new z(r, v).a();
                }
                if ((read & 0x80) != 0x0) {
                    return new i0(true, r, v).a();
                }
                if (r == 4) {
                    return new c0((Object)v, 0).a();
                }
                if (r == 8) {
                    return new n0(v).a();
                }
                if (r == 16) {
                    return new e0(v).a();
                }
                if (r == 17) {
                    return new g0(v).a();
                }
                throw new IOException("unknown BER object encountered");
            }
            else {
                try {
                    return this.a(read, r, h);
                }
                catch (final IllegalArgumentException ex) {
                    throw new ASN1Exception("corrupted stream detected", (Throwable)ex);
                }
            }
        }
    }
}
