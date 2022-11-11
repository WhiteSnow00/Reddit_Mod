// 
// Decompiled by Procyon v0.6.0
// 

package fb;

import cb.u;
import ad.d0;
import cb.t;
import cb.i;
import java.io.IOException;
import cb.e;
import cb.j;
import ad.s;
import cb.h;

public final class a implements h
{
    public final s a;
    public final s b;
    public final s c;
    public final s d;
    public final b e;
    public j f;
    public int g;
    public boolean h;
    public long i;
    public int j;
    public int k;
    public int l;
    public long m;
    public boolean n;
    public com.google.android.exoplayer2.extractor.flv.a o;
    public com.google.android.exoplayer2.extractor.flv.b p;
    
    static {
        new(android.support.v4.media.a.class)();
    }
    
    public a() {
        this.a = new s(4);
        this.b = new s(9);
        this.c = new s(11);
        this.d = new s();
        this.e = new b();
        this.g = 1;
    }
    
    @Override
    public final void a(final long n, final long n2) {
        if (n == 0L) {
            this.g = 1;
            this.h = false;
        }
        else {
            this.g = 3;
        }
        this.j = 0;
    }
    
    public final s b(final e e) throws IOException {
        final int l = this.l;
        final s d = this.d;
        final byte[] a = d.a;
        if (l > a.length) {
            d.z(0, new byte[Math.max(a.length * 2, l)]);
        }
        else {
            d.B(0);
        }
        this.d.A(this.l);
        e.e(this.d.a, 0, this.l, false);
        return this.d;
    }
    
    @Override
    public final void e(final j f) {
        this.f = f;
    }
    
    @Override
    public final boolean f(final i i) throws IOException {
        final byte[] a = this.a.a;
        final e e = (e)i;
        boolean b = false;
        e.g(a, 0, 3, false);
        this.a.B(0);
        if (this.a.t() != 4607062) {
            return false;
        }
        e.g(this.a.a, 0, 2, false);
        this.a.B(0);
        if ((this.a.w() & 0xFA) != 0x0) {
            return false;
        }
        e.g(this.a.a, 0, 4, false);
        this.a.B(0);
        final int c = this.a.c();
        e.f = 0;
        e.j(c, false);
        e.g(this.a.a, 0, 4, false);
        this.a.B(0);
        if (this.a.c() == 0) {
            b = true;
        }
        return b;
    }
    
    @Override
    public final int i(final i i, final t t) throws IOException {
        d0.g(this.f);
        while (true) {
            final int g = this.g;
            boolean b = false;
            final int n = 0;
            boolean b2 = false;
            if (g != 1) {
                if (g != 2) {
                    if (g != 3) {
                        if (g != 4) {
                            throw new IllegalStateException();
                        }
                        final boolean h = this.h;
                        final long n2 = 0L;
                        long m;
                        if (h) {
                            m = this.i + this.m;
                        }
                        else if (this.e.b == -9223372036854775807L) {
                            m = 0L;
                        }
                        else {
                            m = this.m;
                        }
                        final int k = this.k;
                        int n4 = 0;
                        int n3 = 0;
                        Label_0401: {
                            int n5 = 0;
                            Label_0365: {
                                Label_0362: {
                                    if (k == 8 && this.o != null) {
                                        if (!this.n) {
                                            this.f.l((u)new u.b(-9223372036854775807L));
                                            this.n = true;
                                        }
                                        final com.google.android.exoplayer2.extractor.flv.a o = this.o;
                                        final s b3 = this.b((e)i);
                                        o.a(b3);
                                        if (!o.b(m, b3)) {
                                            break Label_0362;
                                        }
                                    }
                                    else if (k == 9 && this.p != null) {
                                        if (!this.n) {
                                            this.f.l((u)new u.b(-9223372036854775807L));
                                            this.n = true;
                                        }
                                        final com.google.android.exoplayer2.extractor.flv.b p2 = this.p;
                                        final s b4 = this.b((e)i);
                                        if (!p2.a(b4) || !p2.b(m, b4)) {
                                            break Label_0362;
                                        }
                                    }
                                    else {
                                        if (k != 18 || this.n) {
                                            ((e)i).n(this.l);
                                            n3 = (n4 = 0);
                                            break Label_0401;
                                        }
                                        final b e = this.e;
                                        final s b5 = this.b((e)i);
                                        e.getClass();
                                        e.a(m, b5);
                                        final b e2 = this.e;
                                        final long b6 = e2.b;
                                        if (b6 != -9223372036854775807L) {
                                            this.f.l((u)new cb.s(b6, e2.d, e2.c));
                                            this.n = true;
                                        }
                                        break Label_0362;
                                    }
                                    n5 = 1;
                                    break Label_0365;
                                }
                                n5 = 0;
                            }
                            final int n6 = 1;
                            n3 = n5;
                            n4 = n6;
                        }
                        if (!this.h && n3 != 0) {
                            this.h = true;
                            long j = n2;
                            if (this.e.b == -9223372036854775807L) {
                                j = -this.m;
                            }
                            this.i = j;
                        }
                        this.j = 4;
                        this.g = 2;
                        if (n4 != 0) {
                            return 0;
                        }
                        continue;
                    }
                    else {
                        if (((e)i).e(this.c.a, 0, 11, true)) {
                            this.c.B(0);
                            this.k = this.c.r();
                            this.l = this.c.t();
                            this.m = this.c.t();
                            this.m = ((long)(this.c.r() << 24) | this.m) * 1000L;
                            this.c.C(3);
                            this.g = 4;
                            b2 = true;
                        }
                        if (!b2) {
                            return -1;
                        }
                        continue;
                    }
                }
                else {
                    ((e)i).n(this.j);
                    this.j = 0;
                    this.g = 3;
                }
            }
            else {
                int n7;
                if (!((e)i).e(this.b.a, 0, 9, true)) {
                    n7 = n;
                }
                else {
                    this.b.B(0);
                    this.b.C(4);
                    final int r = this.b.r();
                    final boolean b7 = (r & 0x4) != 0x0;
                    if ((r & 0x1) != 0x0) {
                        b = true;
                    }
                    if (b7 && this.o == null) {
                        this.o = new com.google.android.exoplayer2.extractor.flv.a(this.f.i(8, 1));
                    }
                    if (b && this.p == null) {
                        this.p = new com.google.android.exoplayer2.extractor.flv.b(this.f.i(9, 2));
                    }
                    this.f.b();
                    this.j = this.b.c() - 9 + 4;
                    this.g = 2;
                    n7 = 1;
                }
                if (n7 == 0) {
                    return -1;
                }
                continue;
            }
        }
    }
    
    @Override
    public final void release() {
    }
}
