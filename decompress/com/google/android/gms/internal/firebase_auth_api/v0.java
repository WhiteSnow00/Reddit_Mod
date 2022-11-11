// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.internal.firebase_auth_api;

import ge.h1;
import com.google.android.gms.internal.firebase-auth-api.zzacf;
import ge.r;
import com.google.android.gms.internal.firebase-auth-api.zzaau;
import ge.b9;
import com.google.android.gms.internal.firebase-auth-api.w0;
import ge.y0;

public final class v0 extends e implements y0
{
    private static final com.google.android.gms.internal.firebase-auth-api.v0 zzb;
    private int zze;
    private w0 zzf;
    
    static {
        e.d((Class)com.google.android.gms.internal.firebase-auth-api.v0.class, (com.google.android.gms.internal.firebase-auth-api.e)(zzb = (com.google.android.gms.internal.firebase-auth-api.v0)new v0()));
    }
    
    public static b9 s() {
        return (b9)((e)v0.zzb).i();
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.v0 u(final zzaau zzaau, final r r) throws zzacf {
        return (com.google.android.gms.internal.firebase-auth-api.v0)e.p((com.google.android.gms.internal.firebase-auth-api.e)v0.zzb, zzaau, r);
    }
    
    public final Object g(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new h1((com.google.android.gms.internal.firebase-auth-api.e)v0.zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[] { "zze", "zzf" });
        }
        if (n == 3) {
            return new v0();
        }
        if (n == 4) {
            return new b9(0);
        }
        if (n != 5) {
            return null;
        }
        return v0.zzb;
    }
    
    public final int r() {
        return this.zze;
    }
    
    public final w0 v() {
        w0 w0;
        if ((w0 = this.zzf) == null) {
            w0 = com.google.android.gms.internal.firebase_auth_api.w0.s();
        }
        return w0;
    }
}
