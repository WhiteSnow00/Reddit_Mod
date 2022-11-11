// 
// Decompiled by Procyon v0.6.0
// 

package ie;

public final class q2 extends e6 implements c7
{
    private static final q2 zza;
    private int zze;
    private String zzf;
    private j6 zzg;
    private boolean zzh;
    
    static {
        e6.m(q2.class, zza = new q2());
    }
    
    public q2() {
        this.zzf = "";
        this.zzg = (j6)k7.i;
    }
    
    @Override
    public final Object q(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new l7((e6)q2.zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u001b\u0003\u1007\u0001", new Object[] { "zze", "zzf", "zzg", v2.class, "zzh" });
        }
        if (n == 3) {
            return new q2();
        }
        if (n == 4) {
            return new o2();
        }
        if (n != 5) {
            return null;
        }
        return q2.zza;
    }
    
    public final String s() {
        return this.zzf;
    }
}
