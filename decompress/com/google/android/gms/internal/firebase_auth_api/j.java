// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.internal.firebase_auth_api;

import he.g1;
import he.r;
import com.google.android.gms.internal.firebase-auth-api.zzaau;
import he.k7;
import com.google.android.gms.internal.firebase-auth-api.k;
import he.x0;

public final class j extends e implements x0
{
    private static final com.google.android.gms.internal.firebase-auth-api.j zzb;
    private int zze;
    private k zzf;
    
    static {
        e.d((Class)com.google.android.gms.internal.firebase-auth-api.j.class, (com.google.android.gms.internal.firebase-auth-api.e)(zzb = (com.google.android.gms.internal.firebase-auth-api.j)new j()));
    }
    
    public static k7 s() {
        return (k7)((e)j.zzb).k();
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.j t() {
        return j.zzb;
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.j u(final zzaau zzaau, final r r) throws zzacf {
        return (com.google.android.gms.internal.firebase-auth-api.j)e.p((com.google.android.gms.internal.firebase-auth-api.e)j.zzb, zzaau, r);
    }
    
    public static void w(final com.google.android.gms.internal.firebase-auth-api.j j) {
        ((j)j).zze = 32;
    }
    
    public static void x(final com.google.android.gms.internal.firebase-auth-api.j j, final k zzf) {
        ((j)j).zzf = zzf;
    }
    
    public final Object h(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new g1((com.google.android.gms.internal.firebase-auth-api.e)j.zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[] { "zze", "zzf" });
        }
        if (n == 3) {
            return new j();
        }
        if (n == 4) {
            return new k7(0);
        }
        if (n != 5) {
            return null;
        }
        return j.zzb;
    }
    
    public final int r() {
        return this.zze;
    }
    
    public final k v() {
        k k;
        if ((k = this.zzf) == null) {
            k = com.google.android.gms.internal.firebase_auth_api.k.u();
        }
        return k;
    }
}
