// 
// Decompiled by Procyon v0.6.0
// 

package ke;

public final class a4 extends c6 implements a7
{
    private static final a4 zza;
    private int zze;
    private h6 zzf;
    private y3 zzg;
    
    static {
        c6.m(a4.class, zza = new a4());
    }
    
    public a4() {
        this.zzf = (h6)i7.i;
    }
    
    @Override
    public final Object q(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new j7((c6)a4.zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u1009\u0000", new Object[] { "zze", "zzf", c4.class, "zzg" });
        }
        if (n == 3) {
            return new a4();
        }
        if (n == 4) {
            return new x2(0);
        }
        if (n != 5) {
            return null;
        }
        return a4.zza;
    }
    
    public final y3 r() {
        y3 y3;
        if ((y3 = this.zzg) == null) {
            y3 = ke.y3.t();
        }
        return y3;
    }
    
    public final h6 t() {
        return this.zzf;
    }
}
