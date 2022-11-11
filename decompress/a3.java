// 
// Decompiled by Procyon v0.6.0
// 

package ke;

public final class a3 extends c6 implements a7
{
    private static final a3 zza;
    private int zze;
    private int zzf;
    private t3 zzg;
    private t3 zzh;
    private boolean zzi;
    
    static {
        c6.m(a3.class, zza = new a3());
    }
    
    public static z2 s() {
        return (z2)a3.zza.n();
    }
    
    public final boolean A() {
        return this.zzi;
    }
    
    public final boolean B() {
        return (this.zze & 0x1) != 0x0;
    }
    
    public final boolean C() {
        return (this.zze & 0x8) != 0x0;
    }
    
    public final boolean D() {
        return (this.zze & 0x4) != 0x0;
    }
    
    @Override
    public final Object q(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new j7((c6)a3.zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1009\u0001\u0003\u1009\u0002\u0004\u1007\u0003", new Object[] { "zze", "zzf", "zzg", "zzh", "zzi" });
        }
        if (n == 3) {
            return new a3();
        }
        if (n == 4) {
            return new z2(0);
        }
        if (n != 5) {
            return null;
        }
        return a3.zza;
    }
    
    public final int r() {
        return this.zzf;
    }
    
    public final t3 u() {
        t3 t3;
        if ((t3 = this.zzg) == null) {
            t3 = ke.t3.y();
        }
        return t3;
    }
    
    public final t3 v() {
        t3 t3;
        if ((t3 = this.zzh) == null) {
            t3 = ke.t3.y();
        }
        return t3;
    }
}
