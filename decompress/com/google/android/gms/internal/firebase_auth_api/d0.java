// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.internal.firebase_auth_api;

import ie.h1;
import com.google.android.gms.internal.firebase-auth-api.zzacf;
import ie.r;
import ie.j8;
import com.google.android.gms.internal.firebase-auth-api.zzaau;
import com.google.android.gms.internal.firebase-auth-api.e0;
import ie.y0;

public final class d0 extends e implements y0
{
    private static final com.google.android.gms.internal.firebase-auth-api.d0 zzb;
    private int zze;
    private e0 zzf;
    private zzaau zzg;
    
    static {
        e.d((Class)com.google.android.gms.internal.firebase-auth-api.d0.class, (com.google.android.gms.internal.firebase-auth-api.e)(zzb = (com.google.android.gms.internal.firebase-auth-api.d0)new d0()));
    }
    
    public d0() {
        this.zzg = com.google.android.gms.internal.firebase_auth_api.zzaau.zzb;
    }
    
    public static j8 s() {
        return (j8)((e)d0.zzb).k();
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.d0 u(final zzaau zzaau, final r r) throws zzacf {
        return (com.google.android.gms.internal.firebase-auth-api.d0)e.p((com.google.android.gms.internal.firebase-auth-api.e)d0.zzb, zzaau, r);
    }
    
    public final Object h(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new h1((com.google.android.gms.internal.firebase-auth-api.e)d0.zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[] { "zze", "zzf", "zzg" });
        }
        if (n == 3) {
            return new d0();
        }
        if (n == 4) {
            return new j8(0);
        }
        if (n != 5) {
            return null;
        }
        return d0.zzb;
    }
    
    public final int r() {
        return this.zze;
    }
    
    public final e0 v() {
        e0 e0;
        if ((e0 = this.zzf) == null) {
            e0 = com.google.android.gms.internal.firebase_auth_api.e0.v();
        }
        return e0;
    }
    
    public final zzaau w() {
        return this.zzg;
    }
}
