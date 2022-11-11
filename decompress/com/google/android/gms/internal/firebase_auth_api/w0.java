// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.internal.firebase_auth_api;

import ge.c9;
import ge.h1;
import com.google.android.gms.internal.firebase-auth-api.zzacf;
import ge.r;
import com.google.android.gms.internal.firebase-auth-api.zzaau;
import ge.y0;

public final class w0 extends e implements y0
{
    private static final com.google.android.gms.internal.firebase-auth-api.w0 zzb;
    private String zze;
    
    static {
        e.d((Class)com.google.android.gms.internal.firebase-auth-api.w0.class, (com.google.android.gms.internal.firebase-auth-api.e)(zzb = (com.google.android.gms.internal.firebase-auth-api.w0)new w0()));
    }
    
    public w0() {
        this.zze = "";
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.w0 s() {
        return w0.zzb;
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.w0 t(final zzaau zzaau, final r r) throws zzacf {
        return (com.google.android.gms.internal.firebase-auth-api.w0)e.p((com.google.android.gms.internal.firebase-auth-api.e)w0.zzb, zzaau, r);
    }
    
    public final Object g(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new h1((com.google.android.gms.internal.firebase-auth-api.e)w0.zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0208", new Object[] { "zze" });
        }
        if (n == 3) {
            return new w0();
        }
        if (n == 4) {
            return new c9();
        }
        if (n != 5) {
            return null;
        }
        return w0.zzb;
    }
    
    public final String u() {
        return this.zze;
    }
}
