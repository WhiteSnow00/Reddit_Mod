// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.internal.firebase_auth_api;

import he.g1;
import he.e8;
import com.google.android.gms.internal.firebase-auth-api.q0;
import he.x0;

public final class b0 extends e implements x0
{
    private static final com.google.android.gms.internal.firebase-auth-api.b0 zzb;
    private q0 zze;
    
    static {
        e.d((Class)com.google.android.gms.internal.firebase-auth-api.b0.class, (com.google.android.gms.internal.firebase-auth-api.e)(zzb = (com.google.android.gms.internal.firebase-auth-api.b0)new b0()));
    }
    
    public static e8 r() {
        return (e8)((e)b0.zzb).k();
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.b0 s() {
        return b0.zzb;
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.b0 t() {
        return b0.zzb;
    }
    
    public static void v(final com.google.android.gms.internal.firebase-auth-api.b0 b0, final q0 zze) {
        zze.getClass();
        ((b0)b0).zze = zze;
    }
    
    public final Object h(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new g1((com.google.android.gms.internal.firebase-auth-api.e)b0.zzb, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[] { "zze" });
        }
        if (n == 3) {
            return new b0();
        }
        if (n == 4) {
            return new e8(0);
        }
        if (n != 5) {
            return null;
        }
        return b0.zzb;
    }
    
    public final q0 u() {
        q0 q0;
        if ((q0 = this.zze) == null) {
            q0 = com.google.android.gms.internal.firebase_auth_api.q0.t();
        }
        return q0;
    }
}
