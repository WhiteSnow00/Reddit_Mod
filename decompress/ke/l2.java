// 
// Decompiled by Procyon v0.6.0
// 

package ke;

import ah2.c;

public final class l2 extends c6 implements a7
{
    private static final l2 zza;
    private int zze;
    private int zzf;
    private String zzg;
    private boolean zzh;
    private h6 zzi;
    
    static {
        c6.m(l2.class, zza = new l2());
    }
    
    public l2() {
        this.zzg = "";
        this.zzi = (h6)i7.i;
    }
    
    public static l2 t() {
        return l2.zza;
    }
    
    public final int A() {
        int o0;
        if ((o0 = c.O0(this.zzf)) == 0) {
            o0 = 1;
        }
        return o0;
    }
    
    @Override
    public final Object q(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new j7((c6)l2.zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u100c\u0000\u0002\u1008\u0001\u0003\u1007\u0002\u0004\u001a", new Object[] { "zze", "zzf", k2.a, "zzg", "zzh", "zzi" });
        }
        if (n == 3) {
            return new l2();
        }
        if (n == 4) {
            return new j2();
        }
        if (n != 5) {
            return null;
        }
        return l2.zza;
    }
    
    public final int r() {
        return this.zzi.size();
    }
    
    public final String u() {
        return this.zzg;
    }
    
    public final h6 v() {
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
