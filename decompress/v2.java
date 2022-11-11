// 
// Decompiled by Procyon v0.6.0
// 

package ke;

public final class v2 extends c6 implements a7
{
    private static final v2 zza;
    private int zze;
    private String zzf;
    private String zzg;
    
    static {
        c6.m(v2.class, zza = new v2());
    }
    
    public v2() {
        this.zzf = "";
        this.zzg = "";
    }
    
    @Override
    public final Object q(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new j7((c6)v2.zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001", new Object[] { "zze", "zzf", "zzg" });
        }
        if (n == 3) {
            return new v2();
        }
        if (n == 4) {
            return new u2();
        }
        if (n != 5) {
            return null;
        }
        return v2.zza;
    }
    
    public final String s() {
        return this.zzf;
    }
    
    public final String t() {
        return this.zzg;
    }
}
