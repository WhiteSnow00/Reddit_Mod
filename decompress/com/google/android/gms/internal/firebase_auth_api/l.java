// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.internal.firebase_auth_api;

import he.g1;
import he.r;
import com.google.android.gms.internal.firebase-auth-api.zzaau;
import he.m7;
import com.google.android.gms.internal.firebase-auth-api.i0;
import com.google.android.gms.internal.firebase-auth-api.n;
import he.x0;

public final class l extends e implements x0
{
    private static final com.google.android.gms.internal.firebase-auth-api.l zzb;
    private int zze;
    private n zzf;
    private i0 zzg;
    
    static {
        e.d((Class)com.google.android.gms.internal.firebase-auth-api.l.class, (com.google.android.gms.internal.firebase-auth-api.e)(zzb = (com.google.android.gms.internal.firebase-auth-api.l)new l()));
    }
    
    public static m7 s() {
        return (m7)((e)l.zzb).k();
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.l t() {
        return l.zzb;
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.l u(final zzaau zzaau, final r r) throws zzacf {
        return (com.google.android.gms.internal.firebase-auth-api.l)e.p((com.google.android.gms.internal.firebase-auth-api.e)l.zzb, zzaau, r);
    }
    
    public static void x(final com.google.android.gms.internal.firebase-auth-api.l l, final int zze) {
        ((l)l).zze = zze;
    }
    
    public static void y(final com.google.android.gms.internal.firebase-auth-api.l l, final n zzf) {
        ((l)l).zzf = zzf;
    }
    
    public static void z(final com.google.android.gms.internal.firebase-auth-api.l l, final i0 zzg) {
        zzg.getClass();
        ((l)l).zzg = zzg;
    }
    
    public final Object h(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new g1((com.google.android.gms.internal.firebase-auth-api.e)l.zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[] { "zze", "zzf", "zzg" });
        }
        if (n == 3) {
            return new l();
        }
        if (n == 4) {
            return new m7(0);
        }
        if (n != 5) {
            return null;
        }
        return l.zzb;
    }
    
    public final int r() {
        return this.zze;
    }
    
    public final n v() {
        n n;
        if ((n = this.zzf) == null) {
            n = com.google.android.gms.internal.firebase_auth_api.n.u();
        }
        return n;
    }
    
    public final i0 w() {
        i0 i0;
        if ((i0 = this.zzg) == null) {
            i0 = com.google.android.gms.internal.firebase_auth_api.i0.u();
        }
        return i0;
    }
}
