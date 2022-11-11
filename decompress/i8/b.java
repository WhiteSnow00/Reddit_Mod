// 
// Decompiled by Procyon v0.6.0
// 

package i8;

import java.io.UnsupportedEncodingException;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.FileInputStream;
import java.nio.charset.Charset;
import java.io.InputStream;
import java.io.Closeable;

public final class b implements Closeable
{
    public final InputStream f;
    public final Charset g;
    public byte[] h;
    public int i;
    public int j;
    
    public b(final FileInputStream f, final Charset g) {
        if (g == null) {
            throw null;
        }
        if (g.equals(c.a)) {
            this.f = f;
            this.g = g;
            this.h = new byte[8192];
            return;
        }
        throw new IllegalArgumentException("Unsupported encoding");
    }
    
    public final String b() throws IOException {
        synchronized (this.f) {
            final byte[] h = this.h;
            if (h == null) {
                throw new IOException("LineReader is closed");
            }
            if (this.i >= this.j) {
                final int read = this.f.read(h, 0, h.length);
                if (read == -1) {
                    throw new EOFException();
                }
                this.i = 0;
                this.j = read;
            }
            for (int i = this.i; i != this.j; ++i) {
                final byte[] h2 = this.h;
                if (h2[i] == 10) {
                    final int j = this.i;
                    int n = 0;
                    Label_0125: {
                        if (i != j) {
                            n = i - 1;
                            if (h2[n] == 13) {
                                break Label_0125;
                            }
                        }
                        n = i;
                    }
                    final String s = new String(h2, j, n - j, this.g.name());
                    this.i = i + 1;
                    return s;
                }
            }
            final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(this.j - this.i + 80) {
                @Override
                public final String toString() {
                    int count;
                    final int n = count = super.count;
                    if (n > 0) {
                        count = n;
                        if (super.buf[n - 1] == 13) {
                            count = n - 1;
                        }
                    }
                    try {
                        return new String(super.buf, 0, count, b.this.g.name());
                    }
                    catch (final UnsupportedEncodingException ex) {
                        throw new AssertionError((Object)ex);
                    }
                }
            };
            while (true) {
                final byte[] h3 = this.h;
                final int k = this.i;
                byteArrayOutputStream.write(h3, k, this.j - k);
                this.j = -1;
                final InputStream f = this.f;
                final byte[] h4 = this.h;
                final int read2 = f.read(h4, 0, h4.length);
                if (read2 == -1) {
                    throw new EOFException();
                }
                this.i = 0;
                this.j = read2;
                for (int l = 0; l != this.j; ++l) {
                    final byte[] h5 = this.h;
                    if (h5[l] == 10) {
                        final int m = this.i;
                        if (l != m) {
                            byteArrayOutputStream.write(h5, m, l - m);
                        }
                        this.i = l + 1;
                        return byteArrayOutputStream.toString();
                    }
                }
            }
        }
    }
    
    @Override
    public final void close() throws IOException {
        synchronized (this.f) {
            if (this.h != null) {
                this.h = null;
                this.f.close();
            }
        }
    }
}
