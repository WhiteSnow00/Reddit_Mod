// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.internal.firebase_auth_api;

import ge.h1;
import com.google.android.gms.internal.firebase-auth-api.zzacf;
import ge.r;
import com.google.android.gms.internal.firebase-auth-api.zzaau;
import ge.q8;
import com.google.android.gms.internal.firebase-auth-api.l0;
import ge.y0;

public final class k0 extends e implements y0
{
    private static final com.google.android.gms.internal.firebase-auth-api.k0 zzb;
    private l0 zze;
    
    static {
        e.d((Class)com.google.android.gms.internal.firebase-auth-api.k0.class, (com.google.android.gms.internal.firebase-auth-api.e)(zzb = (com.google.android.gms.internal.firebase-auth-api.k0)new k0()));
    }
    
    public static q8 r() {
        return (q8)((e)k0.zzb).i();
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.k0 t(final zzaau zzaau, final r r) throws zzacf {
        return (com.google.android.gms.internal.firebase-auth-api.k0)e.p((com.google.android.gms.internal.firebase-auth-api.e)k0.zzb, zzaau, r);
    }
    
    public final Object g(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new h1((com.google.android.gms.internal.firebase-auth-api.e)k0.zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[] { "zze" });
        }
        if (n == 3) {
            return new k0();
        }
        if (n == 4) {
            return new q8(0);
        }
        if (n != 5) {
            return null;
        }
        return k0.zzb;
    }
    
    public final l0 u() {
        l0 l0;
        if ((l0 = this.zze) == null) {
            l0 = com.google.android.gms.internal.firebase_auth_api.l0.t();
        }
        return l0;
    }
}
