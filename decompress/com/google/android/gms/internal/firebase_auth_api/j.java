// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.internal.firebase_auth_api;

import ie.h1;
import ie.o7;
import ie.y0;

public final class j extends e implements y0
{
    private static final com.google.android.gms.internal.firebase-auth-api.j zzb;
    private int zze;
    
    static {
        e.d((Class)com.google.android.gms.internal.firebase-auth-api.j.class, (com.google.android.gms.internal.firebase-auth-api.e)(zzb = (com.google.android.gms.internal.firebase-auth-api.j)new j()));
    }
    
    public static o7 s() {
        return (o7)((e)j.zzb).k();
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.j u() {
        return j.zzb;
    }
    
    public final Object h(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new h1((com.google.android.gms.internal.firebase-auth-api.e)j.zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[] { "zze" });
        }
        if (n == 3) {
            return new j();
        }
        if (n == 4) {
            return new o7(0);
        }
        if (n != 5) {
            return null;
        }
        return j.zzb;
    }
    
    public final int r() {
        return this.zze;
    }
}
