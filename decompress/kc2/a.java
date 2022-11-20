// 
// Decompiled by Procyon v0.6.0
// 

package kc2;

import fc2.k;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import java.io.EOFException;
import com.sendbird.android.shadow.okhttp3.internal.Internal;
import fc2.q$a;
import jc2.j;
import fc2.a0$a;
import fc2.q;
import gc2.b;
import rc2.s;
import fc2.r;
import java.util.logging.Logger;
import rc2.t;
import rc2.p;
import rc2.n;
import fc2.a0;
import java.io.IOException;
import jc2.h;
import java.net.Proxy;
import fc2.w;
import rc2.d;
import rc2.e;
import ic2.g;
import fc2.u;
import jc2.c;

public final class a implements jc2.c
{
    public final u a;
    public final g b;
    public final rc2.e c;
    public final rc2.d d;
    public int e;
    public long f;
    
    public a(final u a, final g b, final rc2.e c, final rc2.d d) {
        this.e = 0;
        this.f = 262144L;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final void a(final w w) throws IOException {
        final Proxy.Type type = this.b.b().c.b.type();
        final StringBuilder sb = new StringBuilder();
        sb.append(w.b);
        sb.append(' ');
        if (!w.a.a.equals("https") && type == Proxy.Type.HTTP) {
            sb.append(w.a);
        }
        else {
            sb.append(h.a(w.a));
        }
        sb.append(" HTTP/1.1");
        this.e(w.c, sb.toString());
    }
    
    public final jc2.g b(final a0 a0) throws IOException {
        this.b.f.getClass();
        final String d = a0.d("Content-Type");
        if (!jc2.e.b(a0)) {
            final e d2 = this.d(0L);
            final Logger a2 = n.a;
            return new jc2.g(d, 0L, new p((t)d2));
        }
        if ("chunked".equalsIgnoreCase(a0.d("Transfer-Encoding"))) {
            final r a3 = a0.f.a;
            if (this.e == 4) {
                this.e = 5;
                final c c = new c(a3);
                final Logger a4 = n.a;
                return new jc2.g(d, -1L, new p((t)c));
            }
            final StringBuilder t = a.t("state: ");
            t.append(this.e);
            throw new IllegalStateException(t.toString());
        }
        else {
            final long a5 = jc2.e.a(a0);
            if (a5 != -1L) {
                final e d3 = this.d(a5);
                final Logger a6 = n.a;
                return new jc2.g(d, a5, new p((t)d3));
            }
            if (this.e != 4) {
                final StringBuilder t2 = a.t("state: ");
                t2.append(this.e);
                throw new IllegalStateException(t2.toString());
            }
            final g b = this.b;
            if (b != null) {
                this.e = 5;
                b.f();
                final f f = new f();
                final Logger a7 = n.a;
                return new jc2.g(d, -1L, new p((t)f));
            }
            throw new IllegalStateException("streamAllocation == null");
        }
    }
    
    public final s c(final w w, final long n) {
        if ("chunked".equalsIgnoreCase(w.a("Transfer-Encoding"))) {
            if (this.e == 1) {
                this.e = 2;
                return (s)new b();
            }
            final StringBuilder t = a.t("state: ");
            t.append(this.e);
            throw new IllegalStateException(t.toString());
        }
        else {
            if (n == -1L) {
                throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
            }
            if (this.e == 1) {
                this.e = 2;
                return (s)new d(n);
            }
            final StringBuilder t2 = a.t("state: ");
            t2.append(this.e);
            throw new IllegalStateException(t2.toString());
        }
    }
    
    public final void cancel() {
        final ic2.d b = this.b.b();
        if (b != null) {
            gc2.b.f(b.d);
        }
    }
    
    public final e d(final long n) throws IOException {
        if (this.e == 4) {
            this.e = 5;
            return new e(n);
        }
        final StringBuilder t = a.t("state: ");
        t.append(this.e);
        throw new IllegalStateException(t.toString());
    }
    
    public final void e(final q q, final String s) throws IOException {
        if (this.e == 0) {
            this.d.a1(s).a1("\r\n");
            for (int i = 0; i < q.a.length / 2; ++i) {
                this.d.a1(q.d(i)).a1(": ").a1(q.g(i)).a1("\r\n");
            }
            this.d.a1("\r\n");
            this.e = 1;
            return;
        }
        final StringBuilder t = a.t("state: ");
        t.append(this.e);
        throw new IllegalStateException(t.toString());
    }
    
    public final void finishRequest() throws IOException {
        this.d.flush();
    }
    
    public final void flushRequest() throws IOException {
        this.d.flush();
    }
    
    public final a0$a readResponseHeaders(final boolean b) throws IOException {
        final int e = this.e;
        if (e != 1) {
            if (e != 3) {
                final StringBuilder t = a.t("state: ");
                t.append(this.e);
                throw new IllegalStateException(t.toString());
            }
        }
        try {
            final String z0 = this.c.Z0(this.f);
            this.f -= z0.length();
            final j a = j.a(z0);
            final a0$a a0$a = new a0$a();
            a0$a.b = a.a;
            a0$a.c = a.b;
            a0$a.d = a.c;
            final q$a q$a = new q$a();
            while (true) {
                final String z2 = this.c.Z0(this.f);
                this.f -= z2.length();
                if (z2.length() == 0) {
                    break;
                }
                Internal.instance.addLenient(q$a, z2);
            }
            a0$a.f = new q(q$a).e();
            if (b && a.b == 100) {
                return null;
            }
            if (a.b == 100) {
                this.e = 3;
                return a0$a;
            }
            this.e = 4;
            return a0$a;
        }
        catch (final EOFException ex) {
            final StringBuilder t2 = a.t("unexpected end of stream on ");
            t2.append(this.b);
            final IOException ex2 = new IOException(t2.toString());
            ex2.initCause(ex);
            throw ex2;
        }
    }
    
    public abstract class a implements t
    {
        public final rc2.h f;
        public boolean g;
        public long h;
        public final kc2.a i;
        
        public a(final kc2.a i) {
            this.i = i;
            this.f = new rc2.h(((t)i.c).timeout());
            this.h = 0L;
        }
        
        public final void a(final IOException ex, final boolean b) throws IOException {
            final int e = this.i.e;
            if (e == 6) {
                return;
            }
            if (e == 5) {
                final rc2.h f = this.f;
                final rc2.u e2 = f.e;
                f.e = (rc2.u)rc2.u.d;
                e2.a();
                e2.b();
                final kc2.a i = this.i;
                i.e = 6;
                final g b2 = i.b;
                if (b2 != null) {
                    b2.i(b ^ true, (jc2.c)i, ex);
                }
                return;
            }
            final StringBuilder t = a.t("state: ");
            t.append(this.i.e);
            throw new IllegalStateException(t.toString());
        }
        
        public long m(final com.sendbird.android.shadow.okio.a a, long m) throws IOException {
            try {
                m = ((t)this.i.c).m(a, m);
                if (m > 0L) {
                    this.h += m;
                }
                return m;
            }
            catch (final IOException ex) {
                this.a(ex, false);
                throw ex;
            }
        }
        
        public final rc2.u timeout() {
            return (rc2.u)this.f;
        }
    }
    
    public final class b implements s
    {
        public final rc2.h f;
        public boolean g;
        public final a h;
        
        public b(final a h) {
            this.h = h;
            this.f = new rc2.h(((s)h.d).timeout());
        }
        
        public final void L(final com.sendbird.android.shadow.okio.a a, final long n) throws IOException {
            if (this.g) {
                throw new IllegalStateException("closed");
            }
            if (n == 0L) {
                return;
            }
            this.h.d.i(n);
            this.h.d.a1("\r\n");
            ((s)this.h.d).L(a, n);
            this.h.d.a1("\r\n");
        }
        
        public final void close() throws IOException {
            synchronized (this) {
                if (this.g) {
                    return;
                }
                this.g = true;
                this.h.d.a1("0\r\n\r\n");
                final a h = this.h;
                final rc2.h f = this.f;
                h.getClass();
                final rc2.u e = f.e;
                f.e = (rc2.u)rc2.u.d;
                e.a();
                e.b();
                this.h.e = 3;
            }
        }
        
        public final void flush() throws IOException {
            synchronized (this) {
                if (this.g) {
                    return;
                }
                this.h.d.flush();
            }
        }
        
        public final rc2.u timeout() {
            return (rc2.u)this.f;
        }
    }
    
    public final class c extends a
    {
        public final r j;
        public long k;
        public boolean l;
        public final a m;
        
        public c(final a m, final r j) {
            this.m = m.super();
            this.k = -1L;
            this.l = true;
            this.j = j;
        }
        
        public final void close() throws IOException {
            if (super.g) {
                return;
            }
            if (this.l) {
                final TimeUnit milliseconds = TimeUnit.MILLISECONDS;
                boolean s;
                try {
                    s = gc2.b.s((t)this, 100, milliseconds);
                }
                catch (final IOException ex) {
                    s = false;
                }
                if (!s) {
                    ((a)this).a(null, false);
                }
            }
            super.g = true;
        }
        
        @Override
        public final long m(final com.sendbird.android.shadow.okio.a a, long m) throws IOException {
            if (m >= 0L) {
                if (!super.g) {
                    if (!this.l) {
                        return -1L;
                    }
                    final long k = this.k;
                    Label_0265: {
                        if (k != 0L && k != -1L) {
                            break Label_0265;
                        }
                        if (k != -1L) {
                            this.m.c.b1();
                        }
                        try {
                            this.k = this.m.c.W0();
                            final String trim = this.m.c.b1().trim();
                            if (this.k < 0L || (!trim.isEmpty() && !trim.startsWith(";"))) {
                                final StringBuilder sb = new StringBuilder();
                                sb.append("expected chunk size and optional extensions but was \"");
                                sb.append(this.k);
                                sb.append(trim);
                                sb.append("\"");
                                throw new ProtocolException(sb.toString());
                            }
                            if (this.k == 0L) {
                                this.l = false;
                                final a i = this.m;
                                final k n = i.a.n;
                                final r j = this.j;
                                final q$a q$a = new q$a();
                                while (true) {
                                    final String z0 = i.c.Z0(i.f);
                                    i.f -= z0.length();
                                    if (z0.length() == 0) {
                                        break;
                                    }
                                    Internal.instance.addLenient(q$a, z0);
                                }
                                jc2.e.d(n, j, new q(q$a));
                                ((a)this).a(null, true);
                            }
                            if (!this.l) {
                                return -1L;
                            }
                            m = super.m(a, Math.min(m, this.k));
                            if (m != -1L) {
                                this.k -= m;
                                return m;
                            }
                            final ProtocolException ex = new ProtocolException("unexpected end of stream");
                            ((a)this).a(ex, false);
                            throw ex;
                        }
                        catch (final NumberFormatException ex2) {
                            throw new ProtocolException(ex2.getMessage());
                        }
                    }
                }
                throw new IllegalStateException("closed");
            }
            throw new IllegalArgumentException(m5.a.e("byteCount < 0: ", m));
        }
    }
    
    public final class d implements s
    {
        public final rc2.h f;
        public boolean g;
        public long h;
        public final a i;
        
        public d(final a i, final long h) {
            this.i = i;
            this.f = new rc2.h(((s)i.d).timeout());
            this.h = h;
        }
        
        public final void L(final com.sendbird.android.shadow.okio.a a, final long n) throws IOException {
            if (this.g) {
                throw new IllegalStateException("closed");
            }
            final long g = a.g;
            final byte[] a2 = gc2.b.a;
            if ((n | 0x0L) < 0L || 0L > g || g - 0L < n) {
                throw new ArrayIndexOutOfBoundsException();
            }
            if (n <= this.h) {
                ((s)this.i.d).L(a, n);
                this.h -= n;
                return;
            }
            final StringBuilder t = a.t("expected ");
            t.append(this.h);
            t.append(" bytes but received ");
            t.append(n);
            throw new ProtocolException(t.toString());
        }
        
        public final void close() throws IOException {
            if (this.g) {
                return;
            }
            this.g = true;
            if (this.h <= 0L) {
                final a i = this.i;
                final rc2.h f = this.f;
                i.getClass();
                final rc2.u e = f.e;
                f.e = (rc2.u)rc2.u.d;
                e.a();
                e.b();
                this.i.e = 3;
                return;
            }
            throw new ProtocolException("unexpected end of stream");
        }
        
        public final void flush() throws IOException {
            if (this.g) {
                return;
            }
            this.i.d.flush();
        }
        
        public final rc2.u timeout() {
            return (rc2.u)this.f;
        }
    }
    
    public final class e extends a
    {
        public long j;
        
        public e(final a a, final long j) throws IOException {
            a.super();
            this.j = j;
            if (j == 0L) {
                ((a)this).a(null, true);
            }
        }
        
        public final void close() throws IOException {
            if (super.g) {
                return;
            }
            if (this.j != 0L) {
                final TimeUnit milliseconds = TimeUnit.MILLISECONDS;
                boolean s;
                try {
                    s = gc2.b.s((t)this, 100, milliseconds);
                }
                catch (final IOException ex) {
                    s = false;
                }
                if (!s) {
                    ((a)this).a(null, false);
                }
            }
            super.g = true;
        }
        
        @Override
        public final long m(final com.sendbird.android.shadow.okio.a a, long m) throws IOException {
            if (m < 0L) {
                throw new IllegalArgumentException(m5.a.e("byteCount < 0: ", m));
            }
            if (super.g) {
                throw new IllegalStateException("closed");
            }
            final long j = this.j;
            if (j == 0L) {
                return -1L;
            }
            m = super.m(a, Math.min(j, m));
            if (m != -1L) {
                final long i = this.j - m;
                this.j = i;
                if (i == 0L) {
                    ((a)this).a(null, true);
                }
                return m;
            }
            final ProtocolException ex = new ProtocolException("unexpected end of stream");
            ((a)this).a(ex, false);
            throw ex;
        }
    }
    
    public final class f extends a
    {
        public boolean j;
        
        public f(final a a) {
            a.super();
        }
        
        public final void close() throws IOException {
            if (super.g) {
                return;
            }
            if (!this.j) {
                ((a)this).a(null, false);
            }
            super.g = true;
        }
        
        @Override
        public final long m(final com.sendbird.android.shadow.okio.a a, long m) throws IOException {
            if (m < 0L) {
                throw new IllegalArgumentException(m5.a.e("byteCount < 0: ", m));
            }
            if (super.g) {
                throw new IllegalStateException("closed");
            }
            if (this.j) {
                return -1L;
            }
            m = super.m(a, m);
            if (m == -1L) {
                ((a)this).a(null, this.j = true);
                return -1L;
            }
            return m;
        }
    }
}
