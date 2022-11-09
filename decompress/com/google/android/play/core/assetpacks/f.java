// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.play.core.assetpacks;

import java.io.IOException;
import java.util.Arrays;
import eg.a0;
import java.io.InputStream;
import eg.a1;
import java.io.FilterInputStream;

public final class f extends FilterInputStream
{
    public final a1 f;
    public byte[] g;
    public long h;
    public boolean i;
    public boolean j;
    
    public f(final InputStream inputStream) {
        super(inputStream);
        this.f = new a1();
        this.g = new byte[4096];
        this.i = false;
        this.j = false;
    }
    
    public final a0 b() throws IOException {
        if (this.h > 0L) {
            byte[] g;
            do {
                g = this.g;
            } while (this.read(g, 0, g.length) != -1);
        }
        if (this.i || this.j) {
            return new a0((String)null, -1L, -1, false, false, (byte[])null);
        }
        if (!this.h(30)) {
            this.i = true;
            return this.f.b();
        }
        final a0 b = this.f.b();
        if (b.e) {
            this.j = true;
            return b;
        }
        if (b.b == 4294967295L) {
            throw new zzck("Files bigger than 4GiB are not supported.");
        }
        final int n = this.f.f - 30;
        final long n2 = n;
        int length = this.g.length;
        if (n2 > length) {
            int n3;
            do {
                n3 = (length += length);
            } while (n3 < n2);
            this.g = Arrays.copyOf(this.g, n3);
        }
        if (!this.h(n)) {
            this.i = true;
            return this.f.b();
        }
        final a0 b2 = this.f.b();
        this.h = b2.b;
        return b2;
    }
    
    public final boolean h(final int n) throws IOException {
        final int max = Math.max(0, super.read(this.g, 0, n));
        if (max != n) {
            final int n2 = n - max;
            if (Math.max(0, super.read(this.g, max, n2)) != n2) {
                this.f.a(0, max, this.g);
                return false;
            }
        }
        this.f.a(0, n, this.g);
        return true;
    }
    
    @Override
    public final int read(final byte[] array) throws IOException {
        return this.read(array, 0, array.length);
    }
    
    @Override
    public final int read(final byte[] array, int n, int n2) throws IOException {
        final long h = this.h;
        if (h > 0L && !this.i) {
            n2 = super.read(array, n, (int)Math.min(h, n2));
            n = 0;
            n2 = Math.max(0, n2);
            this.h -= n2;
            if (n2 == 0) {
                this.i = true;
            }
            else {
                n = n2;
            }
            return n;
        }
        return -1;
    }
}
