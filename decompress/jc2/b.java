// 
// Decompiled by Procyon v0.6.0
// 

package jc2;

import fc2.c0;
import java.io.IOException;
import java.util.logging.Logger;
import fc2.w;
import ic2.g;
import java.net.ProtocolException;
import android.support.v4.media.a;
import fc2.a0$a;
import rc2.o;
import rc2.n;
import cg.d;
import fc2.a0;
import fc2.s;

public final class b implements s
{
    public final boolean a;
    
    public b(final boolean a) {
        this.a = a;
    }
    
    public final a0 a(final f f) throws IOException {
        final c c = f.c;
        final g b = f.b;
        final ic2.d d = f.d;
        final w f2 = f.f;
        final long currentTimeMillis = System.currentTimeMillis();
        f.h.getClass();
        c.a(f2);
        f.h.getClass();
        final boolean a3 = cg.d.A3(f2.b);
        final a0$a a0$a = null;
        a0$a responseHeaders = null;
        a0$a a0$a2 = a0$a;
        if (a3) {
            a0$a2 = a0$a;
            if (f2.d != null) {
                final boolean equalsIgnoreCase = "100-continue".equalsIgnoreCase(f2.a("Expect"));
                boolean b2 = true;
                if (equalsIgnoreCase) {
                    c.flushRequest();
                    f.h.getClass();
                    responseHeaders = c.readResponseHeaders(true);
                }
                if (responseHeaders == null) {
                    f.h.getClass();
                    final a a4 = new a(c.c(f2, f2.d.a()));
                    final Logger a5 = n.a;
                    final o o = new o((rc2.s)a4);
                    f2.d.d(o);
                    o.close();
                    f.h.getClass();
                    a0$a2 = responseHeaders;
                }
                else {
                    if (d.h == null) {
                        b2 = false;
                    }
                    a0$a2 = responseHeaders;
                    if (!b2) {
                        b.f();
                        a0$a2 = responseHeaders;
                    }
                }
            }
        }
        c.finishRequest();
        a0$a responseHeaders2;
        if ((responseHeaders2 = a0$a2) == null) {
            f.h.getClass();
            responseHeaders2 = c.readResponseHeaders(false);
        }
        responseHeaders2.a = f2;
        responseHeaders2.e = b.b().f;
        responseHeaders2.k = currentTimeMillis;
        responseHeaders2.l = System.currentTimeMillis();
        a0 a6 = responseHeaders2.a();
        int n;
        if ((n = a6.h) == 100) {
            final a0$a responseHeaders3 = c.readResponseHeaders(false);
            responseHeaders3.a = f2;
            responseHeaders3.e = b.b().f;
            responseHeaders3.k = currentTimeMillis;
            responseHeaders3.l = System.currentTimeMillis();
            a6 = responseHeaders3.a();
            n = a6.h;
        }
        f.h.getClass();
        a0 a7;
        if (this.a && n == 101) {
            final a0$a a0$a3 = new a0$a(a6);
            a0$a3.g = (c0)gc2.b.c;
            a7 = a0$a3.a();
        }
        else {
            final a0$a a0$a4 = new a0$a(a6);
            a0$a4.g = c.b(a6);
            a7 = a0$a4.a();
        }
        if ("close".equalsIgnoreCase(a7.f.a("Connection")) || "close".equalsIgnoreCase(a7.d("Connection"))) {
            b.f();
        }
        if ((n != 204 && n != 205) || a7.l.b() <= 0L) {
            return a7;
        }
        final StringBuilder o2 = android.support.v4.media.a.o("HTTP ", n, " had non-zero Content-Length: ");
        o2.append(a7.l.b());
        throw new ProtocolException(o2.toString());
    }
    
    public static final class a extends rc2.f
    {
        public a(final rc2.s s) {
            super(s);
        }
        
        public final void L(final com.sendbird.android.shadow.okio.a a, final long n) throws IOException {
            super.L(a, n);
        }
    }
}
