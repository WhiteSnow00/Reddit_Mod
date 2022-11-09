// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.internal.firebase_auth_api;

import ie.f9;
import ie.h1;
import com.google.android.gms.internal.firebase-auth-api.zzacf;
import ie.r;
import com.google.android.gms.internal.firebase-auth-api.zzaau;
import com.google.android.gms.internal.firebase-auth-api.p0;

public final class y0 extends e implements ie.y0
{
    private static final com.google.android.gms.internal.firebase-auth-api.y0 zzb;
    private String zze;
    private p0 zzf;
    
    static {
        e.d((Class)com.google.android.gms.internal.firebase-auth-api.y0.class, (com.google.android.gms.internal.firebase-auth-api.e)(zzb = (com.google.android.gms.internal.firebase-auth-api.y0)new y0()));
    }
    
    public y0() {
        this.zze = "";
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.y0 t() {
        return y0.zzb;
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.y0 u(final zzaau zzaau, final r r) throws zzacf {
        return (com.google.android.gms.internal.firebase-auth-api.y0)e.p((com.google.android.gms.internal.firebase-auth-api.e)y0.zzb, zzaau, r);
    }
    
    public final Object h(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new h1((com.google.android.gms.internal.firebase-auth-api.e)y0.zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\t", new Object[] { "zze", "zzf" });
        }
        if (n == 3) {
            return new y0();
        }
        if (n == 4) {
            return new f9();
        }
        if (n != 5) {
            return null;
        }
        return y0.zzb;
    }
    
    public final p0 r() {
        p0 p0;
        if ((p0 = this.zzf) == null) {
            p0 = com.google.android.gms.internal.firebase_auth_api.p0.t();
        }
        return p0;
    }
    
    public final String v() {
        return this.zze;
    }
    
    public final boolean w() {
        return this.zzf != null;
    }
}
