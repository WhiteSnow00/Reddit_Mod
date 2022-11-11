// 
// Decompiled by Procyon v0.6.0
// 

package com.bumptech.glide.load.data;

import java.io.IOException;
import java.io.FileOutputStream;
import r8.b;
import java.io.OutputStream;

public final class c extends OutputStream
{
    public final OutputStream f;
    public byte[] g;
    public b h;
    public int i;
    
    public c(final FileOutputStream f, final b h) {
        this.f = f;
        this.h = h;
        this.g = (byte[])h.b((Class)byte[].class, 65536);
    }
    
    @Override
    public final void close() throws IOException {
        try {
            this.flush();
            this.f.close();
            final byte[] g = this.g;
            if (g != null) {
                this.h.a((Object)g);
                this.g = null;
            }
        }
        finally {
            this.f.close();
        }
    }
    
    @Override
    public final void flush() throws IOException {
        final int i = this.i;
        if (i > 0) {
            this.f.write(this.g, 0, i);
            this.i = 0;
        }
        this.f.flush();
    }
    
    @Override
    public final void write(final int n) throws IOException {
        final byte[] g = this.g;
        final int i = this.i;
        final int j = i + 1;
        this.i = j;
        g[i] = (byte)n;
        if (j == g.length && j > 0) {
            this.f.write(g, 0, j);
            this.i = 0;
        }
    }
    
    @Override
    public final void write(final byte[] array) throws IOException {
        this.write(array, 0, array.length);
    }
    
    @Override
    public final void write(final byte[] array, final int n, final int n2) throws IOException {
        int n3 = 0;
        int n4;
        do {
            final int n5 = n2 - n3;
            final int n6 = n + n3;
            final int i = this.i;
            if (i == 0 && n5 >= this.g.length) {
                this.f.write(array, n6, n5);
                return;
            }
            final int min = Math.min(n5, this.g.length - i);
            System.arraycopy(array, n6, this.g, this.i, min);
            final int j = this.i + min;
            this.i = j;
            n4 = n3 + min;
            final byte[] g = this.g;
            if (j != g.length || j <= 0) {
                continue;
            }
            this.f.write(g, 0, j);
            this.i = 0;
        } while ((n3 = n4) < n2);
    }
}
