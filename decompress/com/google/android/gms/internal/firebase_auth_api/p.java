// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.internal.firebase_auth_api;

import ge.h1;
import com.google.android.gms.internal.firebase-auth-api.zzacf;
import ge.t7;
import com.google.android.gms.internal.firebase-auth-api.zzaau;
import com.google.android.gms.internal.firebase-auth-api.r;
import ge.y0;

public final class p extends e implements y0
{
    private static final com.google.android.gms.internal.firebase-auth-api.p zzb;
    private int zze;
    private r zzf;
    private zzaau zzg;
    
    static {
        e.d((Class)com.google.android.gms.internal.firebase-auth-api.p.class, (com.google.android.gms.internal.firebase-auth-api.e)(zzb = (com.google.android.gms.internal.firebase-auth-api.p)new p()));
    }
    
    public p() {
        this.zzg = com.google.android.gms.internal.firebase_auth_api.zzaau.zzb;
    }
    
    public static t7 s() {
        return (t7)((e)p.zzb).i();
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.p u(final zzaau zzaau, final ge.r r) throws zzacf {
        return (com.google.android.gms.internal.firebase-auth-api.p)e.p((com.google.android.gms.internal.firebase-auth-api.e)p.zzb, zzaau, r);
    }
    
    public final Object g(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new h1((com.google.android.gms.internal.firebase-auth-api.e)p.zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[] { "zze", "zzf", "zzg" });
        }
        if (n == 3) {
            return new p();
        }
        if (n == 4) {
            return new t7(0);
        }
        if (n != 5) {
            return null;
        }
        return p.zzb;
    }
    
    public final int r() {
        return this.zze;
    }
    
    public final r v() {
        r r;
        if ((r = this.zzf) == null) {
            r = com.google.android.gms.internal.firebase_auth_api.r.u();
        }
        return r;
    }
    
    public final zzaau w() {
        return this.zzg;
    }
}
