// 
// Decompiled by Procyon v0.6.0
// 

package nb;

import bd.c0;
import db.j;
import bd.a0;
import bd.s;

public final class z implements e0
{
    public final y a;
    public final s b;
    public int c;
    public int d;
    public boolean e;
    public boolean f;
    
    public z(final y a) {
        this.a = a;
        this.b = new s(32);
    }
    
    public final void a(final a0 a0, final j j, final e0$d e0$d) {
        this.a.a(a0, j, e0$d);
        this.f = true;
    }
    
    public final void b() {
        this.f = true;
    }
    
    public final void c(int d, final s s) {
        if ((d & 0x1) != 0x0) {
            d = 1;
        }
        else {
            d = 0;
        }
        int n;
        if (d != 0) {
            n = s.b + s.r();
        }
        else {
            n = -1;
        }
        if (this.f) {
            if (d == 0) {
                return;
            }
            this.f = false;
            s.B(n);
            this.d = 0;
        }
        while (true) {
            final int c = s.c;
            d = s.b;
            if (c - d <= 0) {
                return;
            }
            final int d2 = this.d;
            if (d2 < 3) {
                if (d2 == 0) {
                    d = s.r();
                    s.B(s.b - 1);
                    if (d == 255) {
                        this.f = true;
                        return;
                    }
                }
                d = Math.min(s.c - s.b, 3 - this.d);
                s.b(this.d, d, this.b.a);
                d += this.d;
                if ((this.d = d) != 3) {
                    continue;
                }
                this.b.B(0);
                this.b.A(3);
                this.b.C(1);
                final int r = this.b.r();
                d = this.b.r();
                this.e = ((r & 0x80) != 0x0);
                d = ((r & 0xF) << 8 | d) + 3;
                this.c = d;
                final byte[] a = this.b.a;
                if (a.length >= d) {
                    continue;
                }
                d = Math.min(4098, Math.max(d, a.length * 2));
                this.b.a(d);
            }
            else {
                d = Math.min(c - d, this.c - d2);
                s.b(this.d, d, this.b.a);
                d += this.d;
                this.d = d;
                final int c2 = this.c;
                if (d != c2) {
                    continue;
                }
                if (this.e) {
                    final byte[] a2 = this.b.a;
                    int i = 0;
                    d = -1;
                    while (i < c2) {
                        d = (c0.n[(d >>> 24 ^ (a2[i] & 0xFF)) & 0xFF] ^ d << 8);
                        ++i;
                    }
                    final int a3 = c0.a;
                    if (d != 0) {
                        this.f = true;
                        return;
                    }
                    this.b.A(this.c - 4);
                }
                else {
                    this.b.A(c2);
                }
                this.b.B(0);
                this.a.c(this.b);
                this.d = 0;
            }
        }
    }
}
