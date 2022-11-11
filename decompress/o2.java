// 
// Decompiled by Procyon v0.6.0
// 

package ke;

public final class o2 extends c6 implements a7
{
    private static final o2 zza;
    private int zze;
    private String zzf;
    private h6 zzg;
    private boolean zzh;
    
    static {
        c6.m(o2.class, zza = new o2());
    }
    
    public o2() {
        this.zzf = "";
        this.zzg = (h6)i7.i;
    }
    
    @Override
    public final Object q(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new j7((c6)o2.zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u001b\u0003\u1007\u0001", new Object[] { "zze", "zzf", "zzg", t2.class, "zzh" });
        }
        if (n == 3) {
            return new o2();
        }
        if (n == 4) {
            return new m2();
        }
        if (n != 5) {
            return null;
        }
        return o2.zza;
    }
    
    public final String s() {
        return this.zzf;
    }
}
