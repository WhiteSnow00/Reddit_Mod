// 
// Decompiled by Procyon v0.6.0
// 

package lc2;

import java.net.ProtocolException;
import com.sendbird.android.shadow.okhttp3.internal.Internal;
import jc2.j;
import fc2.q$a;
import com.sendbird.android.shadow.okhttp3.internal.http2.StreamResetException;
import fc2.a0$a;
import rc2.s;
import java.util.logging.Logger;
import rc2.t;
import rc2.p;
import fc2.a0;
import fc2.z;
import java.util.concurrent.TimeUnit;
import java.io.IOException;
import fc2.q;
import com.sendbird.android.shadow.okhttp3.internal.http2.ConnectionShutdownException;
import com.sendbird.android.shadow.okhttp3.internal.http2.ErrorCode;
import com.sendbird.android.shadow.okio.ByteString;
import java.util.Locale;
import jc2.h;
import java.util.ArrayList;
import fc2.w;
import jc2.f;
import fc2.u;
import gc2.b;
import com.sendbird.android.shadow.okhttp3.Protocol;
import ic2.g;
import fc2.s$a;
import java.util.List;
import jc2.c;

public final class d implements c
{
    public static final List<String> f;
    public static final List<String> g;
    public final s$a a;
    public final g b;
    public final e c;
    public n d;
    public final Protocol e;
    
    static {
        f = b.o("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");
        g = b.o("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");
    }
    
    public d(final u u, final f a, final g b, final e c) {
        this.a = (s$a)a;
        this.b = b;
        this.c = c;
        final List h = u.h;
        Protocol e = Protocol.H2_PRIOR_KNOWLEDGE;
        if (!h.contains(e)) {
            e = Protocol.HTTP_2;
        }
        this.e = e;
    }
    
    public final void a(w w) throws IOException {
        if (this.d != null) {
            return;
        }
        final z d = w.d;
        final int n = 0;
        final boolean b = d != null;
        final q c = w.c;
        final ArrayList list = new ArrayList<lc2.a>(c.a.length / 2 + 4);
        list.add(new lc2.a(lc2.a.f, w.b));
        list.add(new lc2.a(lc2.a.g, h.a(w.a)));
        final String a = w.a("Host");
        if (a != null) {
            list.add(new lc2.a(lc2.a.i, a));
        }
        list.add(new lc2.a(lc2.a.h, w.a.a));
        for (int n2 = c.a.length / 2, i = 0; i < n2; ++i) {
            final ByteString encodeUtf8 = ByteString.encodeUtf8(c.d(i).toLowerCase(Locale.US));
            if (!lc2.d.f.contains(encodeUtf8.utf8())) {
                list.add(new lc2.a(encodeUtf8, c.g(i)));
            }
        }
        final e c2 = this.c;
        final boolean b2 = b ^ true;
        w = (w)c2.v;
        synchronized (w) {
            synchronized (c2) {
                if (c2.k > 1073741823) {
                    c2.l(ErrorCode.REFUSED_STREAM);
                }
                if (c2.l) {
                    throw new ConnectionShutdownException();
                }
                final int k = c2.k;
                c2.k = k + 2;
                final n d2 = new n(k, c2, b2, false, null);
                int n3 = 0;
                Label_0334: {
                    if (b && c2.r != 0L) {
                        n3 = n;
                        if (d2.b != 0L) {
                            break Label_0334;
                        }
                    }
                    n3 = 1;
                }
                if (d2.f()) {
                    c2.h.put(k, d2);
                }
                monitorexit(c2);
                final o v = c2.v;
                monitorenter(v);
                Label_0533: {
                    try {
                        if (!v.j) {
                            v.j(b2, k, list);
                            monitorexit(v);
                            monitorexit(w);
                            if (n3 != 0) {
                                w = (w)c2.v;
                                synchronized (w) {
                                    if (((o)w).j) {
                                        throw new IOException("closed");
                                    }
                                    ((o)w).f.flush();
                                }
                            }
                            this.d = d2;
                            final n.c j = d2.i;
                            final long n4 = ((f)this.a).j;
                            w = (w)TimeUnit.MILLISECONDS;
                            ((rc2.u)j).g(n4, (TimeUnit)w);
                            ((rc2.u)this.d.j).g((long)((f)this.a).k, (TimeUnit)w);
                            return;
                        }
                    }
                    finally {
                        break Label_0533;
                    }
                    throw new IOException("closed");
                }
                monitorexit(v);
            }
        }
    }
    
