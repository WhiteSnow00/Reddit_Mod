// 
// Decompiled by Procyon v0.6.0
// 

package com.bumptech.glide.load.data;

import java.io.IOException;
import java.io.InputStream;
import java.io.FilterInputStream;

public final class g extends FilterInputStream
{
    public static final byte[] h;
    public static final int i;
    public final byte f;
    public int g;
    
    static {
        h = new byte[] { -1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0 };
        i = 31;
    }
    
    public g(final InputStream inputStream, final int n) {
        super(inputStream);
        if (n >= -1 && n <= 8) {
            this.f = (byte)n;
            return;
        }
        throw new IllegalArgumentException(d.h("Cannot add invalid orientation: ", n));
    }
    
    @Override
    public final void mark(final int n) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public final boolean markSupported() {
        return false;
    }
    
    @Override
    public final int read() throws IOException {
        final int g = this.g;
        int n = 0;
        Label_0055: {
            if (g >= 2) {
                final int i = com.bumptech.glide.load.data.g.i;
                if (g <= i) {
                    if (g == i) {
                        n = this.f;
                        break Label_0055;
                    }
                    n = (com.bumptech.glide.load.data.g.h[g - 2] & 0xFF);
                    break Label_0055;
                }
            }
            n = super.read();
        }
        if (n != -1) {
            ++this.g;
        }
        return n;
    }
    
    @Override
    public final int read(final byte[] array, int n, int min) throws IOException {
        final int g = this.g;
        final int i = com.bumptech.glide.load.data.g.i;
        if (g > i) {
            n = super.read(array, n, min);
        }
        else if (g == i) {
            array[n] = this.f;
            n = 1;
        }
        else if (g < 2) {
            n = super.read(array, n, 2 - g);
        }
        else {
            min = Math.min(i - g, min);
            System.arraycopy(com.bumptech.glide.load.data.g.h, this.g - 2, array, n, min);
            n = min;
        }
        if (n > 0) {
            this.g += n;
        }
        return n;
    }
    
    @Override
    public final void reset() throws IOException {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public final long skip(long skip) throws IOException {
        skip = super.skip(skip);
        if (skip > 0L) {
            this.g += (int)skip;
        }
        return skip;
    }
}
