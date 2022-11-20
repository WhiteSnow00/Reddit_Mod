// 
// Decompiled by Procyon v0.6.0
// 

package lc2;

import java.net.SocketTimeoutException;
import rc2.c;
import rc2.t;
import rc2.u;
import com.sendbird.android.shadow.okio.a;
import rc2.s;
import java.io.InterruptedIOException;
import com.sendbird.android.shadow.okhttp3.internal.http2.StreamResetException;
import java.io.IOException;
import fc2.q;
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
    public final c i;
    public final c j;
    public ErrorCode k;
    
    public n(final int c, final e d, final boolean h, final boolean j, final q q) {
        this.a = 0L;
        final ArrayDeque e = new ArrayDeque();
        this.e = e;
        this.i = new c();
        this.j = new c();
        this.k = null;
        if (d == null) {
            throw new NullPointerException("connection == null");
        }
        this.c = c;
        this.d = d;
        this.b = d.t.a();
        final b g = new b(d.s.a());
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
                this.d.k(this.c);
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
        this.d.v.l(this.c, errorCode);
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
            this.d.k(this.c);
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
        public final n i;
        
        public a(final n i) {
            this.i = i;
            this.f = new com.sendbird.android.shadow.okio.a();
        }
        
        public final void L(final com.sendbird.android.shadow.okio.a a, final long n) throws IOException {
            this.f.L(a, n);
            while (this.f.g >= 16384L) {
                this.a(false);
            }
        }
        
        public final void a(final boolean b) throws IOException {
            synchronized (this.i) {
                this.i.j.j();
                try {
                    n i;
                    while (true) {
                        i = this.i;
                        if (i.b > 0L || this.h || this.g || i.k != null) {
                            break;
                        }
                        i.g();
                    }
                    i.j.p();
                    this.i.b();
                    final long min = Math.min(this.i.b, this.f.g);
                    final n j = this.i;
                    j.b -= min;
                    monitorexit(this.i);
                    j.j.j();
                    try {
                        final n k = this.i;
                        k.d.o(k.c, b && min == this.f.g, this.f, min);
                    }
                    finally {
                        this.i.j.p();
                    }
                }
                finally {
                    this.i.j.p();
                }
            }
        }
        
        public final void close() throws IOException {
            synchronized (this.i) {
                if (this.g) {
                    return;
                }
                monitorexit(this.i);
                final n i = this.i;
                if (!i.h.h) {
                    if (this.f.g > 0L) {
                        while (this.f.g > 0L) {
                            this.a(true);
                        }
                    }
                    else {
                        i.d.o(i.c, true, null, 0L);
                    }
                }
                synchronized (this.i) {
                    this.g = true;
                    monitorexit(this.i);
                    this.i.d.flush();
                    this.i.a();
                }
            }
        }
        
        public final void flush() throws IOException {
            synchronized (this.i) {
                this.i.b();
                monitorexit(this.i);
                while (this.f.g > 0L) {
                    this.a(false);
                    this.i.d.flush();
                }
            }
        }
        
        public final u timeout() {
            return (u)this.i.j;
        }
    }
    
    public final class b implements t
    {
        public final com.sendbird.android.shadow.okio.a f;
        public final com.sendbird.android.shadow.okio.a g;
        public final long h;
        public boolean i;
        public boolean j;
        public final n k;
        
        public b(final n k, final long h) {
            this.k = k;
            this.f = new com.sendbird.android.shadow.okio.a();
            this.g = new com.sendbird.android.shadow.okio.a();
            this.h = h;
        }
        
        public final void close() throws IOException {
            synchronized (this.k) {
                this.i = true;
                final com.sendbird.android.shadow.okio.a g = this.g;
                final long g2 = g.g;
                g.b();
                if (!this.k.e.isEmpty()) {
                    this.k.getClass();
                }
                this.k.notifyAll();
                monitorexit(this.k);
                if (g2 > 0L) {
                    this.k.d.n(g2);
                }
                this.k.a();
            }
        }
        
        public final long m(final com.sendbird.android.shadow.okio.a a, long n) throws IOException {
            if (n >= 0L) {
                while (true) {
                    ErrorCode errorCode = null;
                    synchronized (this.k) {
                        this.k.i.j();
                        try {
                            final n k = this.k;
                            final ErrorCode i = k.k;
                            if (i != null) {
                                errorCode = i;
                            }
                            if (this.i) {
                                throw new IOException("stream closed");
                            }
                            if (!k.e.isEmpty()) {
                                this.k.getClass();
                            }
                            final com.sendbird.android.shadow.okio.a g = this.g;
                            final long g2 = g.g;
                            if (g2 > 0L) {
                                final long m = g.m(a, Math.min(n, g2));
                                final n j = this.k;
                                final long a2 = j.a + m;
                                j.a = a2;
                                n = m;
                                if (errorCode == null) {
                                    n = m;
                                    if (a2 >= j.d.s.a() / 2) {
                                        final n l = this.k;
                                        l.d.q(l.c, l.a);
                                        this.k.a = 0L;
                                        n = m;
                                    }
                                }
                            }
                            else {
                                if (!this.j && errorCode == null) {
                                    this.k.g();
                                    continue;
                                }
                                n = -1L;
                            }
                            this.k.i.p();
                            monitorexit(this.k);
                            if (n != -1L) {
                                this.k.d.n(n);
                                return n;
                            }
                            if (errorCode == null) {
                                return -1L;
                            }
                            throw new StreamResetException(errorCode);
                        }
                        finally {
                            this.k.i.p();
                        }
                    }
                    break;
                }
            }
            throw new IllegalArgumentException(m5.a.e("byteCount < 0: ", n));
        }
        
        public final u timeout() {
            return (u)this.k.i;
        }
    }
    
    public final class c extends rc2.c
    {
        public final n k;
        
        public c(final n k) {
            this.k = k;
        }
        
        public final IOException n(final IOException ex) {
            final SocketTimeoutException ex2 = new SocketTimeoutException("timeout");
            if (ex != null) {
                ex2.initCause(ex);
            }
            return ex2;
        }
        
        public final void o() {
            final n k = this.k;
            final ErrorCode cancel = ErrorCode.CANCEL;
            if (k.d(cancel)) {
                k.d.p(k.c, cancel);
            }
        }
        
        public final void p() throws IOException {
            if (!this.m()) {
                return;
            }
            throw this.n(null);
        }
    }
}
