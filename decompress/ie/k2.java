// 
// Decompiled by Procyon v0.6.0
// 

package ie;

public final class k2 extends e6 implements c7
{
    private static final k2 zza;
    private int zze;
    private int zzf;
    private String zzg;
    private f2 zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    
    static {
        e6.m(k2.class, zza = new k2());
    }
    
    public k2() {
        this.zzg = "";
    }
    
    public static j2 t() {
        return (j2)k2.zza.n();
    }
    
    public final boolean A() {
        return (this.zze & 0x1) != 0x0;
    }
    
    public final boolean B() {
        return (this.zze & 0x20) != 0x0;
    }
    
    @Override
    public final Object q(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new l7((e6)k2.zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1008\u0001\u0003\u1009\u0002\u0004\u1007\u0003\u0005\u1007\u0004\u0006\u1007\u0005", new Object[] { "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk" });
        }
        if (n == 3) {
            return new k2();
        }
        if (n == 4) {
            return new j2(0);
        }
        if (n != 5) {
            return null;
        }
        return k2.zza;
    }
    
    public final int r() {
        return this.zzf;
    }
    
    public final f2 s() {
        f2 f2;
        if ((f2 = this.zzh) == null) {
            f2 = ie.f2.s();
        }
        return f2;
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
