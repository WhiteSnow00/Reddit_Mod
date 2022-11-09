// 
// Decompiled by Procyon v0.6.0
// 

package ke;

import com.google.android.gms.internal.measurement.b;

public final class e3 extends c6 implements a7
{
    private static final e3 zza;
    private int zze;
    private h6 zzf;
    private String zzg;
    private long zzh;
    private long zzi;
    private int zzj;
    
    static {
        c6.m(e3.class, zza = new e3());
    }
    
    public e3() {
        this.zzf = (h6)i7.i;
        this.zzg = "";
    }
    
    public static void D(final e3 e3) {
        e3.zzf = (h6)i7.i;
    }
    
    public static d3 v() {
        return (d3)e3.zza.n();
    }
    
    public final boolean I() {
        return (this.zze & 0x8) != 0x0;
    }
    
    public final boolean J() {
        return (this.zze & 0x4) != 0x0;
    }
    
    public final boolean K() {
        return (this.zze & 0x2) != 0x0;
    }
    
    public final void L() {
        final h6 zzf = this.zzf;
        if (!zzf.s()) {
            this.zzf = c6.k(zzf);
        }
    }
    
    @Override
    public final Object q(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new j7((c6)e3.zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002\u1008\u0000\u0003\u1002\u0001\u0004\u1002\u0002\u0005\u1004\u0003", new Object[] { "zze", "zzf", i3.class, "zzg", "zzh", "zzi", "zzj" });
        }
        if (n == 3) {
            return new e3();
        }
        if (n == 4) {
            return new d3(0);
        }
        if (n != 5) {
            return null;
        }
        return e3.zza;
    }
    
    public final int r() {
        return this.zzj;
    }
    
    public final int s() {
        return this.zzf.size();
    }
    
    public final long t() {
        return this.zzi;
    }
    
    public final long u() {
        return this.zzh;
    }
    
    public final i3 x(final int n) {
        return this.zzf.get(n);
    }
    
    public final String y() {
        return this.zzg;
    }
    
    public final h6 z() {
        return this.zzf;
    }
}
