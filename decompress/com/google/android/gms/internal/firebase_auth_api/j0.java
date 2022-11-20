// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.internal.firebase_auth_api;

import he.g1;
import he.r;
import com.google.android.gms.internal.firebase-auth-api.zzaau;
import he.n8;
import com.google.android.gms.internal.firebase-auth-api.k0;
import he.x0;

public final class j0 extends e implements x0
{
    private static final com.google.android.gms.internal.firebase-auth-api.j0 zzb;
    private k0 zze;
    private int zzf;
    private int zzg;
    
    static {
        e.d((Class)com.google.android.gms.internal.firebase-auth-api.j0.class, (com.google.android.gms.internal.firebase-auth-api.e)(zzb = (com.google.android.gms.internal.firebase-auth-api.j0)new j0()));
    }
    
    public static n8 s() {
        return (n8)((e)j0.zzb).k();
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.j0 t() {
        return j0.zzb;
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.j0 u() {
        return j0.zzb;
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.j0 v(final zzaau zzaau, final r r) throws zzacf {
        return (com.google.android.gms.internal.firebase-auth-api.j0)e.p((com.google.android.gms.internal.firebase-auth-api.e)j0.zzb, zzaau, r);
    }
    
    public static void x(final com.google.android.gms.internal.firebase-auth-api.j0 j0, final k0 zze) {
        ((j0)j0).zze = zze;
    }
    
    public static void y(final com.google.android.gms.internal.firebase-auth-api.j0 j0, final int zzf) {
        ((j0)j0).zzf = zzf;
    }
    
    public final Object h(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new g1((com.google.android.gms.internal.firebase-auth-api.e)j0.zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\u000b", new Object[] { "zze", "zzf", "zzg" });
        }
        if (n == 3) {
            return new j0();
        }
        if (n == 4) {
            return new n8(0);
        }
        if (n != 5) {
            return null;
        }
        return j0.zzb;
    }
    
    public final int r() {
        return this.zzf;
    }
    
    public final k0 w() {
        k0 k0;
        if ((k0 = this.zze) == null) {
            k0 = com.google.android.gms.internal.firebase_auth_api.k0.u();
        }
        return k0;
    }
}
