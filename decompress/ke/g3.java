// 
// Decompiled by Procyon v0.6.0
// 

package ke;

public final class g3 extends c6 implements a7
{
    private static final g3 zza;
    private int zze;
    private String zzf;
    private long zzg;
    
    static {
        c6.m(g3.class, zza = new g3());
    }
    
    public g3() {
        this.zzf = "";
    }
    
    @Override
    public final Object q(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new j7((c6)g3.zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1002\u0001", new Object[] { "zze", "zzf", "zzg" });
        }
        if (n == 3) {
            return new g3();
        }
        if (n == 4) {
            return new f3(0);
        }
        if (n != 5) {
            return null;
        }
        return g3.zza;
    }
}
