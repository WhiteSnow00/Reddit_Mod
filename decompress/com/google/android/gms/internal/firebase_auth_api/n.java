// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.internal.firebase_auth_api;

import he.g1;
import he.r;
import he.o7;
import com.google.android.gms.internal.firebase-auth-api.zzaau;
import com.google.android.gms.internal.firebase-auth-api.p;
import he.x0;

public final class n extends e implements x0
{
    private static final com.google.android.gms.internal.firebase-auth-api.n zzb;
    private int zze;
    private p zzf;
    private zzaau zzg;
    
    static {
        e.d((Class)com.google.android.gms.internal.firebase-auth-api.n.class, (com.google.android.gms.internal.firebase-auth-api.e)(zzb = (com.google.android.gms.internal.firebase-auth-api.n)new n()));
    }
    
    public n() {
        this.zzg = com.google.android.gms.internal.firebase_auth_api.zzaau.zzb;
    }
    
    public static void A(final com.google.android.gms.internal.firebase-auth-api.n n, final zzaau zzg) {
        ((n)n).zzg = zzg;
    }
    
    public static o7 s() {
        return (o7)((e)n.zzb).k();
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.n t() {
        return n.zzb;
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.n u() {
        return n.zzb;
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.n v(final zzaau zzaau, final r r) throws zzacf {
        return (com.google.android.gms.internal.firebase-auth-api.n)e.p((com.google.android.gms.internal.firebase-auth-api.e)n.zzb, zzaau, r);
    }
    
    public static void y(final com.google.android.gms.internal.firebase-auth-api.n n) {
        ((n)n).zze = 0;
    }
    
    public static void z(final com.google.android.gms.internal.firebase-auth-api.n n, final p zzf) {
        zzf.getClass();
        ((n)n).zzf = zzf;
    }
    
    public final Object h(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new g1((com.google.android.gms.internal.firebase-auth-api.e)n.zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[] { "zze", "zzf", "zzg" });
        }
        if (n == 3) {
            return new n();
        }
        if (n == 4) {
            return new o7(0);
        }
        if (n != 5) {
            return null;
        }
        return n.zzb;
    }
    
    public final int r() {
        return this.zze;
    }
    
    public final p w() {
        p p;
        if ((p = this.zzf) == null) {
            p = com.google.android.gms.internal.firebase_auth_api.p.u();
        }
        return p;
    }
    
    public final zzaau x() {
        return this.zzg;
    }
}
