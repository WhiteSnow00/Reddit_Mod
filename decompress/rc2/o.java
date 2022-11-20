// 
// Decompiled by Procyon v0.6.0
// 

package rc2;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import com.sendbird.android.shadow.okio.ByteString;
import java.io.IOException;
import com.sendbird.android.shadow.okio.a;

public final class o implements d
{
    public final a f;
    public final s g;
    public boolean h;
    
    public o(final s g) {
        this.f = new a();
        this.g = g;
    }
    
    public final void L(final a a, final long n) throws IOException {
        if (!this.h) {
            this.f.L(a, n);
            this.Y0();
            return;
        }
        throw new IllegalStateException("closed");
    }
    
    public final a S0() {
        return this.f;
    }
    
    public final d X0() throws IOException {
        if (!this.h) {
            final a f = this.f;
            final long g = f.g;
            if (g > 0L) {
                this.g.L(f, g);
            }
            return (d)this;
        }
        throw new IllegalStateException("closed");
    }
    
    public final d Y0() throws IOException {
        if (!this.h) {
            final long h = this.f.h();
            if (h > 0L) {
                this.g.L(this.f, h);
            }
            return (d)this;
        }
        throw new IllegalStateException("closed");
    }
    
    public final d a(final int n, final int n2, final byte[] array) throws IOException {
        if (!this.h) {
            this.f.w(n, n2, array);
            this.Y0();
            return (d)this;
        }
        throw new IllegalStateException("closed");
    }
    
    public final d a1(final String s) throws IOException {
        if (!this.h) {
            final a f = this.f;
            f.getClass();
            f.I(0, s.length(), s);
            this.Y0();
            return (d)this;
        }
        throw new IllegalStateException("closed");
    }
    
    public final d b(final ByteString byteString) throws IOException {
        if (!this.h) {
            this.f.x(byteString);
            this.Y0();
            return (d)this;
        }
        throw new IllegalStateException("closed");
    }
    
    public final void close() throws IOException {
        if (this.h) {
            return;
        }
        try {
            final a f = this.f;
            final long g = f.g;
            if (g > 0L) {
                this.g.L(f, g);
            }
        }
        finally {}
        Throwable t = null;
        try {
            this.g.close();
        }
        finally {
            final Throwable t2;
            t = t2;
            if (t2 == null) {
                final Throwable t3;
                t = t3;
            }
        }
        this.h = true;
        if (t == null) {
            return;
        }
        final Charset a = v.a;
        throw t;
    }
    
    public final long d(final t t) throws IOException {
        long n = 0L;
        while (true) {
            final long m = ((l)t).m(this.f, 8192L);
            if (m == -1L) {
                break;
            }
            n += m;
            this.Y0();
        }
        return n;
    }
    
    public final void flush() throws IOException {
        if (!this.h) {
            final a f = this.f;
            final long g = f.g;
            if (g > 0L) {
                this.g.L(f, g);
            }
            this.g.flush();
            return;
        }
        throw new IllegalStateException("closed");
    }
    
    public final d i(final long n) throws IOException {
        if (!this.h) {
            this.f.B(n);
            this.Y0();
            return (d)this;
        }
        throw new IllegalStateException("closed");
    }
    
    public final boolean isOpen() {
        return this.h ^ true;
    }
    
    public final u timeout() {
        return this.g.timeout();
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("buffer(");
        t.append(this.g);
        t.append(")");
        return t.toString();
    }
    
    public final int write(final ByteBuffer byteBuffer) throws IOException {
        if (!this.h) {
            final int write = this.f.write(byteBuffer);
            this.Y0();
            return write;
        }
        throw new IllegalStateException("closed");
    }
    
    public final d write(final byte[] array) throws IOException {
        if (!this.h) {
            this.f.write(array);
            this.Y0();
            return (d)this;
        }
        throw new IllegalStateException("closed");
    }
    
    public final d writeByte(final int n) throws IOException {
        if (!this.h) {
            this.f.A(n);
            this.Y0();
            return (d)this;
        }
        throw new IllegalStateException("closed");
    }
    
    public final d writeInt(final int n) throws IOException {
        if (!this.h) {
            this.f.E(n);
            this.Y0();
            return (d)this;
        }
        throw new IllegalStateException("closed");
    }
    
    public final d writeShort(final int n) throws IOException {
        if (!this.h) {
            this.f.F(n);
            this.Y0();
            return (d)this;
        }
        throw new IllegalStateException("closed");
    }
}
