// 
// Decompiled by Procyon v0.6.0
// 

package ke;

public final class g2 extends c6 implements a7
{
    private static final g2 zza;
    private int zze;
    private int zzf;
    private boolean zzg;
    private String zzh;
    private String zzi;
    private String zzj;
    
    static {
        c6.m(g2.class, zza = new g2());
    }
    
    public g2() {
        this.zzh = "";
        this.zzi = "";
        this.zzj = "";
    }
    
    public static g2 s() {
        return g2.zza;
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
            return new j7((c6)g2.zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1007\u0001\u0003\u1008\u0002\u0004\u1008\u0003\u0005\u1008\u0004", new Object[] { "zze", "zzf", f2.a, "zzg", "zzh", "zzi", "zzj" });
        }
        if (n == 3) {
            return new g2();
        }
        if (n == 4) {
            return new e2();
        }
        if (n != 5) {
            return null;
        }
        return g2.zza;
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
