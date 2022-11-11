// 
// Decompiled by Procyon v0.6.0
// 

package rc2;

import java.net.ProtocolException;
import com.sendbird.android.shadow.okhttp3.internal.Internal;
import pc2.j;
import lc2.q$a;
import com.sendbird.android.shadow.okhttp3.internal.http2.StreamResetException;
import lc2.a0$a;
import java.util.logging.Logger;
import xc2.t;
import xc2.p;
import lc2.a0;
import lc2.z;
import java.util.concurrent.TimeUnit;
import java.io.IOException;
import lc2.q;
import com.sendbird.android.shadow.okhttp3.internal.http2.ConnectionShutdownException;
import com.sendbird.android.shadow.okhttp3.internal.http2.ErrorCode;
import com.sendbird.android.shadow.okio.ByteString;
import java.util.Locale;
import pc2.h;
import java.util.ArrayList;
import xc2.s;
import lc2.w;
import pc2.f;
import lc2.u;
import mc2.a;
import com.sendbird.android.shadow.okhttp3.Protocol;
import oc2.g;
import lc2.s$a;
import java.util.List;
import pc2.c;

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
        f = a.o((Object[])new String[] { "connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority" });
        g = a.o((Object[])new String[] { "connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade" });
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
    
    public final s a(w d, final long n) {
        d = (w)this.d;
        synchronized (d) {
            if (!((n)d).f && !((n)d).e()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
            return (s)((n)d).h;
        }
    }
    
    public final void b(w w) throws IOException {
        if (this.d != null) {
            return;
        }
        final z d = w.d;
        final int n = 0;
        final boolean b = d != null;
        final q c = w.c;
        final ArrayList list = new ArrayList<rc2.a>(c.a.length / 2 + 4);
        list.add(new rc2.a(rc2.a.f, w.b));
        list.add(new rc2.a(rc2.a.g, h.a(w.a)));
        final String a = w.a("Host");
        if (a != null) {
            list.add(new rc2.a(rc2.a.i, a));
        }
        list.add(new rc2.a(rc2.a.h, w.a.a));
        for (int n2 = c.a.length / 2, i = 0; i < n2; ++i) {
            final ByteString encodeUtf8 = ByteString.encodeUtf8(c.d(i).toLowerCase(Locale.US));
            if (!rc2.d.f.contains(encodeUtf8.utf8())) {
                list.add(new rc2.a(encodeUtf8, c.g(i)));
            }
        }
        final e c2 = this.c;
        final boolean b2 = b ^ true;
        w = (w)c2.v;
        synchronized (w) {
            synchronized (c2) {
                if (c2.k > 1073741823) {
                    c2.h(ErrorCode.REFUSED_STREAM);
                }
                if (c2.l) {
                    throw new ConnectionShutdownException();
                }
                final int k = c2.k;
                c2.k = k + 2;
                final n d2 = new n(k, c2, b2, false, null);
                int n3 = 0;
                Label_0337: {
                    if (b && c2.r != 0L) {
                        n3 = n;
                        if (d2.b != 0L) {
                            break Label_0337;
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
                Label_0529: {
                    try {
                        if (!v.j) {
                            v.g(b2, k, list);
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
                            w = (w)d2.i;
                            final long n4 = ((f)this.a).j;
                            final TimeUnit milliseconds = TimeUnit.MILLISECONDS;
                            ((xc2.u)w).g(n4, milliseconds);
                            ((xc2.u)this.d.j).g((long)((f)this.a).k, milliseconds);
                            return;
                        }
                    }
                    finally {
                        break Label_0529;
                    }
                    throw new IOException("closed");
                }
                monitorexit(v);
            }
        }
    }
    
    public final pc2.g c(final a0 a0) throws IOException {
        this.b.f.getClass();
        final String c = a0.c("Content-Type");
        final long a2 = pc2.e.a(a0);
        final d.d$a d$a = new d.d$a(this, this.d.g);
        final Logger a3 = xc2.n.a;
        return new pc2.g(c, a2, new p((t)d$a));
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
            ((xc2.c)((n)d).i).j();
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
                    else if (!rc2.d.g.contains(d2)) {
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
}
