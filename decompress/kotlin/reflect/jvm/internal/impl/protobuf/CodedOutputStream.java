// 
// Decompiled by Procyon v0.6.0
// 

package kotlin.reflect.jvm.internal.impl.protobuf;

import al0.f0;
import java.io.IOException;
import java.io.OutputStream;

public final class CodedOutputStream
{
    public final byte[] a;
    public final int b;
    public int c;
    public final OutputStream d;
    
    public CodedOutputStream(final OutputStream d, final byte[] a) {
        this.d = d;
        this.a = a;
        this.c = 0;
        this.b = a.length;
    }
    
    public static int a(int g, final int n) {
        g = g(g);
        return c(n) + g;
    }
    
    public static int b(int g, final int n) {
        g = g(g);
        return c(n) + g;
    }
    
    public static int c(final int n) {
        if (n >= 0) {
            return e(n);
        }
        return 10;
    }
    
    public static int d(int serializedSize, final l l) {
        final int g = g(serializedSize);
        serializedSize = l.getSerializedSize();
        return e(serializedSize) + serializedSize + g;
    }
    
    public static int e(final int n) {
        if ((n & 0xFFFFFF80) == 0x0) {
            return 1;
        }
        if ((n & 0xFFFFC000) == 0x0) {
            return 2;
        }
        if ((0xFFE00000 & n) == 0x0) {
            return 3;
        }
        if ((n & 0xF0000000) == 0x0) {
            return 4;
        }
        return 5;
    }
    
    public static int f(final long n) {
        if ((0xFFFFFFFFFFFFFF80L & n) == 0x0L) {
            return 1;
        }
        if ((0xFFFFFFFFFFFFC000L & n) == 0x0L) {
            return 2;
        }
        if ((0xFFFFFFFFFFE00000L & n) == 0x0L) {
            return 3;
        }
        if ((0xFFFFFFFFF0000000L & n) == 0x0L) {
            return 4;
        }
        if ((0xFFFFFFF800000000L & n) == 0x0L) {
            return 5;
        }
        if ((0xFFFFFC0000000000L & n) == 0x0L) {
            return 6;
        }
        if ((0xFFFE000000000000L & n) == 0x0L) {
            return 7;
        }
        if ((0xFF00000000000000L & n) == 0x0L) {
            return 8;
        }
        if ((n & Long.MIN_VALUE) == 0x0L) {
            return 9;
        }
        return 10;
    }
    
    public static int g(final int n) {
        return e(n << 3 | 0x0);
    }
    
    public static CodedOutputStream i(final OutputStream outputStream, final int n) {
        return new CodedOutputStream(outputStream, new byte[n]);
    }
    
    public final void h() throws IOException {
        if (this.d != null) {
            this.j();
        }
    }
    
    public final void j() throws IOException {
        final OutputStream d = this.d;
        if (d != null) {
            d.write(this.a, 0, this.c);
            this.c = 0;
            return;
        }
        throw new OutOfSpaceException();
    }
    
    public final void k(final int n, final int n2) throws IOException {
        this.v(n, 0);
        this.m(n2);
    }
    
    public final void l(final int n, final int n2) throws IOException {
        this.v(n, 0);
        this.m(n2);
    }
    
    public final void m(final int n) throws IOException {
        if (n >= 0) {
            this.t(n);
        }
        else {
            this.u(n);
        }
    }
    
    public final void n(final int n, final l l) throws IOException {
        this.v(n, 2);
        this.t(l.getSerializedSize());
        l.writeTo(this);
    }
    
    public final void o(int n) throws IOException {
        n = (byte)n;
        if (this.c == this.b) {
            this.j();
        }
        this.a[this.c++] = (byte)n;
    }
    
    public final void p(final c c) throws IOException {
        final int size = c.size();
        final int b = this.b;
        final int c2 = this.c;
        final int n = b - c2;
        if (n >= size) {
            c.c(this.a, 0, c2, size);
            this.c += size;
        }
        else {
            c.c(this.a, 0, c2, n);
            final int n2 = n + 0;
            final int c3 = size - n;
            this.c = this.b;
            this.j();
            if (c3 <= this.b) {
                c.c(this.a, n2, 0, c3);
                this.c = c3;
            }
            else {
                final OutputStream d = this.d;
                if (n2 < 0) {
                    throw new IndexOutOfBoundsException(f0.f(30, "Source offset < 0: ", n2));
                }
                if (c3 < 0) {
                    throw new IndexOutOfBoundsException(f0.f(23, "Length < 0: ", c3));
                }
                final int n3 = n2 + c3;
                if (n3 > c.size()) {
                    throw new IndexOutOfBoundsException(f0.f(39, "Source end offset exceeded: ", n3));
                }
                if (c3 > 0) {
                    c.x(d, n2, c3);
                }
            }
        }
    }
    
    public final void q(final byte[] array) throws IOException {
        final int length = array.length;
        final int b = this.b;
        final int c = this.c;
        final int n = b - c;
        if (n >= length) {
            System.arraycopy(array, 0, this.a, c, length);
            this.c += length;
        }
        else {
            System.arraycopy(array, 0, this.a, c, n);
            final int n2 = n + 0;
            final int c2 = length - n;
            this.c = this.b;
            this.j();
            if (c2 <= this.b) {
                System.arraycopy(array, n2, this.a, 0, c2);
                this.c = c2;
            }
            else {
                this.d.write(array, n2, c2);
            }
        }
    }
    
    public final void r(final int n) throws IOException {
        this.o(n & 0xFF);
        this.o(n >> 8 & 0xFF);
        this.o(n >> 16 & 0xFF);
        this.o(n >> 24 & 0xFF);
    }
    
    public final void s(final long n) throws IOException {
        this.o((int)n & 0xFF);
        this.o((int)(n >> 8) & 0xFF);
        this.o((int)(n >> 16) & 0xFF);
        this.o((int)(n >> 24) & 0xFF);
        this.o((int)(n >> 32) & 0xFF);
        this.o((int)(n >> 40) & 0xFF);
        this.o((int)(n >> 48) & 0xFF);
        this.o((int)(n >> 56) & 0xFF);
    }
    
    public final void t(int n) throws IOException {
        while ((n & 0xFFFFFF80) != 0x0) {
            this.o((n & 0x7F) | 0x80);
            n >>>= 7;
        }
        this.o(n);
    }
    
    public final void u(long n) throws IOException {
        while ((0xFFFFFFFFFFFFFF80L & n) != 0x0L) {
            this.o(((int)n & 0x7F) | 0x80);
            n >>>= 7;
        }
        this.o((int)n);
    }
    
    public final void v(final int n, final int n2) throws IOException {
        this.t(n << 3 | n2);
    }
    
    public static class OutOfSpaceException extends IOException
    {
        public OutOfSpaceException() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
    }
}
