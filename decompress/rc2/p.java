// 
// Decompiled by Procyon v0.6.0
// 

package rc2;

import java.nio.ByteBuffer;
import java.io.EOFException;
import java.nio.charset.Charset;
import java.io.IOException;
import com.sendbird.android.shadow.okio.ByteString;
import com.sendbird.android.shadow.okio.a;

public final class p implements e
{
    public final a f;
    public final t g;
    public boolean h;
    
    public p(final t g) {
        this.f = new a();
        if (g != null) {
            this.g = g;
            return;
        }
        throw new NullPointerException("source == null");
    }
    
    public final a S0() {
        return this.f;
    }
    
    public final ByteString U0(final long n) throws IOException {
        this.c1(n);
        return this.f.U0(n);
    }
    
    public final String V0(final Charset charset) throws IOException {
        if (charset != null) {
            this.f.y(this.g);
            return this.f.V0(charset);
        }
        throw new IllegalArgumentException("charset == null");
    }
    
    public final long W0() throws IOException {
        this.c1(1L);
        int n = 0;
        while (true) {
            final int n2 = n + 1;
            if (!this.request(n2)) {
                break;
            }
            final byte k = this.f.k((long)n);
            if ((k < 48 || k > 57) && (k < 97 || k > 102) && (k < 65 || k > 70)) {
                if (n != 0) {
                    break;
                }
                throw new NumberFormatException(String.format("Expected leading [0-9a-fA-F] character but was %#x", k));
            }
            else {
                n = n2;
            }
        }
        return this.f.W0();
    }
    
    public final String Z0(final long n) throws IOException {
        if (n < 0L) {
            throw new IllegalArgumentException(m5.a.e("limit < 0: ", n));
        }
        long n2;
        if (n == Long.MAX_VALUE) {
            n2 = Long.MAX_VALUE;
        }
        else {
            n2 = n + 1L;
        }
        final long a = this.a((byte)10, 0L, n2);
        if (a != -1L) {
            return this.f.t(a);
        }
        if (n2 < Long.MAX_VALUE && this.request(n2) && this.f.k(n2 - 1L) == 13 && this.request(1L + n2) && this.f.k(n2) == 10) {
            return this.f.t(n2);
        }
        final a a2 = new a();
        final a f = this.f;
        f.j(a2, 0L, Math.min(32L, f.g));
        final StringBuilder t = a.t("\\n not found: limit=");
        t.append(Math.min(this.f.g, n));
        t.append(" content=");
        t.append(a2.q().hex());
        t.append('\u2026');
        throw new EOFException(t.toString());
    }
    
    public final long a(final byte b, long max, final long n) throws IOException {
        if (this.h) {
            throw new IllegalStateException("closed");
        }
        max = 0L;
        if (n >= 0L) {
            while (max < n) {
                final long l = this.f.l(b, max, n);
                if (l != -1L) {
                    return l;
                }
                final a f = this.f;
                final long g = f.g;
                if (g >= n) {
                    break;
                }
                if (this.g.m(f, 8192L) == -1L) {
                    break;
                }
                max = Math.max(max, g);
            }
            return -1L;
        }
        throw new IllegalArgumentException(String.format("fromIndex=%s toIndex=%s", 0L, n));
    }
    
    public final String b1() throws IOException {
        return this.Z0(Long.MAX_VALUE);
    }
    
    public final void c1(final long n) throws IOException {
        if (this.request(n)) {
            return;
        }
        throw new EOFException();
    }
    
    public final void close() throws IOException {
        if (this.h) {
            return;
        }
        this.h = true;
        this.g.close();
        this.f.b();
    }
    
    public final boolean e1() throws IOException {
        if (!this.h) {
            return this.f.e1() && this.g.m(this.f, 8192L) == -1L;
        }
        throw new IllegalStateException("closed");
    }
    
    public final boolean g(final ByteString byteString) throws IOException {
        final int size = byteString.size();
        if (!this.h) {
            boolean b2;
            final boolean b = b2 = false;
            if (size >= 0) {
                if (byteString.size() - 0 < size) {
                    b2 = b;
                }
                else {
                    for (int i = 0; i < size; ++i) {
                        final long n = i + 0L;
                        if (!this.request(1L + n)) {
                            b2 = b;
                            return b2;
                        }
                        if (this.f.k(n) != byteString.getByte(0 + i)) {
                            b2 = b;
                            return b2;
                        }
                    }
                    b2 = true;
                }
            }
            return b2;
        }
        throw new IllegalStateException("closed");
    }
    
    public final boolean isOpen() {
        return this.h ^ true;
    }
    
    public final long m(final a a, long min) throws IOException {
        if (a == null) {
            throw new IllegalArgumentException("sink == null");
        }
        if (min < 0L) {
            throw new IllegalArgumentException(m5.a.e("byteCount < 0: ", min));
        }
        if (this.h) {
            throw new IllegalStateException("closed");
        }
        final a f = this.f;
        if (f.g == 0L && this.g.m(f, 8192L) == -1L) {
            return -1L;
        }
        min = Math.min(min, this.f.g);
        return this.f.m(a, min);
    }
    
    public final int read(final ByteBuffer byteBuffer) throws IOException {
        final a f = this.f;
        if (f.g == 0L && this.g.m(f, 8192L) == -1L) {
            return -1;
        }
        return this.f.read(byteBuffer);
    }
    
    public final byte readByte() throws IOException {
        this.c1(1L);
        return this.f.readByte();
    }
    
    public final void readFully(final byte[] array) throws IOException {
        try {
            this.c1(array.length);
            this.f.readFully(array);
        }
        catch (final EOFException ex) {
            int n = 0;
            while (true) {
                final a f = this.f;
                final long g = f.g;
                if (g <= 0L) {
                    throw ex;
                }
                final int read = f.read(array, n, (int)g);
                if (read == -1) {
                    throw new AssertionError();
                }
                n += read;
            }
        }
    }
    
    public final int readInt() throws IOException {
        this.c1(4L);
        return this.f.readInt();
    }
    
    public final long readLong() throws IOException {
        this.c1(8L);
        return this.f.readLong();
    }
    
    public final short readShort() throws IOException {
        this.c1(2L);
        return this.f.readShort();
    }
    
    public final boolean request(final long n) throws IOException {
        if (n < 0L) {
            throw new IllegalArgumentException(m5.a.e("byteCount < 0: ", n));
        }
        if (!this.h) {
            a f;
            do {
                f = this.f;
                if (f.g < n) {
                    continue;
                }
                return true;
            } while (this.g.m(f, 8192L) != -1L);
            return false;
        }
        throw new IllegalStateException("closed");
    }
    
    public final void skip(long n) throws IOException {
        if (!this.h) {
            while (n > 0L) {
                final a f = this.f;
                if (f.g == 0L && this.g.m(f, 8192L) == -1L) {
                    throw new EOFException();
                }
                final long min = Math.min(n, this.f.g);
                this.f.skip(min);
                n -= min;
            }
            return;
        }
        throw new IllegalStateException("closed");
    }
    
    public final u timeout() {
        return this.g.timeout();
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("buffer(");
        t.append(this.g);
        t.append(")");
        return t.toString();
    }
    
    public final void z(final a a, final long n) throws IOException {
        try {
            this.c1(n);
            this.f.z(a, n);
        }
        catch (final EOFException ex) {
            a.y((t)this.f);
            throw ex;
        }
    }
}
