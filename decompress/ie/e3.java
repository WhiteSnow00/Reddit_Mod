// 
// Decompiled by Procyon v0.6.0
// 

package ie;

public final class e3 extends e6 implements c7
{
    private static final e3 zza;
    private int zze;
    private int zzf;
    private long zzg;
    
    static {
        e6.m(e3.class, zza = new e3());
    }
    
    public static d3 t() {
        return (d3)e3.zza.n();
    }
    
    @Override
    public final Object q(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new l7((e6)e3.zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1002\u0001", new Object[] { "zze", "zzf", "zzg" });
        }
        if (n == 3) {
            return new e3();
        }
        if (n == 4) {
            return new d3(0);
        }
        if (n != 5) {
            return null;
        }
        return e3.zza;
    }
    
    public final int r() {
        return this.zzf;
    }
    
    public final long s() {
        return this.zzg;
    }
    
    public final boolean x() {
        return (this.zze & 0x2) != 0x0;
    }
    
    public final boolean y() {
        return (this.zze & 0x1) != 0x0;
    }
}
