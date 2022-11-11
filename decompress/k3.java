// 
// Decompiled by Procyon v0.6.0
// 

package ke;

public final class k3 extends c6 implements a7
{
    private static final k3 zza;
    private int zze;
    private String zzf;
    private String zzg;
    private y2 zzh;
    
    static {
        c6.m(k3.class, zza = new k3());
    }
    
    public k3() {
        this.zzf = "";
        this.zzg = "";
    }
    
    @Override
    public final Object q(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new j7((c6)k3.zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1009\u0002", new Object[] { "zze", "zzf", "zzg", "zzh" });
        }
        if (n == 3) {
            return new k3();
        }
        if (n == 4) {
            return new j3();
        }
        if (n != 5) {
            return null;
        }
        return k3.zza;
    }
}
