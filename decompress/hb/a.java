// 
// Decompiled by Procyon v0.6.0
// 

package hb;

import com.google.android.exoplayer2.ParserException;
import org.xmlpull.v1.XmlPullParserException;
import android.util.Log;
import db.t;
import db.w;
import com.google.android.exoplayer2.n;
import com.google.android.exoplayer2.n$a;
import java.io.IOException;
import db.e;
import db.u;
import db.u$b;
import qb.a$b;
import db.i;
import wb.b;
import db.j;
import bd.s;
import db.h;

public final class a implements h
{
    public final s a;
    public j b;
    public int c;
    public int d;
    public int e;
    public long f;
    public b g;
    public i h;
    public c i;
    public kb.h j;
    
    public a() {
        this.a = new s(6);
        this.f = -1L;
    }
    
    public final void a(final long n, final long n2) {
        if (n == 0L) {
            this.c = 0;
            this.j = null;
        }
        else if (this.c == 5) {
            final kb.h j = this.j;
            j.getClass();
            j.a(n, n2);
        }
    }
    
    public final void b() {
        this.d(new a$b[0]);
        final j b = this.b;
        b.getClass();
        b.b();
        this.b.s((u)new u$b(-9223372036854775807L));
        this.c = 6;
    }
    
    public final boolean c(final i i) throws IOException {
        final e e = (e)i;
        final int e2 = this.e(e);
        final boolean b = false;
        if (e2 != 65496) {
            return false;
        }
        if ((this.d = this.e(e)) == 65504) {
            this.a.y(2);
            e.h(this.a.a, 0, 2, false);
            e.j(this.a.w() - 2, false);
            this.d = this.e(e);
        }
        if (this.d != 65505) {
            return false;
        }
        e.j(2, false);
        this.a.y(6);
        e.h(this.a.a, 0, 6, false);
        boolean b2 = b;
        if (this.a.s() == 1165519206L) {
            b2 = b;
            if (this.a.w() == 0) {
                b2 = true;
            }
        }
        return b2;
    }
    
    public final void d(final a$b... array) {
        final j b = this.b;
        b.getClass();
        final w k = b.k(1024, 4);
        final n$a n$a = new n$a();
        n$a.j = "image/jpeg";
        n$a.i = new qb.a(array);
        k.a(new n(n$a));
    }
    
    public final int e(final e e) throws IOException {
        this.a.y(2);
        e.h(this.a.a, 0, 2, false);
        return this.a.w();
    }
    
    public final void f(final j b) {
        this.b = b;
    }
    
    public final int h(final i h, final t t) throws IOException {
        final int c = this.c;
        if (c == 0) {
            this.a.y(2);
            ((e)h).f(this.a.a, 0, 2, false);
            final int w = this.a.w();
            if ((this.d = w) == 65498) {
                if (this.f != -1L) {
                    this.c = 4;
                }
                else {
                    this.b();
                }
            }
            else if ((w < 65488 || w > 65497) && w != 65281) {
                this.c = 1;
            }
            return 0;
        }
        if (c == 1) {
            this.a.y(2);
            ((e)h).f(this.a.a, 0, 2, false);
            this.e = this.a.w() - 2;
            this.c = 2;
            return 0;
        }
        if (c == 2) {
            if (this.d == 65505) {
                final s s = new s(this.e);
                final byte[] a = s.a;
                final int e = this.e;
                final e e2 = (e)h;
                e2.f(a, 0, e, false);
                if (this.g == null && "http://ns.adobe.com/xap/1.0/".equals(s.l())) {
                    final String l = s.l();
                    if (l != null) {
                        final long c2 = e2.c;
                        final b b = null;
                        b g;
                        if (c2 == -1L) {
                            g = b;
                        }
                        else {
                            hb.b a2;
                            try {
                                a2 = hb.e.a(l);
                            }
                            catch (final XmlPullParserException | ParserException | NumberFormatException ex) {
                                Log.w("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
                                a2 = null;
                            }
                            if (a2 == null) {
                                g = b;
                            }
                            else if (a2.b.size() < 2) {
                                g = b;
                            }
                            else {
                                int i = a2.b.size() - 1;
                                boolean b2 = false;
                                final long n2;
                                long n = n2 = -1L;
                                long n4;
                                long n3 = n4 = n2;
                                long n5 = n2;
                                long n6 = c2;
                                while (i >= 0) {
                                    final b$a b$a = a2.b.get(i);
                                    final boolean b3 = b2 | "video/mp4".equals(b$a.a);
                                    long n7;
                                    if (i == 0) {
                                        n7 = n6 - b$a.c;
                                        n6 = 0L;
                                    }
                                    else {
                                        final long b4 = b$a.b;
                                        n7 = n6;
                                        n6 -= b4;
                                    }
                                    b2 = b3;
                                    long n8 = n4;
                                    long n9 = n3;
                                    if (b3) {
                                        b2 = b3;
                                        n8 = n4;
                                        n9 = n3;
                                        if (n6 != n7) {
                                            n9 = n7 - n6;
                                            b2 = false;
                                            n8 = n6;
                                        }
                                    }
                                    if (i == 0) {
                                        n = n6;
                                        n5 = n7;
                                    }
                                    --i;
                                    n4 = n8;
                                    n3 = n9;
                                }
                                g = b;
                                if (n4 != -1L) {
                                    g = b;
                                    if (n3 != -1L) {
                                        g = b;
                                        if (n != -1L) {
                                            if (n5 == -1L) {
                                                g = b;
                                            }
                                            else {
                                                g = new b(n, n5, a2.a, n4, n3);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if ((this.g = g) != null) {
                            this.f = g.i;
                        }
                    }
                }
            }
            else {
                ((e)h).n(this.e);
            }
            return this.c = 0;
        }
        if (c != 4) {
            if (c == 5) {
                if (this.i == null || h != this.h) {
                    this.h = h;
                    this.i = new c((e)h, this.f);
                }
                final kb.h j = this.j;
                j.getClass();
                final int h2 = j.h((i)this.i, t);
                if (h2 == 1) {
                    t.a += this.f;
                }
                return h2;
            }
            if (c == 6) {
                return -1;
            }
            throw new IllegalStateException();
        }
        else {
            final e e3 = (e)h;
            final long d = e3.d;
            final long f = this.f;
            if (d != f) {
                t.a = f;
                return 1;
            }
            if (!e3.h(this.a.a, 0, 1, true)) {
                this.b();
            }
            else {
                e3.f = 0;
                if (this.j == null) {
                    this.j = new kb.h();
                }
                final c k = new c(e3, this.f);
                this.i = k;
                if (this.j.c((i)k)) {
                    final kb.h m = this.j;
                    final long f2 = this.f;
                    final j b5 = this.b;
                    b5.getClass();
                    m.r = (j)new d(f2, b5);
                    final b g2 = this.g;
                    g2.getClass();
                    this.d((a$b)g2);
                    this.c = 5;
                }
                else {
                    this.b();
                }
            }
            return 0;
        }
    }
    
    public final void release() {
        final kb.h j = this.j;
        if (j != null) {
            j.getClass();
        }
    }
}
