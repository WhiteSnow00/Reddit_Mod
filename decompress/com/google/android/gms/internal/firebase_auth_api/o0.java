// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.internal.firebase_auth_api;

import he.g1;
import he.r;
import he.t8;
import com.google.android.gms.internal.firebase-auth-api.zzaau;
import com.google.android.gms.internal.firebase-auth-api.m0;
import he.x0;

public final class o0 extends e implements x0
{
    private static final com.google.android.gms.internal.firebase-auth-api.o0 zzb;
    private int zze;
    private m0 zzf;
    private zzaau zzg;
    
    static {
        e.d((Class)com.google.android.gms.internal.firebase-auth-api.o0.class, (com.google.android.gms.internal.firebase-auth-api.e)(zzb = (com.google.android.gms.internal.firebase-auth-api.o0)new o0()));
    }
    
    public o0() {
        this.zzg = com.google.android.gms.internal.firebase_auth_api.zzaau.zzb;
    }
    
    public static void A(final com.google.android.gms.internal.firebase-auth-api.o0 o0, final zzaau zzg) {
        ((o0)o0).zzg = zzg;
    }
    
    public static t8 t() {
        return (t8)((e)o0.zzb).k();
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.o0 u() {
        return o0.zzb;
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.o0 v() {
        return o0.zzb;
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.o0 w(final zzaau zzaau, final r r) throws zzacf {
        return (com.google.android.gms.internal.firebase-auth-api.o0)e.p((com.google.android.gms.internal.firebase-auth-api.e)o0.zzb, zzaau, r);
    }
    
    public static void y(final com.google.android.gms.internal.firebase-auth-api.o0 o0) {
        ((o0)o0).zze = 0;
    }
    
    public static void z(final com.google.android.gms.internal.firebase-auth-api.o0 o0, final m0 zzf) {
        zzf.getClass();
        ((o0)o0).zzf = zzf;
    }
    
    public final boolean B() {
        return this.zzf != null;
    }
    
    public final Object h(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new g1((com.google.android.gms.internal.firebase-auth-api.e)o0.zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[] { "zze", "zzf", "zzg" });
        }
        if (n == 3) {
            return new o0();
        }
        if (n == 4) {
            return new t8(0);
        }
        if (n != 5) {
            return null;
        }
        return o0.zzb;
    }
    
    public final int r() {
        return this.zze;
    }
    
    public final m0 s() {
        m0 m0;
        if ((m0 = this.zzf) == null) {
            m0 = com.google.android.gms.internal.firebase_auth_api.m0.t();
        }
        return m0;
    }
    
    public final zzaau x() {
        return this.zzg;
    }
}
