// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.internal.firebase_auth_api;

import he.f9;
import he.g1;
import he.r;
import com.google.android.gms.internal.firebase-auth-api.zzaau;
import he.x0;

public final class c1 extends e implements x0
{
    private static final com.google.android.gms.internal.firebase-auth-api.c1 zzb;
    private int zze;
    
    static {
        e.d((Class)com.google.android.gms.internal.firebase-auth-api.c1.class, (com.google.android.gms.internal.firebase-auth-api.e)(zzb = (com.google.android.gms.internal.firebase-auth-api.c1)new c1()));
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.c1 r() {
        return c1.zzb;
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.c1 s() {
        return c1.zzb;
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.c1 t(final zzaau zzaau, final r r) throws zzacf {
        return (com.google.android.gms.internal.firebase-auth-api.c1)e.p((com.google.android.gms.internal.firebase-auth-api.e)c1.zzb, zzaau, r);
    }
    
    public final Object h(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new g1((com.google.android.gms.internal.firebase-auth-api.e)c1.zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[] { "zze" });
        }
        if (n == 3) {
            return new c1();
        }
        if (n == 4) {
            return new f9();
        }
        if (n != 5) {
            return null;
        }
        return c1.zzb;
    }
}
