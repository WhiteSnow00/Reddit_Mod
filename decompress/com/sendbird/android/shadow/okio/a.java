// 
// Decompiled by Procyon v0.6.0
// 

package com.sendbird.android.shadow.okio;

import java.io.Closeable;
import xc2.u;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.io.EOFException;
import xc2.r;
import xc2.v;
import al0.b;
import al0.g7;
import java.io.IOException;
import xc2.t;
import xc2.q;
import java.nio.channels.ByteChannel;
import xc2.d;
import xc2.e;

public final class a implements e, d, Cloneable, ByteChannel
{
    public static final byte[] h;
    public q f;
    public long g;
    
    static {
        h = new byte[] { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102 };
    }
    
    public final void A(final ByteString byteString) {
        if (byteString != null) {
            byteString.write(this);
            return;
        }
        throw new IllegalArgumentException("byteString == null");
    }
    
    public final long B(final t t) throws IOException {
        if (t != null) {
            long n = 0L;
            while (true) {
                final long m = t.m(this, 8192L);
                if (m == -1L) {
                    break;
                }
                n += m;
            }
            return n;
        }
        throw new IllegalArgumentException("source == null");
    }
    
    public final void E(final int n) {
        final q w = this.w(1);
        w.a[w.c++] = (byte)n;
        ++this.g;
    }
    
    public final a G(long n) {
        if (n == 0L) {
            this.E(48);
            return this;
        }
        final int n2 = Long.numberOfTrailingZeros(Long.highestOneBit(n)) / 4 + 1;
        final q w = this.w(n2);
        final byte[] a = w.a;
        final int c = w.c;
        int n3 = c + n2;
        while (--n3 >= c) {
            a[n3] = com.sendbird.android.shadow.okio.a.h[(int)(0xFL & n)];
            n >>>= 4;
        }
        w.c += n2;
        this.g += n2;
        return this;
    }
    
    public final void H(final int n) {
        final q w = this.w(4);
        final byte[] a = w.a;
        final int c = w.c;
        final int n2 = c + 1;
        a[c] = (byte)(n >>> 24 & 0xFF);
        final int n3 = n2 + 1;
        a[n2] = (byte)(n >>> 16 & 0xFF);
        final int n4 = n3 + 1;
        a[n3] = (byte)(n >>> 8 & 0xFF);
        a[n4] = (byte)(n & 0xFF);
        w.c = n4 + 1;
        this.g += 4L;
    }
    
    public final void I(final int n) {
        final q w = this.w(2);
        final byte[] a = w.a;
        final int c = w.c;
        final int n2 = c + 1;
        a[c] = (byte)(n >>> 8 & 0xFF);
        a[n2] = (byte)(n & 0xFF);
        w.c = n2 + 1;
        this.g += 2L;
    }
    
