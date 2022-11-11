// 
// Decompiled by Procyon v0.6.0
// 

package rc2;

import xc2.s;
import java.util.ArrayList;
import com.sendbird.android.shadow.okhttp3.internal.http2.ErrorCode;
import com.sendbird.android.shadow.okio.ByteString;
import java.util.logging.Level;
import java.io.IOException;
import java.util.Arrays;
import z0.w;
import com.sendbird.android.shadow.okio.a;
import xc2.d;
import java.util.logging.Logger;
import java.io.Closeable;

public final class o implements Closeable
{
    public static final Logger l;
    public final d f;
    public final boolean g;
    public final a h;
    public int i;
    public boolean j;
    public final b.b k;
    
    static {
        l = Logger.getLogger(c.class.getName());
    }
    
    public o(final d f, final boolean g) {
        this.f = f;
        this.g = g;
        final a h = new a();
        this.h = h;
        this.k = new b.b(h);
        this.i = 16384;
    }
    
    public final void a(final w w) throws IOException {
        synchronized (this) {
            if (!this.j) {
                int i = this.i;
                final int b = w.b;
                if ((b & 0x20) != 0x0) {
                    i = ((int[])w.c)[5];
                }
                this.i = i;
                int n;
                if ((b & 0x2) != 0x0) {
                    n = ((int[])w.c)[1];
                }
                else {
                    n = -1;
                }
                if (n != -1) {
                    final b.b k = this.k;
                    int n2;
                    if ((b & 0x2) != 0x0) {
                        n2 = ((int[])w.c)[1];
                    }
                    else {
                        n2 = -1;
                    }
                    k.getClass();
                    final int min = Math.min(n2, 16384);
                    final int d = k.d;
                    if (d != min) {
                        if (min < d) {
                            k.b = Math.min(k.b, min);
                        }
                        k.c = true;
                        k.d = min;
                        final int h = k.h;
                        if (min < h) {
                            if (min == 0) {
                                Arrays.fill(k.e, null);
                                k.f = k.e.length - 1;
                                k.g = 0;
                                k.h = 0;
                            }
                            else {
                                k.a(h - min);
                            }
                        }
                    }
                }
                this.c(0, 0, (byte)4, (byte)1);
                this.f.flush();
                return;
            }
            throw new IOException("closed");
        }
    }
    
    public final void b(final boolean b, final int n, final a a, final int n2) throws IOException {
        synchronized (this) {
            if (!this.j) {
                byte b2;
                if (b) {
                    b2 = 1;
                }
                else {
                    b2 = 0;
                }
                this.c(n, n2, (byte)0, b2);
                if (n2 > 0) {
                    ((s)this.f).P(a, (long)n2);
                }
                return;
            }
            throw new IOException("closed");
        }
    }
    
    public final void c(final int n, final int n2, final byte b, final byte b2) throws IOException {
        final Logger l = o.l;
        if (l.isLoggable(Level.FINE)) {
            l.fine(c.a(false, n, n2, b, b2));
        }
        final int i = this.i;
        if (n2 > i) {
            final ByteString a = c.a;
            throw new IllegalArgumentException(mc2.a.l("FRAME_SIZE_ERROR length > %d: %d", new Object[] { i, n2 }));
        }
        if ((Integer.MIN_VALUE & n) == 0x0) {
            final d f = this.f;
            f.writeByte(n2 >>> 16 & 0xFF);
            f.writeByte(n2 >>> 8 & 0xFF);
            f.writeByte(n2 & 0xFF);
            this.f.writeByte(b & 0xFF);
            this.f.writeByte(b2 & 0xFF);
            this.f.writeInt(n & Integer.MAX_VALUE);
            return;
        }
        final ByteString a2 = c.a;
        throw new IllegalArgumentException(mc2.a.l("reserved bit set: %s", new Object[] { n }));
    }
    
    @Override
    public final void close() throws IOException {
        synchronized (this) {
            this.j = true;
            ((s)this.f).close();
        }
    }
    
    public final void f(final int n, final ErrorCode errorCode, final byte[] array) throws IOException {
        synchronized (this) {
            if (this.j) {
                throw new IOException("closed");
            }
            if (errorCode.httpCode != -1) {
                this.c(0, array.length + 8, (byte)7, (byte)0);
                this.f.writeInt(n);
                this.f.writeInt(errorCode.httpCode);
                if (array.length > 0) {
                    this.f.write(array);
                }
                this.f.flush();
                return;
            }
            final ByteString a = c.a;
            throw new IllegalArgumentException(mc2.a.l("errorCode.httpCode == -1", new Object[0]));
        }
    }
    
    public final void g(final boolean b, final int n, final ArrayList list) throws IOException {
        if (!this.j) {
            this.k.d(list);
            final long g = this.h.g;
            final int n2 = (int)Math.min(this.i, g);
            final long n3 = n2;
            final long n4 = lcmp(g, n3);
            byte b2;
            if (n4 == 0) {
                b2 = 4;
            }
            else {
                b2 = 0;
            }
            byte b3 = b2;
            if (b) {
                b3 = (byte)(b2 | 0x1);
            }
            this.c(n, n2, (byte)1, b3);
            ((s)this.f).P(this.h, n3);
            if (n4 > 0) {
                this.p(n, g - n3);
            }
            return;
        }
        throw new IOException("closed");
    }
    
    public final void h(final boolean b, final int n, final int n2) throws IOException {
        synchronized (this) {
            if (!this.j) {
                byte b2;
                if (b) {
                    b2 = 1;
                }
                else {
                    b2 = 0;
                }
                this.c(0, 8, (byte)6, b2);
                this.f.writeInt(n);
                this.f.writeInt(n2);
                this.f.flush();
                return;
            }
            throw new IOException("closed");
        }
    }
    
    public final void j(final int n, final ErrorCode errorCode) throws IOException {
        synchronized (this) {
            if (this.j) {
                throw new IOException("closed");
            }
            if (errorCode.httpCode != -1) {
                this.c(n, 4, (byte)3, (byte)0);
                this.f.writeInt(errorCode.httpCode);
                this.f.flush();
                return;
            }
            throw new IllegalArgumentException();
        }
    }
    
    public final void n(final int n, final long n2) throws IOException {
        synchronized (this) {
            if (this.j) {
                throw new IOException("closed");
            }
            if (n2 != 0L && n2 <= 2147483647L) {
                this.c(n, 4, (byte)8, (byte)0);
                this.f.writeInt((int)n2);
                this.f.flush();
                return;
            }
            final ByteString a = c.a;
            throw new IllegalArgumentException(mc2.a.l("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", new Object[] { n2 }));
        }
    }
    
    public final void p(final int n, long n2) throws IOException {
        while (n2 > 0L) {
            final int n3 = (int)Math.min(this.i, n2);
            final long n4 = n3;
            n2 -= n4;
            byte b;
            if (n2 == 0L) {
                b = 4;
            }
            else {
                b = 0;
            }
            this.c(n, n3, (byte)9, b);
            ((s)this.f).P(this.h, n4);
        }
    }
}
