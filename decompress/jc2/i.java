// 
// Decompiled by Procyon v0.6.0
// 

package jc2;

import ic2.f$a;
import javax.net.ssl.SSLPeerUnverifiedException;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLHandshakeException;
import java.net.SocketTimeoutException;
import java.io.InterruptedIOException;
import java.io.FileNotFoundException;
import fc2.z;
import fc2.w$a;
import fc2.r$a;
import java.net.Proxy;
import fc2.d0;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.HostnameVerifier;
import fc2.a;
import fc2.n;
import com.sendbird.android.shadow.okhttp3.internal.connection.RouteException;
import com.sendbird.android.shadow.okhttp3.internal.http2.ConnectionShutdownException;
import java.io.IOException;
import java.net.ProtocolException;
import java.io.Closeable;
import gc2.b;
import fc2.a0$a;
import ic2.d;
import fc2.w;
import fc2.r;
import fc2.a0;
import ic2.g;
import fc2.u;
import fc2.s;

public final class i implements s
{
    public final u a;
    public volatile g b;
    public Object c;
    public volatile boolean d;
    
    public i(final u a) {
        this.a = a;
    }
    
    public static int e(final a0 a0, final int n) {
        final String d = a0.d("Retry-After");
        if (d == null) {
            return n;
        }
        if (d.matches("\\d+")) {
            return Integer.valueOf(d);
        }
        return Integer.MAX_VALUE;
    }
    
    public static boolean f(final a0 a0, final r r) {
        final r a2 = a0.f.a;
        return a2.d.equals(r.d) && a2.e == r.e && a2.a.equals(r.a);
    }
    
    public final a0 a(final f f) throws IOException {
        Object o = f.f;
        final fc2.d g = f.g;
        final n h = f.h;
        g g2 = new g(this.a.v, this.b(((w)o).a), g, h, this.c);
        this.b = g2;
        int n = 0;
        Object a = null;
        while (!this.d) {
            try {
                try {
                    final a0 a2 = (a0)(o = f.a((w)o, g2, null, null));
                    if (a != null) {
                        o = new a0$a(a2);
                        a = new a0$a((a0)a);
                        ((a0$a)a).g = null;
                        a = ((a0$a)a).a();
                        if (((a0)a).l != null) {
                            throw new IllegalArgumentException("priorResponse.body != null");
                        }
                        ((a0$a)o).j = (a0)a;
                        o = ((a0$a)o).a();
                    }
                    try {
                        final w c = this.c((a0)o, g2.c);
                        if (c == null) {
                            g2.g();
                            return (a0)o;
                        }
                        gc2.b.e((Closeable)((a0)o).l);
                        if (++n <= 20) {
                            Label_0288: {
                                if (!f((a0)o, c.a)) {
                                    g2.g();
                                    g2 = new g(this.a.v, this.b(c.a), g, h, this.c);
                                    this.b = g2;
                                    break Label_0288;
                                }
                                synchronized (g2.d) {
                                    final c n2 = g2.n;
                                    monitorexit(g2.d);
                                    if (n2 == null) {
                                        a = o;
                                        o = c;
                                        continue;
                                    }
                                    final StringBuilder sb = new StringBuilder();
                                    sb.append("Closing the body of ");
                                    sb.append(o);
                                    sb.append(" didn't close its backing stream. Bad interceptor?");
                                    throw new IllegalStateException(sb.toString());
                                }
                            }
                        }
                        g2.g();
                        throw new ProtocolException(d.h("Too many follow-up requests: ", n));
                    }
                    catch (final IOException ex) {
                        g2.g();
                        throw ex;
                    }
                }
                finally {}
            }
            catch (final IOException ex2) {
                if (this.d(ex2, g2, !(ex2 instanceof ConnectionShutdownException), (w)o)) {
                    continue;
                }
                throw ex2;
            }
            catch (final RouteException ex3) {
                if (this.d(ex3.getLastConnectException(), g2, false, (w)o)) {
                    continue;
                }
                throw ex3.getFirstConnectException();
            }
            g2.h((IOException)null);
            g2.g();
        }
        g2.g();
        throw new IOException("Canceled");
    }
    
