// 
// Decompiled by Procyon v0.6.0
// 

package jk2;

import java.io.IOException;
import java.util.zip.Deflater;

public final class g implements e0
{
    public final e f;
    public final Deflater g;
    public boolean h;
    
    public g(final a0 f, final Deflater g) {
        this.f = (e)f;
        this.g = g;
    }
    
    public final void a(final boolean b) {
        final c buffer = this.f.getBuffer();
        c0 j;
        while (true) {
            j = buffer.J(1);
            int n;
            if (b) {
                final Deflater g = this.g;
                final byte[] a = j.a;
                final int c = j.c;
                n = g.deflate(a, c, 8192 - c, 2);
            }
            else {
                final Deflater g2 = this.g;
                final byte[] a2 = j.a;
                final int c2 = j.c;
                n = g2.deflate(a2, c2, 8192 - c2);
            }
            if (n > 0) {
                j.c += n;
                buffer.g += n;
                this.f.Y0();
            }
            else {
                if (this.g.needsInput()) {
                    break;
                }
                continue;
            }
        }
        if (j.b == j.c) {
            buffer.f = j.a();
            d0.a(j);
        }
    }
    
    public final void close() throws IOException {
        if (this.h) {
            return;
        }
        try {
            this.g.finish();
            this.a(false);
        }
        finally {}
        Throwable t = null;
        try {
            this.g.end();
        }
        finally {
            final Throwable t2;
            t = t2;
            if (t2 == null) {
                final Throwable t3;
                t = t3;
            }
        }
        Throwable t4 = null;
        try {
            ((e0)this.f).close();
        }
        finally {
            t4 = t;
            if (t == null) {
                final Throwable t5;
                t4 = t5;
            }
        }
        this.h = true;
        if (t4 == null) {
            return;
        }
    }
    
    public final void flush() throws IOException {
        this.a(true);
        this.f.flush();
    }
    
    public final h0 timeout() {
        return ((e0)this.f).timeout();
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("DeflaterSink(");
        r.append(this.f);
        r.append(')');
        return r.toString();
    }
    
    public final void write(final c c, long n) throws IOException {
        sg2.e.f((Object)c, "source");
        k0.b(c.g, 0L, n);
        while (n > 0L) {
            final c0 f = c.f;
            sg2.e.c((Object)f);
            final int n2 = (int)Math.min(n, f.c - f.b);
            this.g.setInput(f.a, f.b, n2);
            this.a(false);
            final long g = c.g;
            final long n3 = n2;
            c.g = g - n3;
            if ((f.b += n2) == f.c) {
                c.f = f.a();
                d0.a(f);
            }
            n -= n3;
        }
    }
}
