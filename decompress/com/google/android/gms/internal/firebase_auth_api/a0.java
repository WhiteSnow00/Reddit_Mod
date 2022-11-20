// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.internal.firebase_auth_api;

import he.d8;
import he.g1;
import he.r;
import com.google.android.gms.internal.firebase-auth-api.zzaau;
import he.x0;

public final class a0 extends e implements x0
{
    private static final com.google.android.gms.internal.firebase-auth-api.a0 zzb;
    
    static {
        e.d((Class)com.google.android.gms.internal.firebase-auth-api.a0.class, (com.google.android.gms.internal.firebase-auth-api.e)(zzb = (com.google.android.gms.internal.firebase-auth-api.a0)new a0()));
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.a0 r() {
        return a0.zzb;
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.a0 s() {
        return a0.zzb;
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.a0 t(final zzaau zzaau, final r r) throws zzacf {
        return (com.google.android.gms.internal.firebase-auth-api.a0)e.p((com.google.android.gms.internal.firebase-auth-api.e)a0.zzb, zzaau, r);
    }
    
    public final Object h(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new g1((com.google.android.gms.internal.firebase-auth-api.e)a0.zzb, "\u0000\u0000", (Object[])null);
        }
        if (n == 3) {
            return new a0();
        }
        if (n == 4) {
            return new d8();
        }
        if (n != 5) {
            return null;
        }
        return a0.zzb;
    }
}
