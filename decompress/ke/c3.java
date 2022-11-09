// 
// Decompiled by Procyon v0.6.0
// 

package ke;

public final class c3 extends c6 implements a7
{
    private static final c3 zza;
    private int zze;
    private int zzf;
    private long zzg;
    
    static {
        c6.m(c3.class, zza = new c3());
    }
    
    public static b3 t() {
        return (b3)c3.zza.n();
    }
    
    @Override
    public final Object q(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new j7((c6)c3.zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1002\u0001", new Object[] { "zze", "zzf", "zzg" });
        }
        if (n == 3) {
            return new c3();
        }
        if (n == 4) {
            return new b3(0);
        }
        if (n != 5) {
            return null;
        }
        return c3.zza;
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
