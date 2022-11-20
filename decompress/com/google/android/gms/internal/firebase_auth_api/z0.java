// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.internal.firebase_auth_api;

import he.d9;
import he.g1;
import he.r;
import com.google.android.gms.internal.firebase-auth-api.zzaau;
import com.google.android.gms.internal.firebase-auth-api.q0;
import he.x0;

public final class z0 extends e implements x0
{
    private static final com.google.android.gms.internal.firebase-auth-api.z0 zzb;
    private String zze;
    private q0 zzf;
    
    static {
        e.d((Class)com.google.android.gms.internal.firebase-auth-api.z0.class, (com.google.android.gms.internal.firebase-auth-api.e)(zzb = (com.google.android.gms.internal.firebase-auth-api.z0)new z0()));
    }
    
    public z0() {
        this.zze = "";
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.z0 s() {
        return z0.zzb;
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.z0 t() {
        return z0.zzb;
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.z0 u(final zzaau zzaau, final r r) throws zzacf {
        return (com.google.android.gms.internal.firebase-auth-api.z0)e.p((com.google.android.gms.internal.firebase-auth-api.e)z0.zzb, zzaau, r);
    }
    
    public final Object h(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new g1((com.google.android.gms.internal.firebase-auth-api.e)z0.zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\t", new Object[] { "zze", "zzf" });
        }
        if (n == 3) {
            return new z0();
        }
        if (n == 4) {
            return new d9();
        }
        if (n != 5) {
            return null;
        }
        return z0.zzb;
    }
    
    public final q0 r() {
        q0 q0;
        if ((q0 = this.zzf) == null) {
            q0 = com.google.android.gms.internal.firebase_auth_api.q0.t();
        }
        return q0;
    }
    
    public final String v() {
        return this.zze;
    }
    
    public final boolean w() {
        return this.zzf != null;
    }
}
