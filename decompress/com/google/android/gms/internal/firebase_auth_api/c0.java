// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.internal.firebase_auth_api;

import he.g1;
import he.r;
import com.google.android.gms.internal.firebase-auth-api.zzaau;
import he.f8;
import com.google.android.gms.internal.firebase-auth-api.d0;
import he.x0;

public final class c0 extends e implements x0
{
    private static final com.google.android.gms.internal.firebase-auth-api.c0 zzb;
    private d0 zze;
    
    static {
        e.d((Class)com.google.android.gms.internal.firebase-auth-api.c0.class, (com.google.android.gms.internal.firebase-auth-api.e)(zzb = (com.google.android.gms.internal.firebase-auth-api.c0)new c0()));
    }
    
    public static f8 r() {
        return (f8)((e)c0.zzb).k();
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.c0 s() {
        return c0.zzb;
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.c0 t(final zzaau zzaau, final r r) throws zzacf {
        return (com.google.android.gms.internal.firebase-auth-api.c0)e.p((com.google.android.gms.internal.firebase-auth-api.e)c0.zzb, zzaau, r);
    }
    
    public static void v(final com.google.android.gms.internal.firebase-auth-api.c0 c0, final d0 zze) {
        ((c0)c0).zze = zze;
    }
    
    public final Object h(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new g1((com.google.android.gms.internal.firebase-auth-api.e)c0.zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[] { "zze" });
        }
        if (n == 3) {
            return new c0();
        }
        if (n == 4) {
            return new f8(0);
        }
        if (n != 5) {
            return null;
        }
        return c0.zzb;
    }
    
    public final d0 u() {
        d0 d0;
        if ((d0 = this.zze) == null) {
            d0 = com.google.android.gms.internal.firebase_auth_api.d0.u();
        }
        return d0;
    }
}
