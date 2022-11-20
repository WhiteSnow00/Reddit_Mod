// 
// Decompiled by Procyon v0.6.0
// 

package je;

public final class i2 extends c6 implements a7
{
    private static final i2 zza;
    private int zze;
    private int zzf;
    private String zzg;
    private d2 zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    
    static {
        c6.m((Class)i2.class, (c6)(zza = new i2()));
    }
    
    public i2() {
        this.zzg = "";
    }
    
    public static h2 t() {
        return (h2)i2.zza.n();
    }
    
    public static i2 u() {
        return i2.zza;
    }
    
    public static void w(final i2 i2, final String zzg) {
        i2.zze |= 0x2;
        i2.zzg = zzg;
    }
    
    public final boolean A() {
        return (this.zze & 0x1) != 0x0;
    }
    
    public final boolean B() {
        return (this.zze & 0x20) != 0x0;
    }
    
    public final Object q(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new j7((c6)i2.zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1008\u0001\u0003\u1009\u0002\u0004\u1007\u0003\u0005\u1007\u0004\u0006\u1007\u0005", new Object[] { "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk" });
        }
        if (n == 3) {
            return new i2();
        }
        if (n == 4) {
            return new h2(0);
        }
        if (n != 5) {
            return null;
        }
        return i2.zza;
    }
    
    public final int r() {
        return this.zzf;
    }
    
    public final d2 s() {
        d2 d2;
        if ((d2 = this.zzh) == null) {
            d2 = je.d2.s();
        }
        return d2;
    }
    
    public final String v() {
        return this.zzg;
    }
    
    public final boolean x() {
        return this.zzi;
    }
    
    public final boolean y() {
        return this.zzj;
    }
    
    public final boolean z() {
        return this.zzk;
    }
}
