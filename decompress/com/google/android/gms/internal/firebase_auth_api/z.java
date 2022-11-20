// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.internal.firebase_auth_api;

import he.g1;
import he.r;
import he.c8;
import com.google.android.gms.internal.firebase-auth-api.zzaau;
import he.x0;

public final class z extends e implements x0
{
    private static final com.google.android.gms.internal.firebase-auth-api.z zzb;
    private int zze;
    private zzaau zzf;
    
    static {
        e.d((Class)com.google.android.gms.internal.firebase-auth-api.z.class, (com.google.android.gms.internal.firebase-auth-api.e)(zzb = (com.google.android.gms.internal.firebase-auth-api.z)new z()));
    }
    
    public z() {
        this.zzf = com.google.android.gms.internal.firebase_auth_api.zzaau.zzb;
    }
    
    public static c8 s() {
        return (c8)((e)z.zzb).k();
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.z t() {
        return z.zzb;
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.z u(final zzaau zzaau, final r r) throws zzacf {
        return (com.google.android.gms.internal.firebase-auth-api.z)e.p((com.google.android.gms.internal.firebase-auth-api.e)z.zzb, zzaau, r);
    }
    
    public static void w(final com.google.android.gms.internal.firebase-auth-api.z z) {
        ((z)z).zze = 0;
    }
    
    public static void x(final com.google.android.gms.internal.firebase-auth-api.z z, final zzaau zzf) {
        ((z)z).zzf = zzf;
    }
    
    public final Object h(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new g1((com.google.android.gms.internal.firebase-auth-api.e)z.zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[] { "zze", "zzf" });
        }
        if (n == 3) {
            return new z();
        }
        if (n == 4) {
            return new c8(0);
        }
        if (n != 5) {
            return null;
        }
        return z.zzb;
    }
    
    public final int r() {
        return this.zze;
    }
    
    public final zzaau v() {
        return this.zzf;
    }
}
