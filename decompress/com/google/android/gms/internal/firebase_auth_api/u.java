// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.internal.firebase_auth_api;

import ge.h1;
import com.google.android.gms.internal.firebase-auth-api.zzacf;
import ge.r;
import ge.y7;
import com.google.android.gms.internal.firebase-auth-api.zzaau;
import ge.y0;

public final class u extends e implements y0
{
    private static final com.google.android.gms.internal.firebase-auth-api.u zzb;
    private int zze;
    private zzaau zzf;
    
    static {
        e.d((Class)com.google.android.gms.internal.firebase-auth-api.u.class, (com.google.android.gms.internal.firebase-auth-api.e)(zzb = (com.google.android.gms.internal.firebase-auth-api.u)new u()));
    }
    
    public u() {
        this.zzf = com.google.android.gms.internal.firebase_auth_api.zzaau.zzb;
    }
    
    public static y7 s() {
        return (y7)((e)u.zzb).i();
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.u u(final zzaau zzaau, final r r) throws zzacf {
        return (com.google.android.gms.internal.firebase-auth-api.u)e.p((com.google.android.gms.internal.firebase-auth-api.e)u.zzb, zzaau, r);
    }
    
    public final Object g(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new h1((com.google.android.gms.internal.firebase-auth-api.e)u.zzb, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[] { "zze", "zzf" });
        }
        if (n == 3) {
            return new u();
        }
        if (n == 4) {
            return new y7(0);
        }
        if (n != 5) {
            return null;
        }
        return u.zzb;
    }
    
    public final int r() {
        return this.zze;
    }
    
    public final zzaau v() {
        return this.zzf;
    }
}
