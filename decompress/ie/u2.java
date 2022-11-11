// 
// Decompiled by Procyon v0.6.0
// 

package ie;

import java.util.List;

public final class u2 extends e6 implements c7
{
    private static final u2 zza;
    private int zze;
    private long zzf;
    private String zzg;
    private int zzh;
    private j6 zzi;
    private j6 zzj;
    private j6 zzk;
    private String zzl;
    private boolean zzm;
    private j6 zzn;
    private j6 zzo;
    private String zzp;
    
    static {
        e6.m(u2.class, zza = new u2());
    }
    
    public u2() {
        this.zzg = "";
        final k7 i = k7.i;
        this.zzi = (j6)i;
        this.zzj = (j6)i;
        this.zzk = (j6)i;
        this.zzl = "";
        this.zzn = (j6)i;
        this.zzo = (j6)i;
        this.zzp = "";
    }
    
    public static void F(final u2 u2) {
        u2.zzk = (j6)k7.i;
    }
    
    public static t2 v() {
        return (t2)u2.zza.n();
    }
    
    public static u2 x() {
        return u2.zza;
    }
    
    public final j6 A() {
        return this.zzk;
    }
    
    public final List B() {
        return (List)this.zzo;
    }
    
    public final j6 C() {
        return this.zzn;
    }
    
    public final List D() {
        return (List)this.zzi;
    }
    
    public final boolean G() {
        return this.zzm;
    }
    
    public final boolean H() {
        return (this.zze & 0x2) != 0x0;
    }
    
    public final boolean I() {
        return (this.zze & 0x1) != 0x0;
    }
    
    @Override
    public final Object q(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new l7((e6)u2.zza, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0005\u0000\u0001\u1002\u0000\u0002\u1008\u0001\u0003\u1004\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007\u1008\u0003\b\u1007\u0004\t\u001b\n\u001b\u000b\u1008\u0005", new Object[] { "zze", "zzf", "zzg", "zzh", "zzi", x2.class, "zzj", s2.class, "zzk", b2.class, "zzl", "zzm", "zzn", c4.class, "zzo", q2.class, "zzp" });
        }
        if (n == 3) {
            return new u2();
        }
        if (n == 4) {
            return new t2(0);
        }
        if (n != 5) {
            return null;
        }
        return u2.zza;
    }
    
    public final int r() {
        return ((List)this.zzn).size();
    }
    
    public final int s() {
        return ((List)this.zzj).size();
    }
    
    public final long t() {
        return this.zzf;
    }
    
    public final s2 u(final int n) {
        return ((List<s2>)this.zzj).get(n);
    }
    
    public final String y() {
        return this.zzg;
    }
    
    public final String z() {
        return this.zzp;
    }
}
