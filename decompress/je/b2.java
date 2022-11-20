// 
// Decompiled by Procyon v0.6.0
// 

package je;

import java.util.List;

public final class b2 extends c6 implements a7
{
    private static final b2 zza;
    private int zze;
    private int zzf;
    private String zzg;
    private h6 zzh;
    private boolean zzi;
    private g2 zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;
    
    static {
        c6.m((Class)b2.class, (c6)(zza = new b2()));
    }
    
    public b2() {
        this.zzg = "";
        this.zzh = (h6)i7.i;
    }
    
    public static void A(final b2 b2, final int n, final d2 d2) {
        final h6 zzh = b2.zzh;
        if (!zzh.s()) {
            b2.zzh = c6.k(zzh);
        }
        ((List<d2>)b2.zzh).set(n, d2);
    }
    
    public static a2 t() {
        return (a2)b2.zza.n();
    }
    
    public static b2 u() {
        return b2.zza;
    }
    
    public static void z(final b2 b2, final String zzg) {
        b2.zze |= 0x2;
        b2.zzg = zzg;
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
    
    public final Object q(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new j7((c6)b2.zza, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u1004\u0000\u0002\u1008\u0001\u0003\u001b\u0004\u1007\u0002\u0005\u1009\u0003\u0006\u1007\u0004\u0007\u1007\u0005\b\u1007\u0006", new Object[] { "zze", "zzf", "zzg", "zzh", d2.class, "zzi", "zzj", "zzk", "zzl", "zzm" });
        }
        if (n == 3) {
            return new b2();
        }
        if (n == 4) {
            return new a2(0);
        }
        if (n != 5) {
            return null;
        }
        return b2.zza;
    }
    
    public final int r() {
        return ((List)this.zzh).size();
    }
    
    public final int s() {
        return this.zzf;
    }
    
    public final d2 v(final int n) {
        return ((List<d2>)this.zzh).get(n);
    }
    
    public final g2 w() {
        g2 g2;
        if ((g2 = this.zzj) == null) {
            g2 = je.g2.s();
        }
        return g2;
    }
    
    public final String x() {
        return this.zzg;
    }
    
    public final h6 y() {
        return this.zzh;
    }
}
