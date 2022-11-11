// 
// Decompiled by Procyon v0.6.0
// 

package wc2;

import java.util.logging.Logger;
import xc2.s;
import xc2.o;
import xc2.n;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ThreadFactory;
import java.io.Closeable;
import java.io.Serializable;
import java.net.ProtocolException;
import lc2.a0;
import com.sendbird.android.p0;
import java.util.Collections;
import java.util.concurrent.ScheduledFuture;
import com.sendbird.android.shadow.okio.ByteString;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import lc2.d;
import java.util.Random;
import android.support.v4.media.b;
import lc2.w;
import com.sendbird.android.shadow.okhttp3.Protocol;
import java.util.List;
import lc2.e0;

public final class c implements e0, e$a
{
    public static final List<Protocol> u;
    public final w a;
    public final b b;
    public final Random c;
    public final long d;
    public final String e;
    public d f;
    public final a g;
    public e h;
    public f i;
    public ScheduledThreadPoolExecutor j;
    public c.c$e k;
    public final ArrayDeque<ByteString> l;
    public final ArrayDeque<Object> m;
    public long n;
    public boolean o;
    public ScheduledFuture<?> p;
    public int q;
    public boolean r;
    public int s;
    public boolean t;
    
    static {
        u = Collections.singletonList(Protocol.HTTP_1_1);
    }
    
