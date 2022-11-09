// 
// Decompiled by Procyon v0.6.0
// 

package ke;

import java.util.List;

public final class s2 extends c6 implements a7
{
    private static final s2 zza;
    private int zze;
    private long zzf;
    private String zzg;
    private int zzh;
    private h6 zzi;
    private h6 zzj;
    private h6 zzk;
    private String zzl;
    private boolean zzm;
    private h6 zzn;
    private h6 zzo;
    private String zzp;
    
    static {
        c6.m(s2.class, zza = new s2());
    }
    
    public s2() {
        this.zzg = "";
        final i7 i = i7.i;
        this.zzi = (h6)i;
        this.zzj = (h6)i;
        this.zzk = (h6)i;
        this.zzl = "";
        this.zzn = (h6)i;
        this.zzo = (h6)i;
        this.zzp = "";
    }
    
    public static void F(final s2 s2) {
        s2.zzk = (h6)i7.i;
    }
    
    public static r2 v() {
        return (r2)s2.zza.n();
    }
    
    public static s2 x() {
        return s2.zza;
    }
    
    public final h6 A() {
        return this.zzk;
    }
    
    public final List B() {
        return this.zzo;
    }
    
    public final h6 C() {
        return this.zzn;
    }
    
    public final List D() {
        return this.zzi;
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
            return new j7((c6)s2.zza, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0005\u0000\u0001\u1002\u0000\u0002\u1008\u0001\u0003\u1004\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007\u1008\u0003\b\u1007\u0004\t\u001b\n\u001b\u000b\u1008\u0005", new Object[] { "zze", "zzf", "zzg", "zzh", "zzi", v2.class, "zzj", q2.class, "zzk", z1.class, "zzl", "zzm", "zzn", a4.class, "zzo", o2.class, "zzp" });
        }
        if (n == 3) {
            return new s2();
        }
        if (n == 4) {
            return new r2(0);
        }
        if (n != 5) {
            return null;
        }
        return s2.zza;
    }
    
    public final int r() {
        return this.zzn.size();
    }
    
    public final int s() {
        return this.zzj.size();
    }
    
    public final long t() {
        return this.zzf;
    }
    
    public final q2 u(final int n) {
        return this.zzj.get(n);
    }
    
    public final String y() {
        return this.zzg;
    }
    
    public final String z() {
        return this.zzp;
    }
}
