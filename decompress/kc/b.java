// 
// Decompiled by Procyon v0.6.0
// 

package kc;

import java.io.IOException;
import android.os.SystemClock;
import bd.d0;
import db.t;
import db.u;
import db.u$b;
import db.i;
import lc.c;
import db.j;
import bd.s;
import lc.e;
import db.h;

public final class b implements h
{
    public final e a;
    public final s b;
    public final s c;
    public final int d;
    public final Object e;
    public final d f;
    public j g;
    public boolean h;
    public volatile long i;
    public volatile int j;
    public boolean k;
    public long l;
    public long m;
    
    public b(final kc.e e, int d) {
        this.d = d;
        final String q = e.c.q;
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
        e a = null;
        switch (d) {
            default: {
                a = null;
                break;
            }
            case 2: {
                a = new lc.d(e);
                break;
            }
            case 1: {
                a = new c(e);
                break;
            }
            case 0: {
                a = new lc.b(e);
                break;
            }
        }
        a.getClass();
        this.a = a;
        this.b = new s(65507);
        this.c = new s();
        this.e = new Object();
        this.f = new d();
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
    
    public final int h(final i i, t t) throws IOException {
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
        final s b = this.b;
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
                final kc.c.a a2 = new kc.c.a();
                a2.a = a;
                a2.b = b5;
                d0.c(w >= 0 && w <= 65535);
                a2.c = (0xFFFF & w);
                a2.d = s;
                a2.e = c3;
                a2.f = g;
                a2.g = g2;
                c2 = new kc.c(a2);
            }
        }
        if (c2 == null) {
            return 0;
        }
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        final long n2 = elapsedRealtime - 30L;
        t = (t)this.f;
        synchronized (t) {
            if (((d)t).a.size() < 5000) {
                final int c4 = c2.c;
                if (!((d)t).d) {
                    ((d)t).d();
                    ((d)t).c = vg.b.c(c4 - 1);
                    ((d)t).d = true;
                    ((d)t).a(new d.a(c2, elapsedRealtime));
                    monitorexit(t);
                }
                else if (Math.abs(kc.d.b(c4, vg.b.c(((d)t).b + 1))) < 1000) {
                    if (kc.d.b(c4, ((d)t).c) > 0) {
                        ((d)t).a(new d.a(c2, elapsedRealtime));
                        monitorexit(t);
                    }
                    else {
                        monitorexit(t);
                    }
                }
                else {
                    ((d)t).c = vg.b.c(c4 - 1);
                    ((d)t).a.clear();
                    ((d)t).a(new d.a(c2, elapsedRealtime));
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
                            t = (t)this.c;
                            final byte[] f = ((kc.c)c5).f;
                            t.getClass();
                            ((s)t).z(f.length, f);
                            final e a3 = this.a;
                            t = (t)this.c;
                            a3.b(((kc.c)c5).c, ((kc.c)c5).d, (s)t, ((kc.c)c5).a);
                            t = (t)this.f.c(n2);
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
