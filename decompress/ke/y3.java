// 
// Decompiled by Procyon v0.6.0
// 

package ke;

public final class y3 extends c6 implements a7
{
    private static final y3 zza;
    private h6 zze;
    
    static {
        c6.m(y3.class, zza = new y3());
    }
    
    public y3() {
        this.zze = (h6)i7.i;
    }
    
    public static y3 t() {
        return y3.zza;
    }
    
    @Override
    public final Object q(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new j7((c6)y3.zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[] { "zze", z3.class });
        }
        if (n == 3) {
            return new y3();
        }
        if (n == 4) {
            return new u2(0);
        }
        if (n != 5) {
            return null;
        }
        return y3.zza;
    }
    
    public final int r() {
        return this.zze.size();
    }
    
    public final h6 u() {
        return this.zze;
    }
}
