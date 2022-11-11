// 
// Decompiled by Procyon v0.6.0
// 

package ie;

public final class i3 extends e6 implements c7
{
    private static final i3 zza;
    private int zze;
    private String zzf;
    private long zzg;
    
    static {
        e6.m(i3.class, zza = new i3());
    }
    
    public i3() {
        this.zzf = "";
    }
    
    @Override
    public final Object q(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new l7((e6)i3.zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1002\u0001", new Object[] { "zze", "zzf", "zzg" });
        }
        if (n == 3) {
            return new i3();
        }
        if (n == 4) {
            return new h3(0);
        }
        if (n != 5) {
            return null;
        }
        return i3.zza;
    }
}
