// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.internal.firebase_auth_api;

import he.g1;
import he.l7;
import he.x0;

public final class k extends e implements x0
{
    private static final com.google.android.gms.internal.firebase-auth-api.k zzb;
    private int zze;
    
    static {
        e.d((Class)com.google.android.gms.internal.firebase-auth-api.k.class, (com.google.android.gms.internal.firebase-auth-api.e)(zzb = (com.google.android.gms.internal.firebase-auth-api.k)new k()));
    }
    
    public static l7 s() {
        return (l7)((e)k.zzb).k();
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.k t() {
        return k.zzb;
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.k u() {
        return k.zzb;
    }
    
    public static void v(final com.google.android.gms.internal.firebase-auth-api.k k) {
        ((k)k).zze = 16;
    }
    
    public final Object h(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new g1((com.google.android.gms.internal.firebase-auth-api.e)k.zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[] { "zze" });
        }
        if (n == 3) {
            return new k();
        }
        if (n == 4) {
            return new l7(0);
        }
        if (n != 5) {
            return null;
        }
        return k.zzb;
    }
    
    public final int r() {
        return this.zze;
    }
}
