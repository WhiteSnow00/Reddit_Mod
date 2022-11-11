// 
// Decompiled by Procyon v0.6.0
// 

package ie;

import java.util.List;

public final class d2 extends e6 implements c7
{
    private static final d2 zza;
    private int zze;
    private int zzf;
    private String zzg;
    private j6 zzh;
    private boolean zzi;
    private i2 zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;
    
    static {
        e6.m(d2.class, zza = new d2());
    }
    
    public d2() {
        this.zzg = "";
        this.zzh = (j6)k7.i;
    }
    
    public static c2 t() {
        return (c2)d2.zza.n();
    }
    
    public final boolean B() {
        return this.zzk;
    }
    
    public final boolean C() {
        return this.zzl;
    }
    
    public final boolean D() {
        return this.zzm;
    }
    
    public final boolean E() {
        return (this.zze & 0x8) != 0x0;
    }
    
    public final boolean F() {
        return (this.zze & 0x1) != 0x0;
    }
    
    public final boolean G() {
        return (this.zze & 0x40) != 0x0;
    }
    
    @Override
    public final Object q(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new l7((e6)d2.zza, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u1004\u0000\u0002\u1008\u0001\u0003\u001b\u0004\u1007\u0002\u0005\u1009\u0003\u0006\u1007\u0004\u0007\u1007\u0005\b\u1007\u0006", new Object[] { "zze", "zzf", "zzg", "zzh", f2.class, "zzi", "zzj", "zzk", "zzl", "zzm" });
        }
        if (n == 3) {
            return new d2();
        }
        if (n == 4) {
            return new c2(0);
        }
        if (n != 5) {
            return null;
        }
        return d2.zza;
    }
    
    public final int r() {
        return ((List)this.zzh).size();
    }
    
    public final int s() {
        return this.zzf;
    }
    
    public final f2 v(final int n) {
        return ((List<f2>)this.zzh).get(n);
    }
    
    public final i2 w() {
        i2 i2;
        if ((i2 = this.zzj) == null) {
            i2 = ie.i2.s();
        }
        return i2;
    }
    
    public final String x() {
        return this.zzg;
    }
    
    public final j6 y() {
        return this.zzh;
    }
}
