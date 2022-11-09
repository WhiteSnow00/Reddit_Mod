// 
// Decompiled by Procyon v0.6.0
// 

package ke;

import java.util.List;

public final class z1 extends c6 implements a7
{
    private static final z1 zza;
    private int zze;
    private int zzf;
    private h6 zzg;
    private h6 zzh;
    private boolean zzi;
    private boolean zzj;
    
    static {
        c6.m(z1.class, zza = new z1());
    }
    
    public z1() {
        final i7 i = i7.i;
        this.zzg = (h6)i;
        this.zzh = (h6)i;
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
            return new j7((c6)z1.zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001\u1004\u0000\u0002\u001b\u0003\u001b\u0004\u1007\u0001\u0005\u1007\u0002", new Object[] { "zze", "zzf", "zzg", i2.class, "zzh", b2.class, "zzi", "zzj" });
        }
        if (n == 3) {
            return new z1();
        }
        if (n == 4) {
            return new y1(0);
        }
        if (n != 5) {
            return null;
        }
        return z1.zza;
    }
    
    public final int r() {
        return this.zzf;
    }
    
    public final int s() {
        return this.zzh.size();
    }
    
    public final int t() {
        return this.zzg.size();
    }
    
    public final b2 v(final int n) {
        return this.zzh.get(n);
    }
    
    public final i2 w(final int n) {
        return this.zzg.get(n);
    }
    
    public final List x() {
        return this.zzh;
    }
    
    public final h6 y() {
        return this.zzg;
    }
}
