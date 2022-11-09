// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.internal.firebase_auth_api;

import ie.h1;
import com.google.android.gms.internal.firebase-auth-api.zzacf;
import ie.r;
import ie.k8;
import com.google.android.gms.internal.firebase-auth-api.zzaau;
import com.google.android.gms.internal.firebase-auth-api.c0;
import ie.y0;

public final class e0 extends e implements y0
{
    private static final com.google.android.gms.internal.firebase-auth-api.e0 zzb;
    private int zze;
    private c0 zzf;
    private zzaau zzg;
    private zzaau zzh;
    
    static {
        e.d((Class)com.google.android.gms.internal.firebase-auth-api.e0.class, (com.google.android.gms.internal.firebase-auth-api.e)(zzb = (com.google.android.gms.internal.firebase-auth-api.e0)new e0()));
    }
    
    public e0() {
        final zzaau zzb = com.google.android.gms.internal.firebase_auth_api.zzaau.zzb;
        this.zzg = zzb;
        this.zzh = zzb;
    }
    
    public static k8 t() {
        return (k8)((e)e0.zzb).k();
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.e0 v() {
        return e0.zzb;
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.e0 w(final zzaau zzaau, final r r) throws zzacf {
        return (com.google.android.gms.internal.firebase-auth-api.e0)e.p((com.google.android.gms.internal.firebase-auth-api.e)e0.zzb, zzaau, r);
    }
    
    public final Object h(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new h1((com.google.android.gms.internal.firebase-auth-api.e)e0.zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n", new Object[] { "zze", "zzf", "zzg", "zzh" });
        }
        if (n == 3) {
            return new e0();
        }
        if (n == 4) {
            return new k8(0);
        }
        if (n != 5) {
            return null;
        }
        return e0.zzb;
    }
    
    public final int r() {
        return this.zze;
    }
    
    public final c0 s() {
        c0 c0;
        if ((c0 = this.zzf) == null) {
            c0 = com.google.android.gms.internal.firebase_auth_api.c0.u();
        }
        return c0;
    }
    
    public final zzaau x() {
        return this.zzg;
    }
    
    public final zzaau y() {
        return this.zzh;
    }
}
