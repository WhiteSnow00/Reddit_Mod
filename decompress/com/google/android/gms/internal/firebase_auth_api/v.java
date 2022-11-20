// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.internal.firebase_auth_api;

import he.g1;
import he.r;
import he.x7;
import com.google.android.gms.internal.firebase-auth-api.zzaau;
import he.x0;

public final class v extends e implements x0
{
    private static final com.google.android.gms.internal.firebase-auth-api.v zzb;
    private int zze;
    private zzaau zzf;
    
    static {
        e.d((Class)com.google.android.gms.internal.firebase-auth-api.v.class, (com.google.android.gms.internal.firebase-auth-api.e)(zzb = (com.google.android.gms.internal.firebase-auth-api.v)new v()));
    }
    
    public v() {
        this.zzf = com.google.android.gms.internal.firebase_auth_api.zzaau.zzb;
    }
    
    public static x7 s() {
        return (x7)((e)v.zzb).k();
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.v t() {
        return v.zzb;
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.v u(final zzaau zzaau, final r r) throws zzacf {
        return (com.google.android.gms.internal.firebase-auth-api.v)e.p((com.google.android.gms.internal.firebase-auth-api.e)v.zzb, zzaau, r);
    }
    
    public static void w(final com.google.android.gms.internal.firebase-auth-api.v v) {
        ((v)v).zze = 0;
    }
    
    public static void x(final com.google.android.gms.internal.firebase-auth-api.v v, final zzaau zzf) {
        ((v)v).zzf = zzf;
    }
    
    public final Object h(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new g1((com.google.android.gms.internal.firebase-auth-api.e)v.zzb, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[] { "zze", "zzf" });
        }
        if (n == 3) {
            return new v();
        }
        if (n == 4) {
            return new x7(0);
        }
        if (n != 5) {
            return null;
        }
        return v.zzb;
    }
    
    public final int r() {
        return this.zze;
    }
    
    public final zzaau v() {
        return this.zzf;
    }
}
