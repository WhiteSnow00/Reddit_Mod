// 
// Decompiled by Procyon v0.6.0
// 

package je;

public final class b3 extends c6 implements a7
{
    private static final b3 zza;
    private int zze;
    private int zzf;
    private long zzg;
    
    static {
        c6.m((Class)b3.class, (c6)(zza = new b3()));
    }
    
    public static a3 t() {
        return (a3)b3.zza.n();
    }
    
    public static b3 u() {
        return b3.zza;
    }
    
    public static void v(final b3 b3, final int zzf) {
        b3.zze |= 0x1;
        b3.zzf = zzf;
    }
    
    public static void w(final b3 b3, final long zzg) {
        b3.zze |= 0x2;
        b3.zzg = zzg;
    }
    
    public final Object q(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new j7((c6)b3.zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1002\u0001", new Object[] { "zze", "zzf", "zzg" });
        }
        if (n == 3) {
            return new b3();
        }
        if (n == 4) {
            return new a3(0);
        }
        if (n != 5) {
            return null;
        }
        return b3.zza;
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
