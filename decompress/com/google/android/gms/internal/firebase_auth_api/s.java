// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.internal.firebase_auth_api;

import he.g1;
import he.u7;
import he.x0;

public final class s extends e implements x0
{
    private static final com.google.android.gms.internal.firebase-auth-api.s zzb;
    private int zze;
    
    static {
        e.d((Class)com.google.android.gms.internal.firebase-auth-api.s.class, (com.google.android.gms.internal.firebase-auth-api.e)(zzb = (com.google.android.gms.internal.firebase-auth-api.s)new s()));
    }
    
    public static u7 s() {
        return (u7)((e)s.zzb).k();
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.s t() {
        return s.zzb;
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.s u() {
        return s.zzb;
    }
    
    public static void v(final com.google.android.gms.internal.firebase-auth-api.s s) {
        ((s)s).zze = 16;
    }
    
    public final Object h(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new g1((com.google.android.gms.internal.firebase-auth-api.e)s.zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[] { "zze" });
        }
        if (n == 3) {
            return new s();
        }
        if (n == 4) {
            return new u7(0);
        }
        if (n != 5) {
            return null;
        }
        return s.zzb;
    }
    
    public final int r() {
        return this.zze;
    }
}
