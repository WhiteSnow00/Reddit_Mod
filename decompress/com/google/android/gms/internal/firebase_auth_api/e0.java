// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.internal.firebase_auth_api;

import he.g1;
import he.r;
import he.h8;
import com.google.android.gms.internal.firebase-auth-api.zzaau;
import com.google.android.gms.internal.firebase-auth-api.f0;
import he.x0;

public final class e0 extends e implements x0
{
    private static final com.google.android.gms.internal.firebase-auth-api.e0 zzb;
    private int zze;
    private f0 zzf;
    private zzaau zzg;
    
    static {
        e.d((Class)com.google.android.gms.internal.firebase-auth-api.e0.class, (com.google.android.gms.internal.firebase-auth-api.e)(zzb = (com.google.android.gms.internal.firebase-auth-api.e0)new e0()));
    }
    
    public e0() {
        this.zzg = com.google.android.gms.internal.firebase_auth_api.zzaau.zzb;
    }
    
    public static h8 s() {
        return (h8)((e)e0.zzb).k();
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.e0 t() {
        return e0.zzb;
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.e0 u(final zzaau zzaau, final r r) throws zzacf {
        return (com.google.android.gms.internal.firebase-auth-api.e0)e.p((com.google.android.gms.internal.firebase-auth-api.e)e0.zzb, zzaau, r);
    }
    
    public static void x(final com.google.android.gms.internal.firebase-auth-api.e0 e0) {
        ((e0)e0).zze = 0;
    }
    
    public static void y(final com.google.android.gms.internal.firebase-auth-api.e0 e0, final f0 zzf) {
        ((e0)e0).zzf = zzf;
    }
    
    public static void z(final com.google.android.gms.internal.firebase-auth-api.e0 e0, final zzaau zzg) {
        ((e0)e0).zzg = zzg;
    }
    
    public final Object h(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new g1((com.google.android.gms.internal.firebase-auth-api.e)e0.zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[] { "zze", "zzf", "zzg" });
        }
        if (n == 3) {
            return new e0();
        }
        if (n == 4) {
            return new h8(0);
        }
        if (n != 5) {
            return null;
        }
        return e0.zzb;
    }
    
    public final int r() {
        return this.zze;
    }
    
    public final f0 v() {
        f0 f0;
        if ((f0 = this.zzf) == null) {
            f0 = com.google.android.gms.internal.firebase_auth_api.f0.v();
        }
        return f0;
    }
    
    public final zzaau w() {
        return this.zzg;
    }
}
