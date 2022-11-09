// 
// Decompiled by Procyon v0.6.0
// 

package nb;

import java.io.EOFException;
import db.u$b;
import db.u;
import db.d;
import com.google.android.exoplayer2.ParserException;
import bd.d0;
import db.t;
import db.i;
import java.io.IOException;
import db.e;
import androidx.appcompat.widget.s0;
import db.j;
import bd.r;
import bd.s;
import db.h;

public final class f implements h
{
    public final int a;
    public final g b;
    public final s c;
    public final s d;
    public final r e;
    public j f;
    public long g;
    public long h;
    public int i;
    public boolean j;
    public boolean k;
    public boolean l;
    
    static {
        new(androidx.appcompat.widget.s0.class)();
    }
    
    public f(final int n) {
        this.a = 0;
        this.b = new g(true, null);
        this.c = new s(2048);
        this.i = -1;
        this.h = -1L;
        final s d = new s(10);
        this.d = d;
        final byte[] a = d.a;
        this.e = new r(a, a.length);
    }
    
    public final void a(final long n, final long g) {
        this.k = false;
        this.b.b();
        this.g = g;
    }
    
    public final int b(final e e) throws IOException {
        int n = 0;
        while (true) {
            e.h(this.d.a, 0, 10, false);
            this.d.B(0);
            if (this.d.t() != 4801587) {
                break;
            }
            this.d.C(3);
            final int q = this.d.q();
            n += q + 10;
            e.j(q, false);
        }
        e.f = 0;
        e.j(n, false);
        if (this.h == -1L) {
            this.h = n;
        }
        return n;
    }
    
    public final boolean c(final i i) throws IOException {
        final e e = (e)i;
        int b;
        final int n = b = this.b(e);
        int n3;
        int n2 = n3 = 0;
        int n4 = 0;
        do {
            e.h(this.d.a, 0, 2, false);
            this.d.B(0);
            int n6 = 0;
            Label_0212: {
                int n5;
                if ((this.d.w() & 0xFFF6) != 0xFFF0) {
                    n5 = b + 1;
                    e.f = 0;
                    e.j(n5, false);
                }
                else {
                    if (++n2 >= 4 && n3 > 188) {
                        return true;
                    }
                    e.h(this.d.a, 0, 4, false);
                    this.e.k(14);
                    final int g = this.e.g(13);
                    if (g > 6) {
                        e.j(g - 6, false);
                        n3 += g;
                        n4 = b;
                        n6 = n2;
                        break Label_0212;
                    }
                    n5 = b + 1;
                    e.f = 0;
                    e.j(n5, false);
                }
                final int n7;
                n6 = (n7 = 0);
                n4 = n5;
                n3 = n7;
            }
            n2 = n6;
            b = n4;
        } while (n4 - n < 8192);
        return false;
    }
    
    public final void f(final j f) {
        this.f = f;
        this.b.d(f, new e0$d(0, 1));
        f.b();
    }
    
    public final int h(final i i, t t) throws IOException {
        d0.g(this.f);
        t = (t)i;
        final long c = ((e)t).c;
        final int a = this.a;
        Label_0430: {
            if ((a & 0x2) == 0x0 && ((a & 0x1) == 0x0 || c == -1L)) {
                break Label_0430;
            }
            if (this.j) {
                break Label_0430;
            }
            this.i = -1;
            ((e)t).f = 0;
            final long d = ((e)t).d;
            long n = 0L;
            if (d == 0L) {
                this.b((e)t);
            }
            int n2 = 0;
        Label_0396_Outer:
            while (true) {
                int read = n2;
                long n3 = n;
                while (true) {
                    try {
                        final byte[] a2 = this.d.a;
                        read = n2;
                        n3 = n;
                        final e e = (e)i;
                        int n4 = n2;
                        long n5 = n;
                        read = n2;
                        n3 = n;
                        if (e.h(a2, 0, 2, true)) {
                            read = n2;
                            n3 = n;
                            this.d.B(0);
                            read = n2;
                            n3 = n;
                            if ((this.d.w() & 0xFFF6) != 0xFFF0) {
                                n4 = 0;
                                n5 = n;
                            }
                            else {
                                read = n2;
                                n3 = n;
                                if (!e.h(this.d.a, 0, 4, true)) {
                                    n4 = n2;
                                    n5 = n;
                                }
                                else {
                                    read = n2;
                                    n3 = n;
                                    this.e.k(14);
                                    read = n2;
                                    n3 = n;
                                    final int g = this.e.g(13);
                                    if (g <= 6) {
                                        read = n2;
                                        n3 = n;
                                        this.j = true;
                                        read = n2;
                                        n3 = n;
                                        throw ParserException.createForMalformedContainer("Malformed ADTS stream", (Throwable)null);
                                    }
                                    n5 = n + g;
                                    n4 = n2 + 1;
                                    if (n4 != 1000) {
                                        n2 = n4;
                                        n = n5;
                                        read = n4;
                                        n3 = n5;
                                        if (e.j(g - 6, true)) {
                                            continue Label_0396_Outer;
                                        }
                                    }
                                }
                            }
                        }
                        ((e)t).f = 0;
                        if (n4 > 0) {
                            this.i = (int)(n5 / n4);
                        }
                        else {
                            this.i = -1;
                        }
                        this.j = true;
                        read = ((e)t).read(this.c.a, 0, 2048);
                        final boolean b = read == -1;
                        if (!this.l) {
                            final int a3 = this.a;
                            final boolean b2 = (a3 & 0x1) != 0x0 && this.i > 0;
                            if (!b2 || this.b.q != -9223372036854775807L || b) {
                                Label_0636: {
                                    if (b2) {
                                        final long q = this.b.q;
                                        if (q != -9223372036854775807L) {
                                            final j f = this.f;
                                            final boolean b3 = (a3 & 0x2) != 0x0;
                                            final int j = this.i;
                                            f.s((u)new d((int)(j * 8 * 1000000L / q), c, j, this.h, b3));
                                            break Label_0636;
                                        }
                                    }
                                    this.f.s((u)new u$b(-9223372036854775807L));
                                }
                                this.l = true;
                            }
                        }
                        if (b) {
                            return -1;
                        }
                        this.c.B(0);
                        this.c.A(read);
                        if (!this.k) {
                            this.b.f(4, this.g);
                            this.k = true;
                        }
                        this.b.c(this.c);
                        return 0;
                    }
                    catch (final EOFException ex) {
                        final int n4 = read;
                        final long n5 = n3;
                        continue;
                    }
                    break;
                }
            }
        }
    }
    
    public final void release() {
    }
}
