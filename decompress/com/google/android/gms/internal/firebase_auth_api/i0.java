// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.internal.firebase_auth_api;

import he.g1;
import he.r;
import he.m8;
import com.google.android.gms.internal.firebase-auth-api.zzaau;
import com.google.android.gms.internal.firebase-auth-api.k0;
import he.x0;

public final class i0 extends e implements x0
{
    private static final com.google.android.gms.internal.firebase-auth-api.i0 zzb;
    private int zze;
    private k0 zzf;
    private zzaau zzg;
    
    static {
        e.d((Class)com.google.android.gms.internal.firebase-auth-api.i0.class, (com.google.android.gms.internal.firebase-auth-api.e)(zzb = (com.google.android.gms.internal.firebase-auth-api.i0)new i0()));
    }
    
    public i0() {
        this.zzg = com.google.android.gms.internal.firebase_auth_api.zzaau.zzb;
    }
    
    public static void A(final com.google.android.gms.internal.firebase-auth-api.i0 i0, final zzaau zzg) {
        ((i0)i0).zzg = zzg;
    }
    
    public static m8 s() {
        return (m8)((e)i0.zzb).k();
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.i0 t() {
        return i0.zzb;
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.i0 u() {
        return i0.zzb;
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.i0 v(final zzaau zzaau, final r r) throws zzacf {
        return (com.google.android.gms.internal.firebase-auth-api.i0)e.p((com.google.android.gms.internal.firebase-auth-api.e)i0.zzb, zzaau, r);
    }
    
    public static void y(final com.google.android.gms.internal.firebase-auth-api.i0 i0) {
        ((i0)i0).zze = 0;
    }
    
    public static void z(final com.google.android.gms.internal.firebase-auth-api.i0 i0, final k0 zzf) {
        zzf.getClass();
        ((i0)i0).zzf = zzf;
    }
    
    public final Object h(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new g1((com.google.android.gms.internal.firebase-auth-api.e)i0.zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[] { "zze", "zzf", "zzg" });
        }
        if (n == 3) {
            return new i0();
        }
        if (n == 4) {
            return new m8(0);
        }
        if (n != 5) {
            return null;
        }
        return i0.zzb;
    }
    
    public final int r() {
        return this.zze;
    }
    
    public final k0 w() {
        k0 k0;
        if ((k0 = this.zzf) == null) {
            k0 = com.google.android.gms.internal.firebase_auth_api.k0.u();
        }
        return k0;
    }
    
    public final zzaau x() {
        return this.zzg;
    }
}