    public final void J(int i, final int n, final String s) {
        if (s == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i < 0) {
            throw new IllegalArgumentException(d.h("beginIndex < 0: ", i));
        }
        if (n < i) {
            throw new IllegalArgumentException(g7.f("endIndex < beginIndex: ", n, " < ", i));
        }
        if (n <= s.length()) {
            while (i < n) {
                final char char1 = s.charAt(i);
                if (char1 < '\u0080') {
                    final q w = this.w(1);
                    final byte[] a = w.a;
                    final int n2 = w.c - i;
                    final int min = Math.min(n, 8192 - n2);
                    final int n3 = i + 1;
                    a[i + n2] = (byte)char1;
                    char char2;
                    int n4;
                    for (i = n3; i < min; i = n4) {
                        char2 = s.charAt(i);
                        if (char2 >= '\u0080') {
                            break;
                        }
                        n4 = i + 1;
                        a[i + n2] = (byte)char2;
                    }
                    final int c = w.c;
                    final int n5 = n2 + i - c;
                    w.c = c + n5;
                    this.g += n5;
                }
                else {
                    if (char1 < '\u0800') {
                        this.E(char1 >> 6 | 0xC0);
                        this.E((char1 & '?') | 0x80);
                    }
                    else if (char1 >= '\ud800' && char1 <= '\udfff') {
                        final int n6 = i + 1;
                        char char3;
                        if (n6 < n) {
                            char3 = s.charAt(n6);
                        }
                        else {
                            char3 = '\0';
                        }
                        if (char1 <= '\udbff' && char3 >= '\udc00' && char3 <= '\udfff') {
                            final int n7 = ((char1 & 0xFFFF27FF) << 10 | (0xFFFF23FF & char3)) + 65536;
                            this.E(n7 >> 18 | 0xF0);
                            this.E((n7 >> 12 & 0x3F) | 0x80);
                            this.E((n7 >> 6 & 0x3F) | 0x80);
                            this.E((n7 & 0x3F) | 0x80);
                            i += 2;
                            continue;
                        }
                        this.E(63);
                        i = n6;
                        continue;
                    }
                    else {
                        this.E(char1 >> 12 | 0xE0);
                        this.E((char1 >> 6 & 0x3F) | 0x80);
                        this.E((char1 & '?') | 0x80);
                    }
                    ++i;
                }
            }
            return;
        }
        final StringBuilder j = b.i("endIndex > string.length: ", n, " > ");
        j.append(s.length());
        throw new IllegalArgumentException(j.toString());
    }
    
    public final void K(final int n) {
        if (n < 128) {
            this.E(n);
        }
        else if (n < 2048) {
            this.E(n >> 6 | 0xC0);
            this.E((n & 0x3F) | 0x80);
        }
        else if (n < 65536) {
            if (n >= 55296 && n <= 57343) {
                this.E(63);
            }
            else {
                this.E(n >> 12 | 0xE0);
                this.E((n >> 6 & 0x3F) | 0x80);
                this.E((n & 0x3F) | 0x80);
            }
        }
        else {
            if (n > 1114111) {
                final StringBuilder r = a.r("Unexpected code point: ");
                r.append(Integer.toHexString(n));
                throw new IllegalArgumentException(r.toString());
            }
            this.E(n >> 18 | 0xF0);
            this.E((n >> 12 & 0x3F) | 0x80);
            this.E((n >> 6 & 0x3F) | 0x80);
            this.E((n & 0x3F) | 0x80);
        }
    }
    
