// 
// Decompiled by Procyon v0.6.0
// 

package vj2;

import org.jcodec.common.logging.Logger;
import bk2.g;
import net.sourceforge.jaad.aac.AACException;

public final class c
{
    public final a a;
    public final net.sourceforge.jaad.aac.syntax.c b;
    public final wj2.c c;
    public bk2.a d;
    
    public c(byte[] a) throws AACException {
        final bk2.a a2 = new bk2.a();
        a2.f(a);
        final a a3 = new a();
        try {
            int c;
            if ((c = a2.c(5)) == 31) {
                c = a2.c(6) + 32;
            }
            a3.a = vj2.d.a(c);
            final int c2 = a2.c(4);
            if (c2 == 15) {
                final int c3 = a2.c(24);
                final f[] e = f.e;
                f f = null;
                for (int n = 0; f == null && n < 12; ++n) {
                    final f f2 = e[n];
                    if (c3 == f2.b) {
                        f = f2;
                    }
                }
                f d;
                if ((d = f) == null) {
                    d = vj2.f.d;
                }
                a3.b = d;
            }
            else {
                f d2;
                if (c2 >= 0 && c2 < 12) {
                    d2 = f.e[c2];
                }
                else {
                    d2 = f.d;
                }
                a3.b = d2;
            }
            a3.c = vj2.b.a(a2.c(4));
            final d a4 = a3.a;
            if (vj2.d.i == a4) {
                final int c4 = a2.c(4);
                a3.e = (a3.b.a == c4);
                f d3;
                if (c4 >= 0 && c4 < 12) {
                    d3 = f.e[c4];
                }
                else {
                    d3 = f.d;
                }
                a3.b = d3;
                int c5;
                if ((c5 = a2.c(5)) == 31) {
                    c5 = a2.c(6) + 32;
                }
                a3.a = vj2.d.a(c5);
            }
            else {
                if (vj2.d.e != a4 && vj2.d.f != a4 && vj2.d.g != a4 && vj2.d.h != a4 && vj2.d.k != a4 && vj2.d.l != a4 && vj2.d.m != a4) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("profile not supported: ");
                    sb.append(a4.a);
                    throw new AACException(sb.toString());
                }
                if (a3.d = a2.d()) {
                    throw new AACException("config uses 960-sample frames, not yet supported");
                }
                if (a2.d()) {
                    a2.c(14);
                }
                if (a2.d()) {
                    if (a4.a > 16) {
                        a2.d();
                        a3.f = a2.d();
                        a3.g = a2.d();
                    }
                    ++a2.e;
                    final int d4 = a2.d;
                    if (d4 > 0) {
                        a2.d = d4 - 1;
                    }
                    else {
                        a2.c = a2.e(false);
                        a2.d = 31;
                    }
                }
                if (a3.c == vj2.b.d) {
                    a2.g(3);
                    final g g = new g();
                    g.a(a2);
                    a3.a = g.c;
                    a3.b = g.d;
                    a3.c = vj2.b.a(g.e + g.f + g.g + g.h + g.i);
                }
                a = a2.a;
                int n2;
                if (a != null) {
                    n2 = (a.length - a2.b) * 8 + a2.d;
                }
                else {
                    n2 = 0;
                }
                if (n2 > 10) {
                    vj2.a.b(a2, a3);
                }
            }
            a2.b = 0;
            a2.d = 0;
            a2.c = 0;
            a2.e = 0;
            a2.a = null;
            this.a = a3;
            if (a3.a.c) {
                this.b = new net.sourceforge.jaad.aac.syntax.c(a3);
                this.c = new wj2.c(a3.d, a3.c.a);
                this.d = new bk2.a();
                Logger.debug("profile: {0}", new Object[] { a3.a });
                Logger.debug("sf: {0}", new Object[] { a3.b.b });
                Logger.debug("channels: {0}", new Object[] { a3.c.b });
                return;
            }
            final StringBuilder t = a.t("unsupported profile: ");
            t.append(a3.a.b);
            throw new AACException(t.toString());
        }
        finally {
            a2.b = 0;
            a2.d = 0;
            a2.c = 0;
            a2.e = 0;
            a2.a = null;
        }
    }
    
    public final void a(final e e) throws AACException {
        final bk2.a d = this.d;
        final int d2 = d.d;
        int n;
        if (d2 >= 32) {
            n = (d.c >> d2 - 32 & bk2.a.a(32));
        }
        else {
            final int c = d.c;
            final int a = bk2.a.a(d2);
            final int n2 = 32 - d.d;
            n = ((d.e(true) >> 32 - n2 & bk2.a.a(n2)) | (a & c) << n2);
        }
        if (n == 1094994246L) {
            final bk2.a d3 = this.d;
            final dk2.a a2 = new dk2.a();
            d3.c(32);
            if (d3.d()) {
                for (int i = 0; i < 9; ++i) {
                    a2.a[i] = (byte)d3.c(8);
                }
            }
            d3.d();
            d3.d();
            a2.b = d3.d();
            d3.c(23);
            final int c2 = d3.c(4) + 1;
            a2.c = c2;
            a2.e = new g[c2];
            a2.d = new int[c2];
            for (int j = 0; j < a2.c; ++j) {
                if (a2.b) {
                    a2.d[j] = -1;
                }
                else {
                    a2.d[j] = d3.c(20);
                }
                (a2.e[j] = new g()).a(d3);
            }
            final g g = a2.e[0];
            final a a3 = this.a;
            a3.a = g.c;
            a3.b = g.d;
            a3.c = vj2.b.a(g.e + g.f + g.g + g.h + g.i);
        }
        if (this.a.a.c) {
            final net.sourceforge.jaad.aac.syntax.c b = this.b;
            b.i = 0;
            b.j = 0;
            b.k = 0;
            b.l = 0;
            b.b = false;
            b.c = false;
            b.getClass();
            try {
                b.a(this.d);
                this.b.d(this.c);
                this.b.g(e);
                return;
            }
            catch (final Exception ex) {
                e.d = new byte[0];
                e.a = 0;
                e.b = 0;
                e.c = 0;
                throw AACException.wrap(ex);
            }
        }
        final StringBuilder t = a.t("unsupported profile: ");
        t.append(this.a.a.b);
        throw new AACException(t.toString());
    }
    
    public final void b(final byte[] array, final e e) throws AACException {
        if (array != null) {
            this.d.f(array);
        }
        final StringBuilder t = a.t("bits left ");
        final bk2.a d = this.d;
        final byte[] a = d.a;
        int n;
        if (a != null) {
            n = (a.length - d.b) * 8 + d.d;
        }
        else {
            n = 0;
        }
        t.append(n);
        Logger.debug(t.toString());
        try {
            this.a(e);
        }
        catch (final AACException ex) {
            if (!ex.isEndOfStream()) {
                throw ex;
            }
            Logger.warn("unexpected end of frame");
        }
    }
}
