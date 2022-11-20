// 
// Decompiled by Procyon v0.6.0
// 

package fk2;

import dg2.j;
import ng2.e;

public final class c0
{
    public final byte[] a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public c0 f;
    public c0 g;
    
    public c0() {
        this.a = new byte[8192];
        this.e = true;
        this.d = false;
    }
    
    public c0(final byte[] a, final int b, final int c, final boolean d, final boolean e) {
        ng2.e.f((Object)a, "data");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final c0 a() {
        c0 f = this.f;
        if (f == this) {
            f = null;
        }
        final c0 g = this.g;
        ng2.e.c((Object)g);
        g.f = this.f;
        final c0 f2 = this.f;
        ng2.e.c((Object)f2);
        f2.g = this.g;
        this.f = null;
        this.g = null;
        return f;
    }
    
    public final void b(final c0 c0) {
        c0.g = this;
        c0.f = this.f;
        final c0 f = this.f;
        ng2.e.c((Object)f);
        f.g = c0;
        this.f = c0;
    }
    
    public final c0 c() {
        this.d = true;
        return new c0(this.a, this.b, this.c, true, false);
    }
    
    public final void d(final c0 c0, final int n) {
        if (c0.e) {
            final int c2 = c0.c;
            final int n2 = c2 + n;
            if (n2 > 8192) {
                if (c0.d) {
                    throw new IllegalArgumentException();
                }
                final int b = c0.b;
                if (n2 - b > 8192) {
                    throw new IllegalArgumentException();
                }
                final byte[] a = c0.a;
                j.P1(a, a, 0, b, c2, 2);
                c0.c -= c0.b;
                c0.b = 0;
            }
            final byte[] a2 = this.a;
            final byte[] a3 = c0.a;
            final int c3 = c0.c;
            final int b2 = this.b;
            j.M1(a2, c3, b2, b2 + n, a3);
            c0.c += n;
            this.b += n;
            return;
        }
        throw new IllegalStateException("only owner can write".toString());
    }
}
