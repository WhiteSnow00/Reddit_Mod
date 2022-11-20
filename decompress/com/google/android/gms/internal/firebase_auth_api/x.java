// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.internal.firebase_auth_api;

import he.g1;
import he.r;
import he.z7;
import com.google.android.gms.internal.firebase-auth-api.zzaau;
import he.x0;

public final class x extends e implements x0
{
    private static final com.google.android.gms.internal.firebase-auth-api.x zzb;
    private int zze;
    private zzaau zzf;
    
    static {
        e.d((Class)com.google.android.gms.internal.firebase-auth-api.x.class, (com.google.android.gms.internal.firebase-auth-api.e)(zzb = (com.google.android.gms.internal.firebase-auth-api.x)new x()));
    }
    
    public x() {
        this.zzf = com.google.android.gms.internal.firebase_auth_api.zzaau.zzb;
    }
    
    public static z7 s() {
        return (z7)((e)x.zzb).k();
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.x t() {
        return x.zzb;
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.x u(final zzaau zzaau, final r r) throws zzacf {
        return (com.google.android.gms.internal.firebase-auth-api.x)e.p((com.google.android.gms.internal.firebase-auth-api.e)x.zzb, zzaau, r);
    }
    
    public static void w(final com.google.android.gms.internal.firebase-auth-api.x x) {
        ((x)x).zze = 0;
    }
    
    public static void x(final com.google.android.gms.internal.firebase-auth-api.x x, final zzaau zzf) {
        ((x)x).zzf = zzf;
    }
    
    public final Object h(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new g1((com.google.android.gms.internal.firebase-auth-api.e)x.zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[] { "zze", "zzf" });
        }
        if (n == 3) {
            return new x();
        }
        if (n == 4) {
            return new z7(0);
        }
        if (n != 5) {
            return null;
        }
        return x.zzb;
    }
    
    public final int r() {
        return this.zze;
    }
    
    public final zzaau v() {
        return this.zzf;
    }
}