    public c(final w a, final p0.p0$a b, final Random c, final long d) {
        this.l = new ArrayDeque<ByteString>();
        this.m = new ArrayDeque<Object>();
        this.q = -1;
        if ("GET".equals(a.b)) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            final byte[] array = new byte[16];
            c.nextBytes(array);
            this.e = ByteString.of(array).base64();
            this.g = new a(this);
            return;
        }
        final StringBuilder r = a.r("Request must be GET: ");
        r.append(a.b);
        throw new IllegalArgumentException(r.toString());
    }
    
    public final void a(final a0 a0) throws ProtocolException {
        if (a0.h != 101) {
            final StringBuilder r = a.r("Expected HTTP 101 response but was '");
            r.append(a0.h);
            r.append(" ");
            throw new ProtocolException(a.o(r, a0.i, "'"));
        }
        final String c = a0.c("Connection");
        if (!"Upgrade".equalsIgnoreCase(c)) {
            throw new ProtocolException(a.k("Expected 'Connection' header value 'Upgrade' but was '", c, "'"));
        }
        final String c2 = a0.c("Upgrade");
        if (!"websocket".equalsIgnoreCase(c2)) {
            throw new ProtocolException(a.k("Expected 'Upgrade' header value 'websocket' but was '", c2, "'"));
        }
        final String c3 = a0.c("Sec-WebSocket-Accept");
        final StringBuilder sb = new StringBuilder();
        sb.append(this.e);
        sb.append("258EAFA5-E914-47DA-95CA-C5AB0DC85B11");
        final String base64 = ByteString.encodeUtf8(sb.toString()).sha1().base64();
        if (base64.equals(c3)) {
            return;
        }
        throw new ProtocolException(al0.a.k("Expected 'Sec-WebSocket-Accept' header value '", base64, "' but was '", c3, "'"));
    }
    
    public final boolean b(final int n, final String s) {
        monitorenter(this);
        Label_0169: {
            Serializable s2;
            try {
                s2 = wc2.d.a(n);
                if (s2 == null) {
                    s2 = null;
                    if (s != null) {
                        s2 = ByteString.encodeUtf8(s);
                        if (((ByteString)s2).size() > 123L) {
                            s2 = new StringBuilder();
                            ((StringBuilder)s2).append("reason.size() > 123: ");
                            ((StringBuilder)s2).append(s);
                            throw new IllegalArgumentException(((StringBuilder)s2).toString());
                        }
                    }
                    boolean b;
                    if (!this.r && !this.o) {
                        b = true;
                        this.o = true;
                        this.m.add(new c.c$b(n, (ByteString)s2));
                        final ScheduledThreadPoolExecutor j = this.j;
                        if (j != null) {
                            j.execute((Runnable)this.g);
                        }
                        monitorexit(this);
                    }
                    else {
                        b = false;
                        monitorexit(this);
                    }
                    return b;
                }
            }
            finally {
                break Label_0169;
            }
            throw new IllegalArgumentException((String)s2);
        }
        monitorexit(this);
    }
    
    public final void c(final Exception ex, a0 k) {
        synchronized (this) {
            if (this.r) {
                return;
            }
            this.r = true;
            k = (a0)this.k;
            this.k = null;
            final ScheduledFuture<?> p = this.p;
            if (p != null) {
                p.cancel(false);
            }
            final ScheduledThreadPoolExecutor j = this.j;
            if (j != null) {
                j.shutdown();
            }
            monitorexit(this);
            try {
                this.b.x0((Throwable)ex);
            }
            finally {
                mc2.a.e((Closeable)k);
            }
        }
    }
    
    public final void d(final String s, final oc2.c k) throws IOException {
        monitorenter(this);
        Label_0134: {
            try {
                this.k = (c.c$e)k;
                this.i = new f(((c.c$e)k).f, ((c.c$e)k).h, this.c);
                final byte[] a = mc2.a.a;
                final ScheduledThreadPoolExecutor j = new ScheduledThreadPoolExecutor(1, (ThreadFactory)new mc2.b(s, false));
                this.j = j;
                final long d = this.d;
                if (d != 0L) {
                    j.scheduleAtFixedRate((Runnable)new c.c$d(this), d, d, TimeUnit.MILLISECONDS);
                }
                if (this.m.isEmpty()) {
                    break Label_0134;
                }
                final ScheduledThreadPoolExecutor i = this.j;
                if (i != null) {
                    i.execute((Runnable)this.g);
                }
                break Label_0134;
            }
            finally {
                monitorexit(this);
                monitorexit(this);
                this.h = new e(((c.c$e)k).f, ((c.c$e)k).g, this);
            }
        }
    }
    
    public final void e() throws IOException {
    Label_0000:
        while (this.q == -1) {
            final e h = this.h;
            h.b();
            if (!h.h) {
                final int e = h.e;
                if (e != 1) {
                    if (e != 2) {
                        final StringBuilder r = a.r("Unknown opcode: ");
                        r.append(Integer.toHexString(e));
                        throw new ProtocolException(r.toString());
                    }
                }
                while (!h.d) {
                    final long f = h.f;
                    if (f > 0L) {
                        h.b.z(h.j, f);
                        if (!h.a) {
                            h.j.q(h.l);
                            h.l.f(h.j.g - h.f);
                            wc2.d.b(h.l, h.k);
                            h.l.close();
                        }
                    }
                    if (h.g) {
                        if (e == 1) {
                            ((c)h.c).b.A0(h.j.u());
                            continue Label_0000;
                        }
                        final e$a c = h.c;
                        h.j.s();
                        ((c)c).b.getClass();
                        continue Label_0000;
                    }
                    else {
                        while (!h.d) {
                            h.b();
                            if (!h.h) {
                                break;
                            }
                            h.a();
                        }
                        if (h.e == 0) {
                            continue;
                        }
                        final StringBuilder r2 = a.r("Expected continuation opcode. Got: ");
                        r2.append(Integer.toHexString(h.e));
                        throw new ProtocolException(r2.toString());
                    }
                }
                throw new IOException("closed");
            }
            h.a();
        }
    }
    
    public final boolean f(final String s) {
        if (s != null) {
            final ByteString encodeUtf8 = ByteString.encodeUtf8(s);
            synchronized (this) {
                final boolean r = this.r;
                boolean b = false;
                if (!r && !this.o) {
                    if (this.n + encodeUtf8.size() > 16777216L) {
                        this.b(1001, null);
                        monitorexit(this);
                    }
                    else {
                        this.n += encodeUtf8.size();
                        this.m.add(new c.c$c(encodeUtf8));
                        final ScheduledThreadPoolExecutor j = this.j;
                        if (j != null) {
                            j.execute((Runnable)this.g);
                        }
                        monitorexit(this);
                        b = true;
                    }
                }
                return b;
            }
        }
        throw new NullPointerException("text == null");
    }
    
    public final boolean g() throws IOException {
        synchronized (this) {
            if (this.r) {
                return false;
            }
            Object i = this.i;
            final ByteString byteString = this.l.poll();
            int q = -1;
            Object o = null;
            Object o2 = null;
            Label_0162: {
                if (byteString == null) {
                    final c.c$c poll = this.m.poll();
                    if (poll instanceof c.c$b) {
                        q = this.q;
                        if (q != -1) {
                            final c.c$e k = this.k;
                            this.k = null;
                            this.j.shutdown();
                            o = poll;
                            o2 = k;
                            break Label_0162;
                        }
                        this.p = this.j.schedule((Runnable)new c.c$a(this), ((c.c$b)poll).c, TimeUnit.MILLISECONDS);
                    }
                    else if (poll == null) {
                        return false;
                    }
                    final Closeable closeable = null;
                    o = poll;
                    o2 = closeable;
                }
                else {
                    o2 = null;
                }
            }
            monitorexit(this);
            Label_0178: {
                if (byteString == null) {
                    break Label_0178;
                }
                try {
                    ((f)i).a(byteString, 10);
                    return true;
                Block_16:
                    while (true) {
                        final int a2;
                        Label_0375: {
                            ByteString b2 = null;
                            int a4 = 0;
                            long g = 0L;
                            Block_11: {
                                ByteString byteString2 = null;
                                String a;
                                com.sendbird.android.shadow.okio.a a3;
                                final ByteString b;
                                Block_17_Outer:Block_10_Outer:
                                while (true) {
                                    try {
                                        Label_0446: {
                                            ((f)i).a(byteString2, 8);
                                        }
                                        ((f)i).e = true;
                                        if (o2 != null) {
                                            this.b.w0(q);
                                        }
                                        return true;
                                    }
                                    finally {
                                        ((f)i).e = true;
                                    }
                                    Label_0489: {
                                        throw new AssertionError();
                                    }
                                    a = wc2.d.a(a2);
                                    iftrue(Label_0395:)(a != null);
                                    break Block_16;
                                    Label_0439: {
                                        while (true) {
                                            while (true) {
                                                a3.A(b);
                                                break Label_0439;
                                                Label_0395:
                                                throw new IllegalArgumentException(a);
                                                Label_0326:
                                                iftrue(Label_0489:)(!(o instanceof c.c$b));
                                                break Block_17_Outer;
                                                b2 = ((c.c$c)o).b;
                                                a4 = ((c.c$c)o).a;
                                                g = b2.size();
                                                iftrue(Label_0310:)(((f)i).h);
                                                break Block_11;
                                                Label_0410:
                                                a3 = new com.sendbird.android.shadow.okio.a();
                                                a3.I(a2);
                                                iftrue(Label_0439:)(b == null);
                                                continue Block_10_Outer;
                                            }
                                            iftrue(Label_0326:)(!(o instanceof c.c$c));
                                            continue;
                                        }
                                    }
                                    byteString2 = a3.s();
                                    continue Block_17_Outer;
                                }
                                final c.c$b c$b = (c.c$b)o;
                                a2 = c$b.a;
                                b = c$b.b;
                                ((f)i).getClass();
                                byteString2 = ByteString.EMPTY;
                                iftrue(Label_0446:)(a2 == 0 && b == null);
                                break Label_0375;
                            }
                            ((f)i).h = true;
                            final f.a g2 = ((f)i).g;
                            g2.f = a4;
                            g2.g = g;
                            g2.h = true;
                            g2.i = false;
                            final Logger a5 = xc2.n.a;
                            i = new o((s)g2);
                            ((o)i).b(b2);
                            ((o)i).close();
                            synchronized (this) {
                                this.n -= b2.size();
                                return true;
                            }
                            Label_0310: {
                                throw new IllegalStateException("Another message writer is active. Did you call close()?");
                            }
                        }
                        iftrue(Label_0410:)(a2 == 0);
                        continue;
                    }
                }
                finally {
                    mc2.a.e((Closeable)o2);
                }
            }
        }
    }
}
