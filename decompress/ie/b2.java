// 
// Decompiled by Procyon v0.6.0
// 

package ie;

import java.util.List;

public final class b2 extends e6 implements c7
{
    private static final b2 zza;
    private int zze;
    private int zzf;
    private j6 zzg;
    private j6 zzh;
    private boolean zzi;
    private boolean zzj;
    
    static {
        e6.m(b2.class, zza = new b2());
    }
    
    public b2() {
        final k7 i = k7.i;
        this.zzg = (j6)i;
        this.zzh = (j6)i;
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
            return new l7((e6)b2.zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001\u1004\u0000\u0002\u001b\u0003\u001b\u0004\u1007\u0001\u0005\u1007\u0002", new Object[] { "zze", "zzf", "zzg", k2.class, "zzh", d2.class, "zzi", "zzj" });
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
        return this.zzf;
    }
    
    public final int s() {
        return ((List)this.zzh).size();
    }
    
    public final int t() {
        return ((List)this.zzg).size();
    }
    
    public final d2 v(final int n) {
        return ((List<d2>)this.zzh).get(n);
    }
    
    public final k2 w(final int n) {
        return ((List<k2>)this.zzg).get(n);
    }
    
    public final List x() {
        return (List)this.zzh;
    }
    
    public final j6 y() {
        return this.zzg;
    }
}
