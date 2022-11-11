// 
// Decompiled by Procyon v0.6.0
// 

package ie;

public final class i2 extends e6 implements c7
{
    private static final i2 zza;
    private int zze;
    private int zzf;
    private boolean zzg;
    private String zzh;
    private String zzi;
    private String zzj;
    
    static {
        e6.m(i2.class, zza = new i2());
    }
    
    public i2() {
        this.zzh = "";
        this.zzi = "";
        this.zzj = "";
    }
    
    public static i2 s() {
        return i2.zza;
    }
    
    public final boolean A() {
        return (this.zze & 0x10) != 0x0;
    }
    
    public final boolean B() {
        return (this.zze & 0x8) != 0x0;
    }
    
    public final int C() {
        final int zzf = this.zzf;
        final int n = 1;
        int n2;
        if (zzf != 0) {
            n2 = 2;
            if (zzf != 1) {
                if (zzf != 2) {
                    n2 = 4;
                    if (zzf != 3) {
                        if (zzf != 4) {
                            n2 = 0;
                        }
                        else {
                            n2 = 5;
                        }
                    }
                }
                else {
                    n2 = 3;
                }
            }
        }
        else {
            n2 = 1;
        }
        if (n2 == 0) {
            n2 = n;
        }
        return n2;
    }
    
    @Override
    public final Object q(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new l7((e6)i2.zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1007\u0001\u0003\u1008\u0002\u0004\u1008\u0003\u0005\u1008\u0004", new Object[] { "zze", "zzf", h2.a, "zzg", "zzh", "zzi", "zzj" });
        }
        if (n == 3) {
            return new i2();
        }
        if (n == 4) {
            return new g2();
        }
        if (n != 5) {
            return null;
        }
        return i2.zza;
    }
    
    public final String t() {
        return this.zzh;
    }
    
    public final String u() {
        return this.zzj;
    }
    
    public final String v() {
        return this.zzi;
    }
    
    public final boolean w() {
        return this.zzg;
    }
    
    public final boolean x() {
        return (this.zze & 0x1) != 0x0;
    }
    
    public final boolean y() {
        return (this.zze & 0x4) != 0x0;
    }
    
    public final boolean z() {
        return (this.zze & 0x2) != 0x0;
    }
}
