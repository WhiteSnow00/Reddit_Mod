// 
// Decompiled by Procyon v0.6.0
// 

package kc;

import java.io.IOException;
import android.os.SystemClock;
import db.u;
import db.u$b;
import db.i;
import lc.a;
import lc.c;
import db.j;
import bd.t;
import lc.d;
import db.h;

public final class b implements h
{
    public final d a;
    public final t b;
    public final t c;
    public final int d;
    public final Object e;
    public final e f;
    public j g;
    public boolean h;
    public volatile long i;
    public volatile int j;
    public boolean k;
    public long l;
    public long m;
    
    public b(final f f, int d) {
        this.d = d;
        final String q = f.c.q;
        q.getClass();
        Label_0113: {
            switch (q) {
                case "video/avc": {
                    d = 2;
                    break Label_0113;
                }
                case "audio/ac3": {
                    d = 1;
                    break Label_0113;
                }
                case "audio/mp4a-latm": {
                    d = 0;
                    break Label_0113;
                }
                default:
                    break;
            }
            d = -1;
        }
        Object a = null;
        switch (d) {
            default: {
                a = null;
                break;
            }
            case 2: {
                a = new c(f);
                break;
            }
            case 1: {
                a = new lc.b(f);
                break;
            }
            case 0: {
                a = new a(f);
                break;
            }
        }
        a.getClass();
        this.a = (d)a;
        this.b = new t(65507);
        this.c = new t();
        this.e = new Object();
        this.f = new e();
        this.i = -9223372036854775807L;
        this.j = -1;
        this.l = -9223372036854775807L;
        this.m = -9223372036854775807L;
    }
    
    public final void a(final long l, final long m) {
        synchronized (this.e) {
            this.l = l;
            this.m = m;
        }
    }
    
    public final boolean c(final i i) {
        throw new UnsupportedOperationException("RTP packets are transmitted in a packet stream do not support sniffing.");
    }
    
    public final void f(final j g) {
        this.a.d(g, this.d);
        g.b();
        g.s((u)new u$b(-9223372036854775807L));
        this.g = g;
    }
    
    public final int h(final i i, db.t t) throws IOException {
        this.g.getClass();
        final int read = ((db.e)i).read(this.b.a, 0, 65507);
        if (read == -1) {
            return -1;
        }
        if (read == 0) {
            return 0;
        }
        this.b.B(0);
        this.b.A(read);
        final t b = this.b;
        final int c = b.c;
        final int b2 = b.b;
        kc.c c2 = null;
        boolean a = true;
        if (c - b2 >= 12) {
            final int r = b.r();
            final byte b3 = (byte)(r >> 6);
            final byte b4 = (byte)(r & 0xF);
            if (b3 == 2) {
                final int r2 = b.r();
                if ((r2 >> 7 & 0x1) != 0x1) {
                    a = false;
                }
                final byte b5 = (byte)(r2 & 0x7F);
                final int w = b.w();
                final long s = b.s();
                final int c3 = b.c();
                byte[] g;
                if (b4 > 0) {
                    final byte[] array = new byte[b4 * 4];
                    byte b6 = 0;
                    while (true) {
                        g = array;
                        if (b6 >= b4) {
                            break;
                        }
                        b.b(b6 * 4, 4, array);
                        ++b6;
                    }
                }
                else {
                    g = kc.c.g;
                }
                final int n = b.c - b.b;
                final byte[] g2 = new byte[n];
                b.b(0, n, g2);
                final c$a c$a = new c$a();
                c$a.a = a;
                c$a.b = b5;
                ah0.b.C(w >= 0 && w <= 65535);
                c$a.c = (0xFFFF & w);
                c$a.d = s;
                c$a.e = c3;
                c$a.f = g;
                c$a.g = g2;
                c2 = new kc.c(c$a);
            }
        }
        if (c2 == null) {
            return 0;
        }
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        final long n2 = elapsedRealtime - 30L;
        t = (db.t)this.f;
        synchronized (t) {
            if (((e)t).a.size() < 5000) {
                final int c4 = c2.c;
                if (!((e)t).d) {
                    ((e)t).d();
                    ((e)t).c = ug.b.c(c4 - 1);
                    ((e)t).d = true;
                    ((e)t).a(new e$a(c2, elapsedRealtime));
                    monitorexit(t);
                }
                else if (Math.abs(kc.e.b(c4, ug.b.c(((e)t).b + 1))) < 1000) {
                    if (kc.e.b(c4, ((e)t).c) > 0) {
                        ((e)t).a(new e$a(c2, elapsedRealtime));
                        monitorexit(t);
                    }
                    else {
                        monitorexit(t);
                    }
                }
                else {
                    ((e)t).c = ug.b.c(c4 - 1);
                    ((e)t).a.clear();
                    ((e)t).a(new e$a(c2, elapsedRealtime));
                    monitorexit(t);
                }
                Object c5 = this.f.c(n2);
                if (c5 == null) {
                    return 0;
                }
                if (!this.h) {
                    if (this.i == -9223372036854775807L) {
                        this.i = ((kc.c)c5).d;
                    }
                    if (this.j == -1) {
                        this.j = ((kc.c)c5).c;
                    }
                    this.a.c(this.i);
                    this.h = true;
                }
                synchronized (this.e) {
                    if (this.k) {
                        if (this.l != -9223372036854775807L && this.m != -9223372036854775807L) {
                            this.f.d();
                            this.a.a(this.l, this.m);
                            this.k = false;
                            this.l = -9223372036854775807L;
                            this.m = -9223372036854775807L;
                        }
                    }
                    else {
                        do {
                            final t c6 = this.c;
                            t = (db.t)(Object)((kc.c)c5).f;
                            c6.getClass();
                            c6.z(t.length, (byte[])(Object)t);
                            t = (db.t)this.a;
                            ((d)t).b(((kc.c)c5).c, ((kc.c)c5).d, this.c, ((kc.c)c5).a);
                            t = (db.t)this.f.c(n2);
                        } while ((c5 = t) != null);
                    }
                    return 0;
                }
            }
            throw new IllegalStateException("Queue size limit of 5000 reached.");
        }
    }
    
    public final void release() {
    }
}
