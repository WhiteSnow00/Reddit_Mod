// 
// Decompiled by Procyon v0.6.0
// 

package ke;

public final class x3 extends c6 implements a7
{
    private static final x3 zza;
    private int zze;
    private long zzf;
    private String zzg;
    private String zzh;
    private long zzi;
    private float zzj;
    private double zzk;
    
    static {
        c6.m(x3.class, zza = new x3());
    }
    
    public x3() {
        this.zzg = "";
        this.zzh = "";
    }
    
    public static w3 u() {
        return (w3)x3.zza.n();
    }
    
    public final boolean G() {
        return (this.zze & 0x20) != 0x0;
    }
    
    public final boolean H() {
        return (this.zze & 0x8) != 0x0;
    }
    
    public final boolean I() {
        return (this.zze & 0x1) != 0x0;
    }
    
    public final boolean J() {
        return (this.zze & 0x4) != 0x0;
    }
    
    @Override
    public final Object q(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new j7((c6)x3.zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u1002\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0004\u1002\u0003\u0005\u1001\u0004\u0006\u1000\u0005", new Object[] { "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk" });
        }
        if (n == 3) {
            return new x3();
        }
        if (n == 4) {
            return new w3(0);
        }
        if (n != 5) {
            return null;
        }
        return x3.zza;
    }
    
    public final double r() {
        return this.zzk;
    }
    
    public final long s() {
        return this.zzi;
    }
    
    public final long t() {
        return this.zzf;
    }
    
    public final String w() {
        return this.zzg;
    }
    
    public final String x() {
        return this.zzh;
    }
}
