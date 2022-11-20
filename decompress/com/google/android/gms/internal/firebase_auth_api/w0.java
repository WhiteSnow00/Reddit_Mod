// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.internal.firebase_auth_api;

import he.g1;
import he.r;
import com.google.android.gms.internal.firebase-auth-api.zzaau;
import he.b9;
import he.x0;

public final class w0 extends e implements x0
{
    private static final com.google.android.gms.internal.firebase-auth-api.w0 zzb;
    private int zze;
    private com.google.android.gms.internal.firebase-auth-api.x0 zzf;
    
    static {
        e.d((Class)com.google.android.gms.internal.firebase-auth-api.w0.class, (com.google.android.gms.internal.firebase-auth-api.e)(zzb = (com.google.android.gms.internal.firebase-auth-api.w0)new w0()));
    }
    
    public static b9 s() {
        return (b9)((e)w0.zzb).k();
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.w0 t() {
        return w0.zzb;
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.w0 u(final zzaau zzaau, final r r) throws zzacf {
        return (com.google.android.gms.internal.firebase-auth-api.w0)e.p((com.google.android.gms.internal.firebase-auth-api.e)w0.zzb, zzaau, r);
    }
    
    public static void w(final com.google.android.gms.internal.firebase-auth-api.w0 w0) {
        ((w0)w0).zze = 0;
    }
    
    public static void x(final com.google.android.gms.internal.firebase-auth-api.w0 w0, final com.google.android.gms.internal.firebase-auth-api.x0 zzf) {
        zzf.getClass();
        ((w0)w0).zzf = zzf;
    }
    
    public final Object h(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new g1((com.google.android.gms.internal.firebase-auth-api.e)w0.zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[] { "zze", "zzf" });
        }
        if (n == 3) {
            return new w0();
        }
        if (n == 4) {
            return new b9(0);
        }
        if (n != 5) {
            return null;
        }
        return w0.zzb;
    }
    
    public final int r() {
        return this.zze;
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.x0 v() {
        com.google.android.gms.internal.firebase-auth-api.x0 x0;
        if ((x0 = this.zzf) == null) {
            x0 = com.google.android.gms.internal.firebase_auth_api.x0.s();
        }
        return x0;
    }
}
