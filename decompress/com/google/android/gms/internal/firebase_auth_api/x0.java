// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.internal.firebase_auth_api;

import ie.h1;
import com.google.android.gms.internal.firebase-auth-api.zzacf;
import ie.r;
import com.google.android.gms.internal.firebase-auth-api.zzaau;
import ie.e9;
import ie.y0;

public final class x0 extends e implements y0
{
    private static final com.google.android.gms.internal.firebase-auth-api.x0 zzb;
    private int zze;
    private com.google.android.gms.internal.firebase-auth-api.y0 zzf;
    
    static {
        e.d((Class)com.google.android.gms.internal.firebase-auth-api.x0.class, (com.google.android.gms.internal.firebase-auth-api.e)(zzb = (com.google.android.gms.internal.firebase-auth-api.x0)new x0()));
    }
    
    public static e9 s() {
        return (e9)((e)x0.zzb).k();
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.x0 u(final zzaau zzaau, final r r) throws zzacf {
        return (com.google.android.gms.internal.firebase-auth-api.x0)e.p((com.google.android.gms.internal.firebase-auth-api.e)x0.zzb, zzaau, r);
    }
    
    public final Object h(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new h1((com.google.android.gms.internal.firebase-auth-api.e)x0.zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[] { "zze", "zzf" });
        }
        if (n == 3) {
            return new x0();
        }
        if (n == 4) {
            return new e9(0);
        }
        if (n != 5) {
            return null;
        }
        return x0.zzb;
    }
    
    public final int r() {
        return this.zze;
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.y0 v() {
        com.google.android.gms.internal.firebase-auth-api.y0 y0;
        if ((y0 = this.zzf) == null) {
            y0 = com.google.android.gms.internal.firebase_auth_api.y0.t();
        }
        return y0;
    }
}
