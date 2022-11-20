// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.internal.firebase_auth_api;

import he.w8;
import he.g1;
import he.r;
import com.google.android.gms.internal.firebase-auth-api.zzaau;

public final class x0 extends e implements he.x0
{
    private static final com.google.android.gms.internal.firebase-auth-api.x0 zzb;
    private String zze;
    
    static {
        e.d((Class)com.google.android.gms.internal.firebase-auth-api.x0.class, (com.google.android.gms.internal.firebase-auth-api.e)(zzb = (com.google.android.gms.internal.firebase-auth-api.x0)new x0()));
    }
    
    public x0() {
        this.zze = "";
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.x0 r() {
        return x0.zzb;
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.x0 s() {
        return x0.zzb;
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.x0 t(final zzaau zzaau, final r r) throws zzacf {
        return (com.google.android.gms.internal.firebase-auth-api.x0)e.p((com.google.android.gms.internal.firebase-auth-api.e)x0.zzb, zzaau, r);
    }
    
    public final Object h(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new g1((com.google.android.gms.internal.firebase-auth-api.e)x0.zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0208", new Object[] { "zze" });
        }
        if (n == 3) {
            return new x0();
        }
        if (n == 4) {
            return new w8(0);
        }
        if (n != 5) {
            return null;
        }
        return x0.zzb;
    }
    
    public final String u() {
        return this.zze;
    }
}
