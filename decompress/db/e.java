// 
// Decompiled by Procyon v0.6.0
// 

package db;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import bd.c0;
import java.io.IOException;
import wa.w;
import zc.f;

public final class e implements i
{
    public final byte[] a;
    public final f b;
    public final long c;
    public long d;
    public byte[] e;
    public int f;
    public int g;
    
    static {
        w.a("goog.exo.extractor");
    }
    
    public e(final f b, final long d, final long c) {
        this.b = b;
        this.d = d;
        this.c = c;
        this.e = new byte[65536];
        this.a = new byte[4096];
    }
    
    public final void b(final int n, final int n2, final byte[] array) throws IOException {
        this.h(array, n, n2, false);
    }
    
    public final boolean f(final byte[] array, final int n, final int n2, final boolean b) throws IOException {
        final int g = this.g;
        final boolean b2 = false;
        int n3;
        if (g == 0) {
            n3 = 0;
        }
        else {
            n3 = Math.min(g, n2);
            System.arraycopy(this.e, 0, array, n, n3);
            this.s(n3);
        }
        while (n3 < n2 && n3 != -1) {
            n3 = this.q(array, n, n2, n3, b);
        }
        if (n3 != -1) {
            this.d += n3;
        }
        boolean b3 = b2;
        if (n3 != -1) {
            b3 = true;
        }
        return b3;
    }
    
    public final long getLength() {
        return this.c;
    }
    
    public final long getPosition() {
        return this.d;
    }
    
    public final boolean h(final byte[] array, final int n, final int n2, final boolean b) throws IOException {
        if (!this.j(n2, b)) {
            return false;
        }
        System.arraycopy(this.e, this.f - n2, array, n, n2);
        return true;
    }
    
    public final void i() {
        this.f = 0;
    }
    
    public final boolean j(final int n, final boolean b) throws IOException {
        this.o(n);
        int i = this.g - this.f;
        while (i < n) {
            i = this.q(this.e, this.f, n, i, b);
            if (i == -1) {
                return false;
            }
            this.g = this.f + i;
        }
        this.f += n;
        return true;
    }
    
    public final long k() {
        return this.d + this.f;
    }
    
    public final void m(final int n) throws IOException {
        this.j(n, false);
    }
    
    public final void n(final int n) throws IOException {
        int n2 = Math.min(this.g, n);
        this.s(n2);
        while (n2 < n && n2 != -1) {
            n2 = this.q(this.a, -n2, Math.min(n, this.a.length + n2), n2, false);
        }
        if (n2 != -1) {
            this.d += n2;
        }
    }
    
    public final void o(int i) {
        i += this.f;
        final byte[] e = this.e;
        if (i > e.length) {
            i = c0.i(e.length * 2, 65536 + i, i + 524288);
            this.e = Arrays.copyOf(this.e, i);
        }
    }
    
    public final int p(final int n, int n2, final byte[] array) throws IOException {
        this.o(n2);
        final int g = this.g;
        final int f = this.f;
        final int n3 = g - f;
        if (n3 == 0) {
            n2 = this.q(this.e, f, n2, 0, true);
            if (n2 == -1) {
                return -1;
            }
            this.g += n2;
        }
        else {
            n2 = Math.min(n2, n3);
        }
        System.arraycopy(this.e, this.f, array, n, n2);
        this.f += n2;
        return n2;
    }
    
    public final int q(final byte[] array, int read, final int n, final int n2, final boolean b) throws IOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        read = this.b.read(array, read + n2, n - n2);
        if (read != -1) {
            return n2 + read;
        }
        if (n2 == 0 && b) {
            return -1;
        }
        throw new EOFException();
    }
    
    public final int r(final int n) throws IOException {
        final int min = Math.min(this.g, n);
        this.s(min);
        int q = min;
        if (min == 0) {
            final byte[] a = this.a;
            q = this.q(a, 0, Math.min(n, a.length), 0, true);
        }
        if (q != -1) {
            this.d += q;
        }
        return q;
    }
    
    public final int read(final byte[] array, final int n, final int n2) throws IOException {
        final int g = this.g;
        int min = 0;
        if (g != 0) {
            min = Math.min(g, n2);
            System.arraycopy(this.e, 0, array, n, min);
            this.s(min);
        }
        int q = min;
        if (min == 0) {
            q = this.q(array, n, n2, 0, true);
        }
        if (q != -1) {
            this.d += q;
        }
        return q;
    }
    
    public final void readFully(final byte[] array, final int n, final int n2) throws IOException {
        this.f(array, n, n2, false);
    }
    
    public final void s(final int n) {
        final int g = this.g - n;
        this.g = g;
        this.f = 0;
        final byte[] e = this.e;
        byte[] e2;
        if (g < e.length - 524288) {
            e2 = new byte[65536 + g];
        }
        else {
            e2 = e;
        }
        System.arraycopy(e, n, e2, 0, g);
        this.e = e2;
    }
}
