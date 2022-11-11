// 
// Decompiled by Procyon v0.6.0
// 

package ie;

import java.util.List;

public final class a4 extends e6 implements c7
{
    private static final a4 zza;
    private j6 zze;
    
    static {
        e6.m(a4.class, zza = new a4());
    }
    
    public a4() {
        this.zze = (j6)k7.i;
    }
    
    public static a4 t() {
        return a4.zza;
    }
    
    @Override
    public final Object q(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new l7((e6)a4.zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[] { "zze", b4.class });
        }
        if (n == 3) {
            return new a4();
        }
        if (n == 4) {
            return new w2(0);
        }
        if (n != 5) {
            return null;
        }
        return a4.zza;
    }
    
    public final int r() {
        return ((List)this.zze).size();
    }
    
    public final j6 u() {
        return this.zze;
    }
}
