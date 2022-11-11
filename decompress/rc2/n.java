// 
// Decompiled by Procyon v0.6.0
// 

package rc2;

import xc2.c;
import al0.g7;
import xc2.t;
import xc2.u;
import com.sendbird.android.shadow.okio.a;
import xc2.s;
import java.io.InterruptedIOException;
import com.sendbird.android.shadow.okhttp3.internal.http2.StreamResetException;
import java.io.IOException;
import lc2.q;
import com.sendbird.android.shadow.okhttp3.internal.http2.ErrorCode;
import java.util.ArrayDeque;

public final class n
{
    public long a;
    public long b;
    public final int c;
    public final e d;
    public final ArrayDeque e;
    public boolean f;
    public final b g;
    public final a h;
    public final n.n$c i;
    public final n.n$c j;
    public ErrorCode k;
    
    public n(final int c, final e d, final boolean h, final boolean j, final q q) {
        this.a = 0L;
        final ArrayDeque e = new ArrayDeque();
        this.e = e;
        this.i = new n.n$c(this);
        this.j = new n.n$c(this);
        this.k = null;
        if (d == null) {
            throw new NullPointerException("connection == null");
        }
        this.c = c;
        this.d = d;
        this.b = d.t.b();
        final b g = new b(d.s.b());
        this.g = g;
        final a h2 = new a();
        this.h = h2;
        g.j = j;
        h2.h = h;
        if (q != null) {
            e.add(q);
        }
        if (this.e() && q != null) {
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
        }
        if (!this.e() && q == null) {
            throw new IllegalStateException("remotely-initiated streams should have headers");
        }
    }
    
    public final void a() throws IOException {
        synchronized (this) {
            final b g = this.g;
            boolean b = false;
            Label_0047: {
                if (!g.j && g.i) {
                    final a h = this.h;
                    if (h.h || h.g) {
                        b = true;
                        break Label_0047;
                    }
                }
                b = false;
            }
            final boolean f = this.f();
            monitorexit(this);
            if (b) {
                this.c(ErrorCode.CANCEL);
            }
            else if (!f) {
                this.d.g(this.c);
            }
        }
    }
    
    public final void b() throws IOException {
        final a h = this.h;
        if (h.g) {
            throw new IOException("stream closed");
        }
        if (h.h) {
            throw new IOException("stream finished");
        }
        if (this.k == null) {
            return;
        }
        throw new StreamResetException(this.k);
    }
    
    public final void c(final ErrorCode errorCode) throws IOException {
        if (!this.d(errorCode)) {
            return;
        }
        this.d.v.j(this.c, errorCode);
    }
    
    public final boolean d(final ErrorCode k) {
        synchronized (this) {
            if (this.k != null) {
                return false;
            }
            if (this.g.j && this.h.h) {
                return false;
            }
            this.k = k;
            this.notifyAll();
            monitorexit(this);
            this.d.g(this.c);
            return true;
        }
    }
    
    public final boolean e() {
        final int c = this.c;
        final boolean b = true;
        return this.d.f == ((c & 0x1) == 0x1) && b;
    }
    
    public final boolean f() {
        synchronized (this) {
            if (this.k != null) {
                return false;
            }
            final b g = this.g;
            if (g.j || g.i) {
                final a h = this.h;
                if ((h.h || h.g) && this.f) {
                    return false;
                }
            }
            return true;
        }
    }
    
    public final void g() throws InterruptedIOException {
        try {
            this.wait();
        }
        catch (final InterruptedException ex) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }
    
    public final class a implements s
    {
        public final com.sendbird.android.shadow.okio.a f;
        public boolean g;
        public boolean h;
        
        public a() {
            this.f = new com.sendbird.android.shadow.okio.a();
        }
        
        public final void P(final com.sendbird.android.shadow.okio.a a, final long n) throws IOException {
            this.f.P(a, n);
            while (this.f.g >= 16384L) {
                this.a(false);
            }
        }
        
