// 
// Decompiled by Procyon v0.6.0
// 

package l9;

import java.io.IOException;
import java.io.InputStream;
import java.io.FilterInputStream;

public final class h extends FilterInputStream
{
    public int f;
    
    public h(final d d) {
        super(d);
        this.f = Integer.MIN_VALUE;
    }
    
    @Override
    public final int available() throws IOException {
        final int f = this.f;
        int n;
        if (f == Integer.MIN_VALUE) {
            n = super.available();
        }
        else {
            n = Math.min(f, super.available());
        }
        return n;
    }
    
    public final long f(final long n) {
        final int f = this.f;
        if (f == 0) {
            return -1L;
        }
        long n2 = n;
        if (f != Integer.MIN_VALUE) {
            n2 = n;
            if (n > f) {
                n2 = f;
            }
        }
        return n2;
    }
    
    public final void h(final long n) {
        final int f = this.f;
        if (f != Integer.MIN_VALUE && n != -1L) {
            this.f = (int)(f - n);
        }
    }
    
    @Override
    public final void mark(final int f) {
        synchronized (this) {
            super.mark(f);
            this.f = f;
        }
    }
    
    @Override
    public final int read() throws IOException {
        if (this.f(1L) == -1L) {
            return -1;
        }
        final int read = super.read();
        this.h(1L);
        return read;
    }
    
    @Override
    public final int read(final byte[] array, int read, int n) throws IOException {
        n = (int)this.f(n);
        if (n == -1) {
            return -1;
        }
        read = super.read(array, read, n);
        this.h(read);
        return read;
    }
    
    @Override
    public final void reset() throws IOException {
        synchronized (this) {
            super.reset();
            this.f = Integer.MIN_VALUE;
        }
    }
    
    @Override
    public final long skip(long n) throws IOException {
        n = this.f(n);
        if (n == -1L) {
            return 0L;
        }
        n = super.skip(n);
        this.h(n);
        return n;
    }
}
