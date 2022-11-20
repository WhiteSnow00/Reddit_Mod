// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.internal.firebase_auth_api;

import he.g1;
import he.r;
import com.google.android.gms.internal.firebase-auth-api.zzaau;
import he.y7;
import he.x0;

public final class w extends e implements x0
{
    private static final com.google.android.gms.internal.firebase-auth-api.w zzb;
    private int zze;
    private int zzf;
    
    static {
        e.d((Class)com.google.android.gms.internal.firebase-auth-api.w.class, (com.google.android.gms.internal.firebase-auth-api.e)(zzb = (com.google.android.gms.internal.firebase-auth-api.w)new w()));
    }
    
    public static y7 s() {
        return (y7)((e)w.zzb).k();
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.w t() {
        return w.zzb;
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.w u(final zzaau zzaau, final r r) throws zzacf {
        return (com.google.android.gms.internal.firebase-auth-api.w)e.p((com.google.android.gms.internal.firebase-auth-api.e)w.zzb, zzaau, r);
    }
    
    public static void v(final com.google.android.gms.internal.firebase-auth-api.w w, final int zze) {
        ((w)w).zze = zze;
    }
    
    public final Object h(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new g1((com.google.android.gms.internal.firebase-auth-api.e)w.zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[] { "zzf", "zze" });
        }
        if (n == 3) {
            return new w();
        }
        if (n == 4) {
            return new y7(0);
        }
        if (n != 5) {
            return null;
        }
        return w.zzb;
    }
    
    public final int r() {
        return this.zze;
    }
}
