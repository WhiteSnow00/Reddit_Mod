// 
// Decompiled by Procyon v0.6.0
// 

package al2;

import ai2.h;
import nm2.d;

public final class g extends c
{
    public g() {
    }
    
    public g(final g g) {
        super((c)g);
    }
    
    public final void a(final d d) {
        this.l((c)d);
    }
    
    public final d copy() {
        return (d)new g(this);
    }
    
    public final String e() {
        return "SHA-384";
    }
    
    public final int f() {
        return 48;
    }
    
    public final int g(final int n, final byte[] array) {
        this.m();
        h.V(super.e, array, n);
        h.V(super.f, array, n + 8);
        h.V(super.g, array, n + 16);
        h.V(super.h, array, n + 24);
        h.V(super.i, array, n + 32);
        h.V(super.j, array, n + 40);
        this.reset();
        return 48;
    }
    
    public final void reset() {
        super.reset();
        super.e = -3766243637369397544L;
        super.f = 7105036623409894663L;
        super.g = -7973340178411365097L;
        super.h = 1526699215303891257L;
        super.i = 7436329637833083697L;
        super.j = -8163818279084223215L;
        super.k = -2662702644619276377L;
        super.l = 5167115440072839076L;
    }
}
