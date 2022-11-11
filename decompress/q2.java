// 
// Decompiled by Procyon v0.6.0
// 

package ke;

public final class q2 extends c6 implements a7
{
    private static final q2 zza;
    private int zze;
    private String zzf;
    private boolean zzg;
    private boolean zzh;
    private int zzi;
    
    static {
        c6.m(q2.class, zza = new q2());
    }
    
    public q2() {
        this.zzf = "";
    }
    
    @Override
    public final Object q(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new j7((c6)q2.zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1007\u0001\u0003\u1007\u0002\u0004\u1004\u0003", new Object[] { "zze", "zzf", "zzg", "zzh", "zzi" });
        }
        if (n == 3) {
            return new q2();
        }
        if (n == 4) {
            return new p2(0);
        }
        if (n != 5) {
            return null;
        }
        return q2.zza;
    }
    
    public final int r() {
        return this.zzi;
    }
    
    public final String t() {
        return this.zzf;
    }
    
    public final boolean v() {
        return this.zzg;
    }
    
    public final boolean w() {
        return this.zzh;
    }
    
    public final boolean x() {
        return (this.zze & 0x2) != 0x0;
    }
    
    public final boolean y() {
        return (this.zze & 0x4) != 0x0;
    }
    
    public final boolean z() {
        return (this.zze & 0x8) != 0x0;
    }
}
