// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.internal.firebase_auth_api;

import ie.h1;
import com.google.android.gms.internal.firebase-auth-api.zzacf;
import ie.r;
import ie.n8;
import com.google.android.gms.internal.firebase-auth-api.u0;
import com.google.android.gms.internal.firebase-auth-api.zzaau;
import ie.y0;

public final class g0 extends e implements y0
{
    private static final com.google.android.gms.internal.firebase-auth-api.g0 zzb;
    private zzaau zze;
    private u0 zzf;
    
    static {
        e.d((Class)com.google.android.gms.internal.firebase-auth-api.g0.class, (com.google.android.gms.internal.firebase-auth-api.e)(zzb = (com.google.android.gms.internal.firebase-auth-api.g0)new g0()));
    }
    
    public g0() {
        this.zze = com.google.android.gms.internal.firebase_auth_api.zzaau.zzb;
    }
    
    public static n8 r() {
        return (n8)((e)g0.zzb).k();
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.g0 t(final byte[] array, final r r) throws zzacf {
        return (com.google.android.gms.internal.firebase-auth-api.g0)e.q((com.google.android.gms.internal.firebase-auth-api.e)g0.zzb, array, r);
    }
    
    public final Object h(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new h1((com.google.android.gms.internal.firebase-auth-api.e)g0.zzb, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003\t", new Object[] { "zze", "zzf" });
        }
        if (n == 3) {
            return new g0();
        }
        if (n == 4) {
            return new n8(0);
        }
        if (n != 5) {
            return null;
        }
        return g0.zzb;
    }
    
    public final zzaau u() {
        return this.zze;
    }
}
