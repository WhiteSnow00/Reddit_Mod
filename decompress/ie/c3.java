// 
// Decompiled by Procyon v0.6.0
// 

package ie;

public final class c3 extends e6 implements c7
{
    private static final c3 zza;
    private int zze;
    private int zzf;
    private v3 zzg;
    private v3 zzh;
    private boolean zzi;
    
    static {
        e6.m(c3.class, zza = new c3());
    }
    
    public static b3 s() {
        return (b3)c3.zza.n();
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
            return new l7((e6)c3.zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1009\u0001\u0003\u1009\u0002\u0004\u1007\u0003", new Object[] { "zze", "zzf", "zzg", "zzh", "zzi" });
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
    
    public final v3 u() {
        v3 v3;
        if ((v3 = this.zzg) == null) {
            v3 = ie.v3.y();
        }
        return v3;
    }
    
    public final v3 v() {
        v3 v3;
        if ((v3 = this.zzh) == null) {
            v3 = ie.v3.y();
        }
        return v3;
    }
}
