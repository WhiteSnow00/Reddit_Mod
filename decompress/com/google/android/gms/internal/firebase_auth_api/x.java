// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.internal.firebase_auth_api;

import ge.h1;
import com.google.android.gms.internal.firebase-auth-api.zzacf;
import ge.r;
import com.google.android.gms.internal.firebase-auth-api.zzaau;
import ge.c8;
import ge.y0;

public final class x extends e implements y0
{
    private static final com.google.android.gms.internal.firebase-auth-api.x zzb;
    private int zze;
    private int zzf;
    
    static {
        e.d((Class)com.google.android.gms.internal.firebase-auth-api.x.class, (com.google.android.gms.internal.firebase-auth-api.e)(zzb = (com.google.android.gms.internal.firebase-auth-api.x)new x()));
    }
    
    public static c8 s() {
        return (c8)((e)x.zzb).i();
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.x u(final zzaau zzaau, final r r) throws zzacf {
        return (com.google.android.gms.internal.firebase-auth-api.x)e.p((com.google.android.gms.internal.firebase-auth-api.e)x.zzb, zzaau, r);
    }
    
    public final Object g(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new h1((com.google.android.gms.internal.firebase-auth-api.e)x.zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[] { "zze", "zzf" });
        }
        if (n == 3) {
            return new x();
        }
        if (n == 4) {
            return new c8(0);
        }
        if (n != 5) {
            return null;
        }
        return x.zzb;
    }
    
    public final int r() {
        return this.zze;
    }
}