// 
// Decompiled by Procyon v0.6.0
// 

package u0;

import wi.b;

public final class f
{
    public static final e a;
    
    static {
        a = a(50);
    }
    
    public static final e a(final int n) {
        final d d = b.d(n);
        return new e((u0.b)d, (u0.b)d, (u0.b)d, (u0.b)d);
    }
    
    public static e b() {
        return new e((u0.b)b.d(0), (u0.b)b.d(50), (u0.b)b.d(50), (u0.b)b.d(0));
    }
    
    public static final e c(final float n) {
        final c c = new c(n);
        return new e((u0.b)c, (u0.b)c, (u0.b)c, (u0.b)c);
    }
    
    public static final e d(final float n, final float n2, final float n3, final float n4) {
        return new e((u0.b)new c(n), (u0.b)new c(n2), (u0.b)new c(n3), (u0.b)new c(n4));
    }
    
    public static e e(float n, float n2, float n3, final int n4) {
        if ((n4 & 0x1) != 0x0) {
            n = 0;
        }
        if ((n4 & 0x2) != 0x0) {
            n2 = 0;
        }
        if ((n4 & 0x4) != 0x0) {
            n3 = 0;
        }
        float n5;
        if ((n4 & 0x8) != 0x0) {
            n5 = 0;
        }
        else {
            n5 = 0.0f;
        }
        return d(n, n2, n3, n5);
    }
}
