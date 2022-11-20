// 
// Decompiled by Procyon v0.6.0
// 

package je;

public final class i3 extends c6 implements a7
{
    private static final i3 zza;
    private int zze;
    private String zzf;
    private String zzg;
    private x2 zzh;
    
    static {
        c6.m((Class)i3.class, (c6)(zza = new i3()));
    }
    
    public i3() {
        this.zzf = "";
        this.zzg = "";
    }
    
    public static i3 r() {
        return i3.zza;
    }
    
    public final Object q(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new j7((c6)i3.zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1009\u0002", new Object[] { "zze", "zzf", "zzg", "zzh" });
        }
        if (n == 3) {
            return new i3();
        }
        if (n == 4) {
            return new e2((Object)null);
        }
        if (n != 5) {
            return null;
        }
        return i3.zza;
    }
}
