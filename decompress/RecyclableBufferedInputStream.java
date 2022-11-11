// 
// Decompiled by Procyon v0.6.0
// 

package com.bumptech.glide.load.resource.bitmap;

import java.io.IOException;
import java.io.InputStream;
import r8.b;
import java.io.FilterInputStream;

public final class RecyclableBufferedInputStream extends FilterInputStream
{
    public volatile byte[] f;
    public int g;
    public int h;
    public int i;
    public int j;
    public final b k;
    
    public RecyclableBufferedInputStream(final InputStream inputStream, final b k) {
        super(inputStream);
        this.i = -1;
        this.k = k;
        this.f = (byte[])k.b((Class)byte[].class, 65536);
    }
    
    public static void h() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }
    
    public final int a(final InputStream inputStream, final byte[] array) throws IOException {
        final int i = this.i;
        if (i != -1) {
            final int j = this.j;
            int h = this.h;
            if (j - i < h) {
                byte[] f;
                if (i == 0 && h > array.length && this.g == array.length) {
                    final int n = array.length * 2;
                    if (n <= h) {
                        h = n;
                    }
                    f = (byte[])this.k.b((Class)byte[].class, h);
                    System.arraycopy(array, 0, f, 0, array.length);
                    this.f = f;
                    this.k.a((Object)array);
                }
                else {
                    f = array;
                    if (i > 0) {
                        System.arraycopy(array, i, array, 0, array.length - i);
                        f = array;
                    }
                }
                final int k = this.j - this.i;
                this.j = k;
                this.i = 0;
                this.g = 0;
                final int read = inputStream.read(f, k, f.length - k);
                int l = this.j;
                if (read > 0) {
                    l += read;
                }
                this.g = l;
                return read;
            }
        }
        final int read2 = inputStream.read(array);
        if (read2 > 0) {
            this.i = -1;
            this.j = 0;
            this.g = read2;
        }
        return read2;
    }
    
    @Override
    public final int available() throws IOException {
        synchronized (this) {
            final InputStream in = super.in;
            if (this.f != null && in != null) {
                final int g = this.g;
                final int j = this.j;
                final int available = in.available();
                monitorexit(this);
                return g - j + available;
            }
            h();
            throw null;
        }
    }
    
    public final void b() {
        synchronized (this) {
            if (this.f != null) {
                this.k.a((Object)this.f);
                this.f = null;
            }
        }
    }
    
    @Override
    public final void close() throws IOException {
        if (this.f != null) {
            this.k.a((Object)this.f);
            this.f = null;
        }
        final InputStream in = super.in;
        super.in = null;
        if (in != null) {
            in.close();
        }
    }
    
    @Override
    public final void mark(final int n) {
        synchronized (this) {
            this.h = Math.max(this.h, n);
            this.i = this.j;
        }
    }
    
    @Override
    public final boolean markSupported() {
        return true;
    }
    
    @Override
    public final int read() throws IOException {
        synchronized (this) {
            final byte[] f = this.f;
            final InputStream in = super.in;
            if (f == null || in == null) {
                h();
                throw null;
            }
            if (this.j >= this.g && this.a(in, f) == -1) {
                return -1;
            }
            byte[] f2;
            if ((f2 = f) != this.f) {
                f2 = this.f;
                if (f2 == null) {
                    h();
                    throw null;
                }
            }
            final int g = this.g;
            final int j = this.j;
            if (g - j > 0) {
                this.j = j + 1;
                final byte b = f2[j];
                monitorexit(this);
                return b & 0xFF;
            }
            return -1;
        }
    }
    
    @Override
    public final int read(final byte[] array, int n, final int n2) throws IOException {
        synchronized (this) {
            byte[] f = this.f;
            if (f == null) {
                h();
                throw null;
            }
            if (n2 == 0) {
                return 0;
            }
            final InputStream in = super.in;
            if (in == null) {
                h();
                throw null;
            }
            final int j = this.j;
            final int g = this.g;
            int n5;
            if (j < g) {
                int n3;
                if ((n3 = g - j) >= n2) {
                    n3 = n2;
                }
                System.arraycopy(f, j, array, n, n3);
                this.j += n3;
                if (n3 == n2 || in.available() == 0) {
                    return n3;
                }
                final int n4 = n + n3;
                n = n2 - n3;
                n5 = n4;
            }
            else {
                n5 = n;
                n = n2;
            }
            while (true) {
                final int i = this.i;
                int n6 = -1;
                byte[] f2;
                int n7;
                if (i == -1 && n >= f.length) {
                    final int read = in.read(array, n5, n);
                    f2 = f;
                    if ((n7 = read) == -1) {
                        if (n != n2) {
                            n6 = n2 - n;
                        }
                        return n6;
                    }
                }
                else {
                    if (this.a(in, f) == -1) {
                        if (n != n2) {
                            n6 = n2 - n;
                        }
                        return n6;
                    }
                    if ((f2 = f) != this.f) {
                        f2 = this.f;
                        if (f2 == null) {
                            h();
                            throw null;
                        }
                    }
                    final int g2 = this.g;
                    final int k = this.j;
                    int n8;
                    if ((n8 = g2 - k) >= n) {
                        n8 = n;
                    }
                    System.arraycopy(f2, k, array, n5, n8);
                    this.j += n8;
                    n7 = n8;
                }
                n -= n7;
                if (n == 0) {
                    return n2;
                }
                if (in.available() == 0) {
                    monitorexit(this);
                    return n2 - n;
                }
                n5 += n7;
                f = f2;
            }
        }
    }
    
    @Override
    public final void reset() throws IOException {
        synchronized (this) {
            if (this.f == null) {
                throw new IOException("Stream is closed");
            }
            final int i = this.i;
            if (-1 != i) {
                this.j = i;
                return;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Mark has been invalidated, pos: ");
            sb.append(this.j);
            sb.append(" markLimit: ");
            sb.append(this.h);
            throw new InvalidMarkException(sb.toString());
        }
    }
    
    @Override
    public final long skip(long skip) throws IOException {
        monitorenter(this);
        if (skip < 1L) {
            monitorexit(this);
            return 0L;
        }
        try {
            final byte[] f = this.f;
            if (f == null) {
                h();
                throw null;
            }
            final InputStream in = super.in;
            if (in == null) {
                h();
                throw null;
            }
            final int g = this.g;
            final int j = this.j;
            if (g - j >= skip) {
                this.j = (int)(j + skip);
                return skip;
            }
            final long n = g - (long)j;
            this.j = g;
            if (this.i == -1 || skip > this.h) {
                skip = in.skip(skip - n);
                if (skip > 0L) {
                    this.i = -1;
                }
                monitorexit(this);
                return n + skip;
            }
            if (this.a(in, f) == -1) {
                return n;
            }
            final int g2 = this.g;
            final int i = this.j;
            if (g2 - i >= skip - n) {
                this.j = (int)(i + skip - n);
                return skip;
            }
            final long n2 = g2;
            skip = i;
            this.j = g2;
            monitorexit(this);
            return n + n2 - skip;
        }
        finally {
            monitorexit(this);
        }
    }
    
    public static class InvalidMarkException extends IOException
    {
        private static final long serialVersionUID = -4338378848813561757L;
        
        public InvalidMarkException(final String s) {
            super(s);
        }
    }
}
