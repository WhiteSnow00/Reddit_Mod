// 
// Decompiled by Procyon v0.6.0
// 

package je;

public final class d2 extends c6 implements a7
{
    private static final d2 zza;
    private int zze;
    private l2 zzf;
    private g2 zzg;
    private boolean zzh;
    private String zzi;
    
    static {
        c6.m((Class)d2.class, (c6)(zza = new d2()));
    }
    
    public d2() {
        this.zzi = "";
    }
    
    public static d2 r() {
        return d2.zza;
    }
    
    public static d2 s() {
        return d2.zza;
    }
    
    public static void w(final d2 d2, final String zzi) {
        d2.zze |= 0x8;
        d2.zzi = zzi;
    }
    
    public final boolean A() {
        return (this.zze & 0x8) != 0x0;
    }
    
    public final boolean B() {
        return (this.zze & 0x1) != 0x0;
    }
    
    public final Object q(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new j7((c6)d2.zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001\u0003\u1007\u0002\u0004\u1008\u0003", new Object[] { "zze", "zzf", "zzg", "zzh", "zzi" });
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
    
    public final g2 t() {
        g2 g2;
        if ((g2 = this.zzg) == null) {
            g2 = je.g2.s();
        }
        return g2;
    }
    
    public final l2 u() {
        l2 l2;
        if ((l2 = this.zzf) == null) {
            l2 = je.l2.t();
        }
        return l2;
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
