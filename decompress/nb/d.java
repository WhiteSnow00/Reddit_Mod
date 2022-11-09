// 
// Decompiled by Procyon v0.6.0
// 

package nb;

import db.t;
import db.u;
import db.u$b;
import db.j;
import java.io.IOException;
import db.i;
import bd.s;
import db.h;

public final class d implements h
{
    public final e a;
    public final s b;
    public boolean c;
    
    static {
        new(nb.c.class)();
    }
    
    public d() {
        this.a = new e(null);
        this.b = new s(16384);
    }
    
    public final void a(final long n, final long n2) {
        this.c = false;
        this.a.b();
    }
    
    public final boolean c(final i i) throws IOException {
        final s s = new s(10);
        int n = 0;
        db.e e;
        while (true) {
            final byte[] a = s.a;
            e = (db.e)i;
            e.h(a, 0, 10, false);
            s.B(0);
            if (s.t() != 4801587) {
                break;
            }
            s.C(3);
            final int q = s.q();
            n += q + 10;
            e.j(q, false);
        }
        e.f = 0;
        e.j(n, false);
        int n2 = 0;
        int n3 = n;
        while (true) {
            final byte[] a2 = s.a;
            final int n4 = 7;
            e.h(a2, 0, 7, false);
            s.B(0);
            final int w = s.w();
            if (w != 44096 && w != 44097) {
                e.f = 0;
                if (++n3 - n >= 8192) {
                    return false;
                }
                e.j(n3, false);
                n2 = 0;
            }
            else {
                final int n5 = n2 + 1;
                if (n5 >= 4) {
                    return true;
                }
                final byte[] a3 = s.a;
                int n6;
                if (a3.length < 7) {
                    n6 = -1;
                }
                else {
                    final int n7 = (a3[2] & 0xFF) << 8 | (a3[3] & 0xFF);
                    int n9;
                    int n10;
                    if (n7 == 65535) {
                        final int n8 = (a3[4] & 0xFF) << 16 | (a3[5] & 0xFF) << 8 | (a3[6] & 0xFF);
                        n9 = n4;
                        n10 = n8;
                    }
                    else {
                        final int n11 = 4;
                        n10 = n7;
                        n9 = n11;
                    }
                    int n12 = n9;
                    if (w == 44097) {
                        n12 = n9 + 2;
                    }
                    n6 = n10 + n12;
                }
                if (n6 == -1) {
                    return false;
                }
                e.j(n6 - 7, false);
                n2 = n5;
            }
        }
    }
    
    public final void f(final j j) {
        this.a.d(j, new e0$d(0, 1));
        j.b();
        j.s((u)new u$b(-9223372036854775807L));
    }
    
    public final int h(final i i, final t t) throws IOException {
        final int read = ((db.e)i).read(this.b.a, 0, 16384);
        if (read == -1) {
            return -1;
        }
        this.b.B(0);
        this.b.A(read);
        if (!this.c) {
            this.a.f(4, 0L);
            this.c = true;
        }
        this.a.c(this.b);
        return 0;
    }
    
    public final void release() {
    }
}
