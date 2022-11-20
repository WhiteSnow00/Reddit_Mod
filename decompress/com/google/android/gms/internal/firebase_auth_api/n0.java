// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.internal.firebase_auth_api;

import he.g1;
import he.r;
import he.s8;
import com.google.android.gms.internal.firebase-auth-api.zzaau;
import com.google.android.gms.internal.firebase-auth-api.o0;
import he.x0;

public final class n0 extends e implements x0
{
    private static final com.google.android.gms.internal.firebase-auth-api.n0 zzb;
    private int zze;
    private o0 zzf;
    private zzaau zzg;
    
    static {
        e.d((Class)com.google.android.gms.internal.firebase-auth-api.n0.class, (com.google.android.gms.internal.firebase-auth-api.e)(zzb = (com.google.android.gms.internal.firebase-auth-api.n0)new n0()));
    }
    
    public n0() {
        this.zzg = com.google.android.gms.internal.firebase_auth_api.zzaau.zzb;
    }
    
    public static s8 s() {
        return (s8)((e)n0.zzb).k();
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.n0 t() {
        return n0.zzb;
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.n0 u(final zzaau zzaau, final r r) throws zzacf {
        return (com.google.android.gms.internal.firebase-auth-api.n0)e.p((com.google.android.gms.internal.firebase-auth-api.e)n0.zzb, zzaau, r);
    }
    
    public static void x(final com.google.android.gms.internal.firebase-auth-api.n0 n0) {
        ((n0)n0).zze = 0;
    }
    
    public static void y(final com.google.android.gms.internal.firebase-auth-api.n0 n0, final o0 zzf) {
        ((n0)n0).zzf = zzf;
    }
    
    public static void z(final com.google.android.gms.internal.firebase-auth-api.n0 n0, final zzaau zzg) {
        ((n0)n0).zzg = zzg;
    }
    
    public final boolean A() {
        return this.zzf != null;
    }
    
    public final Object h(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new g1((com.google.android.gms.internal.firebase-auth-api.e)n0.zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[] { "zze", "zzf", "zzg" });
        }
        if (n == 3) {
            return new n0();
        }
        if (n == 4) {
            return new s8(0);
        }
        if (n != 5) {
            return null;
        }
        return n0.zzb;
    }
    
    public final int r() {
        return this.zze;
    }
    
    public final o0 v() {
        o0 o0;
        if ((o0 = this.zzf) == null) {
            o0 = com.google.android.gms.internal.firebase_auth_api.o0.v();
        }
        return o0;
    }
    
    public final zzaau w() {
        return this.zzg;
    }
}
