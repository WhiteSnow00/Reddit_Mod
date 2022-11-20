// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.internal.firebase_auth_api;

import he.g1;
import he.r;
import he.j7;
import com.google.android.gms.internal.firebase-auth-api.k;
import com.google.android.gms.internal.firebase-auth-api.zzaau;
import he.x0;

public final class i extends e implements x0
{
    private static final com.google.android.gms.internal.firebase-auth-api.i zzb;
    private int zze;
    private zzaau zzf;
    private k zzg;
    
    static {
        e.d((Class)com.google.android.gms.internal.firebase-auth-api.i.class, (com.google.android.gms.internal.firebase-auth-api.e)(zzb = (com.google.android.gms.internal.firebase-auth-api.i)new i()));
    }
    
    public i() {
        this.zzf = com.google.android.gms.internal.firebase_auth_api.zzaau.zzb;
    }
    
    public static j7 s() {
        return (j7)((e)i.zzb).k();
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.i t() {
        return i.zzb;
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.i u(final zzaau zzaau, final r r) throws zzacf {
        return (com.google.android.gms.internal.firebase-auth-api.i)e.p((com.google.android.gms.internal.firebase-auth-api.e)i.zzb, zzaau, r);
    }
    
    public static void x(final com.google.android.gms.internal.firebase-auth-api.i i) {
        ((i)i).zze = 0;
    }
    
    public static void y(final com.google.android.gms.internal.firebase-auth-api.i i, final zzaau zzf) {
        ((i)i).zzf = zzf;
    }
    
    public static void z(final com.google.android.gms.internal.firebase-auth-api.i i, final k zzg) {
        zzg.getClass();
        ((i)i).zzg = zzg;
    }
    
    public final Object h(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new g1((com.google.android.gms.internal.firebase-auth-api.e)i.zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[] { "zze", "zzf", "zzg" });
        }
        if (n == 3) {
            return new i();
        }
        if (n == 4) {
            return new j7(0);
        }
        if (n != 5) {
            return null;
        }
        return i.zzb;
    }
    
    public final int r() {
        return this.zze;
    }
    
    public final k v() {
        k k;
        if ((k = this.zzg) == null) {
            k = com.google.android.gms.internal.firebase_auth_api.k.u();
        }
        return k;
    }
    
    public final zzaau w() {
        return this.zzf;
    }
}
