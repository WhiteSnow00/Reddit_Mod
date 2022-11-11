// 
// Decompiled by Procyon v0.6.0
// 

package ie;

public final class a3 extends e6 implements c7
{
    private static final a3 zza;
    private int zze;
    private String zzf;
    private String zzg;
    private String zzh;
    private String zzi;
    private String zzj;
    private String zzk;
    private String zzl;
    
    static {
        e6.m(a3.class, zza = new a3());
    }
    
    public a3() {
        this.zzf = "";
        this.zzg = "";
        this.zzh = "";
        this.zzi = "";
        this.zzj = "";
        this.zzk = "";
        this.zzl = "";
    }
    
    @Override
    public final Object q(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new l7((e6)a3.zza, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0004\u1008\u0003\u0005\u1008\u0004\u0006\u1008\u0005\u0007\u1008\u0006", new Object[] { "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl" });
        }
        if (n == 3) {
            return new a3();
        }
        if (n == 4) {
            return new z2();
        }
        if (n != 5) {
            return null;
        }
        return a3.zza;
    }
}
