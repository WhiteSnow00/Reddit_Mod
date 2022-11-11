// 
// Decompiled by Procyon v0.6.0
// 

package ie;

import java.util.List;
import bg.d;

public final class n2 extends e6 implements c7
{
    private static final n2 zza;
    private int zze;
    private int zzf;
    private String zzg;
    private boolean zzh;
    private j6 zzi;
    
    static {
        e6.m(n2.class, zza = new n2());
    }
    
    public n2() {
        this.zzg = "";
        this.zzi = (j6)k7.i;
    }
    
    public static n2 t() {
        return n2.zza;
    }
    
    public final int A() {
        int t0;
        if ((t0 = d.T0(this.zzf)) == 0) {
            t0 = 1;
        }
        return t0;
    }
    
    @Override
    public final Object q(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new l7((e6)n2.zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u100c\u0000\u0002\u1008\u0001\u0003\u1007\u0002\u0004\u001a", new Object[] { "zze", "zzf", m2.a, "zzg", "zzh", "zzi" });
        }
        if (n == 3) {
            return new n2();
        }
        if (n == 4) {
            return new l2();
        }
        if (n != 5) {
            return null;
        }
        return n2.zza;
    }
    
    public final int r() {
        return ((List)this.zzi).size();
    }
    
    public final String u() {
        return this.zzg;
    }
    
    public final j6 v() {
        return this.zzi;
    }
    
    public final boolean w() {
        return this.zzh;
    }
    
    public final boolean x() {
        return (this.zze & 0x4) != 0x0;
    }
    
    public final boolean y() {
        return (this.zze & 0x2) != 0x0;
    }
    
    public final boolean z() {
        return (this.zze & 0x1) != 0x0;
    }
}
