// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.internal.firebase_auth_api;

import ie.h1;
import com.google.android.gms.internal.firebase-auth-api.zzacf;
import ie.r;
import com.google.android.gms.internal.firebase-auth-api.zzaau;
import ie.h8;
import com.google.android.gms.internal.firebase-auth-api.c0;
import ie.y0;

public final class b0 extends e implements y0
{
    private static final com.google.android.gms.internal.firebase-auth-api.b0 zzb;
    private c0 zze;
    
    static {
        e.d((Class)com.google.android.gms.internal.firebase-auth-api.b0.class, (com.google.android.gms.internal.firebase-auth-api.e)(zzb = (com.google.android.gms.internal.firebase-auth-api.b0)new b0()));
    }
    
    public static h8 r() {
        return (h8)((e)b0.zzb).k();
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.b0 t(final zzaau zzaau, final r r) throws zzacf {
        return (com.google.android.gms.internal.firebase-auth-api.b0)e.p((com.google.android.gms.internal.firebase-auth-api.e)b0.zzb, zzaau, r);
    }
    
    public final Object h(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new h1((com.google.android.gms.internal.firebase-auth-api.e)b0.zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[] { "zze" });
        }
        if (n == 3) {
            return new b0();
        }
        if (n == 4) {
            return new h8(0);
        }
        if (n != 5) {
            return null;
        }
        return b0.zzb;
    }
    
    public final c0 u() {
        c0 c0;
        if ((c0 = this.zze) == null) {
            c0 = com.google.android.gms.internal.firebase_auth_api.c0.u();
        }
        return c0;
    }
}
