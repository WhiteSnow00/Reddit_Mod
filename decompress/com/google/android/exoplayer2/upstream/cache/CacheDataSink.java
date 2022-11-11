// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.upstream.cache;

import java.io.FileOutputStream;
import java.io.Closeable;
import ad.c0;
import java.io.IOException;
import zc.l;
import java.io.OutputStream;
import java.io.File;
import com.google.android.exoplayer2.upstream.b;
import yc.h;

public final class CacheDataSink implements h
{
    public final Cache a;
    public final long b;
    public final int c;
    public b d;
    public long e;
    public File f;
    public OutputStream g;
    public long h;
    public long i;
    public l j;
    
    public CacheDataSink(final Cache a) {
        this.a = a;
        this.b = 5242880L;
        this.c = 20480;
    }
    
    public final void a(final b d) throws CacheDataSinkException {
        d.h.getClass();
        final long g = d.g;
        final int n = 1;
        if (g == -1L && (d.i & 0x2) == 0x2) {
            this.d = null;
            return;
        }
        this.d = d;
        int n2;
        if ((d.i & 0x4) == 0x4) {
            n2 = n;
        }
        else {
            n2 = 0;
        }
        long b;
        if (n2 != 0) {
            b = this.b;
        }
        else {
            b = Long.MAX_VALUE;
        }
        this.e = b;
        this.i = 0L;
        try {
            this.c(d);
        }
        catch (final IOException ex) {
            throw new CacheDataSinkException(ex);
        }
    }
    
    public final void b() throws IOException {
        final OutputStream g = this.g;
        if (g == null) {
            return;
        }
        try {
            g.flush();
            c0.g(this.g);
            this.g = null;
            final File f = this.f;
            this.f = null;
            this.a.l(f, this.h);
        }
        finally {
            c0.g(this.g);
            this.g = null;
            final File f2 = this.f;
            this.f = null;
            f2.delete();
        }
    }
    
    public final void c(final b b) throws IOException {
        final long g = b.g;
        long min = -1L;
        if (g != -1L) {
            min = Math.min(g - this.i, this.e);
        }
        final Cache a = this.a;
        final String h = b.h;
        final int a2 = c0.a;
        this.f = a.k(b.f + this.i, min, h);
        final FileOutputStream g2 = new FileOutputStream(this.f);
        if (this.c > 0) {
            final l j = this.j;
            if (j == null) {
                this.j = new l(g2, this.c);
            }
            else {
                j.a(g2);
            }
            this.g = this.j;
        }
        else {
            this.g = g2;
        }
        this.h = 0L;
    }
    
    public final void close() throws CacheDataSinkException {
        if (this.d == null) {
            return;
        }
        try {
            this.b();
        }
        catch (final IOException ex) {
            throw new CacheDataSinkException(ex);
        }
    }
    
    public final void write(final byte[] array, final int n, final int n2) throws CacheDataSinkException {
        final b d = this.d;
        if (d == null) {
            return;
        }
        int i = 0;
        while (i < n2) {
            try {
                if (this.h == this.e) {
                    this.b();
                    this.c(d);
                }
                final int n3 = (int)Math.min(n2 - i, this.e - this.h);
                final OutputStream g = this.g;
                final int a = c0.a;
                g.write(array, n + i, n3);
                i += n3;
                final long h = this.h;
                final long n4 = n3;
                this.h = h + n4;
                this.i += n4;
                continue;
            }
            catch (final IOException ex) {
                throw new CacheDataSinkException(ex);
            }
            break;
        }
    }
    
    public static final class CacheDataSinkException extends CacheException
    {
        public CacheDataSinkException(final IOException ex) {
            super(ex);
        }
    }
    
    public static final class a
    {
    }
}
