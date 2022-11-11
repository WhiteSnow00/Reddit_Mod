// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.internal.firebase_auth_api;

import ge.h1;
import ge.v7;
import ge.y0;

public final class r extends e implements y0
{
    private static final com.google.android.gms.internal.firebase-auth-api.r zzb;
    private int zze;
    
    static {
        e.d((Class)com.google.android.gms.internal.firebase-auth-api.r.class, (com.google.android.gms.internal.firebase-auth-api.e)(zzb = (com.google.android.gms.internal.firebase-auth-api.r)new r()));
    }
    
    public static v7 s() {
        return (v7)((e)r.zzb).i();
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.r u() {
        return r.zzb;
    }
    
    public final Object g(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new h1((com.google.android.gms.internal.firebase-auth-api.e)r.zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[] { "zze" });
        }
        if (n == 3) {
            return new r();
        }
        if (n == 4) {
            return new v7(0);
        }
        if (n != 5) {
            return null;
        }
        return r.zzb;
    }
    
    public final int r() {
        return this.zze;
    }
}
