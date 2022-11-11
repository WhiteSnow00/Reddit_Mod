// 
// Decompiled by Procyon v0.6.0
// 

package ie;

public final class f2 extends e6 implements c7
{
    private static final f2 zza;
    private int zze;
    private n2 zzf;
    private i2 zzg;
    private boolean zzh;
    private String zzi;
    
    static {
        e6.m(f2.class, zza = new f2());
    }
    
    public f2() {
        this.zzi = "";
    }
    
    public static f2 s() {
        return f2.zza;
    }
    
    public final boolean A() {
        return (this.zze & 0x8) != 0x0;
    }
    
    public final boolean B() {
        return (this.zze & 0x1) != 0x0;
    }
    
    @Override
    public final Object q(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new l7((e6)f2.zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001\u0003\u1007\u0002\u0004\u1008\u0003", new Object[] { "zze", "zzf", "zzg", "zzh", "zzi" });
        }
        if (n == 3) {
            return new f2();
        }
        if (n == 4) {
            return new e2(0);
        }
        if (n != 5) {
            return null;
        }
        return f2.zza;
    }
    
    public final i2 t() {
        i2 i2;
        if ((i2 = this.zzg) == null) {
            i2 = ie.i2.s();
        }
        return i2;
    }
    
    public final n2 u() {
        n2 n2;
        if ((n2 = this.zzf) == null) {
            n2 = ie.n2.t();
        }
        return n2;
    }
    
    public final String v() {
        return this.zzi;
    }
    
    public final boolean x() {
        return this.zzh;
    }
    
    public final boolean y() {
        return (this.zze & 0x4) != 0x0;
    }
    
    public final boolean z() {
        return (this.zze & 0x2) != 0x0;
    }
}
