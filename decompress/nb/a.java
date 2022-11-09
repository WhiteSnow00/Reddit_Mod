// 
// Decompiled by Procyon v0.6.0
// 

package nb;

import db.t;
import db.u;
import db.u$b;
import db.j;
import java.io.IOException;
import db.e;
import db.i;
import androidx.viewpager.widget.c;
import bd.s;
import db.h;

public final class a implements h
{
    public final b a;
    public final s b;
    public boolean c;
    
    static {
        new(androidx.viewpager.widget.c.class)();
    }
    
    public a() {
        this.a = new b(null);
        this.b = new s(2786);
    }
    
    public final void a(final long n, final long n2) {
        this.c = false;
        this.a.b();
    }
    
    public final boolean c(final i i) throws IOException {
        final s s = new s(10);
        int n = 0;
        e e;
        while (true) {
            final byte[] a = s.a;
            e = (e)i;
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
            e.h(s.a, 0, 6, false);
            s.B(0);
            if (s.w() != 2935) {
                e.f = 0;
                if (++n3 - n >= 8192) {
                    return false;
                }
                e.j(n3, false);
                n2 = 0;
            }
            else {
                final int n4 = n2 + 1;
                if (n4 >= 4) {
                    return true;
                }
                final byte[] a2 = s.a;
                int a3;
                if (a2.length < 6) {
                    a3 = -1;
                }
                else if ((a2[5] & 0xF8) >> 3 > 10) {
                    a3 = (((a2[2] & 0x7) << 8 | (a2[3] & 0xFF)) + 1) * 2;
                }
                else {
                    final byte b = a2[4];
                    a3 = ya.b.a((b & 0xC0) >> 6, b & 0x3F);
                }
                if (a3 == -1) {
                    return false;
                }
                e.j(a3 - 6, false);
                n2 = n4;
            }
        }
    }
    
    public final void f(final j j) {
        this.a.d(j, new e0$d(0, 1));
        j.b();
        j.s((u)new u$b(-9223372036854775807L));
    }
    
    public final int h(final i i, final t t) throws IOException {
        final int read = ((e)i).read(this.b.a, 0, 2786);
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
