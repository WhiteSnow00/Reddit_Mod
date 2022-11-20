// 
// Decompiled by Procyon v0.6.0
// 

package jc2;

import java.io.IOException;
import java.util.logging.Logger;
import fc2.q$a;
import java.util.List;
import fc2.z;
import fc2.w;
import rc2.p;
import rc2.n;
import fc2.q;
import rc2.t;
import rc2.i;
import fc2.a0$a;
import fc2.j;
import java.util.Collections;
import fc2.k$a;
import gc2.b;
import fc2.w$a;
import fc2.a0;
import fc2.k;
import fc2.s;

public final class a implements s
{
    public final k a;
    
    public a(final k a) {
        this.a = a;
    }
    
    public final a0 a(final f f) throws IOException {
        final w f2 = f.f;
        f2.getClass();
        final w$a w$a = new w$a(f2);
        final z d = f2.d;
        if (d != null) {
            final fc2.t b = d.b();
            if (b != null) {
                w$a.c.c("Content-Type", b.a);
            }
            final long a = d.a();
            if (a != -1L) {
                w$a.c.c("Content-Length", Long.toString(a));
                w$a.c("Transfer-Encoding");
            }
            else {
                w$a.c.c("Transfer-Encoding", "chunked");
                w$a.c("Content-Length");
            }
        }
        final String a2 = f2.a("Host");
        int i = 0;
        if (a2 == null) {
            w$a.c.c("Host", b.m(f2.a, false));
        }
        if (f2.a("Connection") == null) {
            w$a.c.c("Connection", "Keep-Alive");
        }
        boolean b2;
        if (f2.a("Accept-Encoding") == null && f2.a("Range") == null) {
            w$a.c.c("Accept-Encoding", "gzip");
            b2 = true;
        }
        else {
            b2 = false;
        }
        ((k$a)this.a).getClass();
        final List<Object> emptyList = Collections.emptyList();
        if (!emptyList.isEmpty()) {
            final StringBuilder sb = new StringBuilder();
            while (i < emptyList.size()) {
                if (i > 0) {
                    sb.append("; ");
                }
                final j j = emptyList.get(i);
                sb.append(j.a);
                sb.append('=');
                sb.append(j.b);
                ++i;
            }
            w$a.c.c("Cookie", sb.toString());
        }
        if (f2.a("User-Agent") == null) {
            w$a.c.c("User-Agent", "okhttp/3.12.6");
        }
        final a0 a3 = f.a(w$a.a(), f.b, f.c, f.d);
        e.d(this.a, f2.a, a3.k);
        final a0$a a0$a = new a0$a(a3);
        a0$a.a = f2;
        if (b2 && "gzip".equalsIgnoreCase(a3.d("Content-Encoding")) && e.b(a3)) {
            final i k = new i((t)a3.l.q());
            final q$a e = a3.k.e();
            e.b("Content-Encoding");
            e.b("Content-Length");
            a0$a.f = new q(e).e();
            final String d2 = a3.d("Content-Type");
            final Logger a4 = n.a;
            a0$a.g = new g(d2, -1L, new p((t)k));
        }
        return a0$a.a();
    }
}
