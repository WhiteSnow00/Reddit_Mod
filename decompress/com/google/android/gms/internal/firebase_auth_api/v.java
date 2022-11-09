// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.internal.firebase_auth_api;

import ie.h1;
import com.google.android.gms.internal.firebase-auth-api.zzacf;
import ie.r;
import com.google.android.gms.internal.firebase-auth-api.zzaau;
import ie.a8;
import ie.y0;

public final class v extends e implements y0
{
    private static final com.google.android.gms.internal.firebase-auth-api.v zzb;
    private int zze;
    private int zzf;
    
    static {
        e.d((Class)com.google.android.gms.internal.firebase-auth-api.v.class, (com.google.android.gms.internal.firebase-auth-api.e)(zzb = (com.google.android.gms.internal.firebase-auth-api.v)new v()));
    }
    
    public static a8 s() {
        return (a8)((e)v.zzb).k();
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.v u(final zzaau zzaau, final r r) throws zzacf {
        return (com.google.android.gms.internal.firebase-auth-api.v)e.p((com.google.android.gms.internal.firebase-auth-api.e)v.zzb, zzaau, r);
    }
    
    public final Object h(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new h1((com.google.android.gms.internal.firebase-auth-api.e)v.zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[] { "zzf", "zze" });
        }
        if (n == 3) {
            return new v();
        }
        if (n == 4) {
            return new a8(0);
        }
        if (n != 5) {
            return null;
        }
        return v.zzb;
    }
    
    public final int r() {
        return this.zze;
    }
}
