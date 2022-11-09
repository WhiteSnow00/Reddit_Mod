// 
// Decompiled by Procyon v0.6.0
// 

package mb;

import com.google.android.exoplayer2.ParserException;
import db.w$a;
import bd.d0;
import db.t;
import db.u;
import db.u$b;
import db.j;
import java.io.IOException;
import db.e;
import db.i;
import db.w;
import bd.s;
import com.google.android.exoplayer2.n;
import db.h;

public final class a implements h
{
    public final n a;
    public final s b;
    public w c;
    public int d;
    public int e;
    public long f;
    public int g;
    public int h;
    
    public a(final n a) {
        this.a = a;
        this.b = new s(9);
        this.d = 0;
    }
    
    public final void a(final long n, final long n2) {
        this.d = 0;
    }
    
    public final boolean c(final i i) throws IOException {
        this.b.y(8);
        final byte[] a = this.b.a;
        final e e = (e)i;
        boolean b = false;
        e.h(a, 0, 8, false);
        if (this.b.c() == 1380139777) {
            b = true;
        }
        return b;
    }
    
    public final void f(final j j) {
        j.s((u)new u$b(-9223372036854775807L));
        (this.c = j.k(0, 3)).a(this.a);
        j.b();
    }
    
    public final int h(final i i, final t t) throws IOException {
        d0.g(this.c);
        while (true) {
            final int d = this.d;
            boolean b = true;
            final int n = 0;
            if (d != 0) {
                if (d != 1) {
                    if (d == 2) {
                        while (this.g > 0) {
                            this.b.y(3);
                            ((e)i).f(this.b.a, 0, 3, false);
                            this.c.c(3, this.b);
                            this.h += 3;
                            --this.g;
                        }
                        final int h = this.h;
                        if (h > 0) {
                            this.c.b(this.f, 1, h, 0, (w$a)null);
                        }
                        this.d = 1;
                        return 0;
                    }
                    throw new IllegalStateException();
                }
                else {
                    final int e = this.e;
                    Label_0285: {
                        Label_0269: {
                            if (e == 0) {
                                this.b.y(5);
                                if (((e)i).f(this.b.a, 0, 5, true)) {
                                    this.f = this.b.s() * 1000L / 45L;
                                    break Label_0269;
                                }
                            }
                            else {
                                if (e != 1) {
                                    final StringBuilder sb = new StringBuilder(39);
                                    sb.append("Unsupported version number: ");
                                    sb.append(e);
                                    throw ParserException.createForMalformedContainer(sb.toString(), (Throwable)null);
                                }
                                this.b.y(9);
                                if (((e)i).f(this.b.a, 0, 9, true)) {
                                    this.f = this.b.k();
                                    break Label_0269;
                                }
                            }
                            b = false;
                            break Label_0285;
                        }
                        this.g = this.b.r();
                        this.h = 0;
                    }
                    if (!b) {
                        this.d = 0;
                        return -1;
                    }
                    this.d = 2;
                }
            }
            else {
                this.b.y(8);
                final byte[] a = this.b.a;
                int n2 = n;
                if (((e)i).f(a, 0, 8, true)) {
                    if (this.b.c() != 1380139777) {
                        throw new IOException("Input not RawCC");
                    }
                    this.e = this.b.r();
                    n2 = 1;
                }
                if (n2 == 0) {
                    return -1;
                }
                this.d = 1;
            }
        }
    }
    
    public final void release() {
    }
}
