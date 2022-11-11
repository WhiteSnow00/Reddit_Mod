// 
// Decompiled by Procyon v0.6.0
// 

package ie;

public final class m3 extends e6 implements c7
{
    private static final m3 zza;
    private int zze;
    private String zzf;
    private String zzg;
    private a3 zzh;
    
    static {
        e6.m(m3.class, zza = new m3());
    }
    
    public m3() {
        this.zzf = "";
        this.zzg = "";
    }
    
    @Override
    public final Object q(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new l7((e6)m3.zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1009\u0002", new Object[] { "zze", "zzf", "zzg", "zzh" });
        }
        if (n == 3) {
            return new m3();
        }
        if (n == 4) {
            return new l3();
        }
        if (n != 5) {
            return null;
        }
        return m3.zza;
    }
}
