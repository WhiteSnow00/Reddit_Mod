// 
// Decompiled by Procyon v0.6.0
// 

package ke;

public final class c4 extends c6 implements a7
{
    private static final c4 zza;
    private int zze;
    private int zzf;
    private h6 zzg;
    private String zzh;
    private String zzi;
    private boolean zzj;
    private double zzk;
    
    static {
        c6.m(c4.class, zza = new c4());
    }
    
    public c4() {
        this.zzg = (h6)i7.i;
        this.zzh = "";
        this.zzi = "";
    }
    
    public final int A() {
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
            return new j7((c6)c4.zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u100c\u0000\u0002\u001b\u0003\u1008\u0001\u0004\u1008\u0002\u0005\u1007\u0003\u0006\u1000\u0004", new Object[] { "zze", "zzf", b4.a, "zzg", c4.class, "zzh", "zzi", "zzj", "zzk" });
        }
        if (n == 3) {
            return new c4();
        }
        if (n == 4) {
            return new j3(0);
        }
        if (n != 5) {
            return null;
        }
        return c4.zza;
    }
    
    public final double r() {
        return this.zzk;
    }
    
    public final String t() {
        return this.zzh;
    }
    
    public final String u() {
        return this.zzi;
    }
    
    public final h6 v() {
        return this.zzg;
    }
    
    public final boolean w() {
        return this.zzj;
    }
    
    public final boolean x() {
        return (this.zze & 0x8) != 0x0;
    }
    
    public final boolean y() {
        return (this.zze & 0x10) != 0x0;
    }
    
    public final boolean z() {
        return (this.zze & 0x4) != 0x0;
    }
}