    public final jc2.g b(final a0 a0) throws IOException {
        this.b.f.getClass();
        final String d = a0.d("Content-Type");
        final long a2 = jc2.e.a(a0);
        final a a3 = new a(this.d.g);
        final Logger a4 = rc2.n.a;
        return new jc2.g(d, a2, new p((t)a3));
    }
    
    public final s c(w d, final long n) {
        d = (w)this.d;
        synchronized (d) {
            if (!((n)d).f && !((n)d).e()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
            return (s)((n)d).h;
        }
    }
    
    public final void cancel() {
        final n d = this.d;
        if (d != null) {
            final ErrorCode cancel = ErrorCode.CANCEL;
            if (d.d(cancel)) {
                d.d.p(d.c, cancel);
            }
        }
    }
    
    public final void finishRequest() throws IOException {
        final n d = this.d;
        synchronized (d) {
            if (!d.f && !d.e()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
            monitorexit(d);
            d.h.close();
        }
    }
    
    public final void flushRequest() throws IOException {
        this.c.flush();
    }
    
    public final a0$a readResponseHeaders(final boolean b) throws IOException {
        Object d = this.d;
        synchronized (d) {
            ((n)d).i.j();
            try {
                while (((n)d).e.isEmpty() && ((n)d).k == null) {
                    ((n)d).g();
                }
                ((n)d).i.p();
                if (((n)d).e.isEmpty()) {
                    throw new StreamResetException(((n)d).k);
                }
                final q q = ((n)d).e.removeFirst();
                monitorexit(d);
                final Protocol e = this.e;
                final q$a q$a = new q$a();
                final int n = q.a.length / 2;
                int i = 0;
                d = null;
                while (i < n) {
                    final String d2 = q.d(i);
                    final String g = q.g(i);
                    if (d2.equals(":status")) {
                        d = new StringBuilder();
                        ((StringBuilder)d).append("HTTP/1.1 ");
                        ((StringBuilder)d).append(g);
                        j.a(((StringBuilder)d).toString());
                    }
                    else if (!lc2.d.g.contains(d2)) {
                        Internal.instance.addLenient(q$a, d2, g);
                    }
                    ++i;
                    d = d;
                }
                if (d == null) {
                    throw new ProtocolException("Expected ':status' header not present");
                }
                final a0$a a0$a = new a0$a();
                a0$a.b = e;
                a0$a.c = ((j)d).b;
                a0$a.d = ((j)d).c;
                a0$a.f = new q(q$a).e();
                if (b && Internal.instance.code(a0$a) == 100) {
                    return null;
                }
                return a0$a;
            }
            finally {
                ((n)d).i.p();
            }
        }
    }
    
    public final class a extends rc2.g
    {
        public boolean g;
        public long h;
        public final d i;
        
        public a(final d i, final n.b b) {
            this.i = i;
            super(b);
            this.g = false;
            this.h = 0L;
        }
        
        public final void close() throws IOException {
            super.close();
            if (!this.g) {
                this.g = true;
                final d i = this.i;
                i.b.i(false, (c)i, (IOException)null);
            }
        }
        
        public final long m(final com.sendbird.android.shadow.okio.a a, long m) throws IOException {
            try {
                m = super.f.m(a, m);
                if (m > 0L) {
                    this.h += m;
                }
                return m;
            }
            catch (final IOException ex) {
                if (!this.g) {
                    this.g = true;
                    final d i = this.i;
                    i.b.i(false, (c)i, ex);
                }
                throw ex;
            }
        }
    }
}
