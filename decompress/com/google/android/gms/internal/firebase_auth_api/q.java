// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.internal.firebase_auth_api;

import he.g1;
import he.r;
import he.s7;
import com.google.android.gms.internal.firebase-auth-api.zzaau;
import com.google.android.gms.internal.firebase-auth-api.s;
import he.x0;

public final class q extends e implements x0
{
    private static final com.google.android.gms.internal.firebase-auth-api.q zzb;
    private int zze;
    private s zzf;
    private zzaau zzg;
    
    static {
        e.d((Class)com.google.android.gms.internal.firebase-auth-api.q.class, (com.google.android.gms.internal.firebase-auth-api.e)(zzb = (com.google.android.gms.internal.firebase-auth-api.q)new q()));
    }
    
    public q() {
        this.zzg = com.google.android.gms.internal.firebase_auth_api.zzaau.zzb;
    }
    
    public static s7 s() {
        return (s7)((e)q.zzb).k();
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.q t() {
        return q.zzb;
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.q u(final zzaau zzaau, final r r) throws zzacf {
        return (com.google.android.gms.internal.firebase-auth-api.q)e.p((com.google.android.gms.internal.firebase-auth-api.e)q.zzb, zzaau, r);
    }
    
    public static void x(final com.google.android.gms.internal.firebase-auth-api.q q) {
        ((q)q).zze = 0;
    }
    
    public static void y(final com.google.android.gms.internal.firebase-auth-api.q q, final s zzf) {
        zzf.getClass();
        ((q)q).zzf = zzf;
    }
    
    public static void z(final com.google.android.gms.internal.firebase-auth-api.q q, final zzaau zzg) {
        ((q)q).zzg = zzg;
    }
    
    public final Object h(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new g1((com.google.android.gms.internal.firebase-auth-api.e)q.zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[] { "zze", "zzf", "zzg" });
        }
        if (n == 3) {
            return new q();
        }
        if (n == 4) {
            return new s7(0);
        }
        if (n != 5) {
            return null;
        }
        return q.zzb;
    }
    
    public final int r() {
        return this.zze;
    }
    
    public final s v() {
        s s;
        if ((s = this.zzf) == null) {
            s = com.google.android.gms.internal.firebase_auth_api.s.u();
        }
        return s;
    }
    
    public final zzaau w() {
        return this.zzg;
    }
}
