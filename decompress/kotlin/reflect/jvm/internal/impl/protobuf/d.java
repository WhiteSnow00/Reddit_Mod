// 
// Decompiled by Procyon v0.6.0
// 

package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.Iterator;
import java.util.ArrayList;
import java.io.IOException;
import java.io.InputStream;

public final class d
{
    public final byte[] a;
    public int b;
    public int c;
    public int d;
    public final InputStream e;
    public int f;
    public int g;
    public int h;
    public int i;
    
    public d(final InputStream e) {
        this.h = Integer.MAX_VALUE;
        this.a = new byte[4096];
        this.b = 0;
        this.d = 0;
        this.g = 0;
        this.e = e;
    }
    
    public final void a(final int n) throws InvalidProtocolBufferException {
        if (this.f == n) {
            return;
        }
        throw InvalidProtocolBufferException.invalidEndTag();
    }
    
    public final int b() {
        final int h = this.h;
        if (h == Integer.MAX_VALUE) {
            return -1;
        }
        return h - (this.g + this.d);
    }
    
    public final void c(final int h) {
        this.h = h;
        this.o();
    }
    
    public final int d(int h) throws InvalidProtocolBufferException {
        if (h < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        h += this.g + this.d;
        final int h2 = this.h;
        if (h <= h2) {
            this.h = h;
            this.o();
            return h2;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }
    
    public final k e() throws IOException {
        final int k = this.k();
        final int b = this.b;
        final int d = this.d;
        if (k <= b - d && k > 0) {
            final byte[] a = this.a;
            final k f = kotlin.reflect.jvm.internal.impl.protobuf.c.f;
            final byte[] array = new byte[k];
            System.arraycopy(a, d, array, 0, k);
            final k i = new k(array);
            this.d += k;
            return i;
        }
        if (k == 0) {
            return kotlin.reflect.jvm.internal.impl.protobuf.c.f;
        }
        return new k(this.h(k));
    }
    
    public final int f() throws IOException {
        return this.k();
    }
    
    public final <T extends l> T g(final n<T> n, final e e) throws IOException {
        final int k = this.k();
        if (this.i < 64) {
            final int d = this.d(k);
            ++this.i;
            final l l = n.a(this, e);
            this.a(0);
            --this.i;
            this.c(d);
            return (T)l;
        }
        throw InvalidProtocolBufferException.recursionLimitExceeded();
    }
    
    public final byte[] h(int d) throws IOException {
        if (d <= 0) {
            if (d == 0) {
                return Internal.EMPTY_BYTE_ARRAY;
            }
            throw InvalidProtocolBufferException.negativeSize();
        }
        else {
            final int g = this.g;
            final int d2 = this.d;
            final int h = this.h;
            if (g + d2 + d > h) {
                this.r(h - g - d2);
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (d < 4096) {
                final byte[] array = new byte[d];
                final int n = this.b - d2;
                System.arraycopy(this.a, d2, array, 0, n);
                final int b = this.b;
                this.d = b;
                d -= n;
                if (b - b < d) {
                    this.p(d);
                }
                System.arraycopy(this.a, 0, array, n, d);
                this.d = d;
                return array;
            }
            final int b2 = this.b;
            this.g = g + b2;
            this.d = 0;
            this.b = 0;
            final int n2 = b2 - d2;
            int i = d - n2;
            final ArrayList list = new ArrayList();
            while (i > 0) {
                final int min = Math.min(i, 4096);
                final byte[] array2 = new byte[min];
                int read;
                for (int j = 0; j < min; j += read) {
                    final InputStream e = this.e;
                    if (e == null) {
                        read = -1;
                    }
                    else {
                        read = e.read(array2, j, min - j);
                    }
                    if (read == -1) {
                        throw InvalidProtocolBufferException.truncatedMessage();
                    }
                    this.g += read;
                }
                i -= min;
                list.add(array2);
            }
            final byte[] array3 = new byte[d];
            System.arraycopy(this.a, d2, array3, 0, n2);
            final Iterator iterator = list.iterator();
            d = n2;
            while (iterator.hasNext()) {
                final byte[] array4 = (byte[])iterator.next();
                System.arraycopy(array4, 0, array3, d, array4.length);
                d += array4.length;
            }
            return array3;
        }
    }
    
    public final int i() throws IOException {
        int n;
        if (this.b - (n = this.d) < 4) {
            this.p(4);
            n = this.d;
        }
        final byte[] a = this.a;
        this.d = n + 4;
        return (a[n + 3] & 0xFF) << 24 | ((a[n] & 0xFF) | (a[n + 1] & 0xFF) << 8 | (a[n + 2] & 0xFF) << 16);
    }
    
    public final long j() throws IOException {
        int n;
        if (this.b - (n = this.d) < 8) {
            this.p(8);
            n = this.d;
        }
        final byte[] a = this.a;
        this.d = n + 8;
        return ((long)a[n + 7] & 0xFFL) << 56 | (((long)a[n] & 0xFFL) | ((long)a[n + 1] & 0xFFL) << 8 | ((long)a[n + 2] & 0xFFL) << 16 | ((long)a[n + 3] & 0xFFL) << 24 | ((long)a[n + 4] & 0xFFL) << 32 | ((long)a[n + 5] & 0xFFL) << 40 | ((long)a[n + 6] & 0xFFL) << 48);
    }
    
    public final int k() throws IOException {
        final int d = this.d;
        final int b = this.b;
        if (b != d) {
            final byte[] a = this.a;
            final int d2 = d + 1;
            final byte b2 = a[d];
            if (b2 >= 0) {
                this.d = d2;
                return b2;
            }
            if (b - d2 >= 9) {
                final int n = d2 + 1;
                final int n2 = b2 ^ a[d2] << 7;
                long n3 = n2;
                int d3 = 0;
                int n6 = 0;
                Label_0308: {
                    long n9 = 0L;
                    Label_0090: {
                        if (n3 >= 0L) {
                            d3 = n + 1;
                            final int n4 = n2 ^ a[n] << 14;
                            final long n5 = n4;
                            if (n5 >= 0L) {
                                n6 = (int)(0x3F80L ^ n5);
                            }
                            else {
                                final int n7 = d3 + 1;
                                final int n8 = n4 ^ a[d3] << 21;
                                n3 = n8;
                                if (n3 < 0L) {
                                    n9 = -2080896L;
                                    d3 = n7;
                                    break Label_0090;
                                }
                                final int n10 = n7 + 1;
                                final byte b3 = a[n7];
                                final int n11 = n6 = (int)((long)(n8 ^ b3 << 28) ^ 0xFE03F80L);
                                d3 = n10;
                                if (b3 < 0) {
                                    final int n12 = n10 + 1;
                                    n6 = n11;
                                    d3 = n12;
                                    if (a[n10] < 0) {
                                        final int n13 = n12 + 1;
                                        n6 = n11;
                                        d3 = n13;
                                        if (a[n12] < 0) {
                                            final int n14 = n13 + 1;
                                            n6 = n11;
                                            d3 = n14;
                                            if (a[n13] < 0) {
                                                final int n15 = n14 + 1;
                                                n6 = n11;
                                                d3 = n15;
                                                if (a[n14] < 0) {
                                                    d3 = n15 + 1;
                                                    n6 = n11;
                                                    if (a[n15] < 0) {
                                                        return (int)this.m();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            break Label_0308;
                        }
                        n9 = -128L;
                        d3 = n;
                    }
                    n6 = (int)(n3 ^ n9);
                }
                this.d = d3;
                return n6;
            }
        }
        return (int)this.m();
    }
    
    public final long l() throws IOException {
        final int d = this.d;
        final int b = this.b;
        if (b != d) {
            final byte[] a = this.a;
            final int d2 = d + 1;
            final byte b2 = a[d];
            if (b2 >= 0) {
                this.d = d2;
                return b2;
            }
            if (b - d2 >= 9) {
                int d3 = d2 + 1;
                long n = b2 ^ a[d2] << 7;
                long n10 = 0L;
                Label_0356: {
                    long n6 = 0L;
                    Label_0086: {
                        if (n >= 0L) {
                            final int n2 = d3 + 1;
                            long n3 = n ^ (long)(a[d3] << 14);
                            long n4;
                            if (n3 >= 0L) {
                                n4 = 16256L;
                                d3 = n2;
                            }
                            else {
                                final int n5 = n2 + 1;
                                n = (n3 ^ (long)(a[n2] << 21));
                                if (n < 0L) {
                                    n6 = -2080896L;
                                    d3 = n5;
                                    break Label_0086;
                                }
                                d3 = n5 + 1;
                                n3 = (n ^ (long)a[n5] << 28);
                                if (n3 >= 0L) {
                                    n4 = 266354560L;
                                }
                                else {
                                    final int n7 = d3 + 1;
                                    n = (n3 ^ (long)a[d3] << 35);
                                    if (n < 0L) {
                                        n6 = -34093383808L;
                                        d3 = n7;
                                        break Label_0086;
                                    }
                                    d3 = n7 + 1;
                                    n3 = (n ^ (long)a[n7] << 42);
                                    if (n3 >= 0L) {
                                        n4 = 4363953127296L;
                                    }
                                    else {
                                        final int n8 = d3 + 1;
                                        n = (n3 ^ (long)a[d3] << 49);
                                        if (n < 0L) {
                                            n6 = -558586000294016L;
                                            d3 = n8;
                                            break Label_0086;
                                        }
                                        final int n9 = n8 + 1;
                                        n10 = (n ^ (long)a[n8] << 56 ^ 0xFE03F80FE03F80L);
                                        if (n10 >= 0L) {
                                            d3 = n9;
                                            break Label_0356;
                                        }
                                        d3 = n9 + 1;
                                        if (a[n9] < 0L) {
                                            return this.m();
                                        }
                                        break Label_0356;
                                    }
                                }
                            }
                            n10 = (n3 ^ n4);
                            break Label_0356;
                        }
                        n6 = -128L;
                    }
                    n10 = (n ^ n6);
                }
                this.d = d3;
                return n10;
            }
        }
        return this.m();
    }
    
    public final long m() throws IOException {
        long n = 0L;
        for (int i = 0; i < 64; i += 7) {
            if (this.d == this.b) {
                this.p(1);
            }
            final byte b = this.a[this.d++];
            n |= (long)(b & 0x7F) << i;
            if ((b & 0x80) == 0x0) {
                return n;
            }
        }
        throw InvalidProtocolBufferException.malformedVarint();
    }
    
    public final int n() throws IOException {
        final int d = this.d;
        final int b = this.b;
        boolean b2 = true;
        if (d != b || this.s(1)) {
            b2 = false;
        }
        if (b2) {
            return this.f = 0;
        }
        final int k = this.k();
        this.f = k;
        if (k >>> 3 != 0) {
            return k;
        }
        throw InvalidProtocolBufferException.invalidTag();
    }
    
    public final void o() {
        final int b = this.b + this.c;
        this.b = b;
        final int n = this.g + b;
        final int h = this.h;
        if (n > h) {
            final int c = n - h;
            this.c = c;
            this.b = b - c;
        }
        else {
            this.c = 0;
        }
    }
    
    public final void p(final int n) throws IOException {
        if (this.s(n)) {
            return;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }
    
    public final boolean q(int n, final CodedOutputStream codedOutputStream) throws IOException {
        final int n2 = n & 0x7;
        if (n2 == 0) {
            final long l = this.l();
            codedOutputStream.t(n);
            codedOutputStream.u(l);
            return true;
        }
        if (n2 == 1) {
            final long j = this.j();
            codedOutputStream.t(n);
            codedOutputStream.s(j);
            return true;
        }
        if (n2 == 2) {
            final k e = this.e();
            codedOutputStream.t(n);
            codedOutputStream.t(e.size());
            codedOutputStream.p((c)e);
            return true;
        }
        if (n2 == 3) {
            codedOutputStream.t(n);
            int n3;
            do {
                n3 = this.n();
            } while (n3 != 0 && this.q(n3, codedOutputStream));
            n = (n >>> 3 << 3 | 0x4);
            this.a(n);
            codedOutputStream.t(n);
            return true;
        }
        if (n2 == 4) {
            return false;
        }
        if (n2 == 5) {
            final int i = this.i();
            codedOutputStream.t(n);
            codedOutputStream.r(i);
            return true;
        }
        throw InvalidProtocolBufferException.invalidWireType();
    }
    
    public final void r(final int n) throws IOException {
        final int b = this.b;
        final int d = this.d;
        if (n <= b - d && n >= 0) {
            this.d = d + n;
        }
        else {
            if (n < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            final int g = this.g;
            final int h = this.h;
            if (g + d + n > h) {
                this.r(h - g - d);
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            int n2 = b - d;
            this.d = b;
            this.p(1);
            int d2;
            while (true) {
                d2 = n - n2;
                final int b2 = this.b;
                if (d2 <= b2) {
                    break;
                }
                n2 += b2;
                this.d = b2;
                this.p(1);
            }
            this.d = d2;
        }
    }
    
    public final boolean s(final int n) throws IOException {
        final int d = this.d;
        final int b = this.b;
        if (d + n <= b) {
            final StringBuilder sb = new StringBuilder(77);
            sb.append("refillBuffer() called when ");
            sb.append(n);
            sb.append(" bytes were already available in buffer");
            throw new IllegalStateException(sb.toString());
        }
        if (this.g + d + n > this.h) {
            return false;
        }
        if (this.e != null) {
            if (d > 0) {
                if (b > d) {
                    final byte[] a = this.a;
                    System.arraycopy(a, d, a, 0, b - d);
                }
                this.g += d;
                this.b -= d;
                this.d = 0;
            }
            final InputStream e = this.e;
            final byte[] a2 = this.a;
            final int b2 = this.b;
            final int read = e.read(a2, b2, a2.length - b2);
            if (read == 0 || read < -1 || read > this.a.length) {
                final StringBuilder sb2 = new StringBuilder(102);
                sb2.append("InputStream#read(byte[]) returned invalid result: ");
                sb2.append(read);
                sb2.append("\nThe InputStream implementation is buggy.");
                throw new IllegalStateException(sb2.toString());
            }
            if (read > 0) {
                this.b += read;
                if (this.g + n - 67108864 <= 0) {
                    this.o();
                    return this.b >= n || this.s(n);
                }
                throw InvalidProtocolBufferException.sizeLimitExceeded();
            }
        }
        return false;
    }
}