    public final void P(final a a, long n) {
        if (a == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (a != this) {
            v.b(a.g, 0L, n);
            while (n > 0L) {
                final q f = a.f;
                final int n2 = f.c - f.b;
                final long n3 = n2;
                final int n4 = 0;
                if (n < n3) {
                    final q f2 = this.f;
                    q g;
                    if (f2 != null) {
                        g = f2.g;
                    }
                    else {
                        g = null;
                    }
                    if (g != null && g.e) {
                        final long n5 = g.c;
                        int b;
                        if (g.d) {
                            b = 0;
                        }
                        else {
                            b = g.b;
                        }
                        if (n5 + n - b <= 8192L) {
                            f.d(g, (int)n);
                            a.g -= n;
                            this.g += n;
                            return;
                        }
                    }
                    final int n6 = (int)n;
                    if (n6 <= 0 || n6 > n2) {
                        throw new IllegalArgumentException();
                    }
                    q f3;
                    if (n6 >= 1024) {
                        f3 = f.c();
                    }
                    else {
                        f3 = r.b();
                        System.arraycopy(f.a, f.b, f3.a, 0, n6);
                    }
                    f3.c = f3.b + n6;
                    f.b += n6;
                    f.g.b(f3);
                    a.f = f3;
                }
                final q f4 = a.f;
                final long n7 = f4.c - f4.b;
                a.f = f4.a();
                final q f5 = this.f;
                if (f5 == null) {
                    this.f = f4;
                    f4.g = f4;
                    f4.f = f4;
                }
                else {
                    f5.g.b(f4);
                    final q g2 = f4.g;
                    if (g2 == f4) {
                        throw new IllegalStateException();
                    }
                    if (g2.e) {
                        final int n8 = f4.c - f4.b;
                        final int c = g2.c;
                        int b2;
                        if (g2.d) {
                            b2 = n4;
                        }
                        else {
                            b2 = g2.b;
                        }
                        if (n8 <= 8192 - c + b2) {
                            f4.d(g2, n8);
                            f4.a();
                            r.a(f4);
                        }
                    }
                }
                a.g -= n7;
                this.g += n7;
                n -= n7;
            }
            return;
        }
        throw new IllegalArgumentException("source == this");
    }
    
    public final a S0() {
        return this;
    }
    
    public final ByteString U0(final long n) throws EOFException {
        return new ByteString(this.r(n));
    }
    
    public final String V0(final Charset charset) {
        try {
            return this.t(this.g, charset);
        }
        catch (final EOFException ex) {
            throw new AssertionError((Object)ex);
        }
    }
    
    public final long W0() {
        if (this.g != 0L) {
            int n = 0;
            int n2 = 0;
            long n3 = 0L;
            long n4;
            int n5;
            do {
                final q f = this.f;
                final byte[] a = f.a;
                int b = f.b;
                final int c = f.c;
                n4 = n3;
                n5 = n;
                int n6;
                while (true) {
                    n6 = n2;
                    if (b >= c) {
                        break;
                    }
                    final byte b2 = a[b];
                    int n7;
                    if (b2 >= 48 && b2 <= 57) {
                        n7 = b2 - 48;
                    }
                    else {
                        if (b2 >= 97 && b2 <= 102) {
                            n7 = b2 - 97;
                        }
                        else if (b2 >= 65 && b2 <= 70) {
                            n7 = b2 - 65;
                        }
                        else {
                            if (n5 != 0) {
                                n6 = 1;
                                break;
                            }
                            final StringBuilder r = a.r("Expected leading [0-9a-fA-F] character but was 0x");
                            r.append(Integer.toHexString(b2));
                            throw new NumberFormatException(r.toString());
                        }
                        n7 += 10;
                    }
                    if ((0xF000000000000000L & n4) != 0x0L) {
                        final a a2 = new a();
                        a2.G(n4);
                        a2.E(b2);
                        final StringBuilder r2 = a.r("Number too large: ");
                        r2.append(a2.u());
                        throw new NumberFormatException(r2.toString());
                    }
                    n4 = (n4 << 4 | (long)n7);
                    ++b;
                    ++n5;
                }
                if (b == c) {
                    this.f = f.a();
                    r.a(f);
                }
                else {
                    f.b = b;
                }
                if (n6 != 0) {
                    break;
                }
                n = n5;
                n2 = n6;
                n3 = n4;
            } while (this.f != null);
            this.g -= n5;
            return n4;
        }
        throw new IllegalStateException("size == 0");
    }
    
    public final d X0() {
        return (d)this;
    }
    
    public final d Y0() throws IOException {
        return (d)this;
    }
    
    public final String Z0(final long n) throws EOFException {
        if (n < 0L) {
            throw new IllegalArgumentException(g7.g("limit < 0: ", n));
        }
        long n2 = Long.MAX_VALUE;
        if (n != Long.MAX_VALUE) {
            n2 = n + 1L;
        }
        final long p = this.p((byte)10, 0L, n2);
        if (p != -1L) {
            return this.v(p);
        }
        if (n2 < this.g && this.n(n2 - 1L) == 13 && this.n(n2) == 10) {
            return this.v(n2);
        }
        final a a = new a();
        this.j(a, 0L, Math.min(32L, this.g));
        final StringBuilder r = a.r("\\n not found: limit=");
        r.append(Math.min(this.g, n));
        r.append(" content=");
        r.append(a.s().hex());
        r.append('\u2026');
        throw new EOFException(r.toString());
    }
    
    public final d a1(final String s) throws IOException {
        this.J(0, s.length(), s);
        return (d)this;
    }
    
    public final void b() {
        try {
            this.skip(this.g);
        }
        catch (final EOFException ex) {
            throw new AssertionError((Object)ex);
        }
    }
    
    public final String b1() throws EOFException {
        return this.Z0(Long.MAX_VALUE);
    }
    
    public final void c1(final long n) throws EOFException {
        if (this.g >= n) {
            return;
        }
        throw new EOFException();
    }
    
    public final Object clone() throws CloneNotSupportedException {
        final a a = new a();
        if (this.g != 0L) {
            final q c = this.f.c();
            a.f = c;
            c.g = c;
            c.f = c;
            q q = this.f;
            while (true) {
                q = q.f;
                if (q == this.f) {
                    break;
                }
                a.f.g.b(q.c());
            }
            a.g = this.g;
        }
        return a;
    }
    
    public final void close() {
    }
    
    public final boolean e1() {
        return this.g == 0L;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof a)) {
            return false;
        }
        final a a = (a)o;
        final long g = this.g;
        if (g != a.g) {
            return false;
        }
        long n = 0L;
        if (g == 0L) {
            return true;
        }
        q f = this.f;
        q f2 = a.f;
        int b = f.b;
        int b2 = f2.b;
        while (n < this.g) {
            final long n2 = Math.min(f.c - b, f2.c - b2);
            for (int n3 = 0; n3 < n2; ++n3, ++b, ++b2) {
                if (f.a[b] != f2.a[b2]) {
                    return false;
                }
            }
            q f3 = f;
            int b3;
            if ((b3 = b) == f.c) {
                f3 = f.f;
                b3 = f3.b;
            }
            int b4 = b2;
            q f4 = f2;
            if (b2 == f2.c) {
                f4 = f2.f;
                b4 = f4.b;
            }
            n += n2;
            f = f3;
            b = b3;
            b2 = b4;
            f2 = f4;
        }
        return true;
    }
    
    public final void flush() {
    }
    
    public final long h() {
        final long g = this.g;
        if (g == 0L) {
            return 0L;
        }
        final q g2 = this.f.g;
        final int c = g2.c;
        long n = g;
        if (c < 8192) {
            n = g;
            if (g2.e) {
                n = g - (c - g2.b);
            }
        }
        return n;
    }
    
    @Override
    public final int hashCode() {
        q q = this.f;
        if (q == null) {
            return 0;
        }
        int n = 1;
        q q2;
        int n2;
        do {
            int i = q.b;
            final int c = q.c;
            n2 = n;
            while (i < c) {
                n2 = n2 * 31 + q.a[i];
                ++i;
            }
            q2 = (q = q.f);
            n = n2;
        } while (q2 != this.f);
        return n2;
    }
    
    public final boolean isOpen() {
        return true;
    }
    
    public final void j(final a a, long n, final long n2) {
        if (a == null) {
            throw new IllegalArgumentException("out == null");
        }
        v.b(this.g, n, n2);
        if (n2 == 0L) {
            return;
        }
        a.g += n2;
        q q = this.f;
        q f;
        long n4;
        long n5;
        while (true) {
            final long n3 = q.c - q.b;
            f = q;
            n4 = n;
            n5 = n2;
            if (n < n3) {
                break;
            }
            n -= n3;
            q = q.f;
        }
        while (n5 > 0L) {
            final q c = f.c();
            final int b = (int)(c.b + n4);
            c.b = b;
            c.c = Math.min(b + (int)n5, c.c);
            final q f2 = a.f;
            if (f2 == null) {
                c.g = c;
                c.f = c;
                a.f = c;
            }
            else {
                f2.g.b(c);
            }
            n5 -= c.c - c.b;
            f = f.f;
            n4 = 0L;
        }
    }
    
    public final boolean l(final ByteString byteString) {
        final int size = byteString.size();
        boolean b2;
        final boolean b = b2 = false;
        if (size >= 0) {
            b2 = b;
            if (this.g - 0L >= size) {
                if (byteString.size() - 0 < size) {
                    b2 = b;
                }
                else {
                    for (int i = 0; i < size; ++i) {
                        if (this.n(i + 0L) != byteString.getByte(0 + i)) {
                            b2 = b;
                            return b2;
                        }
                    }
                    b2 = true;
                }
            }
        }
        return b2;
    }
    
    public final long m(final a a, final long n) {
        if (a == null) {
            throw new IllegalArgumentException("sink == null");
        }
        if (n < 0L) {
            throw new IllegalArgumentException(g7.g("byteCount < 0: ", n));
        }
        final long g = this.g;
        if (g == 0L) {
            return -1L;
        }
        long n2 = n;
        if (n > g) {
            n2 = g;
        }
        a.P(this, n2);
        return n2;
    }
    
    public final byte n(long n) {
        v.b(this.g, n, 1L);
        final long g = this.g;
        if (g - n > n) {
            q q = this.f;
            int b;
            while (true) {
                final int c = q.c;
                b = q.b;
                final long n2 = c - b;
                if (n < n2) {
                    break;
                }
                n -= n2;
                q = q.f;
            }
            return q.a[b + (int)n];
        }
        n -= g;
        q f = this.f;
        long n3;
        q g2;
        int b2;
        do {
            g2 = f.g;
            final int c2 = g2.c;
            b2 = g2.b;
            n3 = n + (c2 - b2);
            f = g2;
            n = n3;
        } while (n3 < 0L);
        return g2.a[b2 + (int)n3];
    }
    
    public final long p(final byte b, long n, long n2) {
        final long n3 = 0L;
        if (n < 0L || n2 < n) {
            throw new IllegalArgumentException(String.format("size=%s fromIndex=%s toIndex=%s", this.g, n, n2));
        }
        long g = this.g;
        long n4;
        if (n2 > g) {
            n4 = g;
        }
        else {
            n4 = n2;
        }
        if (n == n4) {
            return -1L;
        }
        final q f = this.f;
        if (f == null) {
            return -1L;
        }
        n2 = n3;
        q f2 = f;
        q f3;
        if (g - n < n) {
            q g2 = f;
            while (true) {
                n2 = g;
                f3 = g2;
                if (g <= n) {
                    break;
                }
                g2 = g2.g;
                g -= g2.c - g2.b;
            }
        }
        else {
            while (true) {
                final long n5 = f2.c - f2.b + n2;
                if (n5 >= n) {
                    break;
                }
                f2 = f2.f;
                n2 = n5;
            }
            f3 = f2;
        }
        while (n2 < n4) {
            final byte[] a = f3.a;
            for (int n6 = (int)Math.min(f3.c, f3.b + n4 - n2), i = (int)(f3.b + n - n2); i < n6; ++i) {
                if (a[i] == b) {
                    return i - f3.b + n2;
                }
            }
            n2 += f3.c - f3.b;
            f3 = f3.f;
            n = n2;
        }
        return -1L;
    }
    
    public final void q(final a a) {
        if (a.f == null) {
            a.f = this;
            a.g = true;
            return;
        }
        throw new IllegalStateException("already attached to a buffer");
    }
    
    public final byte[] r(final long n) throws EOFException {
        v.b(this.g, 0L, n);
        if (n <= 2147483647L) {
            final byte[] array = new byte[(int)n];
            this.readFully(array);
            return array;
        }
        throw new IllegalArgumentException(g7.g("byteCount > Integer.MAX_VALUE: ", n));
    }
    
    public final int read(final ByteBuffer byteBuffer) throws IOException {
        final q f = this.f;
        if (f == null) {
            return -1;
        }
        final int min = Math.min(byteBuffer.remaining(), f.c - f.b);
        byteBuffer.put(f.a, f.b, min);
        final int b = f.b + min;
        f.b = b;
        this.g -= min;
        if (b == f.c) {
            this.f = f.a();
            r.a(f);
        }
        return min;
    }
    
    public final int read(final byte[] array, int b, int min) {
        v.b((long)array.length, (long)b, (long)min);
        final q f = this.f;
        if (f == null) {
            return -1;
        }
        min = Math.min(min, f.c - f.b);
        System.arraycopy(f.a, f.b, array, b, min);
        b = f.b + min;
        f.b = b;
        this.g -= min;
        if (b == f.c) {
            this.f = f.a();
            r.a(f);
        }
        return min;
    }
    
    public final byte readByte() {
        final long g = this.g;
        if (g != 0L) {
            final q f = this.f;
            final int b = f.b;
            final int c = f.c;
            final byte[] a = f.a;
            final int b2 = b + 1;
            final byte b3 = a[b];
            this.g = g - 1L;
            if (b2 == c) {
                this.f = f.a();
                r.a(f);
            }
            else {
                f.b = b2;
            }
            return b3;
        }
        throw new IllegalStateException("size == 0");
    }
    
    public final void readFully(final byte[] array) throws EOFException {
        int read;
        for (int i = 0; i < array.length; i += read) {
            read = this.read(array, i, array.length - i);
            if (read == -1) {
                throw new EOFException();
            }
        }
    }
    
    public final int readInt() {
        final long g = this.g;
        if (g < 4L) {
            final StringBuilder r = a.r("size < 4: ");
            r.append(this.g);
            throw new IllegalStateException(r.toString());
        }
        final q f = this.f;
        final int b = f.b;
        final int c = f.c;
        if (c - b < 4) {
            return (this.readByte() & 0xFF) << 24 | (this.readByte() & 0xFF) << 16 | (this.readByte() & 0xFF) << 8 | (this.readByte() & 0xFF);
        }
        final byte[] a = f.a;
        final int n = b + 1;
        final byte b2 = a[b];
        final int n2 = n + 1;
        final byte b3 = a[n];
        final int n3 = n2 + 1;
        final byte b4 = a[n2];
        final int b5 = n3 + 1;
        final byte b6 = a[n3];
        this.g = g - 4L;
        if (b5 == c) {
            this.f = f.a();
            r.a(f);
        }
        else {
            f.b = b5;
        }
        return (b2 & 0xFF) << 24 | (b3 & 0xFF) << 16 | (b4 & 0xFF) << 8 | (b6 & 0xFF);
    }
    
    public final long readLong() {
        final long g = this.g;
        if (g < 8L) {
            final StringBuilder r = a.r("size < 8: ");
            r.append(this.g);
            throw new IllegalStateException(r.toString());
        }
        final q f = this.f;
        final int b = f.b;
        final int c = f.c;
        if (c - b < 8) {
            return ((long)this.readInt() & 0xFFFFFFFFL) << 32 | (0xFFFFFFFFL & (long)this.readInt());
        }
        final byte[] a = f.a;
        final int n = b + 1;
        final long n2 = a[b];
        final int n3 = n + 1;
        final long n4 = a[n];
        final int n5 = n3 + 1;
        final long n6 = a[n3];
        final int n7 = n5 + 1;
        final long n8 = a[n5];
        final int n9 = n7 + 1;
        final long n10 = a[n7];
        final int n11 = n9 + 1;
        final long n12 = a[n9];
        final int n13 = n11 + 1;
        final long n14 = a[n11];
        final int b2 = n13 + 1;
        final long n15 = a[n13];
        this.g = g - 8L;
        if (b2 == c) {
            this.f = f.a();
            r.a(f);
        }
        else {
            f.b = b2;
        }
        return (n15 & 0xFFL) | ((n4 & 0xFFL) << 48 | (n2 & 0xFFL) << 56 | (n6 & 0xFFL) << 40 | (n8 & 0xFFL) << 32 | (n10 & 0xFFL) << 24 | (n12 & 0xFFL) << 16 | (n14 & 0xFFL) << 8);
    }
    
    public final short readShort() {
        final long g = this.g;
        if (g < 2L) {
            final StringBuilder r = a.r("size < 2: ");
            r.append(this.g);
            throw new IllegalStateException(r.toString());
        }
        final q f = this.f;
        final int b = f.b;
        final int c = f.c;
        if (c - b < 2) {
            return (short)((this.readByte() & 0xFF) << 8 | (this.readByte() & 0xFF));
        }
        final byte[] a = f.a;
        final int n = b + 1;
        final byte b2 = a[b];
        final int b3 = n + 1;
        final byte b4 = a[n];
        this.g = g - 2L;
        if (b3 == c) {
            this.f = f.a();
            r.a(f);
        }
        else {
            f.b = b3;
        }
        return (short)((b2 & 0xFF) << 8 | (b4 & 0xFF));
    }
    
    public final ByteString s() {
        try {
            return new ByteString(this.r(this.g));
        }
        catch (final EOFException ex) {
            throw new AssertionError((Object)ex);
        }
    }
    
    public final void skip(long n) throws EOFException {
        while (n > 0L) {
            final q f = this.f;
            if (f == null) {
                throw new EOFException();
            }
            final int n2 = (int)Math.min(n, f.c - f.b);
            final long g = this.g;
            final long n3 = n2;
            this.g = g - n3;
            final long n4 = n - n3;
            final q f2 = this.f;
            final int b = f2.b + n2;
            f2.b = b;
            n = n4;
            if (b != f2.c) {
                continue;
            }
            this.f = f2.a();
            r.a(f2);
            n = n4;
        }
    }
    
    public final String t(final long n, final Charset charset) throws EOFException {
        v.b(this.g, 0L, n);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        if (n > 2147483647L) {
            throw new IllegalArgumentException(g7.g("byteCount > Integer.MAX_VALUE: ", n));
        }
        if (n == 0L) {
            return "";
        }
        final q f = this.f;
        final int b = f.b;
        if (b + n > f.c) {
            return new String(this.r(n), charset);
        }
        final String s = new String(f.a, b, (int)n, charset);
        final int b2 = (int)(f.b + n);
        f.b = b2;
        this.g -= n;
        if (b2 == f.c) {
            this.f = f.a();
            r.a(f);
        }
        return s;
    }
    
    public final u timeout() {
        return (u)u.d;
    }
    
    @Override
    public final String toString() {
        final long g = this.g;
        if (g <= 2147483647L) {
            final int n = (int)g;
            Object empty;
            if (n == 0) {
                empty = ByteString.EMPTY;
            }
            else {
                empty = new SegmentedByteString(this, n);
            }
            return ((ByteString)empty).toString();
        }
        final StringBuilder r = a.r("size > Integer.MAX_VALUE: ");
        r.append(this.g);
        throw new IllegalArgumentException(r.toString());
    }
    
    public final String u() {
        try {
            return this.t(this.g, v.a);
        }
        catch (final EOFException ex) {
            throw new AssertionError((Object)ex);
        }
    }
    
    public final String v(final long n) throws EOFException {
        if (n > 0L) {
            final long n2 = n - 1L;
            if (this.n(n2) == 13) {
                final String t = this.t(n2, v.a);
                this.skip(2L);
                return t;
            }
        }
        final String t2 = this.t(n, v.a);
        this.skip(1L);
        return t2;
    }
    
    public final q w(final int n) {
        if (n < 1 || n > 8192) {
            throw new IllegalArgumentException();
        }
        final q f = this.f;
        if (f == null) {
            final q b = r.b();
            this.f = b;
            b.g = b;
            return b.f = b;
        }
        final q g = f.g;
        if (g.c + n <= 8192) {
            final q b2 = g;
            if (g.e) {
                return b2;
            }
        }
        final q b2 = r.b();
        g.b(b2);
        return b2;
    }
    
    public final int write(final ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer != null) {
            int i;
            int n;
            q w;
            int min;
            for (n = (i = byteBuffer.remaining()); i > 0; i -= min, w.c += min) {
                w = this.w(1);
                min = Math.min(i, 8192 - w.c);
                byteBuffer.get(w.a, w.c, min);
            }
            this.g += n;
            return n;
        }
        throw new IllegalArgumentException("source == null");
    }
    
    public final void write(final byte[] array) {
        if (array != null) {
            this.y(0, array.length, array);
            return;
        }
        throw new IllegalArgumentException("source == null");
    }
    
    public final void y(int i, int n, final byte[] array) {
        if (array != null) {
            final long n2 = array.length;
            final long n3 = i;
            final long n4 = n;
            v.b(n2, n3, n4);
            q w;
            int min;
            for (n += i; i < n; i += min, w.c += min) {
                w = this.w(1);
                min = Math.min(n - i, 8192 - w.c);
                System.arraycopy(array, i, w.a, w.c, min);
            }
            this.g += n4;
            return;
        }
        throw new IllegalArgumentException("source == null");
    }
    
    public final void z(final a a, final long n) throws EOFException {
        final long g = this.g;
        if (g >= n) {
            a.P(this, n);
            return;
        }
        a.P(this, g);
        throw new EOFException();
    }
    
    public static final class a implements Closeable
    {
        public com.sendbird.android.shadow.okio.a f;
        public boolean g;
        public q h;
        public long i;
        public byte[] j;
        public int k;
        public int l;
        
        public a() {
            this.i = -1L;
            this.k = -1;
            this.l = -1;
        }
        
        @Override
        public final void close() {
            if (this.f != null) {
                this.f = null;
                this.h = null;
                this.i = -1L;
                this.j = null;
                this.k = -1;
                this.l = -1;
                return;
            }
            throw new IllegalStateException("not attached to a buffer");
        }
        
        public final int f(final long n) {
            final long n2 = lcmp(n, -1L);
            if (n2 >= 0) {
                final com.sendbird.android.shadow.okio.a f = this.f;
                long g = f.g;
                final long n3 = lcmp(n, g);
                if (n3 <= 0) {
                    if (n2 != 0 && n3 != 0) {
                        final long n4 = 0L;
                        q q = f.f;
                        q q2 = this.h;
                        long n5;
                        if (q2 != null) {
                            n5 = this.i - (this.k - q2.b);
                            if (n5 > n) {
                                g = n5;
                                n5 = n4;
                            }
                            else {
                                final q q3 = q;
                                q = q2;
                                q2 = q3;
                            }
                        }
                        else {
                            q2 = q;
                            n5 = n4;
                        }
                        long n6 = g;
                        if (g - n > n - n5) {
                            while (true) {
                                final long n7 = q.c - q.b + n5;
                                q2 = q;
                                if (n < n7) {
                                    break;
                                }
                                q = q.f;
                                n5 = n7;
                            }
                        }
                        else {
                            while (n6 > n) {
                                q2 = q2.g;
                                n6 -= q2.c - q2.b;
                            }
                            n5 = n6;
                        }
                        q q4 = q2;
                        if (this.g) {
                            q4 = q2;
                            if (q2.d) {
                                q4 = new q((byte[])q2.a.clone(), q2.b, q2.c, false, true);
                                final com.sendbird.android.shadow.okio.a f2 = this.f;
                                if (f2.f == q2) {
                                    f2.f = q4;
                                }
                                q2.b(q4);
                                q4.g.a();
                            }
                        }
                        this.h = q4;
                        this.i = n;
                        this.j = q4.a;
                        final int k = q4.b + (int)(n - n5);
                        this.k = k;
                        return (this.l = q4.c) - k;
                    }
                    this.h = null;
                    this.i = n;
                    this.j = null;
                    this.k = -1;
                    return this.l = -1;
                }
            }
            throw new ArrayIndexOutOfBoundsException(String.format("offset=%s > size=%s", n, this.f.g));
        }
    }
}
