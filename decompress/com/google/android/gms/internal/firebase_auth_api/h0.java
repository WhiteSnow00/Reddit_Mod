// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.internal.firebase_auth_api;

import he.g1;
import he.r;
import he.l8;
import com.google.android.gms.internal.firebase-auth-api.v0;
import com.google.android.gms.internal.firebase-auth-api.zzaau;
import he.x0;

public final class h0 extends e implements x0
{
    private static final com.google.android.gms.internal.firebase-auth-api.h0 zzb;
    private zzaau zze;
    private v0 zzf;
    
    static {
        e.d((Class)com.google.android.gms.internal.firebase-auth-api.h0.class, (com.google.android.gms.internal.firebase-auth-api.e)(zzb = (com.google.android.gms.internal.firebase-auth-api.h0)new h0()));
    }
    
    public h0() {
        this.zze = com.google.android.gms.internal.firebase_auth_api.zzaau.zzb;
    }
    
    public static l8 r() {
        return (l8)((e)h0.zzb).k();
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.h0 s() {
        return h0.zzb;
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.h0 t(final byte[] array, final r r) throws zzacf {
        return (com.google.android.gms.internal.firebase-auth-api.h0)e.q((com.google.android.gms.internal.firebase-auth-api.e)h0.zzb, array, r);
    }
    
    public static void v(final com.google.android.gms.internal.firebase-auth-api.h0 h0, final zzaau zze) {
        ((h0)h0).zze = zze;
    }
    
    public static void w(final com.google.android.gms.internal.firebase-auth-api.h0 h0, final v0 zzf) {
        ((h0)h0).zzf = zzf;
    }
    
    public final Object h(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new g1((com.google.android.gms.internal.firebase-auth-api.e)h0.zzb, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003\t", new Object[] { "zze", "zzf" });
        }
        if (n == 3) {
            return new h0();
        }
        if (n == 4) {
            return new l8(0);
        }
        if (n != 5) {
            return null;
        }
        return h0.zzb;
    }
    
    public final zzaau u() {
        return this.zze;
    }
}
