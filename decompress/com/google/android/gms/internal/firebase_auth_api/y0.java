// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.internal.firebase_auth_api;

import he.g1;
import he.r;
import com.google.android.gms.internal.firebase-auth-api.zzaau;
import he.c9;
import com.google.android.gms.internal.firebase-auth-api.z0;
import he.x0;

public final class y0 extends e implements x0
{
    private static final com.google.android.gms.internal.firebase-auth-api.y0 zzb;
    private int zze;
    private z0 zzf;
    
    static {
        e.d((Class)com.google.android.gms.internal.firebase-auth-api.y0.class, (com.google.android.gms.internal.firebase-auth-api.e)(zzb = (com.google.android.gms.internal.firebase-auth-api.y0)new y0()));
    }
    
    public static c9 s() {
        return (c9)((e)y0.zzb).k();
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.y0 t() {
        return y0.zzb;
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.y0 u(final zzaau zzaau, final r r) throws zzacf {
        return (com.google.android.gms.internal.firebase-auth-api.y0)e.p((com.google.android.gms.internal.firebase-auth-api.e)y0.zzb, zzaau, r);
    }
    
    public static void w(final com.google.android.gms.internal.firebase-auth-api.y0 y0) {
        ((y0)y0).zze = 0;
    }
    
    public static void x(final com.google.android.gms.internal.firebase-auth-api.y0 y0, final z0 zzf) {
        zzf.getClass();
        ((y0)y0).zzf = zzf;
    }
    
    public final Object h(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new g1((com.google.android.gms.internal.firebase-auth-api.e)y0.zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[] { "zze", "zzf" });
        }
        if (n == 3) {
            return new y0();
        }
        if (n == 4) {
            return new c9(0);
        }
        if (n != 5) {
            return null;
        }
        return y0.zzb;
    }
    
    public final int r() {
        return this.zze;
    }
    
    public final z0 v() {
        z0 z0;
        if ((z0 = this.zzf) == null) {
            z0 = com.google.android.gms.internal.firebase_auth_api.z0.t();
        }
        return z0;
    }
}
