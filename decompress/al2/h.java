// 
// Decompiled by Procyon v0.6.0
// 

package al2;

import nm2.d;

public final class h extends c
{
    public h() {
    }
    
    public h(final h h) {
        super((c)h);
    }
    
    public final void a(final d d) {
        this.l((c)d);
    }
    
    public final d copy() {
        return (d)new h(this);
    }
    
    public final String e() {
        return "SHA-512";
    }
    
    public final int f() {
        return 64;
    }
    
    public final int g(final int n, final byte[] array) {
        this.m();
        ai2.h.V(super.e, array, n);
        ai2.h.V(super.f, array, n + 8);
        ai2.h.V(super.g, array, n + 16);
        ai2.h.V(super.h, array, n + 24);
        ai2.h.V(super.i, array, n + 32);
        ai2.h.V(super.j, array, n + 40);
        ai2.h.V(super.k, array, n + 48);
        ai2.h.V(super.l, array, n + 56);
        this.reset();
        return 64;
    }
    
    public final void reset() {
        super.reset();
        super.e = 7640891576956012808L;
        super.f = -4942790177534073029L;
        super.g = 4354685564936845355L;
        super.h = -6534734903238641935L;
        super.i = 5840696475078001361L;
        super.j = -7276294671716946913L;
        super.k = 2270897969802886507L;
        super.l = 6620516959819538809L;
    }
}
