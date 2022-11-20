// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.internal.firebase_auth_api;

import he.g1;
import he.r7;
import he.x0;

public final class p extends e implements x0
{
    private static final com.google.android.gms.internal.firebase-auth-api.p zzb;
    private int zze;
    
    static {
        e.d((Class)com.google.android.gms.internal.firebase-auth-api.p.class, (com.google.android.gms.internal.firebase-auth-api.e)(zzb = (com.google.android.gms.internal.firebase-auth-api.p)new p()));
    }
    
    public static r7 s() {
        return (r7)((e)p.zzb).k();
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.p t() {
        return p.zzb;
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.p u() {
        return p.zzb;
    }
    
    public static void v(final com.google.android.gms.internal.firebase-auth-api.p p) {
        ((p)p).zze = 16;
    }
    
    public final Object h(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new g1((com.google.android.gms.internal.firebase-auth-api.e)p.zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[] { "zze" });
        }
        if (n == 3) {
            return new p();
        }
        if (n == 4) {
            return new r7(0);
        }
        if (n != 5) {
            return null;
        }
        return p.zzb;
    }
    
    public final int r() {
        return this.zze;
    }
}
