// 
// Decompiled by Procyon v0.6.0
// 

package ie;

public final class x2 extends e6 implements c7
{
    private static final x2 zza;
    private int zze;
    private String zzf;
    private String zzg;
    
    static {
        e6.m(x2.class, zza = new x2());
    }
    
    public x2() {
        this.zzf = "";
        this.zzg = "";
    }
    
    @Override
    public final Object q(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new l7((e6)x2.zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001", new Object[] { "zze", "zzf", "zzg" });
        }
        if (n == 3) {
            return new x2();
        }
        if (n == 4) {
            return new w2();
        }
        if (n != 5) {
            return null;
        }
        return x2.zza;
    }
    
    public final String s() {
        return this.zzf;
    }
    
    public final String t() {
        return this.zzg;
    }
}
