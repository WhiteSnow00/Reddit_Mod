// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.internal.firebase_auth_api;

import he.g1;
import he.r;
import com.google.android.gms.internal.firebase-auth-api.zzaau;
import he.p8;
import com.google.android.gms.internal.firebase-auth-api.m0;
import he.x0;

public final class l0 extends e implements x0
{
    private static final com.google.android.gms.internal.firebase-auth-api.l0 zzb;
    private m0 zze;
    
    static {
        e.d((Class)com.google.android.gms.internal.firebase-auth-api.l0.class, (com.google.android.gms.internal.firebase-auth-api.e)(zzb = (com.google.android.gms.internal.firebase-auth-api.l0)new l0()));
    }
    
    public static p8 r() {
        return (p8)((e)l0.zzb).k();
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.l0 s() {
        return l0.zzb;
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.l0 t(final zzaau zzaau, final r r) throws zzacf {
        return (com.google.android.gms.internal.firebase-auth-api.l0)e.p((com.google.android.gms.internal.firebase-auth-api.e)l0.zzb, zzaau, r);
    }
    
    public static void v(final com.google.android.gms.internal.firebase-auth-api.l0 l0, final m0 zze) {
        ((l0)l0).zze = zze;
    }
    
    public final Object h(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new g1((com.google.android.gms.internal.firebase-auth-api.e)l0.zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[] { "zze" });
        }
        if (n == 3) {
            return new l0();
        }
        if (n == 4) {
            return new p8(0);
        }
        if (n != 5) {
            return null;
        }
        return l0.zzb;
    }
    
    public final m0 u() {
        m0 m0;
        if ((m0 = this.zze) == null) {
            m0 = com.google.android.gms.internal.firebase_auth_api.m0.t();
        }
        return m0;
    }
}
