// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.internal.firebase_auth_api;

import he.g1;
import he.r;
import com.google.android.gms.internal.firebase-auth-api.zzaau;
import he.b8;
import he.x0;

public final class y extends e implements x0
{
    private static final com.google.android.gms.internal.firebase-auth-api.y zzb;
    private int zze;
    private int zzf;
    
    static {
        e.d((Class)com.google.android.gms.internal.firebase-auth-api.y.class, (com.google.android.gms.internal.firebase-auth-api.e)(zzb = (com.google.android.gms.internal.firebase-auth-api.y)new y()));
    }
    
    public static b8 s() {
        return (b8)((e)y.zzb).k();
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.y t() {
        return y.zzb;
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.y u(final zzaau zzaau, final r r) throws zzacf {
        return (com.google.android.gms.internal.firebase-auth-api.y)e.p((com.google.android.gms.internal.firebase-auth-api.e)y.zzb, zzaau, r);
    }
    
    public static void v(final com.google.android.gms.internal.firebase-auth-api.y y) {
        ((y)y).zze = 64;
    }
    
    public final Object h(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new g1((com.google.android.gms.internal.firebase-auth-api.e)y.zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[] { "zze", "zzf" });
        }
        if (n == 3) {
            return new y();
        }
        if (n == 4) {
            return new b8(0);
        }
        if (n != 5) {
            return null;
        }
        return y.zzb;
    }
    
    public final int r() {
        return this.zze;
    }
}
