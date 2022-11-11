// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.internal.firebase_auth_api;

import ge.h1;
import com.google.android.gms.internal.firebase-auth-api.zzacf;
import ge.r;
import ge.u8;
import com.google.android.gms.internal.firebase-auth-api.zzaau;
import com.google.android.gms.internal.firebase-auth-api.l0;
import ge.y0;

public final class n0 extends e implements y0
{
    private static final com.google.android.gms.internal.firebase-auth-api.n0 zzb;
    private int zze;
    private l0 zzf;
    private zzaau zzg;
    
    static {
        e.d((Class)com.google.android.gms.internal.firebase-auth-api.n0.class, (com.google.android.gms.internal.firebase-auth-api.e)(zzb = (com.google.android.gms.internal.firebase-auth-api.n0)new n0()));
    }
    
    public n0() {
        this.zzg = com.google.android.gms.internal.firebase_auth_api.zzaau.zzb;
    }
    
    public static u8 t() {
        return (u8)((e)n0.zzb).i();
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.n0 v() {
        return n0.zzb;
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.n0 w(final zzaau zzaau, final r r) throws zzacf {
        return (com.google.android.gms.internal.firebase-auth-api.n0)e.p((com.google.android.gms.internal.firebase-auth-api.e)n0.zzb, zzaau, r);
    }
    
    public final boolean B() {
        return this.zzf != null;
    }
    
    public final Object g(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new h1((com.google.android.gms.internal.firebase-auth-api.e)n0.zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[] { "zze", "zzf", "zzg" });
        }
        if (n == 3) {
            return new n0();
        }
        if (n == 4) {
            return new u8(0);
        }
        if (n != 5) {
            return null;
        }
        return n0.zzb;
    }
    
    public final int r() {
        return this.zze;
    }
    
    public final l0 s() {
        l0 l0;
        if ((l0 = this.zzf) == null) {
            l0 = com.google.android.gms.internal.firebase_auth_api.l0.t();
        }
        return l0;
    }
    
    public final zzaau x() {
        return this.zzg;
    }
}