    public final a b(final r r) {
        SSLSocketFactory p;
        Object r2;
        fc2.f s;
        if (r.a.equals("https")) {
            final u a = this.a;
            p = a.p;
            r2 = a.r;
            s = a.s;
        }
        else {
            p = null;
            r2 = (s = null);
        }
        final String d = r.d;
        final int e = r.e;
        final u a2 = this.a;
        return new a(d, e, a2.w, a2.o, p, (HostnameVerifier)r2, s, a2.t, a2.g, a2.h, a2.i, a2.m);
    }
    
    public final w c(final a0 a0, final d0 d0) throws IOException {
        final int h = a0.h;
        final String b = a0.f.b;
        z d2 = null;
        if (h != 307 && h != 308) {
            if (h == 401) {
                this.a.u.getClass();
                return null;
            }
            if (h != 503) {
                if (h != 407) {
                    if (h != 408) {
                        switch (h) {
                            default: {
                                return null;
                            }
                            case 300:
                            case 301:
                            case 302:
                            case 303: {
                                break;
                            }
                        }
                    }
                    else {
                        if (!this.a.z) {
                            return null;
                        }
                        final a0 o = a0.o;
                        if (o != null && o.h == 408) {
                            return null;
                        }
                        if (e(a0, 0) > 0) {
                            return null;
                        }
                        return a0.f;
                    }
                }
                else {
                    if (d0.b.type() == Proxy.Type.HTTP) {
                        this.a.t.getClass();
                        return null;
                    }
                    throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                }
            }
            else {
                final a0 o2 = a0.o;
                if (o2 != null && o2.h == 503) {
                    return null;
                }
                if (e(a0, Integer.MAX_VALUE) == 0) {
                    return a0.f;
                }
                return null;
            }
        }
        else if (!b.equals("GET") && !b.equals("HEAD")) {
            return null;
        }
        if (!this.a.y) {
            return null;
        }
        final String d3 = a0.d("Location");
        if (d3 == null) {
            return null;
        }
        final r a2 = a0.f.a;
        a2.getClass();
        r$a r$a;
        try {
            r$a = new r$a();
            r$a.b(a2, d3);
        }
        catch (final IllegalArgumentException ex) {
            r$a = null;
        }
        r a3;
        if (r$a != null) {
            a3 = r$a.a();
        }
        else {
            a3 = null;
        }
        if (a3 == null) {
            return null;
        }
        if (!a3.a.equals(a0.f.a.a) && !this.a.x) {
            return null;
        }
        final w f = a0.f;
        f.getClass();
        final w$a w$a = new w$a(f);
        if (cg.d.A3(b)) {
            final boolean equals = b.equals("PROPFIND");
            if (b.equals("PROPFIND") ^ true) {
                w$a.b("GET", (z)null);
            }
            else {
                if (equals) {
                    d2 = a0.f.d;
                }
                w$a.b(b, d2);
            }
            if (!equals) {
                w$a.c("Transfer-Encoding");
                w$a.c("Content-Length");
                w$a.c("Content-Type");
            }
        }
        if (!f(a0, a3)) {
            w$a.c("Authorization");
        }
        w$a.a = a3;
        return w$a.a();
    }
    
    public final boolean d(final IOException ex, final g g, final boolean b, final w w) {
        g.h(ex);
        if (!this.a.z) {
            return false;
        }
        if (b && ex instanceof FileNotFoundException) {
            return false;
        }
        boolean b2 = false;
        Label_0097: {
            Label_0088: {
                if (!(ex instanceof ProtocolException)) {
                    if (ex instanceof InterruptedIOException) {
                        if (!(ex instanceof SocketTimeoutException) || b) {
                            break Label_0088;
                        }
                    }
                    else {
                        if (ex instanceof SSLHandshakeException && ex.getCause() instanceof CertificateException) {
                            break Label_0088;
                        }
                        if (ex instanceof SSLPeerUnverifiedException) {
                            break Label_0088;
                        }
                    }
                    b2 = true;
                    break Label_0097;
                }
            }
            b2 = false;
        }
        if (!b2) {
            return false;
        }
        if (g.c == null) {
            final f$a b3 = g.b;
            if (b3 == null || b3.b >= b3.a.size()) {
                final ic2.f h = g.h;
                if (h.e >= h.d.size() && h.g.isEmpty()) {
                    return false;
                }
            }
        }
        return true;
    }
}
