// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.internal.firebase_auth_api;

import he.g1;
import he.r;
import he.i8;
import com.google.android.gms.internal.firebase-auth-api.zzaau;
import com.google.android.gms.internal.firebase-auth-api.d0;
import he.x0;

public final class f0 extends e implements x0
{
    private static final com.google.android.gms.internal.firebase-auth-api.f0 zzb;
    private int zze;
    private d0 zzf;
    private zzaau zzg;
    private zzaau zzh;
    
    static {
        e.d((Class)com.google.android.gms.internal.firebase-auth-api.f0.class, (com.google.android.gms.internal.firebase-auth-api.e)(zzb = (com.google.android.gms.internal.firebase-auth-api.f0)new f0()));
    }
    
    public f0() {
        final zzaau zzb = com.google.android.gms.internal.firebase_auth_api.zzaau.zzb;
        this.zzg = zzb;
        this.zzh = zzb;
    }
    
    public static void A(final com.google.android.gms.internal.firebase-auth-api.f0 f0, final d0 zzf) {
        zzf.getClass();
        ((f0)f0).zzf = zzf;
    }
    
    public static void B(final com.google.android.gms.internal.firebase-auth-api.f0 f0, final zzaau zzg) {
        ((f0)f0).zzg = zzg;
    }
    
    public static void C(final com.google.android.gms.internal.firebase-auth-api.f0 f0, final zzaau zzh) {
        ((f0)f0).zzh = zzh;
    }
    
    public static i8 t() {
        return (i8)((e)f0.zzb).k();
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.f0 u() {
        return f0.zzb;
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.f0 v() {
        return f0.zzb;
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.f0 w(final zzaau zzaau, final r r) throws zzacf {
        return (com.google.android.gms.internal.firebase-auth-api.f0)e.p((com.google.android.gms.internal.firebase-auth-api.e)f0.zzb, zzaau, r);
    }
    
    public static void z(final com.google.android.gms.internal.firebase-auth-api.f0 f0) {
        ((f0)f0).zze = 0;
    }
    
    public final Object h(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new g1((com.google.android.gms.internal.firebase-auth-api.e)f0.zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n", new Object[] { "zze", "zzf", "zzg", "zzh" });
        }
        if (n == 3) {
            return new f0();
        }
        if (n == 4) {
            return new i8(0);
        }
        if (n != 5) {
            return null;
        }
        return f0.zzb;
    }
    
    public final int r() {
        return this.zze;
    }
    
    public final d0 s() {
        d0 d0;
        if ((d0 = this.zzf) == null) {
            d0 = com.google.android.gms.internal.firebase_auth_api.d0.u();
        }
        return d0;
    }
    
    public final zzaau x() {
        return this.zzg;
    }
    
    public final zzaau y() {
        return this.zzh;
    }
}