        public final void a(final boolean b) throws IOException {
            synchronized (n.this) {
                ((c)n.this.j).j();
                try {
                    n i;
                    while (true) {
                        i = n.this;
                        if (i.b > 0L || this.h || this.g || i.k != null) {
                            break;
                        }
                        i.g();
                    }
                    i.j.p();
                    n.this.b();
                    final long min = Math.min(n.this.b, this.f.g);
                    final n j = n.this;
                    j.b -= min;
                    monitorexit(n.this);
                    ((c)j.j).j();
                    try {
                        final n k = n.this;
                        k.d.n(k.c, b && min == this.f.g, this.f, min);
                    }
                    finally {
                        n.this.j.p();
                    }
                }
                finally {
                    n.this.j.p();
                }
            }
        }
        
        public final void close() throws IOException {
            n n = rc2.n.this;
            synchronized (n) {
                if (this.g) {
                    return;
                }
                monitorexit(n);
                n = rc2.n.this;
                if (!n.h.h) {
                    if (this.f.g > 0L) {
                        while (this.f.g > 0L) {
                            this.a(true);
                        }
                    }
                    else {
                        n.d.n(n.c, true, null, 0L);
                    }
                }
                synchronized (rc2.n.this) {
                    this.g = true;
                    monitorexit(rc2.n.this);
                    rc2.n.this.d.flush();
                    rc2.n.this.a();
                }
            }
        }
        
        public final void flush() throws IOException {
            synchronized (n.this) {
                n.this.b();
                monitorexit(n.this);
                while (this.f.g > 0L) {
                    this.a(false);
                    n.this.d.flush();
                }
            }
        }
        
        public final u timeout() {
            return (u)n.this.j;
        }
    }
    
    public final class b implements t
    {
        public final com.sendbird.android.shadow.okio.a f;
        public final com.sendbird.android.shadow.okio.a g;
        public final long h;
        public boolean i;
        public boolean j;
        
        public b(final long h) {
            this.f = new com.sendbird.android.shadow.okio.a();
            this.g = new com.sendbird.android.shadow.okio.a();
            this.h = h;
        }
        
        public final void close() throws IOException {
            synchronized (n.this) {
                this.i = true;
                final com.sendbird.android.shadow.okio.a g = this.g;
                final long g2 = g.g;
                g.b();
                if (!n.this.e.isEmpty()) {
                    n.this.getClass();
                }
                n.this.notifyAll();
                monitorexit(n.this);
                if (g2 > 0L) {
                    n.this.d.j(g2);
                }
                n.this.a();
            }
        }
        
        public final long m(final com.sendbird.android.shadow.okio.a a, long n) throws IOException {
            if (n >= 0L) {
                while (true) {
                    ErrorCode errorCode = null;
                    synchronized (n.this) {
                        ((c)n.this.i).j();
                        try {
                            final n k = n.this;
                            final ErrorCode i = k.k;
                            if (i != null) {
                                errorCode = i;
                            }
                            if (this.i) {
                                throw new IOException("stream closed");
                            }
                            if (!k.e.isEmpty()) {
                                n.this.getClass();
                            }
                            final com.sendbird.android.shadow.okio.a g = this.g;
                            final long g2 = g.g;
                            if (g2 > 0L) {
                                final long m = g.m(a, Math.min(n, g2));
                                final n j = n.this;
                                final long a2 = j.a + m;
                                j.a = a2;
                                n = m;
                                if (errorCode == null) {
                                    n = m;
                                    if (a2 >= j.d.s.b() / 2) {
                                        final n l = n.this;
                                        l.d.q(l.c, l.a);
                                        n.this.a = 0L;
                                        n = m;
                                    }
                                }
                            }
                            else {
                                if (!this.j && errorCode == null) {
                                    n.this.g();
                                    continue;
                                }
                                n = -1L;
                            }
                            n.this.i.p();
                            monitorexit(n.this);
                            if (n != -1L) {
                                n.this.d.j(n);
                                return n;
                            }
                            if (errorCode == null) {
                                return -1L;
                            }
                            throw new StreamResetException(errorCode);
                        }
                        finally {
                            n.this.i.p();
                        }
                    }
                    break;
                }
            }
            throw new IllegalArgumentException(g7.g("byteCount < 0: ", n));
        }
        
        public final u timeout() {
            return (u)n.this.i;
        }
    }
}
