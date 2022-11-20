// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.internal.firebase_auth_api;

import he.g1;
import he.r;
import com.google.android.gms.internal.firebase-auth-api.zzaau;
import he.w7;
import he.x0;

public final class u extends e implements x0
{
    private static final com.google.android.gms.internal.firebase-auth-api.u zzb;
    private int zze;
    private int zzf;
    
    static {
        e.d((Class)com.google.android.gms.internal.firebase-auth-api.u.class, (com.google.android.gms.internal.firebase-auth-api.e)(zzb = (com.google.android.gms.internal.firebase-auth-api.u)new u()));
    }
    
    public static w7 s() {
        return (w7)((e)u.zzb).k();
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.u t() {
        return u.zzb;
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.u u(final zzaau zzaau, final r r) throws zzacf {
        return (com.google.android.gms.internal.firebase-auth-api.u)e.p((com.google.android.gms.internal.firebase-auth-api.e)u.zzb, zzaau, r);
    }
    
    public static void v(final com.google.android.gms.internal.firebase-auth-api.u u, final int zze) {
        ((u)u).zze = zze;
    }
    
    public final Object h(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new g1((com.google.android.gms.internal.firebase-auth-api.e)u.zzb, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[] { "zze", "zzf" });
        }
        if (n == 3) {
            return new u();
        }
        if (n == 4) {
            return new w7(0);
        }
        if (n != 5) {
            return null;
        }
        return u.zzb;
    }
    
    public final int r() {
        return this.zze;
    }
}
